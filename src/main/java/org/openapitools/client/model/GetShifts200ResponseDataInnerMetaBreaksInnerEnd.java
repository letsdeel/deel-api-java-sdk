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
 * GetShifts200ResponseDataInnerMetaBreaksInnerEnd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class GetShifts200ResponseDataInnerMetaBreaksInnerEnd {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  @javax.annotation.Nullable
  private String time;

  public GetShifts200ResponseDataInnerMetaBreaksInnerEnd() {
  }

  public GetShifts200ResponseDataInnerMetaBreaksInnerEnd date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Break end date.
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public GetShifts200ResponseDataInnerMetaBreaksInnerEnd time(@javax.annotation.Nullable String time) {
    this.time = time;
    return this;
  }

  /**
   * Break end time.
   * @return time
   */
  @javax.annotation.Nullable
  public String getTime() {
    return time;
  }

  public void setTime(@javax.annotation.Nullable String time) {
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
    GetShifts200ResponseDataInnerMetaBreaksInnerEnd getShifts200ResponseDataInnerMetaBreaksInnerEnd = (GetShifts200ResponseDataInnerMetaBreaksInnerEnd) o;
    return Objects.equals(this.date, getShifts200ResponseDataInnerMetaBreaksInnerEnd.date) &&
        Objects.equals(this.time, getShifts200ResponseDataInnerMetaBreaksInnerEnd.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShifts200ResponseDataInnerMetaBreaksInnerEnd {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetShifts200ResponseDataInnerMetaBreaksInnerEnd
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetShifts200ResponseDataInnerMetaBreaksInnerEnd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetShifts200ResponseDataInnerMetaBreaksInnerEnd is not found in the empty JSON string", GetShifts200ResponseDataInnerMetaBreaksInnerEnd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetShifts200ResponseDataInnerMetaBreaksInnerEnd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetShifts200ResponseDataInnerMetaBreaksInnerEnd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("time") != null && !jsonObj.get("time").isJsonNull()) && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetShifts200ResponseDataInnerMetaBreaksInnerEnd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetShifts200ResponseDataInnerMetaBreaksInnerEnd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetShifts200ResponseDataInnerMetaBreaksInnerEnd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetShifts200ResponseDataInnerMetaBreaksInnerEnd.class));

       return (TypeAdapter<T>) new TypeAdapter<GetShifts200ResponseDataInnerMetaBreaksInnerEnd>() {
           @Override
           public void write(JsonWriter out, GetShifts200ResponseDataInnerMetaBreaksInnerEnd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetShifts200ResponseDataInnerMetaBreaksInnerEnd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetShifts200ResponseDataInnerMetaBreaksInnerEnd given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetShifts200ResponseDataInnerMetaBreaksInnerEnd
   * @throws IOException if the JSON string is invalid with respect to GetShifts200ResponseDataInnerMetaBreaksInnerEnd
   */
  public static GetShifts200ResponseDataInnerMetaBreaksInnerEnd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetShifts200ResponseDataInnerMetaBreaksInnerEnd.class);
  }

  /**
   * Convert an instance of GetShifts200ResponseDataInnerMetaBreaksInnerEnd to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

