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
import java.time.LocalDate;
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
 * GetContractById200ResponseDataCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseDataCompensationDetails {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private String frequency;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nullable
  private String currencyCode;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT = "first_payment";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT)
  @javax.annotation.Nullable
  private BigDecimal firstPayment;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT_DATE = "first_payment_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT_DATE)
  @javax.annotation.Nullable
  private LocalDate firstPaymentDate;

  public static final String SERIALIZED_NAME_GROSS_ANNUAL_SALARY = "gross_annual_salary";
  @SerializedName(SERIALIZED_NAME_GROSS_ANNUAL_SALARY)
  @javax.annotation.Nullable
  private String grossAnnualSalary;

  public static final String SERIALIZED_NAME_GROSS_SIGNING_BONUS = "gross_signing_bonus";
  @SerializedName(SERIALIZED_NAME_GROSS_SIGNING_BONUS)
  @javax.annotation.Nullable
  private String grossSigningBonus;

  public static final String SERIALIZED_NAME_GROSS_VARIABLE_BONUS = "gross_variable_bonus";
  @SerializedName(SERIALIZED_NAME_GROSS_VARIABLE_BONUS)
  @javax.annotation.Nullable
  private String grossVariableBonus;

  public GetContractById200ResponseDataCompensationDetails() {
  }

  public GetContractById200ResponseDataCompensationDetails amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount to be paid. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts.
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
  }


  public GetContractById200ResponseDataCompensationDetails frequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Scale of the invoice cycle.
   * @return frequency
   */
  @javax.annotation.Nullable
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
  }


  public GetContractById200ResponseDataCompensationDetails currencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Currency code.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public GetContractById200ResponseDataCompensationDetails firstPayment(@javax.annotation.Nullable BigDecimal firstPayment) {
    this.firstPayment = firstPayment;
    return this;
  }

  /**
   * First payment amount.
   * @return firstPayment
   */
  @javax.annotation.Nullable
  public BigDecimal getFirstPayment() {
    return firstPayment;
  }

  public void setFirstPayment(@javax.annotation.Nullable BigDecimal firstPayment) {
    this.firstPayment = firstPayment;
  }


  public GetContractById200ResponseDataCompensationDetails firstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
    return this;
  }

  /**
   * First payment date.
   * @return firstPaymentDate
   */
  @javax.annotation.Nullable
  public LocalDate getFirstPaymentDate() {
    return firstPaymentDate;
  }

  public void setFirstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
  }


  public GetContractById200ResponseDataCompensationDetails grossAnnualSalary(@javax.annotation.Nullable String grossAnnualSalary) {
    this.grossAnnualSalary = grossAnnualSalary;
    return this;
  }

  /**
   * Gross annual salary.
   * @return grossAnnualSalary
   */
  @javax.annotation.Nullable
  public String getGrossAnnualSalary() {
    return grossAnnualSalary;
  }

  public void setGrossAnnualSalary(@javax.annotation.Nullable String grossAnnualSalary) {
    this.grossAnnualSalary = grossAnnualSalary;
  }


  public GetContractById200ResponseDataCompensationDetails grossSigningBonus(@javax.annotation.Nullable String grossSigningBonus) {
    this.grossSigningBonus = grossSigningBonus;
    return this;
  }

  /**
   * Gross signing bonus.
   * @return grossSigningBonus
   */
  @javax.annotation.Nullable
  public String getGrossSigningBonus() {
    return grossSigningBonus;
  }

  public void setGrossSigningBonus(@javax.annotation.Nullable String grossSigningBonus) {
    this.grossSigningBonus = grossSigningBonus;
  }


  public GetContractById200ResponseDataCompensationDetails grossVariableBonus(@javax.annotation.Nullable String grossVariableBonus) {
    this.grossVariableBonus = grossVariableBonus;
    return this;
  }

  /**
   * Gross variable bonus.
   * @return grossVariableBonus
   */
  @javax.annotation.Nullable
  public String getGrossVariableBonus() {
    return grossVariableBonus;
  }

  public void setGrossVariableBonus(@javax.annotation.Nullable String grossVariableBonus) {
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
    GetContractById200ResponseDataCompensationDetails getContractById200ResponseDataCompensationDetails = (GetContractById200ResponseDataCompensationDetails) o;
    return Objects.equals(this.amount, getContractById200ResponseDataCompensationDetails.amount) &&
        Objects.equals(this.frequency, getContractById200ResponseDataCompensationDetails.frequency) &&
        Objects.equals(this.currencyCode, getContractById200ResponseDataCompensationDetails.currencyCode) &&
        Objects.equals(this.firstPayment, getContractById200ResponseDataCompensationDetails.firstPayment) &&
        Objects.equals(this.firstPaymentDate, getContractById200ResponseDataCompensationDetails.firstPaymentDate) &&
        Objects.equals(this.grossAnnualSalary, getContractById200ResponseDataCompensationDetails.grossAnnualSalary) &&
        Objects.equals(this.grossSigningBonus, getContractById200ResponseDataCompensationDetails.grossSigningBonus) &&
        Objects.equals(this.grossVariableBonus, getContractById200ResponseDataCompensationDetails.grossVariableBonus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, frequency, currencyCode, firstPayment, firstPaymentDate, grossAnnualSalary, grossSigningBonus, grossVariableBonus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractById200ResponseDataCompensationDetails {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("frequency");
    openapiFields.add("currency_code");
    openapiFields.add("first_payment");
    openapiFields.add("first_payment_date");
    openapiFields.add("gross_annual_salary");
    openapiFields.add("gross_signing_bonus");
    openapiFields.add("gross_variable_bonus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseDataCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseDataCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseDataCompensationDetails is not found in the empty JSON string", GetContractById200ResponseDataCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseDataCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseDataCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("gross_annual_salary") != null && !jsonObj.get("gross_annual_salary").isJsonNull()) && !jsonObj.get("gross_annual_salary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gross_annual_salary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gross_annual_salary").toString()));
      }
      if ((jsonObj.get("gross_signing_bonus") != null && !jsonObj.get("gross_signing_bonus").isJsonNull()) && !jsonObj.get("gross_signing_bonus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gross_signing_bonus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gross_signing_bonus").toString()));
      }
      if ((jsonObj.get("gross_variable_bonus") != null && !jsonObj.get("gross_variable_bonus").isJsonNull()) && !jsonObj.get("gross_variable_bonus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gross_variable_bonus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gross_variable_bonus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseDataCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseDataCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseDataCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseDataCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseDataCompensationDetails>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseDataCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseDataCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseDataCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseDataCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseDataCompensationDetails
   */
  public static GetContractById200ResponseDataCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseDataCompensationDetails.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseDataCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

