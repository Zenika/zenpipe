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
import com.zenika.pipedrive.model.SearchItemResponse200AllOfDataItemsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SearchItemResponse200AllOfData
 */
@JsonPropertyOrder({
  SearchItemResponse200AllOfData.JSON_PROPERTY_ITEMS,
  SearchItemResponse200AllOfData.JSON_PROPERTY_RELATED_ITEMS
})
@JsonTypeName("searchItemResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SearchItemResponse200AllOfData {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<SearchItemResponse200AllOfDataItemsInner> items = null;

  public static final String JSON_PROPERTY_RELATED_ITEMS = "related_items";
  private List<SearchItemResponse200AllOfDataItemsInner> relatedItems = null;

  public SearchItemResponse200AllOfData() {
  }

  public SearchItemResponse200AllOfData items(List<SearchItemResponse200AllOfDataItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public SearchItemResponse200AllOfData addItemsItem(SearchItemResponse200AllOfDataItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The array of found items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of found items")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SearchItemResponse200AllOfDataItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<SearchItemResponse200AllOfDataItemsInner> items) {
    this.items = items;
  }


  public SearchItemResponse200AllOfData relatedItems(List<SearchItemResponse200AllOfDataItemsInner> relatedItems) {
    
    this.relatedItems = relatedItems;
    return this;
  }

  public SearchItemResponse200AllOfData addRelatedItemsItem(SearchItemResponse200AllOfDataItemsInner relatedItemsItem) {
    if (this.relatedItems == null) {
      this.relatedItems = new ArrayList<>();
    }
    this.relatedItems.add(relatedItemsItem);
    return this;
  }

   /**
   * The array of related items if &#x60;search_for_related_items&#x60; was enabled
   * @return relatedItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of related items if `search_for_related_items` was enabled")
  @JsonProperty(JSON_PROPERTY_RELATED_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SearchItemResponse200AllOfDataItemsInner> getRelatedItems() {
    return relatedItems;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedItems(List<SearchItemResponse200AllOfDataItemsInner> relatedItems) {
    this.relatedItems = relatedItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchItemResponse200AllOfData searchItemResponse200AllOfData = (SearchItemResponse200AllOfData) o;
    return Objects.equals(this.items, searchItemResponse200AllOfData.items) &&
        Objects.equals(this.relatedItems, searchItemResponse200AllOfData.relatedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, relatedItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchItemResponse200AllOfData {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    relatedItems: ").append(toIndentedString(relatedItems)).append("\n");
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
