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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * All data for the product field
 */
@ApiModel(description = "All data for the product field")
@JsonPropertyOrder({
  GetProductFieldResponse200Data.JSON_PROPERTY_NAME,
  GetProductFieldResponse200Data.JSON_PROPERTY_OPTIONS,
  GetProductFieldResponse200Data.JSON_PROPERTY_FIELD_TYPE,
  GetProductFieldResponse200Data.JSON_PROPERTY_ID,
  GetProductFieldResponse200Data.JSON_PROPERTY_KEY,
  GetProductFieldResponse200Data.JSON_PROPERTY_ORDER_NR,
  GetProductFieldResponse200Data.JSON_PROPERTY_ADD_TIME,
  GetProductFieldResponse200Data.JSON_PROPERTY_UPDATE_TIME,
  GetProductFieldResponse200Data.JSON_PROPERTY_LAST_UPDATED_BY_USER_ID,
  GetProductFieldResponse200Data.JSON_PROPERTY_ACTIVE_FLAG,
  GetProductFieldResponse200Data.JSON_PROPERTY_EDIT_FLAG,
  GetProductFieldResponse200Data.JSON_PROPERTY_ADD_VISIBLE_FLAG,
  GetProductFieldResponse200Data.JSON_PROPERTY_IMPORTANT_FLAG,
  GetProductFieldResponse200Data.JSON_PROPERTY_BULK_EDIT_ALLOWED,
  GetProductFieldResponse200Data.JSON_PROPERTY_SEARCHABLE_FLAG,
  GetProductFieldResponse200Data.JSON_PROPERTY_FILTERING_ALLOWED,
  GetProductFieldResponse200Data.JSON_PROPERTY_SORTABLE_FLAG,
  GetProductFieldResponse200Data.JSON_PROPERTY_MANDATORY_FLAG
})
@JsonTypeName("getProductFieldResponse200_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetProductFieldResponse200Data {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<Object> options = null;

  /**
   * The type of the field&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar&#x60;&lt;/td&gt;&lt;td&gt;Text (up to 255 characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar_auto&#x60;&lt;/td&gt;&lt;td&gt;Autocomplete text (up to 255 characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;text&#x60;&lt;/td&gt;&lt;td&gt;Long text (up to 65k characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;double&#x60;&lt;/td&gt;&lt;td&gt;Numeric value&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;monetary&#x60;&lt;/td&gt;&lt;td&gt;Monetary field (has a numeric value and a currency value)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;date&#x60;&lt;/td&gt;&lt;td&gt;Date (format YYYY-MM-DD)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;set&#x60;&lt;/td&gt;&lt;td&gt;Options field with a possibility of having multiple chosen options&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;enum&#x60;&lt;/td&gt;&lt;td&gt;Options field with a single possible chosen option&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;user&#x60;&lt;/td&gt;&lt;td&gt;User field (contains a user ID of another Pipedrive user)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;org&#x60;&lt;/td&gt;&lt;td&gt;Organization field (contains an organization ID which is stored on the same account)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;people&#x60;&lt;/td&gt;&lt;td&gt;Person field (contains a product ID which is stored on the same account)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;phone&#x60;&lt;/td&gt;&lt;td&gt;Phone field (up to 255 numbers and/or characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;time&#x60;&lt;/td&gt;&lt;td&gt;Time field (format HH:MM:SS)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;timerange&#x60;&lt;/td&gt;&lt;td&gt;Time-range field (has a start time and end time value, both HH:MM:SS)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;daterange&#x60;&lt;/td&gt;&lt;td&gt;Date-range field (has a start date and end date value, both YYYY-MM-DD)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;address&#x60;&lt;/td&gt;&lt;td&gt;Address field (autocompleted by Google Maps)&lt;/dd&gt;&lt;/table&gt;
   */
  public enum FieldTypeEnum {
    VARCHAR("varchar"),
    
    VARCHAR_AUTO("varchar_auto"),
    
    TEXT("text"),
    
    DOUBLE("double"),
    
    MONETARY("monetary"),
    
    DATE("date"),
    
    SET("set"),
    
    ENUM("enum"),
    
    USER("user"),
    
    ORG("org"),
    
    PEOPLE("people"),
    
    PHONE("phone"),
    
    TIME("time"),
    
    TIMERANGE("timerange"),
    
    DATERANGE("daterange"),
    
    ADDRESS("address");

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

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_ORDER_NR = "order_nr";
  private Integer orderNr;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private String updateTime;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY_USER_ID = "last_updated_by_user_id";
  private Integer lastUpdatedByUserId;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_EDIT_FLAG = "edit_flag";
  private Boolean editFlag;

  public static final String JSON_PROPERTY_ADD_VISIBLE_FLAG = "add_visible_flag";
  private Boolean addVisibleFlag;

  public static final String JSON_PROPERTY_IMPORTANT_FLAG = "important_flag";
  private Boolean importantFlag;

  public static final String JSON_PROPERTY_BULK_EDIT_ALLOWED = "bulk_edit_allowed";
  private Boolean bulkEditAllowed;

  public static final String JSON_PROPERTY_SEARCHABLE_FLAG = "searchable_flag";
  private Boolean searchableFlag;

  public static final String JSON_PROPERTY_FILTERING_ALLOWED = "filtering_allowed";
  private Boolean filteringAllowed;

  public static final String JSON_PROPERTY_SORTABLE_FLAG = "sortable_flag";
  private Boolean sortableFlag;

  public static final String JSON_PROPERTY_MANDATORY_FLAG = "mandatory_flag";
  private Boolean mandatoryFlag;

  public GetProductFieldResponse200Data() {
  }

  public GetProductFieldResponse200Data name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the field")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public GetProductFieldResponse200Data options(List<Object> options) {
    
    this.options = options;
    return this;
  }

  public GetProductFieldResponse200Data addOptionsItem(Object optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * When &#x60;field_type&#x60; is either &#x60;set&#x60; or &#x60;enum&#x60;, possible options must be supplied as a JSON-encoded sequential array, for example:&lt;/br&gt;&#x60;[{\&quot;label\&quot;:\&quot;red\&quot;}, {\&quot;label\&quot;:\&quot;blue\&quot;}, {\&quot;label\&quot;:\&quot;lilac\&quot;}]&#x60;
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `field_type` is either `set` or `enum`, possible options must be supplied as a JSON-encoded sequential array, for example:</br>`[{\"label\":\"red\"}, {\"label\":\"blue\"}, {\"label\":\"lilac\"}]`")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(List<Object> options) {
    this.options = options;
  }


  public GetProductFieldResponse200Data fieldType(FieldTypeEnum fieldType) {
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * The type of the field&lt;table&gt;&lt;tr&gt;&lt;th&gt;Value&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar&#x60;&lt;/td&gt;&lt;td&gt;Text (up to 255 characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;varchar_auto&#x60;&lt;/td&gt;&lt;td&gt;Autocomplete text (up to 255 characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;text&#x60;&lt;/td&gt;&lt;td&gt;Long text (up to 65k characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;double&#x60;&lt;/td&gt;&lt;td&gt;Numeric value&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;monetary&#x60;&lt;/td&gt;&lt;td&gt;Monetary field (has a numeric value and a currency value)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;date&#x60;&lt;/td&gt;&lt;td&gt;Date (format YYYY-MM-DD)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;set&#x60;&lt;/td&gt;&lt;td&gt;Options field with a possibility of having multiple chosen options&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;enum&#x60;&lt;/td&gt;&lt;td&gt;Options field with a single possible chosen option&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;user&#x60;&lt;/td&gt;&lt;td&gt;User field (contains a user ID of another Pipedrive user)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;org&#x60;&lt;/td&gt;&lt;td&gt;Organization field (contains an organization ID which is stored on the same account)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;people&#x60;&lt;/td&gt;&lt;td&gt;Person field (contains a product ID which is stored on the same account)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;phone&#x60;&lt;/td&gt;&lt;td&gt;Phone field (up to 255 numbers and/or characters)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;time&#x60;&lt;/td&gt;&lt;td&gt;Time field (format HH:MM:SS)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;timerange&#x60;&lt;/td&gt;&lt;td&gt;Time-range field (has a start time and end time value, both HH:MM:SS)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;daterange&#x60;&lt;/td&gt;&lt;td&gt;Date-range field (has a start date and end date value, both YYYY-MM-DD)&lt;/td&gt;&lt;tr&gt;&lt;td&gt;&#x60;address&#x60;&lt;/td&gt;&lt;td&gt;Address field (autocompleted by Google Maps)&lt;/dd&gt;&lt;/table&gt;
   * @return fieldType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td><tr><td>`text`</td><td>Long text (up to 65k characters)</td><tr><td>`double`</td><td>Numeric value</td><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td><tr><td>`enum`</td><td>Options field with a single possible chosen option</td><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td><tr><td>`people`</td><td>Person field (contains a product ID which is stored on the same account)</td><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td><tr><td>`address`</td><td>Address field (autocompleted by Google Maps)</dd></table>")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FieldTypeEnum getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }


  public GetProductFieldResponse200Data id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the product field
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the product field")
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


  public GetProductFieldResponse200Data key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the product field
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the product field")
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


  public GetProductFieldResponse200Data orderNr(Integer orderNr) {
    
    this.orderNr = orderNr;
    return this;
  }

   /**
   * The position (index) of the product field in the detail view
   * @return orderNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The position (index) of the product field in the detail view")
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


  public GetProductFieldResponse200Data addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The product field creation time. Format: YYYY-MM-DD HH:MM:SS
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product field creation time. Format: YYYY-MM-DD HH:MM:SS")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  public GetProductFieldResponse200Data updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The product field last update time. Format: YYYY-MM-DD HH:MM:SS
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product field last update time. Format: YYYY-MM-DD HH:MM:SS")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public GetProductFieldResponse200Data lastUpdatedByUserId(Integer lastUpdatedByUserId) {
    
    this.lastUpdatedByUserId = lastUpdatedByUserId;
    return this;
  }

   /**
   * The ID of the last user to update the product field
   * @return lastUpdatedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the last user to update the product field")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastUpdatedByUserId() {
    return lastUpdatedByUserId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedByUserId(Integer lastUpdatedByUserId) {
    this.lastUpdatedByUserId = lastUpdatedByUserId;
  }


  public GetProductFieldResponse200Data activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether or not the product field is currently active
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field is currently active")
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


  public GetProductFieldResponse200Data editFlag(Boolean editFlag) {
    
    this.editFlag = editFlag;
    return this;
  }

   /**
   * Whether or not the product field name and metadata is editable
   * @return editFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field name and metadata is editable")
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


  public GetProductFieldResponse200Data addVisibleFlag(Boolean addVisibleFlag) {
    
    this.addVisibleFlag = addVisibleFlag;
    return this;
  }

   /**
   * Whether or not the product field is visible in the Add Product Modal
   * @return addVisibleFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field is visible in the Add Product Modal")
  @JsonProperty(JSON_PROPERTY_ADD_VISIBLE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddVisibleFlag() {
    return addVisibleFlag;
  }


  @JsonProperty(JSON_PROPERTY_ADD_VISIBLE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddVisibleFlag(Boolean addVisibleFlag) {
    this.addVisibleFlag = addVisibleFlag;
  }


  public GetProductFieldResponse200Data importantFlag(Boolean importantFlag) {
    
    this.importantFlag = importantFlag;
    return this;
  }

   /**
   * Whether or not the product field is marked as important
   * @return importantFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field is marked as important")
  @JsonProperty(JSON_PROPERTY_IMPORTANT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportantFlag() {
    return importantFlag;
  }


  @JsonProperty(JSON_PROPERTY_IMPORTANT_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportantFlag(Boolean importantFlag) {
    this.importantFlag = importantFlag;
  }


  public GetProductFieldResponse200Data bulkEditAllowed(Boolean bulkEditAllowed) {
    
    this.bulkEditAllowed = bulkEditAllowed;
    return this;
  }

   /**
   * Whether or not the product field data can be edited
   * @return bulkEditAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field data can be edited")
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


  public GetProductFieldResponse200Data searchableFlag(Boolean searchableFlag) {
    
    this.searchableFlag = searchableFlag;
    return this;
  }

   /**
   * Whether or not the product field is searchable
   * @return searchableFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field is searchable")
  @JsonProperty(JSON_PROPERTY_SEARCHABLE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSearchableFlag() {
    return searchableFlag;
  }


  @JsonProperty(JSON_PROPERTY_SEARCHABLE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchableFlag(Boolean searchableFlag) {
    this.searchableFlag = searchableFlag;
  }


  public GetProductFieldResponse200Data filteringAllowed(Boolean filteringAllowed) {
    
    this.filteringAllowed = filteringAllowed;
    return this;
  }

   /**
   * Whether or not the product field value can be used when filtering searches
   * @return filteringAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field value can be used when filtering searches")
  @JsonProperty(JSON_PROPERTY_FILTERING_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilteringAllowed() {
    return filteringAllowed;
  }


  @JsonProperty(JSON_PROPERTY_FILTERING_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilteringAllowed(Boolean filteringAllowed) {
    this.filteringAllowed = filteringAllowed;
  }


  public GetProductFieldResponse200Data sortableFlag(Boolean sortableFlag) {
    
    this.sortableFlag = sortableFlag;
    return this;
  }

   /**
   * Whether or not the product field is sortable
   * @return sortableFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field is sortable")
  @JsonProperty(JSON_PROPERTY_SORTABLE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSortableFlag() {
    return sortableFlag;
  }


  @JsonProperty(JSON_PROPERTY_SORTABLE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortableFlag(Boolean sortableFlag) {
    this.sortableFlag = sortableFlag;
  }


  public GetProductFieldResponse200Data mandatoryFlag(Boolean mandatoryFlag) {
    
    this.mandatoryFlag = mandatoryFlag;
    return this;
  }

   /**
   * Whether or not the product field is mandatory when creating products
   * @return mandatoryFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the product field is mandatory when creating products")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductFieldResponse200Data getProductFieldResponse200Data = (GetProductFieldResponse200Data) o;
    return Objects.equals(this.name, getProductFieldResponse200Data.name) &&
        Objects.equals(this.options, getProductFieldResponse200Data.options) &&
        Objects.equals(this.fieldType, getProductFieldResponse200Data.fieldType) &&
        Objects.equals(this.id, getProductFieldResponse200Data.id) &&
        Objects.equals(this.key, getProductFieldResponse200Data.key) &&
        Objects.equals(this.orderNr, getProductFieldResponse200Data.orderNr) &&
        Objects.equals(this.addTime, getProductFieldResponse200Data.addTime) &&
        Objects.equals(this.updateTime, getProductFieldResponse200Data.updateTime) &&
        Objects.equals(this.lastUpdatedByUserId, getProductFieldResponse200Data.lastUpdatedByUserId) &&
        Objects.equals(this.activeFlag, getProductFieldResponse200Data.activeFlag) &&
        Objects.equals(this.editFlag, getProductFieldResponse200Data.editFlag) &&
        Objects.equals(this.addVisibleFlag, getProductFieldResponse200Data.addVisibleFlag) &&
        Objects.equals(this.importantFlag, getProductFieldResponse200Data.importantFlag) &&
        Objects.equals(this.bulkEditAllowed, getProductFieldResponse200Data.bulkEditAllowed) &&
        Objects.equals(this.searchableFlag, getProductFieldResponse200Data.searchableFlag) &&
        Objects.equals(this.filteringAllowed, getProductFieldResponse200Data.filteringAllowed) &&
        Objects.equals(this.sortableFlag, getProductFieldResponse200Data.sortableFlag) &&
        Objects.equals(this.mandatoryFlag, getProductFieldResponse200Data.mandatoryFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options, fieldType, id, key, orderNr, addTime, updateTime, lastUpdatedByUserId, activeFlag, editFlag, addVisibleFlag, importantFlag, bulkEditAllowed, searchableFlag, filteringAllowed, sortableFlag, mandatoryFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductFieldResponse200Data {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    lastUpdatedByUserId: ").append(toIndentedString(lastUpdatedByUserId)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
    sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
    sb.append("    importantFlag: ").append(toIndentedString(importantFlag)).append("\n");
    sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
    sb.append("    searchableFlag: ").append(toIndentedString(searchableFlag)).append("\n");
    sb.append("    filteringAllowed: ").append(toIndentedString(filteringAllowed)).append("\n");
    sb.append("    sortableFlag: ").append(toIndentedString(sortableFlag)).append("\n");
    sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
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

