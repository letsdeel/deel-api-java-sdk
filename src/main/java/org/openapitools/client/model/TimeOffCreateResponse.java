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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.TimeOffResponseCommon;

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
 * TimeOffCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class TimeOffCreateResponse {
  public static final String SERIALIZED_NAME_TIME_OFFS = "time_offs";
  @SerializedName(SERIALIZED_NAME_TIME_OFFS)
  @javax.annotation.Nonnull
  private List<TimeOffResponseCommon> timeOffs = new ArrayList<>();

  public TimeOffCreateResponse() {
  }

  public TimeOffCreateResponse timeOffs(@javax.annotation.Nonnull List<TimeOffResponseCommon> timeOffs) {
    this.timeOffs = timeOffs;
    return this;
  }

  public TimeOffCreateResponse addTimeOffsItem(TimeOffResponseCommon timeOffsItem) {
    if (this.timeOffs == null) {
      this.timeOffs = new ArrayList<>();
    }
    this.timeOffs.add(timeOffsItem);
    return this;
  }

  /**
   * Get timeOffs
   * @return timeOffs
   */
  @javax.annotation.Nonnull
  public List<TimeOffResponseCommon> getTimeOffs() {
    return timeOffs;
  }

  public void setTimeOffs(@javax.annotation.Nonnull List<TimeOffResponseCommon> timeOffs) {
    this.timeOffs = timeOffs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffCreateResponse timeOffCreateResponse = (TimeOffCreateResponse) o;
    return Objects.equals(this.timeOffs, timeOffCreateResponse.timeOffs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffCreateResponse {\n");
    sb.append("    timeOffs: ").append(toIndentedString(timeOffs)).append("\n");
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
    openapiFields.add("time_offs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("time_offs");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeOffCreateResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeOffCreateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeOffCreateResponse is not found in the empty JSON string", TimeOffCreateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeOffCreateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeOffCreateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeOffCreateResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("time_offs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_offs` to be an array in the JSON string but got `%s`", jsonObj.get("time_offs").toString()));
      }

      JsonArray jsonArraytimeOffs = jsonObj.getAsJsonArray("time_offs");
      // validate the required field `time_offs` (array)
      for (int i = 0; i < jsonArraytimeOffs.size(); i++) {
        TimeOffResponseCommon.validateJsonElement(jsonArraytimeOffs.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeOffCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeOffCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeOffCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeOffCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeOffCreateResponse>() {
           @Override
           public void write(JsonWriter out, TimeOffCreateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeOffCreateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeOffCreateResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeOffCreateResponse
   * @throws IOException if the JSON string is invalid with respect to TimeOffCreateResponse
   */
  public static TimeOffCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeOffCreateResponse.class);
  }

  /**
   * Convert an instance of TimeOffCreateResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

