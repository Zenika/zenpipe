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
import com.zenika.pipedrive.model.GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The pipeline object
 */
@ApiModel(description = "The pipeline object")
@JsonPropertyOrder({
  GetPipelineConversionStatisticsResponse200AllOfData.JSON_PROPERTY_STAGE_CONVERSIONS,
  GetPipelineConversionStatisticsResponse200AllOfData.JSON_PROPERTY_WON_CONVERSION,
  GetPipelineConversionStatisticsResponse200AllOfData.JSON_PROPERTY_LOST_CONVERSION
})
@JsonTypeName("getPipelineConversionStatisticsResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetPipelineConversionStatisticsResponse200AllOfData {
  public static final String JSON_PROPERTY_STAGE_CONVERSIONS = "stage_conversions";
  private List<GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner> stageConversions = null;

  public static final String JSON_PROPERTY_WON_CONVERSION = "won_conversion";
  private Integer wonConversion;

  public static final String JSON_PROPERTY_LOST_CONVERSION = "lost_conversion";
  private Integer lostConversion;

  public GetPipelineConversionStatisticsResponse200AllOfData() {
  }

  public GetPipelineConversionStatisticsResponse200AllOfData stageConversions(List<GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner> stageConversions) {
    
    this.stageConversions = stageConversions;
    return this;
  }

  public GetPipelineConversionStatisticsResponse200AllOfData addStageConversionsItem(GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner stageConversionsItem) {
    if (this.stageConversions == null) {
      this.stageConversions = new ArrayList<>();
    }
    this.stageConversions.add(stageConversionsItem);
    return this;
  }

   /**
   * The stage conversions
   * @return stageConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stage conversions")
  @JsonProperty(JSON_PROPERTY_STAGE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner> getStageConversions() {
    return stageConversions;
  }


  @JsonProperty(JSON_PROPERTY_STAGE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStageConversions(List<GetPipelineConversionStatisticsResponse200AllOfDataStageConversionsInner> stageConversions) {
    this.stageConversions = stageConversions;
  }


  public GetPipelineConversionStatisticsResponse200AllOfData wonConversion(Integer wonConversion) {
    
    this.wonConversion = wonConversion;
    return this;
  }

   /**
   * The won conversion
   * @return wonConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The won conversion")
  @JsonProperty(JSON_PROPERTY_WON_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWonConversion() {
    return wonConversion;
  }


  @JsonProperty(JSON_PROPERTY_WON_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWonConversion(Integer wonConversion) {
    this.wonConversion = wonConversion;
  }


  public GetPipelineConversionStatisticsResponse200AllOfData lostConversion(Integer lostConversion) {
    
    this.lostConversion = lostConversion;
    return this;
  }

   /**
   * The lost conversion
   * @return lostConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lost conversion")
  @JsonProperty(JSON_PROPERTY_LOST_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLostConversion() {
    return lostConversion;
  }


  @JsonProperty(JSON_PROPERTY_LOST_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLostConversion(Integer lostConversion) {
    this.lostConversion = lostConversion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPipelineConversionStatisticsResponse200AllOfData getPipelineConversionStatisticsResponse200AllOfData = (GetPipelineConversionStatisticsResponse200AllOfData) o;
    return Objects.equals(this.stageConversions, getPipelineConversionStatisticsResponse200AllOfData.stageConversions) &&
        Objects.equals(this.wonConversion, getPipelineConversionStatisticsResponse200AllOfData.wonConversion) &&
        Objects.equals(this.lostConversion, getPipelineConversionStatisticsResponse200AllOfData.lostConversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stageConversions, wonConversion, lostConversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPipelineConversionStatisticsResponse200AllOfData {\n");
    sb.append("    stageConversions: ").append(toIndentedString(stageConversions)).append("\n");
    sb.append("    wonConversion: ").append(toIndentedString(wonConversion)).append("\n");
    sb.append("    lostConversion: ").append(toIndentedString(lostConversion)).append("\n");
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
