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
 * CreateContract201ResponseDataEmploymentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataEmploymentDetails {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_DAYS_PER_WEEK = "days_per_week";
  @SerializedName(SERIALIZED_NAME_DAYS_PER_WEEK)
  @javax.annotation.Nonnull
  private BigDecimal daysPerWeek;

  public static final String SERIALIZED_NAME_HOURS_PER_DAY = "hours_per_day";
  @SerializedName(SERIALIZED_NAME_HOURS_PER_DAY)
  @javax.annotation.Nonnull
  private BigDecimal hoursPerDay;

  public static final String SERIALIZED_NAME_PROBATION_PERIOD = "probation_period";
  @SerializedName(SERIALIZED_NAME_PROBATION_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal probationPeriod;

  public static final String SERIALIZED_NAME_PAID_VACATION_DAYS = "paid_vacation_days";
  @SerializedName(SERIALIZED_NAME_PAID_VACATION_DAYS)
  @javax.annotation.Nonnull
  private BigDecimal paidVacationDays;

  public CreateContract201ResponseDataEmploymentDetails() {
  }

  public CreateContract201ResponseDataEmploymentDetails type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public CreateContract201ResponseDataEmploymentDetails state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State code.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public CreateContract201ResponseDataEmploymentDetails country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public CreateContract201ResponseDataEmploymentDetails daysPerWeek(@javax.annotation.Nonnull BigDecimal daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
    return this;
  }

  /**
   * Number of days per week
   * @return daysPerWeek
   */
  @javax.annotation.Nonnull
  public BigDecimal getDaysPerWeek() {
    return daysPerWeek;
  }

  public void setDaysPerWeek(@javax.annotation.Nonnull BigDecimal daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
  }


  public CreateContract201ResponseDataEmploymentDetails hoursPerDay(@javax.annotation.Nonnull BigDecimal hoursPerDay) {
    this.hoursPerDay = hoursPerDay;
    return this;
  }

  /**
   * Number of hours per day
   * @return hoursPerDay
   */
  @javax.annotation.Nonnull
  public BigDecimal getHoursPerDay() {
    return hoursPerDay;
  }

  public void setHoursPerDay(@javax.annotation.Nonnull BigDecimal hoursPerDay) {
    this.hoursPerDay = hoursPerDay;
  }


  public CreateContract201ResponseDataEmploymentDetails probationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
    return this;
  }

  /**
   * Number of days for probation period
   * @return probationPeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getProbationPeriod() {
    return probationPeriod;
  }

  public void setProbationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
  }


  public CreateContract201ResponseDataEmploymentDetails paidVacationDays(@javax.annotation.Nonnull BigDecimal paidVacationDays) {
    this.paidVacationDays = paidVacationDays;
    return this;
  }

  /**
   * Number of paid vacation days
   * @return paidVacationDays
   */
  @javax.annotation.Nonnull
  public BigDecimal getPaidVacationDays() {
    return paidVacationDays;
  }

  public void setPaidVacationDays(@javax.annotation.Nonnull BigDecimal paidVacationDays) {
    this.paidVacationDays = paidVacationDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract201ResponseDataEmploymentDetails createContract201ResponseDataEmploymentDetails = (CreateContract201ResponseDataEmploymentDetails) o;
    return Objects.equals(this.type, createContract201ResponseDataEmploymentDetails.type) &&
        Objects.equals(this.state, createContract201ResponseDataEmploymentDetails.state) &&
        Objects.equals(this.country, createContract201ResponseDataEmploymentDetails.country) &&
        Objects.equals(this.daysPerWeek, createContract201ResponseDataEmploymentDetails.daysPerWeek) &&
        Objects.equals(this.hoursPerDay, createContract201ResponseDataEmploymentDetails.hoursPerDay) &&
        Objects.equals(this.probationPeriod, createContract201ResponseDataEmploymentDetails.probationPeriod) &&
        Objects.equals(this.paidVacationDays, createContract201ResponseDataEmploymentDetails.paidVacationDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, state, country, daysPerWeek, hoursPerDay, probationPeriod, paidVacationDays);
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
    sb.append("class CreateContract201ResponseDataEmploymentDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    daysPerWeek: ").append(toIndentedString(daysPerWeek)).append("\n");
    sb.append("    hoursPerDay: ").append(toIndentedString(hoursPerDay)).append("\n");
    sb.append("    probationPeriod: ").append(toIndentedString(probationPeriod)).append("\n");
    sb.append("    paidVacationDays: ").append(toIndentedString(paidVacationDays)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("days_per_week");
    openapiFields.add("hours_per_day");
    openapiFields.add("probation_period");
    openapiFields.add("paid_vacation_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("days_per_week");
    openapiRequiredFields.add("hours_per_day");
    openapiRequiredFields.add("probation_period");
    openapiRequiredFields.add("paid_vacation_days");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataEmploymentDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataEmploymentDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataEmploymentDetails is not found in the empty JSON string", CreateContract201ResponseDataEmploymentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataEmploymentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataEmploymentDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateContract201ResponseDataEmploymentDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataEmploymentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataEmploymentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataEmploymentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataEmploymentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataEmploymentDetails>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataEmploymentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataEmploymentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataEmploymentDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataEmploymentDetails
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataEmploymentDetails
   */
  public static CreateContract201ResponseDataEmploymentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataEmploymentDetails.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataEmploymentDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

