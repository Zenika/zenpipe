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
import com.zenika.pipedrive.model.ActivityDistributionDataWithAdditionalDataAllOfActivityDistribution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ActivityDistributionDataWithAdditionalDataAllOf
 */
@JsonPropertyOrder({
  ActivityDistributionDataWithAdditionalDataAllOf.JSON_PROPERTY_ACTIVITY_DISTRIBUTION
})
@JsonTypeName("activityDistributionDataWithAdditionalData_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class ActivityDistributionDataWithAdditionalDataAllOf {
  public static final String JSON_PROPERTY_ACTIVITY_DISTRIBUTION = "activity_distribution";
  private ActivityDistributionDataWithAdditionalDataAllOfActivityDistribution activityDistribution;

  public ActivityDistributionDataWithAdditionalDataAllOf() {
  }

  public ActivityDistributionDataWithAdditionalDataAllOf activityDistribution(ActivityDistributionDataWithAdditionalDataAllOfActivityDistribution activityDistribution) {
    
    this.activityDistribution = activityDistribution;
    return this;
  }

   /**
   * Get activityDistribution
   * @return activityDistribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityDistributionDataWithAdditionalDataAllOfActivityDistribution getActivityDistribution() {
    return activityDistribution;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVITY_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivityDistribution(ActivityDistributionDataWithAdditionalDataAllOfActivityDistribution activityDistribution) {
    this.activityDistribution = activityDistribution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityDistributionDataWithAdditionalDataAllOf activityDistributionDataWithAdditionalDataAllOf = (ActivityDistributionDataWithAdditionalDataAllOf) o;
    return Objects.equals(this.activityDistribution, activityDistributionDataWithAdditionalDataAllOf.activityDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDistribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityDistributionDataWithAdditionalDataAllOf {\n");
    sb.append("    activityDistribution: ").append(toIndentedString(activityDistribution)).append("\n");
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

