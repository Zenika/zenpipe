package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.DeleteProductFieldResponse200;
import com.zenika.pipedrive.model.DeleteProductFieldsResponse200;
import com.zenika.pipedrive.model.FailResponse;
import com.zenika.pipedrive.model.GetProductFieldResponse200;
import com.zenika.pipedrive.model.GetProductFieldsResponse200;
import com.zenika.pipedrive.model.ProductFieldAllOf;
import com.zenika.pipedrive.model.UpdateProductFieldResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface ProductFieldsApi extends ApiClient.Api {


  /**
   * Add a new product field
   * Adds a new product field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param productFieldAllOf  (optional)
   * @return GetProductFieldResponse200
   */
  @RequestLine("POST /productFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GetProductFieldResponse200 addProductField(ProductFieldAllOf productFieldAllOf);

  /**
   * Add a new product field
   * Similar to <code>addProductField</code> but it also returns the http response headers .
   * Adds a new product field. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-new-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a new custom field&lt;/a&gt;.
   * @param productFieldAllOf  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /productFields")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GetProductFieldResponse200> addProductFieldWithHttpInfo(ProductFieldAllOf productFieldAllOf);



  /**
   * Delete a product field
   * Marks a product field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the product field (required)
   * @return DeleteProductFieldResponse200
   */
  @RequestLine("DELETE /productFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteProductFieldResponse200 deleteProductField(@Param("id") Integer id);

  /**
   * Delete a product field
   * Similar to <code>deleteProductField</code> but it also returns the http response headers .
   * Marks a product field as deleted. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/deleting-a-custom-field\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;deleting a custom field&lt;/a&gt;.
   * @param id The ID of the product field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /productFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteProductFieldResponse200> deleteProductFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete multiple product fields in bulk
   * Marks multiple fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return DeleteProductFieldsResponse200
   */
  @RequestLine("DELETE /productFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  DeleteProductFieldsResponse200 deleteProductFields(@Param("ids") String ids);

  /**
   * Delete multiple product fields in bulk
   * Similar to <code>deleteProductFields</code> but it also returns the http response headers .
   * Marks multiple fields as deleted.
   * @param ids The comma-separated field IDs to delete (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /productFields?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteProductFieldsResponse200> deleteProductFieldsWithHttpInfo(@Param("ids") String ids);


  /**
   * Delete multiple product fields in bulk
   * Marks multiple fields as deleted.
   * Note, this is equivalent to the other <code>deleteProductFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteProductFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - The comma-separated field IDs to delete (required)</li>
   *   </ul>
   * @return DeleteProductFieldsResponse200
   */
  @RequestLine("DELETE /productFields?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  DeleteProductFieldsResponse200 deleteProductFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete multiple product fields in bulk
  * Marks multiple fields as deleted.
  * Note, this is equivalent to the other <code>deleteProductFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - The comma-separated field IDs to delete (required)</li>
      *   </ul>
          * @return DeleteProductFieldsResponse200
      */
      @RequestLine("DELETE /productFields?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DeleteProductFieldsResponse200> deleteProductFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteProductFields</code> method in a fluent style.
   */
  public static class DeleteProductFieldsQueryParams extends HashMap<String, Object> {
    public DeleteProductFieldsQueryParams ids(final String value) {
      put("ids", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get one product field
   * Returns data about a specific product field.
   * @param id The ID of the product field (required)
   * @return GetProductFieldResponse200
   */
  @RequestLine("GET /productFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetProductFieldResponse200 getProductField(@Param("id") Integer id);

  /**
   * Get one product field
   * Similar to <code>getProductField</code> but it also returns the http response headers .
   * Returns data about a specific product field.
   * @param id The ID of the product field (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /productFields/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetProductFieldResponse200> getProductFieldWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all product fields
   * Returns data about all product fields.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetProductFieldsResponse200
   */
  @RequestLine("GET /productFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetProductFieldsResponse200 getProductFields(@Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all product fields
   * Similar to <code>getProductFields</code> but it also returns the http response headers .
   * Returns data about all product fields.
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /productFields?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetProductFieldsResponse200> getProductFieldsWithHttpInfo(@Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all product fields
   * Returns data about all product fields.
   * Note, this is equivalent to the other <code>getProductFields</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetProductFieldsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetProductFieldsResponse200
   */
  @RequestLine("GET /productFields?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetProductFieldsResponse200 getProductFields(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all product fields
  * Returns data about all product fields.
  * Note, this is equivalent to the other <code>getProductFields</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetProductFieldsResponse200
      */
      @RequestLine("GET /productFields?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetProductFieldsResponse200> getProductFieldsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getProductFields</code> method in a fluent style.
   */
  public static class GetProductFieldsQueryParams extends HashMap<String, Object> {
    public GetProductFieldsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetProductFieldsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a product field
   * Updates a product field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the product field (required)
   * @param updateProductFieldResponse200  (optional)
   * @return GetProductFieldResponse200
   */
  @RequestLine("PUT /productFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GetProductFieldResponse200 updateProductField(@Param("id") Integer id, UpdateProductFieldResponse200 updateProductFieldResponse200);

  /**
   * Update a product field
   * Similar to <code>updateProductField</code> but it also returns the http response headers .
   * Updates a product field. For more information, see the tutorial for &lt;a href&#x3D;\&quot; https://pipedrive.readme.io/docs/updating-custom-field-value \&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;updating custom fields&#39; values&lt;/a&gt;.
   * @param id The ID of the product field (required)
   * @param updateProductFieldResponse200  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /productFields/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GetProductFieldResponse200> updateProductFieldWithHttpInfo(@Param("id") Integer id, UpdateProductFieldResponse200 updateProductFieldResponse200);


}
