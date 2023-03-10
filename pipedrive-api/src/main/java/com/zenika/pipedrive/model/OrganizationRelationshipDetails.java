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
import com.zenika.pipedrive.model.RelationshipOrganizationInfoItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrganizationRelationshipDetails
 */
@JsonPropertyOrder({
  OrganizationRelationshipDetails.JSON_PROPERTY_ID,
  OrganizationRelationshipDetails.JSON_PROPERTY_TYPE,
  OrganizationRelationshipDetails.JSON_PROPERTY_REL_OWNER_ORG_ID,
  OrganizationRelationshipDetails.JSON_PROPERTY_REL_LINKED_ORG_ID,
  OrganizationRelationshipDetails.JSON_PROPERTY_ADD_TIME,
  OrganizationRelationshipDetails.JSON_PROPERTY_UPDATE_TIME,
  OrganizationRelationshipDetails.JSON_PROPERTY_ACTIVE_FLAG,
  OrganizationRelationshipDetails.JSON_PROPERTY_CALCULATED_TYPE,
  OrganizationRelationshipDetails.JSON_PROPERTY_CALCULATED_RELATED_ORG_ID,
  OrganizationRelationshipDetails.JSON_PROPERTY_RELATED_ORGANIZATION_NAME
})
@JsonTypeName("organizationRelationshipDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class OrganizationRelationshipDetails {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_REL_OWNER_ORG_ID = "rel_owner_org_id";
  private RelationshipOrganizationInfoItem relOwnerOrgId;

  public static final String JSON_PROPERTY_REL_LINKED_ORG_ID = "rel_linked_org_id";
  private RelationshipOrganizationInfoItem relLinkedOrgId;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private String updateTime;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private String activeFlag;

  public static final String JSON_PROPERTY_CALCULATED_TYPE = "calculated_type";
  private String calculatedType;

  public static final String JSON_PROPERTY_CALCULATED_RELATED_ORG_ID = "calculated_related_org_id";
  private Integer calculatedRelatedOrgId;

  public static final String JSON_PROPERTY_RELATED_ORGANIZATION_NAME = "related_organization_name";
  private String relatedOrganizationName;

  public OrganizationRelationshipDetails() {
  }

  public OrganizationRelationshipDetails id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the organization relationship
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization relationship")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public OrganizationRelationshipDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the relationship
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the relationship")
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


  public OrganizationRelationshipDetails relOwnerOrgId(RelationshipOrganizationInfoItem relOwnerOrgId) {
    
    this.relOwnerOrgId = relOwnerOrgId;
    return this;
  }

   /**
   * Get relOwnerOrgId
   * @return relOwnerOrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REL_OWNER_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelationshipOrganizationInfoItem getRelOwnerOrgId() {
    return relOwnerOrgId;
  }


  @JsonProperty(JSON_PROPERTY_REL_OWNER_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelOwnerOrgId(RelationshipOrganizationInfoItem relOwnerOrgId) {
    this.relOwnerOrgId = relOwnerOrgId;
  }


  public OrganizationRelationshipDetails relLinkedOrgId(RelationshipOrganizationInfoItem relLinkedOrgId) {
    
    this.relLinkedOrgId = relLinkedOrgId;
    return this;
  }

   /**
   * Get relLinkedOrgId
   * @return relLinkedOrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REL_LINKED_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelationshipOrganizationInfoItem getRelLinkedOrgId() {
    return relLinkedOrgId;
  }


  @JsonProperty(JSON_PROPERTY_REL_LINKED_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelLinkedOrgId(RelationshipOrganizationInfoItem relLinkedOrgId) {
    this.relLinkedOrgId = relLinkedOrgId;
  }


  public OrganizationRelationshipDetails addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The creation date and time of the relationship
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creation date and time of the relationship")
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


  public OrganizationRelationshipDetails updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The last updated date and time of the relationship
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last updated date and time of the relationship")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public OrganizationRelationshipDetails activeFlag(String activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the relationship is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the relationship is active or not")
  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActiveFlag() {
    return activeFlag;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveFlag(String activeFlag) {
    this.activeFlag = activeFlag;
  }


  public OrganizationRelationshipDetails calculatedType(String calculatedType) {
    
    this.calculatedType = calculatedType;
    return this;
  }

   /**
   * The calculated type of the relationship with the linked organization
   * @return calculatedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The calculated type of the relationship with the linked organization")
  @JsonProperty(JSON_PROPERTY_CALCULATED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCalculatedType() {
    return calculatedType;
  }


  @JsonProperty(JSON_PROPERTY_CALCULATED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalculatedType(String calculatedType) {
    this.calculatedType = calculatedType;
  }


  public OrganizationRelationshipDetails calculatedRelatedOrgId(Integer calculatedRelatedOrgId) {
    
    this.calculatedRelatedOrgId = calculatedRelatedOrgId;
    return this;
  }

   /**
   * The ID of the linked organization
   * @return calculatedRelatedOrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the linked organization")
  @JsonProperty(JSON_PROPERTY_CALCULATED_RELATED_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCalculatedRelatedOrgId() {
    return calculatedRelatedOrgId;
  }


  @JsonProperty(JSON_PROPERTY_CALCULATED_RELATED_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalculatedRelatedOrgId(Integer calculatedRelatedOrgId) {
    this.calculatedRelatedOrgId = calculatedRelatedOrgId;
  }


  public OrganizationRelationshipDetails relatedOrganizationName(String relatedOrganizationName) {
    
    this.relatedOrganizationName = relatedOrganizationName;
    return this;
  }

   /**
   * The name of the linked organization
   * @return relatedOrganizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the linked organization")
  @JsonProperty(JSON_PROPERTY_RELATED_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRelatedOrganizationName() {
    return relatedOrganizationName;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedOrganizationName(String relatedOrganizationName) {
    this.relatedOrganizationName = relatedOrganizationName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationRelationshipDetails organizationRelationshipDetails = (OrganizationRelationshipDetails) o;
    return Objects.equals(this.id, organizationRelationshipDetails.id) &&
        Objects.equals(this.type, organizationRelationshipDetails.type) &&
        Objects.equals(this.relOwnerOrgId, organizationRelationshipDetails.relOwnerOrgId) &&
        Objects.equals(this.relLinkedOrgId, organizationRelationshipDetails.relLinkedOrgId) &&
        Objects.equals(this.addTime, organizationRelationshipDetails.addTime) &&
        Objects.equals(this.updateTime, organizationRelationshipDetails.updateTime) &&
        Objects.equals(this.activeFlag, organizationRelationshipDetails.activeFlag) &&
        Objects.equals(this.calculatedType, organizationRelationshipDetails.calculatedType) &&
        Objects.equals(this.calculatedRelatedOrgId, organizationRelationshipDetails.calculatedRelatedOrgId) &&
        Objects.equals(this.relatedOrganizationName, organizationRelationshipDetails.relatedOrganizationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, relOwnerOrgId, relLinkedOrgId, addTime, updateTime, activeFlag, calculatedType, calculatedRelatedOrgId, relatedOrganizationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationRelationshipDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    relOwnerOrgId: ").append(toIndentedString(relOwnerOrgId)).append("\n");
    sb.append("    relLinkedOrgId: ").append(toIndentedString(relLinkedOrgId)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    calculatedType: ").append(toIndentedString(calculatedType)).append("\n");
    sb.append("    calculatedRelatedOrgId: ").append(toIndentedString(calculatedRelatedOrgId)).append("\n");
    sb.append("    relatedOrganizationName: ").append(toIndentedString(relatedOrganizationName)).append("\n");
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

