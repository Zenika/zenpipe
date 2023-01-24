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
 * PersonNameCountAndEmailInfoWithIdsAllOf
 */
@JsonPropertyOrder({
  PersonNameCountAndEmailInfoWithIdsAllOf.JSON_PROPERTY_OWNER_ID,
  PersonNameCountAndEmailInfoWithIdsAllOf.JSON_PROPERTY_ORG_ID,
  PersonNameCountAndEmailInfoWithIdsAllOf.JSON_PROPERTY_MERGE_WHAT_ID
})
@JsonTypeName("personNameCountAndEmailInfoWithIds_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PersonNameCountAndEmailInfoWithIdsAllOf {
  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  public static final String JSON_PROPERTY_MERGE_WHAT_ID = "merge_what_id";
  private Integer mergeWhatId;

  public PersonNameCountAndEmailInfoWithIdsAllOf() {
  }

  public PersonNameCountAndEmailInfoWithIdsAllOf ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the owner related to the person
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the owner related to the person")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOwnerId() {
    return ownerId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  public PersonNameCountAndEmailInfoWithIdsAllOf orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the organization related to the person
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization related to the person")
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }


  public PersonNameCountAndEmailInfoWithIdsAllOf mergeWhatId(Integer mergeWhatId) {
    
    this.mergeWhatId = mergeWhatId;
    return this;
  }

   /**
   * The ID of the person with what the main person was merged
   * @return mergeWhatId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person with what the main person was merged")
  @JsonProperty(JSON_PROPERTY_MERGE_WHAT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMergeWhatId() {
    return mergeWhatId;
  }


  @JsonProperty(JSON_PROPERTY_MERGE_WHAT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergeWhatId(Integer mergeWhatId) {
    this.mergeWhatId = mergeWhatId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonNameCountAndEmailInfoWithIdsAllOf personNameCountAndEmailInfoWithIdsAllOf = (PersonNameCountAndEmailInfoWithIdsAllOf) o;
    return Objects.equals(this.ownerId, personNameCountAndEmailInfoWithIdsAllOf.ownerId) &&
        Objects.equals(this.orgId, personNameCountAndEmailInfoWithIdsAllOf.orgId) &&
        Objects.equals(this.mergeWhatId, personNameCountAndEmailInfoWithIdsAllOf.mergeWhatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, orgId, mergeWhatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNameCountAndEmailInfoWithIdsAllOf {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    mergeWhatId: ").append(toIndentedString(mergeWhatId)).append("\n");
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
