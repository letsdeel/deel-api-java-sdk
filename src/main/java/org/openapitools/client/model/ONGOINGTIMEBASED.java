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
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfClient;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfCompensationDetails;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfJobTitle;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfMeta;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfSeniority;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfWorker;
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
 * ONGOINGTIMEBASED
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class ONGOINGTIMEBASED {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nonnull
  private PAYASYOUGOTIMEBASEDAllOfMeta meta;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private PAYASYOUGOTIMEBASEDAllOfClient client;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  @javax.annotation.Nullable
  private PAYASYOUGOTIMEBASEDAllOfWorker worker;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private PAYASYOUGOTIMEBASEDAllOfJobTitle jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private PAYASYOUGOTIMEBASEDAllOfSeniority seniority;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  @javax.annotation.Nullable
  private String stateCode;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

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

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String countryCode;

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
  @javax.annotation.Nullable
  private String specialClause;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  @javax.annotation.Nullable
  private LocalDate terminationDate;

  /**
   * Type of contract
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONGOING_TIME_BASED("ongoing_time_based");

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
  private PAYASYOUGOTIMEBASEDAllOfCompensationDetails compensationDetails;

  public ONGOINGTIMEBASED() {
  }

  public ONGOINGTIMEBASED meta(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nonnull
  public PAYASYOUGOTIMEBASEDAllOfMeta getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfMeta meta) {
    this.meta = meta;
  }


  public ONGOINGTIMEBASED title(@javax.annotation.Nonnull String title) {
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


  public ONGOINGTIMEBASED client(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public PAYASYOUGOTIMEBASEDAllOfClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfClient client) {
    this.client = client;
  }


  public ONGOINGTIMEBASED worker(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfWorker worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
   */
  @javax.annotation.Nullable
  public PAYASYOUGOTIMEBASEDAllOfWorker getWorker() {
    return worker;
  }

  public void setWorker(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfWorker worker) {
    this.worker = worker;
  }


  public ONGOINGTIMEBASED jobTitle(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfJobTitle jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  @javax.annotation.Nonnull
  public PAYASYOUGOTIMEBASEDAllOfJobTitle getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfJobTitle jobTitle) {
    this.jobTitle = jobTitle;
  }


  public ONGOINGTIMEBASED seniority(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nullable
  public PAYASYOUGOTIMEBASEDAllOfSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfSeniority seniority) {
    this.seniority = seniority;
  }


  public ONGOINGTIMEBASED stateCode(@javax.annotation.Nullable String stateCode) {
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


  public ONGOINGTIMEBASED externalId(@javax.annotation.Nullable String externalId) {
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


  public ONGOINGTIMEBASED whoReports(@javax.annotation.Nullable WhoReportsEnum whoReports) {
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


  public ONGOINGTIMEBASED countryCode(@javax.annotation.Nullable String countryCode) {
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


  public ONGOINGTIMEBASED noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
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


  public ONGOINGTIMEBASED scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
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


  public ONGOINGTIMEBASED specialClause(@javax.annotation.Nullable String specialClause) {
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


  public ONGOINGTIMEBASED terminationDate(@javax.annotation.Nullable LocalDate terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return terminationDate
   */
  @javax.annotation.Nullable
  public LocalDate getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(@javax.annotation.Nullable LocalDate terminationDate) {
    this.terminationDate = terminationDate;
  }


  public ONGOINGTIMEBASED type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of contract
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public ONGOINGTIMEBASED startDate(@javax.annotation.Nonnull LocalDate startDate) {
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


  public ONGOINGTIMEBASED compensationDetails(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfCompensationDetails compensationDetails) {
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
    ONGOINGTIMEBASED ONGOING_TIME_BASED = (ONGOINGTIMEBASED) o;
    return Objects.equals(this.meta, ONGOING_TIME_BASED.meta) &&
        Objects.equals(this.title, ONGOING_TIME_BASED.title) &&
        Objects.equals(this.client, ONGOING_TIME_BASED.client) &&
        Objects.equals(this.worker, ONGOING_TIME_BASED.worker) &&
        Objects.equals(this.jobTitle, ONGOING_TIME_BASED.jobTitle) &&
        Objects.equals(this.seniority, ONGOING_TIME_BASED.seniority) &&
        Objects.equals(this.stateCode, ONGOING_TIME_BASED.stateCode) &&
        Objects.equals(this.externalId, ONGOING_TIME_BASED.externalId) &&
        Objects.equals(this.whoReports, ONGOING_TIME_BASED.whoReports) &&
        Objects.equals(this.countryCode, ONGOING_TIME_BASED.countryCode) &&
        Objects.equals(this.noticePeriod, ONGOING_TIME_BASED.noticePeriod) &&
        Objects.equals(this.scopeOfWork, ONGOING_TIME_BASED.scopeOfWork) &&
        Objects.equals(this.specialClause, ONGOING_TIME_BASED.specialClause) &&
        Objects.equals(this.terminationDate, ONGOING_TIME_BASED.terminationDate) &&
        Objects.equals(this.type, ONGOING_TIME_BASED.type) &&
        Objects.equals(this.startDate, ONGOING_TIME_BASED.startDate) &&
        Objects.equals(this.compensationDetails, ONGOING_TIME_BASED.compensationDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, title, client, worker, jobTitle, seniority, stateCode, externalId, whoReports, countryCode, noticePeriod, scopeOfWork, specialClause, terminationDate, type, startDate, compensationDetails);
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
    sb.append("class ONGOINGTIMEBASED {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    specialClause: ").append(toIndentedString(specialClause)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
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
    openapiFields.add("meta");
    openapiFields.add("title");
    openapiFields.add("client");
    openapiFields.add("worker");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("state_code");
    openapiFields.add("external_id");
    openapiFields.add("who_reports");
    openapiFields.add("country_code");
    openapiFields.add("notice_period");
    openapiFields.add("scope_of_work");
    openapiFields.add("special_clause");
    openapiFields.add("termination_date");
    openapiFields.add("type");
    openapiFields.add("start_date");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ONGOINGTIMEBASED
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ONGOINGTIMEBASED.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ONGOINGTIMEBASED is not found in the empty JSON string", ONGOINGTIMEBASED.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ONGOINGTIMEBASED.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ONGOINGTIMEBASED` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ONGOINGTIMEBASED.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `meta`
      PAYASYOUGOTIMEBASEDAllOfMeta.validateJsonElement(jsonObj.get("meta"));
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `client`
      PAYASYOUGOTIMEBASEDAllOfClient.validateJsonElement(jsonObj.get("client"));
      // validate the optional field `worker`
      if (jsonObj.get("worker") != null && !jsonObj.get("worker").isJsonNull()) {
        PAYASYOUGOTIMEBASEDAllOfWorker.validateJsonElement(jsonObj.get("worker"));
      }
      // validate the required field `job_title`
      PAYASYOUGOTIMEBASEDAllOfJobTitle.validateJsonElement(jsonObj.get("job_title"));
      // validate the optional field `seniority`
      if (jsonObj.get("seniority") != null && !jsonObj.get("seniority").isJsonNull()) {
        PAYASYOUGOTIMEBASEDAllOfSeniority.validateJsonElement(jsonObj.get("seniority"));
      }
      if ((jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonNull()) && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) && !jsonObj.get("who_reports").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `who_reports` to be a primitive type in the JSON string but got `%s`", jsonObj.get("who_reports").toString()));
      }
      // validate the optional field `who_reports`
      if (jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) {
        WhoReportsEnum.validateJsonElement(jsonObj.get("who_reports"));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if ((jsonObj.get("special_clause") != null && !jsonObj.get("special_clause").isJsonNull()) && !jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the required field `compensation_details`
      PAYASYOUGOTIMEBASEDAllOfCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ONGOINGTIMEBASED.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ONGOINGTIMEBASED' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ONGOINGTIMEBASED> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ONGOINGTIMEBASED.class));

       return (TypeAdapter<T>) new TypeAdapter<ONGOINGTIMEBASED>() {
           @Override
           public void write(JsonWriter out, ONGOINGTIMEBASED value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ONGOINGTIMEBASED read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ONGOINGTIMEBASED given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ONGOINGTIMEBASED
   * @throws IOException if the JSON string is invalid with respect to ONGOINGTIMEBASED
   */
  public static ONGOINGTIMEBASED fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ONGOINGTIMEBASED.class);
  }

  /**
   * Convert an instance of ONGOINGTIMEBASED to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

