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
import org.openapitools.client.model.EorCountryValidationsWorkScheduleDays;
import org.openapitools.client.model.EorCountryValidationsWorkScheduleHours;

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
 * Employee&#39;s Work schedule in days and hours.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class EorCountryValidationsWorkSchedule {
  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  @javax.annotation.Nullable
  private EorCountryValidationsWorkScheduleDays days;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  @javax.annotation.Nullable
  private EorCountryValidationsWorkScheduleHours hours;

  public EorCountryValidationsWorkSchedule() {
  }

  public EorCountryValidationsWorkSchedule days(@javax.annotation.Nullable EorCountryValidationsWorkScheduleDays days) {
    this.days = days;
    return this;
  }

  /**
   * Get days
   * @return days
   */
  @javax.annotation.Nullable
  public EorCountryValidationsWorkScheduleDays getDays() {
    return days;
  }

  public void setDays(@javax.annotation.Nullable EorCountryValidationsWorkScheduleDays days) {
    this.days = days;
  }


  public EorCountryValidationsWorkSchedule hours(@javax.annotation.Nullable EorCountryValidationsWorkScheduleHours hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
   */
  @javax.annotation.Nullable
  public EorCountryValidationsWorkScheduleHours getHours() {
    return hours;
  }

  public void setHours(@javax.annotation.Nullable EorCountryValidationsWorkScheduleHours hours) {
    this.hours = hours;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorCountryValidationsWorkSchedule eorCountryValidationsWorkSchedule = (EorCountryValidationsWorkSchedule) o;
    return Objects.equals(this.days, eorCountryValidationsWorkSchedule.days) &&
        Objects.equals(this.hours, eorCountryValidationsWorkSchedule.hours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, hours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorCountryValidationsWorkSchedule {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorCountryValidationsWorkSchedule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorCountryValidationsWorkSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorCountryValidationsWorkSchedule is not found in the empty JSON string", EorCountryValidationsWorkSchedule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorCountryValidationsWorkSchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorCountryValidationsWorkSchedule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `days`
      if (jsonObj.get("days") != null && !jsonObj.get("days").isJsonNull()) {
        EorCountryValidationsWorkScheduleDays.validateJsonElement(jsonObj.get("days"));
      }
      // validate the optional field `hours`
      if (jsonObj.get("hours") != null && !jsonObj.get("hours").isJsonNull()) {
        EorCountryValidationsWorkScheduleHours.validateJsonElement(jsonObj.get("hours"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorCountryValidationsWorkSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorCountryValidationsWorkSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorCountryValidationsWorkSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorCountryValidationsWorkSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<EorCountryValidationsWorkSchedule>() {
           @Override
           public void write(JsonWriter out, EorCountryValidationsWorkSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorCountryValidationsWorkSchedule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorCountryValidationsWorkSchedule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorCountryValidationsWorkSchedule
   * @throws IOException if the JSON string is invalid with respect to EorCountryValidationsWorkSchedule
   */
  public static EorCountryValidationsWorkSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorCountryValidationsWorkSchedule.class);
  }

  /**
   * Convert an instance of EorCountryValidationsWorkSchedule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

