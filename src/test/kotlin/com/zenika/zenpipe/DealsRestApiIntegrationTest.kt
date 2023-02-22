package com.zenika.zenpipe

import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.interfaceadapters.controllers.webhook.AppConfig
import com.zenika.zenpipe.interfaceadapters.gateways.api.rest.DealRepositoryImpl
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration


@SpringBootTest(
    classes = [ZenpipeApplication::class],
    properties = [
        "spring.config.location=classpath:application-integration.yml",
        "spring.cloud.config.server.bootstrap=true"
    ]
)
@ContextConfiguration(classes= [AppConfig::class])
@ActiveProfiles("native")
class DealsRestApiIntegrationTest(@Autowired val deals: DealRepositoryImpl) {
    @Test
    fun given_a_deal_id_when_call_pipedrive_deal_api_then_return_deal_with_custom_fields() {
        val found = deals.findById(DealId(555))
        assertThat(found).isNotNull
    }
}