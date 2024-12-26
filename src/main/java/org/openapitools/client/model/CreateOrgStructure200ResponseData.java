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
 * CreateOrgStructure200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateOrgStructure200ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_ENABLE_ROLES = "enable_roles";
  @SerializedName(SERIALIZED_NAME_ENABLE_ROLES)
  @javax.annotation.Nullable
  private Boolean enableRoles;

  public static final String SERIALIZED_NAME_IS_MULTI_SELECT = "is_multi_select";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_SELECT)
  @javax.annotation.Nullable
  private Boolean isMultiSelect;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @javax.annotation.Nullable
  private Integer organizationId;

  public CreateOrgStructure200ResponseData() {
  }

  public CreateOrgStructure200ResponseData id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the organization structure.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public CreateOrgStructure200ResponseData name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the organization structure.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CreateOrgStructure200ResponseData type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the organization structure.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public CreateOrgStructure200ResponseData createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time when the organization structure was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreateOrgStructure200ResponseData updatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time when the organization structure was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreateOrgStructure200ResponseData externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The external identifier of the organization structure.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public CreateOrgStructure200ResponseData enableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
    return this;
  }

  /**
   * Whether roles are enabled for the organization structure.
   * @return enableRoles
   */
  @javax.annotation.Nullable
  public Boolean getEnableRoles() {
    return enableRoles;
  }

  public void setEnableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
  }


  public CreateOrgStructure200ResponseData isMultiSelect(@javax.annotation.Nullable Boolean isMultiSelect) {
    this.isMultiSelect = isMultiSelect;
    return this;
  }

  /**
   * Whether multiple selection is enabled for the organization structure.
   * @return isMultiSelect
   */
  @javax.annotation.Nullable
  public Boolean getIsMultiSelect() {
    return isMultiSelect;
  }

  public void setIsMultiSelect(@javax.annotation.Nullable Boolean isMultiSelect) {
    this.isMultiSelect = isMultiSelect;
  }


  public CreateOrgStructure200ResponseData organizationId(@javax.annotation.Nullable Integer organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * The unique identifier of the organization.
   * @return organizationId
   */
  @javax.annotation.Nullable
  public Integer getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(@javax.annotation.Nullable Integer organizationId) {
    this.organizationId = organizationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrgStructure200ResponseData createOrgStructure200ResponseData = (CreateOrgStructure200ResponseData) o;
    return Objects.equals(this.id, createOrgStructure200ResponseData.id) &&
        Objects.equals(this.name, createOrgStructure200ResponseData.name) &&
        Objects.equals(this.type, createOrgStructure200ResponseData.type) &&
        Objects.equals(this.createdAt, createOrgStructure200ResponseData.createdAt) &&
        Objects.equals(this.updatedAt, createOrgStructure200ResponseData.updatedAt) &&
        Objects.equals(this.externalId, createOrgStructure200ResponseData.externalId) &&
        Objects.equals(this.enableRoles, createOrgStructure200ResponseData.enableRoles) &&
        Objects.equals(this.isMultiSelect, createOrgStructure200ResponseData.isMultiSelect) &&
        Objects.equals(this.organizationId, createOrgStructure200ResponseData.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, createdAt, updatedAt, externalId, enableRoles, isMultiSelect, organizationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrgStructure200ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    enableRoles: ").append(toIndentedString(enableRoles)).append("\n");
    sb.append("    isMultiSelect: ").append(toIndentedString(isMultiSelect)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("external_id");
    openapiFields.add("enable_roles");
    openapiFields.add("is_multi_select");
    openapiFields.add("organization_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOrgStructure200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrgStructure200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrgStructure200ResponseData is not found in the empty JSON string", CreateOrgStructure200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrgStructure200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrgStructure200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrgStructure200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrgStructure200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrgStructure200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrgStructure200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrgStructure200ResponseData>() {
           @Override
           public void write(JsonWriter out, CreateOrgStructure200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrgStructure200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOrgStructure200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOrgStructure200ResponseData
   * @throws IOException if the JSON string is invalid with respect to CreateOrgStructure200ResponseData
   */
  public static CreateOrgStructure200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrgStructure200ResponseData.class);
  }

  /**
   * Convert an instance of CreateOrgStructure200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

