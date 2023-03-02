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
 * GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner
 */
@JsonPropertyOrder({
  GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner.JSON_PROPERTY_FROM_STAGE_ID,
  GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner.JSON_PROPERTY_TO_STAGE_ID,
  GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner.JSON_PROPERTY_CONVERSION_RATE
})
@JsonTypeName("getPipelineConversionStatisticsResponse200_allOf_data_stage_conversions_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner {
  public static final String JSON_PROPERTY_FROM_STAGE_ID = "from_stage_id";
  private Integer fromStageId;

  public static final String JSON_PROPERTY_TO_STAGE_ID = "to_stage_id";
  private Integer toStageId;

  public static final String JSON_PROPERTY_CONVERSION_RATE = "conversion_rate";
  private Integer conversionRate;

  public GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner() {
  }

  public GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner fromStageId(Integer fromStageId) {
    
    this.fromStageId = fromStageId;
    return this;
  }

   /**
   * The stage ID from where conversion starts
   * @return fromStageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stage ID from where conversion starts")
  @JsonProperty(JSON_PROPERTY_FROM_STAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFromStageId() {
    return fromStageId;
  }


  @JsonProperty(JSON_PROPERTY_FROM_STAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromStageId(Integer fromStageId) {
    this.fromStageId = fromStageId;
  }


  public GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner toStageId(Integer toStageId) {
    
    this.toStageId = toStageId;
    return this;
  }

   /**
   * The stage ID to where conversion ends
   * @return toStageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stage ID to where conversion ends")
  @JsonProperty(JSON_PROPERTY_TO_STAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getToStageId() {
    return toStageId;
  }


  @JsonProperty(JSON_PROPERTY_TO_STAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToStageId(Integer toStageId) {
    this.toStageId = toStageId;
  }


  public GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner conversionRate(Integer conversionRate) {
    
    this.conversionRate = conversionRate;
    return this;
  }

   /**
   * The conversion rate
   * @return conversionRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conversion rate")
  @JsonProperty(JSON_PROPERTY_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConversionRate() {
    return conversionRate;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionRate(Integer conversionRate) {
    this.conversionRate = conversionRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner getPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner = (GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner) o;
    return Objects.equals(this.fromStageId, getPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner.fromStageId) &&
        Objects.equals(this.toStageId, getPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner.toStageId) &&
        Objects.equals(this.conversionRate, getPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner.conversionRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromStageId, toStageId, conversionRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner {\n");
    sb.append("    fromStageId: ").append(toIndentedString(fromStageId)).append("\n");
    sb.append("    toStageId: ").append(toIndentedString(toStageId)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
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

