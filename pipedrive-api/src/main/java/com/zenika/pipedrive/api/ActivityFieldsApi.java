package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.FieldsResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface ActivityFieldsApi extends ApiClient.Api {


  /**
   * Get all activity fields
   * Returns all activity fields.
   * @return FieldsResponse200
   */
  @RequestLine("GET /activityFields")
  @Headers({
    "Accept: application/json",
  })
  FieldsResponse200 getActivityFields();

  /**
   * Get all activity fields
   * Similar to <code>getActivityFields</code> but it also returns the http response headers .
   * Returns all activity fields.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /activityFields")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FieldsResponse200> getActivityFieldsWithHttpInfo();


}
