package com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.JsonNode
import com.zenika.pipedrive.decoder.ZenJacksonDecoder
import feign.Response
import feign.Util
import org.openapitools.jackson.nullable.JsonNullableModule
import java.io.BufferedReader
import java.lang.reflect.Type

class CustomFieldsDecoder constructor(private val decoderConfig: DecoderConfig): ZenJacksonDecoder(mutableListOf(JsonNullableModule())) {


    override fun decode(response: Response?, type: Type?): Any? {
        if (response?.status() == 404 || response?.status() == 204)
            return Util.emptyValueOf(type)
        if (response?.body() == null)
            return null

        var reader = response.body()?.asReader(response.charset())

        if (!reader?.markSupported()!!) {
            reader = BufferedReader(reader, 1)
        }

        reader.mark(1)
        if (reader.read() == -1) {
            return null
        }
        reader.reset()

        val result = super.decode(response, type)

        val jsonNode: JsonNode = mapper.readTree(reader)

        val config = decoderConfig.createConfig()

        var tmpResult = result

        config.forEach { item ->
            val fn = item.value
            val key = item.key
            tmpResult = fn(key, tmpResult, jsonNode, ::getCustomFields)
        }
        return tmpResult
    }

    private fun getCustomFields(
            jsonNode: JsonNode,
            customFieldKey: String
    ): HashMap<String, String>? {
        val typeReference: TypeReference<HashMap<String, String>> = object : TypeReference<HashMap<String, String>>() {}

        return mapper?.convertValue(
                jsonNode["data"][customFieldKey],
                typeReference
        )
    }
}