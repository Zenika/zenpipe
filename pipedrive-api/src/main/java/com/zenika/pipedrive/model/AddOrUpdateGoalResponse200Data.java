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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddOrUpdateGoalResponse200Data
 */
@JsonPropertyOrder({
  AddOrUpdateGoalResponse200Data.JSON_PROPERTY_GOAL
})
@JsonTypeName("addOrUpdateGoalResponse200_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddOrUpdateGoalResponse200Data {
  public static final String JSON_PROPERTY_GOAL = "goal";
  private AddOrUpdateGoalResponse200DataGoal goal;

  public AddOrUpdateGoalResponse200Data() {
  }

  public AddOrUpdateGoalResponse200Data goal(AddOrUpdateGoalResponse200DataGoal goal) {
    
    this.goal = goal;
    return this;
  }

   /**
   * Get goal
   * @return goal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddOrUpdateGoalResponse200DataGoal getGoal() {
    return goal;
  }


  @JsonProperty(JSON_PROPERTY_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoal(AddOrUpdateGoalResponse200DataGoal goal) {
    this.goal = goal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOrUpdateGoalResponse200Data addOrUpdateGoalResponse200Data = (AddOrUpdateGoalResponse200Data) o;
    return Objects.equals(this.goal, addOrUpdateGoalResponse200Data.goal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOrUpdateGoalResponse200Data {\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
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
