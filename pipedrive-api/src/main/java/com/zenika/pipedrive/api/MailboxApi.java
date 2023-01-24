package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import java.math.BigDecimal;
import com.zenika.pipedrive.model.DeleteMailThreadResponse200;
import com.zenika.pipedrive.model.GetAllMailMessagesOfMailThreadResponse200;
import com.zenika.pipedrive.model.GetMailThreadsResponse200;
import com.zenika.pipedrive.model.GetOneMailThreadResponse200;
import com.zenika.pipedrive.model.MailMessageResponse200;
import java.util.UUID;
import com.zenika.pipedrive.model.UpdateMailThreadDetailsResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface MailboxApi extends ApiClient.Api {


  /**
   * Delete mail thread
   * Marks a mail thread as deleted.
   * @param id The ID of the mail thread (required)
   * @return DeleteMailThreadResponse200
   */
  @RequestLine("DELETE /mailbox/mailThreads/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteMailThreadResponse200 deleteMailThread(@Param("id") Integer id);

  /**
   * Delete mail thread
   * Similar to <code>deleteMailThread</code> but it also returns the http response headers .
   * Marks a mail thread as deleted.
   * @param id The ID of the mail thread (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /mailbox/mailThreads/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteMailThreadResponse200> deleteMailThreadWithHttpInfo(@Param("id") Integer id);



  /**
   * Get one mail message
   * Returns data about a specific mail message.
   * @param id The ID of the mail message to fetch (required)
   * @param includeBody Whether to include the full message body or not. &#x60;0&#x60; &#x3D; Don&#39;t include, &#x60;1&#x60; &#x3D; Include (optional, default to 0)
   * @return MailMessageResponse200
   */
  @RequestLine("GET /mailbox/mailMessages/{id}?include_body={includeBody}")
  @Headers({
    "Accept: application/json",
  })
  MailMessageResponse200 getMailMessage(@Param("id") Integer id, @Param("includeBody") BigDecimal includeBody);

  /**
   * Get one mail message
   * Similar to <code>getMailMessage</code> but it also returns the http response headers .
   * Returns data about a specific mail message.
   * @param id The ID of the mail message to fetch (required)
   * @param includeBody Whether to include the full message body or not. &#x60;0&#x60; &#x3D; Don&#39;t include, &#x60;1&#x60; &#x3D; Include (optional, default to 0)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /mailbox/mailMessages/{id}?include_body={includeBody}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MailMessageResponse200> getMailMessageWithHttpInfo(@Param("id") Integer id, @Param("includeBody") BigDecimal includeBody);


  /**
   * Get one mail message
   * Returns data about a specific mail message.
   * Note, this is equivalent to the other <code>getMailMessage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMailMessageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the mail message to fetch (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>includeBody - Whether to include the full message body or not. &#x60;0&#x60; &#x3D; Don&#39;t include, &#x60;1&#x60; &#x3D; Include (optional, default to 0)</li>
   *   </ul>
   * @return MailMessageResponse200
   */
  @RequestLine("GET /mailbox/mailMessages/{id}?include_body={includeBody}")
  @Headers({
  "Accept: application/json",
  })
  MailMessageResponse200 getMailMessage(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get one mail message
  * Returns data about a specific mail message.
  * Note, this is equivalent to the other <code>getMailMessage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the mail message to fetch (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>includeBody - Whether to include the full message body or not. &#x60;0&#x60; &#x3D; Don&#39;t include, &#x60;1&#x60; &#x3D; Include (optional, default to 0)</li>
      *   </ul>
          * @return MailMessageResponse200
      */
      @RequestLine("GET /mailbox/mailMessages/{id}?include_body={includeBody}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MailMessageResponse200> getMailMessageWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMailMessage</code> method in a fluent style.
   */
  public static class GetMailMessageQueryParams extends HashMap<String, Object> {
    public GetMailMessageQueryParams includeBody(final BigDecimal value) {
      put("include_body", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get one mail thread
   * Returns a specific mail thread.
   * @param id The ID of the mail thread (required)
   * @return GetOneMailThreadResponse200
   */
  @RequestLine("GET /mailbox/mailThreads/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetOneMailThreadResponse200 getMailThread(@Param("id") Integer id);

  /**
   * Get one mail thread
   * Similar to <code>getMailThread</code> but it also returns the http response headers .
   * Returns a specific mail thread.
   * @param id The ID of the mail thread (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /mailbox/mailThreads/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetOneMailThreadResponse200> getMailThreadWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all mail messages of mail thread
   * Returns all the mail messages inside a specified mail thread.
   * @param id The ID of the mail thread (required)
   * @return GetAllMailMessagesOfMailThreadResponse200
   */
  @RequestLine("GET /mailbox/mailThreads/{id}/mailMessages")
  @Headers({
    "Accept: application/json",
  })
  GetAllMailMessagesOfMailThreadResponse200 getMailThreadMessages(@Param("id") Integer id);

  /**
   * Get all mail messages of mail thread
   * Similar to <code>getMailThreadMessages</code> but it also returns the http response headers .
   * Returns all the mail messages inside a specified mail thread.
   * @param id The ID of the mail thread (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /mailbox/mailThreads/{id}/mailMessages")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAllMailMessagesOfMailThreadResponse200> getMailThreadMessagesWithHttpInfo(@Param("id") Integer id);



  /**
   * Get mail threads
   * Returns mail threads in a specified folder ordered by the most recent message within.
   * @param folder The type of folder to fetch (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetMailThreadsResponse200
   */
  @RequestLine("GET /mailbox/mailThreads?folder={folder}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetMailThreadsResponse200 getMailThreads(@Param("folder") String folder, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get mail threads
   * Similar to <code>getMailThreads</code> but it also returns the http response headers .
   * Returns mail threads in a specified folder ordered by the most recent message within.
   * @param folder The type of folder to fetch (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /mailbox/mailThreads?folder={folder}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetMailThreadsResponse200> getMailThreadsWithHttpInfo(@Param("folder") String folder, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get mail threads
   * Returns mail threads in a specified folder ordered by the most recent message within.
   * Note, this is equivalent to the other <code>getMailThreads</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMailThreadsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>folder - The type of folder to fetch (required)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetMailThreadsResponse200
   */
  @RequestLine("GET /mailbox/mailThreads?folder={folder}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetMailThreadsResponse200 getMailThreads(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get mail threads
  * Returns mail threads in a specified folder ordered by the most recent message within.
  * Note, this is equivalent to the other <code>getMailThreads</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>folder - The type of folder to fetch (required)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetMailThreadsResponse200
      */
      @RequestLine("GET /mailbox/mailThreads?folder={folder}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetMailThreadsResponse200> getMailThreadsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMailThreads</code> method in a fluent style.
   */
  public static class GetMailThreadsQueryParams extends HashMap<String, Object> {
    public GetMailThreadsQueryParams folder(final String value) {
      put("folder", EncodingUtils.encode(value));
      return this;
    }
    public GetMailThreadsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetMailThreadsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update mail thread details
   * Updates the properties of a mail thread.
   * @param id The ID of the mail thread (required)
   * @param dealId The ID of the deal this thread is associated with (optional)
   * @param leadId The ID of the lead this thread is associated with (optional)
   * @param sharedFlag  (optional)
   * @param readFlag  (optional)
   * @param archivedFlag  (optional)
   * @return UpdateMailThreadDetailsResponse200
   */
  @RequestLine("PUT /mailbox/mailThreads/{id}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  UpdateMailThreadDetailsResponse200 updateMailThreadDetails(@Param("id") Integer id, @Param("deal_id") Integer dealId, @Param("lead_id") UUID leadId, @Param("shared_flag") BigDecimal sharedFlag, @Param("read_flag") BigDecimal readFlag, @Param("archived_flag") BigDecimal archivedFlag);

  /**
   * Update mail thread details
   * Similar to <code>updateMailThreadDetails</code> but it also returns the http response headers .
   * Updates the properties of a mail thread.
   * @param id The ID of the mail thread (required)
   * @param dealId The ID of the deal this thread is associated with (optional)
   * @param leadId The ID of the lead this thread is associated with (optional)
   * @param sharedFlag  (optional)
   * @param readFlag  (optional)
   * @param archivedFlag  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /mailbox/mailThreads/{id}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
  })
  ApiResponse<UpdateMailThreadDetailsResponse200> updateMailThreadDetailsWithHttpInfo(@Param("id") Integer id, @Param("deal_id") Integer dealId, @Param("lead_id") UUID leadId, @Param("shared_flag") BigDecimal sharedFlag, @Param("read_flag") BigDecimal readFlag, @Param("archived_flag") BigDecimal archivedFlag);


}
