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
 * Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner {
  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  @javax.annotation.Nonnull
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nonnull
  private BigDecimal limit;

  public Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner() {
  }

  public Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner rate(@javax.annotation.Nonnull BigDecimal rate) {
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


  public Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner limit(@javax.annotation.Nonnull BigDecimal limit) {
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
    Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner = (Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner) o;
    return Objects.equals(this.rate, get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.rate) &&
        Objects.equals(this.limit, get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner is not found in the empty JSON string", Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.openapiRequiredFields) {
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
       if (!Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.class));

       return (TypeAdapter<T>) new TypeAdapter<Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner>() {
           @Override
           public void write(JsonWriter out, Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner
   * @throws IOException if the JSON string is invalid with respect to Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner
   */
  public static Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.class);
  }

  /**
   * Convert an instance of Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

