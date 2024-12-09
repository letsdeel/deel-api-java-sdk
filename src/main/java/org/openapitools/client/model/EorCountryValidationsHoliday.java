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
 * Range of the number of holidays.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class EorCountryValidationsHoliday {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private String min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private String max;

  public static final String SERIALIZED_NAME_MOST_COMMON = "mostCommon";
  @SerializedName(SERIALIZED_NAME_MOST_COMMON)
  private String mostCommon;

  public EorCountryValidationsHoliday() {
  }

  public EorCountryValidationsHoliday min(String min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum number of holidays required for a legally compliant contract.
   * @return min
   */
  @javax.annotation.Nullable
  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }


  public EorCountryValidationsHoliday max(String max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum number of holidays required for a legally compliant contract.
   * @return max
   */
  @javax.annotation.Nullable
  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }


  public EorCountryValidationsHoliday mostCommon(String mostCommon) {
    this.mostCommon = mostCommon;
    return this;
  }

  /**
   * Most common number of holidays
   * @return mostCommon
   */
  @javax.annotation.Nullable
  public String getMostCommon() {
    return mostCommon;
  }

  public void setMostCommon(String mostCommon) {
    this.mostCommon = mostCommon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorCountryValidationsHoliday eorCountryValidationsHoliday = (EorCountryValidationsHoliday) o;
    return Objects.equals(this.min, eorCountryValidationsHoliday.min) &&
        Objects.equals(this.max, eorCountryValidationsHoliday.max) &&
        Objects.equals(this.mostCommon, eorCountryValidationsHoliday.mostCommon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, mostCommon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorCountryValidationsHoliday {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mostCommon: ").append(toIndentedString(mostCommon)).append("\n");
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
    openapiFields.add("min");
    openapiFields.add("max");
    openapiFields.add("mostCommon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorCountryValidationsHoliday
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorCountryValidationsHoliday.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorCountryValidationsHoliday is not found in the empty JSON string", EorCountryValidationsHoliday.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorCountryValidationsHoliday.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorCountryValidationsHoliday` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("min") != null && !jsonObj.get("min").isJsonNull()) && !jsonObj.get("min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min").toString()));
      }
      if ((jsonObj.get("max") != null && !jsonObj.get("max").isJsonNull()) && !jsonObj.get("max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max").toString()));
      }
      if ((jsonObj.get("mostCommon") != null && !jsonObj.get("mostCommon").isJsonNull()) && !jsonObj.get("mostCommon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mostCommon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mostCommon").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorCountryValidationsHoliday.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorCountryValidationsHoliday' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorCountryValidationsHoliday> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorCountryValidationsHoliday.class));

       return (TypeAdapter<T>) new TypeAdapter<EorCountryValidationsHoliday>() {
           @Override
           public void write(JsonWriter out, EorCountryValidationsHoliday value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorCountryValidationsHoliday read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorCountryValidationsHoliday given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorCountryValidationsHoliday
   * @throws IOException if the JSON string is invalid with respect to EorCountryValidationsHoliday
   */
  public static EorCountryValidationsHoliday fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorCountryValidationsHoliday.class);
  }

  /**
   * Convert an instance of EorCountryValidationsHoliday to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
