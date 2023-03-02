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
import com.zenika.pipedrive.model.GetActivitiesResponse200RelatedObjectsOrganization;
import com.zenika.pipedrive.model.GetActivitiesResponse200RelatedObjectsUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetAssociatedUpdatesResponse200AllOfRelatedObjects
 */
@JsonPropertyOrder({
  GetAssociatedUpdatesResponse200AllOfRelatedObjects.JSON_PROPERTY_ORGANIZATION,
  GetAssociatedUpdatesResponse200AllOfRelatedObjects.JSON_PROPERTY_USER
})
@JsonTypeName("getAssociatedUpdatesResponse200_allOf_related_objects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetAssociatedUpdatesResponse200AllOfRelatedObjects {
  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private GetActivitiesResponse200RelatedObjectsOrganization organization;

  public static final String JSON_PROPERTY_USER = "user";
  private GetActivitiesResponse200RelatedObjectsUser user;

  public GetAssociatedUpdatesResponse200AllOfRelatedObjects() {
  }

  public GetAssociatedUpdatesResponse200AllOfRelatedObjects organization(GetActivitiesResponse200RelatedObjectsOrganization organization) {
    
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

  public GetActivitiesResponse200RelatedObjectsOrganization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(GetActivitiesResponse200RelatedObjectsOrganization organization) {
    this.organization = organization;
  }


  public GetAssociatedUpdatesResponse200AllOfRelatedObjects user(GetActivitiesResponse200RelatedObjectsUser user) {
    
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

  public GetActivitiesResponse200RelatedObjectsUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(GetActivitiesResponse200RelatedObjectsUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssociatedUpdatesResponse200AllOfRelatedObjects getAssociatedUpdatesResponse200AllOfRelatedObjects = (GetAssociatedUpdatesResponse200AllOfRelatedObjects) o;
    return Objects.equals(this.organization, getAssociatedUpdatesResponse200AllOfRelatedObjects.organization) &&
        Objects.equals(this.user, getAssociatedUpdatesResponse200AllOfRelatedObjects.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssociatedUpdatesResponse200AllOfRelatedObjects {\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

