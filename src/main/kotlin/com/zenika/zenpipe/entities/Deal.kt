package com.zenika.zenpipe.entities

import com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder.DealDecoderConfig
import java.util.*

data class Deal(
    val dealId: DealId,
    val organization: Organization? = null,
    val portfolio: Portfolio? = null,
    val pipelineId: PipelineId? = null,
    val commercialTraining: CommercialTraining? = null,
    val accountManagerTraining: AccountManagerTraining? = null
) {
    private fun extractPortfolioId(): Int? = this.organization?.portfolio?.id
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
