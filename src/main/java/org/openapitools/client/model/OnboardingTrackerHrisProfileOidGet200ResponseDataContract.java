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
 * OnboardingTrackerHrisProfileOidGet200ResponseDataContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class OnboardingTrackerHrisProfileOidGet200ResponseDataContract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  @javax.annotation.Nullable
  private String oid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FIRST_SIGN = "first_sign";
  @SerializedName(SERIALIZED_NAME_FIRST_SIGN)
  @javax.annotation.Nullable
  private String firstSign;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completion_date";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime completionDate;

  public static final String SERIALIZED_NAME_CLIENT_SIGNED_AT = "client_signed_at";
  @SerializedName(SERIALIZED_NAME_CLIENT_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime clientSignedAt;

  public static final String SERIALIZED_NAME_CONTRACTOR_SIGNED_AT = "contractor_signed_at";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime contractorSignedAt;

  public static final String SERIALIZED_NAME_INVITED_CONTRACTOR_EMAIL = "invited_contractor_email";
  @SerializedName(SERIALIZED_NAME_INVITED_CONTRACTOR_EMAIL)
  @javax.annotation.Nullable
  private String invitedContractorEmail;

  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract() {
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique contract ID
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract oid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
    return this;
  }

  /**
   * Contract OID
   * @return oid
   */
  @javax.annotation.Nullable
  public String getOid() {
    return oid;
  }

  public void setOid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Contract name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Contract status (e.g., in_progress)
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Contract creation timestamp
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract firstSign(@javax.annotation.Nullable String firstSign) {
    this.firstSign = firstSign;
    return this;
  }

  /**
   * The first sign (either &#39;client&#39; or &#39;contractor&#39;)
   * @return firstSign
   */
  @javax.annotation.Nullable
  public String getFirstSign() {
    return firstSign;
  }

  public void setFirstSign(@javax.annotation.Nullable String firstSign) {
    this.firstSign = firstSign;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract completionDate(@javax.annotation.Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * The completion date of the contract, if applicable
   * @return completionDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@javax.annotation.Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract clientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
    return this;
  }

  /**
   * Timestamp when the client signed the contract
   * @return clientSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getClientSignedAt() {
    return clientSignedAt;
  }

  public void setClientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract contractorSignedAt(@javax.annotation.Nullable OffsetDateTime contractorSignedAt) {
    this.contractorSignedAt = contractorSignedAt;
    return this;
  }

  /**
   * Timestamp when the contractor signed the contract
   * @return contractorSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getContractorSignedAt() {
    return contractorSignedAt;
  }

  public void setContractorSignedAt(@javax.annotation.Nullable OffsetDateTime contractorSignedAt) {
    this.contractorSignedAt = contractorSignedAt;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataContract invitedContractorEmail(@javax.annotation.Nullable String invitedContractorEmail) {
    this.invitedContractorEmail = invitedContractorEmail;
    return this;
  }

  /**
   * Email of the invited contractor
   * @return invitedContractorEmail
   */
  @javax.annotation.Nullable
  public String getInvitedContractorEmail() {
    return invitedContractorEmail;
  }

  public void setInvitedContractorEmail(@javax.annotation.Nullable String invitedContractorEmail) {
    this.invitedContractorEmail = invitedContractorEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTrackerHrisProfileOidGet200ResponseDataContract onboardingTrackerHrisProfileOidGet200ResponseDataContract = (OnboardingTrackerHrisProfileOidGet200ResponseDataContract) o;
    return Objects.equals(this.id, onboardingTrackerHrisProfileOidGet200ResponseDataContract.id) &&
        Objects.equals(this.oid, onboardingTrackerHrisProfileOidGet200ResponseDataContract.oid) &&
        Objects.equals(this.name, onboardingTrackerHrisProfileOidGet200ResponseDataContract.name) &&
        Objects.equals(this.status, onboardingTrackerHrisProfileOidGet200ResponseDataContract.status) &&
        Objects.equals(this.createdAt, onboardingTrackerHrisProfileOidGet200ResponseDataContract.createdAt) &&
        Objects.equals(this.firstSign, onboardingTrackerHrisProfileOidGet200ResponseDataContract.firstSign) &&
        Objects.equals(this.completionDate, onboardingTrackerHrisProfileOidGet200ResponseDataContract.completionDate) &&
        Objects.equals(this.clientSignedAt, onboardingTrackerHrisProfileOidGet200ResponseDataContract.clientSignedAt) &&
        Objects.equals(this.contractorSignedAt, onboardingTrackerHrisProfileOidGet200ResponseDataContract.contractorSignedAt) &&
        Objects.equals(this.invitedContractorEmail, onboardingTrackerHrisProfileOidGet200ResponseDataContract.invitedContractorEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, oid, name, status, createdAt, firstSign, completionDate, clientSignedAt, contractorSignedAt, invitedContractorEmail);
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
    sb.append("class OnboardingTrackerHrisProfileOidGet200ResponseDataContract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    firstSign: ").append(toIndentedString(firstSign)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    clientSignedAt: ").append(toIndentedString(clientSignedAt)).append("\n");
    sb.append("    contractorSignedAt: ").append(toIndentedString(contractorSignedAt)).append("\n");
    sb.append("    invitedContractorEmail: ").append(toIndentedString(invitedContractorEmail)).append("\n");
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
    openapiFields.add("oid");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("first_sign");
    openapiFields.add("completion_date");
    openapiFields.add("client_signed_at");
    openapiFields.add("contractor_signed_at");
    openapiFields.add("invited_contractor_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTrackerHrisProfileOidGet200ResponseDataContract is not found in the empty JSON string", OnboardingTrackerHrisProfileOidGet200ResponseDataContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingTrackerHrisProfileOidGet200ResponseDataContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("oid") != null && !jsonObj.get("oid").isJsonNull()) && !jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("first_sign") != null && !jsonObj.get("first_sign").isJsonNull()) && !jsonObj.get("first_sign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_sign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_sign").toString()));
      }
      if ((jsonObj.get("invited_contractor_email") != null && !jsonObj.get("invited_contractor_email").isJsonNull()) && !jsonObj.get("invited_contractor_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invited_contractor_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invited_contractor_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTrackerHrisProfileOidGet200ResponseDataContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTrackerHrisProfileOidGet200ResponseDataContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTrackerHrisProfileOidGet200ResponseDataContract.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataContract>() {
           @Override
           public void write(JsonWriter out, OnboardingTrackerHrisProfileOidGet200ResponseDataContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingTrackerHrisProfileOidGet200ResponseDataContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingTrackerHrisProfileOidGet200ResponseDataContract
   * @throws IOException if the JSON string is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataContract
   */
  public static OnboardingTrackerHrisProfileOidGet200ResponseDataContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTrackerHrisProfileOidGet200ResponseDataContract.class);
  }

  /**
   * Convert an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

