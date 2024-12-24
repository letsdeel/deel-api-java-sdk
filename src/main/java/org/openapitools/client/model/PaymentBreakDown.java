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
 * PaymentBreakDown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class PaymentBreakDown {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_GENERAL_LEDGER_ACCOUNT = "general_ledger_account";
  @SerializedName(SERIALIZED_NAME_GENERAL_LEDGER_ACCOUNT)
  @javax.annotation.Nullable
  private String generalLedgerAccount;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nullable
  private String team;

  public static final String SERIALIZED_NAME_CONTRACTOR_UNIQUE_IDENTIFIER = "contractor_unique_identifier";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_UNIQUE_IDENTIFIER)
  @javax.annotation.Nullable
  private String contractorUniqueIdentifier;

  public static final String SERIALIZED_NAME_CONTRACTOR_EMPLOYEE_NAME = "contractor_employee_name";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_EMPLOYEE_NAME)
  @javax.annotation.Nullable
  private String contractorEmployeeName;

  public static final String SERIALIZED_NAME_CONTRACTOR_EMAIL = "contractor_email";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_EMAIL)
  @javax.annotation.Nullable
  private String contractorEmail;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  @javax.annotation.Nullable
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_PAYMENT_CURRENCY = "payment_currency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CURRENCY)
  @javax.annotation.Nullable
  private String paymentCurrency;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER = "receipt_number";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER)
  @javax.annotation.Nullable
  private String receiptNumber;

  public static final String SERIALIZED_NAME_WORK = "work";
  @SerializedName(SERIALIZED_NAME_WORK)
  @javax.annotation.Nullable
  private String work;

  public static final String SERIALIZED_NAME_BONUS = "bonus";
  @SerializedName(SERIALIZED_NAME_BONUS)
  @javax.annotation.Nullable
  private String bonus;

  public static final String SERIALIZED_NAME_EXPENSES = "expenses";
  @SerializedName(SERIALIZED_NAME_EXPENSES)
  @javax.annotation.Nullable
  private String expenses;

  public static final String SERIALIZED_NAME_COMMISSIONS = "commissions";
  @SerializedName(SERIALIZED_NAME_COMMISSIONS)
  @javax.annotation.Nullable
  private String commissions;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  @javax.annotation.Nullable
  private String deductions;

  public static final String SERIALIZED_NAME_OVERTIME = "overtime";
  @SerializedName(SERIALIZED_NAME_OVERTIME)
  @javax.annotation.Nullable
  private String overtime;

  public static final String SERIALIZED_NAME_PRO_RATA = "pro_rata";
  @SerializedName(SERIALIZED_NAME_PRO_RATA)
  @javax.annotation.Nullable
  private String proRata;

  public static final String SERIALIZED_NAME_OTHERS = "others";
  @SerializedName(SERIALIZED_NAME_OTHERS)
  @javax.annotation.Nullable
  private String others;

  public static final String SERIALIZED_NAME_PROCESSING_FEE = "processing_fee";
  @SerializedName(SERIALIZED_NAME_PROCESSING_FEE)
  @javax.annotation.Nullable
  private String processingFee;

  public static final String SERIALIZED_NAME_ADJUSTMENT = "adjustment";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT)
  @javax.annotation.Nullable
  private String adjustment;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private String total;

  public static final String SERIALIZED_NAME_TOTAL_PAYMENT_CURRENCY = "total_payment_currency";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAYMENT_CURRENCY)
  @javax.annotation.Nullable
  private String totalPaymentCurrency;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "payment_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  @javax.annotation.Nullable
  private String paymentDate;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private String frequency;

  public static final String SERIALIZED_NAME_CONTRACT_COUNTRY = "contract_country";
  @SerializedName(SERIALIZED_NAME_CONTRACT_COUNTRY)
  @javax.annotation.Nullable
  private String contractCountry;

  public static final String SERIALIZED_NAME_CONTRACT_START_DATE = "contract_start_date";
  @SerializedName(SERIALIZED_NAME_CONTRACT_START_DATE)
  @javax.annotation.Nullable
  private String contractStartDate;

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  @javax.annotation.Nullable
  private String approvers;

  public static final String SERIALIZED_NAME_APPROVE_DATE = "approve_date";
  @SerializedName(SERIALIZED_NAME_APPROVE_DATE)
  @javax.annotation.Nullable
  private String approveDate;

  public PaymentBreakDown() {
  }

  public PaymentBreakDown date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public PaymentBreakDown generalLedgerAccount(@javax.annotation.Nullable String generalLedgerAccount) {
    this.generalLedgerAccount = generalLedgerAccount;
    return this;
  }

  /**
   * Get generalLedgerAccount
   * @return generalLedgerAccount
   */
  @javax.annotation.Nullable
  public String getGeneralLedgerAccount() {
    return generalLedgerAccount;
  }

  public void setGeneralLedgerAccount(@javax.annotation.Nullable String generalLedgerAccount) {
    this.generalLedgerAccount = generalLedgerAccount;
  }


  public PaymentBreakDown team(@javax.annotation.Nullable String team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nullable
  public String getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nullable String team) {
    this.team = team;
  }


  public PaymentBreakDown contractorUniqueIdentifier(@javax.annotation.Nullable String contractorUniqueIdentifier) {
    this.contractorUniqueIdentifier = contractorUniqueIdentifier;
    return this;
  }

  /**
   * Worker&#39;s unique identifier.
   * @return contractorUniqueIdentifier
   */
  @javax.annotation.Nullable
  public String getContractorUniqueIdentifier() {
    return contractorUniqueIdentifier;
  }

  public void setContractorUniqueIdentifier(@javax.annotation.Nullable String contractorUniqueIdentifier) {
    this.contractorUniqueIdentifier = contractorUniqueIdentifier;
  }


  public PaymentBreakDown contractorEmployeeName(@javax.annotation.Nullable String contractorEmployeeName) {
    this.contractorEmployeeName = contractorEmployeeName;
    return this;
  }

  /**
   * Worker&#39;s name.
   * @return contractorEmployeeName
   */
  @javax.annotation.Nullable
  public String getContractorEmployeeName() {
    return contractorEmployeeName;
  }

  public void setContractorEmployeeName(@javax.annotation.Nullable String contractorEmployeeName) {
    this.contractorEmployeeName = contractorEmployeeName;
  }


  public PaymentBreakDown contractorEmail(@javax.annotation.Nullable String contractorEmail) {
    this.contractorEmail = contractorEmail;
    return this;
  }

  /**
   * Worker&#39;s email.
   * @return contractorEmail
   */
  @javax.annotation.Nullable
  public String getContractorEmail() {
    return contractorEmail;
  }

  public void setContractorEmail(@javax.annotation.Nullable String contractorEmail) {
    this.contractorEmail = contractorEmail;
  }


  public PaymentBreakDown invoiceNumber(@javax.annotation.Nullable String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Invoice number.
   * @return invoiceNumber
   */
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(@javax.annotation.Nullable String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public PaymentBreakDown currency(@javax.annotation.Nullable String currency) {
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


  public PaymentBreakDown paymentCurrency(@javax.annotation.Nullable String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

  /**
   * Get paymentCurrency
   * @return paymentCurrency
   */
  @javax.annotation.Nullable
  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(@javax.annotation.Nullable String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }


  public PaymentBreakDown receiptNumber(@javax.annotation.Nullable String receiptNumber) {
    this.receiptNumber = receiptNumber;
    return this;
  }

  /**
   * Get receiptNumber
   * @return receiptNumber
   */
  @javax.annotation.Nullable
  public String getReceiptNumber() {
    return receiptNumber;
  }

  public void setReceiptNumber(@javax.annotation.Nullable String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }


  public PaymentBreakDown work(@javax.annotation.Nullable String work) {
    this.work = work;
    return this;
  }

  /**
   * Get work
   * @return work
   */
  @javax.annotation.Nullable
  public String getWork() {
    return work;
  }

  public void setWork(@javax.annotation.Nullable String work) {
    this.work = work;
  }


  public PaymentBreakDown bonus(@javax.annotation.Nullable String bonus) {
    this.bonus = bonus;
    return this;
  }

  /**
   * Get bonus
   * @return bonus
   */
  @javax.annotation.Nullable
  public String getBonus() {
    return bonus;
  }

  public void setBonus(@javax.annotation.Nullable String bonus) {
    this.bonus = bonus;
  }


  public PaymentBreakDown expenses(@javax.annotation.Nullable String expenses) {
    this.expenses = expenses;
    return this;
  }

  /**
   * Get expenses
   * @return expenses
   */
  @javax.annotation.Nullable
  public String getExpenses() {
    return expenses;
  }

  public void setExpenses(@javax.annotation.Nullable String expenses) {
    this.expenses = expenses;
  }


  public PaymentBreakDown commissions(@javax.annotation.Nullable String commissions) {
    this.commissions = commissions;
    return this;
  }

  /**
   * Get commissions
   * @return commissions
   */
  @javax.annotation.Nullable
  public String getCommissions() {
    return commissions;
  }

  public void setCommissions(@javax.annotation.Nullable String commissions) {
    this.commissions = commissions;
  }


  public PaymentBreakDown deductions(@javax.annotation.Nullable String deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * Get deductions
   * @return deductions
   */
  @javax.annotation.Nullable
  public String getDeductions() {
    return deductions;
  }

  public void setDeductions(@javax.annotation.Nullable String deductions) {
    this.deductions = deductions;
  }


  public PaymentBreakDown overtime(@javax.annotation.Nullable String overtime) {
    this.overtime = overtime;
    return this;
  }

  /**
   * Get overtime
   * @return overtime
   */
  @javax.annotation.Nullable
  public String getOvertime() {
    return overtime;
  }

  public void setOvertime(@javax.annotation.Nullable String overtime) {
    this.overtime = overtime;
  }


  public PaymentBreakDown proRata(@javax.annotation.Nullable String proRata) {
    this.proRata = proRata;
    return this;
  }

  /**
   * Get proRata
   * @return proRata
   */
  @javax.annotation.Nullable
  public String getProRata() {
    return proRata;
  }

  public void setProRata(@javax.annotation.Nullable String proRata) {
    this.proRata = proRata;
  }


  public PaymentBreakDown others(@javax.annotation.Nullable String others) {
    this.others = others;
    return this;
  }

  /**
   * Get others
   * @return others
   */
  @javax.annotation.Nullable
  public String getOthers() {
    return others;
  }

  public void setOthers(@javax.annotation.Nullable String others) {
    this.others = others;
  }


  public PaymentBreakDown processingFee(@javax.annotation.Nullable String processingFee) {
    this.processingFee = processingFee;
    return this;
  }

  /**
   * Get processingFee
   * @return processingFee
   */
  @javax.annotation.Nullable
  public String getProcessingFee() {
    return processingFee;
  }

  public void setProcessingFee(@javax.annotation.Nullable String processingFee) {
    this.processingFee = processingFee;
  }


  public PaymentBreakDown adjustment(@javax.annotation.Nullable String adjustment) {
    this.adjustment = adjustment;
    return this;
  }

  /**
   * Get adjustment
   * @return adjustment
   */
  @javax.annotation.Nullable
  public String getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(@javax.annotation.Nullable String adjustment) {
    this.adjustment = adjustment;
  }


  public PaymentBreakDown total(@javax.annotation.Nullable String total) {
    this.total = total;
    return this;
  }

  /**
   * Total due.
   * @return total
   */
  @javax.annotation.Nullable
  public String getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable String total) {
    this.total = total;
  }


  public PaymentBreakDown totalPaymentCurrency(@javax.annotation.Nullable String totalPaymentCurrency) {
    this.totalPaymentCurrency = totalPaymentCurrency;
    return this;
  }

  /**
   * Total in payment currency.
   * @return totalPaymentCurrency
   */
  @javax.annotation.Nullable
  public String getTotalPaymentCurrency() {
    return totalPaymentCurrency;
  }

  public void setTotalPaymentCurrency(@javax.annotation.Nullable String totalPaymentCurrency) {
    this.totalPaymentCurrency = totalPaymentCurrency;
  }


  public PaymentBreakDown paymentDate(@javax.annotation.Nullable String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Date of payment.
   * @return paymentDate
   */
  @javax.annotation.Nullable
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(@javax.annotation.Nullable String paymentDate) {
    this.paymentDate = paymentDate;
  }


  public PaymentBreakDown frequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @javax.annotation.Nullable
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
  }


  public PaymentBreakDown contractCountry(@javax.annotation.Nullable String contractCountry) {
    this.contractCountry = contractCountry;
    return this;
  }

  /**
   * Country of the contract.
   * @return contractCountry
   */
  @javax.annotation.Nullable
  public String getContractCountry() {
    return contractCountry;
  }

  public void setContractCountry(@javax.annotation.Nullable String contractCountry) {
    this.contractCountry = contractCountry;
  }


  public PaymentBreakDown contractStartDate(@javax.annotation.Nullable String contractStartDate) {
    this.contractStartDate = contractStartDate;
    return this;
  }

  /**
   * Contract start date.
   * @return contractStartDate
   */
  @javax.annotation.Nullable
  public String getContractStartDate() {
    return contractStartDate;
  }

  public void setContractStartDate(@javax.annotation.Nullable String contractStartDate) {
    this.contractStartDate = contractStartDate;
  }


  public PaymentBreakDown approvers(@javax.annotation.Nullable String approvers) {
    this.approvers = approvers;
    return this;
  }

  /**
   * Get approvers
   * @return approvers
   */
  @javax.annotation.Nullable
  public String getApprovers() {
    return approvers;
  }

  public void setApprovers(@javax.annotation.Nullable String approvers) {
    this.approvers = approvers;
  }


  public PaymentBreakDown approveDate(@javax.annotation.Nullable String approveDate) {
    this.approveDate = approveDate;
    return this;
  }

  /**
   * Get approveDate
   * @return approveDate
   */
  @javax.annotation.Nullable
  public String getApproveDate() {
    return approveDate;
  }

  public void setApproveDate(@javax.annotation.Nullable String approveDate) {
    this.approveDate = approveDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentBreakDown paymentBreakDown = (PaymentBreakDown) o;
    return Objects.equals(this.date, paymentBreakDown.date) &&
        Objects.equals(this.generalLedgerAccount, paymentBreakDown.generalLedgerAccount) &&
        Objects.equals(this.team, paymentBreakDown.team) &&
        Objects.equals(this.contractorUniqueIdentifier, paymentBreakDown.contractorUniqueIdentifier) &&
        Objects.equals(this.contractorEmployeeName, paymentBreakDown.contractorEmployeeName) &&
        Objects.equals(this.contractorEmail, paymentBreakDown.contractorEmail) &&
        Objects.equals(this.invoiceNumber, paymentBreakDown.invoiceNumber) &&
        Objects.equals(this.currency, paymentBreakDown.currency) &&
        Objects.equals(this.paymentCurrency, paymentBreakDown.paymentCurrency) &&
        Objects.equals(this.receiptNumber, paymentBreakDown.receiptNumber) &&
        Objects.equals(this.work, paymentBreakDown.work) &&
        Objects.equals(this.bonus, paymentBreakDown.bonus) &&
        Objects.equals(this.expenses, paymentBreakDown.expenses) &&
        Objects.equals(this.commissions, paymentBreakDown.commissions) &&
        Objects.equals(this.deductions, paymentBreakDown.deductions) &&
        Objects.equals(this.overtime, paymentBreakDown.overtime) &&
        Objects.equals(this.proRata, paymentBreakDown.proRata) &&
        Objects.equals(this.others, paymentBreakDown.others) &&
        Objects.equals(this.processingFee, paymentBreakDown.processingFee) &&
        Objects.equals(this.adjustment, paymentBreakDown.adjustment) &&
        Objects.equals(this.total, paymentBreakDown.total) &&
        Objects.equals(this.totalPaymentCurrency, paymentBreakDown.totalPaymentCurrency) &&
        Objects.equals(this.paymentDate, paymentBreakDown.paymentDate) &&
        Objects.equals(this.frequency, paymentBreakDown.frequency) &&
        Objects.equals(this.contractCountry, paymentBreakDown.contractCountry) &&
        Objects.equals(this.contractStartDate, paymentBreakDown.contractStartDate) &&
        Objects.equals(this.approvers, paymentBreakDown.approvers) &&
        Objects.equals(this.approveDate, paymentBreakDown.approveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, generalLedgerAccount, team, contractorUniqueIdentifier, contractorEmployeeName, contractorEmail, invoiceNumber, currency, paymentCurrency, receiptNumber, work, bonus, expenses, commissions, deductions, overtime, proRata, others, processingFee, adjustment, total, totalPaymentCurrency, paymentDate, frequency, contractCountry, contractStartDate, approvers, approveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBreakDown {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    generalLedgerAccount: ").append(toIndentedString(generalLedgerAccount)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    contractorUniqueIdentifier: ").append(toIndentedString(contractorUniqueIdentifier)).append("\n");
    sb.append("    contractorEmployeeName: ").append(toIndentedString(contractorEmployeeName)).append("\n");
    sb.append("    contractorEmail: ").append(toIndentedString(contractorEmail)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    bonus: ").append(toIndentedString(bonus)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    overtime: ").append(toIndentedString(overtime)).append("\n");
    sb.append("    proRata: ").append(toIndentedString(proRata)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    processingFee: ").append(toIndentedString(processingFee)).append("\n");
    sb.append("    adjustment: ").append(toIndentedString(adjustment)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalPaymentCurrency: ").append(toIndentedString(totalPaymentCurrency)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    contractCountry: ").append(toIndentedString(contractCountry)).append("\n");
    sb.append("    contractStartDate: ").append(toIndentedString(contractStartDate)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
    sb.append("    approveDate: ").append(toIndentedString(approveDate)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("general_ledger_account");
    openapiFields.add("team");
    openapiFields.add("contractor_unique_identifier");
    openapiFields.add("contractor_employee_name");
    openapiFields.add("contractor_email");
    openapiFields.add("invoice_number");
    openapiFields.add("currency");
    openapiFields.add("payment_currency");
    openapiFields.add("receipt_number");
    openapiFields.add("work");
    openapiFields.add("bonus");
    openapiFields.add("expenses");
    openapiFields.add("commissions");
    openapiFields.add("deductions");
    openapiFields.add("overtime");
    openapiFields.add("pro_rata");
    openapiFields.add("others");
    openapiFields.add("processing_fee");
    openapiFields.add("adjustment");
    openapiFields.add("total");
    openapiFields.add("total_payment_currency");
    openapiFields.add("payment_date");
    openapiFields.add("frequency");
    openapiFields.add("contract_country");
    openapiFields.add("contract_start_date");
    openapiFields.add("approvers");
    openapiFields.add("approve_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaymentBreakDown
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentBreakDown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentBreakDown is not found in the empty JSON string", PaymentBreakDown.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentBreakDown.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentBreakDown` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("general_ledger_account") != null && !jsonObj.get("general_ledger_account").isJsonNull()) && !jsonObj.get("general_ledger_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `general_ledger_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("general_ledger_account").toString()));
      }
      if ((jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) && !jsonObj.get("team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team").toString()));
      }
      if ((jsonObj.get("contractor_unique_identifier") != null && !jsonObj.get("contractor_unique_identifier").isJsonNull()) && !jsonObj.get("contractor_unique_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_unique_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_unique_identifier").toString()));
      }
      if ((jsonObj.get("contractor_employee_name") != null && !jsonObj.get("contractor_employee_name").isJsonNull()) && !jsonObj.get("contractor_employee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_employee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_employee_name").toString()));
      }
      if ((jsonObj.get("contractor_email") != null && !jsonObj.get("contractor_email").isJsonNull()) && !jsonObj.get("contractor_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_email").toString()));
      }
      if ((jsonObj.get("invoice_number") != null && !jsonObj.get("invoice_number").isJsonNull()) && !jsonObj.get("invoice_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_number").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("payment_currency") != null && !jsonObj.get("payment_currency").isJsonNull()) && !jsonObj.get("payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_currency").toString()));
      }
      if ((jsonObj.get("receipt_number") != null && !jsonObj.get("receipt_number").isJsonNull()) && !jsonObj.get("receipt_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receipt_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receipt_number").toString()));
      }
      if ((jsonObj.get("work") != null && !jsonObj.get("work").isJsonNull()) && !jsonObj.get("work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work").toString()));
      }
      if ((jsonObj.get("bonus") != null && !jsonObj.get("bonus").isJsonNull()) && !jsonObj.get("bonus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bonus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bonus").toString()));
      }
      if ((jsonObj.get("expenses") != null && !jsonObj.get("expenses").isJsonNull()) && !jsonObj.get("expenses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expenses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expenses").toString()));
      }
      if ((jsonObj.get("commissions") != null && !jsonObj.get("commissions").isJsonNull()) && !jsonObj.get("commissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commissions").toString()));
      }
      if ((jsonObj.get("deductions") != null && !jsonObj.get("deductions").isJsonNull()) && !jsonObj.get("deductions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deductions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deductions").toString()));
      }
      if ((jsonObj.get("overtime") != null && !jsonObj.get("overtime").isJsonNull()) && !jsonObj.get("overtime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overtime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overtime").toString()));
      }
      if ((jsonObj.get("pro_rata") != null && !jsonObj.get("pro_rata").isJsonNull()) && !jsonObj.get("pro_rata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pro_rata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pro_rata").toString()));
      }
      if ((jsonObj.get("others") != null && !jsonObj.get("others").isJsonNull()) && !jsonObj.get("others").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `others` to be a primitive type in the JSON string but got `%s`", jsonObj.get("others").toString()));
      }
      if ((jsonObj.get("processing_fee") != null && !jsonObj.get("processing_fee").isJsonNull()) && !jsonObj.get("processing_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processing_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processing_fee").toString()));
      }
      if ((jsonObj.get("adjustment") != null && !jsonObj.get("adjustment").isJsonNull()) && !jsonObj.get("adjustment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment").toString()));
      }
      if ((jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) && !jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      if ((jsonObj.get("total_payment_currency") != null && !jsonObj.get("total_payment_currency").isJsonNull()) && !jsonObj.get("total_payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_payment_currency").toString()));
      }
      if ((jsonObj.get("payment_date") != null && !jsonObj.get("payment_date").isJsonNull()) && !jsonObj.get("payment_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_date").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("contract_country") != null && !jsonObj.get("contract_country").isJsonNull()) && !jsonObj.get("contract_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_country").toString()));
      }
      if ((jsonObj.get("contract_start_date") != null && !jsonObj.get("contract_start_date").isJsonNull()) && !jsonObj.get("contract_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_start_date").toString()));
      }
      if ((jsonObj.get("approvers") != null && !jsonObj.get("approvers").isJsonNull()) && !jsonObj.get("approvers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }
      if ((jsonObj.get("approve_date") != null && !jsonObj.get("approve_date").isJsonNull()) && !jsonObj.get("approve_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approve_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approve_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentBreakDown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentBreakDown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentBreakDown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentBreakDown.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentBreakDown>() {
           @Override
           public void write(JsonWriter out, PaymentBreakDown value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentBreakDown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaymentBreakDown given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentBreakDown
   * @throws IOException if the JSON string is invalid with respect to PaymentBreakDown
   */
  public static PaymentBreakDown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentBreakDown.class);
  }

  /**
   * Convert an instance of PaymentBreakDown to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

