package com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder

import com.zenika.pipedrive.model.DealResponse200
import com.zenika.zenpipe.entities.CustomField

class DealUpdateDecoderConfig(
    val customFieldAccountManger: CustomField,
    val customFieldCommercialTraining: CustomField,
    val customFieldPortfolio: CustomField
) : DecoderConfig {

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
            customFieldAccountManger.key to setAccountManager,
            customFieldCommercialTraining.key to setCommercialTraining,
            customFieldPortfolio.key to setPortfolio
        )

    }
}