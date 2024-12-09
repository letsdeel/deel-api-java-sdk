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
import org.openapitools.client.model.WorkStatementCycleEndTypeEnum;
import org.openapitools.client.model.WorkStatementCycleScaleEnum;
import org.openapitools.client.model.WorkStatementPaymentDueTypeEnum;
import org.openapitools.client.model.WorkStatementScaleEnum;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private WorkStatementCycleScaleEnum frequency;

  public static final String SERIALIZED_NAME_CYCLE_END = "cycle_end";
  @SerializedName(SERIALIZED_NAME_CYCLE_END)
  private BigDecimal cycleEnd;

  public static final String SERIALIZED_NAME_CYCLE_END_TYPE = "cycle_end_type";
  @SerializedName(SERIALIZED_NAME_CYCLE_END_TYPE)
  private WorkStatementCycleEndTypeEnum cycleEndType;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_TYPE = "payment_due_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_TYPE)
  private WorkStatementPaymentDueTypeEnum paymentDueType = WorkStatementPaymentDueTypeEnum.REGULAR;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_DAYS = "payment_due_days";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_DAYS)
  private BigDecimal paymentDueDays;

  public static final String SERIALIZED_NAME_PAY_BEFORE_WEEKENDS = "pay_before_weekends";
  @SerializedName(SERIALIZED_NAME_PAY_BEFORE_WEEKENDS)
  private Boolean payBeforeWeekends;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT_DATE = "first_payment_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT_DATE)
  private LocalDate firstPaymentDate;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT = "first_payment";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT)
  private BigDecimal firstPayment = new BigDecimal("0");

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  private BigDecimal noticePeriod = new BigDecimal("0");

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private WorkStatementScaleEnum scale;

  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails() {
  }

  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails currencyCode(String currencyCode) {
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

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails frequency(WorkStatementCycleScaleEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @javax.annotation.Nonnull
  public WorkStatementCycleScaleEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(WorkStatementCycleScaleEnum frequency) {
    this.frequency = frequency;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails cycleEnd(BigDecimal cycleEnd) {
    this.cycleEnd = cycleEnd;
    return this;
  }

  /**
   * Date invoice cycle ends.
   * minimum: 1
   * maximum: 31
   * @return cycleEnd
   */
  @javax.annotation.Nonnull
  public BigDecimal getCycleEnd() {
    return cycleEnd;
  }

  public void setCycleEnd(BigDecimal cycleEnd) {
    this.cycleEnd = cycleEnd;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails cycleEndType(WorkStatementCycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
    return this;
  }

  /**
   * Get cycleEndType
   * @return cycleEndType
   */
  @javax.annotation.Nonnull
  public WorkStatementCycleEndTypeEnum getCycleEndType() {
    return cycleEndType;
  }

  public void setCycleEndType(WorkStatementCycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails paymentDueType(WorkStatementPaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
    return this;
  }

  /**
   * Get paymentDueType
   * @return paymentDueType
   */
  @javax.annotation.Nonnull
  public WorkStatementPaymentDueTypeEnum getPaymentDueType() {
    return paymentDueType;
  }

  public void setPaymentDueType(WorkStatementPaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails paymentDueDays(BigDecimal paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
    return this;
  }

  /**
   * Get paymentDueDays
   * minimum: 0
   * maximum: 90
   * @return paymentDueDays
   */
  @javax.annotation.Nonnull
  public BigDecimal getPaymentDueDays() {
    return paymentDueDays;
  }

  public void setPaymentDueDays(BigDecimal paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails payBeforeWeekends(Boolean payBeforeWeekends) {
    this.payBeforeWeekends = payBeforeWeekends;
    return this;
  }

  /**
   * If the payment due is on a weekend, pay on Friday.
   * @return payBeforeWeekends
   */
  @javax.annotation.Nullable
  public Boolean getPayBeforeWeekends() {
    return payBeforeWeekends;
  }

  public void setPayBeforeWeekends(Boolean payBeforeWeekends) {
    this.payBeforeWeekends = payBeforeWeekends;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails firstPaymentDate(LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return firstPaymentDate
   */
  @javax.annotation.Nullable
  public LocalDate getFirstPaymentDate() {
    return firstPaymentDate;
  }

  public void setFirstPaymentDate(LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails firstPayment(BigDecimal firstPayment) {
    this.firstPayment = firstPayment;
    return this;
  }

  /**
   * First payment amount.
   * minimum: 0
   * @return firstPayment
   */
  @javax.annotation.Nullable
  public BigDecimal getFirstPayment() {
    return firstPayment;
  }

  public void setFirstPayment(BigDecimal firstPayment) {
    this.firstPayment = firstPayment;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails noticePeriod(BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
    return this;
  }

  /**
   * Days before to notice the termination of contract for eather party.
   * minimum: 0
   * @return noticePeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getNoticePeriod() {
    return noticePeriod;
  }

  public void setNoticePeriod(BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
  }


  public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails scale(WorkStatementScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nonnull
  public WorkStatementScaleEnum getScale() {
    return scale;
  }

  public void setScale(WorkStatementScaleEnum scale) {
    this.scale = scale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails = (ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails) o;
    return Objects.equals(this.amount, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.amount) &&
        Objects.equals(this.currencyCode, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.currencyCode) &&
        Objects.equals(this.frequency, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.frequency) &&
        Objects.equals(this.cycleEnd, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.cycleEnd) &&
        Objects.equals(this.cycleEndType, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.cycleEndType) &&
        Objects.equals(this.paymentDueType, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.paymentDueType) &&
        Objects.equals(this.paymentDueDays, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.paymentDueDays) &&
        Objects.equals(this.payBeforeWeekends, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.payBeforeWeekends) &&
        Objects.equals(this.firstPaymentDate, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.firstPaymentDate) &&
        Objects.equals(this.firstPayment, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.firstPayment) &&
        Objects.equals(this.noticePeriod, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.noticePeriod) &&
        Objects.equals(this.scale, contractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.scale);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, frequency, cycleEnd, cycleEndType, paymentDueType, paymentDueDays, payBeforeWeekends, firstPaymentDate, firstPayment, noticePeriod, scale);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    cycleEnd: ").append(toIndentedString(cycleEnd)).append("\n");
    sb.append("    cycleEndType: ").append(toIndentedString(cycleEndType)).append("\n");
    sb.append("    paymentDueType: ").append(toIndentedString(paymentDueType)).append("\n");
    sb.append("    paymentDueDays: ").append(toIndentedString(paymentDueDays)).append("\n");
    sb.append("    payBeforeWeekends: ").append(toIndentedString(payBeforeWeekends)).append("\n");
    sb.append("    firstPaymentDate: ").append(toIndentedString(firstPaymentDate)).append("\n");
    sb.append("    firstPayment: ").append(toIndentedString(firstPayment)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
    openapiFields.add("currency_code");
    openapiFields.add("frequency");
    openapiFields.add("cycle_end");
    openapiFields.add("cycle_end_type");
    openapiFields.add("payment_due_type");
    openapiFields.add("payment_due_days");
    openapiFields.add("pay_before_weekends");
    openapiFields.add("first_payment_date");
    openapiFields.add("first_payment");
    openapiFields.add("notice_period");
    openapiFields.add("scale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("cycle_end");
    openapiRequiredFields.add("cycle_end_type");
    openapiRequiredFields.add("payment_due_type");
    openapiRequiredFields.add("payment_due_days");
    openapiRequiredFields.add("scale");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails is not found in the empty JSON string", ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      // validate the required field `frequency`
      WorkStatementCycleScaleEnum.validateJsonElement(jsonObj.get("frequency"));
      // validate the required field `cycle_end_type`
      WorkStatementCycleEndTypeEnum.validateJsonElement(jsonObj.get("cycle_end_type"));
      // validate the required field `payment_due_type`
      WorkStatementPaymentDueTypeEnum.validateJsonElement(jsonObj.get("payment_due_type"));
      // validate the required field `scale`
      WorkStatementScaleEnum.validateJsonElement(jsonObj.get("scale"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails>() {
           @Override
           public void write(JsonWriter out, ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails
   */
  public static ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails.class);
  }

  /**
   * Convert an instance of ContractToCreatePayAsYouGoTimeBasedAllOfCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
