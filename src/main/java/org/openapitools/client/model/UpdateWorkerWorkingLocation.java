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
 * UpdateWorkerWorkingLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class UpdateWorkerWorkingLocation {
  public static final String SERIALIZED_NAME_WORKING_LOCATION_ID = "working_location_id";
  @SerializedName(SERIALIZED_NAME_WORKING_LOCATION_ID)
  private String workingLocationId;

  public UpdateWorkerWorkingLocation() {
  }

  public UpdateWorkerWorkingLocation workingLocationId(String workingLocationId) {
    this.workingLocationId = workingLocationId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return workingLocationId
   */
  @javax.annotation.Nonnull
  public String getWorkingLocationId() {
    return workingLocationId;
  }

  public void setWorkingLocationId(String workingLocationId) {
    this.workingLocationId = workingLocationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkerWorkingLocation updateWorkerWorkingLocation = (UpdateWorkerWorkingLocation) o;
    return Objects.equals(this.workingLocationId, updateWorkerWorkingLocation.workingLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workingLocationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkerWorkingLocation {\n");
    sb.append("    workingLocationId: ").append(toIndentedString(workingLocationId)).append("\n");
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
    openapiFields.add("working_location_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("working_location_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateWorkerWorkingLocation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateWorkerWorkingLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWorkerWorkingLocation is not found in the empty JSON string", UpdateWorkerWorkingLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateWorkerWorkingLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWorkerWorkingLocation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateWorkerWorkingLocation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("working_location_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `working_location_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("working_location_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWorkerWorkingLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWorkerWorkingLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWorkerWorkingLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWorkerWorkingLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWorkerWorkingLocation>() {
           @Override
           public void write(JsonWriter out, UpdateWorkerWorkingLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWorkerWorkingLocation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateWorkerWorkingLocation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateWorkerWorkingLocation
   * @throws IOException if the JSON string is invalid with respect to UpdateWorkerWorkingLocation
   */
  public static UpdateWorkerWorkingLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWorkerWorkingLocation.class);
  }

  /**
   * Convert an instance of UpdateWorkerWorkingLocation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
