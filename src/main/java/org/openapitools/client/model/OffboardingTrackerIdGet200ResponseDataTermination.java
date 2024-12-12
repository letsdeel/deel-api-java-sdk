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
import java.util.Arrays;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataTerminationInitiatedBy;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataTerminationTerminationImpact;
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
 * OffboardingTrackerIdGet200ResponseDataTermination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerIdGet200ResponseDataTermination {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private String endDate;

  public static final String SERIALIZED_NAME_ENDING_TYPE = "ending_type";
  @SerializedName(SERIALIZED_NAME_ENDING_TYPE)
  @javax.annotation.Nullable
  private String endingType;

  public static final String SERIALIZED_NAME_INITIATED_AT = "initiated_at";
  @SerializedName(SERIALIZED_NAME_INITIATED_AT)
  @javax.annotation.Nullable
  private String initiatedAt;

  public static final String SERIALIZED_NAME_INITIATED_BY = "initiated_by";
  @SerializedName(SERIALIZED_NAME_INITIATED_BY)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataTerminationInitiatedBy initiatedBy;

  public static final String SERIALIZED_NAME_PUBLIC_MESSAGE = "public_message";
  @SerializedName(SERIALIZED_NAME_PUBLIC_MESSAGE)
  @javax.annotation.Nullable
  private String publicMessage;

  public static final String SERIALIZED_NAME_TERMINATION_IMPACT = "termination_impact";
  @SerializedName(SERIALIZED_NAME_TERMINATION_IMPACT)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataTerminationTerminationImpact terminationImpact;

  public static final String SERIALIZED_NAME_ELIGIBLE_FOR_REHIRE = "eligible_for_rehire";
  @SerializedName(SERIALIZED_NAME_ELIGIBLE_FOR_REHIRE)
  @javax.annotation.Nullable
  private String eligibleForRehire;

  public static final String SERIALIZED_NAME_ELIGIBLE_FOR_REHIRE_REASON = "eligible_for_rehire_reason";
  @SerializedName(SERIALIZED_NAME_ELIGIBLE_FOR_REHIRE_REASON)
  @javax.annotation.Nullable
  private String eligibleForRehireReason;

  public OffboardingTrackerIdGet200ResponseDataTermination() {
  }

  public OffboardingTrackerIdGet200ResponseDataTermination id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The termination ID
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination endDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the contract termination.
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination endingType(@javax.annotation.Nullable String endingType) {
    this.endingType = endingType;
    return this;
  }

  /**
   * The type of termination (e.g., ENDING_CONTRACT).
   * @return endingType
   */
  @javax.annotation.Nullable
  public String getEndingType() {
    return endingType;
  }

  public void setEndingType(@javax.annotation.Nullable String endingType) {
    this.endingType = endingType;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination initiatedAt(@javax.annotation.Nullable String initiatedAt) {
    this.initiatedAt = initiatedAt;
    return this;
  }

  /**
   * The date and time when the termination was initiated.
   * @return initiatedAt
   */
  @javax.annotation.Nullable
  public String getInitiatedAt() {
    return initiatedAt;
  }

  public void setInitiatedAt(@javax.annotation.Nullable String initiatedAt) {
    this.initiatedAt = initiatedAt;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination initiatedBy(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataTerminationInitiatedBy initiatedBy) {
    this.initiatedBy = initiatedBy;
    return this;
  }

  /**
   * Get initiatedBy
   * @return initiatedBy
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataTerminationInitiatedBy getInitiatedBy() {
    return initiatedBy;
  }

  public void setInitiatedBy(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataTerminationInitiatedBy initiatedBy) {
    this.initiatedBy = initiatedBy;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination publicMessage(@javax.annotation.Nullable String publicMessage) {
    this.publicMessage = publicMessage;
    return this;
  }

  /**
   * A public message regarding the termination.
   * @return publicMessage
   */
  @javax.annotation.Nullable
  public String getPublicMessage() {
    return publicMessage;
  }

  public void setPublicMessage(@javax.annotation.Nullable String publicMessage) {
    this.publicMessage = publicMessage;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination terminationImpact(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataTerminationTerminationImpact terminationImpact) {
    this.terminationImpact = terminationImpact;
    return this;
  }

  /**
   * Get terminationImpact
   * @return terminationImpact
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataTerminationTerminationImpact getTerminationImpact() {
    return terminationImpact;
  }

  public void setTerminationImpact(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataTerminationTerminationImpact terminationImpact) {
    this.terminationImpact = terminationImpact;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination eligibleForRehire(@javax.annotation.Nullable String eligibleForRehire) {
    this.eligibleForRehire = eligibleForRehire;
    return this;
  }

  /**
   * Indicates whether the individual is eligible for rehire.
   * @return eligibleForRehire
   */
  @javax.annotation.Nullable
  public String getEligibleForRehire() {
    return eligibleForRehire;
  }

  public void setEligibleForRehire(@javax.annotation.Nullable String eligibleForRehire) {
    this.eligibleForRehire = eligibleForRehire;
  }


  public OffboardingTrackerIdGet200ResponseDataTermination eligibleForRehireReason(@javax.annotation.Nullable String eligibleForRehireReason) {
    this.eligibleForRehireReason = eligibleForRehireReason;
    return this;
  }

  /**
   * The reason why the individual is or is not eligible for rehire.
   * @return eligibleForRehireReason
   */
  @javax.annotation.Nullable
  public String getEligibleForRehireReason() {
    return eligibleForRehireReason;
  }

  public void setEligibleForRehireReason(@javax.annotation.Nullable String eligibleForRehireReason) {
    this.eligibleForRehireReason = eligibleForRehireReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerIdGet200ResponseDataTermination offboardingTrackerIdGet200ResponseDataTermination = (OffboardingTrackerIdGet200ResponseDataTermination) o;
    return Objects.equals(this.id, offboardingTrackerIdGet200ResponseDataTermination.id) &&
        Objects.equals(this.endDate, offboardingTrackerIdGet200ResponseDataTermination.endDate) &&
        Objects.equals(this.endingType, offboardingTrackerIdGet200ResponseDataTermination.endingType) &&
        Objects.equals(this.initiatedAt, offboardingTrackerIdGet200ResponseDataTermination.initiatedAt) &&
        Objects.equals(this.initiatedBy, offboardingTrackerIdGet200ResponseDataTermination.initiatedBy) &&
        Objects.equals(this.publicMessage, offboardingTrackerIdGet200ResponseDataTermination.publicMessage) &&
        Objects.equals(this.terminationImpact, offboardingTrackerIdGet200ResponseDataTermination.terminationImpact) &&
        Objects.equals(this.eligibleForRehire, offboardingTrackerIdGet200ResponseDataTermination.eligibleForRehire) &&
        Objects.equals(this.eligibleForRehireReason, offboardingTrackerIdGet200ResponseDataTermination.eligibleForRehireReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, endDate, endingType, initiatedAt, initiatedBy, publicMessage, terminationImpact, eligibleForRehire, eligibleForRehireReason);
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
    sb.append("class OffboardingTrackerIdGet200ResponseDataTermination {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endingType: ").append(toIndentedString(endingType)).append("\n");
    sb.append("    initiatedAt: ").append(toIndentedString(initiatedAt)).append("\n");
    sb.append("    initiatedBy: ").append(toIndentedString(initiatedBy)).append("\n");
    sb.append("    publicMessage: ").append(toIndentedString(publicMessage)).append("\n");
    sb.append("    terminationImpact: ").append(toIndentedString(terminationImpact)).append("\n");
    sb.append("    eligibleForRehire: ").append(toIndentedString(eligibleForRehire)).append("\n");
    sb.append("    eligibleForRehireReason: ").append(toIndentedString(eligibleForRehireReason)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("ending_type");
    openapiFields.add("initiated_at");
    openapiFields.add("initiated_by");
    openapiFields.add("public_message");
    openapiFields.add("termination_impact");
    openapiFields.add("eligible_for_rehire");
    openapiFields.add("eligible_for_rehire_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerIdGet200ResponseDataTermination
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerIdGet200ResponseDataTermination.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerIdGet200ResponseDataTermination is not found in the empty JSON string", OffboardingTrackerIdGet200ResponseDataTermination.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerIdGet200ResponseDataTermination.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerIdGet200ResponseDataTermination` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("ending_type") != null && !jsonObj.get("ending_type").isJsonNull()) && !jsonObj.get("ending_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ending_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ending_type").toString()));
      }
      if ((jsonObj.get("initiated_at") != null && !jsonObj.get("initiated_at").isJsonNull()) && !jsonObj.get("initiated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initiated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initiated_at").toString()));
      }
      // validate the optional field `initiated_by`
      if (jsonObj.get("initiated_by") != null && !jsonObj.get("initiated_by").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataTerminationInitiatedBy.validateJsonElement(jsonObj.get("initiated_by"));
      }
      if ((jsonObj.get("public_message") != null && !jsonObj.get("public_message").isJsonNull()) && !jsonObj.get("public_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_message").toString()));
      }
      // validate the optional field `termination_impact`
      if (jsonObj.get("termination_impact") != null && !jsonObj.get("termination_impact").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataTerminationTerminationImpact.validateJsonElement(jsonObj.get("termination_impact"));
      }
      if ((jsonObj.get("eligible_for_rehire") != null && !jsonObj.get("eligible_for_rehire").isJsonNull()) && !jsonObj.get("eligible_for_rehire").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eligible_for_rehire` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eligible_for_rehire").toString()));
      }
      if ((jsonObj.get("eligible_for_rehire_reason") != null && !jsonObj.get("eligible_for_rehire_reason").isJsonNull()) && !jsonObj.get("eligible_for_rehire_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eligible_for_rehire_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eligible_for_rehire_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerIdGet200ResponseDataTermination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerIdGet200ResponseDataTermination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerIdGet200ResponseDataTermination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerIdGet200ResponseDataTermination.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerIdGet200ResponseDataTermination>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerIdGet200ResponseDataTermination value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerIdGet200ResponseDataTermination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerIdGet200ResponseDataTermination given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerIdGet200ResponseDataTermination
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerIdGet200ResponseDataTermination
   */
  public static OffboardingTrackerIdGet200ResponseDataTermination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerIdGet200ResponseDataTermination.class);
  }

  /**
   * Convert an instance of OffboardingTrackerIdGet200ResponseDataTermination to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

