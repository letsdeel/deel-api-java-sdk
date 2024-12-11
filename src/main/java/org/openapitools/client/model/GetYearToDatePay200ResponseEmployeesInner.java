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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.GetYearToDatePay200ResponseEmployeesInnerContributionsInner;
import org.openapitools.client.model.GetYearToDatePay200ResponseEmployeesInnerEmployerContributionsInner;

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
 * GetYearToDatePay200ResponseEmployeesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class GetYearToDatePay200ResponseEmployeesInner {
  public static final String SERIALIZED_NAME_GROSS_PAY = "gross_pay";
  @SerializedName(SERIALIZED_NAME_GROSS_PAY)
  @javax.annotation.Nullable
  private BigDecimal grossPay;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  @javax.annotation.Nullable
  private UUID employeeId;

  public static final String SERIALIZED_NAME_HOURS_WORKED = "hours_worked";
  @SerializedName(SERIALIZED_NAME_HOURS_WORKED)
  @javax.annotation.Nullable
  private BigDecimal hoursWorked;

  public static final String SERIALIZED_NAME_CONTRIBUTIONS = "contributions";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTIONS)
  @javax.annotation.Nullable
  private List<GetYearToDatePay200ResponseEmployeesInnerContributionsInner> contributions = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMPLOYER_CONTRIBUTIONS = "employer_contributions";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CONTRIBUTIONS)
  @javax.annotation.Nullable
  private List<GetYearToDatePay200ResponseEmployeesInnerEmployerContributionsInner> employerContributions = new ArrayList<>();

  public GetYearToDatePay200ResponseEmployeesInner() {
  }

  public GetYearToDatePay200ResponseEmployeesInner grossPay(@javax.annotation.Nullable BigDecimal grossPay) {
    this.grossPay = grossPay;
    return this;
  }

  /**
   * Total pay before deductions.
   * @return grossPay
   */
  @javax.annotation.Nullable
  public BigDecimal getGrossPay() {
    return grossPay;
  }

  public void setGrossPay(@javax.annotation.Nullable BigDecimal grossPay) {
    this.grossPay = grossPay;
  }


  public GetYearToDatePay200ResponseEmployeesInner contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Identifier for the employee&#39;s contract.
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public GetYearToDatePay200ResponseEmployeesInner employeeId(@javax.annotation.Nullable UUID employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Unique identifier for the employee.
   * @return employeeId
   */
  @javax.annotation.Nullable
  public UUID getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(@javax.annotation.Nullable UUID employeeId) {
    this.employeeId = employeeId;
  }


  public GetYearToDatePay200ResponseEmployeesInner hoursWorked(@javax.annotation.Nullable BigDecimal hoursWorked) {
    this.hoursWorked = hoursWorked;
    return this;
  }

  /**
   * Total hours worked in the pay period.
   * @return hoursWorked
   */
  @javax.annotation.Nullable
  public BigDecimal getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(@javax.annotation.Nullable BigDecimal hoursWorked) {
    this.hoursWorked = hoursWorked;
  }


  public GetYearToDatePay200ResponseEmployeesInner contributions(@javax.annotation.Nullable List<GetYearToDatePay200ResponseEmployeesInnerContributionsInner> contributions) {
    this.contributions = contributions;
    return this;
  }

  public GetYearToDatePay200ResponseEmployeesInner addContributionsItem(GetYearToDatePay200ResponseEmployeesInnerContributionsInner contributionsItem) {
    if (this.contributions == null) {
      this.contributions = new ArrayList<>();
    }
    this.contributions.add(contributionsItem);
    return this;
  }

  /**
   * Get contributions
   * @return contributions
   */
  @javax.annotation.Nullable
  public List<GetYearToDatePay200ResponseEmployeesInnerContributionsInner> getContributions() {
    return contributions;
  }

  public void setContributions(@javax.annotation.Nullable List<GetYearToDatePay200ResponseEmployeesInnerContributionsInner> contributions) {
    this.contributions = contributions;
  }


  public GetYearToDatePay200ResponseEmployeesInner employerContributions(@javax.annotation.Nullable List<GetYearToDatePay200ResponseEmployeesInnerEmployerContributionsInner> employerContributions) {
    this.employerContributions = employerContributions;
    return this;
  }

  public GetYearToDatePay200ResponseEmployeesInner addEmployerContributionsItem(GetYearToDatePay200ResponseEmployeesInnerEmployerContributionsInner employerContributionsItem) {
    if (this.employerContributions == null) {
      this.employerContributions = new ArrayList<>();
    }
    this.employerContributions.add(employerContributionsItem);
    return this;
  }

  /**
   * Get employerContributions
   * @return employerContributions
   */
  @javax.annotation.Nullable
  public List<GetYearToDatePay200ResponseEmployeesInnerEmployerContributionsInner> getEmployerContributions() {
    return employerContributions;
  }

  public void setEmployerContributions(@javax.annotation.Nullable List<GetYearToDatePay200ResponseEmployeesInnerEmployerContributionsInner> employerContributions) {
    this.employerContributions = employerContributions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetYearToDatePay200ResponseEmployeesInner getYearToDatePay200ResponseEmployeesInner = (GetYearToDatePay200ResponseEmployeesInner) o;
    return Objects.equals(this.grossPay, getYearToDatePay200ResponseEmployeesInner.grossPay) &&
        Objects.equals(this.contractId, getYearToDatePay200ResponseEmployeesInner.contractId) &&
        Objects.equals(this.employeeId, getYearToDatePay200ResponseEmployeesInner.employeeId) &&
        Objects.equals(this.hoursWorked, getYearToDatePay200ResponseEmployeesInner.hoursWorked) &&
        Objects.equals(this.contributions, getYearToDatePay200ResponseEmployeesInner.contributions) &&
        Objects.equals(this.employerContributions, getYearToDatePay200ResponseEmployeesInner.employerContributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossPay, contractId, employeeId, hoursWorked, contributions, employerContributions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetYearToDatePay200ResponseEmployeesInner {\n");
    sb.append("    grossPay: ").append(toIndentedString(grossPay)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    hoursWorked: ").append(toIndentedString(hoursWorked)).append("\n");
    sb.append("    contributions: ").append(toIndentedString(contributions)).append("\n");
    sb.append("    employerContributions: ").append(toIndentedString(employerContributions)).append("\n");
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
    openapiFields.add("gross_pay");
    openapiFields.add("contract_id");
    openapiFields.add("employee_id");
    openapiFields.add("hours_worked");
    openapiFields.add("contributions");
    openapiFields.add("employer_contributions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetYearToDatePay200ResponseEmployeesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetYearToDatePay200ResponseEmployeesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetYearToDatePay200ResponseEmployeesInner is not found in the empty JSON string", GetYearToDatePay200ResponseEmployeesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetYearToDatePay200ResponseEmployeesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetYearToDatePay200ResponseEmployeesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonNull()) && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("contributions") != null && !jsonObj.get("contributions").isJsonNull()) {
        JsonArray jsonArraycontributions = jsonObj.getAsJsonArray("contributions");
        if (jsonArraycontributions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contributions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contributions` to be an array in the JSON string but got `%s`", jsonObj.get("contributions").toString()));
          }

          // validate the optional field `contributions` (array)
          for (int i = 0; i < jsonArraycontributions.size(); i++) {
            GetYearToDatePay200ResponseEmployeesInnerContributionsInner.validateJsonElement(jsonArraycontributions.get(i));
          };
        }
      }
      if (jsonObj.get("employer_contributions") != null && !jsonObj.get("employer_contributions").isJsonNull()) {
        JsonArray jsonArrayemployerContributions = jsonObj.getAsJsonArray("employer_contributions");
        if (jsonArrayemployerContributions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employer_contributions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employer_contributions` to be an array in the JSON string but got `%s`", jsonObj.get("employer_contributions").toString()));
          }

          // validate the optional field `employer_contributions` (array)
          for (int i = 0; i < jsonArrayemployerContributions.size(); i++) {
            GetYearToDatePay200ResponseEmployeesInnerEmployerContributionsInner.validateJsonElement(jsonArrayemployerContributions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetYearToDatePay200ResponseEmployeesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetYearToDatePay200ResponseEmployeesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetYearToDatePay200ResponseEmployeesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetYearToDatePay200ResponseEmployeesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetYearToDatePay200ResponseEmployeesInner>() {
           @Override
           public void write(JsonWriter out, GetYearToDatePay200ResponseEmployeesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetYearToDatePay200ResponseEmployeesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetYearToDatePay200ResponseEmployeesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetYearToDatePay200ResponseEmployeesInner
   * @throws IOException if the JSON string is invalid with respect to GetYearToDatePay200ResponseEmployeesInner
   */
  public static GetYearToDatePay200ResponseEmployeesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetYearToDatePay200ResponseEmployeesInner.class);
  }

  /**
   * Convert an instance of GetYearToDatePay200ResponseEmployeesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

