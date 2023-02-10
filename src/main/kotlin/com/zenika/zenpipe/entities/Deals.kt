package com.zenika.zenpipe.entities

import com.zenika.pipedrive.api.DealsApi

interface Deals {

    val dealsApi: DealsApi
    fun findById(dealId : DealId): Deal
    fun update(dealId: DealId, customFields: Map<String, Int?>): Deal
}