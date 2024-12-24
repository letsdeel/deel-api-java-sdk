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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails;
import org.openapitools.client.model.ContractToCreateSharedClient;
import org.openapitools.client.model.ContractToCreateSharedJobTitle;
import org.openapitools.client.model.ContractToCreateSharedSeniority;
import org.openapitools.client.model.ContractToCreateSharedWorker;
import org.openapitools.client.model.ContractWhoReportsEnum;
import org.openapitools.client.model.MetaDataOfContractToCreate;
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
 * ContractToCreatePayAsYouGoTimeBased
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractToCreatePayAsYouGoTimeBased {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String countryCode;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  @javax.annotation.Nullable
  private String stateCode;

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
  private LocalDate terminationDate;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private ContractToCreateSharedClient client;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private ContractToCreateSharedJobTitle jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private ContractToCreateSharedSeniority seniority;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod = new BigDecimal("0");

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  @javax.annotation.Nullable
  private ContractWhoReportsEnum whoReports;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nonnull
  private MetaDataOfContractToCreate meta;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  @javax.annotation.Nullable
  private ContractToCreateSharedWorker worker;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAY_AS_YOU_GO_TIME_BASED("pay_as_you_go_time_based");

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

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails compensationDetails;

  public ContractToCreatePayAsYouGoTimeBased() {
  }

  public ContractToCreatePayAsYouGoTimeBased title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the contract.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public ContractToCreatePayAsYouGoTimeBased countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }


  public ContractToCreatePayAsYouGoTimeBased stateCode(@javax.annotation.Nullable String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * The state or province code. Use country lookup endpoint to retrieve state codes.
   * @return stateCode
   */
  @javax.annotation.Nullable
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(@javax.annotation.Nullable String stateCode) {
    this.stateCode = stateCode;
  }


  public ContractToCreatePayAsYouGoTimeBased scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

  /**
   * Describe the work to be performed.
   * @return scopeOfWork
   */
  @javax.annotation.Nullable
  public String getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }


  public ContractToCreatePayAsYouGoTimeBased specialClause(@javax.annotation.Nullable String specialClause) {
    this.specialClause = specialClause;
    return this;
  }

  /**
   * Enter any special clause you may have.
   * @return specialClause
   */
  @javax.annotation.Nullable
  public String getSpecialClause() {
    return specialClause;
  }

  public void setSpecialClause(@javax.annotation.Nullable String specialClause) {
    this.specialClause = specialClause;
  }


  public ContractToCreatePayAsYouGoTimeBased terminationDate(@javax.annotation.Nullable LocalDate terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return terminationDate
   */
  @javax.annotation.Nullable
  public LocalDate getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(@javax.annotation.Nullable LocalDate terminationDate) {
    this.terminationDate = terminationDate;
  }


  public ContractToCreatePayAsYouGoTimeBased client(@javax.annotation.Nonnull ContractToCreateSharedClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public ContractToCreateSharedClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull ContractToCreateSharedClient client) {
    this.client = client;
  }


  public ContractToCreatePayAsYouGoTimeBased jobTitle(@javax.annotation.Nonnull ContractToCreateSharedJobTitle jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  @javax.annotation.Nonnull
  public ContractToCreateSharedJobTitle getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nonnull ContractToCreateSharedJobTitle jobTitle) {
    this.jobTitle = jobTitle;
  }


  public ContractToCreatePayAsYouGoTimeBased seniority(@javax.annotation.Nullable ContractToCreateSharedSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nullable
  public ContractToCreateSharedSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable ContractToCreateSharedSeniority seniority) {
    this.seniority = seniority;
  }


  public ContractToCreatePayAsYouGoTimeBased noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
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


  public ContractToCreatePayAsYouGoTimeBased whoReports(@javax.annotation.Nullable ContractWhoReportsEnum whoReports) {
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


  public ContractToCreatePayAsYouGoTimeBased meta(@javax.annotation.Nonnull MetaDataOfContractToCreate meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nonnull
  public MetaDataOfContractToCreate getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nonnull MetaDataOfContractToCreate meta) {
    this.meta = meta;
  }


  public ContractToCreatePayAsYouGoTimeBased externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External Id.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public ContractToCreatePayAsYouGoTimeBased worker(@javax.annotation.Nullable ContractToCreateSharedWorker worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
   */
  @javax.annotation.Nullable
  public ContractToCreateSharedWorker getWorker() {
    return worker;
  }

  public void setWorker(@javax.annotation.Nullable ContractToCreateSharedWorker worker) {
    this.worker = worker;
  }


  public ContractToCreatePayAsYouGoTimeBased type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public ContractToCreatePayAsYouGoTimeBased startDate(@javax.annotation.Nonnull LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull LocalDate startDate) {
    this.startDate = startDate;
  }


  public ContractToCreatePayAsYouGoTimeBased compensationDetails(@javax.annotation.Nonnull ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails compensationDetails) {
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
    ContractToCreatePayAsYouGoTimeBased contractToCreatePayAsYouGoTimeBased = (ContractToCreatePayAsYouGoTimeBased) o;
    return Objects.equals(this.title, contractToCreatePayAsYouGoTimeBased.title) &&
        Objects.equals(this.countryCode, contractToCreatePayAsYouGoTimeBased.countryCode) &&
        Objects.equals(this.stateCode, contractToCreatePayAsYouGoTimeBased.stateCode) &&
        Objects.equals(this.scopeOfWork, contractToCreatePayAsYouGoTimeBased.scopeOfWork) &&
        Objects.equals(this.specialClause, contractToCreatePayAsYouGoTimeBased.specialClause) &&
        Objects.equals(this.terminationDate, contractToCreatePayAsYouGoTimeBased.terminationDate) &&
        Objects.equals(this.client, contractToCreatePayAsYouGoTimeBased.client) &&
        Objects.equals(this.jobTitle, contractToCreatePayAsYouGoTimeBased.jobTitle) &&
        Objects.equals(this.seniority, contractToCreatePayAsYouGoTimeBased.seniority) &&
        Objects.equals(this.noticePeriod, contractToCreatePayAsYouGoTimeBased.noticePeriod) &&
        Objects.equals(this.whoReports, contractToCreatePayAsYouGoTimeBased.whoReports) &&
        Objects.equals(this.meta, contractToCreatePayAsYouGoTimeBased.meta) &&
        Objects.equals(this.externalId, contractToCreatePayAsYouGoTimeBased.externalId) &&
        Objects.equals(this.worker, contractToCreatePayAsYouGoTimeBased.worker) &&
        Objects.equals(this.type, contractToCreatePayAsYouGoTimeBased.type) &&
        Objects.equals(this.startDate, contractToCreatePayAsYouGoTimeBased.startDate) &&
        Objects.equals(this.compensationDetails, contractToCreatePayAsYouGoTimeBased.compensationDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, countryCode, stateCode, scopeOfWork, specialClause, terminationDate, client, jobTitle, seniority, noticePeriod, whoReports, meta, externalId, worker, type, startDate, compensationDetails);
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
    sb.append("class ContractToCreatePayAsYouGoTimeBased {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    specialClause: ").append(toIndentedString(specialClause)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("country_code");
    openapiFields.add("state_code");
    openapiFields.add("scope_of_work");
    openapiFields.add("special_clause");
    openapiFields.add("termination_date");
    openapiFields.add("client");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("notice_period");
    openapiFields.add("who_reports");
    openapiFields.add("meta");
    openapiFields.add("external_id");
    openapiFields.add("worker");
    openapiFields.add("type");
    openapiFields.add("start_date");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractToCreatePayAsYouGoTimeBased
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractToCreatePayAsYouGoTimeBased.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractToCreatePayAsYouGoTimeBased is not found in the empty JSON string", ContractToCreatePayAsYouGoTimeBased.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractToCreatePayAsYouGoTimeBased.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractToCreatePayAsYouGoTimeBased` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractToCreatePayAsYouGoTimeBased.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonNull()) && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if ((jsonObj.get("special_clause") != null && !jsonObj.get("special_clause").isJsonNull()) && !jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      // validate the required field `client`
      ContractToCreateSharedClient.validateJsonElement(jsonObj.get("client"));
      // validate the required field `job_title`
      ContractToCreateSharedJobTitle.validateJsonElement(jsonObj.get("job_title"));
      // validate the optional field `seniority`
      if (jsonObj.get("seniority") != null && !jsonObj.get("seniority").isJsonNull()) {
        ContractToCreateSharedSeniority.validateJsonElement(jsonObj.get("seniority"));
      }
      // validate the optional field `who_reports`
      if (jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) {
        ContractWhoReportsEnum.validateJsonElement(jsonObj.get("who_reports"));
      }
      // validate the required field `meta`
      MetaDataOfContractToCreate.validateJsonElement(jsonObj.get("meta"));
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the optional field `worker`
      if (jsonObj.get("worker") != null && !jsonObj.get("worker").isJsonNull()) {
        ContractToCreateSharedWorker.validateJsonElement(jsonObj.get("worker"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the required field `compensation_details`
      ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractToCreatePayAsYouGoTimeBased.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractToCreatePayAsYouGoTimeBased' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractToCreatePayAsYouGoTimeBased> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreatePayAsYouGoTimeBased.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractToCreatePayAsYouGoTimeBased>() {
           @Override
           public void write(JsonWriter out, ContractToCreatePayAsYouGoTimeBased value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractToCreatePayAsYouGoTimeBased read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractToCreatePayAsYouGoTimeBased given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractToCreatePayAsYouGoTimeBased
   * @throws IOException if the JSON string is invalid with respect to ContractToCreatePayAsYouGoTimeBased
   */
  public static ContractToCreatePayAsYouGoTimeBased fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractToCreatePayAsYouGoTimeBased.class);
  }

  /**
   * Convert an instance of ContractToCreatePayAsYouGoTimeBased to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

