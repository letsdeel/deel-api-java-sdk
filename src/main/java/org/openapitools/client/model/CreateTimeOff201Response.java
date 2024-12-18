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
import org.openapitools.client.model.CreateTimeOff201ResponseTimeOffsInner;

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
 * CreateTimeOff201Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTimeOff201Response {
  public static final String SERIALIZED_NAME_TIME_OFFS = "time_offs";
  @SerializedName(SERIALIZED_NAME_TIME_OFFS)
  @javax.annotation.Nonnull
  private List<CreateTimeOff201ResponseTimeOffsInner> timeOffs = new ArrayList<>();

  public CreateTimeOff201Response() {
  }

  public CreateTimeOff201Response timeOffs(@javax.annotation.Nonnull List<CreateTimeOff201ResponseTimeOffsInner> timeOffs) {
    this.timeOffs = timeOffs;
    return this;
  }

  public CreateTimeOff201Response addTimeOffsItem(CreateTimeOff201ResponseTimeOffsInner timeOffsItem) {
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
  public List<CreateTimeOff201ResponseTimeOffsInner> getTimeOffs() {
    return timeOffs;
  }

  public void setTimeOffs(@javax.annotation.Nonnull List<CreateTimeOff201ResponseTimeOffsInner> timeOffs) {
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
    CreateTimeOff201Response createTimeOff201Response = (CreateTimeOff201Response) o;
    return Objects.equals(this.timeOffs, createTimeOff201Response.timeOffs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeOff201Response {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to CreateTimeOff201Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimeOff201Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimeOff201Response is not found in the empty JSON string", CreateTimeOff201Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimeOff201Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimeOff201Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTimeOff201Response.openapiRequiredFields) {
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
        CreateTimeOff201ResponseTimeOffsInner.validateJsonElement(jsonArraytimeOffs.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimeOff201Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimeOff201Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimeOff201Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimeOff201Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimeOff201Response>() {
           @Override
           public void write(JsonWriter out, CreateTimeOff201Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimeOff201Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimeOff201Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimeOff201Response
   * @throws IOException if the JSON string is invalid with respect to CreateTimeOff201Response
   */
  public static CreateTimeOff201Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimeOff201Response.class);
  }

  /**
   * Convert an instance of CreateTimeOff201Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

