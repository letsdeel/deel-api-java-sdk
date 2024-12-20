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
 * Contribution values for match rate type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class Put401kPlansDefinitionRequestContributionValueForMatchRateInner {
  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  @javax.annotation.Nonnull
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nonnull
  private BigDecimal limit;

  public Put401kPlansDefinitionRequestContributionValueForMatchRateInner() {
  }

  public Put401kPlansDefinitionRequestContributionValueForMatchRateInner rate(@javax.annotation.Nonnull BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate of matching contribution.
   * @return rate
   */
  @javax.annotation.Nonnull
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(@javax.annotation.Nonnull BigDecimal rate) {
    this.rate = rate;
  }


  public Put401kPlansDefinitionRequestContributionValueForMatchRateInner limit(@javax.annotation.Nonnull BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Limit up to which the match rate is applicable.
   * @return limit
   */
  @javax.annotation.Nonnull
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(@javax.annotation.Nonnull BigDecimal limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Put401kPlansDefinitionRequestContributionValueForMatchRateInner put401kPlansDefinitionRequestContributionValueForMatchRateInner = (Put401kPlansDefinitionRequestContributionValueForMatchRateInner) o;
    return Objects.equals(this.rate, put401kPlansDefinitionRequestContributionValueForMatchRateInner.rate) &&
        Objects.equals(this.limit, put401kPlansDefinitionRequestContributionValueForMatchRateInner.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Put401kPlansDefinitionRequestContributionValueForMatchRateInner {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rate");
    openapiRequiredFields.add("limit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Put401kPlansDefinitionRequestContributionValueForMatchRateInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Put401kPlansDefinitionRequestContributionValueForMatchRateInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Put401kPlansDefinitionRequestContributionValueForMatchRateInner is not found in the empty JSON string", Put401kPlansDefinitionRequestContributionValueForMatchRateInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Put401kPlansDefinitionRequestContributionValueForMatchRateInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Put401kPlansDefinitionRequestContributionValueForMatchRateInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Put401kPlansDefinitionRequestContributionValueForMatchRateInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Put401kPlansDefinitionRequestContributionValueForMatchRateInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Put401kPlansDefinitionRequestContributionValueForMatchRateInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Put401kPlansDefinitionRequestContributionValueForMatchRateInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Put401kPlansDefinitionRequestContributionValueForMatchRateInner.class));

       return (TypeAdapter<T>) new TypeAdapter<Put401kPlansDefinitionRequestContributionValueForMatchRateInner>() {
           @Override
           public void write(JsonWriter out, Put401kPlansDefinitionRequestContributionValueForMatchRateInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Put401kPlansDefinitionRequestContributionValueForMatchRateInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Put401kPlansDefinitionRequestContributionValueForMatchRateInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Put401kPlansDefinitionRequestContributionValueForMatchRateInner
   * @throws IOException if the JSON string is invalid with respect to Put401kPlansDefinitionRequestContributionValueForMatchRateInner
   */
  public static Put401kPlansDefinitionRequestContributionValueForMatchRateInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Put401kPlansDefinitionRequestContributionValueForMatchRateInner.class);
  }

  /**
   * Convert an instance of Put401kPlansDefinitionRequestContributionValueForMatchRateInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

