package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.GetUserSettingsResponse200;
import com.zenika.pipedrive.model.UnathorizedResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface UserSettingsApi extends ApiClient.Api {


  /**
   * List settings of an authorized user
   * Lists the settings of an authorized user. Example response contains a shortened list of settings.
   * @return GetUserSettingsResponse200
   */
  @RequestLine("GET /userSettings")
  @Headers({
    "Accept: application/json",
  })
  GetUserSettingsResponse200 getUserSettings();

  /**
   * List settings of an authorized user
   * Similar to <code>getUserSettings</code> but it also returns the http response headers .
   * Lists the settings of an authorized user. Example response contains a shortened list of settings.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /userSettings")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetUserSettingsResponse200> getUserSettingsWithHttpInfo();


}
