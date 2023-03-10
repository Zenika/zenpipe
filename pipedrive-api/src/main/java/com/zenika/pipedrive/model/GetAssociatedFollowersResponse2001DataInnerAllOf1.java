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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetAssociatedFollowersResponse2001DataInnerAllOf1
 */
@JsonPropertyOrder({
  GetAssociatedFollowersResponse2001DataInnerAllOf1.JSON_PROPERTY_USER_ID,
  GetAssociatedFollowersResponse2001DataInnerAllOf1.JSON_PROPERTY_ID,
  GetAssociatedFollowersResponse2001DataInnerAllOf1.JSON_PROPERTY_ADD_TIME
})
@JsonTypeName("getAssociatedFollowersResponse200_1_data_inner_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetAssociatedFollowersResponse2001DataInnerAllOf1 {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private OffsetDateTime addTime;

  public GetAssociatedFollowersResponse2001DataInnerAllOf1() {
  }

  public GetAssociatedFollowersResponse2001DataInnerAllOf1 userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user ID of the follower related to the item
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user ID of the follower related to the item")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public GetAssociatedFollowersResponse2001DataInnerAllOf1 id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the follower
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the follower")
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


  public GetAssociatedFollowersResponse2001DataInnerAllOf1 addTime(OffsetDateTime addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The date and time of adding the follower to the item
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time of adding the follower to the item")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(OffsetDateTime addTime) {
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
    GetAssociatedFollowersResponse2001DataInnerAllOf1 getAssociatedFollowersResponse2001DataInnerAllOf1 = (GetAssociatedFollowersResponse2001DataInnerAllOf1) o;
    return Objects.equals(this.userId, getAssociatedFollowersResponse2001DataInnerAllOf1.userId) &&
        Objects.equals(this.id, getAssociatedFollowersResponse2001DataInnerAllOf1.id) &&
        Objects.equals(this.addTime, getAssociatedFollowersResponse2001DataInnerAllOf1.addTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, id, addTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssociatedFollowersResponse2001DataInnerAllOf1 {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

