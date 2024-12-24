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
 * GetShifts200ResponseDataInnerSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class GetShifts200ResponseDataInnerSummary {
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

  public GetShifts200ResponseDataInnerSummary() {
  }

  public GetShifts200ResponseDataInnerSummary totalBreakHours(@javax.annotation.Nullable BigDecimal totalBreakHours) {
    this.totalBreakHours = totalBreakHours;
    return this;
  }

  /**
   * Total break hours within the shift.
   * @return totalBreakHours
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalBreakHours() {
    return totalBreakHours;
  }

  public void setTotalBreakHours(@javax.annotation.Nullable BigDecimal totalBreakHours) {
    this.totalBreakHours = totalBreakHours;
  }


  public GetShifts200ResponseDataInnerSummary payableBreakHours(@javax.annotation.Nullable BigDecimal payableBreakHours) {
    this.payableBreakHours = payableBreakHours;
    return this;
  }

  /**
   * Total payable break hours.
   * @return payableBreakHours
   */
  @javax.annotation.Nullable
  public BigDecimal getPayableBreakHours() {
    return payableBreakHours;
  }

  public void setPayableBreakHours(@javax.annotation.Nullable BigDecimal payableBreakHours) {
    this.payableBreakHours = payableBreakHours;
  }


  public GetShifts200ResponseDataInnerSummary totalPayableHours(@javax.annotation.Nullable BigDecimal totalPayableHours) {
    this.totalPayableHours = totalPayableHours;
    return this;
  }

  /**
   * Total payable hours for the shift.
   * @return totalPayableHours
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalPayableHours() {
    return totalPayableHours;
  }

  public void setTotalPayableHours(@javax.annotation.Nullable BigDecimal totalPayableHours) {
    this.totalPayableHours = totalPayableHours;
  }


  public GetShifts200ResponseDataInnerSummary shiftDurationHours(@javax.annotation.Nullable BigDecimal shiftDurationHours) {
    this.shiftDurationHours = shiftDurationHours;
    return this;
  }

  /**
   * Total duration of the shift in hours.
   * @return shiftDurationHours
   */
  @javax.annotation.Nullable
  public BigDecimal getShiftDurationHours() {
    return shiftDurationHours;
  }

  public void setShiftDurationHours(@javax.annotation.Nullable BigDecimal shiftDurationHours) {
    this.shiftDurationHours = shiftDurationHours;
  }


  public GetShifts200ResponseDataInnerSummary shiftRateExternalId(@javax.annotation.Nullable String shiftRateExternalId) {
    this.shiftRateExternalId = shiftRateExternalId;
    return this;
  }

  /**
   * External ID of the shift rate associated with the shift.
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
    GetShifts200ResponseDataInnerSummary getShifts200ResponseDataInnerSummary = (GetShifts200ResponseDataInnerSummary) o;
    return Objects.equals(this.totalBreakHours, getShifts200ResponseDataInnerSummary.totalBreakHours) &&
        Objects.equals(this.payableBreakHours, getShifts200ResponseDataInnerSummary.payableBreakHours) &&
        Objects.equals(this.totalPayableHours, getShifts200ResponseDataInnerSummary.totalPayableHours) &&
        Objects.equals(this.shiftDurationHours, getShifts200ResponseDataInnerSummary.shiftDurationHours) &&
        Objects.equals(this.shiftRateExternalId, getShifts200ResponseDataInnerSummary.shiftRateExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBreakHours, payableBreakHours, totalPayableHours, shiftDurationHours, shiftRateExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShifts200ResponseDataInnerSummary {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetShifts200ResponseDataInnerSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetShifts200ResponseDataInnerSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetShifts200ResponseDataInnerSummary is not found in the empty JSON string", GetShifts200ResponseDataInnerSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetShifts200ResponseDataInnerSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetShifts200ResponseDataInnerSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetShifts200ResponseDataInnerSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetShifts200ResponseDataInnerSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetShifts200ResponseDataInnerSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetShifts200ResponseDataInnerSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<GetShifts200ResponseDataInnerSummary>() {
           @Override
           public void write(JsonWriter out, GetShifts200ResponseDataInnerSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetShifts200ResponseDataInnerSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetShifts200ResponseDataInnerSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetShifts200ResponseDataInnerSummary
   * @throws IOException if the JSON string is invalid with respect to GetShifts200ResponseDataInnerSummary
   */
  public static GetShifts200ResponseDataInnerSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetShifts200ResponseDataInnerSummary.class);
  }

  /**
   * Convert an instance of GetShifts200ResponseDataInnerSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

