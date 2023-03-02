package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddProductFollowerRequest;
import com.zenika.pipedrive.model.AddProductRequest;
import com.zenika.pipedrive.model.AddProductRequest1;
import com.zenika.pipedrive.model.DeleteProductFollowerResponse200;
import com.zenika.pipedrive.model.DeleteProductResponse200;
import com.zenika.pipedrive.model.GetAssociatedDealsResponse200;
import com.zenika.pipedrive.model.GetAssociatedFilesResponse200;
import com.zenika.pipedrive.model.GetProductFollowersResponseSuccess;
import com.zenika.pipedrive.model.GetProductsResponse200;
import com.zenika.pipedrive.model.GetproductResponse200;
import com.zenika.pipedrive.model.NewFollowerResponse200;
import com.zenika.pipedrive.model.SearchProductsResponse200;
import com.zenika.pipedrive.model.UpdateProductResponse200;
import com.zenika.pipedrive.model.UserIds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface ProductsApi extends ApiClient.Api {


  /**
   * Add a product
   * Adds a new product to the Products inventory. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-product\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a product&lt;/a&gt;.
   * @param addProductRequest  (optional)
   * @return GetproductResponse200
   */
  @RequestLine("POST /products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GetproductResponse200 addProduct(AddProductRequest addProductRequest);

  /**
   * Add a product
   * Similar to <code>addProduct</code> but it also returns the http response headers .
   * Adds a new product to the Products inventory. For more information, see the tutorial for &lt;a href&#x3D;\&quot;https://pipedrive.readme.io/docs/adding-a-product\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;adding a product&lt;/a&gt;.
   * @param addProductRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GetproductResponse200> addProductWithHttpInfo(AddProductRequest addProductRequest);



  /**
   * Add a follower to a product
   * Adds a follower to a product.
   * @param id The ID of the product (required)
   * @param addProductFollowerRequest  (optional)
   * @return NewFollowerResponse200
   */
  @RequestLine("POST /products/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NewFollowerResponse200 addProductFollower(@Param("id") Integer id, AddProductFollowerRequest addProductFollowerRequest);

  /**
   * Add a follower to a product
   * Similar to <code>addProductFollower</code> but it also returns the http response headers .
   * Adds a follower to a product.
   * @param id The ID of the product (required)
   * @param addProductFollowerRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /products/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NewFollowerResponse200> addProductFollowerWithHttpInfo(@Param("id") Integer id, AddProductFollowerRequest addProductFollowerRequest);



  /**
   * Delete a product
   * Marks a product as deleted. After 30 days, the product will be permanently deleted.
   * @param id The ID of the product (required)
   * @return DeleteProductResponse200
   */
  @RequestLine("DELETE /products/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteProductResponse200 deleteProduct(@Param("id") Integer id);

  /**
   * Delete a product
   * Similar to <code>deleteProduct</code> but it also returns the http response headers .
   * Marks a product as deleted. After 30 days, the product will be permanently deleted.
   * @param id The ID of the product (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /products/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteProductResponse200> deleteProductWithHttpInfo(@Param("id") Integer id);



  /**
   * Delete a follower from a product
   * Deletes a follower from a product.
   * @param id The ID of the product (required)
   * @param followerId The ID of the relationship between the follower and the product (required)
   * @return DeleteProductFollowerResponse200
   */
  @RequestLine("DELETE /products/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  DeleteProductFollowerResponse200 deleteProductFollower(@Param("id") Integer id, @Param("followerId") Integer followerId);

  /**
   * Delete a follower from a product
   * Similar to <code>deleteProductFollower</code> but it also returns the http response headers .
   * Deletes a follower from a product.
   * @param id The ID of the product (required)
   * @param followerId The ID of the relationship between the follower and the product (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /products/{id}/followers/{followerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteProductFollowerResponse200> deleteProductFollowerWithHttpInfo(@Param("id") Integer id, @Param("followerId") Integer followerId);



  /**
   * Get one product
   * Returns data about a specific product.
   * @param id The ID of the product (required)
   * @return GetproductResponse200
   */
  @RequestLine("GET /products/{id}")
  @Headers({
    "Accept: application/json",
  })
  GetproductResponse200 getProduct(@Param("id") Integer id);

  /**
   * Get one product
   * Similar to <code>getProduct</code> but it also returns the http response headers .
   * Returns data about a specific product.
   * @param id The ID of the product (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /products/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetproductResponse200> getProductWithHttpInfo(@Param("id") Integer id);



  /**
   * Get deals where a product is attached to
   * Returns data about deals that have a product attached to it.
   * @param id The ID of the product (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @return GetAssociatedDealsResponse200
   */
  @RequestLine("GET /products/{id}/deals?start={start}&limit={limit}&status={status}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedDealsResponse200 getProductDeals(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("status") String status);

  /**
   * Get deals where a product is attached to
   * Similar to <code>getProductDeals</code> but it also returns the http response headers .
   * Returns data about deals that have a product attached to it.
   * @param id The ID of the product (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /products/{id}/deals?start={start}&limit={limit}&status={status}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedDealsResponse200> getProductDealsWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("status") String status);


  /**
   * Get deals where a product is attached to
   * Returns data about deals that have a product attached to it.
   * Note, this is equivalent to the other <code>getProductDeals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetProductDealsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the product (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
   *   </ul>
   * @return GetAssociatedDealsResponse200
   */
  @RequestLine("GET /products/{id}/deals?start={start}&limit={limit}&status={status}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedDealsResponse200 getProductDeals(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get deals where a product is attached to
  * Returns data about deals that have a product attached to it.
  * Note, this is equivalent to the other <code>getProductDeals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the product (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>status - Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included. (optional, default to all_not_deleted)</li>
      *   </ul>
          * @return GetAssociatedDealsResponse200
      */
      @RequestLine("GET /products/{id}/deals?start={start}&limit={limit}&status={status}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedDealsResponse200> getProductDealsWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getProductDeals</code> method in a fluent style.
   */
  public static class GetProductDealsQueryParams extends HashMap<String, Object> {
    public GetProductDealsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetProductDealsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetProductDealsQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List files attached to a product
   * Lists files associated with a product.
   * @param id The ID of the product (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /products/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getProductFiles(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);

  /**
   * List files attached to a product
   * Similar to <code>getProductFiles</code> but it also returns the http response headers .
   * Lists files associated with a product.
   * @param id The ID of the product (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @param sort The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /products/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetAssociatedFilesResponse200> getProductFilesWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit, @Param("sort") String sort);


  /**
   * List files attached to a product
   * Lists files associated with a product.
   * Note, this is equivalent to the other <code>getProductFiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetProductFilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the product (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
   *   </ul>
   * @return GetAssociatedFilesResponse200
   */
  @RequestLine("GET /products/{id}/files?start={start}&limit={limit}&sort={sort}")
  @Headers({
  "Accept: application/json",
  })
  GetAssociatedFilesResponse200 getProductFiles(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List files attached to a product
  * Lists files associated with a product.
  * Note, this is equivalent to the other <code>getProductFiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the product (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
          *   <li>sort - The field names and sorting mode separated by a comma (&#x60;field_name_1 ASC&#x60;, &#x60;field_name_2 DESC&#x60;). Only first-level field keys are supported (no nested keys). Supported fields: &#x60;id&#x60;, &#x60;user_id&#x60;, &#x60;deal_id&#x60;, &#x60;person_id&#x60;, &#x60;org_id&#x60;, &#x60;product_id&#x60;, &#x60;add_time&#x60;, &#x60;update_time&#x60;, &#x60;file_name&#x60;, &#x60;file_type&#x60;, &#x60;file_size&#x60;, &#x60;comment&#x60;. (optional)</li>
      *   </ul>
          * @return GetAssociatedFilesResponse200
      */
      @RequestLine("GET /products/{id}/files?start={start}&limit={limit}&sort={sort}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetAssociatedFilesResponse200> getProductFilesWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getProductFiles</code> method in a fluent style.
   */
  public static class GetProductFilesQueryParams extends HashMap<String, Object> {
    public GetProductFilesQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetProductFilesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetProductFilesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List followers of a product
   * Lists the followers of a product.
   * @param id The ID of the product (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetProductFollowersResponseSuccess
   */
  @RequestLine("GET /products/{id}/followers?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetProductFollowersResponseSuccess getProductFollowers(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * List followers of a product
   * Similar to <code>getProductFollowers</code> but it also returns the http response headers .
   * Lists the followers of a product.
   * @param id The ID of the product (required)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /products/{id}/followers?start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetProductFollowersResponseSuccess> getProductFollowersWithHttpInfo(@Param("id") Integer id, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * List followers of a product
   * Lists the followers of a product.
   * Note, this is equivalent to the other <code>getProductFollowers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetProductFollowersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The ID of the product (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetProductFollowersResponseSuccess
   */
  @RequestLine("GET /products/{id}/followers?start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetProductFollowersResponseSuccess getProductFollowers(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List followers of a product
  * Lists the followers of a product.
  * Note, this is equivalent to the other <code>getProductFollowers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The ID of the product (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetProductFollowersResponseSuccess
      */
      @RequestLine("GET /products/{id}/followers?start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetProductFollowersResponseSuccess> getProductFollowersWithHttpInfo(@Param("id") Integer id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getProductFollowers</code> method in a fluent style.
   */
  public static class GetProductFollowersQueryParams extends HashMap<String, Object> {
    public GetProductFollowersQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetProductFollowersQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List permitted users
   * Lists users permitted to access a product.
   * @param id The ID of the product (required)
   * @return UserIds
   */
  @RequestLine("GET /products/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  UserIds getProductUsers(@Param("id") Integer id);

  /**
   * List permitted users
   * Similar to <code>getProductUsers</code> but it also returns the http response headers .
   * Lists users permitted to access a product.
   * @param id The ID of the product (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /products/{id}/permittedUsers")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserIds> getProductUsersWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all products
   * Returns data about all products.
   * @param userId If supplied, only products owned by the given user will be returned (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param ids An array of integers with the IDs of the products that should be returned in the response (optional)
   * @param firstChar If supplied, only products whose name starts with the specified letter will be returned (case insensitive) (optional)
   * @param getSummary If supplied, the response will return the total numbers of products in the &#x60;additional_data.summary.total_count&#x60; property (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return GetProductsResponse200
   */
  @RequestLine("GET /products?user_id={userId}&filter_id={filterId}&ids={ids}&first_char={firstChar}&get_summary={getSummary}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  GetProductsResponse200 getProducts(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("ids") List<Integer> ids, @Param("firstChar") String firstChar, @Param("getSummary") Boolean getSummary, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Get all products
   * Similar to <code>getProducts</code> but it also returns the http response headers .
   * Returns data about all products.
   * @param userId If supplied, only products owned by the given user will be returned (optional)
   * @param filterId The ID of the filter to use (optional)
   * @param ids An array of integers with the IDs of the products that should be returned in the response (optional)
   * @param firstChar If supplied, only products whose name starts with the specified letter will be returned (case insensitive) (optional)
   * @param getSummary If supplied, the response will return the total numbers of products in the &#x60;additional_data.summary.total_count&#x60; property (optional)
   * @param start Pagination start (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /products?user_id={userId}&filter_id={filterId}&ids={ids}&first_char={firstChar}&get_summary={getSummary}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetProductsResponse200> getProductsWithHttpInfo(@Param("userId") Integer userId, @Param("filterId") Integer filterId, @Param("ids") List<Integer> ids, @Param("firstChar") String firstChar, @Param("getSummary") Boolean getSummary, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Get all products
   * Returns data about all products.
   * Note, this is equivalent to the other <code>getProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - If supplied, only products owned by the given user will be returned (optional)</li>
   *   <li>filterId - The ID of the filter to use (optional)</li>
   *   <li>ids - An array of integers with the IDs of the products that should be returned in the response (optional)</li>
   *   <li>firstChar - If supplied, only products whose name starts with the specified letter will be returned (case insensitive) (optional)</li>
   *   <li>getSummary - If supplied, the response will return the total numbers of products in the &#x60;additional_data.summary.total_count&#x60; property (optional)</li>
   *   <li>start - Pagination start (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return GetProductsResponse200
   */
  @RequestLine("GET /products?user_id={userId}&filter_id={filterId}&ids={ids}&first_char={firstChar}&get_summary={getSummary}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  GetProductsResponse200 getProducts(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all products
  * Returns data about all products.
  * Note, this is equivalent to the other <code>getProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>userId - If supplied, only products owned by the given user will be returned (optional)</li>
          *   <li>filterId - The ID of the filter to use (optional)</li>
          *   <li>ids - An array of integers with the IDs of the products that should be returned in the response (optional)</li>
          *   <li>firstChar - If supplied, only products whose name starts with the specified letter will be returned (case insensitive) (optional)</li>
          *   <li>getSummary - If supplied, the response will return the total numbers of products in the &#x60;additional_data.summary.total_count&#x60; property (optional)</li>
          *   <li>start - Pagination start (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return GetProductsResponse200
      */
      @RequestLine("GET /products?user_id={userId}&filter_id={filterId}&ids={ids}&first_char={firstChar}&get_summary={getSummary}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetProductsResponse200> getProductsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getProducts</code> method in a fluent style.
   */
  public static class GetProductsQueryParams extends HashMap<String, Object> {
    public GetProductsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public GetProductsQueryParams filterId(final Integer value) {
      put("filter_id", EncodingUtils.encode(value));
      return this;
    }
    public GetProductsQueryParams ids(final List<Integer> value) {
      put("ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetProductsQueryParams firstChar(final String value) {
      put("first_char", EncodingUtils.encode(value));
      return this;
    }
    public GetProductsQueryParams getSummary(final Boolean value) {
      put("get_summary", EncodingUtils.encode(value));
      return this;
    }
    public GetProductsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public GetProductsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Search products
   * Searches all products by name, code and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return SearchProductsResponse200
   */
  @RequestLine("GET /products/search?term={term}&fields={fields}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  SearchProductsResponse200 searchProducts(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Search products
   * Similar to <code>searchProducts</code> but it also returns the http response headers .
   * Searches all products by name, code and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param includeFields Supports including optional fields in the results which are not provided by default (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /products/search?term={term}&fields={fields}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchProductsResponse200> searchProductsWithHttpInfo(@Param("term") String term, @Param("fields") String fields, @Param("exactMatch") Boolean exactMatch, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Search products
   * Searches all products by name, code and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
   * Note, this is equivalent to the other <code>searchProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
   *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
   *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
   *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
   *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return SearchProductsResponse200
   */
  @RequestLine("GET /products/search?term={term}&fields={fields}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  SearchProductsResponse200 searchProducts(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Search products
  * Searches all products by name, code and/or custom fields. This endpoint is a wrapper of &lt;a href&#x3D;\&quot;https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\&quot;&gt;/v1/itemSearch&lt;/a&gt; with a narrower OAuth scope.
  * Note, this is equivalent to the other <code>searchProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
          *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all of them. (optional)</li>
          *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
          *   <li>includeFields - Supports including optional fields in the results which are not provided by default (optional)</li>
          *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return SearchProductsResponse200
      */
      @RequestLine("GET /products/search?term={term}&fields={fields}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchProductsResponse200> searchProductsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchProducts</code> method in a fluent style.
   */
  public static class SearchProductsQueryParams extends HashMap<String, Object> {
    public SearchProductsQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public SearchProductsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchProductsQueryParams exactMatch(final Boolean value) {
      put("exact_match", EncodingUtils.encode(value));
      return this;
    }
    public SearchProductsQueryParams includeFields(final String value) {
      put("include_fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchProductsQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public SearchProductsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a product
   * Updates product data.
   * @param id The ID of the product (required)
   * @param addProductRequest1  (optional)
   * @return UpdateProductResponse200
   */
  @RequestLine("PUT /products/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateProductResponse200 updateProduct(@Param("id") Integer id, AddProductRequest1 addProductRequest1);

  /**
   * Update a product
   * Similar to <code>updateProduct</code> but it also returns the http response headers .
   * Updates product data.
   * @param id The ID of the product (required)
   * @param addProductRequest1  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /products/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateProductResponse200> updateProductWithHttpInfo(@Param("id") Integer id, AddProductRequest1 addProductRequest1);


}
