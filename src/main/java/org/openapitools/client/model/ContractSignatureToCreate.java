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
import org.openapitools.client.model.ContractSignatureToCreateContractTemplateId;

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
 * ContractSignatureToCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractSignatureToCreate {
  public static final String SERIALIZED_NAME_CLIENT_SIGNATURE = "client_signature";
  @SerializedName(SERIALIZED_NAME_CLIENT_SIGNATURE)
  @javax.annotation.Nonnull
  private String clientSignature;

  public static final String SERIALIZED_NAME_CONTRACT_TEMPLATE_ID = "contract_template_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TEMPLATE_ID)
  @javax.annotation.Nullable
  private ContractSignatureToCreateContractTemplateId contractTemplateId = null;

  public ContractSignatureToCreate() {
  }

  public ContractSignatureToCreate clientSignature(@javax.annotation.Nonnull String clientSignature) {
    this.clientSignature = clientSignature;
    return this;
  }

  /**
   * Signature of client.
   * @return clientSignature
   */
  @javax.annotation.Nonnull
  public String getClientSignature() {
    return clientSignature;
  }

  public void setClientSignature(@javax.annotation.Nonnull String clientSignature) {
    this.clientSignature = clientSignature;
  }


  public ContractSignatureToCreate contractTemplateId(@javax.annotation.Nullable ContractSignatureToCreateContractTemplateId contractTemplateId) {
    this.contractTemplateId = contractTemplateId;
    return this;
  }

  /**
   * Get contractTemplateId
   * @return contractTemplateId
   */
  @javax.annotation.Nullable
  public ContractSignatureToCreateContractTemplateId getContractTemplateId() {
    return contractTemplateId;
  }

  public void setContractTemplateId(@javax.annotation.Nullable ContractSignatureToCreateContractTemplateId contractTemplateId) {
    this.contractTemplateId = contractTemplateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractSignatureToCreate contractSignatureToCreate = (ContractSignatureToCreate) o;
    return Objects.equals(this.clientSignature, contractSignatureToCreate.clientSignature) &&
        Objects.equals(this.contractTemplateId, contractSignatureToCreate.contractTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSignature, contractTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractSignatureToCreate {\n");
    sb.append("    clientSignature: ").append(toIndentedString(clientSignature)).append("\n");
    sb.append("    contractTemplateId: ").append(toIndentedString(contractTemplateId)).append("\n");
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
    openapiFields.add("contract_template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_signature");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractSignatureToCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractSignatureToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractSignatureToCreate is not found in the empty JSON string", ContractSignatureToCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractSignatureToCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractSignatureToCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractSignatureToCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("client_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_signature").toString()));
      }
      // validate the optional field `contract_template_id`
      if (jsonObj.get("contract_template_id") != null && !jsonObj.get("contract_template_id").isJsonNull()) {
        ContractSignatureToCreateContractTemplateId.validateJsonElement(jsonObj.get("contract_template_id"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractSignatureToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractSignatureToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractSignatureToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractSignatureToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractSignatureToCreate>() {
           @Override
           public void write(JsonWriter out, ContractSignatureToCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractSignatureToCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractSignatureToCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractSignatureToCreate
   * @throws IOException if the JSON string is invalid with respect to ContractSignatureToCreate
   */
  public static ContractSignatureToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractSignatureToCreate.class);
  }

  /**
   * Convert an instance of ContractSignatureToCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

