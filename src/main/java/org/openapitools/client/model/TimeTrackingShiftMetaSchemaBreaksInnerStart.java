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
 * Start details of the break
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class TimeTrackingShiftMetaSchemaBreaksInnerStart {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public TimeTrackingShiftMetaSchemaBreaksInnerStart() {
  }

  public TimeTrackingShiftMetaSchemaBreaksInnerStart date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Break start date in YYYY-MM-DD format
   * @return date
   */
  @javax.annotation.Nonnull
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public TimeTrackingShiftMetaSchemaBreaksInnerStart time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Break start time in HH:MM format
   * @return time
   */
  @javax.annotation.Nonnull
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingShiftMetaSchemaBreaksInnerStart timeTrackingShiftMetaSchemaBreaksInnerStart = (TimeTrackingShiftMetaSchemaBreaksInnerStart) o;
    return Objects.equals(this.date, timeTrackingShiftMetaSchemaBreaksInnerStart.date) &&
        Objects.equals(this.time, timeTrackingShiftMetaSchemaBreaksInnerStart.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingShiftMetaSchemaBreaksInnerStart {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("time");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeTrackingShiftMetaSchemaBreaksInnerStart
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeTrackingShiftMetaSchemaBreaksInnerStart.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingShiftMetaSchemaBreaksInnerStart is not found in the empty JSON string", TimeTrackingShiftMetaSchemaBreaksInnerStart.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeTrackingShiftMetaSchemaBreaksInnerStart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeTrackingShiftMetaSchemaBreaksInnerStart` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeTrackingShiftMetaSchemaBreaksInnerStart.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (!jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingShiftMetaSchemaBreaksInnerStart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingShiftMetaSchemaBreaksInnerStart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingShiftMetaSchemaBreaksInnerStart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingShiftMetaSchemaBreaksInnerStart.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingShiftMetaSchemaBreaksInnerStart>() {
           @Override
           public void write(JsonWriter out, TimeTrackingShiftMetaSchemaBreaksInnerStart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeTrackingShiftMetaSchemaBreaksInnerStart read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeTrackingShiftMetaSchemaBreaksInnerStart given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeTrackingShiftMetaSchemaBreaksInnerStart
   * @throws IOException if the JSON string is invalid with respect to TimeTrackingShiftMetaSchemaBreaksInnerStart
   */
  public static TimeTrackingShiftMetaSchemaBreaksInnerStart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingShiftMetaSchemaBreaksInnerStart.class);
  }

  /**
   * Convert an instance of TimeTrackingShiftMetaSchemaBreaksInnerStart to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

