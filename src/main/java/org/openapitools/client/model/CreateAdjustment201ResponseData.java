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
 * CreateAdjustment201ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateAdjustment201ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nullable
  private CreateAdjustment201ResponseDataFile _file;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nullable
  private String title;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private String amount;

  /**
   * Adjustment status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPEN("open"),
    
    PENDING_APPROVAL("pending_approval"),
    
    OVERWRITTEN("overwritten"),
    
    FAILED("failed"),
    
    SUCCESS("success");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_CYCLE_REFERENCE = "cycle_reference";
  @SerializedName(SERIALIZED_NAME_CYCLE_REFERENCE)
  @javax.annotation.Nullable
  private String cycleReference;

  public static final String SERIALIZED_NAME_MOVE_NEXT_CYCLE = "move_next_cycle";
  @SerializedName(SERIALIZED_NAME_MOVE_NEXT_CYCLE)
  @javax.annotation.Nullable
  private Boolean moveNextCycle;

  public static final String SERIALIZED_NAME_DATE_OF_ADJUSTMENT = "date_of_adjustment";
  @SerializedName(SERIALIZED_NAME_DATE_OF_ADJUSTMENT)
  @javax.annotation.Nullable
  private LocalDate dateOfAdjustment;

  public static final String SERIALIZED_NAME_ACTUAL_END_CYCLE_DATE = "actual_end_cycle_date";
  @SerializedName(SERIALIZED_NAME_ACTUAL_END_CYCLE_DATE)
  @javax.annotation.Nullable
  private String actualEndCycleDate;

  public static final String SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID = "adjustment_category_id";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_CATEGORY_ID)
  @javax.annotation.Nullable
  private String adjustmentCategoryId;

  public static final String SERIALIZED_NAME_ACTUAL_START_CYCLE_DATE = "actual_start_cycle_date";
  @SerializedName(SERIALIZED_NAME_ACTUAL_START_CYCLE_DATE)
  @javax.annotation.Nullable
  private String actualStartCycleDate;

  public CreateAdjustment201ResponseData() {
  }

  public CreateAdjustment201ResponseData id(@javax.annotation.Nullable String id) {
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


  public CreateAdjustment201ResponseData _file(@javax.annotation.Nullable CreateAdjustment201ResponseDataFile _file) {
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


  public CreateAdjustment201ResponseData title(@javax.annotation.Nullable String title) {
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


  public CreateAdjustment201ResponseData amount(@javax.annotation.Nullable String amount) {
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


  public CreateAdjustment201ResponseData status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Adjustment status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public CreateAdjustment201ResponseData createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
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


  public CreateAdjustment201ResponseData updatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
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


  public CreateAdjustment201ResponseData contractId(@javax.annotation.Nullable String contractId) {
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


  public CreateAdjustment201ResponseData description(@javax.annotation.Nullable String description) {
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


  public CreateAdjustment201ResponseData cycleReference(@javax.annotation.Nullable String cycleReference) {
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


  public CreateAdjustment201ResponseData moveNextCycle(@javax.annotation.Nullable Boolean moveNextCycle) {
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


  public CreateAdjustment201ResponseData dateOfAdjustment(@javax.annotation.Nullable LocalDate dateOfAdjustment) {
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


  public CreateAdjustment201ResponseData actualEndCycleDate(@javax.annotation.Nullable String actualEndCycleDate) {
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


  public CreateAdjustment201ResponseData adjustmentCategoryId(@javax.annotation.Nullable String adjustmentCategoryId) {
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


  public CreateAdjustment201ResponseData actualStartCycleDate(@javax.annotation.Nullable String actualStartCycleDate) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAdjustment201ResponseData createAdjustment201ResponseData = (CreateAdjustment201ResponseData) o;
    return Objects.equals(this.id, createAdjustment201ResponseData.id) &&
        Objects.equals(this._file, createAdjustment201ResponseData._file) &&
        Objects.equals(this.title, createAdjustment201ResponseData.title) &&
        Objects.equals(this.amount, createAdjustment201ResponseData.amount) &&
        Objects.equals(this.status, createAdjustment201ResponseData.status) &&
        Objects.equals(this.createdAt, createAdjustment201ResponseData.createdAt) &&
        Objects.equals(this.updatedAt, createAdjustment201ResponseData.updatedAt) &&
        Objects.equals(this.contractId, createAdjustment201ResponseData.contractId) &&
        Objects.equals(this.description, createAdjustment201ResponseData.description) &&
        Objects.equals(this.cycleReference, createAdjustment201ResponseData.cycleReference) &&
        Objects.equals(this.moveNextCycle, createAdjustment201ResponseData.moveNextCycle) &&
        Objects.equals(this.dateOfAdjustment, createAdjustment201ResponseData.dateOfAdjustment) &&
        Objects.equals(this.actualEndCycleDate, createAdjustment201ResponseData.actualEndCycleDate) &&
        Objects.equals(this.adjustmentCategoryId, createAdjustment201ResponseData.adjustmentCategoryId) &&
        Objects.equals(this.actualStartCycleDate, createAdjustment201ResponseData.actualStartCycleDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _file, title, amount, status, createdAt, updatedAt, contractId, description, cycleReference, moveNextCycle, dateOfAdjustment, actualEndCycleDate, adjustmentCategoryId, actualStartCycleDate);
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
    sb.append("class CreateAdjustment201ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cycleReference: ").append(toIndentedString(cycleReference)).append("\n");
    sb.append("    moveNextCycle: ").append(toIndentedString(moveNextCycle)).append("\n");
    sb.append("    dateOfAdjustment: ").append(toIndentedString(dateOfAdjustment)).append("\n");
    sb.append("    actualEndCycleDate: ").append(toIndentedString(actualEndCycleDate)).append("\n");
    sb.append("    adjustmentCategoryId: ").append(toIndentedString(adjustmentCategoryId)).append("\n");
    sb.append("    actualStartCycleDate: ").append(toIndentedString(actualStartCycleDate)).append("\n");
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
    openapiFields.add("file");
    openapiFields.add("title");
    openapiFields.add("amount");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("contract_id");
    openapiFields.add("description");
    openapiFields.add("cycle_reference");
    openapiFields.add("move_next_cycle");
    openapiFields.add("date_of_adjustment");
    openapiFields.add("actual_end_cycle_date");
    openapiFields.add("adjustment_category_id");
    openapiFields.add("actual_start_cycle_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAdjustment201ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAdjustment201ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAdjustment201ResponseData is not found in the empty JSON string", CreateAdjustment201ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAdjustment201ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAdjustment201ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `file`
      if (jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) {
        CreateAdjustment201ResponseDataFile.validateJsonElement(jsonObj.get("file"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("cycle_reference") != null && !jsonObj.get("cycle_reference").isJsonNull()) && !jsonObj.get("cycle_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_reference").toString()));
      }
      if ((jsonObj.get("actual_end_cycle_date") != null && !jsonObj.get("actual_end_cycle_date").isJsonNull()) && !jsonObj.get("actual_end_cycle_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_end_cycle_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_end_cycle_date").toString()));
      }
      if ((jsonObj.get("adjustment_category_id") != null && !jsonObj.get("adjustment_category_id").isJsonNull()) && !jsonObj.get("adjustment_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment_category_id").toString()));
      }
      if ((jsonObj.get("actual_start_cycle_date") != null && !jsonObj.get("actual_start_cycle_date").isJsonNull()) && !jsonObj.get("actual_start_cycle_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_start_cycle_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_start_cycle_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAdjustment201ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAdjustment201ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAdjustment201ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAdjustment201ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAdjustment201ResponseData>() {
           @Override
           public void write(JsonWriter out, CreateAdjustment201ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAdjustment201ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateAdjustment201ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAdjustment201ResponseData
   * @throws IOException if the JSON string is invalid with respect to CreateAdjustment201ResponseData
   */
  public static CreateAdjustment201ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAdjustment201ResponseData.class);
  }

  /**
   * Convert an instance of CreateAdjustment201ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

