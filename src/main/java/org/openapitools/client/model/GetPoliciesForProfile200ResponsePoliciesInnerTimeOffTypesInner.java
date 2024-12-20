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
 * GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner() {
  }

  public GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Time off type id.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Time off type name.
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
    GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner getPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner = (GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner) o;
    return Objects.equals(this.id, getPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.id) &&
        Objects.equals(this.name, getPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner is not found in the empty JSON string", GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.openapiRequiredFields) {
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
       if (!GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner>() {
           @Override
           public void write(JsonWriter out, GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner
   * @throws IOException if the JSON string is invalid with respect to GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner
   */
  public static GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.class);
  }

  /**
   * Convert an instance of GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

