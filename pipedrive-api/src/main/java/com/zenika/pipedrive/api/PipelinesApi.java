package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddPipelineResponse200;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeletePipelineResponse200;
import com.zenika.pipedrive.model.GetPipelineConversionStatisticsResponse200;
import com.zenika.pipedrive.model.GetPipelineMovementStatisticsResponse200;
import com.zenika.pipedrive.model.GetPipelineResponse200;
import com.zenika.pipedrive.model.GetPipelinesResponse200;
import com.zenika.pipedrive.model.GetStageDealsResponse200;
import java.time.LocalDate;
import com.zenika.pipedrive.model.PipelineRequest;
import com.zenika.pipedrive.model.PipelineRequest1;
import com.zenika.pipedrive.model.UpdatePipelineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface PipelinesApi extends ApiClient.Api {


  /**
   * Add a new pipeline
   * Adds a new pipeline.
   * @param pipelineRequest  (optional)
   * @return AddPipelineResponse200
   */
  @RequestLine("POST /pipelines")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddPipelineResponse200 addPipeline(PipelineRequest pipelineRequest);

  /**
   * Add a new pipeline
   * Similar to <code>addPipeline</code> but it also returns the http response headers .
   * Adds a new pipeline.
   * @param pipelineRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /pipelines")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddPipelineResponse200> addPipelineWithHttpInfo(PipelineRequest pipelineRequest);



  /**
   * Delete a pipeline
   * Marks a pipeline as deleted.
   * @param id The ID of the pipeline (required)
   * @return DeletePipelineResponse200
   */
  @RequestLine("DELETE /pipelines/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeletePipelineResponse200 deletePipeline(@Param("id") Integer id);

  /**
   * Delete a pipeline
   * Similar to <code>deletePipeline</code> but it also returns the http response headers .
   * Marks a pipeline as deleted.
   * @param id The ID of the pipeline (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /pipelines/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeletePipelineResponse200> deletePipelineWithHttpInfo(@Param("id") Integer id);



  /**
   * Get one pipeline
   * Returns data about a specific pipeline. Also returns the summary of the deals in this pipeline across its stages.
   * @param id The ID of the pipeline (required)
   * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned in &#x60;deals_summary&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. (optional)
   * @return GetPipelineResponse200
   */
  @RequestLine("GET /pipelines/{id}?totals_convert_currency={totalsConvertCurrency}")
  @Headers({
    "Accept: application/json",
  })
  GetPipelineResponse200 getPipeline(@Param("id") Integer id, @Param("totalsConvertCurrency") String totalsConvertCurrency);

  /**
   * Get one pipeline
   * Similar to <code>getPipeline</code> but it also returns the http response headers .
   * Returns data about a specific pipeline. Also returns the summary of the deals in this pipeline across its stages.
   * @param id The ID of the pipeline (required)
   * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned in &#x60;deals_summary&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /pipelines/{id}?totals_convert_currency={totalsConvertCurrency}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPipelineResponse200> getPipelineWithHttpInfo(@Param("id") Integer id, @Param("totalsConvertCurrency") String totalsConvertCurrency);


  /**
   * Get one pipeline
   * Returns data about a specific pipeline. Also returns the summary of the deals in this pipeline across its stages.
   * Note, this is equivalent to the other <code>getPipeline</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>totalsConvertCurrency - The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned in &#x60;deals_summary&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. (optional)</li>
   *   </ul>
   * @return GetPipelineResponse200
   */
  @RequestLine("GET /pipelines/{id}?totals_convert_currency={totalsConvertCurrency}")
  @Headers({
  "Accept: application/json",
  })
  GetPipelineResponse200 getPipeline(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get one pipeline
  * Returns data about a specific pipeline. Also returns the summary of the deals in this pipeline across its stages.
  * Note, this is equivalent to the other <code>getPipeline</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>totalsConvertCurrency - The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned in &#x60;deals_summary&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. (optional)</li>
      *   </ul>
          * @return GetPipelineResponse200
      */
      @RequestLine("GET /pipelines/{id}?totals_convert_currency={totalsConvertCurrency}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetPipelineResponse200> getPipelineWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipeline</code> method in a fluent style.
   */
  public static class GetPipelineQueryParams extends HashMap<String, Object> {
    public GetPipelineQueryParams totalsConvertCurrency(final String value) {
      put("totals_convert_currency", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get deals conversion rates in pipeline
   * Returns all stage-to-stage conversion and pipeline-to-close rates for the given time period.
   * @param id The ID of the pipeline (required)
   * @param startDate The start of the period. Date in format of YYYY-MM-DD. (required)
   * @param endDate The end of the period. Date in format of YYYY-MM-DD. (required)
   * @param userId The ID of the user who&#39;s pipeline metrics statistics to fetch. If omitted, the authorized user will be used. (optional)
   * @return GetPipelineConversionStatisticsResponse200
   */
  @RequestLine("GET /pipelines/{id}/conversion_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
  @Headers({
    "Accept: application/json",
  })
  GetPipelineConversionStatisticsResponse200 getPipelineConversionStatistics(@Param("id") Integer id, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("userId") Integer userId);

  /**
   * Get deals conversion rates in pipeline
   * Similar to <code>getPipelineConversionStatistics</code> but it also returns the http response headers .
   * Returns all stage-to-stage conversion and pipeline-to-close rates for the given time period.
   * @param id The ID of the pipeline (required)
   * @param startDate The start of the period. Date in format of YYYY-MM-DD. (required)
   * @param endDate The end of the period. Date in format of YYYY-MM-DD. (required)
   * @param userId The ID of the user who&#39;s pipeline metrics statistics to fetch. If omitted, the authorized user will be used. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /pipelines/{id}/conversion_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPipelineConversionStatisticsResponse200> getPipelineConversionStatisticsWithHttpInfo(@Param("id") Integer id, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("userId") Integer userId);


  /**
   * Get deals conversion rates in pipeline
   * Returns all stage-to-stage conversion and pipeline-to-close rates for the given time period.
   * Note, this is equivalent to the other <code>getPipelineConversionStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineConversionStatisticsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startDate - The start of the period. Date in format of YYYY-MM-DD. (required)</li>
   *   <li>endDate - The end of the period. Date in format of YYYY-MM-DD. (required)</li>
   *   <li>userId - The ID of the user who&#39;s pipeline metrics statistics to fetch. If omitted, the authorized user will be used. (optional)</li>
   *   </ul>
   * @return GetPipelineConversionStatisticsResponse200
   */
  @RequestLine("GET /pipelines/{id}/conversion_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
  @Headers({
  "Accept: application/json",
  })
  GetPipelineConversionStatisticsResponse200 getPipelineConversionStatistics(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get deals conversion rates in pipeline
  * Returns all stage-to-stage conversion and pipeline-to-close rates for the given time period.
  * Note, this is equivalent to the other <code>getPipelineConversionStatistics</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startDate - The start of the period. Date in format of YYYY-MM-DD. (required)</li>
          *   <li>endDate - The end of the period. Date in format of YYYY-MM-DD. (required)</li>
          *   <li>userId - The ID of the user who&#39;s pipeline metrics statistics to fetch. If omitted, the authorized user will be used. (optional)</li>
      *   </ul>
          * @return GetPipelineConversionStatisticsResponse200
      */
      @RequestLine("GET /pipelines/{id}/conversion_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetPipelineConversionStatisticsResponse200> getPipelineConversionStatisticsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipelineConversionStatistics</code> method in a fluent style.
   */
  public static class GetPipelineConversionStatisticsQueryParams extends HashMap<String, Object> {
    public GetPipelineConversionStatisticsQueryParams startDate(final LocalDate value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineConversionStatisticsQueryParams endDate(final LocalDate value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineConversionStatisticsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get deals in a pipeline
   * Lists deals in a specific pipeline across all its stages.
   * @param id The ID of the pipeline (required)
   * @param filterId If supplied, only deals matching the given filter will be returned (optional)
   * @param userId If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)
   * @param everyone If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)
   * @param stageId If supplied, only deals within the given stage will be returned (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param getSummary Whether to include a summary of the pipeline in the &#x60;additional_data&#x60; or not (optional)
   * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned inside &#x60;deals_summary&#x60; inside &#x60;additional_data&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. Only works when &#x60;get_summary&#x60; parameter flag is enabled. (optional)
   * @return GetStageDealsResponse200
   */
  @RequestLine("GET /pipelines/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&stage_id={stageId}&start={start}&limit={limit}&get_summary={getSummary}&totals_convert_currency={totalsConvertCurrency}")
  @Headers({
    "Accept: application/json",
  })
  GetStageDealsResponse200 getPipelineDeals(@Param("id") Integer id, @Param("filterId") Integer filterId, @Param("userId") Integer userId, @Param("everyone") BigDecimal everyone, @Param("stageId") Integer stageId, @Param("start") Integer start, @Param("limit") Integer limit, @Param("getSummary") BigDecimal getSummary, @Param("totalsConvertCurrency") String totalsConvertCurrency);

  /**
   * Get deals in a pipeline
   * Similar to <code>getPipelineDeals</code> but it also returns the http response headers .
   * Lists deals in a specific pipeline across all its stages.
   * @param id The ID of the pipeline (required)
   * @param filterId If supplied, only deals matching the given filter will be returned (optional)
   * @param userId If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)
   * @param everyone If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)
   * @param stageId If supplied, only deals within the given stage will be returned (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param getSummary Whether to include a summary of the pipeline in the &#x60;additional_data&#x60; or not (optional)
   * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned inside &#x60;deals_summary&#x60; inside &#x60;additional_data&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. Only works when &#x60;get_summary&#x60; parameter flag is enabled. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /pipelines/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&stage_id={stageId}&start={start}&limit={limit}&get_summary={getSummary}&totals_convert_currency={totalsConvertCurrency}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetStageDealsResponse200> getPipelineDealsWithHttpInfo(@Param("id") Integer id, @Param("filterId") Integer filterId, @Param("userId") Integer userId, @Param("everyone") BigDecimal everyone, @Param("stageId") Integer stageId, @Param("start") Integer start, @Param("limit") Integer limit, @Param("getSummary") BigDecimal getSummary, @Param("totalsConvertCurrency") String totalsConvertCurrency);


  /**
   * Get deals in a pipeline
   * Lists deals in a specific pipeline across all its stages.
   * Note, this is equivalent to the other <code>getPipelineDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>filterId - If supplied, only deals matching the given filter will be returned (optional)</li>
   *   <li>userId - If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)</li>
   *   <li>everyone - If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)</li>
   *   <li>stageId - If supplied, only deals within the given stage will be returned (optional)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>getSummary - Whether to include a summary of the pipeline in the &#x60;additional_data&#x60; or not (optional)</li>
   *   <li>totalsConvertCurrency - The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned inside &#x60;deals_summary&#x60; inside &#x60;additional_data&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. Only works when &#x60;get_summary&#x60; parameter flag is enabled. (optional)</li>
   *   </ul>
   * @return GetStageDealsResponse200
   */
  @RequestLine("GET /pipelines/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&stage_id={stageId}&start={start}&limit={limit}&get_summary={getSummary}&totals_convert_currency={totalsConvertCurrency}")
  @Headers({
  "Accept: application/json",
  })
  GetStageDealsResponse200 getPipelineDeals(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get deals in a pipeline
  * Lists deals in a specific pipeline across all its stages.
  * Note, this is equivalent to the other <code>getPipelineDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>filterId - If supplied, only deals matching the given filter will be returned (optional)</li>
          *   <li>userId - If supplied, &#x60;filter_id&#x60; will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned. (optional)</li>
          *   <li>everyone - If supplied, &#x60;filter_id&#x60; and &#x60;user_id&#x60; will not be considered – instead, deals owned by everyone will be returned (optional)</li>
          *   <li>stageId - If supplied, only deals within the given stage will be returned (optional)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>getSummary - Whether to include a summary of the pipeline in the &#x60;additional_data&#x60; or not (optional)</li>
          *   <li>totalsConvertCurrency - The 3-letter currency code of any of the supported currencies. When supplied, &#x60;per_stages_converted&#x60; is returned inside &#x60;deals_summary&#x60; inside &#x60;additional_data&#x60; which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to &#x60;default_currency&#x60; in which case users default currency is used. Only works when &#x60;get_summary&#x60; parameter flag is enabled. (optional)</li>
      *   </ul>
          * @return GetStageDealsResponse200
      */
      @RequestLine("GET /pipelines/{id}/deals?filter_id={filterId}&user_id={userId}&everyone={everyone}&stage_id={stageId}&start={start}&limit={limit}&get_summary={getSummary}&totals_convert_currency={totalsConvertCurrency}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetStageDealsResponse200> getPipelineDealsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipelineDeals</code> method in a fluent style.
   */
  public static class GetPipelineDealsQueryParams extends HashMap<String, Object> {
    public GetPipelineDealsQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineDealsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineDealsQueryParams everyone(final BigDecimal value) {
      put("everyone", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineDealsQueryParams stageId(final Integer value) {
      put("stage_id", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineDealsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineDealsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineDealsQueryParams getSummary(final BigDecimal value) {
      put("get_summary", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineDealsQueryParams totalsConvertCurrency(final String value) {
      put("totals_convert_currency", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get deals movements in pipeline
   * Returns statistics for deals movements for the given time period.
   * @param id The ID of the pipeline (required)
   * @param startDate The start of the period. Date in format of YYYY-MM-DD. (required)
   * @param endDate The end of the period. Date in format of YYYY-MM-DD. (required)
   * @param userId The ID of the user who&#39;s pipeline statistics to fetch. If omitted, the authorized user will be used. (optional)
   * @return GetPipelineMovementStatisticsResponse200
   */
  @RequestLine("GET /pipelines/{id}/movement_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
  @Headers({
    "Accept: application/json",
  })
  GetPipelineMovementStatisticsResponse200 getPipelineMovementStatistics(@Param("id") Integer id, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("userId") Integer userId);

  /**
   * Get deals movements in pipeline
   * Similar to <code>getPipelineMovementStatistics</code> but it also returns the http response headers .
   * Returns statistics for deals movements for the given time period.
   * @param id The ID of the pipeline (required)
   * @param startDate The start of the period. Date in format of YYYY-MM-DD. (required)
   * @param endDate The end of the period. Date in format of YYYY-MM-DD. (required)
   * @param userId The ID of the user who&#39;s pipeline statistics to fetch. If omitted, the authorized user will be used. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /pipelines/{id}/movement_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPipelineMovementStatisticsResponse200> getPipelineMovementStatisticsWithHttpInfo(@Param("id") Integer id, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("userId") Integer userId);


  /**
   * Get deals movements in pipeline
   * Returns statistics for deals movements for the given time period.
   * Note, this is equivalent to the other <code>getPipelineMovementStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineMovementStatisticsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startDate - The start of the period. Date in format of YYYY-MM-DD. (required)</li>
   *   <li>endDate - The end of the period. Date in format of YYYY-MM-DD. (required)</li>
   *   <li>userId - The ID of the user who&#39;s pipeline statistics to fetch. If omitted, the authorized user will be used. (optional)</li>
   *   </ul>
   * @return GetPipelineMovementStatisticsResponse200
   */
  @RequestLine("GET /pipelines/{id}/movement_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
  @Headers({
  "Accept: application/json",
  })
  GetPipelineMovementStatisticsResponse200 getPipelineMovementStatistics(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get deals movements in pipeline
  * Returns statistics for deals movements for the given time period.
  * Note, this is equivalent to the other <code>getPipelineMovementStatistics</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startDate - The start of the period. Date in format of YYYY-MM-DD. (required)</li>
          *   <li>endDate - The end of the period. Date in format of YYYY-MM-DD. (required)</li>
          *   <li>userId - The ID of the user who&#39;s pipeline statistics to fetch. If omitted, the authorized user will be used. (optional)</li>
      *   </ul>
          * @return GetPipelineMovementStatisticsResponse200
      */
      @RequestLine("GET /pipelines/{id}/movement_statistics?start_date={startDate}&end_date={endDate}&user_id={userId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetPipelineMovementStatisticsResponse200> getPipelineMovementStatisticsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipelineMovementStatistics</code> method in a fluent style.
   */
  public static class GetPipelineMovementStatisticsQueryParams extends HashMap<String, Object> {
    public GetPipelineMovementStatisticsQueryParams startDate(final LocalDate value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineMovementStatisticsQueryParams endDate(final LocalDate value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineMovementStatisticsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all pipelines
   * Returns data about all pipelines.
   * @return GetPipelinesResponse200
   */
  @RequestLine("GET /pipelines")
  @Headers({
    "Accept: application/json",
  })
  GetPipelinesResponse200 getPipelines();

  /**
   * Get all pipelines
   * Similar to <code>getPipelines</code> but it also returns the http response headers .
   * Returns data about all pipelines.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /pipelines")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPipelinesResponse200> getPipelinesWithHttpInfo();



  /**
   * Update a pipeline
   * Updates the properties of a pipeline.
   * @param id The ID of the pipeline (required)
   * @param pipelineRequest1  (optional)
   * @return UpdatePipelineResponse200
   */
  @RequestLine("PUT /pipelines/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePipelineResponse200 updatePipeline(@Param("id") Integer id, PipelineRequest1 pipelineRequest1);

  /**
   * Update a pipeline
   * Similar to <code>updatePipeline</code> but it also returns the http response headers .
   * Updates the properties of a pipeline.
   * @param id The ID of the pipeline (required)
   * @param pipelineRequest1  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /pipelines/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePipelineResponse200> updatePipelineWithHttpInfo(@Param("id") Integer id, PipelineRequest1 pipelineRequest1);


}
