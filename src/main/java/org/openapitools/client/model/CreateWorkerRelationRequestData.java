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
 * CreateWorkerRelationRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T19:12:08.356438549Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateWorkerRelationRequestData {
  public static final String SERIALIZED_NAME_CHILD_HRIS_PROFILE_IDS = "child_hris_profile_ids";
  @SerializedName(SERIALIZED_NAME_CHILD_HRIS_PROFILE_IDS)
  @javax.annotation.Nonnull
  private List<UUID> childHrisProfileIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARENT_HRIS_PROFILE_ID = "parent_hris_profile_id";
  @SerializedName(SERIALIZED_NAME_PARENT_HRIS_PROFILE_ID)
  @javax.annotation.Nonnull
  private UUID parentHrisProfileId;

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID = "hris_relationship_type_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID)
  @javax.annotation.Nonnull
  private UUID hrisRelationshipTypeId;

  public CreateWorkerRelationRequestData() {
  }

  public CreateWorkerRelationRequestData childHrisProfileIds(@javax.annotation.Nonnull List<UUID> childHrisProfileIds) {
    this.childHrisProfileIds = childHrisProfileIds;
    return this;
  }

  public CreateWorkerRelationRequestData addChildHrisProfileIdsItem(UUID childHrisProfileIdsItem) {
    if (this.childHrisProfileIds == null) {
      this.childHrisProfileIds = new ArrayList<>();
    }
    this.childHrisProfileIds.add(childHrisProfileIdsItem);
    return this;
  }

  /**
   * An array containing the secondary HrisProfiles IDs.
   * @return childHrisProfileIds
   */
  @javax.annotation.Nonnull
  public List<UUID> getChildHrisProfileIds() {
    return childHrisProfileIds;
  }

  public void setChildHrisProfileIds(@javax.annotation.Nonnull List<UUID> childHrisProfileIds) {
    this.childHrisProfileIds = childHrisProfileIds;
  }


  public CreateWorkerRelationRequestData parentHrisProfileId(@javax.annotation.Nonnull UUID parentHrisProfileId) {
    this.parentHrisProfileId = parentHrisProfileId;
    return this;
  }

  /**
   * Primary HrisProfile ID
   * @return parentHrisProfileId
   */
  @javax.annotation.Nonnull
  public UUID getParentHrisProfileId() {
    return parentHrisProfileId;
  }

  public void setParentHrisProfileId(@javax.annotation.Nonnull UUID parentHrisProfileId) {
    this.parentHrisProfileId = parentHrisProfileId;
  }


  public CreateWorkerRelationRequestData hrisRelationshipTypeId(@javax.annotation.Nonnull UUID hrisRelationshipTypeId) {
    this.hrisRelationshipTypeId = hrisRelationshipTypeId;
    return this;
  }

  /**
   * The ID of the Worker Relation Type.
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
    CreateWorkerRelationRequestData createWorkerRelationRequestData = (CreateWorkerRelationRequestData) o;
    return Objects.equals(this.childHrisProfileIds, createWorkerRelationRequestData.childHrisProfileIds) &&
        Objects.equals(this.parentHrisProfileId, createWorkerRelationRequestData.parentHrisProfileId) &&
        Objects.equals(this.hrisRelationshipTypeId, createWorkerRelationRequestData.hrisRelationshipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childHrisProfileIds, parentHrisProfileId, hrisRelationshipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkerRelationRequestData {\n");
    sb.append("    childHrisProfileIds: ").append(toIndentedString(childHrisProfileIds)).append("\n");
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
    openapiFields.add("child_hris_profile_ids");
    openapiFields.add("parent_hris_profile_id");
    openapiFields.add("hris_relationship_type_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("child_hris_profile_ids");
    openapiRequiredFields.add("parent_hris_profile_id");
    openapiRequiredFields.add("hris_relationship_type_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateWorkerRelationRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateWorkerRelationRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWorkerRelationRequestData is not found in the empty JSON string", CreateWorkerRelationRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateWorkerRelationRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWorkerRelationRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateWorkerRelationRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("child_hris_profile_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("child_hris_profile_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_hris_profile_ids` to be an array in the JSON string but got `%s`", jsonObj.get("child_hris_profile_ids").toString()));
      }
      if (!jsonObj.get("parent_hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_hris_profile_id").toString()));
      }
      if (!jsonObj.get("hris_relationship_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWorkerRelationRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWorkerRelationRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWorkerRelationRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWorkerRelationRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWorkerRelationRequestData>() {
           @Override
           public void write(JsonWriter out, CreateWorkerRelationRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWorkerRelationRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateWorkerRelationRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateWorkerRelationRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateWorkerRelationRequestData
   */
  public static CreateWorkerRelationRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWorkerRelationRequestData.class);
  }

  /**
   * Convert an instance of CreateWorkerRelationRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

