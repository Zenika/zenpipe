package com.zenika.zenpipe.interfaceadapters.presenters

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.zenika.pipedrive.model.GetDealResponse200

class DecoderConfig private constructor (private val objectMapper: ObjectMapper){

    data class Builder(var objectMapper: ObjectMapper){
        fun objectMapper(objectMapper: ObjectMapper) = apply { this.objectMapper = objectMapper }
        fun build() = DecoderConfig(objectMapper)
    }


    fun createConfig(): Map<String, (String, Any, JsonNode) -> Any> {

        val setAccountManager: (String, Any, JsonNode) -> Any =
            { key: String, objectResponse: Any, jsonNode: JsonNode ->
                if (objectResponse is GetDealResponse200) {
                    objectResponse.data?.accountManager = getCustomFields(jsonNode, key)
                }
                objectResponse
            }

        val setCommercialTraining: (String, Any, JsonNode) -> Any =
            { key: String, objectResponse: Any, jsonNode: JsonNode ->
                if (objectResponse is GetDealResponse200) {
                    objectResponse.data?.commercialTraining = getCustomFields(jsonNode, key)
                }
                objectResponse
            }

        val setPortfolio: (String, Any, JsonNode) -> Any = { key: String, objectResponse: Any, jsonNode: JsonNode ->
            if (objectResponse is GetDealResponse200) {
                objectResponse.data?.portfolio = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        val config: Map<String, (String, Any, JsonNode) -> Any> = mapOf(
            "e3605a045b0a8f245ba8f39aa040984fa136a6fb" to setAccountManager,
            //         "65ce8ba3355440b46602fd510c9d0eaedd441be7" to setCommercialTraining,
            //        "39fa372d6bd7a72582610dc42f63ece2a5386522" to setPortfolio,
        )

        return config

    }

    private fun getCustomFields(
        jsonNode: JsonNode,
        customFieldKey: String
    ): HashMap<String, String> {
        val typeReference: TypeReference<HashMap<String, Any>> = object : TypeReference<HashMap<String, Any>>() {}

        val mapCustomerField = objectMapper.convertValue(
            jsonNode["data"][customFieldKey],
            typeReference
        )

        return mapCustomerField as HashMap<String, String>
    }
}