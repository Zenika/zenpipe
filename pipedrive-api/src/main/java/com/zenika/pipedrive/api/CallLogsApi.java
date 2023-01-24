package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddCallLogAudioFileResponse200;
import com.zenika.pipedrive.model.AddCallLogRequest;
import com.zenika.pipedrive.model.AddCallLogResponse200;
import com.zenika.pipedrive.model.CallLogResponse400;
import com.zenika.pipedrive.model.CallLogResponse403;
import com.zenika.pipedrive.model.CallLogResponse404;
import com.zenika.pipedrive.model.CallLogResponse409;
import com.zenika.pipedrive.model.CallLogResponse410;
import com.zenika.pipedrive.model.CallLogResponse500;
import com.zenika.pipedrive.model.DeleteCallLogResponse200;
import java.io.File;
import com.zenika.pipedrive.model.GetCallLog200Response;
import com.zenika.pipedrive.model.GetUserCallLogsResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface CallLogsApi extends ApiClient.Api {


  /**
   * Add a call log
   * Adds a new call log.
   * @param addCallLogRequest  (optional)
   * @return AddCallLogResponse200
   */
  @RequestLine("POST /callLogs")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddCallLogResponse200 addCallLog(AddCallLogRequest addCallLogRequest);

  /**
   * Add a call log
   * Similar to <code>addCallLog</code> but it also returns the http response headers .
   * Adds a new call log.
   * @param addCallLogRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /callLogs")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddCallLogResponse200> addCallLogWithHttpInfo(AddCallLogRequest addCallLogRequest);



  /**
   * Attach an audio file to the call log
   * Adds an audio recording to the call log. That audio can be played by those who have access to the call log object.
   * @param id The ID received when you create the call log (required)
   * @param file Audio file supported by the HTML5 specification (required)
   * @return AddCallLogAudioFileResponse200
   */
  @RequestLine("POST /callLogs/{id}/recordings")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  AddCallLogAudioFileResponse200 addCallLogAudioFile(@Param("id") String id, @Param("file") File file);

  /**
   * Attach an audio file to the call log
   * Similar to <code>addCallLogAudioFile</code> but it also returns the http response headers .
   * Adds an audio recording to the call log. That audio can be played by those who have access to the call log object.
   * @param id The ID received when you create the call log (required)
   * @param file Audio file supported by the HTML5 specification (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /callLogs/{id}/recordings")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  ApiResponse<AddCallLogAudioFileResponse200> addCallLogAudioFileWithHttpInfo(@Param("id") String id, @Param("file") File file);



  /**
   * Delete a call log
   * Deletes a call log. If there is an audio recording attached to it, it will also be deleted. The related activity will not be removed by this request. If you want to remove the related activities, please use the endpoint which is specific for activities.
   * @param id The ID received when you create the call log (required)
   * @return DeleteCallLogResponse200
   */
  @RequestLine("DELETE /callLogs/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteCallLogResponse200 deleteCallLog(@Param("id") String id);

  /**
   * Delete a call log
   * Similar to <code>deleteCallLog</code> but it also returns the http response headers .
   * Deletes a call log. If there is an audio recording attached to it, it will also be deleted. The related activity will not be removed by this request. If you want to remove the related activities, please use the endpoint which is specific for activities.
   * @param id The ID received when you create the call log (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /callLogs/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteCallLogResponse200> deleteCallLogWithHttpInfo(@Param("id") String id);



  /**
   * Get details of a call log
   * Returns details of a specific call log.
   * @param id The ID received when you create the call log (required)
   * @return GetCallLog200Response
   */
  @RequestLine("GET /callLogs/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetCallLog200Response getCallLog(@Param("id") String id);

  /**
   * Get details of a call log
   * Similar to <code>getCallLog</code> but it also returns the http response headers .
   * Returns details of a specific call log.
   * @param id The ID received when you create the call log (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /callLogs/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetCallLog200Response> getCallLogWithHttpInfo(@Param("id") String id);



  /**
   * Get all call logs assigned to a particular user
   * Returns all call logs assigned to a particular user.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetUserCallLogsResponse200
   */
  @RequestLine("GET /callLogs?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetUserCallLogsResponse200 getUserCallLogs(@Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all call logs assigned to a particular user
   * Similar to <code>getUserCallLogs</code> but it also returns the http response headers .
   * Returns all call logs assigned to a particular user.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /callLogs?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetUserCallLogsResponse200> getUserCallLogsWithHttpInfo(@Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all call logs assigned to a particular user
   * Returns all call logs assigned to a particular user.
   * Note, this is equivalent to the other <code>getUserCallLogs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserCallLogsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetUserCallLogsResponse200
   */
  @RequestLine("GET /callLogs?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetUserCallLogsResponse200 getUserCallLogs(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all call logs assigned to a particular user
  * Returns all call logs assigned to a particular user.
  * Note, this is equivalent to the other <code>getUserCallLogs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetUserCallLogsResponse200
      */
      @RequestLine("GET /callLogs?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetUserCallLogsResponse200> getUserCallLogsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserCallLogs</code> method in a fluent style.
   */
  public static class GetUserCallLogsQueryParams extends HashMap<String, Object> {
    public GetUserCallLogsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetUserCallLogsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}
