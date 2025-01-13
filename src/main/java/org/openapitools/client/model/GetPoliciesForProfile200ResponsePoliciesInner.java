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
import org.openapitools.client.model.GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner;

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
 * GetPoliciesForProfile200ResponsePoliciesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPoliciesForProfile200ResponsePoliciesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  /**
   * Leave type.
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

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  @javax.annotation.Nullable
  private GetPoliciesForProfile200ResponsePoliciesInnerPolicyType policyType;

  /**
   * Tracking unit.
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

  public static final String SERIALIZED_NAME_POLICY_TYPE_ID = "policy_type_id";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE_ID)
  @javax.annotation.Nullable
  private UUID policyTypeId;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPES = "time_off_types";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPES)
  @javax.annotation.Nullable
  private List<GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner> timeOffTypes = new ArrayList<>();

  /**
   * Tracking cadence.
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

  public static final String SERIALIZED_NAME_TRACKING_UNIT_AMOUNT = "tracking_unit_amount";
  @SerializedName(SERIALIZED_NAME_TRACKING_UNIT_AMOUNT)
  @javax.annotation.Nullable
  private Float trackingUnitAmount;

  public GetPoliciesForProfile200ResponsePoliciesInner() {
  }

  public GetPoliciesForProfile200ResponsePoliciesInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Policy id.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Policy name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Policy creation date.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner leaveType(@javax.annotation.Nullable LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * Leave type.
   * @return leaveType
   */
  @javax.annotation.Nullable
  public LeaveTypeEnum getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(@javax.annotation.Nullable LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Policy update date.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Policy description.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner policyType(@javax.annotation.Nullable GetPoliciesForProfile200ResponsePoliciesInnerPolicyType policyType) {
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


  public GetPoliciesForProfile200ResponsePoliciesInner trackingUnit(@javax.annotation.Nullable TrackingUnitEnum trackingUnit) {
    this.trackingUnit = trackingUnit;
    return this;
  }

  /**
   * Tracking unit.
   * @return trackingUnit
   */
  @javax.annotation.Nullable
  public TrackingUnitEnum getTrackingUnit() {
    return trackingUnit;
  }

  public void setTrackingUnit(@javax.annotation.Nullable TrackingUnitEnum trackingUnit) {
    this.trackingUnit = trackingUnit;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner policyTypeId(@javax.annotation.Nullable UUID policyTypeId) {
    this.policyTypeId = policyTypeId;
    return this;
  }

  /**
   * Policy type id.
   * @return policyTypeId
   */
  @javax.annotation.Nullable
  public UUID getPolicyTypeId() {
    return policyTypeId;
  }

  public void setPolicyTypeId(@javax.annotation.Nullable UUID policyTypeId) {
    this.policyTypeId = policyTypeId;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner timeOffTypes(@javax.annotation.Nullable List<GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner> timeOffTypes) {
    this.timeOffTypes = timeOffTypes;
    return this;
  }

  public GetPoliciesForProfile200ResponsePoliciesInner addTimeOffTypesItem(GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner timeOffTypesItem) {
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
  public List<GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner> getTimeOffTypes() {
    return timeOffTypes;
  }

  public void setTimeOffTypes(@javax.annotation.Nullable List<GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner> timeOffTypes) {
    this.timeOffTypes = timeOffTypes;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner trackingCadence(@javax.annotation.Nullable TrackingCadenceEnum trackingCadence) {
    this.trackingCadence = trackingCadence;
    return this;
  }

  /**
   * Tracking cadence.
   * @return trackingCadence
   */
  @javax.annotation.Nullable
  public TrackingCadenceEnum getTrackingCadence() {
    return trackingCadence;
  }

  public void setTrackingCadence(@javax.annotation.Nullable TrackingCadenceEnum trackingCadence) {
    this.trackingCadence = trackingCadence;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner trackingStartDate(@javax.annotation.Nullable OffsetDateTime trackingStartDate) {
    this.trackingStartDate = trackingStartDate;
    return this;
  }

  /**
   * Tracking start date.
   * @return trackingStartDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTrackingStartDate() {
    return trackingStartDate;
  }

  public void setTrackingStartDate(@javax.annotation.Nullable OffsetDateTime trackingStartDate) {
    this.trackingStartDate = trackingStartDate;
  }


  public GetPoliciesForProfile200ResponsePoliciesInner trackingUnitAmount(@javax.annotation.Nullable Float trackingUnitAmount) {
    this.trackingUnitAmount = trackingUnitAmount;
    return this;
  }

  /**
   * Tracking unit amount.
   * @return trackingUnitAmount
   */
  @javax.annotation.Nullable
  public Float getTrackingUnitAmount() {
    return trackingUnitAmount;
  }

  public void setTrackingUnitAmount(@javax.annotation.Nullable Float trackingUnitAmount) {
    this.trackingUnitAmount = trackingUnitAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPoliciesForProfile200ResponsePoliciesInner getPoliciesForProfile200ResponsePoliciesInner = (GetPoliciesForProfile200ResponsePoliciesInner) o;
    return Objects.equals(this.id, getPoliciesForProfile200ResponsePoliciesInner.id) &&
        Objects.equals(this.name, getPoliciesForProfile200ResponsePoliciesInner.name) &&
        Objects.equals(this.createdAt, getPoliciesForProfile200ResponsePoliciesInner.createdAt) &&
        Objects.equals(this.leaveType, getPoliciesForProfile200ResponsePoliciesInner.leaveType) &&
        Objects.equals(this.updatedAt, getPoliciesForProfile200ResponsePoliciesInner.updatedAt) &&
        Objects.equals(this.description, getPoliciesForProfile200ResponsePoliciesInner.description) &&
        Objects.equals(this.policyType, getPoliciesForProfile200ResponsePoliciesInner.policyType) &&
        Objects.equals(this.trackingUnit, getPoliciesForProfile200ResponsePoliciesInner.trackingUnit) &&
        Objects.equals(this.policyTypeId, getPoliciesForProfile200ResponsePoliciesInner.policyTypeId) &&
        Objects.equals(this.timeOffTypes, getPoliciesForProfile200ResponsePoliciesInner.timeOffTypes) &&
        Objects.equals(this.trackingCadence, getPoliciesForProfile200ResponsePoliciesInner.trackingCadence) &&
        Objects.equals(this.trackingStartDate, getPoliciesForProfile200ResponsePoliciesInner.trackingStartDate) &&
        Objects.equals(this.trackingUnitAmount, getPoliciesForProfile200ResponsePoliciesInner.trackingUnitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, leaveType, updatedAt, description, policyType, trackingUnit, policyTypeId, timeOffTypes, trackingCadence, trackingStartDate, trackingUnitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPoliciesForProfile200ResponsePoliciesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    trackingUnit: ").append(toIndentedString(trackingUnit)).append("\n");
    sb.append("    policyTypeId: ").append(toIndentedString(policyTypeId)).append("\n");
    sb.append("    timeOffTypes: ").append(toIndentedString(timeOffTypes)).append("\n");
    sb.append("    trackingCadence: ").append(toIndentedString(trackingCadence)).append("\n");
    sb.append("    trackingStartDate: ").append(toIndentedString(trackingStartDate)).append("\n");
    sb.append("    trackingUnitAmount: ").append(toIndentedString(trackingUnitAmount)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("leave_type");
    openapiFields.add("updated_at");
    openapiFields.add("description");
    openapiFields.add("policy_type");
    openapiFields.add("tracking_unit");
    openapiFields.add("policy_type_id");
    openapiFields.add("time_off_types");
    openapiFields.add("tracking_cadence");
    openapiFields.add("tracking_start_date");
    openapiFields.add("tracking_unit_amount");

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
   * @throws IOException if the JSON Element is invalid with respect to GetPoliciesForProfile200ResponsePoliciesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPoliciesForProfile200ResponsePoliciesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPoliciesForProfile200ResponsePoliciesInner is not found in the empty JSON string", GetPoliciesForProfile200ResponsePoliciesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPoliciesForProfile200ResponsePoliciesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPoliciesForProfile200ResponsePoliciesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPoliciesForProfile200ResponsePoliciesInner.openapiRequiredFields) {
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
      if ((jsonObj.get("leave_type") != null && !jsonObj.get("leave_type").isJsonNull()) && !jsonObj.get("leave_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leave_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leave_type").toString()));
      }
      // validate the optional field `leave_type`
      if (jsonObj.get("leave_type") != null && !jsonObj.get("leave_type").isJsonNull()) {
        LeaveTypeEnum.validateJsonElement(jsonObj.get("leave_type"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `policy_type`
      if (jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) {
        GetPoliciesForProfile200ResponsePoliciesInnerPolicyType.validateJsonElement(jsonObj.get("policy_type"));
      }
      if ((jsonObj.get("tracking_unit") != null && !jsonObj.get("tracking_unit").isJsonNull()) && !jsonObj.get("tracking_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_unit").toString()));
      }
      // validate the optional field `tracking_unit`
      if (jsonObj.get("tracking_unit") != null && !jsonObj.get("tracking_unit").isJsonNull()) {
        TrackingUnitEnum.validateJsonElement(jsonObj.get("tracking_unit"));
      }
      if ((jsonObj.get("policy_type_id") != null && !jsonObj.get("policy_type_id").isJsonNull()) && !jsonObj.get("policy_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type_id").toString()));
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
            GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.validateJsonElement(jsonArraytimeOffTypes.get(i));
          };
        }
      }
      if ((jsonObj.get("tracking_cadence") != null && !jsonObj.get("tracking_cadence").isJsonNull()) && !jsonObj.get("tracking_cadence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_cadence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_cadence").toString()));
      }
      // validate the optional field `tracking_cadence`
      if (jsonObj.get("tracking_cadence") != null && !jsonObj.get("tracking_cadence").isJsonNull()) {
        TrackingCadenceEnum.validateJsonElement(jsonObj.get("tracking_cadence"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPoliciesForProfile200ResponsePoliciesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPoliciesForProfile200ResponsePoliciesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPoliciesForProfile200ResponsePoliciesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPoliciesForProfile200ResponsePoliciesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPoliciesForProfile200ResponsePoliciesInner>() {
           @Override
           public void write(JsonWriter out, GetPoliciesForProfile200ResponsePoliciesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPoliciesForProfile200ResponsePoliciesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPoliciesForProfile200ResponsePoliciesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPoliciesForProfile200ResponsePoliciesInner
   * @throws IOException if the JSON string is invalid with respect to GetPoliciesForProfile200ResponsePoliciesInner
   */
  public static GetPoliciesForProfile200ResponsePoliciesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPoliciesForProfile200ResponsePoliciesInner.class);
  }

  /**
   * Convert an instance of GetPoliciesForProfile200ResponsePoliciesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

