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
import com.zenika.pipedrive.model.SearchDealsResponse200AllOfDataItemsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SearchDealsResponse200AllOfData
 */
@JsonPropertyOrder({
  SearchDealsResponse200AllOfData.JSON_PROPERTY_ITEMS
})
@JsonTypeName("searchDealsResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SearchDealsResponse200AllOfData {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<SearchDealsResponse200AllOfDataItemsInner> items = null;

  public SearchDealsResponse200AllOfData() {
  }

  public SearchDealsResponse200AllOfData items(List<SearchDealsResponse200AllOfDataItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public SearchDealsResponse200AllOfData addItemsItem(SearchDealsResponse200AllOfDataItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The array of deals
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of deals")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SearchDealsResponse200AllOfDataItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<SearchDealsResponse200AllOfDataItemsInner> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchDealsResponse200AllOfData searchDealsResponse200AllOfData = (SearchDealsResponse200AllOfData) o;
    return Objects.equals(this.items, searchDealsResponse200AllOfData.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchDealsResponse200AllOfData {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

