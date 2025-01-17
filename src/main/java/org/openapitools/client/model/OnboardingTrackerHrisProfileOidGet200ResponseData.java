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
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist;
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataContract;
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile;
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataProfile;
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataProgress;
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataStepperInner;
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataSummaryInner;

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
 * OnboardingTrackerHrisProfileOidGet200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class OnboardingTrackerHrisProfileOidGet200ResponseData {
  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  @javax.annotation.Nullable
  private OnboardingTrackerHrisProfileOidGet200ResponseDataProfile profile;

  public static final String SERIALIZED_NAME_STEPPER = "stepper";
  @SerializedName(SERIALIZED_NAME_STEPPER)
  @javax.annotation.Nullable
  private List<OnboardingTrackerHrisProfileOidGet200ResponseDataStepperInner> stepper = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  @javax.annotation.Nullable
  private List<OnboardingTrackerHrisProfileOidGet200ResponseDataSummaryInner> summary = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nullable
  private OnboardingTrackerHrisProfileOidGet200ResponseDataContract contract;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  @javax.annotation.Nullable
  private OnboardingTrackerHrisProfileOidGet200ResponseDataProgress progress;

  public static final String SERIALIZED_NAME_CHECKLIST = "checklist";
  @SerializedName(SERIALIZED_NAME_CHECKLIST)
  @javax.annotation.Nullable
  private OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist checklist;

  public static final String SERIALIZED_NAME_HIRING_TYPE = "hiring_type";
  @SerializedName(SERIALIZED_NAME_HIRING_TYPE)
  @javax.annotation.Nullable
  private String hiringType;

  public static final String SERIALIZED_NAME_HRIS_PROFILE = "hris_profile";
  @SerializedName(SERIALIZED_NAME_HRIS_PROFILE)
  @javax.annotation.Nullable
  private OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile hrisProfile;

  public OnboardingTrackerHrisProfileOidGet200ResponseData() {
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseData profile(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataProfile profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   */
  @javax.annotation.Nullable
  public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile getProfile() {
    return profile;
  }

  public void setProfile(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataProfile profile) {
    this.profile = profile;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseData stepper(@javax.annotation.Nullable List<OnboardingTrackerHrisProfileOidGet200ResponseDataStepperInner> stepper) {
    this.stepper = stepper;
    return this;
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseData addStepperItem(OnboardingTrackerHrisProfileOidGet200ResponseDataStepperInner stepperItem) {
    if (this.stepper == null) {
      this.stepper = new ArrayList<>();
    }
    this.stepper.add(stepperItem);
    return this;
  }

  /**
   * Get stepper
   * @return stepper
   */
  @javax.annotation.Nullable
  public List<OnboardingTrackerHrisProfileOidGet200ResponseDataStepperInner> getStepper() {
    return stepper;
  }

  public void setStepper(@javax.annotation.Nullable List<OnboardingTrackerHrisProfileOidGet200ResponseDataStepperInner> stepper) {
    this.stepper = stepper;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseData summary(@javax.annotation.Nullable List<OnboardingTrackerHrisProfileOidGet200ResponseDataSummaryInner> summary) {
    this.summary = summary;
    return this;
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseData addSummaryItem(OnboardingTrackerHrisProfileOidGet200ResponseDataSummaryInner summaryItem) {
    if (this.summary == null) {
      this.summary = new ArrayList<>();
    }
    this.summary.add(summaryItem);
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nullable
  public List<OnboardingTrackerHrisProfileOidGet200ResponseDataSummaryInner> getSummary() {
    return summary;
  }

  public void setSummary(@javax.annotation.Nullable List<OnboardingTrackerHrisProfileOidGet200ResponseDataSummaryInner> summary) {
    this.summary = summary;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseData contract(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nullable
  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataContract contract) {
    this.contract = contract;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseData progress(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public OnboardingTrackerHrisProfileOidGet200ResponseDataProgress getProgress() {
    return progress;
  }

  public void setProgress(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataProgress progress) {
    this.progress = progress;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseData checklist(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist checklist) {
    this.checklist = checklist;
    return this;
  }

  /**
   * Get checklist
   * @return checklist
   */
  @javax.annotation.Nullable
  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist getChecklist() {
    return checklist;
  }

  public void setChecklist(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist checklist) {
    this.checklist = checklist;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseData hiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
    return this;
  }

  /**
   * Hiring type (e.g., contractor)
   * @return hiringType
   */
  @javax.annotation.Nullable
  public String getHiringType() {
    return hiringType;
  }

  public void setHiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseData hrisProfile(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
    return this;
  }

  /**
   * Get hrisProfile
   * @return hrisProfile
   */
  @javax.annotation.Nullable
  public OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile getHrisProfile() {
    return hrisProfile;
  }

  public void setHrisProfile(@javax.annotation.Nullable OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTrackerHrisProfileOidGet200ResponseData onboardingTrackerHrisProfileOidGet200ResponseData = (OnboardingTrackerHrisProfileOidGet200ResponseData) o;
    return Objects.equals(this.profile, onboardingTrackerHrisProfileOidGet200ResponseData.profile) &&
        Objects.equals(this.stepper, onboardingTrackerHrisProfileOidGet200ResponseData.stepper) &&
        Objects.equals(this.summary, onboardingTrackerHrisProfileOidGet200ResponseData.summary) &&
        Objects.equals(this.contract, onboardingTrackerHrisProfileOidGet200ResponseData.contract) &&
        Objects.equals(this.progress, onboardingTrackerHrisProfileOidGet200ResponseData.progress) &&
        Objects.equals(this.checklist, onboardingTrackerHrisProfileOidGet200ResponseData.checklist) &&
        Objects.equals(this.hiringType, onboardingTrackerHrisProfileOidGet200ResponseData.hiringType) &&
        Objects.equals(this.hrisProfile, onboardingTrackerHrisProfileOidGet200ResponseData.hrisProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, stepper, summary, contract, progress, checklist, hiringType, hrisProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTrackerHrisProfileOidGet200ResponseData {\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    stepper: ").append(toIndentedString(stepper)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    checklist: ").append(toIndentedString(checklist)).append("\n");
    sb.append("    hiringType: ").append(toIndentedString(hiringType)).append("\n");
    sb.append("    hrisProfile: ").append(toIndentedString(hrisProfile)).append("\n");
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
    openapiFields.add("profile");
    openapiFields.add("stepper");
    openapiFields.add("summary");
    openapiFields.add("contract");
    openapiFields.add("progress");
    openapiFields.add("checklist");
    openapiFields.add("hiring_type");
    openapiFields.add("hris_profile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTrackerHrisProfileOidGet200ResponseData is not found in the empty JSON string", OnboardingTrackerHrisProfileOidGet200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingTrackerHrisProfileOidGet200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `profile`
      if (jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) {
        OnboardingTrackerHrisProfileOidGet200ResponseDataProfile.validateJsonElement(jsonObj.get("profile"));
      }
      if (jsonObj.get("stepper") != null && !jsonObj.get("stepper").isJsonNull()) {
        JsonArray jsonArraystepper = jsonObj.getAsJsonArray("stepper");
        if (jsonArraystepper != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stepper").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stepper` to be an array in the JSON string but got `%s`", jsonObj.get("stepper").toString()));
          }

          // validate the optional field `stepper` (array)
          for (int i = 0; i < jsonArraystepper.size(); i++) {
            OnboardingTrackerHrisProfileOidGet200ResponseDataStepperInner.validateJsonElement(jsonArraystepper.get(i));
          };
        }
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        JsonArray jsonArraysummary = jsonObj.getAsJsonArray("summary");
        if (jsonArraysummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("summary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `summary` to be an array in the JSON string but got `%s`", jsonObj.get("summary").toString()));
          }

          // validate the optional field `summary` (array)
          for (int i = 0; i < jsonArraysummary.size(); i++) {
            OnboardingTrackerHrisProfileOidGet200ResponseDataSummaryInner.validateJsonElement(jsonArraysummary.get(i));
          };
        }
      }
      // validate the optional field `contract`
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) {
        OnboardingTrackerHrisProfileOidGet200ResponseDataContract.validateJsonElement(jsonObj.get("contract"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        OnboardingTrackerHrisProfileOidGet200ResponseDataProgress.validateJsonElement(jsonObj.get("progress"));
      }
      // validate the optional field `checklist`
      if (jsonObj.get("checklist") != null && !jsonObj.get("checklist").isJsonNull()) {
        OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist.validateJsonElement(jsonObj.get("checklist"));
      }
      if ((jsonObj.get("hiring_type") != null && !jsonObj.get("hiring_type").isJsonNull()) && !jsonObj.get("hiring_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_type").toString()));
      }
      // validate the optional field `hris_profile`
      if (jsonObj.get("hris_profile") != null && !jsonObj.get("hris_profile").isJsonNull()) {
        OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.validateJsonElement(jsonObj.get("hris_profile"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTrackerHrisProfileOidGet200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTrackerHrisProfileOidGet200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTrackerHrisProfileOidGet200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseData>() {
           @Override
           public void write(JsonWriter out, OnboardingTrackerHrisProfileOidGet200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingTrackerHrisProfileOidGet200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnboardingTrackerHrisProfileOidGet200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingTrackerHrisProfileOidGet200ResponseData
   * @throws IOException if the JSON string is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseData
   */
  public static OnboardingTrackerHrisProfileOidGet200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTrackerHrisProfileOidGet200ResponseData.class);
  }

  /**
   * Convert an instance of OnboardingTrackerHrisProfileOidGet200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

