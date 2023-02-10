package com.zenika.zenpipe.interfaceadapters.gateways

import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.pipedrive.model.UpdateDealRequest
import com.zenika.zenpipe.decoder.*
import com.zenika.zenpipe.entities.*
import com.zenika.zenpipe.entities.Deals
import feign.Logger

class DealRepositoryImpl constructor(dealCustomFields: DealDecoderConfig) : Deals {

    private val dealCustomFieldAccountManagerKey: String = dealCustomFields.customFieldAccountManagerKey//"e3605a045b0a8f245ba8f39aa040984fa136a6fb"
    private val dealCustomFieldACommercialTrainingKey: String = dealCustomFields.customFieldACommercialTrainingKey //"65ce8ba3355440b46602fd510c9d0eaedd441be7"
    private val dealCustomFieldPortfolioKey: String = dealCustomFields.customFieldPortfolioKey ///"39fa372d6bd7a72582610dc42f63ece2a5386522"

    override fun findById(dealId: DealId): Deal {

        val dealsApi = ApiClient("api_key", "0c954df5e04eb173e3f1dad6b5dbbf61e4a0d03b")
            .feignBuilder
            .decoder(
                CustomFieldsDecoder(
                    DealDecoderConfig(
                        dealCustomFieldAccountManagerKey,
                        dealCustomFieldACommercialTrainingKey,
                        dealCustomFieldPortfolioKey
                    )
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://zenika-sandbox.pipedrive.com/v1/")
        val dealRes = dealsApi.getDeal(dealId.value).data

        val organizationId = OrganizationId(dealRes?.orgId?.value!!)

        val portfolio = dealRes.portfolio?.let { Portfolio(dealCustomFieldPortfolioKey, it["value"]!!.toInt(), it) }

        val accountManager = dealRes.accountManager?.let {
            AccountManagerTraining(
                dealCustomFieldAccountManagerKey,
                it["value"]!!.toInt(), it
            )
        }

        val commercialTraining = dealRes.commercialTraining?.let {
            CommercialTraining(
                dealCustomFieldACommercialTrainingKey,
                it["value"]!!.toInt(), it
            )
        }

        val pipelineId = PipelineId(dealRes.pipelineId)

        return Deal(dealId, organizationId, portfolio, pipelineId, commercialTraining, accountManager)
    }

    override fun update(dealId: DealId, customFields: Map<String, Int?>): Deal {
        val dealsApi = ApiClient("api_key", "0c954df5e04eb173e3f1dad6b5dbbf61e4a0d03b")
            .feignBuilder
            .encoder(CustomerFieldsEncoder(customFields))
            .decoder(
                CustomFieldsDecoder(
                    DealUpdateDecoderConfig(
                        dealCustomFieldAccountManagerKey,
                        dealCustomFieldACommercialTrainingKey,
                        dealCustomFieldPortfolioKey
                    )
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://zenika-sandbox.pipedrive.com/v1/")
        val dealResponse = dealsApi.updateDeal(dealId.value, UpdateDealRequest()).data


        val organizationId = OrganizationId(dealResponse?.orgId?.value!!)

        val portfolio =
            dealResponse.portfolio?.let { Portfolio(dealCustomFieldPortfolioKey, it["value"]!!.toInt(), it) }

        val accountManager = dealResponse.accountManager?.let {
            AccountManagerTraining(
                dealCustomFieldAccountManagerKey,
                it["value"]!!.toInt(), it
            )
        }

        val commercialTraining = dealResponse.commercialTraining?.let {
            CommercialTraining(dealCustomFieldACommercialTrainingKey, it["value"]!!.toInt(), it)
        }

        val pipelineId = PipelineId(dealResponse.pipelineId)

        return Deal(dealId, organizationId, portfolio, pipelineId, commercialTraining, accountManager)

    }


}