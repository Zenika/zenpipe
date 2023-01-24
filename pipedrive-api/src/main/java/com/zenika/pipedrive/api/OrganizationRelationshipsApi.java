package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddOrganizationRelationshipRequest;
import com.zenika.pipedrive.model.AddOrganizationRelationshipResponse200;
import com.zenika.pipedrive.model.DeleteOrganizationRelationshipResponse200;
import com.zenika.pipedrive.model.GetOrganizationRelationshipResponse200;
import com.zenika.pipedrive.model.GetOrganizationRelationshipsResponse200;
import com.zenika.pipedrive.model.OrganizationRelationship;
import com.zenika.pipedrive.model.UpdateOrganizationRelationshipResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface OrganizationRelationshipsApi extends ApiClient.Api {


  /**
   * Create an organization relationship
   * Creates and returns an organization relationship.
   * @param addOrganizationRelationshipRequest  (optional)
   * @return AddOrganizationRelationshipResponse200
   */
  @RequestLine("POST /organizationRelationships")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrganizationRelationshipResponse200 addOrganizationRelationship(AddOrganizationRelationshipRequest addOrganizationRelationshipRequest);

  /**
   * Create an organization relationship
   * Similar to <code>addOrganizationRelationship</code> but it also returns the http response headers .
   * Creates and returns an organization relationship.
   * @param addOrganizationRelationshipRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /organizationRelationships")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrganizationRelationshipResponse200> addOrganizationRelationshipWithHttpInfo(AddOrganizationRelationshipRequest addOrganizationRelationshipRequest);



  /**
   * Delete an organization relationship
   * Deletes an organization relationship and returns the deleted ID.
   * @param id The ID of the organization relationship (required)
   * @return DeleteOrganizationRelationshipResponse200
   */
  @RequestLine("DELETE /organizationRelationships/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteOrganizationRelationshipResponse200 deleteOrganizationRelationship(@Param("id") Integer id);

  /**
   * Delete an organization relationship
   * Similar to <code>deleteOrganizationRelationship</code> but it also returns the http response headers .
   * Deletes an organization relationship and returns the deleted ID.
   * @param id The ID of the organization relationship (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /organizationRelationships/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteOrganizationRelationshipResponse200> deleteOrganizationRelationshipWithHttpInfo(@Param("id") Integer id);



  /**
   * Get one organization relationship
   * Finds and returns an organization relationship from its ID.
   * @param id The ID of the organization relationship (required)
   * @param orgId The ID of the base organization for the returned calculated values (optional)
   * @return GetOrganizationRelationshipResponse200
   */
  @RequestLine("GET /organizationRelationships/{id}?org_id={orgId}")
  @Headers({
    "Accept: application/json",
  })
  GetOrganizationRelationshipResponse200 getOrganizationRelationship(@Param("id") Integer id, @Param("orgId") Integer orgId);

  /**
   * Get one organization relationship
   * Similar to <code>getOrganizationRelationship</code> but it also returns the http response headers .
   * Finds and returns an organization relationship from its ID.
   * @param id The ID of the organization relationship (required)
   * @param orgId The ID of the base organization for the returned calculated values (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizationRelationships/{id}?org_id={orgId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetOrganizationRelationshipResponse200> getOrganizationRelationshipWithHttpInfo(@Param("id") Integer id, @Param("orgId") Integer orgId);


  /**
   * Get one organization relationship
   * Finds and returns an organization relationship from its ID.
   * Note, this is equivalent to the other <code>getOrganizationRelationship</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationRelationshipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the organization relationship (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>orgId - The ID of the base organization for the returned calculated values (optional)</li>
   *   </ul>
   * @return GetOrganizationRelationshipResponse200
   */
  @RequestLine("GET /organizationRelationships/{id}?org_id={orgId}")
  @Headers({
  "Accept: application/json",
  })
  GetOrganizationRelationshipResponse200 getOrganizationRelationship(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get one organization relationship
  * Finds and returns an organization relationship from its ID.
  * Note, this is equivalent to the other <code>getOrganizationRelationship</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the organization relationship (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>orgId - The ID of the base organization for the returned calculated values (optional)</li>
      *   </ul>
          * @return GetOrganizationRelationshipResponse200
      */
      @RequestLine("GET /organizationRelationships/{id}?org_id={orgId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetOrganizationRelationshipResponse200> getOrganizationRelationshipWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationRelationship</code> method in a fluent style.
   */
  public static class GetOrganizationRelationshipQueryParams extends HashMap<String, Object> {
    public GetOrganizationRelationshipQueryParams orgId(final Integer value) {
      put("org_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all relationships for organization
   * Gets all of the relationships for a supplied organization ID.
   * @param orgId The ID of the organization to get relationships for (required)
   * @return GetOrganizationRelationshipsResponse200
   */
  @RequestLine("GET /organizationRelationships?org_id={orgId}")
  @Headers({
    "Accept: application/json",
  })
  GetOrganizationRelationshipsResponse200 getOrganizationRelationships(@Param("orgId") Integer orgId);

  /**
   * Get all relationships for organization
   * Similar to <code>getOrganizationRelationships</code> but it also returns the http response headers .
   * Gets all of the relationships for a supplied organization ID.
   * @param orgId The ID of the organization to get relationships for (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizationRelationships?org_id={orgId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetOrganizationRelationshipsResponse200> getOrganizationRelationshipsWithHttpInfo(@Param("orgId") Integer orgId);


  /**
   * Get all relationships for organization
   * Gets all of the relationships for a supplied organization ID.
   * Note, this is equivalent to the other <code>getOrganizationRelationships</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationRelationshipsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>orgId - The ID of the organization to get relationships for (required)</li>
   *   </ul>
   * @return GetOrganizationRelationshipsResponse200
   */
  @RequestLine("GET /organizationRelationships?org_id={orgId}")
  @Headers({
  "Accept: application/json",
  })
  GetOrganizationRelationshipsResponse200 getOrganizationRelationships(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all relationships for organization
  * Gets all of the relationships for a supplied organization ID.
  * Note, this is equivalent to the other <code>getOrganizationRelationships</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>orgId - The ID of the organization to get relationships for (required)</li>
      *   </ul>
          * @return GetOrganizationRelationshipsResponse200
      */
      @RequestLine("GET /organizationRelationships?org_id={orgId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetOrganizationRelationshipsResponse200> getOrganizationRelationshipsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationRelationships</code> method in a fluent style.
   */
  public static class GetOrganizationRelationshipsQueryParams extends HashMap<String, Object> {
    public GetOrganizationRelationshipsQueryParams orgId(final Integer value) {
      put("org_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an organization relationship
   * Updates and returns an organization relationship.
   * @param id The ID of the organization relationship (required)
   * @param organizationRelationship  (optional)
   * @return UpdateOrganizationRelationshipResponse200
   */
  @RequestLine("PUT /organizationRelationships/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateOrganizationRelationshipResponse200 updateOrganizationRelationship(@Param("id") Integer id, OrganizationRelationship organizationRelationship);

  /**
   * Update an organization relationship
   * Similar to <code>updateOrganizationRelationship</code> but it also returns the http response headers .
   * Updates and returns an organization relationship.
   * @param id The ID of the organization relationship (required)
   * @param organizationRelationship  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /organizationRelationships/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateOrganizationRelationshipResponse200> updateOrganizationRelationshipWithHttpInfo(@Param("id") Integer id, OrganizationRelationship organizationRelationship);


}
