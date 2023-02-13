package com.zenika.zenpipe.interfaceadapters.gateways

import com.zenika.pipedrive.api.OrganizationsApi
import com.zenika.zenpipe.decoder.OrganizationDecoderConfig
import com.zenika.zenpipe.entities.*

class OrganizationRepositoryImpl constructor(
    orgCustomFields: OrganizationDecoderConfig,
    override val organizationsApi: OrganizationsApi
) : Organizations {

    private val orgCustomFieldAccountManagerKey = orgCustomFields.orgCustomFieldAccountManger.key
    private val orgCustomFieldACommercialTrainingKey = orgCustomFields.orgCustomFieldCommercialTraining.key
    private val orgCustomFieldPortfolioKey = orgCustomFields.orgCustomFieldPortfolio.key

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



