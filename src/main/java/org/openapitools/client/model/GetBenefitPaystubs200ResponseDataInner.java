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
import org.openapitools.client.model.GetBenefitPaystubs200ResponseDataInnerEmployeesInner;

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
 * GetBenefitPaystubs200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitPaystubs200ResponseDataInner {
  public static final String SERIALIZED_NAME_EMPLOYEES = "employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  @javax.annotation.Nullable
  private List<GetBenefitPaystubs200ResponseDataInnerEmployeesInner> employees = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYROLL_ID = "payroll_id";
  @SerializedName(SERIALIZED_NAME_PAYROLL_ID)
  @javax.annotation.Nullable
  private String payrollId;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "payment_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  @javax.annotation.Nullable
  private String paymentDate;

  public static final String SERIALIZED_NAME_PAYROLL_TYPE = "payroll_type";
  @SerializedName(SERIALIZED_NAME_PAYROLL_TYPE)
  @javax.annotation.Nullable
  private String payrollType;

  /**
   * Payroll state.
   */
  @JsonAdapter(PayrollStateEnum.Adapter.class)
  public enum PayrollStateEnum {
    OPEN("OPEN"),
    
    LOCKED("LOCKED"),
    
    CLOSED("CLOSED");

    private String value;

    PayrollStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayrollStateEnum fromValue(String value) {
      for (PayrollStateEnum b : PayrollStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayrollStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayrollStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayrollStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayrollStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PayrollStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAYROLL_STATE = "payroll_state";
  @SerializedName(SERIALIZED_NAME_PAYROLL_STATE)
  @javax.annotation.Nullable
  private PayrollStateEnum payrollState;

  public static final String SERIALIZED_NAME_PAYROLL_END_DATE = "payroll_end_date";
  @SerializedName(SERIALIZED_NAME_PAYROLL_END_DATE)
  @javax.annotation.Nullable
  private String payrollEndDate;

  /**
   * Payroll cycle type.
   */
  @JsonAdapter(PayrollScheduleEnum.Adapter.class)
  public enum PayrollScheduleEnum {
    MONTHLY("MONTHLY"),
    
    BIMONTHLY("BIMONTHLY"),
    
    CUSTOM("CUSTOM"),
    
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

  public GetBenefitPaystubs200ResponseDataInner() {
  }

  public GetBenefitPaystubs200ResponseDataInner employees(@javax.annotation.Nullable List<GetBenefitPaystubs200ResponseDataInnerEmployeesInner> employees) {
    this.employees = employees;
    return this;
  }

  public GetBenefitPaystubs200ResponseDataInner addEmployeesItem(GetBenefitPaystubs200ResponseDataInnerEmployeesInner employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * List of employees associated with the payroll.
   * @return employees
   */
  @javax.annotation.Nullable
  public List<GetBenefitPaystubs200ResponseDataInnerEmployeesInner> getEmployees() {
    return employees;
  }

  public void setEmployees(@javax.annotation.Nullable List<GetBenefitPaystubs200ResponseDataInnerEmployeesInner> employees) {
    this.employees = employees;
  }


  public GetBenefitPaystubs200ResponseDataInner payrollId(@javax.annotation.Nullable String payrollId) {
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


  public GetBenefitPaystubs200ResponseDataInner paymentDate(@javax.annotation.Nullable String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Payment date.
   * @return paymentDate
   */
  @javax.annotation.Nullable
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(@javax.annotation.Nullable String paymentDate) {
    this.paymentDate = paymentDate;
  }


  public GetBenefitPaystubs200ResponseDataInner payrollType(@javax.annotation.Nullable String payrollType) {
    this.payrollType = payrollType;
    return this;
  }

  /**
   * Payroll type.
   * @return payrollType
   */
  @javax.annotation.Nullable
  public String getPayrollType() {
    return payrollType;
  }

  public void setPayrollType(@javax.annotation.Nullable String payrollType) {
    this.payrollType = payrollType;
  }


  public GetBenefitPaystubs200ResponseDataInner payrollState(@javax.annotation.Nullable PayrollStateEnum payrollState) {
    this.payrollState = payrollState;
    return this;
  }

  /**
   * Payroll state.
   * @return payrollState
   */
  @javax.annotation.Nullable
  public PayrollStateEnum getPayrollState() {
    return payrollState;
  }

  public void setPayrollState(@javax.annotation.Nullable PayrollStateEnum payrollState) {
    this.payrollState = payrollState;
  }


  public GetBenefitPaystubs200ResponseDataInner payrollEndDate(@javax.annotation.Nullable String payrollEndDate) {
    this.payrollEndDate = payrollEndDate;
    return this;
  }

  /**
   * Payroll end date.
   * @return payrollEndDate
   */
  @javax.annotation.Nullable
  public String getPayrollEndDate() {
    return payrollEndDate;
  }

  public void setPayrollEndDate(@javax.annotation.Nullable String payrollEndDate) {
    this.payrollEndDate = payrollEndDate;
  }


  public GetBenefitPaystubs200ResponseDataInner payrollSchedule(@javax.annotation.Nullable PayrollScheduleEnum payrollSchedule) {
    this.payrollSchedule = payrollSchedule;
    return this;
  }

  /**
   * Payroll cycle type.
   * @return payrollSchedule
   */
  @javax.annotation.Nullable
  public PayrollScheduleEnum getPayrollSchedule() {
    return payrollSchedule;
  }

  public void setPayrollSchedule(@javax.annotation.Nullable PayrollScheduleEnum payrollSchedule) {
    this.payrollSchedule = payrollSchedule;
  }


  public GetBenefitPaystubs200ResponseDataInner payrollStartDate(@javax.annotation.Nullable String payrollStartDate) {
    this.payrollStartDate = payrollStartDate;
    return this;
  }

  /**
   * Payroll start date.
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
    GetBenefitPaystubs200ResponseDataInner getBenefitPaystubs200ResponseDataInner = (GetBenefitPaystubs200ResponseDataInner) o;
    return Objects.equals(this.employees, getBenefitPaystubs200ResponseDataInner.employees) &&
        Objects.equals(this.payrollId, getBenefitPaystubs200ResponseDataInner.payrollId) &&
        Objects.equals(this.paymentDate, getBenefitPaystubs200ResponseDataInner.paymentDate) &&
        Objects.equals(this.payrollType, getBenefitPaystubs200ResponseDataInner.payrollType) &&
        Objects.equals(this.payrollState, getBenefitPaystubs200ResponseDataInner.payrollState) &&
        Objects.equals(this.payrollEndDate, getBenefitPaystubs200ResponseDataInner.payrollEndDate) &&
        Objects.equals(this.payrollSchedule, getBenefitPaystubs200ResponseDataInner.payrollSchedule) &&
        Objects.equals(this.payrollStartDate, getBenefitPaystubs200ResponseDataInner.payrollStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employees, payrollId, paymentDate, payrollType, payrollState, payrollEndDate, payrollSchedule, payrollStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBenefitPaystubs200ResponseDataInner {\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    payrollId: ").append(toIndentedString(payrollId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    payrollType: ").append(toIndentedString(payrollType)).append("\n");
    sb.append("    payrollState: ").append(toIndentedString(payrollState)).append("\n");
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
    openapiFields.add("employees");
    openapiFields.add("payroll_id");
    openapiFields.add("payment_date");
    openapiFields.add("payroll_type");
    openapiFields.add("payroll_state");
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
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitPaystubs200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitPaystubs200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitPaystubs200ResponseDataInner is not found in the empty JSON string", GetBenefitPaystubs200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitPaystubs200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitPaystubs200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("employees") != null && !jsonObj.get("employees").isJsonNull()) {
        JsonArray jsonArrayemployees = jsonObj.getAsJsonArray("employees");
        if (jsonArrayemployees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employees` to be an array in the JSON string but got `%s`", jsonObj.get("employees").toString()));
          }

          // validate the optional field `employees` (array)
          for (int i = 0; i < jsonArrayemployees.size(); i++) {
            GetBenefitPaystubs200ResponseDataInnerEmployeesInner.validateJsonElement(jsonArrayemployees.get(i));
          };
        }
      }
      if ((jsonObj.get("payroll_id") != null && !jsonObj.get("payroll_id").isJsonNull()) && !jsonObj.get("payroll_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_id").toString()));
      }
      if ((jsonObj.get("payment_date") != null && !jsonObj.get("payment_date").isJsonNull()) && !jsonObj.get("payment_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_date").toString()));
      }
      if ((jsonObj.get("payroll_type") != null && !jsonObj.get("payroll_type").isJsonNull()) && !jsonObj.get("payroll_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_type").toString()));
      }
      if ((jsonObj.get("payroll_state") != null && !jsonObj.get("payroll_state").isJsonNull()) && !jsonObj.get("payroll_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_state").toString()));
      }
      // validate the optional field `payroll_state`
      if (jsonObj.get("payroll_state") != null && !jsonObj.get("payroll_state").isJsonNull()) {
        PayrollStateEnum.validateJsonElement(jsonObj.get("payroll_state"));
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
       if (!GetBenefitPaystubs200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitPaystubs200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitPaystubs200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitPaystubs200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitPaystubs200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetBenefitPaystubs200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitPaystubs200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitPaystubs200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitPaystubs200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetBenefitPaystubs200ResponseDataInner
   */
  public static GetBenefitPaystubs200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitPaystubs200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetBenefitPaystubs200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

