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
 * CreateGroupRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGroupRequestData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_EXTERNAL_METADATA = "external_metadata";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_METADATA)
  @javax.annotation.Nullable
  private Object externalMetadata;

  public CreateGroupRequestData() {
  }

  public CreateGroupRequestData name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the group to be created.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateGroupRequestData externalMetadata(@javax.annotation.Nullable Object externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  /**
   * The extra information of the group to be created.
   * @return externalMetadata
   */
  @javax.annotation.Nullable
  public Object getExternalMetadata() {
    return externalMetadata;
  }

  public void setExternalMetadata(@javax.annotation.Nullable Object externalMetadata) {
    this.externalMetadata = externalMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequestData createGroupRequestData = (CreateGroupRequestData) o;
    return Objects.equals(this.name, createGroupRequestData.name) &&
        Objects.equals(this.externalMetadata, createGroupRequestData.externalMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, externalMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequestData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalMetadata: ").append(toIndentedString(externalMetadata)).append("\n");
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
    openapiFields.add("external_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGroupRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGroupRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGroupRequestData is not found in the empty JSON string", CreateGroupRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGroupRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGroupRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGroupRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGroupRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGroupRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGroupRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGroupRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGroupRequestData>() {
           @Override
           public void write(JsonWriter out, CreateGroupRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGroupRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGroupRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGroupRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateGroupRequestData
   */
  public static CreateGroupRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGroupRequestData.class);
  }

  /**
   * Convert an instance of CreateGroupRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

