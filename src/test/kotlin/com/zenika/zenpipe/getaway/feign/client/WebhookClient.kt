package com.zenika.zenpipe.getaway.feign.client

import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.interfaceadapters.controllers.webhook.WebhookRequest
import feign.Headers
import feign.RequestLine
import org.springframework.cloud.openfeign.FeignClient

@FeignClient(value = "webhook", url = "http://localhost:8080")
interface WebhookClient {
    @RequestLine("POST /webhook")
    @Headers("Content-Type: application/json")
    fun post(webhookRequest: WebhookRequest): Deal
}