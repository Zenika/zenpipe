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
public interface PersonFieldsApi extends ApiClient.Api {


  /**
   * Add a new person field
   * Adds a new person field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param createFieldRequest  (optional)
   * @return FieldResponse200
   */
  @RequestLine("POST /personFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FieldResponse200 addPersonField(CreateFieldRequest createFieldRequest);

  /**
   * Add a new person field
   * Similar to <code>addPersonField</code> but it also returns the http response headers .
   * Adds a new person field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param createFieldRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /personFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> addPersonFieldWithHttpInfo(CreateFieldRequest createFieldRequest);



  /**
   * Delete a person field
   * Marks a field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @return DeleteFieldResponse200
   */
  @RequestLine("DELETE /personFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFieldResponse200 deletePersonField(@Param("id") Integer id);

  /**
   * Delete a person field
   * Similar to <code>deletePersonField</code> but it also returns the http response headers .
   * Marks a field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /personFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFieldResponse200> deletePersonFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple person fields in bulk
   * Marks multiple fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return DeleteFieldsResponse200
   */
  @RequestLine("DELETE /personFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFieldsResponse200 deletePersonFields(@Param("ids") String ids);

  /**
   * Delete multiple person fields in bulk
   * Similar to <code>deletePersonFields</code> but it also returns the http response headers .
   * Marks multiple fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /personFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFieldsResponse200> deletePersonFieldsWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple person fields in bulk
   * Marks multiple fields as deleted.
   * Note, this is equivalent to the other <code>deletePersonFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePersonFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated field IDs to delete (required)</li>
   *   </ul>
   * @return DeleteFieldsResponse200
   */
  @RequestLine("DELETE /personFields?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteFieldsResponse200 deletePersonFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple person fields in bulk
  * Marks multiple fields as deleted.
  * Note, this is equivalent to the other <code>deletePersonFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated field IDs to delete (required)</li>
      *   </ul>
          * @return DeleteFieldsResponse200
      */
      @RequestLine("DELETE /personFields?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteFieldsResponse200> deletePersonFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePersonFields</code> method in a fluent style.
   */
  public static class DeletePersonFieldsQueryParams extends HashMap<String, Object> {
    public DeletePersonFieldsQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get one person field
   * Returns data about a specific person field.
   * @param id The ID of the field (required)
   * @return FieldResponse200
   */
  @RequestLine("GET /personFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  FieldResponse200 getPersonField(@Param("id") Integer id);

  /**
   * Get one person field
   * Similar to <code>getPersonField</code> but it also returns the http response headers .
   * Returns data about a specific person field.
   * @param id The ID of the field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /personFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> getPersonFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all person fields
   * Returns data about all person fields.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return FieldsResponse200
   */
  @RequestLine("GET /personFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  FieldsResponse200 getPersonFields(@Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all person fields
   * Similar to <code>getPersonFields</code> but it also returns the http response headers .
   * Returns data about all person fields.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /personFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FieldsResponse200> getPersonFieldsWithHttpInfo(@Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all person fields
   * Returns data about all person fields.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
   * Note, this is equivalent to the other <code>getPersonFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return FieldsResponse200
   */
  @RequestLine("GET /personFields?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  FieldsResponse200 getPersonFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all person fields
  * Returns data about all person fields.&lt;br&gt;If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the &#x60;data.marketing_status&#x60; field.
  * Note, this is equivalent to the other <code>getPersonFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return FieldsResponse200
      */
      @RequestLine("GET /personFields?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<FieldsResponse200> getPersonFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonFields</code> method in a fluent style.
   */
  public static class GetPersonFieldsQueryParams extends HashMap<String, Object> {
    public GetPersonFieldsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonFieldsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a person field
   * Updates a person field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @param updateFieldRequest  (optional)
   * @return FieldResponse200
   */
  @RequestLine("PUT /personFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FieldResponse200 updatePersonField(@Param("id") Integer id, UpdateFieldRequest updateFieldRequest);

  /**
   * Update a person field
   * Similar to <code>updatePersonField</code> but it also returns the http response headers .
   * Updates a person field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @param updateFieldRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /personFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> updatePersonFieldWithHttpInfo(@Param("id") Integer id, UpdateFieldRequest updateFieldRequest);


}
