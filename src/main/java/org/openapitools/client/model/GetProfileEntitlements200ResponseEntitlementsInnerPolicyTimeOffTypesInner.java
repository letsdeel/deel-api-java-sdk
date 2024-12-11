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
 * GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner() {
  }

  public GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Time off type ID
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Time off type name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner getProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner = (GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner) o;
    return Objects.equals(this.id, getProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.id) &&
        Objects.equals(this.name, getProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner is not found in the empty JSON string", GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner>() {
           @Override
           public void write(JsonWriter out, GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner
   * @throws IOException if the JSON string is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner
   */
  public static GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner.class);
  }

  /**
   * Convert an instance of GetProfileEntitlements200ResponseEntitlementsInnerPolicyTimeOffTypesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

