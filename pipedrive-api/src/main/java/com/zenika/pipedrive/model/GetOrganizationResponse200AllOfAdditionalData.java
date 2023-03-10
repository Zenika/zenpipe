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
import com.zenika.pipedrive.model.GetOrganizationResponse200AllOfAdditionalDataFollowers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetOrganizationResponse200AllOfAdditionalData
 */
@JsonPropertyOrder({
  GetOrganizationResponse200AllOfAdditionalData.JSON_PROPERTY_FOLLOWERS,
  GetOrganizationResponse200AllOfAdditionalData.JSON_PROPERTY_DROPBOX_EMAIL
})
@JsonTypeName("getOrganizationResponse200_allOf_additional_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetOrganizationResponse200AllOfAdditionalData {
  public static final String JSON_PROPERTY_FOLLOWERS = "followers";
  private GetOrganizationResponse200AllOfAdditionalDataFollowers followers;

  public static final String JSON_PROPERTY_DROPBOX_EMAIL = "dropbox_email";
  private String dropboxEmail;

  public GetOrganizationResponse200AllOfAdditionalData() {
  }

  public GetOrganizationResponse200AllOfAdditionalData followers(GetOrganizationResponse200AllOfAdditionalDataFollowers followers) {
    
    this.followers = followers;
    return this;
  }

   /**
   * Get followers
   * @return followers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOLLOWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetOrganizationResponse200AllOfAdditionalDataFollowers getFollowers() {
    return followers;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowers(GetOrganizationResponse200AllOfAdditionalDataFollowers followers) {
    this.followers = followers;
  }


  public GetOrganizationResponse200AllOfAdditionalData dropboxEmail(String dropboxEmail) {
    
    this.dropboxEmail = dropboxEmail;
    return this;
  }

   /**
   * Dropbox email for the organization
   * @return dropboxEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dropbox email for the organization")
  @JsonProperty(JSON_PROPERTY_DROPBOX_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDropboxEmail() {
    return dropboxEmail;
  }


  @JsonProperty(JSON_PROPERTY_DROPBOX_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDropboxEmail(String dropboxEmail) {
    this.dropboxEmail = dropboxEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrganizationResponse200AllOfAdditionalData getOrganizationResponse200AllOfAdditionalData = (GetOrganizationResponse200AllOfAdditionalData) o;
    return Objects.equals(this.followers, getOrganizationResponse200AllOfAdditionalData.followers) &&
        Objects.equals(this.dropboxEmail, getOrganizationResponse200AllOfAdditionalData.dropboxEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followers, dropboxEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrganizationResponse200AllOfAdditionalData {\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    dropboxEmail: ").append(toIndentedString(dropboxEmail)).append("\n");
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

