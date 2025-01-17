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
 * GPContractToCreateEmployeeAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GPContractToCreateEmployeeAddress {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  @javax.annotation.Nonnull
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nonnull
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  @javax.annotation.Nonnull
  private String zip;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nonnull
  private String country;

  public GPContractToCreateEmployeeAddress() {
  }

  public GPContractToCreateEmployeeAddress street(@javax.annotation.Nonnull String street) {
    this.street = street;
    return this;
  }

  /**
   * Street and number.
   * @return street
   */
  @javax.annotation.Nonnull
  public String getStreet() {
    return street;
  }

  public void setStreet(@javax.annotation.Nonnull String street) {
    this.street = street;
  }


  public GPContractToCreateEmployeeAddress city(@javax.annotation.Nonnull String city) {
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


  public GPContractToCreateEmployeeAddress state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State code.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public GPContractToCreateEmployeeAddress zip(@javax.annotation.Nonnull String zip) {
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


  public GPContractToCreateEmployeeAddress country(@javax.annotation.Nonnull String country) {
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
    GPContractToCreateEmployeeAddress gpContractToCreateEmployeeAddress = (GPContractToCreateEmployeeAddress) o;
    return Objects.equals(this.street, gpContractToCreateEmployeeAddress.street) &&
        Objects.equals(this.city, gpContractToCreateEmployeeAddress.city) &&
        Objects.equals(this.state, gpContractToCreateEmployeeAddress.state) &&
        Objects.equals(this.zip, gpContractToCreateEmployeeAddress.zip) &&
        Objects.equals(this.country, gpContractToCreateEmployeeAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, state, zip, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPContractToCreateEmployeeAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("street");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("street");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("zip");
    openapiRequiredFields.add("country");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPContractToCreateEmployeeAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPContractToCreateEmployeeAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractToCreateEmployeeAddress is not found in the empty JSON string", GPContractToCreateEmployeeAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPContractToCreateEmployeeAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPContractToCreateEmployeeAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPContractToCreateEmployeeAddress.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractToCreateEmployeeAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractToCreateEmployeeAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractToCreateEmployeeAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractToCreateEmployeeAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractToCreateEmployeeAddress>() {
           @Override
           public void write(JsonWriter out, GPContractToCreateEmployeeAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPContractToCreateEmployeeAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPContractToCreateEmployeeAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPContractToCreateEmployeeAddress
   * @throws IOException if the JSON string is invalid with respect to GPContractToCreateEmployeeAddress
   */
  public static GPContractToCreateEmployeeAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractToCreateEmployeeAddress.class);
  }

  /**
   * Convert an instance of GPContractToCreateEmployeeAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

