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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.GetPoliciesForProfile200ResponsePoliciesInnerPolicyType;
import org.openapitools.client.model.TimeOffType;

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
 * Policy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class Policy {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_POLICY_TYPE_ID = "policy_type_id";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE_ID)
  @javax.annotation.Nullable
  private UUID policyTypeId;

  /**
   * Gets or Sets trackingUnit
   */
  @JsonAdapter(TrackingUnitEnum.Adapter.class)
  public enum TrackingUnitEnum {
    HOUR("HOUR"),
    
    BUSINESS_DAY("BUSINESS_DAY"),
    
    CALENDAR_DAY("CALENDAR_DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    TrackingUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrackingUnitEnum fromValue(String value) {
      for (TrackingUnitEnum b : TrackingUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TrackingUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrackingUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrackingUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TrackingUnitEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TrackingUnitEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TRACKING_UNIT = "tracking_unit";
  @SerializedName(SERIALIZED_NAME_TRACKING_UNIT)
  @javax.annotation.Nullable
  private TrackingUnitEnum trackingUnit;

  public static final String SERIALIZED_NAME_TRACKING_UNIT_AMOUNT = "tracking_unit_amount";
  @SerializedName(SERIALIZED_NAME_TRACKING_UNIT_AMOUNT)
  @javax.annotation.Nullable
  private Float trackingUnitAmount;

  /**
   * Gets or Sets trackingCadence
   */
  @JsonAdapter(TrackingCadenceEnum.Adapter.class)
  public enum TrackingCadenceEnum {
    FIXED_DAY("FIXED_DAY"),
    
    ANNIVERSARY("ANNIVERSARY");

    private String value;

    TrackingCadenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrackingCadenceEnum fromValue(String value) {
      for (TrackingCadenceEnum b : TrackingCadenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TrackingCadenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrackingCadenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrackingCadenceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TrackingCadenceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TrackingCadenceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TRACKING_CADENCE = "tracking_cadence";
  @SerializedName(SERIALIZED_NAME_TRACKING_CADENCE)
  @javax.annotation.Nullable
  private TrackingCadenceEnum trackingCadence;

  public static final String SERIALIZED_NAME_TRACKING_START_DATE = "tracking_start_date";
  @SerializedName(SERIALIZED_NAME_TRACKING_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime trackingStartDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  /**
   * Gets or Sets leaveType
   */
  @JsonAdapter(LeaveTypeEnum.Adapter.class)
  public enum LeaveTypeEnum {
    SHORT_TERM_LEAVE("SHORT_TERM_LEAVE"),
    
    LONG_TERM_LEAVE("LONG_TERM_LEAVE");

    private String value;

    LeaveTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LeaveTypeEnum fromValue(String value) {
      for (LeaveTypeEnum b : LeaveTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LeaveTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LeaveTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LeaveTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LeaveTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LeaveTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LEAVE_TYPE = "leave_type";
  @SerializedName(SERIALIZED_NAME_LEAVE_TYPE)
  @javax.annotation.Nullable
  private LeaveTypeEnum leaveType;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPES = "time_off_types";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPES)
  @javax.annotation.Nullable
  private List<TimeOffType> timeOffTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  @javax.annotation.Nullable
  private GetPoliciesForProfile200ResponsePoliciesInnerPolicyType policyType;

  public Policy() {
  }

  public Policy id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public Policy name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public Policy description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public Policy policyTypeId(@javax.annotation.Nullable UUID policyTypeId) {
    this.policyTypeId = policyTypeId;
    return this;
  }

  /**
   * Get policyTypeId
   * @return policyTypeId
   */
  @javax.annotation.Nullable
  public UUID getPolicyTypeId() {
    return policyTypeId;
  }

  public void setPolicyTypeId(@javax.annotation.Nullable UUID policyTypeId) {
    this.policyTypeId = policyTypeId;
  }


  public Policy trackingUnit(@javax.annotation.Nullable TrackingUnitEnum trackingUnit) {
    this.trackingUnit = trackingUnit;
    return this;
  }

  /**
   * Get trackingUnit
   * @return trackingUnit
   */
  @javax.annotation.Nullable
  public TrackingUnitEnum getTrackingUnit() {
    return trackingUnit;
  }

  public void setTrackingUnit(@javax.annotation.Nullable TrackingUnitEnum trackingUnit) {
    this.trackingUnit = trackingUnit;
  }


  public Policy trackingUnitAmount(@javax.annotation.Nullable Float trackingUnitAmount) {
    this.trackingUnitAmount = trackingUnitAmount;
    return this;
  }

  /**
   * Get trackingUnitAmount
   * @return trackingUnitAmount
   */
  @javax.annotation.Nullable
  public Float getTrackingUnitAmount() {
    return trackingUnitAmount;
  }

  public void setTrackingUnitAmount(@javax.annotation.Nullable Float trackingUnitAmount) {
    this.trackingUnitAmount = trackingUnitAmount;
  }


  public Policy trackingCadence(@javax.annotation.Nullable TrackingCadenceEnum trackingCadence) {
    this.trackingCadence = trackingCadence;
    return this;
  }

  /**
   * Get trackingCadence
   * @return trackingCadence
   */
  @javax.annotation.Nullable
  public TrackingCadenceEnum getTrackingCadence() {
    return trackingCadence;
  }

  public void setTrackingCadence(@javax.annotation.Nullable TrackingCadenceEnum trackingCadence) {
    this.trackingCadence = trackingCadence;
  }


  public Policy trackingStartDate(@javax.annotation.Nullable OffsetDateTime trackingStartDate) {
    this.trackingStartDate = trackingStartDate;
    return this;
  }

  /**
   * Get trackingStartDate
   * @return trackingStartDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTrackingStartDate() {
    return trackingStartDate;
  }

  public void setTrackingStartDate(@javax.annotation.Nullable OffsetDateTime trackingStartDate) {
    this.trackingStartDate = trackingStartDate;
  }


  public Policy createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Policy updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Policy leaveType(@javax.annotation.Nullable LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * Get leaveType
   * @return leaveType
   */
  @javax.annotation.Nullable
  public LeaveTypeEnum getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(@javax.annotation.Nullable LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
  }


  public Policy timeOffTypes(@javax.annotation.Nullable List<TimeOffType> timeOffTypes) {
    this.timeOffTypes = timeOffTypes;
    return this;
  }

  public Policy addTimeOffTypesItem(TimeOffType timeOffTypesItem) {
    if (this.timeOffTypes == null) {
      this.timeOffTypes = new ArrayList<>();
    }
    this.timeOffTypes.add(timeOffTypesItem);
    return this;
  }

  /**
   * Get timeOffTypes
   * @return timeOffTypes
   */
  @javax.annotation.Nullable
  public List<TimeOffType> getTimeOffTypes() {
    return timeOffTypes;
  }

  public void setTimeOffTypes(@javax.annotation.Nullable List<TimeOffType> timeOffTypes) {
    this.timeOffTypes = timeOffTypes;
  }


  public Policy policyType(@javax.annotation.Nullable GetPoliciesForProfile200ResponsePoliciesInnerPolicyType policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * Get policyType
   * @return policyType
   */
  @javax.annotation.Nullable
  public GetPoliciesForProfile200ResponsePoliciesInnerPolicyType getPolicyType() {
    return policyType;
  }

  public void setPolicyType(@javax.annotation.Nullable GetPoliciesForProfile200ResponsePoliciesInnerPolicyType policyType) {
    this.policyType = policyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.id, policy.id) &&
        Objects.equals(this.name, policy.name) &&
        Objects.equals(this.description, policy.description) &&
        Objects.equals(this.policyTypeId, policy.policyTypeId) &&
        Objects.equals(this.trackingUnit, policy.trackingUnit) &&
        Objects.equals(this.trackingUnitAmount, policy.trackingUnitAmount) &&
        Objects.equals(this.trackingCadence, policy.trackingCadence) &&
        Objects.equals(this.trackingStartDate, policy.trackingStartDate) &&
        Objects.equals(this.createdAt, policy.createdAt) &&
        Objects.equals(this.updatedAt, policy.updatedAt) &&
        Objects.equals(this.leaveType, policy.leaveType) &&
        Objects.equals(this.timeOffTypes, policy.timeOffTypes) &&
        Objects.equals(this.policyType, policy.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, policyTypeId, trackingUnit, trackingUnitAmount, trackingCadence, trackingStartDate, createdAt, updatedAt, leaveType, timeOffTypes, policyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyTypeId: ").append(toIndentedString(policyTypeId)).append("\n");
    sb.append("    trackingUnit: ").append(toIndentedString(trackingUnit)).append("\n");
    sb.append("    trackingUnitAmount: ").append(toIndentedString(trackingUnitAmount)).append("\n");
    sb.append("    trackingCadence: ").append(toIndentedString(trackingCadence)).append("\n");
    sb.append("    trackingStartDate: ").append(toIndentedString(trackingStartDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    timeOffTypes: ").append(toIndentedString(timeOffTypes)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("policy_type_id");
    openapiFields.add("tracking_unit");
    openapiFields.add("tracking_unit_amount");
    openapiFields.add("tracking_cadence");
    openapiFields.add("tracking_start_date");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("leave_type");
    openapiFields.add("time_off_types");
    openapiFields.add("policy_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Policy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policy is not found in the empty JSON string", Policy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Policy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("policy_type_id") != null && !jsonObj.get("policy_type_id").isJsonNull()) && !jsonObj.get("policy_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type_id").toString()));
      }
      if ((jsonObj.get("tracking_unit") != null && !jsonObj.get("tracking_unit").isJsonNull()) && !jsonObj.get("tracking_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_unit").toString()));
      }
      // validate the optional field `tracking_unit`
      if (jsonObj.get("tracking_unit") != null && !jsonObj.get("tracking_unit").isJsonNull()) {
        TrackingUnitEnum.validateJsonElement(jsonObj.get("tracking_unit"));
      }
      if ((jsonObj.get("tracking_cadence") != null && !jsonObj.get("tracking_cadence").isJsonNull()) && !jsonObj.get("tracking_cadence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_cadence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_cadence").toString()));
      }
      // validate the optional field `tracking_cadence`
      if (jsonObj.get("tracking_cadence") != null && !jsonObj.get("tracking_cadence").isJsonNull()) {
        TrackingCadenceEnum.validateJsonElement(jsonObj.get("tracking_cadence"));
      }
      if ((jsonObj.get("leave_type") != null && !jsonObj.get("leave_type").isJsonNull()) && !jsonObj.get("leave_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leave_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leave_type").toString()));
      }
      // validate the optional field `leave_type`
      if (jsonObj.get("leave_type") != null && !jsonObj.get("leave_type").isJsonNull()) {
        LeaveTypeEnum.validateJsonElement(jsonObj.get("leave_type"));
      }
      if (jsonObj.get("time_off_types") != null && !jsonObj.get("time_off_types").isJsonNull()) {
        JsonArray jsonArraytimeOffTypes = jsonObj.getAsJsonArray("time_off_types");
        if (jsonArraytimeOffTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("time_off_types").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `time_off_types` to be an array in the JSON string but got `%s`", jsonObj.get("time_off_types").toString()));
          }

          // validate the optional field `time_off_types` (array)
          for (int i = 0; i < jsonArraytimeOffTypes.size(); i++) {
            TimeOffType.validateJsonElement(jsonArraytimeOffTypes.get(i));
          };
        }
      }
      // validate the optional field `policy_type`
      if (jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) {
        GetPoliciesForProfile200ResponsePoliciesInnerPolicyType.validateJsonElement(jsonObj.get("policy_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policy.class));

       return (TypeAdapter<T>) new TypeAdapter<Policy>() {
           @Override
           public void write(JsonWriter out, Policy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Policy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Policy
   * @throws IOException if the JSON string is invalid with respect to Policy
   */
  public static Policy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policy.class);
  }

  /**
   * Convert an instance of Policy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

