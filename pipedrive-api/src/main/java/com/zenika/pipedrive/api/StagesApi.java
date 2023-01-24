package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddStageRequest;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeleteStageResponse200;
import com.zenika.pipedrive.model.DeleteStagesResponse200;
import com.zenika.pipedrive.model.GetStageDealsResponse200;
import com.zenika.pipedrive.model.GetStageResponse200;
import com.zenika.pipedrive.model.GetStagesResponse200;
import com.zenika.pipedrive.model.StageResponse200;
import com.zenika.pipedrive.model.UpdateStageRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface StagesApi extends ApiClient.Api {


  /**
   * Add a new stage
   * Adds a new stage, returns the ID upon success.
   * @param addStageRequest  (optional)
   * @return StageResponse200
   */
  @RequestLine("POST /stages")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StageResponse200 addStage(AddStageRequest addStageRequest);

  /**
   * Add a new stage
   * Similar to <code>addStage</code> but it also returns the http response headers .
   * Adds a new stage, returns the ID upon success.
   * @param addStageRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /stages")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StageResponse200> addStageWithHttpInfo(AddStageRequest addStageRequest);



  /**
   * Delete a stage
   * Marks a stage as deleted.
   * @param id The ID of the stage (required)
   * @return DeleteStageResponse200
   */
  @RequestLine("DELETE /stages/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteStageResponse200 deleteStage(@Param("id") Integer id);

  /**
   * Delete a stage
   * Similar to <code>deleteStage</code> but it also returns the http response headers .
   * Marks a stage as deleted.
   * @param id The ID of the stage (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /stages/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteStageResponse200> deleteStageWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple stages in bulk
   * Marks multiple stages as deleted.
   * @param ids The comma-separated stage IDs to delete (required)
   * @return DeleteStagesResponse200
   */
  @RequestLine("DELETE /stages?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteStagesResponse200 deleteStages(@Param("ids") String ids);

  /**
   * Delete multiple stages in bulk
   * Similar to <code>deleteStages</code> but it also returns the http response headers .
   * Marks multiple stages as deleted.
   * @param ids The comma-separated stage IDs to delete (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /stages?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteStagesResponse200> deleteStagesWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple stages in bulk
   * Marks multiple stages as deleted.
   * Note, this is equivalent to the other <code>deleteStages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStagesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated stage IDs to delete (required)</li>
   *   </ul>
   * @return DeleteStagesResponse200
   */
  @RequestLine("DELETE /stages?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteStagesResponse200 deleteStages(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple stages in bulk
  * Marks multiple stages as deleted.
  * Note, this is equivalent to the other <code>deleteStages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated stage IDs to delete (required)</li>
      *   </ul>
          * @return DeleteStagesResponse200
      */
      @RequestLine("DELETE /stages?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteStagesResponse200> deleteStagesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStages</code> method in a fluent style.
   */
  public static class DeleteStagesQueryParams extends HashMap<String, Object> {
    public DeleteStagesQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get one stage
   * Returns data about a specific stage.
   * @param id The ID of the stage (required)
   * @param everyone If &#x60;everyone&#x3D;1&#x60; is provided, deals summary will return deals owned by every user (optional)
   * @return GetStageResponse200
   */
  @RequestLine("GET /stages/{id}?everyone={everyone}")
  @Headers({
    "Accept: application/json",
  })
  GetStageResponse200 getStage(@Param("id") Integer id, @Param("everyone") BigDecimal everyone);

  /**
   * Get one stage
   * Similar to <code>getStage</code> but it also returns the http response headers .
   * Returns data about a specific stage.
   * @param id The ID of the stage (required)
   * @param everyone If &#x60;everyone&#x3D;1&#x60; is provided, deals summary will return deals owned by every user (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /stages/{id}?everyone={everyone}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetStageResponse200> getStageWithHttpInfo(@Param("id") Integer id, @Param("everyone") BigDecimal everyone);


  /**
   * Get one stage
   * Returns data about a specific stage.
   * Note, this is equivalent to the other <code>getStage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the stage (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>everyone - If &#x60;everyone&#x3D;1&#x60; is provided, deals summary will return deals owned by every user (optional)</li>
   *   </ul>
   * @return GetStageResponse200
   */
  @RequestLine("GET /stages/{id}?everyone={everyone}")
  @Headers({
  "Accept: application/json",
  })
  GetStageResponse200 getStage(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get one stage
  * Returns data about a specific stage.
  * Note, this is equivalent to the other <code>getStage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the stage (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>everyone - If &#x60;everyone&#x3D;1&#x60; is provided, deals summary will return deals owned by every user (optional)</li>
      *   </ul>
          * @return GetStageResponse200
      */
      @RequestLine("GET /stages/{id}?everyone={everyone}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetStageResponse200> getStageWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getStage</code> method in a fluent style.
   */
  public static class GetStageQueryParams extends HashMap<String, Object> {
    public GetStageQueryParams everyone(final BigDecimal value) {
      put("everyone", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get deals in a stage
   * Lists deals in a specific stage.
   * @param id The ID of the stage (required)
   * @param filterId If supplied, only deals matching the given filter will be returned (optional)
   * @param userId If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)
   * @param everyone If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetStageDealsResponse200
   */
  @RequestLine("GET /stages/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetStageDealsResponse200 getStageDeals(@Param("id") Integer id, @Param("filterId") Integer filterId, @Param("userId") Integer userId, @Param("everyone") BigDecimal everyone, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get deals in a stage
   * Similar to <code>getStageDeals</code> but it also returns the http response headers .
   * Lists deals in a specific stage.
   * @param id The ID of the stage (required)
   * @param filterId If supplied, only deals matching the given filter will be returned (optional)
   * @param userId If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)
   * @param everyone If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /stages/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetStageDealsResponse200> getStageDealsWithHttpInfo(@Param("id") Integer id, @Param("filterId") Integer filterId, @Param("userId") Integer userId, @Param("everyone") BigDecimal everyone, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get deals in a stage
   * Lists deals in a specific stage.
   * Note, this is equivalent to the other <code>getStageDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStageDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the stage (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>filterId - If supplied, only deals matching the given filter will be returned (optional)</li>
   *   <li>userId - If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)</li>
   *   <li>everyone - If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetStageDealsResponse200
   */
  @RequestLine("GET /stages/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetStageDealsResponse200 getStageDeals(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get deals in a stage
  * Lists deals in a specific stage.
  * Note, this is equivalent to the other <code>getStageDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the stage (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>filterId - If supplied, only deals matching the given filter will be returned (optional)</li>
          *   <li>userId - If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)</li>
          *   <li>everyone - If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetStageDealsResponse200
      */
      @RequestLine("GET /stages/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetStageDealsResponse200> getStageDealsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getStageDeals</code> method in a fluent style.
   */
  public static class GetStageDealsQueryParams extends HashMap<String, Object> {
    public GetStageDealsQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetStageDealsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetStageDealsQueryParams everyone(final BigDecimal value) {
      put("everyone", EncodingUtils.encode(value));
      return this;
    }
    public GetStageDealsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetStageDealsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all stages
   * Returns data about all stages.
   * @param pipelineId The ID of the pipeline to fetch stages for. If omitted, stages for all pipelines will be fetched. (optional)
   * @return GetStagesResponse200
   */
  @RequestLine("GET /stages?pipeline_id={pipelineId}")
  @Headers({
    "Accept: application/json",
  })
  GetStagesResponse200 getStages(@Param("pipelineId") Integer pipelineId);

  /**
   * Get all stages
   * Similar to <code>getStages</code> but it also returns the http response headers .
   * Returns data about all stages.
   * @param pipelineId The ID of the pipeline to fetch stages for. If omitted, stages for all pipelines will be fetched. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /stages?pipeline_id={pipelineId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetStagesResponse200> getStagesWithHttpInfo(@Param("pipelineId") Integer pipelineId);


  /**
   * Get all stages
   * Returns data about all stages.
   * Note, this is equivalent to the other <code>getStages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStagesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>pipelineId - The ID of the pipeline to fetch stages for. If omitted, stages for all pipelines will be fetched. (optional)</li>
   *   </ul>
   * @return GetStagesResponse200
   */
  @RequestLine("GET /stages?pipeline_id={pipelineId}")
  @Headers({
  "Accept: application/json",
  })
  GetStagesResponse200 getStages(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all stages
  * Returns data about all stages.
  * Note, this is equivalent to the other <code>getStages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>pipelineId - The ID of the pipeline to fetch stages for. If omitted, stages for all pipelines will be fetched. (optional)</li>
      *   </ul>
          * @return GetStagesResponse200
      */
      @RequestLine("GET /stages?pipeline_id={pipelineId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetStagesResponse200> getStagesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getStages</code> method in a fluent style.
   */
  public static class GetStagesQueryParams extends HashMap<String, Object> {
    public GetStagesQueryParams pipelineId(final Integer value) {
      put("pipeline_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update stage details
   * Updates the properties of a stage.
   * @param id The ID of the stage (required)
   * @param updateStageRequest  (optional)
   * @return StageResponse200
   */
  @RequestLine("PUT /stages/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StageResponse200 updateStage(@Param("id") Integer id, UpdateStageRequest updateStageRequest);

  /**
   * Update stage details
   * Similar to <code>updateStage</code> but it also returns the http response headers .
   * Updates the properties of a stage.
   * @param id The ID of the stage (required)
   * @param updateStageRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /stages/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StageResponse200> updateStageWithHttpInfo(@Param("id") Integer id, UpdateStageRequest updateStageRequest);


}
