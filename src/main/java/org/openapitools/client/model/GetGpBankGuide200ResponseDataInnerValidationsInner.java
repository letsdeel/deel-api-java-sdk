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
import org.openapitools.client.model.GetGpBankGuide200ResponseDataInnerValidationsInnerValue;

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
 * GetGpBankGuide200ResponseDataInnerValidationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class GetGpBankGuide200ResponseDataInnerValidationsInner {
  /**
   * The type of validation applied to the field.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MIN_LENGTH("MIN_LENGTH"),
    
    MAX_LENGTH("MAX_LENGTH"),
    
    REGEX("REGEX");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private GetGpBankGuide200ResponseDataInnerValidationsInnerValue value;

  public GetGpBankGuide200ResponseDataInnerValidationsInner() {
  }

  public GetGpBankGuide200ResponseDataInnerValidationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of validation applied to the field.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GetGpBankGuide200ResponseDataInnerValidationsInner value(GetGpBankGuide200ResponseDataInnerValidationsInnerValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public GetGpBankGuide200ResponseDataInnerValidationsInnerValue getValue() {
    return value;
  }

  public void setValue(GetGpBankGuide200ResponseDataInnerValidationsInnerValue value) {
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
    GetGpBankGuide200ResponseDataInnerValidationsInner getGpBankGuide200ResponseDataInnerValidationsInner = (GetGpBankGuide200ResponseDataInnerValidationsInner) o;
    return Objects.equals(this.type, getGpBankGuide200ResponseDataInnerValidationsInner.type) &&
        Objects.equals(this.value, getGpBankGuide200ResponseDataInnerValidationsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGpBankGuide200ResponseDataInnerValidationsInner {\n");
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
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetGpBankGuide200ResponseDataInnerValidationsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGpBankGuide200ResponseDataInnerValidationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGpBankGuide200ResponseDataInnerValidationsInner is not found in the empty JSON string", GetGpBankGuide200ResponseDataInnerValidationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGpBankGuide200ResponseDataInnerValidationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGpBankGuide200ResponseDataInnerValidationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        GetGpBankGuide200ResponseDataInnerValidationsInnerValue.validateJsonElement(jsonObj.get("value"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGpBankGuide200ResponseDataInnerValidationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGpBankGuide200ResponseDataInnerValidationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGpBankGuide200ResponseDataInnerValidationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGpBankGuide200ResponseDataInnerValidationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGpBankGuide200ResponseDataInnerValidationsInner>() {
           @Override
           public void write(JsonWriter out, GetGpBankGuide200ResponseDataInnerValidationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGpBankGuide200ResponseDataInnerValidationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetGpBankGuide200ResponseDataInnerValidationsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetGpBankGuide200ResponseDataInnerValidationsInner
   * @throws IOException if the JSON string is invalid with respect to GetGpBankGuide200ResponseDataInnerValidationsInner
   */
  public static GetGpBankGuide200ResponseDataInnerValidationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGpBankGuide200ResponseDataInnerValidationsInner.class);
  }

  /**
   * Convert an instance of GetGpBankGuide200ResponseDataInnerValidationsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
