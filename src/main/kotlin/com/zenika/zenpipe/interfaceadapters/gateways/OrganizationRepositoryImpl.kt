package com.zenika.zenpipe.interfaceadapters.gateways

import com.zenika.pipedrive.api.OrganizationsApi
import com.zenika.zenpipe.decoder.OrganizationDecoderConfig
import com.zenika.zenpipe.entities.*

class OrganizationRepositoryImpl constructor(
    orgCustomFields: OrganizationDecoderConfig,
    override val organizationsApi: OrganizationsApi
) : Organizations {

    private val orgCustomFieldAccountManagerKey = orgCustomFields.customFieldAccountManagerKey
    private val orgCustomFieldACommercialTrainingKey = orgCustomFields.customFieldACommercialTrainingKey
    private val orgCustomFieldPortfolioKey = orgCustomFields.customFieldPortfolioKey

    override fun findById(orgId: OrganizationId): Organization {

        val dealRes = organizationsApi.getOrganization(orgId.value)

        val portfolio = dealRes.data?.portfolio?.let {
            Portfolio(
                orgCustomFieldPortfolioKey,
                it["value"]!!.toInt(), it
            )
        }

        val accountManager = dealRes.data!!.accountManager?.let {
            AccountManagerTraining(
                orgCustomFieldAccountManagerKey,
                it["value"]!!.toInt(), it
            )
        }

        val commercialTraining = dealRes.data!!.commercialTraining?.let {
            CommercialTraining(
                orgCustomFieldACommercialTrainingKey,
                it["value"]!!.toInt(), it
            )
        }

        return Organization(orgId, portfolio, commercialTraining, accountManager)
    }
}



