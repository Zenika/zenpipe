package com.zenika.zenpipe

import com.zenika.pipedrive.api.OrganizationsApi
import com.zenika.zenpipe.entities.*


class OrganizationsImpl(override val organizationsApi: OrganizationsApi? = null) : Organizations {

    private val portfolio = Portfolio("portFolio2", 11, mapOf())
    private val commercialTraining = CommercialTraining("CT2", 22, mapOf())
    private val accountManagerTraining = AccountManagerTraining("AM2", 33, mapOf())

    override fun findById(orgId: OrganizationId): Organization {
        return Organization(OrganizationId(123), portfolio, commercialTraining, accountManagerTraining)

    }
}