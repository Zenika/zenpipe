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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PipelineRequest1
 */
@JsonPropertyOrder({
  PipelineRequest1.JSON_PROPERTY_NAME,
  PipelineRequest1.JSON_PROPERTY_DEAL_PROBABILITY,
  PipelineRequest1.JSON_PROPERTY_ORDER_NR,
  PipelineRequest1.JSON_PROPERTY_ACTIVE
})
@JsonTypeName("pipelineRequest_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PipelineRequest1 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets dealProbability
   */
  public enum DealProbabilityEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    DealProbabilityEnum(BigDecimal value) {
      this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DealProbabilityEnum fromValue(BigDecimal value) {
      for (DealProbabilityEnum b : DealProbabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DEAL_PROBABILITY = "deal_probability";
  private DealProbabilityEnum dealProbability;

  public static final String JSON_PROPERTY_ORDER_NR = "order_nr";
  private Integer orderNr;

  /**
   * Gets or Sets active
   */
  public enum ActiveEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    ActiveEnum(BigDecimal value) {
      this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActiveEnum fromValue(BigDecimal value) {
      for (ActiveEnum b : ActiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private ActiveEnum active;

  public PipelineRequest1() {
  }

  public PipelineRequest1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the pipeline
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the pipeline")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PipelineRequest1 dealProbability(DealProbabilityEnum dealProbability) {
    
    this.dealProbability = dealProbability;
    return this;
  }

   /**
   * Get dealProbability
   * @return dealProbability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DealProbabilityEnum getDealProbability() {
    return dealProbability;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealProbability(DealProbabilityEnum dealProbability) {
    this.dealProbability = dealProbability;
  }


  public PipelineRequest1 orderNr(Integer orderNr) {
    
    this.orderNr = orderNr;
    return this;
  }

   /**
   * Defines the order of pipelines. First order (&#x60;order_nr&#x3D;0&#x60;) is the default pipeline.
   * @return orderNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.")
  @JsonProperty(JSON_PROPERTY_ORDER_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrderNr() {
    return orderNr;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderNr(Integer orderNr) {
    this.orderNr = orderNr;
  }


  public PipelineRequest1 active(ActiveEnum active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActiveEnum getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(ActiveEnum active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineRequest1 pipelineRequest1 = (PipelineRequest1) o;
    return Objects.equals(this.name, pipelineRequest1.name) &&
        Objects.equals(this.dealProbability, pipelineRequest1.dealProbability) &&
        Objects.equals(this.orderNr, pipelineRequest1.orderNr) &&
        Objects.equals(this.active, pipelineRequest1.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dealProbability, orderNr, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineRequest1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
    sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

