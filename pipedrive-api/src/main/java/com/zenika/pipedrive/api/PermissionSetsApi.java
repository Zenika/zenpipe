package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.GetPermissionSetsResponse200;
import com.zenika.pipedrive.model.SinglePermissionSetResponse200;
import com.zenika.pipedrive.model.UserAssignmentsToPermissionSetResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface PermissionSetsApi extends ApiClient.Api {


  /**
   * Get one permission set
   * Returns data about a specific permission set.
   * @param id The ID of the permission set (required)
   * @return SinglePermissionSetResponse200
   */
  @RequestLine("GET /permissionSets/{id}")
  @Headers({
    "Accept: application/json",
  })
  SinglePermissionSetResponse200 getPermissionSet(@Param("id") String id);

  /**
   * Get one permission set
   * Similar to <code>getPermissionSet</code> but it also returns the http response headers .
   * Returns data about a specific permission set.
   * @param id The ID of the permission set (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /permissionSets/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SinglePermissionSetResponse200> getPermissionSetWithHttpInfo(@Param("id") String id);



  /**
   * List permission set assignments
   * Returns the list of assignments for a permission set.
   * @param id The ID of the permission set (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return UserAssignmentsToPermissionSetResponse200
   */
  @RequestLine("GET /permissionSets/{id}/assignments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  UserAssignmentsToPermissionSetResponse200 getPermissionSetAssignments(@Param("id") String id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List permission set assignments
   * Similar to <code>getPermissionSetAssignments</code> but it also returns the http response headers .
   * Returns the list of assignments for a permission set.
   * @param id The ID of the permission set (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /permissionSets/{id}/assignments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserAssignmentsToPermissionSetResponse200> getPermissionSetAssignmentsWithHttpInfo(@Param("id") String id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List permission set assignments
   * Returns the list of assignments for a permission set.
   * Note, this is equivalent to the other <code>getPermissionSetAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPermissionSetAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the permission set (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return UserAssignmentsToPermissionSetResponse200
   */
  @RequestLine("GET /permissionSets/{id}/assignments?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  UserAssignmentsToPermissionSetResponse200 getPermissionSetAssignments(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List permission set assignments
  * Returns the list of assignments for a permission set.
  * Note, this is equivalent to the other <code>getPermissionSetAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the permission set (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return UserAssignmentsToPermissionSetResponse200
      */
      @RequestLine("GET /permissionSets/{id}/assignments?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserAssignmentsToPermissionSetResponse200> getPermissionSetAssignmentsWithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPermissionSetAssignments</code> method in a fluent style.
   */
  public static class GetPermissionSetAssignmentsQueryParams extends HashMap<String, Object> {
    public GetPermissionSetAssignmentsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPermissionSetAssignmentsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all permission sets
   * Returns data about all permission sets.
   * @param app The app to filter the permission sets by (optional)
   * @return GetPermissionSetsResponse200
   */
  @RequestLine("GET /permissionSets?app={app}")
  @Headers({
    "Accept: application/json",
  })
  GetPermissionSetsResponse200 getPermissionSets(@Param("app") String app);

  /**
   * Get all permission sets
   * Similar to <code>getPermissionSets</code> but it also returns the http response headers .
   * Returns data about all permission sets.
   * @param app The app to filter the permission sets by (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /permissionSets?app={app}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPermissionSetsResponse200> getPermissionSetsWithHttpInfo(@Param("app") String app);


  /**
   * Get all permission sets
   * Returns data about all permission sets.
   * Note, this is equivalent to the other <code>getPermissionSets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPermissionSetsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>app - The app to filter the permission sets by (optional)</li>
   *   </ul>
   * @return GetPermissionSetsResponse200
   */
  @RequestLine("GET /permissionSets?app={app}")
  @Headers({
  "Accept: application/json",
  })
  GetPermissionSetsResponse200 getPermissionSets(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all permission sets
  * Returns data about all permission sets.
  * Note, this is equivalent to the other <code>getPermissionSets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>app - The app to filter the permission sets by (optional)</li>
      *   </ul>
          * @return GetPermissionSetsResponse200
      */
      @RequestLine("GET /permissionSets?app={app}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetPermissionSetsResponse200> getPermissionSetsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPermissionSets</code> method in a fluent style.
   */
  public static class GetPermissionSetsQueryParams extends HashMap<String, Object> {
    public GetPermissionSetsQueryParams app(final String value) {
      put("app", EncodingUtils.encode(value));
      return this;
    }
  }
}
