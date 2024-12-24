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
 * EorEmployeeCostCalculationRequestBodyBenefitsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class EorEmployeeCostCalculationRequestBodyBenefitsInner {
  public static final String SERIALIZED_NAME_PROVIDER_ID = "provider_id";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  @javax.annotation.Nonnull
  private String providerId;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  @javax.annotation.Nullable
  private String planId;

  public EorEmployeeCostCalculationRequestBodyBenefitsInner() {
  }

  public EorEmployeeCostCalculationRequestBodyBenefitsInner providerId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * The ID of a benefits provider to include in the calculation.
   * @return providerId
   */
  @javax.annotation.Nonnull
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
  }


  public EorEmployeeCostCalculationRequestBodyBenefitsInner planId(@javax.annotation.Nullable String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * The ID of a benefits plan to include in the calculation.
   * @return planId
   */
  @javax.annotation.Nullable
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(@javax.annotation.Nullable String planId) {
    this.planId = planId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorEmployeeCostCalculationRequestBodyBenefitsInner eorEmployeeCostCalculationRequestBodyBenefitsInner = (EorEmployeeCostCalculationRequestBodyBenefitsInner) o;
    return Objects.equals(this.providerId, eorEmployeeCostCalculationRequestBodyBenefitsInner.providerId) &&
        Objects.equals(this.planId, eorEmployeeCostCalculationRequestBodyBenefitsInner.planId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, planId);
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
    sb.append("class EorEmployeeCostCalculationRequestBodyBenefitsInner {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
    openapiFields.add("provider_id");
    openapiFields.add("plan_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("provider_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorEmployeeCostCalculationRequestBodyBenefitsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorEmployeeCostCalculationRequestBodyBenefitsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorEmployeeCostCalculationRequestBodyBenefitsInner is not found in the empty JSON string", EorEmployeeCostCalculationRequestBodyBenefitsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorEmployeeCostCalculationRequestBodyBenefitsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorEmployeeCostCalculationRequestBodyBenefitsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorEmployeeCostCalculationRequestBodyBenefitsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("provider_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_id").toString()));
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorEmployeeCostCalculationRequestBodyBenefitsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorEmployeeCostCalculationRequestBodyBenefitsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorEmployeeCostCalculationRequestBodyBenefitsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorEmployeeCostCalculationRequestBodyBenefitsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EorEmployeeCostCalculationRequestBodyBenefitsInner>() {
           @Override
           public void write(JsonWriter out, EorEmployeeCostCalculationRequestBodyBenefitsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorEmployeeCostCalculationRequestBodyBenefitsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorEmployeeCostCalculationRequestBodyBenefitsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorEmployeeCostCalculationRequestBodyBenefitsInner
   * @throws IOException if the JSON string is invalid with respect to EorEmployeeCostCalculationRequestBodyBenefitsInner
   */
  public static EorEmployeeCostCalculationRequestBodyBenefitsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorEmployeeCostCalculationRequestBodyBenefitsInner.class);
  }

  /**
   * Convert an instance of EorEmployeeCostCalculationRequestBodyBenefitsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

