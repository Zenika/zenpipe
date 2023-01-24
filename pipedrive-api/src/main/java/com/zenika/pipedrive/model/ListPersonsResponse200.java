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
import com.zenika.pipedrive.model.FieldsResponse200AllOfAdditionalData;
import com.zenika.pipedrive.model.ListPersonsResponse200AllOfRelatedObjects;
import com.zenika.pipedrive.model.PersonItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ListPersonsResponse200
 */
@JsonPropertyOrder({
  ListPersonsResponse200.JSON_PROPERTY_SUCCESS,
  ListPersonsResponse200.JSON_PROPERTY_DATA,
  ListPersonsResponse200.JSON_PROPERTY_ADDITIONAL_DATA,
  ListPersonsResponse200.JSON_PROPERTY_RELATED_OBJECTS
})
@JsonTypeName("listPersonsResponse200")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class ListPersonsResponse200 {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<PersonItem> data = null;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private FieldsResponse200AllOfAdditionalData additionalData;

  public static final String JSON_PROPERTY_RELATED_OBJECTS = "related_objects";
  private ListPersonsResponse200AllOfRelatedObjects relatedObjects;

  public ListPersonsResponse200() {
  }

  public ListPersonsResponse200 success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * If the response is successful or not
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the response is successful or not")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ListPersonsResponse200 data(List<PersonItem> data) {
    
    this.data = data;
    return this;
  }

  public ListPersonsResponse200 addDataItem(PersonItem dataItem) {
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


  public ListPersonsResponse200 additionalData(FieldsResponse200AllOfAdditionalData additionalData) {
    
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

  public FieldsResponse200AllOfAdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(FieldsResponse200AllOfAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  public ListPersonsResponse200 relatedObjects(ListPersonsResponse200AllOfRelatedObjects relatedObjects) {
    
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

  public ListPersonsResponse200AllOfRelatedObjects getRelatedObjects() {
    return relatedObjects;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedObjects(ListPersonsResponse200AllOfRelatedObjects relatedObjects) {
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
    ListPersonsResponse200 listPersonsResponse200 = (ListPersonsResponse200) o;
    return Objects.equals(this.success, listPersonsResponse200.success) &&
        Objects.equals(this.data, listPersonsResponse200.data) &&
        Objects.equals(this.additionalData, listPersonsResponse200.additionalData) &&
        Objects.equals(this.relatedObjects, listPersonsResponse200.relatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data, additionalData, relatedObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPersonsResponse200 {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
