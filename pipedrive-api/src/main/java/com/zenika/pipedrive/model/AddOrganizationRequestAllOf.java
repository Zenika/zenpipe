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
 * AddOrganizationRequestAllOf
 */
@JsonPropertyOrder({
  AddOrganizationRequestAllOf.JSON_PROPERTY_NAME,
  AddOrganizationRequestAllOf.JSON_PROPERTY_ADD_TIME
})
@JsonTypeName("addOrganizationRequest_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddOrganizationRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  public AddOrganizationRequestAllOf() {
  }

  public AddOrganizationRequestAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the organization
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the organization")
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


  public AddOrganizationRequestAllOf addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The optional creation date &amp; time of the organization in UTC. Requires admin user API token. Format: YYYY-MM-DD HH:MM:SS
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The optional creation date & time of the organization in UTC. Requires admin user API token. Format: YYYY-MM-DD HH:MM:SS")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOrganizationRequestAllOf addOrganizationRequestAllOf = (AddOrganizationRequestAllOf) o;
    return Objects.equals(this.name, addOrganizationRequestAllOf.name) &&
        Objects.equals(this.addTime, addOrganizationRequestAllOf.addTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, addTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOrganizationRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
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

