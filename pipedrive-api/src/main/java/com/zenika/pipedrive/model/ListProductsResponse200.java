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
import com.zenika.pipedrive.model.ListProductsResponse200AllOfAdditionalData;
import com.zenika.pipedrive.model.ListProductsResponse200AllOfData;
import com.zenika.pipedrive.model.ListProductsResponse200AllOfRelatedObjects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ListProductsResponse200
 */
@JsonPropertyOrder({
  ListProductsResponse200.JSON_PROPERTY_SUCCESS,
  ListProductsResponse200.JSON_PROPERTY_DATA,
  ListProductsResponse200.JSON_PROPERTY_ADDITIONAL_DATA,
  ListProductsResponse200.JSON_PROPERTY_RELATED_OBJECTS
})
@JsonTypeName("listProductsResponse200")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class ListProductsResponse200 {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_DATA = "data";
  private ListProductsResponse200AllOfData data;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private ListProductsResponse200AllOfAdditionalData additionalData;

  public static final String JSON_PROPERTY_RELATED_OBJECTS = "related_objects";
  private ListProductsResponse200AllOfRelatedObjects relatedObjects;

  public ListProductsResponse200() {
  }

  public ListProductsResponse200 success(Boolean success) {
    
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


  public ListProductsResponse200 data(ListProductsResponse200AllOfData data) {
    
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

  public ListProductsResponse200AllOfData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(ListProductsResponse200AllOfData data) {
    this.data = data;
  }


  public ListProductsResponse200 additionalData(ListProductsResponse200AllOfAdditionalData additionalData) {
    
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

  public ListProductsResponse200AllOfAdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(ListProductsResponse200AllOfAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  public ListProductsResponse200 relatedObjects(ListProductsResponse200AllOfRelatedObjects relatedObjects) {
    
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

  public ListProductsResponse200AllOfRelatedObjects getRelatedObjects() {
    return relatedObjects;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedObjects(ListProductsResponse200AllOfRelatedObjects relatedObjects) {
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
    ListProductsResponse200 listProductsResponse200 = (ListProductsResponse200) o;
    return Objects.equals(this.success, listProductsResponse200.success) &&
        Objects.equals(this.data, listProductsResponse200.data) &&
        Objects.equals(this.additionalData, listProductsResponse200.additionalData) &&
        Objects.equals(this.relatedObjects, listProductsResponse200.relatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data, additionalData, relatedObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProductsResponse200 {\n");
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

