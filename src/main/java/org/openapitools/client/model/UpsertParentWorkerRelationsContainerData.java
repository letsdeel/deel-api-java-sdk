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
 * UpsertParentWorkerRelationsContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertParentWorkerRelationsContainerData {
  public static final String SERIALIZED_NAME_PARENT_HRIS_PROFILE_ID = "parent_hris_profile_id";
  @SerializedName(SERIALIZED_NAME_PARENT_HRIS_PROFILE_ID)
  @javax.annotation.Nullable
  private UUID parentHrisProfileId;

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID = "hris_relationship_type_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID)
  @javax.annotation.Nullable
  private UUID hrisRelationshipTypeId;

  public UpsertParentWorkerRelationsContainerData() {
  }

  public UpsertParentWorkerRelationsContainerData parentHrisProfileId(@javax.annotation.Nullable UUID parentHrisProfileId) {
    this.parentHrisProfileId = parentHrisProfileId;
    return this;
  }

  /**
   * The ID of the parent profile
   * @return parentHrisProfileId
   */
  @javax.annotation.Nullable
  public UUID getParentHrisProfileId() {
    return parentHrisProfileId;
  }

  public void setParentHrisProfileId(@javax.annotation.Nullable UUID parentHrisProfileId) {
    this.parentHrisProfileId = parentHrisProfileId;
  }


  public UpsertParentWorkerRelationsContainerData hrisRelationshipTypeId(@javax.annotation.Nullable UUID hrisRelationshipTypeId) {
    this.hrisRelationshipTypeId = hrisRelationshipTypeId;
    return this;
  }

  /**
   * The ID of the relation type
   * @return hrisRelationshipTypeId
   */
  @javax.annotation.Nullable
  public UUID getHrisRelationshipTypeId() {
    return hrisRelationshipTypeId;
  }

  public void setHrisRelationshipTypeId(@javax.annotation.Nullable UUID hrisRelationshipTypeId) {
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
    UpsertParentWorkerRelationsContainerData upsertParentWorkerRelationsContainerData = (UpsertParentWorkerRelationsContainerData) o;
    return Objects.equals(this.parentHrisProfileId, upsertParentWorkerRelationsContainerData.parentHrisProfileId) &&
        Objects.equals(this.hrisRelationshipTypeId, upsertParentWorkerRelationsContainerData.hrisRelationshipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentHrisProfileId, hrisRelationshipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertParentWorkerRelationsContainerData {\n");
    sb.append("    parentHrisProfileId: ").append(toIndentedString(parentHrisProfileId)).append("\n");
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
    openapiFields.add("parent_hris_profile_id");
    openapiFields.add("hris_relationship_type_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertParentWorkerRelationsContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertParentWorkerRelationsContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertParentWorkerRelationsContainerData is not found in the empty JSON string", UpsertParentWorkerRelationsContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertParentWorkerRelationsContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertParentWorkerRelationsContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("parent_hris_profile_id") != null && !jsonObj.get("parent_hris_profile_id").isJsonNull()) && !jsonObj.get("parent_hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_hris_profile_id").toString()));
      }
      if ((jsonObj.get("hris_relationship_type_id") != null && !jsonObj.get("hris_relationship_type_id").isJsonNull()) && !jsonObj.get("hris_relationship_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertParentWorkerRelationsContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertParentWorkerRelationsContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertParentWorkerRelationsContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertParentWorkerRelationsContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertParentWorkerRelationsContainerData>() {
           @Override
           public void write(JsonWriter out, UpsertParentWorkerRelationsContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertParentWorkerRelationsContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertParentWorkerRelationsContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertParentWorkerRelationsContainerData
   * @throws IOException if the JSON string is invalid with respect to UpsertParentWorkerRelationsContainerData
   */
  public static UpsertParentWorkerRelationsContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertParentWorkerRelationsContainerData.class);
  }

  /**
   * Convert an instance of UpsertParentWorkerRelationsContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

