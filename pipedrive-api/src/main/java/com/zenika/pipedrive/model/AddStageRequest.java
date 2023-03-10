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
 * AddStageRequest
 */
@JsonPropertyOrder({
  AddStageRequest.JSON_PROPERTY_NAME,
  AddStageRequest.JSON_PROPERTY_PIPELINE_ID,
  AddStageRequest.JSON_PROPERTY_DEAL_PROBABILITY,
  AddStageRequest.JSON_PROPERTY_ROTTEN_FLAG,
  AddStageRequest.JSON_PROPERTY_ROTTEN_DAYS
})
@JsonTypeName("addStageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddStageRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PIPELINE_ID = "pipeline_id";
  private Integer pipelineId;

  public static final String JSON_PROPERTY_DEAL_PROBABILITY = "deal_probability";
  private Integer dealProbability;

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

  public AddStageRequest() {
  }

  public AddStageRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the stage
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the stage")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AddStageRequest pipelineId(Integer pipelineId) {
    
    this.pipelineId = pipelineId;
    return this;
  }

   /**
   * The ID of the pipeline to add stage to
   * @return pipelineId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the pipeline to add stage to")
  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPipelineId() {
    return pipelineId;
  }


  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPipelineId(Integer pipelineId) {
    this.pipelineId = pipelineId;
  }


  public AddStageRequest dealProbability(Integer dealProbability) {
    
    this.dealProbability = dealProbability;
    return this;
  }

   /**
   * The success probability percentage of the deal. Used/shown when deal weighted values are used.
   * @return dealProbability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The success probability percentage of the deal. Used/shown when deal weighted values are used.")
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


  public AddStageRequest rottenFlag(RottenFlagEnum rottenFlag) {
    
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


  public AddStageRequest rottenDays(Integer rottenDays) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddStageRequest addStageRequest = (AddStageRequest) o;
    return Objects.equals(this.name, addStageRequest.name) &&
        Objects.equals(this.pipelineId, addStageRequest.pipelineId) &&
        Objects.equals(this.dealProbability, addStageRequest.dealProbability) &&
        Objects.equals(this.rottenFlag, addStageRequest.rottenFlag) &&
        Objects.equals(this.rottenDays, addStageRequest.rottenDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pipelineId, dealProbability, rottenFlag, rottenDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddStageRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
    sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
    sb.append("    rottenFlag: ").append(toIndentedString(rottenFlag)).append("\n");
    sb.append("    rottenDays: ").append(toIndentedString(rottenDays)).append("\n");
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

