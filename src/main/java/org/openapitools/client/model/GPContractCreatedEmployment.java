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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.GPContractCreatedEmploymentHolidays;
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
 * GPContractCreatedEmployment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class GPContractCreatedEmployment {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_WORK_VISA_REQUIRED = "work_visa_required";
  @SerializedName(SERIALIZED_NAME_WORK_VISA_REQUIRED)
  @javax.annotation.Nullable
  private Boolean workVisaRequired;

  public static final String SERIALIZED_NAME_HOLIDAYS = "holidays";
  @SerializedName(SERIALIZED_NAME_HOLIDAYS)
  @javax.annotation.Nullable
  private GPContractCreatedEmploymentHolidays holidays;

  public GPContractCreatedEmployment() {
  }

  public GPContractCreatedEmployment startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
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


  public GPContractCreatedEmployment endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return endDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public GPContractCreatedEmployment country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of employment.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GPContractCreatedEmployment state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State code of the state/province where this person will be employed.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public GPContractCreatedEmployment type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Is it a full-time contract or a part-time contract?
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GPContractCreatedEmployment workVisaRequired(@javax.annotation.Nullable Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
    return this;
  }

  /**
   * Do you require Deel to apply for a work visa for this person?
   * @return workVisaRequired
   */
  @javax.annotation.Nullable
  public Boolean getWorkVisaRequired() {
    return workVisaRequired;
  }

  public void setWorkVisaRequired(@javax.annotation.Nullable Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
  }


  public GPContractCreatedEmployment holidays(@javax.annotation.Nullable GPContractCreatedEmploymentHolidays holidays) {
    this.holidays = holidays;
    return this;
  }

  /**
   * Get holidays
   * @return holidays
   */
  @javax.annotation.Nullable
  public GPContractCreatedEmploymentHolidays getHolidays() {
    return holidays;
  }

  public void setHolidays(@javax.annotation.Nullable GPContractCreatedEmploymentHolidays holidays) {
    this.holidays = holidays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPContractCreatedEmployment gpContractCreatedEmployment = (GPContractCreatedEmployment) o;
    return Objects.equals(this.startDate, gpContractCreatedEmployment.startDate) &&
        Objects.equals(this.endDate, gpContractCreatedEmployment.endDate) &&
        Objects.equals(this.country, gpContractCreatedEmployment.country) &&
        Objects.equals(this.state, gpContractCreatedEmployment.state) &&
        Objects.equals(this.type, gpContractCreatedEmployment.type) &&
        Objects.equals(this.workVisaRequired, gpContractCreatedEmployment.workVisaRequired) &&
        Objects.equals(this.holidays, gpContractCreatedEmployment.holidays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, country, state, type, workVisaRequired, holidays);
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
    sb.append("class GPContractCreatedEmployment {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workVisaRequired: ").append(toIndentedString(workVisaRequired)).append("\n");
    sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
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
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("work_visa_required");
    openapiFields.add("holidays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPContractCreatedEmployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPContractCreatedEmployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractCreatedEmployment is not found in the empty JSON string", GPContractCreatedEmployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPContractCreatedEmployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPContractCreatedEmployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `holidays`
      if (jsonObj.get("holidays") != null && !jsonObj.get("holidays").isJsonNull()) {
        GPContractCreatedEmploymentHolidays.validateJsonElement(jsonObj.get("holidays"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractCreatedEmployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractCreatedEmployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractCreatedEmployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractCreatedEmployment.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractCreatedEmployment>() {
           @Override
           public void write(JsonWriter out, GPContractCreatedEmployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPContractCreatedEmployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPContractCreatedEmployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPContractCreatedEmployment
   * @throws IOException if the JSON string is invalid with respect to GPContractCreatedEmployment
   */
  public static GPContractCreatedEmployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractCreatedEmployment.class);
  }

  /**
   * Convert an instance of GPContractCreatedEmployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

