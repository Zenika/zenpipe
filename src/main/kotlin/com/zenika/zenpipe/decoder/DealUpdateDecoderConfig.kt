package com.zenika.zenpipe.decoder

import com.zenika.pipedrive.model.DealResponse200

class DealUpdateDecoderConfig(private val customFieldAccountManagerKey: String,
                              private val customFieldACommercialTrainingKey: String,
                              private val customFieldPortfolioKey: String
): DecoderConfig {

    override fun createConfig(): Map<String, SetCustomFields> {

        val setAccountManager: SetCustomFields = { key, objectResponse, jsonNode, getCustomFields ->
            if (objectResponse is DealResponse200) {
                objectResponse.data?.accountManager = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        val setCommercialTraining: SetCustomFields =
                { key, objectResponse, jsonNode, getCustomFields ->
                    if (objectResponse is DealResponse200) {
                        objectResponse.data?.commercialTraining = getCustomFields(jsonNode, key)
                    }
                    objectResponse
                }

        val setPortfolio: SetCustomFields =
                { key, objectResponse, jsonNode, getCustomFields ->
            if (objectResponse is DealResponse200) {
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