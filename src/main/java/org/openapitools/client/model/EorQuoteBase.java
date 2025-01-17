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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.BreakdownCostsQuote;
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
 * EOR quote approved by Deel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class EorQuoteBase {
  public static final String SERIALIZED_NAME_ANNUAL_SALARY = "annual_salary";
  @SerializedName(SERIALIZED_NAME_ANNUAL_SALARY)
  @javax.annotation.Nullable
  private BigDecimal annualSalary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_BREAKDOWN_COSTS = "breakdown_costs";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN_COSTS)
  @javax.annotation.Nullable
  private BreakdownCostsQuote breakdownCosts;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL = "severance_accrual_total";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal severanceAccrualTotal;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL_USD = "severance_accrual_total_usd";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal severanceAccrualTotalUsd;

  public static final String SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL = "recurring_allowance_total";
  @SerializedName(SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal recurringAllowanceTotal;

  public static final String SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL_USD = "recurring_allowance_total_usd";
  @SerializedName(SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal recurringAllowanceTotalUsd;

  public static final String SERIALIZED_NAME_SALARY_TOTAL = "salary_total";
  @SerializedName(SERIALIZED_NAME_SALARY_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal salaryTotal;

  public static final String SERIALIZED_NAME_SALARY_TOTAL_USD = "salary_total_usd";
  @SerializedName(SERIALIZED_NAME_SALARY_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal salaryTotalUsd;

  public static final String SERIALIZED_NAME_EMPLOYER_COST_TOTAL = "employer_cost_total";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COST_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal employerCostTotal;

  public static final String SERIALIZED_NAME_EMPLOYER_COST_TOTAL_USD = "employer_cost_total_usd";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COST_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal employerCostTotalUsd;

  public static final String SERIALIZED_NAME_PLATFORM_FEE_TOTAL = "platform_fee_total";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal platformFeeTotal;

  public static final String SERIALIZED_NAME_PLATFORM_FEE_TOTAL_USD = "platform_fee_total_usd";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal platformFeeTotalUsd;

  public static final String SERIALIZED_NAME_MOBILITY_FEE_TOTAL = "mobility_fee_total";
  @SerializedName(SERIALIZED_NAME_MOBILITY_FEE_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal mobilityFeeTotal;

  public static final String SERIALIZED_NAME_MOBILITY_FEE_TOTAL_USD = "mobility_fee_total_usd";
  @SerializedName(SERIALIZED_NAME_MOBILITY_FEE_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal mobilityFeeTotalUsd;

  public static final String SERIALIZED_NAME_MONTHLY_COST_TOTAL = "monthly_cost_total";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal monthlyCostTotal;

  public static final String SERIALIZED_NAME_MONTHLY_COST_TOTAL_USD = "monthly_cost_total_usd";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal monthlyCostTotalUsd;

  public static final String SERIALIZED_NAME_GROSS_SALARY_TOTAL = "gross_salary_total";
  @SerializedName(SERIALIZED_NAME_GROSS_SALARY_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal grossSalaryTotal;

  public static final String SERIALIZED_NAME_GROSS_SALARY_TOTAL_USD = "gross_salary_total_usd";
  @SerializedName(SERIALIZED_NAME_GROSS_SALARY_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal grossSalaryTotalUsd;

  public static final String SERIALIZED_NAME_CBA_TOTAL = "cba_total";
  @SerializedName(SERIALIZED_NAME_CBA_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal cbaTotal;

  public static final String SERIALIZED_NAME_CBA_TOTAL_USD = "cba_total_usd";
  @SerializedName(SERIALIZED_NAME_CBA_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal cbaTotalUsd;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime updatedAt;

  public EorQuoteBase() {
  }

  public EorQuoteBase annualSalary(@javax.annotation.Nullable BigDecimal annualSalary) {
    this.annualSalary = annualSalary;
    return this;
  }

  /**
   * Annual Salary in local currency
   * @return annualSalary
   */
  @javax.annotation.Nullable
  public BigDecimal getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(@javax.annotation.Nullable BigDecimal annualSalary) {
    this.annualSalary = annualSalary;
  }


  public EorQuoteBase currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public EorQuoteBase breakdownCosts(@javax.annotation.Nullable BreakdownCostsQuote breakdownCosts) {
    this.breakdownCosts = breakdownCosts;
    return this;
  }

  /**
   * Get breakdownCosts
   * @return breakdownCosts
   */
  @javax.annotation.Nullable
  public BreakdownCostsQuote getBreakdownCosts() {
    return breakdownCosts;
  }

  public void setBreakdownCosts(@javax.annotation.Nullable BreakdownCostsQuote breakdownCosts) {
    this.breakdownCosts = breakdownCosts;
  }


  public EorQuoteBase severanceAccrualTotal(@javax.annotation.Nullable BigDecimal severanceAccrualTotal) {
    this.severanceAccrualTotal = severanceAccrualTotal;
    return this;
  }

  /**
   * Total severance accrual in local currency
   * @return severanceAccrualTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getSeveranceAccrualTotal() {
    return severanceAccrualTotal;
  }

  public void setSeveranceAccrualTotal(@javax.annotation.Nullable BigDecimal severanceAccrualTotal) {
    this.severanceAccrualTotal = severanceAccrualTotal;
  }


  public EorQuoteBase severanceAccrualTotalUsd(@javax.annotation.Nullable BigDecimal severanceAccrualTotalUsd) {
    this.severanceAccrualTotalUsd = severanceAccrualTotalUsd;
    return this;
  }

  /**
   * Total severance accrual in USD
   * @return severanceAccrualTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getSeveranceAccrualTotalUsd() {
    return severanceAccrualTotalUsd;
  }

  public void setSeveranceAccrualTotalUsd(@javax.annotation.Nullable BigDecimal severanceAccrualTotalUsd) {
    this.severanceAccrualTotalUsd = severanceAccrualTotalUsd;
  }


  public EorQuoteBase recurringAllowanceTotal(@javax.annotation.Nullable BigDecimal recurringAllowanceTotal) {
    this.recurringAllowanceTotal = recurringAllowanceTotal;
    return this;
  }

  /**
   * Total recurring allowance in local currency
   * @return recurringAllowanceTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getRecurringAllowanceTotal() {
    return recurringAllowanceTotal;
  }

  public void setRecurringAllowanceTotal(@javax.annotation.Nullable BigDecimal recurringAllowanceTotal) {
    this.recurringAllowanceTotal = recurringAllowanceTotal;
  }


  public EorQuoteBase recurringAllowanceTotalUsd(@javax.annotation.Nullable BigDecimal recurringAllowanceTotalUsd) {
    this.recurringAllowanceTotalUsd = recurringAllowanceTotalUsd;
    return this;
  }

  /**
   * Total recurring allowance in USD
   * @return recurringAllowanceTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getRecurringAllowanceTotalUsd() {
    return recurringAllowanceTotalUsd;
  }

  public void setRecurringAllowanceTotalUsd(@javax.annotation.Nullable BigDecimal recurringAllowanceTotalUsd) {
    this.recurringAllowanceTotalUsd = recurringAllowanceTotalUsd;
  }


  public EorQuoteBase salaryTotal(@javax.annotation.Nullable BigDecimal salaryTotal) {
    this.salaryTotal = salaryTotal;
    return this;
  }

  /**
   * Total salary in local currency
   * @return salaryTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getSalaryTotal() {
    return salaryTotal;
  }

  public void setSalaryTotal(@javax.annotation.Nullable BigDecimal salaryTotal) {
    this.salaryTotal = salaryTotal;
  }


  public EorQuoteBase salaryTotalUsd(@javax.annotation.Nullable BigDecimal salaryTotalUsd) {
    this.salaryTotalUsd = salaryTotalUsd;
    return this;
  }

  /**
   * Total salary in USD
   * @return salaryTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getSalaryTotalUsd() {
    return salaryTotalUsd;
  }

  public void setSalaryTotalUsd(@javax.annotation.Nullable BigDecimal salaryTotalUsd) {
    this.salaryTotalUsd = salaryTotalUsd;
  }


  public EorQuoteBase employerCostTotal(@javax.annotation.Nullable BigDecimal employerCostTotal) {
    this.employerCostTotal = employerCostTotal;
    return this;
  }

  /**
   * Total employer cost in local currency
   * @return employerCostTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getEmployerCostTotal() {
    return employerCostTotal;
  }

  public void setEmployerCostTotal(@javax.annotation.Nullable BigDecimal employerCostTotal) {
    this.employerCostTotal = employerCostTotal;
  }


  public EorQuoteBase employerCostTotalUsd(@javax.annotation.Nullable BigDecimal employerCostTotalUsd) {
    this.employerCostTotalUsd = employerCostTotalUsd;
    return this;
  }

  /**
   * Total employer cost in USD
   * @return employerCostTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getEmployerCostTotalUsd() {
    return employerCostTotalUsd;
  }

  public void setEmployerCostTotalUsd(@javax.annotation.Nullable BigDecimal employerCostTotalUsd) {
    this.employerCostTotalUsd = employerCostTotalUsd;
  }


  public EorQuoteBase platformFeeTotal(@javax.annotation.Nullable BigDecimal platformFeeTotal) {
    this.platformFeeTotal = platformFeeTotal;
    return this;
  }

  /**
   * Total platform fee in local currency
   * @return platformFeeTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getPlatformFeeTotal() {
    return platformFeeTotal;
  }

  public void setPlatformFeeTotal(@javax.annotation.Nullable BigDecimal platformFeeTotal) {
    this.platformFeeTotal = platformFeeTotal;
  }


  public EorQuoteBase platformFeeTotalUsd(@javax.annotation.Nullable BigDecimal platformFeeTotalUsd) {
    this.platformFeeTotalUsd = platformFeeTotalUsd;
    return this;
  }

  /**
   * Total platform fee in USD
   * @return platformFeeTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getPlatformFeeTotalUsd() {
    return platformFeeTotalUsd;
  }

  public void setPlatformFeeTotalUsd(@javax.annotation.Nullable BigDecimal platformFeeTotalUsd) {
    this.platformFeeTotalUsd = platformFeeTotalUsd;
  }


  public EorQuoteBase mobilityFeeTotal(@javax.annotation.Nullable BigDecimal mobilityFeeTotal) {
    this.mobilityFeeTotal = mobilityFeeTotal;
    return this;
  }

  /**
   * Total mobility fee in local currency
   * @return mobilityFeeTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getMobilityFeeTotal() {
    return mobilityFeeTotal;
  }

  public void setMobilityFeeTotal(@javax.annotation.Nullable BigDecimal mobilityFeeTotal) {
    this.mobilityFeeTotal = mobilityFeeTotal;
  }


  public EorQuoteBase mobilityFeeTotalUsd(@javax.annotation.Nullable BigDecimal mobilityFeeTotalUsd) {
    this.mobilityFeeTotalUsd = mobilityFeeTotalUsd;
    return this;
  }

  /**
   * Total mobility fee in USD
   * @return mobilityFeeTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getMobilityFeeTotalUsd() {
    return mobilityFeeTotalUsd;
  }

  public void setMobilityFeeTotalUsd(@javax.annotation.Nullable BigDecimal mobilityFeeTotalUsd) {
    this.mobilityFeeTotalUsd = mobilityFeeTotalUsd;
  }


  public EorQuoteBase monthlyCostTotal(@javax.annotation.Nullable BigDecimal monthlyCostTotal) {
    this.monthlyCostTotal = monthlyCostTotal;
    return this;
  }

  /**
   * Total monthly cost in local currency
   * @return monthlyCostTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getMonthlyCostTotal() {
    return monthlyCostTotal;
  }

  public void setMonthlyCostTotal(@javax.annotation.Nullable BigDecimal monthlyCostTotal) {
    this.monthlyCostTotal = monthlyCostTotal;
  }


  public EorQuoteBase monthlyCostTotalUsd(@javax.annotation.Nullable BigDecimal monthlyCostTotalUsd) {
    this.monthlyCostTotalUsd = monthlyCostTotalUsd;
    return this;
  }

  /**
   * Total monthly cost in USD
   * @return monthlyCostTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getMonthlyCostTotalUsd() {
    return monthlyCostTotalUsd;
  }

  public void setMonthlyCostTotalUsd(@javax.annotation.Nullable BigDecimal monthlyCostTotalUsd) {
    this.monthlyCostTotalUsd = monthlyCostTotalUsd;
  }


  public EorQuoteBase grossSalaryTotal(@javax.annotation.Nullable BigDecimal grossSalaryTotal) {
    this.grossSalaryTotal = grossSalaryTotal;
    return this;
  }

  /**
   * Total gross salary in local currency
   * @return grossSalaryTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getGrossSalaryTotal() {
    return grossSalaryTotal;
  }

  public void setGrossSalaryTotal(@javax.annotation.Nullable BigDecimal grossSalaryTotal) {
    this.grossSalaryTotal = grossSalaryTotal;
  }


  public EorQuoteBase grossSalaryTotalUsd(@javax.annotation.Nullable BigDecimal grossSalaryTotalUsd) {
    this.grossSalaryTotalUsd = grossSalaryTotalUsd;
    return this;
  }

  /**
   * Total gross salary in USD
   * @return grossSalaryTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getGrossSalaryTotalUsd() {
    return grossSalaryTotalUsd;
  }

  public void setGrossSalaryTotalUsd(@javax.annotation.Nullable BigDecimal grossSalaryTotalUsd) {
    this.grossSalaryTotalUsd = grossSalaryTotalUsd;
  }


  public EorQuoteBase cbaTotal(@javax.annotation.Nullable BigDecimal cbaTotal) {
    this.cbaTotal = cbaTotal;
    return this;
  }

  /**
   * Total CBA in local currency
   * @return cbaTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getCbaTotal() {
    return cbaTotal;
  }

  public void setCbaTotal(@javax.annotation.Nullable BigDecimal cbaTotal) {
    this.cbaTotal = cbaTotal;
  }


  public EorQuoteBase cbaTotalUsd(@javax.annotation.Nullable BigDecimal cbaTotalUsd) {
    this.cbaTotalUsd = cbaTotalUsd;
    return this;
  }

  /**
   * Total CBA in USD
   * @return cbaTotalUsd
   */
  @javax.annotation.Nullable
  public BigDecimal getCbaTotalUsd() {
    return cbaTotalUsd;
  }

  public void setCbaTotalUsd(@javax.annotation.Nullable BigDecimal cbaTotalUsd) {
    this.cbaTotalUsd = cbaTotalUsd;
  }


  public EorQuoteBase createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EorQuoteBase updatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorQuoteBase eorQuoteBase = (EorQuoteBase) o;
    return Objects.equals(this.annualSalary, eorQuoteBase.annualSalary) &&
        Objects.equals(this.currency, eorQuoteBase.currency) &&
        Objects.equals(this.breakdownCosts, eorQuoteBase.breakdownCosts) &&
        Objects.equals(this.severanceAccrualTotal, eorQuoteBase.severanceAccrualTotal) &&
        Objects.equals(this.severanceAccrualTotalUsd, eorQuoteBase.severanceAccrualTotalUsd) &&
        Objects.equals(this.recurringAllowanceTotal, eorQuoteBase.recurringAllowanceTotal) &&
        Objects.equals(this.recurringAllowanceTotalUsd, eorQuoteBase.recurringAllowanceTotalUsd) &&
        Objects.equals(this.salaryTotal, eorQuoteBase.salaryTotal) &&
        Objects.equals(this.salaryTotalUsd, eorQuoteBase.salaryTotalUsd) &&
        Objects.equals(this.employerCostTotal, eorQuoteBase.employerCostTotal) &&
        Objects.equals(this.employerCostTotalUsd, eorQuoteBase.employerCostTotalUsd) &&
        Objects.equals(this.platformFeeTotal, eorQuoteBase.platformFeeTotal) &&
        Objects.equals(this.platformFeeTotalUsd, eorQuoteBase.platformFeeTotalUsd) &&
        Objects.equals(this.mobilityFeeTotal, eorQuoteBase.mobilityFeeTotal) &&
        Objects.equals(this.mobilityFeeTotalUsd, eorQuoteBase.mobilityFeeTotalUsd) &&
        Objects.equals(this.monthlyCostTotal, eorQuoteBase.monthlyCostTotal) &&
        Objects.equals(this.monthlyCostTotalUsd, eorQuoteBase.monthlyCostTotalUsd) &&
        Objects.equals(this.grossSalaryTotal, eorQuoteBase.grossSalaryTotal) &&
        Objects.equals(this.grossSalaryTotalUsd, eorQuoteBase.grossSalaryTotalUsd) &&
        Objects.equals(this.cbaTotal, eorQuoteBase.cbaTotal) &&
        Objects.equals(this.cbaTotalUsd, eorQuoteBase.cbaTotalUsd) &&
        Objects.equals(this.createdAt, eorQuoteBase.createdAt) &&
        Objects.equals(this.updatedAt, eorQuoteBase.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualSalary, currency, breakdownCosts, severanceAccrualTotal, severanceAccrualTotalUsd, recurringAllowanceTotal, recurringAllowanceTotalUsd, salaryTotal, salaryTotalUsd, employerCostTotal, employerCostTotalUsd, platformFeeTotal, platformFeeTotalUsd, mobilityFeeTotal, mobilityFeeTotalUsd, monthlyCostTotal, monthlyCostTotalUsd, grossSalaryTotal, grossSalaryTotalUsd, cbaTotal, cbaTotalUsd, createdAt, updatedAt);
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
    sb.append("class EorQuoteBase {\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    breakdownCosts: ").append(toIndentedString(breakdownCosts)).append("\n");
    sb.append("    severanceAccrualTotal: ").append(toIndentedString(severanceAccrualTotal)).append("\n");
    sb.append("    severanceAccrualTotalUsd: ").append(toIndentedString(severanceAccrualTotalUsd)).append("\n");
    sb.append("    recurringAllowanceTotal: ").append(toIndentedString(recurringAllowanceTotal)).append("\n");
    sb.append("    recurringAllowanceTotalUsd: ").append(toIndentedString(recurringAllowanceTotalUsd)).append("\n");
    sb.append("    salaryTotal: ").append(toIndentedString(salaryTotal)).append("\n");
    sb.append("    salaryTotalUsd: ").append(toIndentedString(salaryTotalUsd)).append("\n");
    sb.append("    employerCostTotal: ").append(toIndentedString(employerCostTotal)).append("\n");
    sb.append("    employerCostTotalUsd: ").append(toIndentedString(employerCostTotalUsd)).append("\n");
    sb.append("    platformFeeTotal: ").append(toIndentedString(platformFeeTotal)).append("\n");
    sb.append("    platformFeeTotalUsd: ").append(toIndentedString(platformFeeTotalUsd)).append("\n");
    sb.append("    mobilityFeeTotal: ").append(toIndentedString(mobilityFeeTotal)).append("\n");
    sb.append("    mobilityFeeTotalUsd: ").append(toIndentedString(mobilityFeeTotalUsd)).append("\n");
    sb.append("    monthlyCostTotal: ").append(toIndentedString(monthlyCostTotal)).append("\n");
    sb.append("    monthlyCostTotalUsd: ").append(toIndentedString(monthlyCostTotalUsd)).append("\n");
    sb.append("    grossSalaryTotal: ").append(toIndentedString(grossSalaryTotal)).append("\n");
    sb.append("    grossSalaryTotalUsd: ").append(toIndentedString(grossSalaryTotalUsd)).append("\n");
    sb.append("    cbaTotal: ").append(toIndentedString(cbaTotal)).append("\n");
    sb.append("    cbaTotalUsd: ").append(toIndentedString(cbaTotalUsd)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("annual_salary");
    openapiFields.add("currency");
    openapiFields.add("breakdown_costs");
    openapiFields.add("severance_accrual_total");
    openapiFields.add("severance_accrual_total_usd");
    openapiFields.add("recurring_allowance_total");
    openapiFields.add("recurring_allowance_total_usd");
    openapiFields.add("salary_total");
    openapiFields.add("salary_total_usd");
    openapiFields.add("employer_cost_total");
    openapiFields.add("employer_cost_total_usd");
    openapiFields.add("platform_fee_total");
    openapiFields.add("platform_fee_total_usd");
    openapiFields.add("mobility_fee_total");
    openapiFields.add("mobility_fee_total_usd");
    openapiFields.add("monthly_cost_total");
    openapiFields.add("monthly_cost_total_usd");
    openapiFields.add("gross_salary_total");
    openapiFields.add("gross_salary_total_usd");
    openapiFields.add("cba_total");
    openapiFields.add("cba_total_usd");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorQuoteBase
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorQuoteBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorQuoteBase is not found in the empty JSON string", EorQuoteBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorQuoteBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorQuoteBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `breakdown_costs`
      if (jsonObj.get("breakdown_costs") != null && !jsonObj.get("breakdown_costs").isJsonNull()) {
        BreakdownCostsQuote.validateJsonElement(jsonObj.get("breakdown_costs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorQuoteBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorQuoteBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorQuoteBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorQuoteBase.class));

       return (TypeAdapter<T>) new TypeAdapter<EorQuoteBase>() {
           @Override
           public void write(JsonWriter out, EorQuoteBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorQuoteBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorQuoteBase given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorQuoteBase
   * @throws IOException if the JSON string is invalid with respect to EorQuoteBase
   */
  public static EorQuoteBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorQuoteBase.class);
  }

  /**
   * Convert an instance of EorQuoteBase to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

