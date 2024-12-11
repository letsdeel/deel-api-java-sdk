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
 * GetShiftRates200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class GetShiftRates200ResponseDataInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nonnull
  private BigDecimal value;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private String updatedAt;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String externalId;

  public GetShiftRates200ResponseDataInner() {
  }

  public GetShiftRates200ResponseDataInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the shift rate.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetShiftRates200ResponseDataInner type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the shift rate (e.g., MULTIPLIER_PERCENTAGE or FLAT_RATE).
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public GetShiftRates200ResponseDataInner value(@javax.annotation.Nonnull BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The value associated with the shift rate.
   * @return value
   */
  @javax.annotation.Nonnull
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nonnull BigDecimal value) {
    this.value = value;
  }


  public GetShiftRates200ResponseDataInner createdAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp indicating when the shift rate was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }


  public GetShiftRates200ResponseDataInner updatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp indicating when the shift rate was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public GetShiftRates200ResponseDataInner externalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External identifier of the shift rate.
   * @return externalId
   */
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nonnull String externalId) {
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
    GetShiftRates200ResponseDataInner getShiftRates200ResponseDataInner = (GetShiftRates200ResponseDataInner) o;
    return Objects.equals(this.name, getShiftRates200ResponseDataInner.name) &&
        Objects.equals(this.type, getShiftRates200ResponseDataInner.type) &&
        Objects.equals(this.value, getShiftRates200ResponseDataInner.value) &&
        Objects.equals(this.createdAt, getShiftRates200ResponseDataInner.createdAt) &&
        Objects.equals(this.updatedAt, getShiftRates200ResponseDataInner.updatedAt) &&
        Objects.equals(this.externalId, getShiftRates200ResponseDataInner.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, createdAt, updatedAt, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShiftRates200ResponseDataInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("external_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetShiftRates200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetShiftRates200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetShiftRates200ResponseDataInner is not found in the empty JSON string", GetShiftRates200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetShiftRates200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetShiftRates200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetShiftRates200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetShiftRates200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetShiftRates200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetShiftRates200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetShiftRates200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetShiftRates200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetShiftRates200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetShiftRates200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetShiftRates200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetShiftRates200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetShiftRates200ResponseDataInner
   */
  public static GetShiftRates200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetShiftRates200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetShiftRates200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

