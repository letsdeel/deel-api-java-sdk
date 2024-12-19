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
import org.openapitools.client.model.CreateOrUpdateChildRelationBetweenProfilesRequestDataChildHrisProfileIdsInner;
import org.openapitools.client.model.CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason;

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
 * CreateOrUpdateChildRelationBetweenProfilesRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateOrUpdateChildRelationBetweenProfilesRequestData {
  public static final String SERIALIZED_NAME_EDIT_REASON = "edit_reason";
  @SerializedName(SERIALIZED_NAME_EDIT_REASON)
  @javax.annotation.Nullable
  private CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason editReason;

  public static final String SERIALIZED_NAME_CHILD_HRIS_PROFILE_IDS = "child_hris_profile_ids";
  @SerializedName(SERIALIZED_NAME_CHILD_HRIS_PROFILE_IDS)
  @javax.annotation.Nullable
  private List<CreateOrUpdateChildRelationBetweenProfilesRequestDataChildHrisProfileIdsInner> childHrisProfileIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID = "hris_relationship_type_external_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID)
  @javax.annotation.Nullable
  private UUID hrisRelationshipTypeExternalId;

  public CreateOrUpdateChildRelationBetweenProfilesRequestData() {
  }

  public CreateOrUpdateChildRelationBetweenProfilesRequestData editReason(@javax.annotation.Nullable CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason editReason) {
    this.editReason = editReason;
    return this;
  }

  /**
   * Get editReason
   * @return editReason
   */
  @javax.annotation.Nullable
  public CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason getEditReason() {
    return editReason;
  }

  public void setEditReason(@javax.annotation.Nullable CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason editReason) {
    this.editReason = editReason;
  }


  public CreateOrUpdateChildRelationBetweenProfilesRequestData childHrisProfileIds(@javax.annotation.Nullable List<CreateOrUpdateChildRelationBetweenProfilesRequestDataChildHrisProfileIdsInner> childHrisProfileIds) {
    this.childHrisProfileIds = childHrisProfileIds;
    return this;
  }

  public CreateOrUpdateChildRelationBetweenProfilesRequestData addChildHrisProfileIdsItem(CreateOrUpdateChildRelationBetweenProfilesRequestDataChildHrisProfileIdsInner childHrisProfileIdsItem) {
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
  @javax.annotation.Nullable
  public List<CreateOrUpdateChildRelationBetweenProfilesRequestDataChildHrisProfileIdsInner> getChildHrisProfileIds() {
    return childHrisProfileIds;
  }

  public void setChildHrisProfileIds(@javax.annotation.Nullable List<CreateOrUpdateChildRelationBetweenProfilesRequestDataChildHrisProfileIdsInner> childHrisProfileIds) {
    this.childHrisProfileIds = childHrisProfileIds;
  }


  public CreateOrUpdateChildRelationBetweenProfilesRequestData hrisRelationshipTypeExternalId(@javax.annotation.Nullable UUID hrisRelationshipTypeExternalId) {
    this.hrisRelationshipTypeExternalId = hrisRelationshipTypeExternalId;
    return this;
  }

  /**
   * External id of the relationship type
   * @return hrisRelationshipTypeExternalId
   */
  @javax.annotation.Nullable
  public UUID getHrisRelationshipTypeExternalId() {
    return hrisRelationshipTypeExternalId;
  }

  public void setHrisRelationshipTypeExternalId(@javax.annotation.Nullable UUID hrisRelationshipTypeExternalId) {
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
    CreateOrUpdateChildRelationBetweenProfilesRequestData createOrUpdateChildRelationBetweenProfilesRequestData = (CreateOrUpdateChildRelationBetweenProfilesRequestData) o;
    return Objects.equals(this.editReason, createOrUpdateChildRelationBetweenProfilesRequestData.editReason) &&
        Objects.equals(this.childHrisProfileIds, createOrUpdateChildRelationBetweenProfilesRequestData.childHrisProfileIds) &&
        Objects.equals(this.hrisRelationshipTypeExternalId, createOrUpdateChildRelationBetweenProfilesRequestData.hrisRelationshipTypeExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editReason, childHrisProfileIds, hrisRelationshipTypeExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrUpdateChildRelationBetweenProfilesRequestData {\n");
    sb.append("    editReason: ").append(toIndentedString(editReason)).append("\n");
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
    openapiFields.add("edit_reason");
    openapiFields.add("child_hris_profile_ids");
    openapiFields.add("hris_relationship_type_external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOrUpdateChildRelationBetweenProfilesRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrUpdateChildRelationBetweenProfilesRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrUpdateChildRelationBetweenProfilesRequestData is not found in the empty JSON string", CreateOrUpdateChildRelationBetweenProfilesRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrUpdateChildRelationBetweenProfilesRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrUpdateChildRelationBetweenProfilesRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `edit_reason`
      if (jsonObj.get("edit_reason") != null && !jsonObj.get("edit_reason").isJsonNull()) {
        CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.validateJsonElement(jsonObj.get("edit_reason"));
      }
      if (jsonObj.get("child_hris_profile_ids") != null && !jsonObj.get("child_hris_profile_ids").isJsonNull()) {
        JsonArray jsonArraychildHrisProfileIds = jsonObj.getAsJsonArray("child_hris_profile_ids");
        if (jsonArraychildHrisProfileIds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("child_hris_profile_ids").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `child_hris_profile_ids` to be an array in the JSON string but got `%s`", jsonObj.get("child_hris_profile_ids").toString()));
          }

          // validate the optional field `child_hris_profile_ids` (array)
          for (int i = 0; i < jsonArraychildHrisProfileIds.size(); i++) {
            CreateOrUpdateChildRelationBetweenProfilesRequestDataChildHrisProfileIdsInner.validateJsonElement(jsonArraychildHrisProfileIds.get(i));
          };
        }
      }
      if ((jsonObj.get("hris_relationship_type_external_id") != null && !jsonObj.get("hris_relationship_type_external_id").isJsonNull()) && !jsonObj.get("hris_relationship_type_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrUpdateChildRelationBetweenProfilesRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrUpdateChildRelationBetweenProfilesRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrUpdateChildRelationBetweenProfilesRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrUpdateChildRelationBetweenProfilesRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrUpdateChildRelationBetweenProfilesRequestData>() {
           @Override
           public void write(JsonWriter out, CreateOrUpdateChildRelationBetweenProfilesRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrUpdateChildRelationBetweenProfilesRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOrUpdateChildRelationBetweenProfilesRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOrUpdateChildRelationBetweenProfilesRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateOrUpdateChildRelationBetweenProfilesRequestData
   */
  public static CreateOrUpdateChildRelationBetweenProfilesRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrUpdateChildRelationBetweenProfilesRequestData.class);
  }

  /**
   * Convert an instance of CreateOrUpdateChildRelationBetweenProfilesRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

