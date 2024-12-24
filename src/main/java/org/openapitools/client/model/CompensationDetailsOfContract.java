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
import java.time.OffsetDateTime;
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
 * CompensationDetailsOfContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:15:13.914237102Z[GMT]", comments = "Generator version: 7.10.0")
public class CompensationDetailsOfContract {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nonnull
  private String currencyCode;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private String amount;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nonnull
  private String scale;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nonnull
  private String frequency;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT = "first_payment";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT)
  @javax.annotation.Nonnull
  private String firstPayment;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT_DATE = "first_payment_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime firstPaymentDate;

  public static final String SERIALIZED_NAME_GROSS_ANNUAL_SALARY = "gross_annual_salary";
  @SerializedName(SERIALIZED_NAME_GROSS_ANNUAL_SALARY)
  @javax.annotation.Nonnull
  private String grossAnnualSalary;

  public static final String SERIALIZED_NAME_GROSS_SIGNING_BONUS = "gross_signing_bonus";
  @SerializedName(SERIALIZED_NAME_GROSS_SIGNING_BONUS)
  @javax.annotation.Nonnull
  private String grossSigningBonus;

  public static final String SERIALIZED_NAME_GROSS_VARIABLE_BONUS = "gross_variable_bonus";
  @SerializedName(SERIALIZED_NAME_GROSS_VARIABLE_BONUS)
  @javax.annotation.Nonnull
  private String grossVariableBonus;

  public CompensationDetailsOfContract() {
  }

  public CompensationDetailsOfContract currencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @javax.annotation.Nonnull
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public CompensationDetailsOfContract amount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
  }


  public CompensationDetailsOfContract scale(@javax.annotation.Nonnull String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nonnull
  public String getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nonnull String scale) {
    this.scale = scale;
  }


  public CompensationDetailsOfContract frequency(@javax.annotation.Nonnull String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @javax.annotation.Nonnull
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nonnull String frequency) {
    this.frequency = frequency;
  }


  public CompensationDetailsOfContract firstPayment(@javax.annotation.Nonnull String firstPayment) {
    this.firstPayment = firstPayment;
    return this;
  }

  /**
   * Get firstPayment
   * @return firstPayment
   */
  @javax.annotation.Nonnull
  public String getFirstPayment() {
    return firstPayment;
  }

  public void setFirstPayment(@javax.annotation.Nonnull String firstPayment) {
    this.firstPayment = firstPayment;
  }


  public CompensationDetailsOfContract firstPaymentDate(@javax.annotation.Nullable OffsetDateTime firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return firstPaymentDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getFirstPaymentDate() {
    return firstPaymentDate;
  }

  public void setFirstPaymentDate(@javax.annotation.Nullable OffsetDateTime firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
  }


  public CompensationDetailsOfContract grossAnnualSalary(@javax.annotation.Nonnull String grossAnnualSalary) {
    this.grossAnnualSalary = grossAnnualSalary;
    return this;
  }

  /**
   * Get grossAnnualSalary
   * @return grossAnnualSalary
   */
  @javax.annotation.Nonnull
  public String getGrossAnnualSalary() {
    return grossAnnualSalary;
  }

  public void setGrossAnnualSalary(@javax.annotation.Nonnull String grossAnnualSalary) {
    this.grossAnnualSalary = grossAnnualSalary;
  }


  public CompensationDetailsOfContract grossSigningBonus(@javax.annotation.Nonnull String grossSigningBonus) {
    this.grossSigningBonus = grossSigningBonus;
    return this;
  }

  /**
   * Get grossSigningBonus
   * @return grossSigningBonus
   */
  @javax.annotation.Nonnull
  public String getGrossSigningBonus() {
    return grossSigningBonus;
  }

  public void setGrossSigningBonus(@javax.annotation.Nonnull String grossSigningBonus) {
    this.grossSigningBonus = grossSigningBonus;
  }


  public CompensationDetailsOfContract grossVariableBonus(@javax.annotation.Nonnull String grossVariableBonus) {
    this.grossVariableBonus = grossVariableBonus;
    return this;
  }

  /**
   * Get grossVariableBonus
   * @return grossVariableBonus
   */
  @javax.annotation.Nonnull
  public String getGrossVariableBonus() {
    return grossVariableBonus;
  }

  public void setGrossVariableBonus(@javax.annotation.Nonnull String grossVariableBonus) {
    this.grossVariableBonus = grossVariableBonus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompensationDetailsOfContract compensationDetailsOfContract = (CompensationDetailsOfContract) o;
    return Objects.equals(this.currencyCode, compensationDetailsOfContract.currencyCode) &&
        Objects.equals(this.amount, compensationDetailsOfContract.amount) &&
        Objects.equals(this.scale, compensationDetailsOfContract.scale) &&
        Objects.equals(this.frequency, compensationDetailsOfContract.frequency) &&
        Objects.equals(this.firstPayment, compensationDetailsOfContract.firstPayment) &&
        Objects.equals(this.firstPaymentDate, compensationDetailsOfContract.firstPaymentDate) &&
        Objects.equals(this.grossAnnualSalary, compensationDetailsOfContract.grossAnnualSalary) &&
        Objects.equals(this.grossSigningBonus, compensationDetailsOfContract.grossSigningBonus) &&
        Objects.equals(this.grossVariableBonus, compensationDetailsOfContract.grossVariableBonus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, amount, scale, frequency, firstPayment, firstPaymentDate, grossAnnualSalary, grossSigningBonus, grossVariableBonus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensationDetailsOfContract {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    firstPayment: ").append(toIndentedString(firstPayment)).append("\n");
    sb.append("    firstPaymentDate: ").append(toIndentedString(firstPaymentDate)).append("\n");
    sb.append("    grossAnnualSalary: ").append(toIndentedString(grossAnnualSalary)).append("\n");
    sb.append("    grossSigningBonus: ").append(toIndentedString(grossSigningBonus)).append("\n");
    sb.append("    grossVariableBonus: ").append(toIndentedString(grossVariableBonus)).append("\n");
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
    openapiFields.add("currency_code");
    openapiFields.add("amount");
    openapiFields.add("scale");
    openapiFields.add("frequency");
    openapiFields.add("first_payment");
    openapiFields.add("first_payment_date");
    openapiFields.add("gross_annual_salary");
    openapiFields.add("gross_signing_bonus");
    openapiFields.add("gross_variable_bonus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("scale");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("first_payment");
    openapiRequiredFields.add("first_payment_date");
    openapiRequiredFields.add("gross_annual_salary");
    openapiRequiredFields.add("gross_signing_bonus");
    openapiRequiredFields.add("gross_variable_bonus");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompensationDetailsOfContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompensationDetailsOfContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompensationDetailsOfContract is not found in the empty JSON string", CompensationDetailsOfContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompensationDetailsOfContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompensationDetailsOfContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompensationDetailsOfContract.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if (!jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if (!jsonObj.get("first_payment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_payment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_payment").toString()));
      }
      if (!jsonObj.get("gross_annual_salary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gross_annual_salary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gross_annual_salary").toString()));
      }
      if (!jsonObj.get("gross_signing_bonus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gross_signing_bonus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gross_signing_bonus").toString()));
      }
      if (!jsonObj.get("gross_variable_bonus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gross_variable_bonus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gross_variable_bonus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompensationDetailsOfContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompensationDetailsOfContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompensationDetailsOfContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompensationDetailsOfContract.class));

       return (TypeAdapter<T>) new TypeAdapter<CompensationDetailsOfContract>() {
           @Override
           public void write(JsonWriter out, CompensationDetailsOfContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompensationDetailsOfContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompensationDetailsOfContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompensationDetailsOfContract
   * @throws IOException if the JSON string is invalid with respect to CompensationDetailsOfContract
   */
  public static CompensationDetailsOfContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompensationDetailsOfContract.class);
  }

  /**
   * Convert an instance of CompensationDetailsOfContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

