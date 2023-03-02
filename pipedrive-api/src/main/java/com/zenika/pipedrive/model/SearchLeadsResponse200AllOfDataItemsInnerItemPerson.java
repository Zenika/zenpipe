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
 * SearchLeadsResponse200AllOfDataItemsInnerItemPerson
 */
@JsonPropertyOrder({
  SearchLeadsResponse200AllOfDataItemsInnerItemPerson.JSON_PROPERTY_ID,
  SearchLeadsResponse200AllOfDataItemsInnerItemPerson.JSON_PROPERTY_NAME
})
@JsonTypeName("searchLeadsResponse200_allOf_data_items_inner_item_person")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SearchLeadsResponse200AllOfDataItemsInnerItemPerson {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SearchLeadsResponse200AllOfDataItemsInnerItemPerson() {
  }

  public SearchLeadsResponse200AllOfDataItemsInnerItemPerson id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the person the lead is associated with
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person the lead is associated with")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItemPerson name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the person the lead is associated with
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the person the lead is associated with")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLeadsResponse200AllOfDataItemsInnerItemPerson searchLeadsResponse200AllOfDataItemsInnerItemPerson = (SearchLeadsResponse200AllOfDataItemsInnerItemPerson) o;
    return Objects.equals(this.id, searchLeadsResponse200AllOfDataItemsInnerItemPerson.id) &&
        Objects.equals(this.name, searchLeadsResponse200AllOfDataItemsInnerItemPerson.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLeadsResponse200AllOfDataItemsInnerItemPerson {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

