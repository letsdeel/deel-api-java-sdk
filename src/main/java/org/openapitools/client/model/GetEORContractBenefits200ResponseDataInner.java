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
import org.openapitools.client.model.GetEORContractBenefits200ResponseDataInnerEnrollmentDetails;
import org.openapitools.client.model.GetEORContractBenefits200ResponseDataInnerPlan;
import org.openapitools.client.model.GetEORContractBenefits200ResponseDataInnerProvider;

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
 * GetEORContractBenefits200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEORContractBenefits200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  @javax.annotation.Nullable
  private GetEORContractBenefits200ResponseDataInnerPlan plan;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  @javax.annotation.Nullable
  private GetEORContractBenefits200ResponseDataInnerProvider provider;

  /**
   * Indicates whether the benefit is offered.
   */
  @JsonAdapter(OfferStatusEnum.Adapter.class)
  public enum OfferStatusEnum {
    OFFERED("Offered"),
    
    NOT_OFFERED("Not offered");

    private String value;

    OfferStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OfferStatusEnum fromValue(String value) {
      for (OfferStatusEnum b : OfferStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OfferStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OfferStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OfferStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OFFER_STATUS = "offer_status";
  @SerializedName(SERIALIZED_NAME_OFFER_STATUS)
  @javax.annotation.Nullable
  private OfferStatusEnum offerStatus;

  public static final String SERIALIZED_NAME_ENROLLMENT_DETAILS = "enrollment_details";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_DETAILS)
  @javax.annotation.Nullable
  private GetEORContractBenefits200ResponseDataInnerEnrollmentDetails enrollmentDetails;

  public GetEORContractBenefits200ResponseDataInner() {
  }

  public GetEORContractBenefits200ResponseDataInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the benefit.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetEORContractBenefits200ResponseDataInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the benefit.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetEORContractBenefits200ResponseDataInner plan(@javax.annotation.Nullable GetEORContractBenefits200ResponseDataInnerPlan plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Get plan
   * @return plan
   */
  @javax.annotation.Nullable
  public GetEORContractBenefits200ResponseDataInnerPlan getPlan() {
    return plan;
  }

  public void setPlan(@javax.annotation.Nullable GetEORContractBenefits200ResponseDataInnerPlan plan) {
    this.plan = plan;
  }


  public GetEORContractBenefits200ResponseDataInner provider(@javax.annotation.Nullable GetEORContractBenefits200ResponseDataInnerProvider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  @javax.annotation.Nullable
  public GetEORContractBenefits200ResponseDataInnerProvider getProvider() {
    return provider;
  }

  public void setProvider(@javax.annotation.Nullable GetEORContractBenefits200ResponseDataInnerProvider provider) {
    this.provider = provider;
  }


  public GetEORContractBenefits200ResponseDataInner offerStatus(@javax.annotation.Nullable OfferStatusEnum offerStatus) {
    this.offerStatus = offerStatus;
    return this;
  }

  /**
   * Indicates whether the benefit is offered.
   * @return offerStatus
   */
  @javax.annotation.Nullable
  public OfferStatusEnum getOfferStatus() {
    return offerStatus;
  }

  public void setOfferStatus(@javax.annotation.Nullable OfferStatusEnum offerStatus) {
    this.offerStatus = offerStatus;
  }


  public GetEORContractBenefits200ResponseDataInner enrollmentDetails(@javax.annotation.Nullable GetEORContractBenefits200ResponseDataInnerEnrollmentDetails enrollmentDetails) {
    this.enrollmentDetails = enrollmentDetails;
    return this;
  }

  /**
   * Get enrollmentDetails
   * @return enrollmentDetails
   */
  @javax.annotation.Nullable
  public GetEORContractBenefits200ResponseDataInnerEnrollmentDetails getEnrollmentDetails() {
    return enrollmentDetails;
  }

  public void setEnrollmentDetails(@javax.annotation.Nullable GetEORContractBenefits200ResponseDataInnerEnrollmentDetails enrollmentDetails) {
    this.enrollmentDetails = enrollmentDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEORContractBenefits200ResponseDataInner getEORContractBenefits200ResponseDataInner = (GetEORContractBenefits200ResponseDataInner) o;
    return Objects.equals(this.id, getEORContractBenefits200ResponseDataInner.id) &&
        Objects.equals(this.name, getEORContractBenefits200ResponseDataInner.name) &&
        Objects.equals(this.plan, getEORContractBenefits200ResponseDataInner.plan) &&
        Objects.equals(this.provider, getEORContractBenefits200ResponseDataInner.provider) &&
        Objects.equals(this.offerStatus, getEORContractBenefits200ResponseDataInner.offerStatus) &&
        Objects.equals(this.enrollmentDetails, getEORContractBenefits200ResponseDataInner.enrollmentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, plan, provider, offerStatus, enrollmentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEORContractBenefits200ResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    offerStatus: ").append(toIndentedString(offerStatus)).append("\n");
    sb.append("    enrollmentDetails: ").append(toIndentedString(enrollmentDetails)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("plan");
    openapiFields.add("provider");
    openapiFields.add("offer_status");
    openapiFields.add("enrollment_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetEORContractBenefits200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEORContractBenefits200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEORContractBenefits200ResponseDataInner is not found in the empty JSON string", GetEORContractBenefits200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEORContractBenefits200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEORContractBenefits200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `plan`
      if (jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) {
        GetEORContractBenefits200ResponseDataInnerPlan.validateJsonElement(jsonObj.get("plan"));
      }
      // validate the optional field `provider`
      if (jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull()) {
        GetEORContractBenefits200ResponseDataInnerProvider.validateJsonElement(jsonObj.get("provider"));
      }
      if ((jsonObj.get("offer_status") != null && !jsonObj.get("offer_status").isJsonNull()) && !jsonObj.get("offer_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_status").toString()));
      }
      // validate the optional field `offer_status`
      if (jsonObj.get("offer_status") != null && !jsonObj.get("offer_status").isJsonNull()) {
        OfferStatusEnum.validateJsonElement(jsonObj.get("offer_status"));
      }
      // validate the optional field `enrollment_details`
      if (jsonObj.get("enrollment_details") != null && !jsonObj.get("enrollment_details").isJsonNull()) {
        GetEORContractBenefits200ResponseDataInnerEnrollmentDetails.validateJsonElement(jsonObj.get("enrollment_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEORContractBenefits200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEORContractBenefits200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEORContractBenefits200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEORContractBenefits200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEORContractBenefits200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetEORContractBenefits200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEORContractBenefits200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEORContractBenefits200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEORContractBenefits200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetEORContractBenefits200ResponseDataInner
   */
  public static GetEORContractBenefits200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEORContractBenefits200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetEORContractBenefits200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

