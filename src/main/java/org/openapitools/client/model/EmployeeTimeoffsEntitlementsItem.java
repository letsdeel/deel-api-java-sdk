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
 * EmployeeTimeoffsEntitlementsItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:06:48.603230199Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeeTimeoffsEntitlementsItem {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nonnull
  private BigDecimal year;

  public static final String SERIALIZED_NAME_TRACKING_PERIOD = "tracking_period";
  @SerializedName(SERIALIZED_NAME_TRACKING_PERIOD)
  @javax.annotation.Nonnull
  private String trackingPeriod;

  public static final String SERIALIZED_NAME_VACATION_ALLOWED = "vacation_allowed";
  @SerializedName(SERIALIZED_NAME_VACATION_ALLOWED)
  @javax.annotation.Nonnull
  private String vacationAllowed;

  public static final String SERIALIZED_NAME_VACATION_ROLLOVER = "vacation_rollover";
  @SerializedName(SERIALIZED_NAME_VACATION_ROLLOVER)
  @javax.annotation.Nonnull
  private String vacationRollover;

  public static final String SERIALIZED_NAME_VACATION_EXPIRED = "vacation_expired";
  @SerializedName(SERIALIZED_NAME_VACATION_EXPIRED)
  @javax.annotation.Nonnull
  private String vacationExpired;

  public static final String SERIALIZED_NAME_VACATION_PAYOUT = "vacation_payout";
  @SerializedName(SERIALIZED_NAME_VACATION_PAYOUT)
  @javax.annotation.Nonnull
  private String vacationPayout;

  public static final String SERIALIZED_NAME_VACATION_REQUESTED = "vacation_requested";
  @SerializedName(SERIALIZED_NAME_VACATION_REQUESTED)
  @javax.annotation.Nonnull
  private String vacationRequested;

  public static final String SERIALIZED_NAME_VACATION_APPROVED = "vacation_approved";
  @SerializedName(SERIALIZED_NAME_VACATION_APPROVED)
  @javax.annotation.Nonnull
  private String vacationApproved;

  public static final String SERIALIZED_NAME_VACATION_USED = "vacation_used";
  @SerializedName(SERIALIZED_NAME_VACATION_USED)
  @javax.annotation.Nonnull
  private String vacationUsed;

  public static final String SERIALIZED_NAME_VACATION_TOTAL = "vacation_total";
  @SerializedName(SERIALIZED_NAME_VACATION_TOTAL)
  @javax.annotation.Nonnull
  private String vacationTotal;

  public static final String SERIALIZED_NAME_SICK_LEAVE_REQUESTED = "sick_leave_requested";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_REQUESTED)
  @javax.annotation.Nonnull
  private String sickLeaveRequested;

  public static final String SERIALIZED_NAME_SICK_LEAVE_APPROVED = "sick_leave_approved";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_APPROVED)
  @javax.annotation.Nonnull
  private String sickLeaveApproved;

  public static final String SERIALIZED_NAME_SICK_LEAVE_USED = "sick_leave_used";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_USED)
  @javax.annotation.Nonnull
  private String sickLeaveUsed;

  public static final String SERIALIZED_NAME_SICK_LEAVE_TOTAL = "sick_leave_total";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_TOTAL)
  @javax.annotation.Nonnull
  private String sickLeaveTotal;

  public static final String SERIALIZED_NAME_SICK_LEAVE_ALLOWED = "sick_leave_allowed";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_ALLOWED)
  @javax.annotation.Nonnull
  private String sickLeaveAllowed;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_REQUESTED = "other_leave_requested";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_REQUESTED)
  @javax.annotation.Nonnull
  private String otherLeaveRequested;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_APPROVED = "other_leave_approved";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_APPROVED)
  @javax.annotation.Nonnull
  private String otherLeaveApproved;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_USED = "other_leave_used";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_USED)
  @javax.annotation.Nonnull
  private String otherLeaveUsed;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_TOTAL = "other_leave_total";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_TOTAL)
  @javax.annotation.Nonnull
  private String otherLeaveTotal;

  public EmployeeTimeoffsEntitlementsItem() {
  }

  public EmployeeTimeoffsEntitlementsItem year(@javax.annotation.Nonnull BigDecimal year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  @javax.annotation.Nonnull
  public BigDecimal getYear() {
    return year;
  }

  public void setYear(@javax.annotation.Nonnull BigDecimal year) {
    this.year = year;
  }


  public EmployeeTimeoffsEntitlementsItem trackingPeriod(@javax.annotation.Nonnull String trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
    return this;
  }

  /**
   * Get trackingPeriod
   * @return trackingPeriod
   */
  @javax.annotation.Nonnull
  public String getTrackingPeriod() {
    return trackingPeriod;
  }

  public void setTrackingPeriod(@javax.annotation.Nonnull String trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
  }


  public EmployeeTimeoffsEntitlementsItem vacationAllowed(@javax.annotation.Nonnull String vacationAllowed) {
    this.vacationAllowed = vacationAllowed;
    return this;
  }

  /**
   * Get vacationAllowed
   * @return vacationAllowed
   */
  @javax.annotation.Nonnull
  public String getVacationAllowed() {
    return vacationAllowed;
  }

  public void setVacationAllowed(@javax.annotation.Nonnull String vacationAllowed) {
    this.vacationAllowed = vacationAllowed;
  }


  public EmployeeTimeoffsEntitlementsItem vacationRollover(@javax.annotation.Nonnull String vacationRollover) {
    this.vacationRollover = vacationRollover;
    return this;
  }

  /**
   * Get vacationRollover
   * @return vacationRollover
   */
  @javax.annotation.Nonnull
  public String getVacationRollover() {
    return vacationRollover;
  }

  public void setVacationRollover(@javax.annotation.Nonnull String vacationRollover) {
    this.vacationRollover = vacationRollover;
  }


  public EmployeeTimeoffsEntitlementsItem vacationExpired(@javax.annotation.Nonnull String vacationExpired) {
    this.vacationExpired = vacationExpired;
    return this;
  }

  /**
   * Get vacationExpired
   * @return vacationExpired
   */
  @javax.annotation.Nonnull
  public String getVacationExpired() {
    return vacationExpired;
  }

  public void setVacationExpired(@javax.annotation.Nonnull String vacationExpired) {
    this.vacationExpired = vacationExpired;
  }


  public EmployeeTimeoffsEntitlementsItem vacationPayout(@javax.annotation.Nonnull String vacationPayout) {
    this.vacationPayout = vacationPayout;
    return this;
  }

  /**
   * Get vacationPayout
   * @return vacationPayout
   */
  @javax.annotation.Nonnull
  public String getVacationPayout() {
    return vacationPayout;
  }

  public void setVacationPayout(@javax.annotation.Nonnull String vacationPayout) {
    this.vacationPayout = vacationPayout;
  }


  public EmployeeTimeoffsEntitlementsItem vacationRequested(@javax.annotation.Nonnull String vacationRequested) {
    this.vacationRequested = vacationRequested;
    return this;
  }

  /**
   * Get vacationRequested
   * @return vacationRequested
   */
  @javax.annotation.Nonnull
  public String getVacationRequested() {
    return vacationRequested;
  }

  public void setVacationRequested(@javax.annotation.Nonnull String vacationRequested) {
    this.vacationRequested = vacationRequested;
  }


  public EmployeeTimeoffsEntitlementsItem vacationApproved(@javax.annotation.Nonnull String vacationApproved) {
    this.vacationApproved = vacationApproved;
    return this;
  }

  /**
   * Get vacationApproved
   * @return vacationApproved
   */
  @javax.annotation.Nonnull
  public String getVacationApproved() {
    return vacationApproved;
  }

  public void setVacationApproved(@javax.annotation.Nonnull String vacationApproved) {
    this.vacationApproved = vacationApproved;
  }


  public EmployeeTimeoffsEntitlementsItem vacationUsed(@javax.annotation.Nonnull String vacationUsed) {
    this.vacationUsed = vacationUsed;
    return this;
  }

  /**
   * Get vacationUsed
   * @return vacationUsed
   */
  @javax.annotation.Nonnull
  public String getVacationUsed() {
    return vacationUsed;
  }

  public void setVacationUsed(@javax.annotation.Nonnull String vacationUsed) {
    this.vacationUsed = vacationUsed;
  }


  public EmployeeTimeoffsEntitlementsItem vacationTotal(@javax.annotation.Nonnull String vacationTotal) {
    this.vacationTotal = vacationTotal;
    return this;
  }

  /**
   * Get vacationTotal
   * @return vacationTotal
   */
  @javax.annotation.Nonnull
  public String getVacationTotal() {
    return vacationTotal;
  }

  public void setVacationTotal(@javax.annotation.Nonnull String vacationTotal) {
    this.vacationTotal = vacationTotal;
  }


  public EmployeeTimeoffsEntitlementsItem sickLeaveRequested(@javax.annotation.Nonnull String sickLeaveRequested) {
    this.sickLeaveRequested = sickLeaveRequested;
    return this;
  }

  /**
   * Get sickLeaveRequested
   * @return sickLeaveRequested
   */
  @javax.annotation.Nonnull
  public String getSickLeaveRequested() {
    return sickLeaveRequested;
  }

  public void setSickLeaveRequested(@javax.annotation.Nonnull String sickLeaveRequested) {
    this.sickLeaveRequested = sickLeaveRequested;
  }


  public EmployeeTimeoffsEntitlementsItem sickLeaveApproved(@javax.annotation.Nonnull String sickLeaveApproved) {
    this.sickLeaveApproved = sickLeaveApproved;
    return this;
  }

  /**
   * Get sickLeaveApproved
   * @return sickLeaveApproved
   */
  @javax.annotation.Nonnull
  public String getSickLeaveApproved() {
    return sickLeaveApproved;
  }

  public void setSickLeaveApproved(@javax.annotation.Nonnull String sickLeaveApproved) {
    this.sickLeaveApproved = sickLeaveApproved;
  }


  public EmployeeTimeoffsEntitlementsItem sickLeaveUsed(@javax.annotation.Nonnull String sickLeaveUsed) {
    this.sickLeaveUsed = sickLeaveUsed;
    return this;
  }

  /**
   * Get sickLeaveUsed
   * @return sickLeaveUsed
   */
  @javax.annotation.Nonnull
  public String getSickLeaveUsed() {
    return sickLeaveUsed;
  }

  public void setSickLeaveUsed(@javax.annotation.Nonnull String sickLeaveUsed) {
    this.sickLeaveUsed = sickLeaveUsed;
  }


  public EmployeeTimeoffsEntitlementsItem sickLeaveTotal(@javax.annotation.Nonnull String sickLeaveTotal) {
    this.sickLeaveTotal = sickLeaveTotal;
    return this;
  }

  /**
   * Get sickLeaveTotal
   * @return sickLeaveTotal
   */
  @javax.annotation.Nonnull
  public String getSickLeaveTotal() {
    return sickLeaveTotal;
  }

  public void setSickLeaveTotal(@javax.annotation.Nonnull String sickLeaveTotal) {
    this.sickLeaveTotal = sickLeaveTotal;
  }


  public EmployeeTimeoffsEntitlementsItem sickLeaveAllowed(@javax.annotation.Nonnull String sickLeaveAllowed) {
    this.sickLeaveAllowed = sickLeaveAllowed;
    return this;
  }

  /**
   * Get sickLeaveAllowed
   * @return sickLeaveAllowed
   */
  @javax.annotation.Nonnull
  public String getSickLeaveAllowed() {
    return sickLeaveAllowed;
  }

  public void setSickLeaveAllowed(@javax.annotation.Nonnull String sickLeaveAllowed) {
    this.sickLeaveAllowed = sickLeaveAllowed;
  }


  public EmployeeTimeoffsEntitlementsItem otherLeaveRequested(@javax.annotation.Nonnull String otherLeaveRequested) {
    this.otherLeaveRequested = otherLeaveRequested;
    return this;
  }

  /**
   * Get otherLeaveRequested
   * @return otherLeaveRequested
   */
  @javax.annotation.Nonnull
  public String getOtherLeaveRequested() {
    return otherLeaveRequested;
  }

  public void setOtherLeaveRequested(@javax.annotation.Nonnull String otherLeaveRequested) {
    this.otherLeaveRequested = otherLeaveRequested;
  }


  public EmployeeTimeoffsEntitlementsItem otherLeaveApproved(@javax.annotation.Nonnull String otherLeaveApproved) {
    this.otherLeaveApproved = otherLeaveApproved;
    return this;
  }

  /**
   * Get otherLeaveApproved
   * @return otherLeaveApproved
   */
  @javax.annotation.Nonnull
  public String getOtherLeaveApproved() {
    return otherLeaveApproved;
  }

  public void setOtherLeaveApproved(@javax.annotation.Nonnull String otherLeaveApproved) {
    this.otherLeaveApproved = otherLeaveApproved;
  }


  public EmployeeTimeoffsEntitlementsItem otherLeaveUsed(@javax.annotation.Nonnull String otherLeaveUsed) {
    this.otherLeaveUsed = otherLeaveUsed;
    return this;
  }

  /**
   * Get otherLeaveUsed
   * @return otherLeaveUsed
   */
  @javax.annotation.Nonnull
  public String getOtherLeaveUsed() {
    return otherLeaveUsed;
  }

  public void setOtherLeaveUsed(@javax.annotation.Nonnull String otherLeaveUsed) {
    this.otherLeaveUsed = otherLeaveUsed;
  }


  public EmployeeTimeoffsEntitlementsItem otherLeaveTotal(@javax.annotation.Nonnull String otherLeaveTotal) {
    this.otherLeaveTotal = otherLeaveTotal;
    return this;
  }

  /**
   * Get otherLeaveTotal
   * @return otherLeaveTotal
   */
  @javax.annotation.Nonnull
  public String getOtherLeaveTotal() {
    return otherLeaveTotal;
  }

  public void setOtherLeaveTotal(@javax.annotation.Nonnull String otherLeaveTotal) {
    this.otherLeaveTotal = otherLeaveTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTimeoffsEntitlementsItem employeeTimeoffsEntitlementsItem = (EmployeeTimeoffsEntitlementsItem) o;
    return Objects.equals(this.year, employeeTimeoffsEntitlementsItem.year) &&
        Objects.equals(this.trackingPeriod, employeeTimeoffsEntitlementsItem.trackingPeriod) &&
        Objects.equals(this.vacationAllowed, employeeTimeoffsEntitlementsItem.vacationAllowed) &&
        Objects.equals(this.vacationRollover, employeeTimeoffsEntitlementsItem.vacationRollover) &&
        Objects.equals(this.vacationExpired, employeeTimeoffsEntitlementsItem.vacationExpired) &&
        Objects.equals(this.vacationPayout, employeeTimeoffsEntitlementsItem.vacationPayout) &&
        Objects.equals(this.vacationRequested, employeeTimeoffsEntitlementsItem.vacationRequested) &&
        Objects.equals(this.vacationApproved, employeeTimeoffsEntitlementsItem.vacationApproved) &&
        Objects.equals(this.vacationUsed, employeeTimeoffsEntitlementsItem.vacationUsed) &&
        Objects.equals(this.vacationTotal, employeeTimeoffsEntitlementsItem.vacationTotal) &&
        Objects.equals(this.sickLeaveRequested, employeeTimeoffsEntitlementsItem.sickLeaveRequested) &&
        Objects.equals(this.sickLeaveApproved, employeeTimeoffsEntitlementsItem.sickLeaveApproved) &&
        Objects.equals(this.sickLeaveUsed, employeeTimeoffsEntitlementsItem.sickLeaveUsed) &&
        Objects.equals(this.sickLeaveTotal, employeeTimeoffsEntitlementsItem.sickLeaveTotal) &&
        Objects.equals(this.sickLeaveAllowed, employeeTimeoffsEntitlementsItem.sickLeaveAllowed) &&
        Objects.equals(this.otherLeaveRequested, employeeTimeoffsEntitlementsItem.otherLeaveRequested) &&
        Objects.equals(this.otherLeaveApproved, employeeTimeoffsEntitlementsItem.otherLeaveApproved) &&
        Objects.equals(this.otherLeaveUsed, employeeTimeoffsEntitlementsItem.otherLeaveUsed) &&
        Objects.equals(this.otherLeaveTotal, employeeTimeoffsEntitlementsItem.otherLeaveTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, trackingPeriod, vacationAllowed, vacationRollover, vacationExpired, vacationPayout, vacationRequested, vacationApproved, vacationUsed, vacationTotal, sickLeaveRequested, sickLeaveApproved, sickLeaveUsed, sickLeaveTotal, sickLeaveAllowed, otherLeaveRequested, otherLeaveApproved, otherLeaveUsed, otherLeaveTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTimeoffsEntitlementsItem {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    trackingPeriod: ").append(toIndentedString(trackingPeriod)).append("\n");
    sb.append("    vacationAllowed: ").append(toIndentedString(vacationAllowed)).append("\n");
    sb.append("    vacationRollover: ").append(toIndentedString(vacationRollover)).append("\n");
    sb.append("    vacationExpired: ").append(toIndentedString(vacationExpired)).append("\n");
    sb.append("    vacationPayout: ").append(toIndentedString(vacationPayout)).append("\n");
    sb.append("    vacationRequested: ").append(toIndentedString(vacationRequested)).append("\n");
    sb.append("    vacationApproved: ").append(toIndentedString(vacationApproved)).append("\n");
    sb.append("    vacationUsed: ").append(toIndentedString(vacationUsed)).append("\n");
    sb.append("    vacationTotal: ").append(toIndentedString(vacationTotal)).append("\n");
    sb.append("    sickLeaveRequested: ").append(toIndentedString(sickLeaveRequested)).append("\n");
    sb.append("    sickLeaveApproved: ").append(toIndentedString(sickLeaveApproved)).append("\n");
    sb.append("    sickLeaveUsed: ").append(toIndentedString(sickLeaveUsed)).append("\n");
    sb.append("    sickLeaveTotal: ").append(toIndentedString(sickLeaveTotal)).append("\n");
    sb.append("    sickLeaveAllowed: ").append(toIndentedString(sickLeaveAllowed)).append("\n");
    sb.append("    otherLeaveRequested: ").append(toIndentedString(otherLeaveRequested)).append("\n");
    sb.append("    otherLeaveApproved: ").append(toIndentedString(otherLeaveApproved)).append("\n");
    sb.append("    otherLeaveUsed: ").append(toIndentedString(otherLeaveUsed)).append("\n");
    sb.append("    otherLeaveTotal: ").append(toIndentedString(otherLeaveTotal)).append("\n");
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
    openapiFields.add("year");
    openapiFields.add("tracking_period");
    openapiFields.add("vacation_allowed");
    openapiFields.add("vacation_rollover");
    openapiFields.add("vacation_expired");
    openapiFields.add("vacation_payout");
    openapiFields.add("vacation_requested");
    openapiFields.add("vacation_approved");
    openapiFields.add("vacation_used");
    openapiFields.add("vacation_total");
    openapiFields.add("sick_leave_requested");
    openapiFields.add("sick_leave_approved");
    openapiFields.add("sick_leave_used");
    openapiFields.add("sick_leave_total");
    openapiFields.add("sick_leave_allowed");
    openapiFields.add("other_leave_requested");
    openapiFields.add("other_leave_approved");
    openapiFields.add("other_leave_used");
    openapiFields.add("other_leave_total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("year");
    openapiRequiredFields.add("tracking_period");
    openapiRequiredFields.add("vacation_allowed");
    openapiRequiredFields.add("vacation_rollover");
    openapiRequiredFields.add("vacation_expired");
    openapiRequiredFields.add("vacation_payout");
    openapiRequiredFields.add("vacation_requested");
    openapiRequiredFields.add("vacation_approved");
    openapiRequiredFields.add("vacation_used");
    openapiRequiredFields.add("vacation_total");
    openapiRequiredFields.add("sick_leave_requested");
    openapiRequiredFields.add("sick_leave_approved");
    openapiRequiredFields.add("sick_leave_used");
    openapiRequiredFields.add("sick_leave_total");
    openapiRequiredFields.add("sick_leave_allowed");
    openapiRequiredFields.add("other_leave_requested");
    openapiRequiredFields.add("other_leave_approved");
    openapiRequiredFields.add("other_leave_used");
    openapiRequiredFields.add("other_leave_total");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeeTimeoffsEntitlementsItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeeTimeoffsEntitlementsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTimeoffsEntitlementsItem is not found in the empty JSON string", EmployeeTimeoffsEntitlementsItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeeTimeoffsEntitlementsItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeTimeoffsEntitlementsItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeeTimeoffsEntitlementsItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tracking_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_period").toString()));
      }
      if (!jsonObj.get("vacation_allowed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_allowed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_allowed").toString()));
      }
      if (!jsonObj.get("vacation_rollover").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_rollover` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_rollover").toString()));
      }
      if (!jsonObj.get("vacation_expired").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_expired` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_expired").toString()));
      }
      if (!jsonObj.get("vacation_payout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_payout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_payout").toString()));
      }
      if (!jsonObj.get("vacation_requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_requested").toString()));
      }
      if (!jsonObj.get("vacation_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_approved").toString()));
      }
      if (!jsonObj.get("vacation_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_used").toString()));
      }
      if (!jsonObj.get("vacation_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_total").toString()));
      }
      if (!jsonObj.get("sick_leave_requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_requested").toString()));
      }
      if (!jsonObj.get("sick_leave_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_approved").toString()));
      }
      if (!jsonObj.get("sick_leave_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_used").toString()));
      }
      if (!jsonObj.get("sick_leave_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_total").toString()));
      }
      if (!jsonObj.get("sick_leave_allowed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_allowed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_allowed").toString()));
      }
      if (!jsonObj.get("other_leave_requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_requested").toString()));
      }
      if (!jsonObj.get("other_leave_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_approved").toString()));
      }
      if (!jsonObj.get("other_leave_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_used").toString()));
      }
      if (!jsonObj.get("other_leave_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_total").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeTimeoffsEntitlementsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTimeoffsEntitlementsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTimeoffsEntitlementsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTimeoffsEntitlementsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTimeoffsEntitlementsItem>() {
           @Override
           public void write(JsonWriter out, EmployeeTimeoffsEntitlementsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeTimeoffsEntitlementsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeeTimeoffsEntitlementsItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeeTimeoffsEntitlementsItem
   * @throws IOException if the JSON string is invalid with respect to EmployeeTimeoffsEntitlementsItem
   */
  public static EmployeeTimeoffsEntitlementsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTimeoffsEntitlementsItem.class);
  }

  /**
   * Convert an instance of EmployeeTimeoffsEntitlementsItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

