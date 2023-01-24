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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddTeamRequest1
 */
@JsonPropertyOrder({
  AddTeamRequest1.JSON_PROPERTY_NAME,
  AddTeamRequest1.JSON_PROPERTY_DESCRIPTION,
  AddTeamRequest1.JSON_PROPERTY_MANAGER_ID,
  AddTeamRequest1.JSON_PROPERTY_USERS
})
@JsonTypeName("addTeamRequest_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddTeamRequest1 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MANAGER_ID = "manager_id";
  private Integer managerId;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<Integer> users = null;

  public AddTeamRequest1() {
  }

  public AddTeamRequest1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The team name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The team name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AddTeamRequest1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The team description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The team description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AddTeamRequest1 managerId(Integer managerId) {
    
    this.managerId = managerId;
    return this;
  }

   /**
   * The team manager ID
   * @return managerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The team manager ID")
  @JsonProperty(JSON_PROPERTY_MANAGER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getManagerId() {
    return managerId;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setManagerId(Integer managerId) {
    this.managerId = managerId;
  }


  public AddTeamRequest1 users(List<Integer> users) {
    
    this.users = users;
    return this;
  }

  public AddTeamRequest1 addUsersItem(Integer usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The IDs of the users that belong to the team
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the users that belong to the team")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<Integer> users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddTeamRequest1 addTeamRequest1 = (AddTeamRequest1) o;
    return Objects.equals(this.name, addTeamRequest1.name) &&
        Objects.equals(this.description, addTeamRequest1.description) &&
        Objects.equals(this.managerId, addTeamRequest1.managerId) &&
        Objects.equals(this.users, addTeamRequest1.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, managerId, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddTeamRequest1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

