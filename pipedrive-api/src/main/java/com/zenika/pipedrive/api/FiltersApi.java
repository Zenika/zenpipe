package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddFilterRequest;
import com.zenika.pipedrive.model.DeleteFilterResponse200;
import com.zenika.pipedrive.model.DeleteFiltersResponse200;
import com.zenika.pipedrive.model.GetFilterResponse200;
import com.zenika.pipedrive.model.GetFiltersResponse200;
import com.zenika.pipedrive.model.PostFilterResponse200;
import com.zenika.pipedrive.model.UpdateFilterRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface FiltersApi extends ApiClient.Api {


  /**
   * Add a new filter
   * Adds a new filter, returns the ID upon success. Note that in the conditions JSON object only one first-level condition group is supported, and it must be glued with &#39;AND&#39;, and only two second level condition groups are supported of which one must be glued with &#39;AND&#39; and the second with &#39;OR&#39;. Other combinations do not work (yet) but the syntax supports introducing them in future. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-filter\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a filter&lt;/a&gt;.
   * @param addFilterRequest  (optional)
   * @return PostFilterResponse200
   */
  @RequestLine("POST /filters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostFilterResponse200 addFilter(AddFilterRequest addFilterRequest);

  /**
   * Add a new filter
   * Similar to <code>addFilter</code> but it also returns the http response headers .
   * Adds a new filter, returns the ID upon success. Note that in the conditions JSON object only one first-level condition group is supported, and it must be glued with &#39;AND&#39;, and only two second level condition groups are supported of which one must be glued with &#39;AND&#39; and the second with &#39;OR&#39;. Other combinations do not work (yet) but the syntax supports introducing them in future. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-filter\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a filter&lt;/a&gt;.
   * @param addFilterRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /filters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostFilterResponse200> addFilterWithHttpInfo(AddFilterRequest addFilterRequest);



  /**
   * Delete a filter
   * Marks a filter as deleted.
   * @param id The ID of the filter (required)
   * @return DeleteFilterResponse200
   */
  @RequestLine("DELETE /filters/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFilterResponse200 deleteFilter(@Param("id") Integer id);

  /**
   * Delete a filter
   * Similar to <code>deleteFilter</code> but it also returns the http response headers .
   * Marks a filter as deleted.
   * @param id The ID of the filter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /filters/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFilterResponse200> deleteFilterWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple filters in bulk
   * Marks multiple filters as deleted.
   * @param ids The comma-separated filter IDs to delete (required)
   * @return DeleteFiltersResponse200
   */
  @RequestLine("DELETE /filters?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFiltersResponse200 deleteFilters(@Param("ids") String ids);

  /**
   * Delete multiple filters in bulk
   * Similar to <code>deleteFilters</code> but it also returns the http response headers .
   * Marks multiple filters as deleted.
   * @param ids The comma-separated filter IDs to delete (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /filters?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFiltersResponse200> deleteFiltersWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple filters in bulk
   * Marks multiple filters as deleted.
   * Note, this is equivalent to the other <code>deleteFilters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteFiltersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated filter IDs to delete (required)</li>
   *   </ul>
   * @return DeleteFiltersResponse200
   */
  @RequestLine("DELETE /filters?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteFiltersResponse200 deleteFilters(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple filters in bulk
  * Marks multiple filters as deleted.
  * Note, this is equivalent to the other <code>deleteFilters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated filter IDs to delete (required)</li>
      *   </ul>
          * @return DeleteFiltersResponse200
      */
      @RequestLine("DELETE /filters?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteFiltersResponse200> deleteFiltersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteFilters</code> method in a fluent style.
   */
  public static class DeleteFiltersQueryParams extends HashMap<String, Object> {
    public DeleteFiltersQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get one filter
   * Returns data about a specific filter. Note that this also returns the condition lines of the filter.
   * @param id The ID of the filter (required)
   * @return GetFilterResponse200
   */
  @RequestLine("GET /filters/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetFilterResponse200 getFilter(@Param("id") Integer id);

  /**
   * Get one filter
   * Similar to <code>getFilter</code> but it also returns the http response headers .
   * Returns data about a specific filter. Note that this also returns the condition lines of the filter.
   * @param id The ID of the filter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /filters/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetFilterResponse200> getFilterWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all filter helpers
   * Returns all supported filter helpers. It helps to know what conditions and helpers are available when you want to &lt;a href&#x3D;\&quot;/docs/api/v1/Filters#addFilter\&quot;&gt;add&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v1/Filters#updateFilter\&quot;&gt;update&lt;/a&gt; filters. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-filter\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a filter&lt;/a&gt;.
   * @return Object
   */
  @RequestLine("GET /filters/helpers")
  @Headers({
    "Accept: application/json",
  })
  Object getFilterHelpers();

  /**
   * Get all filter helpers
   * Similar to <code>getFilterHelpers</code> but it also returns the http response headers .
   * Returns all supported filter helpers. It helps to know what conditions and helpers are available when you want to &lt;a href&#x3D;\&quot;/docs/api/v1/Filters#addFilter\&quot;&gt;add&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v1/Filters#updateFilter\&quot;&gt;update&lt;/a&gt; filters. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-filter\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a filter&lt;/a&gt;.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /filters/helpers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Object> getFilterHelpersWithHttpInfo();



  /**
   * Get all filters
   * Returns data about all filters.
   * @param type The types of filters to fetch (optional)
   * @return GetFiltersResponse200
   */
  @RequestLine("GET /filters?type={type}")
  @Headers({
    "Accept: application/json",
  })
  GetFiltersResponse200 getFilters(@Param("type") String type);

  /**
   * Get all filters
   * Similar to <code>getFilters</code> but it also returns the http response headers .
   * Returns data about all filters.
   * @param type The types of filters to fetch (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /filters?type={type}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetFiltersResponse200> getFiltersWithHttpInfo(@Param("type") String type);


  /**
   * Get all filters
   * Returns data about all filters.
   * Note, this is equivalent to the other <code>getFilters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetFiltersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>type - The types of filters to fetch (optional)</li>
   *   </ul>
   * @return GetFiltersResponse200
   */
  @RequestLine("GET /filters?type={type}")
  @Headers({
  "Accept: application/json",
  })
  GetFiltersResponse200 getFilters(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all filters
  * Returns data about all filters.
  * Note, this is equivalent to the other <code>getFilters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>type - The types of filters to fetch (optional)</li>
      *   </ul>
          * @return GetFiltersResponse200
      */
      @RequestLine("GET /filters?type={type}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetFiltersResponse200> getFiltersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getFilters</code> method in a fluent style.
   */
  public static class GetFiltersQueryParams extends HashMap<String, Object> {
    public GetFiltersQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update filter
   * Updates an existing filter.
   * @param id The ID of the filter (required)
   * @param updateFilterRequest  (optional)
   * @return PostFilterResponse200
   */
  @RequestLine("PUT /filters/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostFilterResponse200 updateFilter(@Param("id") Integer id, UpdateFilterRequest updateFilterRequest);

  /**
   * Update filter
   * Similar to <code>updateFilter</code> but it also returns the http response headers .
   * Updates an existing filter.
   * @param id The ID of the filter (required)
   * @param updateFilterRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /filters/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostFilterResponse200> updateFilterWithHttpInfo(@Param("id") Integer id, UpdateFilterRequest updateFilterRequest);


}
