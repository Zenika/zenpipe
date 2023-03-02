package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddPersonFollowerRequest;
import com.zenika.pipedrive.model.AddPersonFollowerResponse200;
import com.zenika.pipedrive.model.AddPersonPictureResponse200;
import com.zenika.pipedrive.model.AddPersonRequest;
import com.zenika.pipedrive.model.AddPersonResponse200;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeletePersonResponse200;
import com.zenika.pipedrive.model.DeletePersonsResponse200;
import java.io.File;
import com.zenika.pipedrive.model.GetAssociatedActivitiesResponse200;
import com.zenika.pipedrive.model.GetAssociatedDealsResponse200;
import com.zenika.pipedrive.model.GetAssociatedFilesResponse200;
import com.zenika.pipedrive.model.GetAssociatedFollowersResponse200;
import com.zenika.pipedrive.model.GetAssociatedMailMessagesResponse200;
import com.zenika.pipedrive.model.GetAssociatedPersonUpdatesResponse200;
import com.zenika.pipedrive.model.GetPersonProductsResponse200;
import com.zenika.pipedrive.model.GetPersonResponse200;
import com.zenika.pipedrive.model.GetPersonsResponse200;
import com.zenika.pipedrive.model.ListPermittedUsersResponse2001;
import com.zenika.pipedrive.model.MergePersonsRequest;
import com.zenika.pipedrive.model.MergePersonsResponse200;
import com.zenika.pipedrive.model.SearchPersonsResponse200;
import com.zenika.pipedrive.model.UpdatePersonRequest;
import com.zenika.pipedrive.model.UpdatePersonResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface PersonsApi extends ApiClient.Api {


  /**
   * Add a person
   * Adds a new person. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the personFields and look for &#x60;key&#x60; values.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also accept and return the &#x60;data.marketing_status&#x60; field.
   * @param addPersonRequest  (optional)
   * @return AddPersonResponse200
   */
  @RequestLine("POST /persons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddPersonResponse200 addPerson(AddPersonRequest addPersonRequest);

  /**
   * Add a person
   * Similar to <code>addPerson</code> but it also returns the http response headers .
   * Adds a new person. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the personFields and look for &#x60;key&#x60; values.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also accept and return the &#x60;data.marketing_status&#x60; field.
   * @param addPersonRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /persons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddPersonResponse200> addPersonWithHttpInfo(AddPersonRequest addPersonRequest);



  /**
   * Add a follower to a person
   * Adds a follower to a person.
   * @param id The ID of the person (required)
   * @param addPersonFollowerRequest  (optional)
   * @return AddPersonFollowerResponse200
   */
  @RequestLine("POST /persons/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddPersonFollowerResponse200 addPersonFollower(@Param("id") Integer id, AddPersonFollowerRequest addPersonFollowerRequest);

  /**
   * Add a follower to a person
   * Similar to <code>addPersonFollower</code> but it also returns the http response headers .
   * Adds a follower to a person.
   * @param id The ID of the person (required)
   * @param addPersonFollowerRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /persons/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddPersonFollowerResponse200> addPersonFollowerWithHttpInfo(@Param("id") Integer id, AddPersonFollowerRequest addPersonFollowerRequest);



  /**
   * Add person picture
   * Adds a picture to a person. If a picture is already set, the old picture will be replaced. Added image (or the cropping parameters supplied with the request) should have an equal width and height and should be at least 128 pixels. GIF, JPG and PNG are accepted. All added images will be resized to 128 and 512 pixel wide squares.
   * @param id The ID of the person (required)
   * @param file One image supplied in the multipart/form-data encoding (required)
   * @param cropX X coordinate to where start cropping form (in pixels) (optional)
   * @param cropY Y coordinate to where start cropping form (in pixels) (optional)
   * @param cropWidth The width of the cropping area (in pixels) (optional)
   * @param cropHeight The height of the cropping area (in pixels) (optional)
   * @return AddPersonPictureResponse200
   */
  @RequestLine("POST /persons/{id}/picture")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  AddPersonPictureResponse200 addPersonPicture(@Param("id") Integer id, @Param("file") File file, @Param("crop_x") Integer cropX, @Param("crop_y") Integer cropY, @Param("crop_width") Integer cropWidth, @Param("crop_height") Integer cropHeight);

  /**
   * Add person picture
   * Similar to <code>addPersonPicture</code> but it also returns the http response headers .
   * Adds a picture to a person. If a picture is already set, the old picture will be replaced. Added image (or the cropping parameters supplied with the request) should have an equal width and height and should be at least 128 pixels. GIF, JPG and PNG are accepted. All added images will be resized to 128 and 512 pixel wide squares.
   * @param id The ID of the person (required)
   * @param file One image supplied in the multipart/form-data encoding (required)
   * @param cropX X coordinate to where start cropping form (in pixels) (optional)
   * @param cropY Y coordinate to where start cropping form (in pixels) (optional)
   * @param cropWidth The width of the cropping area (in pixels) (optional)
   * @param cropHeight The height of the cropping area (in pixels) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /persons/{id}/picture")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  ApiResponse<AddPersonPictureResponse200> addPersonPictureWithHttpInfo(@Param("id") Integer id, @Param("file") File file, @Param("crop_x") Integer cropX, @Param("crop_y") Integer cropY, @Param("crop_width") Integer cropWidth, @Param("crop_height") Integer cropHeight);



  /**
   * Delete a person
   * Marks a person as deleted. After 30 days, the person will be permanently deleted.
   * @param id The ID of the person (required)
   * @return DeletePersonResponse200
   */
  @RequestLine("DELETE /persons/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeletePersonResponse200 deletePerson(@Param("id") Integer id);

  /**
   * Delete a person
   * Similar to <code>deletePerson</code> but it also returns the http response headers .
   * Marks a person as deleted. After 30 days, the person will be permanently deleted.
   * @param id The ID of the person (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /persons/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeletePersonResponse200> deletePersonWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete a follower from a person
   * Deletes a follower from a person.
   * @param id The ID of the person (required)
   * @param followerId The ID of the follower (required)
   * @return DeletePersonResponse200
   */
  @RequestLine("DELETE /persons/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  DeletePersonResponse200 deletePersonFollower(@Param("id") Integer id, @Param("followerId") Integer followerId);

  /**
   * Delete a follower from a person
   * Similar to <code>deletePersonFollower</code> but it also returns the http response headers .
   * Deletes a follower from a person.
   * @param id The ID of the person (required)
   * @param followerId The ID of the follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /persons/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeletePersonResponse200> deletePersonFollowerWithHttpInfo(@Param("id") Integer id, @Param("followerId") Integer followerId);



  /**
   * Delete person picture
   * Deletes a person’s picture.
   * @param id The ID of the person (required)
   * @return DeletePersonResponse200
   */
  @RequestLine("DELETE /persons/{id}/picture")
  @Headers({
    "Accept: application/json",
  })
  DeletePersonResponse200 deletePersonPicture(@Param("id") Integer id);

  /**
   * Delete person picture
   * Similar to <code>deletePersonPicture</code> but it also returns the http response headers .
   * Deletes a person’s picture.
   * @param id The ID of the person (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /persons/{id}/picture")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeletePersonResponse200> deletePersonPictureWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple persons in bulk
   * Marks multiple persons as deleted. After 30 days, the persons will be permanently deleted.
   * @param ids The comma-separated IDs that will be deleted (required)
   * @return DeletePersonsResponse200
   */
  @RequestLine("DELETE /persons?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeletePersonsResponse200 deletePersons(@Param("ids") String ids);

  /**
   * Delete multiple persons in bulk
   * Similar to <code>deletePersons</code> but it also returns the http response headers .
   * Marks multiple persons as deleted. After 30 days, the persons will be permanently deleted.
   * @param ids The comma-separated IDs that will be deleted (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /persons?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeletePersonsResponse200> deletePersonsWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple persons in bulk
   * Marks multiple persons as deleted. After 30 days, the persons will be permanently deleted.
   * Note, this is equivalent to the other <code>deletePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated IDs that will be deleted (required)</li>
   *   </ul>
   * @return DeletePersonsResponse200
   */
  @RequestLine("DELETE /persons?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeletePersonsResponse200 deletePersons(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple persons in bulk
  * Marks multiple persons as deleted. After 30 days, the persons will be permanently deleted.
  * Note, this is equivalent to the other <code>deletePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated IDs that will be deleted (required)</li>
      *   </ul>
          * @return DeletePersonsResponse200
      */
      @RequestLine("DELETE /persons?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeletePersonsResponse200> deletePersonsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePersons</code> method in a fluent style.
   */
  public static class DeletePersonsQueryParams extends HashMap<String, Object> {
    public DeletePersonsQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get details of a person
   * Returns the details of a person. Note that this also returns some additional fields which are not present when asking for all persons. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the &#x60;key&#x60; value of personFields.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the person (required)
   * @return GetPersonResponse200
   */
  @RequestLine("GET /persons/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetPersonResponse200 getPerson(@Param("id") Integer id);

  /**
   * Get details of a person
   * Similar to <code>getPerson</code> but it also returns the http response headers .
   * Returns the details of a person. Note that this also returns some additional fields which are not present when asking for all persons. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the &#x60;key&#x60; value of personFields.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the person (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPersonResponse200> getPersonWithHttpInfo(@Param("id") Integer id);



  /**
   * List activities associated with a person
   * Lists activities associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)
   * @param exclude A comma-separated string of activity IDs to exclude from result (optional)
   * @return GetAssociatedActivitiesResponse200
   */
  @RequestLine("GET /persons/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedActivitiesResponse200 getPersonActivities(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("done") BigDecimal done, @Param("exclude") String exclude);

  /**
   * List activities associated with a person
   * Similar to <code>getPersonActivities</code> but it also returns the http response headers .
   * Lists activities associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param done Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)
   * @param exclude A comma-separated string of activity IDs to exclude from result (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedActivitiesResponse200> getPersonActivitiesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("done") BigDecimal done, @Param("exclude") String exclude);


  /**
   * List activities associated with a person
   * Lists activities associated with a person.
   * Note, this is equivalent to the other <code>getPersonActivities</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonActivitiesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the person (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)</li>
   *   <li>exclude - A comma-separated string of activity IDs to exclude from result (optional)</li>
   *   </ul>
   * @return GetAssociatedActivitiesResponse200
   */
  @RequestLine("GET /persons/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedActivitiesResponse200 getPersonActivities(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List activities associated with a person
  * Lists activities associated with a person.
  * Note, this is equivalent to the other <code>getPersonActivities</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the person (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>done - Whether the activity is done or not. 0 &#x3D; Not done, 1 &#x3D; Done. If omitted, returns both Done and Not done activities. (optional)</li>
          *   <li>exclude - A comma-separated string of activity IDs to exclude from result (optional)</li>
      *   </ul>
          * @return GetAssociatedActivitiesResponse200
      */
      @RequestLine("GET /persons/{id}/activities?start={start}&limit={limit}&done={done}&exclude={exclude}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedActivitiesResponse200> getPersonActivitiesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonActivities</code> method in a fluent style.
   */
  public static class GetPersonActivitiesQueryParams extends HashMap<String, Object> {
    public GetPersonActivitiesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonActivitiesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonActivitiesQueryParams done(final BigDecimal value) {
      put("done", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonActivitiesQueryParams exclude(final String value) {
      put("exclude", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List deals associated with a person
   * Lists deals associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return GetAssociatedDealsResponse200
   */
  @RequestLine("GET /persons/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedDealsResponse200 getPersonDeals(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("status") String status, @Param("sort") String sort);

  /**
   * List deals associated with a person
   * Similar to <code>getPersonDeals</code> but it also returns the http response headers .
   * Lists deals associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedDealsResponse200> getPersonDealsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("status") String status, @Param("sort") String sort);


  /**
   * List deals associated with a person
   * Lists deals associated with a person.
   * Note, this is equivalent to the other <code>getPersonDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the person (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
   *   </ul>
   * @return GetAssociatedDealsResponse200
   */
  @RequestLine("GET /persons/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedDealsResponse200 getPersonDeals(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List deals associated with a person
  * Lists deals associated with a person.
  * Note, this is equivalent to the other <code>getPersonDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the person (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
      *   </ul>
          * @return GetAssociatedDealsResponse200
      */
      @RequestLine("GET /persons/{id}/deals?start={start}&limit={limit}&status={status}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedDealsResponse200> getPersonDealsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonDeals</code> method in a fluent style.
   */
  public static class GetPersonDealsQueryParams extends HashMap<String, Object> {
    public GetPersonDealsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonDealsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonDealsQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonDealsQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List files attached to a person
   * Lists files associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /persons/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getPersonFiles(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);

  /**
   * List files attached to a person
   * Similar to <code>getPersonFiles</code> but it also returns the http response headers .
   * Lists files associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedFilesResponse200> getPersonFilesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);


  /**
   * List files attached to a person
   * Lists files associated with a person.
   * Note, this is equivalent to the other <code>getPersonFiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonFilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the person (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
   *   </ul>
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /persons/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getPersonFiles(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List files attached to a person
  * Lists files associated with a person.
  * Note, this is equivalent to the other <code>getPersonFiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the person (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
      *   </ul>
          * @return GetAssociatedFilesResponse200
      */
      @RequestLine("GET /persons/{id}/files?start={start}&limit={limit}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedFilesResponse200> getPersonFilesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonFiles</code> method in a fluent style.
   */
  public static class GetPersonFilesQueryParams extends HashMap<String, Object> {
    public GetPersonFilesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonFilesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonFilesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List followers of a person
   * Lists the followers of a person.
   * @param id The ID of the person (required)
   * @return GetAssociatedFollowersResponse200
   */
  @RequestLine("GET /persons/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedFollowersResponse200 getPersonFollowers(@Param("id") Integer id);

  /**
   * List followers of a person
   * Similar to <code>getPersonFollowers</code> but it also returns the http response headers .
   * Lists the followers of a person.
   * @param id The ID of the person (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/followers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedFollowersResponse200> getPersonFollowersWithHttpInfo(@Param("id") Integer id);



  /**
   * List mail messages associated with a person
   * Lists mail messages associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetAssociatedMailMessagesResponse200
   */
  @RequestLine("GET /persons/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedMailMessagesResponse200 getPersonMailMessages(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List mail messages associated with a person
   * Similar to <code>getPersonMailMessages</code> but it also returns the http response headers .
   * Lists mail messages associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedMailMessagesResponse200> getPersonMailMessagesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List mail messages associated with a person
   * Lists mail messages associated with a person.
   * Note, this is equivalent to the other <code>getPersonMailMessages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonMailMessagesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the person (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetAssociatedMailMessagesResponse200
   */
  @RequestLine("GET /persons/{id}/mailMessages?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedMailMessagesResponse200 getPersonMailMessages(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List mail messages associated with a person
  * Lists mail messages associated with a person.
  * Note, this is equivalent to the other <code>getPersonMailMessages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the person (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetAssociatedMailMessagesResponse200
      */
      @RequestLine("GET /persons/{id}/mailMessages?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedMailMessagesResponse200> getPersonMailMessagesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonMailMessages</code> method in a fluent style.
   */
  public static class GetPersonMailMessagesQueryParams extends HashMap<String, Object> {
    public GetPersonMailMessagesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonMailMessagesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List products associated with a person
   * Lists products associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetPersonProductsResponse200
   */
  @RequestLine("GET /persons/{id}/products?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetPersonProductsResponse200 getPersonProducts(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List products associated with a person
   * Similar to <code>getPersonProducts</code> but it also returns the http response headers .
   * Lists products associated with a person.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/products?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPersonProductsResponse200> getPersonProductsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List products associated with a person
   * Lists products associated with a person.
   * Note, this is equivalent to the other <code>getPersonProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the person (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetPersonProductsResponse200
   */
  @RequestLine("GET /persons/{id}/products?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetPersonProductsResponse200 getPersonProducts(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List products associated with a person
  * Lists products associated with a person.
  * Note, this is equivalent to the other <code>getPersonProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the person (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetPersonProductsResponse200
      */
      @RequestLine("GET /persons/{id}/products?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetPersonProductsResponse200> getPersonProductsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonProducts</code> method in a fluent style.
   */
  public static class GetPersonProductsQueryParams extends HashMap<String, Object> {
    public GetPersonProductsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonProductsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List updates about a person
   * Lists updates about a person.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint&#39;s response will also include updates for the &#x60;marketing_status&#x60; field.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param allChanges Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)
   * @param items A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)
   * @return GetAssociatedPersonUpdatesResponse200
   */
  @RequestLine("GET /persons/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedPersonUpdatesResponse200 getPersonUpdates(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("allChanges") String allChanges, @Param("items") String items);

  /**
   * List updates about a person
   * Similar to <code>getPersonUpdates</code> but it also returns the http response headers .
   * Lists updates about a person.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint&#39;s response will also include updates for the &#x60;marketing_status&#x60; field.
   * @param id The ID of the person (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param allChanges Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)
   * @param items A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedPersonUpdatesResponse200> getPersonUpdatesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("allChanges") String allChanges, @Param("items") String items);


  /**
   * List updates about a person
   * Lists updates about a person.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint&#39;s response will also include updates for the &#x60;marketing_status&#x60; field.
   * Note, this is equivalent to the other <code>getPersonUpdates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonUpdatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the person (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>allChanges - Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)</li>
   *   <li>items - A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)</li>
   *   </ul>
   * @return GetAssociatedPersonUpdatesResponse200
   */
  @RequestLine("GET /persons/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedPersonUpdatesResponse200 getPersonUpdates(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List updates about a person
  * Lists updates about a person.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint&#39;s response will also include updates for the &#x60;marketing_status&#x60; field.
  * Note, this is equivalent to the other <code>getPersonUpdates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the person (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>allChanges - Whether to show custom field updates or not. 1 &#x3D; Include custom field changes. If omitted returns changes without custom field updates. (optional)</li>
          *   <li>items - A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change) (optional)</li>
      *   </ul>
          * @return GetAssociatedPersonUpdatesResponse200
      */
      @RequestLine("GET /persons/{id}/flow?start={start}&limit={limit}&all_changes={allChanges}&items={items}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedPersonUpdatesResponse200> getPersonUpdatesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonUpdates</code> method in a fluent style.
   */
  public static class GetPersonUpdatesQueryParams extends HashMap<String, Object> {
    public GetPersonUpdatesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonUpdatesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonUpdatesQueryParams allChanges(final String value) {
      put("all_changes", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonUpdatesQueryParams items(final String value) {
      put("items", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List permitted users
   * List users permitted to access a person.
   * @param id The ID of the person (required)
   * @return ListPermittedUsersResponse2001
   */
  @RequestLine("GET /persons/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  ListPermittedUsersResponse2001 getPersonUsers(@Param("id") Integer id);

  /**
   * List permitted users
   * Similar to <code>getPersonUsers</code> but it also returns the http response headers .
   * List users permitted to access a person.
   * @param id The ID of the person (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ListPermittedUsersResponse2001> getPersonUsersWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all persons
   * Returns all persons.
   * @param userId If supplied, only persons owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param firstChar If supplied, only persons whose name starts with the specified letter will be returned (case insensitive) (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return GetPersonsResponse200
   */
  @RequestLine("GET /persons?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetPersonsResponse200 getPersons(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("firstChar") String firstChar, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);

  /**
   * Get all persons
   * Similar to <code>getPersons</code> but it also returns the http response headers .
   * Returns all persons.
   * @param userId If supplied, only persons owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param firstChar If supplied, only persons whose name starts with the specified letter will be returned (case insensitive) (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetPersonsResponse200> getPersonsWithHttpInfo(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("firstChar") String firstChar, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);


  /**
   * Get all persons
   * Returns all persons.
   * Note, this is equivalent to the other <code>getPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - If supplied, only persons owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)</li>
   *   <li>filterId - The ID of the filter to use (optional)</li>
   *   <li>firstChar - If supplied, only persons whose name starts with the specified letter will be returned (case insensitive) (optional)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
   *   </ul>
   * @return GetPersonsResponse200
   */
  @RequestLine("GET /persons?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetPersonsResponse200 getPersons(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all persons
  * Returns all persons.
  * Note, this is equivalent to the other <code>getPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>userId - If supplied, only persons owned by the given user will be returned. However, &#x60;filter_id&#x60; takes precedence over &#x60;user_id&#x60; when both are supplied. (optional)</li>
          *   <li>filterId - The ID of the filter to use (optional)</li>
          *   <li>firstChar - If supplied, only persons whose name starts with the specified letter will be returned (case insensitive) (optional)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). (optional)</li>
      *   </ul>
          * @return GetPersonsResponse200
      */
      @RequestLine("GET /persons?user_id={userId}&filter_id={filterId}&first_char={firstChar}&start={start}&limit={limit}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetPersonsResponse200> getPersonsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersons</code> method in a fluent style.
   */
  public static class GetPersonsQueryParams extends HashMap<String, Object> {
    public GetPersonsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonsQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonsQueryParams firstChar(final String value) {
      put("first_char", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonsQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Merge two persons
   * Merges a person with another person. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/merging-two-persons\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;merging two persons&lt;/a&gt;.
   * @param id The ID of the person (required)
   * @param mergePersonsRequest  (optional)
   * @return MergePersonsResponse200
   */
  @RequestLine("PUT /persons/{id}/merge")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MergePersonsResponse200 mergePersons(@Param("id") Integer id, MergePersonsRequest mergePersonsRequest);

  /**
   * Merge two persons
   * Similar to <code>mergePersons</code> but it also returns the http response headers .
   * Merges a person with another person. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/merging-two-persons\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;merging two persons&lt;/a&gt;.
   * @param id The ID of the person (required)
   * @param mergePersonsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /persons/{id}/merge")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MergePersonsResponse200> mergePersonsWithHttpInfo(@Param("id") Integer id, MergePersonsRequest mergePersonsRequest);



  /**
   * Search persons
   * Searches all persons by name, email, phone, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found persons can be filtered by organization ID.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param organizationId Will filter persons by the provided organization ID. The upper limit of found persons associated with the organization is 2000. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return SearchPersonsResponse200
   */
  @RequestLine("GET /persons/search?term={term}&fields={fields}&exact_match={exactMatch}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  SearchPersonsResponse200 searchPersons(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("organizationId") Integer organizationId, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Search persons
   * Similar to <code>searchPersons</code> but it also returns the http response headers .
   * Searches all persons by name, email, phone, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found persons can be filtered by organization ID.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param organizationId Will filter persons by the provided organization ID. The upper limit of found persons associated with the organization is 2000. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /persons/search?term={term}&fields={fields}&exact_match={exactMatch}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchPersonsResponse200> searchPersonsWithHttpInfo(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("organizationId") Integer organizationId, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Search persons
   * Searches all persons by name, email, phone, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found persons can be filtered by organization ID.
   * Note, this is equivalent to the other <code>searchPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
   *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
   *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
   *   <li>organizationId - Will filter persons by the provided organization ID. The upper limit of found persons associated with the organization is 2000. (optional)</li>
   *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
   *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return SearchPersonsResponse200
   */
  @RequestLine("GET /persons/search?term={term}&fields={fields}&exact_match={exactMatch}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  SearchPersonsResponse200 searchPersons(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Search persons
  * Searches all persons by name, email, phone, notes and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope. Found persons can be filtered by organization ID.
  * Note, this is equivalent to the other <code>searchPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
          *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
          *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
          *   <li>organizationId - Will filter persons by the provided organization ID. The upper limit of found persons associated with the organization is 2000. (optional)</li>
          *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
          *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return SearchPersonsResponse200
      */
      @RequestLine("GET /persons/search?term={term}&fields={fields}&exact_match={exactMatch}&organization_id={organizationId}&include_fields={includeFields}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchPersonsResponse200> searchPersonsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchPersons</code> method in a fluent style.
   */
  public static class SearchPersonsQueryParams extends HashMap<String, Object> {
    public SearchPersonsQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public SearchPersonsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchPersonsQueryParams exactMatch(final Boolean value) {
      put("exact_match", EncodingUtils.encode(value));
      return this;
    }
    public SearchPersonsQueryParams organizationId(final Integer value) {
      put("organization_id", EncodingUtils.encode(value));
      return this;
    }
    public SearchPersonsQueryParams includeFields(final String value) {
      put("include_fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchPersonsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public SearchPersonsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a person
   * Updates the properties of a person. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-a-person\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating a person&lt;/a&gt;.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also accept and return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the person (required)
   * @param updatePersonRequest  (optional)
   * @return UpdatePersonResponse200
   */
  @RequestLine("PUT /persons/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePersonResponse200 updatePerson(@Param("id") Integer id, UpdatePersonRequest updatePersonRequest);

  /**
   * Update a person
   * Similar to <code>updatePerson</code> but it also returns the http response headers .
   * Updates the properties of a person. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/updating-a-person\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating a person&lt;/a&gt;.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also accept and return the &#x60;data.marketing_status&#x60; field.
   * @param id The ID of the person (required)
   * @param updatePersonRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /persons/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePersonResponse200> updatePersonWithHttpInfo(@Param("id") Integer id, UpdatePersonRequest updatePersonRequest);


}
