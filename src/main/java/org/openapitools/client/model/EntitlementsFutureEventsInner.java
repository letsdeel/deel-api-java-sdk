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
 * EntitlementsFutureEventsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T13:30:33.173921421Z[GMT]", comments = "Generator version: 7.10.0")
public class EntitlementsFutureEventsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  @javax.annotation.Nullable
  private UUID profileId;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  @javax.annotation.Nullable
  private UUID policyId;

  public static final String SERIALIZED_NAME_TIME_OFF_ID = "time_off_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_ID)
  @javax.annotation.Nullable
  private UUID timeOffId;

  public static final String SERIALIZED_NAME_TRACKING_PERIOD = "tracking_period";
  @SerializedName(SERIALIZED_NAME_TRACKING_PERIOD)
  @javax.annotation.Nullable
  private OffsetDateTime trackingPeriod;

  /**
   * Gets or Sets type
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
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private Float amount;

  public EntitlementsFutureEventsInner() {
  }

  public EntitlementsFutureEventsInner id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public EntitlementsFutureEventsInner profileId(@javax.annotation.Nullable UUID profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   * @return profileId
   */
  @javax.annotation.Nullable
  public UUID getProfileId() {
    return profileId;
  }

  public void setProfileId(@javax.annotation.Nullable UUID profileId) {
    this.profileId = profileId;
  }


  public EntitlementsFutureEventsInner policyId(@javax.annotation.Nullable UUID policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
   */
  @javax.annotation.Nullable
  public UUID getPolicyId() {
    return policyId;
  }

  public void setPolicyId(@javax.annotation.Nullable UUID policyId) {
    this.policyId = policyId;
  }


  public EntitlementsFutureEventsInner timeOffId(@javax.annotation.Nullable UUID timeOffId) {
    this.timeOffId = timeOffId;
    return this;
  }

  /**
   * Get timeOffId
   * @return timeOffId
   */
  @javax.annotation.Nullable
  public UUID getTimeOffId() {
    return timeOffId;
  }

  public void setTimeOffId(@javax.annotation.Nullable UUID timeOffId) {
    this.timeOffId = timeOffId;
  }


  public EntitlementsFutureEventsInner trackingPeriod(@javax.annotation.Nullable OffsetDateTime trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
    return this;
  }

  /**
   * Get trackingPeriod
   * @return trackingPeriod
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTrackingPeriod() {
    return trackingPeriod;
  }

  public void setTrackingPeriod(@javax.annotation.Nullable OffsetDateTime trackingPeriod) {
    this.trackingPeriod = trackingPeriod;
  }


  public EntitlementsFutureEventsInner type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public EntitlementsFutureEventsInner description(@javax.annotation.Nullable String description) {
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


  public EntitlementsFutureEventsInner amount(@javax.annotation.Nullable Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  public Float getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable Float amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementsFutureEventsInner entitlementsFutureEventsInner = (EntitlementsFutureEventsInner) o;
    return Objects.equals(this.id, entitlementsFutureEventsInner.id) &&
        Objects.equals(this.profileId, entitlementsFutureEventsInner.profileId) &&
        Objects.equals(this.policyId, entitlementsFutureEventsInner.policyId) &&
        Objects.equals(this.timeOffId, entitlementsFutureEventsInner.timeOffId) &&
        Objects.equals(this.trackingPeriod, entitlementsFutureEventsInner.trackingPeriod) &&
        Objects.equals(this.type, entitlementsFutureEventsInner.type) &&
        Objects.equals(this.description, entitlementsFutureEventsInner.description) &&
        Objects.equals(this.amount, entitlementsFutureEventsInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profileId, policyId, timeOffId, trackingPeriod, type, description, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementsFutureEventsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    timeOffId: ").append(toIndentedString(timeOffId)).append("\n");
    sb.append("    trackingPeriod: ").append(toIndentedString(trackingPeriod)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("profile_id");
    openapiFields.add("policy_id");
    openapiFields.add("time_off_id");
    openapiFields.add("tracking_period");
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EntitlementsFutureEventsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EntitlementsFutureEventsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntitlementsFutureEventsInner is not found in the empty JSON string", EntitlementsFutureEventsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EntitlementsFutureEventsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntitlementsFutureEventsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("profile_id") != null && !jsonObj.get("profile_id").isJsonNull()) && !jsonObj.get("profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_id").toString()));
      }
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if ((jsonObj.get("time_off_id") != null && !jsonObj.get("time_off_id").isJsonNull()) && !jsonObj.get("time_off_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntitlementsFutureEventsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntitlementsFutureEventsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntitlementsFutureEventsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntitlementsFutureEventsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EntitlementsFutureEventsInner>() {
           @Override
           public void write(JsonWriter out, EntitlementsFutureEventsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntitlementsFutureEventsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EntitlementsFutureEventsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EntitlementsFutureEventsInner
   * @throws IOException if the JSON string is invalid with respect to EntitlementsFutureEventsInner
   */
  public static EntitlementsFutureEventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntitlementsFutureEventsInner.class);
  }

  /**
   * Convert an instance of EntitlementsFutureEventsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

