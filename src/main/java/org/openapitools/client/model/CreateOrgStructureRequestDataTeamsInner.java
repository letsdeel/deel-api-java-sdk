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
 * CreateOrgStructureRequestDataTeamsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateOrgStructureRequestDataTeamsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public CreateOrgStructureRequestDataTeamsInner() {
  }

  public CreateOrgStructureRequestDataTeamsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the team.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CreateOrgStructureRequestDataTeamsInner externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The external identifier of the team.
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
    CreateOrgStructureRequestDataTeamsInner createOrgStructureRequestDataTeamsInner = (CreateOrgStructureRequestDataTeamsInner) o;
    return Objects.equals(this.name, createOrgStructureRequestDataTeamsInner.name) &&
        Objects.equals(this.externalId, createOrgStructureRequestDataTeamsInner.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrgStructureRequestDataTeamsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOrgStructureRequestDataTeamsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrgStructureRequestDataTeamsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrgStructureRequestDataTeamsInner is not found in the empty JSON string", CreateOrgStructureRequestDataTeamsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrgStructureRequestDataTeamsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrgStructureRequestDataTeamsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrgStructureRequestDataTeamsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrgStructureRequestDataTeamsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrgStructureRequestDataTeamsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrgStructureRequestDataTeamsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrgStructureRequestDataTeamsInner>() {
           @Override
           public void write(JsonWriter out, CreateOrgStructureRequestDataTeamsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrgStructureRequestDataTeamsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOrgStructureRequestDataTeamsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOrgStructureRequestDataTeamsInner
   * @throws IOException if the JSON string is invalid with respect to CreateOrgStructureRequestDataTeamsInner
   */
  public static CreateOrgStructureRequestDataTeamsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrgStructureRequestDataTeamsInner.class);
  }

  /**
   * Convert an instance of CreateOrgStructureRequestDataTeamsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

