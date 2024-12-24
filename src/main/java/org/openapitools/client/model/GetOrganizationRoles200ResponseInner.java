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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * GetOrganizationRoles200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class GetOrganizationRoles200ResponseInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nonnull
  private String scope;

  public static final String SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID = "hrisOrgStructureId";
  @SerializedName(SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID)
  @javax.annotation.Nullable
  private String hrisOrgStructureId;

  public GetOrganizationRoles200ResponseInner() {
  }

  public GetOrganizationRoles200ResponseInner id(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the role.
   * @return id
   */
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
  }


  public GetOrganizationRoles200ResponseInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the role.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetOrganizationRoles200ResponseInner scope(@javax.annotation.Nonnull String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope of the role, which can define the level of access. For example, &#39;ORGANIZATION&#39; represents a global role within the organization.
   * @return scope
   */
  @javax.annotation.Nonnull
  public String getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nonnull String scope) {
    this.scope = scope;
  }


  public GetOrganizationRoles200ResponseInner hrisOrgStructureId(@javax.annotation.Nullable String hrisOrgStructureId) {
    this.hrisOrgStructureId = hrisOrgStructureId;
    return this;
  }

  /**
   * The HRIS (Human Resource Information System) organization structure ID associated with the role, if applicable.
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
    GetOrganizationRoles200ResponseInner getOrganizationRoles200ResponseInner = (GetOrganizationRoles200ResponseInner) o;
    return Objects.equals(this.id, getOrganizationRoles200ResponseInner.id) &&
        Objects.equals(this.name, getOrganizationRoles200ResponseInner.name) &&
        Objects.equals(this.scope, getOrganizationRoles200ResponseInner.scope) &&
        Objects.equals(this.hrisOrgStructureId, getOrganizationRoles200ResponseInner.hrisOrgStructureId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, scope, hrisOrgStructureId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrganizationRoles200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("hrisOrgStructureId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("scope");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetOrganizationRoles200ResponseInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetOrganizationRoles200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOrganizationRoles200ResponseInner is not found in the empty JSON string", GetOrganizationRoles200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetOrganizationRoles200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOrganizationRoles200ResponseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetOrganizationRoles200ResponseInner.openapiRequiredFields) {
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
      if ((jsonObj.get("hrisOrgStructureId") != null && !jsonObj.get("hrisOrgStructureId").isJsonNull()) && !jsonObj.get("hrisOrgStructureId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hrisOrgStructureId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hrisOrgStructureId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOrganizationRoles200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOrganizationRoles200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOrganizationRoles200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOrganizationRoles200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOrganizationRoles200ResponseInner>() {
           @Override
           public void write(JsonWriter out, GetOrganizationRoles200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOrganizationRoles200ResponseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetOrganizationRoles200ResponseInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetOrganizationRoles200ResponseInner
   * @throws IOException if the JSON string is invalid with respect to GetOrganizationRoles200ResponseInner
   */
  public static GetOrganizationRoles200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOrganizationRoles200ResponseInner.class);
  }

  /**
   * Convert an instance of GetOrganizationRoles200ResponseInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

