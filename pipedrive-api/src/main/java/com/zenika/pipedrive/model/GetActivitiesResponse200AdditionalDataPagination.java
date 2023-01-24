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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Pagination details of the list
 */
@ApiModel(description = "Pagination details of the list")
@JsonPropertyOrder({
  GetActivitiesResponse200AdditionalDataPagination.JSON_PROPERTY_START,
  GetActivitiesResponse200AdditionalDataPagination.JSON_PROPERTY_LIMIT,
  GetActivitiesResponse200AdditionalDataPagination.JSON_PROPERTY_MORE_ITEMS_IN_COLLECTION,
  GetActivitiesResponse200AdditionalDataPagination.JSON_PROPERTY_NEXT_START
})
@JsonTypeName("getActivitiesResponse200_additional_data_pagination")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetActivitiesResponse200AdditionalDataPagination {
  public static final String JSON_PROPERTY_START = "start";
  private Integer start;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_MORE_ITEMS_IN_COLLECTION = "more_items_in_collection";
  private Boolean moreItemsInCollection;

  public static final String JSON_PROPERTY_NEXT_START = "next_start";
  private Integer nextStart;

  public GetActivitiesResponse200AdditionalDataPagination() {
  }

  public GetActivitiesResponse200AdditionalDataPagination start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Pagination start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pagination start")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(Integer start) {
    this.start = start;
  }


  public GetActivitiesResponse200AdditionalDataPagination limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Items shown per page
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items shown per page")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetActivitiesResponse200AdditionalDataPagination moreItemsInCollection(Boolean moreItemsInCollection) {
    
    this.moreItemsInCollection = moreItemsInCollection;
    return this;
  }

   /**
   * Whether there are more list items in the collection than displayed
   * @return moreItemsInCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether there are more list items in the collection than displayed")
  @JsonProperty(JSON_PROPERTY_MORE_ITEMS_IN_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMoreItemsInCollection() {
    return moreItemsInCollection;
  }


  @JsonProperty(JSON_PROPERTY_MORE_ITEMS_IN_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMoreItemsInCollection(Boolean moreItemsInCollection) {
    this.moreItemsInCollection = moreItemsInCollection;
  }


  public GetActivitiesResponse200AdditionalDataPagination nextStart(Integer nextStart) {
    
    this.nextStart = nextStart;
    return this;
  }

   /**
   * Next pagination start
   * @return nextStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next pagination start")
  @JsonProperty(JSON_PROPERTY_NEXT_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNextStart() {
    return nextStart;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextStart(Integer nextStart) {
    this.nextStart = nextStart;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetActivitiesResponse200AdditionalDataPagination getActivitiesResponse200AdditionalDataPagination = (GetActivitiesResponse200AdditionalDataPagination) o;
    return Objects.equals(this.start, getActivitiesResponse200AdditionalDataPagination.start) &&
        Objects.equals(this.limit, getActivitiesResponse200AdditionalDataPagination.limit) &&
        Objects.equals(this.moreItemsInCollection, getActivitiesResponse200AdditionalDataPagination.moreItemsInCollection) &&
        Objects.equals(this.nextStart, getActivitiesResponse200AdditionalDataPagination.nextStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, moreItemsInCollection, nextStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetActivitiesResponse200AdditionalDataPagination {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    moreItemsInCollection: ").append(toIndentedString(moreItemsInCollection)).append("\n");
    sb.append("    nextStart: ").append(toIndentedString(nextStart)).append("\n");
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
