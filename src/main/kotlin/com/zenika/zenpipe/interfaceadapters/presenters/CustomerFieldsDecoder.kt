package com.zenika.zenpipe.interfaceadapters.presenters

import com.fasterxml.jackson.databind.JsonNode
import com.zenika.pipedrive.decoder.ZenJacksonDecoder
import feign.Response
import feign.Util
import java.io.BufferedReader
import java.lang.reflect.Type

class CustomFieldsDecoder constructor() : ZenJacksonDecoder() {


    // ajouter un constructeur qui prend en prametre une hashmap


    override fun decode(response: Response?, type: Type?): Any? {

        if (response?.status() == 404 || response?.status() == 204)
            return Util.emptyValueOf(type)
        if (response?.body() == null)
            return null

        var reader = response?.body()?.asReader(response.charset())

        if (!reader?.markSupported()!!) {
            reader = BufferedReader(reader, 1)
        }

        reader.mark(1);
        if (reader.read() == -1) {
            return null
        }
        reader.reset()

        val result = super.decode(response, type)

        val jsonNode: JsonNode = mapper.readTree(reader)

        val config = DecoderConfig.Builder(mapper).build().createConfig()

        var tmpResult = result
        config.forEach { item ->
            val fn = item.value
            val key = item.key
            tmpResult = fn(key, tmpResult, jsonNode)
        }
        return tmpResult
    }
}