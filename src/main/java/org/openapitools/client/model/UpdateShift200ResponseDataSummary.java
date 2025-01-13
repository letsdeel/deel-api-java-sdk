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
 * UpdateShift200ResponseDataSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateShift200ResponseDataSummary {
  public static final String SERIALIZED_NAME_TOTAL_BREAK_HOURS = "total_break_hours";
  @SerializedName(SERIALIZED_NAME_TOTAL_BREAK_HOURS)
  @javax.annotation.Nullable
  private BigDecimal totalBreakHours;

  public static final String SERIALIZED_NAME_PAYABLE_BREAK_HOURS = "payable_break_hours";
  @SerializedName(SERIALIZED_NAME_PAYABLE_BREAK_HOURS)
  @javax.annotation.Nullable
  private BigDecimal payableBreakHours;

  public static final String SERIALIZED_NAME_TOTAL_PAYABLE_HOURS = "total_payable_hours";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAYABLE_HOURS)
  @javax.annotation.Nullable
  private BigDecimal totalPayableHours;

  public static final String SERIALIZED_NAME_SHIFT_DURATION_HOURS = "shift_duration_hours";
  @SerializedName(SERIALIZED_NAME_SHIFT_DURATION_HOURS)
  @javax.annotation.Nullable
  private BigDecimal shiftDurationHours;

  public static final String SERIALIZED_NAME_SHIFT_RATE_EXTERNAL_ID = "shift_rate_external_id";
  @SerializedName(SERIALIZED_NAME_SHIFT_RATE_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String shiftRateExternalId;

  public UpdateShift200ResponseDataSummary() {
  }

  public UpdateShift200ResponseDataSummary totalBreakHours(@javax.annotation.Nullable BigDecimal totalBreakHours) {
    this.totalBreakHours = totalBreakHours;
    return this;
  }

  /**
   * Total break hours.
   * @return totalBreakHours
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalBreakHours() {
    return totalBreakHours;
  }

  public void setTotalBreakHours(@javax.annotation.Nullable BigDecimal totalBreakHours) {
    this.totalBreakHours = totalBreakHours;
  }


  public UpdateShift200ResponseDataSummary payableBreakHours(@javax.annotation.Nullable BigDecimal payableBreakHours) {
    this.payableBreakHours = payableBreakHours;
    return this;
  }

  /**
   * Payable break hours.
   * @return payableBreakHours
   */
  @javax.annotation.Nullable
  public BigDecimal getPayableBreakHours() {
    return payableBreakHours;
  }

  public void setPayableBreakHours(@javax.annotation.Nullable BigDecimal payableBreakHours) {
    this.payableBreakHours = payableBreakHours;
  }


  public UpdateShift200ResponseDataSummary totalPayableHours(@javax.annotation.Nullable BigDecimal totalPayableHours) {
    this.totalPayableHours = totalPayableHours;
    return this;
  }

  /**
   * Total payable hours.
   * @return totalPayableHours
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalPayableHours() {
    return totalPayableHours;
  }

  public void setTotalPayableHours(@javax.annotation.Nullable BigDecimal totalPayableHours) {
    this.totalPayableHours = totalPayableHours;
  }


  public UpdateShift200ResponseDataSummary shiftDurationHours(@javax.annotation.Nullable BigDecimal shiftDurationHours) {
    this.shiftDurationHours = shiftDurationHours;
    return this;
  }

  /**
   * Shift duration hours.
   * @return shiftDurationHours
   */
  @javax.annotation.Nullable
  public BigDecimal getShiftDurationHours() {
    return shiftDurationHours;
  }

  public void setShiftDurationHours(@javax.annotation.Nullable BigDecimal shiftDurationHours) {
    this.shiftDurationHours = shiftDurationHours;
  }


  public UpdateShift200ResponseDataSummary shiftRateExternalId(@javax.annotation.Nullable String shiftRateExternalId) {
    this.shiftRateExternalId = shiftRateExternalId;
    return this;
  }

  /**
   * ShiftRate external ID.
   * @return shiftRateExternalId
   */
  @javax.annotation.Nullable
  public String getShiftRateExternalId() {
    return shiftRateExternalId;
  }

  public void setShiftRateExternalId(@javax.annotation.Nullable String shiftRateExternalId) {
    this.shiftRateExternalId = shiftRateExternalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShift200ResponseDataSummary updateShift200ResponseDataSummary = (UpdateShift200ResponseDataSummary) o;
    return Objects.equals(this.totalBreakHours, updateShift200ResponseDataSummary.totalBreakHours) &&
        Objects.equals(this.payableBreakHours, updateShift200ResponseDataSummary.payableBreakHours) &&
        Objects.equals(this.totalPayableHours, updateShift200ResponseDataSummary.totalPayableHours) &&
        Objects.equals(this.shiftDurationHours, updateShift200ResponseDataSummary.shiftDurationHours) &&
        Objects.equals(this.shiftRateExternalId, updateShift200ResponseDataSummary.shiftRateExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBreakHours, payableBreakHours, totalPayableHours, shiftDurationHours, shiftRateExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShift200ResponseDataSummary {\n");
    sb.append("    totalBreakHours: ").append(toIndentedString(totalBreakHours)).append("\n");
    sb.append("    payableBreakHours: ").append(toIndentedString(payableBreakHours)).append("\n");
    sb.append("    totalPayableHours: ").append(toIndentedString(totalPayableHours)).append("\n");
    sb.append("    shiftDurationHours: ").append(toIndentedString(shiftDurationHours)).append("\n");
    sb.append("    shiftRateExternalId: ").append(toIndentedString(shiftRateExternalId)).append("\n");
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
    openapiFields.add("total_break_hours");
    openapiFields.add("payable_break_hours");
    openapiFields.add("total_payable_hours");
    openapiFields.add("shift_duration_hours");
    openapiFields.add("shift_rate_external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateShift200ResponseDataSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateShift200ResponseDataSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateShift200ResponseDataSummary is not found in the empty JSON string", UpdateShift200ResponseDataSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateShift200ResponseDataSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateShift200ResponseDataSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("shift_rate_external_id") != null && !jsonObj.get("shift_rate_external_id").isJsonNull()) && !jsonObj.get("shift_rate_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shift_rate_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shift_rate_external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateShift200ResponseDataSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateShift200ResponseDataSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateShift200ResponseDataSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateShift200ResponseDataSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateShift200ResponseDataSummary>() {
           @Override
           public void write(JsonWriter out, UpdateShift200ResponseDataSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateShift200ResponseDataSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateShift200ResponseDataSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateShift200ResponseDataSummary
   * @throws IOException if the JSON string is invalid with respect to UpdateShift200ResponseDataSummary
   */
  public static UpdateShift200ResponseDataSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateShift200ResponseDataSummary.class);
  }

  /**
   * Convert an instance of UpdateShift200ResponseDataSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

