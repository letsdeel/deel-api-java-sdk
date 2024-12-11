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
 * GetTimesheetsByContract200ResponseDataInnerWorksheet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class GetTimesheetsByContract200ResponseDataInnerWorksheet {
  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  @javax.annotation.Nonnull
  private BigDecimal days;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  @javax.annotation.Nonnull
  private BigDecimal hours;

  public static final String SERIALIZED_NAME_WEEKS = "weeks";
  @SerializedName(SERIALIZED_NAME_WEEKS)
  @javax.annotation.Nonnull
  private BigDecimal weeks;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  @javax.annotation.Nonnull
  private BigDecimal minutes;

  public GetTimesheetsByContract200ResponseDataInnerWorksheet() {
  }

  public GetTimesheetsByContract200ResponseDataInnerWorksheet days(@javax.annotation.Nonnull BigDecimal days) {
    this.days = days;
    return this;
  }

  /**
   * Get days
   * minimum: 0
   * @return days
   */
  @javax.annotation.Nonnull
  public BigDecimal getDays() {
    return days;
  }

  public void setDays(@javax.annotation.Nonnull BigDecimal days) {
    this.days = days;
  }


  public GetTimesheetsByContract200ResponseDataInnerWorksheet hours(@javax.annotation.Nonnull BigDecimal hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * minimum: 0
   * @return hours
   */
  @javax.annotation.Nonnull
  public BigDecimal getHours() {
    return hours;
  }

  public void setHours(@javax.annotation.Nonnull BigDecimal hours) {
    this.hours = hours;
  }


  public GetTimesheetsByContract200ResponseDataInnerWorksheet weeks(@javax.annotation.Nonnull BigDecimal weeks) {
    this.weeks = weeks;
    return this;
  }

  /**
   * Get weeks
   * minimum: 0
   * @return weeks
   */
  @javax.annotation.Nonnull
  public BigDecimal getWeeks() {
    return weeks;
  }

  public void setWeeks(@javax.annotation.Nonnull BigDecimal weeks) {
    this.weeks = weeks;
  }


  public GetTimesheetsByContract200ResponseDataInnerWorksheet minutes(@javax.annotation.Nonnull BigDecimal minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * minimum: 0
   * @return minutes
   */
  @javax.annotation.Nonnull
  public BigDecimal getMinutes() {
    return minutes;
  }

  public void setMinutes(@javax.annotation.Nonnull BigDecimal minutes) {
    this.minutes = minutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimesheetsByContract200ResponseDataInnerWorksheet getTimesheetsByContract200ResponseDataInnerWorksheet = (GetTimesheetsByContract200ResponseDataInnerWorksheet) o;
    return Objects.equals(this.days, getTimesheetsByContract200ResponseDataInnerWorksheet.days) &&
        Objects.equals(this.hours, getTimesheetsByContract200ResponseDataInnerWorksheet.hours) &&
        Objects.equals(this.weeks, getTimesheetsByContract200ResponseDataInnerWorksheet.weeks) &&
        Objects.equals(this.minutes, getTimesheetsByContract200ResponseDataInnerWorksheet.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, hours, weeks, minutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimesheetsByContract200ResponseDataInnerWorksheet {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
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
    openapiFields.add("days");
    openapiFields.add("hours");
    openapiFields.add("weeks");
    openapiFields.add("minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("days");
    openapiRequiredFields.add("hours");
    openapiRequiredFields.add("weeks");
    openapiRequiredFields.add("minutes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetTimesheetsByContract200ResponseDataInnerWorksheet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTimesheetsByContract200ResponseDataInnerWorksheet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTimesheetsByContract200ResponseDataInnerWorksheet is not found in the empty JSON string", GetTimesheetsByContract200ResponseDataInnerWorksheet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTimesheetsByContract200ResponseDataInnerWorksheet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTimesheetsByContract200ResponseDataInnerWorksheet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTimesheetsByContract200ResponseDataInnerWorksheet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTimesheetsByContract200ResponseDataInnerWorksheet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTimesheetsByContract200ResponseDataInnerWorksheet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTimesheetsByContract200ResponseDataInnerWorksheet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTimesheetsByContract200ResponseDataInnerWorksheet.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTimesheetsByContract200ResponseDataInnerWorksheet>() {
           @Override
           public void write(JsonWriter out, GetTimesheetsByContract200ResponseDataInnerWorksheet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTimesheetsByContract200ResponseDataInnerWorksheet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTimesheetsByContract200ResponseDataInnerWorksheet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTimesheetsByContract200ResponseDataInnerWorksheet
   * @throws IOException if the JSON string is invalid with respect to GetTimesheetsByContract200ResponseDataInnerWorksheet
   */
  public static GetTimesheetsByContract200ResponseDataInnerWorksheet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTimesheetsByContract200ResponseDataInnerWorksheet.class);
  }

  /**
   * Convert an instance of GetTimesheetsByContract200ResponseDataInnerWorksheet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

