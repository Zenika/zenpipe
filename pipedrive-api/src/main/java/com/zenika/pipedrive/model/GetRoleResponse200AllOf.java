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
import com.zenika.pipedrive.model.GetRoleResponse200AllOfAdditionalData;
import com.zenika.pipedrive.model.SubRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetRoleResponse200AllOf
 */
@JsonPropertyOrder({
  GetRoleResponse200AllOf.JSON_PROPERTY_DATA,
  GetRoleResponse200AllOf.JSON_PROPERTY_ADDITIONAL_DATA
})
@JsonTypeName("getRoleResponse200_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetRoleResponse200AllOf {
  public static final String JSON_PROPERTY_DATA = "data";
  private SubRole data;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private GetRoleResponse200AllOfAdditionalData additionalData;

  public GetRoleResponse200AllOf() {
  }

  public GetRoleResponse200AllOf data(SubRole data) {
    
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

  public SubRole getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(SubRole data) {
    this.data = data;
  }


  public GetRoleResponse200AllOf additionalData(GetRoleResponse200AllOfAdditionalData additionalData) {
    
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

  public GetRoleResponse200AllOfAdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(GetRoleResponse200AllOfAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoleResponse200AllOf getRoleResponse200AllOf = (GetRoleResponse200AllOf) o;
    return Objects.equals(this.data, getRoleResponse200AllOf.data) &&
        Objects.equals(this.additionalData, getRoleResponse200AllOf.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleResponse200AllOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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
