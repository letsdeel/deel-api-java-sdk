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
import org.openapitools.client.model.GetBenefitPaystubs200ResponseDataInnerEmployeesInnerContributionsInner;
import org.openapitools.client.model.GetBenefitPaystubs200ResponseDataInnerEmployeesInnerEmployerContributionsInner;
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
 * GetBenefitPaystubs200ResponseDataInnerEmployeesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitPaystubs200ResponseDataInnerEmployeesInner {
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
  private String hoursWorked;

  public static final String SERIALIZED_NAME_CONTRIBUTIONS = "contributions";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTIONS)
  @javax.annotation.Nullable
  private List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerContributionsInner> contributions = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMPLOYER_CONTRIBUTIONS = "employerContributions";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CONTRIBUTIONS)
  @javax.annotation.Nullable
  private List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerEmployerContributionsInner> employerContributions = new ArrayList<>();

  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner() {
  }

  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner grossPay(@javax.annotation.Nullable BigDecimal grossPay) {
    this.grossPay = grossPay;
    return this;
  }

  /**
   * Gross pay.
   * @return grossPay
   */
  @javax.annotation.Nullable
  public BigDecimal getGrossPay() {
    return grossPay;
  }

  public void setGrossPay(@javax.annotation.Nullable BigDecimal grossPay) {
    this.grossPay = grossPay;
  }


  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * The contract id.
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner employeeId(@javax.annotation.Nullable String employeeId) {
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


  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner hoursWorked(@javax.annotation.Nullable String hoursWorked) {
    this.hoursWorked = hoursWorked;
    return this;
  }

  /**
   * The worked hours.
   * @return hoursWorked
   */
  @javax.annotation.Nullable
  public String getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(@javax.annotation.Nullable String hoursWorked) {
    this.hoursWorked = hoursWorked;
  }


  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner contributions(@javax.annotation.Nullable List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerContributionsInner> contributions) {
    this.contributions = contributions;
    return this;
  }

  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner addContributionsItem(GetBenefitPaystubs200ResponseDataInnerEmployeesInnerContributionsInner contributionsItem) {
    if (this.contributions == null) {
      this.contributions = new ArrayList<>();
    }
    this.contributions.add(contributionsItem);
    return this;
  }

  /**
   * List of employee&#39;s contributions.
   * @return contributions
   */
  @javax.annotation.Nullable
  public List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerContributionsInner> getContributions() {
    return contributions;
  }

  public void setContributions(@javax.annotation.Nullable List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerContributionsInner> contributions) {
    this.contributions = contributions;
  }


  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner employerContributions(@javax.annotation.Nullable List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerEmployerContributionsInner> employerContributions) {
    this.employerContributions = employerContributions;
    return this;
  }

  public GetBenefitPaystubs200ResponseDataInnerEmployeesInner addEmployerContributionsItem(GetBenefitPaystubs200ResponseDataInnerEmployeesInnerEmployerContributionsInner employerContributionsItem) {
    if (this.employerContributions == null) {
      this.employerContributions = new ArrayList<>();
    }
    this.employerContributions.add(employerContributionsItem);
    return this;
  }

  /**
   * List of employeer&#39;s contributions.
   * @return employerContributions
   */
  @javax.annotation.Nullable
  public List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerEmployerContributionsInner> getEmployerContributions() {
    return employerContributions;
  }

  public void setEmployerContributions(@javax.annotation.Nullable List<GetBenefitPaystubs200ResponseDataInnerEmployeesInnerEmployerContributionsInner> employerContributions) {
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
    GetBenefitPaystubs200ResponseDataInnerEmployeesInner getBenefitPaystubs200ResponseDataInnerEmployeesInner = (GetBenefitPaystubs200ResponseDataInnerEmployeesInner) o;
    return Objects.equals(this.grossPay, getBenefitPaystubs200ResponseDataInnerEmployeesInner.grossPay) &&
        Objects.equals(this.contractId, getBenefitPaystubs200ResponseDataInnerEmployeesInner.contractId) &&
        Objects.equals(this.employeeId, getBenefitPaystubs200ResponseDataInnerEmployeesInner.employeeId) &&
        Objects.equals(this.hoursWorked, getBenefitPaystubs200ResponseDataInnerEmployeesInner.hoursWorked) &&
        Objects.equals(this.contributions, getBenefitPaystubs200ResponseDataInnerEmployeesInner.contributions) &&
        Objects.equals(this.employerContributions, getBenefitPaystubs200ResponseDataInnerEmployeesInner.employerContributions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossPay, contractId, employeeId, hoursWorked, contributions, employerContributions);
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
    sb.append("class GetBenefitPaystubs200ResponseDataInnerEmployeesInner {\n");
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
    openapiFields.add("employerContributions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitPaystubs200ResponseDataInnerEmployeesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitPaystubs200ResponseDataInnerEmployeesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitPaystubs200ResponseDataInnerEmployeesInner is not found in the empty JSON string", GetBenefitPaystubs200ResponseDataInnerEmployeesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitPaystubs200ResponseDataInnerEmployeesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitPaystubs200ResponseDataInnerEmployeesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonNull()) && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if ((jsonObj.get("hours_worked") != null && !jsonObj.get("hours_worked").isJsonNull()) && !jsonObj.get("hours_worked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hours_worked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hours_worked").toString()));
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
            GetBenefitPaystubs200ResponseDataInnerEmployeesInnerContributionsInner.validateJsonElement(jsonArraycontributions.get(i));
          };
        }
      }
      if (jsonObj.get("employerContributions") != null && !jsonObj.get("employerContributions").isJsonNull()) {
        JsonArray jsonArrayemployerContributions = jsonObj.getAsJsonArray("employerContributions");
        if (jsonArrayemployerContributions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employerContributions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employerContributions` to be an array in the JSON string but got `%s`", jsonObj.get("employerContributions").toString()));
          }

          // validate the optional field `employerContributions` (array)
          for (int i = 0; i < jsonArrayemployerContributions.size(); i++) {
            GetBenefitPaystubs200ResponseDataInnerEmployeesInnerEmployerContributionsInner.validateJsonElement(jsonArrayemployerContributions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBenefitPaystubs200ResponseDataInnerEmployeesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitPaystubs200ResponseDataInnerEmployeesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitPaystubs200ResponseDataInnerEmployeesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitPaystubs200ResponseDataInnerEmployeesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitPaystubs200ResponseDataInnerEmployeesInner>() {
           @Override
           public void write(JsonWriter out, GetBenefitPaystubs200ResponseDataInnerEmployeesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitPaystubs200ResponseDataInnerEmployeesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitPaystubs200ResponseDataInnerEmployeesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitPaystubs200ResponseDataInnerEmployeesInner
   * @throws IOException if the JSON string is invalid with respect to GetBenefitPaystubs200ResponseDataInnerEmployeesInner
   */
  public static GetBenefitPaystubs200ResponseDataInnerEmployeesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitPaystubs200ResponseDataInnerEmployeesInner.class);
  }

  /**
   * Convert an instance of GetBenefitPaystubs200ResponseDataInnerEmployeesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

