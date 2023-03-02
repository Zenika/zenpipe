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
 * SubRoleAllOf
 */
@JsonPropertyOrder({
  SubRoleAllOf.JSON_PROPERTY_ID,
  SubRoleAllOf.JSON_PROPERTY_ACTIVE_FLAG,
  SubRoleAllOf.JSON_PROPERTY_ASSIGNMENT_COUNT,
  SubRoleAllOf.JSON_PROPERTY_SUB_ROLE_COUNT
})
@JsonTypeName("subRole_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SubRoleAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_ASSIGNMENT_COUNT = "assignment_count";
  private String assignmentCount;

  public static final String JSON_PROPERTY_SUB_ROLE_COUNT = "sub_role_count";
  private String subRoleCount;

  public SubRoleAllOf() {
  }

  public SubRoleAllOf id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the role
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the role")
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


  public SubRoleAllOf activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the role is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the role is active or not")
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


  public SubRoleAllOf assignmentCount(String assignmentCount) {
    
    this.assignmentCount = assignmentCount;
    return this;
  }

   /**
   * The number of users assigned to this role
   * @return assignmentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of users assigned to this role")
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssignmentCount() {
    return assignmentCount;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignmentCount(String assignmentCount) {
    this.assignmentCount = assignmentCount;
  }


  public SubRoleAllOf subRoleCount(String subRoleCount) {
    
    this.subRoleCount = subRoleCount;
    return this;
  }

   /**
   * The number of sub-roles
   * @return subRoleCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of sub-roles")
  @JsonProperty(JSON_PROPERTY_SUB_ROLE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubRoleCount() {
    return subRoleCount;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ROLE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubRoleCount(String subRoleCount) {
    this.subRoleCount = subRoleCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubRoleAllOf subRoleAllOf = (SubRoleAllOf) o;
    return Objects.equals(this.id, subRoleAllOf.id) &&
        Objects.equals(this.activeFlag, subRoleAllOf.activeFlag) &&
        Objects.equals(this.assignmentCount, subRoleAllOf.assignmentCount) &&
        Objects.equals(this.subRoleCount, subRoleAllOf.subRoleCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activeFlag, assignmentCount, subRoleCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubRoleAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
    sb.append("    subRoleCount: ").append(toIndentedString(subRoleCount)).append("\n");
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

