package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddOrganizationFollowerRequest;
import com.zenika.pipedrive.model.AddOrganizationFollowerResponse200;
import com.zenika.pipedrive.model.AddOrganizationRequest;
import com.zenika.pipedrive.model.AddOrganizationResponse200;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeleteOrganizationFollowerResponse200;
import com.zenika.pipedrive.model.DeleteOrganizationResponse200;
import com.zenika.pipedrive.model.DeleteOrganizationsResponse200;
import com.zenika.pipedrive.model.GetAssociatedActivitiesResponse200;
import com.zenika.pipedrive.model.GetAssociatedDealsResponse200;
import com.zenika.pipedrive.model.GetAssociatedFilesResponse200;
import com.zenika.pipedrive.model.GetAssociatedFollowersResponse2001;
import com.zenika.pipedrive.model.GetAssociatedMailMessagesResponse200;
import com.zenika.pipedrive.model.GetAssociatedUpdatesResponse200;
import com.zenika.pipedrive.model.GetOrganizationResponse200;
import com.zenika.pipedrive.model.GetOrganizationsResponse200;
import com.zenika.pipedrive.model.ListPermittedUsersResponse2001;
import com.zenika.pipedrive.model.ListPersonsResponse200;
import com.zenika.pipedrive.model.MergeOrganizationsRequest;
import com.zenika.pipedrive.model.MergeOrganizationsResponse200;
import com.zenika.pipedrive.model.SearchOrganizationResponse200;
import com.zenika.pipedrive.model.UpdateOrganizationRequest;
import com.zenika.pipedrive.model.UpdateOrganizationResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface OrganizationsApi extends ApiClient.Api {


  /**
   * Add an organization
   * Adds a new organization. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the organizationFields and look for &#x60;key&#x60; values. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-an-organization\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding an organization&lt;/a&gt;.
   * @param addOrganizationRequest  (optional)
   * @return AddOrganizationResponse200
   */
  @RequestLine("POST /organizations")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrganizationResponse200 addOrganization(AddOrganizationRequest addOrganizationRequest);

  /**
   * Add an organization
   * Similar to <code>addOrganization</code> but it also returns the http response headers .
   * Adds a new organization. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the organizationFields and look for &#x60;key&#x60; values. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-an-organization\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding an organization&lt;/a&gt;.
   * @param addOrganizationRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /organizations")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrganizationResponse200> addOrganizationWithHttpInfo(AddOrganizationRequest addOrganizationRequest);



  /**
   * Add a follower to an organization
   * Adds a follower to an organization.
   * @param id The ID of the organization (required)
   * @param addOrganizationFollowerRequest  (optional)
   * @return AddOrganizationFollowerResponse200
   */
  @RequestLine("POST /organizations/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOrganizationFollowerResponse200 addOrganizationFollower(@Param("id") Integer id, AddOrganizationFollowerRequest addOrganizationFollowerRequest);

  /**
   * Add a follower to an organization
   * Similar to <code>addOrganizationFollower</code> but it also returns the http response headers .
   * Adds a follower to an organization.
   * @param id The ID of the organization (required)
   * @param addOrganizationFollowerRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /organizations/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOrganizationFollowerResponse200> addOrganizationFollowerWithHttpInfo(@Param("id") Integer id, AddOrganizationFollowerRequest addOrganizationFollowerRequest);



  /**
   * Delete an organization
   * Marks an organization as deleted. After 30 days, the organization will be permanently deleted.
   * @param id The ID of the organization (required)
   * @return DeleteOrganizationResponse200
   */
  @RequestLine("DELETE /organizations/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteOrganizationResponse200 deleteOrganization(@Param("id") Integer id);

  /**
   * Delete an organization
   * Similar to <code>deleteOrganization</code> but it also returns the http response headers .
   * Marks an organization as deleted. After 30 days, the organization will be permanently deleted.
   * @param id The ID of the organization (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /organizations/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteOrganizationResponse200> deleteOrganizationWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete a follower from an organization
   * Deletes a follower from an organization. You can retrieve the &#x60;follower_id&#x60; from the &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/Organizations#getOrganizationFollowers\&quot;&gt;List followers of an organization&lt;/a&gt; endpoint.
   * @param id The ID of the organization (required)
   * @param followerId The ID of the follower (required)
   * @return DeleteOrganizationFollowerResponse200
   */
  @RequestLine("DELETE /organizations/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  DeleteOrganizationFollowerResponse200 deleteOrganizationFollower(@Param("id") Integer id, @Param("followerId") Integer followerId);

  /**
   * Delete a follower from an organization
   * Similar to <code>deleteOrganizationFollower</code> but it also returns the http response headers .
   * Deletes a follower from an organization. You can retrieve the &#x60;follower_id&#x60; from the &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/Organizations#getOrganizationFollowers\&quot;&gt;List followers of an organization&lt;/a&gt; endpoint.
   * @param id The ID of the organization (required)
   * @param followerId The ID of the follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /organizations/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteOrganizationFollowerResponse200> deleteOrganizationFollowerWithHttpInfo(@Param("id") Integer id, @Param("followerId") Integer followerId);



  /**
   * Delete multiple organizations in bulk
   * Marks multiple organizations as deleted. After 30 days, the organizations will be permanently deleted.
   * @param ids The comma-separated IDs that will be deleted (required)
   * @return DeleteOrganizationsResponse200
   */
  @RequestLine("DELETE /organizations?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteOrganizationsResponse200 deleteOrganizations(@Param("ids") String ids);

  /**
   * Delete multiple organizations in bulk
   * Similar to <code>deleteOrganizations</code> but it also returns the http response headers .
   * Marks multiple organizations as deleted. After 30 days, the organizations will be permanently deleted.
   * @param ids The comma-separated IDs that will be deleted (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /organizations?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteOrganizationsResponse200> deleteOrganizationsWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple organizations in bulk
   * Marks multiple organizations as deleted. After 30 days, the organizations will be permanently deleted.
   * Note, this is equivalent to the other <code>deleteOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated IDs that will be deleted (required)</li>
   *   </ul>
   * @return DeleteOrganizationsResponse200
   */
  @RequestLine("DELETE /organizations?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteOrganizationsResponse200 deleteOrganizations(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple organizations in bulk
  * Marks multiple organizations as deleted. After 30 days, the organizations will be permanently deleted.
  * Note, this is equivalent to the other <code>deleteOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated IDs that will be deleted (required)</li>
      *   </ul>
          * @return DeleteOrganizationsResponse200
      */
      @RequestLine("DELETE /organizations?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteOrganizationsResponse200> deleteOrganizationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteOrganizations</code> method in a fluent style.
   */
  public static class DeleteOrganizationsQueryParams extends HashMap<String, Object> {
    public DeleteOrganizationsQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get details of an organization
   * Returns the details of an organization. Note that this also returns some additional fields which are not present when asking for all organizations. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the &#x60;key&#x60; value of organizationFields.
   * @param id The ID of the organization (required)
   * @return GetOrganizationResponse200
   */
  @RequestLine("GET /organizations/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetOrganizationResponse200 getOrganization(@Param("id") Integer id);

  /**
   * Get details of an organization
   * Similar to <code>getOrganization</code> but it also returns the http response headers .
   * Returns the details of an organization. Note that this also returns some additional fields which are not present when asking for all organizations. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the &#x60;key&#x60; value of organizationFields.
   * @param id The ID of the organization (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetOrganizationResponse200> getOrganizationWithHttpInfo(@Param("id") Integer id);



  /**
   * List activities associated with an organization
   * Lists activities associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both Done and Not done activities. (optional)
   * @param exclude A comma-separated string of activity IDs to exclude from result (optional)
   * @return GetAssociatedActivitiesResponse200
   */
  @RequestLine("GET /organizations/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedActivitiesResponse200 getOrganizationActivities(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("done") BigDecimal done, @Param("exclude") String exclude);

  /**
   * List activities associated with an organization
   * Similar to <code>getOrganizationActivities</code> but it also returns the http response headers .
   * Lists activities associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both Done and Not done activities. (optional)
   * @param exclude A comma-separated string of activity IDs to exclude from result (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedActivitiesResponse200> getOrganizationActivitiesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("done") BigDecimal done, @Param("exclude") String exclude);


  /**
   * List activities associated with an organization
   * Lists activities associated with an organization.
   * Note, this is equivalent to the other <code>getOrganizationActivities</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationActivitiesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the organization (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both Done and Not done activities. (optional)</li>
   *   <li>exclude - A comma-separated string of activity IDs to exclude from result (optional)</li>
   *   </ul>
   * @return GetAssociatedActivitiesResponse200
   */
  @RequestLine("GET /organizations/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedActivitiesResponse200 getOrganizationActivities(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List activities associated with an organization
  * Lists activities associated with an organization.
  * Note, this is equivalent to the other <code>getOrganizationActivities</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the organization (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted returns both Done and Not done activities. (optional)</li>
          *   <li>exclude - A comma-separated string of activity IDs to exclude from result (optional)</li>
      *   </ul>
          * @return GetAssociatedActivitiesResponse200
      */
      @RequestLine("GET /organizations/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedActivitiesResponse200> getOrganizationActivitiesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationActivities</code> method in a fluent style.
   */
  public static class GetOrganizationActivitiesQueryParams extends HashMap<String, Object> {
    public GetOrganizationActivitiesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationActivitiesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationActivitiesQueryParams done(final BigDecimal value) {
      put("done", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationActivitiesQueryParams exclude(final String value) {
      put("exclude", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List deals associated with an organization
   * Lists deals associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @param onlyPrimaryAssociation If set, only deals that are directly associated to the organization are fetched. If not set (default), all deals are fetched that are either directly or indirectly related to the organization. Indirect relations include relations through custom, organization-type fields and through persons of the given organization. (optional)
   * @return GetAssociatedDealsResponse200
   */
  @RequestLine("GET /organizations/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}&only_primary_association={onlyPrimaryAssociation}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedDealsResponse200 getOrganizationDeals(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("status") String status, @Param("sort") String sort, @Param("onlyPrimaryAssociation") BigDecimal onlyPrimaryAssociation);

  /**
   * List deals associated with an organization
   * Similar to <code>getOrganizationDeals</code> but it also returns the http response headers .
   * Lists deals associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @param onlyPrimaryAssociation If set, only deals that are directly associated to the organization are fetched. If not set (default), all deals are fetched that are either directly or indirectly related to the organization. Indirect relations include relations through custom, organization-type fields and through persons of the given organization. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}&only_primary_association={onlyPrimaryAssociation}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedDealsResponse200> getOrganizationDealsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("status") String status, @Param("sort") String sort, @Param("onlyPrimaryAssociation") BigDecimal onlyPrimaryAssociation);


  /**
   * List deals associated with an organization
   * Lists deals associated with an organization.
   * Note, this is equivalent to the other <code>getOrganizationDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the organization (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
   *   <li>onlyPrimaryAssociation - If set, only deals that are directly associated to the organization are fetched. If not set (default), all deals are fetched that are either directly or indirectly related to the organization. Indirect relations include relations through custom, organization-type fields and through persons of the given organization. (optional)</li>
   *   </ul>
   * @return GetAssociatedDealsResponse200
   */
  @RequestLine("GET /organizations/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}&only_primary_association={onlyPrimaryAssociation}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedDealsResponse200 getOrganizationDeals(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List deals associated with an organization
  * Lists deals associated with an organization.
  * Note, this is equivalent to the other <code>getOrganizationDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the organization (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
          *   <li>onlyPrimaryAssociation - If set, only deals that are directly associated to the organization are fetched. If not set (default), all deals are fetched that are either directly or indirectly related to the organization. Indirect relations include relations through custom, organization-type fields and through persons of the given organization. (optional)</li>
      *   </ul>
          * @return GetAssociatedDealsResponse200
      */
      @RequestLine("GET /organizations/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}&only_primary_association={onlyPrimaryAssociation}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedDealsResponse200> getOrganizationDealsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationDeals</code> method in a fluent style.
   */
  public static class GetOrganizationDealsQueryParams extends HashMap<String, Object> {
    public GetOrganizationDealsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationDealsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationDealsQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationDealsQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationDealsQueryParams onlyPrimaryAssociation(final BigDecimal value) {
      put("only_primary_association", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List files attached to an organization
   * Lists files associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /organizations/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getOrganizationFiles(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);

  /**
   * List files attached to an organization
   * Similar to <code>getOrganizationFiles</code> but it also returns the http response headers .
   * Lists files associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedFilesResponse200> getOrganizationFilesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);


  /**
   * List files attached to an organization
   * Lists files associated with an organization.
   * Note, this is equivalent to the other <code>getOrganizationFiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationFilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the organization (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
   *   </ul>
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /organizations/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getOrganizationFiles(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List files attached to an organization
  * Lists files associated with an organization.
  * Note, this is equivalent to the other <code>getOrganizationFiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the organization (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
      *   </ul>
          * @return GetAssociatedFilesResponse200
      */
      @RequestLine("GET /organizations/{id}/files?start={start}&limit={limit}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedFilesResponse200> getOrganizationFilesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationFiles</code> method in a fluent style.
   */
  public static class GetOrganizationFilesQueryParams extends HashMap<String, Object> {
    public GetOrganizationFilesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationFilesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationFilesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List followers of an organization
   * Lists the followers of an organization.
   * @param id The ID of the organization (required)
   * @return GetAssociatedFollowersResponse2001
   */
  @RequestLine("GET /organizations/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedFollowersResponse2001 getOrganizationFollowers(@Param("id") Integer id);

  /**
   * List followers of an organization
   * Similar to <code>getOrganizationFollowers</code> but it also returns the http response headers .
   * Lists the followers of an organization.
   * @param id The ID of the organization (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedFollowersResponse2001> getOrganizationFollowersWithHttpInfo(@Param("id") Integer id);



  /**
   * List mail messages associated with an organization
   * Lists mail messages associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetAssociatedMailMessagesResponse200
   */
  @RequestLine("GET /organizations/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedMailMessagesResponse200 getOrganizationMailMessages(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List mail messages associated with an organization
   * Similar to <code>getOrganizationMailMessages</code> but it also returns the http response headers .
   * Lists mail messages associated with an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedMailMessagesResponse200> getOrganizationMailMessagesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List mail messages associated with an organization
   * Lists mail messages associated with an organization.
   * Note, this is equivalent to the other <code>getOrganizationMailMessages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationMailMessagesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the organization (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetAssociatedMailMessagesResponse200
   */
  @RequestLine("GET /organizations/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedMailMessagesResponse200 getOrganizationMailMessages(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List mail messages associated with an organization
  * Lists mail messages associated with an organization.
  * Note, this is equivalent to the other <code>getOrganizationMailMessages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the organization (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetAssociatedMailMessagesResponse200
      */
      @RequestLine("GET /organizations/{id}/mailMessages?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedMailMessagesResponse200> getOrganizationMailMessagesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationMailMessages</code> method in a fluent style.
   */
  public static class GetOrganizationMailMessagesQueryParams extends HashMap<String, Object> {
    public GetOrganizationMailMessagesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationMailMessagesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List persons of an organization
   * Lists persons associated with an organization.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return ListPersonsResponse200
   */
  @RequestLine("GET /organizations/{id}/persons?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ListPersonsResponse200 getOrganizationPersons(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List persons of an organization
   * Similar to <code>getOrganizationPersons</code> but it also returns the http response headers .
   * Lists persons associated with an organization.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/persons?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ListPersonsResponse200> getOrganizationPersonsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List persons of an organization
   * Lists persons associated with an organization.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * Note, this is equivalent to the other <code>getOrganizationPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the organization (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return ListPersonsResponse200
   */
  @RequestLine("GET /organizations/{id}/persons?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  ListPersonsResponse200 getOrganizationPersons(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List persons of an organization
  * Lists persons associated with an organization.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
  * Note, this is equivalent to the other <code>getOrganizationPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the organization (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return ListPersonsResponse200
      */
      @RequestLine("GET /organizations/{id}/persons?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ListPersonsResponse200> getOrganizationPersonsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationPersons</code> method in a fluent style.
   */
  public static class GetOrganizationPersonsQueryParams extends HashMap<String, Object> {
    public GetOrganizationPersonsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationPersonsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List updates about an organization
   * Lists updates about an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param allChanges Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted, returns changes without custom field updates. (optional)
   * @param items A comma-separated string for filtering out item specific updates. (Possible values - activity, plannedActivity, note, file, change, deal, follower, participant, mailMessage, mailMessageWithAttachment, invoice, activityFile, document) (optional)
   * @return GetAssociatedUpdatesResponse200
   */
  @RequestLine("GET /organizations/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedUpdatesResponse200 getOrganizationUpdates(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("allChanges") String allChanges, @Param("items") String items);

  /**
   * List updates about an organization
   * Similar to <code>getOrganizationUpdates</code> but it also returns the http response headers .
   * Lists updates about an organization.
   * @param id The ID of the organization (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param allChanges Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted, returns changes without custom field updates. (optional)
   * @param items A comma-separated string for filtering out item specific updates. (Possible values - activity, plannedActivity, note, file, change, deal, follower, participant, mailMessage, mailMessageWithAttachment, invoice, activityFile, document) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedUpdatesResponse200> getOrganizationUpdatesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("allChanges") String allChanges, @Param("items") String items);


  /**
   * List updates about an organization
   * Lists updates about an organization.
   * Note, this is equivalent to the other <code>getOrganizationUpdates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationUpdatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the organization (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>allChanges - Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted, returns changes without custom field updates. (optional)</li>
   *   <li>items - A comma-separated string for filtering out item specific updates. (Possible values - activity, plannedActivity, note, file, change, deal, follower, participant, mailMessage, mailMessageWithAttachment, invoice, activityFile, document) (optional)</li>
   *   </ul>
   * @return GetAssociatedUpdatesResponse200
   */
  @RequestLine("GET /organizations/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedUpdatesResponse200 getOrganizationUpdates(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List updates about an organization
  * Lists updates about an organization.
  * Note, this is equivalent to the other <code>getOrganizationUpdates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the organization (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>allChanges - Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted, returns changes without custom field updates. (optional)</li>
          *   <li>items - A comma-separated string for filtering out item specific updates. (Possible values - activity, plannedActivity, note, file, change, deal, follower, participant, mailMessage, mailMessageWithAttachment, invoice, activityFile, document) (optional)</li>
      *   </ul>
          * @return GetAssociatedUpdatesResponse200
      */
      @RequestLine("GET /organizations/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedUpdatesResponse200> getOrganizationUpdatesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationUpdates</code> method in a fluent style.
   */
  public static class GetOrganizationUpdatesQueryParams extends HashMap<String, Object> {
    public GetOrganizationUpdatesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationUpdatesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationUpdatesQueryParams allChanges(final String value) {
      put("all_changes", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationUpdatesQueryParams items(final String value) {
      put("items", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List permitted users
   * List users permitted to access an organization.
   * @param id The ID of the organization (required)
   * @return ListPermittedUsersResponse2001
   */
  @RequestLine("GET /organizations/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  ListPermittedUsersResponse2001 getOrganizationUsers(@Param("id") Integer id);

  /**
   * List permitted users
   * Similar to <code>getOrganizationUsers</code> but it also returns the http response headers .
   * List users permitted to access an organization.
   * @param id The ID of the organization (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ListPermittedUsersResponse2001> getOrganizationUsersWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all organizations
   * Returns all organizations.
   * @param userId If supplied, only organizations owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param firstChar If supplied, only organizations whose name starts with the specified letter will be returned (case insensitive) (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return GetOrganizationsResponse200
   */
  @RequestLine("GET /organizations?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetOrganizationsResponse200 getOrganizations(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("firstChar") String firstChar, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);

  /**
   * Get all organizations
   * Similar to <code>getOrganizations</code> but it also returns the http response headers .
   * Returns all organizations.
   * @param userId If supplied, only organizations owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param firstChar If supplied, only organizations whose name starts with the specified letter will be returned (case insensitive) (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetOrganizationsResponse200> getOrganizationsWithHttpInfo(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("firstChar") String firstChar, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);


  /**
   * Get all organizations
   * Returns all organizations.
   * Note, this is equivalent to the other <code>getOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - If supplied, only organizations owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)</li>
   *   <li>filterId - The ID of the filter to use (optional)</li>
   *   <li>firstChar - If supplied, only organizations whose name starts with the specified letter will be returned (case insensitive) (optional)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
   *   </ul>
   * @return GetOrganizationsResponse200
   */
  @RequestLine("GET /organizations?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetOrganizationsResponse200 getOrganizations(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all organizations
  * Returns all organizations.
  * Note, this is equivalent to the other <code>getOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>userId - If supplied, only organizations owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)</li>
          *   <li>filterId - The ID of the filter to use (optional)</li>
          *   <li>firstChar - If supplied, only organizations whose name starts with the specified letter will be returned (case insensitive) (optional)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
      *   </ul>
          * @return GetOrganizationsResponse200
      */
      @RequestLine("GET /organizations?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetOrganizationsResponse200> getOrganizationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizations</code> method in a fluent style.
   */
  public static class GetOrganizationsQueryParams extends HashMap<String, Object> {
    public GetOrganizationsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationsQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationsQueryParams firstChar(final String value) {
      put("first_char", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationsQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Merge two organizations
   * Merges an organization with another organization. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/merging-two-organizations\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;merging two organizations&lt;/a&gt;.
   * @param id The ID of the organization (required)
   * @param mergeOrganizationsRequest  (optional)
   * @return MergeOrganizationsResponse200
   */
  @RequestLine("PUT /organizations/{id}/merge")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MergeOrganizationsResponse200 mergeOrganizations(@Param("id") Integer id, MergeOrganizationsRequest mergeOrganizationsRequest);

  /**
   * Merge two organizations
   * Similar to <code>mergeOrganizations</code> but it also returns the http response headers .
   * Merges an organization with another organization. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/merging-two-organizations\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;merging two organizations&lt;/a&gt;.
   * @param id The ID of the organization (required)
   * @param mergeOrganizationsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /organizations/{id}/merge")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MergeOrganizationsResponse200> mergeOrganizationsWithHttpInfo(@Param("id") Integer id, MergeOrganizationsRequest mergeOrganizationsRequest);



  /**
   * Search organizations
   * Searches all organizations by name, address, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return SearchOrganizationResponse200
   */
  @RequestLine("GET /organizations/search?term={term}&fields={fields}&exact_match={exactMatch}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  SearchOrganizationResponse200 searchOrganization(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Search organizations
   * Similar to <code>searchOrganization</code> but it also returns the http response headers .
   * Searches all organizations by name, address, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizations/search?term={term}&fields={fields}&exact_match={exactMatch}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchOrganizationResponse200> searchOrganizationWithHttpInfo(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Search organizations
   * Searches all organizations by name, address, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
   * Note, this is equivalent to the other <code>searchOrganization</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchOrganizationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
   *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
   *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
   *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return SearchOrganizationResponse200
   */
  @RequestLine("GET /organizations/search?term={term}&fields={fields}&exact_match={exactMatch}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  SearchOrganizationResponse200 searchOrganization(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Search organizations
  * Searches all organizations by name, address, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
  * Note, this is equivalent to the other <code>searchOrganization</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
          *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
          *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
          *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return SearchOrganizationResponse200
      */
      @RequestLine("GET /organizations/search?term={term}&fields={fields}&exact_match={exactMatch}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchOrganizationResponse200> searchOrganizationWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchOrganization</code> method in a fluent style.
   */
  public static class SearchOrganizationQueryParams extends HashMap<String, Object> {
    public SearchOrganizationQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public SearchOrganizationQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchOrganizationQueryParams exactMatch(final Boolean value) {
      put("exact_match", EncodingUtils.encode(value));
      return this;
    }
    public SearchOrganizationQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public SearchOrganizationQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an organization
   * Updates the properties of an organization.
   * @param id The ID of the organization (required)
   * @param updateOrganizationRequest  (optional)
   * @return UpdateOrganizationResponse200
   */
  @RequestLine("PUT /organizations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateOrganizationResponse200 updateOrganization(@Param("id") Integer id, UpdateOrganizationRequest updateOrganizationRequest);

  /**
   * Update an organization
   * Similar to <code>updateOrganization</code> but it also returns the http response headers .
   * Updates the properties of an organization.
   * @param id The ID of the organization (required)
   * @param updateOrganizationRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /organizations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateOrganizationResponse200> updateOrganizationWithHttpInfo(@Param("id") Integer id, UpdateOrganizationRequest updateOrganizationRequest);


}
