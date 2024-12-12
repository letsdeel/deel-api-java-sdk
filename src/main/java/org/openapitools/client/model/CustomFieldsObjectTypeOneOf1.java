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
 * CustomFieldsObjectTypeOneOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class CustomFieldsObjectTypeOneOf1 {
  /**
   * Currency type
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    CURRENCY("currency");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private NameEnum name;

  public static final String SERIALIZED_NAME_IS_FIXED = "isFixed";
  @SerializedName(SERIALIZED_NAME_IS_FIXED)
  @javax.annotation.Nullable
  private Boolean isFixed;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public CustomFieldsObjectTypeOneOf1() {
  }

  public CustomFieldsObjectTypeOneOf1 name(@javax.annotation.Nullable NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Currency type
   * @return name
   */
  @javax.annotation.Nullable
  public NameEnum getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable NameEnum name) {
    this.name = name;
  }


  public CustomFieldsObjectTypeOneOf1 isFixed(@javax.annotation.Nullable Boolean isFixed) {
    this.isFixed = isFixed;
    return this;
  }

  /**
   * When currency is fixed, only the amount can be edited by the users
   * @return isFixed
   */
  @javax.annotation.Nullable
  public Boolean getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(@javax.annotation.Nullable Boolean isFixed) {
    this.isFixed = isFixed;
  }


  public CustomFieldsObjectTypeOneOf1 currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldsObjectTypeOneOf1 customFieldsObjectTypeOneOf1 = (CustomFieldsObjectTypeOneOf1) o;
    return Objects.equals(this.name, customFieldsObjectTypeOneOf1.name) &&
        Objects.equals(this.isFixed, customFieldsObjectTypeOneOf1.isFixed) &&
        Objects.equals(this.currency, customFieldsObjectTypeOneOf1.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isFixed, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsObjectTypeOneOf1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFixed: ").append(toIndentedString(isFixed)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("isFixed");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldsObjectTypeOneOf1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldsObjectTypeOneOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldsObjectTypeOneOf1 is not found in the empty JSON string", CustomFieldsObjectTypeOneOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldsObjectTypeOneOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldsObjectTypeOneOf1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        NameEnum.validateJsonElement(jsonObj.get("name"));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldsObjectTypeOneOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldsObjectTypeOneOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldsObjectTypeOneOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsObjectTypeOneOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldsObjectTypeOneOf1>() {
           @Override
           public void write(JsonWriter out, CustomFieldsObjectTypeOneOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldsObjectTypeOneOf1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldsObjectTypeOneOf1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldsObjectTypeOneOf1
   * @throws IOException if the JSON string is invalid with respect to CustomFieldsObjectTypeOneOf1
   */
  public static CustomFieldsObjectTypeOneOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldsObjectTypeOneOf1.class);
  }

  /**
   * Convert an instance of CustomFieldsObjectTypeOneOf1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

