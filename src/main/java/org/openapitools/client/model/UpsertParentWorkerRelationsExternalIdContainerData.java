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
 * UpsertParentWorkerRelationsExternalIdContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertParentWorkerRelationsExternalIdContainerData {
  public static final String SERIALIZED_NAME_PARENT_PROFILE_EXTERNAL_ID = "parent_profile_external_id";
  @SerializedName(SERIALIZED_NAME_PARENT_PROFILE_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String parentProfileExternalId;

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID = "hris_relationship_type_external_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String hrisRelationshipTypeExternalId;

  public static final String SERIALIZED_NAME_RELATION_EXTERNAL_ID = "relation_external_id";
  @SerializedName(SERIALIZED_NAME_RELATION_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String relationExternalId;

  public UpsertParentWorkerRelationsExternalIdContainerData() {
  }

  public UpsertParentWorkerRelationsExternalIdContainerData parentProfileExternalId(@javax.annotation.Nonnull String parentProfileExternalId) {
    this.parentProfileExternalId = parentProfileExternalId;
    return this;
  }

  /**
   * The external ID of the parent profile
   * @return parentProfileExternalId
   */
  @javax.annotation.Nonnull
  public String getParentProfileExternalId() {
    return parentProfileExternalId;
  }

  public void setParentProfileExternalId(@javax.annotation.Nonnull String parentProfileExternalId) {
    this.parentProfileExternalId = parentProfileExternalId;
  }


  public UpsertParentWorkerRelationsExternalIdContainerData hrisRelationshipTypeExternalId(@javax.annotation.Nonnull String hrisRelationshipTypeExternalId) {
    this.hrisRelationshipTypeExternalId = hrisRelationshipTypeExternalId;
    return this;
  }

  /**
   * The external ID of the relationship type
   * @return hrisRelationshipTypeExternalId
   */
  @javax.annotation.Nonnull
  public String getHrisRelationshipTypeExternalId() {
    return hrisRelationshipTypeExternalId;
  }

  public void setHrisRelationshipTypeExternalId(@javax.annotation.Nonnull String hrisRelationshipTypeExternalId) {
    this.hrisRelationshipTypeExternalId = hrisRelationshipTypeExternalId;
  }


  public UpsertParentWorkerRelationsExternalIdContainerData relationExternalId(@javax.annotation.Nullable String relationExternalId) {
    this.relationExternalId = relationExternalId;
    return this;
  }

  /**
   * A custom ID to identify the relationship
   * @return relationExternalId
   */
  @javax.annotation.Nullable
  public String getRelationExternalId() {
    return relationExternalId;
  }

  public void setRelationExternalId(@javax.annotation.Nullable String relationExternalId) {
    this.relationExternalId = relationExternalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertParentWorkerRelationsExternalIdContainerData upsertParentWorkerRelationsExternalIdContainerData = (UpsertParentWorkerRelationsExternalIdContainerData) o;
    return Objects.equals(this.parentProfileExternalId, upsertParentWorkerRelationsExternalIdContainerData.parentProfileExternalId) &&
        Objects.equals(this.hrisRelationshipTypeExternalId, upsertParentWorkerRelationsExternalIdContainerData.hrisRelationshipTypeExternalId) &&
        Objects.equals(this.relationExternalId, upsertParentWorkerRelationsExternalIdContainerData.relationExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentProfileExternalId, hrisRelationshipTypeExternalId, relationExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertParentWorkerRelationsExternalIdContainerData {\n");
    sb.append("    parentProfileExternalId: ").append(toIndentedString(parentProfileExternalId)).append("\n");
    sb.append("    hrisRelationshipTypeExternalId: ").append(toIndentedString(hrisRelationshipTypeExternalId)).append("\n");
    sb.append("    relationExternalId: ").append(toIndentedString(relationExternalId)).append("\n");
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
    openapiFields.add("parent_profile_external_id");
    openapiFields.add("hris_relationship_type_external_id");
    openapiFields.add("relation_external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parent_profile_external_id");
    openapiRequiredFields.add("hris_relationship_type_external_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertParentWorkerRelationsExternalIdContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertParentWorkerRelationsExternalIdContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertParentWorkerRelationsExternalIdContainerData is not found in the empty JSON string", UpsertParentWorkerRelationsExternalIdContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertParentWorkerRelationsExternalIdContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertParentWorkerRelationsExternalIdContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpsertParentWorkerRelationsExternalIdContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("parent_profile_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_profile_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_profile_external_id").toString()));
      }
      if (!jsonObj.get("hris_relationship_type_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_external_id").toString()));
      }
      if ((jsonObj.get("relation_external_id") != null && !jsonObj.get("relation_external_id").isJsonNull()) && !jsonObj.get("relation_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation_external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertParentWorkerRelationsExternalIdContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertParentWorkerRelationsExternalIdContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertParentWorkerRelationsExternalIdContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertParentWorkerRelationsExternalIdContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertParentWorkerRelationsExternalIdContainerData>() {
           @Override
           public void write(JsonWriter out, UpsertParentWorkerRelationsExternalIdContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertParentWorkerRelationsExternalIdContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertParentWorkerRelationsExternalIdContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertParentWorkerRelationsExternalIdContainerData
   * @throws IOException if the JSON string is invalid with respect to UpsertParentWorkerRelationsExternalIdContainerData
   */
  public static UpsertParentWorkerRelationsExternalIdContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertParentWorkerRelationsExternalIdContainerData.class);
  }

  /**
   * Convert an instance of UpsertParentWorkerRelationsExternalIdContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

