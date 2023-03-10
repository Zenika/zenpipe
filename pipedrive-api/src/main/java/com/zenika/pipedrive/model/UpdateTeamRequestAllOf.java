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
 * UpdateTeamRequestAllOf
 */
@JsonPropertyOrder({
  UpdateTeamRequestAllOf.JSON_PROPERTY_ACTIVE_FLAG,
  UpdateTeamRequestAllOf.JSON_PROPERTY_DELETED_FLAG
})
@JsonTypeName("updateTeamRequest_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UpdateTeamRequestAllOf {
  /**
   * Gets or Sets activeFlag
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
  private ActiveFlagEnum activeFlag;

  /**
   * Gets or Sets deletedFlag
   */
  public enum DeletedFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    DeletedFlagEnum(BigDecimal value) {
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
    public static DeletedFlagEnum fromValue(BigDecimal value) {
      for (DeletedFlagEnum b : DeletedFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DELETED_FLAG = "deleted_flag";
  private DeletedFlagEnum deletedFlag;

  public UpdateTeamRequestAllOf() {
  }

  public UpdateTeamRequestAllOf activeFlag(ActiveFlagEnum activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Get activeFlag
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public UpdateTeamRequestAllOf deletedFlag(DeletedFlagEnum deletedFlag) {
    
    this.deletedFlag = deletedFlag;
    return this;
  }

   /**
   * Get deletedFlag
   * @return deletedFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeletedFlagEnum getDeletedFlag() {
    return deletedFlag;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletedFlag(DeletedFlagEnum deletedFlag) {
    this.deletedFlag = deletedFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTeamRequestAllOf updateTeamRequestAllOf = (UpdateTeamRequestAllOf) o;
    return Objects.equals(this.activeFlag, updateTeamRequestAllOf.activeFlag) &&
        Objects.equals(this.deletedFlag, updateTeamRequestAllOf.deletedFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeFlag, deletedFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTeamRequestAllOf {\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
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

