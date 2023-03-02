package com.zenika.zenpipe

import com.zenika.zenpipe.entities.*
import com.zenika.zenpipe.getaway.feign.client.KotlinDecoder
import com.zenika.zenpipe.getaway.feign.client.WebhookClient
import com.zenika.zenpipe.interfaceadapters.controllers.webhook.Meta
import com.zenika.zenpipe.interfaceadapters.controllers.webhook.WebhookRequest
import feign.Feign
import feign.jackson.JacksonEncoder
import feign.okhttp.OkHttpClient
import io.cucumber.java.ParameterType
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.server.LocalServerPort
import java.util.*
import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertEquals

class WebhookE2EIntegrationTest(
    @Autowired val deals: Deals,
    @LocalServerPort val port: String
) {

    @ParameterType(".*") // regexp
    fun id(id: String): Int? = if (id.isEmpty()) null else id.toInt()

    @ParameterType(".*") // regexp
    fun portfolioId(id: String): PortfolioId? = if (id.isEmpty()) null else PortfolioId(id.toInt())

    @ParameterType(".*") // regexp
    fun commercialId(id: String): CommercialTrainingId? = if (id.isEmpty()) null else CommercialTrainingId(id.toInt())

    @ParameterType(".*") // regexp
    fun accountManagerId(id: String): AccountManagerId? = if (id.isEmpty()) null else AccountManagerId(id.toInt())

    @Given("A deal {id} with custom fields {id} {portfolioId} {id} {accountManagerId} {commercialId}")
    fun deal_with_custom_fields(
        dealId: Int,
        organizationId: Int?,
        portfolioId: PortfolioId?,
        pipelineId: Int?,
        commercialTrainingId: CommercialTrainingId?,
        accountManagerId: AccountManagerId?
    ) {

        deals.update(DealId(dealId), mapOf("org_id" to organizationId, "pipeline_id" to pipelineId))

        val deal = deals.update(
            DealId(dealId),
            mapOf(
                "39fa372d6bd7a72582610dc42f63ece2a5386522" to Optional.ofNullable(portfolioId).map { it.value }
                    .getOrNull(),
                "e3605a045b0a8f245ba8f39aa040984fa136a6fb" to Optional.ofNullable(commercialTrainingId).map { it.value }
                    .getOrNull(),
                "65ce8ba3355440b46602fd510c9d0eaedd441be7" to Optional.ofNullable(accountManagerId).map { it.value }
                    .getOrNull()

            )
        )
        println("Given deal updated => $deal")
    }

    @When("An update deal event is received with {id}")
    fun update_event_is_received(dealId: Int) {
        val meta = Meta(dealId)
        val webhookRequest = WebhookRequest(meta)
        val clientLocal = Feign.builder().client(OkHttpClient()).encoder(JacksonEncoder()).decoder(KotlinDecoder())
            .target(WebhookClient::class.java, "http://localhost:$port")
        clientLocal.post(webhookRequest)
    }

    @Then("return deal {id} with custom field {portfolioId} {accountManagerId} {commercialId}")
    fun return_deal_with_custom_field(
        dealId: Int,
        expectedPortfolioId: PortfolioId?,
        expectedAccountManagerId: AccountManagerId?,
        expectedCommercialTrainingId: CommercialTrainingId?
    ) {
        val deal = deals.findById(DealId(dealId))
        assertEquals(expectedPortfolioId?.value, deal.portfolio?.id, "portfolio : $deal")
        assertEquals(expectedCommercialTrainingId?.value, deal.commercialTraining?.id, "commercial training : $deal")
        assertEquals(expectedAccountManagerId?.value, deal.accountManagerTraining?.id, "account manager: $deal")

    }
}
