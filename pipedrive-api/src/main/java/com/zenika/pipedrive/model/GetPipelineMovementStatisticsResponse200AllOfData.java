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
import com.zenika.pipedrive.model.GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays;
import com.zenika.pipedrive.model.GetPipelineMovementStatisticsResponse200AllOfDataMovementsBetweenStages;
import com.zenika.pipedrive.model.GetPipelineMovementStatisticsResponse200AllOfDataNewDeals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The pipeline object
 */
@ApiModel(description = "The pipeline object")
@JsonPropertyOrder({
  GetPipelineMovementStatisticsResponse200AllOfData.JSON_PROPERTY_MOVEMENTS_BETWEEN_STAGES,
  GetPipelineMovementStatisticsResponse200AllOfData.JSON_PROPERTY_NEW_DEALS,
  GetPipelineMovementStatisticsResponse200AllOfData.JSON_PROPERTY_DEALS_LEFT_OPEN,
  GetPipelineMovementStatisticsResponse200AllOfData.JSON_PROPERTY_WON_DEALS,
  GetPipelineMovementStatisticsResponse200AllOfData.JSON_PROPERTY_LOST_DEALS,
  GetPipelineMovementStatisticsResponse200AllOfData.JSON_PROPERTY_AVERAGE_AGE_IN_DAYS
})
@JsonTypeName("getPipelineMovementStatisticsResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetPipelineMovementStatisticsResponse200AllOfData {
  public static final String JSON_PROPERTY_MOVEMENTS_BETWEEN_STAGES = "movements_between_stages";
  private GetPipelineMovementStatisticsResponse200AllOfDataMovementsBetweenStages movementsBetweenStages;

  public static final String JSON_PROPERTY_NEW_DEALS = "new_deals";
  private GetPipelineMovementStatisticsResponse200AllOfDataNewDeals newDeals;

  public static final String JSON_PROPERTY_DEALS_LEFT_OPEN = "deals_left_open";
  private GetPipelineMovementStatisticsResponse200AllOfDataNewDeals dealsLeftOpen;

  public static final String JSON_PROPERTY_WON_DEALS = "won_deals";
  private GetPipelineMovementStatisticsResponse200AllOfDataNewDeals wonDeals;

  public static final String JSON_PROPERTY_LOST_DEALS = "lost_deals";
  private GetPipelineMovementStatisticsResponse200AllOfDataNewDeals lostDeals;

  public static final String JSON_PROPERTY_AVERAGE_AGE_IN_DAYS = "average_age_in_days";
  private GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays averageAgeInDays;

  public GetPipelineMovementStatisticsResponse200AllOfData() {
  }

  public GetPipelineMovementStatisticsResponse200AllOfData movementsBetweenStages(GetPipelineMovementStatisticsResponse200AllOfDataMovementsBetweenStages movementsBetweenStages) {
    
    this.movementsBetweenStages = movementsBetweenStages;
    return this;
  }

   /**
   * Get movementsBetweenStages
   * @return movementsBetweenStages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOVEMENTS_BETWEEN_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetPipelineMovementStatisticsResponse200AllOfDataMovementsBetweenStages getMovementsBetweenStages() {
    return movementsBetweenStages;
  }


  @JsonProperty(JSON_PROPERTY_MOVEMENTS_BETWEEN_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMovementsBetweenStages(GetPipelineMovementStatisticsResponse200AllOfDataMovementsBetweenStages movementsBetweenStages) {
    this.movementsBetweenStages = movementsBetweenStages;
  }


  public GetPipelineMovementStatisticsResponse200AllOfData newDeals(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals newDeals) {
    
    this.newDeals = newDeals;
    return this;
  }

   /**
   * Get newDeals
   * @return newDeals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetPipelineMovementStatisticsResponse200AllOfDataNewDeals getNewDeals() {
    return newDeals;
  }


  @JsonProperty(JSON_PROPERTY_NEW_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewDeals(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals newDeals) {
    this.newDeals = newDeals;
  }


  public GetPipelineMovementStatisticsResponse200AllOfData dealsLeftOpen(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals dealsLeftOpen) {
    
    this.dealsLeftOpen = dealsLeftOpen;
    return this;
  }

   /**
   * Get dealsLeftOpen
   * @return dealsLeftOpen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEALS_LEFT_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetPipelineMovementStatisticsResponse200AllOfDataNewDeals getDealsLeftOpen() {
    return dealsLeftOpen;
  }


  @JsonProperty(JSON_PROPERTY_DEALS_LEFT_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealsLeftOpen(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals dealsLeftOpen) {
    this.dealsLeftOpen = dealsLeftOpen;
  }


  public GetPipelineMovementStatisticsResponse200AllOfData wonDeals(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals wonDeals) {
    
    this.wonDeals = wonDeals;
    return this;
  }

   /**
   * Get wonDeals
   * @return wonDeals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WON_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetPipelineMovementStatisticsResponse200AllOfDataNewDeals getWonDeals() {
    return wonDeals;
  }


  @JsonProperty(JSON_PROPERTY_WON_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWonDeals(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals wonDeals) {
    this.wonDeals = wonDeals;
  }


  public GetPipelineMovementStatisticsResponse200AllOfData lostDeals(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals lostDeals) {
    
    this.lostDeals = lostDeals;
    return this;
  }

   /**
   * Get lostDeals
   * @return lostDeals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOST_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetPipelineMovementStatisticsResponse200AllOfDataNewDeals getLostDeals() {
    return lostDeals;
  }


  @JsonProperty(JSON_PROPERTY_LOST_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLostDeals(GetPipelineMovementStatisticsResponse200AllOfDataNewDeals lostDeals) {
    this.lostDeals = lostDeals;
  }


  public GetPipelineMovementStatisticsResponse200AllOfData averageAgeInDays(GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays averageAgeInDays) {
    
    this.averageAgeInDays = averageAgeInDays;
    return this;
  }

   /**
   * Get averageAgeInDays
   * @return averageAgeInDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVERAGE_AGE_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays getAverageAgeInDays() {
    return averageAgeInDays;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_AGE_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageAgeInDays(GetPipelineMovementStatisticsResponse200AllOfDataAverageAgeInDays averageAgeInDays) {
    this.averageAgeInDays = averageAgeInDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPipelineMovementStatisticsResponse200AllOfData getPipelineMovementStatisticsResponse200AllOfData = (GetPipelineMovementStatisticsResponse200AllOfData) o;
    return Objects.equals(this.movementsBetweenStages, getPipelineMovementStatisticsResponse200AllOfData.movementsBetweenStages) &&
        Objects.equals(this.newDeals, getPipelineMovementStatisticsResponse200AllOfData.newDeals) &&
        Objects.equals(this.dealsLeftOpen, getPipelineMovementStatisticsResponse200AllOfData.dealsLeftOpen) &&
        Objects.equals(this.wonDeals, getPipelineMovementStatisticsResponse200AllOfData.wonDeals) &&
        Objects.equals(this.lostDeals, getPipelineMovementStatisticsResponse200AllOfData.lostDeals) &&
        Objects.equals(this.averageAgeInDays, getPipelineMovementStatisticsResponse200AllOfData.averageAgeInDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movementsBetweenStages, newDeals, dealsLeftOpen, wonDeals, lostDeals, averageAgeInDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPipelineMovementStatisticsResponse200AllOfData {\n");
    sb.append("    movementsBetweenStages: ").append(toIndentedString(movementsBetweenStages)).append("\n");
    sb.append("    newDeals: ").append(toIndentedString(newDeals)).append("\n");
    sb.append("    dealsLeftOpen: ").append(toIndentedString(dealsLeftOpen)).append("\n");
    sb.append("    wonDeals: ").append(toIndentedString(wonDeals)).append("\n");
    sb.append("    lostDeals: ").append(toIndentedString(lostDeals)).append("\n");
    sb.append("    averageAgeInDays: ").append(toIndentedString(averageAgeInDays)).append("\n");
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

