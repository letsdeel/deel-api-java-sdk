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
 * EorEmployeeCostCalculationResponseBenefitsDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class EorEmployeeCostCalculationResponseBenefitsDataInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  @javax.annotation.Nullable
  private String plan;

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "fee_amount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  @javax.annotation.Nullable
  private String feeAmount;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private String amount;

  public EorEmployeeCostCalculationResponseBenefitsDataInner() {
  }

  public EorEmployeeCostCalculationResponseBenefitsDataInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the benefit item.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public EorEmployeeCostCalculationResponseBenefitsDataInner plan(@javax.annotation.Nullable String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * The name of the benefit plan.
   * @return plan
   */
  @javax.annotation.Nullable
  public String getPlan() {
    return plan;
  }

  public void setPlan(@javax.annotation.Nullable String plan) {
    this.plan = plan;
  }


  public EorEmployeeCostCalculationResponseBenefitsDataInner feeAmount(@javax.annotation.Nullable String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * The amount or price of the fee associated with the benefit item.
   * @return feeAmount
   */
  @javax.annotation.Nullable
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(@javax.annotation.Nullable String feeAmount) {
    this.feeAmount = feeAmount;
  }


  public EorEmployeeCostCalculationResponseBenefitsDataInner amount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount or price of the benefit item.
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
    EorEmployeeCostCalculationResponseBenefitsDataInner eorEmployeeCostCalculationResponseBenefitsDataInner = (EorEmployeeCostCalculationResponseBenefitsDataInner) o;
    return Objects.equals(this.name, eorEmployeeCostCalculationResponseBenefitsDataInner.name) &&
        Objects.equals(this.plan, eorEmployeeCostCalculationResponseBenefitsDataInner.plan) &&
        Objects.equals(this.feeAmount, eorEmployeeCostCalculationResponseBenefitsDataInner.feeAmount) &&
        Objects.equals(this.amount, eorEmployeeCostCalculationResponseBenefitsDataInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, plan, feeAmount, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorEmployeeCostCalculationResponseBenefitsDataInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("plan");
    openapiFields.add("fee_amount");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorEmployeeCostCalculationResponseBenefitsDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorEmployeeCostCalculationResponseBenefitsDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorEmployeeCostCalculationResponseBenefitsDataInner is not found in the empty JSON string", EorEmployeeCostCalculationResponseBenefitsDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorEmployeeCostCalculationResponseBenefitsDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorEmployeeCostCalculationResponseBenefitsDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      if ((jsonObj.get("fee_amount") != null && !jsonObj.get("fee_amount").isJsonNull()) && !jsonObj.get("fee_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_amount").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorEmployeeCostCalculationResponseBenefitsDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorEmployeeCostCalculationResponseBenefitsDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorEmployeeCostCalculationResponseBenefitsDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorEmployeeCostCalculationResponseBenefitsDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EorEmployeeCostCalculationResponseBenefitsDataInner>() {
           @Override
           public void write(JsonWriter out, EorEmployeeCostCalculationResponseBenefitsDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorEmployeeCostCalculationResponseBenefitsDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorEmployeeCostCalculationResponseBenefitsDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorEmployeeCostCalculationResponseBenefitsDataInner
   * @throws IOException if the JSON string is invalid with respect to EorEmployeeCostCalculationResponseBenefitsDataInner
   */
  public static EorEmployeeCostCalculationResponseBenefitsDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorEmployeeCostCalculationResponseBenefitsDataInner.class);
  }

  /**
   * Convert an instance of EorEmployeeCostCalculationResponseBenefitsDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

