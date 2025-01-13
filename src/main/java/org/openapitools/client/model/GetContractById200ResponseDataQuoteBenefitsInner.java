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
 * GetContractById200ResponseDataQuoteBenefitsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseDataQuoteBenefitsInner {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  @javax.annotation.Nullable
  private BigDecimal fee;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  @javax.annotation.Nullable
  private String plan;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  @javax.annotation.Nullable
  private BigDecimal price;

  public static final String SERIALIZED_NAME_FEE_USD = "fee_usd";
  @SerializedName(SERIALIZED_NAME_FEE_USD)
  @javax.annotation.Nullable
  private BigDecimal feeUsd;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_PRICE_USD = "price_usd";
  @SerializedName(SERIALIZED_NAME_PRICE_USD)
  @javax.annotation.Nullable
  private BigDecimal priceUsd;

  public GetContractById200ResponseDataQuoteBenefitsInner() {
  }

  public GetContractById200ResponseDataQuoteBenefitsInner fee(@javax.annotation.Nullable BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Fee in local currency.
   * @return fee
   */
  @javax.annotation.Nullable
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(@javax.annotation.Nullable BigDecimal fee) {
    this.fee = fee;
  }


  public GetContractById200ResponseDataQuoteBenefitsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Benefit&#39;s name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetContractById200ResponseDataQuoteBenefitsInner plan(@javax.annotation.Nullable String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Benefit&#39;s plan.
   * @return plan
   */
  @javax.annotation.Nullable
  public String getPlan() {
    return plan;
  }

  public void setPlan(@javax.annotation.Nullable String plan) {
    this.plan = plan;
  }


  public GetContractById200ResponseDataQuoteBenefitsInner price(@javax.annotation.Nullable BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Price in local currency.
   * @return price
   */
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(@javax.annotation.Nullable BigDecimal price) {
    this.price = price;
  }


  public GetContractById200ResponseDataQuoteBenefitsInner feeUsd(@javax.annotation.Nullable BigDecimal feeUsd) {
    this.feeUsd = feeUsd;
    return this;
  }

  /**
   * Fee in USD.
   * @return feeUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getFeeUsd() {
    return feeUsd;
  }

  public void setFeeUsd(@javax.annotation.Nullable BigDecimal feeUsd) {
    this.feeUsd = feeUsd;
  }


  public GetContractById200ResponseDataQuoteBenefitsInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public GetContractById200ResponseDataQuoteBenefitsInner priceUsd(@javax.annotation.Nullable BigDecimal priceUsd) {
    this.priceUsd = priceUsd;
    return this;
  }

  /**
   * Price in USD.
   * @return priceUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getPriceUsd() {
    return priceUsd;
  }

  public void setPriceUsd(@javax.annotation.Nullable BigDecimal priceUsd) {
    this.priceUsd = priceUsd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractById200ResponseDataQuoteBenefitsInner getContractById200ResponseDataQuoteBenefitsInner = (GetContractById200ResponseDataQuoteBenefitsInner) o;
    return Objects.equals(this.fee, getContractById200ResponseDataQuoteBenefitsInner.fee) &&
        Objects.equals(this.name, getContractById200ResponseDataQuoteBenefitsInner.name) &&
        Objects.equals(this.plan, getContractById200ResponseDataQuoteBenefitsInner.plan) &&
        Objects.equals(this.price, getContractById200ResponseDataQuoteBenefitsInner.price) &&
        Objects.equals(this.feeUsd, getContractById200ResponseDataQuoteBenefitsInner.feeUsd) &&
        Objects.equals(this.currency, getContractById200ResponseDataQuoteBenefitsInner.currency) &&
        Objects.equals(this.priceUsd, getContractById200ResponseDataQuoteBenefitsInner.priceUsd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, name, plan, price, feeUsd, currency, priceUsd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractById200ResponseDataQuoteBenefitsInner {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    feeUsd: ").append(toIndentedString(feeUsd)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    priceUsd: ").append(toIndentedString(priceUsd)).append("\n");
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
    openapiFields.add("fee");
    openapiFields.add("name");
    openapiFields.add("plan");
    openapiFields.add("price");
    openapiFields.add("fee_usd");
    openapiFields.add("currency");
    openapiFields.add("price_usd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseDataQuoteBenefitsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseDataQuoteBenefitsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseDataQuoteBenefitsInner is not found in the empty JSON string", GetContractById200ResponseDataQuoteBenefitsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseDataQuoteBenefitsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseDataQuoteBenefitsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseDataQuoteBenefitsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseDataQuoteBenefitsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseDataQuoteBenefitsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseDataQuoteBenefitsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseDataQuoteBenefitsInner>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseDataQuoteBenefitsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseDataQuoteBenefitsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseDataQuoteBenefitsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseDataQuoteBenefitsInner
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseDataQuoteBenefitsInner
   */
  public static GetContractById200ResponseDataQuoteBenefitsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseDataQuoteBenefitsInner.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseDataQuoteBenefitsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

