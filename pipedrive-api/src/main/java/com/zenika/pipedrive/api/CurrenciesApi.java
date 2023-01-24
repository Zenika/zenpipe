package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.GetCurrenciesResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface CurrenciesApi extends ApiClient.Api {


  /**
   * Get all supported currencies
   * Returns all supported currencies in given account which should be used when saving monetary values with other objects. The &#x60;code&#x60; parameter of the returning objects is the currency code according to ISO 4217 for all non-custom currencies.
   * @param term Optional search term that is searched for from currency&#39;s name and/or code (optional)
   * @return GetCurrenciesResponse200
   */
  @RequestLine("GET /currencies?term={term}")
  @Headers({
    "Accept: application/json",
  })
  GetCurrenciesResponse200 getCurrencies(@Param("term") String term);

  /**
   * Get all supported currencies
   * Similar to <code>getCurrencies</code> but it also returns the http response headers .
   * Returns all supported currencies in given account which should be used when saving monetary values with other objects. The &#x60;code&#x60; parameter of the returning objects is the currency code according to ISO 4217 for all non-custom currencies.
   * @param term Optional search term that is searched for from currency&#39;s name and/or code (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /currencies?term={term}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetCurrenciesResponse200> getCurrenciesWithHttpInfo(@Param("term") String term);


  /**
   * Get all supported currencies
   * Returns all supported currencies in given account which should be used when saving monetary values with other objects. The &#x60;code&#x60; parameter of the returning objects is the currency code according to ISO 4217 for all non-custom currencies.
   * Note, this is equivalent to the other <code>getCurrencies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCurrenciesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>term - Optional search term that is searched for from currency&#39;s name and/or code (optional)</li>
   *   </ul>
   * @return GetCurrenciesResponse200
   */
  @RequestLine("GET /currencies?term={term}")
  @Headers({
  "Accept: application/json",
  })
  GetCurrenciesResponse200 getCurrencies(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get all supported currencies
  * Returns all supported currencies in given account which should be used when saving monetary values with other objects. The &#x60;code&#x60; parameter of the returning objects is the currency code according to ISO 4217 for all non-custom currencies.
  * Note, this is equivalent to the other <code>getCurrencies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>term - Optional search term that is searched for from currency&#39;s name and/or code (optional)</li>
      *   </ul>
          * @return GetCurrenciesResponse200
      */
      @RequestLine("GET /currencies?term={term}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GetCurrenciesResponse200> getCurrenciesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getCurrencies</code> method in a fluent style.
   */
  public static class GetCurrenciesQueryParams extends HashMap<String, Object> {
    public GetCurrenciesQueryParams term(final String value) {
      put("term", EncodingUtils.encode(value));
      return this;
    }
  }
}
