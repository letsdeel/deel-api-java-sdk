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
import org.openapitools.client.model.UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner;

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
 * UpsertChildWorkerRelationsExternalIdContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertChildWorkerRelationsExternalIdContainerData {
  public static final String SERIALIZED_NAME_CHILD_HRIS_PROFILE_IDS = "child_hris_profile_ids";
  @SerializedName(SERIALIZED_NAME_CHILD_HRIS_PROFILE_IDS)
  @javax.annotation.Nonnull
  private List<UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner> childHrisProfileIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID = "hris_relationship_type_external_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String hrisRelationshipTypeExternalId;

  public UpsertChildWorkerRelationsExternalIdContainerData() {
  }

  public UpsertChildWorkerRelationsExternalIdContainerData childHrisProfileIds(@javax.annotation.Nonnull List<UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner> childHrisProfileIds) {
    this.childHrisProfileIds = childHrisProfileIds;
    return this;
  }

  public UpsertChildWorkerRelationsExternalIdContainerData addChildHrisProfileIdsItem(UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner childHrisProfileIdsItem) {
    if (this.childHrisProfileIds == null) {
      this.childHrisProfileIds = new ArrayList<>();
    }
    this.childHrisProfileIds.add(childHrisProfileIdsItem);
    return this;
  }

  /**
   * Get childHrisProfileIds
   * @return childHrisProfileIds
   */
  @javax.annotation.Nonnull
  public List<UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner> getChildHrisProfileIds() {
    return childHrisProfileIds;
  }

  public void setChildHrisProfileIds(@javax.annotation.Nonnull List<UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner> childHrisProfileIds) {
    this.childHrisProfileIds = childHrisProfileIds;
  }


  public UpsertChildWorkerRelationsExternalIdContainerData hrisRelationshipTypeExternalId(@javax.annotation.Nullable String hrisRelationshipTypeExternalId) {
    this.hrisRelationshipTypeExternalId = hrisRelationshipTypeExternalId;
    return this;
  }

  /**
   * Get hrisRelationshipTypeExternalId
   * @return hrisRelationshipTypeExternalId
   */
  @javax.annotation.Nullable
  public String getHrisRelationshipTypeExternalId() {
    return hrisRelationshipTypeExternalId;
  }

  public void setHrisRelationshipTypeExternalId(@javax.annotation.Nullable String hrisRelationshipTypeExternalId) {
    this.hrisRelationshipTypeExternalId = hrisRelationshipTypeExternalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertChildWorkerRelationsExternalIdContainerData upsertChildWorkerRelationsExternalIdContainerData = (UpsertChildWorkerRelationsExternalIdContainerData) o;
    return Objects.equals(this.childHrisProfileIds, upsertChildWorkerRelationsExternalIdContainerData.childHrisProfileIds) &&
        Objects.equals(this.hrisRelationshipTypeExternalId, upsertChildWorkerRelationsExternalIdContainerData.hrisRelationshipTypeExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childHrisProfileIds, hrisRelationshipTypeExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertChildWorkerRelationsExternalIdContainerData {\n");
    sb.append("    childHrisProfileIds: ").append(toIndentedString(childHrisProfileIds)).append("\n");
    sb.append("    hrisRelationshipTypeExternalId: ").append(toIndentedString(hrisRelationshipTypeExternalId)).append("\n");
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
    openapiFields.add("hris_relationship_type_external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("child_hris_profile_ids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertChildWorkerRelationsExternalIdContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertChildWorkerRelationsExternalIdContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertChildWorkerRelationsExternalIdContainerData is not found in the empty JSON string", UpsertChildWorkerRelationsExternalIdContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertChildWorkerRelationsExternalIdContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertChildWorkerRelationsExternalIdContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpsertChildWorkerRelationsExternalIdContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("child_hris_profile_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_hris_profile_ids` to be an array in the JSON string but got `%s`", jsonObj.get("child_hris_profile_ids").toString()));
      }

      JsonArray jsonArraychildHrisProfileIds = jsonObj.getAsJsonArray("child_hris_profile_ids");
      // validate the required field `child_hris_profile_ids` (array)
      for (int i = 0; i < jsonArraychildHrisProfileIds.size(); i++) {
        UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner.validateJsonElement(jsonArraychildHrisProfileIds.get(i));
      };
      if ((jsonObj.get("hris_relationship_type_external_id") != null && !jsonObj.get("hris_relationship_type_external_id").isJsonNull()) && !jsonObj.get("hris_relationship_type_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertChildWorkerRelationsExternalIdContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertChildWorkerRelationsExternalIdContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertChildWorkerRelationsExternalIdContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertChildWorkerRelationsExternalIdContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertChildWorkerRelationsExternalIdContainerData>() {
           @Override
           public void write(JsonWriter out, UpsertChildWorkerRelationsExternalIdContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertChildWorkerRelationsExternalIdContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertChildWorkerRelationsExternalIdContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertChildWorkerRelationsExternalIdContainerData
   * @throws IOException if the JSON string is invalid with respect to UpsertChildWorkerRelationsExternalIdContainerData
   */
  public static UpsertChildWorkerRelationsExternalIdContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertChildWorkerRelationsExternalIdContainerData.class);
  }

  /**
   * Convert an instance of UpsertChildWorkerRelationsExternalIdContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

