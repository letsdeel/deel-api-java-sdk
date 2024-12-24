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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetContractById200ResponseDataQuoteBenefitsInner;

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
 * EOR quote approved by Deel.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseDataQuote {
  public static final String SERIALIZED_NAME_BENEFITS = "benefits";
  @SerializedName(SERIALIZED_NAME_BENEFITS)
  @javax.annotation.Nullable
  private List<GetContractById200ResponseDataQuoteBenefitsInner> benefits = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public GetContractById200ResponseDataQuote() {
  }

  public GetContractById200ResponseDataQuote benefits(@javax.annotation.Nullable List<GetContractById200ResponseDataQuoteBenefitsInner> benefits) {
    this.benefits = benefits;
    return this;
  }

  public GetContractById200ResponseDataQuote addBenefitsItem(GetContractById200ResponseDataQuoteBenefitsInner benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

  /**
   * Array of benefits.
   * @return benefits
   */
  @javax.annotation.Nullable
  public List<GetContractById200ResponseDataQuoteBenefitsInner> getBenefits() {
    return benefits;
  }

  public void setBenefits(@javax.annotation.Nullable List<GetContractById200ResponseDataQuoteBenefitsInner> benefits) {
    this.benefits = benefits;
  }


  public GetContractById200ResponseDataQuote currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency used for the quote.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractById200ResponseDataQuote getContractById200ResponseDataQuote = (GetContractById200ResponseDataQuote) o;
    return Objects.equals(this.benefits, getContractById200ResponseDataQuote.benefits) &&
        Objects.equals(this.currency, getContractById200ResponseDataQuote.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefits, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractById200ResponseDataQuote {\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("benefits");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseDataQuote
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseDataQuote.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseDataQuote is not found in the empty JSON string", GetContractById200ResponseDataQuote.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseDataQuote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseDataQuote` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("benefits") != null && !jsonObj.get("benefits").isJsonNull()) {
        JsonArray jsonArraybenefits = jsonObj.getAsJsonArray("benefits");
        if (jsonArraybenefits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("benefits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `benefits` to be an array in the JSON string but got `%s`", jsonObj.get("benefits").toString()));
          }

          // validate the optional field `benefits` (array)
          for (int i = 0; i < jsonArraybenefits.size(); i++) {
            GetContractById200ResponseDataQuoteBenefitsInner.validateJsonElement(jsonArraybenefits.get(i));
          };
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseDataQuote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseDataQuote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseDataQuote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseDataQuote.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseDataQuote>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseDataQuote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseDataQuote read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseDataQuote given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseDataQuote
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseDataQuote
   */
  public static GetContractById200ResponseDataQuote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseDataQuote.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseDataQuote to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

