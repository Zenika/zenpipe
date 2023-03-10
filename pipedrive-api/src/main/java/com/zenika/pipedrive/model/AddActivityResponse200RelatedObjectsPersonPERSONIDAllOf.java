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
 * AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf
 */
@JsonPropertyOrder({
  AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf.JSON_PROPERTY_ACTIVE_FLAG
})
@JsonTypeName("addActivityResponse200_related_objects_person_PERSON_ID_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf {
  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf() {
  }

  public AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the associated person is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the associated person is active or not")
  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveFlag() {
    return activeFlag;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveFlag(Boolean activeFlag) {
    this.activeFlag = activeFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf addActivityResponse200RelatedObjectsPersonPERSONIDAllOf = (AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf) o;
    return Objects.equals(this.activeFlag, addActivityResponse200RelatedObjectsPersonPERSONIDAllOf.activeFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActivityResponse200RelatedObjectsPersonPERSONIDAllOf {\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
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

