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
import java.util.UUID;

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
 * UpdatePeopleDepartmentRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdatePeopleDepartmentRequestData {
  public static final String SERIALIZED_NAME_DEPARTMENT_ID = "department_id";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_ID)
  @javax.annotation.Nonnull
  private UUID departmentId;

  public UpdatePeopleDepartmentRequestData() {
  }

  public UpdatePeopleDepartmentRequestData departmentId(@javax.annotation.Nonnull UUID departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return departmentId
   */
  @javax.annotation.Nonnull
  public UUID getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(@javax.annotation.Nonnull UUID departmentId) {
    this.departmentId = departmentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePeopleDepartmentRequestData updatePeopleDepartmentRequestData = (UpdatePeopleDepartmentRequestData) o;
    return Objects.equals(this.departmentId, updatePeopleDepartmentRequestData.departmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePeopleDepartmentRequestData {\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
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
    openapiFields.add("department_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("department_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePeopleDepartmentRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePeopleDepartmentRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePeopleDepartmentRequestData is not found in the empty JSON string", UpdatePeopleDepartmentRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePeopleDepartmentRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePeopleDepartmentRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePeopleDepartmentRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("department_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePeopleDepartmentRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePeopleDepartmentRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePeopleDepartmentRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePeopleDepartmentRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePeopleDepartmentRequestData>() {
           @Override
           public void write(JsonWriter out, UpdatePeopleDepartmentRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePeopleDepartmentRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdatePeopleDepartmentRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePeopleDepartmentRequestData
   * @throws IOException if the JSON string is invalid with respect to UpdatePeopleDepartmentRequestData
   */
  public static UpdatePeopleDepartmentRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePeopleDepartmentRequestData.class);
  }

  /**
   * Convert an instance of UpdatePeopleDepartmentRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

