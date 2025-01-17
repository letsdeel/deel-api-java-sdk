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
 * The physical address of the entity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateLegalEntityRequestDataAddress {
  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  @javax.annotation.Nonnull
  private String zip;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nonnull
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nonnull
  private String state;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  @javax.annotation.Nonnull
  private String street;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nonnull
  private String country;

  public CreateLegalEntityRequestDataAddress() {
  }

  public CreateLegalEntityRequestDataAddress zip(@javax.annotation.Nonnull String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip code.
   * @return zip
   */
  @javax.annotation.Nonnull
  public String getZip() {
    return zip;
  }

  public void setZip(@javax.annotation.Nonnull String zip) {
    this.zip = zip;
  }


  public CreateLegalEntityRequestDataAddress city(@javax.annotation.Nonnull String city) {
    this.city = city;
    return this;
  }

  /**
   * City name.
   * @return city
   */
  @javax.annotation.Nonnull
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nonnull String city) {
    this.city = city;
  }


  public CreateLegalEntityRequestDataAddress state(@javax.annotation.Nonnull String state) {
    this.state = state;
    return this;
  }

  /**
   * State 
   * @return state
   */
  @javax.annotation.Nonnull
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nonnull String state) {
    this.state = state;
  }


  public CreateLegalEntityRequestDataAddress street(@javax.annotation.Nonnull String street) {
    this.street = street;
    return this;
  }

  /**
   * Street address.
   * @return street
   */
  @javax.annotation.Nonnull
  public String getStreet() {
    return street;
  }

  public void setStreet(@javax.annotation.Nonnull String street) {
    this.street = street;
  }


  public CreateLegalEntityRequestDataAddress country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code.
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLegalEntityRequestDataAddress createLegalEntityRequestDataAddress = (CreateLegalEntityRequestDataAddress) o;
    return Objects.equals(this.zip, createLegalEntityRequestDataAddress.zip) &&
        Objects.equals(this.city, createLegalEntityRequestDataAddress.city) &&
        Objects.equals(this.state, createLegalEntityRequestDataAddress.state) &&
        Objects.equals(this.street, createLegalEntityRequestDataAddress.street) &&
        Objects.equals(this.country, createLegalEntityRequestDataAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zip, city, state, street, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLegalEntityRequestDataAddress {\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("zip");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("street");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("zip");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("street");
    openapiRequiredFields.add("country");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateLegalEntityRequestDataAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLegalEntityRequestDataAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLegalEntityRequestDataAddress is not found in the empty JSON string", CreateLegalEntityRequestDataAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateLegalEntityRequestDataAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLegalEntityRequestDataAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLegalEntityRequestDataAddress.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLegalEntityRequestDataAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLegalEntityRequestDataAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLegalEntityRequestDataAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLegalEntityRequestDataAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLegalEntityRequestDataAddress>() {
           @Override
           public void write(JsonWriter out, CreateLegalEntityRequestDataAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLegalEntityRequestDataAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateLegalEntityRequestDataAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateLegalEntityRequestDataAddress
   * @throws IOException if the JSON string is invalid with respect to CreateLegalEntityRequestDataAddress
   */
  public static CreateLegalEntityRequestDataAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLegalEntityRequestDataAddress.class);
  }

  /**
   * Convert an instance of CreateLegalEntityRequestDataAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

