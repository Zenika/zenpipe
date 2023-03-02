package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddGoalRequest;
import com.zenika.pipedrive.model.AddOrUpdateGoalResponse200;
import com.zenika.pipedrive.model.BasicGoalRequest;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeleteGoalResponse200;
import com.zenika.pipedrive.model.GetGoalResultResponse200;
import com.zenika.pipedrive.model.GetGoalsResponse200;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface GoalsApi extends ApiClient.Api {


  /**
   * Add a new goal
   * Adds a new goal. Along with adding a new goal, a report is created to track the progress of your goal.
   * @param addGoalRequest  (optional)
   * @return AddOrUpdateGoalResponse200
   */
  @RequestLine("POST /goals")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrUpdateGoalResponse200 addGoal(AddGoalRequest addGoalRequest);

  /**
   * Add a new goal
   * Similar to <code>addGoal</code> but it also returns the http response headers .
   * Adds a new goal. Along with adding a new goal, a report is created to track the progress of your goal.
   * @param addGoalRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /goals")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrUpdateGoalResponse200> addGoalWithHttpInfo(AddGoalRequest addGoalRequest);



  /**
   * Delete existing goal
   * Marks a goal as deleted.
   * @param id The ID of the goal (required)
   * @return DeleteGoalResponse200
   */
  @RequestLine("DELETE /goals/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteGoalResponse200 deleteGoal(@Param("id") String id);

  /**
   * Delete existing goal
   * Similar to <code>deleteGoal</code> but it also returns the http response headers .
   * Marks a goal as deleted.
   * @param id The ID of the goal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /goals/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteGoalResponse200> deleteGoalWithHttpInfo(@Param("id") String id);



  /**
   * Get result of a goal
   * Gets the progress of a goal for the specified period.
   * @param id The ID of the goal that the results are looked for (required)
   * @param periodStart The start date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or after the goal duration start date.  (required)
   * @param periodEnd The end date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or before the goal duration end date.  (required)
   * @return GetGoalResultResponse200
   */
  @RequestLine("GET /goals/{id}/results?period.start={periodStart}&period.end={periodEnd}")
  @Headers({
    "Accept: application/json",
  })
  GetGoalResultResponse200 getGoalResult(@Param("id") String id, @Param("periodStart") LocalDate periodStart, @Param("periodEnd") LocalDate periodEnd);

  /**
   * Get result of a goal
   * Similar to <code>getGoalResult</code> but it also returns the http response headers .
   * Gets the progress of a goal for the specified period.
   * @param id The ID of the goal that the results are looked for (required)
   * @param periodStart The start date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or after the goal duration start date.  (required)
   * @param periodEnd The end date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or before the goal duration end date.  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /goals/{id}/results?period.start={periodStart}&period.end={periodEnd}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetGoalResultResponse200> getGoalResultWithHttpInfo(@Param("id") String id, @Param("periodStart") LocalDate periodStart, @Param("periodEnd") LocalDate periodEnd);


  /**
   * Get result of a goal
   * Gets the progress of a goal for the specified period.
   * Note, this is equivalent to the other <code>getGoalResult</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGoalResultQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the goal that the results are looked for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>periodStart - The start date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or after the goal duration start date.  (required)</li>
   *   <li>periodEnd - The end date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or before the goal duration end date.  (required)</li>
   *   </ul>
   * @return GetGoalResultResponse200
   */
  @RequestLine("GET /goals/{id}/results?period.start={periodStart}&period.end={periodEnd}")
  @Headers({
  "Accept: application/json",
  })
  GetGoalResultResponse200 getGoalResult(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get result of a goal
  * Gets the progress of a goal for the specified period.
  * Note, this is equivalent to the other <code>getGoalResult</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the goal that the results are looked for (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>periodStart - The start date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or after the goal duration start date.  (required)</li>
          *   <li>periodEnd - The end date of the period for which to find the goal&#39;s progress. Format: YYYY-MM-DD. This date must be the same or before the goal duration end date.  (required)</li>
      *   </ul>
          * @return GetGoalResultResponse200
      */
      @RequestLine("GET /goals/{id}/results?period.start={periodStart}&period.end={periodEnd}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetGoalResultResponse200> getGoalResultWithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getGoalResult</code> method in a fluent style.
   */
  public static class GetGoalResultQueryParams extends HashMap<String, Object> {
    public GetGoalResultQueryParams periodStart(final LocalDate value) {
      put("period.start", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalResultQueryParams periodEnd(final LocalDate value) {
      put("period.end", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Find goals
   * Returns data about goals based on criteria. For searching, append &#x60;{searchField}&#x3D;{searchValue}&#x60; to the URL, where &#x60;searchField&#x60; can be any one of the lowest-level fields in dot-notation (e.g. &#x60;type.params.pipeline_id&#x60;; &#x60;title&#x60;). &#x60;searchValue&#x60; should be the value you are looking for on that field. Additionally, &#x60;is_active&#x3D;&lt;true|false&gt;&#x60; can be provided to search for only active/inactive goals. When providing &#x60;period.start&#x60;, &#x60;period.end&#x60; must also be provided and vice versa.
   * @param typeName The type of the goal. If provided, everyone&#39;s goals will be returned. (optional)
   * @param title The title of the goal (optional)
   * @param isActive Whether the goal is active or not (optional, default to true)
   * @param assigneeId The ID of the user who&#39;s goal to fetch. When omitted, only your goals will be returned. (optional)
   * @param assigneeType The type of the goal&#39;s assignee. If provided, everyone&#39;s goals will be returned. (optional)
   * @param expectedOutcomeTarget The numeric value of the outcome. If provided, everyone&#39;s goals will be returned. (optional)
   * @param expectedOutcomeTrackingMetric The tracking metric of the expected outcome of the goal. If provided, everyone&#39;s goals will be returned. (optional)
   * @param expectedOutcomeCurrencyId The numeric ID of the goal&#39;s currency. Only applicable to goals with &#x60;expected_outcome.tracking_metric&#x60; with value &#x60;sum&#x60;. If provided, everyone&#39;s goals will be returned. (optional)
   * @param typeParamsPipelineId An array of pipeline IDs or &#x60;null&#x60; for all pipelines. If provided, everyone&#39;s goals will be returned. (optional)
   * @param typeParamsStageId The ID of the stage. Applicable to only &#x60;deals_progressed&#x60; type of goals. If provided, everyone&#39;s goals will be returned. (optional)
   * @param typeParamsActivityTypeId An array of IDs or &#x60;null&#x60; for all activity types. Only applicable for &#x60;activities_completed&#x60; and/or &#x60;activities_added&#x60; types of goals. If provided, everyone&#39;s goals will be returned. (optional)
   * @param periodStart The start date of the period for which to find goals. Date in format of YYYY-MM-DD. When &#x60;period.start&#x60; is provided, &#x60;period.end&#x60; must be provided too. (optional)
   * @param periodEnd The end date of the period for which to find goals. Date in format of YYYY-MM-DD. (optional)
   * @return GetGoalsResponse200
   */
  @RequestLine("GET /goals/find?type.name={typeName}&title={title}&is_active={isActive}&assignee.id={assigneeId}&assignee.type={assigneeType}&expected_outcome.target={expectedOutcomeTarget}&expected_outcome.tracking_metric={expectedOutcomeTrackingMetric}&expected_outcome.currency_id={expectedOutcomeCurrencyId}&type.params.pipeline_id={typeParamsPipelineId}&type.params.stage_id={typeParamsStageId}&type.params.activity_type_id={typeParamsActivityTypeId}&period.start={periodStart}&period.end={periodEnd}")
  @Headers({
    "Accept: application/json",
  })
  GetGoalsResponse200 getGoals(@Param("typeName") String typeName, @Param("title") String title, @Param("isActive") Boolean isActive, @Param("assigneeId") Integer assigneeId, @Param("assigneeType") String assigneeType, @Param("expectedOutcomeTarget") BigDecimal expectedOutcomeTarget, @Param("expectedOutcomeTrackingMetric") String expectedOutcomeTrackingMetric, @Param("expectedOutcomeCurrencyId") Integer expectedOutcomeCurrencyId, @Param("typeParamsPipelineId") List<Integer> typeParamsPipelineId, @Param("typeParamsStageId") Integer typeParamsStageId, @Param("typeParamsActivityTypeId") List<Integer> typeParamsActivityTypeId, @Param("periodStart") LocalDate periodStart, @Param("periodEnd") LocalDate periodEnd);

  /**
   * Find goals
   * Similar to <code>getGoals</code> but it also returns the http response headers .
   * Returns data about goals based on criteria. For searching, append &#x60;{searchField}&#x3D;{searchValue}&#x60; to the URL, where &#x60;searchField&#x60; can be any one of the lowest-level fields in dot-notation (e.g. &#x60;type.params.pipeline_id&#x60;; &#x60;title&#x60;). &#x60;searchValue&#x60; should be the value you are looking for on that field. Additionally, &#x60;is_active&#x3D;&lt;true|false&gt;&#x60; can be provided to search for only active/inactive goals. When providing &#x60;period.start&#x60;, &#x60;period.end&#x60; must also be provided and vice versa.
   * @param typeName The type of the goal. If provided, everyone&#39;s goals will be returned. (optional)
   * @param title The title of the goal (optional)
   * @param isActive Whether the goal is active or not (optional, default to true)
   * @param assigneeId The ID of the user who&#39;s goal to fetch. When omitted, only your goals will be returned. (optional)
   * @param assigneeType The type of the goal&#39;s assignee. If provided, everyone&#39;s goals will be returned. (optional)
   * @param expectedOutcomeTarget The numeric value of the outcome. If provided, everyone&#39;s goals will be returned. (optional)
   * @param expectedOutcomeTrackingMetric The tracking metric of the expected outcome of the goal. If provided, everyone&#39;s goals will be returned. (optional)
   * @param expectedOutcomeCurrencyId The numeric ID of the goal&#39;s currency. Only applicable to goals with &#x60;expected_outcome.tracking_metric&#x60; with value &#x60;sum&#x60;. If provided, everyone&#39;s goals will be returned. (optional)
   * @param typeParamsPipelineId An array of pipeline IDs or &#x60;null&#x60; for all pipelines. If provided, everyone&#39;s goals will be returned. (optional)
   * @param typeParamsStageId The ID of the stage. Applicable to only &#x60;deals_progressed&#x60; type of goals. If provided, everyone&#39;s goals will be returned. (optional)
   * @param typeParamsActivityTypeId An array of IDs or &#x60;null&#x60; for all activity types. Only applicable for &#x60;activities_completed&#x60; and/or &#x60;activities_added&#x60; types of goals. If provided, everyone&#39;s goals will be returned. (optional)
   * @param periodStart The start date of the period for which to find goals. Date in format of YYYY-MM-DD. When &#x60;period.start&#x60; is provided, &#x60;period.end&#x60; must be provided too. (optional)
   * @param periodEnd The end date of the period for which to find goals. Date in format of YYYY-MM-DD. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /goals/find?type.name={typeName}&title={title}&is_active={isActive}&assignee.id={assigneeId}&assignee.type={assigneeType}&expected_outcome.target={expectedOutcomeTarget}&expected_outcome.tracking_metric={expectedOutcomeTrackingMetric}&expected_outcome.currency_id={expectedOutcomeCurrencyId}&type.params.pipeline_id={typeParamsPipelineId}&type.params.stage_id={typeParamsStageId}&type.params.activity_type_id={typeParamsActivityTypeId}&period.start={periodStart}&period.end={periodEnd}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetGoalsResponse200> getGoalsWithHttpInfo(@Param("typeName") String typeName, @Param("title") String title, @Param("isActive") Boolean isActive, @Param("assigneeId") Integer assigneeId, @Param("assigneeType") String assigneeType, @Param("expectedOutcomeTarget") BigDecimal expectedOutcomeTarget, @Param("expectedOutcomeTrackingMetric") String expectedOutcomeTrackingMetric, @Param("expectedOutcomeCurrencyId") Integer expectedOutcomeCurrencyId, @Param("typeParamsPipelineId") List<Integer> typeParamsPipelineId, @Param("typeParamsStageId") Integer typeParamsStageId, @Param("typeParamsActivityTypeId") List<Integer> typeParamsActivityTypeId, @Param("periodStart") LocalDate periodStart, @Param("periodEnd") LocalDate periodEnd);


  /**
   * Find goals
   * Returns data about goals based on criteria. For searching, append &#x60;{searchField}&#x3D;{searchValue}&#x60; to the URL, where &#x60;searchField&#x60; can be any one of the lowest-level fields in dot-notation (e.g. &#x60;type.params.pipeline_id&#x60;; &#x60;title&#x60;). &#x60;searchValue&#x60; should be the value you are looking for on that field. Additionally, &#x60;is_active&#x3D;&lt;true|false&gt;&#x60; can be provided to search for only active/inactive goals. When providing &#x60;period.start&#x60;, &#x60;period.end&#x60; must also be provided and vice versa.
   * Note, this is equivalent to the other <code>getGoals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGoalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>typeName - The type of the goal. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>title - The title of the goal (optional)</li>
   *   <li>isActive - Whether the goal is active or not (optional, default to true)</li>
   *   <li>assigneeId - The ID of the user who&#39;s goal to fetch. When omitted, only your goals will be returned. (optional)</li>
   *   <li>assigneeType - The type of the goal&#39;s assignee. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>expectedOutcomeTarget - The numeric value of the outcome. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>expectedOutcomeTrackingMetric - The tracking metric of the expected outcome of the goal. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>expectedOutcomeCurrencyId - The numeric ID of the goal&#39;s currency. Only applicable to goals with &#x60;expected_outcome.tracking_metric&#x60; with value &#x60;sum&#x60;. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>typeParamsPipelineId - An array of pipeline IDs or &#x60;null&#x60; for all pipelines. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>typeParamsStageId - The ID of the stage. Applicable to only &#x60;deals_progressed&#x60; type of goals. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>typeParamsActivityTypeId - An array of IDs or &#x60;null&#x60; for all activity types. Only applicable for &#x60;activities_completed&#x60; and/or &#x60;activities_added&#x60; types of goals. If provided, everyone&#39;s goals will be returned. (optional)</li>
   *   <li>periodStart - The start date of the period for which to find goals. Date in format of YYYY-MM-DD. When &#x60;period.start&#x60; is provided, &#x60;period.end&#x60; must be provided too. (optional)</li>
   *   <li>periodEnd - The end date of the period for which to find goals. Date in format of YYYY-MM-DD. (optional)</li>
   *   </ul>
   * @return GetGoalsResponse200
   */
  @RequestLine("GET /goals/find?type.name={typeName}&title={title}&is_active={isActive}&assignee.id={assigneeId}&assignee.type={assigneeType}&expected_outcome.target={expectedOutcomeTarget}&expected_outcome.tracking_metric={expectedOutcomeTrackingMetric}&expected_outcome.currency_id={expectedOutcomeCurrencyId}&type.params.pipeline_id={typeParamsPipelineId}&type.params.stage_id={typeParamsStageId}&type.params.activity_type_id={typeParamsActivityTypeId}&period.start={periodStart}&period.end={periodEnd}")
  @Headers({
  "Accept: application/json",
  })
  GetGoalsResponse200 getGoals(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Find goals
  * Returns data about goals based on criteria. For searching, append &#x60;{searchField}&#x3D;{searchValue}&#x60; to the URL, where &#x60;searchField&#x60; can be any one of the lowest-level fields in dot-notation (e.g. &#x60;type.params.pipeline_id&#x60;; &#x60;title&#x60;). &#x60;searchValue&#x60; should be the value you are looking for on that field. Additionally, &#x60;is_active&#x3D;&lt;true|false&gt;&#x60; can be provided to search for only active/inactive goals. When providing &#x60;period.start&#x60;, &#x60;period.end&#x60; must also be provided and vice versa.
  * Note, this is equivalent to the other <code>getGoals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>typeName - The type of the goal. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>title - The title of the goal (optional)</li>
          *   <li>isActive - Whether the goal is active or not (optional, default to true)</li>
          *   <li>assigneeId - The ID of the user who&#39;s goal to fetch. When omitted, only your goals will be returned. (optional)</li>
          *   <li>assigneeType - The type of the goal&#39;s assignee. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>expectedOutcomeTarget - The numeric value of the outcome. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>expectedOutcomeTrackingMetric - The tracking metric of the expected outcome of the goal. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>expectedOutcomeCurrencyId - The numeric ID of the goal&#39;s currency. Only applicable to goals with &#x60;expected_outcome.tracking_metric&#x60; with value &#x60;sum&#x60;. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>typeParamsPipelineId - An array of pipeline IDs or &#x60;null&#x60; for all pipelines. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>typeParamsStageId - The ID of the stage. Applicable to only &#x60;deals_progressed&#x60; type of goals. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>typeParamsActivityTypeId - An array of IDs or &#x60;null&#x60; for all activity types. Only applicable for &#x60;activities_completed&#x60; and/or &#x60;activities_added&#x60; types of goals. If provided, everyone&#39;s goals will be returned. (optional)</li>
          *   <li>periodStart - The start date of the period for which to find goals. Date in format of YYYY-MM-DD. When &#x60;period.start&#x60; is provided, &#x60;period.end&#x60; must be provided too. (optional)</li>
          *   <li>periodEnd - The end date of the period for which to find goals. Date in format of YYYY-MM-DD. (optional)</li>
      *   </ul>
          * @return GetGoalsResponse200
      */
      @RequestLine("GET /goals/find?type.name={typeName}&title={title}&is_active={isActive}&assignee.id={assigneeId}&assignee.type={assigneeType}&expected_outcome.target={expectedOutcomeTarget}&expected_outcome.tracking_metric={expectedOutcomeTrackingMetric}&expected_outcome.currency_id={expectedOutcomeCurrencyId}&type.params.pipeline_id={typeParamsPipelineId}&type.params.stage_id={typeParamsStageId}&type.params.activity_type_id={typeParamsActivityTypeId}&period.start={periodStart}&period.end={periodEnd}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetGoalsResponse200> getGoalsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getGoals</code> method in a fluent style.
   */
  public static class GetGoalsQueryParams extends HashMap<String, Object> {
    public GetGoalsQueryParams typeName(final String value) {
      put("type.name", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams isActive(final Boolean value) {
      put("is_active", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams assigneeId(final Integer value) {
      put("assignee.id", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams assigneeType(final String value) {
      put("assignee.type", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams expectedOutcomeTarget(final BigDecimal value) {
      put("expected_outcome.target", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams expectedOutcomeTrackingMetric(final String value) {
      put("expected_outcome.tracking_metric", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams expectedOutcomeCurrencyId(final Integer value) {
      put("expected_outcome.currency_id", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams typeParamsPipelineId(final List<Integer> value) {
      put("type.params.pipeline_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetGoalsQueryParams typeParamsStageId(final Integer value) {
      put("type.params.stage_id", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams typeParamsActivityTypeId(final List<Integer> value) {
      put("type.params.activity_type_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetGoalsQueryParams periodStart(final LocalDate value) {
      put("period.start", EncodingUtils.encode(value));
      return this;
    }
    public GetGoalsQueryParams periodEnd(final LocalDate value) {
      put("period.end", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update existing goal
   * Updates an existing goal.
   * @param id The ID of the goal (required)
   * @param basicGoalRequest  (optional)
   * @return AddOrUpdateGoalResponse200
   */
  @RequestLine("PUT /goals/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrUpdateGoalResponse200 updateGoal(@Param("id") String id, BasicGoalRequest basicGoalRequest);

  /**
   * Update existing goal
   * Similar to <code>updateGoal</code> but it also returns the http response headers .
   * Updates an existing goal.
   * @param id The ID of the goal (required)
   * @param basicGoalRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /goals/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrUpdateGoalResponse200> updateGoalWithHttpInfo(@Param("id") String id, BasicGoalRequest basicGoalRequest);


}
