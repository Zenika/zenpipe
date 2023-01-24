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
 * DealCountAndActivityInfoAllOf
 */
@JsonPropertyOrder({
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_OPEN_DEALS_COUNT,
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT,
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_CLOSED_DEALS_COUNT,
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT,
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_WON_DEALS_COUNT,
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_RELATED_WON_DEALS_COUNT,
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_LOST_DEALS_COUNT,
  DealCountAndActivityInfoAllOf.JSON_PROPERTY_RELATED_LOST_DEALS_COUNT
})
@JsonTypeName("dealCountAndActivityInfo_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class DealCountAndActivityInfoAllOf {
  public static final String JSON_PROPERTY_OPEN_DEALS_COUNT = "open_deals_count";
  private Integer openDealsCount;

  public static final String JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT = "related_open_deals_count";
  private Integer relatedOpenDealsCount;

  public static final String JSON_PROPERTY_CLOSED_DEALS_COUNT = "closed_deals_count";
  private Integer closedDealsCount;

  public static final String JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT = "related_closed_deals_count";
  private Integer relatedClosedDealsCount;

  public static final String JSON_PROPERTY_WON_DEALS_COUNT = "won_deals_count";
  private Integer wonDealsCount;

  public static final String JSON_PROPERTY_RELATED_WON_DEALS_COUNT = "related_won_deals_count";
  private Integer relatedWonDealsCount;

  public static final String JSON_PROPERTY_LOST_DEALS_COUNT = "lost_deals_count";
  private Integer lostDealsCount;

  public static final String JSON_PROPERTY_RELATED_LOST_DEALS_COUNT = "related_lost_deals_count";
  private Integer relatedLostDealsCount;

  public DealCountAndActivityInfoAllOf() {
  }

  public DealCountAndActivityInfoAllOf openDealsCount(Integer openDealsCount) {
    
    this.openDealsCount = openDealsCount;
    return this;
  }

   /**
   * The count of open deals related with the item
   * @return openDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of open deals related with the item")
  @JsonProperty(JSON_PROPERTY_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpenDealsCount() {
    return openDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenDealsCount(Integer openDealsCount) {
    this.openDealsCount = openDealsCount;
  }


  public DealCountAndActivityInfoAllOf relatedOpenDealsCount(Integer relatedOpenDealsCount) {
    
    this.relatedOpenDealsCount = relatedOpenDealsCount;
    return this;
  }

   /**
   * The count of related open deals related with the item
   * @return relatedOpenDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related open deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedOpenDealsCount() {
    return relatedOpenDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedOpenDealsCount(Integer relatedOpenDealsCount) {
    this.relatedOpenDealsCount = relatedOpenDealsCount;
  }


  public DealCountAndActivityInfoAllOf closedDealsCount(Integer closedDealsCount) {
    
    this.closedDealsCount = closedDealsCount;
    return this;
  }

   /**
   * The count of closed deals related with the item
   * @return closedDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of closed deals related with the item")
  @JsonProperty(JSON_PROPERTY_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClosedDealsCount() {
    return closedDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClosedDealsCount(Integer closedDealsCount) {
    this.closedDealsCount = closedDealsCount;
  }


  public DealCountAndActivityInfoAllOf relatedClosedDealsCount(Integer relatedClosedDealsCount) {
    
    this.relatedClosedDealsCount = relatedClosedDealsCount;
    return this;
  }

   /**
   * The count of related closed deals related with the item
   * @return relatedClosedDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related closed deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedClosedDealsCount() {
    return relatedClosedDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedClosedDealsCount(Integer relatedClosedDealsCount) {
    this.relatedClosedDealsCount = relatedClosedDealsCount;
  }


  public DealCountAndActivityInfoAllOf wonDealsCount(Integer wonDealsCount) {
    
    this.wonDealsCount = wonDealsCount;
    return this;
  }

   /**
   * The count of won deals related with the item
   * @return wonDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of won deals related with the item")
  @JsonProperty(JSON_PROPERTY_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWonDealsCount() {
    return wonDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWonDealsCount(Integer wonDealsCount) {
    this.wonDealsCount = wonDealsCount;
  }


  public DealCountAndActivityInfoAllOf relatedWonDealsCount(Integer relatedWonDealsCount) {
    
    this.relatedWonDealsCount = relatedWonDealsCount;
    return this;
  }

   /**
   * The count of related won deals related with the item
   * @return relatedWonDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related won deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedWonDealsCount() {
    return relatedWonDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedWonDealsCount(Integer relatedWonDealsCount) {
    this.relatedWonDealsCount = relatedWonDealsCount;
  }


  public DealCountAndActivityInfoAllOf lostDealsCount(Integer lostDealsCount) {
    
    this.lostDealsCount = lostDealsCount;
    return this;
  }

   /**
   * The count of lost deals related with the item
   * @return lostDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of lost deals related with the item")
  @JsonProperty(JSON_PROPERTY_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLostDealsCount() {
    return lostDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLostDealsCount(Integer lostDealsCount) {
    this.lostDealsCount = lostDealsCount;
  }


  public DealCountAndActivityInfoAllOf relatedLostDealsCount(Integer relatedLostDealsCount) {
    
    this.relatedLostDealsCount = relatedLostDealsCount;
    return this;
  }

   /**
   * The count of related lost deals related with the item
   * @return relatedLostDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related lost deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedLostDealsCount() {
    return relatedLostDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedLostDealsCount(Integer relatedLostDealsCount) {
    this.relatedLostDealsCount = relatedLostDealsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealCountAndActivityInfoAllOf dealCountAndActivityInfoAllOf = (DealCountAndActivityInfoAllOf) o;
    return Objects.equals(this.openDealsCount, dealCountAndActivityInfoAllOf.openDealsCount) &&
        Objects.equals(this.relatedOpenDealsCount, dealCountAndActivityInfoAllOf.relatedOpenDealsCount) &&
        Objects.equals(this.closedDealsCount, dealCountAndActivityInfoAllOf.closedDealsCount) &&
        Objects.equals(this.relatedClosedDealsCount, dealCountAndActivityInfoAllOf.relatedClosedDealsCount) &&
        Objects.equals(this.wonDealsCount, dealCountAndActivityInfoAllOf.wonDealsCount) &&
        Objects.equals(this.relatedWonDealsCount, dealCountAndActivityInfoAllOf.relatedWonDealsCount) &&
        Objects.equals(this.lostDealsCount, dealCountAndActivityInfoAllOf.lostDealsCount) &&
        Objects.equals(this.relatedLostDealsCount, dealCountAndActivityInfoAllOf.relatedLostDealsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openDealsCount, relatedOpenDealsCount, closedDealsCount, relatedClosedDealsCount, wonDealsCount, relatedWonDealsCount, lostDealsCount, relatedLostDealsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealCountAndActivityInfoAllOf {\n");
    sb.append("    openDealsCount: ").append(toIndentedString(openDealsCount)).append("\n");
    sb.append("    relatedOpenDealsCount: ").append(toIndentedString(relatedOpenDealsCount)).append("\n");
    sb.append("    closedDealsCount: ").append(toIndentedString(closedDealsCount)).append("\n");
    sb.append("    relatedClosedDealsCount: ").append(toIndentedString(relatedClosedDealsCount)).append("\n");
    sb.append("    wonDealsCount: ").append(toIndentedString(wonDealsCount)).append("\n");
    sb.append("    relatedWonDealsCount: ").append(toIndentedString(relatedWonDealsCount)).append("\n");
    sb.append("    lostDealsCount: ").append(toIndentedString(lostDealsCount)).append("\n");
    sb.append("    relatedLostDealsCount: ").append(toIndentedString(relatedLostDealsCount)).append("\n");
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
