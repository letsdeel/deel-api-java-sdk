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
 * ContractAmendmentSentToClient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractAmendmentSentToClient {
  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  @javax.annotation.Nonnull
  private String contractOid;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contract_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  @javax.annotation.Nonnull
  private String contractName;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  @javax.annotation.Nonnull
  private BigDecimal clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  @javax.annotation.Nonnull
  private String clientName;

  public ContractAmendmentSentToClient() {
  }

  public ContractAmendmentSentToClient contractOid(@javax.annotation.Nonnull String contractOid) {
    this.contractOid = contractOid;
    return this;
  }

  /**
   * Get contractOid
   * @return contractOid
   */
  @javax.annotation.Nonnull
  public String getContractOid() {
    return contractOid;
  }

  public void setContractOid(@javax.annotation.Nonnull String contractOid) {
    this.contractOid = contractOid;
  }


  public ContractAmendmentSentToClient contractName(@javax.annotation.Nonnull String contractName) {
    this.contractName = contractName;
    return this;
  }

  /**
   * Get contractName
   * @return contractName
   */
  @javax.annotation.Nonnull
  public String getContractName() {
    return contractName;
  }

  public void setContractName(@javax.annotation.Nonnull String contractName) {
    this.contractName = contractName;
  }


  public ContractAmendmentSentToClient clientId(@javax.annotation.Nonnull BigDecimal clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   */
  @javax.annotation.Nonnull
  public BigDecimal getClientId() {
    return clientId;
  }

  public void setClientId(@javax.annotation.Nonnull BigDecimal clientId) {
    this.clientId = clientId;
  }


  public ContractAmendmentSentToClient clientName(@javax.annotation.Nonnull String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Get clientName
   * @return clientName
   */
  @javax.annotation.Nonnull
  public String getClientName() {
    return clientName;
  }

  public void setClientName(@javax.annotation.Nonnull String clientName) {
    this.clientName = clientName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractAmendmentSentToClient contractAmendmentSentToClient = (ContractAmendmentSentToClient) o;
    return Objects.equals(this.contractOid, contractAmendmentSentToClient.contractOid) &&
        Objects.equals(this.contractName, contractAmendmentSentToClient.contractName) &&
        Objects.equals(this.clientId, contractAmendmentSentToClient.clientId) &&
        Objects.equals(this.clientName, contractAmendmentSentToClient.clientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractOid, contractName, clientId, clientName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractAmendmentSentToClient {\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
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
    openapiFields.add("contract_oid");
    openapiFields.add("contract_name");
    openapiFields.add("client_id");
    openapiFields.add("client_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_oid");
    openapiRequiredFields.add("contract_name");
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("client_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractAmendmentSentToClient
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractAmendmentSentToClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractAmendmentSentToClient is not found in the empty JSON string", ContractAmendmentSentToClient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractAmendmentSentToClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractAmendmentSentToClient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractAmendmentSentToClient.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contract_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_oid").toString()));
      }
      if (!jsonObj.get("contract_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_name").toString()));
      }
      if (!jsonObj.get("client_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractAmendmentSentToClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractAmendmentSentToClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractAmendmentSentToClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractAmendmentSentToClient.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractAmendmentSentToClient>() {
           @Override
           public void write(JsonWriter out, ContractAmendmentSentToClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractAmendmentSentToClient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractAmendmentSentToClient given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractAmendmentSentToClient
   * @throws IOException if the JSON string is invalid with respect to ContractAmendmentSentToClient
   */
  public static ContractAmendmentSentToClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractAmendmentSentToClient.class);
  }

  /**
   * Convert an instance of ContractAmendmentSentToClient to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

