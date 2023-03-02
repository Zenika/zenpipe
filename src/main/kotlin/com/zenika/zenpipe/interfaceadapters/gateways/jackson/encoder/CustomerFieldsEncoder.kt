package com.zenika.zenpipe.interfaceadapters.gateways.jackson.encoder

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.node.ObjectNode
import com.zenika.pipedrive.decoder.ZenJacksonEncoder
import feign.RequestTemplate
import feign.Util
import feign.codec.EncodeException
import java.lang.reflect.Type

class CustomerFieldsEncoder(private val customFields: Map<String, Int?>) : ZenJacksonEncoder() {

    override fun encode(objectReq: Any?, bodyType: Type?, template: RequestTemplate?) {

        try {
            var node: ObjectNode = mapper.valueToTree(objectReq)

            customFields.forEach { item ->
                node = node.set(item.key, mapper.valueToTree(item.value))
            }

            template?.body(mapper.writeValueAsBytes(node), Util.UTF_8)

        } catch (e: JsonProcessingException) {
            throw EncodeException(e.message, e)
        }
    }
}
