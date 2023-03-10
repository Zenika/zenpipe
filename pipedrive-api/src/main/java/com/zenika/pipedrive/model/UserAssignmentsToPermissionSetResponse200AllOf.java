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
import com.zenika.pipedrive.model.UserAssignmentsToPermissionSetResponse200AllOfDataInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UserAssignmentsToPermissionSetResponse200AllOf
 */
@JsonPropertyOrder({
  UserAssignmentsToPermissionSetResponse200AllOf.JSON_PROPERTY_DATA
})
@JsonTypeName("userAssignmentsToPermissionSetResponse200_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UserAssignmentsToPermissionSetResponse200AllOf {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<UserAssignmentsToPermissionSetResponse200AllOfDataInner> data = null;

  public UserAssignmentsToPermissionSetResponse200AllOf() {
  }

  public UserAssignmentsToPermissionSetResponse200AllOf data(List<UserAssignmentsToPermissionSetResponse200AllOfDataInner> data) {
    
    this.data = data;
    return this;
  }

  public UserAssignmentsToPermissionSetResponse200AllOf addDataItem(UserAssignmentsToPermissionSetResponse200AllOfDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * An array of the assignments of the user
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of the assignments of the user")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserAssignmentsToPermissionSetResponse200AllOfDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<UserAssignmentsToPermissionSetResponse200AllOfDataInner> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAssignmentsToPermissionSetResponse200AllOf userAssignmentsToPermissionSetResponse200AllOf = (UserAssignmentsToPermissionSetResponse200AllOf) o;
    return Objects.equals(this.data, userAssignmentsToPermissionSetResponse200AllOf.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssignmentsToPermissionSetResponse200AllOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

