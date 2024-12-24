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
 * GetContractById200ResponseDataEmploymentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:03:48.437639881Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseDataEmploymentDetails {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_DAYS_PER_WEEK = "days_per_week";
  @SerializedName(SERIALIZED_NAME_DAYS_PER_WEEK)
  @javax.annotation.Nullable
  private BigDecimal daysPerWeek;

  public static final String SERIALIZED_NAME_HOURS_PER_DAY = "hours_per_day";
  @SerializedName(SERIALIZED_NAME_HOURS_PER_DAY)
  @javax.annotation.Nullable
  private BigDecimal hoursPerDay;

  public static final String SERIALIZED_NAME_PROBATION_PERIOD = "probation_period";
  @SerializedName(SERIALIZED_NAME_PROBATION_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal probationPeriod;

  public static final String SERIALIZED_NAME_PAID_VACATION_DAYS = "paid_vacation_days";
  @SerializedName(SERIALIZED_NAME_PAID_VACATION_DAYS)
  @javax.annotation.Nullable
  private BigDecimal paidVacationDays;

  public GetContractById200ResponseDataEmploymentDetails() {
  }

  public GetContractById200ResponseDataEmploymentDetails type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of employment.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GetContractById200ResponseDataEmploymentDetails daysPerWeek(@javax.annotation.Nullable BigDecimal daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
    return this;
  }

  /**
   * Number of days per week.
   * @return daysPerWeek
   */
  @javax.annotation.Nullable
  public BigDecimal getDaysPerWeek() {
    return daysPerWeek;
  }

  public void setDaysPerWeek(@javax.annotation.Nullable BigDecimal daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
  }


  public GetContractById200ResponseDataEmploymentDetails hoursPerDay(@javax.annotation.Nullable BigDecimal hoursPerDay) {
    this.hoursPerDay = hoursPerDay;
    return this;
  }

  /**
   * Number of hours per day.
   * @return hoursPerDay
   */
  @javax.annotation.Nullable
  public BigDecimal getHoursPerDay() {
    return hoursPerDay;
  }

  public void setHoursPerDay(@javax.annotation.Nullable BigDecimal hoursPerDay) {
    this.hoursPerDay = hoursPerDay;
  }


  public GetContractById200ResponseDataEmploymentDetails probationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
    return this;
  }

  /**
   * Probation period in days.
   * @return probationPeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getProbationPeriod() {
    return probationPeriod;
  }

  public void setProbationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
  }


  public GetContractById200ResponseDataEmploymentDetails paidVacationDays(@javax.annotation.Nullable BigDecimal paidVacationDays) {
    this.paidVacationDays = paidVacationDays;
    return this;
  }

  /**
   * Number of paid vacation days.
   * @return paidVacationDays
   */
  @javax.annotation.Nullable
  public BigDecimal getPaidVacationDays() {
    return paidVacationDays;
  }

  public void setPaidVacationDays(@javax.annotation.Nullable BigDecimal paidVacationDays) {
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
    GetContractById200ResponseDataEmploymentDetails getContractById200ResponseDataEmploymentDetails = (GetContractById200ResponseDataEmploymentDetails) o;
    return Objects.equals(this.type, getContractById200ResponseDataEmploymentDetails.type) &&
        Objects.equals(this.daysPerWeek, getContractById200ResponseDataEmploymentDetails.daysPerWeek) &&
        Objects.equals(this.hoursPerDay, getContractById200ResponseDataEmploymentDetails.hoursPerDay) &&
        Objects.equals(this.probationPeriod, getContractById200ResponseDataEmploymentDetails.probationPeriod) &&
        Objects.equals(this.paidVacationDays, getContractById200ResponseDataEmploymentDetails.paidVacationDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, daysPerWeek, hoursPerDay, probationPeriod, paidVacationDays);
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
    sb.append("class GetContractById200ResponseDataEmploymentDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("days_per_week");
    openapiFields.add("hours_per_day");
    openapiFields.add("probation_period");
    openapiFields.add("paid_vacation_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseDataEmploymentDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseDataEmploymentDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseDataEmploymentDetails is not found in the empty JSON string", GetContractById200ResponseDataEmploymentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseDataEmploymentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseDataEmploymentDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseDataEmploymentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseDataEmploymentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseDataEmploymentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseDataEmploymentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseDataEmploymentDetails>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseDataEmploymentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseDataEmploymentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseDataEmploymentDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseDataEmploymentDetails
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseDataEmploymentDetails
   */
  public static GetContractById200ResponseDataEmploymentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseDataEmploymentDetails.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseDataEmploymentDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

