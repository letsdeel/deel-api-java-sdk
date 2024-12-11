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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetPayStub200ResponseDataInnerEmployeesInner;

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
 * GetPayStub200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:06:48.603230199Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPayStub200ResponseDataInner {
  /**
   * Source of the payroll data.
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    HISTORICAL("HISTORICAL"),
    
    NEW("NEW");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SourceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nullable
  private SourceEnum source;

  public static final String SERIALIZED_NAME_EMPLOYEES = "employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  @javax.annotation.Nullable
  private List<GetPayStub200ResponseDataInnerEmployeesInner> employees = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYROLL_ID = "payroll_id";
  @SerializedName(SERIALIZED_NAME_PAYROLL_ID)
  @javax.annotation.Nullable
  private String payrollId;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "payment_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  @javax.annotation.Nullable
  private String paymentDate;

  /**
   * Type of payroll payment.
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
  public enum PaymentTypeEnum {
    RECONCILIATION("RECONCILIATION"),
    
    PARALLEL("PARALLEL"),
    
    HISTORICAL("HISTORICAL"),
    
    OFFCYCLE("OFFCYCLE"),
    
    REGULAR("REGULAR");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PaymentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  @javax.annotation.Nullable
  private PaymentTypeEnum paymentType;

  /**
   * Current status of the payroll payment.
   */
  @JsonAdapter(PaymentStatusEnum.Adapter.class)
  public enum PaymentStatusEnum {
    OPEN("OPEN"),
    
    LOCKED("LOCKED"),
    
    CLOSED("CLOSED");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentStatusEnum fromValue(String value) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PaymentStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  @javax.annotation.Nullable
  private PaymentStatusEnum paymentStatus;

  public static final String SERIALIZED_NAME_PAYROLL_END_DATE = "payroll_end_date";
  @SerializedName(SERIALIZED_NAME_PAYROLL_END_DATE)
  @javax.annotation.Nullable
  private String payrollEndDate;

  /**
   * Frequency of the payroll schedule.
   */
  @JsonAdapter(PayrollScheduleEnum.Adapter.class)
  public enum PayrollScheduleEnum {
    BIMONTHLY("BIMONTHLY"),
    
    MONTHLY("MONTHLY"),
    
    BIWEEKLY("BIWEEKLY"),
    
    WEEKLY("WEEKLY");

    private String value;

    PayrollScheduleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayrollScheduleEnum fromValue(String value) {
      for (PayrollScheduleEnum b : PayrollScheduleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayrollScheduleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayrollScheduleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayrollScheduleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayrollScheduleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PayrollScheduleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAYROLL_SCHEDULE = "payroll_schedule";
  @SerializedName(SERIALIZED_NAME_PAYROLL_SCHEDULE)
  @javax.annotation.Nullable
  private PayrollScheduleEnum payrollSchedule;

  public static final String SERIALIZED_NAME_PAYROLL_START_DATE = "payroll_start_date";
  @SerializedName(SERIALIZED_NAME_PAYROLL_START_DATE)
  @javax.annotation.Nullable
  private String payrollStartDate;

  public GetPayStub200ResponseDataInner() {
  }

  public GetPayStub200ResponseDataInner source(@javax.annotation.Nullable SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * Source of the payroll data.
   * @return source
   */
  @javax.annotation.Nullable
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nullable SourceEnum source) {
    this.source = source;
  }


  public GetPayStub200ResponseDataInner employees(@javax.annotation.Nullable List<GetPayStub200ResponseDataInnerEmployeesInner> employees) {
    this.employees = employees;
    return this;
  }

  public GetPayStub200ResponseDataInner addEmployeesItem(GetPayStub200ResponseDataInnerEmployeesInner employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * List of employees included in the payroll.
   * @return employees
   */
  @javax.annotation.Nullable
  public List<GetPayStub200ResponseDataInnerEmployeesInner> getEmployees() {
    return employees;
  }

  public void setEmployees(@javax.annotation.Nullable List<GetPayStub200ResponseDataInnerEmployeesInner> employees) {
    this.employees = employees;
  }


  public GetPayStub200ResponseDataInner payrollId(@javax.annotation.Nullable String payrollId) {
    this.payrollId = payrollId;
    return this;
  }

  /**
   * Unique identifier for the payroll.
   * @return payrollId
   */
  @javax.annotation.Nullable
  public String getPayrollId() {
    return payrollId;
  }

  public void setPayrollId(@javax.annotation.Nullable String payrollId) {
    this.payrollId = payrollId;
  }


  public GetPayStub200ResponseDataInner paymentDate(@javax.annotation.Nullable String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Date when the payment is made.
   * @return paymentDate
   */
  @javax.annotation.Nullable
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(@javax.annotation.Nullable String paymentDate) {
    this.paymentDate = paymentDate;
  }


  public GetPayStub200ResponseDataInner paymentType(@javax.annotation.Nullable PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Type of payroll payment.
   * @return paymentType
   */
  @javax.annotation.Nullable
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(@javax.annotation.Nullable PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public GetPayStub200ResponseDataInner paymentStatus(@javax.annotation.Nullable PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * Current status of the payroll payment.
   * @return paymentStatus
   */
  @javax.annotation.Nullable
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(@javax.annotation.Nullable PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public GetPayStub200ResponseDataInner payrollEndDate(@javax.annotation.Nullable String payrollEndDate) {
    this.payrollEndDate = payrollEndDate;
    return this;
  }

  /**
   * End date of the payroll period.
   * @return payrollEndDate
   */
  @javax.annotation.Nullable
  public String getPayrollEndDate() {
    return payrollEndDate;
  }

  public void setPayrollEndDate(@javax.annotation.Nullable String payrollEndDate) {
    this.payrollEndDate = payrollEndDate;
  }


  public GetPayStub200ResponseDataInner payrollSchedule(@javax.annotation.Nullable PayrollScheduleEnum payrollSchedule) {
    this.payrollSchedule = payrollSchedule;
    return this;
  }

  /**
   * Frequency of the payroll schedule.
   * @return payrollSchedule
   */
  @javax.annotation.Nullable
  public PayrollScheduleEnum getPayrollSchedule() {
    return payrollSchedule;
  }

  public void setPayrollSchedule(@javax.annotation.Nullable PayrollScheduleEnum payrollSchedule) {
    this.payrollSchedule = payrollSchedule;
  }


  public GetPayStub200ResponseDataInner payrollStartDate(@javax.annotation.Nullable String payrollStartDate) {
    this.payrollStartDate = payrollStartDate;
    return this;
  }

  /**
   * Start date of the payroll period.
   * @return payrollStartDate
   */
  @javax.annotation.Nullable
  public String getPayrollStartDate() {
    return payrollStartDate;
  }

  public void setPayrollStartDate(@javax.annotation.Nullable String payrollStartDate) {
    this.payrollStartDate = payrollStartDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPayStub200ResponseDataInner getPayStub200ResponseDataInner = (GetPayStub200ResponseDataInner) o;
    return Objects.equals(this.source, getPayStub200ResponseDataInner.source) &&
        Objects.equals(this.employees, getPayStub200ResponseDataInner.employees) &&
        Objects.equals(this.payrollId, getPayStub200ResponseDataInner.payrollId) &&
        Objects.equals(this.paymentDate, getPayStub200ResponseDataInner.paymentDate) &&
        Objects.equals(this.paymentType, getPayStub200ResponseDataInner.paymentType) &&
        Objects.equals(this.paymentStatus, getPayStub200ResponseDataInner.paymentStatus) &&
        Objects.equals(this.payrollEndDate, getPayStub200ResponseDataInner.payrollEndDate) &&
        Objects.equals(this.payrollSchedule, getPayStub200ResponseDataInner.payrollSchedule) &&
        Objects.equals(this.payrollStartDate, getPayStub200ResponseDataInner.payrollStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, employees, payrollId, paymentDate, paymentType, paymentStatus, payrollEndDate, payrollSchedule, payrollStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPayStub200ResponseDataInner {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    payrollId: ").append(toIndentedString(payrollId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    payrollEndDate: ").append(toIndentedString(payrollEndDate)).append("\n");
    sb.append("    payrollSchedule: ").append(toIndentedString(payrollSchedule)).append("\n");
    sb.append("    payrollStartDate: ").append(toIndentedString(payrollStartDate)).append("\n");
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
    openapiFields.add("source");
    openapiFields.add("employees");
    openapiFields.add("payroll_id");
    openapiFields.add("payment_date");
    openapiFields.add("payment_type");
    openapiFields.add("payment_status");
    openapiFields.add("payroll_end_date");
    openapiFields.add("payroll_schedule");
    openapiFields.add("payroll_start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPayStub200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPayStub200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPayStub200ResponseDataInner is not found in the empty JSON string", GetPayStub200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPayStub200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPayStub200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        SourceEnum.validateJsonElement(jsonObj.get("source"));
      }
      if (jsonObj.get("employees") != null && !jsonObj.get("employees").isJsonNull()) {
        JsonArray jsonArrayemployees = jsonObj.getAsJsonArray("employees");
        if (jsonArrayemployees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employees` to be an array in the JSON string but got `%s`", jsonObj.get("employees").toString()));
          }

          // validate the optional field `employees` (array)
          for (int i = 0; i < jsonArrayemployees.size(); i++) {
            GetPayStub200ResponseDataInnerEmployeesInner.validateJsonElement(jsonArrayemployees.get(i));
          };
        }
      }
      if ((jsonObj.get("payroll_id") != null && !jsonObj.get("payroll_id").isJsonNull()) && !jsonObj.get("payroll_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_id").toString()));
      }
      if ((jsonObj.get("payment_date") != null && !jsonObj.get("payment_date").isJsonNull()) && !jsonObj.get("payment_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_date").toString()));
      }
      if ((jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()) && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      // validate the optional field `payment_type`
      if (jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()) {
        PaymentTypeEnum.validateJsonElement(jsonObj.get("payment_type"));
      }
      if ((jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) && !jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      // validate the optional field `payment_status`
      if (jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) {
        PaymentStatusEnum.validateJsonElement(jsonObj.get("payment_status"));
      }
      if ((jsonObj.get("payroll_end_date") != null && !jsonObj.get("payroll_end_date").isJsonNull()) && !jsonObj.get("payroll_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_end_date").toString()));
      }
      if ((jsonObj.get("payroll_schedule") != null && !jsonObj.get("payroll_schedule").isJsonNull()) && !jsonObj.get("payroll_schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_schedule").toString()));
      }
      // validate the optional field `payroll_schedule`
      if (jsonObj.get("payroll_schedule") != null && !jsonObj.get("payroll_schedule").isJsonNull()) {
        PayrollScheduleEnum.validateJsonElement(jsonObj.get("payroll_schedule"));
      }
      if ((jsonObj.get("payroll_start_date") != null && !jsonObj.get("payroll_start_date").isJsonNull()) && !jsonObj.get("payroll_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_start_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPayStub200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPayStub200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPayStub200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPayStub200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPayStub200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetPayStub200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPayStub200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPayStub200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPayStub200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetPayStub200ResponseDataInner
   */
  public static GetPayStub200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPayStub200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetPayStub200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

