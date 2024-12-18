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
 * OnboardingTrackerHrisProfileOidGet200ResponseDataProgress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:50:05.582888578Z[GMT]", comments = "Generator version: 7.10.0")
public class OnboardingTrackerHrisProfileOidGet200ResponseDataProgress {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_REFERENCE_DATE = "reference_date";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime referenceDate;

  public static final String SERIALIZED_NAME_SUBJECT_TO_OVERDUE = "subject_to_overdue";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TO_OVERDUE)
  @javax.annotation.Nullable
  private Boolean subjectToOverdue;

  public static final String SERIALIZED_NAME_REFERENCE_DATE_TIMEZONE = "reference_date_timezone";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE_TIMEZONE)
  @javax.annotation.Nullable
  private String referenceDateTimezone;

  public static final String SERIALIZED_NAME_IS_ACTION_REQUIRED_FROM_CLIENT = "is_action_required_from_client";
  @SerializedName(SERIALIZED_NAME_IS_ACTION_REQUIRED_FROM_CLIENT)
  @javax.annotation.Nullable
  private Boolean isActionRequiredFromClient;

  public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress() {
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the onboarding process (e.g., ACTIVE)
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress referenceDate(@javax.annotation.Nullable OffsetDateTime referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

  /**
   * Reference date for the progress
   * @return referenceDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(@javax.annotation.Nullable OffsetDateTime referenceDate) {
    this.referenceDate = referenceDate;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress subjectToOverdue(@javax.annotation.Nullable Boolean subjectToOverdue) {
    this.subjectToOverdue = subjectToOverdue;
    return this;
  }

  /**
   * Indicates if the onboarding is subject to overdue
   * @return subjectToOverdue
   */
  @javax.annotation.Nullable
  public Boolean getSubjectToOverdue() {
    return subjectToOverdue;
  }

  public void setSubjectToOverdue(@javax.annotation.Nullable Boolean subjectToOverdue) {
    this.subjectToOverdue = subjectToOverdue;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress referenceDateTimezone(@javax.annotation.Nullable String referenceDateTimezone) {
    this.referenceDateTimezone = referenceDateTimezone;
    return this;
  }

  /**
   * Timezone of the reference date
   * @return referenceDateTimezone
   */
  @javax.annotation.Nullable
  public String getReferenceDateTimezone() {
    return referenceDateTimezone;
  }

  public void setReferenceDateTimezone(@javax.annotation.Nullable String referenceDateTimezone) {
    this.referenceDateTimezone = referenceDateTimezone;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress isActionRequiredFromClient(@javax.annotation.Nullable Boolean isActionRequiredFromClient) {
    this.isActionRequiredFromClient = isActionRequiredFromClient;
    return this;
  }

  /**
   * Indicates if action is required from the client
   * @return isActionRequiredFromClient
   */
  @javax.annotation.Nullable
  public Boolean getIsActionRequiredFromClient() {
    return isActionRequiredFromClient;
  }

  public void setIsActionRequiredFromClient(@javax.annotation.Nullable Boolean isActionRequiredFromClient) {
    this.isActionRequiredFromClient = isActionRequiredFromClient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTrackerHrisProfileOidGet200ResponseDataProgress onboardingTrackerHrisProfileOidGet200ResponseDataProgress = (OnboardingTrackerHrisProfileOidGet200ResponseDataProgress) o;
    return Objects.equals(this.status, onboardingTrackerHrisProfileOidGet200ResponseDataProgress.status) &&
        Objects.equals(this.referenceDate, onboardingTrackerHrisProfileOidGet200ResponseDataProgress.referenceDate) &&
        Objects.equals(this.subjectToOverdue, onboardingTrackerHrisProfileOidGet200ResponseDataProgress.subjectToOverdue) &&
        Objects.equals(this.referenceDateTimezone, onboardingTrackerHrisProfileOidGet200ResponseDataProgress.referenceDateTimezone) &&
        Objects.equals(this.isActionRequiredFromClient, onboardingTrackerHrisProfileOidGet200ResponseDataProgress.isActionRequiredFromClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, referenceDate, subjectToOverdue, referenceDateTimezone, isActionRequiredFromClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTrackerHrisProfileOidGet200ResponseDataProgress {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    subjectToOverdue: ").append(toIndentedString(subjectToOverdue)).append("\n");
    sb.append("    referenceDateTimezone: ").append(toIndentedString(referenceDateTimezone)).append("\n");
    sb.append("    isActionRequiredFromClient: ").append(toIndentedString(isActionRequiredFromClient)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("reference_date");
    openapiFields.add("subject_to_overdue");
    openapiFields.add("reference_date_timezone");
    openapiFields.add("is_action_required_from_client");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataProgress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataProgress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTrackerHrisProfileOidGet200ResponseDataProgress is not found in the empty JSON string", OnboardingTrackerHrisProfileOidGet200ResponseDataProgress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataProgress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingTrackerHrisProfileOidGet200ResponseDataProgress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reference_date_timezone") != null && !jsonObj.get("reference_date_timezone").isJsonNull()) && !jsonObj.get("reference_date_timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_date_timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_date_timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTrackerHrisProfileOidGet200ResponseDataProgress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTrackerHrisProfileOidGet200ResponseDataProgress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataProgress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTrackerHrisProfileOidGet200ResponseDataProgress.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataProgress>() {
           @Override
           public void write(JsonWriter out, OnboardingTrackerHrisProfileOidGet200ResponseDataProgress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataProgress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingTrackerHrisProfileOidGet200ResponseDataProgress
   * @throws IOException if the JSON string is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataProgress
   */
  public static OnboardingTrackerHrisProfileOidGet200ResponseDataProgress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTrackerHrisProfileOidGet200ResponseDataProgress.class);
  }

  /**
   * Convert an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataProgress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

