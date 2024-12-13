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
import org.openapitools.client.model.ClientOfContract;
import org.openapitools.client.model.CompensationDetailsOfContract;
import org.openapitools.client.model.ContractCustomField;
import org.openapitools.client.model.ContractStatusEnum;
import org.openapitools.client.model.ContractTemplate;
import org.openapitools.client.model.ContractTypeEnum;
import org.openapitools.client.model.ContractWhoReportsEnum;
import org.openapitools.client.model.EmploymentDetailsOfContract;
import org.openapitools.client.model.EorQuoteBase;
import org.openapitools.client.model.InvitationsOfBasicContract;
import org.openapitools.client.model.Seniority;
import org.openapitools.client.model.SignaturesOfContract;
import org.openapitools.client.model.WorkerOfContract;
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
 * Contract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class Contract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private ContractTypeEnum type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ContractStatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nullable
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private Seniority seniority;

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  @javax.annotation.Nullable
  private ContractWhoReportsEnum whoReports;

  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  @javax.annotation.Nullable
  private String scopeOfWork;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime terminationDate;

  public static final String SERIALIZED_NAME_SPECIAL_CLAUSE = "special_clause";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CLAUSE)
  @javax.annotation.Nonnull
  private String specialClause;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  @javax.annotation.Nonnull
  private Boolean isArchived;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nullable
  private ClientOfContract client;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  @javax.annotation.Nullable
  private WorkerOfContract worker;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  @javax.annotation.Nonnull
  private InvitationsOfBasicContract invitations;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  @javax.annotation.Nonnull
  private SignaturesOfContract signatures;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private CompensationDetailsOfContract compensationDetails;

  public static final String SERIALIZED_NAME_EMPLOYMENT_DETAILS = "employment_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_DETAILS)
  @javax.annotation.Nonnull
  private EmploymentDetailsOfContract employmentDetails;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod = new BigDecimal("0");

  public static final String SERIALIZED_NAME_CONTRACT_TEMPLATE = "contract_template";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TEMPLATE)
  @javax.annotation.Nullable
  private ContractTemplate contractTemplate;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  @javax.annotation.Nullable
  private List<ContractCustomField> customFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  @javax.annotation.Nullable
  private EorQuoteBase quote;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public Contract() {
  }

  public Contract id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public Contract title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public Contract type(@javax.annotation.Nonnull ContractTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public ContractTypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull ContractTypeEnum type) {
    this.type = type;
  }


  public Contract status(@javax.annotation.Nonnull ContractStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public ContractStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull ContractStatusEnum status) {
    this.status = status;
  }


  public Contract createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
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


  public Contract jobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public Contract seniority(@javax.annotation.Nullable Seniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nullable
  public Seniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable Seniority seniority) {
    this.seniority = seniority;
  }


  public Contract whoReports(@javax.annotation.Nullable ContractWhoReportsEnum whoReports) {
    this.whoReports = whoReports;
    return this;
  }

  /**
   * Get whoReports
   * @return whoReports
   */
  @javax.annotation.Nullable
  public ContractWhoReportsEnum getWhoReports() {
    return whoReports;
  }

  public void setWhoReports(@javax.annotation.Nullable ContractWhoReportsEnum whoReports) {
    this.whoReports = whoReports;
  }


  public Contract scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

  /**
   * Get scopeOfWork
   * @return scopeOfWork
   */
  @javax.annotation.Nullable
  public String getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }


  public Contract startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
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


  public Contract terminationDate(@javax.annotation.Nullable OffsetDateTime terminationDate) {
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


  public Contract specialClause(@javax.annotation.Nonnull String specialClause) {
    this.specialClause = specialClause;
    return this;
  }

  /**
   * Get specialClause
   * @return specialClause
   */
  @javax.annotation.Nonnull
  public String getSpecialClause() {
    return specialClause;
  }

  public void setSpecialClause(@javax.annotation.Nonnull String specialClause) {
    this.specialClause = specialClause;
  }


  public Contract isArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Get isArchived
   * @return isArchived
   */
  @javax.annotation.Nonnull
  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
  }


  public Contract client(@javax.annotation.Nullable ClientOfContract client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nullable
  public ClientOfContract getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nullable ClientOfContract client) {
    this.client = client;
  }


  public Contract worker(@javax.annotation.Nullable WorkerOfContract worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
   */
  @javax.annotation.Nullable
  public WorkerOfContract getWorker() {
    return worker;
  }

  public void setWorker(@javax.annotation.Nullable WorkerOfContract worker) {
    this.worker = worker;
  }


  public Contract invitations(@javax.annotation.Nonnull InvitationsOfBasicContract invitations) {
    this.invitations = invitations;
    return this;
  }

  /**
   * Get invitations
   * @return invitations
   */
  @javax.annotation.Nonnull
  public InvitationsOfBasicContract getInvitations() {
    return invitations;
  }

  public void setInvitations(@javax.annotation.Nonnull InvitationsOfBasicContract invitations) {
    this.invitations = invitations;
  }


  public Contract signatures(@javax.annotation.Nonnull SignaturesOfContract signatures) {
    this.signatures = signatures;
    return this;
  }

  /**
   * Get signatures
   * @return signatures
   */
  @javax.annotation.Nonnull
  public SignaturesOfContract getSignatures() {
    return signatures;
  }

  public void setSignatures(@javax.annotation.Nonnull SignaturesOfContract signatures) {
    this.signatures = signatures;
  }


  public Contract compensationDetails(@javax.annotation.Nonnull CompensationDetailsOfContract compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public CompensationDetailsOfContract getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull CompensationDetailsOfContract compensationDetails) {
    this.compensationDetails = compensationDetails;
  }


  public Contract employmentDetails(@javax.annotation.Nonnull EmploymentDetailsOfContract employmentDetails) {
    this.employmentDetails = employmentDetails;
    return this;
  }

  /**
   * Get employmentDetails
   * @return employmentDetails
   */
  @javax.annotation.Nonnull
  public EmploymentDetailsOfContract getEmploymentDetails() {
    return employmentDetails;
  }

  public void setEmploymentDetails(@javax.annotation.Nonnull EmploymentDetailsOfContract employmentDetails) {
    this.employmentDetails = employmentDetails;
  }


  public Contract noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
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


  public Contract contractTemplate(@javax.annotation.Nullable ContractTemplate contractTemplate) {
    this.contractTemplate = contractTemplate;
    return this;
  }

  /**
   * Get contractTemplate
   * @return contractTemplate
   */
  @javax.annotation.Nullable
  public ContractTemplate getContractTemplate() {
    return contractTemplate;
  }

  public void setContractTemplate(@javax.annotation.Nullable ContractTemplate contractTemplate) {
    this.contractTemplate = contractTemplate;
  }


  public Contract customFields(@javax.annotation.Nullable List<ContractCustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Contract addCustomFieldsItem(ContractCustomField customFieldsItem) {
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
  public List<ContractCustomField> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(@javax.annotation.Nullable List<ContractCustomField> customFields) {
    this.customFields = customFields;
  }


  public Contract quote(@javax.annotation.Nullable EorQuoteBase quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nullable
  public EorQuoteBase getQuote() {
    return quote;
  }

  public void setQuote(@javax.annotation.Nullable EorQuoteBase quote) {
    this.quote = quote;
  }


  public Contract externalId(@javax.annotation.Nullable String externalId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.id, contract.id) &&
        Objects.equals(this.title, contract.title) &&
        Objects.equals(this.type, contract.type) &&
        Objects.equals(this.status, contract.status) &&
        Objects.equals(this.createdAt, contract.createdAt) &&
        Objects.equals(this.jobTitle, contract.jobTitle) &&
        Objects.equals(this.seniority, contract.seniority) &&
        Objects.equals(this.whoReports, contract.whoReports) &&
        Objects.equals(this.scopeOfWork, contract.scopeOfWork) &&
        Objects.equals(this.startDate, contract.startDate) &&
        Objects.equals(this.terminationDate, contract.terminationDate) &&
        Objects.equals(this.specialClause, contract.specialClause) &&
        Objects.equals(this.isArchived, contract.isArchived) &&
        Objects.equals(this.client, contract.client) &&
        Objects.equals(this.worker, contract.worker) &&
        Objects.equals(this.invitations, contract.invitations) &&
        Objects.equals(this.signatures, contract.signatures) &&
        Objects.equals(this.compensationDetails, contract.compensationDetails) &&
        Objects.equals(this.employmentDetails, contract.employmentDetails) &&
        Objects.equals(this.noticePeriod, contract.noticePeriod) &&
        Objects.equals(this.contractTemplate, contract.contractTemplate) &&
        Objects.equals(this.customFields, contract.customFields) &&
        Objects.equals(this.quote, contract.quote) &&
        Objects.equals(this.externalId, contract.externalId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, type, status, createdAt, jobTitle, seniority, whoReports, scopeOfWork, startDate, terminationDate, specialClause, isArchived, client, worker, invitations, signatures, compensationDetails, employmentDetails, noticePeriod, contractTemplate, customFields, quote, externalId);
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
    sb.append("class Contract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    specialClause: ").append(toIndentedString(specialClause)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
    sb.append("    employmentDetails: ").append(toIndentedString(employmentDetails)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    contractTemplate: ").append(toIndentedString(contractTemplate)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("who_reports");
    openapiFields.add("scope_of_work");
    openapiFields.add("start_date");
    openapiFields.add("termination_date");
    openapiFields.add("special_clause");
    openapiFields.add("is_archived");
    openapiFields.add("client");
    openapiFields.add("worker");
    openapiFields.add("invitations");
    openapiFields.add("signatures");
    openapiFields.add("compensation_details");
    openapiFields.add("employment_details");
    openapiFields.add("notice_period");
    openapiFields.add("contract_template");
    openapiFields.add("custom_fields");
    openapiFields.add("quote");
    openapiFields.add("external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("seniority");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("termination_date");
    openapiRequiredFields.add("special_clause");
    openapiRequiredFields.add("is_archived");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("worker");
    openapiRequiredFields.add("invitations");
    openapiRequiredFields.add("signatures");
    openapiRequiredFields.add("compensation_details");
    openapiRequiredFields.add("employment_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Contract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Contract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contract is not found in the empty JSON string", Contract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Contract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Contract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Contract.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `type`
      ContractTypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the required field `status`
      ContractStatusEnum.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) && !jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the required field `seniority`
      Seniority.validateJsonElement(jsonObj.get("seniority"));
      // validate the optional field `who_reports`
      if (jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) {
        ContractWhoReportsEnum.validateJsonElement(jsonObj.get("who_reports"));
      }
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if (!jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      // validate the required field `client`
      ClientOfContract.validateJsonElement(jsonObj.get("client"));
      // validate the required field `worker`
      WorkerOfContract.validateJsonElement(jsonObj.get("worker"));
      // validate the required field `invitations`
      InvitationsOfBasicContract.validateJsonElement(jsonObj.get("invitations"));
      // validate the required field `signatures`
      SignaturesOfContract.validateJsonElement(jsonObj.get("signatures"));
      // validate the required field `compensation_details`
      CompensationDetailsOfContract.validateJsonElement(jsonObj.get("compensation_details"));
      // validate the required field `employment_details`
      EmploymentDetailsOfContract.validateJsonElement(jsonObj.get("employment_details"));
      // validate the optional field `contract_template`
      if (jsonObj.get("contract_template") != null && !jsonObj.get("contract_template").isJsonNull()) {
        ContractTemplate.validateJsonElement(jsonObj.get("contract_template"));
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
            ContractCustomField.validateJsonElement(jsonArraycustomFields.get(i));
          };
        }
      }
      // validate the optional field `quote`
      if (jsonObj.get("quote") != null && !jsonObj.get("quote").isJsonNull()) {
        EorQuoteBase.validateJsonElement(jsonObj.get("quote"));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contract.class));

       return (TypeAdapter<T>) new TypeAdapter<Contract>() {
           @Override
           public void write(JsonWriter out, Contract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Contract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Contract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Contract
   * @throws IOException if the JSON string is invalid with respect to Contract
   */
  public static Contract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contract.class);
  }

  /**
   * Convert an instance of Contract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

