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
import org.openapitools.client.model.CreateOrUpdateParentRelationBetweenProfilesRequestDataEditReason;

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
 * CreateOrUpdateParentRelationBetweenProfilesRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T13:47:44.629538829Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateOrUpdateParentRelationBetweenProfilesRequestData {
  public static final String SERIALIZED_NAME_EDIT_REASON = "edit_reason";
  @SerializedName(SERIALIZED_NAME_EDIT_REASON)
  @javax.annotation.Nullable
  private CreateOrUpdateParentRelationBetweenProfilesRequestDataEditReason editReason;

  public static final String SERIALIZED_NAME_RELATION_EXTERNAL_ID = "relation_external_id";
  @SerializedName(SERIALIZED_NAME_RELATION_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String relationExternalId;

  public static final String SERIALIZED_NAME_PARENT_PROFILE_EXTERNAL_ID = "parent_profile_external_id";
  @SerializedName(SERIALIZED_NAME_PARENT_PROFILE_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String parentProfileExternalId;

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID = "hris_relationship_type_external_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String hrisRelationshipTypeExternalId;

  public CreateOrUpdateParentRelationBetweenProfilesRequestData() {
  }

  public CreateOrUpdateParentRelationBetweenProfilesRequestData editReason(@javax.annotation.Nullable CreateOrUpdateParentRelationBetweenProfilesRequestDataEditReason editReason) {
    this.editReason = editReason;
    return this;
  }

  /**
   * Get editReason
   * @return editReason
   */
  @javax.annotation.Nullable
  public CreateOrUpdateParentRelationBetweenProfilesRequestDataEditReason getEditReason() {
    return editReason;
  }

  public void setEditReason(@javax.annotation.Nullable CreateOrUpdateParentRelationBetweenProfilesRequestDataEditReason editReason) {
    this.editReason = editReason;
  }


  public CreateOrUpdateParentRelationBetweenProfilesRequestData relationExternalId(@javax.annotation.Nullable String relationExternalId) {
    this.relationExternalId = relationExternalId;
    return this;
  }

  /**
   * The external id of the relation
   * @return relationExternalId
   */
  @javax.annotation.Nullable
  public String getRelationExternalId() {
    return relationExternalId;
  }

  public void setRelationExternalId(@javax.annotation.Nullable String relationExternalId) {
    this.relationExternalId = relationExternalId;
  }


  public CreateOrUpdateParentRelationBetweenProfilesRequestData parentProfileExternalId(@javax.annotation.Nullable String parentProfileExternalId) {
    this.parentProfileExternalId = parentProfileExternalId;
    return this;
  }

  /**
   * The external id of the parent profile
   * @return parentProfileExternalId
   */
  @javax.annotation.Nullable
  public String getParentProfileExternalId() {
    return parentProfileExternalId;
  }

  public void setParentProfileExternalId(@javax.annotation.Nullable String parentProfileExternalId) {
    this.parentProfileExternalId = parentProfileExternalId;
  }


  public CreateOrUpdateParentRelationBetweenProfilesRequestData hrisRelationshipTypeExternalId(@javax.annotation.Nullable String hrisRelationshipTypeExternalId) {
    this.hrisRelationshipTypeExternalId = hrisRelationshipTypeExternalId;
    return this;
  }

  /**
   * The external id of the relationship type
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
    CreateOrUpdateParentRelationBetweenProfilesRequestData createOrUpdateParentRelationBetweenProfilesRequestData = (CreateOrUpdateParentRelationBetweenProfilesRequestData) o;
    return Objects.equals(this.editReason, createOrUpdateParentRelationBetweenProfilesRequestData.editReason) &&
        Objects.equals(this.relationExternalId, createOrUpdateParentRelationBetweenProfilesRequestData.relationExternalId) &&
        Objects.equals(this.parentProfileExternalId, createOrUpdateParentRelationBetweenProfilesRequestData.parentProfileExternalId) &&
        Objects.equals(this.hrisRelationshipTypeExternalId, createOrUpdateParentRelationBetweenProfilesRequestData.hrisRelationshipTypeExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editReason, relationExternalId, parentProfileExternalId, hrisRelationshipTypeExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrUpdateParentRelationBetweenProfilesRequestData {\n");
    sb.append("    editReason: ").append(toIndentedString(editReason)).append("\n");
    sb.append("    relationExternalId: ").append(toIndentedString(relationExternalId)).append("\n");
    sb.append("    parentProfileExternalId: ").append(toIndentedString(parentProfileExternalId)).append("\n");
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
    openapiFields.add("relation_external_id");
    openapiFields.add("parent_profile_external_id");
    openapiFields.add("hris_relationship_type_external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOrUpdateParentRelationBetweenProfilesRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrUpdateParentRelationBetweenProfilesRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrUpdateParentRelationBetweenProfilesRequestData is not found in the empty JSON string", CreateOrUpdateParentRelationBetweenProfilesRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrUpdateParentRelationBetweenProfilesRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrUpdateParentRelationBetweenProfilesRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `edit_reason`
      if (jsonObj.get("edit_reason") != null && !jsonObj.get("edit_reason").isJsonNull()) {
        CreateOrUpdateParentRelationBetweenProfilesRequestDataEditReason.validateJsonElement(jsonObj.get("edit_reason"));
      }
      if ((jsonObj.get("relation_external_id") != null && !jsonObj.get("relation_external_id").isJsonNull()) && !jsonObj.get("relation_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation_external_id").toString()));
      }
      if ((jsonObj.get("parent_profile_external_id") != null && !jsonObj.get("parent_profile_external_id").isJsonNull()) && !jsonObj.get("parent_profile_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_profile_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_profile_external_id").toString()));
      }
      if ((jsonObj.get("hris_relationship_type_external_id") != null && !jsonObj.get("hris_relationship_type_external_id").isJsonNull()) && !jsonObj.get("hris_relationship_type_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrUpdateParentRelationBetweenProfilesRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrUpdateParentRelationBetweenProfilesRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrUpdateParentRelationBetweenProfilesRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrUpdateParentRelationBetweenProfilesRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrUpdateParentRelationBetweenProfilesRequestData>() {
           @Override
           public void write(JsonWriter out, CreateOrUpdateParentRelationBetweenProfilesRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrUpdateParentRelationBetweenProfilesRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOrUpdateParentRelationBetweenProfilesRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOrUpdateParentRelationBetweenProfilesRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateOrUpdateParentRelationBetweenProfilesRequestData
   */
  public static CreateOrUpdateParentRelationBetweenProfilesRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrUpdateParentRelationBetweenProfilesRequestData.class);
  }

  /**
   * Convert an instance of CreateOrUpdateParentRelationBetweenProfilesRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

