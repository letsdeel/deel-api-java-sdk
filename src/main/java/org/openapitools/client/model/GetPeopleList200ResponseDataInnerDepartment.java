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
 * The department of the employee.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeopleList200ResponseDataInnerDepartment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  @javax.annotation.Nullable
  private String parent;

  public GetPeopleList200ResponseDataInnerDepartment() {
  }

  public GetPeopleList200ResponseDataInnerDepartment id(@javax.annotation.Nullable UUID id) {
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


  public GetPeopleList200ResponseDataInnerDepartment name(@javax.annotation.Nullable String name) {
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


  public GetPeopleList200ResponseDataInnerDepartment parent(@javax.annotation.Nullable String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @javax.annotation.Nullable
  public String getParent() {
    return parent;
  }

  public void setParent(@javax.annotation.Nullable String parent) {
    this.parent = parent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPeopleList200ResponseDataInnerDepartment getPeopleList200ResponseDataInnerDepartment = (GetPeopleList200ResponseDataInnerDepartment) o;
    return Objects.equals(this.id, getPeopleList200ResponseDataInnerDepartment.id) &&
        Objects.equals(this.name, getPeopleList200ResponseDataInnerDepartment.name) &&
        Objects.equals(this.parent, getPeopleList200ResponseDataInnerDepartment.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeopleList200ResponseDataInnerDepartment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
    openapiFields.add("parent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPeopleList200ResponseDataInnerDepartment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeopleList200ResponseDataInnerDepartment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeopleList200ResponseDataInnerDepartment is not found in the empty JSON string", GetPeopleList200ResponseDataInnerDepartment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeopleList200ResponseDataInnerDepartment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeopleList200ResponseDataInnerDepartment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPeopleList200ResponseDataInnerDepartment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeopleList200ResponseDataInnerDepartment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeopleList200ResponseDataInnerDepartment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeopleList200ResponseDataInnerDepartment.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeopleList200ResponseDataInnerDepartment>() {
           @Override
           public void write(JsonWriter out, GetPeopleList200ResponseDataInnerDepartment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeopleList200ResponseDataInnerDepartment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeopleList200ResponseDataInnerDepartment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeopleList200ResponseDataInnerDepartment
   * @throws IOException if the JSON string is invalid with respect to GetPeopleList200ResponseDataInnerDepartment
   */
  public static GetPeopleList200ResponseDataInnerDepartment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeopleList200ResponseDataInnerDepartment.class);
  }

  /**
   * Convert an instance of GetPeopleList200ResponseDataInnerDepartment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

