package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddLeadLabelRequest;
import com.zenika.pipedrive.model.AddOrUpdateLeadLabelResponse200;
import com.zenika.pipedrive.model.GetLeadLabelsResponse200;
import com.zenika.pipedrive.model.LeadIdResponse200;
import com.zenika.pipedrive.model.LeadResponse404;
import java.util.UUID;
import com.zenika.pipedrive.model.UpdateLeadLabelRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface LeadLabelsApi extends ApiClient.Api {


  /**
   * Add a lead label
   * Creates a lead label.
   * @param addLeadLabelRequest  (optional)
   * @return AddOrUpdateLeadLabelResponse200
   */
  @RequestLine("POST /leadLabels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrUpdateLeadLabelResponse200 addLeadLabel(AddLeadLabelRequest addLeadLabelRequest);

  /**
   * Add a lead label
   * Similar to <code>addLeadLabel</code> but it also returns the http response headers .
   * Creates a lead label.
   * @param addLeadLabelRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /leadLabels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrUpdateLeadLabelResponse200> addLeadLabelWithHttpInfo(AddLeadLabelRequest addLeadLabelRequest);



  /**
   * Delete a lead label
   * Deletes a specific lead label.
   * @param id The ID of the lead label (required)
   * @return LeadIdResponse200
   */
  @RequestLine("DELETE /leadLabels/{id}")
  @Headers({
    "Accept: application/json",
  })
  LeadIdResponse200 deleteLeadLabel(@Param("id") UUID id);

  /**
   * Delete a lead label
   * Similar to <code>deleteLeadLabel</code> but it also returns the http response headers .
   * Deletes a specific lead label.
   * @param id The ID of the lead label (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /leadLabels/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<LeadIdResponse200> deleteLeadLabelWithHttpInfo(@Param("id") UUID id);



  /**
   * Get all lead labels
   * Returns details of all lead labels. This endpoint does not support pagination and all labels are always returned.
   * @return GetLeadLabelsResponse200
   */
  @RequestLine("GET /leadLabels")
  @Headers({
    "Accept: application/json",
  })
  GetLeadLabelsResponse200 getLeadLabels();

  /**
   * Get all lead labels
   * Similar to <code>getLeadLabels</code> but it also returns the http response headers .
   * Returns details of all lead labels. This endpoint does not support pagination and all labels are always returned.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /leadLabels")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetLeadLabelsResponse200> getLeadLabelsWithHttpInfo();



  /**
   * Update a lead label
   * Updates one or more properties of a lead label. Only properties included in the request will be updated. 
   * @param id The ID of the lead label (required)
   * @param updateLeadLabelRequest  (optional)
   * @return AddOrUpdateLeadLabelResponse200
   */
  @RequestLine("PATCH /leadLabels/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrUpdateLeadLabelResponse200 updateLeadLabel(@Param("id") UUID id, UpdateLeadLabelRequest updateLeadLabelRequest);

  /**
   * Update a lead label
   * Similar to <code>updateLeadLabel</code> but it also returns the http response headers .
   * Updates one or more properties of a lead label. Only properties included in the request will be updated. 
   * @param id The ID of the lead label (required)
   * @param updateLeadLabelRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /leadLabels/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrUpdateLeadLabelResponse200> updateLeadLabelWithHttpInfo(@Param("id") UUID id, UpdateLeadLabelRequest updateLeadLabelRequest);


}
