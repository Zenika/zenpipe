package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.SearchItemByFieldResponse200;
import com.zenika.pipedrive.model.SearchItemResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface ItemSearchApi extends ApiClient.Api {


  /**
   * Perform a search from multiple item types
   * Performs a search from your choice of item types and fields.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param itemTypes A comma-separated string array. The type of items to perform the search from. Defaults to all. (optional)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all. Relevant for each item type are:&lt;br&gt; &lt;table&gt; &lt;tr&gt;&lt;th&gt;&lt;b&gt;Item type&lt;/b&gt;&lt;/th&gt;&lt;th&gt;&lt;b&gt;Field&lt;/b&gt;&lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Deal&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;email&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;, &#x60;phone&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Organization&lt;/td&gt;&lt;td&gt;&#x60;address&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Product&lt;/td&gt;&lt;td&gt;&#x60;code&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Lead&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;email&#x60;, &#x60;organization_name&#x60;, &#x60;person_name&#x60;, &#x60;phone&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;File&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Mail attachment&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Project&lt;/td&gt;&lt;td&gt; &#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;, &#x60;description&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;br&gt; When searching for leads, the email, organization_name, person_name, and phone fields will return results only for leads not linked to contacts. For searching leads by person or organization values, please use &#x60;search_for_related_items&#x60;. (optional)
   * @param searchForRelatedItems When enabled, the response will include up to 100 newest related leads and 100 newest related deals for each found person and organization and up to 100 newest related persons for each found organization. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param includeFields A comma-separated string array. Supports including optional fields in the results which are not provided by default. (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return SearchItemResponse200
   */
  @RequestLine("GET /itemSearch?term={term}&item_types={itemTypes}&fields={fields}&search_for_related_items={searchForRelatedItems}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  SearchItemResponse200 searchItem(@Param("term") String term, @Param("itemTypes") String itemTypes, @Param("fields") String fields, @Param("searchForRelatedItems") Boolean searchForRelatedItems, @Param("exactMatch") Boolean exactMatch, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Perform a search from multiple item types
   * Similar to <code>searchItem</code> but it also returns the http response headers .
   * Performs a search from your choice of item types and fields.
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param itemTypes A comma-separated string array. The type of items to perform the search from. Defaults to all. (optional)
   * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all. Relevant for each item type are:&lt;br&gt; &lt;table&gt; &lt;tr&gt;&lt;th&gt;&lt;b&gt;Item type&lt;/b&gt;&lt;/th&gt;&lt;th&gt;&lt;b&gt;Field&lt;/b&gt;&lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Deal&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;email&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;, &#x60;phone&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Organization&lt;/td&gt;&lt;td&gt;&#x60;address&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Product&lt;/td&gt;&lt;td&gt;&#x60;code&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Lead&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;email&#x60;, &#x60;organization_name&#x60;, &#x60;person_name&#x60;, &#x60;phone&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;File&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Mail attachment&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Project&lt;/td&gt;&lt;td&gt; &#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;, &#x60;description&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;br&gt; When searching for leads, the email, organization_name, person_name, and phone fields will return results only for leads not linked to contacts. For searching leads by person or organization values, please use &#x60;search_for_related_items&#x60;. (optional)
   * @param searchForRelatedItems When enabled, the response will include up to 100 newest related leads and 100 newest related deals for each found person and organization and up to 100 newest related persons for each found organization. (optional)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)
   * @param includeFields A comma-separated string array. Supports including optional fields in the results which are not provided by default. (optional)
   * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /itemSearch?term={term}&item_types={itemTypes}&fields={fields}&search_for_related_items={searchForRelatedItems}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchItemResponse200> searchItemWithHttpInfo(@Param("term") String term, @Param("itemTypes") String itemTypes, @Param("fields") String fields, @Param("searchForRelatedItems") Boolean searchForRelatedItems, @Param("exactMatch") Boolean exactMatch, @Param("includeFields") String includeFields, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Perform a search from multiple item types
   * Performs a search from your choice of item types and fields.
   * Note, this is equivalent to the other <code>searchItem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchItemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
   *   <li>itemTypes - A comma-separated string array. The type of items to perform the search from. Defaults to all. (optional)</li>
   *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all. Relevant for each item type are:&lt;br&gt; &lt;table&gt; &lt;tr&gt;&lt;th&gt;&lt;b&gt;Item type&lt;/b&gt;&lt;/th&gt;&lt;th&gt;&lt;b&gt;Field&lt;/b&gt;&lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Deal&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;email&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;, &#x60;phone&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Organization&lt;/td&gt;&lt;td&gt;&#x60;address&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Product&lt;/td&gt;&lt;td&gt;&#x60;code&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Lead&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;email&#x60;, &#x60;organization_name&#x60;, &#x60;person_name&#x60;, &#x60;phone&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;File&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Mail attachment&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Project&lt;/td&gt;&lt;td&gt; &#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;, &#x60;description&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;br&gt; When searching for leads, the email, organization_name, person_name, and phone fields will return results only for leads not linked to contacts. For searching leads by person or organization values, please use &#x60;search_for_related_items&#x60;. (optional)</li>
   *   <li>searchForRelatedItems - When enabled, the response will include up to 100 newest related leads and 100 newest related deals for each found person and organization and up to 100 newest related persons for each found organization. (optional)</li>
   *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
   *   <li>includeFields - A comma-separated string array. Supports including optional fields in the results which are not provided by default. (optional)</li>
   *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return SearchItemResponse200
   */
  @RequestLine("GET /itemSearch?term={term}&item_types={itemTypes}&fields={fields}&search_for_related_items={searchForRelatedItems}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  SearchItemResponse200 searchItem(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Perform a search from multiple item types
  * Performs a search from your choice of item types and fields.
  * Note, this is equivalent to the other <code>searchItem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
          *   <li>itemTypes - A comma-separated string array. The type of items to perform the search from. Defaults to all. (optional)</li>
          *   <li>fields - A comma-separated string array. The fields to perform the search from. Defaults to all. Relevant for each item type are:&lt;br&gt; &lt;table&gt; &lt;tr&gt;&lt;th&gt;&lt;b&gt;Item type&lt;/b&gt;&lt;/th&gt;&lt;th&gt;&lt;b&gt;Field&lt;/b&gt;&lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Deal&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;email&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;, &#x60;phone&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Organization&lt;/td&gt;&lt;td&gt;&#x60;address&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;, &#x60;notes&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Product&lt;/td&gt;&lt;td&gt;&#x60;code&#x60;, &#x60;custom_fields&#x60;, &#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Lead&lt;/td&gt;&lt;td&gt;&#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;email&#x60;, &#x60;organization_name&#x60;, &#x60;person_name&#x60;, &#x60;phone&#x60;, &#x60;title&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;File&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Mail attachment&lt;/td&gt;&lt;td&gt;&#x60;name&#x60;&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Project&lt;/td&gt;&lt;td&gt; &#x60;custom_fields&#x60;, &#x60;notes&#x60;, &#x60;title&#x60;, &#x60;description&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;br&gt; When searching for leads, the email, organization_name, person_name, and phone fields will return results only for leads not linked to contacts. For searching leads by person or organization values, please use &#x60;search_for_related_items&#x60;. (optional)</li>
          *   <li>searchForRelatedItems - When enabled, the response will include up to 100 newest related leads and 100 newest related deals for each found person and organization and up to 100 newest related persons for each found organization. (optional)</li>
          *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. It is &lt;b&gt;not&lt;/b&gt; case sensitive. (optional)</li>
          *   <li>includeFields - A comma-separated string array. Supports including optional fields in the results which are not provided by default. (optional)</li>
          *   <li>start - Pagination start. Note that the pagination is based on main results and does not include related items when using &#x60;search_for_related_items&#x60; parameter. (optional, default to 0)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return SearchItemResponse200
      */
      @RequestLine("GET /itemSearch?term={term}&item_types={itemTypes}&fields={fields}&search_for_related_items={searchForRelatedItems}&exact_match={exactMatch}&include_fields={includeFields}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchItemResponse200> searchItemWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchItem</code> method in a fluent style.
   */
  public static class SearchItemQueryParams extends HashMap<String, Object> {
    public SearchItemQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemQueryParams itemTypes(final String value) {
      put("item_types", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemQueryParams searchForRelatedItems(final Boolean value) {
      put("search_for_related_items", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemQueryParams exactMatch(final Boolean value) {
      put("exact_match", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemQueryParams includeFields(final String value) {
      put("include_fields", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Perform a search using a specific field from an item type
   * Performs a search from the values of a specific field. Results can either be the distinct values of the field (useful for searching autocomplete field values), or the IDs of actual items (deals, leads, persons, organizations or products).
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fieldType The type of the field to perform the search from (required)
   * @param fieldKey The key of the field to search from. The field key can be obtained by fetching the list of the fields using any of the fields&#39; API GET methods (dealFields, personFields, etc.). (required)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. The search &lt;b&gt;is&lt;/b&gt; case sensitive. (optional, default to false)
   * @param returnItemIds Whether to return the IDs of the matching items or not. When not set or set to &#x60;0&#x60; or &#x60;false&#x60;, only distinct values of the searched field are returned. When set to &#x60;1&#x60; or &#x60;true&#x60;, the ID of each found item is returned. (optional)
   * @param start Pagination start (optional)
   * @param limit Items shown per page (optional)
   * @return SearchItemByFieldResponse200
   */
  @RequestLine("GET /itemSearch/field?term={term}&field_type={fieldType}&exact_match={exactMatch}&field_key={fieldKey}&return_item_ids={returnItemIds}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  SearchItemByFieldResponse200 searchItemByField(@Param("term") String term, @Param("fieldType") String fieldType, @Param("fieldKey") String fieldKey, @Param("exactMatch") Boolean exactMatch, @Param("returnItemIds") Boolean returnItemIds, @Param("start") Integer start, @Param("limit") Integer limit);

  /**
   * Perform a search using a specific field from an item type
   * Similar to <code>searchItemByField</code> but it also returns the http response headers .
   * Performs a search from the values of a specific field. Results can either be the distinct values of the field (useful for searching autocomplete field values), or the IDs of actual items (deals, leads, persons, organizations or products).
   * @param term The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)
   * @param fieldType The type of the field to perform the search from (required)
   * @param fieldKey The key of the field to search from. The field key can be obtained by fetching the list of the fields using any of the fields&#39; API GET methods (dealFields, personFields, etc.). (required)
   * @param exactMatch When enabled, only full exact matches against the given term are returned. The search &lt;b&gt;is&lt;/b&gt; case sensitive. (optional, default to false)
   * @param returnItemIds Whether to return the IDs of the matching items or not. When not set or set to &#x60;0&#x60; or &#x60;false&#x60;, only distinct values of the searched field are returned. When set to &#x60;1&#x60; or &#x60;true&#x60;, the ID of each found item is returned. (optional)
   * @param start Pagination start (optional)
   * @param limit Items shown per page (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /itemSearch/field?term={term}&field_type={fieldType}&exact_match={exactMatch}&field_key={fieldKey}&return_item_ids={returnItemIds}&start={start}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchItemByFieldResponse200> searchItemByFieldWithHttpInfo(@Param("term") String term, @Param("fieldType") String fieldType, @Param("fieldKey") String fieldKey, @Param("exactMatch") Boolean exactMatch, @Param("returnItemIds") Boolean returnItemIds, @Param("start") Integer start, @Param("limit") Integer limit);


  /**
   * Perform a search using a specific field from an item type
   * Performs a search from the values of a specific field. Results can either be the distinct values of the field (useful for searching autocomplete field values), or the IDs of actual items (deals, leads, persons, organizations or products).
   * Note, this is equivalent to the other <code>searchItemByField</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchItemByFieldQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
   *   <li>fieldType - The type of the field to perform the search from (required)</li>
   *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. The search &lt;b&gt;is&lt;/b&gt; case sensitive. (optional, default to false)</li>
   *   <li>fieldKey - The key of the field to search from. The field key can be obtained by fetching the list of the fields using any of the fields&#39; API GET methods (dealFields, personFields, etc.). (required)</li>
   *   <li>returnItemIds - Whether to return the IDs of the matching items or not. When not set or set to &#x60;0&#x60; or &#x60;false&#x60;, only distinct values of the searched field are returned. When set to &#x60;1&#x60; or &#x60;true&#x60;, the ID of each found item is returned. (optional)</li>
   *   <li>start - Pagination start (optional)</li>
   *   <li>limit - Items shown per page (optional)</li>
   *   </ul>
   * @return SearchItemByFieldResponse200
   */
  @RequestLine("GET /itemSearch/field?term={term}&field_type={fieldType}&exact_match={exactMatch}&field_key={fieldKey}&return_item_ids={returnItemIds}&start={start}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  SearchItemByFieldResponse200 searchItemByField(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Perform a search using a specific field from an item type
  * Performs a search from the values of a specific field. Results can either be the distinct values of the field (useful for searching autocomplete field values), or the IDs of actual items (deals, leads, persons, organizations or products).
  * Note, this is equivalent to the other <code>searchItemByField</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - The search term to look for. Minimum 2 characters (or 1 if using &#x60;exact_match&#x60;). Please note that the search term has to be URL encoded. (required)</li>
          *   <li>fieldType - The type of the field to perform the search from (required)</li>
          *   <li>exactMatch - When enabled, only full exact matches against the given term are returned. The search &lt;b&gt;is&lt;/b&gt; case sensitive. (optional, default to false)</li>
          *   <li>fieldKey - The key of the field to search from. The field key can be obtained by fetching the list of the fields using any of the fields&#39; API GET methods (dealFields, personFields, etc.). (required)</li>
          *   <li>returnItemIds - Whether to return the IDs of the matching items or not. When not set or set to &#x60;0&#x60; or &#x60;false&#x60;, only distinct values of the searched field are returned. When set to &#x60;1&#x60; or &#x60;true&#x60;, the ID of each found item is returned. (optional)</li>
          *   <li>start - Pagination start (optional)</li>
          *   <li>limit - Items shown per page (optional)</li>
      *   </ul>
          * @return SearchItemByFieldResponse200
      */
      @RequestLine("GET /itemSearch/field?term={term}&field_type={fieldType}&exact_match={exactMatch}&field_key={fieldKey}&return_item_ids={returnItemIds}&start={start}&limit={limit}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchItemByFieldResponse200> searchItemByFieldWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchItemByField</code> method in a fluent style.
   */
  public static class SearchItemByFieldQueryParams extends HashMap<String, Object> {
    public SearchItemByFieldQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemByFieldQueryParams fieldType(final String value) {
      put("field_type", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemByFieldQueryParams exactMatch(final Boolean value) {
      put("exact_match", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemByFieldQueryParams fieldKey(final String value) {
      put("field_key", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemByFieldQueryParams returnItemIds(final Boolean value) {
      put("return_item_ids", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemByFieldQueryParams start(final Integer value) {
      put("start", EncodingUtils.encode(value));
      return this;
    }
    public SearchItemByFieldQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}
