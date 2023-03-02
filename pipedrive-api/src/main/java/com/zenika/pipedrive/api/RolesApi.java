package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddOrUpdateRoleSettingRequest;
import com.zenika.pipedrive.model.AddOrUpdateRoleSettingResponse200;
import com.zenika.pipedrive.model.AddRoleAssignmentRequest;
import com.zenika.pipedrive.model.AddRoleAssignmentResponse200;
import com.zenika.pipedrive.model.AddRoleRequest;
import com.zenika.pipedrive.model.AddRoleResponse200;
import com.zenika.pipedrive.model.BaseRoleRequest;
import com.zenika.pipedrive.model.DeleteRoleAssignmentRequest;
import com.zenika.pipedrive.model.DeleteRoleAssignmentResponse200;
import com.zenika.pipedrive.model.DeleteRoleResponse200;
import com.zenika.pipedrive.model.GetRoleResponse200;
import com.zenika.pipedrive.model.GetRoleSettingsResponse200;
import com.zenika.pipedrive.model.GetRolesResponse200;
import com.zenika.pipedrive.model.GetUserRoleAssignmentsResponse200;
import com.zenika.pipedrive.model.UpdateRoleResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface RolesApi extends ApiClient.Api {


  /**
   * Add or update role setting
   * Adds or updates the visibility setting for a role.
   * @param id The ID of the role (required)
   * @param addOrUpdateRoleSettingRequest  (optional)
   * @return AddOrUpdateRoleSettingResponse200
   */
  @RequestLine("POST /roles/{id}/settings")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrUpdateRoleSettingResponse200 addOrUpdateRoleSetting(@Param("id") Integer id, AddOrUpdateRoleSettingRequest addOrUpdateRoleSettingRequest);

  /**
   * Add or update role setting
   * Similar to <code>addOrUpdateRoleSetting</code> but it also returns the http response headers .
   * Adds or updates the visibility setting for a role.
   * @param id The ID of the role (required)
   * @param addOrUpdateRoleSettingRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /roles/{id}/settings")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrUpdateRoleSettingResponse200> addOrUpdateRoleSettingWithHttpInfo(@Param("id") Integer id, AddOrUpdateRoleSettingRequest addOrUpdateRoleSettingRequest);



  /**
   * Add a role
   * Adds a new role.
   * @param addRoleRequest  (optional)
   * @return AddRoleResponse200
   */
  @RequestLine("POST /roles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddRoleResponse200 addRole(AddRoleRequest addRoleRequest);

  /**
   * Add a role
   * Similar to <code>addRole</code> but it also returns the http response headers .
   * Adds a new role.
   * @param addRoleRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /roles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddRoleResponse200> addRoleWithHttpInfo(AddRoleRequest addRoleRequest);



  /**
   * Add role assignment
   * Assigns a user to a role.
   * @param id The ID of the role (required)
   * @param addRoleAssignmentRequest  (optional)
   * @return AddRoleAssignmentResponse200
   */
  @RequestLine("POST /roles/{id}/assignments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddRoleAssignmentResponse200 addRoleAssignment(@Param("id") Integer id, AddRoleAssignmentRequest addRoleAssignmentRequest);

  /**
   * Add role assignment
   * Similar to <code>addRoleAssignment</code> but it also returns the http response headers .
   * Assigns a user to a role.
   * @param id The ID of the role (required)
   * @param addRoleAssignmentRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /roles/{id}/assignments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddRoleAssignmentResponse200> addRoleAssignmentWithHttpInfo(@Param("id") Integer id, AddRoleAssignmentRequest addRoleAssignmentRequest);



  /**
   * Delete a role
   * Marks a role as deleted.
   * @param id The ID of the role (required)
   * @return DeleteRoleResponse200
   */
  @RequestLine("DELETE /roles/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteRoleResponse200 deleteRole(@Param("id") Integer id);

  /**
   * Delete a role
   * Similar to <code>deleteRole</code> but it also returns the http response headers .
   * Marks a role as deleted.
   * @param id The ID of the role (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /roles/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteRoleResponse200> deleteRoleWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete a role assignment
   * Removes the assigned user from a role and adds to the default role.
   * @param id The ID of the role (required)
   * @param deleteRoleAssignmentRequest  (optional)
   * @return DeleteRoleAssignmentResponse200
   */
  @RequestLine("DELETE /roles/{id}/assignments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteRoleAssignmentResponse200 deleteRoleAssignment(@Param("id") Integer id, DeleteRoleAssignmentRequest deleteRoleAssignmentRequest);

  /**
   * Delete a role assignment
   * Similar to <code>deleteRoleAssignment</code> but it also returns the http response headers .
   * Removes the assigned user from a role and adds to the default role.
   * @param id The ID of the role (required)
   * @param deleteRoleAssignmentRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /roles/{id}/assignments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteRoleAssignmentResponse200> deleteRoleAssignmentWithHttpInfo(@Param("id") Integer id, DeleteRoleAssignmentRequest deleteRoleAssignmentRequest);



  /**
   * Get one role
   * Returns the details of a specific role.
   * @param id The ID of the role (required)
   * @return GetRoleResponse200
   */
  @RequestLine("GET /roles/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetRoleResponse200 getRole(@Param("id") Integer id);

  /**
   * Get one role
   * Similar to <code>getRole</code> but it also returns the http response headers .
   * Returns the details of a specific role.
   * @param id The ID of the role (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /roles/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetRoleResponse200> getRoleWithHttpInfo(@Param("id") Integer id);



  /**
   * List role assignments
   * Returns all users assigned to a role.
   * @param id The ID of the role (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetUserRoleAssignmentsResponse200
   */
  @RequestLine("GET /roles/{id}/assignments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetUserRoleAssignmentsResponse200 getRoleAssignments(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List role assignments
   * Similar to <code>getRoleAssignments</code> but it also returns the http response headers .
   * Returns all users assigned to a role.
   * @param id The ID of the role (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /roles/{id}/assignments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetUserRoleAssignmentsResponse200> getRoleAssignmentsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List role assignments
   * Returns all users assigned to a role.
   * Note, this is equivalent to the other <code>getRoleAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRoleAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the role (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetUserRoleAssignmentsResponse200
   */
  @RequestLine("GET /roles/{id}/assignments?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetUserRoleAssignmentsResponse200 getRoleAssignments(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List role assignments
  * Returns all users assigned to a role.
  * Note, this is equivalent to the other <code>getRoleAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the role (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetUserRoleAssignmentsResponse200
      */
      @RequestLine("GET /roles/{id}/assignments?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetUserRoleAssignmentsResponse200> getRoleAssignmentsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getRoleAssignments</code> method in a fluent style.
   */
  public static class GetRoleAssignmentsQueryParams extends HashMap<String, Object> {
    public GetRoleAssignmentsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetRoleAssignmentsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List role settings
   * Returns the visibility settings of a specific role.
   * @param id The ID of the role (required)
   * @return GetRoleSettingsResponse200
   */
  @RequestLine("GET /roles/{id}/settings")
  @Headers({
    "Accept: application/json",
  })
  GetRoleSettingsResponse200 getRoleSettings(@Param("id") Integer id);

  /**
   * List role settings
   * Similar to <code>getRoleSettings</code> but it also returns the http response headers .
   * Returns the visibility settings of a specific role.
   * @param id The ID of the role (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /roles/{id}/settings")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetRoleSettingsResponse200> getRoleSettingsWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all roles
   * Returns all the roles within the company.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetRolesResponse200
   */
  @RequestLine("GET /roles?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetRolesResponse200 getRoles(@Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all roles
   * Similar to <code>getRoles</code> but it also returns the http response headers .
   * Returns all the roles within the company.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /roles?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetRolesResponse200> getRolesWithHttpInfo(@Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all roles
   * Returns all the roles within the company.
   * Note, this is equivalent to the other <code>getRoles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRolesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetRolesResponse200
   */
  @RequestLine("GET /roles?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetRolesResponse200 getRoles(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all roles
  * Returns all the roles within the company.
  * Note, this is equivalent to the other <code>getRoles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetRolesResponse200
      */
      @RequestLine("GET /roles?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetRolesResponse200> getRolesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getRoles</code> method in a fluent style.
   */
  public static class GetRolesQueryParams extends HashMap<String, Object> {
    public GetRolesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetRolesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update role details
   * Updates the parent role and/or the name of a specific role.
   * @param id The ID of the role (required)
   * @param baseRoleRequest  (optional)
   * @return UpdateRoleResponse200
   */
  @RequestLine("PUT /roles/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateRoleResponse200 updateRole(@Param("id") Integer id, BaseRoleRequest baseRoleRequest);

  /**
   * Update role details
   * Similar to <code>updateRole</code> but it also returns the http response headers .
   * Updates the parent role and/or the name of a specific role.
   * @param id The ID of the role (required)
   * @param baseRoleRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /roles/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateRoleResponse200> updateRoleWithHttpInfo(@Param("id") Integer id, BaseRoleRequest baseRoleRequest);


}
