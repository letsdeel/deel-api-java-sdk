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
 * OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_PERIOD_END_AT = "period_end_at";
  @SerializedName(SERIALIZED_NAME_PERIOD_END_AT)
  @javax.annotation.Nullable
  private String periodEndAt;

  public static final String SERIALIZED_NAME_PERIOD_IN_DAYS = "period_in_days";
  @SerializedName(SERIALIZED_NAME_PERIOD_IN_DAYS)
  @javax.annotation.Nullable
  private Integer periodInDays;

  public OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod() {
  }

  public OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * probation status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod periodEndAt(@javax.annotation.Nullable String periodEndAt) {
    this.periodEndAt = periodEndAt;
    return this;
  }

  /**
   * Period end date
   * @return periodEndAt
   */
  @javax.annotation.Nullable
  public String getPeriodEndAt() {
    return periodEndAt;
  }

  public void setPeriodEndAt(@javax.annotation.Nullable String periodEndAt) {
    this.periodEndAt = periodEndAt;
  }


  public OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod periodInDays(@javax.annotation.Nullable Integer periodInDays) {
    this.periodInDays = periodInDays;
    return this;
  }

  /**
   * total of days of period
   * @return periodInDays
   */
  @javax.annotation.Nullable
  public Integer getPeriodInDays() {
    return periodInDays;
  }

  public void setPeriodInDays(@javax.annotation.Nullable Integer periodInDays) {
    this.periodInDays = periodInDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod offboardingTrackerIdGet200ResponseDataContractEorProbationPeriod = (OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod) o;
    return Objects.equals(this.status, offboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.status) &&
        Objects.equals(this.periodEndAt, offboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.periodEndAt) &&
        Objects.equals(this.periodInDays, offboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.periodInDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, periodEndAt, periodInDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    periodEndAt: ").append(toIndentedString(periodEndAt)).append("\n");
    sb.append("    periodInDays: ").append(toIndentedString(periodInDays)).append("\n");
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
    openapiFields.add("period_end_at");
    openapiFields.add("period_in_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod is not found in the empty JSON string", OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("period_end_at") != null && !jsonObj.get("period_end_at").isJsonNull()) && !jsonObj.get("period_end_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_end_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_end_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod
   */
  public static OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.class);
  }

  /**
   * Convert an instance of OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

