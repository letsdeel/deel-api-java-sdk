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
 * PeoplePayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class PeoplePayment {
  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  @javax.annotation.Nullable
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private String scale;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contract_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  @javax.annotation.Nullable
  private String contractName;

  public PeoplePayment() {
  }

  public PeoplePayment rate(@javax.annotation.Nullable BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The payment rate
   * @return rate
   */
  @javax.annotation.Nullable
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(@javax.annotation.Nullable BigDecimal rate) {
    this.rate = rate;
  }


  public PeoplePayment scale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * The payment scale (e.g., hourly, weekly, monthly, etc.)
   * @return scale
   */
  @javax.annotation.Nullable
  public String getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
  }


  public PeoplePayment currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency code (ISO 4217) for the payment
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public PeoplePayment contractName(@javax.annotation.Nullable String contractName) {
    this.contractName = contractName;
    return this;
  }

  /**
   * The name of the contract associated with the payment
   * @return contractName
   */
  @javax.annotation.Nullable
  public String getContractName() {
    return contractName;
  }

  public void setContractName(@javax.annotation.Nullable String contractName) {
    this.contractName = contractName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeoplePayment peoplePayment = (PeoplePayment) o;
    return Objects.equals(this.rate, peoplePayment.rate) &&
        Objects.equals(this.scale, peoplePayment.scale) &&
        Objects.equals(this.currency, peoplePayment.currency) &&
        Objects.equals(this.contractName, peoplePayment.contractName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, scale, currency, contractName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeoplePayment {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
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
    openapiFields.add("rate");
    openapiFields.add("scale");
    openapiFields.add("currency");
    openapiFields.add("contract_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PeoplePayment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PeoplePayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeoplePayment is not found in the empty JSON string", PeoplePayment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PeoplePayment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeoplePayment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("contract_name") != null && !jsonObj.get("contract_name").isJsonNull()) && !jsonObj.get("contract_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeoplePayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeoplePayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeoplePayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeoplePayment.class));

       return (TypeAdapter<T>) new TypeAdapter<PeoplePayment>() {
           @Override
           public void write(JsonWriter out, PeoplePayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeoplePayment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PeoplePayment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PeoplePayment
   * @throws IOException if the JSON string is invalid with respect to PeoplePayment
   */
  public static PeoplePayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeoplePayment.class);
  }

  /**
   * Convert an instance of PeoplePayment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

