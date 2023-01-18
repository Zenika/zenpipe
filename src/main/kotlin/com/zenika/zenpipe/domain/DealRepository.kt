package com.zenika.zenpipe.domain

interface DealRepository {
    fun getOrganizationFromDeal(deal: Deal): Organization
}