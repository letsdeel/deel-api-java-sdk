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
 * UpsertParentWorkerRelationsRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertParentWorkerRelationsRequestData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID = "hris_relationship_type_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID)
  @javax.annotation.Nonnull
  private UUID hrisRelationshipTypeId;

  public UpsertParentWorkerRelationsRequestData() {
  }

  public UpsertParentWorkerRelationsRequestData id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the parent profile
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public UpsertParentWorkerRelationsRequestData hrisRelationshipTypeId(@javax.annotation.Nonnull UUID hrisRelationshipTypeId) {
    this.hrisRelationshipTypeId = hrisRelationshipTypeId;
    return this;
  }

  /**
   * The ID of the relationship type
   * @return hrisRelationshipTypeId
   */
  @javax.annotation.Nonnull
  public UUID getHrisRelationshipTypeId() {
    return hrisRelationshipTypeId;
  }

  public void setHrisRelationshipTypeId(@javax.annotation.Nonnull UUID hrisRelationshipTypeId) {
    this.hrisRelationshipTypeId = hrisRelationshipTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertParentWorkerRelationsRequestData upsertParentWorkerRelationsRequestData = (UpsertParentWorkerRelationsRequestData) o;
    return Objects.equals(this.id, upsertParentWorkerRelationsRequestData.id) &&
        Objects.equals(this.hrisRelationshipTypeId, upsertParentWorkerRelationsRequestData.hrisRelationshipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hrisRelationshipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertParentWorkerRelationsRequestData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hrisRelationshipTypeId: ").append(toIndentedString(hrisRelationshipTypeId)).append("\n");
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
    openapiFields.add("hris_relationship_type_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("hris_relationship_type_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertParentWorkerRelationsRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertParentWorkerRelationsRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertParentWorkerRelationsRequestData is not found in the empty JSON string", UpsertParentWorkerRelationsRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertParentWorkerRelationsRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertParentWorkerRelationsRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpsertParentWorkerRelationsRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("hris_relationship_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertParentWorkerRelationsRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertParentWorkerRelationsRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertParentWorkerRelationsRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertParentWorkerRelationsRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertParentWorkerRelationsRequestData>() {
           @Override
           public void write(JsonWriter out, UpsertParentWorkerRelationsRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertParentWorkerRelationsRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertParentWorkerRelationsRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertParentWorkerRelationsRequestData
   * @throws IOException if the JSON string is invalid with respect to UpsertParentWorkerRelationsRequestData
   */
  public static UpsertParentWorkerRelationsRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertParentWorkerRelationsRequestData.class);
  }

  /**
   * Convert an instance of UpsertParentWorkerRelationsRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

