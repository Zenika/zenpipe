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
import com.zenika.pipedrive.model.AddOrUpdateGoalResponse200DataGoal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetGoalsResponse200Data
 */
@JsonPropertyOrder({
  GetGoalsResponse200Data.JSON_PROPERTY_GOALS
})
@JsonTypeName("getGoalsResponse200_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetGoalsResponse200Data {
  public static final String JSON_PROPERTY_GOALS = "goals";
  private List<AddOrUpdateGoalResponse200DataGoal> goals = null;

  public GetGoalsResponse200Data() {
  }

  public GetGoalsResponse200Data goals(List<AddOrUpdateGoalResponse200DataGoal> goals) {
    
    this.goals = goals;
    return this;
  }

  public GetGoalsResponse200Data addGoalsItem(AddOrUpdateGoalResponse200DataGoal goalsItem) {
    if (this.goals == null) {
      this.goals = new ArrayList<>();
    }
    this.goals.add(goalsItem);
    return this;
  }

   /**
   * Get goals
   * @return goals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddOrUpdateGoalResponse200DataGoal> getGoals() {
    return goals;
  }


  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoals(List<AddOrUpdateGoalResponse200DataGoal> goals) {
    this.goals = goals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGoalsResponse200Data getGoalsResponse200Data = (GetGoalsResponse200Data) o;
    return Objects.equals(this.goals, getGoalsResponse200Data.goals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoalsResponse200Data {\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
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
