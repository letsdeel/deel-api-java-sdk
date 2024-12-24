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
 * CreateCase201ResponseDataProcess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateCase201ResponseDataProcess {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_STATUS_NAME = "status_name";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  @javax.annotation.Nonnull
  private String statusName;

  public static final String SERIALIZED_NAME_PROCESS_NAME = "process_name";
  @SerializedName(SERIALIZED_NAME_PROCESS_NAME)
  @javax.annotation.Nonnull
  private String processName;

  public CreateCase201ResponseDataProcess() {
  }

  public CreateCase201ResponseDataProcess id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the immigration process
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public CreateCase201ResponseDataProcess statusName(@javax.annotation.Nonnull String statusName) {
    this.statusName = statusName;
    return this;
  }

  /**
   * Human-readable status of the process
   * @return statusName
   */
  @javax.annotation.Nonnull
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(@javax.annotation.Nonnull String statusName) {
    this.statusName = statusName;
  }


  public CreateCase201ResponseDataProcess processName(@javax.annotation.Nonnull String processName) {
    this.processName = processName;
    return this;
  }

  /**
   * Name of the immigration process
   * @return processName
   */
  @javax.annotation.Nonnull
  public String getProcessName() {
    return processName;
  }

  public void setProcessName(@javax.annotation.Nonnull String processName) {
    this.processName = processName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCase201ResponseDataProcess createCase201ResponseDataProcess = (CreateCase201ResponseDataProcess) o;
    return Objects.equals(this.id, createCase201ResponseDataProcess.id) &&
        Objects.equals(this.statusName, createCase201ResponseDataProcess.statusName) &&
        Objects.equals(this.processName, createCase201ResponseDataProcess.processName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statusName, processName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCase201ResponseDataProcess {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("status_name");
    openapiFields.add("process_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status_name");
    openapiRequiredFields.add("process_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCase201ResponseDataProcess
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCase201ResponseDataProcess.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCase201ResponseDataProcess is not found in the empty JSON string", CreateCase201ResponseDataProcess.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCase201ResponseDataProcess.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCase201ResponseDataProcess` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCase201ResponseDataProcess.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("status_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_name").toString()));
      }
      if (!jsonObj.get("process_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `process_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("process_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCase201ResponseDataProcess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCase201ResponseDataProcess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCase201ResponseDataProcess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCase201ResponseDataProcess.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCase201ResponseDataProcess>() {
           @Override
           public void write(JsonWriter out, CreateCase201ResponseDataProcess value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCase201ResponseDataProcess read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCase201ResponseDataProcess given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCase201ResponseDataProcess
   * @throws IOException if the JSON string is invalid with respect to CreateCase201ResponseDataProcess
   */
  public static CreateCase201ResponseDataProcess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCase201ResponseDataProcess.class);
  }

  /**
   * Convert an instance of CreateCase201ResponseDataProcess to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

