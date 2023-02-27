package com.zenika.zenpipe

import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.interfaceadapters.controllers.webhook.AppConfig
import com.zenika.zenpipe.interfaceadapters.gateways.api.rest.DealPipedriveRestApi
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
@ContextConfiguration(classes = [AppConfig::class])
@ActiveProfiles("native")
class DealsRestApiIntegrationTest(@Autowired val deals: DealPipedriveRestApi) {

    private fun init() {
        val dealId = DealId(584)
        val customFields = mapOf(
            "65ce8ba3355440b46602fd510c9d0eaedd441be7" to null,
            "e3605a045b0a8f245ba8f39aa040984fa136a6fb" to null,
            "39fa372d6bd7a72582610dc42f63ece2a5386522" to null
        )
        //when
        deals.update(dealId, customFields)
    }


    @Test
    fun given_a_deal_id_when_call_pipedrive_deal_api_then_return_deal_with_custom_fields() {
        //given
        val dealId = DealId(587)

        //when
        val found = deals.findById(dealId)

        //then
        val portfolio = found.portfolio
        val commercialTraining = found.commercialTraining
        val accountManagerTraining = found.accountManagerTraining

        assertThat(portfolio).isNotNull
        assertThat(commercialTraining).isNotNull
        assertThat(accountManagerTraining).isNotNull
    }

    @Test
    fun given_a_deal_id_and_a_deal_custom_field_when_call_pipedrive_deal_api_and_deal_custom_field_not_empty_then_return_custom_field_deal_updated() {
        //given
        init()
        val dealId = DealId(584)
        val customFields = mapOf(
            "65ce8ba3355440b46602fd510c9d0eaedd441be7" to 15641116,
            "e3605a045b0a8f245ba8f39aa040984fa136a6fb" to 15608369,
            "39fa372d6bd7a72582610dc42f63ece2a5386522" to 1501
        )
        //when
        val dealUpdated = deals.update(dealId, customFields)

        //then
        val portfolio = dealUpdated.portfolio
        val commercialTraining = dealUpdated.commercialTraining
        val accountManagerTraining = dealUpdated.accountManagerTraining

        assertThat(portfolio).isNotNull
        assertThat(commercialTraining).isNotNull
        assertThat(accountManagerTraining).isNotNull

    }
}