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
import com.zenika.pipedrive.model.ActivityDistributionDataWithAdditionalData;
import com.zenika.pipedrive.model.ActivityResponseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetAssociatedActivitiesResponse200AllOf
 */
@JsonPropertyOrder({
  GetAssociatedActivitiesResponse200AllOf.JSON_PROPERTY_DATA,
  GetAssociatedActivitiesResponse200AllOf.JSON_PROPERTY_ADDITIONAL_DATA
})
@JsonTypeName("getAssociatedActivitiesResponse200_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetAssociatedActivitiesResponse200AllOf {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ActivityResponseObject> data = null;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private ActivityDistributionDataWithAdditionalData additionalData;

  public GetAssociatedActivitiesResponse200AllOf() {
  }

  public GetAssociatedActivitiesResponse200AllOf data(List<ActivityResponseObject> data) {
    
    this.data = data;
    return this;
  }

  public GetAssociatedActivitiesResponse200AllOf addDataItem(ActivityResponseObject dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The array of activities
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of activities")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ActivityResponseObject> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<ActivityResponseObject> data) {
    this.data = data;
  }


  public GetAssociatedActivitiesResponse200AllOf additionalData(ActivityDistributionDataWithAdditionalData additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Get additionalData
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityDistributionDataWithAdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(ActivityDistributionDataWithAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssociatedActivitiesResponse200AllOf getAssociatedActivitiesResponse200AllOf = (GetAssociatedActivitiesResponse200AllOf) o;
    return Objects.equals(this.data, getAssociatedActivitiesResponse200AllOf.data) &&
        Objects.equals(this.additionalData, getAssociatedActivitiesResponse200AllOf.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssociatedActivitiesResponse200AllOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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

