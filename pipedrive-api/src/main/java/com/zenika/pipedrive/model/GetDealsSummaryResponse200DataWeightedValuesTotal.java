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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The total weighted values of the deals grouped by deal currency. The weighted value is calculated as probability times deal value.
 */
@ApiModel(description = "The total weighted values of the deals grouped by deal currency. The weighted value is calculated as probability times deal value.")
@JsonPropertyOrder({
  GetDealsSummaryResponse200DataWeightedValuesTotal.JSON_PROPERTY_VALUE,
  GetDealsSummaryResponse200DataWeightedValuesTotal.JSON_PROPERTY_COUNT,
  GetDealsSummaryResponse200DataWeightedValuesTotal.JSON_PROPERTY_VALUE_FORMATTED
})
@JsonTypeName("getDealsSummaryResponse200_data_weighted_values_total")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetDealsSummaryResponse200DataWeightedValuesTotal {
  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_VALUE_FORMATTED = "value_formatted";
  private String valueFormatted;

  public GetDealsSummaryResponse200DataWeightedValuesTotal() {
  }

  public GetDealsSummaryResponse200DataWeightedValuesTotal value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The total weighted value of the deals in the deal currency group
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total weighted value of the deals in the deal currency group")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public GetDealsSummaryResponse200DataWeightedValuesTotal count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The number of deals in the deal currency group
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of deals in the deal currency group")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public GetDealsSummaryResponse200DataWeightedValuesTotal valueFormatted(String valueFormatted) {
    
    this.valueFormatted = valueFormatted;
    return this;
  }

   /**
   * The total weighted value of the deals formatted with deal currency. E.g. €50
   * @return valueFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total weighted value of the deals formatted with deal currency. E.g. €50")
  @JsonProperty(JSON_PROPERTY_VALUE_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueFormatted() {
    return valueFormatted;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueFormatted(String valueFormatted) {
    this.valueFormatted = valueFormatted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDealsSummaryResponse200DataWeightedValuesTotal getDealsSummaryResponse200DataWeightedValuesTotal = (GetDealsSummaryResponse200DataWeightedValuesTotal) o;
    return Objects.equals(this.value, getDealsSummaryResponse200DataWeightedValuesTotal.value) &&
        Objects.equals(this.count, getDealsSummaryResponse200DataWeightedValuesTotal.count) &&
        Objects.equals(this.valueFormatted, getDealsSummaryResponse200DataWeightedValuesTotal.valueFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, count, valueFormatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDealsSummaryResponse200DataWeightedValuesTotal {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    valueFormatted: ").append(toIndentedString(valueFormatted)).append("\n");
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

