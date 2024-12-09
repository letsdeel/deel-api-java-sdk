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
 * EquityStakeholder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class EquityStakeholder {
  public static final String SERIALIZED_NAME_STAKEHOLDER_ID = "stakeholder_id";
  @SerializedName(SERIALIZED_NAME_STAKEHOLDER_ID)
  private String stakeholderId;

  public static final String SERIALIZED_NAME_WORKER_ID = "worker_id";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;

  public EquityStakeholder() {
  }

  public EquityStakeholder stakeholderId(String stakeholderId) {
    this.stakeholderId = stakeholderId;
    return this;
  }

  /**
   * Unique identifier of the stakeholder.
   * @return stakeholderId
   */
  @javax.annotation.Nullable
  public String getStakeholderId() {
    return stakeholderId;
  }

  public void setStakeholderId(String stakeholderId) {
    this.stakeholderId = stakeholderId;
  }


  public EquityStakeholder workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * Unique identifier of the worker.
   * @return workerId
   */
  @javax.annotation.Nullable
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquityStakeholder equityStakeholder = (EquityStakeholder) o;
    return Objects.equals(this.stakeholderId, equityStakeholder.stakeholderId) &&
        Objects.equals(this.workerId, equityStakeholder.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stakeholderId, workerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquityStakeholder {\n");
    sb.append("    stakeholderId: ").append(toIndentedString(stakeholderId)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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
    openapiFields.add("stakeholder_id");
    openapiFields.add("worker_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EquityStakeholder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EquityStakeholder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EquityStakeholder is not found in the empty JSON string", EquityStakeholder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EquityStakeholder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EquityStakeholder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stakeholder_id") != null && !jsonObj.get("stakeholder_id").isJsonNull()) && !jsonObj.get("stakeholder_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stakeholder_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stakeholder_id").toString()));
      }
      if ((jsonObj.get("worker_id") != null && !jsonObj.get("worker_id").isJsonNull()) && !jsonObj.get("worker_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EquityStakeholder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EquityStakeholder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EquityStakeholder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EquityStakeholder.class));

       return (TypeAdapter<T>) new TypeAdapter<EquityStakeholder>() {
           @Override
           public void write(JsonWriter out, EquityStakeholder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EquityStakeholder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EquityStakeholder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EquityStakeholder
   * @throws IOException if the JSON string is invalid with respect to EquityStakeholder
   */
  public static EquityStakeholder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EquityStakeholder.class);
  }

  /**
   * Convert an instance of EquityStakeholder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

