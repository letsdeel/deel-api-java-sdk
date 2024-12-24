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
import org.openapitools.client.model.GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner;
import org.openapitools.client.model.GetPayStub200ResponseDataInnerEmployeesInnerEmployerContributionsInner;

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
 * GetPayStub200ResponseDataInnerEmployeesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPayStub200ResponseDataInnerEmployeesInner {
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
  private String employeeId;

  public static final String SERIALIZED_NAME_HOURS_WORKED = "hours_worked";
  @SerializedName(SERIALIZED_NAME_HOURS_WORKED)
  @javax.annotation.Nullable
  private BigDecimal hoursWorked;

  public static final String SERIALIZED_NAME_CONTRIBUTIONS = "contributions";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTIONS)
  @javax.annotation.Nullable
  private List<GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner> contributions = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMPLOYER_CONTRIBUTIONS = "employer_contributions";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CONTRIBUTIONS)
  @javax.annotation.Nullable
  private List<GetPayStub200ResponseDataInnerEmployeesInnerEmployerContributionsInner> employerContributions = new ArrayList<>();

  public GetPayStub200ResponseDataInnerEmployeesInner() {
  }

  public GetPayStub200ResponseDataInnerEmployeesInner grossPay(@javax.annotation.Nullable BigDecimal grossPay) {
    this.grossPay = grossPay;
    return this;
  }

  /**
   * Total gross pay for the employee for this payroll period.
   * @return grossPay
   */
  @javax.annotation.Nullable
  public BigDecimal getGrossPay() {
    return grossPay;
  }

  public void setGrossPay(@javax.annotation.Nullable BigDecimal grossPay) {
    this.grossPay = grossPay;
  }


  public GetPayStub200ResponseDataInnerEmployeesInner contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Identifier for the employee contract.
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public GetPayStub200ResponseDataInnerEmployeesInner employeeId(@javax.annotation.Nullable String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Unique identifier for the employee.
   * @return employeeId
   */
  @javax.annotation.Nullable
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(@javax.annotation.Nullable String employeeId) {
    this.employeeId = employeeId;
  }


  public GetPayStub200ResponseDataInnerEmployeesInner hoursWorked(@javax.annotation.Nullable BigDecimal hoursWorked) {
    this.hoursWorked = hoursWorked;
    return this;
  }

  /**
   * Total hours worked by the employee in this payroll period.
   * @return hoursWorked
   */
  @javax.annotation.Nullable
  public BigDecimal getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(@javax.annotation.Nullable BigDecimal hoursWorked) {
    this.hoursWorked = hoursWorked;
  }


  public GetPayStub200ResponseDataInnerEmployeesInner contributions(@javax.annotation.Nullable List<GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner> contributions) {
    this.contributions = contributions;
    return this;
  }

  public GetPayStub200ResponseDataInnerEmployeesInner addContributionsItem(GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner contributionsItem) {
    if (this.contributions == null) {
      this.contributions = new ArrayList<>();
    }
    this.contributions.add(contributionsItem);
    return this;
  }

  /**
   * List of contributions made by the employee.
   * @return contributions
   */
  @javax.annotation.Nullable
  public List<GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner> getContributions() {
    return contributions;
  }

  public void setContributions(@javax.annotation.Nullable List<GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner> contributions) {
    this.contributions = contributions;
  }


  public GetPayStub200ResponseDataInnerEmployeesInner employerContributions(@javax.annotation.Nullable List<GetPayStub200ResponseDataInnerEmployeesInnerEmployerContributionsInner> employerContributions) {
    this.employerContributions = employerContributions;
    return this;
  }

  public GetPayStub200ResponseDataInnerEmployeesInner addEmployerContributionsItem(GetPayStub200ResponseDataInnerEmployeesInnerEmployerContributionsInner employerContributionsItem) {
    if (this.employerContributions == null) {
      this.employerContributions = new ArrayList<>();
    }
    this.employerContributions.add(employerContributionsItem);
    return this;
  }

  /**
   * List of contributions made by the employer.
   * @return employerContributions
   */
  @javax.annotation.Nullable
  public List<GetPayStub200ResponseDataInnerEmployeesInnerEmployerContributionsInner> getEmployerContributions() {
    return employerContributions;
  }

  public void setEmployerContributions(@javax.annotation.Nullable List<GetPayStub200ResponseDataInnerEmployeesInnerEmployerContributionsInner> employerContributions) {
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
    GetPayStub200ResponseDataInnerEmployeesInner getPayStub200ResponseDataInnerEmployeesInner = (GetPayStub200ResponseDataInnerEmployeesInner) o;
    return Objects.equals(this.grossPay, getPayStub200ResponseDataInnerEmployeesInner.grossPay) &&
        Objects.equals(this.contractId, getPayStub200ResponseDataInnerEmployeesInner.contractId) &&
        Objects.equals(this.employeeId, getPayStub200ResponseDataInnerEmployeesInner.employeeId) &&
        Objects.equals(this.hoursWorked, getPayStub200ResponseDataInnerEmployeesInner.hoursWorked) &&
        Objects.equals(this.contributions, getPayStub200ResponseDataInnerEmployeesInner.contributions) &&
        Objects.equals(this.employerContributions, getPayStub200ResponseDataInnerEmployeesInner.employerContributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossPay, contractId, employeeId, hoursWorked, contributions, employerContributions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPayStub200ResponseDataInnerEmployeesInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetPayStub200ResponseDataInnerEmployeesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPayStub200ResponseDataInnerEmployeesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPayStub200ResponseDataInnerEmployeesInner is not found in the empty JSON string", GetPayStub200ResponseDataInnerEmployeesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPayStub200ResponseDataInnerEmployeesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPayStub200ResponseDataInnerEmployeesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner.validateJsonElement(jsonArraycontributions.get(i));
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
            GetPayStub200ResponseDataInnerEmployeesInnerEmployerContributionsInner.validateJsonElement(jsonArrayemployerContributions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPayStub200ResponseDataInnerEmployeesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPayStub200ResponseDataInnerEmployeesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPayStub200ResponseDataInnerEmployeesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPayStub200ResponseDataInnerEmployeesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPayStub200ResponseDataInnerEmployeesInner>() {
           @Override
           public void write(JsonWriter out, GetPayStub200ResponseDataInnerEmployeesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPayStub200ResponseDataInnerEmployeesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPayStub200ResponseDataInnerEmployeesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPayStub200ResponseDataInnerEmployeesInner
   * @throws IOException if the JSON string is invalid with respect to GetPayStub200ResponseDataInnerEmployeesInner
   */
  public static GetPayStub200ResponseDataInnerEmployeesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPayStub200ResponseDataInnerEmployeesInner.class);
  }

  /**
   * Convert an instance of GetPayStub200ResponseDataInnerEmployeesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

