package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddUserRequest;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.FailResponse;
import com.zenika.pipedrive.model.GetCurrentUserResponse200;
import com.zenika.pipedrive.model.GetRoleSettingsResponse200;
import com.zenika.pipedrive.model.GetUserPermissionsResponse200;
import com.zenika.pipedrive.model.GetUserRoleAssignmentsResponse200;
import com.zenika.pipedrive.model.UnathorizedResponse;
import com.zenika.pipedrive.model.UpdateUserRequest;
import com.zenika.pipedrive.model.UserIds;
import com.zenika.pipedrive.model.UserResponse200;
import com.zenika.pipedrive.model.UsersResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface UsersApi extends ApiClient.Api {


  /**
   * Add a new user
   * Adds a new user to the company, returns the ID upon success.
   * @param addUserRequest  (optional)
   * @return UserResponse200
   */
  @RequestLine("POST /users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserResponse200 addUser(AddUserRequest addUserRequest);

  /**
   * Add a new user
   * Similar to <code>addUser</code> but it also returns the http response headers .
   * Adds a new user to the company, returns the ID upon success.
   * @param addUserRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserResponse200> addUserWithHttpInfo(AddUserRequest addUserRequest);



  /**
   * Find users by name
   * Finds users by their name.
   * @param term The search term to look for (required)
   * @param searchByEmail When enabled, the term will only be matched against email addresses of users. Default: &#x60;false&#x60; (optional, default to 0)
   * @return UsersResponse200
   */
  @RequestLine("GET /users/find?term={term}&search_by_email={searchByEmail}")
  @Headers({
    "Accept: application/json",
  })
  UsersResponse200 findUsersByName(@Param("term") String term, @Param("searchByEmail") BigDecimal searchByEmail);

  /**
   * Find users by name
   * Similar to <code>findUsersByName</code> but it also returns the http response headers .
   * Finds users by their name.
   * @param term The search term to look for (required)
   * @param searchByEmail When enabled, the term will only be matched against email addresses of users. Default: &#x60;false&#x60; (optional, default to 0)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users/find?term={term}&search_by_email={searchByEmail}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UsersResponse200> findUsersByNameWithHttpInfo(@Param("term") String term, @Param("searchByEmail") BigDecimal searchByEmail);


  /**
   * Find users by name
   * Finds users by their name.
   * Note, this is equivalent to the other <code>findUsersByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindUsersByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for (required)</li>
   *   <li>searchByEmail - When enabled, the term will only be matched against email addresses of users. Default: &#x60;false&#x60; (optional, default to 0)</li>
   *   </ul>
   * @return UsersResponse200
   */
  @RequestLine("GET /users/find?term={term}&search_by_email={searchByEmail}")
  @Headers({
  "Accept: application/json",
  })
  UsersResponse200 findUsersByName(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Find users by name
  * Finds users by their name.
  * Note, this is equivalent to the other <code>findUsersByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for (required)</li>
          *   <li>searchByEmail - When enabled, the term will only be matched against email addresses of users. Default: &#x60;false&#x60; (optional, default to 0)</li>
      *   </ul>
          * @return UsersResponse200
      */
      @RequestLine("GET /users/find?term={term}&search_by_email={searchByEmail}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UsersResponse200> findUsersByNameWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findUsersByName</code> method in a fluent style.
   */
  public static class FindUsersByNameQueryParams extends HashMap<String, Object> {
    public FindUsersByNameQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public FindUsersByNameQueryParams searchByEmail(final BigDecimal value) {
      put("search_by_email", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get current user data
   * Returns data about an authorized user within the company with bound company data: company ID, company name, and domain. Note that the &#x60;locale&#x60; property means &#39;Date/number format&#39; in the Pipedrive account settings, not the chosen language.
   * @return GetCurrentUserResponse200
   */
  @RequestLine("GET /users/me")
  @Headers({
    "Accept: application/json",
  })
  GetCurrentUserResponse200 getCurrentUser();

  /**
   * Get current user data
   * Similar to <code>getCurrentUser</code> but it also returns the http response headers .
   * Returns data about an authorized user within the company with bound company data: company ID, company name, and domain. Note that the &#x60;locale&#x60; property means &#39;Date/number format&#39; in the Pipedrive account settings, not the chosen language.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users/me")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetCurrentUserResponse200> getCurrentUserWithHttpInfo();



  /**
   * Get one user
   * Returns data about a specific user within the company.
   * @param id The ID of the user (required)
   * @return UserResponse200
   */
  @RequestLine("GET /users/{id}")
  @Headers({
    "Accept: application/json",
  })
  UserResponse200 getUser(@Param("id") Integer id);

  /**
   * Get one user
   * Similar to <code>getUser</code> but it also returns the http response headers .
   * Returns data about a specific user within the company.
   * @param id The ID of the user (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserResponse200> getUserWithHttpInfo(@Param("id") Integer id);



  /**
   * List followers of a user
   * Lists the followers of a specific user.
   * @param id The ID of the user (required)
   * @return UserIds
   */
  @RequestLine("GET /users/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  UserIds getUserFollowers(@Param("id") Integer id);

  /**
   * List followers of a user
   * Similar to <code>getUserFollowers</code> but it also returns the http response headers .
   * Lists the followers of a specific user.
   * @param id The ID of the user (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserIds> getUserFollowersWithHttpInfo(@Param("id") Integer id);



  /**
   * List user permissions
   * Lists aggregated permissions over all assigned permission sets for a user.
   * @param id The ID of the user (required)
   * @return GetUserPermissionsResponse200
   */
  @RequestLine("GET /users/{id}/permissions")
  @Headers({
    "Accept: application/json",
  })
  GetUserPermissionsResponse200 getUserPermissions(@Param("id") Integer id);

  /**
   * List user permissions
   * Similar to <code>getUserPermissions</code> but it also returns the http response headers .
   * Lists aggregated permissions over all assigned permission sets for a user.
   * @param id The ID of the user (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users/{id}/permissions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetUserPermissionsResponse200> getUserPermissionsWithHttpInfo(@Param("id") Integer id);



  /**
   * List role assignments
   * Lists role assignments for a user.
   * @param id The ID of the user (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetUserRoleAssignmentsResponse200
   */
  @RequestLine("GET /users/{id}/roleAssignments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetUserRoleAssignmentsResponse200 getUserRoleAssignments(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List role assignments
   * Similar to <code>getUserRoleAssignments</code> but it also returns the http response headers .
   * Lists role assignments for a user.
   * @param id The ID of the user (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users/{id}/roleAssignments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetUserRoleAssignmentsResponse200> getUserRoleAssignmentsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List role assignments
   * Lists role assignments for a user.
   * Note, this is equivalent to the other <code>getUserRoleAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserRoleAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the user (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetUserRoleAssignmentsResponse200
   */
  @RequestLine("GET /users/{id}/roleAssignments?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetUserRoleAssignmentsResponse200 getUserRoleAssignments(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List role assignments
  * Lists role assignments for a user.
  * Note, this is equivalent to the other <code>getUserRoleAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the user (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetUserRoleAssignmentsResponse200
      */
      @RequestLine("GET /users/{id}/roleAssignments?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetUserRoleAssignmentsResponse200> getUserRoleAssignmentsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserRoleAssignments</code> method in a fluent style.
   */
  public static class GetUserRoleAssignmentsQueryParams extends HashMap<String, Object> {
    public GetUserRoleAssignmentsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetUserRoleAssignmentsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List user role settings
   * Lists the settings of user&#39;s assigned role.
   * @param id The ID of the user (required)
   * @return GetRoleSettingsResponse200
   */
  @RequestLine("GET /users/{id}/roleSettings")
  @Headers({
    "Accept: application/json",
  })
  GetRoleSettingsResponse200 getUserRoleSettings(@Param("id") Integer id);

  /**
   * List user role settings
   * Similar to <code>getUserRoleSettings</code> but it also returns the http response headers .
   * Lists the settings of user&#39;s assigned role.
   * @param id The ID of the user (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users/{id}/roleSettings")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetRoleSettingsResponse200> getUserRoleSettingsWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all users
   * Returns data about all users within the company.
   * @return UsersResponse200
   */
  @RequestLine("GET /users")
  @Headers({
    "Accept: application/json",
  })
  UsersResponse200 getUsers();

  /**
   * Get all users
   * Similar to <code>getUsers</code> but it also returns the http response headers .
   * Returns data about all users within the company.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /users")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UsersResponse200> getUsersWithHttpInfo();



  /**
   * Update user details
   * Updates the properties of a user. Currently, only &#x60;active_flag&#x60; can be updated.
   * @param id The ID of the user (required)
   * @param updateUserRequest  (optional)
   * @return UserResponse200
   */
  @RequestLine("PUT /users/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserResponse200 updateUser(@Param("id") Integer id, UpdateUserRequest updateUserRequest);

  /**
   * Update user details
   * Similar to <code>updateUser</code> but it also returns the http response headers .
   * Updates the properties of a user. Currently, only &#x60;active_flag&#x60; can be updated.
   * @param id The ID of the user (required)
   * @param updateUserRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /users/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserResponse200> updateUserWithHttpInfo(@Param("id") Integer id, UpdateUserRequest updateUserRequest);


}
