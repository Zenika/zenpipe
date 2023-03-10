package com.zenika.zenpipe.usecase

import com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder.DealDecoderConfig
import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.entities.Deals


class UpdateDealUseCase constructor(
    private val deals: Deals,
    private val dealConfig: DealDecoderConfig
) {

    fun updateDealProperties(dealId: DealId): Deal {
        val currentDeal = deals.findById(dealId)
        val customFields = currentDeal.updatedFields(dealConfig)
        return if (customFields.isEmpty()) currentDeal else deals.update(dealId, customFields)
    }
}
