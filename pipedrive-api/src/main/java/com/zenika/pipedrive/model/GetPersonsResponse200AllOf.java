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
import com.zenika.pipedrive.model.GetActivitiesResponse200AdditionalData;
import com.zenika.pipedrive.model.GetOrganizationsResponse200AllOfRelatedObjects;
import com.zenika.pipedrive.model.PersonItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetPersonsResponse200AllOf
 */
@JsonPropertyOrder({
  GetPersonsResponse200AllOf.JSON_PROPERTY_DATA,
  GetPersonsResponse200AllOf.JSON_PROPERTY_ADDITIONAL_DATA,
  GetPersonsResponse200AllOf.JSON_PROPERTY_RELATED_OBJECTS
})
@JsonTypeName("getPersonsResponse200_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetPersonsResponse200AllOf {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<PersonItem> data = null;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private GetActivitiesResponse200AdditionalData additionalData;

  public static final String JSON_PROPERTY_RELATED_OBJECTS = "related_objects";
  private GetOrganizationsResponse200AllOfRelatedObjects relatedObjects;

  public GetPersonsResponse200AllOf() {
  }

  public GetPersonsResponse200AllOf data(List<PersonItem> data) {
    
    this.data = data;
    return this;
  }

  public GetPersonsResponse200AllOf addDataItem(PersonItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The array of persons
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of persons")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PersonItem> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<PersonItem> data) {
    this.data = data;
  }


  public GetPersonsResponse200AllOf additionalData(GetActivitiesResponse200AdditionalData additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Get additionalData
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetActivitiesResponse200AdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(GetActivitiesResponse200AdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  public GetPersonsResponse200AllOf relatedObjects(GetOrganizationsResponse200AllOfRelatedObjects relatedObjects) {
    
    this.relatedObjects = relatedObjects;
    return this;
  }

   /**
   * Get relatedObjects
   * @return relatedObjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATED_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetOrganizationsResponse200AllOfRelatedObjects getRelatedObjects() {
    return relatedObjects;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedObjects(GetOrganizationsResponse200AllOfRelatedObjects relatedObjects) {
    this.relatedObjects = relatedObjects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPersonsResponse200AllOf getPersonsResponse200AllOf = (GetPersonsResponse200AllOf) o;
    return Objects.equals(this.data, getPersonsResponse200AllOf.data) &&
        Objects.equals(this.additionalData, getPersonsResponse200AllOf.additionalData) &&
        Objects.equals(this.relatedObjects, getPersonsResponse200AllOf.relatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, additionalData, relatedObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPersonsResponse200AllOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
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
