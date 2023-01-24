package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddDealFollowerRequest;
import com.zenika.pipedrive.model.AddDealFollowerResponse200;
import com.zenika.pipedrive.model.AddDealParticipantRequest;
import com.zenika.pipedrive.model.AddDealParticipantResponse200;
import com.zenika.pipedrive.model.AddDealProductRequest;
import com.zenika.pipedrive.model.AddDealRequest;
import com.zenika.pipedrive.model.BasicDealProductRequest;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DealResponse200;
import com.zenika.pipedrive.model.DeleteDealFollowerResponse200;
import com.zenika.pipedrive.model.DeleteDealParticipantResponse200;
import com.zenika.pipedrive.model.DeleteDealProductResponse200;
import com.zenika.pipedrive.model.DeleteDealResponse200;
import com.zenika.pipedrive.model.DeleteDealsResponse200;
import com.zenika.pipedrive.model.DuplicateDealResponse200;
import com.zenika.pipedrive.model.GetAddProductAttachementResponse200;
import com.zenika.pipedrive.model.GetAssociatedFilesResponse200;
import com.zenika.pipedrive.model.GetAssociatedFollowersResponse200;
import com.zenika.pipedrive.model.GetAssociatedMailMessagesResponse200;
import com.zenika.pipedrive.model.GetDealActivitiesResponse200;
import com.zenika.pipedrive.model.GetDealParticipantsResponse200;
import com.zenika.pipedrive.model.GetDealResponse200;
import com.zenika.pipedrive.model.GetDealUpdatesResponse200;
import com.zenika.pipedrive.model.GetDealsResponse200;
import com.zenika.pipedrive.model.GetDealsSummaryResponse200;
import com.zenika.pipedrive.model.GetDealsTimelineResponse200;
import com.zenika.pipedrive.model.GetProductAttachementResponse200;
import com.zenika.pipedrive.model.ListPermittedUsersResponse200;
import com.zenika.pipedrive.model.ListPersonsResponse200;
import com.zenika.pipedrive.model.ListProductsResponse200;
import java.time.LocalDate;
import com.zenika.pipedrive.model.MergeDealsRequest;
import com.zenika.pipedrive.model.MergeDealsResponse200;
import com.zenika.pipedrive.model.SearchDealsResponse200;
import com.zenika.pipedrive.model.UpdateDealRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface DealsApi extends ApiClient.Api {


  /**
   * Add a deal
   * Adds a new deal. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the dealFields and look for &#x60;key&#x60; values. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/creating-a-deal\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a deal&lt;/a&gt;.
   * @param addDealRequest  (optional)
   * @return DealResponse200
   */
  @RequestLine("POST /deals")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DealResponse200 addDeal(AddDealRequest addDealRequest);

  /**
   * Add a deal
   * Similar to <code>addDeal</code> but it also returns the http response headers .
   * Adds a new deal. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the dealFields and look for &#x60;key&#x60; values. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/creating-a-deal\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a deal&lt;/a&gt;.
   * @param addDealRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /deals")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DealResponse200> addDealWithHttpInfo(AddDealRequest addDealRequest);



  /**
   * Add a follower to a deal
   * Adds a follower to a deal.
   * @param id The ID of the deal (required)
   * @param addDealFollowerRequest  (optional)
   * @return AddDealFollowerResponse200
   */
  @RequestLine("POST /deals/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddDealFollowerResponse200 addDealFollower(@Param("id") Integer id, AddDealFollowerRequest addDealFollowerRequest);

  /**
   * Add a follower to a deal
   * Similar to <code>addDealFollower</code> but it also returns the http response headers .
   * Adds a follower to a deal.
   * @param id The ID of the deal (required)
   * @param addDealFollowerRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /deals/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddDealFollowerResponse200> addDealFollowerWithHttpInfo(@Param("id") Integer id, AddDealFollowerRequest addDealFollowerRequest);



  /**
   * Add a participant to a deal
   * Adds a participant to a deal.
   * @param id The ID of the deal (required)
   * @param addDealParticipantRequest  (optional)
   * @return AddDealParticipantResponse200
   */
  @RequestLine("POST /deals/{id}/participants")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddDealParticipantResponse200 addDealParticipant(@Param("id") Integer id, AddDealParticipantRequest addDealParticipantRequest);

  /**
   * Add a participant to a deal
   * Similar to <code>addDealParticipant</code> but it also returns the http response headers .
   * Adds a participant to a deal.
   * @param id The ID of the deal (required)
   * @param addDealParticipantRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /deals/{id}/participants")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddDealParticipantResponse200> addDealParticipantWithHttpInfo(@Param("id") Integer id, AddDealParticipantRequest addDealParticipantRequest);



  /**
   * Add a product to a deal
   * Adds a product to a deal, creating a new item called a deal-product.
   * @param id The ID of the deal (required)
   * @param addDealProductRequest  (optional)
   * @return GetAddProductAttachementResponse200
   */
  @RequestLine("POST /deals/{id}/products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GetAddProductAttachementResponse200 addDealProduct(@Param("id") Integer id, AddDealProductRequest addDealProductRequest);

  /**
   * Add a product to a deal
   * Similar to <code>addDealProduct</code> but it also returns the http response headers .
   * Adds a product to a deal, creating a new item called a deal-product.
   * @param id The ID of the deal (required)
   * @param addDealProductRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /deals/{id}/products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GetAddProductAttachementResponse200> addDealProductWithHttpInfo(@Param("id") Integer id, AddDealProductRequest addDealProductRequest);



  /**
   * Delete a deal
   * Marks a deal as deleted. After 30 days, the deal will be permanently deleted.
   * @param id The ID of the deal (required)
   * @return DeleteDealResponse200
   */
  @RequestLine("DELETE /deals/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteDealResponse200 deleteDeal(@Param("id") Integer id);

  /**
   * Delete a deal
   * Similar to <code>deleteDeal</code> but it also returns the http response headers .
   * Marks a deal as deleted. After 30 days, the deal will be permanently deleted.
   * @param id The ID of the deal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /deals/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteDealResponse200> deleteDealWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete a follower from a deal
   * Deletes a follower from a deal.
   * @param id The ID of the deal (required)
   * @param followerId The ID of the follower (required)
   * @return DeleteDealFollowerResponse200
   */
  @RequestLine("DELETE /deals/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  DeleteDealFollowerResponse200 deleteDealFollower(@Param("id") Integer id, @Param("followerId") Integer followerId);

  /**
   * Delete a follower from a deal
   * Similar to <code>deleteDealFollower</code> but it also returns the http response headers .
   * Deletes a follower from a deal.
   * @param id The ID of the deal (required)
   * @param followerId The ID of the follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /deals/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteDealFollowerResponse200> deleteDealFollowerWithHttpInfo(@Param("id") Integer id, @Param("followerId") Integer followerId);



  /**
   * Delete a participant from a deal
   * Deletes a participant from a deal.
   * @param id The ID of the deal (required)
   * @param dealParticipantId The ID of the participant of the deal (required)
   * @return DeleteDealParticipantResponse200
   */
  @RequestLine("DELETE /deals/{id}/participants/{dealParticipantId}")
  @Headers({
    "Accept: application/json",
  })
  DeleteDealParticipantResponse200 deleteDealParticipant(@Param("id") Integer id, @Param("dealParticipantId") Integer dealParticipantId);

  /**
   * Delete a participant from a deal
   * Similar to <code>deleteDealParticipant</code> but it also returns the http response headers .
   * Deletes a participant from a deal.
   * @param id The ID of the deal (required)
   * @param dealParticipantId The ID of the participant of the deal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /deals/{id}/participants/{dealParticipantId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteDealParticipantResponse200> deleteDealParticipantWithHttpInfo(@Param("id") Integer id, @Param("dealParticipantId") Integer dealParticipantId);



  /**
   * Delete an attached product from a deal
   * Deletes a product attachment from a deal, using the &#x60;product_attachment_id&#x60;.
   * @param id The ID of the deal (required)
   * @param productAttachmentId The product attachment ID. This is returned as &#x60;product_attachment_id&#x60; after attaching a product to a deal or as id when listing the products attached to a deal. (required)
   * @return DeleteDealProductResponse200
   */
  @RequestLine("DELETE /deals/{id}/products/{productAttachmentId}")
  @Headers({
    "Accept: application/json",
  })
  DeleteDealProductResponse200 deleteDealProduct(@Param("id") Integer id, @Param("productAttachmentId") Integer productAttachmentId);

  /**
   * Delete an attached product from a deal
   * Similar to <code>deleteDealProduct</code> but it also returns the http response headers .
   * Deletes a product attachment from a deal, using the &#x60;product_attachment_id&#x60;.
   * @param id The ID of the deal (required)
   * @param productAttachmentId The product attachment ID. This is returned as &#x60;product_attachment_id&#x60; after attaching a product to a deal or as id when listing the products attached to a deal. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /deals/{id}/products/{productAttachmentId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteDealProductResponse200> deleteDealProductWithHttpInfo(@Param("id") Integer id, @Param("productAttachmentId") Integer productAttachmentId);



  /**
   * Delete multiple deals in bulk
   * Marks multiple deals as deleted. After 30 days, the deals will be permanently deleted.
   * @param ids The comma-separated IDs that will be deleted (required)
   * @return DeleteDealsResponse200
   */
  @RequestLine("DELETE /deals?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteDealsResponse200 deleteDeals(@Param("ids") String ids);

  /**
   * Delete multiple deals in bulk
   * Similar to <code>deleteDeals</code> but it also returns the http response headers .
   * Marks multiple deals as deleted. After 30 days, the deals will be permanently deleted.
   * @param ids The comma-separated IDs that will be deleted (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /deals?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteDealsResponse200> deleteDealsWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple deals in bulk
   * Marks multiple deals as deleted. After 30 days, the deals will be permanently deleted.
   * Note, this is equivalent to the other <code>deleteDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated IDs that will be deleted (required)</li>
   *   </ul>
   * @return DeleteDealsResponse200
   */
  @RequestLine("DELETE /deals?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteDealsResponse200 deleteDeals(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple deals in bulk
  * Marks multiple deals as deleted. After 30 days, the deals will be permanently deleted.
  * Note, this is equivalent to the other <code>deleteDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated IDs that will be deleted (required)</li>
      *   </ul>
          * @return DeleteDealsResponse200
      */
      @RequestLine("DELETE /deals?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteDealsResponse200> deleteDealsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDeals</code> method in a fluent style.
   */
  public static class DeleteDealsQueryParams extends HashMap<String, Object> {
    public DeleteDealsQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Duplicate deal
   * Duplicates a deal.
   * @param id The ID of the deal (required)
   * @return DuplicateDealResponse200
   */
  @RequestLine("POST /deals/{id}/duplicate")
  @Headers({
    "Accept: application/json",
  })
  DuplicateDealResponse200 duplicateDeal(@Param("id") Integer id);

  /**
   * Duplicate deal
   * Similar to <code>duplicateDeal</code> but it also returns the http response headers .
   * Duplicates a deal.
   * @param id The ID of the deal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /deals/{id}/duplicate")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DuplicateDealResponse200> duplicateDealWithHttpInfo(@Param("id") Integer id);



  /**
   * Get details of a deal
   * Returns the details of a specific deal. Note that this also returns some additional fields which are not present when asking for all deals – such as deal age and stay in pipeline stages. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the &#x60;key&#x60; value of dealFields. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/getting-details-of-a-deal\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;getting details of a deal&lt;/a&gt;.
   * @param id The ID of the deal (required)
   * @return GetDealResponse200
   */
  @RequestLine("GET /deals/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetDealResponse200 getDeal(@Param("id") Integer id);

  /**
   * Get details of a deal
   * Similar to <code>getDeal</code> but it also returns the http response headers .
   * Returns the details of a specific deal. Note that this also returns some additional fields which are not present when asking for all deals – such as deal age and stay in pipeline stages. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the &#x60;key&#x60; value of dealFields. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/getting-details-of-a-deal\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;getting details of a deal&lt;/a&gt;.
   * @param id The ID of the deal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetDealResponse200> getDealWithHttpInfo(@Param("id") Integer id);



  /**
   * List activities associated with a deal
   * Lists activities associated with a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)
   * @param exclude A comma-separated string of activity IDs to exclude from result (optional)
   * @return GetDealActivitiesResponse200
   */
  @RequestLine("GET /deals/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
    "Accept: application/json",
  })
  GetDealActivitiesResponse200 getDealActivities(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("done") BigDecimal done, @Param("exclude") String exclude);

  /**
   * List activities associated with a deal
   * Similar to <code>getDealActivities</code> but it also returns the http response headers .
   * Lists activities associated with a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)
   * @param exclude A comma-separated string of activity IDs to exclude from result (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetDealActivitiesResponse200> getDealActivitiesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("done") BigDecimal done, @Param("exclude") String exclude);


  /**
   * List activities associated with a deal
   * Lists activities associated with a deal.
   * Note, this is equivalent to the other <code>getDealActivities</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealActivitiesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the deal (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)</li>
   *   <li>exclude - A comma-separated string of activity IDs to exclude from result (optional)</li>
   *   </ul>
   * @return GetDealActivitiesResponse200
   */
  @RequestLine("GET /deals/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
  "Accept: application/json",
  })
  GetDealActivitiesResponse200 getDealActivities(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List activities associated with a deal
  * Lists activities associated with a deal.
  * Note, this is equivalent to the other <code>getDealActivities</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the deal (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)</li>
          *   <li>exclude - A comma-separated string of activity IDs to exclude from result (optional)</li>
      *   </ul>
          * @return GetDealActivitiesResponse200
      */
      @RequestLine("GET /deals/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetDealActivitiesResponse200> getDealActivitiesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealActivities</code> method in a fluent style.
   */
  public static class GetDealActivitiesQueryParams extends HashMap<String, Object> {
    public GetDealActivitiesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealActivitiesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDealActivitiesQueryParams done(final BigDecimal value) {
      put("done", EncodingUtils.encode(value));
      return this;
    }
    public GetDealActivitiesQueryParams exclude(final String value) {
      put("exclude", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List files attached to a deal
   * Lists files associated with a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /deals/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getDealFiles(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);

  /**
   * List files attached to a deal
   * Similar to <code>getDealFiles</code> but it also returns the http response headers .
   * Lists files associated with a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedFilesResponse200> getDealFilesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);


  /**
   * List files attached to a deal
   * Lists files associated with a deal.
   * Note, this is equivalent to the other <code>getDealFiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealFilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the deal (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
   *   </ul>
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /deals/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getDealFiles(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List files attached to a deal
  * Lists files associated with a deal.
  * Note, this is equivalent to the other <code>getDealFiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the deal (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
      *   </ul>
          * @return GetAssociatedFilesResponse200
      */
      @RequestLine("GET /deals/{id}/files?start={start}&limit={limit}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedFilesResponse200> getDealFilesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealFiles</code> method in a fluent style.
   */
  public static class GetDealFilesQueryParams extends HashMap<String, Object> {
    public GetDealFilesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealFilesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDealFilesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List followers of a deal
   * Lists the followers of a deal.
   * @param id The ID of the deal (required)
   * @return GetAssociatedFollowersResponse200
   */
  @RequestLine("GET /deals/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedFollowersResponse200 getDealFollowers(@Param("id") Integer id);

  /**
   * List followers of a deal
   * Similar to <code>getDealFollowers</code> but it also returns the http response headers .
   * Lists the followers of a deal.
   * @param id The ID of the deal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedFollowersResponse200> getDealFollowersWithHttpInfo(@Param("id") Integer id);



  /**
   * List mail messages associated with a deal
   * Lists mail messages associated with a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetAssociatedMailMessagesResponse200
   */
  @RequestLine("GET /deals/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedMailMessagesResponse200 getDealMailMessages(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List mail messages associated with a deal
   * Similar to <code>getDealMailMessages</code> but it also returns the http response headers .
   * Lists mail messages associated with a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedMailMessagesResponse200> getDealMailMessagesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List mail messages associated with a deal
   * Lists mail messages associated with a deal.
   * Note, this is equivalent to the other <code>getDealMailMessages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealMailMessagesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the deal (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetAssociatedMailMessagesResponse200
   */
  @RequestLine("GET /deals/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedMailMessagesResponse200 getDealMailMessages(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List mail messages associated with a deal
  * Lists mail messages associated with a deal.
  * Note, this is equivalent to the other <code>getDealMailMessages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the deal (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetAssociatedMailMessagesResponse200
      */
      @RequestLine("GET /deals/{id}/mailMessages?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedMailMessagesResponse200> getDealMailMessagesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealMailMessages</code> method in a fluent style.
   */
  public static class GetDealMailMessagesQueryParams extends HashMap<String, Object> {
    public GetDealMailMessagesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealMailMessagesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List participants of a deal
   * Lists the participants associated with a deal.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetDealParticipantsResponse200
   */
  @RequestLine("GET /deals/{id}/participants?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetDealParticipantsResponse200 getDealParticipants(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List participants of a deal
   * Similar to <code>getDealParticipants</code> but it also returns the http response headers .
   * Lists the participants associated with a deal.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/participants?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetDealParticipantsResponse200> getDealParticipantsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List participants of a deal
   * Lists the participants associated with a deal.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * Note, this is equivalent to the other <code>getDealParticipants</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealParticipantsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the deal (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetDealParticipantsResponse200
   */
  @RequestLine("GET /deals/{id}/participants?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetDealParticipantsResponse200 getDealParticipants(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List participants of a deal
  * Lists the participants associated with a deal.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
  * Note, this is equivalent to the other <code>getDealParticipants</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the deal (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetDealParticipantsResponse200
      */
      @RequestLine("GET /deals/{id}/participants?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetDealParticipantsResponse200> getDealParticipantsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealParticipants</code> method in a fluent style.
   */
  public static class GetDealParticipantsQueryParams extends HashMap<String, Object> {
    public GetDealParticipantsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealParticipantsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List all persons associated with a deal
   * Lists all persons associated with a deal, regardless of whether the person is the primary contact of the deal, or added as a participant.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return ListPersonsResponse200
   */
  @RequestLine("GET /deals/{id}/persons?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ListPersonsResponse200 getDealPersons(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List all persons associated with a deal
   * Similar to <code>getDealPersons</code> but it also returns the http response headers .
   * Lists all persons associated with a deal, regardless of whether the person is the primary contact of the deal, or added as a participant.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/persons?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ListPersonsResponse200> getDealPersonsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List all persons associated with a deal
   * Lists all persons associated with a deal, regardless of whether the person is the primary contact of the deal, or added as a participant.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * Note, this is equivalent to the other <code>getDealPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the deal (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return ListPersonsResponse200
   */
  @RequestLine("GET /deals/{id}/persons?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  ListPersonsResponse200 getDealPersons(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List all persons associated with a deal
  * Lists all persons associated with a deal, regardless of whether the person is the primary contact of the deal, or added as a participant.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
  * Note, this is equivalent to the other <code>getDealPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the deal (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return ListPersonsResponse200
      */
      @RequestLine("GET /deals/{id}/persons?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ListPersonsResponse200> getDealPersonsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealPersons</code> method in a fluent style.
   */
  public static class GetDealPersonsQueryParams extends HashMap<String, Object> {
    public GetDealPersonsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealPersonsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List products attached to a deal
   * Lists products attached to a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param includeProductData Whether to fetch product data along with each attached product (1) or not (0, default) (optional)
   * @return ListProductsResponse200
   */
  @RequestLine("GET /deals/{id}/products?start={start}&limit={limit}&include_product_data={includeProductData}")
  @Headers({
    "Accept: application/json",
  })
  ListProductsResponse200 getDealProducts(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("includeProductData") BigDecimal includeProductData);

  /**
   * List products attached to a deal
   * Similar to <code>getDealProducts</code> but it also returns the http response headers .
   * Lists products attached to a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param includeProductData Whether to fetch product data along with each attached product (1) or not (0, default) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/products?start={start}&limit={limit}&include_product_data={includeProductData}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ListProductsResponse200> getDealProductsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("includeProductData") BigDecimal includeProductData);


  /**
   * List products attached to a deal
   * Lists products attached to a deal.
   * Note, this is equivalent to the other <code>getDealProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the deal (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>includeProductData - Whether to fetch product data along with each attached product (1) or not (0, default) (optional)</li>
   *   </ul>
   * @return ListProductsResponse200
   */
  @RequestLine("GET /deals/{id}/products?start={start}&limit={limit}&include_product_data={includeProductData}")
  @Headers({
  "Accept: application/json",
  })
  ListProductsResponse200 getDealProducts(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List products attached to a deal
  * Lists products attached to a deal.
  * Note, this is equivalent to the other <code>getDealProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the deal (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>includeProductData - Whether to fetch product data along with each attached product (1) or not (0, default) (optional)</li>
      *   </ul>
          * @return ListProductsResponse200
      */
      @RequestLine("GET /deals/{id}/products?start={start}&limit={limit}&include_product_data={includeProductData}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ListProductsResponse200> getDealProductsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealProducts</code> method in a fluent style.
   */
  public static class GetDealProductsQueryParams extends HashMap<String, Object> {
    public GetDealProductsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealProductsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDealProductsQueryParams includeProductData(final BigDecimal value) {
      put("include_product_data", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List updates about a deal
   * Lists updates about a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param allChanges Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)
   * @param items A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)
   * @return GetDealUpdatesResponse200
   */
  @RequestLine("GET /deals/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
    "Accept: application/json",
  })
  GetDealUpdatesResponse200 getDealUpdates(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("allChanges") String allChanges, @Param("items") String items);

  /**
   * List updates about a deal
   * Similar to <code>getDealUpdates</code> but it also returns the http response headers .
   * Lists updates about a deal.
   * @param id The ID of the deal (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param allChanges Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)
   * @param items A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetDealUpdatesResponse200> getDealUpdatesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("allChanges") String allChanges, @Param("items") String items);


  /**
   * List updates about a deal
   * Lists updates about a deal.
   * Note, this is equivalent to the other <code>getDealUpdates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealUpdatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the deal (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>allChanges - Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)</li>
   *   <li>items - A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)</li>
   *   </ul>
   * @return GetDealUpdatesResponse200
   */
  @RequestLine("GET /deals/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
  "Accept: application/json",
  })
  GetDealUpdatesResponse200 getDealUpdates(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List updates about a deal
  * Lists updates about a deal.
  * Note, this is equivalent to the other <code>getDealUpdates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the deal (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>allChanges - Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)</li>
          *   <li>items - A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)</li>
      *   </ul>
          * @return GetDealUpdatesResponse200
      */
      @RequestLine("GET /deals/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetDealUpdatesResponse200> getDealUpdatesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealUpdates</code> method in a fluent style.
   */
  public static class GetDealUpdatesQueryParams extends HashMap<String, Object> {
    public GetDealUpdatesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealUpdatesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDealUpdatesQueryParams allChanges(final String value) {
      put("all_changes", EncodingUtils.encode(value));
      return this;
    }
    public GetDealUpdatesQueryParams items(final String value) {
      put("items", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List permitted users
   * Lists the users permitted to access a deal.
   * @param id The ID of the deal (required)
   * @return ListPermittedUsersResponse200
   */
  @RequestLine("GET /deals/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  ListPermittedUsersResponse200 getDealUsers(@Param("id") Integer id);

  /**
   * List permitted users
   * Similar to <code>getDealUsers</code> but it also returns the http response headers .
   * Lists the users permitted to access a deal.
   * @param id The ID of the deal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ListPermittedUsersResponse200> getDealUsersWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all deals
   * Returns all deals. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/getting-all-deals\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;getting all deals&lt;/a&gt;.
   * @param userId If supplied, only deals matching the given user will be returned. However, &#x60;filter_id&#x60; and &#x60;owned_by_you&#x60; takes precedence over &#x60;user_id&#x60; when supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param stageId If supplied, only deals within the given stage will be returned (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @param ownedByYou When supplied, only deals owned by you are returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owned_by_you&#x60; when both are supplied. (optional)
   * @return GetDealsResponse200
   */
  @RequestLine("GET /deals?user_id={userId}&filter_id={filterId}&stage_id={stageId}&status={status}&start={start}&limit={limit}&sort={sort}&owned_by_you={ownedByYou}")
  @Headers({
    "Accept: application/json",
  })
  GetDealsResponse200 getDeals(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("stageId") Integer stageId, @Param("status") String status, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort, @Param("ownedByYou") BigDecimal ownedByYou);

  /**
   * Get all deals
   * Similar to <code>getDeals</code> but it also returns the http response headers .
   * Returns all deals. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/getting-all-deals\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;getting all deals&lt;/a&gt;.
   * @param userId If supplied, only deals matching the given user will be returned. However, &#x60;filter_id&#x60; and &#x60;owned_by_you&#x60; takes precedence over &#x60;user_id&#x60; when supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param stageId If supplied, only deals within the given stage will be returned (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @param ownedByYou When supplied, only deals owned by you are returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owned_by_you&#x60; when both are supplied. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals?user_id={userId}&filter_id={filterId}&stage_id={stageId}&status={status}&start={start}&limit={limit}&sort={sort}&owned_by_you={ownedByYou}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetDealsResponse200> getDealsWithHttpInfo(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("stageId") Integer stageId, @Param("status") String status, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort, @Param("ownedByYou") BigDecimal ownedByYou);


  /**
   * Get all deals
   * Returns all deals. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/getting-all-deals\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;getting all deals&lt;/a&gt;.
   * Note, this is equivalent to the other <code>getDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - If supplied, only deals matching the given user will be returned. However, &#x60;filter_id&#x60; and &#x60;owned_by_you&#x60; takes precedence over &#x60;user_id&#x60; when supplied. (optional)</li>
   *   <li>filterId - The ID of the filter to use (optional)</li>
   *   <li>stageId - If supplied, only deals within the given stage will be returned (optional)</li>
   *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
   *   <li>ownedByYou - When supplied, only deals owned by you are returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owned_by_you&#x60; when both are supplied. (optional)</li>
   *   </ul>
   * @return GetDealsResponse200
   */
  @RequestLine("GET /deals?user_id={userId}&filter_id={filterId}&stage_id={stageId}&status={status}&start={start}&limit={limit}&sort={sort}&owned_by_you={ownedByYou}")
  @Headers({
  "Accept: application/json",
  })
  GetDealsResponse200 getDeals(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all deals
  * Returns all deals. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/getting-all-deals\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;getting all deals&lt;/a&gt;.
  * Note, this is equivalent to the other <code>getDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>userId - If supplied, only deals matching the given user will be returned. However, &#x60;filter_id&#x60; and &#x60;owned_by_you&#x60; takes precedence over &#x60;user_id&#x60; when supplied. (optional)</li>
          *   <li>filterId - The ID of the filter to use (optional)</li>
          *   <li>stageId - If supplied, only deals within the given stage will be returned (optional)</li>
          *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
          *   <li>ownedByYou - When supplied, only deals owned by you are returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;owned_by_you&#x60; when both are supplied. (optional)</li>
      *   </ul>
          * @return GetDealsResponse200
      */
      @RequestLine("GET /deals?user_id={userId}&filter_id={filterId}&stage_id={stageId}&status={status}&start={start}&limit={limit}&sort={sort}&owned_by_you={ownedByYou}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetDealsResponse200> getDealsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDeals</code> method in a fluent style.
   */
  public static class GetDealsQueryParams extends HashMap<String, Object> {
    public GetDealsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsQueryParams stageId(final Integer value) {
      put("stage_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsQueryParams ownedByYou(final BigDecimal value) {
      put("owned_by_you", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get deals summary
   * Returns a summary of all the deals.
   * @param status Only fetch deals with a specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost (optional)
   * @param filterId &lt;code&gt;user_id&lt;/code&gt; will not be considered. Only deals matching the given filter will be returned. (optional)
   * @param userId Only deals matching the given user will be returned. &#x60;user_id&#x60; will not be considered if you use &#x60;filter_id&#x60;. (optional)
   * @param stageId Only deals within the given stage will be returned (optional)
   * @return GetDealsSummaryResponse200
   */
  @RequestLine("GET /deals/summary?status={status}&filter_id={filterId}&user_id={userId}&stage_id={stageId}")
  @Headers({
    "Accept: application/json",
  })
  GetDealsSummaryResponse200 getDealsSummary(@Param("status") String status, @Param("filterId") Integer filterId, @Param("userId") Integer userId, @Param("stageId") Integer stageId);

  /**
   * Get deals summary
   * Similar to <code>getDealsSummary</code> but it also returns the http response headers .
   * Returns a summary of all the deals.
   * @param status Only fetch deals with a specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost (optional)
   * @param filterId &lt;code&gt;user_id&lt;/code&gt; will not be considered. Only deals matching the given filter will be returned. (optional)
   * @param userId Only deals matching the given user will be returned. &#x60;user_id&#x60; will not be considered if you use &#x60;filter_id&#x60;. (optional)
   * @param stageId Only deals within the given stage will be returned (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/summary?status={status}&filter_id={filterId}&user_id={userId}&stage_id={stageId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetDealsSummaryResponse200> getDealsSummaryWithHttpInfo(@Param("status") String status, @Param("filterId") Integer filterId, @Param("userId") Integer userId, @Param("stageId") Integer stageId);


  /**
   * Get deals summary
   * Returns a summary of all the deals.
   * Note, this is equivalent to the other <code>getDealsSummary</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealsSummaryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>status - Only fetch deals with a specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost (optional)</li>
   *   <li>filterId - &lt;code&gt;user_id&lt;/code&gt; will not be considered. Only deals matching the given filter will be returned. (optional)</li>
   *   <li>userId - Only deals matching the given user will be returned. &#x60;user_id&#x60; will not be considered if you use &#x60;filter_id&#x60;. (optional)</li>
   *   <li>stageId - Only deals within the given stage will be returned (optional)</li>
   *   </ul>
   * @return GetDealsSummaryResponse200
   */
  @RequestLine("GET /deals/summary?status={status}&filter_id={filterId}&user_id={userId}&stage_id={stageId}")
  @Headers({
  "Accept: application/json",
  })
  GetDealsSummaryResponse200 getDealsSummary(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get deals summary
  * Returns a summary of all the deals.
  * Note, this is equivalent to the other <code>getDealsSummary</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>status - Only fetch deals with a specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost (optional)</li>
          *   <li>filterId - &lt;code&gt;user_id&lt;/code&gt; will not be considered. Only deals matching the given filter will be returned. (optional)</li>
          *   <li>userId - Only deals matching the given user will be returned. &#x60;user_id&#x60; will not be considered if you use &#x60;filter_id&#x60;. (optional)</li>
          *   <li>stageId - Only deals within the given stage will be returned (optional)</li>
      *   </ul>
          * @return GetDealsSummaryResponse200
      */
      @RequestLine("GET /deals/summary?status={status}&filter_id={filterId}&user_id={userId}&stage_id={stageId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetDealsSummaryResponse200> getDealsSummaryWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealsSummary</code> method in a fluent style.
   */
  public static class GetDealsSummaryQueryParams extends HashMap<String, Object> {
    public GetDealsSummaryQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsSummaryQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsSummaryQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsSummaryQueryParams stageId(final Integer value) {
      put("stage_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get deals timeline
   * Returns open and won deals, grouped by a defined interval of time set in a date-type dealField (&#x60;field_key&#x60;) — e.g. when month is the chosen interval, and 3 months are asked starting from January 1st, 2012, deals are returned grouped into 3 groups — January, February and March — based on the value of the given &#x60;field_key&#x60;.
   * @param startDate The date when the first interval starts. Format: YYYY-MM-DD (required)
   * @param interval The type of the interval&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;day&#x60;&lt;/td&gt;&lt;td&gt;Day&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;week&#x60;&lt;/td&gt;&lt;td&gt;A full week (7 days) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;month&#x60;&lt;/td&gt;&lt;td&gt;A full month (depending on the number of days in given month) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;quarter&#x60;&lt;/td&gt;&lt;td&gt;A full quarter (3 months) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt; (required)
   * @param amount The number of given intervals, starting from &#x60;start_date&#x60;, to fetch. E.g. 3 (months). (required)
   * @param fieldKey The date field key which deals will be retrieved from (required)
   * @param userId If supplied, only deals matching the given user will be returned (optional)
   * @param pipelineId If supplied, only deals matching the given pipeline will be returned (optional)
   * @param filterId If supplied, only deals matching the given filter will be returned (optional)
   * @param excludeDeals Whether to exclude deals list (1) or not (0). Note that when deals are excluded, the timeline summary (counts and values) is still returned. (optional)
   * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, &#x60;totals_converted&#x60; is returned per each interval which contains the currency-converted total amounts in the given currency. You may also set this parameter to &#x60;default_currency&#x60; in which case the user&#39;s default currency is used. (optional)
   * @return GetDealsTimelineResponse200
   */
  @RequestLine("GET /deals/timeline?start_date={startDate}&interval={interval}&amount={amount}&field_key={fieldKey}&user_id={userId}&pipeline_id={pipelineId}&filter_id={filterId}&exclude_deals={excludeDeals}&totals_convert_currency={totalsConvertCurrency}")
  @Headers({
    "Accept: application/json",
  })
  GetDealsTimelineResponse200 getDealsTimeline(@Param("startDate") LocalDate startDate, @Param("interval") String interval, @Param("amount") Integer amount, @Param("fieldKey") String fieldKey, @Param("userId") Integer userId, @Param("pipelineId") Integer pipelineId, @Param("filterId") Integer filterId, @Param("excludeDeals") BigDecimal excludeDeals, @Param("totalsConvertCurrency") String totalsConvertCurrency);

  /**
   * Get deals timeline
   * Similar to <code>getDealsTimeline</code> but it also returns the http response headers .
   * Returns open and won deals, grouped by a defined interval of time set in a date-type dealField (&#x60;field_key&#x60;) — e.g. when month is the chosen interval, and 3 months are asked starting from January 1st, 2012, deals are returned grouped into 3 groups — January, February and March — based on the value of the given &#x60;field_key&#x60;.
   * @param startDate The date when the first interval starts. Format: YYYY-MM-DD (required)
   * @param interval The type of the interval&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;day&#x60;&lt;/td&gt;&lt;td&gt;Day&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;week&#x60;&lt;/td&gt;&lt;td&gt;A full week (7 days) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;month&#x60;&lt;/td&gt;&lt;td&gt;A full month (depending on the number of days in given month) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;quarter&#x60;&lt;/td&gt;&lt;td&gt;A full quarter (3 months) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt; (required)
   * @param amount The number of given intervals, starting from &#x60;start_date&#x60;, to fetch. E.g. 3 (months). (required)
   * @param fieldKey The date field key which deals will be retrieved from (required)
   * @param userId If supplied, only deals matching the given user will be returned (optional)
   * @param pipelineId If supplied, only deals matching the given pipeline will be returned (optional)
   * @param filterId If supplied, only deals matching the given filter will be returned (optional)
   * @param excludeDeals Whether to exclude deals list (1) or not (0). Note that when deals are excluded, the timeline summary (counts and values) is still returned. (optional)
   * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, &#x60;totals_converted&#x60; is returned per each interval which contains the currency-converted total amounts in the given currency. You may also set this parameter to &#x60;default_currency&#x60; in which case the user&#39;s default currency is used. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/timeline?start_date={startDate}&interval={interval}&amount={amount}&field_key={fieldKey}&user_id={userId}&pipeline_id={pipelineId}&filter_id={filterId}&exclude_deals={excludeDeals}&totals_convert_currency={totalsConvertCurrency}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetDealsTimelineResponse200> getDealsTimelineWithHttpInfo(@Param("startDate") LocalDate startDate, @Param("interval") String interval, @Param("amount") Integer amount, @Param("fieldKey") String fieldKey, @Param("userId") Integer userId, @Param("pipelineId") Integer pipelineId, @Param("filterId") Integer filterId, @Param("excludeDeals") BigDecimal excludeDeals, @Param("totalsConvertCurrency") String totalsConvertCurrency);


  /**
   * Get deals timeline
   * Returns open and won deals, grouped by a defined interval of time set in a date-type dealField (&#x60;field_key&#x60;) — e.g. when month is the chosen interval, and 3 months are asked starting from January 1st, 2012, deals are returned grouped into 3 groups — January, February and March — based on the value of the given &#x60;field_key&#x60;.
   * Note, this is equivalent to the other <code>getDealsTimeline</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealsTimelineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startDate - The date when the first interval starts. Format: YYYY-MM-DD (required)</li>
   *   <li>interval - The type of the interval&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;day&#x60;&lt;/td&gt;&lt;td&gt;Day&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;week&#x60;&lt;/td&gt;&lt;td&gt;A full week (7 days) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;month&#x60;&lt;/td&gt;&lt;td&gt;A full month (depending on the number of days in given month) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;quarter&#x60;&lt;/td&gt;&lt;td&gt;A full quarter (3 months) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt; (required)</li>
   *   <li>amount - The number of given intervals, starting from &#x60;start_date&#x60;, to fetch. E.g. 3 (months). (required)</li>
   *   <li>fieldKey - The date field key which deals will be retrieved from (required)</li>
   *   <li>userId - If supplied, only deals matching the given user will be returned (optional)</li>
   *   <li>pipelineId - If supplied, only deals matching the given pipeline will be returned (optional)</li>
   *   <li>filterId - If supplied, only deals matching the given filter will be returned (optional)</li>
   *   <li>excludeDeals - Whether to exclude deals list (1) or not (0). Note that when deals are excluded, the timeline summary (counts and values) is still returned. (optional)</li>
   *   <li>totalsConvertCurrency - The 3-letter currency code of any of the supported currencies. When supplied, &#x60;totals_converted&#x60; is returned per each interval which contains the currency-converted total amounts in the given currency. You may also set this parameter to &#x60;default_currency&#x60; in which case the user&#39;s default currency is used. (optional)</li>
   *   </ul>
   * @return GetDealsTimelineResponse200
   */
  @RequestLine("GET /deals/timeline?start_date={startDate}&interval={interval}&amount={amount}&field_key={fieldKey}&user_id={userId}&pipeline_id={pipelineId}&filter_id={filterId}&exclude_deals={excludeDeals}&totals_convert_currency={totalsConvertCurrency}")
  @Headers({
  "Accept: application/json",
  })
  GetDealsTimelineResponse200 getDealsTimeline(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get deals timeline
  * Returns open and won deals, grouped by a defined interval of time set in a date-type dealField (&#x60;field_key&#x60;) — e.g. when month is the chosen interval, and 3 months are asked starting from January 1st, 2012, deals are returned grouped into 3 groups — January, February and March — based on the value of the given &#x60;field_key&#x60;.
  * Note, this is equivalent to the other <code>getDealsTimeline</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startDate - The date when the first interval starts. Format: YYYY-MM-DD (required)</li>
          *   <li>interval - The type of the interval&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;day&#x60;&lt;/td&gt;&lt;td&gt;Day&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;week&#x60;&lt;/td&gt;&lt;td&gt;A full week (7 days) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;month&#x60;&lt;/td&gt;&lt;td&gt;A full month (depending on the number of days in given month) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;quarter&#x60;&lt;/td&gt;&lt;td&gt;A full quarter (3 months) starting from &#x60;start_date&#x60;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt; (required)</li>
          *   <li>amount - The number of given intervals, starting from &#x60;start_date&#x60;, to fetch. E.g. 3 (months). (required)</li>
          *   <li>fieldKey - The date field key which deals will be retrieved from (required)</li>
          *   <li>userId - If supplied, only deals matching the given user will be returned (optional)</li>
          *   <li>pipelineId - If supplied, only deals matching the given pipeline will be returned (optional)</li>
          *   <li>filterId - If supplied, only deals matching the given filter will be returned (optional)</li>
          *   <li>excludeDeals - Whether to exclude deals list (1) or not (0). Note that when deals are excluded, the timeline summary (counts and values) is still returned. (optional)</li>
          *   <li>totalsConvertCurrency - The 3-letter currency code of any of the supported currencies. When supplied, &#x60;totals_converted&#x60; is returned per each interval which contains the currency-converted total amounts in the given currency. You may also set this parameter to &#x60;default_currency&#x60; in which case the user&#39;s default currency is used. (optional)</li>
      *   </ul>
          * @return GetDealsTimelineResponse200
      */
      @RequestLine("GET /deals/timeline?start_date={startDate}&interval={interval}&amount={amount}&field_key={fieldKey}&user_id={userId}&pipeline_id={pipelineId}&filter_id={filterId}&exclude_deals={excludeDeals}&totals_convert_currency={totalsConvertCurrency}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetDealsTimelineResponse200> getDealsTimelineWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealsTimeline</code> method in a fluent style.
   */
  public static class GetDealsTimelineQueryParams extends HashMap<String, Object> {
    public GetDealsTimelineQueryParams startDate(final LocalDate value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams interval(final String value) {
      put("interval", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams amount(final Integer value) {
      put("amount", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams fieldKey(final String value) {
      put("field_key", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams pipelineId(final Integer value) {
      put("pipeline_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams excludeDeals(final BigDecimal value) {
      put("exclude_deals", EncodingUtils.encode(value));
      return this;
    }
    public GetDealsTimelineQueryParams totalsConvertCurrency(final String value) {
      put("totals_convert_currency", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Merge two deals
   * Merges a deal with another deal. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/merging-two-deals\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;merging two deals&lt;/a&gt;.
   * @param id The ID of the deal (required)
   * @param mergeDealsRequest  (optional)
   * @return MergeDealsResponse200
   */
  @RequestLine("PUT /deals/{id}/merge")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MergeDealsResponse200 mergeDeals(@Param("id") Integer id, MergeDealsRequest mergeDealsRequest);

  /**
   * Merge two deals
   * Similar to <code>mergeDeals</code> but it also returns the http response headers .
   * Merges a deal with another deal. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/merging-two-deals\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;merging two deals&lt;/a&gt;.
   * @param id The ID of the deal (required)
   * @param mergeDealsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /deals/{id}/merge")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MergeDealsResponse200> mergeDealsWithHttpInfo(@Param("id") Integer id, MergeDealsRequest mergeDealsRequest);



  /**
   * Search deals
   * Searches all deals by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found deals can be filtered by the person ID and the organization ID.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param personId Will filter deals by the provided person ID. The upper limit of found deals associated with the person is 2000. (optional)
   * @param organizationId Will filter deals by the provided organization ID. The upper limit of found deals associated with the organization is 2000. (optional)
   * @param status Will filter deals by the provided specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost. The upper limit of found deals associated with the status is 2000. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return SearchDealsResponse200
   */
  @RequestLine("GET /deals/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&status={status}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  SearchDealsResponse200 searchDeals(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("personId") Integer personId, @Param("organizationId") Integer organizationId, @Param("status") String status, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Search deals
   * Similar to <code>searchDeals</code> but it also returns the http response headers .
   * Searches all deals by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found deals can be filtered by the person ID and the organization ID.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param personId Will filter deals by the provided person ID. The upper limit of found deals associated with the person is 2000. (optional)
   * @param organizationId Will filter deals by the provided organization ID. The upper limit of found deals associated with the organization is 2000. (optional)
   * @param status Will filter deals by the provided specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost. The upper limit of found deals associated with the status is 2000. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /deals/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&status={status}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchDealsResponse200> searchDealsWithHttpInfo(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("personId") Integer personId, @Param("organizationId") Integer organizationId, @Param("status") String status, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Search deals
   * Searches all deals by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found deals can be filtered by the person ID and the organization ID.
   * Note, this is equivalent to the other <code>searchDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
   *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
   *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
   *   <li>personId - Will filter deals by the provided person ID. The upper limit of found deals associated with the person is 2000. (optional)</li>
   *   <li>organizationId - Will filter deals by the provided organization ID. The upper limit of found deals associated with the organization is 2000. (optional)</li>
   *   <li>status - Will filter deals by the provided specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost. The upper limit of found deals associated with the status is 2000. (optional)</li>
   *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
   *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return SearchDealsResponse200
   */
  @RequestLine("GET /deals/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&status={status}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  SearchDealsResponse200 searchDeals(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Search deals
  * Searches all deals by title, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found deals can be filtered by the person ID and the organization ID.
  * Note, this is equivalent to the other <code>searchDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
          *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
          *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
          *   <li>personId - Will filter deals by the provided person ID. The upper limit of found deals associated with the person is 2000. (optional)</li>
          *   <li>organizationId - Will filter deals by the provided organization ID. The upper limit of found deals associated with the organization is 2000. (optional)</li>
          *   <li>status - Will filter deals by the provided specific status. open &#x3D; Open, won &#x3D; Won, lost &#x3D; Lost. The upper limit of found deals associated with the status is 2000. (optional)</li>
          *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
          *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return SearchDealsResponse200
      */
      @RequestLine("GET /deals/search?term={term}&fields={fields}&exact_match={exactMatch}&person_id={personId}&organization_id={organizationId}&status={status}&include_fields={includeFields}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchDealsResponse200> searchDealsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchDeals</code> method in a fluent style.
   */
  public static class SearchDealsQueryParams extends HashMap<String, Object> {
    public SearchDealsQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams exactMatch(final Boolean value) {
      put("exact_match", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams personId(final Integer value) {
      put("person_id", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams organizationId(final Integer value) {
      put("organization_id", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams includeFields(final String value) {
      put("include_fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public SearchDealsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a deal
   * Updates the properties of a deal. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-a-deal\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating a deal&lt;/a&gt;.
   * @param id The ID of the deal (required)
   * @param updateDealRequest  (optional)
   * @return DealResponse200
   */
  @RequestLine("PUT /deals/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DealResponse200 updateDeal(@Param("id") Integer id, UpdateDealRequest updateDealRequest);

  /**
   * Update a deal
   * Similar to <code>updateDeal</code> but it also returns the http response headers .
   * Updates the properties of a deal. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-a-deal\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating a deal&lt;/a&gt;.
   * @param id The ID of the deal (required)
   * @param updateDealRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /deals/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DealResponse200> updateDealWithHttpInfo(@Param("id") Integer id, UpdateDealRequest updateDealRequest);



  /**
   * Update the product attached to a deal
   * Updates the details of the product that has been attached to a deal.
   * @param id The ID of the deal (required)
   * @param productAttachmentId The ID of the deal-product (the ID of the product attached to the deal) (required)
   * @param basicDealProductRequest  (optional)
   * @return GetProductAttachementResponse200
   */
  @RequestLine("PUT /deals/{id}/products/{productAttachmentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GetProductAttachementResponse200 updateDealProduct(@Param("id") Integer id, @Param("productAttachmentId") Integer productAttachmentId, BasicDealProductRequest basicDealProductRequest);

  /**
   * Update the product attached to a deal
   * Similar to <code>updateDealProduct</code> but it also returns the http response headers .
   * Updates the details of the product that has been attached to a deal.
   * @param id The ID of the deal (required)
   * @param productAttachmentId The ID of the deal-product (the ID of the product attached to the deal) (required)
   * @param basicDealProductRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /deals/{id}/products/{productAttachmentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GetProductAttachementResponse200> updateDealProductWithHttpInfo(@Param("id") Integer id, @Param("productAttachmentId") Integer productAttachmentId, BasicDealProductRequest basicDealProductRequest);


}
