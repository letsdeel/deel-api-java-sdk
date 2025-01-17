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
import org.openapitools.client.model.CreateContract201ResponseDataCustomFieldsInner;
import org.openapitools.client.model.GetContractById200ResponseDataClient;
import org.openapitools.client.model.GetContractById200ResponseDataCompensationDetails;
import org.openapitools.client.model.GetContractById200ResponseDataContractTemplate;
import org.openapitools.client.model.GetContractById200ResponseDataEmploymentDetails;
import org.openapitools.client.model.GetContractById200ResponseDataInvitations;
import org.openapitools.client.model.GetContractById200ResponseDataQuote;
import org.openapitools.client.model.GetContractById200ResponseDataSeniority;
import org.openapitools.client.model.GetContractById200ResponseDataSignatures;
import org.openapitools.client.model.GetContractById200ResponseDataWorker;
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
 * GetContractById200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  /**
   * Type of a contract.
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
  private GetContractById200ResponseDataQuote quote;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nullable
  private GetContractById200ResponseDataClient client;

  /**
   * Status of a contract in Deel workflow.
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
  private GetContractById200ResponseDataWorker worker;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nullable
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private GetContractById200ResponseDataSeniority seniority;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  @javax.annotation.Nonnull
  private GetContractById200ResponseDataSignatures signatures;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  @javax.annotation.Nonnull
  private GetContractById200ResponseDataInvitations invitations;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  @javax.annotation.Nullable
  private Boolean isArchived;

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  @javax.annotation.Nullable
  private String whoReports;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  @javax.annotation.Nullable
  private List<CreateContract201ResponseDataCustomFieldsInner> customFields;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod;

  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  @javax.annotation.Nullable
  private String scopeOfWork;

  public static final String SERIALIZED_NAME_SPECIAL_CLAUSE = "special_clause";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CLAUSE)
  @javax.annotation.Nullable
  private String specialClause;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  @javax.annotation.Nullable
  private String terminationDate;

  public static final String SERIALIZED_NAME_CONTRACT_TEMPLATE = "contract_template";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TEMPLATE)
  @javax.annotation.Nullable
  private GetContractById200ResponseDataContractTemplate contractTemplate;

  public static final String SERIALIZED_NAME_EMPLOYMENT_DETAILS = "employment_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_DETAILS)
  @javax.annotation.Nonnull
  private GetContractById200ResponseDataEmploymentDetails employmentDetails;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private GetContractById200ResponseDataCompensationDetails compensationDetails;

  public GetContractById200ResponseData() {
  }

  public GetContractById200ResponseData id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the contract.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public GetContractById200ResponseData type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of a contract.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public GetContractById200ResponseData quote(@javax.annotation.Nullable GetContractById200ResponseDataQuote quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataQuote getQuote() {
    return quote;
  }

  public void setQuote(@javax.annotation.Nullable GetContractById200ResponseDataQuote quote) {
    this.quote = quote;
  }


  public GetContractById200ResponseData title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the contract.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public GetContractById200ResponseData client(@javax.annotation.Nullable GetContractById200ResponseDataClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nullable GetContractById200ResponseDataClient client) {
    this.client = client;
  }


  public GetContractById200ResponseData status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a contract in Deel workflow.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public GetContractById200ResponseData worker(@javax.annotation.Nullable GetContractById200ResponseDataWorker worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataWorker getWorker() {
    return worker;
  }

  public void setWorker(@javax.annotation.Nullable GetContractById200ResponseDataWorker worker) {
    this.worker = worker;
  }


  public GetContractById200ResponseData jobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Job title associated with the contract.
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public GetContractById200ResponseData seniority(@javax.annotation.Nullable GetContractById200ResponseDataSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable GetContractById200ResponseDataSeniority seniority) {
    this.seniority = seniority;
  }


  public GetContractById200ResponseData createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time when the contract was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetContractById200ResponseData signatures(@javax.annotation.Nonnull GetContractById200ResponseDataSignatures signatures) {
    this.signatures = signatures;
    return this;
  }

  /**
   * Get signatures
   * @return signatures
   */
  @javax.annotation.Nonnull
  public GetContractById200ResponseDataSignatures getSignatures() {
    return signatures;
  }

  public void setSignatures(@javax.annotation.Nonnull GetContractById200ResponseDataSignatures signatures) {
    this.signatures = signatures;
  }


  public GetContractById200ResponseData startDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date and time when the contract starts.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public GetContractById200ResponseData externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External identifier of the contract.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public GetContractById200ResponseData invitations(@javax.annotation.Nonnull GetContractById200ResponseDataInvitations invitations) {
    this.invitations = invitations;
    return this;
  }

  /**
   * Get invitations
   * @return invitations
   */
  @javax.annotation.Nonnull
  public GetContractById200ResponseDataInvitations getInvitations() {
    return invitations;
  }

  public void setInvitations(@javax.annotation.Nonnull GetContractById200ResponseDataInvitations invitations) {
    this.invitations = invitations;
  }


  public GetContractById200ResponseData isArchived(@javax.annotation.Nullable Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Flag to indicate if the contract is archived.
   * @return isArchived
   */
  @javax.annotation.Nullable
  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(@javax.annotation.Nullable Boolean isArchived) {
    this.isArchived = isArchived;
  }


  public GetContractById200ResponseData whoReports(@javax.annotation.Nullable String whoReports) {
    this.whoReports = whoReports;
    return this;
  }

  /**
   * Who reports the hours.
   * @return whoReports
   */
  @javax.annotation.Nullable
  public String getWhoReports() {
    return whoReports;
  }

  public void setWhoReports(@javax.annotation.Nullable String whoReports) {
    this.whoReports = whoReports;
  }


  public GetContractById200ResponseData customFields(@javax.annotation.Nullable List<CreateContract201ResponseDataCustomFieldsInner> customFields) {
    this.customFields = customFields;
    return this;
  }

  public GetContractById200ResponseData addCustomFieldsItem(CreateContract201ResponseDataCustomFieldsInner customFieldsItem) {
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


  public GetContractById200ResponseData noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
    return this;
  }

  /**
   * Notice period in days.
   * @return noticePeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getNoticePeriod() {
    return noticePeriod;
  }

  public void setNoticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
  }


  public GetContractById200ResponseData scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

  /**
   * Scope of work of the contract.
   * @return scopeOfWork
   */
  @javax.annotation.Nullable
  public String getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }


  public GetContractById200ResponseData specialClause(@javax.annotation.Nullable String specialClause) {
    this.specialClause = specialClause;
    return this;
  }

  /**
   * Special clause of the contract.
   * @return specialClause
   */
  @javax.annotation.Nullable
  public String getSpecialClause() {
    return specialClause;
  }

  public void setSpecialClause(@javax.annotation.Nullable String specialClause) {
    this.specialClause = specialClause;
  }


  public GetContractById200ResponseData terminationDate(@javax.annotation.Nullable String terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Date and time when the contract ends.
   * @return terminationDate
   */
  @javax.annotation.Nullable
  public String getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(@javax.annotation.Nullable String terminationDate) {
    this.terminationDate = terminationDate;
  }


  public GetContractById200ResponseData contractTemplate(@javax.annotation.Nullable GetContractById200ResponseDataContractTemplate contractTemplate) {
    this.contractTemplate = contractTemplate;
    return this;
  }

  /**
   * Get contractTemplate
   * @return contractTemplate
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataContractTemplate getContractTemplate() {
    return contractTemplate;
  }

  public void setContractTemplate(@javax.annotation.Nullable GetContractById200ResponseDataContractTemplate contractTemplate) {
    this.contractTemplate = contractTemplate;
  }


  public GetContractById200ResponseData employmentDetails(@javax.annotation.Nonnull GetContractById200ResponseDataEmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
    return this;
  }

  /**
   * Get employmentDetails
   * @return employmentDetails
   */
  @javax.annotation.Nonnull
  public GetContractById200ResponseDataEmploymentDetails getEmploymentDetails() {
    return employmentDetails;
  }

  public void setEmploymentDetails(@javax.annotation.Nonnull GetContractById200ResponseDataEmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
  }


  public GetContractById200ResponseData compensationDetails(@javax.annotation.Nonnull GetContractById200ResponseDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public GetContractById200ResponseDataCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull GetContractById200ResponseDataCompensationDetails compensationDetails) {
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
    GetContractById200ResponseData getContractById200ResponseData = (GetContractById200ResponseData) o;
    return Objects.equals(this.id, getContractById200ResponseData.id) &&
        Objects.equals(this.type, getContractById200ResponseData.type) &&
        Objects.equals(this.quote, getContractById200ResponseData.quote) &&
        Objects.equals(this.title, getContractById200ResponseData.title) &&
        Objects.equals(this.client, getContractById200ResponseData.client) &&
        Objects.equals(this.status, getContractById200ResponseData.status) &&
        Objects.equals(this.worker, getContractById200ResponseData.worker) &&
        Objects.equals(this.jobTitle, getContractById200ResponseData.jobTitle) &&
        Objects.equals(this.seniority, getContractById200ResponseData.seniority) &&
        Objects.equals(this.createdAt, getContractById200ResponseData.createdAt) &&
        Objects.equals(this.signatures, getContractById200ResponseData.signatures) &&
        Objects.equals(this.startDate, getContractById200ResponseData.startDate) &&
        Objects.equals(this.externalId, getContractById200ResponseData.externalId) &&
        Objects.equals(this.invitations, getContractById200ResponseData.invitations) &&
        Objects.equals(this.isArchived, getContractById200ResponseData.isArchived) &&
        Objects.equals(this.whoReports, getContractById200ResponseData.whoReports) &&
        Objects.equals(this.customFields, getContractById200ResponseData.customFields) &&
        Objects.equals(this.noticePeriod, getContractById200ResponseData.noticePeriod) &&
        Objects.equals(this.scopeOfWork, getContractById200ResponseData.scopeOfWork) &&
        Objects.equals(this.specialClause, getContractById200ResponseData.specialClause) &&
        Objects.equals(this.terminationDate, getContractById200ResponseData.terminationDate) &&
        Objects.equals(this.contractTemplate, getContractById200ResponseData.contractTemplate) &&
        Objects.equals(this.employmentDetails, getContractById200ResponseData.employmentDetails) &&
        Objects.equals(this.compensationDetails, getContractById200ResponseData.compensationDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, quote, title, client, status, worker, jobTitle, seniority, createdAt, signatures, startDate, externalId, invitations, isArchived, whoReports, customFields, noticePeriod, scopeOfWork, specialClause, terminationDate, contractTemplate, employmentDetails, compensationDetails);
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
    sb.append("class GetContractById200ResponseData {\n");
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
    sb.append("    contractTemplate: ").append(toIndentedString(contractTemplate)).append("\n");
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
    openapiFields.add("contract_template");
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
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseData is not found in the empty JSON string", GetContractById200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetContractById200ResponseData.openapiRequiredFields) {
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
        GetContractById200ResponseDataQuote.validateJsonElement(jsonObj.get("quote"));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `client`
      GetContractById200ResponseDataClient.validateJsonElement(jsonObj.get("client"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the required field `worker`
      GetContractById200ResponseDataWorker.validateJsonElement(jsonObj.get("worker"));
      if ((jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) && !jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the optional field `seniority`
      if (jsonObj.get("seniority") != null && !jsonObj.get("seniority").isJsonNull()) {
        GetContractById200ResponseDataSeniority.validateJsonElement(jsonObj.get("seniority"));
      }
      // validate the required field `signatures`
      GetContractById200ResponseDataSignatures.validateJsonElement(jsonObj.get("signatures"));
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the required field `invitations`
      GetContractById200ResponseDataInvitations.validateJsonElement(jsonObj.get("invitations"));
      if ((jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) && !jsonObj.get("who_reports").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `who_reports` to be a primitive type in the JSON string but got `%s`", jsonObj.get("who_reports").toString()));
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
      if ((jsonObj.get("special_clause") != null && !jsonObj.get("special_clause").isJsonNull()) && !jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      if ((jsonObj.get("termination_date") != null && !jsonObj.get("termination_date").isJsonNull()) && !jsonObj.get("termination_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termination_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termination_date").toString()));
      }
      // validate the optional field `contract_template`
      if (jsonObj.get("contract_template") != null && !jsonObj.get("contract_template").isJsonNull()) {
        GetContractById200ResponseDataContractTemplate.validateJsonElement(jsonObj.get("contract_template"));
      }
      // validate the required field `employment_details`
      GetContractById200ResponseDataEmploymentDetails.validateJsonElement(jsonObj.get("employment_details"));
      // validate the required field `compensation_details`
      GetContractById200ResponseDataCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseData
   */
  public static GetContractById200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseData.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

