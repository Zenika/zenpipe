package com.zenika.zenpipe.getaway.feign.client

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.zenika.pipedrive.decoder.ZenJacksonDecoder
import org.openapitools.jackson.nullable.JsonNullableModule

class KotlinDecoder : ZenJacksonDecoder(mutableListOf(JsonNullableModule(), JavaTimeModule(), KotlinModule())) {
}