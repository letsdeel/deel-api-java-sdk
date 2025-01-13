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
 * EditLegalEntityRequestAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class EditLegalEntityRequestAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nullable
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  @javax.annotation.Nullable
  private String street;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public EditLegalEntityRequestAddress() {
  }

  public EditLegalEntityRequestAddress city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * The city.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public EditLegalEntityRequestAddress state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The state.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public EditLegalEntityRequestAddress street(@javax.annotation.Nullable String street) {
    this.street = street;
    return this;
  }

  /**
   * The street address.
   * @return street
   */
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }

  public void setStreet(@javax.annotation.Nullable String street) {
    this.street = street;
  }


  public EditLegalEntityRequestAddress country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The ISO 2-letter country code.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
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
    EditLegalEntityRequestAddress editLegalEntityRequestAddress = (EditLegalEntityRequestAddress) o;
    return Objects.equals(this.city, editLegalEntityRequestAddress.city) &&
        Objects.equals(this.state, editLegalEntityRequestAddress.state) &&
        Objects.equals(this.street, editLegalEntityRequestAddress.street) &&
        Objects.equals(this.country, editLegalEntityRequestAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, street, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditLegalEntityRequestAddress {\n");
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
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("street");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EditLegalEntityRequestAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EditLegalEntityRequestAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditLegalEntityRequestAddress is not found in the empty JSON string", EditLegalEntityRequestAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EditLegalEntityRequestAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EditLegalEntityRequestAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditLegalEntityRequestAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditLegalEntityRequestAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditLegalEntityRequestAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditLegalEntityRequestAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<EditLegalEntityRequestAddress>() {
           @Override
           public void write(JsonWriter out, EditLegalEntityRequestAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EditLegalEntityRequestAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EditLegalEntityRequestAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EditLegalEntityRequestAddress
   * @throws IOException if the JSON string is invalid with respect to EditLegalEntityRequestAddress
   */
  public static EditLegalEntityRequestAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditLegalEntityRequestAddress.class);
  }

  /**
   * Convert an instance of EditLegalEntityRequestAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

