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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SearchItemByFieldResponse200AllOfDataInner
 */
@JsonPropertyOrder({
  SearchItemByFieldResponse200AllOfDataInner.JSON_PROPERTY_ID,
  SearchItemByFieldResponse200AllOfDataInner.JSON_PROPERTY_$_FIELD_KEY
})
@JsonTypeName("searchItemByFieldResponse200_allOf_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SearchItemByFieldResponse200AllOfDataInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_$_FIELD_KEY = "$field_key";
  private JsonNullable<Object> $fieldKey = JsonNullable.<Object>of(null);

  public SearchItemByFieldResponse200AllOfDataInner() {
  }

  public SearchItemByFieldResponse200AllOfDataInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the item
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the item")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public SearchItemByFieldResponse200AllOfDataInner $fieldKey(Object $fieldKey) {
    this.$fieldKey = JsonNullable.<Object>of($fieldKey);
    
    return this;
  }

   /**
   * The value of the searched &#x60;field_key&#x60;
   * @return $fieldKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the searched `field_key`")
  @JsonIgnore

  public Object get$FieldKey() {
        return $fieldKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_$_FIELD_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> get$FieldKey_JsonNullable() {
    return $fieldKey;
  }
  
  @JsonProperty(JSON_PROPERTY_$_FIELD_KEY)
  public void set$FieldKey_JsonNullable(JsonNullable<Object> $fieldKey) {
    this.$fieldKey = $fieldKey;
  }

  public void set$FieldKey(Object $fieldKey) {
    this.$fieldKey = JsonNullable.<Object>of($fieldKey);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchItemByFieldResponse200AllOfDataInner searchItemByFieldResponse200AllOfDataInner = (SearchItemByFieldResponse200AllOfDataInner) o;
    return Objects.equals(this.id, searchItemByFieldResponse200AllOfDataInner.id) &&
        equalsNullable(this.$fieldKey, searchItemByFieldResponse200AllOfDataInner.$fieldKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable($fieldKey));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchItemByFieldResponse200AllOfDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    $fieldKey: ").append(toIndentedString($fieldKey)).append("\n");
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

