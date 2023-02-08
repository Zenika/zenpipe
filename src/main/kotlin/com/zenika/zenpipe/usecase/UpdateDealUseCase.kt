package com.zenika.zenpipe.usecase

import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.entities.Deals
import com.zenika.zenpipe.entities.Organizations


class UpdateDealUseCase constructor(private val deals: Deals, private val organizations: Organizations,
                                    private val dealConfig: DealDecoderConfig) {

    fun updateDealProperties(dealId: DealId): Deal {

        val currentDeal = deals.findById(dealId)
        val organizationId = currentDeal.organizationId
        val customFields = mutableMapOf<String, Int?>()


        if (organizationId != null) {
            val organization = organizations.findById(organizationId)

            if (currentDeal.portfolio == null || currentDeal.portfolio.id != organization.portfolio?.id) {
                customFields[dealConfig.customFieldPortfolioKey] = organization.portfolio?.id
            }

            if (currentDeal.pipelineId?.value == 2) {
                if ((currentDeal.commercialTraining == null) || (currentDeal.commercialTraining.id != organization.commercialTraining?.id)) {

                    customFields[dealConfig.customFieldACommercialTrainingKey] = organization.commercialTraining?.id
                }

                if ((currentDeal.accountManagerTraining == null) || (currentDeal.accountManagerTraining.id != organization.accountManagerTraining?.id)) {
                    customFields[dealConfig.customFieldAccountManagerKey] = organization.accountManagerTraining?.id

                }

            }

        }
        return if (customFields.isEmpty())  currentDeal else deals.update(currentDeal.dealId, customFields)
    }
}
