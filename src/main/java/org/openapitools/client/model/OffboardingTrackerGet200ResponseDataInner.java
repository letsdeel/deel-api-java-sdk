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
import org.openapitools.client.model.OffboardingTrackerGet200ResponseDataInnerContract;
import org.openapitools.client.model.OffboardingTrackerGet200ResponseDataInnerHrisProfile;
import org.openapitools.client.model.OffboardingTrackerGet200ResponseDataInnerProgress;
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataAppExperience;
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
 * OffboardingTrackerGet200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerGet200ResponseDataInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nullable
  private OffboardingTrackerGet200ResponseDataInnerContract contract;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  @javax.annotation.Nullable
  private OffboardingTrackerGet200ResponseDataInnerProgress progress;

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
  private OffboardingTrackerGet200ResponseDataInnerHrisProfile hrisProfile;

  public static final String SERIALIZED_NAME_APP_EXPERIENCE = "app_experience";
  @SerializedName(SERIALIZED_NAME_APP_EXPERIENCE)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataAppExperience appExperience;

  public static final String SERIALIZED_NAME_TERMINATION_ID = "termination_id";
  @SerializedName(SERIALIZED_NAME_TERMINATION_ID)
  @javax.annotation.Nullable
  private String terminationId;

  public static final String SERIALIZED_NAME_OFFBOARDING_TYPE = "offboarding_type";
  @SerializedName(SERIALIZED_NAME_OFFBOARDING_TYPE)
  @javax.annotation.Nullable
  private String offboardingType;

  public OffboardingTrackerGet200ResponseDataInner() {
  }

  public OffboardingTrackerGet200ResponseDataInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the individual associated with the offboarding.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OffboardingTrackerGet200ResponseDataInner contract(@javax.annotation.Nullable OffboardingTrackerGet200ResponseDataInnerContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nullable
  public OffboardingTrackerGet200ResponseDataInnerContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nullable OffboardingTrackerGet200ResponseDataInnerContract contract) {
    this.contract = contract;
  }


  public OffboardingTrackerGet200ResponseDataInner progress(@javax.annotation.Nullable OffboardingTrackerGet200ResponseDataInnerProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public OffboardingTrackerGet200ResponseDataInnerProgress getProgress() {
    return progress;
  }

  public void setProgress(@javax.annotation.Nullable OffboardingTrackerGet200ResponseDataInnerProgress progress) {
    this.progress = progress;
  }


  public OffboardingTrackerGet200ResponseDataInner uniqueId(@javax.annotation.Nullable String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  /**
   * A unique identifier for the offboarding item.
   * @return uniqueId
   */
  @javax.annotation.Nullable
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(@javax.annotation.Nullable String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public OffboardingTrackerGet200ResponseDataInner hiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
    return this;
  }

  /**
   * The hiring type for the individual (e.g., contractor).
   * @return hiringType
   */
  @javax.annotation.Nullable
  public String getHiringType() {
    return hiringType;
  }

  public void setHiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
  }


  public OffboardingTrackerGet200ResponseDataInner hrisProfile(@javax.annotation.Nullable OffboardingTrackerGet200ResponseDataInnerHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
    return this;
  }

  /**
   * Get hrisProfile
   * @return hrisProfile
   */
  @javax.annotation.Nullable
  public OffboardingTrackerGet200ResponseDataInnerHrisProfile getHrisProfile() {
    return hrisProfile;
  }

  public void setHrisProfile(@javax.annotation.Nullable OffboardingTrackerGet200ResponseDataInnerHrisProfile hrisProfile) {
    this.hrisProfile = hrisProfile;
  }


  public OffboardingTrackerGet200ResponseDataInner appExperience(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataAppExperience appExperience) {
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


  public OffboardingTrackerGet200ResponseDataInner terminationId(@javax.annotation.Nullable String terminationId) {
    this.terminationId = terminationId;
    return this;
  }

  /**
   * The termination ID if the individual has been terminated.
   * @return terminationId
   */
  @javax.annotation.Nullable
  public String getTerminationId() {
    return terminationId;
  }

  public void setTerminationId(@javax.annotation.Nullable String terminationId) {
    this.terminationId = terminationId;
  }


  public OffboardingTrackerGet200ResponseDataInner offboardingType(@javax.annotation.Nullable String offboardingType) {
    this.offboardingType = offboardingType;
    return this;
  }

  /**
   * The type of offboarding (e.g., ENDING_CONTRACT, TERMINATION).
   * @return offboardingType
   */
  @javax.annotation.Nullable
  public String getOffboardingType() {
    return offboardingType;
  }

  public void setOffboardingType(@javax.annotation.Nullable String offboardingType) {
    this.offboardingType = offboardingType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerGet200ResponseDataInner offboardingTrackerGet200ResponseDataInner = (OffboardingTrackerGet200ResponseDataInner) o;
    return Objects.equals(this.name, offboardingTrackerGet200ResponseDataInner.name) &&
        Objects.equals(this.contract, offboardingTrackerGet200ResponseDataInner.contract) &&
        Objects.equals(this.progress, offboardingTrackerGet200ResponseDataInner.progress) &&
        Objects.equals(this.uniqueId, offboardingTrackerGet200ResponseDataInner.uniqueId) &&
        Objects.equals(this.hiringType, offboardingTrackerGet200ResponseDataInner.hiringType) &&
        Objects.equals(this.hrisProfile, offboardingTrackerGet200ResponseDataInner.hrisProfile) &&
        Objects.equals(this.appExperience, offboardingTrackerGet200ResponseDataInner.appExperience) &&
        Objects.equals(this.terminationId, offboardingTrackerGet200ResponseDataInner.terminationId) &&
        Objects.equals(this.offboardingType, offboardingTrackerGet200ResponseDataInner.offboardingType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contract, progress, uniqueId, hiringType, hrisProfile, appExperience, terminationId, offboardingType);
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
    sb.append("class OffboardingTrackerGet200ResponseDataInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    hiringType: ").append(toIndentedString(hiringType)).append("\n");
    sb.append("    hrisProfile: ").append(toIndentedString(hrisProfile)).append("\n");
    sb.append("    appExperience: ").append(toIndentedString(appExperience)).append("\n");
    sb.append("    terminationId: ").append(toIndentedString(terminationId)).append("\n");
    sb.append("    offboardingType: ").append(toIndentedString(offboardingType)).append("\n");
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
    openapiFields.add("termination_id");
    openapiFields.add("offboarding_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerGet200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerGet200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerGet200ResponseDataInner is not found in the empty JSON string", OffboardingTrackerGet200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerGet200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerGet200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `contract`
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) {
        OffboardingTrackerGet200ResponseDataInnerContract.validateJsonElement(jsonObj.get("contract"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        OffboardingTrackerGet200ResponseDataInnerProgress.validateJsonElement(jsonObj.get("progress"));
      }
      if ((jsonObj.get("unique_id") != null && !jsonObj.get("unique_id").isJsonNull()) && !jsonObj.get("unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_id").toString()));
      }
      if ((jsonObj.get("hiring_type") != null && !jsonObj.get("hiring_type").isJsonNull()) && !jsonObj.get("hiring_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_type").toString()));
      }
      // validate the optional field `hris_profile`
      if (jsonObj.get("hris_profile") != null && !jsonObj.get("hris_profile").isJsonNull()) {
        OffboardingTrackerGet200ResponseDataInnerHrisProfile.validateJsonElement(jsonObj.get("hris_profile"));
      }
      // validate the optional field `app_experience`
      if (jsonObj.get("app_experience") != null && !jsonObj.get("app_experience").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataAppExperience.validateJsonElement(jsonObj.get("app_experience"));
      }
      if ((jsonObj.get("termination_id") != null && !jsonObj.get("termination_id").isJsonNull()) && !jsonObj.get("termination_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termination_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termination_id").toString()));
      }
      if ((jsonObj.get("offboarding_type") != null && !jsonObj.get("offboarding_type").isJsonNull()) && !jsonObj.get("offboarding_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offboarding_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offboarding_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerGet200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerGet200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerGet200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerGet200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerGet200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerGet200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerGet200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerGet200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerGet200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerGet200ResponseDataInner
   */
  public static OffboardingTrackerGet200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerGet200ResponseDataInner.class);
  }

  /**
   * Convert an instance of OffboardingTrackerGet200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

