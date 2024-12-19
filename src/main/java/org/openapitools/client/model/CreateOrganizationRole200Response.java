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
import java.math.BigDecimal;
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
 * CreateOrganizationRole200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateOrganizationRole200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nullable
  private String scope;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_PERMISSION_SETS = "permissionSets";
  @SerializedName(SERIALIZED_NAME_PERMISSION_SETS)
  @javax.annotation.Nullable
  private List<String> permissionSets = new ArrayList<>();

  public static final String SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID = "hrisOrgStructureId";
  @SerializedName(SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID)
  @javax.annotation.Nullable
  private String hrisOrgStructureId;

  public CreateOrganizationRole200Response() {
  }

  public CreateOrganizationRole200Response id(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Organization role id
   * @return id
   */
  @javax.annotation.Nullable
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
  }


  public CreateOrganizationRole200Response name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Organization role name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CreateOrganizationRole200Response scope(@javax.annotation.Nullable String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Organization role scope
   * @return scope
   */
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nullable String scope) {
    this.scope = scope;
  }


  public CreateOrganizationRole200Response description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Organization role description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public CreateOrganizationRole200Response permissionSets(@javax.annotation.Nullable List<String> permissionSets) {
    this.permissionSets = permissionSets;
    return this;
  }

  public CreateOrganizationRole200Response addPermissionSetsItem(String permissionSetsItem) {
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
  @javax.annotation.Nullable
  public List<String> getPermissionSets() {
    return permissionSets;
  }

  public void setPermissionSets(@javax.annotation.Nullable List<String> permissionSets) {
    this.permissionSets = permissionSets;
  }


  public CreateOrganizationRole200Response hrisOrgStructureId(@javax.annotation.Nullable String hrisOrgStructureId) {
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
    CreateOrganizationRole200Response createOrganizationRole200Response = (CreateOrganizationRole200Response) o;
    return Objects.equals(this.id, createOrganizationRole200Response.id) &&
        Objects.equals(this.name, createOrganizationRole200Response.name) &&
        Objects.equals(this.scope, createOrganizationRole200Response.scope) &&
        Objects.equals(this.description, createOrganizationRole200Response.description) &&
        Objects.equals(this.permissionSets, createOrganizationRole200Response.permissionSets) &&
        Objects.equals(this.hrisOrgStructureId, createOrganizationRole200Response.hrisOrgStructureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, scope, description, permissionSets, hrisOrgStructureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrganizationRole200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("scope");
    openapiFields.add("description");
    openapiFields.add("permissionSets");
    openapiFields.add("hrisOrgStructureId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOrganizationRole200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrganizationRole200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrganizationRole200Response is not found in the empty JSON string", CreateOrganizationRole200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrganizationRole200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrganizationRole200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissionSets") != null && !jsonObj.get("permissionSets").isJsonNull() && !jsonObj.get("permissionSets").isJsonArray()) {
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
       if (!CreateOrganizationRole200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrganizationRole200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrganizationRole200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrganizationRole200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrganizationRole200Response>() {
           @Override
           public void write(JsonWriter out, CreateOrganizationRole200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrganizationRole200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOrganizationRole200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOrganizationRole200Response
   * @throws IOException if the JSON string is invalid with respect to CreateOrganizationRole200Response
   */
  public static CreateOrganizationRole200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrganizationRole200Response.class);
  }

  /**
   * Convert an instance of CreateOrganizationRole200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

