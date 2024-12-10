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
 * CalculateEorEmploymentCostRequestDataBenefitsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class CalculateEorEmploymentCostRequestDataBenefitsInner {
  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  @javax.annotation.Nullable
  private String planId;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "provider_id";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  @javax.annotation.Nonnull
  private String providerId;

  public CalculateEorEmploymentCostRequestDataBenefitsInner() {
  }

  public CalculateEorEmploymentCostRequestDataBenefitsInner planId(@javax.annotation.Nullable String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * The ID of the benefits plan, if applicable.
   * @return planId
   */
  @javax.annotation.Nullable
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(@javax.annotation.Nullable String planId) {
    this.planId = planId;
  }


  public CalculateEorEmploymentCostRequestDataBenefitsInner providerId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * The ID of the benefits provider.
   * @return providerId
   */
  @javax.annotation.Nonnull
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateEorEmploymentCostRequestDataBenefitsInner calculateEorEmploymentCostRequestDataBenefitsInner = (CalculateEorEmploymentCostRequestDataBenefitsInner) o;
    return Objects.equals(this.planId, calculateEorEmploymentCostRequestDataBenefitsInner.planId) &&
        Objects.equals(this.providerId, calculateEorEmploymentCostRequestDataBenefitsInner.providerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, providerId);
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
    sb.append("class CalculateEorEmploymentCostRequestDataBenefitsInner {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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
    openapiFields.add("plan_id");
    openapiFields.add("provider_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("provider_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CalculateEorEmploymentCostRequestDataBenefitsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CalculateEorEmploymentCostRequestDataBenefitsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalculateEorEmploymentCostRequestDataBenefitsInner is not found in the empty JSON string", CalculateEorEmploymentCostRequestDataBenefitsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CalculateEorEmploymentCostRequestDataBenefitsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CalculateEorEmploymentCostRequestDataBenefitsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CalculateEorEmploymentCostRequestDataBenefitsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (!jsonObj.get("provider_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalculateEorEmploymentCostRequestDataBenefitsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalculateEorEmploymentCostRequestDataBenefitsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalculateEorEmploymentCostRequestDataBenefitsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalculateEorEmploymentCostRequestDataBenefitsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CalculateEorEmploymentCostRequestDataBenefitsInner>() {
           @Override
           public void write(JsonWriter out, CalculateEorEmploymentCostRequestDataBenefitsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalculateEorEmploymentCostRequestDataBenefitsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CalculateEorEmploymentCostRequestDataBenefitsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CalculateEorEmploymentCostRequestDataBenefitsInner
   * @throws IOException if the JSON string is invalid with respect to CalculateEorEmploymentCostRequestDataBenefitsInner
   */
  public static CalculateEorEmploymentCostRequestDataBenefitsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalculateEorEmploymentCostRequestDataBenefitsInner.class);
  }

  /**
   * Convert an instance of CalculateEorEmploymentCostRequestDataBenefitsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

