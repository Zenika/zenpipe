package com.zenika.zenpipe.interfaceadapters.gateways

import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.pipedrive.model.DealNonStrictWithDetails
import com.zenika.pipedrive.model.DealResponse200Data
import com.zenika.pipedrive.model.UpdateDealRequest
import com.zenika.zenpipe.decoder.*
import com.zenika.zenpipe.entities.*
import com.zenika.zenpipe.entities.Deals
import feign.Logger
import java.lang.RuntimeException

class DealRepositoryImpl(
    dealCustomFields: DealDecoderConfig,
    dealUpdateDecoderConfig: DealUpdateDecoderConfig,
    apiKey: String, uriPipedrive: String,
    override val dealsApi: DealsApi
) : Deals {

    private val dealCustomFieldAccountManagerKey: String =
        dealCustomFields.customFieldAccountManger.key
    private val dealCustomFieldACommercialTrainingKey: String =
        dealCustomFields.customFieldCommercialTraining.key
    private val dealCustomFieldPortfolioKey: String =
        dealCustomFields.customFieldPortfolio.key

    private val localApiKey = apiKey
    private val localUriPipedrive = uriPipedrive
    private val localDealUpdateDecoderConfig = dealUpdateDecoderConfig

    override fun findById(dealId: DealId): Deal {

        val dealRes = dealsApi.getDeal(dealId.value).data

        return dealRes!!.toDeal(
            dealId,
            dealCustomFieldPortfolioKey,
            dealCustomFieldACommercialTrainingKey,
            dealCustomFieldAccountManagerKey
        )
    }

    override fun update(dealId: DealId, customFields: Map<String, Int?>): Deal {
        val apiClient = ApiClient("api_key", localApiKey)
            .feignBuilder
            .encoder(CustomerFieldsEncoder(customFields))
            .decoder(
                CustomFieldsDecoder(
                    localDealUpdateDecoderConfig
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, localUriPipedrive)
        val dealResponse = apiClient.updateDeal(dealId.value, UpdateDealRequest()).data

        return dealResponse!!.toDeal(
            dealId,
            dealCustomFieldPortfolioKey,
            dealCustomFieldACommercialTrainingKey,
            dealCustomFieldAccountManagerKey
        )

    }


}

fun DealResponse200Data.toDeal(
    dealId: DealId, dealCustomFieldPortfolioKey: String,
    dealCustomFieldAccountManagerKey: String,
    dealCustomFieldACommercialTrainingKey: String
): Deal {

    return Deal(
        dealId,
        extractOrganizationId(this),
        extractPortfolio(this, dealCustomFieldPortfolioKey),
        extractPipelineId(this),
        extractCommercialTraining(this, dealCustomFieldACommercialTrainingKey),
        extractAccountManger(this, dealCustomFieldAccountManagerKey)
    )

}

fun DealNonStrictWithDetails.toDeal(
    dealId: DealId, dealCustomFieldPortfolioKey: String,
    dealCustomFieldAccountManagerKey: String,
    dealCustomFieldACommercialTrainingKey: String
): Deal {

    return Deal(
        dealId,
        extractOrganizationId(this),
        extractPortfolio(this, dealCustomFieldPortfolioKey),
        extractPipelineId(this),
        extractCommercialTraining(this, dealCustomFieldACommercialTrainingKey),
        extractAccountManger(this, dealCustomFieldAccountManagerKey)
    )

}

fun <T> extractOrganizationId(t: T): OrganizationId {
    return when (t) {
        is DealNonStrictWithDetails -> OrganizationId(t.orgId?.value!!)
        is DealResponse200Data -> OrganizationId(t.orgId?.value!!)
        else -> throw RuntimeException("Type not managed !")
    }
}

fun <T> extractPortfolio(t: T, dealCustomFieldPortfolioKey: String): Portfolio? {
    return when (t) {
        is DealNonStrictWithDetails -> t.portfolio?.let {
            Portfolio(
                dealCustomFieldPortfolioKey,
                it["value"]!!.toInt(),
                it
            )
        }

        is DealResponse200Data -> t.portfolio?.let { Portfolio(dealCustomFieldPortfolioKey, it["value"]!!.toInt(), it) }
        else -> throw RuntimeException("Type not managed !")
    }
}

fun <T> extractAccountManger(t: T, dealCustomFieldAccountManagerKey: String): AccountManagerTraining? {
    return when (t) {
        is DealNonStrictWithDetails -> t.accountManager?.let {
            AccountManagerTraining(
                dealCustomFieldAccountManagerKey,
                it["value"]!!.toInt(), it
            )
        }

        is DealResponse200Data -> t.accountManager?.let {
            AccountManagerTraining(
                dealCustomFieldAccountManagerKey,
                it["value"]!!.toInt(), it
            )
        }

        else -> throw RuntimeException("Type not managed !")
    }
}


fun <T> extractCommercialTraining(t: T, dealCustomFieldACommercialTrainingKey: String): CommercialTraining? {
    return when (t) {
        is DealNonStrictWithDetails -> t.commercialTraining?.let {
            CommercialTraining(dealCustomFieldACommercialTrainingKey, it["value"]!!.toInt(), it)
        }

        is DealResponse200Data -> t.commercialTraining?.let {
            CommercialTraining(dealCustomFieldACommercialTrainingKey, it["value"]!!.toInt(), it)
        }

        else -> throw RuntimeException("Type not managed !")
    }
}

fun <T> extractPipelineId(t: T): PipelineId {
    return when (t) {
        is DealNonStrictWithDetails -> PipelineId(t.pipelineId)
        is DealResponse200Data -> PipelineId(t.pipelineId)
        else -> throw RuntimeException("Type not managed !")
    }
}