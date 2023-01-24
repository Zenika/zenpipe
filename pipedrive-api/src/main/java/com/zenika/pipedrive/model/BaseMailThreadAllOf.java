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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BaseMailThreadAllOf
 */
@JsonPropertyOrder({
  BaseMailThreadAllOf.JSON_PROPERTY_ID,
  BaseMailThreadAllOf.JSON_PROPERTY_ACCOUNT_ID,
  BaseMailThreadAllOf.JSON_PROPERTY_USER_ID,
  BaseMailThreadAllOf.JSON_PROPERTY_SUBJECT,
  BaseMailThreadAllOf.JSON_PROPERTY_SNIPPET,
  BaseMailThreadAllOf.JSON_PROPERTY_READ_FLAG,
  BaseMailThreadAllOf.JSON_PROPERTY_MAIL_TRACKING_STATUS,
  BaseMailThreadAllOf.JSON_PROPERTY_HAS_ATTACHMENTS_FLAG,
  BaseMailThreadAllOf.JSON_PROPERTY_HAS_INLINE_ATTACHMENTS_FLAG,
  BaseMailThreadAllOf.JSON_PROPERTY_HAS_REAL_ATTACHMENTS_FLAG,
  BaseMailThreadAllOf.JSON_PROPERTY_DELETED_FLAG,
  BaseMailThreadAllOf.JSON_PROPERTY_SYNCED_FLAG,
  BaseMailThreadAllOf.JSON_PROPERTY_SMART_BCC_FLAG,
  BaseMailThreadAllOf.JSON_PROPERTY_MAIL_LINK_TRACKING_ENABLED_FLAG
})
@JsonTypeName("baseMailThread_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class BaseMailThreadAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_SNIPPET = "snippet";
  private String snippet;

  /**
   * Gets or Sets readFlag
   */
  public enum ReadFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    ReadFlagEnum(BigDecimal value) {
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
    public static ReadFlagEnum fromValue(BigDecimal value) {
      for (ReadFlagEnum b : ReadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_READ_FLAG = "read_flag";
  private ReadFlagEnum readFlag = ReadFlagEnum.NUMBER_0;

  public static final String JSON_PROPERTY_MAIL_TRACKING_STATUS = "mail_tracking_status";
  private JsonNullable<String> mailTrackingStatus = JsonNullable.<String>undefined();

  /**
   * Gets or Sets hasAttachmentsFlag
   */
  public enum HasAttachmentsFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    HasAttachmentsFlagEnum(BigDecimal value) {
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
    public static HasAttachmentsFlagEnum fromValue(BigDecimal value) {
      for (HasAttachmentsFlagEnum b : HasAttachmentsFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HAS_ATTACHMENTS_FLAG = "has_attachments_flag";
  private HasAttachmentsFlagEnum hasAttachmentsFlag = HasAttachmentsFlagEnum.NUMBER_0;

  /**
   * Gets or Sets hasInlineAttachmentsFlag
   */
  public enum HasInlineAttachmentsFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    HasInlineAttachmentsFlagEnum(BigDecimal value) {
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
    public static HasInlineAttachmentsFlagEnum fromValue(BigDecimal value) {
      for (HasInlineAttachmentsFlagEnum b : HasInlineAttachmentsFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HAS_INLINE_ATTACHMENTS_FLAG = "has_inline_attachments_flag";
  private HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag = HasInlineAttachmentsFlagEnum.NUMBER_0;

  /**
   * Gets or Sets hasRealAttachmentsFlag
   */
  public enum HasRealAttachmentsFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    HasRealAttachmentsFlagEnum(BigDecimal value) {
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
    public static HasRealAttachmentsFlagEnum fromValue(BigDecimal value) {
      for (HasRealAttachmentsFlagEnum b : HasRealAttachmentsFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HAS_REAL_ATTACHMENTS_FLAG = "has_real_attachments_flag";
  private HasRealAttachmentsFlagEnum hasRealAttachmentsFlag = HasRealAttachmentsFlagEnum.NUMBER_0;

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
  private DeletedFlagEnum deletedFlag = DeletedFlagEnum.NUMBER_0;

  /**
   * Gets or Sets syncedFlag
   */
  public enum SyncedFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    SyncedFlagEnum(BigDecimal value) {
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
    public static SyncedFlagEnum fromValue(BigDecimal value) {
      for (SyncedFlagEnum b : SyncedFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SYNCED_FLAG = "synced_flag";
  private SyncedFlagEnum syncedFlag = SyncedFlagEnum.NUMBER_0;

  /**
   * Gets or Sets smartBccFlag
   */
  public enum SmartBccFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    SmartBccFlagEnum(BigDecimal value) {
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
    public static SmartBccFlagEnum fromValue(BigDecimal value) {
      for (SmartBccFlagEnum b : SmartBccFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SMART_BCC_FLAG = "smart_bcc_flag";
  private SmartBccFlagEnum smartBccFlag = SmartBccFlagEnum.NUMBER_0;

  /**
   * Gets or Sets mailLinkTrackingEnabledFlag
   */
  public enum MailLinkTrackingEnabledFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    MailLinkTrackingEnabledFlagEnum(BigDecimal value) {
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
    public static MailLinkTrackingEnabledFlagEnum fromValue(BigDecimal value) {
      for (MailLinkTrackingEnabledFlagEnum b : MailLinkTrackingEnabledFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MAIL_LINK_TRACKING_ENABLED_FLAG = "mail_link_tracking_enabled_flag";
  private MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag = MailLinkTrackingEnabledFlagEnum.NUMBER_0;

  public BaseMailThreadAllOf() {
  }

  public BaseMailThreadAllOf id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the mail thread
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the mail thread")
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


  public BaseMailThreadAllOf accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The connection account ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The connection account ID")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public BaseMailThreadAllOf userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user whom mail message will be assigned to
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the user whom mail message will be assigned to")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public BaseMailThreadAllOf subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public BaseMailThreadAllOf snippet(String snippet) {
    
    this.snippet = snippet;
    return this;
  }

   /**
   * A snippet
   * @return snippet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A snippet")
  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnippet() {
    return snippet;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public BaseMailThreadAllOf readFlag(ReadFlagEnum readFlag) {
    
    this.readFlag = readFlag;
    return this;
  }

   /**
   * Get readFlag
   * @return readFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_READ_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReadFlagEnum getReadFlag() {
    return readFlag;
  }


  @JsonProperty(JSON_PROPERTY_READ_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadFlag(ReadFlagEnum readFlag) {
    this.readFlag = readFlag;
  }


  public BaseMailThreadAllOf mailTrackingStatus(String mailTrackingStatus) {
    this.mailTrackingStatus = JsonNullable.<String>of(mailTrackingStatus);
    
    return this;
  }

   /**
   * Mail tracking status
   * @return mailTrackingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mail tracking status")
  @JsonIgnore

  public String getMailTrackingStatus() {
        return mailTrackingStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAIL_TRACKING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMailTrackingStatus_JsonNullable() {
    return mailTrackingStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_MAIL_TRACKING_STATUS)
  public void setMailTrackingStatus_JsonNullable(JsonNullable<String> mailTrackingStatus) {
    this.mailTrackingStatus = mailTrackingStatus;
  }

  public void setMailTrackingStatus(String mailTrackingStatus) {
    this.mailTrackingStatus = JsonNullable.<String>of(mailTrackingStatus);
  }


  public BaseMailThreadAllOf hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
    
    this.hasAttachmentsFlag = hasAttachmentsFlag;
    return this;
  }

   /**
   * Get hasAttachmentsFlag
   * @return hasAttachmentsFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_ATTACHMENTS_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HasAttachmentsFlagEnum getHasAttachmentsFlag() {
    return hasAttachmentsFlag;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ATTACHMENTS_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
    this.hasAttachmentsFlag = hasAttachmentsFlag;
  }


  public BaseMailThreadAllOf hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
    
    this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
    return this;
  }

   /**
   * Get hasInlineAttachmentsFlag
   * @return hasInlineAttachmentsFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_INLINE_ATTACHMENTS_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HasInlineAttachmentsFlagEnum getHasInlineAttachmentsFlag() {
    return hasInlineAttachmentsFlag;
  }


  @JsonProperty(JSON_PROPERTY_HAS_INLINE_ATTACHMENTS_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
    this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
  }


  public BaseMailThreadAllOf hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
    
    this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
    return this;
  }

   /**
   * Get hasRealAttachmentsFlag
   * @return hasRealAttachmentsFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_REAL_ATTACHMENTS_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HasRealAttachmentsFlagEnum getHasRealAttachmentsFlag() {
    return hasRealAttachmentsFlag;
  }


  @JsonProperty(JSON_PROPERTY_HAS_REAL_ATTACHMENTS_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
    this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
  }


  public BaseMailThreadAllOf deletedFlag(DeletedFlagEnum deletedFlag) {
    
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


  public BaseMailThreadAllOf syncedFlag(SyncedFlagEnum syncedFlag) {
    
    this.syncedFlag = syncedFlag;
    return this;
  }

   /**
   * Get syncedFlag
   * @return syncedFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYNCED_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyncedFlagEnum getSyncedFlag() {
    return syncedFlag;
  }


  @JsonProperty(JSON_PROPERTY_SYNCED_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncedFlag(SyncedFlagEnum syncedFlag) {
    this.syncedFlag = syncedFlag;
  }


  public BaseMailThreadAllOf smartBccFlag(SmartBccFlagEnum smartBccFlag) {
    
    this.smartBccFlag = smartBccFlag;
    return this;
  }

   /**
   * Get smartBccFlag
   * @return smartBccFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMART_BCC_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SmartBccFlagEnum getSmartBccFlag() {
    return smartBccFlag;
  }


  @JsonProperty(JSON_PROPERTY_SMART_BCC_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartBccFlag(SmartBccFlagEnum smartBccFlag) {
    this.smartBccFlag = smartBccFlag;
  }


  public BaseMailThreadAllOf mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
    
    this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
    return this;
  }

   /**
   * Get mailLinkTrackingEnabledFlag
   * @return mailLinkTrackingEnabledFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAIL_LINK_TRACKING_ENABLED_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MailLinkTrackingEnabledFlagEnum getMailLinkTrackingEnabledFlag() {
    return mailLinkTrackingEnabledFlag;
  }


  @JsonProperty(JSON_PROPERTY_MAIL_LINK_TRACKING_ENABLED_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
    this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseMailThreadAllOf baseMailThreadAllOf = (BaseMailThreadAllOf) o;
    return Objects.equals(this.id, baseMailThreadAllOf.id) &&
        Objects.equals(this.accountId, baseMailThreadAllOf.accountId) &&
        Objects.equals(this.userId, baseMailThreadAllOf.userId) &&
        Objects.equals(this.subject, baseMailThreadAllOf.subject) &&
        Objects.equals(this.snippet, baseMailThreadAllOf.snippet) &&
        Objects.equals(this.readFlag, baseMailThreadAllOf.readFlag) &&
        equalsNullable(this.mailTrackingStatus, baseMailThreadAllOf.mailTrackingStatus) &&
        Objects.equals(this.hasAttachmentsFlag, baseMailThreadAllOf.hasAttachmentsFlag) &&
        Objects.equals(this.hasInlineAttachmentsFlag, baseMailThreadAllOf.hasInlineAttachmentsFlag) &&
        Objects.equals(this.hasRealAttachmentsFlag, baseMailThreadAllOf.hasRealAttachmentsFlag) &&
        Objects.equals(this.deletedFlag, baseMailThreadAllOf.deletedFlag) &&
        Objects.equals(this.syncedFlag, baseMailThreadAllOf.syncedFlag) &&
        Objects.equals(this.smartBccFlag, baseMailThreadAllOf.smartBccFlag) &&
        Objects.equals(this.mailLinkTrackingEnabledFlag, baseMailThreadAllOf.mailLinkTrackingEnabledFlag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, userId, subject, snippet, readFlag, hashCodeNullable(mailTrackingStatus), hasAttachmentsFlag, hasInlineAttachmentsFlag, hasRealAttachmentsFlag, deletedFlag, syncedFlag, smartBccFlag, mailLinkTrackingEnabledFlag);
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
    sb.append("class BaseMailThreadAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    readFlag: ").append(toIndentedString(readFlag)).append("\n");
    sb.append("    mailTrackingStatus: ").append(toIndentedString(mailTrackingStatus)).append("\n");
    sb.append("    hasAttachmentsFlag: ").append(toIndentedString(hasAttachmentsFlag)).append("\n");
    sb.append("    hasInlineAttachmentsFlag: ").append(toIndentedString(hasInlineAttachmentsFlag)).append("\n");
    sb.append("    hasRealAttachmentsFlag: ").append(toIndentedString(hasRealAttachmentsFlag)).append("\n");
    sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
    sb.append("    syncedFlag: ").append(toIndentedString(syncedFlag)).append("\n");
    sb.append("    smartBccFlag: ").append(toIndentedString(smartBccFlag)).append("\n");
    sb.append("    mailLinkTrackingEnabledFlag: ").append(toIndentedString(mailLinkTrackingEnabledFlag)).append("\n");
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
