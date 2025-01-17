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
import java.time.OffsetDateTime;
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
 * WorkerBankAccountInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class WorkerBankAccountInfo {
  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nullable
  private String fullName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  @javax.annotation.Nullable
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  @javax.annotation.Nullable
  private String addressLine2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nullable
  private String city;

  public static final String SERIALIZED_NAME_PROVINCE_STATE = "province_state";
  @SerializedName(SERIALIZED_NAME_PROVINCE_STATE)
  @javax.annotation.Nullable
  private String provinceState;

  public static final String SERIALIZED_NAME_POSTAL = "postal";
  @SerializedName(SERIALIZED_NAME_POSTAL)
  @javax.annotation.Nullable
  private String postal;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  @javax.annotation.Nullable
  private String bankName;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String countryCode;

  public static final String SERIALIZED_NAME_BANK_COUNTRY_CODE = "bank_country_code";
  @SerializedName(SERIALIZED_NAME_BANK_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String bankCountryCode;

  public static final String SERIALIZED_NAME_SWIFT_BIC = "swift_bic";
  @SerializedName(SERIALIZED_NAME_SWIFT_BIC)
  @javax.annotation.Nullable
  private String swiftBic;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  @javax.annotation.Nullable
  private String accountNumber;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  @javax.annotation.Nullable
  private String bankCode;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "original_name";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  @javax.annotation.Nullable
  private String originalName;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  @javax.annotation.Nullable
  private String taxId;

  public static final String SERIALIZED_NAME_BRANCH_CODE = "branch_code";
  @SerializedName(SERIALIZED_NAME_BRANCH_CODE)
  @javax.annotation.Nullable
  private String branchCode;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nullable
  private String currencyCode;

  public static final String SERIALIZED_NAME_BANK_BRANCH_NAME = "bank_branch_name";
  @SerializedName(SERIALIZED_NAME_BANK_BRANCH_NAME)
  @javax.annotation.Nullable
  private String bankBranchName;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  @javax.annotation.Nullable
  private String iban;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_RIB_NUMBER = "rib_number";
  @SerializedName(SERIALIZED_NAME_RIB_NUMBER)
  @javax.annotation.Nullable
  private String ribNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  @javax.annotation.Nullable
  private String accountType;

  public static final String SERIALIZED_NAME_ACH_ROUTING_NUMBER = "ach_routing_number";
  @SerializedName(SERIALIZED_NAME_ACH_ROUTING_NUMBER)
  @javax.annotation.Nullable
  private String achRoutingNumber;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public WorkerBankAccountInfo() {
  }

  public WorkerBankAccountInfo fullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the user.
   * @return fullName
   */
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
  }


  public WorkerBankAccountInfo phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The user&#39;s phone number.
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public WorkerBankAccountInfo addressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * The primary address line.
   * @return addressLine1
   */
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public WorkerBankAccountInfo addressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * The secondary address line.
   * @return addressLine2
   */
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public WorkerBankAccountInfo city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * The city of the user&#39;s address.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public WorkerBankAccountInfo provinceState(@javax.annotation.Nullable String provinceState) {
    this.provinceState = provinceState;
    return this;
  }

  /**
   * The state or province of the user&#39;s address.
   * @return provinceState
   */
  @javax.annotation.Nullable
  public String getProvinceState() {
    return provinceState;
  }

  public void setProvinceState(@javax.annotation.Nullable String provinceState) {
    this.provinceState = provinceState;
  }


  public WorkerBankAccountInfo postal(@javax.annotation.Nullable String postal) {
    this.postal = postal;
    return this;
  }

  /**
   * The user&#39;s postal or ZIP code.
   * @return postal
   */
  @javax.annotation.Nullable
  public String getPostal() {
    return postal;
  }

  public void setPostal(@javax.annotation.Nullable String postal) {
    this.postal = postal;
  }


  public WorkerBankAccountInfo bankName(@javax.annotation.Nullable String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Name of the user&#39;s bank.
   * @return bankName
   */
  @javax.annotation.Nullable
  public String getBankName() {
    return bankName;
  }

  public void setBankName(@javax.annotation.Nullable String bankName) {
    this.bankName = bankName;
  }


  public WorkerBankAccountInfo countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The country code of the user.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }


  public WorkerBankAccountInfo bankCountryCode(@javax.annotation.Nullable String bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
    return this;
  }

  /**
   * The country code where the bank is located.
   * @return bankCountryCode
   */
  @javax.annotation.Nullable
  public String getBankCountryCode() {
    return bankCountryCode;
  }

  public void setBankCountryCode(@javax.annotation.Nullable String bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
  }


  public WorkerBankAccountInfo swiftBic(@javax.annotation.Nullable String swiftBic) {
    this.swiftBic = swiftBic;
    return this;
  }

  /**
   * SWIFT/BIC code for the bank.
   * @return swiftBic
   */
  @javax.annotation.Nullable
  public String getSwiftBic() {
    return swiftBic;
  }

  public void setSwiftBic(@javax.annotation.Nullable String swiftBic) {
    this.swiftBic = swiftBic;
  }


  public WorkerBankAccountInfo accountNumber(@javax.annotation.Nullable String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The user&#39;s bank account number.
   * @return accountNumber
   */
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(@javax.annotation.Nullable String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public WorkerBankAccountInfo bankCode(@javax.annotation.Nullable String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * The bank code.
   * @return bankCode
   */
  @javax.annotation.Nullable
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(@javax.annotation.Nullable String bankCode) {
    this.bankCode = bankCode;
  }


  public WorkerBankAccountInfo originalName(@javax.annotation.Nullable String originalName) {
    this.originalName = originalName;
    return this;
  }

  /**
   * The original name of the user.
   * @return originalName
   */
  @javax.annotation.Nullable
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(@javax.annotation.Nullable String originalName) {
    this.originalName = originalName;
  }


  public WorkerBankAccountInfo taxId(@javax.annotation.Nullable String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * The user&#39;s tax identification number.
   * @return taxId
   */
  @javax.annotation.Nullable
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(@javax.annotation.Nullable String taxId) {
    this.taxId = taxId;
  }


  public WorkerBankAccountInfo branchCode(@javax.annotation.Nullable String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

  /**
   * The branch code of the user&#39;s bank.
   * @return branchCode
   */
  @javax.annotation.Nullable
  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(@javax.annotation.Nullable String branchCode) {
    this.branchCode = branchCode;
  }


  public WorkerBankAccountInfo currencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency code for transactions.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public WorkerBankAccountInfo bankBranchName(@javax.annotation.Nullable String bankBranchName) {
    this.bankBranchName = bankBranchName;
    return this;
  }

  /**
   * The name of the user&#39;s bank branch.
   * @return bankBranchName
   */
  @javax.annotation.Nullable
  public String getBankBranchName() {
    return bankBranchName;
  }

  public void setBankBranchName(@javax.annotation.Nullable String bankBranchName) {
    this.bankBranchName = bankBranchName;
  }


  public WorkerBankAccountInfo iban(@javax.annotation.Nullable String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * The International Bank Account Number (IBAN).
   * @return iban
   */
  @javax.annotation.Nullable
  public String getIban() {
    return iban;
  }

  public void setIban(@javax.annotation.Nullable String iban) {
    this.iban = iban;
  }


  public WorkerBankAccountInfo email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The user&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public WorkerBankAccountInfo ribNumber(@javax.annotation.Nullable String ribNumber) {
    this.ribNumber = ribNumber;
    return this;
  }

  /**
   * The RIB(Relevé d&#39;Identité Bancaire).
   * @return ribNumber
   */
  @javax.annotation.Nullable
  public String getRibNumber() {
    return ribNumber;
  }

  public void setRibNumber(@javax.annotation.Nullable String ribNumber) {
    this.ribNumber = ribNumber;
  }


  public WorkerBankAccountInfo accountType(@javax.annotation.Nullable String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Bank account type.
   * @return accountType
   */
  @javax.annotation.Nullable
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(@javax.annotation.Nullable String accountType) {
    this.accountType = accountType;
  }


  public WorkerBankAccountInfo achRoutingNumber(@javax.annotation.Nullable String achRoutingNumber) {
    this.achRoutingNumber = achRoutingNumber;
    return this;
  }

  /**
   * The ACH (Automated Clearing House) Routing Number.
   * @return achRoutingNumber
   */
  @javax.annotation.Nullable
  public String getAchRoutingNumber() {
    return achRoutingNumber;
  }

  public void setAchRoutingNumber(@javax.annotation.Nullable String achRoutingNumber) {
    this.achRoutingNumber = achRoutingNumber;
  }


  public WorkerBankAccountInfo id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public WorkerBankAccountInfo createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WorkerBankAccountInfo updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WorkerBankAccountInfo status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of bank account
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerBankAccountInfo workerBankAccountInfo = (WorkerBankAccountInfo) o;
    return Objects.equals(this.fullName, workerBankAccountInfo.fullName) &&
        Objects.equals(this.phone, workerBankAccountInfo.phone) &&
        Objects.equals(this.addressLine1, workerBankAccountInfo.addressLine1) &&
        Objects.equals(this.addressLine2, workerBankAccountInfo.addressLine2) &&
        Objects.equals(this.city, workerBankAccountInfo.city) &&
        Objects.equals(this.provinceState, workerBankAccountInfo.provinceState) &&
        Objects.equals(this.postal, workerBankAccountInfo.postal) &&
        Objects.equals(this.bankName, workerBankAccountInfo.bankName) &&
        Objects.equals(this.countryCode, workerBankAccountInfo.countryCode) &&
        Objects.equals(this.bankCountryCode, workerBankAccountInfo.bankCountryCode) &&
        Objects.equals(this.swiftBic, workerBankAccountInfo.swiftBic) &&
        Objects.equals(this.accountNumber, workerBankAccountInfo.accountNumber) &&
        Objects.equals(this.bankCode, workerBankAccountInfo.bankCode) &&
        Objects.equals(this.originalName, workerBankAccountInfo.originalName) &&
        Objects.equals(this.taxId, workerBankAccountInfo.taxId) &&
        Objects.equals(this.branchCode, workerBankAccountInfo.branchCode) &&
        Objects.equals(this.currencyCode, workerBankAccountInfo.currencyCode) &&
        Objects.equals(this.bankBranchName, workerBankAccountInfo.bankBranchName) &&
        Objects.equals(this.iban, workerBankAccountInfo.iban) &&
        Objects.equals(this.email, workerBankAccountInfo.email) &&
        Objects.equals(this.ribNumber, workerBankAccountInfo.ribNumber) &&
        Objects.equals(this.accountType, workerBankAccountInfo.accountType) &&
        Objects.equals(this.achRoutingNumber, workerBankAccountInfo.achRoutingNumber) &&
        Objects.equals(this.id, workerBankAccountInfo.id) &&
        Objects.equals(this.createdAt, workerBankAccountInfo.createdAt) &&
        Objects.equals(this.updatedAt, workerBankAccountInfo.updatedAt) &&
        Objects.equals(this.status, workerBankAccountInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, phone, addressLine1, addressLine2, city, provinceState, postal, bankName, countryCode, bankCountryCode, swiftBic, accountNumber, bankCode, originalName, taxId, branchCode, currencyCode, bankBranchName, iban, email, ribNumber, accountType, achRoutingNumber, id, createdAt, updatedAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerBankAccountInfo {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    provinceState: ").append(toIndentedString(provinceState)).append("\n");
    sb.append("    postal: ").append(toIndentedString(postal)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    bankCountryCode: ").append(toIndentedString(bankCountryCode)).append("\n");
    sb.append("    swiftBic: ").append(toIndentedString(swiftBic)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    bankBranchName: ").append(toIndentedString(bankBranchName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ribNumber: ").append(toIndentedString(ribNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    achRoutingNumber: ").append(toIndentedString(achRoutingNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("full_name");
    openapiFields.add("phone");
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("city");
    openapiFields.add("province_state");
    openapiFields.add("postal");
    openapiFields.add("bank_name");
    openapiFields.add("country_code");
    openapiFields.add("bank_country_code");
    openapiFields.add("swift_bic");
    openapiFields.add("account_number");
    openapiFields.add("bank_code");
    openapiFields.add("original_name");
    openapiFields.add("tax_id");
    openapiFields.add("branch_code");
    openapiFields.add("currency_code");
    openapiFields.add("bank_branch_name");
    openapiFields.add("iban");
    openapiFields.add("email");
    openapiFields.add("rib_number");
    openapiFields.add("account_type");
    openapiFields.add("ach_routing_number");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkerBankAccountInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkerBankAccountInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerBankAccountInfo is not found in the empty JSON string", WorkerBankAccountInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkerBankAccountInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkerBankAccountInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkerBankAccountInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("address_line1") != null && !jsonObj.get("address_line1").isJsonNull()) && !jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if ((jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("province_state") != null && !jsonObj.get("province_state").isJsonNull()) && !jsonObj.get("province_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_state").toString()));
      }
      if ((jsonObj.get("postal") != null && !jsonObj.get("postal").isJsonNull()) && !jsonObj.get("postal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal").toString()));
      }
      if ((jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonNull()) && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("bank_country_code") != null && !jsonObj.get("bank_country_code").isJsonNull()) && !jsonObj.get("bank_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_country_code").toString()));
      }
      if ((jsonObj.get("swift_bic") != null && !jsonObj.get("swift_bic").isJsonNull()) && !jsonObj.get("swift_bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swift_bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swift_bic").toString()));
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("bank_code") != null && !jsonObj.get("bank_code").isJsonNull()) && !jsonObj.get("bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_code").toString()));
      }
      if ((jsonObj.get("original_name") != null && !jsonObj.get("original_name").isJsonNull()) && !jsonObj.get("original_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_name").toString()));
      }
      if ((jsonObj.get("tax_id") != null && !jsonObj.get("tax_id").isJsonNull()) && !jsonObj.get("tax_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_id").toString()));
      }
      if ((jsonObj.get("branch_code") != null && !jsonObj.get("branch_code").isJsonNull()) && !jsonObj.get("branch_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch_code").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("bank_branch_name") != null && !jsonObj.get("bank_branch_name").isJsonNull()) && !jsonObj.get("bank_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_branch_name").toString()));
      }
      if ((jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonNull()) && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("rib_number") != null && !jsonObj.get("rib_number").isJsonNull()) && !jsonObj.get("rib_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rib_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rib_number").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("ach_routing_number") != null && !jsonObj.get("ach_routing_number").isJsonNull()) && !jsonObj.get("ach_routing_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ach_routing_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ach_routing_number").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerBankAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerBankAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerBankAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerBankAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerBankAccountInfo>() {
           @Override
           public void write(JsonWriter out, WorkerBankAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerBankAccountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkerBankAccountInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkerBankAccountInfo
   * @throws IOException if the JSON string is invalid with respect to WorkerBankAccountInfo
   */
  public static WorkerBankAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerBankAccountInfo.class);
  }

  /**
   * Convert an instance of WorkerBankAccountInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

