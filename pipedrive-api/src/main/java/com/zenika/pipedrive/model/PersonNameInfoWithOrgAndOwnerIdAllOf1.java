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
 * PersonNameInfoWithOrgAndOwnerIdAllOf1
 */
@JsonPropertyOrder({
  PersonNameInfoWithOrgAndOwnerIdAllOf1.JSON_PROPERTY_NAME,
  PersonNameInfoWithOrgAndOwnerIdAllOf1.JSON_PROPERTY_FIRST_NAME,
  PersonNameInfoWithOrgAndOwnerIdAllOf1.JSON_PROPERTY_LAST_NAME
})
@JsonTypeName("personNameInfoWithOrgAndOwnerId_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PersonNameInfoWithOrgAndOwnerIdAllOf1 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public PersonNameInfoWithOrgAndOwnerIdAllOf1() {
  }

  public PersonNameInfoWithOrgAndOwnerIdAllOf1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the person
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the person")
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


  public PersonNameInfoWithOrgAndOwnerIdAllOf1 firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the person
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the person")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PersonNameInfoWithOrgAndOwnerIdAllOf1 lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the person
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the person")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonNameInfoWithOrgAndOwnerIdAllOf1 personNameInfoWithOrgAndOwnerIdAllOf1 = (PersonNameInfoWithOrgAndOwnerIdAllOf1) o;
    return Objects.equals(this.name, personNameInfoWithOrgAndOwnerIdAllOf1.name) &&
        Objects.equals(this.firstName, personNameInfoWithOrgAndOwnerIdAllOf1.firstName) &&
        Objects.equals(this.lastName, personNameInfoWithOrgAndOwnerIdAllOf1.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNameInfoWithOrgAndOwnerIdAllOf1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

