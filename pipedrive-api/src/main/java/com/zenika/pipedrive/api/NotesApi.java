package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddNoteRequest;
import java.math.BigDecimal;
import com.zenika.pipedrive.model.CommentPostPutObject;
import com.zenika.pipedrive.model.DeleteCommentResponse200;
import com.zenika.pipedrive.model.DeleteNoteResponse200;
import com.zenika.pipedrive.model.GetCommentsResponse200;
import com.zenika.pipedrive.model.GetNotesResponse200;
import java.time.LocalDate;
import com.zenika.pipedrive.model.NoteRequest;
import com.zenika.pipedrive.model.OneCommentResponse200;
import com.zenika.pipedrive.model.OneNoteResponse200;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface NotesApi extends ApiClient.Api {


  /**
   * Add a note
   * Adds a new note.
   * @param addNoteRequest  (optional)
   * @return OneNoteResponse200
   */
  @RequestLine("POST /notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OneNoteResponse200 addNote(AddNoteRequest addNoteRequest);

  /**
   * Add a note
   * Similar to <code>addNote</code> but it also returns the http response headers .
   * Adds a new note.
   * @param addNoteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OneNoteResponse200> addNoteWithHttpInfo(AddNoteRequest addNoteRequest);



  /**
   * Add a comment to a note
   * Adds a new comment to a note.
   * @param id The ID of the note (required)
   * @param commentPostPutObject  (optional)
   * @return OneCommentResponse200
   */
  @RequestLine("POST /notes/{id}/comments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OneCommentResponse200 addNoteComment(@Param("id") Integer id, CommentPostPutObject commentPostPutObject);

  /**
   * Add a comment to a note
   * Similar to <code>addNoteComment</code> but it also returns the http response headers .
   * Adds a new comment to a note.
   * @param id The ID of the note (required)
   * @param commentPostPutObject  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /notes/{id}/comments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OneCommentResponse200> addNoteCommentWithHttpInfo(@Param("id") Integer id, CommentPostPutObject commentPostPutObject);



  /**
   * Delete a comment related to a note
   * Deletes a comment.
   * @param id The ID of the note (required)
   * @param commentId The ID of the comment (required)
   * @return DeleteCommentResponse200
   */
  @RequestLine("DELETE /notes/{id}/comments/{commentId}")
  @Headers({
    "Accept: application/json",
  })
  DeleteCommentResponse200 deleteComment(@Param("id") Integer id, @Param("commentId") UUID commentId);

  /**
   * Delete a comment related to a note
   * Similar to <code>deleteComment</code> but it also returns the http response headers .
   * Deletes a comment.
   * @param id The ID of the note (required)
   * @param commentId The ID of the comment (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /notes/{id}/comments/{commentId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteCommentResponse200> deleteCommentWithHttpInfo(@Param("id") Integer id, @Param("commentId") UUID commentId);



  /**
   * Delete a note
   * Deletes a specific note.
   * @param id The ID of the note (required)
   * @return DeleteNoteResponse200
   */
  @RequestLine("DELETE /notes/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteNoteResponse200 deleteNote(@Param("id") Integer id);

  /**
   * Delete a note
   * Similar to <code>deleteNote</code> but it also returns the http response headers .
   * Deletes a specific note.
   * @param id The ID of the note (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /notes/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteNoteResponse200> deleteNoteWithHttpInfo(@Param("id") Integer id);



  /**
   * Get one comment
   * Returns the details of a comment.
   * @param id The ID of the note (required)
   * @param commentId The ID of the comment (required)
   * @return OneCommentResponse200
   */
  @RequestLine("GET /notes/{id}/comments/{commentId}")
  @Headers({
    "Accept: application/json",
  })
  OneCommentResponse200 getComment(@Param("id") Integer id, @Param("commentId") UUID commentId);

  /**
   * Get one comment
   * Similar to <code>getComment</code> but it also returns the http response headers .
   * Returns the details of a comment.
   * @param id The ID of the note (required)
   * @param commentId The ID of the comment (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /notes/{id}/comments/{commentId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<OneCommentResponse200> getCommentWithHttpInfo(@Param("id") Integer id, @Param("commentId") UUID commentId);



  /**
   * Get one note
   * Returns details about a specific note.
   * @param id The ID of the note (required)
   * @return OneNoteResponse200
   */
  @RequestLine("GET /notes/{id}")
  @Headers({
    "Accept: application/json",
  })
  OneNoteResponse200 getNote(@Param("id") Integer id);

  /**
   * Get one note
   * Similar to <code>getNote</code> but it also returns the http response headers .
   * Returns details about a specific note.
   * @param id The ID of the note (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /notes/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<OneNoteResponse200> getNoteWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all comments for a note
   * Returns all comments associated with a note.
   * @param id The ID of the note (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetCommentsResponse200
   */
  @RequestLine("GET /notes/{id}/comments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetCommentsResponse200 getNoteComments(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all comments for a note
   * Similar to <code>getNoteComments</code> but it also returns the http response headers .
   * Returns all comments associated with a note.
   * @param id The ID of the note (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /notes/{id}/comments?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetCommentsResponse200> getNoteCommentsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all comments for a note
   * Returns all comments associated with a note.
   * Note, this is equivalent to the other <code>getNoteComments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetNoteCommentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the note (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetCommentsResponse200
   */
  @RequestLine("GET /notes/{id}/comments?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetCommentsResponse200 getNoteComments(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all comments for a note
  * Returns all comments associated with a note.
  * Note, this is equivalent to the other <code>getNoteComments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the note (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetCommentsResponse200
      */
      @RequestLine("GET /notes/{id}/comments?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetCommentsResponse200> getNoteCommentsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getNoteComments</code> method in a fluent style.
   */
  public static class GetNoteCommentsQueryParams extends HashMap<String, Object> {
    public GetNoteCommentsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetNoteCommentsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all notes
   * Returns all notes.
   * @param userId The ID of the user whose notes to fetch. If omitted, notes by all users will be returned. (optional)
   * @param leadId The ID of the lead which notes to fetch. If omitted, notes about all leads will be returned. (optional)
   * @param dealId The ID of the deal which notes to fetch. If omitted, notes about all deals will be returned. (optional)
   * @param personId The ID of the person whose notes to fetch. If omitted, notes about all persons will be returned. (optional)
   * @param orgId The ID of the organization which notes to fetch. If omitted, notes about all organizations will be returned. (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;content&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;. (optional)
   * @param startDate The date in format of YYYY-MM-DD from which notes to fetch (optional)
   * @param endDate The date in format of YYYY-MM-DD until which notes to fetch to (optional)
   * @param pinnedToLeadFlag If set, the results are filtered by note to lead pinning state (optional)
   * @param pinnedToDealFlag If set, the results are filtered by note to deal pinning state (optional)
   * @param pinnedToOrganizationFlag If set, the results are filtered by note to organization pinning state (optional)
   * @param pinnedToPersonFlag If set, the results are filtered by note to person pinning state (optional)
   * @return GetNotesResponse200
   */
  @RequestLine("GET /notes?user_id={userId}&lead_id={leadId}&deal_id={dealId}&person_id={personId}&org_id={orgId}&start={start}&limit={limit}&sort={sort}&start_date={startDate}&end_date={endDate}&pinned_to_lead_flag={pinnedToLeadFlag}&pinned_to_deal_flag={pinnedToDealFlag}&pinned_to_organization_flag={pinnedToOrganizationFlag}&pinned_to_person_flag={pinnedToPersonFlag}")
  @Headers({
    "Accept: application/json",
  })
  GetNotesResponse200 getNotes(@Param("userId") Integer userId, @Param("leadId") UUID leadId, @Param("dealId") Integer dealId, @Param("personId") Integer personId, @Param("orgId") Integer orgId, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("pinnedToLeadFlag") BigDecimal pinnedToLeadFlag, @Param("pinnedToDealFlag") BigDecimal pinnedToDealFlag, @Param("pinnedToOrganizationFlag") BigDecimal pinnedToOrganizationFlag, @Param("pinnedToPersonFlag") BigDecimal pinnedToPersonFlag);

  /**
   * Get all notes
   * Similar to <code>getNotes</code> but it also returns the http response headers .
   * Returns all notes.
   * @param userId The ID of the user whose notes to fetch. If omitted, notes by all users will be returned. (optional)
   * @param leadId The ID of the lead which notes to fetch. If omitted, notes about all leads will be returned. (optional)
   * @param dealId The ID of the deal which notes to fetch. If omitted, notes about all deals will be returned. (optional)
   * @param personId The ID of the person whose notes to fetch. If omitted, notes about all persons will be returned. (optional)
   * @param orgId The ID of the organization which notes to fetch. If omitted, notes about all organizations will be returned. (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;content&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;. (optional)
   * @param startDate The date in format of YYYY-MM-DD from which notes to fetch (optional)
   * @param endDate The date in format of YYYY-MM-DD until which notes to fetch to (optional)
   * @param pinnedToLeadFlag If set, the results are filtered by note to lead pinning state (optional)
   * @param pinnedToDealFlag If set, the results are filtered by note to deal pinning state (optional)
   * @param pinnedToOrganizationFlag If set, the results are filtered by note to organization pinning state (optional)
   * @param pinnedToPersonFlag If set, the results are filtered by note to person pinning state (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /notes?user_id={userId}&lead_id={leadId}&deal_id={dealId}&person_id={personId}&org_id={orgId}&start={start}&limit={limit}&sort={sort}&start_date={startDate}&end_date={endDate}&pinned_to_lead_flag={pinnedToLeadFlag}&pinned_to_deal_flag={pinnedToDealFlag}&pinned_to_organization_flag={pinnedToOrganizationFlag}&pinned_to_person_flag={pinnedToPersonFlag}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetNotesResponse200> getNotesWithHttpInfo(@Param("userId") Integer userId, @Param("leadId") UUID leadId, @Param("dealId") Integer dealId, @Param("personId") Integer personId, @Param("orgId") Integer orgId, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("pinnedToLeadFlag") BigDecimal pinnedToLeadFlag, @Param("pinnedToDealFlag") BigDecimal pinnedToDealFlag, @Param("pinnedToOrganizationFlag") BigDecimal pinnedToOrganizationFlag, @Param("pinnedToPersonFlag") BigDecimal pinnedToPersonFlag);


  /**
   * Get all notes
   * Returns all notes.
   * Note, this is equivalent to the other <code>getNotes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetNotesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - The ID of the user whose notes to fetch. If omitted, notes by all users will be returned. (optional)</li>
   *   <li>leadId - The ID of the lead which notes to fetch. If omitted, notes about all leads will be returned. (optional)</li>
   *   <li>dealId - The ID of the deal which notes to fetch. If omitted, notes about all deals will be returned. (optional)</li>
   *   <li>personId - The ID of the person whose notes to fetch. If omitted, notes about all persons will be returned. (optional)</li>
   *   <li>orgId - The ID of the organization which notes to fetch. If omitted, notes about all organizations will be returned. (optional)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;content&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;. (optional)</li>
   *   <li>startDate - The date in format of YYYY-MM-DD from which notes to fetch (optional)</li>
   *   <li>endDate - The date in format of YYYY-MM-DD until which notes to fetch to (optional)</li>
   *   <li>pinnedToLeadFlag - If set, the results are filtered by note to lead pinning state (optional)</li>
   *   <li>pinnedToDealFlag - If set, the results are filtered by note to deal pinning state (optional)</li>
   *   <li>pinnedToOrganizationFlag - If set, the results are filtered by note to organization pinning state (optional)</li>
   *   <li>pinnedToPersonFlag - If set, the results are filtered by note to person pinning state (optional)</li>
   *   </ul>
   * @return GetNotesResponse200
   */
  @RequestLine("GET /notes?user_id={userId}&lead_id={leadId}&deal_id={dealId}&person_id={personId}&org_id={orgId}&start={start}&limit={limit}&sort={sort}&start_date={startDate}&end_date={endDate}&pinned_to_lead_flag={pinnedToLeadFlag}&pinned_to_deal_flag={pinnedToDealFlag}&pinned_to_organization_flag={pinnedToOrganizationFlag}&pinned_to_person_flag={pinnedToPersonFlag}")
  @Headers({
  "Accept: application/json",
  })
  GetNotesResponse200 getNotes(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all notes
  * Returns all notes.
  * Note, this is equivalent to the other <code>getNotes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>userId - The ID of the user whose notes to fetch. If omitted, notes by all users will be returned. (optional)</li>
          *   <li>leadId - The ID of the lead which notes to fetch. If omitted, notes about all leads will be returned. (optional)</li>
          *   <li>dealId - The ID of the deal which notes to fetch. If omitted, notes about all deals will be returned. (optional)</li>
          *   <li>personId - The ID of the person whose notes to fetch. If omitted, notes about all persons will be returned. (optional)</li>
          *   <li>orgId - The ID of the organization which notes to fetch. If omitted, notes about all organizations will be returned. (optional)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;content&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;. (optional)</li>
          *   <li>startDate - The date in format of YYYY-MM-DD from which notes to fetch (optional)</li>
          *   <li>endDate - The date in format of YYYY-MM-DD until which notes to fetch to (optional)</li>
          *   <li>pinnedToLeadFlag - If set, the results are filtered by note to lead pinning state (optional)</li>
          *   <li>pinnedToDealFlag - If set, the results are filtered by note to deal pinning state (optional)</li>
          *   <li>pinnedToOrganizationFlag - If set, the results are filtered by note to organization pinning state (optional)</li>
          *   <li>pinnedToPersonFlag - If set, the results are filtered by note to person pinning state (optional)</li>
      *   </ul>
          * @return GetNotesResponse200
      */
      @RequestLine("GET /notes?user_id={userId}&lead_id={leadId}&deal_id={dealId}&person_id={personId}&org_id={orgId}&start={start}&limit={limit}&sort={sort}&start_date={startDate}&end_date={endDate}&pinned_to_lead_flag={pinnedToLeadFlag}&pinned_to_deal_flag={pinnedToDealFlag}&pinned_to_organization_flag={pinnedToOrganizationFlag}&pinned_to_person_flag={pinnedToPersonFlag}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetNotesResponse200> getNotesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getNotes</code> method in a fluent style.
   */
  public static class GetNotesQueryParams extends HashMap<String, Object> {
    public GetNotesQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams leadId(final UUID value) {
      put("lead_id", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams dealId(final Integer value) {
      put("deal_id", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams personId(final Integer value) {
      put("person_id", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams orgId(final Integer value) {
      put("org_id", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams startDate(final LocalDate value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams endDate(final LocalDate value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams pinnedToLeadFlag(final BigDecimal value) {
      put("pinned_to_lead_flag", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams pinnedToDealFlag(final BigDecimal value) {
      put("pinned_to_deal_flag", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams pinnedToOrganizationFlag(final BigDecimal value) {
      put("pinned_to_organization_flag", EncodingUtils.encode(value));
      return this;
    }
    public GetNotesQueryParams pinnedToPersonFlag(final BigDecimal value) {
      put("pinned_to_person_flag", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a comment related to a note
   * Updates a comment related to a note.
   * @param id The ID of the note (required)
   * @param commentId The ID of the comment (required)
   * @param commentPostPutObject  (optional)
   * @return OneCommentResponse200
   */
  @RequestLine("PUT /notes/{id}/comments/{commentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OneCommentResponse200 updateCommentForNote(@Param("id") Integer id, @Param("commentId") UUID commentId, CommentPostPutObject commentPostPutObject);

  /**
   * Update a comment related to a note
   * Similar to <code>updateCommentForNote</code> but it also returns the http response headers .
   * Updates a comment related to a note.
   * @param id The ID of the note (required)
   * @param commentId The ID of the comment (required)
   * @param commentPostPutObject  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /notes/{id}/comments/{commentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OneCommentResponse200> updateCommentForNoteWithHttpInfo(@Param("id") Integer id, @Param("commentId") UUID commentId, CommentPostPutObject commentPostPutObject);



  /**
   * Update a note
   * Updates a note.
   * @param id The ID of the note (required)
   * @param noteRequest  (optional)
   * @return OneNoteResponse200
   */
  @RequestLine("PUT /notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OneNoteResponse200 updateNote(@Param("id") Integer id, NoteRequest noteRequest);

  /**
   * Update a note
   * Similar to <code>updateNote</code> but it also returns the http response headers .
   * Updates a note.
   * @param id The ID of the note (required)
   * @param noteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OneNoteResponse200> updateNoteWithHttpInfo(@Param("id") Integer id, NoteRequest noteRequest);


}
