package com.zenika.zenpipe.entities

import com.zenika.zenpipe.decoder.DealDecoderConfig

data class Deal(
    private val dealId: DealId,
    private val organizationId: OrganizationId? = null,
    private val portfolio: Portfolio? = null,
    private val pipelineId: PipelineId? = null,
    private val commercialTraining: CommercialTraining? = null,
    private val accountManagerTraining: AccountManagerTraining? = null
) {

    private fun isPipelineTraining(): Boolean = this.pipelineId?.value == 2

    private fun enrich(
        customFields: Map<String, Int?>,
        extractKey: () -> String,
        extractValue: () -> Int?,
        isNull: () -> Boolean
    ): Map<String, Int?> {
        return if (isNull()) {
            customFields + (extractKey() to extractValue())
        } else {
            customFields
        }
    }


    private fun enrichIfTrainingPipeline(
        customFields: Map<String, Int?>,
        dealConfig: DealDecoderConfig,
        organization: Organization
    ): Map<String, Int?> {

        val extractCommercialTrainingKey = { dealConfig.customFieldCommercialTraining.key }
        val extractAccountManagerKey = { dealConfig.customFieldAccountManger.key }
        val extractCommercialTrainingId = { organization.commercialTraining?.id }
        val extractAccountManagerId = { organization.accountManagerTraining?.id }
        val isCommercialTrainingNull = { this.commercialTraining == null }
        val isAccountManagerNull = { this.accountManagerTraining == null }

        return if (this.isPipelineTraining()) {
            this.enrich(
                this.enrich(
                    customFields,
                    extractCommercialTrainingKey,
                    extractCommercialTrainingId,
                    isCommercialTrainingNull
                ), extractAccountManagerKey, extractAccountManagerId, isAccountManagerNull
            )
        } else {
            customFields
        }
    }

    fun enrichIfOrganizationExist(
        dealConfig: DealDecoderConfig,
        organizations: Organizations
    ): Map<String, Int?> {

        return if (this.organizationId != null) {
            val organization = organizations.findById(this.organizationId)
            this.enrichIfTrainingPipeline(
                this.enrich(
                    mapOf(),
                    { dealConfig.customFieldPortfolio.key },
                    { organization.portfolio?.id },
                    { this.portfolio == null }), dealConfig, organization
            )
        } else {
            mapOf()
        }
    }
}


