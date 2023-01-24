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
 * MergeOrganizationsRequest
 */
@JsonPropertyOrder({
  MergeOrganizationsRequest.JSON_PROPERTY_MERGE_WITH_ID
})
@JsonTypeName("mergeOrganizationsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class MergeOrganizationsRequest {
  public static final String JSON_PROPERTY_MERGE_WITH_ID = "merge_with_id";
  private Integer mergeWithId;

  public MergeOrganizationsRequest() {
  }

  public MergeOrganizationsRequest mergeWithId(Integer mergeWithId) {
    
    this.mergeWithId = mergeWithId;
    return this;
  }

   /**
   * The ID of the organization that the organization will be merged with
   * @return mergeWithId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the organization that the organization will be merged with")
  @JsonProperty(JSON_PROPERTY_MERGE_WITH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMergeWithId() {
    return mergeWithId;
  }


  @JsonProperty(JSON_PROPERTY_MERGE_WITH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMergeWithId(Integer mergeWithId) {
    this.mergeWithId = mergeWithId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeOrganizationsRequest mergeOrganizationsRequest = (MergeOrganizationsRequest) o;
    return Objects.equals(this.mergeWithId, mergeOrganizationsRequest.mergeWithId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergeWithId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeOrganizationsRequest {\n");
    sb.append("    mergeWithId: ").append(toIndentedString(mergeWithId)).append("\n");
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

