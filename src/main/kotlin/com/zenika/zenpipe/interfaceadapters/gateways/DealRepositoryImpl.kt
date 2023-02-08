package com.zenika.zenpipe.interfaceadapters.gateways

import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.pipedrive.model.UpdateDealRequest
import com.zenika.zenpipe.decoder.CustomFieldsDecoder
import com.zenika.zenpipe.decoder.CustomerFieldsEncoder
import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.decoder.DealUpdateDecoderConfig
import com.zenika.zenpipe.entities.*
import com.zenika.zenpipe.entities.Deals
import feign.Logger

class DealRepositoryImpl : Deals {

    val dealcustomFieldAccountManagerKey: String = "e3605a045b0a8f245ba8f39aa040984fa136a6fb"
    val dealCustomFieldACommercialTrainingKey: String = "65ce8ba3355440b46602fd510c9d0eaedd441be7"
    val dealCustomFieldPortfolioKey: String = "39fa372d6bd7a72582610dc42f63ece2a5386522"

    override fun findById(dealId: DealId): Deal {

        val dealsApi = getDealsApi()
        val dealRes = dealsApi.getDeal(dealId.value).data

        val organizationId = OrganizationId(dealRes?.orgId?.value!!)

        val portfolio = dealRes.portfolio?.let { Portfolio(dealCustomFieldPortfolioKey, it["id"]!!.toInt(), it) }

        val accountManager = dealRes.accountManager?.let {
            AccountManagerTraining(dealcustomFieldAccountManagerKey,
                it["id"]!!.toInt(), it)
        }

        val commercialTraining = dealRes.commercialTraining?.let {
            CommercialTraining(dealCustomFieldACommercialTrainingKey,
                it["id"]!!.toInt(), it)
        }

        val pipelineId = PipelineId(dealRes.pipelineId)

        return Deal(dealId, organizationId, portfolio, pipelineId, commercialTraining, accountManager)
    }

    override fun update(dealId: DealId, customFields: Map<String, Int?>): Deal {
        val dealsApi = ApiClient()
            .feignBuilder
            .encoder(CustomerFieldsEncoder(customFields))
            .decoder(
                CustomFieldsDecoder(
                    DealUpdateDecoderConfig(dealcustomFieldAccountManagerKey, dealCustomFieldACommercialTrainingKey, dealCustomFieldPortfolioKey)
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://1c8a4904-bff3-448c-8211-316b91c03202.mock.pstmn.io/")
        val dealResponse = dealsApi.updateDeal(dealId.value, UpdateDealRequest()).data


        val organizationId = OrganizationId(dealResponse?.orgId?.value!!)

        val portfolio = dealResponse.portfolio?.let { Portfolio(dealCustomFieldPortfolioKey, it["id"]!!.toInt(), it )}

        val accountManager = dealResponse.accountManager?.let {
            AccountManagerTraining(dealcustomFieldAccountManagerKey,
                it["id"]!!.toInt(), it )
        }

        val commercialTraining = dealResponse.commercialTraining?.let {
            CommercialTraining(dealCustomFieldACommercialTrainingKey,it["id"]!!.toInt(), it)
        }

        val pipelineId = PipelineId(dealResponse.pipelineId)

        return Deal(dealId, organizationId, portfolio, pipelineId, commercialTraining, accountManager)

    }

    private fun getDealsApi() : DealsApi {
        return ApiClient()
            .feignBuilder
            .decoder(
                CustomFieldsDecoder(
                    DealDecoderConfig(dealcustomFieldAccountManagerKey, dealCustomFieldACommercialTrainingKey, dealCustomFieldPortfolioKey)
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://1c8a4904-bff3-448c-8211-316b91c03202.mock.pstmn.io/")
    }
}