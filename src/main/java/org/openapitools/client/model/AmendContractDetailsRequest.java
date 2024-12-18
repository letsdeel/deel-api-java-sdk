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
import org.openapitools.client.model.AmendContractDetailsRequestJobTitleId;

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
 * You can specify any combination of data points that need changing.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class AmendContractDetailsRequest {
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
  @javax.annotation.Nullable
  private ScaleEnum scale;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CYCLE_END = "cycle_end";
  @SerializedName(SERIALIZED_NAME_CYCLE_END)
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_JOB_TITLE_ID = "job_title_id";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE_ID)
  @javax.annotation.Nullable
  private AmendContractDetailsRequestJobTitleId jobTitleId;

  public static final String SERIALIZED_NAME_SENIORITY_ID = "seniority_id";
  @SerializedName(SERIALIZED_NAME_SENIORITY_ID)
  @javax.annotation.Nullable
  private AmendContractDetailsRequestJobTitleId seniorityId;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nullable
  private String currencyCode;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT = "first_payment";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT)
  @javax.annotation.Nullable
  private BigDecimal firstPayment;

  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  @javax.annotation.Nullable
  private String scopeOfWork;

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
  @javax.annotation.Nullable
  private CycleEndTypeEnum cycleEndType;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  @javax.annotation.Nullable
  private LocalDate effectiveDate;

  public static final String SERIALIZED_NAME_JOB_TITLE_NAME = "job_title_name";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE_NAME)
  @javax.annotation.Nullable
  private String jobTitleName;

  public static final String SERIALIZED_NAME_SPECIAL_CLAUSE = "special_clause";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CLAUSE)
  @javax.annotation.Nullable
  private String specialClause;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_DAYS = "payment_due_days";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_DAYS)
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  private PaymentDueTypeEnum paymentDueType = PaymentDueTypeEnum.REGULAR;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT_DATE = "first_payment_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT_DATE)
  @javax.annotation.Nullable
  private LocalDate firstPaymentDate;

  public static final String SERIALIZED_NAME_PAY_BEFORE_WEEKENDS = "pay_before_weekends";
  @SerializedName(SERIALIZED_NAME_PAY_BEFORE_WEEKENDS)
  @javax.annotation.Nullable
  private Boolean payBeforeWeekends;

  public AmendContractDetailsRequest() {
  }

  public AmendContractDetailsRequest scale(@javax.annotation.Nullable ScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Defines the scale at which the amount is paid. For example, enter &#39;hourly&#39; to define the amount per hour. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts.
   * @return scale
   */
  @javax.annotation.Nullable
  public ScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable ScaleEnum scale) {
    this.scale = scale;
  }


  public AmendContractDetailsRequest amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount to be paid per scale.
   * minimum: 1
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
  }


  public AmendContractDetailsRequest cycleEnd(@javax.annotation.Nullable BigDecimal cycleEnd) {
    this.cycleEnd = cycleEnd;
    return this;
  }

  /**
   * Day of the month when the cycle ends.
   * minimum: 1
   * maximum: 31
   * @return cycleEnd
   */
  @javax.annotation.Nullable
  public BigDecimal getCycleEnd() {
    return cycleEnd;
  }

  public void setCycleEnd(@javax.annotation.Nullable BigDecimal cycleEnd) {
    this.cycleEnd = cycleEnd;
  }


  public AmendContractDetailsRequest frequency(@javax.annotation.Nullable FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Scale of the invoice cycle.
   * @return frequency
   */
  @javax.annotation.Nullable
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public AmendContractDetailsRequest jobTitleId(@javax.annotation.Nullable AmendContractDetailsRequestJobTitleId jobTitleId) {
    this.jobTitleId = jobTitleId;
    return this;
  }

  /**
   * Get jobTitleId
   * @return jobTitleId
   */
  @javax.annotation.Nullable
  public AmendContractDetailsRequestJobTitleId getJobTitleId() {
    return jobTitleId;
  }

  public void setJobTitleId(@javax.annotation.Nullable AmendContractDetailsRequestJobTitleId jobTitleId) {
    this.jobTitleId = jobTitleId;
  }


  public AmendContractDetailsRequest seniorityId(@javax.annotation.Nullable AmendContractDetailsRequestJobTitleId seniorityId) {
    this.seniorityId = seniorityId;
    return this;
  }

  /**
   * Get seniorityId
   * @return seniorityId
   */
  @javax.annotation.Nullable
  public AmendContractDetailsRequestJobTitleId getSeniorityId() {
    return seniorityId;
  }

  public void setSeniorityId(@javax.annotation.Nullable AmendContractDetailsRequestJobTitleId seniorityId) {
    this.seniorityId = seniorityId;
  }


  public AmendContractDetailsRequest currencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Currency code in ISO 4217 format.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public AmendContractDetailsRequest firstPayment(@javax.annotation.Nullable BigDecimal firstPayment) {
    this.firstPayment = firstPayment;
    return this;
  }

  /**
   * Amount to be paid as the first payment.
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


  public AmendContractDetailsRequest scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

  /**
   * Text to describe the scope of work of the contract.
   * @return scopeOfWork
   */
  @javax.annotation.Nullable
  public String getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }


  public AmendContractDetailsRequest cycleEndType(@javax.annotation.Nullable CycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
    return this;
  }

  /**
   * Cycle end can be weekly 1-7 (Monday &#x3D; 1) or monthly 1-31.
   * @return cycleEndType
   */
  @javax.annotation.Nullable
  public CycleEndTypeEnum getCycleEndType() {
    return cycleEndType;
  }

  public void setCycleEndType(@javax.annotation.Nullable CycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
  }


  public AmendContractDetailsRequest effectiveDate(@javax.annotation.Nullable LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return effectiveDate
   */
  @javax.annotation.Nullable
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(@javax.annotation.Nullable LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public AmendContractDetailsRequest jobTitleName(@javax.annotation.Nullable String jobTitleName) {
    this.jobTitleName = jobTitleName;
    return this;
  }

  /**
   * You can enter new job title.
   * @return jobTitleName
   */
  @javax.annotation.Nullable
  public String getJobTitleName() {
    return jobTitleName;
  }

  public void setJobTitleName(@javax.annotation.Nullable String jobTitleName) {
    this.jobTitleName = jobTitleName;
  }


  public AmendContractDetailsRequest specialClause(@javax.annotation.Nullable String specialClause) {
    this.specialClause = specialClause;
    return this;
  }

  /**
   * Text to describe any special clause in contract.
   * @return specialClause
   */
  @javax.annotation.Nullable
  public String getSpecialClause() {
    return specialClause;
  }

  public void setSpecialClause(@javax.annotation.Nullable String specialClause) {
    this.specialClause = specialClause;
  }


  public AmendContractDetailsRequest paymentDueDays(@javax.annotation.Nullable BigDecimal paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
    return this;
  }

  /**
   * Number of days after the invoice is sent that the payment is due.
   * minimum: 0
   * maximum: 90
   * @return paymentDueDays
   */
  @javax.annotation.Nullable
  public BigDecimal getPaymentDueDays() {
    return paymentDueDays;
  }

  public void setPaymentDueDays(@javax.annotation.Nullable BigDecimal paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
  }


  public AmendContractDetailsRequest paymentDueType(@javax.annotation.Nullable PaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
    return this;
  }

  /**
   * Type of payment due. If the payment is due on the last day of month, enter &#39;WITHIN_MONTH&#39;.
   * @return paymentDueType
   */
  @javax.annotation.Nullable
  public PaymentDueTypeEnum getPaymentDueType() {
    return paymentDueType;
  }

  public void setPaymentDueType(@javax.annotation.Nullable PaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
  }


  public AmendContractDetailsRequest firstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
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


  public AmendContractDetailsRequest payBeforeWeekends(@javax.annotation.Nullable Boolean payBeforeWeekends) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmendContractDetailsRequest amendContractDetailsRequest = (AmendContractDetailsRequest) o;
    return Objects.equals(this.scale, amendContractDetailsRequest.scale) &&
        Objects.equals(this.amount, amendContractDetailsRequest.amount) &&
        Objects.equals(this.cycleEnd, amendContractDetailsRequest.cycleEnd) &&
        Objects.equals(this.frequency, amendContractDetailsRequest.frequency) &&
        Objects.equals(this.jobTitleId, amendContractDetailsRequest.jobTitleId) &&
        Objects.equals(this.seniorityId, amendContractDetailsRequest.seniorityId) &&
        Objects.equals(this.currencyCode, amendContractDetailsRequest.currencyCode) &&
        Objects.equals(this.firstPayment, amendContractDetailsRequest.firstPayment) &&
        Objects.equals(this.scopeOfWork, amendContractDetailsRequest.scopeOfWork) &&
        Objects.equals(this.cycleEndType, amendContractDetailsRequest.cycleEndType) &&
        Objects.equals(this.effectiveDate, amendContractDetailsRequest.effectiveDate) &&
        Objects.equals(this.jobTitleName, amendContractDetailsRequest.jobTitleName) &&
        Objects.equals(this.specialClause, amendContractDetailsRequest.specialClause) &&
        Objects.equals(this.paymentDueDays, amendContractDetailsRequest.paymentDueDays) &&
        Objects.equals(this.paymentDueType, amendContractDetailsRequest.paymentDueType) &&
        Objects.equals(this.firstPaymentDate, amendContractDetailsRequest.firstPaymentDate) &&
        Objects.equals(this.payBeforeWeekends, amendContractDetailsRequest.payBeforeWeekends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, amount, cycleEnd, frequency, jobTitleId, seniorityId, currencyCode, firstPayment, scopeOfWork, cycleEndType, effectiveDate, jobTitleName, specialClause, paymentDueDays, paymentDueType, firstPaymentDate, payBeforeWeekends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmendContractDetailsRequest {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cycleEnd: ").append(toIndentedString(cycleEnd)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    jobTitleId: ").append(toIndentedString(jobTitleId)).append("\n");
    sb.append("    seniorityId: ").append(toIndentedString(seniorityId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    firstPayment: ").append(toIndentedString(firstPayment)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    cycleEndType: ").append(toIndentedString(cycleEndType)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    jobTitleName: ").append(toIndentedString(jobTitleName)).append("\n");
    sb.append("    specialClause: ").append(toIndentedString(specialClause)).append("\n");
    sb.append("    paymentDueDays: ").append(toIndentedString(paymentDueDays)).append("\n");
    sb.append("    paymentDueType: ").append(toIndentedString(paymentDueType)).append("\n");
    sb.append("    firstPaymentDate: ").append(toIndentedString(firstPaymentDate)).append("\n");
    sb.append("    payBeforeWeekends: ").append(toIndentedString(payBeforeWeekends)).append("\n");
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
    openapiFields.add("scale");
    openapiFields.add("amount");
    openapiFields.add("cycle_end");
    openapiFields.add("frequency");
    openapiFields.add("job_title_id");
    openapiFields.add("seniority_id");
    openapiFields.add("currency_code");
    openapiFields.add("first_payment");
    openapiFields.add("scope_of_work");
    openapiFields.add("cycle_end_type");
    openapiFields.add("effective_date");
    openapiFields.add("job_title_name");
    openapiFields.add("special_clause");
    openapiFields.add("payment_due_days");
    openapiFields.add("payment_due_type");
    openapiFields.add("first_payment_date");
    openapiFields.add("pay_before_weekends");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AmendContractDetailsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AmendContractDetailsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmendContractDetailsRequest is not found in the empty JSON string", AmendContractDetailsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AmendContractDetailsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AmendContractDetailsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        ScaleEnum.validateJsonElement(jsonObj.get("scale"));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      // validate the optional field `frequency`
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
        FrequencyEnum.validateJsonElement(jsonObj.get("frequency"));
      }
      // validate the optional field `job_title_id`
      if (jsonObj.get("job_title_id") != null && !jsonObj.get("job_title_id").isJsonNull()) {
        AmendContractDetailsRequestJobTitleId.validateJsonElement(jsonObj.get("job_title_id"));
      }
      // validate the optional field `seniority_id`
      if (jsonObj.get("seniority_id") != null && !jsonObj.get("seniority_id").isJsonNull()) {
        AmendContractDetailsRequestJobTitleId.validateJsonElement(jsonObj.get("seniority_id"));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if ((jsonObj.get("cycle_end_type") != null && !jsonObj.get("cycle_end_type").isJsonNull()) && !jsonObj.get("cycle_end_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_end_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_end_type").toString()));
      }
      // validate the optional field `cycle_end_type`
      if (jsonObj.get("cycle_end_type") != null && !jsonObj.get("cycle_end_type").isJsonNull()) {
        CycleEndTypeEnum.validateJsonElement(jsonObj.get("cycle_end_type"));
      }
      if ((jsonObj.get("job_title_name") != null && !jsonObj.get("job_title_name").isJsonNull()) && !jsonObj.get("job_title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title_name").toString()));
      }
      if ((jsonObj.get("special_clause") != null && !jsonObj.get("special_clause").isJsonNull()) && !jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      if ((jsonObj.get("payment_due_type") != null && !jsonObj.get("payment_due_type").isJsonNull()) && !jsonObj.get("payment_due_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_due_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_due_type").toString()));
      }
      // validate the optional field `payment_due_type`
      if (jsonObj.get("payment_due_type") != null && !jsonObj.get("payment_due_type").isJsonNull()) {
        PaymentDueTypeEnum.validateJsonElement(jsonObj.get("payment_due_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmendContractDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmendContractDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmendContractDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmendContractDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AmendContractDetailsRequest>() {
           @Override
           public void write(JsonWriter out, AmendContractDetailsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AmendContractDetailsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AmendContractDetailsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AmendContractDetailsRequest
   * @throws IOException if the JSON string is invalid with respect to AmendContractDetailsRequest
   */
  public static AmendContractDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmendContractDetailsRequest.class);
  }

  /**
   * Convert an instance of AmendContractDetailsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

