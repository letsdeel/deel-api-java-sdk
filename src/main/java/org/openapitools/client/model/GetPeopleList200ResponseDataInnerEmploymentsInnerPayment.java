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
 * GetPeopleList200ResponseDataInnerEmploymentsInnerPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:20:01.055724240Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeopleList200ResponseDataInnerEmploymentsInnerPayment {
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

  public GetPeopleList200ResponseDataInnerEmploymentsInnerPayment() {
  }

  public GetPeopleList200ResponseDataInnerEmploymentsInnerPayment rate(@javax.annotation.Nullable BigDecimal rate) {
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


  public GetPeopleList200ResponseDataInnerEmploymentsInnerPayment scale(@javax.annotation.Nullable String scale) {
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


  public GetPeopleList200ResponseDataInnerEmploymentsInnerPayment currency(@javax.annotation.Nullable String currency) {
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


  public GetPeopleList200ResponseDataInnerEmploymentsInnerPayment contractName(@javax.annotation.Nullable String contractName) {
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
    GetPeopleList200ResponseDataInnerEmploymentsInnerPayment getPeopleList200ResponseDataInnerEmploymentsInnerPayment = (GetPeopleList200ResponseDataInnerEmploymentsInnerPayment) o;
    return Objects.equals(this.rate, getPeopleList200ResponseDataInnerEmploymentsInnerPayment.rate) &&
        Objects.equals(this.scale, getPeopleList200ResponseDataInnerEmploymentsInnerPayment.scale) &&
        Objects.equals(this.currency, getPeopleList200ResponseDataInnerEmploymentsInnerPayment.currency) &&
        Objects.equals(this.contractName, getPeopleList200ResponseDataInnerEmploymentsInnerPayment.contractName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, scale, currency, contractName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeopleList200ResponseDataInnerEmploymentsInnerPayment {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetPeopleList200ResponseDataInnerEmploymentsInnerPayment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeopleList200ResponseDataInnerEmploymentsInnerPayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeopleList200ResponseDataInnerEmploymentsInnerPayment is not found in the empty JSON string", GetPeopleList200ResponseDataInnerEmploymentsInnerPayment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeopleList200ResponseDataInnerEmploymentsInnerPayment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeopleList200ResponseDataInnerEmploymentsInnerPayment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetPeopleList200ResponseDataInnerEmploymentsInnerPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeopleList200ResponseDataInnerEmploymentsInnerPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeopleList200ResponseDataInnerEmploymentsInnerPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeopleList200ResponseDataInnerEmploymentsInnerPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeopleList200ResponseDataInnerEmploymentsInnerPayment>() {
           @Override
           public void write(JsonWriter out, GetPeopleList200ResponseDataInnerEmploymentsInnerPayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeopleList200ResponseDataInnerEmploymentsInnerPayment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeopleList200ResponseDataInnerEmploymentsInnerPayment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeopleList200ResponseDataInnerEmploymentsInnerPayment
   * @throws IOException if the JSON string is invalid with respect to GetPeopleList200ResponseDataInnerEmploymentsInnerPayment
   */
  public static GetPeopleList200ResponseDataInnerEmploymentsInnerPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeopleList200ResponseDataInnerEmploymentsInnerPayment.class);
  }

  /**
   * Convert an instance of GetPeopleList200ResponseDataInnerEmploymentsInnerPayment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

