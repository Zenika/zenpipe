/*
 * Pipedrive API v1
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zenika.pipedrive.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetproductResponse200DataAllOf
 */
@JsonPropertyOrder({
  GetproductResponse200DataAllOf.JSON_PROPERTY_PRICES
})
@JsonTypeName("getproductResponse200_data_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetproductResponse200DataAllOf {
  public static final String JSON_PROPERTY_PRICES = "prices";
  private List<Object> prices = null;

  public GetproductResponse200DataAllOf() {
  }

  public GetproductResponse200DataAllOf prices(List<Object> prices) {
    
    this.prices = prices;
    return this;
  }

  public GetproductResponse200DataAllOf addPricesItem(Object pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Array of objects, each containing: currency (string), price (number), cost (number, optional), overhead_cost (number, optional)
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of objects, each containing: currency (string), price (number), cost (number, optional), overhead_cost (number, optional)")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(List<Object> prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetproductResponse200DataAllOf getproductResponse200DataAllOf = (GetproductResponse200DataAllOf) o;
    return Objects.equals(this.prices, getproductResponse200DataAllOf.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetproductResponse200DataAllOf {\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

