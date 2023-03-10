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
import com.zenika.pipedrive.model.GetOrganizationsResponse200AllOfRelatedObjects;
import com.zenika.pipedrive.model.GetPersonResponse200AllOfAdditionalData;
import com.zenika.pipedrive.model.PersonItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetPersonResponse200AllOf
 */
@JsonPropertyOrder({
  GetPersonResponse200AllOf.JSON_PROPERTY_DATA,
  GetPersonResponse200AllOf.JSON_PROPERTY_ADDITIONAL_DATA,
  GetPersonResponse200AllOf.JSON_PROPERTY_RELATED_OBJECTS
})
@JsonTypeName("getPersonResponse200_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetPersonResponse200AllOf {
  public static final String JSON_PROPERTY_DATA = "data";
  private PersonItem data;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private GetPersonResponse200AllOfAdditionalData additionalData;

  public static final String JSON_PROPERTY_RELATED_OBJECTS = "related_objects";
  private GetOrganizationsResponse200AllOfRelatedObjects relatedObjects;

  public GetPersonResponse200AllOf() {
  }

  public GetPersonResponse200AllOf data(PersonItem data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PersonItem getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(PersonItem data) {
    this.data = data;
  }


  public GetPersonResponse200AllOf additionalData(GetPersonResponse200AllOfAdditionalData additionalData) {
    
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

  public GetPersonResponse200AllOfAdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(GetPersonResponse200AllOfAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  public GetPersonResponse200AllOf relatedObjects(GetOrganizationsResponse200AllOfRelatedObjects relatedObjects) {
    
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
    GetPersonResponse200AllOf getPersonResponse200AllOf = (GetPersonResponse200AllOf) o;
    return Objects.equals(this.data, getPersonResponse200AllOf.data) &&
        Objects.equals(this.additionalData, getPersonResponse200AllOf.additionalData) &&
        Objects.equals(this.relatedObjects, getPersonResponse200AllOf.relatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, additionalData, relatedObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPersonResponse200AllOf {\n");
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

