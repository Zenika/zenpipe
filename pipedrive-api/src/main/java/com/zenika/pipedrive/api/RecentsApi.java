package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.GetRecentsResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface RecentsApi extends ApiClient.Api {


  /**
   * Get recents
   * Returns data about all recent changes occurred after the given timestamp.
   * @param sinceTimestamp The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS (required)
   * @param items Multiple selection of item types to include in the query (optional) (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetRecentsResponse200
   */
  @RequestLine("GET /recents?since_timestamp={sinceTimestamp}&items={items}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetRecentsResponse200 getRecents(@Param("sinceTimestamp") String sinceTimestamp, @Param("items") String items, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get recents
   * Similar to <code>getRecents</code> but it also returns the http response headers .
   * Returns data about all recent changes occurred after the given timestamp.
   * @param sinceTimestamp The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS (required)
   * @param items Multiple selection of item types to include in the query (optional) (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /recents?since_timestamp={sinceTimestamp}&items={items}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetRecentsResponse200> getRecentsWithHttpInfo(@Param("sinceTimestamp") String sinceTimestamp, @Param("items") String items, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get recents
   * Returns data about all recent changes occurred after the given timestamp.
   * Note, this is equivalent to the other <code>getRecents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRecentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sinceTimestamp - The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS (required)</li>
   *   <li>items - Multiple selection of item types to include in the query (optional) (optional)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetRecentsResponse200
   */
  @RequestLine("GET /recents?since_timestamp={sinceTimestamp}&items={items}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetRecentsResponse200 getRecents(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get recents
  * Returns data about all recent changes occurred after the given timestamp.
  * Note, this is equivalent to the other <code>getRecents</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sinceTimestamp - The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS (required)</li>
          *   <li>items - Multiple selection of item types to include in the query (optional) (optional)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetRecentsResponse200
      */
      @RequestLine("GET /recents?since_timestamp={sinceTimestamp}&items={items}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetRecentsResponse200> getRecentsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getRecents</code> method in a fluent style.
   */
  public static class GetRecentsQueryParams extends HashMap<String, Object> {
    public GetRecentsQueryParams sinceTimestamp(final String value) {
      put("since_timestamp", EncodingUtils.encode(value));
      return this;
    }
    public GetRecentsQueryParams items(final String value) {
      put("items", EncodingUtils.encode(value));
      return this;
    }
    public GetRecentsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetRecentsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}
