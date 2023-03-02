package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.SubscriptionAddonsResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface BillingApi extends ApiClient.Api {


  /**
   * Get all add-ons for a single company
   * Returns the add-ons for a single company.
   * @return SubscriptionAddonsResponse200
   */
  @RequestLine("GET /billing/subscriptions/addons")
  @Headers({
    "Accept: application/json",
  })
  SubscriptionAddonsResponse200 getCompanyAddons();

  /**
   * Get all add-ons for a single company
   * Similar to <code>getCompanyAddons</code> but it also returns the http response headers .
   * Returns the add-ons for a single company.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /billing/subscriptions/addons")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SubscriptionAddonsResponse200> getCompanyAddonsWithHttpInfo();


}
