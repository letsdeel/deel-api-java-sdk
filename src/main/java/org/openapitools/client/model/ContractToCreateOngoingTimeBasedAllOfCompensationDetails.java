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
 * ContractToCreateOngoingTimeBasedAllOfCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:15:13.914237102Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractToCreateOngoingTimeBasedAllOfCompensationDetails {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nonnull
  private String currencyCode;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nonnull
  private WorkStatementCycleScaleEnum frequency;

  public static final String SERIALIZED_NAME_CYCLE_END = "cycle_end";
  @SerializedName(SERIALIZED_NAME_CYCLE_END)
  @javax.annotation.Nonnull
  private BigDecimal cycleEnd;

  public static final String SERIALIZED_NAME_CYCLE_END_TYPE = "cycle_end_type";
  @SerializedName(SERIALIZED_NAME_CYCLE_END_TYPE)
  @javax.annotation.Nonnull
  private WorkStatementCycleEndTypeEnum cycleEndType;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_TYPE = "payment_due_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_TYPE)
  @javax.annotation.Nonnull
  private WorkStatementPaymentDueTypeEnum paymentDueType = WorkStatementPaymentDueTypeEnum.REGULAR;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_DAYS = "payment_due_days";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_DAYS)
  @javax.annotation.Nonnull
  private BigDecimal paymentDueDays;

  public static final String SERIALIZED_NAME_PAY_BEFORE_WEEKENDS = "pay_before_weekends";
  @SerializedName(SERIALIZED_NAME_PAY_BEFORE_WEEKENDS)
  @javax.annotation.Nullable
  private Boolean payBeforeWeekends;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT_DATE = "first_payment_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT_DATE)
  @javax.annotation.Nullable
  private LocalDate firstPaymentDate;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT = "first_payment";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT)
  @javax.annotation.Nullable
  private BigDecimal firstPayment = new BigDecimal("0");

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod = new BigDecimal("0");

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nonnull
  private WorkStatementScaleEnum scale;

  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails() {
  }

  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails amount(@javax.annotation.Nonnull BigDecimal amount) {
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

  public void setAmount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails currencyCode(@javax.annotation.Nonnull String currencyCode) {
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


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails frequency(@javax.annotation.Nonnull WorkStatementCycleScaleEnum frequency) {
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

  public void setFrequency(@javax.annotation.Nonnull WorkStatementCycleScaleEnum frequency) {
    this.frequency = frequency;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails cycleEnd(@javax.annotation.Nonnull BigDecimal cycleEnd) {
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

  public void setCycleEnd(@javax.annotation.Nonnull BigDecimal cycleEnd) {
    this.cycleEnd = cycleEnd;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails cycleEndType(@javax.annotation.Nonnull WorkStatementCycleEndTypeEnum cycleEndType) {
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

  public void setCycleEndType(@javax.annotation.Nonnull WorkStatementCycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails paymentDueType(@javax.annotation.Nonnull WorkStatementPaymentDueTypeEnum paymentDueType) {
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

  public void setPaymentDueType(@javax.annotation.Nonnull WorkStatementPaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails paymentDueDays(@javax.annotation.Nonnull BigDecimal paymentDueDays) {
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

  public void setPaymentDueDays(@javax.annotation.Nonnull BigDecimal paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails payBeforeWeekends(@javax.annotation.Nullable Boolean payBeforeWeekends) {
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

  public void setPayBeforeWeekends(@javax.annotation.Nullable Boolean payBeforeWeekends) {
    this.payBeforeWeekends = payBeforeWeekends;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails firstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
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

  public void setFirstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails firstPayment(@javax.annotation.Nullable BigDecimal firstPayment) {
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

  public void setFirstPayment(@javax.annotation.Nullable BigDecimal firstPayment) {
    this.firstPayment = firstPayment;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
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

  public void setNoticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
  }


  public ContractToCreateOngoingTimeBasedAllOfCompensationDetails scale(@javax.annotation.Nonnull WorkStatementScaleEnum scale) {
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

  public void setScale(@javax.annotation.Nonnull WorkStatementScaleEnum scale) {
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
    ContractToCreateOngoingTimeBasedAllOfCompensationDetails contractToCreateOngoingTimeBasedAllOfCompensationDetails = (ContractToCreateOngoingTimeBasedAllOfCompensationDetails) o;
    return Objects.equals(this.amount, contractToCreateOngoingTimeBasedAllOfCompensationDetails.amount) &&
        Objects.equals(this.currencyCode, contractToCreateOngoingTimeBasedAllOfCompensationDetails.currencyCode) &&
        Objects.equals(this.frequency, contractToCreateOngoingTimeBasedAllOfCompensationDetails.frequency) &&
        Objects.equals(this.cycleEnd, contractToCreateOngoingTimeBasedAllOfCompensationDetails.cycleEnd) &&
        Objects.equals(this.cycleEndType, contractToCreateOngoingTimeBasedAllOfCompensationDetails.cycleEndType) &&
        Objects.equals(this.paymentDueType, contractToCreateOngoingTimeBasedAllOfCompensationDetails.paymentDueType) &&
        Objects.equals(this.paymentDueDays, contractToCreateOngoingTimeBasedAllOfCompensationDetails.paymentDueDays) &&
        Objects.equals(this.payBeforeWeekends, contractToCreateOngoingTimeBasedAllOfCompensationDetails.payBeforeWeekends) &&
        Objects.equals(this.firstPaymentDate, contractToCreateOngoingTimeBasedAllOfCompensationDetails.firstPaymentDate) &&
        Objects.equals(this.firstPayment, contractToCreateOngoingTimeBasedAllOfCompensationDetails.firstPayment) &&
        Objects.equals(this.noticePeriod, contractToCreateOngoingTimeBasedAllOfCompensationDetails.noticePeriod) &&
        Objects.equals(this.scale, contractToCreateOngoingTimeBasedAllOfCompensationDetails.scale);
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
    sb.append("class ContractToCreateOngoingTimeBasedAllOfCompensationDetails {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ContractToCreateOngoingTimeBasedAllOfCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractToCreateOngoingTimeBasedAllOfCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractToCreateOngoingTimeBasedAllOfCompensationDetails is not found in the empty JSON string", ContractToCreateOngoingTimeBasedAllOfCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractToCreateOngoingTimeBasedAllOfCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractToCreateOngoingTimeBasedAllOfCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractToCreateOngoingTimeBasedAllOfCompensationDetails.openapiRequiredFields) {
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
       if (!ContractToCreateOngoingTimeBasedAllOfCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractToCreateOngoingTimeBasedAllOfCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractToCreateOngoingTimeBasedAllOfCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreateOngoingTimeBasedAllOfCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractToCreateOngoingTimeBasedAllOfCompensationDetails>() {
           @Override
           public void write(JsonWriter out, ContractToCreateOngoingTimeBasedAllOfCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractToCreateOngoingTimeBasedAllOfCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractToCreateOngoingTimeBasedAllOfCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractToCreateOngoingTimeBasedAllOfCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to ContractToCreateOngoingTimeBasedAllOfCompensationDetails
   */
  public static ContractToCreateOngoingTimeBasedAllOfCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractToCreateOngoingTimeBasedAllOfCompensationDetails.class);
  }

  /**
   * Convert an instance of ContractToCreateOngoingTimeBasedAllOfCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

