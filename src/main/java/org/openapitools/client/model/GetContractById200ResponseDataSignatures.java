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
 * GetContractById200ResponseDataSignatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseDataSignatures {
  public static final String SERIALIZED_NAME_SIGNED_AT = "signed_at";
  @SerializedName(SERIALIZED_NAME_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime signedAt;

  public static final String SERIALIZED_NAME_CLIENT_SIGNATURE = "client_signature";
  @SerializedName(SERIALIZED_NAME_CLIENT_SIGNATURE)
  @javax.annotation.Nullable
  private String clientSignature;

  public static final String SERIALIZED_NAME_CLIENT_SIGNED_AT = "client_signed_at";
  @SerializedName(SERIALIZED_NAME_CLIENT_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime clientSignedAt;

  public static final String SERIALIZED_NAME_WORKER_SIGNATURE = "worker_signature";
  @SerializedName(SERIALIZED_NAME_WORKER_SIGNATURE)
  @javax.annotation.Nullable
  private String workerSignature;

  public static final String SERIALIZED_NAME_WORKER_SIGNED_AT = "worker_signed_at";
  @SerializedName(SERIALIZED_NAME_WORKER_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime workerSignedAt;

  public GetContractById200ResponseDataSignatures() {
  }

  public GetContractById200ResponseDataSignatures signedAt(@javax.annotation.Nullable OffsetDateTime signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  /**
   * Date and time when the contract was signed.
   * @return signedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(@javax.annotation.Nullable OffsetDateTime signedAt) {
    this.signedAt = signedAt;
  }


  public GetContractById200ResponseDataSignatures clientSignature(@javax.annotation.Nullable String clientSignature) {
    this.clientSignature = clientSignature;
    return this;
  }

  /**
   * Worker&#39;s signature.
   * @return clientSignature
   */
  @javax.annotation.Nullable
  public String getClientSignature() {
    return clientSignature;
  }

  public void setClientSignature(@javax.annotation.Nullable String clientSignature) {
    this.clientSignature = clientSignature;
  }


  public GetContractById200ResponseDataSignatures clientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
    return this;
  }

  /**
   * Date and time when the client signed the contract.
   * @return clientSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getClientSignedAt() {
    return clientSignedAt;
  }

  public void setClientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
  }


  public GetContractById200ResponseDataSignatures workerSignature(@javax.annotation.Nullable String workerSignature) {
    this.workerSignature = workerSignature;
    return this;
  }

  /**
   * Worker&#39;s signature.
   * @return workerSignature
   */
  @javax.annotation.Nullable
  public String getWorkerSignature() {
    return workerSignature;
  }

  public void setWorkerSignature(@javax.annotation.Nullable String workerSignature) {
    this.workerSignature = workerSignature;
  }


  public GetContractById200ResponseDataSignatures workerSignedAt(@javax.annotation.Nullable OffsetDateTime workerSignedAt) {
    this.workerSignedAt = workerSignedAt;
    return this;
  }

  /**
   * Date and time when the worker signed the contract.
   * @return workerSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getWorkerSignedAt() {
    return workerSignedAt;
  }

  public void setWorkerSignedAt(@javax.annotation.Nullable OffsetDateTime workerSignedAt) {
    this.workerSignedAt = workerSignedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractById200ResponseDataSignatures getContractById200ResponseDataSignatures = (GetContractById200ResponseDataSignatures) o;
    return Objects.equals(this.signedAt, getContractById200ResponseDataSignatures.signedAt) &&
        Objects.equals(this.clientSignature, getContractById200ResponseDataSignatures.clientSignature) &&
        Objects.equals(this.clientSignedAt, getContractById200ResponseDataSignatures.clientSignedAt) &&
        Objects.equals(this.workerSignature, getContractById200ResponseDataSignatures.workerSignature) &&
        Objects.equals(this.workerSignedAt, getContractById200ResponseDataSignatures.workerSignedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedAt, clientSignature, clientSignedAt, workerSignature, workerSignedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractById200ResponseDataSignatures {\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    clientSignature: ").append(toIndentedString(clientSignature)).append("\n");
    sb.append("    clientSignedAt: ").append(toIndentedString(clientSignedAt)).append("\n");
    sb.append("    workerSignature: ").append(toIndentedString(workerSignature)).append("\n");
    sb.append("    workerSignedAt: ").append(toIndentedString(workerSignedAt)).append("\n");
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
    openapiFields.add("signed_at");
    openapiFields.add("client_signature");
    openapiFields.add("client_signed_at");
    openapiFields.add("worker_signature");
    openapiFields.add("worker_signed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseDataSignatures
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseDataSignatures.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseDataSignatures is not found in the empty JSON string", GetContractById200ResponseDataSignatures.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseDataSignatures.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseDataSignatures` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("client_signature") != null && !jsonObj.get("client_signature").isJsonNull()) && !jsonObj.get("client_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_signature").toString()));
      }
      if ((jsonObj.get("worker_signature") != null && !jsonObj.get("worker_signature").isJsonNull()) && !jsonObj.get("worker_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseDataSignatures.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseDataSignatures' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseDataSignatures> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseDataSignatures.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseDataSignatures>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseDataSignatures value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseDataSignatures read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseDataSignatures given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseDataSignatures
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseDataSignatures
   */
  public static GetContractById200ResponseDataSignatures fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseDataSignatures.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseDataSignatures to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

