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
import org.openapitools.client.model.EORContractBenefitsInnerEnrollmentDetailsCurrent;
import org.openapitools.client.model.EORContractBenefitsInnerEnrollmentDetailsStandard;
import org.openapitools.client.model.EORContractBenefitsInnerPlan;

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
 * EORContractBenefitsInnerEnrollmentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class EORContractBenefitsInnerEnrollmentDetails {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  @javax.annotation.Nullable
  private EORContractBenefitsInnerPlan plan;

  public static final String SERIALIZED_NAME_STANDARD = "standard";
  @SerializedName(SERIALIZED_NAME_STANDARD)
  @javax.annotation.Nullable
  private EORContractBenefitsInnerEnrollmentDetailsStandard standard;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  @javax.annotation.Nullable
  private EORContractBenefitsInnerEnrollmentDetailsCurrent current;

  public EORContractBenefitsInnerEnrollmentDetails() {
  }

  public EORContractBenefitsInnerEnrollmentDetails status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the enrollment.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public EORContractBenefitsInnerEnrollmentDetails plan(@javax.annotation.Nullable EORContractBenefitsInnerPlan plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Get plan
   * @return plan
   */
  @javax.annotation.Nullable
  public EORContractBenefitsInnerPlan getPlan() {
    return plan;
  }

  public void setPlan(@javax.annotation.Nullable EORContractBenefitsInnerPlan plan) {
    this.plan = plan;
  }


  public EORContractBenefitsInnerEnrollmentDetails standard(@javax.annotation.Nullable EORContractBenefitsInnerEnrollmentDetailsStandard standard) {
    this.standard = standard;
    return this;
  }

  /**
   * Get standard
   * @return standard
   */
  @javax.annotation.Nullable
  public EORContractBenefitsInnerEnrollmentDetailsStandard getStandard() {
    return standard;
  }

  public void setStandard(@javax.annotation.Nullable EORContractBenefitsInnerEnrollmentDetailsStandard standard) {
    this.standard = standard;
  }


  public EORContractBenefitsInnerEnrollmentDetails current(@javax.annotation.Nullable EORContractBenefitsInnerEnrollmentDetailsCurrent current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
   */
  @javax.annotation.Nullable
  public EORContractBenefitsInnerEnrollmentDetailsCurrent getCurrent() {
    return current;
  }

  public void setCurrent(@javax.annotation.Nullable EORContractBenefitsInnerEnrollmentDetailsCurrent current) {
    this.current = current;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EORContractBenefitsInnerEnrollmentDetails eoRContractBenefitsInnerEnrollmentDetails = (EORContractBenefitsInnerEnrollmentDetails) o;
    return Objects.equals(this.status, eoRContractBenefitsInnerEnrollmentDetails.status) &&
        Objects.equals(this.plan, eoRContractBenefitsInnerEnrollmentDetails.plan) &&
        Objects.equals(this.standard, eoRContractBenefitsInnerEnrollmentDetails.standard) &&
        Objects.equals(this.current, eoRContractBenefitsInnerEnrollmentDetails.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, plan, standard, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EORContractBenefitsInnerEnrollmentDetails {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
    openapiFields.add("plan");
    openapiFields.add("standard");
    openapiFields.add("current");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EORContractBenefitsInnerEnrollmentDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EORContractBenefitsInnerEnrollmentDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EORContractBenefitsInnerEnrollmentDetails is not found in the empty JSON string", EORContractBenefitsInnerEnrollmentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EORContractBenefitsInnerEnrollmentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EORContractBenefitsInnerEnrollmentDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `plan`
      if (jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) {
        EORContractBenefitsInnerPlan.validateJsonElement(jsonObj.get("plan"));
      }
      // validate the optional field `standard`
      if (jsonObj.get("standard") != null && !jsonObj.get("standard").isJsonNull()) {
        EORContractBenefitsInnerEnrollmentDetailsStandard.validateJsonElement(jsonObj.get("standard"));
      }
      // validate the optional field `current`
      if (jsonObj.get("current") != null && !jsonObj.get("current").isJsonNull()) {
        EORContractBenefitsInnerEnrollmentDetailsCurrent.validateJsonElement(jsonObj.get("current"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EORContractBenefitsInnerEnrollmentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EORContractBenefitsInnerEnrollmentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EORContractBenefitsInnerEnrollmentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EORContractBenefitsInnerEnrollmentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<EORContractBenefitsInnerEnrollmentDetails>() {
           @Override
           public void write(JsonWriter out, EORContractBenefitsInnerEnrollmentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EORContractBenefitsInnerEnrollmentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EORContractBenefitsInnerEnrollmentDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EORContractBenefitsInnerEnrollmentDetails
   * @throws IOException if the JSON string is invalid with respect to EORContractBenefitsInnerEnrollmentDetails
   */
  public static EORContractBenefitsInnerEnrollmentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EORContractBenefitsInnerEnrollmentDetails.class);
  }

  /**
   * Convert an instance of EORContractBenefitsInnerEnrollmentDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

