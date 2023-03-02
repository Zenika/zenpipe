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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UserDataWithIdAllOf
 */
@JsonPropertyOrder({
  UserDataWithIdAllOf.JSON_PROPERTY_ID,
  UserDataWithIdAllOf.JSON_PROPERTY_NAME,
  UserDataWithIdAllOf.JSON_PROPERTY_EMAIL,
  UserDataWithIdAllOf.JSON_PROPERTY_HAS_PIC,
  UserDataWithIdAllOf.JSON_PROPERTY_PIC_HASH,
  UserDataWithIdAllOf.JSON_PROPERTY_ACTIVE_FLAG
})
@JsonTypeName("userDataWithId_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UserDataWithIdAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HAS_PIC = "has_pic";
  private Integer hasPic;

  public static final String JSON_PROPERTY_PIC_HASH = "pic_hash";
  private JsonNullable<String> picHash = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public UserDataWithIdAllOf() {
  }

  public UserDataWithIdAllOf id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the user
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user")
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


  public UserDataWithIdAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the user
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the user")
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


  public UserDataWithIdAllOf email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the user
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email of the user")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UserDataWithIdAllOf hasPic(Integer hasPic) {
    
    this.hasPic = hasPic;
    return this;
  }

   /**
   * Whether the user has picture or not. 0 &#x3D; No picture, 1 &#x3D; Has picture.
   * @return hasPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user has picture or not. 0 = No picture, 1 = Has picture.")
  @JsonProperty(JSON_PROPERTY_HAS_PIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHasPic() {
    return hasPic;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPic(Integer hasPic) {
    this.hasPic = hasPic;
  }


  public UserDataWithIdAllOf picHash(String picHash) {
    this.picHash = JsonNullable.<String>of(picHash);
    
    return this;
  }

   /**
   * The user picture hash
   * @return picHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user picture hash")
  @JsonIgnore

  public String getPicHash() {
        return picHash.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PIC_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPicHash_JsonNullable() {
    return picHash;
  }
  
  @JsonProperty(JSON_PROPERTY_PIC_HASH)
  public void setPicHash_JsonNullable(JsonNullable<String> picHash) {
    this.picHash = picHash;
  }

  public void setPicHash(String picHash) {
    this.picHash = JsonNullable.<String>of(picHash);
  }


  public UserDataWithIdAllOf activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the user is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user is active or not")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDataWithIdAllOf userDataWithIdAllOf = (UserDataWithIdAllOf) o;
    return Objects.equals(this.id, userDataWithIdAllOf.id) &&
        Objects.equals(this.name, userDataWithIdAllOf.name) &&
        Objects.equals(this.email, userDataWithIdAllOf.email) &&
        Objects.equals(this.hasPic, userDataWithIdAllOf.hasPic) &&
        equalsNullable(this.picHash, userDataWithIdAllOf.picHash) &&
        Objects.equals(this.activeFlag, userDataWithIdAllOf.activeFlag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, hasPic, hashCodeNullable(picHash), activeFlag);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDataWithIdAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hasPic: ").append(toIndentedString(hasPic)).append("\n");
    sb.append("    picHash: ").append(toIndentedString(picHash)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
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

