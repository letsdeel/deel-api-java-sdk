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
 * UpdateWorkerRelationTypeExternalId204ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T19:12:08.356438549Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateWorkerRelationTypeExternalId204ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

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

  public static final String SERIALIZED_NAME_PARENT_NAME = "parent_name";
  @SerializedName(SERIALIZED_NAME_PARENT_NAME)
  @javax.annotation.Nullable
  private String parentName;

  public UpdateWorkerRelationTypeExternalId204ResponseData() {
  }

  public UpdateWorkerRelationTypeExternalId204ResponseData id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the relation type
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public UpdateWorkerRelationTypeExternalId204ResponseData childName(@javax.annotation.Nullable String childName) {
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


  public UpdateWorkerRelationTypeExternalId204ResponseData isDefault(@javax.annotation.Nullable Boolean isDefault) {
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


  public UpdateWorkerRelationTypeExternalId204ResponseData externalId(@javax.annotation.Nullable String externalId) {
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


  public UpdateWorkerRelationTypeExternalId204ResponseData parentName(@javax.annotation.Nullable String parentName) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkerRelationTypeExternalId204ResponseData updateWorkerRelationTypeExternalId204ResponseData = (UpdateWorkerRelationTypeExternalId204ResponseData) o;
    return Objects.equals(this.id, updateWorkerRelationTypeExternalId204ResponseData.id) &&
        Objects.equals(this.childName, updateWorkerRelationTypeExternalId204ResponseData.childName) &&
        Objects.equals(this.isDefault, updateWorkerRelationTypeExternalId204ResponseData.isDefault) &&
        Objects.equals(this.externalId, updateWorkerRelationTypeExternalId204ResponseData.externalId) &&
        Objects.equals(this.parentName, updateWorkerRelationTypeExternalId204ResponseData.parentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, childName, isDefault, externalId, parentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkerRelationTypeExternalId204ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    childName: ").append(toIndentedString(childName)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
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
    openapiFields.add("child_name");
    openapiFields.add("is_default");
    openapiFields.add("external_id");
    openapiFields.add("parent_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateWorkerRelationTypeExternalId204ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateWorkerRelationTypeExternalId204ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWorkerRelationTypeExternalId204ResponseData is not found in the empty JSON string", UpdateWorkerRelationTypeExternalId204ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateWorkerRelationTypeExternalId204ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWorkerRelationTypeExternalId204ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("child_name") != null && !jsonObj.get("child_name").isJsonNull()) && !jsonObj.get("child_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_name").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("parent_name") != null && !jsonObj.get("parent_name").isJsonNull()) && !jsonObj.get("parent_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWorkerRelationTypeExternalId204ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWorkerRelationTypeExternalId204ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWorkerRelationTypeExternalId204ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWorkerRelationTypeExternalId204ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWorkerRelationTypeExternalId204ResponseData>() {
           @Override
           public void write(JsonWriter out, UpdateWorkerRelationTypeExternalId204ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWorkerRelationTypeExternalId204ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateWorkerRelationTypeExternalId204ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateWorkerRelationTypeExternalId204ResponseData
   * @throws IOException if the JSON string is invalid with respect to UpdateWorkerRelationTypeExternalId204ResponseData
   */
  public static UpdateWorkerRelationTypeExternalId204ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWorkerRelationTypeExternalId204ResponseData.class);
  }

  /**
   * Convert an instance of UpdateWorkerRelationTypeExternalId204ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

