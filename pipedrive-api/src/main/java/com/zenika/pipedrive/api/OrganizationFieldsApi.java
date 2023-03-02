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
public interface OrganizationFieldsApi extends ApiClient.Api {


  /**
   * Add a new organization field
   * Adds a new organization field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param createFieldRequest  (optional)
   * @return FieldResponse200
   */
  @RequestLine("POST /organizationFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FieldResponse200 addOrganizationField(CreateFieldRequest createFieldRequest);

  /**
   * Add a new organization field
   * Similar to <code>addOrganizationField</code> but it also returns the http response headers .
   * Adds a new organization field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param createFieldRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /organizationFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> addOrganizationFieldWithHttpInfo(CreateFieldRequest createFieldRequest);



  /**
   * Delete an organization field
   * Marks a field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @return DeleteFieldResponse200
   */
  @RequestLine("DELETE /organizationFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFieldResponse200 deleteOrganizationField(@Param("id") Integer id);

  /**
   * Delete an organization field
   * Similar to <code>deleteOrganizationField</code> but it also returns the http response headers .
   * Marks a field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /organizationFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFieldResponse200> deleteOrganizationFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple organization fields in bulk
   * Marks multiple fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return DeleteFieldsResponse200
   */
  @RequestLine("DELETE /organizationFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteFieldsResponse200 deleteOrganizationFields(@Param("ids") String ids);

  /**
   * Delete multiple organization fields in bulk
   * Similar to <code>deleteOrganizationFields</code> but it also returns the http response headers .
   * Marks multiple fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /organizationFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteFieldsResponse200> deleteOrganizationFieldsWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple organization fields in bulk
   * Marks multiple fields as deleted.
   * Note, this is equivalent to the other <code>deleteOrganizationFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOrganizationFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated field IDs to delete (required)</li>
   *   </ul>
   * @return DeleteFieldsResponse200
   */
  @RequestLine("DELETE /organizationFields?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteFieldsResponse200 deleteOrganizationFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple organization fields in bulk
  * Marks multiple fields as deleted.
  * Note, this is equivalent to the other <code>deleteOrganizationFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated field IDs to delete (required)</li>
      *   </ul>
          * @return DeleteFieldsResponse200
      */
      @RequestLine("DELETE /organizationFields?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteFieldsResponse200> deleteOrganizationFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteOrganizationFields</code> method in a fluent style.
   */
  public static class DeleteOrganizationFieldsQueryParams extends HashMap<String, Object> {
    public DeleteOrganizationFieldsQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get one organization field
   * Returns data about a specific organization field.
   * @param id The ID of the field (required)
   * @return FieldResponse200
   */
  @RequestLine("GET /organizationFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  FieldResponse200 getOrganizationField(@Param("id") Integer id);

  /**
   * Get one organization field
   * Similar to <code>getOrganizationField</code> but it also returns the http response headers .
   * Returns data about a specific organization field.
   * @param id The ID of the field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizationFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> getOrganizationFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all organization fields
   * Returns data about all organization fields.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return FieldsResponse200
   */
  @RequestLine("GET /organizationFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  FieldsResponse200 getOrganizationFields(@Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all organization fields
   * Similar to <code>getOrganizationFields</code> but it also returns the http response headers .
   * Returns data about all organization fields.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /organizationFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FieldsResponse200> getOrganizationFieldsWithHttpInfo(@Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all organization fields
   * Returns data about all organization fields.
   * Note, this is equivalent to the other <code>getOrganizationFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOrganizationFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return FieldsResponse200
   */
  @RequestLine("GET /organizationFields?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  FieldsResponse200 getOrganizationFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all organization fields
  * Returns data about all organization fields.
  * Note, this is equivalent to the other <code>getOrganizationFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return FieldsResponse200
      */
      @RequestLine("GET /organizationFields?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<FieldsResponse200> getOrganizationFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getOrganizationFields</code> method in a fluent style.
   */
  public static class GetOrganizationFieldsQueryParams extends HashMap<String, Object> {
    public GetOrganizationFieldsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetOrganizationFieldsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an organization field
   * Updates an organization field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @param updateFieldRequest  (optional)
   * @return FieldResponse200
   */
  @RequestLine("PUT /organizationFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FieldResponse200 updateOrganizationField(@Param("id") Integer id, UpdateFieldRequest updateFieldRequest);

  /**
   * Update an organization field
   * Similar to <code>updateOrganizationField</code> but it also returns the http response headers .
   * Updates an organization field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the field (required)
   * @param updateFieldRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /organizationFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FieldResponse200> updateOrganizationFieldWithHttpInfo(@Param("id") Integer id, UpdateFieldRequest updateFieldRequest);


}
