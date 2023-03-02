package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddTeamRequest1;
import com.zenika.pipedrive.model.AddTeamUserRequest;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeleteTeamUserRequest;
import com.zenika.pipedrive.model.FailResponse;
import com.zenika.pipedrive.model.TeamResponse200;
import com.zenika.pipedrive.model.TeamsResponse200;
import com.zenika.pipedrive.model.UpdateTeamRequest;
import com.zenika.pipedrive.model.UserIds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface LegacyTeamsApi extends ApiClient.Api {


  /**
   * Add a new team
   * Adds a new team to the company and returns the created object.
   * @param addTeamRequest1  (optional)
   * @return TeamResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("POST /legacyTeams")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TeamResponse200 addTeam(AddTeamRequest1 addTeamRequest1);

  /**
   * Add a new team
   * Similar to <code>addTeam</code> but it also returns the http response headers .
   * Adds a new team to the company and returns the created object.
   * @param addTeamRequest1  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("POST /legacyTeams")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TeamResponse200> addTeamWithHttpInfo(AddTeamRequest1 addTeamRequest1);



  /**
   * Add users to a team
   * Adds users to an existing team.
   * @param id The ID of the team (required)
   * @param addTeamUserRequest  (optional)
   * @return UserIds
   * @deprecated
   */
  @Deprecated
  @RequestLine("POST /legacyTeams/{id}/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserIds addTeamUser(@Param("id") Integer id, AddTeamUserRequest addTeamUserRequest);

  /**
   * Add users to a team
   * Similar to <code>addTeamUser</code> but it also returns the http response headers .
   * Adds users to an existing team.
   * @param id The ID of the team (required)
   * @param addTeamUserRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("POST /legacyTeams/{id}/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserIds> addTeamUserWithHttpInfo(@Param("id") Integer id, AddTeamUserRequest addTeamUserRequest);



  /**
   * Delete users from a team
   * Deletes users from an existing team.
   * @param id The ID of the team (required)
   * @param deleteTeamUserRequest  (optional)
   * @return UserIds
   * @deprecated
   */
  @Deprecated
  @RequestLine("DELETE /legacyTeams/{id}/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserIds deleteTeamUser(@Param("id") Integer id, DeleteTeamUserRequest deleteTeamUserRequest);

  /**
   * Delete users from a team
   * Similar to <code>deleteTeamUser</code> but it also returns the http response headers .
   * Deletes users from an existing team.
   * @param id The ID of the team (required)
   * @param deleteTeamUserRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("DELETE /legacyTeams/{id}/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserIds> deleteTeamUserWithHttpInfo(@Param("id") Integer id, DeleteTeamUserRequest deleteTeamUserRequest);



  /**
   * Get a single team
   * Returns data about a specific team.
   * @param id The ID of the team (required)
   * @param skipUsers When enabled, the teams will not include IDs of member users (optional, default to 0)
   * @return TeamResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/{id}?skip_users={skipUsers}")
  @Headers({
    "Accept: application/json",
  })
  TeamResponse200 getTeam(@Param("id") Integer id, @Param("skipUsers") BigDecimal skipUsers);

  /**
   * Get a single team
   * Similar to <code>getTeam</code> but it also returns the http response headers .
   * Returns data about a specific team.
   * @param id The ID of the team (required)
   * @param skipUsers When enabled, the teams will not include IDs of member users (optional, default to 0)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/{id}?skip_users={skipUsers}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TeamResponse200> getTeamWithHttpInfo(@Param("id") Integer id, @Param("skipUsers") BigDecimal skipUsers);


  /**
   * Get a single team
   * Returns data about a specific team.
   * Note, this is equivalent to the other <code>getTeam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTeamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the team (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>skipUsers - When enabled, the teams will not include IDs of member users (optional, default to 0)</li>
   *   </ul>
   * @return TeamResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/{id}?skip_users={skipUsers}")
  @Headers({
  "Accept: application/json",
  })
  TeamResponse200 getTeam(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a single team
  * Returns data about a specific team.
  * Note, this is equivalent to the other <code>getTeam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the team (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>skipUsers - When enabled, the teams will not include IDs of member users (optional, default to 0)</li>
      *   </ul>
          * @return TeamResponse200
          * @deprecated
      */
          @Deprecated
      @RequestLine("GET /legacyTeams/{id}?skip_users={skipUsers}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TeamResponse200> getTeamWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTeam</code> method in a fluent style.
   */
  public static class GetTeamQueryParams extends HashMap<String, Object> {
    public GetTeamQueryParams skipUsers(final BigDecimal value) {
      put("skip_users", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all users in a team
   * Returns a list of all user IDs within a team.
   * @param id The ID of the team (required)
   * @return UserIds
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/{id}/users")
  @Headers({
    "Accept: application/json",
  })
  UserIds getTeamUsers(@Param("id") Integer id);

  /**
   * Get all users in a team
   * Similar to <code>getTeamUsers</code> but it also returns the http response headers .
   * Returns a list of all user IDs within a team.
   * @param id The ID of the team (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/{id}/users")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserIds> getTeamUsersWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all teams
   * Returns data about teams within the company.
   * @param orderBy The field name to sort returned teams by (optional, default to id)
   * @param skipUsers When enabled, the teams will not include IDs of member users (optional, default to 0)
   * @return TeamsResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams?order_by={orderBy}&skip_users={skipUsers}")
  @Headers({
    "Accept: application/json",
  })
  TeamsResponse200 getTeams(@Param("orderBy") String orderBy, @Param("skipUsers") BigDecimal skipUsers);

  /**
   * Get all teams
   * Similar to <code>getTeams</code> but it also returns the http response headers .
   * Returns data about teams within the company.
   * @param orderBy The field name to sort returned teams by (optional, default to id)
   * @param skipUsers When enabled, the teams will not include IDs of member users (optional, default to 0)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams?order_by={orderBy}&skip_users={skipUsers}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TeamsResponse200> getTeamsWithHttpInfo(@Param("orderBy") String orderBy, @Param("skipUsers") BigDecimal skipUsers);


  /**
   * Get all teams
   * Returns data about teams within the company.
   * Note, this is equivalent to the other <code>getTeams</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTeamsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>orderBy - The field name to sort returned teams by (optional, default to id)</li>
   *   <li>skipUsers - When enabled, the teams will not include IDs of member users (optional, default to 0)</li>
   *   </ul>
   * @return TeamsResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams?order_by={orderBy}&skip_users={skipUsers}")
  @Headers({
  "Accept: application/json",
  })
  TeamsResponse200 getTeams(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all teams
  * Returns data about teams within the company.
  * Note, this is equivalent to the other <code>getTeams</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>orderBy - The field name to sort returned teams by (optional, default to id)</li>
          *   <li>skipUsers - When enabled, the teams will not include IDs of member users (optional, default to 0)</li>
      *   </ul>
          * @return TeamsResponse200
          * @deprecated
      */
          @Deprecated
      @RequestLine("GET /legacyTeams?order_by={orderBy}&skip_users={skipUsers}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TeamsResponse200> getTeamsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTeams</code> method in a fluent style.
   */
  public static class GetTeamsQueryParams extends HashMap<String, Object> {
    public GetTeamsQueryParams orderBy(final String value) {
      put("order_by", EncodingUtils.encode(value));
      return this;
    }
    public GetTeamsQueryParams skipUsers(final BigDecimal value) {
      put("skip_users", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all teams of a user
   * Returns data about all teams which have the specified user as a member.
   * @param id The ID of the user (required)
   * @param orderBy The field name to sort returned teams by (optional, default to id)
   * @param skipUsers When enabled, the teams will not include IDs of member users (optional, default to 0)
   * @return TeamsResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/user/{id}?order_by={orderBy}&skip_users={skipUsers}")
  @Headers({
    "Accept: application/json",
  })
  TeamsResponse200 getUserTeams(@Param("id") Integer id, @Param("orderBy") String orderBy, @Param("skipUsers") BigDecimal skipUsers);

  /**
   * Get all teams of a user
   * Similar to <code>getUserTeams</code> but it also returns the http response headers .
   * Returns data about all teams which have the specified user as a member.
   * @param id The ID of the user (required)
   * @param orderBy The field name to sort returned teams by (optional, default to id)
   * @param skipUsers When enabled, the teams will not include IDs of member users (optional, default to 0)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/user/{id}?order_by={orderBy}&skip_users={skipUsers}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TeamsResponse200> getUserTeamsWithHttpInfo(@Param("id") Integer id, @Param("orderBy") String orderBy, @Param("skipUsers") BigDecimal skipUsers);


  /**
   * Get all teams of a user
   * Returns data about all teams which have the specified user as a member.
   * Note, this is equivalent to the other <code>getUserTeams</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserTeamsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the user (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>orderBy - The field name to sort returned teams by (optional, default to id)</li>
   *   <li>skipUsers - When enabled, the teams will not include IDs of member users (optional, default to 0)</li>
   *   </ul>
   * @return TeamsResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("GET /legacyTeams/user/{id}?order_by={orderBy}&skip_users={skipUsers}")
  @Headers({
  "Accept: application/json",
  })
  TeamsResponse200 getUserTeams(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all teams of a user
  * Returns data about all teams which have the specified user as a member.
  * Note, this is equivalent to the other <code>getUserTeams</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the user (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>orderBy - The field name to sort returned teams by (optional, default to id)</li>
          *   <li>skipUsers - When enabled, the teams will not include IDs of member users (optional, default to 0)</li>
      *   </ul>
          * @return TeamsResponse200
          * @deprecated
      */
          @Deprecated
      @RequestLine("GET /legacyTeams/user/{id}?order_by={orderBy}&skip_users={skipUsers}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TeamsResponse200> getUserTeamsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserTeams</code> method in a fluent style.
   */
  public static class GetUserTeamsQueryParams extends HashMap<String, Object> {
    public GetUserTeamsQueryParams orderBy(final String value) {
      put("order_by", EncodingUtils.encode(value));
      return this;
    }
    public GetUserTeamsQueryParams skipUsers(final BigDecimal value) {
      put("skip_users", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a team
   * Updates an existing team and returns the updated object.
   * @param id The ID of the team (required)
   * @param updateTeamRequest  (optional)
   * @return TeamResponse200
   * @deprecated
   */
  @Deprecated
  @RequestLine("PUT /legacyTeams/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TeamResponse200 updateTeam(@Param("id") Integer id, UpdateTeamRequest updateTeamRequest);

  /**
   * Update a team
   * Similar to <code>updateTeam</code> but it also returns the http response headers .
   * Updates an existing team and returns the updated object.
   * @param id The ID of the team (required)
   * @param updateTeamRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   * @deprecated
   */
  @Deprecated
  @RequestLine("PUT /legacyTeams/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TeamResponse200> updateTeamWithHttpInfo(@Param("id") Integer id, UpdateTeamRequest updateTeamRequest);


}
