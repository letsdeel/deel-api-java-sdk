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
 * Details of contract to create
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractToCreateShared {
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

  public ContractToCreateShared() {
  }

  public ContractToCreateShared title(@javax.annotation.Nonnull String title) {
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


  public ContractToCreateShared countryCode(@javax.annotation.Nullable String countryCode) {
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


  public ContractToCreateShared stateCode(@javax.annotation.Nullable String stateCode) {
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


  public ContractToCreateShared scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
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


  public ContractToCreateShared specialClause(@javax.annotation.Nullable String specialClause) {
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


  public ContractToCreateShared terminationDate(@javax.annotation.Nullable LocalDate terminationDate) {
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


  public ContractToCreateShared client(@javax.annotation.Nonnull ContractToCreateSharedClient client) {
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


  public ContractToCreateShared jobTitle(@javax.annotation.Nonnull ContractToCreateSharedJobTitle jobTitle) {
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


  public ContractToCreateShared seniority(@javax.annotation.Nullable ContractToCreateSharedSeniority seniority) {
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


  public ContractToCreateShared noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
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


  public ContractToCreateShared whoReports(@javax.annotation.Nullable ContractWhoReportsEnum whoReports) {
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


  public ContractToCreateShared meta(@javax.annotation.Nonnull MetaDataOfContractToCreate meta) {
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


  public ContractToCreateShared externalId(@javax.annotation.Nullable String externalId) {
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


  public ContractToCreateShared worker(@javax.annotation.Nullable ContractToCreateSharedWorker worker) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractToCreateShared contractToCreateShared = (ContractToCreateShared) o;
    return Objects.equals(this.title, contractToCreateShared.title) &&
        Objects.equals(this.countryCode, contractToCreateShared.countryCode) &&
        Objects.equals(this.stateCode, contractToCreateShared.stateCode) &&
        Objects.equals(this.scopeOfWork, contractToCreateShared.scopeOfWork) &&
        Objects.equals(this.specialClause, contractToCreateShared.specialClause) &&
        Objects.equals(this.terminationDate, contractToCreateShared.terminationDate) &&
        Objects.equals(this.client, contractToCreateShared.client) &&
        Objects.equals(this.jobTitle, contractToCreateShared.jobTitle) &&
        Objects.equals(this.seniority, contractToCreateShared.seniority) &&
        Objects.equals(this.noticePeriod, contractToCreateShared.noticePeriod) &&
        Objects.equals(this.whoReports, contractToCreateShared.whoReports) &&
        Objects.equals(this.meta, contractToCreateShared.meta) &&
        Objects.equals(this.externalId, contractToCreateShared.externalId) &&
        Objects.equals(this.worker, contractToCreateShared.worker);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, countryCode, stateCode, scopeOfWork, specialClause, terminationDate, client, jobTitle, seniority, noticePeriod, whoReports, meta, externalId, worker);
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
    sb.append("class ContractToCreateShared {\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("meta");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractToCreateShared
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractToCreateShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractToCreateShared is not found in the empty JSON string", ContractToCreateShared.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractToCreateShared.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractToCreateShared` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractToCreateShared.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractToCreateShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractToCreateShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractToCreateShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreateShared.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractToCreateShared>() {
           @Override
           public void write(JsonWriter out, ContractToCreateShared value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractToCreateShared read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractToCreateShared given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractToCreateShared
   * @throws IOException if the JSON string is invalid with respect to ContractToCreateShared
   */
  public static ContractToCreateShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractToCreateShared.class);
  }

  /**
   * Convert an instance of ContractToCreateShared to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

