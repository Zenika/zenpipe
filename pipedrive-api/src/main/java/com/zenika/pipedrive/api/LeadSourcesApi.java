package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.GetLeadSourcesResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface LeadSourcesApi extends ApiClient.Api {


  /**
   * Get all lead sources
   * Returns all lead sources. Please note that the list of lead sources is fixed, it cannot be modified. All leads created through the Pipedrive API will have a lead source &#x60;API&#x60; assigned. 
   * @return GetLeadSourcesResponse200
   */
  @RequestLine("GET /leadSources")
  @Headers({
    "Accept: application/json",
  })
  GetLeadSourcesResponse200 getLeadSources();

  /**
   * Get all lead sources
   * Similar to <code>getLeadSources</code> but it also returns the http response headers .
   * Returns all lead sources. Please note that the list of lead sources is fixed, it cannot be modified. All leads created through the Pipedrive API will have a lead source &#x60;API&#x60; assigned. 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /leadSources")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetLeadSourcesResponse200> getLeadSourcesWithHttpInfo();


}
