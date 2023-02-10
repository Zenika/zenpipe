package com.zenika.zenpipe.interfaceadapters.controllers.webhook

import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.usecase.UpdateDealUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WebhookController (@Autowired val useCase: UpdateDealUseCase) {


    @PostMapping("/webhook")
    fun index(@RequestBody webhookRequest: WebhookRequest): ResponseEntity<Deal>{
        val deal =useCase.updateDealProperties(DealId(webhookRequest.meta.id))
        return ResponseEntity(deal, HttpStatus.OK)
    }
}
