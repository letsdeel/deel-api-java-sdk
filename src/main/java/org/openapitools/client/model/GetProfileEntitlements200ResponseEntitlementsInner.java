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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetProfileEntitlements200ResponseEntitlementsInnerEventsInner;
import org.openapitools.client.model.GetProfileEntitlements200ResponseEntitlementsInnerPolicy;
import org.openapitools.client.model.GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner;
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
 * GetProfileEntitlements200ResponseEntitlementsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T13:47:44.629538829Z[GMT]", comments = "Generator version: 7.10.0")
public class GetProfileEntitlements200ResponseEntitlementsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  @javax.annotation.Nullable
  private String used;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  @javax.annotation.Nullable
  private List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  @javax.annotation.Nullable
  private GetProfileEntitlements200ResponseEntitlementsInnerPolicy policy;

  public static final String SERIALIZED_NAME_ACCRUED = "accrued";
  @SerializedName(SERIALIZED_NAME_ACCRUED)
  @javax.annotation.Nullable
  private String accrued;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  @javax.annotation.Nullable
  private String expired;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  @javax.annotation.Nullable
  private String approved;

  public static final String SERIALIZED_NAME_ALLOWANCE = "allowance";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE)
  @javax.annotation.Nullable
  private String allowance;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  @javax.annotation.Nullable
  private String available;

  public static final String SERIALIZED_NAME_REQUESTED = "requested";
  @SerializedName(SERIALIZED_NAME_REQUESTED)
  @javax.annotation.Nullable
  private String requested;

  public static final String SERIALIZED_NAME_ROLLOVERS = "rollovers";
  @SerializedName(SERIALIZED_NAME_ROLLOVERS)
  @javax.annotation.Nullable
  private List<GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner> rollovers;

  /**
   * Accrual unit
   */
  @JsonAdapter(AccrualUnitEnum.Adapter.class)
  public enum AccrualUnitEnum {
    HOUR("HOUR"),
    
    BUSINESS_DAY("BUSINESS_DAY"),
    
    CALENDAR_DAY("CALENDAR_DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    AccrualUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccrualUnitEnum fromValue(String value) {
      for (AccrualUnitEnum b : AccrualUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccrualUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccrualUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccrualUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccrualUnitEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AccrualUnitEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCRUAL_UNIT = "accrual_unit";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_UNIT)
  @javax.annotation.Nullable
  private AccrualUnitEnum accrualUnit;

  public static final String SERIALIZED_NAME_FUTURE_EVENTS = "future_events";
  @SerializedName(SERIALIZED_NAME_FUTURE_EVENTS)
  @javax.annotation.Nullable
  private List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> futureEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCRUAL_AMOUNT = "accrual_amount";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_AMOUNT)
  @javax.annotation.Nullable
  private String accrualAmount;

  public static final String SERIALIZED_NAME_TRACKING_PERIOD = "tracking_period";
  @SerializedName(SERIALIZED_NAME_TRACKING_PERIOD)
  @javax.annotation.Nonnull
  private String trackingPeriod;

  public static final String SERIALIZED_NAME_BALANCE_ADJUSTED = "balance_adjusted";
  @SerializedName(SERIALIZED_NAME_BALANCE_ADJUSTED)
  @javax.annotation.Nullable
  private String balanceAdjusted;

  public static final String SERIALIZED_NAME_TIME_OFF_EVENT_ID = "time_off_event_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_EVENT_ID)
  @javax.annotation.Nullable
  private String timeOffEventId;

  public static final String SERIALIZED_NAME_UPCOMING_ACCRUALS = "upcoming_accruals";
  @SerializedName(SERIALIZED_NAME_UPCOMING_ACCRUALS)
  @javax.annotation.Nullable
  private String upcomingAccruals;

  public static final String SERIALIZED_NAME_TOTAL_ENTITLEMENTS = "total_entitlements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTITLEMENTS)
  @javax.annotation.Nonnull
  private String totalEntitlements;

  public static final String SERIALIZED_NAME_PAST_TRACKING_PERIODS = "past_tracking_periods";
  @SerializedName(SERIALIZED_NAME_PAST_TRACKING_PERIODS)
  @javax.annotation.Nullable
  private List<String> pastTrackingPeriods = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRACKING_PERIOD_END_DATE = "tracking_period_end_date";
  @SerializedName(SERIALIZED_NAME_TRACKING_PERIOD_END_DATE)
  @javax.annotation.Nonnull
  private String trackingPeriodEndDate;

  public GetProfileEntitlements200ResponseEntitlementsInner() {
  }

  public GetProfileEntitlements200ResponseEntitlementsInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Entitlement ID
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner used(@javax.annotation.Nullable String used) {
    this.used = used;
    return this;
  }

  /**
   * Used time off
   * @return used
   */
  @javax.annotation.Nullable
  public String getUsed() {
    return used;
  }

  public void setUsed(@javax.annotation.Nullable String used) {
    this.used = used;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner events(@javax.annotation.Nullable List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> events) {
    this.events = events;
    return this;
  }

  public GetProfileEntitlements200ResponseEntitlementsInner addEventsItem(GetProfileEntitlements200ResponseEntitlementsInnerEventsInner eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
   */
  @javax.annotation.Nullable
  public List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> getEvents() {
    return events;
  }

  public void setEvents(@javax.annotation.Nullable List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> events) {
    this.events = events;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner policy(@javax.annotation.Nullable GetProfileEntitlements200ResponseEntitlementsInnerPolicy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
   */
  @javax.annotation.Nullable
  public GetProfileEntitlements200ResponseEntitlementsInnerPolicy getPolicy() {
    return policy;
  }

  public void setPolicy(@javax.annotation.Nullable GetProfileEntitlements200ResponseEntitlementsInnerPolicy policy) {
    this.policy = policy;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner accrued(@javax.annotation.Nullable String accrued) {
    this.accrued = accrued;
    return this;
  }

  /**
   * Accrued time off
   * @return accrued
   */
  @javax.annotation.Nullable
  public String getAccrued() {
    return accrued;
  }

  public void setAccrued(@javax.annotation.Nullable String accrued) {
    this.accrued = accrued;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner expired(@javax.annotation.Nullable String expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Expired time off
   * @return expired
   */
  @javax.annotation.Nullable
  public String getExpired() {
    return expired;
  }

  public void setExpired(@javax.annotation.Nullable String expired) {
    this.expired = expired;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner approved(@javax.annotation.Nullable String approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Approved time off
   * @return approved
   */
  @javax.annotation.Nullable
  public String getApproved() {
    return approved;
  }

  public void setApproved(@javax.annotation.Nullable String approved) {
    this.approved = approved;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner allowance(@javax.annotation.Nullable String allowance) {
    this.allowance = allowance;
    return this;
  }

  /**
   * Time off allowance
   * @return allowance
   */
  @javax.annotation.Nullable
  public String getAllowance() {
    return allowance;
  }

  public void setAllowance(@javax.annotation.Nullable String allowance) {
    this.allowance = allowance;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner available(@javax.annotation.Nullable String available) {
    this.available = available;
    return this;
  }

  /**
   * Available time off
   * @return available
   */
  @javax.annotation.Nullable
  public String getAvailable() {
    return available;
  }

  public void setAvailable(@javax.annotation.Nullable String available) {
    this.available = available;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner requested(@javax.annotation.Nullable String requested) {
    this.requested = requested;
    return this;
  }

  /**
   * Requested time off
   * @return requested
   */
  @javax.annotation.Nullable
  public String getRequested() {
    return requested;
  }

  public void setRequested(@javax.annotation.Nullable String requested) {
    this.requested = requested;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner rollovers(@javax.annotation.Nullable List<GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner> rollovers) {
    this.rollovers = rollovers;
    return this;
  }

  public GetProfileEntitlements200ResponseEntitlementsInner addRolloversItem(GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner rolloversItem) {
    if (this.rollovers == null) {
      this.rollovers = new ArrayList<>();
    }
    this.rollovers.add(rolloversItem);
    return this;
  }

  /**
   * Get rollovers
   * @return rollovers
   */
  @javax.annotation.Nullable
  public List<GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner> getRollovers() {
    return rollovers;
  }

  public void setRollovers(@javax.annotation.Nullable List<GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner> rollovers) {
    this.rollovers = rollovers;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner accrualUnit(@javax.annotation.Nullable AccrualUnitEnum accrualUnit) {
    this.accrualUnit = accrualUnit;
    return this;
  }

  /**
   * Accrual unit
   * @return accrualUnit
   */
  @javax.annotation.Nullable
  public AccrualUnitEnum getAccrualUnit() {
    return accrualUnit;
  }

  public void setAccrualUnit(@javax.annotation.Nullable AccrualUnitEnum accrualUnit) {
    this.accrualUnit = accrualUnit;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner futureEvents(@javax.annotation.Nullable List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> futureEvents) {
    this.futureEvents = futureEvents;
    return this;
  }

  public GetProfileEntitlements200ResponseEntitlementsInner addFutureEventsItem(GetProfileEntitlements200ResponseEntitlementsInnerEventsInner futureEventsItem) {
    if (this.futureEvents == null) {
      this.futureEvents = new ArrayList<>();
    }
    this.futureEvents.add(futureEventsItem);
    return this;
  }

  /**
   * Get futureEvents
   * @return futureEvents
   */
  @javax.annotation.Nullable
  public List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> getFutureEvents() {
    return futureEvents;
  }

  public void setFutureEvents(@javax.annotation.Nullable List<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> futureEvents) {
    this.futureEvents = futureEvents;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner accrualAmount(@javax.annotation.Nullable String accrualAmount) {
    this.accrualAmount = accrualAmount;
    return this;
  }

  /**
   * Accrual amount
   * @return accrualAmount
   */
  @javax.annotation.Nullable
  public String getAccrualAmount() {
    return accrualAmount;
  }

  public void setAccrualAmount(@javax.annotation.Nullable String accrualAmount) {
    this.accrualAmount = accrualAmount;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner trackingPeriod(@javax.annotation.Nonnull String trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
    return this;
  }

  /**
   * Tracking period
   * @return trackingPeriod
   */
  @javax.annotation.Nonnull
  public String getTrackingPeriod() {
    return trackingPeriod;
  }

  public void setTrackingPeriod(@javax.annotation.Nonnull String trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner balanceAdjusted(@javax.annotation.Nullable String balanceAdjusted) {
    this.balanceAdjusted = balanceAdjusted;
    return this;
  }

  /**
   * Balance adjusted
   * @return balanceAdjusted
   */
  @javax.annotation.Nullable
  public String getBalanceAdjusted() {
    return balanceAdjusted;
  }

  public void setBalanceAdjusted(@javax.annotation.Nullable String balanceAdjusted) {
    this.balanceAdjusted = balanceAdjusted;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner timeOffEventId(@javax.annotation.Nullable String timeOffEventId) {
    this.timeOffEventId = timeOffEventId;
    return this;
  }

  /**
   * Time off event ID
   * @return timeOffEventId
   */
  @javax.annotation.Nullable
  public String getTimeOffEventId() {
    return timeOffEventId;
  }

  public void setTimeOffEventId(@javax.annotation.Nullable String timeOffEventId) {
    this.timeOffEventId = timeOffEventId;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner upcomingAccruals(@javax.annotation.Nullable String upcomingAccruals) {
    this.upcomingAccruals = upcomingAccruals;
    return this;
  }

  /**
   * Upcoming accruals
   * @return upcomingAccruals
   */
  @javax.annotation.Nullable
  public String getUpcomingAccruals() {
    return upcomingAccruals;
  }

  public void setUpcomingAccruals(@javax.annotation.Nullable String upcomingAccruals) {
    this.upcomingAccruals = upcomingAccruals;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner totalEntitlements(@javax.annotation.Nonnull String totalEntitlements) {
    this.totalEntitlements = totalEntitlements;
    return this;
  }

  /**
   * Total entitlements
   * @return totalEntitlements
   */
  @javax.annotation.Nonnull
  public String getTotalEntitlements() {
    return totalEntitlements;
  }

  public void setTotalEntitlements(@javax.annotation.Nonnull String totalEntitlements) {
    this.totalEntitlements = totalEntitlements;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner pastTrackingPeriods(@javax.annotation.Nullable List<String> pastTrackingPeriods) {
    this.pastTrackingPeriods = pastTrackingPeriods;
    return this;
  }

  public GetProfileEntitlements200ResponseEntitlementsInner addPastTrackingPeriodsItem(String pastTrackingPeriodsItem) {
    if (this.pastTrackingPeriods == null) {
      this.pastTrackingPeriods = new ArrayList<>();
    }
    this.pastTrackingPeriods.add(pastTrackingPeriodsItem);
    return this;
  }

  /**
   * Get pastTrackingPeriods
   * @return pastTrackingPeriods
   */
  @javax.annotation.Nullable
  public List<String> getPastTrackingPeriods() {
    return pastTrackingPeriods;
  }

  public void setPastTrackingPeriods(@javax.annotation.Nullable List<String> pastTrackingPeriods) {
    this.pastTrackingPeriods = pastTrackingPeriods;
  }


  public GetProfileEntitlements200ResponseEntitlementsInner trackingPeriodEndDate(@javax.annotation.Nonnull String trackingPeriodEndDate) {
    this.trackingPeriodEndDate = trackingPeriodEndDate;
    return this;
  }

  /**
   * Tracking period end date
   * @return trackingPeriodEndDate
   */
  @javax.annotation.Nonnull
  public String getTrackingPeriodEndDate() {
    return trackingPeriodEndDate;
  }

  public void setTrackingPeriodEndDate(@javax.annotation.Nonnull String trackingPeriodEndDate) {
    this.trackingPeriodEndDate = trackingPeriodEndDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfileEntitlements200ResponseEntitlementsInner getProfileEntitlements200ResponseEntitlementsInner = (GetProfileEntitlements200ResponseEntitlementsInner) o;
    return Objects.equals(this.id, getProfileEntitlements200ResponseEntitlementsInner.id) &&
        Objects.equals(this.used, getProfileEntitlements200ResponseEntitlementsInner.used) &&
        Objects.equals(this.events, getProfileEntitlements200ResponseEntitlementsInner.events) &&
        Objects.equals(this.policy, getProfileEntitlements200ResponseEntitlementsInner.policy) &&
        Objects.equals(this.accrued, getProfileEntitlements200ResponseEntitlementsInner.accrued) &&
        Objects.equals(this.expired, getProfileEntitlements200ResponseEntitlementsInner.expired) &&
        Objects.equals(this.approved, getProfileEntitlements200ResponseEntitlementsInner.approved) &&
        Objects.equals(this.allowance, getProfileEntitlements200ResponseEntitlementsInner.allowance) &&
        Objects.equals(this.available, getProfileEntitlements200ResponseEntitlementsInner.available) &&
        Objects.equals(this.requested, getProfileEntitlements200ResponseEntitlementsInner.requested) &&
        Objects.equals(this.rollovers, getProfileEntitlements200ResponseEntitlementsInner.rollovers) &&
        Objects.equals(this.accrualUnit, getProfileEntitlements200ResponseEntitlementsInner.accrualUnit) &&
        Objects.equals(this.futureEvents, getProfileEntitlements200ResponseEntitlementsInner.futureEvents) &&
        Objects.equals(this.accrualAmount, getProfileEntitlements200ResponseEntitlementsInner.accrualAmount) &&
        Objects.equals(this.trackingPeriod, getProfileEntitlements200ResponseEntitlementsInner.trackingPeriod) &&
        Objects.equals(this.balanceAdjusted, getProfileEntitlements200ResponseEntitlementsInner.balanceAdjusted) &&
        Objects.equals(this.timeOffEventId, getProfileEntitlements200ResponseEntitlementsInner.timeOffEventId) &&
        Objects.equals(this.upcomingAccruals, getProfileEntitlements200ResponseEntitlementsInner.upcomingAccruals) &&
        Objects.equals(this.totalEntitlements, getProfileEntitlements200ResponseEntitlementsInner.totalEntitlements) &&
        Objects.equals(this.pastTrackingPeriods, getProfileEntitlements200ResponseEntitlementsInner.pastTrackingPeriods) &&
        Objects.equals(this.trackingPeriodEndDate, getProfileEntitlements200ResponseEntitlementsInner.trackingPeriodEndDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, used, events, policy, accrued, expired, approved, allowance, available, requested, rollovers, accrualUnit, futureEvents, accrualAmount, trackingPeriod, balanceAdjusted, timeOffEventId, upcomingAccruals, totalEntitlements, pastTrackingPeriods, trackingPeriodEndDate);
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
    sb.append("class GetProfileEntitlements200ResponseEntitlementsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    accrued: ").append(toIndentedString(accrued)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    allowance: ").append(toIndentedString(allowance)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    rollovers: ").append(toIndentedString(rollovers)).append("\n");
    sb.append("    accrualUnit: ").append(toIndentedString(accrualUnit)).append("\n");
    sb.append("    futureEvents: ").append(toIndentedString(futureEvents)).append("\n");
    sb.append("    accrualAmount: ").append(toIndentedString(accrualAmount)).append("\n");
    sb.append("    trackingPeriod: ").append(toIndentedString(trackingPeriod)).append("\n");
    sb.append("    balanceAdjusted: ").append(toIndentedString(balanceAdjusted)).append("\n");
    sb.append("    timeOffEventId: ").append(toIndentedString(timeOffEventId)).append("\n");
    sb.append("    upcomingAccruals: ").append(toIndentedString(upcomingAccruals)).append("\n");
    sb.append("    totalEntitlements: ").append(toIndentedString(totalEntitlements)).append("\n");
    sb.append("    pastTrackingPeriods: ").append(toIndentedString(pastTrackingPeriods)).append("\n");
    sb.append("    trackingPeriodEndDate: ").append(toIndentedString(trackingPeriodEndDate)).append("\n");
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
    openapiFields.add("used");
    openapiFields.add("events");
    openapiFields.add("policy");
    openapiFields.add("accrued");
    openapiFields.add("expired");
    openapiFields.add("approved");
    openapiFields.add("allowance");
    openapiFields.add("available");
    openapiFields.add("requested");
    openapiFields.add("rollovers");
    openapiFields.add("accrual_unit");
    openapiFields.add("future_events");
    openapiFields.add("accrual_amount");
    openapiFields.add("tracking_period");
    openapiFields.add("balance_adjusted");
    openapiFields.add("time_off_event_id");
    openapiFields.add("upcoming_accruals");
    openapiFields.add("total_entitlements");
    openapiFields.add("past_tracking_periods");
    openapiFields.add("tracking_period_end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tracking_period");
    openapiRequiredFields.add("total_entitlements");
    openapiRequiredFields.add("tracking_period_end_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetProfileEntitlements200ResponseEntitlementsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProfileEntitlements200ResponseEntitlementsInner is not found in the empty JSON string", GetProfileEntitlements200ResponseEntitlementsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetProfileEntitlements200ResponseEntitlementsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProfileEntitlements200ResponseEntitlementsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProfileEntitlements200ResponseEntitlementsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("used") != null && !jsonObj.get("used").isJsonNull()) && !jsonObj.get("used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("used").toString()));
      }
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull()) {
        JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
        if (jsonArrayevents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
          }

          // validate the optional field `events` (array)
          for (int i = 0; i < jsonArrayevents.size(); i++) {
            GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.validateJsonElement(jsonArrayevents.get(i));
          };
        }
      }
      // validate the optional field `policy`
      if (jsonObj.get("policy") != null && !jsonObj.get("policy").isJsonNull()) {
        GetProfileEntitlements200ResponseEntitlementsInnerPolicy.validateJsonElement(jsonObj.get("policy"));
      }
      if ((jsonObj.get("accrued") != null && !jsonObj.get("accrued").isJsonNull()) && !jsonObj.get("accrued").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accrued` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accrued").toString()));
      }
      if ((jsonObj.get("expired") != null && !jsonObj.get("expired").isJsonNull()) && !jsonObj.get("expired").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expired` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expired").toString()));
      }
      if ((jsonObj.get("approved") != null && !jsonObj.get("approved").isJsonNull()) && !jsonObj.get("approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approved").toString()));
      }
      if ((jsonObj.get("allowance") != null && !jsonObj.get("allowance").isJsonNull()) && !jsonObj.get("allowance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowance").toString()));
      }
      if ((jsonObj.get("available") != null && !jsonObj.get("available").isJsonNull()) && !jsonObj.get("available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available").toString()));
      }
      if ((jsonObj.get("requested") != null && !jsonObj.get("requested").isJsonNull()) && !jsonObj.get("requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requested").toString()));
      }
      if (jsonObj.get("rollovers") != null && !jsonObj.get("rollovers").isJsonNull()) {
        JsonArray jsonArrayrollovers = jsonObj.getAsJsonArray("rollovers");
        if (jsonArrayrollovers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rollovers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rollovers` to be an array in the JSON string but got `%s`", jsonObj.get("rollovers").toString()));
          }

          // validate the optional field `rollovers` (array)
          for (int i = 0; i < jsonArrayrollovers.size(); i++) {
            GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.validateJsonElement(jsonArrayrollovers.get(i));
          };
        }
      }
      if ((jsonObj.get("accrual_unit") != null && !jsonObj.get("accrual_unit").isJsonNull()) && !jsonObj.get("accrual_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accrual_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accrual_unit").toString()));
      }
      // validate the optional field `accrual_unit`
      if (jsonObj.get("accrual_unit") != null && !jsonObj.get("accrual_unit").isJsonNull()) {
        AccrualUnitEnum.validateJsonElement(jsonObj.get("accrual_unit"));
      }
      if (jsonObj.get("future_events") != null && !jsonObj.get("future_events").isJsonNull()) {
        JsonArray jsonArrayfutureEvents = jsonObj.getAsJsonArray("future_events");
        if (jsonArrayfutureEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("future_events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `future_events` to be an array in the JSON string but got `%s`", jsonObj.get("future_events").toString()));
          }

          // validate the optional field `future_events` (array)
          for (int i = 0; i < jsonArrayfutureEvents.size(); i++) {
            GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.validateJsonElement(jsonArrayfutureEvents.get(i));
          };
        }
      }
      if ((jsonObj.get("accrual_amount") != null && !jsonObj.get("accrual_amount").isJsonNull()) && !jsonObj.get("accrual_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accrual_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accrual_amount").toString()));
      }
      if (!jsonObj.get("tracking_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_period").toString()));
      }
      if ((jsonObj.get("balance_adjusted") != null && !jsonObj.get("balance_adjusted").isJsonNull()) && !jsonObj.get("balance_adjusted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance_adjusted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance_adjusted").toString()));
      }
      if ((jsonObj.get("time_off_event_id") != null && !jsonObj.get("time_off_event_id").isJsonNull()) && !jsonObj.get("time_off_event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_event_id").toString()));
      }
      if ((jsonObj.get("upcoming_accruals") != null && !jsonObj.get("upcoming_accruals").isJsonNull()) && !jsonObj.get("upcoming_accruals").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upcoming_accruals` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upcoming_accruals").toString()));
      }
      if (!jsonObj.get("total_entitlements").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_entitlements` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_entitlements").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("past_tracking_periods") != null && !jsonObj.get("past_tracking_periods").isJsonNull() && !jsonObj.get("past_tracking_periods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `past_tracking_periods` to be an array in the JSON string but got `%s`", jsonObj.get("past_tracking_periods").toString()));
      }
      if (!jsonObj.get("tracking_period_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_period_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_period_end_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProfileEntitlements200ResponseEntitlementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProfileEntitlements200ResponseEntitlementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProfileEntitlements200ResponseEntitlementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInner>() {
           @Override
           public void write(JsonWriter out, GetProfileEntitlements200ResponseEntitlementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProfileEntitlements200ResponseEntitlementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetProfileEntitlements200ResponseEntitlementsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetProfileEntitlements200ResponseEntitlementsInner
   * @throws IOException if the JSON string is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInner
   */
  public static GetProfileEntitlements200ResponseEntitlementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProfileEntitlements200ResponseEntitlementsInner.class);
  }

  /**
   * Convert an instance of GetProfileEntitlements200ResponseEntitlementsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

