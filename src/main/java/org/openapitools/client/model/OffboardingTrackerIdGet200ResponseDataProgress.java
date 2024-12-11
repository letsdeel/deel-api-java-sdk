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
 * OffboardingTrackerIdGet200ResponseDataProgress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:06:48.603230199Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerIdGet200ResponseDataProgress {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_REFERENCE_DATE = "reference_date";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE)
  @javax.annotation.Nullable
  private String referenceDate;

  public static final String SERIALIZED_NAME_REFERENCE_DATE_TYPE = "reference_date_type";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE_TYPE)
  @javax.annotation.Nullable
  private String referenceDateType;

  public static final String SERIALIZED_NAME_REFERENCE_DATE_TIMEZONE = "reference_date_timezone";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE_TIMEZONE)
  @javax.annotation.Nullable
  private String referenceDateTimezone;

  public OffboardingTrackerIdGet200ResponseDataProgress() {
  }

  public OffboardingTrackerIdGet200ResponseDataProgress status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the offboarding process (e.g., OFFBOARDING_IN_PROGRESS).
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public OffboardingTrackerIdGet200ResponseDataProgress referenceDate(@javax.annotation.Nullable String referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

  /**
   * The reference date for the offboarding status (e.g., the termination date).
   * @return referenceDate
   */
  @javax.annotation.Nullable
  public String getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(@javax.annotation.Nullable String referenceDate) {
    this.referenceDate = referenceDate;
  }


  public OffboardingTrackerIdGet200ResponseDataProgress referenceDateType(@javax.annotation.Nullable String referenceDateType) {
    this.referenceDateType = referenceDateType;
    return this;
  }

  /**
   * The type of reference date (e.g., END_DATE).
   * @return referenceDateType
   */
  @javax.annotation.Nullable
  public String getReferenceDateType() {
    return referenceDateType;
  }

  public void setReferenceDateType(@javax.annotation.Nullable String referenceDateType) {
    this.referenceDateType = referenceDateType;
  }


  public OffboardingTrackerIdGet200ResponseDataProgress referenceDateTimezone(@javax.annotation.Nullable String referenceDateTimezone) {
    this.referenceDateTimezone = referenceDateTimezone;
    return this;
  }

  /**
   * The timezone of the reference date.
   * @return referenceDateTimezone
   */
  @javax.annotation.Nullable
  public String getReferenceDateTimezone() {
    return referenceDateTimezone;
  }

  public void setReferenceDateTimezone(@javax.annotation.Nullable String referenceDateTimezone) {
    this.referenceDateTimezone = referenceDateTimezone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerIdGet200ResponseDataProgress offboardingTrackerIdGet200ResponseDataProgress = (OffboardingTrackerIdGet200ResponseDataProgress) o;
    return Objects.equals(this.status, offboardingTrackerIdGet200ResponseDataProgress.status) &&
        Objects.equals(this.referenceDate, offboardingTrackerIdGet200ResponseDataProgress.referenceDate) &&
        Objects.equals(this.referenceDateType, offboardingTrackerIdGet200ResponseDataProgress.referenceDateType) &&
        Objects.equals(this.referenceDateTimezone, offboardingTrackerIdGet200ResponseDataProgress.referenceDateTimezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, referenceDate, referenceDateType, referenceDateTimezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffboardingTrackerIdGet200ResponseDataProgress {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    referenceDateType: ").append(toIndentedString(referenceDateType)).append("\n");
    sb.append("    referenceDateTimezone: ").append(toIndentedString(referenceDateTimezone)).append("\n");
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
    openapiFields.add("reference_date_type");
    openapiFields.add("reference_date_timezone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerIdGet200ResponseDataProgress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerIdGet200ResponseDataProgress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerIdGet200ResponseDataProgress is not found in the empty JSON string", OffboardingTrackerIdGet200ResponseDataProgress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerIdGet200ResponseDataProgress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerIdGet200ResponseDataProgress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reference_date") != null && !jsonObj.get("reference_date").isJsonNull()) && !jsonObj.get("reference_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_date").toString()));
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
       if (!OffboardingTrackerIdGet200ResponseDataProgress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerIdGet200ResponseDataProgress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerIdGet200ResponseDataProgress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerIdGet200ResponseDataProgress.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerIdGet200ResponseDataProgress>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerIdGet200ResponseDataProgress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerIdGet200ResponseDataProgress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerIdGet200ResponseDataProgress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerIdGet200ResponseDataProgress
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerIdGet200ResponseDataProgress
   */
  public static OffboardingTrackerIdGet200ResponseDataProgress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerIdGet200ResponseDataProgress.class);
  }

  /**
   * Convert an instance of OffboardingTrackerIdGet200ResponseDataProgress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

