package com.zenika.zenpipe.usecase

import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.entities.Deals
import com.zenika.zenpipe.entities.Organizations


class UpdateDealUseCase constructor(private val deals: Deals, private val organizations: Organizations) {

    fun updateDealProperties(dealId: DealId): Deal? {

        var currentDeal = deals.findById(dealId)
        var organizationId = currentDeal.organizationId

        if (organizationId != null) {
            var organization = organizations.findById(organizationId)

            if (currentDeal.portfolio == null) {
                currentDeal = currentDeal.copy(portfolio = organization?.portfolio)
            }else{
                // TODO
            }

            if (currentDeal.pipelineId?.value == 2) {

                if (currentDeal.commercialTraining == null) {
                    currentDeal = currentDeal.copy(commercialTraining = organization.commercialTraining)
                }else{
                    // TODO
                }

                if (currentDeal.accountManagerTraining == null) {
                    currentDeal = currentDeal.copy(accountManagerTraining = organization.accountManagerTraining)
                }else{
                    // TODO
                }

            }

        }

        return currentDeal
    }
}
