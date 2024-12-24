/*
 * Deel REST API
 * Deel REST API
 *
 * The version of the OpenAPI document: 1.25.0
 * Contact: apiteam@deel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.CreateContract201ResponseDataClient;
import org.openapitools.client.model.CreateContract201ResponseDataCompensationDetails;
import org.openapitools.client.model.CreateContract201ResponseDataCustomFieldsInner;
import org.openapitools.client.model.CreateContract201ResponseDataEmploymentDetails;
import org.openapitools.client.model.CreateContract201ResponseDataInvitations;
import org.openapitools.client.model.CreateContract201ResponseDataQuote;
import org.openapitools.client.model.CreateContract201ResponseDataSeniority;
import org.openapitools.client.model.CreateContract201ResponseDataSignatures;
import org.openapitools.client.model.CreateContract201ResponseDataWorker;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateContract201ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  /**
   * Type of a contract
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONGOING_TIME_BASED("ongoing_time_based"),
    
    MILESTONES("milestones"),
    
    TIME_BASED("time_based"),
    
    PAY_AS_YOU_GO_TIME_BASED("pay_as_you_go_time_based"),
    
    COMMISSION("commission"),
    
    PAYG_MILESTONES("payg_milestones"),
    
    PAYG_TASKS("payg_tasks"),
    
    EOR("eor"),
    
    UNKNOWN("unknown"),
    
    EMPLOYEE("employee"),
    
    GLOBAL_PAYROLL("global_payroll"),
    
    SHIELD_MSA("shield_msa"),
    
    HRIS_DIRECT_EMPLOYEE("hris_direct_employee");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  @javax.annotation.Nullable
  private CreateContract201ResponseDataQuote quote;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nullable
  private CreateContract201ResponseDataClient client;

  /**
   * Status of a contract in Deel workflow
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("new"),
    
    UNDER_REVIEW("under_review"),
    
    WAITING_FOR_EMPLOYEE_CONTRACT("waiting_for_employee_contract"),
    
    WAITING_FOR_CLIENT_SIGN("waiting_for_client_sign"),
    
    PROCESSING_PAYMENT("processing_payment"),
    
    WAITING_FOR_CONTRACTOR_SIGN("waiting_for_contractor_sign"),
    
    WAITING_FOR_EOR_SIGN("waiting_for_eor_sign"),
    
    WAITING_FOR_EMPLOYEE_SIGN("waiting_for_employee_sign"),
    
    AWAITING_DEPOSIT_PAYMENT("awaiting_deposit_payment"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    USER_CANCELLED("user_cancelled"),
    
    REJECTED("rejected"),
    
    WAITING_FOR_CLIENT_PAYMENT("waiting_for_client_payment");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  @javax.annotation.Nullable
  private CreateContract201ResponseDataWorker worker;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private CreateContract201ResponseDataSeniority seniority;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  @javax.annotation.Nonnull
  private CreateContract201ResponseDataSignatures signatures;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  @javax.annotation.Nonnull
  private CreateContract201ResponseDataInvitations invitations;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  @javax.annotation.Nonnull
  private Boolean isArchived;

  /**
   * Flag to indicate who is supposed to provide regular reports
   */
  @JsonAdapter(WhoReportsEnum.Adapter.class)
  public enum WhoReportsEnum {
    BOTH("both"),
    
    CLIENT("client"),
    
    CONTRACTOR("contractor");

    private String value;

    WhoReportsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WhoReportsEnum fromValue(String value) {
      for (WhoReportsEnum b : WhoReportsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WhoReportsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WhoReportsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WhoReportsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WhoReportsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WhoReportsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  @javax.annotation.Nullable
  private WhoReportsEnum whoReports;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  @javax.annotation.Nullable
  private List<CreateContract201ResponseDataCustomFieldsInner> customFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod = new BigDecimal("0");

  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  @javax.annotation.Nullable
  private String scopeOfWork;

  public static final String SERIALIZED_NAME_SPECIAL_CLAUSE = "special_clause";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CLAUSE)
  @javax.annotation.Nonnull
  private String specialClause;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime terminationDate;

  public static final String SERIALIZED_NAME_EMPLOYMENT_DETAILS = "employment_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_DETAILS)
  @javax.annotation.Nonnull
  private CreateContract201ResponseDataEmploymentDetails employmentDetails;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private CreateContract201ResponseDataCompensationDetails compensationDetails;

  public CreateContract201ResponseData() {
  }

  public CreateContract201ResponseData id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The public UUID of the object
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public CreateContract201ResponseData type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of a contract
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public CreateContract201ResponseData quote(@javax.annotation.Nullable CreateContract201ResponseDataQuote quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nullable
  public CreateContract201ResponseDataQuote getQuote() {
    return quote;
  }

  public void setQuote(@javax.annotation.Nullable CreateContract201ResponseDataQuote quote) {
    this.quote = quote;
  }


  public CreateContract201ResponseData title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of a contract
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public CreateContract201ResponseData client(@javax.annotation.Nullable CreateContract201ResponseDataClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nullable
  public CreateContract201ResponseDataClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nullable CreateContract201ResponseDataClient client) {
    this.client = client;
  }


  public CreateContract201ResponseData status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a contract in Deel workflow
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public CreateContract201ResponseData worker(@javax.annotation.Nullable CreateContract201ResponseDataWorker worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
   */
  @javax.annotation.Nullable
  public CreateContract201ResponseDataWorker getWorker() {
    return worker;
  }

  public void setWorker(@javax.annotation.Nullable CreateContract201ResponseDataWorker worker) {
    this.worker = worker;
  }


  public CreateContract201ResponseData jobTitle(@javax.annotation.Nonnull String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  @javax.annotation.Nonnull
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nonnull String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public CreateContract201ResponseData seniority(@javax.annotation.Nullable CreateContract201ResponseDataSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nullable
  public CreateContract201ResponseDataSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable CreateContract201ResponseDataSeniority seniority) {
    this.seniority = seniority;
  }


  public CreateContract201ResponseData createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreateContract201ResponseData signatures(@javax.annotation.Nonnull CreateContract201ResponseDataSignatures signatures) {
    this.signatures = signatures;
    return this;
  }

  /**
   * Get signatures
   * @return signatures
   */
  @javax.annotation.Nonnull
  public CreateContract201ResponseDataSignatures getSignatures() {
    return signatures;
  }

  public void setSignatures(@javax.annotation.Nonnull CreateContract201ResponseDataSignatures signatures) {
    this.signatures = signatures;
  }


  public CreateContract201ResponseData startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return startDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CreateContract201ResponseData externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * A unique identifier for the object provided by an external system.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public CreateContract201ResponseData invitations(@javax.annotation.Nonnull CreateContract201ResponseDataInvitations invitations) {
    this.invitations = invitations;
    return this;
  }

  /**
   * Get invitations
   * @return invitations
   */
  @javax.annotation.Nonnull
  public CreateContract201ResponseDataInvitations getInvitations() {
    return invitations;
  }

  public void setInvitations(@javax.annotation.Nonnull CreateContract201ResponseDataInvitations invitations) {
    this.invitations = invitations;
  }


  public CreateContract201ResponseData isArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Flag to indicate if the contract is archived
   * @return isArchived
   */
  @javax.annotation.Nonnull
  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
  }


  public CreateContract201ResponseData whoReports(@javax.annotation.Nullable WhoReportsEnum whoReports) {
    this.whoReports = whoReports;
    return this;
  }

  /**
   * Flag to indicate who is supposed to provide regular reports
   * @return whoReports
   */
  @javax.annotation.Nullable
  public WhoReportsEnum getWhoReports() {
    return whoReports;
  }

  public void setWhoReports(@javax.annotation.Nullable WhoReportsEnum whoReports) {
    this.whoReports = whoReports;
  }


  public CreateContract201ResponseData customFields(@javax.annotation.Nullable List<CreateContract201ResponseDataCustomFieldsInner> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CreateContract201ResponseData addCustomFieldsItem(CreateContract201ResponseDataCustomFieldsInner customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Get customFields
   * @return customFields
   */
  @javax.annotation.Nullable
  public List<CreateContract201ResponseDataCustomFieldsInner> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(@javax.annotation.Nullable List<CreateContract201ResponseDataCustomFieldsInner> customFields) {
    this.customFields = customFields;
  }


  public CreateContract201ResponseData noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
    return this;
  }

  /**
   * Days before to notice the termination of contract for eather party.
   * minimum: 0
   * @return noticePeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getNoticePeriod() {
    return noticePeriod;
  }

  public void setNoticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
  }


  public CreateContract201ResponseData scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

  /**
   * Scope of work for the contract
   * @return scopeOfWork
   */
  @javax.annotation.Nullable
  public String getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }


  public CreateContract201ResponseData specialClause(@javax.annotation.Nonnull String specialClause) {
    this.specialClause = specialClause;
    return this;
  }

  /**
   * Special clause for the contract
   * @return specialClause
   */
  @javax.annotation.Nonnull
  public String getSpecialClause() {
    return specialClause;
  }

  public void setSpecialClause(@javax.annotation.Nonnull String specialClause) {
    this.specialClause = specialClause;
  }


  public CreateContract201ResponseData terminationDate(@javax.annotation.Nullable OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return terminationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(@javax.annotation.Nullable OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
  }


  public CreateContract201ResponseData employmentDetails(@javax.annotation.Nonnull CreateContract201ResponseDataEmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
    return this;
  }

  /**
   * Get employmentDetails
   * @return employmentDetails
   */
  @javax.annotation.Nonnull
  public CreateContract201ResponseDataEmploymentDetails getEmploymentDetails() {
    return employmentDetails;
  }

  public void setEmploymentDetails(@javax.annotation.Nonnull CreateContract201ResponseDataEmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
  }


  public CreateContract201ResponseData compensationDetails(@javax.annotation.Nonnull CreateContract201ResponseDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public CreateContract201ResponseDataCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull CreateContract201ResponseDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract201ResponseData createContract201ResponseData = (CreateContract201ResponseData) o;
    return Objects.equals(this.id, createContract201ResponseData.id) &&
        Objects.equals(this.type, createContract201ResponseData.type) &&
        Objects.equals(this.quote, createContract201ResponseData.quote) &&
        Objects.equals(this.title, createContract201ResponseData.title) &&
        Objects.equals(this.client, createContract201ResponseData.client) &&
        Objects.equals(this.status, createContract201ResponseData.status) &&
        Objects.equals(this.worker, createContract201ResponseData.worker) &&
        Objects.equals(this.jobTitle, createContract201ResponseData.jobTitle) &&
        Objects.equals(this.seniority, createContract201ResponseData.seniority) &&
        Objects.equals(this.createdAt, createContract201ResponseData.createdAt) &&
        Objects.equals(this.signatures, createContract201ResponseData.signatures) &&
        Objects.equals(this.startDate, createContract201ResponseData.startDate) &&
        Objects.equals(this.externalId, createContract201ResponseData.externalId) &&
        Objects.equals(this.invitations, createContract201ResponseData.invitations) &&
        Objects.equals(this.isArchived, createContract201ResponseData.isArchived) &&
        Objects.equals(this.whoReports, createContract201ResponseData.whoReports) &&
        Objects.equals(this.customFields, createContract201ResponseData.customFields) &&
        Objects.equals(this.noticePeriod, createContract201ResponseData.noticePeriod) &&
        Objects.equals(this.scopeOfWork, createContract201ResponseData.scopeOfWork) &&
        Objects.equals(this.specialClause, createContract201ResponseData.specialClause) &&
        Objects.equals(this.terminationDate, createContract201ResponseData.terminationDate) &&
        Objects.equals(this.employmentDetails, createContract201ResponseData.employmentDetails) &&
        Objects.equals(this.compensationDetails, createContract201ResponseData.compensationDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, quote, title, client, status, worker, jobTitle, seniority, createdAt, signatures, startDate, externalId, invitations, isArchived, whoReports, customFields, noticePeriod, scopeOfWork, specialClause, terminationDate, employmentDetails, compensationDetails);
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
    sb.append("class CreateContract201ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    specialClause: ").append(toIndentedString(specialClause)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    employmentDetails: ").append(toIndentedString(employmentDetails)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("quote");
    openapiFields.add("title");
    openapiFields.add("client");
    openapiFields.add("status");
    openapiFields.add("worker");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("created_at");
    openapiFields.add("signatures");
    openapiFields.add("start_date");
    openapiFields.add("external_id");
    openapiFields.add("invitations");
    openapiFields.add("is_archived");
    openapiFields.add("who_reports");
    openapiFields.add("custom_fields");
    openapiFields.add("notice_period");
    openapiFields.add("scope_of_work");
    openapiFields.add("special_clause");
    openapiFields.add("termination_date");
    openapiFields.add("employment_details");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("worker");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("seniority");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("signatures");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("invitations");
    openapiRequiredFields.add("is_archived");
    openapiRequiredFields.add("special_clause");
    openapiRequiredFields.add("termination_date");
    openapiRequiredFields.add("employment_details");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseData is not found in the empty JSON string", CreateContract201ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateContract201ResponseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the optional field `quote`
      if (jsonObj.get("quote") != null && !jsonObj.get("quote").isJsonNull()) {
        CreateContract201ResponseDataQuote.validateJsonElement(jsonObj.get("quote"));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `client`
      CreateContract201ResponseDataClient.validateJsonElement(jsonObj.get("client"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the required field `worker`
      CreateContract201ResponseDataWorker.validateJsonElement(jsonObj.get("worker"));
      if (!jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the required field `seniority`
      CreateContract201ResponseDataSeniority.validateJsonElement(jsonObj.get("seniority"));
      // validate the required field `signatures`
      CreateContract201ResponseDataSignatures.validateJsonElement(jsonObj.get("signatures"));
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the required field `invitations`
      CreateContract201ResponseDataInvitations.validateJsonElement(jsonObj.get("invitations"));
      if ((jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) && !jsonObj.get("who_reports").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `who_reports` to be a primitive type in the JSON string but got `%s`", jsonObj.get("who_reports").toString()));
      }
      // validate the optional field `who_reports`
      if (jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) {
        WhoReportsEnum.validateJsonElement(jsonObj.get("who_reports"));
      }
      if (jsonObj.get("custom_fields") != null && !jsonObj.get("custom_fields").isJsonNull()) {
        JsonArray jsonArraycustomFields = jsonObj.getAsJsonArray("custom_fields");
        if (jsonArraycustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_fields` to be an array in the JSON string but got `%s`", jsonObj.get("custom_fields").toString()));
          }

          // validate the optional field `custom_fields` (array)
          for (int i = 0; i < jsonArraycustomFields.size(); i++) {
            CreateContract201ResponseDataCustomFieldsInner.validateJsonElement(jsonArraycustomFields.get(i));
          };
        }
      }
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if (!jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      // validate the required field `employment_details`
      CreateContract201ResponseDataEmploymentDetails.validateJsonElement(jsonObj.get("employment_details"));
      // validate the required field `compensation_details`
      CreateContract201ResponseDataCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseData>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseData
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseData
   */
  public static CreateContract201ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseData.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

