package com.zenika.zenpipe.interfaceadapters.gateways

import com.zenika.pipedrive.api.OrganizationsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.zenpipe.decoder.CustomFieldsDecoder
import com.zenika.zenpipe.decoder.OrganizationDecoderConfig
import com.zenika.zenpipe.entities.*
import feign.Logger

class OrganizationRepositoryImpl constructor(orgCustomFields: OrganizationDecoderConfig) : Organizations {

    private val orgCustomFieldAccountManagerKey: String =
        orgCustomFields.customFieldAccountManagerKey// "27bcf77de242b798829f7b3321072bc3336bfa01"
    private val orgCustomFieldACommercialTrainingKey: String =
        orgCustomFields.customFieldACommercialTrainingKey //"2a888345f9f0fc53d3dab9cc4c6ad85850091259"
    private val orgCustomFieldPortfolioKey: String =
        orgCustomFields.customFieldPortfolioKey //"e28b36cf2a9468b4ba7798257a3c1c236adf88bd"

    override fun findById(orgId: OrganizationId): Organization {
        val apiClient = ApiClient("api_key", "0c954df5e04eb173e3f1dad6b5dbbf61e4a0d03b")
            .feignBuilder
            .decoder(
                CustomFieldsDecoder(
                    OrganizationDecoderConfig(
                        orgCustomFieldAccountManagerKey,
                        orgCustomFieldACommercialTrainingKey,
                        orgCustomFieldPortfolioKey
                    )
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(OrganizationsApi::class.java, "https://zenika-sandbox.pipedrive.com/v1/")

        val dealRes = apiClient.getOrganization(orgId.value)

        val portfolio =
            dealRes.data?.portfolio?.let { Portfolio(orgCustomFieldPortfolioKey, it["value"]!!.toInt(), it) }

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