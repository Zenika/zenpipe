package com.zenika.zenpipe.entities

import com.zenika.zenpipe.decoder.DealDecoderConfig
import java.util.Optional

data class Deal(
    private val dealId: DealId,
    private val organization: Organization? = null,
    private val portfolio: Portfolio? = null,
    private val pipelineId: PipelineId? = null,
    private val commercialTraining: CommercialTraining? = null,
    private val accountManagerTraining: AccountManagerTraining? = null
) {
    private fun extractPortfolioId(): Int? = this.portfolio?.id
    private fun extractCommercialTrainingId(): Int? = this.organization?.commercialTraining?.id
    private fun extractAccountManagerId(): Int? = this.organization?.accountManagerTraining?.id

    private fun putUpdatedFields(
        customFields: Map<String, Int?>,
        extractKey: () -> String,
        extractValue: () -> Int?,
        present: Optional<Any>
    ): Map<String, Int?> = present.map {
            customFields
    }.orElse(customFields + (extractKey() to extractValue()))


    private fun putIfTrainingPipeline(
        customFields: Map<String, Int?>,
        dealConfig: DealDecoderConfig
    ): Map<String, Int?> {
        val optional: Optional<PipelineId> = Optional.ofNullable(this.pipelineId)

        return optional.filter { it.value == 2 }
            .map {
                putUpdatedFields(
                    customFields,
                    dealConfig::extractCommercialTrainingKey,
                    ::extractCommercialTrainingId,
                    Optional.ofNullable(this.commercialTraining),
                )
            }.map { commercialTrainingEnriched ->
                putUpdatedFields(
                    commercialTrainingEnriched,
                    dealConfig::extractAccountManagerKey,
                    ::extractAccountManagerId,
                    Optional.ofNullable(this.accountManagerTraining)
                )
            }.orElse(customFields)
    }

    fun updatedFields(
        dealConfig: DealDecoderConfig,
    ): Map<String, Int?> {
        val optional: Optional<Organization> = Optional.ofNullable(this.organization)

        return optional.map {
            putUpdatedFields(
                mapOf(),
                dealConfig::extractPortfolioKey,
                ::extractPortfolioId,
                Optional.ofNullable(this.portfolio)
            )
        }.map { portfolioEnriched ->
            putIfTrainingPipeline(portfolioEnriched, dealConfig)
        }.orElse(mapOf())

    }
}
