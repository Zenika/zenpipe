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
import com.zenika.pipedrive.model.GetNotesResponse200AdditionalData;
import com.zenika.pipedrive.model.GetNotesResponse200DataInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetNotesResponse200
 */
@JsonPropertyOrder({
  GetNotesResponse200.JSON_PROPERTY_SUCCESS,
  GetNotesResponse200.JSON_PROPERTY_DATA,
  GetNotesResponse200.JSON_PROPERTY_ADDITIONAL_DATA
})
@JsonTypeName("getNotesResponse200")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetNotesResponse200 {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<GetNotesResponse200DataInner> data = null;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private GetNotesResponse200AdditionalData additionalData;

  public GetNotesResponse200() {
  }

  public GetNotesResponse200 success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * If the request was successful or not
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the request was successful or not")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public GetNotesResponse200 data(List<GetNotesResponse200DataInner> data) {
    
    this.data = data;
    return this;
  }

  public GetNotesResponse200 addDataItem(GetNotesResponse200DataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The array of notes
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of notes")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetNotesResponse200DataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<GetNotesResponse200DataInner> data) {
    this.data = data;
  }


  public GetNotesResponse200 additionalData(GetNotesResponse200AdditionalData additionalData) {
    
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

  public GetNotesResponse200AdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(GetNotesResponse200AdditionalData additionalData) {
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
    GetNotesResponse200 getNotesResponse200 = (GetNotesResponse200) o;
    return Objects.equals(this.success, getNotesResponse200.success) &&
        Objects.equals(this.data, getNotesResponse200.data) &&
        Objects.equals(this.additionalData, getNotesResponse200.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNotesResponse200 {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

