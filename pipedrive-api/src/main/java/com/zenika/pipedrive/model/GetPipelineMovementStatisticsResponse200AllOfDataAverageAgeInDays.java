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
import com.zenika.pipedrive.model.GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDaysByStagesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The moved deals average age in days
 */
@ApiModel(description = "The moved deals average age in days")
@JsonPropertyOrder({
  GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays.JSON_PROPERTY_ACROSS_ALL_STAGES,
  GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays.JSON_PROPERTY_BY_STAGES
})
@JsonTypeName("getPipelineMovementStatisticsResponse200_allOf_data_average_age_in_days")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays {
  public static final String JSON_PROPERTY_ACROSS_ALL_STAGES = "across_all_stages";
  private Integer acrossAllStages;

  public static final String JSON_PROPERTY_BY_STAGES = "by_stages";
  private List<GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDaysByStagesInner> byStages = null;

  public GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays() {
  }

  public GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays acrossAllStages(Integer acrossAllStages) {
    
    this.acrossAllStages = acrossAllStages;
    return this;
  }

   /**
   * The moved deals average age across all stages
   * @return acrossAllStages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The moved deals average age across all stages")
  @JsonProperty(JSON_PROPERTY_ACROSS_ALL_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAcrossAllStages() {
    return acrossAllStages;
  }


  @JsonProperty(JSON_PROPERTY_ACROSS_ALL_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcrossAllStages(Integer acrossAllStages) {
    this.acrossAllStages = acrossAllStages;
  }


  public GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays byStages(List<GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDaysByStagesInner> byStages) {
    
    this.byStages = byStages;
    return this;
  }

  public GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays addByStagesItem(GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDaysByStagesInner byStagesItem) {
    if (this.byStages == null) {
      this.byStages = new ArrayList<>();
    }
    this.byStages.add(byStagesItem);
    return this;
  }

   /**
   * The moved deals average age by stages
   * @return byStages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The moved deals average age by stages")
  @JsonProperty(JSON_PROPERTY_BY_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDaysByStagesInner> getByStages() {
    return byStages;
  }


  @JsonProperty(JSON_PROPERTY_BY_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setByStages(List<GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDaysByStagesInner> byStages) {
    this.byStages = byStages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays getPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays = (GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays) o;
    return Objects.equals(this.acrossAllStages, getPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays.acrossAllStages) &&
        Objects.equals(this.byStages, getPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays.byStages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acrossAllStages, byStages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays {\n");
    sb.append("    acrossAllStages: ").append(toIndentedString(acrossAllStages)).append("\n");
    sb.append("    byStages: ").append(toIndentedString(byStages)).append("\n");
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

