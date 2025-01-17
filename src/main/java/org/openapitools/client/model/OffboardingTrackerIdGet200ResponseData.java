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
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataAppExperience;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataContract;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataHrisProfile;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataProgress;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataSummaryInner;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataTermination;

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
 * OffboardingTrackerIdGet200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerIdGet200ResponseData {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  @javax.annotation.Nullable
  private List<OffboardingTrackerIdGet200ResponseDataSummaryInner> summary = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataContract contract;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataProgress progress;

  public static final String SERIALIZED_NAME_HIRING_TYPE = "hiring_type";
  @SerializedName(SERIALIZED_NAME_HIRING_TYPE)
  @javax.annotation.Nullable
  private String hiringType;

  public static final String SERIALIZED_NAME_TERMINATION = "termination";
  @SerializedName(SERIALIZED_NAME_TERMINATION)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataTermination termination;

  public static final String SERIALIZED_NAME_HRIS_PROFILE = "hris_profile";
  @SerializedName(SERIALIZED_NAME_HRIS_PROFILE)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataHrisProfile hrisProfile;

  public static final String SERIALIZED_NAME_APP_EXPERIENCE = "app_experience";
  @SerializedName(SERIALIZED_NAME_APP_EXPERIENCE)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataAppExperience appExperience;

  public OffboardingTrackerIdGet200ResponseData() {
  }

  public OffboardingTrackerIdGet200ResponseData summary(@javax.annotation.Nullable List<OffboardingTrackerIdGet200ResponseDataSummaryInner> summary) {
    this.summary = summary;
    return this;
  }

  public OffboardingTrackerIdGet200ResponseData addSummaryItem(OffboardingTrackerIdGet200ResponseDataSummaryInner summaryItem) {
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
  public List<OffboardingTrackerIdGet200ResponseDataSummaryInner> getSummary() {
    return summary;
  }

  public void setSummary(@javax.annotation.Nullable List<OffboardingTrackerIdGet200ResponseDataSummaryInner> summary) {
    this.summary = summary;
  }


  public OffboardingTrackerIdGet200ResponseData contract(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataContract contract) {
    this.contract = contract;
  }


  public OffboardingTrackerIdGet200ResponseData progress(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataProgress getProgress() {
    return progress;
  }

  public void setProgress(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataProgress progress) {
    this.progress = progress;
  }


  public OffboardingTrackerIdGet200ResponseData hiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
    return this;
  }

  /**
   * The hiring type for the contract (e.g., contractor).
   * @return hiringType
   */
  @javax.annotation.Nullable
  public String getHiringType() {
    return hiringType;
  }

  public void setHiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
  }


  public OffboardingTrackerIdGet200ResponseData termination(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataTermination termination) {
    this.termination = termination;
    return this;
  }

  /**
   * Get termination
   * @return termination
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataTermination getTermination() {
    return termination;
  }

  public void setTermination(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataTermination termination) {
    this.termination = termination;
  }


  public OffboardingTrackerIdGet200ResponseData hrisProfile(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
    return this;
  }

  /**
   * Get hrisProfile
   * @return hrisProfile
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataHrisProfile getHrisProfile() {
    return hrisProfile;
  }

  public void setHrisProfile(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
  }


  public OffboardingTrackerIdGet200ResponseData appExperience(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataAppExperience appExperience) {
    this.appExperience = appExperience;
    return this;
  }

  /**
   * Get appExperience
   * @return appExperience
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataAppExperience getAppExperience() {
    return appExperience;
  }

  public void setAppExperience(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataAppExperience appExperience) {
    this.appExperience = appExperience;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerIdGet200ResponseData offboardingTrackerIdGet200ResponseData = (OffboardingTrackerIdGet200ResponseData) o;
    return Objects.equals(this.summary, offboardingTrackerIdGet200ResponseData.summary) &&
        Objects.equals(this.contract, offboardingTrackerIdGet200ResponseData.contract) &&
        Objects.equals(this.progress, offboardingTrackerIdGet200ResponseData.progress) &&
        Objects.equals(this.hiringType, offboardingTrackerIdGet200ResponseData.hiringType) &&
        Objects.equals(this.termination, offboardingTrackerIdGet200ResponseData.termination) &&
        Objects.equals(this.hrisProfile, offboardingTrackerIdGet200ResponseData.hrisProfile) &&
        Objects.equals(this.appExperience, offboardingTrackerIdGet200ResponseData.appExperience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, contract, progress, hiringType, termination, hrisProfile, appExperience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffboardingTrackerIdGet200ResponseData {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    hiringType: ").append(toIndentedString(hiringType)).append("\n");
    sb.append("    termination: ").append(toIndentedString(termination)).append("\n");
    sb.append("    hrisProfile: ").append(toIndentedString(hrisProfile)).append("\n");
    sb.append("    appExperience: ").append(toIndentedString(appExperience)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("contract");
    openapiFields.add("progress");
    openapiFields.add("hiring_type");
    openapiFields.add("termination");
    openapiFields.add("hris_profile");
    openapiFields.add("app_experience");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerIdGet200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerIdGet200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerIdGet200ResponseData is not found in the empty JSON string", OffboardingTrackerIdGet200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerIdGet200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerIdGet200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        JsonArray jsonArraysummary = jsonObj.getAsJsonArray("summary");
        if (jsonArraysummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("summary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `summary` to be an array in the JSON string but got `%s`", jsonObj.get("summary").toString()));
          }

          // validate the optional field `summary` (array)
          for (int i = 0; i < jsonArraysummary.size(); i++) {
            OffboardingTrackerIdGet200ResponseDataSummaryInner.validateJsonElement(jsonArraysummary.get(i));
          };
        }
      }
      // validate the optional field `contract`
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataContract.validateJsonElement(jsonObj.get("contract"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataProgress.validateJsonElement(jsonObj.get("progress"));
      }
      if ((jsonObj.get("hiring_type") != null && !jsonObj.get("hiring_type").isJsonNull()) && !jsonObj.get("hiring_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_type").toString()));
      }
      // validate the optional field `termination`
      if (jsonObj.get("termination") != null && !jsonObj.get("termination").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataTermination.validateJsonElement(jsonObj.get("termination"));
      }
      // validate the optional field `hris_profile`
      if (jsonObj.get("hris_profile") != null && !jsonObj.get("hris_profile").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataHrisProfile.validateJsonElement(jsonObj.get("hris_profile"));
      }
      // validate the optional field `app_experience`
      if (jsonObj.get("app_experience") != null && !jsonObj.get("app_experience").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataAppExperience.validateJsonElement(jsonObj.get("app_experience"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerIdGet200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerIdGet200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerIdGet200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerIdGet200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerIdGet200ResponseData>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerIdGet200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerIdGet200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerIdGet200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerIdGet200ResponseData
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerIdGet200ResponseData
   */
  public static OffboardingTrackerIdGet200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerIdGet200ResponseData.class);
  }

  /**
   * Convert an instance of OffboardingTrackerIdGet200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

