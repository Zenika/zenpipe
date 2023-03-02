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
import com.zenika.pipedrive.model.GetCurrentUserResponse200AllOfDataAllOfLanguage;
import com.zenika.pipedrive.model.GetRecentsResponse200DataInnerAnyOf11DataAccessInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetCurrentUserResponse200AllOfData
 */
@JsonPropertyOrder({
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_ID,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_NAME,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_DEFAULT_CURRENCY,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_LOCALE,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_LANG,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_EMAIL,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_PHONE,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_ACTIVATED,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_LAST_LOGIN,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_CREATED,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_MODIFIED,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_HAS_CREATED_COMPANY,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_ACCESS,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_ACTIVE_FLAG,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_TIMEZONE_NAME,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_TIMEZONE_OFFSET,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_ROLE_ID,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_ICON_URL,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_IS_YOU,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_COMPANY_ID,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_COMPANY_NAME,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_COMPANY_DOMAIN,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_COMPANY_COUNTRY,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_COMPANY_INDUSTRY,
  GetCurrentUserResponse200AllOfData.JSON_PROPERTY_LANGUAGE
})
@JsonTypeName("getCurrentUserResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetCurrentUserResponse200AllOfData {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "default_currency";
  private String defaultCurrency;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_LANG = "lang";
  private Integer lang;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTIVATED = "activated";
  private Boolean activated;

  public static final String JSON_PROPERTY_LAST_LOGIN = "last_login";
  private String lastLogin;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private JsonNullable<String> modified = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_CREATED_COMPANY = "has_created_company";
  private Boolean hasCreatedCompany;

  public static final String JSON_PROPERTY_ACCESS = "access";
  private List<GetRecentsResponse200DataInnerAnyOf11DataAccessInner> access = null;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_TIMEZONE_NAME = "timezone_name";
  private String timezoneName;

  public static final String JSON_PROPERTY_TIMEZONE_OFFSET = "timezone_offset";
  private String timezoneOffset;

  public static final String JSON_PROPERTY_ROLE_ID = "role_id";
  private Integer roleId;

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private JsonNullable<String> iconUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_YOU = "is_you";
  private Boolean isYou;

  public static final String JSON_PROPERTY_COMPANY_ID = "company_id";
  private Integer companyId;

  public static final String JSON_PROPERTY_COMPANY_NAME = "company_name";
  private String companyName;

  public static final String JSON_PROPERTY_COMPANY_DOMAIN = "company_domain";
  private String companyDomain;

  public static final String JSON_PROPERTY_COMPANY_COUNTRY = "company_country";
  private String companyCountry;

  public static final String JSON_PROPERTY_COMPANY_INDUSTRY = "company_industry";
  private String companyIndustry;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private GetCurrentUserResponse200AllOfDataAllOfLanguage language;

  public GetCurrentUserResponse200AllOfData() {
  }

  public GetCurrentUserResponse200AllOfData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The user ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user ID")
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


  public GetCurrentUserResponse200AllOfData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The user name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user name")
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


  public GetCurrentUserResponse200AllOfData defaultCurrency(String defaultCurrency) {
    
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * The user default currency
   * @return defaultCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user default currency")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCurrency() {
    return defaultCurrency;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }


  public GetCurrentUserResponse200AllOfData locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * The user locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user locale")
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public GetCurrentUserResponse200AllOfData lang(Integer lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * The user language ID
   * @return lang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user language ID")
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLang(Integer lang) {
    this.lang = lang;
  }


  public GetCurrentUserResponse200AllOfData email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The user email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user email")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public GetCurrentUserResponse200AllOfData phone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
    
    return this;
  }

   /**
   * The user phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user phone")
  @JsonIgnore

  public String getPhone() {
        return phone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhone_JsonNullable() {
    return phone;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE)
  public void setPhone_JsonNullable(JsonNullable<String> phone) {
    this.phone = phone;
  }

  public void setPhone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }


  public GetCurrentUserResponse200AllOfData activated(Boolean activated) {
    
    this.activated = activated;
    return this;
  }

   /**
   * Boolean that indicates whether the user is activated
   * @return activated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean that indicates whether the user is activated")
  @JsonProperty(JSON_PROPERTY_ACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActivated() {
    return activated;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivated(Boolean activated) {
    this.activated = activated;
  }


  public GetCurrentUserResponse200AllOfData lastLogin(String lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * The last login date and time of the user. Format: YYYY-MM-DD HH:MM:SS
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last login date and time of the user. Format: YYYY-MM-DD HH:MM:SS")
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastLogin() {
    return lastLogin;
  }


  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  public GetCurrentUserResponse200AllOfData created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * The creation date and time of the user. Format: YYYY-MM-DD HH:MM:SS
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creation date and time of the user. Format: YYYY-MM-DD HH:MM:SS")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(String created) {
    this.created = created;
  }


  public GetCurrentUserResponse200AllOfData modified(String modified) {
    this.modified = JsonNullable.<String>of(modified);
    
    return this;
  }

   /**
   * The last modification date and time of the user. Format: YYYY-MM-DD HH:MM:SS
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last modification date and time of the user. Format: YYYY-MM-DD HH:MM:SS")
  @JsonIgnore

  public String getModified() {
        return modified.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getModified_JsonNullable() {
    return modified;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  public void setModified_JsonNullable(JsonNullable<String> modified) {
    this.modified = modified;
  }

  public void setModified(String modified) {
    this.modified = JsonNullable.<String>of(modified);
  }


  public GetCurrentUserResponse200AllOfData hasCreatedCompany(Boolean hasCreatedCompany) {
    
    this.hasCreatedCompany = hasCreatedCompany;
    return this;
  }

   /**
   * Boolean that indicates whether the user has created a company
   * @return hasCreatedCompany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean that indicates whether the user has created a company")
  @JsonProperty(JSON_PROPERTY_HAS_CREATED_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasCreatedCompany() {
    return hasCreatedCompany;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CREATED_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasCreatedCompany(Boolean hasCreatedCompany) {
    this.hasCreatedCompany = hasCreatedCompany;
  }


  public GetCurrentUserResponse200AllOfData access(List<GetRecentsResponse200DataInnerAnyOf11DataAccessInner> access) {
    
    this.access = access;
    return this;
  }

  public GetCurrentUserResponse200AllOfData addAccessItem(GetRecentsResponse200DataInnerAnyOf11DataAccessInner accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<>();
    }
    this.access.add(accessItem);
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetRecentsResponse200DataInnerAnyOf11DataAccessInner> getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(List<GetRecentsResponse200DataInnerAnyOf11DataAccessInner> access) {
    this.access = access;
  }


  public GetCurrentUserResponse200AllOfData activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Boolean that indicates whether the user is activated
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean that indicates whether the user is activated")
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


  public GetCurrentUserResponse200AllOfData timezoneName(String timezoneName) {
    
    this.timezoneName = timezoneName;
    return this;
  }

   /**
   * The user timezone name
   * @return timezoneName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user timezone name")
  @JsonProperty(JSON_PROPERTY_TIMEZONE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezoneName() {
    return timezoneName;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezoneName(String timezoneName) {
    this.timezoneName = timezoneName;
  }


  public GetCurrentUserResponse200AllOfData timezoneOffset(String timezoneOffset) {
    
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * The user timezone offset
   * @return timezoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user timezone offset")
  @JsonProperty(JSON_PROPERTY_TIMEZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezoneOffset() {
    return timezoneOffset;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }


  public GetCurrentUserResponse200AllOfData roleId(Integer roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * The ID of the user role
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user role")
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public GetCurrentUserResponse200AllOfData iconUrl(String iconUrl) {
    this.iconUrl = JsonNullable.<String>of(iconUrl);
    
    return this;
  }

   /**
   * The user icon URL
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user icon URL")
  @JsonIgnore

  public String getIconUrl() {
        return iconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIconUrl_JsonNullable() {
    return iconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  public void setIconUrl_JsonNullable(JsonNullable<String> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = JsonNullable.<String>of(iconUrl);
  }


  public GetCurrentUserResponse200AllOfData isYou(Boolean isYou) {
    
    this.isYou = isYou;
    return this;
  }

   /**
   * Boolean that indicates if the requested user is the same which is logged in (in this case, always true)
   * @return isYou
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean that indicates if the requested user is the same which is logged in (in this case, always true)")
  @JsonProperty(JSON_PROPERTY_IS_YOU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsYou() {
    return isYou;
  }


  @JsonProperty(JSON_PROPERTY_IS_YOU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsYou(Boolean isYou) {
    this.isYou = isYou;
  }


  public GetCurrentUserResponse200AllOfData companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * The user company ID
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user company ID")
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public GetCurrentUserResponse200AllOfData companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * The user company name
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user company name")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public GetCurrentUserResponse200AllOfData companyDomain(String companyDomain) {
    
    this.companyDomain = companyDomain;
    return this;
  }

   /**
   * The user company domain
   * @return companyDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user company domain")
  @JsonProperty(JSON_PROPERTY_COMPANY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyDomain() {
    return companyDomain;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyDomain(String companyDomain) {
    this.companyDomain = companyDomain;
  }


  public GetCurrentUserResponse200AllOfData companyCountry(String companyCountry) {
    
    this.companyCountry = companyCountry;
    return this;
  }

   /**
   * The user company country
   * @return companyCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user company country")
  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyCountry() {
    return companyCountry;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
  }


  public GetCurrentUserResponse200AllOfData companyIndustry(String companyIndustry) {
    
    this.companyIndustry = companyIndustry;
    return this;
  }

   /**
   * The user company industry
   * @return companyIndustry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user company industry")
  @JsonProperty(JSON_PROPERTY_COMPANY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyIndustry() {
    return companyIndustry;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyIndustry(String companyIndustry) {
    this.companyIndustry = companyIndustry;
  }


  public GetCurrentUserResponse200AllOfData language(GetCurrentUserResponse200AllOfDataAllOfLanguage language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetCurrentUserResponse200AllOfDataAllOfLanguage getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(GetCurrentUserResponse200AllOfDataAllOfLanguage language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCurrentUserResponse200AllOfData getCurrentUserResponse200AllOfData = (GetCurrentUserResponse200AllOfData) o;
    return Objects.equals(this.id, getCurrentUserResponse200AllOfData.id) &&
        Objects.equals(this.name, getCurrentUserResponse200AllOfData.name) &&
        Objects.equals(this.defaultCurrency, getCurrentUserResponse200AllOfData.defaultCurrency) &&
        Objects.equals(this.locale, getCurrentUserResponse200AllOfData.locale) &&
        Objects.equals(this.lang, getCurrentUserResponse200AllOfData.lang) &&
        Objects.equals(this.email, getCurrentUserResponse200AllOfData.email) &&
        equalsNullable(this.phone, getCurrentUserResponse200AllOfData.phone) &&
        Objects.equals(this.activated, getCurrentUserResponse200AllOfData.activated) &&
        Objects.equals(this.lastLogin, getCurrentUserResponse200AllOfData.lastLogin) &&
        Objects.equals(this.created, getCurrentUserResponse200AllOfData.created) &&
        equalsNullable(this.modified, getCurrentUserResponse200AllOfData.modified) &&
        Objects.equals(this.hasCreatedCompany, getCurrentUserResponse200AllOfData.hasCreatedCompany) &&
        Objects.equals(this.access, getCurrentUserResponse200AllOfData.access) &&
        Objects.equals(this.activeFlag, getCurrentUserResponse200AllOfData.activeFlag) &&
        Objects.equals(this.timezoneName, getCurrentUserResponse200AllOfData.timezoneName) &&
        Objects.equals(this.timezoneOffset, getCurrentUserResponse200AllOfData.timezoneOffset) &&
        Objects.equals(this.roleId, getCurrentUserResponse200AllOfData.roleId) &&
        equalsNullable(this.iconUrl, getCurrentUserResponse200AllOfData.iconUrl) &&
        Objects.equals(this.isYou, getCurrentUserResponse200AllOfData.isYou) &&
        Objects.equals(this.companyId, getCurrentUserResponse200AllOfData.companyId) &&
        Objects.equals(this.companyName, getCurrentUserResponse200AllOfData.companyName) &&
        Objects.equals(this.companyDomain, getCurrentUserResponse200AllOfData.companyDomain) &&
        Objects.equals(this.companyCountry, getCurrentUserResponse200AllOfData.companyCountry) &&
        Objects.equals(this.companyIndustry, getCurrentUserResponse200AllOfData.companyIndustry) &&
        Objects.equals(this.language, getCurrentUserResponse200AllOfData.language);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, defaultCurrency, locale, lang, email, hashCodeNullable(phone), activated, lastLogin, created, hashCodeNullable(modified), hasCreatedCompany, access, activeFlag, timezoneName, timezoneOffset, roleId, hashCodeNullable(iconUrl), isYou, companyId, companyName, companyDomain, companyCountry, companyIndustry, language);
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
    sb.append("class GetCurrentUserResponse200AllOfData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    hasCreatedCompany: ").append(toIndentedString(hasCreatedCompany)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    timezoneName: ").append(toIndentedString(timezoneName)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    isYou: ").append(toIndentedString(isYou)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDomain: ").append(toIndentedString(companyDomain)).append("\n");
    sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
    sb.append("    companyIndustry: ").append(toIndentedString(companyIndustry)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

