package com.zenika.zenpipe.decoder

import com.fasterxml.jackson.databind.JsonNode
import com.zenika.pipedrive.model.GetOrganizationResponse200
import com.zenika.zenpipe.entities.CustomField

typealias SetCustomFields = (String, Any, JsonNode, (JsonNode, String) -> HashMap<String, String>?) -> Any

class OrganizationDecoderConfig(
    val orgCustomFieldAccountManger: CustomField,
    val orgCustomFieldCommercialTraining: CustomField,
    val orgCustomFieldPortfolio: CustomField
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
            orgCustomFieldAccountManger.key to setAccountManager,
            orgCustomFieldCommercialTraining.key to setCommercialTraining,
            orgCustomFieldPortfolio.key to setPortfolio,

            )

    }
}