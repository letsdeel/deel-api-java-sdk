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
import java.math.BigDecimal;
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
 * TheWorkerForThePayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class TheWorkerForThePayment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name = "";

  public static final String SERIALIZED_NAME_PIC_URL = "picUrl";
  @SerializedName(SERIALIZED_NAME_PIC_URL)
  @javax.annotation.Nullable
  private String picUrl;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public TheWorkerForThePayment() {
  }

  public TheWorkerForThePayment id(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the worker.
   * @return id
   */
  @javax.annotation.Nullable
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
  }


  public TheWorkerForThePayment name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of the worker.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public TheWorkerForThePayment picUrl(@javax.annotation.Nullable String picUrl) {
    this.picUrl = picUrl;
    return this;
  }

  /**
   * URL to the worker&#39;s Deel avatar.
   * @return picUrl
   */
  @javax.annotation.Nullable
  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(@javax.annotation.Nullable String picUrl) {
    this.picUrl = picUrl;
  }


  public TheWorkerForThePayment contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * The worker&#39;s Deel contract ID.
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheWorkerForThePayment theWorkerForThePayment = (TheWorkerForThePayment) o;
    return Objects.equals(this.id, theWorkerForThePayment.id) &&
        Objects.equals(this.name, theWorkerForThePayment.name) &&
        Objects.equals(this.picUrl, theWorkerForThePayment.picUrl) &&
        Objects.equals(this.contractId, theWorkerForThePayment.contractId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, picUrl, contractId);
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
    sb.append("class TheWorkerForThePayment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
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
    openapiFields.add("picUrl");
    openapiFields.add("contract_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("picUrl");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TheWorkerForThePayment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TheWorkerForThePayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TheWorkerForThePayment is not found in the empty JSON string", TheWorkerForThePayment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TheWorkerForThePayment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TheWorkerForThePayment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TheWorkerForThePayment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("picUrl") != null && !jsonObj.get("picUrl").isJsonNull()) && !jsonObj.get("picUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picUrl").toString()));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TheWorkerForThePayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TheWorkerForThePayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TheWorkerForThePayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TheWorkerForThePayment.class));

       return (TypeAdapter<T>) new TypeAdapter<TheWorkerForThePayment>() {
           @Override
           public void write(JsonWriter out, TheWorkerForThePayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TheWorkerForThePayment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TheWorkerForThePayment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TheWorkerForThePayment
   * @throws IOException if the JSON string is invalid with respect to TheWorkerForThePayment
   */
  public static TheWorkerForThePayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TheWorkerForThePayment.class);
  }

  /**
   * Convert an instance of TheWorkerForThePayment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

