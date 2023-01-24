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
 * The expected outcome of the goal
 */
@ApiModel(description = "The expected outcome of the goal")
@JsonPropertyOrder({
  AddOrUpdateGoalResponse200DataGoalExpectedOutcome.JSON_PROPERTY_TARGET,
  AddOrUpdateGoalResponse200DataGoalExpectedOutcome.JSON_PROPERTY_TRACKING_METRIC
})
@JsonTypeName("addOrUpdateGoalResponse200_data_goal_expected_outcome")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddOrUpdateGoalResponse200DataGoalExpectedOutcome {
  public static final String JSON_PROPERTY_TARGET = "target";
  private Integer target;

  public static final String JSON_PROPERTY_TRACKING_METRIC = "tracking_metric";
  private String trackingMetric;

  public AddOrUpdateGoalResponse200DataGoalExpectedOutcome() {
  }

  public AddOrUpdateGoalResponse200DataGoalExpectedOutcome target(Integer target) {
    
    this.target = target;
    return this;
  }

   /**
   * The numeric target of the goal
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric target of the goal")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(Integer target) {
    this.target = target;
  }


  public AddOrUpdateGoalResponse200DataGoalExpectedOutcome trackingMetric(String trackingMetric) {
    
    this.trackingMetric = trackingMetric;
    return this;
  }

   /**
   * The tracking metric of the goal
   * @return trackingMetric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tracking metric of the goal")
  @JsonProperty(JSON_PROPERTY_TRACKING_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingMetric() {
    return trackingMetric;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingMetric(String trackingMetric) {
    this.trackingMetric = trackingMetric;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOrUpdateGoalResponse200DataGoalExpectedOutcome addOrUpdateGoalResponse200DataGoalExpectedOutcome = (AddOrUpdateGoalResponse200DataGoalExpectedOutcome) o;
    return Objects.equals(this.target, addOrUpdateGoalResponse200DataGoalExpectedOutcome.target) &&
        Objects.equals(this.trackingMetric, addOrUpdateGoalResponse200DataGoalExpectedOutcome.trackingMetric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, trackingMetric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOrUpdateGoalResponse200DataGoalExpectedOutcome {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    trackingMetric: ").append(toIndentedString(trackingMetric)).append("\n");
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

