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
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.InvoiceAdjustmentTypeToCreateEnum;
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
 * InvoiceAdjustmentToCreateWithFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:03:48.437639881Z[GMT]", comments = "Generator version: 7.10.0")
public class InvoiceAdjustmentToCreateWithFile {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nonnull
  private String contractId;

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  @javax.annotation.Nonnull
  private LocalDate dateSubmitted;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private InvoiceAdjustmentTypeToCreateEnum type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_PAYMENT_CYCLE_ID = "paymentCycleId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CYCLE_ID)
  @javax.annotation.Nullable
  private BigDecimal paymentCycleId;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nullable
  private File _file;

  public InvoiceAdjustmentToCreateWithFile() {
  }

  public InvoiceAdjustmentToCreateWithFile contractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Id of a Deel contract.
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
  }


  public InvoiceAdjustmentToCreateWithFile dateSubmitted(@javax.annotation.Nonnull LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return dateSubmitted
   */
  @javax.annotation.Nonnull
  public LocalDate getDateSubmitted() {
    return dateSubmitted;
  }

  public void setDateSubmitted(@javax.annotation.Nonnull LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
  }


  public InvoiceAdjustmentToCreateWithFile type(@javax.annotation.Nonnull InvoiceAdjustmentTypeToCreateEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public InvoiceAdjustmentTypeToCreateEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull InvoiceAdjustmentTypeToCreateEnum type) {
    this.type = type;
  }


  public InvoiceAdjustmentToCreateWithFile amount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount to be paid. Must be a positive number.
   * minimum: 0
   * @return amount
   */
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
  }


  public InvoiceAdjustmentToCreateWithFile description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the adjustment.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public InvoiceAdjustmentToCreateWithFile paymentCycleId(@javax.annotation.Nullable BigDecimal paymentCycleId) {
    this.paymentCycleId = paymentCycleId;
    return this;
  }

  /**
   * ID of an existing active payment cycle - required if type is \&quot;vat\&quot;
   * @return paymentCycleId
   */
  @javax.annotation.Nullable
  public BigDecimal getPaymentCycleId() {
    return paymentCycleId;
  }

  public void setPaymentCycleId(@javax.annotation.Nullable BigDecimal paymentCycleId) {
    this.paymentCycleId = paymentCycleId;
  }


  public InvoiceAdjustmentToCreateWithFile _file(@javax.annotation.Nullable File _file) {
    this._file = _file;
    return this;
  }

  /**
   * Upload the file you want to attach to this entry.
   * @return _file
   */
  @javax.annotation.Nullable
  public File getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nullable File _file) {
    this._file = _file;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceAdjustmentToCreateWithFile invoiceAdjustmentToCreateWithFile = (InvoiceAdjustmentToCreateWithFile) o;
    return Objects.equals(this.contractId, invoiceAdjustmentToCreateWithFile.contractId) &&
        Objects.equals(this.dateSubmitted, invoiceAdjustmentToCreateWithFile.dateSubmitted) &&
        Objects.equals(this.type, invoiceAdjustmentToCreateWithFile.type) &&
        Objects.equals(this.amount, invoiceAdjustmentToCreateWithFile.amount) &&
        Objects.equals(this.description, invoiceAdjustmentToCreateWithFile.description) &&
        Objects.equals(this.paymentCycleId, invoiceAdjustmentToCreateWithFile.paymentCycleId) &&
        Objects.equals(this._file, invoiceAdjustmentToCreateWithFile._file);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, dateSubmitted, type, amount, description, paymentCycleId, _file);
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
    sb.append("class InvoiceAdjustmentToCreateWithFile {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    paymentCycleId: ").append(toIndentedString(paymentCycleId)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("contract_id");
    openapiFields.add("date_submitted");
    openapiFields.add("type");
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("paymentCycleId");
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_id");
    openapiRequiredFields.add("date_submitted");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentToCreateWithFile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceAdjustmentToCreateWithFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceAdjustmentToCreateWithFile is not found in the empty JSON string", InvoiceAdjustmentToCreateWithFile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceAdjustmentToCreateWithFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceAdjustmentToCreateWithFile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceAdjustmentToCreateWithFile.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      // validate the required field `type`
      InvoiceAdjustmentTypeToCreateEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceAdjustmentToCreateWithFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceAdjustmentToCreateWithFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceAdjustmentToCreateWithFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceAdjustmentToCreateWithFile.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentToCreateWithFile>() {
           @Override
           public void write(JsonWriter out, InvoiceAdjustmentToCreateWithFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceAdjustmentToCreateWithFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceAdjustmentToCreateWithFile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceAdjustmentToCreateWithFile
   * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentToCreateWithFile
   */
  public static InvoiceAdjustmentToCreateWithFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentToCreateWithFile.class);
  }

  /**
   * Convert an instance of InvoiceAdjustmentToCreateWithFile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

