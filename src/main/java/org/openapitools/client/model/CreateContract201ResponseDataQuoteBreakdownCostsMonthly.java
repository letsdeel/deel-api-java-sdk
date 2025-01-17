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
import org.openapitools.client.model.CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner;

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
 * CreateContract201ResponseDataQuoteBreakdownCostsMonthly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataQuoteBreakdownCostsMonthly {
  public static final String SERIALIZED_NAME_COSTS = "costs";
  @SerializedName(SERIALIZED_NAME_COSTS)
  @javax.annotation.Nullable
  private List<CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner> costs = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal total;

  public static final String SERIALIZED_NAME_TOTAL_USD = "total_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal totalUsd;

  public CreateContract201ResponseDataQuoteBreakdownCostsMonthly() {
  }

  public CreateContract201ResponseDataQuoteBreakdownCostsMonthly costs(@javax.annotation.Nullable List<CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner> costs) {
    this.costs = costs;
    return this;
  }

  public CreateContract201ResponseDataQuoteBreakdownCostsMonthly addCostsItem(CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner costsItem) {
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
  public List<CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner> getCosts() {
    return costs;
  }

  public void setCosts(@javax.annotation.Nullable List<CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner> costs) {
    this.costs = costs;
  }


  public CreateContract201ResponseDataQuoteBreakdownCostsMonthly total(@javax.annotation.Nullable BigDecimal total) {
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

  public void setTotal(@javax.annotation.Nullable BigDecimal total) {
    this.total = total;
  }


  public CreateContract201ResponseDataQuoteBreakdownCostsMonthly totalUsd(@javax.annotation.Nullable BigDecimal totalUsd) {
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
    CreateContract201ResponseDataQuoteBreakdownCostsMonthly createContract201ResponseDataQuoteBreakdownCostsMonthly = (CreateContract201ResponseDataQuoteBreakdownCostsMonthly) o;
    return Objects.equals(this.costs, createContract201ResponseDataQuoteBreakdownCostsMonthly.costs) &&
        Objects.equals(this.total, createContract201ResponseDataQuoteBreakdownCostsMonthly.total) &&
        Objects.equals(this.totalUsd, createContract201ResponseDataQuoteBreakdownCostsMonthly.totalUsd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, total, totalUsd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContract201ResponseDataQuoteBreakdownCostsMonthly {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataQuoteBreakdownCostsMonthly
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataQuoteBreakdownCostsMonthly.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataQuoteBreakdownCostsMonthly is not found in the empty JSON string", CreateContract201ResponseDataQuoteBreakdownCostsMonthly.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataQuoteBreakdownCostsMonthly.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataQuoteBreakdownCostsMonthly` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            CreateContract201ResponseDataQuoteBreakdownCostsMonthlyCostsInner.validateJsonElement(jsonArraycosts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataQuoteBreakdownCostsMonthly.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataQuoteBreakdownCostsMonthly' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataQuoteBreakdownCostsMonthly> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataQuoteBreakdownCostsMonthly.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataQuoteBreakdownCostsMonthly>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataQuoteBreakdownCostsMonthly value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataQuoteBreakdownCostsMonthly read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataQuoteBreakdownCostsMonthly given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataQuoteBreakdownCostsMonthly
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataQuoteBreakdownCostsMonthly
   */
  public static CreateContract201ResponseDataQuoteBreakdownCostsMonthly fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataQuoteBreakdownCostsMonthly.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataQuoteBreakdownCostsMonthly to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

