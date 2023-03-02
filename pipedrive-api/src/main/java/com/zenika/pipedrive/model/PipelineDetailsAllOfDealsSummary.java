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
import com.zenika.pipedrive.model.PipelineDetailsAllOfDealsSummaryPerCurrency;
import com.zenika.pipedrive.model.PipelineDetailsAllOfDealsSummaryPerCurrencyFull;
import com.zenika.pipedrive.model.PipelineDetailsAllOfDealsSummaryPerStages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Deals summary
 */
@ApiModel(description = "Deals summary")
@JsonPropertyOrder({
  PipelineDetailsAllOfDealsSummary.JSON_PROPERTY_PER_STAGES,
  PipelineDetailsAllOfDealsSummary.JSON_PROPERTY_PER_CURRENCY,
  PipelineDetailsAllOfDealsSummary.JSON_PROPERTY_TOTAL_COUNT,
  PipelineDetailsAllOfDealsSummary.JSON_PROPERTY_PER_CURRENCY_FULL
})
@JsonTypeName("pipelineDetails_allOf_deals_summary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PipelineDetailsAllOfDealsSummary {
  public static final String JSON_PROPERTY_PER_STAGES = "per_stages";
  private PipelineDetailsAllOfDealsSummaryPerStages perStages;

  public static final String JSON_PROPERTY_PER_CURRENCY = "per_currency";
  private PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Integer totalCount;

  public static final String JSON_PROPERTY_PER_CURRENCY_FULL = "per_currency_full";
  private PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull;

  public PipelineDetailsAllOfDealsSummary() {
  }

  public PipelineDetailsAllOfDealsSummary perStages(PipelineDetailsAllOfDealsSummaryPerStages perStages) {
    
    this.perStages = perStages;
    return this;
  }

   /**
   * Get perStages
   * @return perStages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PER_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PipelineDetailsAllOfDealsSummaryPerStages getPerStages() {
    return perStages;
  }


  @JsonProperty(JSON_PROPERTY_PER_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerStages(PipelineDetailsAllOfDealsSummaryPerStages perStages) {
    this.perStages = perStages;
  }


  public PipelineDetailsAllOfDealsSummary perCurrency(PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency) {
    
    this.perCurrency = perCurrency;
    return this;
  }

   /**
   * Get perCurrency
   * @return perCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PER_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PipelineDetailsAllOfDealsSummaryPerCurrency getPerCurrency() {
    return perCurrency;
  }


  @JsonProperty(JSON_PROPERTY_PER_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerCurrency(PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency) {
    this.perCurrency = perCurrency;
  }


  public PipelineDetailsAllOfDealsSummary totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Deals count
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deals count")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public PipelineDetailsAllOfDealsSummary perCurrencyFull(PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull) {
    
    this.perCurrencyFull = perCurrencyFull;
    return this;
  }

   /**
   * Get perCurrencyFull
   * @return perCurrencyFull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PER_CURRENCY_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PipelineDetailsAllOfDealsSummaryPerCurrencyFull getPerCurrencyFull() {
    return perCurrencyFull;
  }


  @JsonProperty(JSON_PROPERTY_PER_CURRENCY_FULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerCurrencyFull(PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull) {
    this.perCurrencyFull = perCurrencyFull;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineDetailsAllOfDealsSummary pipelineDetailsAllOfDealsSummary = (PipelineDetailsAllOfDealsSummary) o;
    return Objects.equals(this.perStages, pipelineDetailsAllOfDealsSummary.perStages) &&
        Objects.equals(this.perCurrency, pipelineDetailsAllOfDealsSummary.perCurrency) &&
        Objects.equals(this.totalCount, pipelineDetailsAllOfDealsSummary.totalCount) &&
        Objects.equals(this.perCurrencyFull, pipelineDetailsAllOfDealsSummary.perCurrencyFull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perStages, perCurrency, totalCount, perCurrencyFull);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineDetailsAllOfDealsSummary {\n");
    sb.append("    perStages: ").append(toIndentedString(perStages)).append("\n");
    sb.append("    perCurrency: ").append(toIndentedString(perCurrency)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    perCurrencyFull: ").append(toIndentedString(perCurrencyFull)).append("\n");
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

