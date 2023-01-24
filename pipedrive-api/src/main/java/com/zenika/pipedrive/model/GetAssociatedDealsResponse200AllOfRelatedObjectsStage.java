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
 * GetAssociatedDealsResponse200AllOfRelatedObjectsStage
 */
@JsonPropertyOrder({
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_ID,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_ORDER_NR,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_NAME,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_ACTIVE_FLAG,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_DEAL_PROBABILITY,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_PIPELINE_ID,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_ROTTEN_FLAG,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_ROTTEN_DAYS,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_ADD_TIME,
  GetAssociatedDealsResponse200AllOfRelatedObjectsStage.JSON_PROPERTY_UPDATE_TIME
})
@JsonTypeName("getAssociatedDealsResponse200_allOf_related_objects_stage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetAssociatedDealsResponse200AllOfRelatedObjectsStage {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ORDER_NR = "order_nr";
  private Integer orderNr;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_DEAL_PROBABILITY = "deal_probability";
  private Integer dealProbability;

  public static final String JSON_PROPERTY_PIPELINE_ID = "pipeline_id";
  private Integer pipelineId;

  /**
   * Whether deals in this stage can become rotten
   */
  public enum RottenFlagEnum {
    TRUE(true),
    
    FALSE(false);

    private Boolean value;

    RottenFlagEnum(Boolean value) {
      this.value = value;
    }

    @JsonValue
    public Boolean getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RottenFlagEnum fromValue(Boolean value) {
      for (RottenFlagEnum b : RottenFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROTTEN_FLAG = "rotten_flag";
  private RottenFlagEnum rottenFlag;

  public static final String JSON_PROPERTY_ROTTEN_DAYS = "rotten_days";
  private Integer rottenDays;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private String updateTime;

  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage() {
  }

  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the stage
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the stage")
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


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage orderNr(Integer orderNr) {
    
    this.orderNr = orderNr;
    return this;
  }

   /**
   * Defines the order of the stage
   * @return orderNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the order of the stage")
  @JsonProperty(JSON_PROPERTY_ORDER_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrderNr() {
    return orderNr;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderNr(Integer orderNr) {
    this.orderNr = orderNr;
  }


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the stage
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the stage")
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


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the stage is active or deleted
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the stage is active or deleted")
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


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage dealProbability(Integer dealProbability) {
    
    this.dealProbability = dealProbability;
    return this;
  }

   /**
   * The success probability percentage of the deal. Used/shown when the deal weighted values are used.
   * @return dealProbability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The success probability percentage of the deal. Used/shown when the deal weighted values are used.")
  @JsonProperty(JSON_PROPERTY_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDealProbability() {
    return dealProbability;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealProbability(Integer dealProbability) {
    this.dealProbability = dealProbability;
  }


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage pipelineId(Integer pipelineId) {
    
    this.pipelineId = pipelineId;
    return this;
  }

   /**
   * The ID of the pipeline to add the stage to
   * @return pipelineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the pipeline to add the stage to")
  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPipelineId() {
    return pipelineId;
  }


  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPipelineId(Integer pipelineId) {
    this.pipelineId = pipelineId;
  }


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage rottenFlag(RottenFlagEnum rottenFlag) {
    
    this.rottenFlag = rottenFlag;
    return this;
  }

   /**
   * Whether deals in this stage can become rotten
   * @return rottenFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether deals in this stage can become rotten")
  @JsonProperty(JSON_PROPERTY_ROTTEN_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RottenFlagEnum getRottenFlag() {
    return rottenFlag;
  }


  @JsonProperty(JSON_PROPERTY_ROTTEN_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRottenFlag(RottenFlagEnum rottenFlag) {
    this.rottenFlag = rottenFlag;
  }


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage rottenDays(Integer rottenDays) {
    
    this.rottenDays = rottenDays;
    return this;
  }

   /**
   * The number of days the deals not updated in this stage would become rotten. Applies only if the &#x60;rotten_flag&#x60; is set.
   * @return rottenDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days the deals not updated in this stage would become rotten. Applies only if the `rotten_flag` is set.")
  @JsonProperty(JSON_PROPERTY_ROTTEN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRottenDays() {
    return rottenDays;
  }


  @JsonProperty(JSON_PROPERTY_ROTTEN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRottenDays(Integer rottenDays) {
    this.rottenDays = rottenDays;
  }


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The stage creation time. Format: YYYY-MM-DD HH:MM:SS.
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stage creation time. Format: YYYY-MM-DD HH:MM:SS.")
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


  public GetAssociatedDealsResponse200AllOfRelatedObjectsStage updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The stage update time. Format: YYYY-MM-DD HH:MM:SS.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stage update time. Format: YYYY-MM-DD HH:MM:SS.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssociatedDealsResponse200AllOfRelatedObjectsStage getAssociatedDealsResponse200AllOfRelatedObjectsStage = (GetAssociatedDealsResponse200AllOfRelatedObjectsStage) o;
    return Objects.equals(this.id, getAssociatedDealsResponse200AllOfRelatedObjectsStage.id) &&
        Objects.equals(this.orderNr, getAssociatedDealsResponse200AllOfRelatedObjectsStage.orderNr) &&
        Objects.equals(this.name, getAssociatedDealsResponse200AllOfRelatedObjectsStage.name) &&
        Objects.equals(this.activeFlag, getAssociatedDealsResponse200AllOfRelatedObjectsStage.activeFlag) &&
        Objects.equals(this.dealProbability, getAssociatedDealsResponse200AllOfRelatedObjectsStage.dealProbability) &&
        Objects.equals(this.pipelineId, getAssociatedDealsResponse200AllOfRelatedObjectsStage.pipelineId) &&
        Objects.equals(this.rottenFlag, getAssociatedDealsResponse200AllOfRelatedObjectsStage.rottenFlag) &&
        Objects.equals(this.rottenDays, getAssociatedDealsResponse200AllOfRelatedObjectsStage.rottenDays) &&
        Objects.equals(this.addTime, getAssociatedDealsResponse200AllOfRelatedObjectsStage.addTime) &&
        Objects.equals(this.updateTime, getAssociatedDealsResponse200AllOfRelatedObjectsStage.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderNr, name, activeFlag, dealProbability, pipelineId, rottenFlag, rottenDays, addTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssociatedDealsResponse200AllOfRelatedObjectsStage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
    sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
    sb.append("    rottenFlag: ").append(toIndentedString(rottenFlag)).append("\n");
    sb.append("    rottenDays: ").append(toIndentedString(rottenDays)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
