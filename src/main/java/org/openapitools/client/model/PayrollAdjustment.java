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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.AdjustmentStatusEnum;
import org.openapitools.client.model.CreateAdjustment201ResponseDataFile;
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
 * PayrollAdjustment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class PayrollAdjustment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private String amount;

  public static final String SERIALIZED_NAME_DATE_OF_ADJUSTMENT = "date_of_adjustment";
  @SerializedName(SERIALIZED_NAME_DATE_OF_ADJUSTMENT)
  @javax.annotation.Nullable
  private LocalDate dateOfAdjustment;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nullable
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_CYCLE_REFERENCE = "cycle_reference";
  @SerializedName(SERIALIZED_NAME_CYCLE_REFERENCE)
  @javax.annotation.Nullable
  private String cycleReference;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private AdjustmentStatusEnum status;

  public static final String SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID = "adjustment_category_id";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID)
  @javax.annotation.Nullable
  private String adjustmentCategoryId;

  public static final String SERIALIZED_NAME_ACTUAL_START_CYCLE_DATE = "actual_start_cycle_date";
  @SerializedName(SERIALIZED_NAME_ACTUAL_START_CYCLE_DATE)
  @javax.annotation.Nullable
  private String actualStartCycleDate;

  public static final String SERIALIZED_NAME_ACTUAL_END_CYCLE_DATE = "actual_end_cycle_date";
  @SerializedName(SERIALIZED_NAME_ACTUAL_END_CYCLE_DATE)
  @javax.annotation.Nullable
  private String actualEndCycleDate;

  public static final String SERIALIZED_NAME_MOVE_NEXT_CYCLE = "move_next_cycle";
  @SerializedName(SERIALIZED_NAME_MOVE_NEXT_CYCLE)
  @javax.annotation.Nullable
  private Boolean moveNextCycle;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nullable
  private CreateAdjustment201ResponseDataFile _file;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime updatedAt;

  public PayrollAdjustment() {
  }

  public PayrollAdjustment id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the adjustment
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public PayrollAdjustment contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * The identifier of the contract associated with the adjustment
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public PayrollAdjustment amount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the adjustment
   * @return amount
   */
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
  }


  public PayrollAdjustment dateOfAdjustment(@javax.annotation.Nullable LocalDate dateOfAdjustment) {
    this.dateOfAdjustment = dateOfAdjustment;
    return this;
  }

  /**
   * The date of the adjustment
   * @return dateOfAdjustment
   */
  @javax.annotation.Nullable
  public LocalDate getDateOfAdjustment() {
    return dateOfAdjustment;
  }

  public void setDateOfAdjustment(@javax.annotation.Nullable LocalDate dateOfAdjustment) {
    this.dateOfAdjustment = dateOfAdjustment;
  }


  public PayrollAdjustment title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the adjustment
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  public PayrollAdjustment description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the adjustment
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public PayrollAdjustment cycleReference(@javax.annotation.Nullable String cycleReference) {
    this.cycleReference = cycleReference;
    return this;
  }

  /**
   * The reference to the cycle associated with the adjustment
   * @return cycleReference
   */
  @javax.annotation.Nullable
  public String getCycleReference() {
    return cycleReference;
  }

  public void setCycleReference(@javax.annotation.Nullable String cycleReference) {
    this.cycleReference = cycleReference;
  }


  public PayrollAdjustment status(@javax.annotation.Nullable AdjustmentStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public AdjustmentStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable AdjustmentStatusEnum status) {
    this.status = status;
  }


  public PayrollAdjustment adjustmentCategoryId(@javax.annotation.Nullable String adjustmentCategoryId) {
    this.adjustmentCategoryId = adjustmentCategoryId;
    return this;
  }

  /**
   * The identifier of the adjustment category associated with the adjustment
   * @return adjustmentCategoryId
   */
  @javax.annotation.Nullable
  public String getAdjustmentCategoryId() {
    return adjustmentCategoryId;
  }

  public void setAdjustmentCategoryId(@javax.annotation.Nullable String adjustmentCategoryId) {
    this.adjustmentCategoryId = adjustmentCategoryId;
  }


  public PayrollAdjustment actualStartCycleDate(@javax.annotation.Nullable String actualStartCycleDate) {
    this.actualStartCycleDate = actualStartCycleDate;
    return this;
  }

  /**
   * The date of the actual start cycle date
   * @return actualStartCycleDate
   */
  @javax.annotation.Nullable
  public String getActualStartCycleDate() {
    return actualStartCycleDate;
  }

  public void setActualStartCycleDate(@javax.annotation.Nullable String actualStartCycleDate) {
    this.actualStartCycleDate = actualStartCycleDate;
  }


  public PayrollAdjustment actualEndCycleDate(@javax.annotation.Nullable String actualEndCycleDate) {
    this.actualEndCycleDate = actualEndCycleDate;
    return this;
  }

  /**
   * The date of the actual end cycle date
   * @return actualEndCycleDate
   */
  @javax.annotation.Nullable
  public String getActualEndCycleDate() {
    return actualEndCycleDate;
  }

  public void setActualEndCycleDate(@javax.annotation.Nullable String actualEndCycleDate) {
    this.actualEndCycleDate = actualEndCycleDate;
  }


  public PayrollAdjustment moveNextCycle(@javax.annotation.Nullable Boolean moveNextCycle) {
    this.moveNextCycle = moveNextCycle;
    return this;
  }

  /**
   * If an adjustments can belong to another payroll cycle
   * @return moveNextCycle
   */
  @javax.annotation.Nullable
  public Boolean getMoveNextCycle() {
    return moveNextCycle;
  }

  public void setMoveNextCycle(@javax.annotation.Nullable Boolean moveNextCycle) {
    this.moveNextCycle = moveNextCycle;
  }


  public PayrollAdjustment _file(@javax.annotation.Nullable CreateAdjustment201ResponseDataFile _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nullable
  public CreateAdjustment201ResponseDataFile getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nullable CreateAdjustment201ResponseDataFile _file) {
    this._file = _file;
  }


  public PayrollAdjustment createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time when the adjustment was created
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PayrollAdjustment updatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time when the adjustment was last updated
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
    PayrollAdjustment payrollAdjustment = (PayrollAdjustment) o;
    return Objects.equals(this.id, payrollAdjustment.id) &&
        Objects.equals(this.contractId, payrollAdjustment.contractId) &&
        Objects.equals(this.amount, payrollAdjustment.amount) &&
        Objects.equals(this.dateOfAdjustment, payrollAdjustment.dateOfAdjustment) &&
        Objects.equals(this.title, payrollAdjustment.title) &&
        Objects.equals(this.description, payrollAdjustment.description) &&
        Objects.equals(this.cycleReference, payrollAdjustment.cycleReference) &&
        Objects.equals(this.status, payrollAdjustment.status) &&
        Objects.equals(this.adjustmentCategoryId, payrollAdjustment.adjustmentCategoryId) &&
        Objects.equals(this.actualStartCycleDate, payrollAdjustment.actualStartCycleDate) &&
        Objects.equals(this.actualEndCycleDate, payrollAdjustment.actualEndCycleDate) &&
        Objects.equals(this.moveNextCycle, payrollAdjustment.moveNextCycle) &&
        Objects.equals(this._file, payrollAdjustment._file) &&
        Objects.equals(this.createdAt, payrollAdjustment.createdAt) &&
        Objects.equals(this.updatedAt, payrollAdjustment.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contractId, amount, dateOfAdjustment, title, description, cycleReference, status, adjustmentCategoryId, actualStartCycleDate, actualEndCycleDate, moveNextCycle, _file, createdAt, updatedAt);
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
    sb.append("class PayrollAdjustment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateOfAdjustment: ").append(toIndentedString(dateOfAdjustment)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cycleReference: ").append(toIndentedString(cycleReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    adjustmentCategoryId: ").append(toIndentedString(adjustmentCategoryId)).append("\n");
    sb.append("    actualStartCycleDate: ").append(toIndentedString(actualStartCycleDate)).append("\n");
    sb.append("    actualEndCycleDate: ").append(toIndentedString(actualEndCycleDate)).append("\n");
    sb.append("    moveNextCycle: ").append(toIndentedString(moveNextCycle)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("contract_id");
    openapiFields.add("amount");
    openapiFields.add("date_of_adjustment");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("cycle_reference");
    openapiFields.add("status");
    openapiFields.add("adjustment_category_id");
    openapiFields.add("actual_start_cycle_date");
    openapiFields.add("actual_end_cycle_date");
    openapiFields.add("move_next_cycle");
    openapiFields.add("file");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PayrollAdjustment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PayrollAdjustment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayrollAdjustment is not found in the empty JSON string", PayrollAdjustment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PayrollAdjustment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PayrollAdjustment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("cycle_reference") != null && !jsonObj.get("cycle_reference").isJsonNull()) && !jsonObj.get("cycle_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_reference").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        AdjustmentStatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("adjustment_category_id") != null && !jsonObj.get("adjustment_category_id").isJsonNull()) && !jsonObj.get("adjustment_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment_category_id").toString()));
      }
      if ((jsonObj.get("actual_start_cycle_date") != null && !jsonObj.get("actual_start_cycle_date").isJsonNull()) && !jsonObj.get("actual_start_cycle_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_start_cycle_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_start_cycle_date").toString()));
      }
      if ((jsonObj.get("actual_end_cycle_date") != null && !jsonObj.get("actual_end_cycle_date").isJsonNull()) && !jsonObj.get("actual_end_cycle_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_end_cycle_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_end_cycle_date").toString()));
      }
      // validate the optional field `file`
      if (jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) {
        CreateAdjustment201ResponseDataFile.validateJsonElement(jsonObj.get("file"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayrollAdjustment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayrollAdjustment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayrollAdjustment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayrollAdjustment.class));

       return (TypeAdapter<T>) new TypeAdapter<PayrollAdjustment>() {
           @Override
           public void write(JsonWriter out, PayrollAdjustment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayrollAdjustment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PayrollAdjustment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PayrollAdjustment
   * @throws IOException if the JSON string is invalid with respect to PayrollAdjustment
   */
  public static PayrollAdjustment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayrollAdjustment.class);
  }

  /**
   * Convert an instance of PayrollAdjustment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

