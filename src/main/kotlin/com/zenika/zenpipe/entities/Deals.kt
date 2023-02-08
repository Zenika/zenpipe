package com.zenika.zenpipe.entities

interface Deals {
    fun findById(dealId : DealId): Deal
    fun update(dealId: DealId, customFields: Map<String, Int?>): Deal
}