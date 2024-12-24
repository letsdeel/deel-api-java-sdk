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
 * EorContractCreatedEmployment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class EorContractCreatedEmployment {
  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  @javax.annotation.Nullable
  private String scopeOfWork;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_WORK_VISA_REQUIRED = "work_visa_required";
  @SerializedName(SERIALIZED_NAME_WORK_VISA_REQUIRED)
  @javax.annotation.Nullable
  private Boolean workVisaRequired;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE = "time_off_type";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE)
  @javax.annotation.Nullable
  private String timeOffType;

  public static final String SERIALIZED_NAME_PROBATION_PERIOD = "probation_period";
  @SerializedName(SERIALIZED_NAME_PROBATION_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal probationPeriod;

  public static final String SERIALIZED_NAME_CALCULATED_HOLIDAYS = "calculated_holidays";
  @SerializedName(SERIALIZED_NAME_CALCULATED_HOLIDAYS)
  @javax.annotation.Nullable
  private String calculatedHolidays;

  public EorContractCreatedEmployment() {
  }

  public EorContractCreatedEmployment scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

  /**
   * Scope of work description.
   * @return scopeOfWork
   */
  @javax.annotation.Nullable
  public String getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }


  public EorContractCreatedEmployment startDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return startDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
  }


  public EorContractCreatedEmployment endDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return endDate
   */
  @javax.annotation.Nullable
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
  }


  public EorContractCreatedEmployment country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of employement.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public EorContractCreatedEmployment state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State code of the state/province where the this person will be employed.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public EorContractCreatedEmployment workVisaRequired(@javax.annotation.Nullable Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
    return this;
  }

  /**
   * Do you require Deel to apply for work visa for this person?
   * @return workVisaRequired
   */
  @javax.annotation.Nullable
  public Boolean getWorkVisaRequired() {
    return workVisaRequired;
  }

  public void setWorkVisaRequired(@javax.annotation.Nullable Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
  }


  public EorContractCreatedEmployment timeOffType(@javax.annotation.Nullable String timeOffType) {
    this.timeOffType = timeOffType;
    return this;
  }

  /**
   * If you want to use standard number of holidays for this employee, choose \&quot;STANDARD\&quot;. If you want to enter a specific number of holidays, choose \&quot;SPECIFIC\&quot; and enter the number of days in the holidays field.
   * @return timeOffType
   */
  @javax.annotation.Nullable
  public String getTimeOffType() {
    return timeOffType;
  }

  public void setTimeOffType(@javax.annotation.Nullable String timeOffType) {
    this.timeOffType = timeOffType;
  }


  public EorContractCreatedEmployment probationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
    return this;
  }

  /**
   * Number of probation days.
   * @return probationPeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getProbationPeriod() {
    return probationPeriod;
  }

  public void setProbationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
  }


  public EorContractCreatedEmployment calculatedHolidays(@javax.annotation.Nullable String calculatedHolidays) {
    this.calculatedHolidays = calculatedHolidays;
    return this;
  }

  /**
   * Number of calculate holidays for this contract.
   * @return calculatedHolidays
   */
  @javax.annotation.Nullable
  public String getCalculatedHolidays() {
    return calculatedHolidays;
  }

  public void setCalculatedHolidays(@javax.annotation.Nullable String calculatedHolidays) {
    this.calculatedHolidays = calculatedHolidays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorContractCreatedEmployment eorContractCreatedEmployment = (EorContractCreatedEmployment) o;
    return Objects.equals(this.scopeOfWork, eorContractCreatedEmployment.scopeOfWork) &&
        Objects.equals(this.startDate, eorContractCreatedEmployment.startDate) &&
        Objects.equals(this.endDate, eorContractCreatedEmployment.endDate) &&
        Objects.equals(this.country, eorContractCreatedEmployment.country) &&
        Objects.equals(this.state, eorContractCreatedEmployment.state) &&
        Objects.equals(this.workVisaRequired, eorContractCreatedEmployment.workVisaRequired) &&
        Objects.equals(this.timeOffType, eorContractCreatedEmployment.timeOffType) &&
        Objects.equals(this.probationPeriod, eorContractCreatedEmployment.probationPeriod) &&
        Objects.equals(this.calculatedHolidays, eorContractCreatedEmployment.calculatedHolidays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeOfWork, startDate, endDate, country, state, workVisaRequired, timeOffType, probationPeriod, calculatedHolidays);
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
    sb.append("class EorContractCreatedEmployment {\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    workVisaRequired: ").append(toIndentedString(workVisaRequired)).append("\n");
    sb.append("    timeOffType: ").append(toIndentedString(timeOffType)).append("\n");
    sb.append("    probationPeriod: ").append(toIndentedString(probationPeriod)).append("\n");
    sb.append("    calculatedHolidays: ").append(toIndentedString(calculatedHolidays)).append("\n");
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
    openapiFields.add("scope_of_work");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("work_visa_required");
    openapiFields.add("time_off_type");
    openapiFields.add("probation_period");
    openapiFields.add("calculated_holidays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorContractCreatedEmployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorContractCreatedEmployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorContractCreatedEmployment is not found in the empty JSON string", EorContractCreatedEmployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorContractCreatedEmployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorContractCreatedEmployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("time_off_type") != null && !jsonObj.get("time_off_type").isJsonNull()) && !jsonObj.get("time_off_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type").toString()));
      }
      if ((jsonObj.get("calculated_holidays") != null && !jsonObj.get("calculated_holidays").isJsonNull()) && !jsonObj.get("calculated_holidays").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculated_holidays` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculated_holidays").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorContractCreatedEmployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorContractCreatedEmployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorContractCreatedEmployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorContractCreatedEmployment.class));

       return (TypeAdapter<T>) new TypeAdapter<EorContractCreatedEmployment>() {
           @Override
           public void write(JsonWriter out, EorContractCreatedEmployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorContractCreatedEmployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorContractCreatedEmployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorContractCreatedEmployment
   * @throws IOException if the JSON string is invalid with respect to EorContractCreatedEmployment
   */
  public static EorContractCreatedEmployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorContractCreatedEmployment.class);
  }

  /**
   * Convert an instance of EorContractCreatedEmployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

