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
 * EORContractBenefitsInnerEnrollmentDetailsStandard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class EORContractBenefitsInnerEnrollmentDetailsStandard {
  public static final String SERIALIZED_NAME_MONTHLY_COST = "monthly_cost";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST)
  @javax.annotation.Nullable
  private String monthlyCost;

  public static final String SERIALIZED_NAME_MONTHLY_CONTRIBUTION = "monthly_contribution";
  @SerializedName(SERIALIZED_NAME_MONTHLY_CONTRIBUTION)
  @javax.annotation.Nullable
  private String monthlyContribution;

  public EORContractBenefitsInnerEnrollmentDetailsStandard() {
  }

  public EORContractBenefitsInnerEnrollmentDetailsStandard monthlyCost(@javax.annotation.Nullable String monthlyCost) {
    this.monthlyCost = monthlyCost;
    return this;
  }

  /**
   * Standard monthly cost.
   * @return monthlyCost
   */
  @javax.annotation.Nullable
  public String getMonthlyCost() {
    return monthlyCost;
  }

  public void setMonthlyCost(@javax.annotation.Nullable String monthlyCost) {
    this.monthlyCost = monthlyCost;
  }


  public EORContractBenefitsInnerEnrollmentDetailsStandard monthlyContribution(@javax.annotation.Nullable String monthlyContribution) {
    this.monthlyContribution = monthlyContribution;
    return this;
  }

  /**
   * Standard monthly contribution.
   * @return monthlyContribution
   */
  @javax.annotation.Nullable
  public String getMonthlyContribution() {
    return monthlyContribution;
  }

  public void setMonthlyContribution(@javax.annotation.Nullable String monthlyContribution) {
    this.monthlyContribution = monthlyContribution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EORContractBenefitsInnerEnrollmentDetailsStandard eoRContractBenefitsInnerEnrollmentDetailsStandard = (EORContractBenefitsInnerEnrollmentDetailsStandard) o;
    return Objects.equals(this.monthlyCost, eoRContractBenefitsInnerEnrollmentDetailsStandard.monthlyCost) &&
        Objects.equals(this.monthlyContribution, eoRContractBenefitsInnerEnrollmentDetailsStandard.monthlyContribution);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyCost, monthlyContribution);
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
    sb.append("class EORContractBenefitsInnerEnrollmentDetailsStandard {\n");
    sb.append("    monthlyCost: ").append(toIndentedString(monthlyCost)).append("\n");
    sb.append("    monthlyContribution: ").append(toIndentedString(monthlyContribution)).append("\n");
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
    openapiFields.add("monthly_cost");
    openapiFields.add("monthly_contribution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EORContractBenefitsInnerEnrollmentDetailsStandard
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EORContractBenefitsInnerEnrollmentDetailsStandard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EORContractBenefitsInnerEnrollmentDetailsStandard is not found in the empty JSON string", EORContractBenefitsInnerEnrollmentDetailsStandard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EORContractBenefitsInnerEnrollmentDetailsStandard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EORContractBenefitsInnerEnrollmentDetailsStandard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("monthly_cost") != null && !jsonObj.get("monthly_cost").isJsonNull()) && !jsonObj.get("monthly_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monthly_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monthly_cost").toString()));
      }
      if ((jsonObj.get("monthly_contribution") != null && !jsonObj.get("monthly_contribution").isJsonNull()) && !jsonObj.get("monthly_contribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monthly_contribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monthly_contribution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EORContractBenefitsInnerEnrollmentDetailsStandard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EORContractBenefitsInnerEnrollmentDetailsStandard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EORContractBenefitsInnerEnrollmentDetailsStandard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EORContractBenefitsInnerEnrollmentDetailsStandard.class));

       return (TypeAdapter<T>) new TypeAdapter<EORContractBenefitsInnerEnrollmentDetailsStandard>() {
           @Override
           public void write(JsonWriter out, EORContractBenefitsInnerEnrollmentDetailsStandard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EORContractBenefitsInnerEnrollmentDetailsStandard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EORContractBenefitsInnerEnrollmentDetailsStandard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EORContractBenefitsInnerEnrollmentDetailsStandard
   * @throws IOException if the JSON string is invalid with respect to EORContractBenefitsInnerEnrollmentDetailsStandard
   */
  public static EORContractBenefitsInnerEnrollmentDetailsStandard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EORContractBenefitsInnerEnrollmentDetailsStandard.class);
  }

  /**
   * Convert an instance of EORContractBenefitsInnerEnrollmentDetailsStandard to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

