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
import org.openapitools.client.model.ListOnboardingTracker200ResponseDataInnerAppExperience;
import org.openapitools.client.model.ListOnboardingTracker200ResponseDataInnerContract;
import org.openapitools.client.model.ListOnboardingTracker200ResponseDataInnerHrisProfile;
import org.openapitools.client.model.ListOnboardingTracker200ResponseDataInnerProgress;

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
 * ListOnboardingTracker200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class ListOnboardingTracker200ResponseDataInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nullable
  private ListOnboardingTracker200ResponseDataInnerContract contract;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  @javax.annotation.Nullable
  private ListOnboardingTracker200ResponseDataInnerProgress progress;

  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  @javax.annotation.Nullable
  private String uniqueId;

  public static final String SERIALIZED_NAME_HIRING_TYPE = "hiring_type";
  @SerializedName(SERIALIZED_NAME_HIRING_TYPE)
  @javax.annotation.Nullable
  private String hiringType;

  public static final String SERIALIZED_NAME_HRIS_PROFILE = "hris_profile";
  @SerializedName(SERIALIZED_NAME_HRIS_PROFILE)
  @javax.annotation.Nullable
  private ListOnboardingTracker200ResponseDataInnerHrisProfile hrisProfile;

  public static final String SERIALIZED_NAME_APP_EXPERIENCE = "app_experience";
  @SerializedName(SERIALIZED_NAME_APP_EXPERIENCE)
  @javax.annotation.Nullable
  private ListOnboardingTracker200ResponseDataInnerAppExperience appExperience;

  public ListOnboardingTracker200ResponseDataInner() {
  }

  public ListOnboardingTracker200ResponseDataInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name associated with the onboarding
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ListOnboardingTracker200ResponseDataInner contract(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nullable
  public ListOnboardingTracker200ResponseDataInnerContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerContract contract) {
    this.contract = contract;
  }


  public ListOnboardingTracker200ResponseDataInner progress(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public ListOnboardingTracker200ResponseDataInnerProgress getProgress() {
    return progress;
  }

  public void setProgress(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerProgress progress) {
    this.progress = progress;
  }


  public ListOnboardingTracker200ResponseDataInner uniqueId(@javax.annotation.Nullable String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  /**
   * A unique identifier for the tracker
   * @return uniqueId
   */
  @javax.annotation.Nullable
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(@javax.annotation.Nullable String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public ListOnboardingTracker200ResponseDataInner hiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
    return this;
  }

  /**
   * The type of hiring (e.g., contractor)
   * @return hiringType
   */
  @javax.annotation.Nullable
  public String getHiringType() {
    return hiringType;
  }

  public void setHiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
  }


  public ListOnboardingTracker200ResponseDataInner hrisProfile(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
    return this;
  }

  /**
   * Get hrisProfile
   * @return hrisProfile
   */
  @javax.annotation.Nullable
  public ListOnboardingTracker200ResponseDataInnerHrisProfile getHrisProfile() {
    return hrisProfile;
  }

  public void setHrisProfile(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
  }


  public ListOnboardingTracker200ResponseDataInner appExperience(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerAppExperience appExperience) {
    this.appExperience = appExperience;
    return this;
  }

  /**
   * Get appExperience
   * @return appExperience
   */
  @javax.annotation.Nullable
  public ListOnboardingTracker200ResponseDataInnerAppExperience getAppExperience() {
    return appExperience;
  }

  public void setAppExperience(@javax.annotation.Nullable ListOnboardingTracker200ResponseDataInnerAppExperience appExperience) {
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
    ListOnboardingTracker200ResponseDataInner listOnboardingTracker200ResponseDataInner = (ListOnboardingTracker200ResponseDataInner) o;
    return Objects.equals(this.name, listOnboardingTracker200ResponseDataInner.name) &&
        Objects.equals(this.contract, listOnboardingTracker200ResponseDataInner.contract) &&
        Objects.equals(this.progress, listOnboardingTracker200ResponseDataInner.progress) &&
        Objects.equals(this.uniqueId, listOnboardingTracker200ResponseDataInner.uniqueId) &&
        Objects.equals(this.hiringType, listOnboardingTracker200ResponseDataInner.hiringType) &&
        Objects.equals(this.hrisProfile, listOnboardingTracker200ResponseDataInner.hrisProfile) &&
        Objects.equals(this.appExperience, listOnboardingTracker200ResponseDataInner.appExperience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contract, progress, uniqueId, hiringType, hrisProfile, appExperience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOnboardingTracker200ResponseDataInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    hiringType: ").append(toIndentedString(hiringType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("contract");
    openapiFields.add("progress");
    openapiFields.add("unique_id");
    openapiFields.add("hiring_type");
    openapiFields.add("hris_profile");
    openapiFields.add("app_experience");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListOnboardingTracker200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListOnboardingTracker200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListOnboardingTracker200ResponseDataInner is not found in the empty JSON string", ListOnboardingTracker200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListOnboardingTracker200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListOnboardingTracker200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `contract`
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) {
        ListOnboardingTracker200ResponseDataInnerContract.validateJsonElement(jsonObj.get("contract"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        ListOnboardingTracker200ResponseDataInnerProgress.validateJsonElement(jsonObj.get("progress"));
      }
      if ((jsonObj.get("unique_id") != null && !jsonObj.get("unique_id").isJsonNull()) && !jsonObj.get("unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_id").toString()));
      }
      if ((jsonObj.get("hiring_type") != null && !jsonObj.get("hiring_type").isJsonNull()) && !jsonObj.get("hiring_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_type").toString()));
      }
      // validate the optional field `hris_profile`
      if (jsonObj.get("hris_profile") != null && !jsonObj.get("hris_profile").isJsonNull()) {
        ListOnboardingTracker200ResponseDataInnerHrisProfile.validateJsonElement(jsonObj.get("hris_profile"));
      }
      // validate the optional field `app_experience`
      if (jsonObj.get("app_experience") != null && !jsonObj.get("app_experience").isJsonNull()) {
        ListOnboardingTracker200ResponseDataInnerAppExperience.validateJsonElement(jsonObj.get("app_experience"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListOnboardingTracker200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListOnboardingTracker200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListOnboardingTracker200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListOnboardingTracker200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListOnboardingTracker200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, ListOnboardingTracker200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListOnboardingTracker200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListOnboardingTracker200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListOnboardingTracker200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to ListOnboardingTracker200ResponseDataInner
   */
  public static ListOnboardingTracker200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListOnboardingTracker200ResponseDataInner.class);
  }

  /**
   * Convert an instance of ListOnboardingTracker200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

