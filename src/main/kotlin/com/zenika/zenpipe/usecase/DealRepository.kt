package com.zenika.zenpipe.usecase

import com.zenika.zenpipe.domain.Deal
import com.zenika.zenpipe.domain.Organization

interface DealRepository {
    fun getOrganizationFromDeal(deal: Deal): Organization
    fun getDealById(dealId : Int) : Deal

}