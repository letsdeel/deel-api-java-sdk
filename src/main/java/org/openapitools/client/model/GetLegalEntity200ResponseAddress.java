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
 * Address of the legal entity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class GetLegalEntity200ResponseAddress {
  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  @javax.annotation.Nullable
  private String zip;

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

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  @javax.annotation.Nullable
  private String province;

  public GetLegalEntity200ResponseAddress() {
  }

  public GetLegalEntity200ResponseAddress zip(@javax.annotation.Nullable String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Get zip
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(@javax.annotation.Nullable String zip) {
    this.zip = zip;
  }


  public GetLegalEntity200ResponseAddress city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public GetLegalEntity200ResponseAddress state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public GetLegalEntity200ResponseAddress street(@javax.annotation.Nullable String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
   */
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }

  public void setStreet(@javax.annotation.Nullable String street) {
    this.street = street;
  }


  public GetLegalEntity200ResponseAddress country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetLegalEntity200ResponseAddress province(@javax.annotation.Nullable String province) {
    this.province = province;
    return this;
  }

  /**
   * Get province
   * @return province
   */
  @javax.annotation.Nullable
  public String getProvince() {
    return province;
  }

  public void setProvince(@javax.annotation.Nullable String province) {
    this.province = province;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLegalEntity200ResponseAddress getLegalEntity200ResponseAddress = (GetLegalEntity200ResponseAddress) o;
    return Objects.equals(this.zip, getLegalEntity200ResponseAddress.zip) &&
        Objects.equals(this.city, getLegalEntity200ResponseAddress.city) &&
        Objects.equals(this.state, getLegalEntity200ResponseAddress.state) &&
        Objects.equals(this.street, getLegalEntity200ResponseAddress.street) &&
        Objects.equals(this.country, getLegalEntity200ResponseAddress.country) &&
        Objects.equals(this.province, getLegalEntity200ResponseAddress.province);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(zip, city, state, street, country, province);
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
    sb.append("class GetLegalEntity200ResponseAddress {\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
    openapiFields.add("province");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetLegalEntity200ResponseAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLegalEntity200ResponseAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLegalEntity200ResponseAddress is not found in the empty JSON string", GetLegalEntity200ResponseAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLegalEntity200ResponseAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLegalEntity200ResponseAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
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
      if ((jsonObj.get("province") != null && !jsonObj.get("province").isJsonNull()) && !jsonObj.get("province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLegalEntity200ResponseAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLegalEntity200ResponseAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLegalEntity200ResponseAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLegalEntity200ResponseAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLegalEntity200ResponseAddress>() {
           @Override
           public void write(JsonWriter out, GetLegalEntity200ResponseAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLegalEntity200ResponseAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLegalEntity200ResponseAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLegalEntity200ResponseAddress
   * @throws IOException if the JSON string is invalid with respect to GetLegalEntity200ResponseAddress
   */
  public static GetLegalEntity200ResponseAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLegalEntity200ResponseAddress.class);
  }

  /**
   * Convert an instance of GetLegalEntity200ResponseAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

