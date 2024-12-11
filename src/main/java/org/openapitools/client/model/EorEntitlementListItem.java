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
import org.openapitools.client.model.EorHolidaysRolloverType;

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
 * Entitlement Item for a given year.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:06:48.603230199Z[GMT]", comments = "Generator version: 7.10.0")
public class EorEntitlementListItem {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nullable
  private BigDecimal year;

  public static final String SERIALIZED_NAME_VACATION_ALLOWED = "vacation_allowed";
  @SerializedName(SERIALIZED_NAME_VACATION_ALLOWED)
  @javax.annotation.Nullable
  private String vacationAllowed;

  public static final String SERIALIZED_NAME_SICK_LEAVE_ALLOWED = "sick_leave_allowed";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_ALLOWED)
  @javax.annotation.Nullable
  private String sickLeaveAllowed;

  public static final String SERIALIZED_NAME_VACATION_REQUESTED = "vacation_requested";
  @SerializedName(SERIALIZED_NAME_VACATION_REQUESTED)
  @javax.annotation.Nullable
  private String vacationRequested;

  public static final String SERIALIZED_NAME_VACATION_APPROVED = "vacation_approved";
  @SerializedName(SERIALIZED_NAME_VACATION_APPROVED)
  @javax.annotation.Nullable
  private String vacationApproved;

  public static final String SERIALIZED_NAME_VACATION_USED = "vacation_used";
  @SerializedName(SERIALIZED_NAME_VACATION_USED)
  @javax.annotation.Nullable
  private String vacationUsed;

  public static final String SERIALIZED_NAME_VACATION_TOTAL = "vacation_total";
  @SerializedName(SERIALIZED_NAME_VACATION_TOTAL)
  @javax.annotation.Nullable
  private String vacationTotal;

  public static final String SERIALIZED_NAME_SICK_LEAVE_REQUESTED = "sick_leave_requested";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_REQUESTED)
  @javax.annotation.Nullable
  private String sickLeaveRequested;

  public static final String SERIALIZED_NAME_SICK_LEAVE_APPROVED = "sick_leave_approved";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_APPROVED)
  @javax.annotation.Nullable
  private String sickLeaveApproved;

  public static final String SERIALIZED_NAME_SICK_LEAVE_USED = "sick_leave_used";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_USED)
  @javax.annotation.Nullable
  private String sickLeaveUsed;

  public static final String SERIALIZED_NAME_SICK_LEAVE_TOTAL = "sick_leave_total";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVE_TOTAL)
  @javax.annotation.Nullable
  private String sickLeaveTotal;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_REQUESTED = "other_leave_requested";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_REQUESTED)
  @javax.annotation.Nullable
  private String otherLeaveRequested;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_APPROVED = "other_leave_approved";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_APPROVED)
  @javax.annotation.Nullable
  private String otherLeaveApproved;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_USED = "other_leave_used";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_USED)
  @javax.annotation.Nullable
  private String otherLeaveUsed;

  public static final String SERIALIZED_NAME_OTHER_LEAVE_TOTAL = "other_leave_total";
  @SerializedName(SERIALIZED_NAME_OTHER_LEAVE_TOTAL)
  @javax.annotation.Nullable
  private String otherLeaveTotal;

  public static final String SERIALIZED_NAME_ROLLOVER_TYPE = "rollover_type";
  @SerializedName(SERIALIZED_NAME_ROLLOVER_TYPE)
  @javax.annotation.Nullable
  private EorHolidaysRolloverType rolloverType;

  public static final String SERIALIZED_NAME_MAX_ROLLOVER_YEARLY = "max_rollover_yearly";
  @SerializedName(SERIALIZED_NAME_MAX_ROLLOVER_YEARLY)
  @javax.annotation.Nullable
  private String maxRolloverYearly;

  public EorEntitlementListItem() {
  }

  public EorEntitlementListItem year(@javax.annotation.Nullable BigDecimal year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  @javax.annotation.Nullable
  public BigDecimal getYear() {
    return year;
  }

  public void setYear(@javax.annotation.Nullable BigDecimal year) {
    this.year = year;
  }


  public EorEntitlementListItem vacationAllowed(@javax.annotation.Nullable String vacationAllowed) {
    this.vacationAllowed = vacationAllowed;
    return this;
  }

  /**
   * Minimum vacation allowed.
   * @return vacationAllowed
   */
  @javax.annotation.Nullable
  public String getVacationAllowed() {
    return vacationAllowed;
  }

  public void setVacationAllowed(@javax.annotation.Nullable String vacationAllowed) {
    this.vacationAllowed = vacationAllowed;
  }


  public EorEntitlementListItem sickLeaveAllowed(@javax.annotation.Nullable String sickLeaveAllowed) {
    this.sickLeaveAllowed = sickLeaveAllowed;
    return this;
  }

  /**
   * Maximum sick leave allowed.
   * @return sickLeaveAllowed
   */
  @javax.annotation.Nullable
  public String getSickLeaveAllowed() {
    return sickLeaveAllowed;
  }

  public void setSickLeaveAllowed(@javax.annotation.Nullable String sickLeaveAllowed) {
    this.sickLeaveAllowed = sickLeaveAllowed;
  }


  public EorEntitlementListItem vacationRequested(@javax.annotation.Nullable String vacationRequested) {
    this.vacationRequested = vacationRequested;
    return this;
  }

  /**
   * Vacation days requested by the employee.
   * @return vacationRequested
   */
  @javax.annotation.Nullable
  public String getVacationRequested() {
    return vacationRequested;
  }

  public void setVacationRequested(@javax.annotation.Nullable String vacationRequested) {
    this.vacationRequested = vacationRequested;
  }


  public EorEntitlementListItem vacationApproved(@javax.annotation.Nullable String vacationApproved) {
    this.vacationApproved = vacationApproved;
    return this;
  }

  /**
   * Vacation days approved.
   * @return vacationApproved
   */
  @javax.annotation.Nullable
  public String getVacationApproved() {
    return vacationApproved;
  }

  public void setVacationApproved(@javax.annotation.Nullable String vacationApproved) {
    this.vacationApproved = vacationApproved;
  }


  public EorEntitlementListItem vacationUsed(@javax.annotation.Nullable String vacationUsed) {
    this.vacationUsed = vacationUsed;
    return this;
  }

  /**
   * Vacation days used by the employee.
   * @return vacationUsed
   */
  @javax.annotation.Nullable
  public String getVacationUsed() {
    return vacationUsed;
  }

  public void setVacationUsed(@javax.annotation.Nullable String vacationUsed) {
    this.vacationUsed = vacationUsed;
  }


  public EorEntitlementListItem vacationTotal(@javax.annotation.Nullable String vacationTotal) {
    this.vacationTotal = vacationTotal;
    return this;
  }

  /**
   * Total number of vacation days requested, approved and used.
   * @return vacationTotal
   */
  @javax.annotation.Nullable
  public String getVacationTotal() {
    return vacationTotal;
  }

  public void setVacationTotal(@javax.annotation.Nullable String vacationTotal) {
    this.vacationTotal = vacationTotal;
  }


  public EorEntitlementListItem sickLeaveRequested(@javax.annotation.Nullable String sickLeaveRequested) {
    this.sickLeaveRequested = sickLeaveRequested;
    return this;
  }

  /**
   * Sick days requested by the employee.
   * @return sickLeaveRequested
   */
  @javax.annotation.Nullable
  public String getSickLeaveRequested() {
    return sickLeaveRequested;
  }

  public void setSickLeaveRequested(@javax.annotation.Nullable String sickLeaveRequested) {
    this.sickLeaveRequested = sickLeaveRequested;
  }


  public EorEntitlementListItem sickLeaveApproved(@javax.annotation.Nullable String sickLeaveApproved) {
    this.sickLeaveApproved = sickLeaveApproved;
    return this;
  }

  /**
   * Sick days approved.
   * @return sickLeaveApproved
   */
  @javax.annotation.Nullable
  public String getSickLeaveApproved() {
    return sickLeaveApproved;
  }

  public void setSickLeaveApproved(@javax.annotation.Nullable String sickLeaveApproved) {
    this.sickLeaveApproved = sickLeaveApproved;
  }


  public EorEntitlementListItem sickLeaveUsed(@javax.annotation.Nullable String sickLeaveUsed) {
    this.sickLeaveUsed = sickLeaveUsed;
    return this;
  }

  /**
   * Sick days used by the employee.
   * @return sickLeaveUsed
   */
  @javax.annotation.Nullable
  public String getSickLeaveUsed() {
    return sickLeaveUsed;
  }

  public void setSickLeaveUsed(@javax.annotation.Nullable String sickLeaveUsed) {
    this.sickLeaveUsed = sickLeaveUsed;
  }


  public EorEntitlementListItem sickLeaveTotal(@javax.annotation.Nullable String sickLeaveTotal) {
    this.sickLeaveTotal = sickLeaveTotal;
    return this;
  }

  /**
   * Total number of sick days requested, approved and used.
   * @return sickLeaveTotal
   */
  @javax.annotation.Nullable
  public String getSickLeaveTotal() {
    return sickLeaveTotal;
  }

  public void setSickLeaveTotal(@javax.annotation.Nullable String sickLeaveTotal) {
    this.sickLeaveTotal = sickLeaveTotal;
  }


  public EorEntitlementListItem otherLeaveRequested(@javax.annotation.Nullable String otherLeaveRequested) {
    this.otherLeaveRequested = otherLeaveRequested;
    return this;
  }

  /**
   * Other type of time off requested by the employee.
   * @return otherLeaveRequested
   */
  @javax.annotation.Nullable
  public String getOtherLeaveRequested() {
    return otherLeaveRequested;
  }

  public void setOtherLeaveRequested(@javax.annotation.Nullable String otherLeaveRequested) {
    this.otherLeaveRequested = otherLeaveRequested;
  }


  public EorEntitlementListItem otherLeaveApproved(@javax.annotation.Nullable String otherLeaveApproved) {
    this.otherLeaveApproved = otherLeaveApproved;
    return this;
  }

  /**
   * Other type of time off days approved.
   * @return otherLeaveApproved
   */
  @javax.annotation.Nullable
  public String getOtherLeaveApproved() {
    return otherLeaveApproved;
  }

  public void setOtherLeaveApproved(@javax.annotation.Nullable String otherLeaveApproved) {
    this.otherLeaveApproved = otherLeaveApproved;
  }


  public EorEntitlementListItem otherLeaveUsed(@javax.annotation.Nullable String otherLeaveUsed) {
    this.otherLeaveUsed = otherLeaveUsed;
    return this;
  }

  /**
   * Other type of time off days used by the employee.
   * @return otherLeaveUsed
   */
  @javax.annotation.Nullable
  public String getOtherLeaveUsed() {
    return otherLeaveUsed;
  }

  public void setOtherLeaveUsed(@javax.annotation.Nullable String otherLeaveUsed) {
    this.otherLeaveUsed = otherLeaveUsed;
  }


  public EorEntitlementListItem otherLeaveTotal(@javax.annotation.Nullable String otherLeaveTotal) {
    this.otherLeaveTotal = otherLeaveTotal;
    return this;
  }

  /**
   * Total number of other type of time off days requested, approved and used.
   * @return otherLeaveTotal
   */
  @javax.annotation.Nullable
  public String getOtherLeaveTotal() {
    return otherLeaveTotal;
  }

  public void setOtherLeaveTotal(@javax.annotation.Nullable String otherLeaveTotal) {
    this.otherLeaveTotal = otherLeaveTotal;
  }


  public EorEntitlementListItem rolloverType(@javax.annotation.Nullable EorHolidaysRolloverType rolloverType) {
    this.rolloverType = rolloverType;
    return this;
  }

  /**
   * Get rolloverType
   * @return rolloverType
   */
  @javax.annotation.Nullable
  public EorHolidaysRolloverType getRolloverType() {
    return rolloverType;
  }

  public void setRolloverType(@javax.annotation.Nullable EorHolidaysRolloverType rolloverType) {
    this.rolloverType = rolloverType;
  }


  public EorEntitlementListItem maxRolloverYearly(@javax.annotation.Nullable String maxRolloverYearly) {
    this.maxRolloverYearly = maxRolloverYearly;
    return this;
  }

  /**
   * Get maxRolloverYearly
   * @return maxRolloverYearly
   */
  @javax.annotation.Nullable
  public String getMaxRolloverYearly() {
    return maxRolloverYearly;
  }

  public void setMaxRolloverYearly(@javax.annotation.Nullable String maxRolloverYearly) {
    this.maxRolloverYearly = maxRolloverYearly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorEntitlementListItem eorEntitlementListItem = (EorEntitlementListItem) o;
    return Objects.equals(this.year, eorEntitlementListItem.year) &&
        Objects.equals(this.vacationAllowed, eorEntitlementListItem.vacationAllowed) &&
        Objects.equals(this.sickLeaveAllowed, eorEntitlementListItem.sickLeaveAllowed) &&
        Objects.equals(this.vacationRequested, eorEntitlementListItem.vacationRequested) &&
        Objects.equals(this.vacationApproved, eorEntitlementListItem.vacationApproved) &&
        Objects.equals(this.vacationUsed, eorEntitlementListItem.vacationUsed) &&
        Objects.equals(this.vacationTotal, eorEntitlementListItem.vacationTotal) &&
        Objects.equals(this.sickLeaveRequested, eorEntitlementListItem.sickLeaveRequested) &&
        Objects.equals(this.sickLeaveApproved, eorEntitlementListItem.sickLeaveApproved) &&
        Objects.equals(this.sickLeaveUsed, eorEntitlementListItem.sickLeaveUsed) &&
        Objects.equals(this.sickLeaveTotal, eorEntitlementListItem.sickLeaveTotal) &&
        Objects.equals(this.otherLeaveRequested, eorEntitlementListItem.otherLeaveRequested) &&
        Objects.equals(this.otherLeaveApproved, eorEntitlementListItem.otherLeaveApproved) &&
        Objects.equals(this.otherLeaveUsed, eorEntitlementListItem.otherLeaveUsed) &&
        Objects.equals(this.otherLeaveTotal, eorEntitlementListItem.otherLeaveTotal) &&
        Objects.equals(this.rolloverType, eorEntitlementListItem.rolloverType) &&
        Objects.equals(this.maxRolloverYearly, eorEntitlementListItem.maxRolloverYearly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, vacationAllowed, sickLeaveAllowed, vacationRequested, vacationApproved, vacationUsed, vacationTotal, sickLeaveRequested, sickLeaveApproved, sickLeaveUsed, sickLeaveTotal, otherLeaveRequested, otherLeaveApproved, otherLeaveUsed, otherLeaveTotal, rolloverType, maxRolloverYearly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorEntitlementListItem {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    vacationAllowed: ").append(toIndentedString(vacationAllowed)).append("\n");
    sb.append("    sickLeaveAllowed: ").append(toIndentedString(sickLeaveAllowed)).append("\n");
    sb.append("    vacationRequested: ").append(toIndentedString(vacationRequested)).append("\n");
    sb.append("    vacationApproved: ").append(toIndentedString(vacationApproved)).append("\n");
    sb.append("    vacationUsed: ").append(toIndentedString(vacationUsed)).append("\n");
    sb.append("    vacationTotal: ").append(toIndentedString(vacationTotal)).append("\n");
    sb.append("    sickLeaveRequested: ").append(toIndentedString(sickLeaveRequested)).append("\n");
    sb.append("    sickLeaveApproved: ").append(toIndentedString(sickLeaveApproved)).append("\n");
    sb.append("    sickLeaveUsed: ").append(toIndentedString(sickLeaveUsed)).append("\n");
    sb.append("    sickLeaveTotal: ").append(toIndentedString(sickLeaveTotal)).append("\n");
    sb.append("    otherLeaveRequested: ").append(toIndentedString(otherLeaveRequested)).append("\n");
    sb.append("    otherLeaveApproved: ").append(toIndentedString(otherLeaveApproved)).append("\n");
    sb.append("    otherLeaveUsed: ").append(toIndentedString(otherLeaveUsed)).append("\n");
    sb.append("    otherLeaveTotal: ").append(toIndentedString(otherLeaveTotal)).append("\n");
    sb.append("    rolloverType: ").append(toIndentedString(rolloverType)).append("\n");
    sb.append("    maxRolloverYearly: ").append(toIndentedString(maxRolloverYearly)).append("\n");
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
    openapiFields.add("vacation_allowed");
    openapiFields.add("sick_leave_allowed");
    openapiFields.add("vacation_requested");
    openapiFields.add("vacation_approved");
    openapiFields.add("vacation_used");
    openapiFields.add("vacation_total");
    openapiFields.add("sick_leave_requested");
    openapiFields.add("sick_leave_approved");
    openapiFields.add("sick_leave_used");
    openapiFields.add("sick_leave_total");
    openapiFields.add("other_leave_requested");
    openapiFields.add("other_leave_approved");
    openapiFields.add("other_leave_used");
    openapiFields.add("other_leave_total");
    openapiFields.add("rollover_type");
    openapiFields.add("max_rollover_yearly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorEntitlementListItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorEntitlementListItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorEntitlementListItem is not found in the empty JSON string", EorEntitlementListItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorEntitlementListItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorEntitlementListItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vacation_allowed") != null && !jsonObj.get("vacation_allowed").isJsonNull()) && !jsonObj.get("vacation_allowed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_allowed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_allowed").toString()));
      }
      if ((jsonObj.get("sick_leave_allowed") != null && !jsonObj.get("sick_leave_allowed").isJsonNull()) && !jsonObj.get("sick_leave_allowed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_allowed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_allowed").toString()));
      }
      if ((jsonObj.get("vacation_requested") != null && !jsonObj.get("vacation_requested").isJsonNull()) && !jsonObj.get("vacation_requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_requested").toString()));
      }
      if ((jsonObj.get("vacation_approved") != null && !jsonObj.get("vacation_approved").isJsonNull()) && !jsonObj.get("vacation_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_approved").toString()));
      }
      if ((jsonObj.get("vacation_used") != null && !jsonObj.get("vacation_used").isJsonNull()) && !jsonObj.get("vacation_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_used").toString()));
      }
      if ((jsonObj.get("vacation_total") != null && !jsonObj.get("vacation_total").isJsonNull()) && !jsonObj.get("vacation_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacation_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacation_total").toString()));
      }
      if ((jsonObj.get("sick_leave_requested") != null && !jsonObj.get("sick_leave_requested").isJsonNull()) && !jsonObj.get("sick_leave_requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_requested").toString()));
      }
      if ((jsonObj.get("sick_leave_approved") != null && !jsonObj.get("sick_leave_approved").isJsonNull()) && !jsonObj.get("sick_leave_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_approved").toString()));
      }
      if ((jsonObj.get("sick_leave_used") != null && !jsonObj.get("sick_leave_used").isJsonNull()) && !jsonObj.get("sick_leave_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_used").toString()));
      }
      if ((jsonObj.get("sick_leave_total") != null && !jsonObj.get("sick_leave_total").isJsonNull()) && !jsonObj.get("sick_leave_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leave_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sick_leave_total").toString()));
      }
      if ((jsonObj.get("other_leave_requested") != null && !jsonObj.get("other_leave_requested").isJsonNull()) && !jsonObj.get("other_leave_requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_requested").toString()));
      }
      if ((jsonObj.get("other_leave_approved") != null && !jsonObj.get("other_leave_approved").isJsonNull()) && !jsonObj.get("other_leave_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_approved").toString()));
      }
      if ((jsonObj.get("other_leave_used") != null && !jsonObj.get("other_leave_used").isJsonNull()) && !jsonObj.get("other_leave_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_used").toString()));
      }
      if ((jsonObj.get("other_leave_total") != null && !jsonObj.get("other_leave_total").isJsonNull()) && !jsonObj.get("other_leave_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_leave_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_leave_total").toString()));
      }
      // validate the optional field `rollover_type`
      if (jsonObj.get("rollover_type") != null && !jsonObj.get("rollover_type").isJsonNull()) {
        EorHolidaysRolloverType.validateJsonElement(jsonObj.get("rollover_type"));
      }
      if ((jsonObj.get("max_rollover_yearly") != null && !jsonObj.get("max_rollover_yearly").isJsonNull()) && !jsonObj.get("max_rollover_yearly").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_rollover_yearly` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_rollover_yearly").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorEntitlementListItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorEntitlementListItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorEntitlementListItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorEntitlementListItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EorEntitlementListItem>() {
           @Override
           public void write(JsonWriter out, EorEntitlementListItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorEntitlementListItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorEntitlementListItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorEntitlementListItem
   * @throws IOException if the JSON string is invalid with respect to EorEntitlementListItem
   */
  public static EorEntitlementListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorEntitlementListItem.class);
  }

  /**
   * Convert an instance of EorEntitlementListItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

