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
 * ListOnboardingTracker200ResponseDataInnerProgress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class ListOnboardingTracker200ResponseDataInnerProgress {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_REFERENCE_DATE = "reference_date";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime referenceDate;

  public static final String SERIALIZED_NAME_PEOPLE_LIST_STATUS = "people_list_status";
  @SerializedName(SERIALIZED_NAME_PEOPLE_LIST_STATUS)
  @javax.annotation.Nullable
  private String peopleListStatus;

  public static final String SERIALIZED_NAME_SUBJECT_TO_OVERDUE = "subject_to_overdue";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TO_OVERDUE)
  @javax.annotation.Nullable
  private Boolean subjectToOverdue;

  public static final String SERIALIZED_NAME_ONBOARDING_DUE_DATE = "onboarding_due_date";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_DUE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime onboardingDueDate;

  public static final String SERIALIZED_NAME_REFERENCE_DATE_TYPE = "reference_date_type";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE_TYPE)
  @javax.annotation.Nullable
  private String referenceDateType;

  public static final String SERIALIZED_NAME_REFERENCE_DATE_TIMEZONE = "reference_date_timezone";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE_TIMEZONE)
  @javax.annotation.Nullable
  private String referenceDateTimezone;

  public static final String SERIALIZED_NAME_IS_ACTION_REQUIRED_FROM_CLIENT = "is_action_required_from_client";
  @SerializedName(SERIALIZED_NAME_IS_ACTION_REQUIRED_FROM_CLIENT)
  @javax.annotation.Nullable
  private Boolean isActionRequiredFromClient;

  public ListOnboardingTracker200ResponseDataInnerProgress() {
  }

  public ListOnboardingTracker200ResponseDataInnerProgress status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the onboarding
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public ListOnboardingTracker200ResponseDataInnerProgress referenceDate(@javax.annotation.Nullable OffsetDateTime referenceDate) {
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


  public ListOnboardingTracker200ResponseDataInnerProgress peopleListStatus(@javax.annotation.Nullable String peopleListStatus) {
    this.peopleListStatus = peopleListStatus;
    return this;
  }

  /**
   * Status of the people list
   * @return peopleListStatus
   */
  @javax.annotation.Nullable
  public String getPeopleListStatus() {
    return peopleListStatus;
  }

  public void setPeopleListStatus(@javax.annotation.Nullable String peopleListStatus) {
    this.peopleListStatus = peopleListStatus;
  }


  public ListOnboardingTracker200ResponseDataInnerProgress subjectToOverdue(@javax.annotation.Nullable Boolean subjectToOverdue) {
    this.subjectToOverdue = subjectToOverdue;
    return this;
  }

  /**
   * Whether the onboarding is subject to overdue
   * @return subjectToOverdue
   */
  @javax.annotation.Nullable
  public Boolean getSubjectToOverdue() {
    return subjectToOverdue;
  }

  public void setSubjectToOverdue(@javax.annotation.Nullable Boolean subjectToOverdue) {
    this.subjectToOverdue = subjectToOverdue;
  }


  public ListOnboardingTracker200ResponseDataInnerProgress onboardingDueDate(@javax.annotation.Nullable OffsetDateTime onboardingDueDate) {
    this.onboardingDueDate = onboardingDueDate;
    return this;
  }

  /**
   * Due date for onboarding
   * @return onboardingDueDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getOnboardingDueDate() {
    return onboardingDueDate;
  }

  public void setOnboardingDueDate(@javax.annotation.Nullable OffsetDateTime onboardingDueDate) {
    this.onboardingDueDate = onboardingDueDate;
  }


  public ListOnboardingTracker200ResponseDataInnerProgress referenceDateType(@javax.annotation.Nullable String referenceDateType) {
    this.referenceDateType = referenceDateType;
    return this;
  }

  /**
   * Type of the reference date (e.g., EFFECTIVE_DATE)
   * @return referenceDateType
   */
  @javax.annotation.Nullable
  public String getReferenceDateType() {
    return referenceDateType;
  }

  public void setReferenceDateType(@javax.annotation.Nullable String referenceDateType) {
    this.referenceDateType = referenceDateType;
  }


  public ListOnboardingTracker200ResponseDataInnerProgress referenceDateTimezone(@javax.annotation.Nullable String referenceDateTimezone) {
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


  public ListOnboardingTracker200ResponseDataInnerProgress isActionRequiredFromClient(@javax.annotation.Nullable Boolean isActionRequiredFromClient) {
    this.isActionRequiredFromClient = isActionRequiredFromClient;
    return this;
  }

  /**
   * Whether action is required from the client
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
    ListOnboardingTracker200ResponseDataInnerProgress listOnboardingTracker200ResponseDataInnerProgress = (ListOnboardingTracker200ResponseDataInnerProgress) o;
    return Objects.equals(this.status, listOnboardingTracker200ResponseDataInnerProgress.status) &&
        Objects.equals(this.referenceDate, listOnboardingTracker200ResponseDataInnerProgress.referenceDate) &&
        Objects.equals(this.peopleListStatus, listOnboardingTracker200ResponseDataInnerProgress.peopleListStatus) &&
        Objects.equals(this.subjectToOverdue, listOnboardingTracker200ResponseDataInnerProgress.subjectToOverdue) &&
        Objects.equals(this.onboardingDueDate, listOnboardingTracker200ResponseDataInnerProgress.onboardingDueDate) &&
        Objects.equals(this.referenceDateType, listOnboardingTracker200ResponseDataInnerProgress.referenceDateType) &&
        Objects.equals(this.referenceDateTimezone, listOnboardingTracker200ResponseDataInnerProgress.referenceDateTimezone) &&
        Objects.equals(this.isActionRequiredFromClient, listOnboardingTracker200ResponseDataInnerProgress.isActionRequiredFromClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, referenceDate, peopleListStatus, subjectToOverdue, onboardingDueDate, referenceDateType, referenceDateTimezone, isActionRequiredFromClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOnboardingTracker200ResponseDataInnerProgress {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    peopleListStatus: ").append(toIndentedString(peopleListStatus)).append("\n");
    sb.append("    subjectToOverdue: ").append(toIndentedString(subjectToOverdue)).append("\n");
    sb.append("    onboardingDueDate: ").append(toIndentedString(onboardingDueDate)).append("\n");
    sb.append("    referenceDateType: ").append(toIndentedString(referenceDateType)).append("\n");
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
    openapiFields.add("people_list_status");
    openapiFields.add("subject_to_overdue");
    openapiFields.add("onboarding_due_date");
    openapiFields.add("reference_date_type");
    openapiFields.add("reference_date_timezone");
    openapiFields.add("is_action_required_from_client");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListOnboardingTracker200ResponseDataInnerProgress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListOnboardingTracker200ResponseDataInnerProgress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListOnboardingTracker200ResponseDataInnerProgress is not found in the empty JSON string", ListOnboardingTracker200ResponseDataInnerProgress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListOnboardingTracker200ResponseDataInnerProgress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListOnboardingTracker200ResponseDataInnerProgress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("people_list_status") != null && !jsonObj.get("people_list_status").isJsonNull()) && !jsonObj.get("people_list_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `people_list_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("people_list_status").toString()));
      }
      if ((jsonObj.get("reference_date_type") != null && !jsonObj.get("reference_date_type").isJsonNull()) && !jsonObj.get("reference_date_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_date_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_date_type").toString()));
      }
      if ((jsonObj.get("reference_date_timezone") != null && !jsonObj.get("reference_date_timezone").isJsonNull()) && !jsonObj.get("reference_date_timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_date_timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_date_timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListOnboardingTracker200ResponseDataInnerProgress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListOnboardingTracker200ResponseDataInnerProgress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListOnboardingTracker200ResponseDataInnerProgress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListOnboardingTracker200ResponseDataInnerProgress.class));

       return (TypeAdapter<T>) new TypeAdapter<ListOnboardingTracker200ResponseDataInnerProgress>() {
           @Override
           public void write(JsonWriter out, ListOnboardingTracker200ResponseDataInnerProgress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListOnboardingTracker200ResponseDataInnerProgress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListOnboardingTracker200ResponseDataInnerProgress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListOnboardingTracker200ResponseDataInnerProgress
   * @throws IOException if the JSON string is invalid with respect to ListOnboardingTracker200ResponseDataInnerProgress
   */
  public static ListOnboardingTracker200ResponseDataInnerProgress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListOnboardingTracker200ResponseDataInnerProgress.class);
  }

  /**
   * Convert an instance of ListOnboardingTracker200ResponseDataInnerProgress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

