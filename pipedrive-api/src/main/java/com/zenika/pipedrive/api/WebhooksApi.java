package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddWebhookRequest;
import com.zenika.pipedrive.model.BaseResponse200;
import com.zenika.pipedrive.model.DeleteWebhook403Response;
import com.zenika.pipedrive.model.GetWebhooksResponse200;
import com.zenika.pipedrive.model.UnathorizedResponse;
import com.zenika.pipedrive.model.WebhookResponse200;
import com.zenika.pipedrive.model.WebhooksBadRequestResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface WebhooksApi extends ApiClient.Api {


  /**
   * Create a new Webhook
   * Creates a new Webhook and returns its details. Note that specifying an event which triggers the Webhook combines 2 parameters - &#x60;event_action&#x60; and &#x60;event_object&#x60;. E.g., use &#x60;*.*&#x60; for getting notifications about all events, &#x60;added.deal&#x60; for any newly added deals, &#x60;deleted.persons&#x60; for any deleted persons, etc. See &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/guide-for-webhooks?ref&#x3D;api_reference\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;the guide for Webhooks&lt;/a&gt; for more details.
   * @param addWebhookRequest  (optional)
   * @return WebhookResponse200
   */
  @RequestLine("POST /webhooks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WebhookResponse200 addWebhook(AddWebhookRequest addWebhookRequest);

  /**
   * Create a new Webhook
   * Similar to <code>addWebhook</code> but it also returns the http response headers .
   * Creates a new Webhook and returns its details. Note that specifying an event which triggers the Webhook combines 2 parameters - &#x60;event_action&#x60; and &#x60;event_object&#x60;. E.g., use &#x60;*.*&#x60; for getting notifications about all events, &#x60;added.deal&#x60; for any newly added deals, &#x60;deleted.persons&#x60; for any deleted persons, etc. See &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/guide-for-webhooks?ref&#x3D;api_reference\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;the guide for Webhooks&lt;/a&gt; for more details.
   * @param addWebhookRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /webhooks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WebhookResponse200> addWebhookWithHttpInfo(AddWebhookRequest addWebhookRequest);



  /**
   * Delete existing Webhook
   * Deletes the specified Webhook.
   * @param id The ID of the Webhook to delete (required)
   * @return BaseResponse200
   */
  @RequestLine("DELETE /webhooks/{id}")
  @Headers({
    "Accept: application/json",
  })
  BaseResponse200 deleteWebhook(@Param("id") Integer id);

  /**
   * Delete existing Webhook
   * Similar to <code>deleteWebhook</code> but it also returns the http response headers .
   * Deletes the specified Webhook.
   * @param id The ID of the Webhook to delete (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /webhooks/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<BaseResponse200> deleteWebhookWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all Webhooks
   * Returns data about all the Webhooks of a company.
   * @return GetWebhooksResponse200
   */
  @RequestLine("GET /webhooks")
  @Headers({
    "Accept: application/json",
  })
  GetWebhooksResponse200 getWebhooks();

  /**
   * Get all Webhooks
   * Similar to <code>getWebhooks</code> but it also returns the http response headers .
   * Returns data about all the Webhooks of a company.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /webhooks")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetWebhooksResponse200> getWebhooksWithHttpInfo();


}
