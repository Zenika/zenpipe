package com.zenika.zenpipe.usecase

import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.entities.Deals
import com.zenika.zenpipe.entities.Organizations


class UpdateDealUseCase constructor(
    private val deals: Deals,
    private val dealConfig: DealDecoderConfig
) {

    fun updateDealProperties(dealId: DealId): Deal {
        val currentDeal = deals.findById(dealId)
        val customFields = currentDeal.enrichIfOrganizationExist(dealConfig)
        return if (customFields.isEmpty()) currentDeal else deals.update(dealId, customFields)
    }
}
