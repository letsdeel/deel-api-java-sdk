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
import org.openapitools.client.model.TimeTrackingShiftRateType;

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
 * Data for the shift rate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateShiftRateRequestBodyContainerData {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String externalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TimeTrackingShiftRateType type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nonnull
  private BigDecimal value;

  public CreateShiftRateRequestBodyContainerData() {
  }

  public CreateShiftRateRequestBodyContainerData externalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External ID for the shift rate
   * @return externalId
   */
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
  }


  public CreateShiftRateRequestBodyContainerData name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the shift rate
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateShiftRateRequestBodyContainerData type(@javax.annotation.Nonnull TimeTrackingShiftRateType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TimeTrackingShiftRateType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TimeTrackingShiftRateType type) {
    this.type = type;
  }


  public CreateShiftRateRequestBodyContainerData value(@javax.annotation.Nonnull BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the rate
   * minimum: 0
   * @return value
   */
  @javax.annotation.Nonnull
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nonnull BigDecimal value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShiftRateRequestBodyContainerData createShiftRateRequestBodyContainerData = (CreateShiftRateRequestBodyContainerData) o;
    return Objects.equals(this.externalId, createShiftRateRequestBodyContainerData.externalId) &&
        Objects.equals(this.name, createShiftRateRequestBodyContainerData.name) &&
        Objects.equals(this.type, createShiftRateRequestBodyContainerData.type) &&
        Objects.equals(this.value, createShiftRateRequestBodyContainerData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, name, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShiftRateRequestBodyContainerData {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("external_id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateShiftRateRequestBodyContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateShiftRateRequestBodyContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShiftRateRequestBodyContainerData is not found in the empty JSON string", CreateShiftRateRequestBodyContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateShiftRateRequestBodyContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShiftRateRequestBodyContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateShiftRateRequestBodyContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `type`
      TimeTrackingShiftRateType.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShiftRateRequestBodyContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShiftRateRequestBodyContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShiftRateRequestBodyContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShiftRateRequestBodyContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShiftRateRequestBodyContainerData>() {
           @Override
           public void write(JsonWriter out, CreateShiftRateRequestBodyContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShiftRateRequestBodyContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateShiftRateRequestBodyContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateShiftRateRequestBodyContainerData
   * @throws IOException if the JSON string is invalid with respect to CreateShiftRateRequestBodyContainerData
   */
  public static CreateShiftRateRequestBodyContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShiftRateRequestBodyContainerData.class);
  }

  /**
   * Convert an instance of CreateShiftRateRequestBodyContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

