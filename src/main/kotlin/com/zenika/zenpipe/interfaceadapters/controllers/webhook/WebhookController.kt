package com.zenika.zenpipe.interfaceadapters.controllers.webhook

import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.usecase.UpdateDealUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WebhookController(@Autowired val useCase: UpdateDealUseCase) {

    @PostMapping("/webhook")
    @ResponseBody
    fun index(@RequestBody webhookRequest: WebhookRequest): Deal =
        useCase.updateDealProperties(DealId(webhookRequest.meta.id))

}
