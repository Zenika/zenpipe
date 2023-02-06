package com.zenika.zenpipe.decoder

import com.fasterxml.jackson.databind.JsonNode
import com.zenika.pipedrive.model.GetOrganizationResponse200

typealias SetCustomFields = (String, Any, JsonNode, (JsonNode, String) -> HashMap<String, String>?) -> Any

class OrganizationDecoderConfig (
        private val customFieldAccountManagerKey: String,
        private val customFieldACommercialTrainingKey: String,
        private val customFieldPortfolioKey: String
) : DecoderConfig {

    override fun createConfig(): Map<String, SetCustomFields> {

        val setAccountManager: SetCustomFields = { key, objectResponse, jsonNode, getCustomFields ->
            if (objectResponse is GetOrganizationResponse200) {
                objectResponse.data?.accountManager = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        val setCommercialTraining: SetCustomFields = { key, objectResponse, jsonNode, getCustomFields ->
            if (objectResponse is GetOrganizationResponse200) {
                objectResponse.data?.commercialTraining = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        val setPortfolio: SetCustomFields = { key, objectResponse, jsonNode, getCustomFields ->
            if (objectResponse is GetOrganizationResponse200) {
                objectResponse.data?.portfolio = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        return mapOf(
                customFieldAccountManagerKey to setAccountManager,
                customFieldACommercialTrainingKey to setCommercialTraining,
                customFieldPortfolioKey to setPortfolio,

//                "27bcf77de242b798829f7b3321072bc3336bfa01" to setAccountManager,
//                "2a888345f9f0fc53d3dab9cc4c6ad85850091259" to setCommercialTraining,
//                "e28b36cf2a9468b4ba7798257a3c1c236adf88bd" to setPortfolio
        )

    }
}