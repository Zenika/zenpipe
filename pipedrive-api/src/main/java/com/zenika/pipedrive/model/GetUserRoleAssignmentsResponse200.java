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
import com.zenika.pipedrive.model.GetRolesResponse200AllOfAdditionalData;
import com.zenika.pipedrive.model.RoleAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetUserRoleAssignmentsResponse200
 */
@JsonPropertyOrder({
  GetUserRoleAssignmentsResponse200.JSON_PROPERTY_SUCCESS,
  GetUserRoleAssignmentsResponse200.JSON_PROPERTY_DATA,
  GetUserRoleAssignmentsResponse200.JSON_PROPERTY_ADDITIONAL_DATA
})
@JsonTypeName("getUserRoleAssignmentsResponse200")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetUserRoleAssignmentsResponse200 {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<RoleAssignment> data = null;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private GetRolesResponse200AllOfAdditionalData additionalData;

  public GetUserRoleAssignmentsResponse200() {
  }

  public GetUserRoleAssignmentsResponse200 success(Boolean success) {
    
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


  public GetUserRoleAssignmentsResponse200 data(List<RoleAssignment> data) {
    
    this.data = data;
    return this;
  }

  public GetUserRoleAssignmentsResponse200 addDataItem(RoleAssignment dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The role assignments
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The role assignments")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RoleAssignment> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<RoleAssignment> data) {
    this.data = data;
  }


  public GetUserRoleAssignmentsResponse200 additionalData(GetRolesResponse200AllOfAdditionalData additionalData) {
    
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

  public GetRolesResponse200AllOfAdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(GetRolesResponse200AllOfAdditionalData additionalData) {
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
    GetUserRoleAssignmentsResponse200 getUserRoleAssignmentsResponse200 = (GetUserRoleAssignmentsResponse200) o;
    return Objects.equals(this.success, getUserRoleAssignmentsResponse200.success) &&
        Objects.equals(this.data, getUserRoleAssignmentsResponse200.data) &&
        Objects.equals(this.additionalData, getUserRoleAssignmentsResponse200.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserRoleAssignmentsResponse200 {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

