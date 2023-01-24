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
import com.zenika.pipedrive.model.GetNoteFieldsResponse200AllOfDataInnerOptionsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetNoteFieldsResponse200AllOfDataInner
 */
@JsonPropertyOrder({
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_ID,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_KEY,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_NAME,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_FIELD_TYPE,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_ACTIVE_FLAG,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_EDIT_FLAG,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_BULK_EDIT_ALLOWED,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_MANDATORY_FLAG,
  GetNoteFieldsResponse200AllOfDataInner.JSON_PROPERTY_OPTIONS
})
@JsonTypeName("getNoteFieldsResponse200_allOf_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetNoteFieldsResponse200AllOfDataInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The type of the field&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;address&#x60;&lt;/td&gt;&lt;td&gt;Address field (has multiple subfields, autocompleted by Google Maps)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;date&#x60;&lt;/td&gt;&lt;td&gt;Date (format YYYY-MM-DD)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;daterange&#x60;&lt;/td&gt;&lt;td&gt;Date-range field (has a start date and end date value, both YYYY-MM-DD)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;double&#x60;&lt;/td&gt;&lt;td&gt;Numeric value&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;enum&#x60;&lt;/td&gt;&lt;td&gt;Options field with a single possible chosen option&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;monetary&#x60;&lt;/td&gt;&lt;td&gt;Monetary field (has a numeric value and a currency value)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;org&#x60;&lt;/td&gt;&lt;td&gt;Organization field (contains an organization ID which is stored on the same account)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;people&#x60;&lt;/td&gt;&lt;td&gt;Person field (contains a person ID which is stored on the same account)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;phone&#x60;&lt;/td&gt;&lt;td&gt;Phone field (up to 255 numbers and/or characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;set&#x60;&lt;/td&gt;&lt;td&gt;Options field with a possibility of having multiple chosen options&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;text&#x60;&lt;/td&gt;&lt;td&gt;Long text (up to 65k characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;time&#x60;&lt;/td&gt;&lt;td&gt;Time field (format HH:MM:SS)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;timerange&#x60;&lt;/td&gt;&lt;td&gt;Time-range field (has a start time and end time value, both HH:MM:SS)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;user&#x60;&lt;/td&gt;&lt;td&gt;User field (contains a user ID of another Pipedrive user)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar&#x60;&lt;/td&gt;&lt;td&gt;Text (up to 255 characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar_auto&#x60;&lt;/td&gt;&lt;td&gt;Autocomplete text (up to 255 characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;visible_to&#x60;&lt;/td&gt;&lt;td&gt;System field that keeps item&#39;s visibility setting&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   */
  public enum FieldTypeEnum {
    ADDRESS("address"),
    
    DATE("date"),
    
    DATERANGE("daterange"),
    
    DOUBLE("double"),
    
    ENUM("enum"),
    
    MONETARY("monetary"),
    
    ORG("org"),
    
    PEOPLE("people"),
    
    PHONE("phone"),
    
    SET("set"),
    
    TEXT("text"),
    
    TIME("time"),
    
    TIMERANGE("timerange"),
    
    USER("user"),
    
    VARCHAR("varchar"),
    
    VARCHAR_AUTO("varchar_auto"),
    
    VISIBLE_TO("visible_to");

    private String value;

    FieldTypeEnum(String value) {
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
    public static FieldTypeEnum fromValue(String value) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
  private FieldTypeEnum fieldType;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_EDIT_FLAG = "edit_flag";
  private Boolean editFlag;

  public static final String JSON_PROPERTY_BULK_EDIT_ALLOWED = "bulk_edit_allowed";
  private Boolean bulkEditAllowed;

  public static final String JSON_PROPERTY_MANDATORY_FLAG = "mandatory_flag";
  private Boolean mandatoryFlag;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<GetNoteFieldsResponse200AllOfDataInnerOptionsInner> options = null;

  public GetNoteFieldsResponse200AllOfDataInner() {
  }

  public GetNoteFieldsResponse200AllOfDataInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the field
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the field")
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


  public GetNoteFieldsResponse200AllOfDataInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the field
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the field")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public GetNoteFieldsResponse200AllOfDataInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the field")
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


  public GetNoteFieldsResponse200AllOfDataInner fieldType(FieldTypeEnum fieldType) {
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * The type of the field&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;address&#x60;&lt;/td&gt;&lt;td&gt;Address field (has multiple subfields, autocompleted by Google Maps)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;date&#x60;&lt;/td&gt;&lt;td&gt;Date (format YYYY-MM-DD)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;daterange&#x60;&lt;/td&gt;&lt;td&gt;Date-range field (has a start date and end date value, both YYYY-MM-DD)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;double&#x60;&lt;/td&gt;&lt;td&gt;Numeric value&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;enum&#x60;&lt;/td&gt;&lt;td&gt;Options field with a single possible chosen option&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;monetary&#x60;&lt;/td&gt;&lt;td&gt;Monetary field (has a numeric value and a currency value)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;org&#x60;&lt;/td&gt;&lt;td&gt;Organization field (contains an organization ID which is stored on the same account)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;people&#x60;&lt;/td&gt;&lt;td&gt;Person field (contains a person ID which is stored on the same account)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;phone&#x60;&lt;/td&gt;&lt;td&gt;Phone field (up to 255 numbers and/or characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;set&#x60;&lt;/td&gt;&lt;td&gt;Options field with a possibility of having multiple chosen options&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;text&#x60;&lt;/td&gt;&lt;td&gt;Long text (up to 65k characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;time&#x60;&lt;/td&gt;&lt;td&gt;Time field (format HH:MM:SS)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;timerange&#x60;&lt;/td&gt;&lt;td&gt;Time-range field (has a start time and end time value, both HH:MM:SS)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;user&#x60;&lt;/td&gt;&lt;td&gt;User field (contains a user ID of another Pipedrive user)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar&#x60;&lt;/td&gt;&lt;td&gt;Text (up to 255 characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar_auto&#x60;&lt;/td&gt;&lt;td&gt;Autocomplete text (up to 255 characters)&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;visible_to&#x60;&lt;/td&gt;&lt;td&gt;System field that keeps item&#39;s visibility setting&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`address`</td><td>Address field (has multiple subfields, autocompleted by Google Maps)</td></tr><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td></tr><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td></tr><tr><td>`double`</td><td>Numeric value</td></tr><tr><td>`enum`</td><td>Options field with a single possible chosen option</td></tr><tr></tr><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td></tr><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td></tr><tr><td>`people`</td><td>Person field (contains a person ID which is stored on the same account)</td></tr><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td></tr><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td></tr><tr><td>`text`</td><td>Long text (up to 65k characters)</td></tr><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td></tr><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td></tr><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td></tr><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td></tr><tr><td>`visible_to`</td><td>System field that keeps item's visibility setting</td></tr></table>")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldTypeEnum getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }


  public GetNoteFieldsResponse200AllOfDataInner activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * The active flag of the field
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The active flag of the field")
  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveFlag() {
    return activeFlag;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveFlag(Boolean activeFlag) {
    this.activeFlag = activeFlag;
  }


  public GetNoteFieldsResponse200AllOfDataInner editFlag(Boolean editFlag) {
    
    this.editFlag = editFlag;
    return this;
  }

   /**
   * The edit flag of the field
   * @return editFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The edit flag of the field")
  @JsonProperty(JSON_PROPERTY_EDIT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditFlag() {
    return editFlag;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditFlag(Boolean editFlag) {
    this.editFlag = editFlag;
  }


  public GetNoteFieldsResponse200AllOfDataInner bulkEditAllowed(Boolean bulkEditAllowed) {
    
    this.bulkEditAllowed = bulkEditAllowed;
    return this;
  }

   /**
   * Not used
   * @return bulkEditAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used")
  @JsonProperty(JSON_PROPERTY_BULK_EDIT_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBulkEditAllowed() {
    return bulkEditAllowed;
  }


  @JsonProperty(JSON_PROPERTY_BULK_EDIT_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkEditAllowed(Boolean bulkEditAllowed) {
    this.bulkEditAllowed = bulkEditAllowed;
  }


  public GetNoteFieldsResponse200AllOfDataInner mandatoryFlag(Boolean mandatoryFlag) {
    
    this.mandatoryFlag = mandatoryFlag;
    return this;
  }

   /**
   * Whether or not the field is mandatory
   * @return mandatoryFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the field is mandatory")
  @JsonProperty(JSON_PROPERTY_MANDATORY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMandatoryFlag() {
    return mandatoryFlag;
  }


  @JsonProperty(JSON_PROPERTY_MANDATORY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandatoryFlag(Boolean mandatoryFlag) {
    this.mandatoryFlag = mandatoryFlag;
  }


  public GetNoteFieldsResponse200AllOfDataInner options(List<GetNoteFieldsResponse200AllOfDataInnerOptionsInner> options) {
    
    this.options = options;
    return this;
  }

  public GetNoteFieldsResponse200AllOfDataInner addOptionsItem(GetNoteFieldsResponse200AllOfDataInnerOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The options of the field. When there are no options, &#x60;null&#x60; is returned.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The options of the field. When there are no options, `null` is returned.")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetNoteFieldsResponse200AllOfDataInnerOptionsInner> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(List<GetNoteFieldsResponse200AllOfDataInnerOptionsInner> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNoteFieldsResponse200AllOfDataInner getNoteFieldsResponse200AllOfDataInner = (GetNoteFieldsResponse200AllOfDataInner) o;
    return Objects.equals(this.id, getNoteFieldsResponse200AllOfDataInner.id) &&
        Objects.equals(this.key, getNoteFieldsResponse200AllOfDataInner.key) &&
        Objects.equals(this.name, getNoteFieldsResponse200AllOfDataInner.name) &&
        Objects.equals(this.fieldType, getNoteFieldsResponse200AllOfDataInner.fieldType) &&
        Objects.equals(this.activeFlag, getNoteFieldsResponse200AllOfDataInner.activeFlag) &&
        Objects.equals(this.editFlag, getNoteFieldsResponse200AllOfDataInner.editFlag) &&
        Objects.equals(this.bulkEditAllowed, getNoteFieldsResponse200AllOfDataInner.bulkEditAllowed) &&
        Objects.equals(this.mandatoryFlag, getNoteFieldsResponse200AllOfDataInner.mandatoryFlag) &&
        Objects.equals(this.options, getNoteFieldsResponse200AllOfDataInner.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, fieldType, activeFlag, editFlag, bulkEditAllowed, mandatoryFlag, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNoteFieldsResponse200AllOfDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
    sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
    sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

