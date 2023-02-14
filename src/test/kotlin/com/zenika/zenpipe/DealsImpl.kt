package com.zenika.zenpipe

import com.zenika.pipedrive.api.DealsApi
import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.entities.*

class DealsImpl(val deal: Deal, val dealDecoder: DealDecoderConfig, override val dealsApi: DealsApi? = null) : Deals {

    private val portfolio = Portfolio("portFolio2", 11, mapOf())
    private val commercialTraining = CommercialTraining("CT2", 22, mapOf())
    private val accountManagerTraining = AccountManagerTraining("AM2", 33, mapOf())

    override fun findById(dealId: DealId): Deal {
        return deal
    }

    override fun update(dealId: DealId, customFields: Map<String, Int?>): Deal {

        var dealUpdated = deal

        customFields.forEach{item ->
            dealUpdated = when (item.key){
                dealDecoder.customFieldPortfolio.key -> deal.copy(portfolio = portfolio.copy(key = dealDecoder.customFieldPortfolio.key))
                dealDecoder.customFieldCommercialTraining.key -> deal.copy(commercialTraining =
                        commercialTraining.copy(key = dealDecoder.customFieldCommercialTraining.key))
                dealDecoder.customFieldAccountManger.key -> deal.copy(accountManagerTraining =
                        accountManagerTraining.copy(key = dealDecoder.customFieldAccountManger.key))
                else -> dealUpdated
            }
        }
        return dealUpdated
    }


}