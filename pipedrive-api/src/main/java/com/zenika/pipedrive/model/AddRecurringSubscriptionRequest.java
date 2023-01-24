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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddRecurringSubscriptionRequest
 */
@JsonPropertyOrder({
  AddRecurringSubscriptionRequest.JSON_PROPERTY_DEAL_ID,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_CURRENCY,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_DESCRIPTION,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_CADENCE_TYPE,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_CYCLES_COUNT,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_CYCLE_AMOUNT,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_START_DATE,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_INFINITE,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_PAYMENTS,
  AddRecurringSubscriptionRequest.JSON_PROPERTY_UPDATE_DEAL_VALUE
})
@JsonTypeName("addRecurringSubscriptionRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddRecurringSubscriptionRequest {
  public static final String JSON_PROPERTY_DEAL_ID = "deal_id";
  private Integer dealId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * The interval between payments
   */
  public enum CadenceTypeEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    YEARLY("yearly");

    private String value;

    CadenceTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CadenceTypeEnum fromValue(String value) {
      for (CadenceTypeEnum b : CadenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CADENCE_TYPE = "cadence_type";
  private CadenceTypeEnum cadenceType;

  public static final String JSON_PROPERTY_CYCLES_COUNT = "cycles_count";
  private Integer cyclesCount;

  public static final String JSON_PROPERTY_CYCLE_AMOUNT = "cycle_amount";
  private Integer cycleAmount;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_INFINITE = "infinite";
  private Boolean infinite;

  public static final String JSON_PROPERTY_PAYMENTS = "payments";
  private List<Object> payments = null;

  public static final String JSON_PROPERTY_UPDATE_DEAL_VALUE = "update_deal_value";
  private Boolean updateDealValue;

  public AddRecurringSubscriptionRequest() {
  }

  public AddRecurringSubscriptionRequest dealId(Integer dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * The ID of the deal this recurring subscription is associated with
   * @return dealId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the deal this recurring subscription is associated with")
  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDealId() {
    return dealId;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDealId(Integer dealId) {
    this.dealId = dealId;
  }


  public AddRecurringSubscriptionRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the recurring subscription. Accepts a 3-character currency code.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currency of the recurring subscription. Accepts a 3-character currency code.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public AddRecurringSubscriptionRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the recurring subscription
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the recurring subscription")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AddRecurringSubscriptionRequest cadenceType(CadenceTypeEnum cadenceType) {
    
    this.cadenceType = cadenceType;
    return this;
  }

   /**
   * The interval between payments
   * @return cadenceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The interval between payments")
  @JsonProperty(JSON_PROPERTY_CADENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CadenceTypeEnum getCadenceType() {
    return cadenceType;
  }


  @JsonProperty(JSON_PROPERTY_CADENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCadenceType(CadenceTypeEnum cadenceType) {
    this.cadenceType = cadenceType;
  }


  public AddRecurringSubscriptionRequest cyclesCount(Integer cyclesCount) {
    
    this.cyclesCount = cyclesCount;
    return this;
  }

   /**
   * Shows how many payments the subscription has. Note that one field must be set: &#x60;cycles_count&#x60; or &#x60;infinite&#x60;. If &#x60;cycles_count&#x60; is set, then &#x60;cycle_amount&#x60; and &#x60;start_date&#x60; are also required.
   * @return cyclesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows how many payments the subscription has. Note that one field must be set: `cycles_count` or `infinite`. If `cycles_count` is set, then `cycle_amount` and `start_date` are also required.")
  @JsonProperty(JSON_PROPERTY_CYCLES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCyclesCount() {
    return cyclesCount;
  }


  @JsonProperty(JSON_PROPERTY_CYCLES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCyclesCount(Integer cyclesCount) {
    this.cyclesCount = cyclesCount;
  }


  public AddRecurringSubscriptionRequest cycleAmount(Integer cycleAmount) {
    
    this.cycleAmount = cycleAmount;
    return this;
  }

   /**
   * The amount of each payment
   * @return cycleAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of each payment")
  @JsonProperty(JSON_PROPERTY_CYCLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCycleAmount() {
    return cycleAmount;
  }


  @JsonProperty(JSON_PROPERTY_CYCLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCycleAmount(Integer cycleAmount) {
    this.cycleAmount = cycleAmount;
  }


  public AddRecurringSubscriptionRequest startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the recurring subscription. Format: YYYY-MM-DD
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start date of the recurring subscription. Format: YYYY-MM-DD")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public AddRecurringSubscriptionRequest infinite(Boolean infinite) {
    
    this.infinite = infinite;
    return this;
  }

   /**
   * This indicates that the recurring subscription will last until it&#39;s manually canceled or deleted. Note that only one field must be set: &#x60;cycles_count&#x60; or &#x60;infinite&#x60;.
   * @return infinite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This indicates that the recurring subscription will last until it's manually canceled or deleted. Note that only one field must be set: `cycles_count` or `infinite`.")
  @JsonProperty(JSON_PROPERTY_INFINITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInfinite() {
    return infinite;
  }


  @JsonProperty(JSON_PROPERTY_INFINITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfinite(Boolean infinite) {
    this.infinite = infinite;
  }


  public AddRecurringSubscriptionRequest payments(List<Object> payments) {
    
    this.payments = payments;
    return this;
  }

  public AddRecurringSubscriptionRequest addPaymentsItem(Object paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Array of additional payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
   * @return payments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of additional payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).")
  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPayments() {
    return payments;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayments(List<Object> payments) {
    this.payments = payments;
  }


  public AddRecurringSubscriptionRequest updateDealValue(Boolean updateDealValue) {
    
    this.updateDealValue = updateDealValue;
    return this;
  }

   /**
   * Indicates that the deal value must be set to recurring subscription&#39;s MRR value
   * @return updateDealValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the deal value must be set to recurring subscription's MRR value")
  @JsonProperty(JSON_PROPERTY_UPDATE_DEAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpdateDealValue() {
    return updateDealValue;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_DEAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateDealValue(Boolean updateDealValue) {
    this.updateDealValue = updateDealValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRecurringSubscriptionRequest addRecurringSubscriptionRequest = (AddRecurringSubscriptionRequest) o;
    return Objects.equals(this.dealId, addRecurringSubscriptionRequest.dealId) &&
        Objects.equals(this.currency, addRecurringSubscriptionRequest.currency) &&
        Objects.equals(this.description, addRecurringSubscriptionRequest.description) &&
        Objects.equals(this.cadenceType, addRecurringSubscriptionRequest.cadenceType) &&
        Objects.equals(this.cyclesCount, addRecurringSubscriptionRequest.cyclesCount) &&
        Objects.equals(this.cycleAmount, addRecurringSubscriptionRequest.cycleAmount) &&
        Objects.equals(this.startDate, addRecurringSubscriptionRequest.startDate) &&
        Objects.equals(this.infinite, addRecurringSubscriptionRequest.infinite) &&
        Objects.equals(this.payments, addRecurringSubscriptionRequest.payments) &&
        Objects.equals(this.updateDealValue, addRecurringSubscriptionRequest.updateDealValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealId, currency, description, cadenceType, cyclesCount, cycleAmount, startDate, infinite, payments, updateDealValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRecurringSubscriptionRequest {\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cadenceType: ").append(toIndentedString(cadenceType)).append("\n");
    sb.append("    cyclesCount: ").append(toIndentedString(cyclesCount)).append("\n");
    sb.append("    cycleAmount: ").append(toIndentedString(cycleAmount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    infinite: ").append(toIndentedString(infinite)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    updateDealValue: ").append(toIndentedString(updateDealValue)).append("\n");
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

