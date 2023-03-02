package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddFileAndLinkItResponse200;
import com.zenika.pipedrive.model.AddFileResponse200;
import com.zenika.pipedrive.model.DeleteFileResponse200;
import java.io.File;
import com.zenika.pipedrive.model.GetFileResponse200;
import com.zenika.pipedrive.model.GetFilesResponse200;
import com.zenika.pipedrive.model.LinkFileToItemResponse200;
import java.util.UUID;
import com.zenika.pipedrive.model.UpdateFileResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface FilesApi extends ApiClient.Api {


  /**
   * Add file
   * Lets you upload a file and associate it with a deal, person, organization, activity, product or lead. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-file\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a file&lt;/a&gt;.
   * @param file A single file, supplied in the multipart/form-data encoding and contained within the given boundaries (required)
   * @param dealId The ID of the deal to associate file(s) with (optional)
   * @param personId The ID of the person to associate file(s) with (optional)
   * @param orgId The ID of the organization to associate file(s) with (optional)
   * @param productId The ID of the product to associate file(s) with (optional)
   * @param activityId The ID of the activity to associate file(s) with (optional)
   * @param leadId The ID of the lead to associate file(s) with (optional)
   * @return AddFileResponse200
   */
  @RequestLine("POST /files")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  AddFileResponse200 addFile(@Param("file") File file, @Param("deal_id") Integer dealId, @Param("person_id") Integer personId, @Param("org_id") Integer orgId, @Param("product_id") Integer productId, @Param("activity_id") Integer activityId, @Param("lead_id") UUID leadId);

  /**
   * Add file
   * Similar to <code>addFile</code> but it also returns the http response headers .
   * Lets you upload a file and associate it with a deal, person, organization, activity, product or lead. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-file\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a file&lt;/a&gt;.
   * @param file A single file, supplied in the multipart/form-data encoding and contained within the given boundaries (required)
   * @param dealId The ID of the deal to associate file(s) with (optional)
   * @param personId The ID of the person to associate file(s) with (optional)
   * @param orgId The ID of the organization to associate file(s) with (optional)
   * @param productId The ID of the product to associate file(s) with (optional)
   * @param activityId The ID of the activity to associate file(s) with (optional)
   * @param leadId The ID of the lead to associate file(s) with (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /files")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  ApiResponse<AddFileResponse200> addFileWithHttpInfo(@Param("file") File file, @Param("deal_id") Integer dealId, @Param("person_id") Integer personId, @Param("org_id") Integer orgId, @Param("product_id") Integer productId, @Param("activity_id") Integer activityId, @Param("lead_id") UUID leadId);



  /**
   * Create a remote file and link it to an item
   * Creates a new empty file in the remote location (&#x60;googledrive&#x60;) that will be linked to the item you supply. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-remote-file\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a remote file&lt;/a&gt;.
   * @param fileType The file type (required)
   * @param title The title of the file (required)
   * @param itemType The item type (required)
   * @param itemId The ID of the item to associate the file with (required)
   * @param remoteLocation The location type to send the file to. Only &#x60;googledrive&#x60; is supported at the moment. (required)
   * @return AddFileAndLinkItResponse200
   */
  @RequestLine("POST /files/remote")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  AddFileAndLinkItResponse200 addFileAndLinkIt(@Param("file_type") String fileType, @Param("title") String title, @Param("item_type") String itemType, @Param("item_id") Integer itemId, @Param("remote_location") String remoteLocation);

  /**
   * Create a remote file and link it to an item
   * Similar to <code>addFileAndLinkIt</code> but it also returns the http response headers .
   * Creates a new empty file in the remote location (&#x60;googledrive&#x60;) that will be linked to the item you supply. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-remote-file\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a remote file&lt;/a&gt;.
   * @param fileType The file type (required)
   * @param title The title of the file (required)
   * @param itemType The item type (required)
   * @param itemId The ID of the item to associate the file with (required)
   * @param remoteLocation The location type to send the file to. Only &#x60;googledrive&#x60; is supported at the moment. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /files/remote")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  ApiResponse<AddFileAndLinkItResponse200> addFileAndLinkItWithHttpInfo(@Param("file_type") String fileType, @Param("title") String title, @Param("item_type") String itemType, @Param("item_id") Integer itemId, @Param("remote_location") String remoteLocation);



  /**
   * Delete a file
   * Marks a file as deleted. After 30 days, the file will be permanently deleted.
   * @param id The ID of the file (required)
   * @return DeleteFileResponse200
   */
  @RequestLine("DELETE /files/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFileResponse200 deleteFile(@Param("id") Integer id);

  /**
   * Delete a file
   * Similar to <code>deleteFile</code> but it also returns the http response headers .
   * Marks a file as deleted. After 30 days, the file will be permanently deleted.
   * @param id The ID of the file (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /files/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFileResponse200> deleteFileWithHttpInfo(@Param("id") Integer id);



  /**
   * Download one file
   * Initializes a file download.
   * @param id The ID of the file (required)
   * @return byte[]
   */
  @RequestLine("GET /files/{id}/download")
  @Headers({
    "Accept: application/octet-stream",
  })
  byte[] downloadFile(@Param("id") Integer id);

  /**
   * Download one file
   * Similar to <code>downloadFile</code> but it also returns the http response headers .
   * Initializes a file download.
   * @param id The ID of the file (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /files/{id}/download")
  @Headers({
    "Accept: application/octet-stream",
  })
  ApiResponse<byte[]> downloadFileWithHttpInfo(@Param("id") Integer id);



  /**
   * Get one file
   * Returns data about a specific file.
   * @param id The ID of the file (required)
   * @return GetFileResponse200
   */
  @RequestLine("GET /files/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetFileResponse200 getFile(@Param("id") Integer id);

  /**
   * Get one file
   * Similar to <code>getFile</code> but it also returns the http response headers .
   * Returns data about a specific file.
   * @param id The ID of the file (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /files/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetFileResponse200> getFileWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all files
   * Returns data about all files.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return GetFilesResponse200
   */
  @RequestLine("GET /files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetFilesResponse200 getFiles(@Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);

  /**
   * Get all files
   * Similar to <code>getFiles</code> but it also returns the http response headers .
   * Returns data about all files.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetFilesResponse200> getFilesWithHttpInfo(@Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);


  /**
   * Get all files
   * Returns data about all files.
   * Note, this is equivalent to the other <code>getFiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetFilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
   *   </ul>
   * @return GetFilesResponse200
   */
  @RequestLine("GET /files?start={start}&limit={limit}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetFilesResponse200 getFiles(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all files
  * Returns data about all files.
  * Note, this is equivalent to the other <code>getFiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
      *   </ul>
          * @return GetFilesResponse200
      */
      @RequestLine("GET /files?start={start}&limit={limit}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetFilesResponse200> getFilesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getFiles</code> method in a fluent style.
   */
  public static class GetFilesQueryParams extends HashMap<String, Object> {
    public GetFilesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetFilesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetFilesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Link a remote file to an item
   * Links an existing remote file (&#x60;googledrive&#x60;) to the item you supply. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-remote-file\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a remote file&lt;/a&gt;.
   * @param itemType The item type (required)
   * @param itemId The ID of the item to associate the file with (required)
   * @param remoteId The remote item ID (required)
   * @param remoteLocation The location type to send the file to. Only &#x60;googledrive&#x60; is supported at the moment. (required)
   * @return LinkFileToItemResponse200
   */
  @RequestLine("POST /files/remoteLink")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  LinkFileToItemResponse200 linkFileToItem(@Param("item_type") String itemType, @Param("item_id") Integer itemId, @Param("remote_id") String remoteId, @Param("remote_location") String remoteLocation);

  /**
   * Link a remote file to an item
   * Similar to <code>linkFileToItem</code> but it also returns the http response headers .
   * Links an existing remote file (&#x60;googledrive&#x60;) to the item you supply. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-remote-file\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a remote file&lt;/a&gt;.
   * @param itemType The item type (required)
   * @param itemId The ID of the item to associate the file with (required)
   * @param remoteId The remote item ID (required)
   * @param remoteLocation The location type to send the file to. Only &#x60;googledrive&#x60; is supported at the moment. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /files/remoteLink")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  ApiResponse<LinkFileToItemResponse200> linkFileToItemWithHttpInfo(@Param("item_type") String itemType, @Param("item_id") Integer itemId, @Param("remote_id") String remoteId, @Param("remote_location") String remoteLocation);



  /**
   * Update file details
   * Updates the properties of a file.
   * @param id The ID of the file (required)
   * @param name The visible name of the file (optional)
   * @param description The description of the file (optional)
   * @return UpdateFileResponse200
   */
  @RequestLine("PUT /files/{id}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  UpdateFileResponse200 updateFile(@Param("id") Integer id, @Param("name") String name, @Param("description") String description);

  /**
   * Update file details
   * Similar to <code>updateFile</code> but it also returns the http response headers .
   * Updates the properties of a file.
   * @param id The ID of the file (required)
   * @param name The visible name of the file (optional)
   * @param description The description of the file (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /files/{id}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  ApiResponse<UpdateFileResponse200> updateFileWithHttpInfo(@Param("id") Integer id, @Param("name") String name, @Param("description") String description);


}
