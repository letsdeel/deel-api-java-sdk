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
 * CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal total;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_TOTAL_USD = "total_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal totalUsd;

  public CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner() {
  }

  public CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Cost&#39;s name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner total(@javax.annotation.Nullable BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Total cost in local currency
   * @return total
   */
  @javax.annotation.Nullable
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable BigDecimal total) {
    this.total = total;
  }


  public CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner currency(@javax.annotation.Nullable String currency) {
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


  public CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner totalUsd(@javax.annotation.Nullable BigDecimal totalUsd) {
    this.totalUsd = totalUsd;
    return this;
  }

  /**
   * Total cost in USD
   * @return totalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalUsd() {
    return totalUsd;
  }

  public void setTotalUsd(@javax.annotation.Nullable BigDecimal totalUsd) {
    this.totalUsd = totalUsd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner createContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner = (CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner) o;
    return Objects.equals(this.name, createContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.name) &&
        Objects.equals(this.total, createContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.total) &&
        Objects.equals(this.currency, createContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.currency) &&
        Objects.equals(this.totalUsd, createContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.totalUsd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, total, currency, totalUsd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalUsd: ").append(toIndentedString(totalUsd)).append("\n");
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
    openapiFields.add("total");
    openapiFields.add("currency");
    openapiFields.add("total_usd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner is not found in the empty JSON string", CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner
   */
  public static CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

