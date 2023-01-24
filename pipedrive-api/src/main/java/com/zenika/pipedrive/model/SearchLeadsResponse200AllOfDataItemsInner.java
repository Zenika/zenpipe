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
import com.zenika.pipedrive.model.SearchLeadsResponse200AllOfDataItemsInnerItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SearchLeadsResponse200AllOfDataItemsInner
 */
@JsonPropertyOrder({
  SearchLeadsResponse200AllOfDataItemsInner.JSON_PROPERTY_RESULT_SCORE,
  SearchLeadsResponse200AllOfDataItemsInner.JSON_PROPERTY_ITEM
})
@JsonTypeName("searchLeadsResponse200_allOf_data_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SearchLeadsResponse200AllOfDataItemsInner {
  public static final String JSON_PROPERTY_RESULT_SCORE = "result_score";
  private BigDecimal resultScore;

  public static final String JSON_PROPERTY_ITEM = "item";
  private SearchLeadsResponse200AllOfDataItemsInnerItem item;

  public SearchLeadsResponse200AllOfDataItemsInner() {
  }

  public SearchLeadsResponse200AllOfDataItemsInner resultScore(BigDecimal resultScore) {
    
    this.resultScore = resultScore;
    return this;
  }

   /**
   * Search result relevancy
   * @return resultScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Search result relevancy")
  @JsonProperty(JSON_PROPERTY_RESULT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getResultScore() {
    return resultScore;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultScore(BigDecimal resultScore) {
    this.resultScore = resultScore;
  }


  public SearchLeadsResponse200AllOfDataItemsInner item(SearchLeadsResponse200AllOfDataItemsInnerItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchLeadsResponse200AllOfDataItemsInnerItem getItem() {
    return item;
  }


  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItem(SearchLeadsResponse200AllOfDataItemsInnerItem item) {
    this.item = item;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLeadsResponse200AllOfDataItemsInner searchLeadsResponse200AllOfDataItemsInner = (SearchLeadsResponse200AllOfDataItemsInner) o;
    return Objects.equals(this.resultScore, searchLeadsResponse200AllOfDataItemsInner.resultScore) &&
        Objects.equals(this.item, searchLeadsResponse200AllOfDataItemsInner.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultScore, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLeadsResponse200AllOfDataItemsInner {\n");
    sb.append("    resultScore: ").append(toIndentedString(resultScore)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

