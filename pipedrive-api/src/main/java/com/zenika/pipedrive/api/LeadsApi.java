package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddLeadRequest;
import com.zenika.pipedrive.model.GetLeadsResponse200;
import com.zenika.pipedrive.model.LeadIdResponse200;
import com.zenika.pipedrive.model.LeadResponse404;
import com.zenika.pipedrive.model.OneLeadResponse200;
import com.zenika.pipedrive.model.SearchLeadsResponse200;
import java.util.UUID;
import com.zenika.pipedrive.model.UpdateLeadRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface LeadsApi extends ApiClient.Api {


  /**
   * Add a lead
   * Creates a lead. A lead always has to be linked to a person or an organization or both. All leads created through the Pipedrive API will have a lead source &#x60;API&#x60; assigned. Here&#39;s the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-lead\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a lead&lt;/a&gt;. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields&#39; structure from deals. See an example given in the &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-custom-field-value\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values tutorial&lt;/a&gt;.
   * @param addLeadRequest  (optional)
   * @return OneLeadResponse200
   */
  @RequestLine("POST /leads")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OneLeadResponse200 addLead(AddLeadRequest addLeadRequest);

  /**
   * Add a lead
   * Similar to <code>addLead</code> but it also returns the http response headers .
   * Creates a lead. A lead always has to be linked to a person or an organization or both. All leads created through the Pipedrive API will have a lead source &#x60;API&#x60; assigned. Here&#39;s the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-lead\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a lead&lt;/a&gt;. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields&#39; structure from deals. See an example given in the &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-custom-field-value\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values tutorial&lt;/a&gt;.
   * @param addLeadRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /leads")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OneLeadResponse200> addLeadWithHttpInfo(AddLeadRequest addLeadRequest);



  /**
   * Delete a lead
   * Deletes a specific lead.
   * @param id The ID of the lead (required)
   * @return LeadIdResponse200
   */
  @RequestLine("DELETE /leads/{id}")
  @Headers({
    "Accept: application/json",
  })
  LeadIdResponse200 deleteLead(@Param("id") UUID id);

  /**
   * Delete a lead
   * Similar to <code>deleteLead</code> but it also returns the http response headers .
   * Deletes a specific lead.
   * @param id The ID of the lead (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /leads/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<LeadIdResponse200> deleteLeadWithHttpInfo(@Param("id") UUID id);



  /**
   * Get one lead
   * Returns details of a specific lead. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields’ structure from deals.
   * @param id The ID of the lead (required)
   * @return OneLeadResponse200
   */
  @RequestLine("GET /leads/{id}")
  @Headers({
    "Accept: application/json",
  })
  OneLeadResponse200 getLead(@Param("id") UUID id);

  /**
   * Get one lead
   * Similar to <code>getLead</code> but it also returns the http response headers .
   * Returns details of a specific lead. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields’ structure from deals.
   * @param id The ID of the lead (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /leads/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<OneLeadResponse200> getLeadWithHttpInfo(@Param("id") UUID id);



  /**
   * Get all leads
   * Returns multiple leads. Leads are sorted by the time they were created, from oldest to newest. Pagination can be controlled using &#x60;limit&#x60; and &#x60;start&#x60; query parameters. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields&#39; structure from deals. 
   * @param limit For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)
   * @param start For pagination, the position that represents the first result for the page (optional)
   * @param archivedStatus Filtering based on the archived status of a lead. If not provided, &#x60;All&#x60; is used. (optional)
   * @param ownerId If supplied, only leads matching the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owner_id&#x60; when supplied. (optional)
   * @param personId If supplied, only leads matching the given person will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;person_id&#x60; when supplied. (optional)
   * @param organizationId If supplied, only leads matching the given organization will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;organization_id&#x60; when supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return GetLeadsResponse200
   */
  @RequestLine("GET /leads?limit={limit}&start={start}&archived_status={archivedStatus}&owner_id={ownerId}&person_id={personId}&organization_id={organizationId}&filter_id={filterId}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetLeadsResponse200 getLeads(@Param("limit") Integer limit, @Param("start") Integer start, @Param("archivedStatus") String archivedStatus, @Param("ownerId") Integer ownerId, @Param("personId") Integer personId, @Param("organizationId") Integer organizationId, @Param("filterId") Integer filterId, @Param("sort") String sort);

  /**
   * Get all leads
   * Similar to <code>getLeads</code> but it also returns the http response headers .
   * Returns multiple leads. Leads are sorted by the time they were created, from oldest to newest. Pagination can be controlled using &#x60;limit&#x60; and &#x60;start&#x60; query parameters. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields&#39; structure from deals. 
   * @param limit For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)
   * @param start For pagination, the position that represents the first result for the page (optional)
   * @param archivedStatus Filtering based on the archived status of a lead. If not provided, &#x60;All&#x60; is used. (optional)
   * @param ownerId If supplied, only leads matching the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owner_id&#x60; when supplied. (optional)
   * @param personId If supplied, only leads matching the given person will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;person_id&#x60; when supplied. (optional)
   * @param organizationId If supplied, only leads matching the given organization will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;organization_id&#x60; when supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /leads?limit={limit}&start={start}&archived_status={archivedStatus}&owner_id={ownerId}&person_id={personId}&organization_id={organizationId}&filter_id={filterId}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetLeadsResponse200> getLeadsWithHttpInfo(@Param("limit") Integer limit, @Param("start") Integer start, @Param("archivedStatus") String archivedStatus, @Param("ownerId") Integer ownerId, @Param("personId") Integer personId, @Param("organizationId") Integer organizationId, @Param("filterId") Integer filterId, @Param("sort") String sort);


  /**
   * Get all leads
   * Returns multiple leads. Leads are sorted by the time they were created, from oldest to newest. Pagination can be controlled using &#x60;limit&#x60; and &#x60;start&#x60; query parameters. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields&#39; structure from deals. 
   * Note, this is equivalent to the other <code>getLeads</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetLeadsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)</li>
   *   <li>start - For pagination, the position that represents the first result for the page (optional)</li>
   *   <li>archivedStatus - Filtering based on the archived status of a lead. If not provided, &#x60;All&#x60; is used. (optional)</li>
   *   <li>ownerId - If supplied, only leads matching the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owner_id&#x60; when supplied. (optional)</li>
   *   <li>personId - If supplied, only leads matching the given person will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;person_id&#x60; when supplied. (optional)</li>
   *   <li>organizationId - If supplied, only leads matching the given organization will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;organization_id&#x60; when supplied. (optional)</li>
   *   <li>filterId - The ID of the filter to use (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
   *   </ul>
   * @return GetLeadsResponse200
   */
  @RequestLine("GET /leads?limit={limit}&start={start}&archived_status={archivedStatus}&owner_id={ownerId}&person_id={personId}&organization_id={organizationId}&filter_id={filterId}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetLeadsResponse200 getLeads(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all leads
  * Returns multiple leads. Leads are sorted by the time they were created, from oldest to newest. Pagination can be controlled using &#x60;limit&#x60; and &#x60;start&#x60; query parameters. If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields&#39; structure from deals. 
  * Note, this is equivalent to the other <code>getLeads</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. (optional)</li>
          *   <li>start - For pagination, the position that represents the first result for the page (optional)</li>
          *   <li>archivedStatus - Filtering based on the archived status of a lead. If not provided, &#x60;All&#x60; is used. (optional)</li>
          *   <li>ownerId - If supplied, only leads matching the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owner_id&#x60; when supplied. (optional)</li>
          *   <li>personId - If supplied, only leads matching the given person will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;person_id&#x60; when supplied. (optional)</li>
          *   <li>organizationId - If supplied, only leads matching the given organization will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;organization_id&#x60; when supplied. (optional)</li>
          *   <li>filterId - The ID of the filter to use (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
      *   </ul>
          * @return GetLeadsResponse200
      */
      @RequestLine("GET /leads?limit={limit}&start={start}&archived_status={archivedStatus}&owner_id={ownerId}&person_id={personId}&organization_id={organizationId}&filter_id={filterId}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetLeadsResponse200> getLeadsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getLeads</code> method in a fluent style.
   */
  public static class GetLeadsQueryParams extends HashMap<String, Object> {
    public GetLeadsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetLeadsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetLeadsQueryParams archivedStatus(final String value) {
      put("archived_status", EncodingUtils.encode(value));
      return this;
    }
    public GetLeadsQueryParams ownerId(final Integer value) {
      put("owner_id", EncodingUtils.encode(value));
      return this;
    }
    public GetLeadsQueryParams personId(final Integer value) {
      put("person_id", EncodingUtils.encode(value));
      return this;
    }
    public GetLeadsQueryParams organizationId(final Integer value) {
      put("organization_id", EncodingUtils.encode(value));
      return this;
    }
    public GetLeadsQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetLeadsQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Search leads
   * Searches all leads by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found leads can be filtered by the person ID and the organization ID.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param personId Will filter leads by the provided person ID. The upper limit of found leads associated with the person is 2000. (optional)
   * @param organizationId Will filter leads by the provided organization ID. The upper limit of found leads associated with the organization is 2000. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return SearchLeadsResponse200
   */
  @RequestLine("GET /leads/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  SearchLeadsResponse200 searchLeads(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("personId") Integer personId, @Param("organizationId") Integer organizationId, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Search leads
   * Similar to <code>searchLeads</code> but it also returns the http response headers .
   * Searches all leads by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found leads can be filtered by the person ID and the organization ID.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param personId Will filter leads by the provided person ID. The upper limit of found leads associated with the person is 2000. (optional)
   * @param organizationId Will filter leads by the provided organization ID. The upper limit of found leads associated with the organization is 2000. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /leads/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchLeadsResponse200> searchLeadsWithHttpInfo(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("personId") Integer personId, @Param("organizationId") Integer organizationId, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Search leads
   * Searches all leads by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found leads can be filtered by the person ID and the organization ID.
   * Note, this is equivalent to the other <code>searchLeads</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchLeadsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
   *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
   *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
   *   <li>personId - Will filter leads by the provided person ID. The upper limit of found leads associated with the person is 2000. (optional)</li>
   *   <li>organizationId - Will filter leads by the provided organization ID. The upper limit of found leads associated with the organization is 2000. (optional)</li>
   *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
   *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return SearchLeadsResponse200
   */
  @RequestLine("GET /leads/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  SearchLeadsResponse200 searchLeads(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Search leads
  * Searches all leads by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found leads can be filtered by the person ID and the organization ID.
  * Note, this is equivalent to the other <code>searchLeads</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
          *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
          *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
          *   <li>personId - Will filter leads by the provided person ID. The upper limit of found leads associated with the person is 2000. (optional)</li>
          *   <li>organizationId - Will filter leads by the provided organization ID. The upper limit of found leads associated with the organization is 2000. (optional)</li>
          *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
          *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return SearchLeadsResponse200
      */
      @RequestLine("GET /leads/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchLeadsResponse200> searchLeadsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchLeads</code> method in a fluent style.
   */
  public static class SearchLeadsQueryParams extends HashMap<String, Object> {
    public SearchLeadsQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public SearchLeadsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchLeadsQueryParams exactMatch(final Boolean value) {
      put("exact_match", EncodingUtils.encode(value));
      return this;
    }
    public SearchLeadsQueryParams personId(final Integer value) {
      put("person_id", EncodingUtils.encode(value));
      return this;
    }
    public SearchLeadsQueryParams organizationId(final Integer value) {
      put("organization_id", EncodingUtils.encode(value));
      return this;
    }
    public SearchLeadsQueryParams includeFields(final String value) {
      put("include_fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchLeadsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public SearchLeadsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a lead
   * Updates one or more properties of a lead. Only properties included in the request will be updated. Send &#x60;null&#x60; to unset a property (applicable for example for &#x60;value&#x60;, &#x60;person_id&#x60; or &#x60;organization_id&#x60;). If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields’ structure from deals. See an example given in the &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-custom-field-value\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields’ values tutorial&lt;/a&gt;.
   * @param id The ID of the lead (required)
   * @param updateLeadRequest  (optional)
   * @return OneLeadResponse200
   */
  @RequestLine("PATCH /leads/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OneLeadResponse200 updateLead(@Param("id") UUID id, UpdateLeadRequest updateLeadRequest);

  /**
   * Update a lead
   * Similar to <code>updateLead</code> but it also returns the http response headers .
   * Updates one or more properties of a lead. Only properties included in the request will be updated. Send &#x60;null&#x60; to unset a property (applicable for example for &#x60;value&#x60;, &#x60;person_id&#x60; or &#x60;organization_id&#x60;). If a lead contains custom fields, the fields&#39; values will be included in the response in the same format as with the &#x60;Deals&#x60; endpoints. If a custom field&#39;s value hasn&#39;t been set for the lead, it won&#39;t appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields’ structure from deals. See an example given in the &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-custom-field-value\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields’ values tutorial&lt;/a&gt;.
   * @param id The ID of the lead (required)
   * @param updateLeadRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /leads/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OneLeadResponse200> updateLeadWithHttpInfo(@Param("id") UUID id, UpdateLeadRequest updateLeadRequest);


}
