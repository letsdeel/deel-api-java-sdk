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
 * GetLegalEntityPayrollSettings200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class GetLegalEntityPayrollSettings200ResponseInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Defines the payroll cycle type.
   */
  @JsonAdapter(CycleTypeEnum.Adapter.class)
  public enum CycleTypeEnum {
    WEEKLY("WEEKLY"),
    
    BIWEEKLY("BIWEEKLY"),
    
    BIMONTHLY("BIMONTHLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    CycleTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CycleTypeEnum fromValue(String value) {
      for (CycleTypeEnum b : CycleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CycleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CycleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CycleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CycleTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CycleTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CYCLE_TYPE = "cycle_type";
  @SerializedName(SERIALIZED_NAME_CYCLE_TYPE)
  private CycleTypeEnum cycleType;

  public static final String SERIALIZED_NAME_FIRST_PAYROLL_START_DATE = "first_payroll_start_date";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYROLL_START_DATE)
  private LocalDate firstPayrollStartDate;

  public static final String SERIALIZED_NAME_PAYROLL_PROCESSING_LEAD_TIME_DAYS = "payroll_processing_lead_time_days";
  @SerializedName(SERIALIZED_NAME_PAYROLL_PROCESSING_LEAD_TIME_DAYS)
  private Integer payrollProcessingLeadTimeDays;

  public GetLegalEntityPayrollSettings200ResponseInner() {
  }

  public GetLegalEntityPayrollSettings200ResponseInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the legal entity.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public GetLegalEntityPayrollSettings200ResponseInner cycleType(CycleTypeEnum cycleType) {
    this.cycleType = cycleType;
    return this;
  }

  /**
   * Defines the payroll cycle type.
   * @return cycleType
   */
  @javax.annotation.Nullable
  public CycleTypeEnum getCycleType() {
    return cycleType;
  }

  public void setCycleType(CycleTypeEnum cycleType) {
    this.cycleType = cycleType;
  }


  public GetLegalEntityPayrollSettings200ResponseInner firstPayrollStartDate(LocalDate firstPayrollStartDate) {
    this.firstPayrollStartDate = firstPayrollStartDate;
    return this;
  }

  /**
   * The start date of the first payroll.
   * @return firstPayrollStartDate
   */
  @javax.annotation.Nullable
  public LocalDate getFirstPayrollStartDate() {
    return firstPayrollStartDate;
  }

  public void setFirstPayrollStartDate(LocalDate firstPayrollStartDate) {
    this.firstPayrollStartDate = firstPayrollStartDate;
  }


  public GetLegalEntityPayrollSettings200ResponseInner payrollProcessingLeadTimeDays(Integer payrollProcessingLeadTimeDays) {
    this.payrollProcessingLeadTimeDays = payrollProcessingLeadTimeDays;
    return this;
  }

  /**
   * The number of days required to process payroll.
   * minimum: 0
   * @return payrollProcessingLeadTimeDays
   */
  @javax.annotation.Nullable
  public Integer getPayrollProcessingLeadTimeDays() {
    return payrollProcessingLeadTimeDays;
  }

  public void setPayrollProcessingLeadTimeDays(Integer payrollProcessingLeadTimeDays) {
    this.payrollProcessingLeadTimeDays = payrollProcessingLeadTimeDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLegalEntityPayrollSettings200ResponseInner getLegalEntityPayrollSettings200ResponseInner = (GetLegalEntityPayrollSettings200ResponseInner) o;
    return Objects.equals(this.id, getLegalEntityPayrollSettings200ResponseInner.id) &&
        Objects.equals(this.cycleType, getLegalEntityPayrollSettings200ResponseInner.cycleType) &&
        Objects.equals(this.firstPayrollStartDate, getLegalEntityPayrollSettings200ResponseInner.firstPayrollStartDate) &&
        Objects.equals(this.payrollProcessingLeadTimeDays, getLegalEntityPayrollSettings200ResponseInner.payrollProcessingLeadTimeDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cycleType, firstPayrollStartDate, payrollProcessingLeadTimeDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLegalEntityPayrollSettings200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cycleType: ").append(toIndentedString(cycleType)).append("\n");
    sb.append("    firstPayrollStartDate: ").append(toIndentedString(firstPayrollStartDate)).append("\n");
    sb.append("    payrollProcessingLeadTimeDays: ").append(toIndentedString(payrollProcessingLeadTimeDays)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("cycle_type");
    openapiFields.add("first_payroll_start_date");
    openapiFields.add("payroll_processing_lead_time_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetLegalEntityPayrollSettings200ResponseInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLegalEntityPayrollSettings200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLegalEntityPayrollSettings200ResponseInner is not found in the empty JSON string", GetLegalEntityPayrollSettings200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLegalEntityPayrollSettings200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLegalEntityPayrollSettings200ResponseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("cycle_type") != null && !jsonObj.get("cycle_type").isJsonNull()) && !jsonObj.get("cycle_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_type").toString()));
      }
      // validate the optional field `cycle_type`
      if (jsonObj.get("cycle_type") != null && !jsonObj.get("cycle_type").isJsonNull()) {
        CycleTypeEnum.validateJsonElement(jsonObj.get("cycle_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLegalEntityPayrollSettings200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLegalEntityPayrollSettings200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLegalEntityPayrollSettings200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLegalEntityPayrollSettings200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLegalEntityPayrollSettings200ResponseInner>() {
           @Override
           public void write(JsonWriter out, GetLegalEntityPayrollSettings200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLegalEntityPayrollSettings200ResponseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLegalEntityPayrollSettings200ResponseInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLegalEntityPayrollSettings200ResponseInner
   * @throws IOException if the JSON string is invalid with respect to GetLegalEntityPayrollSettings200ResponseInner
   */
  public static GetLegalEntityPayrollSettings200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLegalEntityPayrollSettings200ResponseInner.class);
  }

  /**
   * Convert an instance of GetLegalEntityPayrollSettings200ResponseInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
