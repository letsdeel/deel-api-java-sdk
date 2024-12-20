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
import org.openapitools.client.model.GetContractEquityWithholdingAmount200ResponseDataBreakdownInner;

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
 * GetContractEquityWithholdingAmount200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractEquityWithholdingAmount200ResponseData {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  @javax.annotation.Nullable
  private String oid;

  public static final String SERIALIZED_NAME_BREAKDOWN = "breakdown";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN)
  @javax.annotation.Nullable
  private List<GetContractEquityWithholdingAmount200ResponseDataBreakdownInner> breakdown = new ArrayList<>();

  public static final String SERIALIZED_NAME_AGGREGATE_RATE = "aggregate_rate";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_RATE)
  @javax.annotation.Nullable
  private String aggregateRate;

  public static final String SERIALIZED_NAME_OVERALL_WITHHOLDING_AMOUNT = "overall_withholding_amount";
  @SerializedName(SERIALIZED_NAME_OVERALL_WITHHOLDING_AMOUNT)
  @javax.annotation.Nullable
  private String overallWithholdingAmount;

  public GetContractEquityWithholdingAmount200ResponseData() {
  }

  public GetContractEquityWithholdingAmount200ResponseData oid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
    return this;
  }

  /**
   * Deel contract id.
   * @return oid
   */
  @javax.annotation.Nullable
  public String getOid() {
    return oid;
  }

  public void setOid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
  }


  public GetContractEquityWithholdingAmount200ResponseData breakdown(@javax.annotation.Nullable List<GetContractEquityWithholdingAmount200ResponseDataBreakdownInner> breakdown) {
    this.breakdown = breakdown;
    return this;
  }

  public GetContractEquityWithholdingAmount200ResponseData addBreakdownItem(GetContractEquityWithholdingAmount200ResponseDataBreakdownInner breakdownItem) {
    if (this.breakdown == null) {
      this.breakdown = new ArrayList<>();
    }
    this.breakdown.add(breakdownItem);
    return this;
  }

  /**
   * Get breakdown
   * @return breakdown
   */
  @javax.annotation.Nullable
  public List<GetContractEquityWithholdingAmount200ResponseDataBreakdownInner> getBreakdown() {
    return breakdown;
  }

  public void setBreakdown(@javax.annotation.Nullable List<GetContractEquityWithholdingAmount200ResponseDataBreakdownInner> breakdown) {
    this.breakdown = breakdown;
  }


  public GetContractEquityWithholdingAmount200ResponseData aggregateRate(@javax.annotation.Nullable String aggregateRate) {
    this.aggregateRate = aggregateRate;
    return this;
  }

  /**
   * Aggregate withholding rate as a percentage.
   * @return aggregateRate
   */
  @javax.annotation.Nullable
  public String getAggregateRate() {
    return aggregateRate;
  }

  public void setAggregateRate(@javax.annotation.Nullable String aggregateRate) {
    this.aggregateRate = aggregateRate;
  }


  public GetContractEquityWithholdingAmount200ResponseData overallWithholdingAmount(@javax.annotation.Nullable String overallWithholdingAmount) {
    this.overallWithholdingAmount = overallWithholdingAmount;
    return this;
  }

  /**
   * Total withholding amount.
   * @return overallWithholdingAmount
   */
  @javax.annotation.Nullable
  public String getOverallWithholdingAmount() {
    return overallWithholdingAmount;
  }

  public void setOverallWithholdingAmount(@javax.annotation.Nullable String overallWithholdingAmount) {
    this.overallWithholdingAmount = overallWithholdingAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractEquityWithholdingAmount200ResponseData getContractEquityWithholdingAmount200ResponseData = (GetContractEquityWithholdingAmount200ResponseData) o;
    return Objects.equals(this.oid, getContractEquityWithholdingAmount200ResponseData.oid) &&
        Objects.equals(this.breakdown, getContractEquityWithholdingAmount200ResponseData.breakdown) &&
        Objects.equals(this.aggregateRate, getContractEquityWithholdingAmount200ResponseData.aggregateRate) &&
        Objects.equals(this.overallWithholdingAmount, getContractEquityWithholdingAmount200ResponseData.overallWithholdingAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, breakdown, aggregateRate, overallWithholdingAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractEquityWithholdingAmount200ResponseData {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    aggregateRate: ").append(toIndentedString(aggregateRate)).append("\n");
    sb.append("    overallWithholdingAmount: ").append(toIndentedString(overallWithholdingAmount)).append("\n");
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
    openapiFields.add("oid");
    openapiFields.add("breakdown");
    openapiFields.add("aggregate_rate");
    openapiFields.add("overall_withholding_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractEquityWithholdingAmount200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractEquityWithholdingAmount200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractEquityWithholdingAmount200ResponseData is not found in the empty JSON string", GetContractEquityWithholdingAmount200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractEquityWithholdingAmount200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractEquityWithholdingAmount200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("oid") != null && !jsonObj.get("oid").isJsonNull()) && !jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
      if (jsonObj.get("breakdown") != null && !jsonObj.get("breakdown").isJsonNull()) {
        JsonArray jsonArraybreakdown = jsonObj.getAsJsonArray("breakdown");
        if (jsonArraybreakdown != null) {
          // ensure the json data is an array
          if (!jsonObj.get("breakdown").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `breakdown` to be an array in the JSON string but got `%s`", jsonObj.get("breakdown").toString()));
          }

          // validate the optional field `breakdown` (array)
          for (int i = 0; i < jsonArraybreakdown.size(); i++) {
            GetContractEquityWithholdingAmount200ResponseDataBreakdownInner.validateJsonElement(jsonArraybreakdown.get(i));
          };
        }
      }
      if ((jsonObj.get("aggregate_rate") != null && !jsonObj.get("aggregate_rate").isJsonNull()) && !jsonObj.get("aggregate_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregate_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregate_rate").toString()));
      }
      if ((jsonObj.get("overall_withholding_amount") != null && !jsonObj.get("overall_withholding_amount").isJsonNull()) && !jsonObj.get("overall_withholding_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overall_withholding_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overall_withholding_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractEquityWithholdingAmount200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractEquityWithholdingAmount200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractEquityWithholdingAmount200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractEquityWithholdingAmount200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractEquityWithholdingAmount200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetContractEquityWithholdingAmount200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractEquityWithholdingAmount200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractEquityWithholdingAmount200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractEquityWithholdingAmount200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetContractEquityWithholdingAmount200ResponseData
   */
  public static GetContractEquityWithholdingAmount200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractEquityWithholdingAmount200ResponseData.class);
  }

  /**
   * Convert an instance of GetContractEquityWithholdingAmount200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

