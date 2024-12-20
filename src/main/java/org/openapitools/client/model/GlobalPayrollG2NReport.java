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
 * GlobalPayrollG2NReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class GlobalPayrollG2NReport {
  public static final String SERIALIZED_NAME_NET_PAY = "net_pay";
  @SerializedName(SERIALIZED_NAME_NET_PAY)
  @javax.annotation.Nullable
  private String netPay;

  public static final String SERIALIZED_NAME_EE_LOANS = "ee_loans";
  @SerializedName(SERIALIZED_NAME_EE_LOANS)
  @javax.annotation.Nullable
  private String eeLoans;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_ANNUAL_BONUS = "annual_bonus";
  @SerializedName(SERIALIZED_NAME_ANNUAL_BONUS)
  @javax.annotation.Nullable
  private BigDecimal annualBonus;

  public static final String SERIALIZED_NAME_CAR_ALLOWANCE = "car_allowance";
  @SerializedName(SERIALIZED_NAME_CAR_ALLOWANCE)
  @javax.annotation.Nullable
  private BigDecimal carAllowance;

  public static final String SERIALIZED_NAME_ESP_DEDUCTION = "esp_deduction";
  @SerializedName(SERIALIZED_NAME_ESP_DEDUCTION)
  @javax.annotation.Nullable
  private BigDecimal espDeduction;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "employee_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  @javax.annotation.Nullable
  private String employeeName;

  public static final String SERIALIZED_NAME_EMPLOYER_COST = "employer_cost";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COST)
  @javax.annotation.Nullable
  private String employerCost;

  public static final String SERIALIZED_NAME_FUNDING_AMOUNT = "funding_amount";
  @SerializedName(SERIALIZED_NAME_FUNDING_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal fundingAmount;

  public static final String SERIALIZED_NAME_HOME_ALLOWANCE = "home_allowance";
  @SerializedName(SERIALIZED_NAME_HOME_ALLOWANCE)
  @javax.annotation.Nullable
  private String homeAllowance;

  public static final String SERIALIZED_NAME_EE_INCOME_TAX = "ee_income_tax";
  @SerializedName(SERIALIZED_NAME_EE_INCOME_TAX)
  @javax.annotation.Nullable
  private String eeIncomeTax;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  @javax.annotation.Nullable
  private BigDecimal employeeNumber;

  public static final String SERIALIZED_NAME_BACKDATED_SALARY = "backdated_salary";
  @SerializedName(SERIALIZED_NAME_BACKDATED_SALARY)
  @javax.annotation.Nullable
  private String backdatedSalary;

  public static final String SERIALIZED_NAME_EMPLOYER_CONTRIBUTION = "employer_contribution";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CONTRIBUTION)
  @javax.annotation.Nullable
  private String employerContribution;

  public static final String SERIALIZED_NAME_ER_OCCUPATIONAL_RISK = "er_occupational_risk";
  @SerializedName(SERIALIZED_NAME_ER_OCCUPATIONAL_RISK)
  @javax.annotation.Nullable
  private String erOccupationalRisk;

  public static final String SERIALIZED_NAME_EMPLOYMENT_STATUS_TAG_INTERNAL = "employment_status_tag_internal";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_STATUS_TAG_INTERNAL)
  @javax.annotation.Nullable
  private String employmentStatusTagInternal;

  public static final String SERIALIZED_NAME_EMPLOYEE_JOB_TITLE = "employee_job_title";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_JOB_TITLE)
  @javax.annotation.Nullable
  private String employeeJobTitle;

  public static final String SERIALIZED_NAME_EMPLOYEE_DIVISION = "employee_division";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_DIVISION)
  @javax.annotation.Nullable
  private String employeeDivision;

  public static final String SERIALIZED_NAME_EMPLOYEE_DEPARTMENT = "employee_department";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_DEPARTMENT)
  @javax.annotation.Nullable
  private String employeeDepartment;

  public static final String SERIALIZED_NAME_PENSION_CONTRIBUTION = "pension_contribution";
  @SerializedName(SERIALIZED_NAME_PENSION_CONTRIBUTION)
  @javax.annotation.Nullable
  private BigDecimal pensionContribution;

  public static final String SERIALIZED_NAME_COST_CENTER = "cost_center";
  @SerializedName(SERIALIZED_NAME_COST_CENTER)
  @javax.annotation.Nullable
  private String costCenter;

  public GlobalPayrollG2NReport() {
  }

  public GlobalPayrollG2NReport netPay(@javax.annotation.Nullable String netPay) {
    this.netPay = netPay;
    return this;
  }

  /**
   * Get netPay
   * @return netPay
   */
  @javax.annotation.Nullable
  public String getNetPay() {
    return netPay;
  }

  public void setNetPay(@javax.annotation.Nullable String netPay) {
    this.netPay = netPay;
  }


  public GlobalPayrollG2NReport eeLoans(@javax.annotation.Nullable String eeLoans) {
    this.eeLoans = eeLoans;
    return this;
  }

  /**
   * Get eeLoans
   * @return eeLoans
   */
  @javax.annotation.Nullable
  public String getEeLoans() {
    return eeLoans;
  }

  public void setEeLoans(@javax.annotation.Nullable String eeLoans) {
    this.eeLoans = eeLoans;
  }


  public GlobalPayrollG2NReport contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public GlobalPayrollG2NReport annualBonus(@javax.annotation.Nullable BigDecimal annualBonus) {
    this.annualBonus = annualBonus;
    return this;
  }

  /**
   * Get annualBonus
   * @return annualBonus
   */
  @javax.annotation.Nullable
  public BigDecimal getAnnualBonus() {
    return annualBonus;
  }

  public void setAnnualBonus(@javax.annotation.Nullable BigDecimal annualBonus) {
    this.annualBonus = annualBonus;
  }


  public GlobalPayrollG2NReport carAllowance(@javax.annotation.Nullable BigDecimal carAllowance) {
    this.carAllowance = carAllowance;
    return this;
  }

  /**
   * Get carAllowance
   * @return carAllowance
   */
  @javax.annotation.Nullable
  public BigDecimal getCarAllowance() {
    return carAllowance;
  }

  public void setCarAllowance(@javax.annotation.Nullable BigDecimal carAllowance) {
    this.carAllowance = carAllowance;
  }


  public GlobalPayrollG2NReport espDeduction(@javax.annotation.Nullable BigDecimal espDeduction) {
    this.espDeduction = espDeduction;
    return this;
  }

  /**
   * Get espDeduction
   * @return espDeduction
   */
  @javax.annotation.Nullable
  public BigDecimal getEspDeduction() {
    return espDeduction;
  }

  public void setEspDeduction(@javax.annotation.Nullable BigDecimal espDeduction) {
    this.espDeduction = espDeduction;
  }


  public GlobalPayrollG2NReport employeeName(@javax.annotation.Nullable String employeeName) {
    this.employeeName = employeeName;
    return this;
  }

  /**
   * Get employeeName
   * @return employeeName
   */
  @javax.annotation.Nullable
  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(@javax.annotation.Nullable String employeeName) {
    this.employeeName = employeeName;
  }


  public GlobalPayrollG2NReport employerCost(@javax.annotation.Nullable String employerCost) {
    this.employerCost = employerCost;
    return this;
  }

  /**
   * Get employerCost
   * @return employerCost
   */
  @javax.annotation.Nullable
  public String getEmployerCost() {
    return employerCost;
  }

  public void setEmployerCost(@javax.annotation.Nullable String employerCost) {
    this.employerCost = employerCost;
  }


  public GlobalPayrollG2NReport fundingAmount(@javax.annotation.Nullable BigDecimal fundingAmount) {
    this.fundingAmount = fundingAmount;
    return this;
  }

  /**
   * Get fundingAmount
   * @return fundingAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getFundingAmount() {
    return fundingAmount;
  }

  public void setFundingAmount(@javax.annotation.Nullable BigDecimal fundingAmount) {
    this.fundingAmount = fundingAmount;
  }


  public GlobalPayrollG2NReport homeAllowance(@javax.annotation.Nullable String homeAllowance) {
    this.homeAllowance = homeAllowance;
    return this;
  }

  /**
   * Get homeAllowance
   * @return homeAllowance
   */
  @javax.annotation.Nullable
  public String getHomeAllowance() {
    return homeAllowance;
  }

  public void setHomeAllowance(@javax.annotation.Nullable String homeAllowance) {
    this.homeAllowance = homeAllowance;
  }


  public GlobalPayrollG2NReport eeIncomeTax(@javax.annotation.Nullable String eeIncomeTax) {
    this.eeIncomeTax = eeIncomeTax;
    return this;
  }

  /**
   * Get eeIncomeTax
   * @return eeIncomeTax
   */
  @javax.annotation.Nullable
  public String getEeIncomeTax() {
    return eeIncomeTax;
  }

  public void setEeIncomeTax(@javax.annotation.Nullable String eeIncomeTax) {
    this.eeIncomeTax = eeIncomeTax;
  }


  public GlobalPayrollG2NReport employeeNumber(@javax.annotation.Nullable BigDecimal employeeNumber) {
    this.employeeNumber = employeeNumber;
    return this;
  }

  /**
   * Get employeeNumber
   * @return employeeNumber
   */
  @javax.annotation.Nullable
  public BigDecimal getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(@javax.annotation.Nullable BigDecimal employeeNumber) {
    this.employeeNumber = employeeNumber;
  }


  public GlobalPayrollG2NReport backdatedSalary(@javax.annotation.Nullable String backdatedSalary) {
    this.backdatedSalary = backdatedSalary;
    return this;
  }

  /**
   * Get backdatedSalary
   * @return backdatedSalary
   */
  @javax.annotation.Nullable
  public String getBackdatedSalary() {
    return backdatedSalary;
  }

  public void setBackdatedSalary(@javax.annotation.Nullable String backdatedSalary) {
    this.backdatedSalary = backdatedSalary;
  }


  public GlobalPayrollG2NReport employerContribution(@javax.annotation.Nullable String employerContribution) {
    this.employerContribution = employerContribution;
    return this;
  }

  /**
   * Get employerContribution
   * @return employerContribution
   */
  @javax.annotation.Nullable
  public String getEmployerContribution() {
    return employerContribution;
  }

  public void setEmployerContribution(@javax.annotation.Nullable String employerContribution) {
    this.employerContribution = employerContribution;
  }


  public GlobalPayrollG2NReport erOccupationalRisk(@javax.annotation.Nullable String erOccupationalRisk) {
    this.erOccupationalRisk = erOccupationalRisk;
    return this;
  }

  /**
   * Get erOccupationalRisk
   * @return erOccupationalRisk
   */
  @javax.annotation.Nullable
  public String getErOccupationalRisk() {
    return erOccupationalRisk;
  }

  public void setErOccupationalRisk(@javax.annotation.Nullable String erOccupationalRisk) {
    this.erOccupationalRisk = erOccupationalRisk;
  }


  public GlobalPayrollG2NReport employmentStatusTagInternal(@javax.annotation.Nullable String employmentStatusTagInternal) {
    this.employmentStatusTagInternal = employmentStatusTagInternal;
    return this;
  }

  /**
   * Get employmentStatusTagInternal
   * @return employmentStatusTagInternal
   */
  @javax.annotation.Nullable
  public String getEmploymentStatusTagInternal() {
    return employmentStatusTagInternal;
  }

  public void setEmploymentStatusTagInternal(@javax.annotation.Nullable String employmentStatusTagInternal) {
    this.employmentStatusTagInternal = employmentStatusTagInternal;
  }


  public GlobalPayrollG2NReport employeeJobTitle(@javax.annotation.Nullable String employeeJobTitle) {
    this.employeeJobTitle = employeeJobTitle;
    return this;
  }

  /**
   * Get employeeJobTitle
   * @return employeeJobTitle
   */
  @javax.annotation.Nullable
  public String getEmployeeJobTitle() {
    return employeeJobTitle;
  }

  public void setEmployeeJobTitle(@javax.annotation.Nullable String employeeJobTitle) {
    this.employeeJobTitle = employeeJobTitle;
  }


  public GlobalPayrollG2NReport employeeDivision(@javax.annotation.Nullable String employeeDivision) {
    this.employeeDivision = employeeDivision;
    return this;
  }

  /**
   * Get employeeDivision
   * @return employeeDivision
   */
  @javax.annotation.Nullable
  public String getEmployeeDivision() {
    return employeeDivision;
  }

  public void setEmployeeDivision(@javax.annotation.Nullable String employeeDivision) {
    this.employeeDivision = employeeDivision;
  }


  public GlobalPayrollG2NReport employeeDepartment(@javax.annotation.Nullable String employeeDepartment) {
    this.employeeDepartment = employeeDepartment;
    return this;
  }

  /**
   * Get employeeDepartment
   * @return employeeDepartment
   */
  @javax.annotation.Nullable
  public String getEmployeeDepartment() {
    return employeeDepartment;
  }

  public void setEmployeeDepartment(@javax.annotation.Nullable String employeeDepartment) {
    this.employeeDepartment = employeeDepartment;
  }


  public GlobalPayrollG2NReport pensionContribution(@javax.annotation.Nullable BigDecimal pensionContribution) {
    this.pensionContribution = pensionContribution;
    return this;
  }

  /**
   * Get pensionContribution
   * @return pensionContribution
   */
  @javax.annotation.Nullable
  public BigDecimal getPensionContribution() {
    return pensionContribution;
  }

  public void setPensionContribution(@javax.annotation.Nullable BigDecimal pensionContribution) {
    this.pensionContribution = pensionContribution;
  }


  public GlobalPayrollG2NReport costCenter(@javax.annotation.Nullable String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

  /**
   * Get costCenter
   * @return costCenter
   */
  @javax.annotation.Nullable
  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(@javax.annotation.Nullable String costCenter) {
    this.costCenter = costCenter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalPayrollG2NReport globalPayrollG2NReport = (GlobalPayrollG2NReport) o;
    return Objects.equals(this.netPay, globalPayrollG2NReport.netPay) &&
        Objects.equals(this.eeLoans, globalPayrollG2NReport.eeLoans) &&
        Objects.equals(this.contractId, globalPayrollG2NReport.contractId) &&
        Objects.equals(this.annualBonus, globalPayrollG2NReport.annualBonus) &&
        Objects.equals(this.carAllowance, globalPayrollG2NReport.carAllowance) &&
        Objects.equals(this.espDeduction, globalPayrollG2NReport.espDeduction) &&
        Objects.equals(this.employeeName, globalPayrollG2NReport.employeeName) &&
        Objects.equals(this.employerCost, globalPayrollG2NReport.employerCost) &&
        Objects.equals(this.fundingAmount, globalPayrollG2NReport.fundingAmount) &&
        Objects.equals(this.homeAllowance, globalPayrollG2NReport.homeAllowance) &&
        Objects.equals(this.eeIncomeTax, globalPayrollG2NReport.eeIncomeTax) &&
        Objects.equals(this.employeeNumber, globalPayrollG2NReport.employeeNumber) &&
        Objects.equals(this.backdatedSalary, globalPayrollG2NReport.backdatedSalary) &&
        Objects.equals(this.employerContribution, globalPayrollG2NReport.employerContribution) &&
        Objects.equals(this.erOccupationalRisk, globalPayrollG2NReport.erOccupationalRisk) &&
        Objects.equals(this.employmentStatusTagInternal, globalPayrollG2NReport.employmentStatusTagInternal) &&
        Objects.equals(this.employeeJobTitle, globalPayrollG2NReport.employeeJobTitle) &&
        Objects.equals(this.employeeDivision, globalPayrollG2NReport.employeeDivision) &&
        Objects.equals(this.employeeDepartment, globalPayrollG2NReport.employeeDepartment) &&
        Objects.equals(this.pensionContribution, globalPayrollG2NReport.pensionContribution) &&
        Objects.equals(this.costCenter, globalPayrollG2NReport.costCenter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(netPay, eeLoans, contractId, annualBonus, carAllowance, espDeduction, employeeName, employerCost, fundingAmount, homeAllowance, eeIncomeTax, employeeNumber, backdatedSalary, employerContribution, erOccupationalRisk, employmentStatusTagInternal, employeeJobTitle, employeeDivision, employeeDepartment, pensionContribution, costCenter);
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
    sb.append("class GlobalPayrollG2NReport {\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    eeLoans: ").append(toIndentedString(eeLoans)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    annualBonus: ").append(toIndentedString(annualBonus)).append("\n");
    sb.append("    carAllowance: ").append(toIndentedString(carAllowance)).append("\n");
    sb.append("    espDeduction: ").append(toIndentedString(espDeduction)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employerCost: ").append(toIndentedString(employerCost)).append("\n");
    sb.append("    fundingAmount: ").append(toIndentedString(fundingAmount)).append("\n");
    sb.append("    homeAllowance: ").append(toIndentedString(homeAllowance)).append("\n");
    sb.append("    eeIncomeTax: ").append(toIndentedString(eeIncomeTax)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    backdatedSalary: ").append(toIndentedString(backdatedSalary)).append("\n");
    sb.append("    employerContribution: ").append(toIndentedString(employerContribution)).append("\n");
    sb.append("    erOccupationalRisk: ").append(toIndentedString(erOccupationalRisk)).append("\n");
    sb.append("    employmentStatusTagInternal: ").append(toIndentedString(employmentStatusTagInternal)).append("\n");
    sb.append("    employeeJobTitle: ").append(toIndentedString(employeeJobTitle)).append("\n");
    sb.append("    employeeDivision: ").append(toIndentedString(employeeDivision)).append("\n");
    sb.append("    employeeDepartment: ").append(toIndentedString(employeeDepartment)).append("\n");
    sb.append("    pensionContribution: ").append(toIndentedString(pensionContribution)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
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
    openapiFields.add("net_pay");
    openapiFields.add("ee_loans");
    openapiFields.add("contract_id");
    openapiFields.add("annual_bonus");
    openapiFields.add("car_allowance");
    openapiFields.add("esp_deduction");
    openapiFields.add("employee_name");
    openapiFields.add("employer_cost");
    openapiFields.add("funding_amount");
    openapiFields.add("home_allowance");
    openapiFields.add("ee_income_tax");
    openapiFields.add("employee_number");
    openapiFields.add("backdated_salary");
    openapiFields.add("employer_contribution");
    openapiFields.add("er_occupational_risk");
    openapiFields.add("employment_status_tag_internal");
    openapiFields.add("employee_job_title");
    openapiFields.add("employee_division");
    openapiFields.add("employee_department");
    openapiFields.add("pension_contribution");
    openapiFields.add("cost_center");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GlobalPayrollG2NReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GlobalPayrollG2NReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalPayrollG2NReport is not found in the empty JSON string", GlobalPayrollG2NReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalPayrollG2NReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalPayrollG2NReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("net_pay") != null && !jsonObj.get("net_pay").isJsonNull()) && !jsonObj.get("net_pay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `net_pay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("net_pay").toString()));
      }
      if ((jsonObj.get("ee_loans") != null && !jsonObj.get("ee_loans").isJsonNull()) && !jsonObj.get("ee_loans").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ee_loans` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ee_loans").toString()));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("employee_name") != null && !jsonObj.get("employee_name").isJsonNull()) && !jsonObj.get("employee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_name").toString()));
      }
      if ((jsonObj.get("employer_cost") != null && !jsonObj.get("employer_cost").isJsonNull()) && !jsonObj.get("employer_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_cost").toString()));
      }
      if ((jsonObj.get("home_allowance") != null && !jsonObj.get("home_allowance").isJsonNull()) && !jsonObj.get("home_allowance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `home_allowance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("home_allowance").toString()));
      }
      if ((jsonObj.get("ee_income_tax") != null && !jsonObj.get("ee_income_tax").isJsonNull()) && !jsonObj.get("ee_income_tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ee_income_tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ee_income_tax").toString()));
      }
      if ((jsonObj.get("backdated_salary") != null && !jsonObj.get("backdated_salary").isJsonNull()) && !jsonObj.get("backdated_salary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backdated_salary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backdated_salary").toString()));
      }
      if ((jsonObj.get("employer_contribution") != null && !jsonObj.get("employer_contribution").isJsonNull()) && !jsonObj.get("employer_contribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_contribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_contribution").toString()));
      }
      if ((jsonObj.get("er_occupational_risk") != null && !jsonObj.get("er_occupational_risk").isJsonNull()) && !jsonObj.get("er_occupational_risk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `er_occupational_risk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("er_occupational_risk").toString()));
      }
      if ((jsonObj.get("employment_status_tag_internal") != null && !jsonObj.get("employment_status_tag_internal").isJsonNull()) && !jsonObj.get("employment_status_tag_internal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_status_tag_internal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_status_tag_internal").toString()));
      }
      if ((jsonObj.get("employee_job_title") != null && !jsonObj.get("employee_job_title").isJsonNull()) && !jsonObj.get("employee_job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_job_title").toString()));
      }
      if ((jsonObj.get("employee_division") != null && !jsonObj.get("employee_division").isJsonNull()) && !jsonObj.get("employee_division").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_division` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_division").toString()));
      }
      if ((jsonObj.get("employee_department") != null && !jsonObj.get("employee_department").isJsonNull()) && !jsonObj.get("employee_department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_department").toString()));
      }
      if ((jsonObj.get("cost_center") != null && !jsonObj.get("cost_center").isJsonNull()) && !jsonObj.get("cost_center").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cost_center` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cost_center").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalPayrollG2NReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalPayrollG2NReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalPayrollG2NReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalPayrollG2NReport.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalPayrollG2NReport>() {
           @Override
           public void write(JsonWriter out, GlobalPayrollG2NReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalPayrollG2NReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GlobalPayrollG2NReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GlobalPayrollG2NReport
   * @throws IOException if the JSON string is invalid with respect to GlobalPayrollG2NReport
   */
  public static GlobalPayrollG2NReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalPayrollG2NReport.class);
  }

  /**
   * Convert an instance of GlobalPayrollG2NReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

