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
 * GetDepartments200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:50:05.582888578Z[GMT]", comments = "Generator version: 7.10.0")
public class GetDepartments200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  @javax.annotation.Nullable
  private String parent;

  public GetDepartments200ResponseDataInner() {
  }

  public GetDepartments200ResponseDataInner id(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the department.
   * @return id
   */
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
  }


  public GetDepartments200ResponseDataInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the department.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetDepartments200ResponseDataInner parent(@javax.annotation.Nullable String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The ID of the parent department, if applicable.
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
    GetDepartments200ResponseDataInner getDepartments200ResponseDataInner = (GetDepartments200ResponseDataInner) o;
    return Objects.equals(this.id, getDepartments200ResponseDataInner.id) &&
        Objects.equals(this.name, getDepartments200ResponseDataInner.name) &&
        Objects.equals(this.parent, getDepartments200ResponseDataInner.parent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parent);
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
    sb.append("class GetDepartments200ResponseDataInner {\n");
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
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDepartments200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDepartments200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDepartments200ResponseDataInner is not found in the empty JSON string", GetDepartments200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDepartments200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDepartments200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetDepartments200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
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
       if (!GetDepartments200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDepartments200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDepartments200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDepartments200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDepartments200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetDepartments200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDepartments200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDepartments200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDepartments200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetDepartments200ResponseDataInner
   */
  public static GetDepartments200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDepartments200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetDepartments200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

