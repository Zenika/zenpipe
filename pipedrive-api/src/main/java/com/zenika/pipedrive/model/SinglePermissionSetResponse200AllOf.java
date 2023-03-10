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
 * SinglePermissionSetResponse200AllOf
 */
@JsonPropertyOrder({
  SinglePermissionSetResponse200AllOf.JSON_PROPERTY_CONTENTS
})
@JsonTypeName("singlePermissionSetResponse200_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SinglePermissionSetResponse200AllOf {
  public static final String JSON_PROPERTY_CONTENTS = "contents";
  private List<String> contents = null;

  public SinglePermissionSetResponse200AllOf() {
  }

  public SinglePermissionSetResponse200AllOf contents(List<String> contents) {
    
    this.contents = contents;
    return this;
  }

  public SinglePermissionSetResponse200AllOf addContentsItem(String contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * A permission assigned to this permission set
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A permission assigned to this permission set")
  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContents() {
    return contents;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContents(List<String> contents) {
    this.contents = contents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SinglePermissionSetResponse200AllOf singlePermissionSetResponse200AllOf = (SinglePermissionSetResponse200AllOf) o;
    return Objects.equals(this.contents, singlePermissionSetResponse200AllOf.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinglePermissionSetResponse200AllOf {\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

