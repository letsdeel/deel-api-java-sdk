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
 * GetPeoplePersonalInformationById200ResponseDataKyc
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeoplePersonalInformationById200ResponseDataKyc {
  public static final String SERIALIZED_NAME_IS_KYC_APPROVED = "is_kyc_approved";
  @SerializedName(SERIALIZED_NAME_IS_KYC_APPROVED)
  @javax.annotation.Nonnull
  private Boolean isKycApproved;

  public static final String SERIALIZED_NAME_KYC_APPROVAL_DATE = "kyc_approval_date";
  @SerializedName(SERIALIZED_NAME_KYC_APPROVAL_DATE)
  @javax.annotation.Nonnull
  private String kycApprovalDate;

  public GetPeoplePersonalInformationById200ResponseDataKyc() {
  }

  public GetPeoplePersonalInformationById200ResponseDataKyc isKycApproved(@javax.annotation.Nonnull Boolean isKycApproved) {
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


  public GetPeoplePersonalInformationById200ResponseDataKyc kycApprovalDate(@javax.annotation.Nonnull String kycApprovalDate) {
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
    GetPeoplePersonalInformationById200ResponseDataKyc getPeoplePersonalInformationById200ResponseDataKyc = (GetPeoplePersonalInformationById200ResponseDataKyc) o;
    return Objects.equals(this.isKycApproved, getPeoplePersonalInformationById200ResponseDataKyc.isKycApproved) &&
        Objects.equals(this.kycApprovalDate, getPeoplePersonalInformationById200ResponseDataKyc.kycApprovalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isKycApproved, kycApprovalDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeoplePersonalInformationById200ResponseDataKyc {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetPeoplePersonalInformationById200ResponseDataKyc
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeoplePersonalInformationById200ResponseDataKyc.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeoplePersonalInformationById200ResponseDataKyc is not found in the empty JSON string", GetPeoplePersonalInformationById200ResponseDataKyc.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeoplePersonalInformationById200ResponseDataKyc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeoplePersonalInformationById200ResponseDataKyc` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPeoplePersonalInformationById200ResponseDataKyc.openapiRequiredFields) {
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
       if (!GetPeoplePersonalInformationById200ResponseDataKyc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeoplePersonalInformationById200ResponseDataKyc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeoplePersonalInformationById200ResponseDataKyc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeoplePersonalInformationById200ResponseDataKyc.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeoplePersonalInformationById200ResponseDataKyc>() {
           @Override
           public void write(JsonWriter out, GetPeoplePersonalInformationById200ResponseDataKyc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeoplePersonalInformationById200ResponseDataKyc read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeoplePersonalInformationById200ResponseDataKyc given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeoplePersonalInformationById200ResponseDataKyc
   * @throws IOException if the JSON string is invalid with respect to GetPeoplePersonalInformationById200ResponseDataKyc
   */
  public static GetPeoplePersonalInformationById200ResponseDataKyc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeoplePersonalInformationById200ResponseDataKyc.class);
  }

  /**
   * Convert an instance of GetPeoplePersonalInformationById200ResponseDataKyc to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

