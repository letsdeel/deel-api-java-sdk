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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CostQuote;

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
 * BreakdownCostsQuoteMonthly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class BreakdownCostsQuoteMonthly {
  public static final String SERIALIZED_NAME_COSTS = "costs";
  @SerializedName(SERIALIZED_NAME_COSTS)
  private List<CostQuote> costs = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_TOTAL_USD = "total_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_USD)
  private BigDecimal totalUsd;

  public BreakdownCostsQuoteMonthly() {
  }

  public BreakdownCostsQuoteMonthly costs(List<CostQuote> costs) {
    this.costs = costs;
    return this;
  }

  public BreakdownCostsQuoteMonthly addCostsItem(CostQuote costsItem) {
    if (this.costs == null) {
      this.costs = new ArrayList<>();
    }
    this.costs.add(costsItem);
    return this;
  }

  /**
   * Get costs
   * @return costs
   */
  @javax.annotation.Nullable
  public List<CostQuote> getCosts() {
    return costs;
  }

  public void setCosts(List<CostQuote> costs) {
    this.costs = costs;
  }


  public BreakdownCostsQuoteMonthly total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Total costs in local currency
   * @return total
   */
  @javax.annotation.Nullable
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public BreakdownCostsQuoteMonthly totalUsd(BigDecimal totalUsd) {
    this.totalUsd = totalUsd;
    return this;
  }

  /**
   * Total costs in USD
   * @return totalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalUsd() {
    return totalUsd;
  }

  public void setTotalUsd(BigDecimal totalUsd) {
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
    BreakdownCostsQuoteMonthly breakdownCostsQuoteMonthly = (BreakdownCostsQuoteMonthly) o;
    return Objects.equals(this.costs, breakdownCostsQuoteMonthly.costs) &&
        Objects.equals(this.total, breakdownCostsQuoteMonthly.total) &&
        Objects.equals(this.totalUsd, breakdownCostsQuoteMonthly.totalUsd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, total, totalUsd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreakdownCostsQuoteMonthly {\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("costs");
    openapiFields.add("total");
    openapiFields.add("total_usd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BreakdownCostsQuoteMonthly
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BreakdownCostsQuoteMonthly.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BreakdownCostsQuoteMonthly is not found in the empty JSON string", BreakdownCostsQuoteMonthly.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BreakdownCostsQuoteMonthly.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BreakdownCostsQuoteMonthly` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("costs") != null && !jsonObj.get("costs").isJsonNull()) {
        JsonArray jsonArraycosts = jsonObj.getAsJsonArray("costs");
        if (jsonArraycosts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("costs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `costs` to be an array in the JSON string but got `%s`", jsonObj.get("costs").toString()));
          }

          // validate the optional field `costs` (array)
          for (int i = 0; i < jsonArraycosts.size(); i++) {
            CostQuote.validateJsonElement(jsonArraycosts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BreakdownCostsQuoteMonthly.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BreakdownCostsQuoteMonthly' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BreakdownCostsQuoteMonthly> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BreakdownCostsQuoteMonthly.class));

       return (TypeAdapter<T>) new TypeAdapter<BreakdownCostsQuoteMonthly>() {
           @Override
           public void write(JsonWriter out, BreakdownCostsQuoteMonthly value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BreakdownCostsQuoteMonthly read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BreakdownCostsQuoteMonthly given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BreakdownCostsQuoteMonthly
   * @throws IOException if the JSON string is invalid with respect to BreakdownCostsQuoteMonthly
   */
  public static BreakdownCostsQuoteMonthly fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BreakdownCostsQuoteMonthly.class);
  }

  /**
   * Convert an instance of BreakdownCostsQuoteMonthly to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
