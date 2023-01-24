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
 * The assignment data of the role
 */
@ApiModel(description = "The assignment data of the role")
@JsonPropertyOrder({
  RoleAssignment.JSON_PROPERTY_PARENT_ROLE_ID,
  RoleAssignment.JSON_PROPERTY_NAME,
  RoleAssignment.JSON_PROPERTY_USER_ID,
  RoleAssignment.JSON_PROPERTY_ROLE_ID,
  RoleAssignment.JSON_PROPERTY_ACTIVE_FLAG,
  RoleAssignment.JSON_PROPERTY_TYPE
})
@JsonTypeName("roleAssignment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class RoleAssignment {
  public static final String JSON_PROPERTY_PARENT_ROLE_ID = "parent_role_id";
  private Integer parentRoleId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_ROLE_ID = "role_id";
  private Integer roleId;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public RoleAssignment() {
  }

  public RoleAssignment parentRoleId(Integer parentRoleId) {
    
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


  public RoleAssignment name(String name) {
    
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


  public RoleAssignment userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user ID")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public RoleAssignment roleId(Integer roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * The role ID
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The role ID")
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public RoleAssignment activeFlag(Boolean activeFlag) {
    
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


  public RoleAssignment type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The assignment type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The assignment type")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAssignment roleAssignment = (RoleAssignment) o;
    return Objects.equals(this.parentRoleId, roleAssignment.parentRoleId) &&
        Objects.equals(this.name, roleAssignment.name) &&
        Objects.equals(this.userId, roleAssignment.userId) &&
        Objects.equals(this.roleId, roleAssignment.roleId) &&
        Objects.equals(this.activeFlag, roleAssignment.activeFlag) &&
        Objects.equals(this.type, roleAssignment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentRoleId, name, userId, roleId, activeFlag, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAssignment {\n");
    sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
