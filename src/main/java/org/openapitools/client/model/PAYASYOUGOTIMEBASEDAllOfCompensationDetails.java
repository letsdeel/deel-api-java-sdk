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
 * PAYASYOUGOTIMEBASEDAllOfCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:03:48.437639881Z[GMT]", comments = "Generator version: 7.10.0")
public class PAYASYOUGOTIMEBASEDAllOfCompensationDetails {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CYCLE_END = "cycle_end";
  @SerializedName(SERIALIZED_NAME_CYCLE_END)
  @javax.annotation.Nonnull
  private BigDecimal cycleEnd;

  /**
   * Scale of the invoice cycle.
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    BIWEEKLY("biweekly"),
    
    SEMIMONTHLY("semimonthly"),
    
    CALENDAR_MONTH("calendar-month");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FrequencyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nonnull
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nonnull
  private String currencyCode;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT = "first_payment";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT)
  @javax.annotation.Nullable
  private BigDecimal firstPayment = new BigDecimal("0");

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod = new BigDecimal("0");

  /**
   * Cycle end can be weekly 1-7 (Monday &#x3D; 1) or monthly 1-31.
   */
  @JsonAdapter(CycleEndTypeEnum.Adapter.class)
  public enum CycleEndTypeEnum {
    WEEK("DAY_OF_WEEK"),
    
    LAST_WEEK("DAY_OF_LAST_WEEK"),
    
    MONTH("DAY_OF_MONTH");

    private String value;

    CycleEndTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CycleEndTypeEnum fromValue(String value) {
      for (CycleEndTypeEnum b : CycleEndTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CycleEndTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CycleEndTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CycleEndTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CycleEndTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CycleEndTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CYCLE_END_TYPE = "cycle_end_type";
  @SerializedName(SERIALIZED_NAME_CYCLE_END_TYPE)
  @javax.annotation.Nonnull
  private CycleEndTypeEnum cycleEndType;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_DAYS = "payment_due_days";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_DAYS)
  @javax.annotation.Nonnull
  private BigDecimal paymentDueDays;

  /**
   * Type of payment due. If the payment is due on the last day of month, enter &#39;WITHIN_MONTH&#39;.
   */
  @JsonAdapter(PaymentDueTypeEnum.Adapter.class)
  public enum PaymentDueTypeEnum {
    REGULAR("REGULAR"),
    
    WITHIN_MONTH("WITHIN_MONTH");

    private String value;

    PaymentDueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentDueTypeEnum fromValue(String value) {
      for (PaymentDueTypeEnum b : PaymentDueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentDueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentDueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentDueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentDueTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PaymentDueTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_DUE_TYPE = "payment_due_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_TYPE)
  @javax.annotation.Nonnull
  private PaymentDueTypeEnum paymentDueType = PaymentDueTypeEnum.REGULAR;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT_DATE = "first_payment_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT_DATE)
  @javax.annotation.Nullable
  private LocalDate firstPaymentDate;

  public static final String SERIALIZED_NAME_PAY_BEFORE_WEEKENDS = "pay_before_weekends";
  @SerializedName(SERIALIZED_NAME_PAY_BEFORE_WEEKENDS)
  @javax.annotation.Nullable
  private Boolean payBeforeWeekends;

  /**
   * Defines the scale at which the amount is paid. For example, enter &#39;hourly&#39; to define the amount per hour. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts.
   */
  @JsonAdapter(ScaleEnum.Adapter.class)
  public enum ScaleEnum {
    HOURLY("hourly"),
    
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    BIWEEKLY("biweekly"),
    
    SEMIMONTHLY("semimonthly"),
    
    CUSTOM("custom");

    private String value;

    ScaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScaleEnum fromValue(String value) {
      for (ScaleEnum b : ScaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScaleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScaleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScaleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nonnull
  private ScaleEnum scale;

  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails() {
  }

  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails amount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount to be paid. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts.
   * @return amount
   */
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
  }


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails cycleEnd(@javax.annotation.Nonnull BigDecimal cycleEnd) {
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


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails frequency(@javax.annotation.Nonnull FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Scale of the invoice cycle.
   * @return frequency
   */
  @javax.annotation.Nonnull
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nonnull FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails currencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Currency code.
   * @return currencyCode
   */
  @javax.annotation.Nonnull
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails firstPayment(@javax.annotation.Nullable BigDecimal firstPayment) {
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


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
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


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails cycleEndType(@javax.annotation.Nonnull CycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
    return this;
  }

  /**
   * Cycle end can be weekly 1-7 (Monday &#x3D; 1) or monthly 1-31.
   * @return cycleEndType
   */
  @javax.annotation.Nonnull
  public CycleEndTypeEnum getCycleEndType() {
    return cycleEndType;
  }

  public void setCycleEndType(@javax.annotation.Nonnull CycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
  }


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails paymentDueDays(@javax.annotation.Nonnull BigDecimal paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
    return this;
  }

  /**
   * Number of days to pay the invoice.
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


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails paymentDueType(@javax.annotation.Nonnull PaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
    return this;
  }

  /**
   * Type of payment due. If the payment is due on the last day of month, enter &#39;WITHIN_MONTH&#39;.
   * @return paymentDueType
   */
  @javax.annotation.Nonnull
  public PaymentDueTypeEnum getPaymentDueType() {
    return paymentDueType;
  }

  public void setPaymentDueType(@javax.annotation.Nonnull PaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
  }


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails firstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return firstPaymentDate
   */
  @javax.annotation.Nullable
  public LocalDate getFirstPaymentDate() {
    return firstPaymentDate;
  }

  public void setFirstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
  }


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails payBeforeWeekends(@javax.annotation.Nullable Boolean payBeforeWeekends) {
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


  public PAYASYOUGOTIMEBASEDAllOfCompensationDetails scale(@javax.annotation.Nonnull ScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Defines the scale at which the amount is paid. For example, enter &#39;hourly&#39; to define the amount per hour. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts.
   * @return scale
   */
  @javax.annotation.Nonnull
  public ScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nonnull ScaleEnum scale) {
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
    PAYASYOUGOTIMEBASEDAllOfCompensationDetails paYASYOUGOTIMEBASEDAllOfCompensationDetails = (PAYASYOUGOTIMEBASEDAllOfCompensationDetails) o;
    return Objects.equals(this.amount, paYASYOUGOTIMEBASEDAllOfCompensationDetails.amount) &&
        Objects.equals(this.cycleEnd, paYASYOUGOTIMEBASEDAllOfCompensationDetails.cycleEnd) &&
        Objects.equals(this.frequency, paYASYOUGOTIMEBASEDAllOfCompensationDetails.frequency) &&
        Objects.equals(this.currencyCode, paYASYOUGOTIMEBASEDAllOfCompensationDetails.currencyCode) &&
        Objects.equals(this.firstPayment, paYASYOUGOTIMEBASEDAllOfCompensationDetails.firstPayment) &&
        Objects.equals(this.noticePeriod, paYASYOUGOTIMEBASEDAllOfCompensationDetails.noticePeriod) &&
        Objects.equals(this.cycleEndType, paYASYOUGOTIMEBASEDAllOfCompensationDetails.cycleEndType) &&
        Objects.equals(this.paymentDueDays, paYASYOUGOTIMEBASEDAllOfCompensationDetails.paymentDueDays) &&
        Objects.equals(this.paymentDueType, paYASYOUGOTIMEBASEDAllOfCompensationDetails.paymentDueType) &&
        Objects.equals(this.firstPaymentDate, paYASYOUGOTIMEBASEDAllOfCompensationDetails.firstPaymentDate) &&
        Objects.equals(this.payBeforeWeekends, paYASYOUGOTIMEBASEDAllOfCompensationDetails.payBeforeWeekends) &&
        Objects.equals(this.scale, paYASYOUGOTIMEBASEDAllOfCompensationDetails.scale);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cycleEnd, frequency, currencyCode, firstPayment, noticePeriod, cycleEndType, paymentDueDays, paymentDueType, firstPaymentDate, payBeforeWeekends, scale);
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
    sb.append("class PAYASYOUGOTIMEBASEDAllOfCompensationDetails {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cycleEnd: ").append(toIndentedString(cycleEnd)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    firstPayment: ").append(toIndentedString(firstPayment)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    cycleEndType: ").append(toIndentedString(cycleEndType)).append("\n");
    sb.append("    paymentDueDays: ").append(toIndentedString(paymentDueDays)).append("\n");
    sb.append("    paymentDueType: ").append(toIndentedString(paymentDueType)).append("\n");
    sb.append("    firstPaymentDate: ").append(toIndentedString(firstPaymentDate)).append("\n");
    sb.append("    payBeforeWeekends: ").append(toIndentedString(payBeforeWeekends)).append("\n");
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
    openapiFields.add("cycle_end");
    openapiFields.add("frequency");
    openapiFields.add("currency_code");
    openapiFields.add("first_payment");
    openapiFields.add("notice_period");
    openapiFields.add("cycle_end_type");
    openapiFields.add("payment_due_days");
    openapiFields.add("payment_due_type");
    openapiFields.add("first_payment_date");
    openapiFields.add("pay_before_weekends");
    openapiFields.add("scale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("cycle_end");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("cycle_end_type");
    openapiRequiredFields.add("payment_due_days");
    openapiRequiredFields.add("payment_due_type");
    openapiRequiredFields.add("scale");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PAYASYOUGOTIMEBASEDAllOfCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PAYASYOUGOTIMEBASEDAllOfCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PAYASYOUGOTIMEBASEDAllOfCompensationDetails is not found in the empty JSON string", PAYASYOUGOTIMEBASEDAllOfCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PAYASYOUGOTIMEBASEDAllOfCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PAYASYOUGOTIMEBASEDAllOfCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PAYASYOUGOTIMEBASEDAllOfCompensationDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      // validate the required field `frequency`
      FrequencyEnum.validateJsonElement(jsonObj.get("frequency"));
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if (!jsonObj.get("cycle_end_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_end_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_end_type").toString()));
      }
      // validate the required field `cycle_end_type`
      CycleEndTypeEnum.validateJsonElement(jsonObj.get("cycle_end_type"));
      if (!jsonObj.get("payment_due_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_due_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_due_type").toString()));
      }
      // validate the required field `payment_due_type`
      PaymentDueTypeEnum.validateJsonElement(jsonObj.get("payment_due_type"));
      if (!jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      // validate the required field `scale`
      ScaleEnum.validateJsonElement(jsonObj.get("scale"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PAYASYOUGOTIMEBASEDAllOfCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PAYASYOUGOTIMEBASEDAllOfCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PAYASYOUGOTIMEBASEDAllOfCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PAYASYOUGOTIMEBASEDAllOfCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PAYASYOUGOTIMEBASEDAllOfCompensationDetails>() {
           @Override
           public void write(JsonWriter out, PAYASYOUGOTIMEBASEDAllOfCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PAYASYOUGOTIMEBASEDAllOfCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PAYASYOUGOTIMEBASEDAllOfCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PAYASYOUGOTIMEBASEDAllOfCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to PAYASYOUGOTIMEBASEDAllOfCompensationDetails
   */
  public static PAYASYOUGOTIMEBASEDAllOfCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PAYASYOUGOTIMEBASEDAllOfCompensationDetails.class);
  }

  /**
   * Convert an instance of PAYASYOUGOTIMEBASEDAllOfCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

