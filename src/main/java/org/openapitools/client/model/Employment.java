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
import java.util.Arrays;
import org.openapitools.client.model.PeopleClientLegalEntity;
import org.openapitools.client.model.PeoplePayment;
import org.openapitools.client.model.Team;

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
 * Employment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:15:13.914237102Z[GMT]", comments = "Generator version: 7.10.0")
public class Employment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nullable
  private Team team;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  @javax.annotation.Nullable
  private PeoplePayment payment;

  public static final String SERIALIZED_NAME_IS_ENDED = "is_ended";
  @SerializedName(SERIALIZED_NAME_IS_ENDED)
  @javax.annotation.Nullable
  private Boolean isEnded;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  @javax.annotation.Nullable
  private String timezone;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nullable
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private String seniority;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nullable
  private String workEmail;

  public static final String SERIALIZED_NAME_HIRING_TYPE = "hiring_type";
  @SerializedName(SERIALIZED_NAME_HIRING_TYPE)
  @javax.annotation.Nullable
  private String hiringType;

  public static final String SERIALIZED_NAME_HIRING_STATUS = "hiring_status";
  @SerializedName(SERIALIZED_NAME_HIRING_STATUS)
  @javax.annotation.Nullable
  private String hiringStatus;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completion_date";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  @javax.annotation.Nullable
  private String completionDate;

  public static final String SERIALIZED_NAME_CONTRACT_STATUS = "contract_status";
  @SerializedName(SERIALIZED_NAME_CONTRACT_STATUS)
  @javax.annotation.Nullable
  private String contractStatus;

  public static final String SERIALIZED_NAME_VOLUNTARILY_LEFT = "voluntarily_left";
  @SerializedName(SERIALIZED_NAME_VOLUNTARILY_LEFT)
  @javax.annotation.Nullable
  private Boolean voluntarilyLeft;

  public static final String SERIALIZED_NAME_CLIENT_LEGAL_ENTITY = "client_legal_entity";
  @SerializedName(SERIALIZED_NAME_CLIENT_LEGAL_ENTITY)
  @javax.annotation.Nullable
  private PeopleClientLegalEntity clientLegalEntity;

  public static final String SERIALIZED_NAME_HAS_EOR_TERMINATION = "has_eor_termination";
  @SerializedName(SERIALIZED_NAME_HAS_EOR_TERMINATION)
  @javax.annotation.Nullable
  private Boolean hasEorTermination;

  public static final String SERIALIZED_NAME_CONTRACT_IS_ARCHIVED = "contract_is_archived";
  @SerializedName(SERIALIZED_NAME_CONTRACT_IS_ARCHIVED)
  @javax.annotation.Nullable
  private Boolean contractIsArchived;

  public Employment() {
  }

  public Employment id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the employment.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public Employment name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the employment.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public Employment team(@javax.annotation.Nullable Team team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nullable
  public Team getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nullable Team team) {
    this.team = team;
  }


  public Employment email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The email associated with the employment.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public Employment state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The state associated with the employment.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public Employment country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country associated with the employment.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public Employment payment(@javax.annotation.Nullable PeoplePayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   */
  @javax.annotation.Nullable
  public PeoplePayment getPayment() {
    return payment;
  }

  public void setPayment(@javax.annotation.Nullable PeoplePayment payment) {
    this.payment = payment;
  }


  public Employment isEnded(@javax.annotation.Nullable Boolean isEnded) {
    this.isEnded = isEnded;
    return this;
  }

  /**
   * Indicates whether the employment has ended.
   * @return isEnded
   */
  @javax.annotation.Nullable
  public Boolean getIsEnded() {
    return isEnded;
  }

  public void setIsEnded(@javax.annotation.Nullable Boolean isEnded) {
    this.isEnded = isEnded;
  }


  public Employment timezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone associated with the employment.
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
  }


  public Employment jobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * The job title associated with the employment.
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public Employment seniority(@javax.annotation.Nullable String seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * The seniority level associated with the employment.
   * @return seniority
   */
  @javax.annotation.Nullable
  public String getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable String seniority) {
    this.seniority = seniority;
  }


  public Employment startDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the employment.
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }


  public Employment workEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * The work email associated with the employment.
   * @return workEmail
   */
  @javax.annotation.Nullable
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
  }


  public Employment hiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
    return this;
  }

  /**
   * The hiring type associated with the employment.
   * @return hiringType
   */
  @javax.annotation.Nullable
  public String getHiringType() {
    return hiringType;
  }

  public void setHiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
  }


  public Employment hiringStatus(@javax.annotation.Nullable String hiringStatus) {
    this.hiringStatus = hiringStatus;
    return this;
  }

  /**
   * The hiring status associated with the employment.
   * @return hiringStatus
   */
  @javax.annotation.Nullable
  public String getHiringStatus() {
    return hiringStatus;
  }

  public void setHiringStatus(@javax.annotation.Nullable String hiringStatus) {
    this.hiringStatus = hiringStatus;
  }


  public Employment completionDate(@javax.annotation.Nullable String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * The completion date of the employment.
   * @return completionDate
   */
  @javax.annotation.Nullable
  public String getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@javax.annotation.Nullable String completionDate) {
    this.completionDate = completionDate;
  }


  public Employment contractStatus(@javax.annotation.Nullable String contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * The contract status associated with the employment.
   * @return contractStatus
   */
  @javax.annotation.Nullable
  public String getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(@javax.annotation.Nullable String contractStatus) {
    this.contractStatus = contractStatus;
  }


  public Employment voluntarilyLeft(@javax.annotation.Nullable Boolean voluntarilyLeft) {
    this.voluntarilyLeft = voluntarilyLeft;
    return this;
  }

  /**
   * Indicates whether the employment was left voluntarily.
   * @return voluntarilyLeft
   */
  @javax.annotation.Nullable
  public Boolean getVoluntarilyLeft() {
    return voluntarilyLeft;
  }

  public void setVoluntarilyLeft(@javax.annotation.Nullable Boolean voluntarilyLeft) {
    this.voluntarilyLeft = voluntarilyLeft;
  }


  public Employment clientLegalEntity(@javax.annotation.Nullable PeopleClientLegalEntity clientLegalEntity) {
    this.clientLegalEntity = clientLegalEntity;
    return this;
  }

  /**
   * Get clientLegalEntity
   * @return clientLegalEntity
   */
  @javax.annotation.Nullable
  public PeopleClientLegalEntity getClientLegalEntity() {
    return clientLegalEntity;
  }

  public void setClientLegalEntity(@javax.annotation.Nullable PeopleClientLegalEntity clientLegalEntity) {
    this.clientLegalEntity = clientLegalEntity;
  }


  public Employment hasEorTermination(@javax.annotation.Nullable Boolean hasEorTermination) {
    this.hasEorTermination = hasEorTermination;
    return this;
  }

  /**
   * Indicates whether the employment had an EOR termination.
   * @return hasEorTermination
   */
  @javax.annotation.Nullable
  public Boolean getHasEorTermination() {
    return hasEorTermination;
  }

  public void setHasEorTermination(@javax.annotation.Nullable Boolean hasEorTermination) {
    this.hasEorTermination = hasEorTermination;
  }


  public Employment contractIsArchived(@javax.annotation.Nullable Boolean contractIsArchived) {
    this.contractIsArchived = contractIsArchived;
    return this;
  }

  /**
   * Indicates whether the employment&#39;s contract is archived.
   * @return contractIsArchived
   */
  @javax.annotation.Nullable
  public Boolean getContractIsArchived() {
    return contractIsArchived;
  }

  public void setContractIsArchived(@javax.annotation.Nullable Boolean contractIsArchived) {
    this.contractIsArchived = contractIsArchived;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employment employment = (Employment) o;
    return Objects.equals(this.id, employment.id) &&
        Objects.equals(this.name, employment.name) &&
        Objects.equals(this.team, employment.team) &&
        Objects.equals(this.email, employment.email) &&
        Objects.equals(this.state, employment.state) &&
        Objects.equals(this.country, employment.country) &&
        Objects.equals(this.payment, employment.payment) &&
        Objects.equals(this.isEnded, employment.isEnded) &&
        Objects.equals(this.timezone, employment.timezone) &&
        Objects.equals(this.jobTitle, employment.jobTitle) &&
        Objects.equals(this.seniority, employment.seniority) &&
        Objects.equals(this.startDate, employment.startDate) &&
        Objects.equals(this.workEmail, employment.workEmail) &&
        Objects.equals(this.hiringType, employment.hiringType) &&
        Objects.equals(this.hiringStatus, employment.hiringStatus) &&
        Objects.equals(this.completionDate, employment.completionDate) &&
        Objects.equals(this.contractStatus, employment.contractStatus) &&
        Objects.equals(this.voluntarilyLeft, employment.voluntarilyLeft) &&
        Objects.equals(this.clientLegalEntity, employment.clientLegalEntity) &&
        Objects.equals(this.hasEorTermination, employment.hasEorTermination) &&
        Objects.equals(this.contractIsArchived, employment.contractIsArchived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, team, email, state, country, payment, isEnded, timezone, jobTitle, seniority, startDate, workEmail, hiringType, hiringStatus, completionDate, contractStatus, voluntarilyLeft, clientLegalEntity, hasEorTermination, contractIsArchived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    isEnded: ").append(toIndentedString(isEnded)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    hiringType: ").append(toIndentedString(hiringType)).append("\n");
    sb.append("    hiringStatus: ").append(toIndentedString(hiringStatus)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    voluntarilyLeft: ").append(toIndentedString(voluntarilyLeft)).append("\n");
    sb.append("    clientLegalEntity: ").append(toIndentedString(clientLegalEntity)).append("\n");
    sb.append("    hasEorTermination: ").append(toIndentedString(hasEorTermination)).append("\n");
    sb.append("    contractIsArchived: ").append(toIndentedString(contractIsArchived)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("team");
    openapiFields.add("email");
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("payment");
    openapiFields.add("is_ended");
    openapiFields.add("timezone");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("start_date");
    openapiFields.add("work_email");
    openapiFields.add("hiring_type");
    openapiFields.add("hiring_status");
    openapiFields.add("completion_date");
    openapiFields.add("contract_status");
    openapiFields.add("voluntarily_left");
    openapiFields.add("client_legal_entity");
    openapiFields.add("has_eor_termination");
    openapiFields.add("contract_is_archived");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Employment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Employment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Employment is not found in the empty JSON string", Employment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Employment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Employment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `team`
      if (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) {
        Team.validateJsonElement(jsonObj.get("team"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        PeoplePayment.validateJsonElement(jsonObj.get("payment"));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) && !jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      if ((jsonObj.get("seniority") != null && !jsonObj.get("seniority").isJsonNull()) && !jsonObj.get("seniority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seniority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seniority").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("work_email") != null && !jsonObj.get("work_email").isJsonNull()) && !jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
      if ((jsonObj.get("hiring_type") != null && !jsonObj.get("hiring_type").isJsonNull()) && !jsonObj.get("hiring_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_type").toString()));
      }
      if ((jsonObj.get("hiring_status") != null && !jsonObj.get("hiring_status").isJsonNull()) && !jsonObj.get("hiring_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_status").toString()));
      }
      if ((jsonObj.get("completion_date") != null && !jsonObj.get("completion_date").isJsonNull()) && !jsonObj.get("completion_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completion_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completion_date").toString()));
      }
      if ((jsonObj.get("contract_status") != null && !jsonObj.get("contract_status").isJsonNull()) && !jsonObj.get("contract_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_status").toString()));
      }
      // validate the optional field `client_legal_entity`
      if (jsonObj.get("client_legal_entity") != null && !jsonObj.get("client_legal_entity").isJsonNull()) {
        PeopleClientLegalEntity.validateJsonElement(jsonObj.get("client_legal_entity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Employment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Employment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Employment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Employment.class));

       return (TypeAdapter<T>) new TypeAdapter<Employment>() {
           @Override
           public void write(JsonWriter out, Employment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Employment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Employment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Employment
   * @throws IOException if the JSON string is invalid with respect to Employment
   */
  public static Employment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Employment.class);
  }

  /**
   * Convert an instance of Employment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

