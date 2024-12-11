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
 * EorEmployeeCostCalculationResponseCostsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:20:01.055724240Z[GMT]", comments = "Generator version: 7.10.0")
public class EorEmployeeCostCalculationResponseCostsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private String amount;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private String frequency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String countryCode;

  public EorEmployeeCostCalculationResponseCostsInner() {
  }

  public EorEmployeeCostCalculationResponseCostsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the cost item.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public EorEmployeeCostCalculationResponseCostsInner amount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount or price of the cost item.
   * @return amount
   */
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
  }


  public EorEmployeeCostCalculationResponseCostsInner frequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * The frequency that the cost item must be paid.
   * @return frequency
   */
  @javax.annotation.Nullable
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
  }


  public EorEmployeeCostCalculationResponseCostsInner country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country that the cost item is associated with.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public EorEmployeeCostCalculationResponseCostsInner countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The country code for the country that the cost item is associated with.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorEmployeeCostCalculationResponseCostsInner eorEmployeeCostCalculationResponseCostsInner = (EorEmployeeCostCalculationResponseCostsInner) o;
    return Objects.equals(this.name, eorEmployeeCostCalculationResponseCostsInner.name) &&
        Objects.equals(this.amount, eorEmployeeCostCalculationResponseCostsInner.amount) &&
        Objects.equals(this.frequency, eorEmployeeCostCalculationResponseCostsInner.frequency) &&
        Objects.equals(this.country, eorEmployeeCostCalculationResponseCostsInner.country) &&
        Objects.equals(this.countryCode, eorEmployeeCostCalculationResponseCostsInner.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount, frequency, country, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorEmployeeCostCalculationResponseCostsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("frequency");
    openapiFields.add("country");
    openapiFields.add("country_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorEmployeeCostCalculationResponseCostsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorEmployeeCostCalculationResponseCostsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorEmployeeCostCalculationResponseCostsInner is not found in the empty JSON string", EorEmployeeCostCalculationResponseCostsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorEmployeeCostCalculationResponseCostsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorEmployeeCostCalculationResponseCostsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorEmployeeCostCalculationResponseCostsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorEmployeeCostCalculationResponseCostsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorEmployeeCostCalculationResponseCostsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorEmployeeCostCalculationResponseCostsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EorEmployeeCostCalculationResponseCostsInner>() {
           @Override
           public void write(JsonWriter out, EorEmployeeCostCalculationResponseCostsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorEmployeeCostCalculationResponseCostsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorEmployeeCostCalculationResponseCostsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorEmployeeCostCalculationResponseCostsInner
   * @throws IOException if the JSON string is invalid with respect to EorEmployeeCostCalculationResponseCostsInner
   */
  public static EorEmployeeCostCalculationResponseCostsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorEmployeeCostCalculationResponseCostsInner.class);
  }

  /**
   * Convert an instance of EorEmployeeCostCalculationResponseCostsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

