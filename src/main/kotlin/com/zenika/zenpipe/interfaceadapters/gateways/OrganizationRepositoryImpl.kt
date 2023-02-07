package com.zenika.zenpipe.interfaceadapters.gateways

import com.zenika.pipedrive.api.OrganizationsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.zenpipe.decoder.CustomFieldsDecoder
import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.entities.*
import feign.Logger

class OrganizationRepositoryImpl : Organizations{

    val orgCustomFieldAccountManagerKey: String = "27bcf77de242b798829f7b3321072bc3336bfa01"
    val orgCustomFieldACommercialTrainingKey: String = "2a888345f9f0fc53d3dab9cc4c6ad85850091259"
    val orgCustomFieldPortfolioKey: String = "e28b36cf2a9468b4ba7798257a3c1c236adf88bd"

    override fun findById(orgId: OrganizationId): Organization {
        val apiClient = ApiClient()
            .feignBuilder
            .decoder(
                CustomFieldsDecoder(
                    DealDecoderConfig(orgCustomFieldAccountManagerKey, orgCustomFieldACommercialTrainingKey, orgCustomFieldPortfolioKey)
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(OrganizationsApi::class.java, "https://1c8a4904-bff3-448c-8211-316b91c03202.mock.pstmn.io/")

        val dealRes = apiClient.getOrganization(orgId.value)

        val portfolio = dealRes.data!!.portfolio?.let { Portfolio(orgCustomFieldPortfolioKey, it["id"]!!.toInt(), it) }

        val accountManager = dealRes.data!!.accountManager?.let {
            AccountManagerTraining(orgCustomFieldAccountManagerKey,
                it["id"]!!.toInt(), it)
        }

        val commercialTraining = dealRes.data!!.commercialTraining?.let {
            CommercialTraining(orgCustomFieldACommercialTrainingKey,
                it["id"]!!.toInt(), it)
        }

        return Organization(orgId, portfolio, commercialTraining, accountManager )
    }
}