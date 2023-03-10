package com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder

import com.zenika.pipedrive.model.GetDealResponse200
import com.zenika.zenpipe.entities.CustomField

class DealDecoderConfig(
    val customFieldAccountManger: CustomField,
    val customFieldCommercialTraining: CustomField,
    val customFieldPortfolio: CustomField
) : DecoderConfig {

    fun extractPortfolioKey(): String = this.customFieldPortfolio.key
    fun extractCommercialTrainingKey(): String = this.customFieldCommercialTraining.key
    fun extractAccountManagerKey(): String = this.customFieldAccountManger.key

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
            customFieldAccountManger.key to setAccountManager,
            customFieldCommercialTraining.key to setCommercialTraining,
            customFieldPortfolio.key to setPortfolio
        )

    }
}