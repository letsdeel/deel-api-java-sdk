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
 * CreateOrganizationRoleRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateOrganizationRoleRequestData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nonnull
  private String scope;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_PERMISSION_SETS = "permissionSets";
  @SerializedName(SERIALIZED_NAME_PERMISSION_SETS)
  @javax.annotation.Nonnull
  private List<String> permissionSets = new ArrayList<>();

  public static final String SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID = "hrisOrgStructureId";
  @SerializedName(SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID)
  @javax.annotation.Nullable
  private String hrisOrgStructureId;

  public CreateOrganizationRoleRequestData() {
  }

  public CreateOrganizationRoleRequestData name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Organization role name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateOrganizationRoleRequestData scope(@javax.annotation.Nonnull String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Organization role scope
   * @return scope
   */
  @javax.annotation.Nonnull
  public String getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nonnull String scope) {
    this.scope = scope;
  }


  public CreateOrganizationRoleRequestData description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Organization role description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public CreateOrganizationRoleRequestData permissionSets(@javax.annotation.Nonnull List<String> permissionSets) {
    this.permissionSets = permissionSets;
    return this;
  }

  public CreateOrganizationRoleRequestData addPermissionSetsItem(String permissionSetsItem) {
    if (this.permissionSets == null) {
      this.permissionSets = new ArrayList<>();
    }
    this.permissionSets.add(permissionSetsItem);
    return this;
  }

  /**
   * Get permissionSets
   * @return permissionSets
   */
  @javax.annotation.Nonnull
  public List<String> getPermissionSets() {
    return permissionSets;
  }

  public void setPermissionSets(@javax.annotation.Nonnull List<String> permissionSets) {
    this.permissionSets = permissionSets;
  }


  public CreateOrganizationRoleRequestData hrisOrgStructureId(@javax.annotation.Nullable String hrisOrgStructureId) {
    this.hrisOrgStructureId = hrisOrgStructureId;
    return this;
  }

  /**
   * HRIS organization structure id
   * @return hrisOrgStructureId
   */
  @javax.annotation.Nullable
  public String getHrisOrgStructureId() {
    return hrisOrgStructureId;
  }

  public void setHrisOrgStructureId(@javax.annotation.Nullable String hrisOrgStructureId) {
    this.hrisOrgStructureId = hrisOrgStructureId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrganizationRoleRequestData createOrganizationRoleRequestData = (CreateOrganizationRoleRequestData) o;
    return Objects.equals(this.name, createOrganizationRoleRequestData.name) &&
        Objects.equals(this.scope, createOrganizationRoleRequestData.scope) &&
        Objects.equals(this.description, createOrganizationRoleRequestData.description) &&
        Objects.equals(this.permissionSets, createOrganizationRoleRequestData.permissionSets) &&
        Objects.equals(this.hrisOrgStructureId, createOrganizationRoleRequestData.hrisOrgStructureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scope, description, permissionSets, hrisOrgStructureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrganizationRoleRequestData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissionSets: ").append(toIndentedString(permissionSets)).append("\n");
    sb.append("    hrisOrgStructureId: ").append(toIndentedString(hrisOrgStructureId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("scope");
    openapiFields.add("description");
    openapiFields.add("permissionSets");
    openapiFields.add("hrisOrgStructureId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("permissionSets");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOrganizationRoleRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrganizationRoleRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrganizationRoleRequestData is not found in the empty JSON string", CreateOrganizationRoleRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrganizationRoleRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrganizationRoleRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateOrganizationRoleRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("permissionSets") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("permissionSets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissionSets` to be an array in the JSON string but got `%s`", jsonObj.get("permissionSets").toString()));
      }
      if ((jsonObj.get("hrisOrgStructureId") != null && !jsonObj.get("hrisOrgStructureId").isJsonNull()) && !jsonObj.get("hrisOrgStructureId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hrisOrgStructureId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hrisOrgStructureId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrganizationRoleRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrganizationRoleRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrganizationRoleRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrganizationRoleRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrganizationRoleRequestData>() {
           @Override
           public void write(JsonWriter out, CreateOrganizationRoleRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrganizationRoleRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOrganizationRoleRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOrganizationRoleRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateOrganizationRoleRequestData
   */
  public static CreateOrganizationRoleRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrganizationRoleRequestData.class);
  }

  /**
   * Convert an instance of CreateOrganizationRoleRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

