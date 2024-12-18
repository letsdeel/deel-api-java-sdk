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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractDetailsToAmend {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nullable
  private String currencyCode;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private WorkStatementScaleEnum scale;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  @javax.annotation.Nullable
  private LocalDate effectiveDate;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT_DATE = "first_payment_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT_DATE)
  @javax.annotation.Nullable
  private LocalDate firstPaymentDate;

  public static final String SERIALIZED_NAME_FIRST_PAYMENT = "first_payment";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYMENT)
  @javax.annotation.Nullable
  private BigDecimal firstPayment;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private WorkStatementCycleScaleEnum frequency;

  public static final String SERIALIZED_NAME_CYCLE_END = "cycle_end";
  @SerializedName(SERIALIZED_NAME_CYCLE_END)
  @javax.annotation.Nullable
  private BigDecimal cycleEnd;

  public static final String SERIALIZED_NAME_CYCLE_END_TYPE = "cycle_end_type";
  @SerializedName(SERIALIZED_NAME_CYCLE_END_TYPE)
  @javax.annotation.Nullable
  private WorkStatementCycleEndTypeEnum cycleEndType;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_TYPE = "payment_due_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_TYPE)
  @javax.annotation.Nullable
  private WorkStatementPaymentDueTypeEnum paymentDueType = WorkStatementPaymentDueTypeEnum.REGULAR;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_DAYS = "payment_due_days";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_DAYS)
  @javax.annotation.Nullable
  private BigDecimal paymentDueDays;

  public static final String SERIALIZED_NAME_PAY_BEFORE_WEEKENDS = "pay_before_weekends";
  @SerializedName(SERIALIZED_NAME_PAY_BEFORE_WEEKENDS)
  @javax.annotation.Nullable
  private Boolean payBeforeWeekends;

  public static final String SERIALIZED_NAME_JOB_TITLE_NAME = "job_title_name";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE_NAME)
  @javax.annotation.Nullable
  private String jobTitleName;

  public static final String SERIALIZED_NAME_JOB_TITLE_ID = "job_title_id";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE_ID)
  @javax.annotation.Nullable
  private String jobTitleId;

  public static final String SERIALIZED_NAME_SENIORITY_ID = "seniority_id";
  @SerializedName(SERIALIZED_NAME_SENIORITY_ID)
  @javax.annotation.Nullable
  private String seniorityId;

  public static final String SERIALIZED_NAME_SPECIAL_CLAUSE = "special_clause";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CLAUSE)
  @javax.annotation.Nullable
  private String specialClause;

  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  @javax.annotation.Nullable
  private String scopeOfWork;

  public ContractDetailsToAmend() {
  }

  public ContractDetailsToAmend amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
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


  public ContractDetailsToAmend currencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ContractDetailsToAmend scale(@javax.annotation.Nullable WorkStatementScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nullable
  public WorkStatementScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable WorkStatementScaleEnum scale) {
    this.scale = scale;
  }


  public ContractDetailsToAmend effectiveDate(@javax.annotation.Nullable LocalDate effectiveDate) {
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


  public ContractDetailsToAmend firstPaymentDate(@javax.annotation.Nullable LocalDate firstPaymentDate) {
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


  public ContractDetailsToAmend firstPayment(@javax.annotation.Nullable BigDecimal firstPayment) {
    this.firstPayment = firstPayment;
    return this;
  }

  /**
   * Get firstPayment
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


  public ContractDetailsToAmend frequency(@javax.annotation.Nullable WorkStatementCycleScaleEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @javax.annotation.Nullable
  public WorkStatementCycleScaleEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable WorkStatementCycleScaleEnum frequency) {
    this.frequency = frequency;
  }


  public ContractDetailsToAmend cycleEnd(@javax.annotation.Nullable BigDecimal cycleEnd) {
    this.cycleEnd = cycleEnd;
    return this;
  }

  /**
   * Get cycleEnd
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


  public ContractDetailsToAmend cycleEndType(@javax.annotation.Nullable WorkStatementCycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
    return this;
  }

  /**
   * Get cycleEndType
   * @return cycleEndType
   */
  @javax.annotation.Nullable
  public WorkStatementCycleEndTypeEnum getCycleEndType() {
    return cycleEndType;
  }

  public void setCycleEndType(@javax.annotation.Nullable WorkStatementCycleEndTypeEnum cycleEndType) {
    this.cycleEndType = cycleEndType;
  }


  public ContractDetailsToAmend paymentDueType(@javax.annotation.Nullable WorkStatementPaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
    return this;
  }

  /**
   * Get paymentDueType
   * @return paymentDueType
   */
  @javax.annotation.Nullable
  public WorkStatementPaymentDueTypeEnum getPaymentDueType() {
    return paymentDueType;
  }

  public void setPaymentDueType(@javax.annotation.Nullable WorkStatementPaymentDueTypeEnum paymentDueType) {
    this.paymentDueType = paymentDueType;
  }


  public ContractDetailsToAmend paymentDueDays(@javax.annotation.Nullable BigDecimal paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
    return this;
  }

  /**
   * Get paymentDueDays
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


  public ContractDetailsToAmend payBeforeWeekends(@javax.annotation.Nullable Boolean payBeforeWeekends) {
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


  public ContractDetailsToAmend jobTitleName(@javax.annotation.Nullable String jobTitleName) {
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


  public ContractDetailsToAmend jobTitleId(@javax.annotation.Nullable String jobTitleId) {
    this.jobTitleId = jobTitleId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return jobTitleId
   */
  @javax.annotation.Nullable
  public String getJobTitleId() {
    return jobTitleId;
  }

  public void setJobTitleId(@javax.annotation.Nullable String jobTitleId) {
    this.jobTitleId = jobTitleId;
  }


  public ContractDetailsToAmend seniorityId(@javax.annotation.Nullable String seniorityId) {
    this.seniorityId = seniorityId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return seniorityId
   */
  @javax.annotation.Nullable
  public String getSeniorityId() {
    return seniorityId;
  }

  public void setSeniorityId(@javax.annotation.Nullable String seniorityId) {
    this.seniorityId = seniorityId;
  }


  public ContractDetailsToAmend specialClause(@javax.annotation.Nullable String specialClause) {
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


  public ContractDetailsToAmend scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractDetailsToAmend contractDetailsToAmend = (ContractDetailsToAmend) o;
    return Objects.equals(this.amount, contractDetailsToAmend.amount) &&
        Objects.equals(this.currencyCode, contractDetailsToAmend.currencyCode) &&
        Objects.equals(this.scale, contractDetailsToAmend.scale) &&
        Objects.equals(this.effectiveDate, contractDetailsToAmend.effectiveDate) &&
        Objects.equals(this.firstPaymentDate, contractDetailsToAmend.firstPaymentDate) &&
        Objects.equals(this.firstPayment, contractDetailsToAmend.firstPayment) &&
        Objects.equals(this.frequency, contractDetailsToAmend.frequency) &&
        Objects.equals(this.cycleEnd, contractDetailsToAmend.cycleEnd) &&
        Objects.equals(this.cycleEndType, contractDetailsToAmend.cycleEndType) &&
        Objects.equals(this.paymentDueType, contractDetailsToAmend.paymentDueType) &&
        Objects.equals(this.paymentDueDays, contractDetailsToAmend.paymentDueDays) &&
        Objects.equals(this.payBeforeWeekends, contractDetailsToAmend.payBeforeWeekends) &&
        Objects.equals(this.jobTitleName, contractDetailsToAmend.jobTitleName) &&
        Objects.equals(this.jobTitleId, contractDetailsToAmend.jobTitleId) &&
        Objects.equals(this.seniorityId, contractDetailsToAmend.seniorityId) &&
        Objects.equals(this.specialClause, contractDetailsToAmend.specialClause) &&
        Objects.equals(this.scopeOfWork, contractDetailsToAmend.scopeOfWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, scale, effectiveDate, firstPaymentDate, firstPayment, frequency, cycleEnd, cycleEndType, paymentDueType, paymentDueDays, payBeforeWeekends, jobTitleName, jobTitleId, seniorityId, specialClause, scopeOfWork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractDetailsToAmend {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    firstPaymentDate: ").append(toIndentedString(firstPaymentDate)).append("\n");
    sb.append("    firstPayment: ").append(toIndentedString(firstPayment)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    cycleEnd: ").append(toIndentedString(cycleEnd)).append("\n");
    sb.append("    cycleEndType: ").append(toIndentedString(cycleEndType)).append("\n");
    sb.append("    paymentDueType: ").append(toIndentedString(paymentDueType)).append("\n");
    sb.append("    paymentDueDays: ").append(toIndentedString(paymentDueDays)).append("\n");
    sb.append("    payBeforeWeekends: ").append(toIndentedString(payBeforeWeekends)).append("\n");
    sb.append("    jobTitleName: ").append(toIndentedString(jobTitleName)).append("\n");
    sb.append("    jobTitleId: ").append(toIndentedString(jobTitleId)).append("\n");
    sb.append("    seniorityId: ").append(toIndentedString(seniorityId)).append("\n");
    sb.append("    specialClause: ").append(toIndentedString(specialClause)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
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
    openapiFields.add("scale");
    openapiFields.add("effective_date");
    openapiFields.add("first_payment_date");
    openapiFields.add("first_payment");
    openapiFields.add("frequency");
    openapiFields.add("cycle_end");
    openapiFields.add("cycle_end_type");
    openapiFields.add("payment_due_type");
    openapiFields.add("payment_due_days");
    openapiFields.add("pay_before_weekends");
    openapiFields.add("job_title_name");
    openapiFields.add("job_title_id");
    openapiFields.add("seniority_id");
    openapiFields.add("special_clause");
    openapiFields.add("scope_of_work");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractDetailsToAmend
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractDetailsToAmend.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractDetailsToAmend is not found in the empty JSON string", ContractDetailsToAmend.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractDetailsToAmend.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractDetailsToAmend` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        WorkStatementScaleEnum.validateJsonElement(jsonObj.get("scale"));
      }
      // validate the optional field `frequency`
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
        WorkStatementCycleScaleEnum.validateJsonElement(jsonObj.get("frequency"));
      }
      // validate the optional field `cycle_end_type`
      if (jsonObj.get("cycle_end_type") != null && !jsonObj.get("cycle_end_type").isJsonNull()) {
        WorkStatementCycleEndTypeEnum.validateJsonElement(jsonObj.get("cycle_end_type"));
      }
      // validate the optional field `payment_due_type`
      if (jsonObj.get("payment_due_type") != null && !jsonObj.get("payment_due_type").isJsonNull()) {
        WorkStatementPaymentDueTypeEnum.validateJsonElement(jsonObj.get("payment_due_type"));
      }
      if ((jsonObj.get("job_title_name") != null && !jsonObj.get("job_title_name").isJsonNull()) && !jsonObj.get("job_title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title_name").toString()));
      }
      if ((jsonObj.get("job_title_id") != null && !jsonObj.get("job_title_id").isJsonNull()) && !jsonObj.get("job_title_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title_id").toString()));
      }
      if ((jsonObj.get("seniority_id") != null && !jsonObj.get("seniority_id").isJsonNull()) && !jsonObj.get("seniority_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seniority_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seniority_id").toString()));
      }
      if ((jsonObj.get("special_clause") != null && !jsonObj.get("special_clause").isJsonNull()) && !jsonObj.get("special_clause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_clause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_clause").toString()));
      }
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractDetailsToAmend.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractDetailsToAmend' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractDetailsToAmend> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractDetailsToAmend.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractDetailsToAmend>() {
           @Override
           public void write(JsonWriter out, ContractDetailsToAmend value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractDetailsToAmend read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractDetailsToAmend given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractDetailsToAmend
   * @throws IOException if the JSON string is invalid with respect to ContractDetailsToAmend
   */
  public static ContractDetailsToAmend fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractDetailsToAmend.class);
  }

  /**
   * Convert an instance of ContractDetailsToAmend to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

