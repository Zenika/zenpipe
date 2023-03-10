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
import com.zenika.pipedrive.model.SearchLeadsResponse200AllOfDataItemsInnerItemOrganization;
import com.zenika.pipedrive.model.SearchLeadsResponse200AllOfDataItemsInnerItemOwner;
import com.zenika.pipedrive.model.SearchLeadsResponse200AllOfDataItemsInnerItemPerson;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SearchLeadsResponse200AllOfDataItemsInnerItem
 */
@JsonPropertyOrder({
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_ID,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_TYPE,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_TITLE,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_OWNER,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_PERSON,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_ORGANIZATION,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_PHONES,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_EMAILS,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_CUSTOM_FIELDS,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_NOTES,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_VALUE,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_CURRENCY,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_VISIBLE_TO,
  SearchLeadsResponse200AllOfDataItemsInnerItem.JSON_PROPERTY_IS_ARCHIVED
})
@JsonTypeName("searchLeadsResponse200_allOf_data_items_inner_item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class SearchLeadsResponse200AllOfDataItemsInnerItem {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private SearchLeadsResponse200AllOfDataItemsInnerItemOwner owner;

  public static final String JSON_PROPERTY_PERSON = "person";
  private SearchLeadsResponse200AllOfDataItemsInnerItemPerson person;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private SearchLeadsResponse200AllOfDataItemsInnerItemOrganization organization;

  public static final String JSON_PROPERTY_PHONES = "phones";
  private List<String> phones = null;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private List<String> customFields = null;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private List<String> notes = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_VISIBLE_TO = "visible_to";
  private Integer visibleTo;

  public static final String JSON_PROPERTY_IS_ARCHIVED = "is_archived";
  private Boolean isArchived;

  public SearchLeadsResponse200AllOfDataItemsInnerItem() {
  }

  public SearchLeadsResponse200AllOfDataItemsInnerItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the lead
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the lead")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the item
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the item")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the lead
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the lead")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem owner(SearchLeadsResponse200AllOfDataItemsInnerItemOwner owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchLeadsResponse200AllOfDataItemsInnerItemOwner getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(SearchLeadsResponse200AllOfDataItemsInnerItemOwner owner) {
    this.owner = owner;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem person(SearchLeadsResponse200AllOfDataItemsInnerItemPerson person) {
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchLeadsResponse200AllOfDataItemsInnerItemPerson getPerson() {
    return person;
  }


  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerson(SearchLeadsResponse200AllOfDataItemsInnerItemPerson person) {
    this.person = person;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem organization(SearchLeadsResponse200AllOfDataItemsInnerItemOrganization organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchLeadsResponse200AllOfDataItemsInnerItemOrganization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(SearchLeadsResponse200AllOfDataItemsInnerItemOrganization organization) {
    this.organization = organization;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem phones(List<String> phones) {
    
    this.phones = phones;
    return this;
  }

  public SearchLeadsResponse200AllOfDataItemsInnerItem addPhonesItem(String phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Get phones
   * @return phones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPhones() {
    return phones;
  }


  @JsonProperty(JSON_PROPERTY_PHONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhones(List<String> phones) {
    this.phones = phones;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public SearchLeadsResponse200AllOfDataItemsInnerItem addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem customFields(List<String> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public SearchLeadsResponse200AllOfDataItemsInnerItem addCustomFieldsItem(String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Custom fields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom fields")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<String> customFields) {
    this.customFields = customFields;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem notes(List<String> notes) {
    
    this.notes = notes;
    return this;
  }

  public SearchLeadsResponse200AllOfDataItemsInnerItem addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * An array of notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of notes")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the lead
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the lead")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Integer value) {
    this.value = value;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the lead
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency of the lead")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem visibleTo(Integer visibleTo) {
    
    this.visibleTo = visibleTo;
    return this;
  }

   /**
   * The visibility of the lead
   * @return visibleTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The visibility of the lead")
  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVisibleTo() {
    return visibleTo;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleTo(Integer visibleTo) {
    this.visibleTo = visibleTo;
  }


  public SearchLeadsResponse200AllOfDataItemsInnerItem isArchived(Boolean isArchived) {
    
    this.isArchived = isArchived;
    return this;
  }

   /**
   * A flag indicating whether the lead is archived or not
   * @return isArchived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the lead is archived or not")
  @JsonProperty(JSON_PROPERTY_IS_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsArchived() {
    return isArchived;
  }


  @JsonProperty(JSON_PROPERTY_IS_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLeadsResponse200AllOfDataItemsInnerItem searchLeadsResponse200AllOfDataItemsInnerItem = (SearchLeadsResponse200AllOfDataItemsInnerItem) o;
    return Objects.equals(this.id, searchLeadsResponse200AllOfDataItemsInnerItem.id) &&
        Objects.equals(this.type, searchLeadsResponse200AllOfDataItemsInnerItem.type) &&
        Objects.equals(this.title, searchLeadsResponse200AllOfDataItemsInnerItem.title) &&
        Objects.equals(this.owner, searchLeadsResponse200AllOfDataItemsInnerItem.owner) &&
        Objects.equals(this.person, searchLeadsResponse200AllOfDataItemsInnerItem.person) &&
        Objects.equals(this.organization, searchLeadsResponse200AllOfDataItemsInnerItem.organization) &&
        Objects.equals(this.phones, searchLeadsResponse200AllOfDataItemsInnerItem.phones) &&
        Objects.equals(this.emails, searchLeadsResponse200AllOfDataItemsInnerItem.emails) &&
        Objects.equals(this.customFields, searchLeadsResponse200AllOfDataItemsInnerItem.customFields) &&
        Objects.equals(this.notes, searchLeadsResponse200AllOfDataItemsInnerItem.notes) &&
        Objects.equals(this.value, searchLeadsResponse200AllOfDataItemsInnerItem.value) &&
        Objects.equals(this.currency, searchLeadsResponse200AllOfDataItemsInnerItem.currency) &&
        Objects.equals(this.visibleTo, searchLeadsResponse200AllOfDataItemsInnerItem.visibleTo) &&
        Objects.equals(this.isArchived, searchLeadsResponse200AllOfDataItemsInnerItem.isArchived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, title, owner, person, organization, phones, emails, customFields, notes, value, currency, visibleTo, isArchived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLeadsResponse200AllOfDataItemsInnerItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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

