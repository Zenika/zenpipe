package com.zenika.zenpipe

import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.entities.*

class DealsImpl constructor(val deal : Deal, val dealDecoder : DealDecoderConfig ) : Deals {

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
                dealDecoder.customFieldPortfolioKey -> deal.copy(portfolio = portfolio.copy(key = dealDecoder.customFieldPortfolioKey))
                dealDecoder.customFieldACommercialTrainingKey -> deal.copy(commercialTraining =
                        commercialTraining.copy(key = dealDecoder.customFieldACommercialTrainingKey))
                dealDecoder.customFieldAccountManagerKey -> deal.copy(accountManagerTraining =
                        accountManagerTraining.copy(key = dealDecoder.customFieldAccountManagerKey))
                else -> dealUpdated
            }
        }
        return dealUpdated
    }


}