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
 * The details of the sub-role
 */
@ApiModel(description = "The details of the sub-role")
@JsonPropertyOrder({
  SubRole.JSON_PROPERTY_PARENT_ROLE_ID,
  SubRole.JSON_PROPERTY_NAME,
  SubRole.JSON_PROPERTY_ID,
  SubRole.JSON_PROPERTY_ACTIVE_FLAG,
  SubRole.JSON_PROPERTY_ASSIGNMENT_COUNT,
  SubRole.JSON_PROPERTY_SUB_ROLE_COUNT
})
@JsonTypeName("subRole")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SubRole {
  public static final String JSON_PROPERTY_PARENT_ROLE_ID = "parent_role_id";
  private Integer parentRoleId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_ASSIGNMENT_COUNT = "assignment_count";
  private String assignmentCount;

  public static final String JSON_PROPERTY_SUB_ROLE_COUNT = "sub_role_count";
  private String subRoleCount;

  public SubRole() {
  }

  public SubRole parentRoleId(Integer parentRoleId) {
    
    this.parentRoleId = parentRoleId;
    return this;
  }

   /**
   * The ID of the parent role
   * @return parentRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the parent role")
  @JsonProperty(JSON_PROPERTY_PARENT_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParentRoleId() {
    return parentRoleId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentRoleId(Integer parentRoleId) {
    this.parentRoleId = parentRoleId;
  }


  public SubRole name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the role
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the role")
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


  public SubRole id(Integer id) {
    
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


  public SubRole activeFlag(Boolean activeFlag) {
    
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


  public SubRole assignmentCount(String assignmentCount) {
    
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


  public SubRole subRoleCount(String subRoleCount) {
    
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
    SubRole subRole = (SubRole) o;
    return Objects.equals(this.parentRoleId, subRole.parentRoleId) &&
        Objects.equals(this.name, subRole.name) &&
        Objects.equals(this.id, subRole.id) &&
        Objects.equals(this.activeFlag, subRole.activeFlag) &&
        Objects.equals(this.assignmentCount, subRole.assignmentCount) &&
        Objects.equals(this.subRoleCount, subRole.subRoleCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentRoleId, name, id, activeFlag, assignmentCount, subRoleCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubRole {\n");
    sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

