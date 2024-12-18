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
 * SignaturesOfBasicContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class SignaturesOfBasicContract {
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

  public SignaturesOfBasicContract() {
  }

  public SignaturesOfBasicContract clientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
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


  public SignaturesOfBasicContract workerSignature(@javax.annotation.Nonnull String workerSignature) {
    this.workerSignature = workerSignature;
    return this;
  }

  /**
   * Worker&#39;s signature.
   * @return workerSignature
   */
  @javax.annotation.Nonnull
  public String getWorkerSignature() {
    return workerSignature;
  }

  public void setWorkerSignature(@javax.annotation.Nonnull String workerSignature) {
    this.workerSignature = workerSignature;
  }


  public SignaturesOfBasicContract workerSignedAt(@javax.annotation.Nullable OffsetDateTime workerSignedAt) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignaturesOfBasicContract signaturesOfBasicContract = (SignaturesOfBasicContract) o;
    return Objects.equals(this.clientSignedAt, signaturesOfBasicContract.clientSignedAt) &&
        Objects.equals(this.workerSignature, signaturesOfBasicContract.workerSignature) &&
        Objects.equals(this.workerSignedAt, signaturesOfBasicContract.workerSignedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSignedAt, workerSignature, workerSignedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignaturesOfBasicContract {\n");
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
    openapiFields.add("client_signed_at");
    openapiFields.add("worker_signature");
    openapiFields.add("worker_signed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_signed_at");
    openapiRequiredFields.add("worker_signature");
    openapiRequiredFields.add("worker_signed_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SignaturesOfBasicContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SignaturesOfBasicContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignaturesOfBasicContract is not found in the empty JSON string", SignaturesOfBasicContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SignaturesOfBasicContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SignaturesOfBasicContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SignaturesOfBasicContract.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("worker_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignaturesOfBasicContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignaturesOfBasicContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignaturesOfBasicContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignaturesOfBasicContract.class));

       return (TypeAdapter<T>) new TypeAdapter<SignaturesOfBasicContract>() {
           @Override
           public void write(JsonWriter out, SignaturesOfBasicContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SignaturesOfBasicContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SignaturesOfBasicContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SignaturesOfBasicContract
   * @throws IOException if the JSON string is invalid with respect to SignaturesOfBasicContract
   */
  public static SignaturesOfBasicContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignaturesOfBasicContract.class);
  }

  /**
   * Convert an instance of SignaturesOfBasicContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

