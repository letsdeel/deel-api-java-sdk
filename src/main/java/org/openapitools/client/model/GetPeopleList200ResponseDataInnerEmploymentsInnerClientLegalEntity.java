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
 * GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity() {
  }

  public GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the client legal entity.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
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
    GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity getPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity = (GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity) o;
    return Objects.equals(this.id, getPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.id) &&
        Objects.equals(this.name, getPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity is not found in the empty JSON string", GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity>() {
           @Override
           public void write(JsonWriter out, GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity
   * @throws IOException if the JSON string is invalid with respect to GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity
   */
  public static GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.class);
  }

  /**
   * Convert an instance of GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

