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
 * Post401kSingleDeductionDefinition200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T14:25:45.544976271Z[GMT]", comments = "Generator version: 7.10.0")
public class Post401kSingleDeductionDefinition200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  @javax.annotation.Nullable
  private Boolean isActive;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_EMPLOYMENT_ID = "employment_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_ID)
  @javax.annotation.Nullable
  private String employmentId;

  public static final String SERIALIZED_NAME_PAYROLL_REPORT_COLUMN_ID = "payroll_report_column_id";
  @SerializedName(SERIALIZED_NAME_PAYROLL_REPORT_COLUMN_ID)
  @javax.annotation.Nullable
  private String payrollReportColumnId;

  public Post401kSingleDeductionDefinition200Response() {
  }

  public Post401kSingleDeductionDefinition200Response id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the recurring item.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public Post401kSingleDeductionDefinition200Response amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of the recurring item.
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
  }


  public Post401kSingleDeductionDefinition200Response endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the recurring item, if applicable.
   * @return endDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public Post401kSingleDeductionDefinition200Response isActive(@javax.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the recurring item is active.
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(@javax.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
  }


  public Post401kSingleDeductionDefinition200Response createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the item was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Post401kSingleDeductionDefinition200Response startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the recurring item.
   * @return startDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Post401kSingleDeductionDefinition200Response updatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the item was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Post401kSingleDeductionDefinition200Response employmentId(@javax.annotation.Nullable String employmentId) {
    this.employmentId = employmentId;
    return this;
  }

  /**
   * Unique identifier for the employment associated with the item.
   * @return employmentId
   */
  @javax.annotation.Nullable
  public String getEmploymentId() {
    return employmentId;
  }

  public void setEmploymentId(@javax.annotation.Nullable String employmentId) {
    this.employmentId = employmentId;
  }


  public Post401kSingleDeductionDefinition200Response payrollReportColumnId(@javax.annotation.Nullable String payrollReportColumnId) {
    this.payrollReportColumnId = payrollReportColumnId;
    return this;
  }

  /**
   * Identifier for the payroll report column related to this item.
   * @return payrollReportColumnId
   */
  @javax.annotation.Nullable
  public String getPayrollReportColumnId() {
    return payrollReportColumnId;
  }

  public void setPayrollReportColumnId(@javax.annotation.Nullable String payrollReportColumnId) {
    this.payrollReportColumnId = payrollReportColumnId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post401kSingleDeductionDefinition200Response post401kSingleDeductionDefinition200Response = (Post401kSingleDeductionDefinition200Response) o;
    return Objects.equals(this.id, post401kSingleDeductionDefinition200Response.id) &&
        Objects.equals(this.amount, post401kSingleDeductionDefinition200Response.amount) &&
        Objects.equals(this.endDate, post401kSingleDeductionDefinition200Response.endDate) &&
        Objects.equals(this.isActive, post401kSingleDeductionDefinition200Response.isActive) &&
        Objects.equals(this.createdAt, post401kSingleDeductionDefinition200Response.createdAt) &&
        Objects.equals(this.startDate, post401kSingleDeductionDefinition200Response.startDate) &&
        Objects.equals(this.updatedAt, post401kSingleDeductionDefinition200Response.updatedAt) &&
        Objects.equals(this.employmentId, post401kSingleDeductionDefinition200Response.employmentId) &&
        Objects.equals(this.payrollReportColumnId, post401kSingleDeductionDefinition200Response.payrollReportColumnId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, endDate, isActive, createdAt, startDate, updatedAt, employmentId, payrollReportColumnId);
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
    sb.append("class Post401kSingleDeductionDefinition200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    employmentId: ").append(toIndentedString(employmentId)).append("\n");
    sb.append("    payrollReportColumnId: ").append(toIndentedString(payrollReportColumnId)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("end_date");
    openapiFields.add("is_active");
    openapiFields.add("created_at");
    openapiFields.add("start_date");
    openapiFields.add("updated_at");
    openapiFields.add("employment_id");
    openapiFields.add("payroll_report_column_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Post401kSingleDeductionDefinition200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Post401kSingleDeductionDefinition200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Post401kSingleDeductionDefinition200Response is not found in the empty JSON string", Post401kSingleDeductionDefinition200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Post401kSingleDeductionDefinition200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Post401kSingleDeductionDefinition200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("employment_id") != null && !jsonObj.get("employment_id").isJsonNull()) && !jsonObj.get("employment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_id").toString()));
      }
      if ((jsonObj.get("payroll_report_column_id") != null && !jsonObj.get("payroll_report_column_id").isJsonNull()) && !jsonObj.get("payroll_report_column_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_report_column_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_report_column_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Post401kSingleDeductionDefinition200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Post401kSingleDeductionDefinition200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Post401kSingleDeductionDefinition200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Post401kSingleDeductionDefinition200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Post401kSingleDeductionDefinition200Response>() {
           @Override
           public void write(JsonWriter out, Post401kSingleDeductionDefinition200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Post401kSingleDeductionDefinition200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Post401kSingleDeductionDefinition200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Post401kSingleDeductionDefinition200Response
   * @throws IOException if the JSON string is invalid with respect to Post401kSingleDeductionDefinition200Response
   */
  public static Post401kSingleDeductionDefinition200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Post401kSingleDeductionDefinition200Response.class);
  }

  /**
   * Convert an instance of Post401kSingleDeductionDefinition200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

