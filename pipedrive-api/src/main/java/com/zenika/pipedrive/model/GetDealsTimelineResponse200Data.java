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
import com.zenika.pipedrive.model.DealStrict;
import com.zenika.pipedrive.model.GetDealsTimelineResponse200DataTotals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Open and won deals grouped into periods by defined interval, amount and date-type dealField (&#x60;field_key&#x60;)
 */
@ApiModel(description = "Open and won deals grouped into periods by defined interval, amount and date-type dealField (`field_key`)")
@JsonPropertyOrder({
  GetDealsTimelineResponse200Data.JSON_PROPERTY_PERIOD_START,
  GetDealsTimelineResponse200Data.JSON_PROPERTY_PERIOD_END,
  GetDealsTimelineResponse200Data.JSON_PROPERTY_DEALS,
  GetDealsTimelineResponse200Data.JSON_PROPERTY_TOTALS
})
@JsonTypeName("getDealsTimelineResponse200_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetDealsTimelineResponse200Data {
  public static final String JSON_PROPERTY_PERIOD_START = "period_start";
  private String periodStart;

  public static final String JSON_PROPERTY_PERIOD_END = "period_end";
  private String periodEnd;

  public static final String JSON_PROPERTY_DEALS = "deals";
  private List<DealStrict> deals = null;

  public static final String JSON_PROPERTY_TOTALS = "totals";
  private GetDealsTimelineResponse200DataTotals totals;

  public GetDealsTimelineResponse200Data() {
  }

  public GetDealsTimelineResponse200Data periodStart(String periodStart) {
    
    this.periodStart = periodStart;
    return this;
  }

   /**
   * The start date and time of the period
   * @return periodStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date and time of the period")
  @JsonProperty(JSON_PROPERTY_PERIOD_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriodStart() {
    return periodStart;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodStart(String periodStart) {
    this.periodStart = periodStart;
  }


  public GetDealsTimelineResponse200Data periodEnd(String periodEnd) {
    
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * The end date and time of the period
   * @return periodEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date and time of the period")
  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriodEnd() {
    return periodEnd;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodEnd(String periodEnd) {
    this.periodEnd = periodEnd;
  }


  public GetDealsTimelineResponse200Data deals(List<DealStrict> deals) {
    
    this.deals = deals;
    return this;
  }

  public GetDealsTimelineResponse200Data addDealsItem(DealStrict dealsItem) {
    if (this.deals == null) {
      this.deals = new ArrayList<>();
    }
    this.deals.add(dealsItem);
    return this;
  }

   /**
   * Get deals
   * @return deals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DealStrict> getDeals() {
    return deals;
  }


  @JsonProperty(JSON_PROPERTY_DEALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeals(List<DealStrict> deals) {
    this.deals = deals;
  }


  public GetDealsTimelineResponse200Data totals(GetDealsTimelineResponse200DataTotals totals) {
    
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDealsTimelineResponse200DataTotals getTotals() {
    return totals;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotals(GetDealsTimelineResponse200DataTotals totals) {
    this.totals = totals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDealsTimelineResponse200Data getDealsTimelineResponse200Data = (GetDealsTimelineResponse200Data) o;
    return Objects.equals(this.periodStart, getDealsTimelineResponse200Data.periodStart) &&
        Objects.equals(this.periodEnd, getDealsTimelineResponse200Data.periodEnd) &&
        Objects.equals(this.deals, getDealsTimelineResponse200Data.deals) &&
        Objects.equals(this.totals, getDealsTimelineResponse200Data.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStart, periodEnd, deals, totals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDealsTimelineResponse200Data {\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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

