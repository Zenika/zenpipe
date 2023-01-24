package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.GetNoteFieldsResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface NoteFieldsApi extends ApiClient.Api {


  /**
   * Get all note fields
   * Returns data about all note fields.
   * @return GetNoteFieldsResponse200
   */
  @RequestLine("GET /noteFields")
  @Headers({
    "Accept: application/json",
  })
  GetNoteFieldsResponse200 getNoteFields();

  /**
   * Get all note fields
   * Similar to <code>getNoteFields</code> but it also returns the http response headers .
   * Returns data about all note fields.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /noteFields")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetNoteFieldsResponse200> getNoteFieldsWithHttpInfo();


}
