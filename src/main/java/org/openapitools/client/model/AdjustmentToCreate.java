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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.CreateAdjustmentRequestDataAmount;
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
 * Details of adjustment to create
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class AdjustmentToCreate {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nonnull
  private String contractId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private CreateAdjustmentRequestDataAmount amount;

  public static final String SERIALIZED_NAME_DATE_OF_ADJUSTMENT = "date_of_adjustment";
  @SerializedName(SERIALIZED_NAME_DATE_OF_ADJUSTMENT)
  @javax.annotation.Nullable
  private LocalDate dateOfAdjustment;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_CYCLE_REFERENCE = "cycle_reference";
  @SerializedName(SERIALIZED_NAME_CYCLE_REFERENCE)
  @javax.annotation.Nullable
  private String cycleReference;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nonnull
  private File _file;

  public static final String SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID = "adjustment_category_id";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID)
  @javax.annotation.Nonnull
  private String adjustmentCategoryId;

  public static final String SERIALIZED_NAME_MOVE_NEXT_CYCLE = "move_next_cycle";
  @SerializedName(SERIALIZED_NAME_MOVE_NEXT_CYCLE)
  @javax.annotation.Nullable
  private Boolean moveNextCycle;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  @javax.annotation.Nonnull
  private String vendor;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nonnull
  private String country;

  public AdjustmentToCreate() {
  }

  public AdjustmentToCreate contractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * The identifier of the contract associated with the adjustment
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
  }


  public AdjustmentToCreate amount(@javax.annotation.Nonnull CreateAdjustmentRequestDataAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public CreateAdjustmentRequestDataAmount getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull CreateAdjustmentRequestDataAmount amount) {
    this.amount = amount;
  }


  public AdjustmentToCreate dateOfAdjustment(@javax.annotation.Nullable LocalDate dateOfAdjustment) {
    this.dateOfAdjustment = dateOfAdjustment;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return dateOfAdjustment
   */
  @javax.annotation.Nullable
  public LocalDate getDateOfAdjustment() {
    return dateOfAdjustment;
  }

  public void setDateOfAdjustment(@javax.annotation.Nullable LocalDate dateOfAdjustment) {
    this.dateOfAdjustment = dateOfAdjustment;
  }


  public AdjustmentToCreate title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of adjustment.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public AdjustmentToCreate description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of adjustment.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public AdjustmentToCreate cycleReference(@javax.annotation.Nullable String cycleReference) {
    this.cycleReference = cycleReference;
    return this;
  }

  /**
   * Cycle reference of adjustment.
   * @return cycleReference
   */
  @javax.annotation.Nullable
  public String getCycleReference() {
    return cycleReference;
  }

  public void setCycleReference(@javax.annotation.Nullable String cycleReference) {
    this.cycleReference = cycleReference;
  }


  public AdjustmentToCreate _file(@javax.annotation.Nonnull File _file) {
    this._file = _file;
    return this;
  }

  /**
   * File of adjustment.
   * @return _file
   */
  @javax.annotation.Nonnull
  public File getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nonnull File _file) {
    this._file = _file;
  }


  public AdjustmentToCreate adjustmentCategoryId(@javax.annotation.Nonnull String adjustmentCategoryId) {
    this.adjustmentCategoryId = adjustmentCategoryId;
    return this;
  }

  /**
   * Adjustment category id.
   * @return adjustmentCategoryId
   */
  @javax.annotation.Nonnull
  public String getAdjustmentCategoryId() {
    return adjustmentCategoryId;
  }

  public void setAdjustmentCategoryId(@javax.annotation.Nonnull String adjustmentCategoryId) {
    this.adjustmentCategoryId = adjustmentCategoryId;
  }


  public AdjustmentToCreate moveNextCycle(@javax.annotation.Nullable Boolean moveNextCycle) {
    this.moveNextCycle = moveNextCycle;
    return this;
  }

  /**
   * If an adjustments can belong to another payroll cycle.
   * @return moveNextCycle
   */
  @javax.annotation.Nullable
  public Boolean getMoveNextCycle() {
    return moveNextCycle;
  }

  public void setMoveNextCycle(@javax.annotation.Nullable Boolean moveNextCycle) {
    this.moveNextCycle = moveNextCycle;
  }


  public AdjustmentToCreate vendor(@javax.annotation.Nonnull String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Vendor of adjustment.
   * @return vendor
   */
  @javax.annotation.Nonnull
  public String getVendor() {
    return vendor;
  }

  public void setVendor(@javax.annotation.Nonnull String vendor) {
    this.vendor = vendor;
  }


  public AdjustmentToCreate country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code.
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustmentToCreate adjustmentToCreate = (AdjustmentToCreate) o;
    return Objects.equals(this.contractId, adjustmentToCreate.contractId) &&
        Objects.equals(this.amount, adjustmentToCreate.amount) &&
        Objects.equals(this.dateOfAdjustment, adjustmentToCreate.dateOfAdjustment) &&
        Objects.equals(this.title, adjustmentToCreate.title) &&
        Objects.equals(this.description, adjustmentToCreate.description) &&
        Objects.equals(this.cycleReference, adjustmentToCreate.cycleReference) &&
        Objects.equals(this._file, adjustmentToCreate._file) &&
        Objects.equals(this.adjustmentCategoryId, adjustmentToCreate.adjustmentCategoryId) &&
        Objects.equals(this.moveNextCycle, adjustmentToCreate.moveNextCycle) &&
        Objects.equals(this.vendor, adjustmentToCreate.vendor) &&
        Objects.equals(this.country, adjustmentToCreate.country);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, amount, dateOfAdjustment, title, description, cycleReference, _file, adjustmentCategoryId, moveNextCycle, vendor, country);
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
    sb.append("class AdjustmentToCreate {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateOfAdjustment: ").append(toIndentedString(dateOfAdjustment)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cycleReference: ").append(toIndentedString(cycleReference)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    adjustmentCategoryId: ").append(toIndentedString(adjustmentCategoryId)).append("\n");
    sb.append("    moveNextCycle: ").append(toIndentedString(moveNextCycle)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("date_of_adjustment");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("cycle_reference");
    openapiFields.add("file");
    openapiFields.add("adjustment_category_id");
    openapiFields.add("move_next_cycle");
    openapiFields.add("vendor");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("file");
    openapiRequiredFields.add("adjustment_category_id");
    openapiRequiredFields.add("vendor");
    openapiRequiredFields.add("country");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdjustmentToCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdjustmentToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdjustmentToCreate is not found in the empty JSON string", AdjustmentToCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdjustmentToCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdjustmentToCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdjustmentToCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      // validate the required field `amount`
      CreateAdjustmentRequestDataAmount.validateJsonElement(jsonObj.get("amount"));
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("cycle_reference") != null && !jsonObj.get("cycle_reference").isJsonNull()) && !jsonObj.get("cycle_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_reference").toString()));
      }
      if (!jsonObj.get("adjustment_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment_category_id").toString()));
      }
      if (!jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdjustmentToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdjustmentToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdjustmentToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdjustmentToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<AdjustmentToCreate>() {
           @Override
           public void write(JsonWriter out, AdjustmentToCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdjustmentToCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdjustmentToCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdjustmentToCreate
   * @throws IOException if the JSON string is invalid with respect to AdjustmentToCreate
   */
  public static AdjustmentToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdjustmentToCreate.class);
  }

  /**
   * Convert an instance of AdjustmentToCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

