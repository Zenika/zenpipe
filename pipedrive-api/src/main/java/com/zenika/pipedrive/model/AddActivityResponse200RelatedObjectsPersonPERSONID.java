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
import com.zenika.pipedrive.model.GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfEmailInner;
import com.zenika.pipedrive.model.GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfPhoneInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ID of the person associated with the item
 */
@ApiModel(description = "The ID of the person associated with the item")
@JsonPropertyOrder({
  AddActivityResponse200RelatedObjectsPersonPERSONID.JSON_PROPERTY_ACTIVE_FLAG,
  AddActivityResponse200RelatedObjectsPersonPERSONID.JSON_PROPERTY_ID,
  AddActivityResponse200RelatedObjectsPersonPERSONID.JSON_PROPERTY_NAME,
  AddActivityResponse200RelatedObjectsPersonPERSONID.JSON_PROPERTY_EMAIL,
  AddActivityResponse200RelatedObjectsPersonPERSONID.JSON_PROPERTY_PHONE,
  AddActivityResponse200RelatedObjectsPersonPERSONID.JSON_PROPERTY_OWNER_ID
})
@JsonTypeName("addActivityResponse200_related_objects_person_PERSON_ID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddActivityResponse200RelatedObjectsPersonPERSONID {
  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfEmailInner> email = null;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfPhoneInner> phone = null;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public AddActivityResponse200RelatedObjectsPersonPERSONID() {
  }

  public AddActivityResponse200RelatedObjectsPersonPERSONID activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the associated person is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the associated person is active or not")
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


  public AddActivityResponse200RelatedObjectsPersonPERSONID id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the person associated with the item
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person associated with the item")
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


  public AddActivityResponse200RelatedObjectsPersonPERSONID name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the person associated with the item
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the person associated with the item")
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


  public AddActivityResponse200RelatedObjectsPersonPERSONID email(List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfEmailInner> email) {
    
    this.email = email;
    return this;
  }

  public AddActivityResponse200RelatedObjectsPersonPERSONID addEmailItem(GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfEmailInner emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * The emails of the person associated with the item
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The emails of the person associated with the item")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfEmailInner> getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfEmailInner> email) {
    this.email = email;
  }


  public AddActivityResponse200RelatedObjectsPersonPERSONID phone(List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfPhoneInner> phone) {
    
    this.phone = phone;
    return this;
  }

  public AddActivityResponse200RelatedObjectsPersonPERSONID addPhoneItem(GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfPhoneInner phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

   /**
   * The phone numbers of the person associated with the item
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone numbers of the person associated with the item")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfPhoneInner> getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(List<GetActivitiesResponse200RelatedObjectsPersonPERSONIDAllOfPhoneInner> phone) {
    this.phone = phone;
  }


  public AddActivityResponse200RelatedObjectsPersonPERSONID ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the owner of the person that is associated with the item
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the owner of the person that is associated with the item")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddActivityResponse200RelatedObjectsPersonPERSONID addActivityResponse200RelatedObjectsPersonPERSONID = (AddActivityResponse200RelatedObjectsPersonPERSONID) o;
    return Objects.equals(this.activeFlag, addActivityResponse200RelatedObjectsPersonPERSONID.activeFlag) &&
        Objects.equals(this.id, addActivityResponse200RelatedObjectsPersonPERSONID.id) &&
        Objects.equals(this.name, addActivityResponse200RelatedObjectsPersonPERSONID.name) &&
        Objects.equals(this.email, addActivityResponse200RelatedObjectsPersonPERSONID.email) &&
        Objects.equals(this.phone, addActivityResponse200RelatedObjectsPersonPERSONID.phone) &&
        Objects.equals(this.ownerId, addActivityResponse200RelatedObjectsPersonPERSONID.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeFlag, id, name, email, phone, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActivityResponse200RelatedObjectsPersonPERSONID {\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

