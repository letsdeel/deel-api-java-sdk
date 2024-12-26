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
 * GetContractEquityWithholdingAmount200ResponseDataBreakdownInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractEquityWithholdingAmount200ResponseDataBreakdownInner {
  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  @javax.annotation.Nullable
  private String tax;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  @javax.annotation.Nullable
  private String rate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private String amount;

  public GetContractEquityWithholdingAmount200ResponseDataBreakdownInner() {
  }

  public GetContractEquityWithholdingAmount200ResponseDataBreakdownInner tax(@javax.annotation.Nullable String tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Name of tax.
   * @return tax
   */
  @javax.annotation.Nullable
  public String getTax() {
    return tax;
  }

  public void setTax(@javax.annotation.Nullable String tax) {
    this.tax = tax;
  }


  public GetContractEquityWithholdingAmount200ResponseDataBreakdownInner rate(@javax.annotation.Nullable String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Tax rate as a percentage.
   * @return rate
   */
  @javax.annotation.Nullable
  public String getRate() {
    return rate;
  }

  public void setRate(@javax.annotation.Nullable String rate) {
    this.rate = rate;
  }


  public GetContractEquityWithholdingAmount200ResponseDataBreakdownInner amount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Tax amount.
   * @return amount
   */
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractEquityWithholdingAmount200ResponseDataBreakdownInner getContractEquityWithholdingAmount200ResponseDataBreakdownInner = (GetContractEquityWithholdingAmount200ResponseDataBreakdownInner) o;
    return Objects.equals(this.tax, getContractEquityWithholdingAmount200ResponseDataBreakdownInner.tax) &&
        Objects.equals(this.rate, getContractEquityWithholdingAmount200ResponseDataBreakdownInner.rate) &&
        Objects.equals(this.amount, getContractEquityWithholdingAmount200ResponseDataBreakdownInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tax, rate, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractEquityWithholdingAmount200ResponseDataBreakdownInner {\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("tax");
    openapiFields.add("rate");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractEquityWithholdingAmount200ResponseDataBreakdownInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractEquityWithholdingAmount200ResponseDataBreakdownInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractEquityWithholdingAmount200ResponseDataBreakdownInner is not found in the empty JSON string", GetContractEquityWithholdingAmount200ResponseDataBreakdownInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractEquityWithholdingAmount200ResponseDataBreakdownInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractEquityWithholdingAmount200ResponseDataBreakdownInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonNull()) && !jsonObj.get("tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax").toString()));
      }
      if ((jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonNull()) && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractEquityWithholdingAmount200ResponseDataBreakdownInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractEquityWithholdingAmount200ResponseDataBreakdownInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractEquityWithholdingAmount200ResponseDataBreakdownInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractEquityWithholdingAmount200ResponseDataBreakdownInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractEquityWithholdingAmount200ResponseDataBreakdownInner>() {
           @Override
           public void write(JsonWriter out, GetContractEquityWithholdingAmount200ResponseDataBreakdownInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractEquityWithholdingAmount200ResponseDataBreakdownInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractEquityWithholdingAmount200ResponseDataBreakdownInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractEquityWithholdingAmount200ResponseDataBreakdownInner
   * @throws IOException if the JSON string is invalid with respect to GetContractEquityWithholdingAmount200ResponseDataBreakdownInner
   */
  public static GetContractEquityWithholdingAmount200ResponseDataBreakdownInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractEquityWithholdingAmount200ResponseDataBreakdownInner.class);
  }

  /**
   * Convert an instance of GetContractEquityWithholdingAmount200ResponseDataBreakdownInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

