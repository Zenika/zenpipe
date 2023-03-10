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
 * The ID of the organization associated with the item
 */
@ApiModel(description = "The ID of the organization associated with the item")
@JsonPropertyOrder({
  AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.JSON_PROPERTY_ACTIVE_FLAG,
  AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.JSON_PROPERTY_ID,
  AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.JSON_PROPERTY_NAME,
  AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.JSON_PROPERTY_PEOPLE_COUNT,
  AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.JSON_PROPERTY_OWNER_ID,
  AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.JSON_PROPERTY_ADDRESS,
  AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.JSON_PROPERTY_CC_EMAIL
})
@JsonTypeName("addActivityResponse200_related_objects_organization_ORGANIZATION_ID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID {
  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PEOPLE_COUNT = "people_count";
  private Integer peopleCount;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_CC_EMAIL = "cc_email";
  private String ccEmail;

  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID() {
  }

  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the associated organization is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the associated organization is active or not")
  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveFlag() {
    return activeFlag;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveFlag(Boolean activeFlag) {
    this.activeFlag = activeFlag;
  }


  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the organization associated with the item
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization associated with the item")
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


  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the organization associated with the item
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the organization associated with the item")
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


  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID peopleCount(Integer peopleCount) {
    
    this.peopleCount = peopleCount;
    return this;
  }

   /**
   * The number of people connected with the organization that is associated with the item
   * @return peopleCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of people connected with the organization that is associated with the item")
  @JsonProperty(JSON_PROPERTY_PEOPLE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeopleCount() {
    return peopleCount;
  }


  @JsonProperty(JSON_PROPERTY_PEOPLE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeopleCount(Integer peopleCount) {
    this.peopleCount = peopleCount;
  }


  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the owner of the organization that is associated with the item
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the owner of the organization that is associated with the item")
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


  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address of the organization
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address of the organization")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID ccEmail(String ccEmail) {
    
    this.ccEmail = ccEmail;
    return this;
  }

   /**
   * The BCC email of the organization associated with the item
   * @return ccEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The BCC email of the organization associated with the item")
  @JsonProperty(JSON_PROPERTY_CC_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCcEmail() {
    return ccEmail;
  }


  @JsonProperty(JSON_PROPERTY_CC_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCcEmail(String ccEmail) {
    this.ccEmail = ccEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID = (AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID) o;
    return Objects.equals(this.activeFlag, addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.activeFlag) &&
        Objects.equals(this.id, addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.id) &&
        Objects.equals(this.name, addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.name) &&
        Objects.equals(this.peopleCount, addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.peopleCount) &&
        Objects.equals(this.ownerId, addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.ownerId) &&
        Objects.equals(this.address, addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.address) &&
        Objects.equals(this.ccEmail, addActivityResponse200RelatedObjectsOrganizationORGANIZATIONID.ccEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeFlag, id, name, peopleCount, ownerId, address, ccEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActivityResponse200RelatedObjectsOrganizationORGANIZATIONID {\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
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

