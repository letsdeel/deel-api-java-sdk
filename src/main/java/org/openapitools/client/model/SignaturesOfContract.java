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
 * SignaturesOfContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class SignaturesOfContract {
  public static final String SERIALIZED_NAME_CLIENT_SIGNATURE = "client_signature";
  @SerializedName(SERIALIZED_NAME_CLIENT_SIGNATURE)
  @javax.annotation.Nonnull
  private String clientSignature;

  public static final String SERIALIZED_NAME_CLIENT_SIGNED_AT = "client_signed_at";
  @SerializedName(SERIALIZED_NAME_CLIENT_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime clientSignedAt;

  public static final String SERIALIZED_NAME_WORKER_SIGNATURE = "worker_signature";
  @SerializedName(SERIALIZED_NAME_WORKER_SIGNATURE)
  @javax.annotation.Nonnull
  private String workerSignature;

  public static final String SERIALIZED_NAME_WORKER_SIGNED_AT = "worker_signed_at";
  @SerializedName(SERIALIZED_NAME_WORKER_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime workerSignedAt;

  public static final String SERIALIZED_NAME_SIGNED_AT = "signed_at";
  @SerializedName(SERIALIZED_NAME_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime signedAt;

  public SignaturesOfContract() {
  }

  public SignaturesOfContract clientSignature(@javax.annotation.Nonnull String clientSignature) {
    this.clientSignature = clientSignature;
    return this;
  }

  /**
   * normally name of client is used as signature
   * @return clientSignature
   */
  @javax.annotation.Nonnull
  public String getClientSignature() {
    return clientSignature;
  }

  public void setClientSignature(@javax.annotation.Nonnull String clientSignature) {
    this.clientSignature = clientSignature;
  }


  public SignaturesOfContract clientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return clientSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getClientSignedAt() {
    return clientSignedAt;
  }

  public void setClientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
  }


  public SignaturesOfContract workerSignature(@javax.annotation.Nonnull String workerSignature) {
    this.workerSignature = workerSignature;
    return this;
  }

  /**
   * Signatures of client representative.
   * @return workerSignature
   */
  @javax.annotation.Nonnull
  public String getWorkerSignature() {
    return workerSignature;
  }

  public void setWorkerSignature(@javax.annotation.Nonnull String workerSignature) {
    this.workerSignature = workerSignature;
  }


  public SignaturesOfContract workerSignedAt(@javax.annotation.Nullable OffsetDateTime workerSignedAt) {
    this.workerSignedAt = workerSignedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return workerSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getWorkerSignedAt() {
    return workerSignedAt;
  }

  public void setWorkerSignedAt(@javax.annotation.Nullable OffsetDateTime workerSignedAt) {
    this.workerSignedAt = workerSignedAt;
  }


  public SignaturesOfContract signedAt(@javax.annotation.Nullable OffsetDateTime signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return signedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(@javax.annotation.Nullable OffsetDateTime signedAt) {
    this.signedAt = signedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignaturesOfContract signaturesOfContract = (SignaturesOfContract) o;
    return Objects.equals(this.clientSignature, signaturesOfContract.clientSignature) &&
        Objects.equals(this.clientSignedAt, signaturesOfContract.clientSignedAt) &&
        Objects.equals(this.workerSignature, signaturesOfContract.workerSignature) &&
        Objects.equals(this.workerSignedAt, signaturesOfContract.workerSignedAt) &&
        Objects.equals(this.signedAt, signaturesOfContract.signedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSignature, clientSignedAt, workerSignature, workerSignedAt, signedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignaturesOfContract {\n");
    sb.append("    clientSignature: ").append(toIndentedString(clientSignature)).append("\n");
    sb.append("    clientSignedAt: ").append(toIndentedString(clientSignedAt)).append("\n");
    sb.append("    workerSignature: ").append(toIndentedString(workerSignature)).append("\n");
    sb.append("    workerSignedAt: ").append(toIndentedString(workerSignedAt)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
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
    openapiFields.add("client_signature");
    openapiFields.add("client_signed_at");
    openapiFields.add("worker_signature");
    openapiFields.add("worker_signed_at");
    openapiFields.add("signed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_signature");
    openapiRequiredFields.add("client_signed_at");
    openapiRequiredFields.add("worker_signature");
    openapiRequiredFields.add("worker_signed_at");
    openapiRequiredFields.add("signed_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SignaturesOfContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SignaturesOfContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignaturesOfContract is not found in the empty JSON string", SignaturesOfContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SignaturesOfContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SignaturesOfContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SignaturesOfContract.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("client_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_signature").toString()));
      }
      if (!jsonObj.get("worker_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignaturesOfContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignaturesOfContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignaturesOfContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignaturesOfContract.class));

       return (TypeAdapter<T>) new TypeAdapter<SignaturesOfContract>() {
           @Override
           public void write(JsonWriter out, SignaturesOfContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SignaturesOfContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SignaturesOfContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SignaturesOfContract
   * @throws IOException if the JSON string is invalid with respect to SignaturesOfContract
   */
  public static SignaturesOfContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignaturesOfContract.class);
  }

  /**
   * Convert an instance of SignaturesOfContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

