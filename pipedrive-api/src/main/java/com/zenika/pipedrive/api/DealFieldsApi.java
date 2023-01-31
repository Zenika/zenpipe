package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.CreateFieldRequest;
import com.zenika.pipedrive.model.DeleteFieldResponse200;
import com.zenika.pipedrive.model.DeleteFieldsResponse200;
import com.zenika.pipedrive.model.FieldResponse200;
import com.zenika.pipedrive.model.FieldsResponse200;
import com.zenika.pipedrive.model.UpdateFieldRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface DealFieldsApi extends ApiClient.Api {


  /**
   * Add a new deal field
   * Adds a new deal field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param createFieldRequest  (optional)
   * @return FieldResponse200
   */
  @RequestLine("POST /dealFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FieldResponse200 addDealField(CreateFieldRequest createFieldRequest);

  /**
   * Add a new deal field
   * Similar to <code>addDealField</code> but it also returns the http response headers .
   * Adds a new deal field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param createFieldRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /dealFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> addDealFieldWithHttpInfo(CreateFieldRequest createFieldRequest);



  /**
   * Delete a deal field
   * Marks a field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @return DeleteFieldResponse200
   */
  @RequestLine("DELETE /dealFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFieldResponse200 deleteDealField(@Param("id") Integer id);

  /**
   * Delete a deal field
   * Similar to <code>deleteDealField</code> but it also returns the http response headers .
   * Marks a field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /dealFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFieldResponse200> deleteDealFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple deal fields in bulk
   * Marks multiple deal fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return DeleteFieldsResponse200
   */
  @RequestLine("DELETE /dealFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFieldsResponse200 deleteDealFields(@Param("ids") String ids);

  /**
   * Delete multiple deal fields in bulk
   * Similar to <code>deleteDealFields</code> but it also returns the http response headers .
   * Marks multiple deal fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /dealFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFieldsResponse200> deleteDealFieldsWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple deal fields in bulk
   * Marks multiple deal fields as deleted.
   * Note, this is equivalent to the other <code>deleteDealFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDealFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated field IDs to delete (required)</li>
   *   </ul>
   * @return DeleteFieldsResponse200
   */
  @RequestLine("DELETE /dealFields?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteFieldsResponse200 deleteDealFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple deal fields in bulk
  * Marks multiple deal fields as deleted.
  * Note, this is equivalent to the other <code>deleteDealFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated field IDs to delete (required)</li>
      *   </ul>
          * @return DeleteFieldsResponse200
      */
      @RequestLine("DELETE /dealFields?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteFieldsResponse200> deleteDealFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDealFields</code> method in a fluent style.
   */
  public static class DeleteDealFieldsQueryParams extends HashMap<String, Object> {
    public DeleteDealFieldsQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get one deal field
   * Returns data about a specific deal field.
   * @param id The ID of the field (required)
   * @return FieldResponse200
   */
  @RequestLine("GET /dealFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  FieldResponse200 getDealField(@Param("id") Integer id);

  /**
   * Get one deal field
   * Similar to <code>getDealField</code> but it also returns the http response headers .
   * Returns data about a specific deal field.
   * @param id The ID of the field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /dealFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> getDealFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all deal fields
   * Returns data about all deal fields.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return FieldsResponse200
   */
  @RequestLine("GET /dealFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  FieldsResponse200 getDealFields(@Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all deal fields
   * Similar to <code>getDealFields</code> but it also returns the http response headers .
   * Returns data about all deal fields.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /dealFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FieldsResponse200> getDealFieldsWithHttpInfo(@Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all deal fields
   * Returns data about all deal fields.
   * Note, this is equivalent to the other <code>getDealFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDealFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return FieldsResponse200
   */
  @RequestLine("GET /dealFields?start={start}&limit={limit}&name={name}")
  @Headers({
  "Accept: application/json",
  })
  FieldsResponse200 getDealFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all deal fields
  * Returns data about all deal fields.
  * Note, this is equivalent to the other <code>getDealFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return FieldsResponse200
      */
      @RequestLine("GET /dealFields?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<FieldsResponse200> getDealFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDealFields</code> method in a fluent style.
   */
  public static class GetDealFieldsQueryParams extends HashMap<String, Object> {
    public GetDealFieldsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetDealFieldsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a deal field
   * Updates a deal field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @param updateFieldRequest  (optional)
   * @return FieldResponse200
   */
  @RequestLine("PUT /dealFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FieldResponse200 updateDealField(@Param("id") Integer id, UpdateFieldRequest updateFieldRequest);

  /**
   * Update a deal field
   * Similar to <code>updateDealField</code> but it also returns the http response headers .
   * Updates a deal field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @param updateFieldRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /dealFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> updateDealFieldWithHttpInfo(@Param("id") Integer id, UpdateFieldRequest updateFieldRequest);


}
