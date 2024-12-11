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
 * GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T18:19:15.469015129Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent {
  public static final String SERIALIZED_NAME_MONTHLY_COST = "monthly_cost";
  @SerializedName(SERIALIZED_NAME_MONTHLY_COST)
  @javax.annotation.Nullable
  private String monthlyCost;

  public static final String SERIALIZED_NAME_MONTHLY_CONTRIBUTION = "monthly_contribution";
  @SerializedName(SERIALIZED_NAME_MONTHLY_CONTRIBUTION)
  @javax.annotation.Nullable
  private String monthlyContribution;

  public GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent() {
  }

  public GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent monthlyCost(@javax.annotation.Nullable String monthlyCost) {
    this.monthlyCost = monthlyCost;
    return this;
  }

  /**
   * The monthly cost of the current enrollment.
   * @return monthlyCost
   */
  @javax.annotation.Nullable
  public String getMonthlyCost() {
    return monthlyCost;
  }

  public void setMonthlyCost(@javax.annotation.Nullable String monthlyCost) {
    this.monthlyCost = monthlyCost;
  }


  public GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent monthlyContribution(@javax.annotation.Nullable String monthlyContribution) {
    this.monthlyContribution = monthlyContribution;
    return this;
  }

  /**
   * The employer&#39;s monthly contribution for the current enrollment.
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
    GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent getEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent = (GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent) o;
    return Objects.equals(this.monthlyCost, getEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.monthlyCost) &&
        Objects.equals(this.monthlyContribution, getEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.monthlyContribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyCost, monthlyContribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent is not found in the empty JSON string", GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent>() {
           @Override
           public void write(JsonWriter out, GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent
   * @throws IOException if the JSON string is invalid with respect to GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent
   */
  public static GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent.class);
  }

  /**
   * Convert an instance of GetEORContractBenefits200ResponseDataInnerEnrollmentDetailsCurrent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

