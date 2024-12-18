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
 * OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime completedAt;

  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner() {
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of checklist step
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * The label for the checklist step
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the checklist step
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner completedAt(@javax.annotation.Nullable OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Completion timestamp of the checklist step
   * @return completedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(@javax.annotation.Nullable OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner onboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner = (OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner) o;
    return Objects.equals(this.type, onboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.type) &&
        Objects.equals(this.label, onboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.label) &&
        Objects.equals(this.status, onboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.status) &&
        Objects.equals(this.completedAt, onboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.completedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, label, status, completedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("label");
    openapiFields.add("status");
    openapiFields.add("completed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner is not found in the empty JSON string", OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner>() {
           @Override
           public void write(JsonWriter out, OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner
   * @throws IOException if the JSON string is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner
   */
  public static OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.class);
  }

  /**
   * Convert an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

