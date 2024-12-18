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
import java.time.OffsetDateTime;
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
 * DeleteGroup200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T13:47:44.629538829Z[GMT]", comments = "Generator version: 7.10.0")
public class DeleteGroup200ResponseData {
  public static final String SERIALIZED_NAME_ARCHIVED_AT = "archived_at";
  @SerializedName(SERIALIZED_NAME_ARCHIVED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime archivedAt;

  public DeleteGroup200ResponseData() {
  }

  public DeleteGroup200ResponseData archivedAt(@javax.annotation.Nullable OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * The timestamp when the group was archived.
   * @return archivedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(@javax.annotation.Nullable OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteGroup200ResponseData deleteGroup200ResponseData = (DeleteGroup200ResponseData) o;
    return Objects.equals(this.archivedAt, deleteGroup200ResponseData.archivedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archivedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteGroup200ResponseData {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
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
    openapiFields.add("archived_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteGroup200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteGroup200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteGroup200ResponseData is not found in the empty JSON string", DeleteGroup200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteGroup200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteGroup200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteGroup200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteGroup200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteGroup200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteGroup200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteGroup200ResponseData>() {
           @Override
           public void write(JsonWriter out, DeleteGroup200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteGroup200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteGroup200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteGroup200ResponseData
   * @throws IOException if the JSON string is invalid with respect to DeleteGroup200ResponseData
   */
  public static DeleteGroup200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteGroup200ResponseData.class);
  }

  /**
   * Convert an instance of DeleteGroup200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

