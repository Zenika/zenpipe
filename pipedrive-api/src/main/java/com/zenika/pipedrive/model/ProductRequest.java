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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProductRequest
 */
@JsonPropertyOrder({
  ProductRequest.JSON_PROPERTY_CODE,
  ProductRequest.JSON_PROPERTY_UNIT,
  ProductRequest.JSON_PROPERTY_TAX,
  ProductRequest.JSON_PROPERTY_ACTIVE_FLAG,
  ProductRequest.JSON_PROPERTY_SELECTABLE,
  ProductRequest.JSON_PROPERTY_VISIBLE_TO,
  ProductRequest.JSON_PROPERTY_OWNER_ID,
  ProductRequest.JSON_PROPERTY_PRICES
})
@JsonTypeName("productRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class ProductRequest {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_TAX = "tax";
  private BigDecimal tax = new BigDecimal("0");

  /**
   * Whether this product will be made active or not
   */
  public enum ActiveFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    ActiveFlagEnum(BigDecimal value) {
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
    public static ActiveFlagEnum fromValue(BigDecimal value) {
      for (ActiveFlagEnum b : ActiveFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private ActiveFlagEnum activeFlag = ActiveFlagEnum.NUMBER_1;

  /**
   * Whether this product can be selected in deals or not
   */
  public enum SelectableEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    SelectableEnum(BigDecimal value) {
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
    public static SelectableEnum fromValue(BigDecimal value) {
      for (SelectableEnum b : SelectableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SELECTABLE = "selectable";
  private SelectableEnum selectable = SelectableEnum.NUMBER_1;

  /**
   * Gets or Sets visibleTo
   */
  public enum VisibleToEnum {
    _1("1"),
    
    _3("3"),
    
    _5("5"),
    
    _7("7");

    private String value;

    VisibleToEnum(String value) {
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
    public static VisibleToEnum fromValue(String value) {
      for (VisibleToEnum b : VisibleToEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VISIBLE_TO = "visible_to";
  private VisibleToEnum visibleTo;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private List<Object> prices = null;

  public ProductRequest() {
  }

  public ProductRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The product code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product code")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public ProductRequest unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The unit in which this product is sold
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit in which this product is sold")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  public ProductRequest tax(BigDecimal tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * The tax percentage
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tax percentage")
  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTax() {
    return tax;
  }


  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }


  public ProductRequest activeFlag(ActiveFlagEnum activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether this product will be made active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this product will be made active or not")
  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActiveFlagEnum getActiveFlag() {
    return activeFlag;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveFlag(ActiveFlagEnum activeFlag) {
    this.activeFlag = activeFlag;
  }


  public ProductRequest selectable(SelectableEnum selectable) {
    
    this.selectable = selectable;
    return this;
  }

   /**
   * Whether this product can be selected in deals or not
   * @return selectable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this product can be selected in deals or not")
  @JsonProperty(JSON_PROPERTY_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelectableEnum getSelectable() {
    return selectable;
  }


  @JsonProperty(JSON_PROPERTY_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectable(SelectableEnum selectable) {
    this.selectable = selectable;
  }


  public ProductRequest visibleTo(VisibleToEnum visibleTo) {
    
    this.visibleTo = visibleTo;
    return this;
  }

   /**
   * Get visibleTo
   * @return visibleTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisibleToEnum getVisibleTo() {
    return visibleTo;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleTo(VisibleToEnum visibleTo) {
    this.visibleTo = visibleTo;
  }


  public ProductRequest ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the user who will be marked as the owner of this product. When omitted, the authorized user ID will be used.
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who will be marked as the owner of this product. When omitted, the authorized user ID will be used.")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOwnerId() {
    return ownerId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  public ProductRequest prices(List<Object> prices) {
    
    this.prices = prices;
    return this;
  }

  public ProductRequest addPricesItem(Object pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * An array of objects, each containing: &#x60;currency&#x60; (string), &#x60;price&#x60; (number), &#x60;cost&#x60; (number, optional), &#x60;overhead_cost&#x60; (number, optional). Note that there can only be one price per product per currency. When &#x60;prices&#x60; is omitted altogether, a default price of 0 and a default currency based on the company&#39;s currency will be assigned.
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each containing: `currency` (string), `price` (number), `cost` (number, optional), `overhead_cost` (number, optional). Note that there can only be one price per product per currency. When `prices` is omitted altogether, a default price of 0 and a default currency based on the company's currency will be assigned.")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(List<Object> prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRequest productRequest = (ProductRequest) o;
    return Objects.equals(this.code, productRequest.code) &&
        Objects.equals(this.unit, productRequest.unit) &&
        Objects.equals(this.tax, productRequest.tax) &&
        Objects.equals(this.activeFlag, productRequest.activeFlag) &&
        Objects.equals(this.selectable, productRequest.selectable) &&
        Objects.equals(this.visibleTo, productRequest.visibleTo) &&
        Objects.equals(this.ownerId, productRequest.ownerId) &&
        Objects.equals(this.prices, productRequest.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, unit, tax, activeFlag, selectable, visibleTo, ownerId, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    selectable: ").append(toIndentedString(selectable)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

