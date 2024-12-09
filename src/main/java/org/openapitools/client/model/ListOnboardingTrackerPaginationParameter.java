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
 * ListOnboardingTrackerPaginationParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class ListOnboardingTrackerPaginationParameter {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private String contractId;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_REFERENCE_DATE = "reference_date";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATE)
  private OffsetDateTime referenceDate;

  public static final String SERIALIZED_NAME_PROGRESS_STATUS_WEIGHT = "progress_status_weight";
  @SerializedName(SERIALIZED_NAME_PROGRESS_STATUS_WEIGHT)
  private Integer progressStatusWeight;

  public ListOnboardingTrackerPaginationParameter() {
  }

  public ListOnboardingTrackerPaginationParameter contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Contract ID for pagination
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  public ListOnboardingTrackerPaginationParameter effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Effective date for pagination
   * @return effectiveDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public ListOnboardingTrackerPaginationParameter referenceDate(OffsetDateTime referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

  /**
   * Reference date for pagination
   * @return referenceDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(OffsetDateTime referenceDate) {
    this.referenceDate = referenceDate;
  }


  public ListOnboardingTrackerPaginationParameter progressStatusWeight(Integer progressStatusWeight) {
    this.progressStatusWeight = progressStatusWeight;
    return this;
  }

  /**
   * Progress status weight for pagination
   * @return progressStatusWeight
   */
  @javax.annotation.Nullable
  public Integer getProgressStatusWeight() {
    return progressStatusWeight;
  }

  public void setProgressStatusWeight(Integer progressStatusWeight) {
    this.progressStatusWeight = progressStatusWeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOnboardingTrackerPaginationParameter listOnboardingTrackerPaginationParameter = (ListOnboardingTrackerPaginationParameter) o;
    return Objects.equals(this.contractId, listOnboardingTrackerPaginationParameter.contractId) &&
        Objects.equals(this.effectiveDate, listOnboardingTrackerPaginationParameter.effectiveDate) &&
        Objects.equals(this.referenceDate, listOnboardingTrackerPaginationParameter.referenceDate) &&
        Objects.equals(this.progressStatusWeight, listOnboardingTrackerPaginationParameter.progressStatusWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, effectiveDate, referenceDate, progressStatusWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOnboardingTrackerPaginationParameter {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    progressStatusWeight: ").append(toIndentedString(progressStatusWeight)).append("\n");
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
    openapiFields.add("contract_id");
    openapiFields.add("effective_date");
    openapiFields.add("reference_date");
    openapiFields.add("progress_status_weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListOnboardingTrackerPaginationParameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListOnboardingTrackerPaginationParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListOnboardingTrackerPaginationParameter is not found in the empty JSON string", ListOnboardingTrackerPaginationParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListOnboardingTrackerPaginationParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListOnboardingTrackerPaginationParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListOnboardingTrackerPaginationParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListOnboardingTrackerPaginationParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListOnboardingTrackerPaginationParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListOnboardingTrackerPaginationParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<ListOnboardingTrackerPaginationParameter>() {
           @Override
           public void write(JsonWriter out, ListOnboardingTrackerPaginationParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListOnboardingTrackerPaginationParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListOnboardingTrackerPaginationParameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListOnboardingTrackerPaginationParameter
   * @throws IOException if the JSON string is invalid with respect to ListOnboardingTrackerPaginationParameter
   */
  public static ListOnboardingTrackerPaginationParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListOnboardingTrackerPaginationParameter.class);
  }

  /**
   * Convert an instance of ListOnboardingTrackerPaginationParameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
