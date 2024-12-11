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
 * UpdateWorkerRelationTypeExternalIdResponseContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T18:19:15.469015129Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateWorkerRelationTypeExternalIdResponseContainerData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_PARENT_NAME = "parent_name";
  @SerializedName(SERIALIZED_NAME_PARENT_NAME)
  @javax.annotation.Nullable
  private String parentName;

  public static final String SERIALIZED_NAME_CHILD_NAME = "child_name";
  @SerializedName(SERIALIZED_NAME_CHILD_NAME)
  @javax.annotation.Nullable
  private String childName;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  @javax.annotation.Nullable
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public UpdateWorkerRelationTypeExternalIdResponseContainerData() {
  }

  public UpdateWorkerRelationTypeExternalIdResponseContainerData id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public UpdateWorkerRelationTypeExternalIdResponseContainerData parentName(@javax.annotation.Nullable String parentName) {
    this.parentName = parentName;
    return this;
  }

  /**
   * The name of the primary party in the relationship
   * @return parentName
   */
  @javax.annotation.Nullable
  public String getParentName() {
    return parentName;
  }

  public void setParentName(@javax.annotation.Nullable String parentName) {
    this.parentName = parentName;
  }


  public UpdateWorkerRelationTypeExternalIdResponseContainerData childName(@javax.annotation.Nullable String childName) {
    this.childName = childName;
    return this;
  }

  /**
   * The name of the secondary party in the relationship
   * @return childName
   */
  @javax.annotation.Nullable
  public String getChildName() {
    return childName;
  }

  public void setChildName(@javax.annotation.Nullable String childName) {
    this.childName = childName;
  }


  public UpdateWorkerRelationTypeExternalIdResponseContainerData isDefault(@javax.annotation.Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this relation is default or not
   * @return isDefault
   */
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(@javax.annotation.Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public UpdateWorkerRelationTypeExternalIdResponseContainerData externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * A custom ID for the relation type
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkerRelationTypeExternalIdResponseContainerData updateWorkerRelationTypeExternalIdResponseContainerData = (UpdateWorkerRelationTypeExternalIdResponseContainerData) o;
    return Objects.equals(this.id, updateWorkerRelationTypeExternalIdResponseContainerData.id) &&
        Objects.equals(this.parentName, updateWorkerRelationTypeExternalIdResponseContainerData.parentName) &&
        Objects.equals(this.childName, updateWorkerRelationTypeExternalIdResponseContainerData.childName) &&
        Objects.equals(this.isDefault, updateWorkerRelationTypeExternalIdResponseContainerData.isDefault) &&
        Objects.equals(this.externalId, updateWorkerRelationTypeExternalIdResponseContainerData.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentName, childName, isDefault, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkerRelationTypeExternalIdResponseContainerData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    childName: ").append(toIndentedString(childName)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("parent_name");
    openapiFields.add("child_name");
    openapiFields.add("is_default");
    openapiFields.add("external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateWorkerRelationTypeExternalIdResponseContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateWorkerRelationTypeExternalIdResponseContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWorkerRelationTypeExternalIdResponseContainerData is not found in the empty JSON string", UpdateWorkerRelationTypeExternalIdResponseContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateWorkerRelationTypeExternalIdResponseContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWorkerRelationTypeExternalIdResponseContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("parent_name") != null && !jsonObj.get("parent_name").isJsonNull()) && !jsonObj.get("parent_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_name").toString()));
      }
      if ((jsonObj.get("child_name") != null && !jsonObj.get("child_name").isJsonNull()) && !jsonObj.get("child_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_name").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWorkerRelationTypeExternalIdResponseContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWorkerRelationTypeExternalIdResponseContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWorkerRelationTypeExternalIdResponseContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWorkerRelationTypeExternalIdResponseContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWorkerRelationTypeExternalIdResponseContainerData>() {
           @Override
           public void write(JsonWriter out, UpdateWorkerRelationTypeExternalIdResponseContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWorkerRelationTypeExternalIdResponseContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateWorkerRelationTypeExternalIdResponseContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateWorkerRelationTypeExternalIdResponseContainerData
   * @throws IOException if the JSON string is invalid with respect to UpdateWorkerRelationTypeExternalIdResponseContainerData
   */
  public static UpdateWorkerRelationTypeExternalIdResponseContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWorkerRelationTypeExternalIdResponseContainerData.class);
  }

  /**
   * Convert an instance of UpdateWorkerRelationTypeExternalIdResponseContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

