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
import com.zenika.pipedrive.model.DealOrganizationDataWithIdAllOf;
import com.zenika.pipedrive.model.DealPersonDataWithIdAllOf;
import com.zenika.pipedrive.model.DealUserDataWithIdAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetDealsResponse200RelatedObjects
 */
@JsonPropertyOrder({
  GetDealsResponse200RelatedObjects.JSON_PROPERTY_USER,
  GetDealsResponse200RelatedObjects.JSON_PROPERTY_ORGANIZATION,
  GetDealsResponse200RelatedObjects.JSON_PROPERTY_PERSON
})
@JsonTypeName("getDealsResponse200_related_objects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetDealsResponse200RelatedObjects {
  public static final String JSON_PROPERTY_USER = "user";
  private DealUserDataWithIdAllOf user;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private DealOrganizationDataWithIdAllOf organization;

  public static final String JSON_PROPERTY_PERSON = "person";
  private DealPersonDataWithIdAllOf person;

  public GetDealsResponse200RelatedObjects() {
  }

  public GetDealsResponse200RelatedObjects user(DealUserDataWithIdAllOf user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DealUserDataWithIdAllOf getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(DealUserDataWithIdAllOf user) {
    this.user = user;
  }


  public GetDealsResponse200RelatedObjects organization(DealOrganizationDataWithIdAllOf organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DealOrganizationDataWithIdAllOf getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(DealOrganizationDataWithIdAllOf organization) {
    this.organization = organization;
  }


  public GetDealsResponse200RelatedObjects person(DealPersonDataWithIdAllOf person) {
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DealPersonDataWithIdAllOf getPerson() {
    return person;
  }


  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerson(DealPersonDataWithIdAllOf person) {
    this.person = person;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDealsResponse200RelatedObjects getDealsResponse200RelatedObjects = (GetDealsResponse200RelatedObjects) o;
    return Objects.equals(this.user, getDealsResponse200RelatedObjects.user) &&
        Objects.equals(this.organization, getDealsResponse200RelatedObjects.organization) &&
        Objects.equals(this.person, getDealsResponse200RelatedObjects.person);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, organization, person);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDealsResponse200RelatedObjects {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

