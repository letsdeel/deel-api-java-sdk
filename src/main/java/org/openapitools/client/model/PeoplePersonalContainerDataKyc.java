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
 * PeoplePersonalContainerDataKyc
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:50:05.582888578Z[GMT]", comments = "Generator version: 7.10.0")
public class PeoplePersonalContainerDataKyc {
  public static final String SERIALIZED_NAME_IS_KYC_APPROVED = "is_kyc_approved";
  @SerializedName(SERIALIZED_NAME_IS_KYC_APPROVED)
  @javax.annotation.Nonnull
  private Boolean isKycApproved;

  public static final String SERIALIZED_NAME_KYC_APPROVAL_DATE = "kyc_approval_date";
  @SerializedName(SERIALIZED_NAME_KYC_APPROVAL_DATE)
  @javax.annotation.Nonnull
  private String kycApprovalDate;

  public PeoplePersonalContainerDataKyc() {
  }

  public PeoplePersonalContainerDataKyc isKycApproved(@javax.annotation.Nonnull Boolean isKycApproved) {
    this.isKycApproved = isKycApproved;
    return this;
  }

  /**
   * Boolean to identify if the user is KYC verified
   * @return isKycApproved
   */
  @javax.annotation.Nonnull
  public Boolean getIsKycApproved() {
    return isKycApproved;
  }

  public void setIsKycApproved(@javax.annotation.Nonnull Boolean isKycApproved) {
    this.isKycApproved = isKycApproved;
  }


  public PeoplePersonalContainerDataKyc kycApprovalDate(@javax.annotation.Nonnull String kycApprovalDate) {
    this.kycApprovalDate = kycApprovalDate;
    return this;
  }

  /**
   * The Date the user was KYC verified if applicable
   * @return kycApprovalDate
   */
  @javax.annotation.Nonnull
  public String getKycApprovalDate() {
    return kycApprovalDate;
  }

  public void setKycApprovalDate(@javax.annotation.Nonnull String kycApprovalDate) {
    this.kycApprovalDate = kycApprovalDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeoplePersonalContainerDataKyc peoplePersonalContainerDataKyc = (PeoplePersonalContainerDataKyc) o;
    return Objects.equals(this.isKycApproved, peoplePersonalContainerDataKyc.isKycApproved) &&
        Objects.equals(this.kycApprovalDate, peoplePersonalContainerDataKyc.kycApprovalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isKycApproved, kycApprovalDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeoplePersonalContainerDataKyc {\n");
    sb.append("    isKycApproved: ").append(toIndentedString(isKycApproved)).append("\n");
    sb.append("    kycApprovalDate: ").append(toIndentedString(kycApprovalDate)).append("\n");
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
    openapiFields.add("is_kyc_approved");
    openapiFields.add("kyc_approval_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("is_kyc_approved");
    openapiRequiredFields.add("kyc_approval_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PeoplePersonalContainerDataKyc
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PeoplePersonalContainerDataKyc.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeoplePersonalContainerDataKyc is not found in the empty JSON string", PeoplePersonalContainerDataKyc.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PeoplePersonalContainerDataKyc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeoplePersonalContainerDataKyc` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PeoplePersonalContainerDataKyc.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("kyc_approval_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kyc_approval_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kyc_approval_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeoplePersonalContainerDataKyc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeoplePersonalContainerDataKyc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeoplePersonalContainerDataKyc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeoplePersonalContainerDataKyc.class));

       return (TypeAdapter<T>) new TypeAdapter<PeoplePersonalContainerDataKyc>() {
           @Override
           public void write(JsonWriter out, PeoplePersonalContainerDataKyc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeoplePersonalContainerDataKyc read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PeoplePersonalContainerDataKyc given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PeoplePersonalContainerDataKyc
   * @throws IOException if the JSON string is invalid with respect to PeoplePersonalContainerDataKyc
   */
  public static PeoplePersonalContainerDataKyc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeoplePersonalContainerDataKyc.class);
  }

  /**
   * Convert an instance of PeoplePersonalContainerDataKyc to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

