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
 * GetStagesResponse200DataInner
 */
@JsonPropertyOrder({
  GetStagesResponse200DataInner.JSON_PROPERTY_ID,
  GetStagesResponse200DataInner.JSON_PROPERTY_ORDER_NR,
  GetStagesResponse200DataInner.JSON_PROPERTY_NAME,
  GetStagesResponse200DataInner.JSON_PROPERTY_ACTIVE_FLAG,
  GetStagesResponse200DataInner.JSON_PROPERTY_DEAL_PROBABILITY,
  GetStagesResponse200DataInner.JSON_PROPERTY_PIPELINE_ID,
  GetStagesResponse200DataInner.JSON_PROPERTY_ROTTEN_FLAG,
  GetStagesResponse200DataInner.JSON_PROPERTY_ROTTEN_DAYS,
  GetStagesResponse200DataInner.JSON_PROPERTY_ADD_TIME,
  GetStagesResponse200DataInner.JSON_PROPERTY_UPDATE_TIME,
  GetStagesResponse200DataInner.JSON_PROPERTY_PIPELINE_NAME,
  GetStagesResponse200DataInner.JSON_PROPERTY_PIPELINE_DEAL_PROBABILITY
})
@JsonTypeName("getStagesResponse200_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetStagesResponse200DataInner {
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

  public static final String JSON_PROPERTY_PIPELINE_NAME = "pipeline_name";
  private String pipelineName;

  public static final String JSON_PROPERTY_PIPELINE_DEAL_PROBABILITY = "pipeline_deal_probability";
  private Boolean pipelineDealProbability;

  public GetStagesResponse200DataInner() {
  }

  public GetStagesResponse200DataInner id(Integer id) {
    
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


  public GetStagesResponse200DataInner orderNr(Integer orderNr) {
    
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


  public GetStagesResponse200DataInner name(String name) {
    
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


  public GetStagesResponse200DataInner activeFlag(Boolean activeFlag) {
    
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


  public GetStagesResponse200DataInner dealProbability(Integer dealProbability) {
    
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


  public GetStagesResponse200DataInner pipelineId(Integer pipelineId) {
    
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


  public GetStagesResponse200DataInner rottenFlag(RottenFlagEnum rottenFlag) {
    
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


  public GetStagesResponse200DataInner rottenDays(Integer rottenDays) {
    
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


  public GetStagesResponse200DataInner addTime(String addTime) {
    
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


  public GetStagesResponse200DataInner updateTime(String updateTime) {
    
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


  public GetStagesResponse200DataInner pipelineName(String pipelineName) {
    
    this.pipelineName = pipelineName;
    return this;
  }

   /**
   * The name of the pipeline
   * @return pipelineName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the pipeline")
  @JsonProperty(JSON_PROPERTY_PIPELINE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPipelineName() {
    return pipelineName;
  }


  @JsonProperty(JSON_PROPERTY_PIPELINE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }


  public GetStagesResponse200DataInner pipelineDealProbability(Boolean pipelineDealProbability) {
    
    this.pipelineDealProbability = pipelineDealProbability;
    return this;
  }

   /**
   * The pipeline deal probability. When &#x60;true&#x60;, overrides the stage probability.
   * @return pipelineDealProbability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pipeline deal probability. When `true`, overrides the stage probability.")
  @JsonProperty(JSON_PROPERTY_PIPELINE_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPipelineDealProbability() {
    return pipelineDealProbability;
  }


  @JsonProperty(JSON_PROPERTY_PIPELINE_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPipelineDealProbability(Boolean pipelineDealProbability) {
    this.pipelineDealProbability = pipelineDealProbability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStagesResponse200DataInner getStagesResponse200DataInner = (GetStagesResponse200DataInner) o;
    return Objects.equals(this.id, getStagesResponse200DataInner.id) &&
        Objects.equals(this.orderNr, getStagesResponse200DataInner.orderNr) &&
        Objects.equals(this.name, getStagesResponse200DataInner.name) &&
        Objects.equals(this.activeFlag, getStagesResponse200DataInner.activeFlag) &&
        Objects.equals(this.dealProbability, getStagesResponse200DataInner.dealProbability) &&
        Objects.equals(this.pipelineId, getStagesResponse200DataInner.pipelineId) &&
        Objects.equals(this.rottenFlag, getStagesResponse200DataInner.rottenFlag) &&
        Objects.equals(this.rottenDays, getStagesResponse200DataInner.rottenDays) &&
        Objects.equals(this.addTime, getStagesResponse200DataInner.addTime) &&
        Objects.equals(this.updateTime, getStagesResponse200DataInner.updateTime) &&
        Objects.equals(this.pipelineName, getStagesResponse200DataInner.pipelineName) &&
        Objects.equals(this.pipelineDealProbability, getStagesResponse200DataInner.pipelineDealProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderNr, name, activeFlag, dealProbability, pipelineId, rottenFlag, rottenDays, addTime, updateTime, pipelineName, pipelineDealProbability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStagesResponse200DataInner {\n");
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
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    pipelineDealProbability: ").append(toIndentedString(pipelineDealProbability)).append("\n");
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

