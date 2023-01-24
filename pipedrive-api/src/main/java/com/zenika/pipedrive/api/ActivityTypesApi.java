package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddActivityTypeRequest;
import com.zenika.pipedrive.model.CreateUpdateDeleteActivityTypeResponse200;
import com.zenika.pipedrive.model.DeleteActivityTypesResponse200;
import com.zenika.pipedrive.model.GetActivityTypesResponse200;
import com.zenika.pipedrive.model.UpdateActivityTypeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface ActivityTypesApi extends ApiClient.Api {


  /**
   * Add new activity type
   * Adds a new activity type.
   * @param addActivityTypeRequest  (optional)
   * @return CreateUpdateDeleteActivityTypeResponse200
   */
  @RequestLine("POST /activityTypes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateUpdateDeleteActivityTypeResponse200 addActivityType(AddActivityTypeRequest addActivityTypeRequest);

  /**
   * Add new activity type
   * Similar to <code>addActivityType</code> but it also returns the http response headers .
   * Adds a new activity type.
   * @param addActivityTypeRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /activityTypes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateUpdateDeleteActivityTypeResponse200> addActivityTypeWithHttpInfo(AddActivityTypeRequest addActivityTypeRequest);



  /**
   * Delete an activity type
   * Marks an activity type as deleted.
   * @param id The ID of the activity type (required)
   * @return CreateUpdateDeleteActivityTypeResponse200
   */
  @RequestLine("DELETE /activityTypes/{id}")
  @Headers({
    "Accept: application/json",
  })
  CreateUpdateDeleteActivityTypeResponse200 deleteActivityType(@Param("id") Integer id);

  /**
   * Delete an activity type
   * Similar to <code>deleteActivityType</code> but it also returns the http response headers .
   * Marks an activity type as deleted.
   * @param id The ID of the activity type (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /activityTypes/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CreateUpdateDeleteActivityTypeResponse200> deleteActivityTypeWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple activity types in bulk
   * Marks multiple activity types as deleted.
   * @param ids The comma-separated activity type IDs (required)
   * @return DeleteActivityTypesResponse200
   */
  @RequestLine("DELETE /activityTypes?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteActivityTypesResponse200 deleteActivityTypes(@Param("ids") String ids);

  /**
   * Delete multiple activity types in bulk
   * Similar to <code>deleteActivityTypes</code> but it also returns the http response headers .
   * Marks multiple activity types as deleted.
   * @param ids The comma-separated activity type IDs (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /activityTypes?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteActivityTypesResponse200> deleteActivityTypesWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple activity types in bulk
   * Marks multiple activity types as deleted.
   * Note, this is equivalent to the other <code>deleteActivityTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteActivityTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated activity type IDs (required)</li>
   *   </ul>
   * @return DeleteActivityTypesResponse200
   */
  @RequestLine("DELETE /activityTypes?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteActivityTypesResponse200 deleteActivityTypes(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple activity types in bulk
  * Marks multiple activity types as deleted.
  * Note, this is equivalent to the other <code>deleteActivityTypes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated activity type IDs (required)</li>
      *   </ul>
          * @return DeleteActivityTypesResponse200
      */
      @RequestLine("DELETE /activityTypes?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteActivityTypesResponse200> deleteActivityTypesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteActivityTypes</code> method in a fluent style.
   */
  public static class DeleteActivityTypesQueryParams extends HashMap<String, Object> {
    public DeleteActivityTypesQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all activity types
   * Returns all activity types.
   * @return GetActivityTypesResponse200
   */
  @RequestLine("GET /activityTypes")
  @Headers({
    "Accept: application/json",
  })
  GetActivityTypesResponse200 getActivityTypes();

  /**
   * Get all activity types
   * Similar to <code>getActivityTypes</code> but it also returns the http response headers .
   * Returns all activity types.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /activityTypes")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetActivityTypesResponse200> getActivityTypesWithHttpInfo();



  /**
   * Update an activity type
   * Updates an activity type.
   * @param id The ID of the activity type (required)
   * @param updateActivityTypeRequest  (optional)
   * @return CreateUpdateDeleteActivityTypeResponse200
   */
  @RequestLine("PUT /activityTypes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateUpdateDeleteActivityTypeResponse200 updateActivityType(@Param("id") Integer id, UpdateActivityTypeRequest updateActivityTypeRequest);

  /**
   * Update an activity type
   * Similar to <code>updateActivityType</code> but it also returns the http response headers .
   * Updates an activity type.
   * @param id The ID of the activity type (required)
   * @param updateActivityTypeRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /activityTypes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateUpdateDeleteActivityTypeResponse200> updateActivityTypeWithHttpInfo(@Param("id") Integer id, UpdateActivityTypeRequest updateActivityTypeRequest);


}
