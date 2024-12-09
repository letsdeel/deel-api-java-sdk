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
import org.openapitools.client.model.InvoiceStatusEnum;

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
 * Invoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class Invoice {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private InvoiceStatusEnum status;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DEEL_FEE = "deel_fee";
  @SerializedName(SERIALIZED_NAME_DEEL_FEE)
  private String deelFee;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_PAID_AT = "paid_at";
  @SerializedName(SERIALIZED_NAME_PAID_AT)
  private OffsetDateTime paidAt;

  public static final String SERIALIZED_NAME_VAT_TOTAL = "vat_total";
  @SerializedName(SERIALIZED_NAME_VAT_TOTAL)
  private String vatTotal;

  public static final String SERIALIZED_NAME_VAT_PERCENTAGE = "vat_percentage";
  @SerializedName(SERIALIZED_NAME_VAT_PERCENTAGE)
  private String vatPercentage;

  public static final String SERIALIZED_NAME_IS_OVERDUE = "is_overdue";
  @SerializedName(SERIALIZED_NAME_IS_OVERDUE)
  private Boolean isOverdue;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_VAT_ID = "vat_id";
  @SerializedName(SERIALIZED_NAME_VAT_ID)
  private String vatId;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private String contractId;

  public Invoice() {
  }

  public Invoice id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the invoice.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Invoice status(InvoiceStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public InvoiceStatusEnum getStatus() {
    return status;
  }

  public void setStatus(InvoiceStatusEnum status) {
    this.status = status;
  }


  public Invoice currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code.
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Invoice createdAt(OffsetDateTime createdAt) {
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

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Invoice total(String total) {
    this.total = total;
    return this;
  }

  /**
   * Total invoice amount including Fee and VAT.
   * @return total
   */
  @javax.annotation.Nonnull
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  public Invoice amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Billed amount.
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Invoice deelFee(String deelFee) {
    this.deelFee = deelFee;
    return this;
  }

  /**
   * Deel fee.
   * @return deelFee
   */
  @javax.annotation.Nonnull
  public String getDeelFee() {
    return deelFee;
  }

  public void setDeelFee(String deelFee) {
    this.deelFee = deelFee;
  }


  public Invoice label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label of the invoice.
   * @return label
   */
  @javax.annotation.Nonnull
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Invoice paidAt(OffsetDateTime paidAt) {
    this.paidAt = paidAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return paidAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPaidAt() {
    return paidAt;
  }

  public void setPaidAt(OffsetDateTime paidAt) {
    this.paidAt = paidAt;
  }


  public Invoice vatTotal(String vatTotal) {
    this.vatTotal = vatTotal;
    return this;
  }

  /**
   * Amount of VAT.
   * @return vatTotal
   */
  @javax.annotation.Nullable
  public String getVatTotal() {
    return vatTotal;
  }

  public void setVatTotal(String vatTotal) {
    this.vatTotal = vatTotal;
  }


  public Invoice vatPercentage(String vatPercentage) {
    this.vatPercentage = vatPercentage;
    return this;
  }

  /**
   * VAT percentage.
   * @return vatPercentage
   */
  @javax.annotation.Nullable
  public String getVatPercentage() {
    return vatPercentage;
  }

  public void setVatPercentage(String vatPercentage) {
    this.vatPercentage = vatPercentage;
  }


  public Invoice isOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
    return this;
  }

  /**
   * Indicates if the invoice is overdue.
   * @return isOverdue
   */
  @javax.annotation.Nullable
  public Boolean getIsOverdue() {
    return isOverdue;
  }

  public void setIsOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
  }


  public Invoice issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return issuedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public Invoice vatId(String vatId) {
    this.vatId = vatId;
    return this;
  }

  /**
   * VAT identification number.
   * @return vatId
   */
  @javax.annotation.Nullable
  public String getVatId() {
    return vatId;
  }

  public void setVatId(String vatId) {
    this.vatId = vatId;
  }


  public Invoice dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return dueDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public Invoice contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Unique identifier of the contract. #magic___^_^___line
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.createdAt, invoice.createdAt) &&
        Objects.equals(this.total, invoice.total) &&
        Objects.equals(this.amount, invoice.amount) &&
        Objects.equals(this.deelFee, invoice.deelFee) &&
        Objects.equals(this.label, invoice.label) &&
        Objects.equals(this.paidAt, invoice.paidAt) &&
        Objects.equals(this.vatTotal, invoice.vatTotal) &&
        Objects.equals(this.vatPercentage, invoice.vatPercentage) &&
        Objects.equals(this.isOverdue, invoice.isOverdue) &&
        Objects.equals(this.issuedAt, invoice.issuedAt) &&
        Objects.equals(this.vatId, invoice.vatId) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.contractId, invoice.contractId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, currency, createdAt, total, amount, deelFee, label, paidAt, vatTotal, vatPercentage, isOverdue, issuedAt, vatId, dueDate, contractId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deelFee: ").append(toIndentedString(deelFee)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    vatTotal: ").append(toIndentedString(vatTotal)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    vatId: ").append(toIndentedString(vatId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("currency");
    openapiFields.add("created_at");
    openapiFields.add("total");
    openapiFields.add("amount");
    openapiFields.add("deel_fee");
    openapiFields.add("label");
    openapiFields.add("paid_at");
    openapiFields.add("vat_total");
    openapiFields.add("vat_percentage");
    openapiFields.add("is_overdue");
    openapiFields.add("issued_at");
    openapiFields.add("vat_id");
    openapiFields.add("due_date");
    openapiFields.add("contract_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("deel_fee");
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("paid_at");
    openapiRequiredFields.add("vat_total");
    openapiRequiredFields.add("vat_percentage");
    openapiRequiredFields.add("is_overdue");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("vat_id");
    openapiRequiredFields.add("due_date");
    openapiRequiredFields.add("contract_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Invoice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Invoice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invoice is not found in the empty JSON string", Invoice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Invoice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Invoice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Invoice.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `status`
      InvoiceStatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("deel_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deel_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deel_fee").toString()));
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("vat_total") != null && !jsonObj.get("vat_total").isJsonNull()) && !jsonObj.get("vat_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_total").toString()));
      }
      if ((jsonObj.get("vat_percentage") != null && !jsonObj.get("vat_percentage").isJsonNull()) && !jsonObj.get("vat_percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_percentage").toString()));
      }
      if ((jsonObj.get("vat_id") != null && !jsonObj.get("vat_id").isJsonNull()) && !jsonObj.get("vat_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_id").toString()));
      }
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invoice.class));

       return (TypeAdapter<T>) new TypeAdapter<Invoice>() {
           @Override
           public void write(JsonWriter out, Invoice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Invoice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Invoice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Invoice
   * @throws IOException if the JSON string is invalid with respect to Invoice
   */
  public static Invoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invoice.class);
  }

  /**
   * Convert an instance of Invoice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

