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
 * GetRolesItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T18:19:15.469015129Z[GMT]", comments = "Generator version: 7.10.0")
public class GetRolesItem {
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

  public static final String SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID = "hrisOrgStructureId";
  @SerializedName(SERIALIZED_NAME_HRIS_ORG_STRUCTURE_ID)
  @javax.annotation.Nullable
  private String hrisOrgStructureId;

  public GetRolesItem() {
  }

  public GetRolesItem id(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
  }


  public GetRolesItem name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetRolesItem scope(@javax.annotation.Nullable String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nullable String scope) {
    this.scope = scope;
  }


  public GetRolesItem hrisOrgStructureId(@javax.annotation.Nullable String hrisOrgStructureId) {
    this.hrisOrgStructureId = hrisOrgStructureId;
    return this;
  }

  /**
   * Get hrisOrgStructureId
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
    GetRolesItem getRolesItem = (GetRolesItem) o;
    return Objects.equals(this.id, getRolesItem.id) &&
        Objects.equals(this.name, getRolesItem.name) &&
        Objects.equals(this.scope, getRolesItem.scope) &&
        Objects.equals(this.hrisOrgStructureId, getRolesItem.hrisOrgStructureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, scope, hrisOrgStructureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRolesItem {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRolesItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRolesItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRolesItem is not found in the empty JSON string", GetRolesItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRolesItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRolesItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
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
       if (!GetRolesItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRolesItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRolesItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRolesItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRolesItem>() {
           @Override
           public void write(JsonWriter out, GetRolesItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRolesItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRolesItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRolesItem
   * @throws IOException if the JSON string is invalid with respect to GetRolesItem
   */
  public static GetRolesItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRolesItem.class);
  }

  /**
   * Convert an instance of GetRolesItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

