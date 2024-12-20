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
import java.util.Arrays;
import java.util.UUID;

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
 * GetProfileEntitlements200ResponseEntitlementsInnerEventsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class GetProfileEntitlements200ResponseEntitlementsInnerEventsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  /**
   * Event type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACCRUAL("ACCRUAL"),
    
    ACCRUAL_DEDUCTION("ACCRUAL_DEDUCTION"),
    
    ACCRUAL_PRORATE("ACCRUAL_PRORATE"),
    
    ACCRUAL_TERMINATION("ACCRUAL_TERMINATION"),
    
    MANUAL_ADJUSTMENT("MANUAL_ADJUSTMENT"),
    
    NO_ROLLOVER("NO_ROLLOVER"),
    
    ROLLOVER_ADJUSTMENT("ROLLOVER_ADJUSTMENT"),
    
    ROLLOVER_CARRY_OVER("ROLLOVER_CARRY_OVER"),
    
    ROLLOVER_EXPIRATION("ROLLOVER_EXPIRATION"),
    
    ROLLOVER_PAYOUT("ROLLOVER_PAYOUT"),
    
    ROLLOVER_PROJECTED("ROLLOVER_PROJECTED"),
    
    TIME_OFF("TIME_OFF");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private Float amount;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  @javax.annotation.Nonnull
  private UUID policyId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EVENT_DATE = "event_date";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  @javax.annotation.Nonnull
  private UUID profileId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_TIME_OFF_ID = "time_off_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_ID)
  @javax.annotation.Nullable
  private UUID timeOffId;

  public static final String SERIALIZED_NAME_ACCRUAL_DATE = "accrual_date";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime accrualDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_TRACKING_PERIOD = "tracking_period";
  @SerializedName(SERIALIZED_NAME_TRACKING_PERIOD)
  @javax.annotation.Nonnull
  private OffsetDateTime trackingPeriod;

  public static final String SERIALIZED_NAME_ROLLOVER_TRACKING_PERIOD = "rollover_tracking_period";
  @SerializedName(SERIALIZED_NAME_ROLLOVER_TRACKING_PERIOD)
  @javax.annotation.Nullable
  private OffsetDateTime rolloverTrackingPeriod;

  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner() {
  }

  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Event ID
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Event type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner amount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Event amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public Float getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner policyId(@javax.annotation.Nonnull UUID policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Policy ID
   * @return policyId
   */
  @javax.annotation.Nonnull
  public UUID getPolicyId() {
    return policyId;
  }

  public void setPolicyId(@javax.annotation.Nonnull UUID policyId) {
    this.policyId = policyId;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Event creation date
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner eventDate(@javax.annotation.Nullable OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Event date
   * @return eventDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(@javax.annotation.Nullable OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner profileId(@javax.annotation.Nonnull UUID profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Profile ID
   * @return profileId
   */
  @javax.annotation.Nonnull
  public UUID getProfileId() {
    return profileId;
  }

  public void setProfileId(@javax.annotation.Nonnull UUID profileId) {
    this.profileId = profileId;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Event update date
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Event description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner timeOffId(@javax.annotation.Nullable UUID timeOffId) {
    this.timeOffId = timeOffId;
    return this;
  }

  /**
   * Time off ID
   * @return timeOffId
   */
  @javax.annotation.Nullable
  public UUID getTimeOffId() {
    return timeOffId;
  }

  public void setTimeOffId(@javax.annotation.Nullable UUID timeOffId) {
    this.timeOffId = timeOffId;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner accrualDate(@javax.annotation.Nullable OffsetDateTime accrualDate) {
    this.accrualDate = accrualDate;
    return this;
  }

  /**
   * Accrual date
   * @return accrualDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getAccrualDate() {
    return accrualDate;
  }

  public void setAccrualDate(@javax.annotation.Nullable OffsetDateTime accrualDate) {
    this.accrualDate = accrualDate;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner expirationDate(@javax.annotation.Nullable OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Expiration date
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(@javax.annotation.Nullable OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner trackingPeriod(@javax.annotation.Nonnull OffsetDateTime trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
    return this;
  }

  /**
   * Tracking period
   * @return trackingPeriod
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getTrackingPeriod() {
    return trackingPeriod;
  }

  public void setTrackingPeriod(@javax.annotation.Nonnull OffsetDateTime trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner rolloverTrackingPeriod(@javax.annotation.Nullable OffsetDateTime rolloverTrackingPeriod) {
    this.rolloverTrackingPeriod = rolloverTrackingPeriod;
    return this;
  }

  /**
   * Rollover tracking period
   * @return rolloverTrackingPeriod
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRolloverTrackingPeriod() {
    return rolloverTrackingPeriod;
  }

  public void setRolloverTrackingPeriod(@javax.annotation.Nullable OffsetDateTime rolloverTrackingPeriod) {
    this.rolloverTrackingPeriod = rolloverTrackingPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfileEntitlements200ResponseEntitlementsInnerEventsInner getProfileEntitlements200ResponseEntitlementsInnerEventsInner = (GetProfileEntitlements200ResponseEntitlementsInnerEventsInner) o;
    return Objects.equals(this.id, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.id) &&
        Objects.equals(this.type, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.type) &&
        Objects.equals(this.amount, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.amount) &&
        Objects.equals(this.policyId, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.policyId) &&
        Objects.equals(this.createdAt, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.createdAt) &&
        Objects.equals(this.eventDate, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.eventDate) &&
        Objects.equals(this.profileId, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.profileId) &&
        Objects.equals(this.updatedAt, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.updatedAt) &&
        Objects.equals(this.description, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.description) &&
        Objects.equals(this.timeOffId, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.timeOffId) &&
        Objects.equals(this.accrualDate, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.accrualDate) &&
        Objects.equals(this.expirationDate, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.expirationDate) &&
        Objects.equals(this.trackingPeriod, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.trackingPeriod) &&
        Objects.equals(this.rolloverTrackingPeriod, getProfileEntitlements200ResponseEntitlementsInnerEventsInner.rolloverTrackingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, amount, policyId, createdAt, eventDate, profileId, updatedAt, description, timeOffId, accrualDate, expirationDate, trackingPeriod, rolloverTrackingPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfileEntitlements200ResponseEntitlementsInnerEventsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeOffId: ").append(toIndentedString(timeOffId)).append("\n");
    sb.append("    accrualDate: ").append(toIndentedString(accrualDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    trackingPeriod: ").append(toIndentedString(trackingPeriod)).append("\n");
    sb.append("    rolloverTrackingPeriod: ").append(toIndentedString(rolloverTrackingPeriod)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("amount");
    openapiFields.add("policy_id");
    openapiFields.add("created_at");
    openapiFields.add("event_date");
    openapiFields.add("profile_id");
    openapiFields.add("updated_at");
    openapiFields.add("description");
    openapiFields.add("time_off_id");
    openapiFields.add("accrual_date");
    openapiFields.add("expiration_date");
    openapiFields.add("tracking_period");
    openapiFields.add("rollover_tracking_period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("policy_id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("profile_id");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("tracking_period");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerEventsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProfileEntitlements200ResponseEntitlementsInnerEventsInner is not found in the empty JSON string", GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProfileEntitlements200ResponseEntitlementsInnerEventsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if (!jsonObj.get("profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("time_off_id") != null && !jsonObj.get("time_off_id").isJsonNull()) && !jsonObj.get("time_off_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProfileEntitlements200ResponseEntitlementsInnerEventsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInnerEventsInner>() {
           @Override
           public void write(JsonWriter out, GetProfileEntitlements200ResponseEntitlementsInnerEventsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProfileEntitlements200ResponseEntitlementsInnerEventsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetProfileEntitlements200ResponseEntitlementsInnerEventsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetProfileEntitlements200ResponseEntitlementsInnerEventsInner
   * @throws IOException if the JSON string is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerEventsInner
   */
  public static GetProfileEntitlements200ResponseEntitlementsInnerEventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.class);
  }

  /**
   * Convert an instance of GetProfileEntitlements200ResponseEntitlementsInnerEventsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

