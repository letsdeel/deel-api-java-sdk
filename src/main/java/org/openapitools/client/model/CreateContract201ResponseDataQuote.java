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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateContract201ResponseDataQuoteBenefitsInner;
import org.openapitools.client.model.CreateContract201ResponseDataQuoteBreakdownCosts;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataQuote {
  public static final String SERIALIZED_NAME_BENEFITS = "benefits";
  @SerializedName(SERIALIZED_NAME_BENEFITS)
  @javax.annotation.Nullable
  private List<CreateContract201ResponseDataQuoteBenefitsInner> benefits = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_CBA_TOTAL = "cba_total";
  @SerializedName(SERIALIZED_NAME_CBA_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal cbaTotal;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private LocalDate updatedAt;

  public static final String SERIALIZED_NAME_SALARY_TOTAL = "salary_total";
  @SerializedName(SERIALIZED_NAME_SALARY_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal salaryTotal;

  public static final String SERIALIZED_NAME_ANNUAL_SALARY = "annual_salary";
  @SerializedName(SERIALIZED_NAME_ANNUAL_SALARY)
  @javax.annotation.Nullable
  private BigDecimal annualSalary;

  public static final String SERIALIZED_NAME_CBA_TOTAL_USD = "cba_total_usd";
  @SerializedName(SERIALIZED_NAME_CBA_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal cbaTotalUsd;

  public static final String SERIALIZED_NAME_BREAKDOWN_COSTS = "breakdown_costs";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN_COSTS)
  @javax.annotation.Nullable
  private CreateContract201ResponseDataQuoteBreakdownCosts breakdownCosts;

  public static final String SERIALIZED_NAME_SALARY_TOTAL_USD = "salary_total_usd";
  @SerializedName(SERIALIZED_NAME_SALARY_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal salaryTotalUsd;

  public static final String SERIALIZED_NAME_GROSS_SALARY_TOTAL = "gross_salary_total";
  @SerializedName(SERIALIZED_NAME_GROSS_SALARY_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal grossSalaryTotal;

  public static final String SERIALIZED_NAME_MOBILITY_FEE_TOTAL = "mobility_fee_total";
  @SerializedName(SERIALIZED_NAME_MOBILITY_FEE_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal mobilityFeeTotal;

  public static final String SERIALIZED_NAME_MONTHLY_COST_TOTAL = "monthly_cost_total";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal monthlyCostTotal;

  public static final String SERIALIZED_NAME_PLATFORM_FEE_TOTAL = "platform_fee_total";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal platformFeeTotal;

  public static final String SERIALIZED_NAME_EMPLOYER_COST_TOTAL = "employer_cost_total";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COST_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal employerCostTotal;

  public static final String SERIALIZED_NAME_GROSS_SALARY_TOTAL_USD = "gross_salary_total_usd";
  @SerializedName(SERIALIZED_NAME_GROSS_SALARY_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal grossSalaryTotalUsd;

  public static final String SERIALIZED_NAME_MOBILITY_FEE_TOTAL_USD = "mobility_fee_total_usd";
  @SerializedName(SERIALIZED_NAME_MOBILITY_FEE_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal mobilityFeeTotalUsd;

  public static final String SERIALIZED_NAME_MONTHLY_COST_TOTAL_USD = "monthly_cost_total_usd";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal monthlyCostTotalUsd;

  public static final String SERIALIZED_NAME_PLATFORM_FEE_TOTAL_USD = "platform_fee_total_usd";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal platformFeeTotalUsd;

  public static final String SERIALIZED_NAME_EMPLOYER_COST_TOTAL_USD = "employer_cost_total_usd";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COST_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal employerCostTotalUsd;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL = "severance_accrual_total";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal severanceAccrualTotal;

  public static final String SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL = "recurring_allowance_total";
  @SerializedName(SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal recurringAllowanceTotal;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL_USD = "severance_accrual_total_usd";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCRUAL_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal severanceAccrualTotalUsd;

  public static final String SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL_USD = "recurring_allowance_total_usd";
  @SerializedName(SERIALIZED_NAME_RECURRING_ALLOWANCE_TOTAL_USD)
  @javax.annotation.Nullable
  private BigDecimal recurringAllowanceTotalUsd;

  public CreateContract201ResponseDataQuote() {
  }

  public CreateContract201ResponseDataQuote benefits(@javax.annotation.Nullable List<CreateContract201ResponseDataQuoteBenefitsInner> benefits) {
    this.benefits = benefits;
    return this;
  }

  public CreateContract201ResponseDataQuote addBenefitsItem(CreateContract201ResponseDataQuoteBenefitsInner benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

  /**
   * Array of benefits
   * @return benefits
   */
  @javax.annotation.Nullable
  public List<CreateContract201ResponseDataQuoteBenefitsInner> getBenefits() {
    return benefits;
  }

  public void setBenefits(@javax.annotation.Nullable List<CreateContract201ResponseDataQuoteBenefitsInner> benefits) {
    this.benefits = benefits;
  }


  public CreateContract201ResponseDataQuote currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public CreateContract201ResponseDataQuote cbaTotal(@javax.annotation.Nullable BigDecimal cbaTotal) {
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


  public CreateContract201ResponseDataQuote createdAt(@javax.annotation.Nullable LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public CreateContract201ResponseDataQuote updatedAt(@javax.annotation.Nullable LocalDate updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreateContract201ResponseDataQuote salaryTotal(@javax.annotation.Nullable BigDecimal salaryTotal) {
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


  public CreateContract201ResponseDataQuote annualSalary(@javax.annotation.Nullable BigDecimal annualSalary) {
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


  public CreateContract201ResponseDataQuote cbaTotalUsd(@javax.annotation.Nullable BigDecimal cbaTotalUsd) {
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


  public CreateContract201ResponseDataQuote breakdownCosts(@javax.annotation.Nullable CreateContract201ResponseDataQuoteBreakdownCosts breakdownCosts) {
    this.breakdownCosts = breakdownCosts;
    return this;
  }

  /**
   * Get breakdownCosts
   * @return breakdownCosts
   */
  @javax.annotation.Nullable
  public CreateContract201ResponseDataQuoteBreakdownCosts getBreakdownCosts() {
    return breakdownCosts;
  }

  public void setBreakdownCosts(@javax.annotation.Nullable CreateContract201ResponseDataQuoteBreakdownCosts breakdownCosts) {
    this.breakdownCosts = breakdownCosts;
  }


  public CreateContract201ResponseDataQuote salaryTotalUsd(@javax.annotation.Nullable BigDecimal salaryTotalUsd) {
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


  public CreateContract201ResponseDataQuote grossSalaryTotal(@javax.annotation.Nullable BigDecimal grossSalaryTotal) {
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


  public CreateContract201ResponseDataQuote mobilityFeeTotal(@javax.annotation.Nullable BigDecimal mobilityFeeTotal) {
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


  public CreateContract201ResponseDataQuote monthlyCostTotal(@javax.annotation.Nullable BigDecimal monthlyCostTotal) {
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


  public CreateContract201ResponseDataQuote platformFeeTotal(@javax.annotation.Nullable BigDecimal platformFeeTotal) {
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


  public CreateContract201ResponseDataQuote employerCostTotal(@javax.annotation.Nullable BigDecimal employerCostTotal) {
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


  public CreateContract201ResponseDataQuote grossSalaryTotalUsd(@javax.annotation.Nullable BigDecimal grossSalaryTotalUsd) {
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


  public CreateContract201ResponseDataQuote mobilityFeeTotalUsd(@javax.annotation.Nullable BigDecimal mobilityFeeTotalUsd) {
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


  public CreateContract201ResponseDataQuote monthlyCostTotalUsd(@javax.annotation.Nullable BigDecimal monthlyCostTotalUsd) {
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


  public CreateContract201ResponseDataQuote platformFeeTotalUsd(@javax.annotation.Nullable BigDecimal platformFeeTotalUsd) {
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


  public CreateContract201ResponseDataQuote employerCostTotalUsd(@javax.annotation.Nullable BigDecimal employerCostTotalUsd) {
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


  public CreateContract201ResponseDataQuote severanceAccrualTotal(@javax.annotation.Nullable BigDecimal severanceAccrualTotal) {
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


  public CreateContract201ResponseDataQuote recurringAllowanceTotal(@javax.annotation.Nullable BigDecimal recurringAllowanceTotal) {
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


  public CreateContract201ResponseDataQuote severanceAccrualTotalUsd(@javax.annotation.Nullable BigDecimal severanceAccrualTotalUsd) {
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


  public CreateContract201ResponseDataQuote recurringAllowanceTotalUsd(@javax.annotation.Nullable BigDecimal recurringAllowanceTotalUsd) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract201ResponseDataQuote createContract201ResponseDataQuote = (CreateContract201ResponseDataQuote) o;
    return Objects.equals(this.benefits, createContract201ResponseDataQuote.benefits) &&
        Objects.equals(this.currency, createContract201ResponseDataQuote.currency) &&
        Objects.equals(this.cbaTotal, createContract201ResponseDataQuote.cbaTotal) &&
        Objects.equals(this.createdAt, createContract201ResponseDataQuote.createdAt) &&
        Objects.equals(this.updatedAt, createContract201ResponseDataQuote.updatedAt) &&
        Objects.equals(this.salaryTotal, createContract201ResponseDataQuote.salaryTotal) &&
        Objects.equals(this.annualSalary, createContract201ResponseDataQuote.annualSalary) &&
        Objects.equals(this.cbaTotalUsd, createContract201ResponseDataQuote.cbaTotalUsd) &&
        Objects.equals(this.breakdownCosts, createContract201ResponseDataQuote.breakdownCosts) &&
        Objects.equals(this.salaryTotalUsd, createContract201ResponseDataQuote.salaryTotalUsd) &&
        Objects.equals(this.grossSalaryTotal, createContract201ResponseDataQuote.grossSalaryTotal) &&
        Objects.equals(this.mobilityFeeTotal, createContract201ResponseDataQuote.mobilityFeeTotal) &&
        Objects.equals(this.monthlyCostTotal, createContract201ResponseDataQuote.monthlyCostTotal) &&
        Objects.equals(this.platformFeeTotal, createContract201ResponseDataQuote.platformFeeTotal) &&
        Objects.equals(this.employerCostTotal, createContract201ResponseDataQuote.employerCostTotal) &&
        Objects.equals(this.grossSalaryTotalUsd, createContract201ResponseDataQuote.grossSalaryTotalUsd) &&
        Objects.equals(this.mobilityFeeTotalUsd, createContract201ResponseDataQuote.mobilityFeeTotalUsd) &&
        Objects.equals(this.monthlyCostTotalUsd, createContract201ResponseDataQuote.monthlyCostTotalUsd) &&
        Objects.equals(this.platformFeeTotalUsd, createContract201ResponseDataQuote.platformFeeTotalUsd) &&
        Objects.equals(this.employerCostTotalUsd, createContract201ResponseDataQuote.employerCostTotalUsd) &&
        Objects.equals(this.severanceAccrualTotal, createContract201ResponseDataQuote.severanceAccrualTotal) &&
        Objects.equals(this.recurringAllowanceTotal, createContract201ResponseDataQuote.recurringAllowanceTotal) &&
        Objects.equals(this.severanceAccrualTotalUsd, createContract201ResponseDataQuote.severanceAccrualTotalUsd) &&
        Objects.equals(this.recurringAllowanceTotalUsd, createContract201ResponseDataQuote.recurringAllowanceTotalUsd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefits, currency, cbaTotal, createdAt, updatedAt, salaryTotal, annualSalary, cbaTotalUsd, breakdownCosts, salaryTotalUsd, grossSalaryTotal, mobilityFeeTotal, monthlyCostTotal, platformFeeTotal, employerCostTotal, grossSalaryTotalUsd, mobilityFeeTotalUsd, monthlyCostTotalUsd, platformFeeTotalUsd, employerCostTotalUsd, severanceAccrualTotal, recurringAllowanceTotal, severanceAccrualTotalUsd, recurringAllowanceTotalUsd);
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
    sb.append("class CreateContract201ResponseDataQuote {\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    cbaTotal: ").append(toIndentedString(cbaTotal)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    salaryTotal: ").append(toIndentedString(salaryTotal)).append("\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    cbaTotalUsd: ").append(toIndentedString(cbaTotalUsd)).append("\n");
    sb.append("    breakdownCosts: ").append(toIndentedString(breakdownCosts)).append("\n");
    sb.append("    salaryTotalUsd: ").append(toIndentedString(salaryTotalUsd)).append("\n");
    sb.append("    grossSalaryTotal: ").append(toIndentedString(grossSalaryTotal)).append("\n");
    sb.append("    mobilityFeeTotal: ").append(toIndentedString(mobilityFeeTotal)).append("\n");
    sb.append("    monthlyCostTotal: ").append(toIndentedString(monthlyCostTotal)).append("\n");
    sb.append("    platformFeeTotal: ").append(toIndentedString(platformFeeTotal)).append("\n");
    sb.append("    employerCostTotal: ").append(toIndentedString(employerCostTotal)).append("\n");
    sb.append("    grossSalaryTotalUsd: ").append(toIndentedString(grossSalaryTotalUsd)).append("\n");
    sb.append("    mobilityFeeTotalUsd: ").append(toIndentedString(mobilityFeeTotalUsd)).append("\n");
    sb.append("    monthlyCostTotalUsd: ").append(toIndentedString(monthlyCostTotalUsd)).append("\n");
    sb.append("    platformFeeTotalUsd: ").append(toIndentedString(platformFeeTotalUsd)).append("\n");
    sb.append("    employerCostTotalUsd: ").append(toIndentedString(employerCostTotalUsd)).append("\n");
    sb.append("    severanceAccrualTotal: ").append(toIndentedString(severanceAccrualTotal)).append("\n");
    sb.append("    recurringAllowanceTotal: ").append(toIndentedString(recurringAllowanceTotal)).append("\n");
    sb.append("    severanceAccrualTotalUsd: ").append(toIndentedString(severanceAccrualTotalUsd)).append("\n");
    sb.append("    recurringAllowanceTotalUsd: ").append(toIndentedString(recurringAllowanceTotalUsd)).append("\n");
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
    openapiFields.add("benefits");
    openapiFields.add("currency");
    openapiFields.add("cba_total");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("salary_total");
    openapiFields.add("annual_salary");
    openapiFields.add("cba_total_usd");
    openapiFields.add("breakdown_costs");
    openapiFields.add("salary_total_usd");
    openapiFields.add("gross_salary_total");
    openapiFields.add("mobility_fee_total");
    openapiFields.add("monthly_cost_total");
    openapiFields.add("platform_fee_total");
    openapiFields.add("employer_cost_total");
    openapiFields.add("gross_salary_total_usd");
    openapiFields.add("mobility_fee_total_usd");
    openapiFields.add("monthly_cost_total_usd");
    openapiFields.add("platform_fee_total_usd");
    openapiFields.add("employer_cost_total_usd");
    openapiFields.add("severance_accrual_total");
    openapiFields.add("recurring_allowance_total");
    openapiFields.add("severance_accrual_total_usd");
    openapiFields.add("recurring_allowance_total_usd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataQuote
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataQuote.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataQuote is not found in the empty JSON string", CreateContract201ResponseDataQuote.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataQuote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataQuote` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("benefits") != null && !jsonObj.get("benefits").isJsonNull()) {
        JsonArray jsonArraybenefits = jsonObj.getAsJsonArray("benefits");
        if (jsonArraybenefits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("benefits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `benefits` to be an array in the JSON string but got `%s`", jsonObj.get("benefits").toString()));
          }

          // validate the optional field `benefits` (array)
          for (int i = 0; i < jsonArraybenefits.size(); i++) {
            CreateContract201ResponseDataQuoteBenefitsInner.validateJsonElement(jsonArraybenefits.get(i));
          };
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `breakdown_costs`
      if (jsonObj.get("breakdown_costs") != null && !jsonObj.get("breakdown_costs").isJsonNull()) {
        CreateContract201ResponseDataQuoteBreakdownCosts.validateJsonElement(jsonObj.get("breakdown_costs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataQuote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataQuote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataQuote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataQuote.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataQuote>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataQuote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataQuote read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataQuote given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataQuote
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataQuote
   */
  public static CreateContract201ResponseDataQuote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataQuote.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataQuote to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

