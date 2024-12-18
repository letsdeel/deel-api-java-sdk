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
 * HrisDirectEmployeeVacationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisDirectEmployeeVacationInfo {
  public static final String SERIALIZED_NAME_VACATION_ACCRUAL_START_DATE = "vacation_accrual_start_date";
  @SerializedName(SERIALIZED_NAME_VACATION_ACCRUAL_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate vacationAccrualStartDate;

  public static final String SERIALIZED_NAME_VACATION_YEARLY_POLICY = "vacation_yearly_policy";
  @SerializedName(SERIALIZED_NAME_VACATION_YEARLY_POLICY)
  @javax.annotation.Nonnull
  private BigDecimal vacationYearlyPolicy;

  public HrisDirectEmployeeVacationInfo() {
  }

  public HrisDirectEmployeeVacationInfo vacationAccrualStartDate(@javax.annotation.Nonnull LocalDate vacationAccrualStartDate) {
    this.vacationAccrualStartDate = vacationAccrualStartDate;
    return this;
  }

  /**
   * Get vacationAccrualStartDate
   * @return vacationAccrualStartDate
   */
  @javax.annotation.Nonnull
  public LocalDate getVacationAccrualStartDate() {
    return vacationAccrualStartDate;
  }

  public void setVacationAccrualStartDate(@javax.annotation.Nonnull LocalDate vacationAccrualStartDate) {
    this.vacationAccrualStartDate = vacationAccrualStartDate;
  }


  public HrisDirectEmployeeVacationInfo vacationYearlyPolicy(@javax.annotation.Nonnull BigDecimal vacationYearlyPolicy) {
    this.vacationYearlyPolicy = vacationYearlyPolicy;
    return this;
  }

  /**
   * Get vacationYearlyPolicy
   * minimum: 1
   * maximum: 365
   * @return vacationYearlyPolicy
   */
  @javax.annotation.Nonnull
  public BigDecimal getVacationYearlyPolicy() {
    return vacationYearlyPolicy;
  }

  public void setVacationYearlyPolicy(@javax.annotation.Nonnull BigDecimal vacationYearlyPolicy) {
    this.vacationYearlyPolicy = vacationYearlyPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisDirectEmployeeVacationInfo hrisDirectEmployeeVacationInfo = (HrisDirectEmployeeVacationInfo) o;
    return Objects.equals(this.vacationAccrualStartDate, hrisDirectEmployeeVacationInfo.vacationAccrualStartDate) &&
        Objects.equals(this.vacationYearlyPolicy, hrisDirectEmployeeVacationInfo.vacationYearlyPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vacationAccrualStartDate, vacationYearlyPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrisDirectEmployeeVacationInfo {\n");
    sb.append("    vacationAccrualStartDate: ").append(toIndentedString(vacationAccrualStartDate)).append("\n");
    sb.append("    vacationYearlyPolicy: ").append(toIndentedString(vacationYearlyPolicy)).append("\n");
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
    openapiFields.add("vacation_accrual_start_date");
    openapiFields.add("vacation_yearly_policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vacation_accrual_start_date");
    openapiRequiredFields.add("vacation_yearly_policy");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HrisDirectEmployeeVacationInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisDirectEmployeeVacationInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisDirectEmployeeVacationInfo is not found in the empty JSON string", HrisDirectEmployeeVacationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisDirectEmployeeVacationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisDirectEmployeeVacationInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisDirectEmployeeVacationInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrisDirectEmployeeVacationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisDirectEmployeeVacationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisDirectEmployeeVacationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisDirectEmployeeVacationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisDirectEmployeeVacationInfo>() {
           @Override
           public void write(JsonWriter out, HrisDirectEmployeeVacationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisDirectEmployeeVacationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisDirectEmployeeVacationInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisDirectEmployeeVacationInfo
   * @throws IOException if the JSON string is invalid with respect to HrisDirectEmployeeVacationInfo
   */
  public static HrisDirectEmployeeVacationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisDirectEmployeeVacationInfo.class);
  }

  /**
   * Convert an instance of HrisDirectEmployeeVacationInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

