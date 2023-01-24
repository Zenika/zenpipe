package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.UnathorizedResponse;
import com.zenika.pipedrive.model.UserConnectionsResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface UserConnectionsApi extends ApiClient.Api {


  /**
   * Get all user connections
   * Returns data about all connections for the authorized user.
   * @return UserConnectionsResponse200
   */
  @RequestLine("GET /userConnections")
  @Headers({
    "Accept: application/json",
  })
  UserConnectionsResponse200 getUserConnections();

  /**
   * Get all user connections
   * Similar to <code>getUserConnections</code> but it also returns the http response headers .
   * Returns data about all connections for the authorized user.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /userConnections")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserConnectionsResponse200> getUserConnectionsWithHttpInfo();


}
