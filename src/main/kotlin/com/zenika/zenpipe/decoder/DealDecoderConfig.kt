package com.zenika.zenpipe.decoder

import com.zenika.pipedrive.model.GetDealResponse200

class DealDecoderConfig(val customFieldAccountManagerKey: String,
                         val customFieldACommercialTrainingKey: String,
                         val customFieldPortfolioKey: String
): DecoderConfig {

    override fun createConfig(): Map<String, SetCustomFields> {

        val setAccountManager: SetCustomFields = { key, objectResponse, jsonNode, getCustomFields ->
            if (objectResponse is GetDealResponse200) {
                objectResponse.data?.accountManager = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        val setCommercialTraining: SetCustomFields =
                { key, objectResponse, jsonNode, getCustomFields ->
                    if (objectResponse is GetDealResponse200) {
                        objectResponse.data?.commercialTraining = getCustomFields(jsonNode, key)
                    }
                    objectResponse
                }

        val setPortfolio: SetCustomFields =
                { key, objectResponse, jsonNode, getCustomFields ->
            if (objectResponse is GetDealResponse200) {
                objectResponse.data?.portfolio = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        return mapOf(
                customFieldAccountManagerKey to setAccountManager,
                customFieldACommercialTrainingKey to setCommercialTraining,
                customFieldPortfolioKey to setPortfolio
        )

    }
}