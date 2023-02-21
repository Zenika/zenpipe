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

    fun enrichWithPortfolio(
        customFields: MutableMap<String, Int?>,
        dealConfig: DealDecoderConfig,
        organization: Organization
    ): MutableMap<String, Int?> {
        if (this.portfolio == null) {
            customFields[dealConfig.customFieldPortfolio.key] = organization.portfolio?.id
        }
        return customFields
    }

    private fun enrichWithCommercialTraining(
        customFields: MutableMap<String, Int?>,
        dealConfig: DealDecoderConfig,
        organization: Organization
    ): MutableMap<String, Int?> {
        if (this.commercialTraining == null) {
            customFields[dealConfig.customFieldCommercialTraining.key] = organization.commercialTraining?.id
        }
        return customFields
    }

    private fun enrichWithAccountManager(
        customFields: MutableMap<String, Int?>,
        dealConfig: DealDecoderConfig,
        organization: Organization
    ): MutableMap<String, Int?> {
        if (this.accountManagerTraining == null) {
            customFields[dealConfig.customFieldAccountManger.key] = organization.accountManagerTraining?.id
        }
        return customFields
    }

    private fun enrichIfTrainingPipeline(
        customFields: MutableMap<String, Int?>,
        dealConfig: DealDecoderConfig,
        organization: Organization
    ): MutableMap<String, Int?> {
        var customFieldsTemp = customFields

        if (this.pipelineId?.value == 2) {
            customFieldsTemp = this.enrichWithCommercialTraining(customFieldsTemp, dealConfig, organization)
            customFieldsTemp = this.enrichWithAccountManager(customFieldsTemp, dealConfig, organization)

        }
        return customFieldsTemp

    }

    fun enrichIfOrganizationExist(
        customFields: MutableMap<String, Int?>,
        dealConfig: DealDecoderConfig,
        organizations: Organizations
    ): MutableMap<String, Int?> {

        var customFieldsTemp = customFields
        if (this.organizationId != null) {
            val organization = organizations.findById(this.organizationId)
            customFieldsTemp = this.enrichWithPortfolio(customFieldsTemp, dealConfig, organization)
            customFieldsTemp = this.enrichIfTrainingPipeline(customFieldsTemp, dealConfig, organization)
        }

        return customFieldsTemp
    }
}


