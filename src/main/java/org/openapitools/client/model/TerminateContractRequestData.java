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
import java.time.LocalDate;
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
 * TerminateContractRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class TerminateContractRequestData {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_TERMINATE_NOW = "terminate_now";
  @SerializedName(SERIALIZED_NAME_TERMINATE_NOW)
  @javax.annotation.Nullable
  private Boolean terminateNow = false;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completion_date";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  @javax.annotation.Nullable
  private LocalDate completionDate;

  public TerminateContractRequestData() {
  }

  public TerminateContractRequestData message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Termination message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public TerminateContractRequestData terminateNow(@javax.annotation.Nullable Boolean terminateNow) {
    this.terminateNow = terminateNow;
    return this;
  }

  /**
   * Terminate contract immediately
   * @return terminateNow
   */
  @javax.annotation.Nullable
  public Boolean getTerminateNow() {
    return terminateNow;
  }

  public void setTerminateNow(@javax.annotation.Nullable Boolean terminateNow) {
    this.terminateNow = terminateNow;
  }


  public TerminateContractRequestData completionDate(@javax.annotation.Nullable LocalDate completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Contract completion date
   * @return completionDate
   */
  @javax.annotation.Nullable
  public LocalDate getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@javax.annotation.Nullable LocalDate completionDate) {
    this.completionDate = completionDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminateContractRequestData terminateContractRequestData = (TerminateContractRequestData) o;
    return Objects.equals(this.message, terminateContractRequestData.message) &&
        Objects.equals(this.terminateNow, terminateContractRequestData.terminateNow) &&
        Objects.equals(this.completionDate, terminateContractRequestData.completionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, terminateNow, completionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminateContractRequestData {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    terminateNow: ").append(toIndentedString(terminateNow)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("terminate_now");
    openapiFields.add("completion_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TerminateContractRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerminateContractRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminateContractRequestData is not found in the empty JSON string", TerminateContractRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerminateContractRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerminateContractRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminateContractRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminateContractRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminateContractRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminateContractRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminateContractRequestData>() {
           @Override
           public void write(JsonWriter out, TerminateContractRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminateContractRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TerminateContractRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminateContractRequestData
   * @throws IOException if the JSON string is invalid with respect to TerminateContractRequestData
   */
  public static TerminateContractRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminateContractRequestData.class);
  }

  /**
   * Convert an instance of TerminateContractRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

