package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddActivityRequest;
import com.zenika.pipedrive.model.AddActivityResponse200;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeleteActivitiesResponse200;
import com.zenika.pipedrive.model.DeleteActivityResponse200;
import com.zenika.pipedrive.model.GetActivitiesResponse200;
import com.zenika.pipedrive.model.GetActivityResponse200;
import java.time.LocalDate;
import com.zenika.pipedrive.model.UpdateActivityRequest;
import com.zenika.pipedrive.model.UpdateActivityResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface ActivitiesApi extends ApiClient.Api {


  /**
   * Add an activity
   * Adds a new activity. Includes &#x60;more_activities_scheduled_in_context&#x60; property in response&#39;s &#x60;additional_data&#x60; which indicates whether there are more undone activities scheduled with the same deal, person or organization (depending on the supplied data). For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-an-activity\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding an activity&lt;/a&gt;.
   * @param addActivityRequest  (optional)
   * @return AddActivityResponse200
   */
  @RequestLine("POST /activities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddActivityResponse200 addActivity(AddActivityRequest addActivityRequest);

  /**
   * Add an activity
   * Similar to <code>addActivity</code> but it also returns the http response headers .
   * Adds a new activity. Includes &#x60;more_activities_scheduled_in_context&#x60; property in response&#39;s &#x60;additional_data&#x60; which indicates whether there are more undone activities scheduled with the same deal, person or organization (depending on the supplied data). For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-an-activity\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding an activity&lt;/a&gt;.
   * @param addActivityRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /activities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddActivityResponse200> addActivityWithHttpInfo(AddActivityRequest addActivityRequest);



  /**
   * Delete multiple activities in bulk
   * Marks multiple activities as deleted. After 30 days, the activities will be permanently deleted.
   * @param ids The comma-separated IDs of activities that will be deleted (required)
   * @return DeleteActivitiesResponse200
   */
  @RequestLine("DELETE /activities?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteActivitiesResponse200 deleteActivities(@Param("ids") String ids);

  /**
   * Delete multiple activities in bulk
   * Similar to <code>deleteActivities</code> but it also returns the http response headers .
   * Marks multiple activities as deleted. After 30 days, the activities will be permanently deleted.
   * @param ids The comma-separated IDs of activities that will be deleted (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /activities?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteActivitiesResponse200> deleteActivitiesWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple activities in bulk
   * Marks multiple activities as deleted. After 30 days, the activities will be permanently deleted.
   * Note, this is equivalent to the other <code>deleteActivities</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteActivitiesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated IDs of activities that will be deleted (required)</li>
   *   </ul>
   * @return DeleteActivitiesResponse200
   */
  @RequestLine("DELETE /activities?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteActivitiesResponse200 deleteActivities(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple activities in bulk
  * Marks multiple activities as deleted. After 30 days, the activities will be permanently deleted.
  * Note, this is equivalent to the other <code>deleteActivities</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated IDs of activities that will be deleted (required)</li>
      *   </ul>
          * @return DeleteActivitiesResponse200
      */
      @RequestLine("DELETE /activities?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteActivitiesResponse200> deleteActivitiesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteActivities</code> method in a fluent style.
   */
  public static class DeleteActivitiesQueryParams extends HashMap<String, Object> {
    public DeleteActivitiesQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete an activity
   * Marks an activity as deleted. After 30 days, the activity will be permanently deleted.
   * @param id The ID of the activity (required)
   * @return DeleteActivityResponse200
   */
  @RequestLine("DELETE /activities/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteActivityResponse200 deleteActivity(@Param("id") Integer id);

  /**
   * Delete an activity
   * Similar to <code>deleteActivity</code> but it also returns the http response headers .
   * Marks an activity as deleted. After 30 days, the activity will be permanently deleted.
   * @param id The ID of the activity (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /activities/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteActivityResponse200> deleteActivityWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all activities assigned to a particular user
   * Returns all activities assigned to a particular user.
   * @param userId The ID of the user whose activities will be fetched. If omitted, the user associated with the API token will be used. If 0, activities for all company users will be fetched based on the permission sets. (optional)
   * @param filterId The ID of the filter to use (will narrow down results if used together with &#x60;user_id&#x60; parameter) (optional)
   * @param type The type of the activity, can be one type or multiple types separated by a comma. This is in correlation with the &#x60;key_string&#x60; parameter of ActivityTypes. (optional)
   * @param limit For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)
   * @param start For pagination, the position that represents the first result for the page (optional)
   * @param startDate Use the activity due date where you wish to begin fetching activities from. Insert due date in YYYY-MM-DD format. (optional)
   * @param endDate Use the activity due date where you wish to stop fetching activities from. Insert due date in YYYY-MM-DD format. (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both done and not done activities. (optional)
   * @return GetActivitiesResponse200
   */
  @RequestLine("GET /activities?user_id={userId}&filter_id={filterId}&type={type}&limit={limit}&start={start}&start_date={startDate}&end_date={endDate}&done={done}")
  @Headers({
    "Accept: application/json",
  })
  GetActivitiesResponse200 getActivities(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("type") String type, @Param("limit") Integer limit, @Param("start") Integer start, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("done") BigDecimal done);

  /**
   * Get all activities assigned to a particular user
   * Similar to <code>getActivities</code> but it also returns the http response headers .
   * Returns all activities assigned to a particular user.
   * @param userId The ID of the user whose activities will be fetched. If omitted, the user associated with the API token will be used. If 0, activities for all company users will be fetched based on the permission sets. (optional)
   * @param filterId The ID of the filter to use (will narrow down results if used together with &#x60;user_id&#x60; parameter) (optional)
   * @param type The type of the activity, can be one type or multiple types separated by a comma. This is in correlation with the &#x60;key_string&#x60; parameter of ActivityTypes. (optional)
   * @param limit For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)
   * @param start For pagination, the position that represents the first result for the page (optional)
   * @param startDate Use the activity due date where you wish to begin fetching activities from. Insert due date in YYYY-MM-DD format. (optional)
   * @param endDate Use the activity due date where you wish to stop fetching activities from. Insert due date in YYYY-MM-DD format. (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both done and not done activities. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /activities?user_id={userId}&filter_id={filterId}&type={type}&limit={limit}&start={start}&start_date={startDate}&end_date={endDate}&done={done}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetActivitiesResponse200> getActivitiesWithHttpInfo(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("type") String type, @Param("limit") Integer limit, @Param("start") Integer start, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("done") BigDecimal done);


  /**
   * Get all activities assigned to a particular user
   * Returns all activities assigned to a particular user.
   * Note, this is equivalent to the other <code>getActivities</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetActivitiesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - The ID of the user whose activities will be fetched. If omitted, the user associated with the API token will be used. If 0, activities for all company users will be fetched based on the permission sets. (optional)</li>
   *   <li>filterId - The ID of the filter to use (will narrow down results if used together with &#x60;user_id&#x60; parameter) (optional)</li>
   *   <li>type - The type of the activity, can be one type or multiple types separated by a comma. This is in correlation with the &#x60;key_string&#x60; parameter of ActivityTypes. (optional)</li>
   *   <li>limit - For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)</li>
   *   <li>start - For pagination, the position that represents the first result for the page (optional)</li>
   *   <li>startDate - Use the activity due date where you wish to begin fetching activities from. Insert due date in YYYY-MM-DD format. (optional)</li>
   *   <li>endDate - Use the activity due date where you wish to stop fetching activities from. Insert due date in YYYY-MM-DD format. (optional)</li>
   *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both done and not done activities. (optional)</li>
   *   </ul>
   * @return GetActivitiesResponse200
   */
  @RequestLine("GET /activities?user_id={userId}&filter_id={filterId}&type={type}&limit={limit}&start={start}&start_date={startDate}&end_date={endDate}&done={done}")
  @Headers({
  "Accept: application/json",
  })
  GetActivitiesResponse200 getActivities(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all activities assigned to a particular user
  * Returns all activities assigned to a particular user.
  * Note, this is equivalent to the other <code>getActivities</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>userId - The ID of the user whose activities will be fetched. If omitted, the user associated with the API token will be used. If 0, activities for all company users will be fetched based on the permission sets. (optional)</li>
          *   <li>filterId - The ID of the filter to use (will narrow down results if used together with &#x60;user_id&#x60; parameter) (optional)</li>
          *   <li>type - The type of the activity, can be one type or multiple types separated by a comma. This is in correlation with the &#x60;key_string&#x60; parameter of ActivityTypes. (optional)</li>
          *   <li>limit - For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)</li>
          *   <li>start - For pagination, the position that represents the first result for the page (optional)</li>
          *   <li>startDate - Use the activity due date where you wish to begin fetching activities from. Insert due date in YYYY-MM-DD format. (optional)</li>
          *   <li>endDate - Use the activity due date where you wish to stop fetching activities from. Insert due date in YYYY-MM-DD format. (optional)</li>
          *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both done and not done activities. (optional)</li>
      *   </ul>
          * @return GetActivitiesResponse200
      */
      @RequestLine("GET /activities?user_id={userId}&filter_id={filterId}&type={type}&limit={limit}&start={start}&start_date={startDate}&end_date={endDate}&done={done}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetActivitiesResponse200> getActivitiesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getActivities</code> method in a fluent style.
   */
  public static class GetActivitiesQueryParams extends HashMap<String, Object> {
    public GetActivitiesQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetActivitiesQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetActivitiesQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
    public GetActivitiesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetActivitiesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetActivitiesQueryParams startDate(final LocalDate value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public GetActivitiesQueryParams endDate(final LocalDate value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public GetActivitiesQueryParams done(final BigDecimal value) {
      put("done", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get details of an activity
   * Returns the details of a specific activity.
   * @param id The ID of the activity (required)
   * @return GetActivityResponse200
   */
  @RequestLine("GET /activities/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetActivityResponse200 getActivity(@Param("id") Integer id);

  /**
   * Get details of an activity
   * Similar to <code>getActivity</code> but it also returns the http response headers .
   * Returns the details of a specific activity.
   * @param id The ID of the activity (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /activities/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetActivityResponse200> getActivityWithHttpInfo(@Param("id") Integer id);



  /**
   * Update an activity
   * Updates an activity. Includes &#x60;more_activities_scheduled_in_context&#x60; property in response&#39;s &#x60;additional_data&#x60; which indicates whether there are more undone activities scheduled with the same deal, person or organization (depending on the supplied data).
   * @param id The ID of the activity (required)
   * @param updateActivityRequest  (optional)
   * @return UpdateActivityResponse200
   */
  @RequestLine("PUT /activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateActivityResponse200 updateActivity(@Param("id") Integer id, UpdateActivityRequest updateActivityRequest);

  /**
   * Update an activity
   * Similar to <code>updateActivity</code> but it also returns the http response headers .
   * Updates an activity. Includes &#x60;more_activities_scheduled_in_context&#x60; property in response&#39;s &#x60;additional_data&#x60; which indicates whether there are more undone activities scheduled with the same deal, person or organization (depending on the supplied data).
   * @param id The ID of the activity (required)
   * @param updateActivityRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateActivityResponse200> updateActivityWithHttpInfo(@Param("id") Integer id, UpdateActivityRequest updateActivityRequest);


}
