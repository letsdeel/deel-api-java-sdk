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
 * InviteTeamMemberToSign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class InviteTeamMemberToSign {
  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  @javax.annotation.Nonnull
  private String contractOid;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contract_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  @javax.annotation.Nonnull
  private String contractName;

  public static final String SERIALIZED_NAME_INVITEE_ID = "invitee_id";
  @SerializedName(SERIALIZED_NAME_INVITEE_ID)
  @javax.annotation.Nonnull
  private BigDecimal inviteeId;

  public static final String SERIALIZED_NAME_INVITEE_NAME = "invitee_name";
  @SerializedName(SERIALIZED_NAME_INVITEE_NAME)
  @javax.annotation.Nonnull
  private String inviteeName;

  public InviteTeamMemberToSign() {
  }

  public InviteTeamMemberToSign contractOid(@javax.annotation.Nonnull String contractOid) {
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


  public InviteTeamMemberToSign contractName(@javax.annotation.Nonnull String contractName) {
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


  public InviteTeamMemberToSign inviteeId(@javax.annotation.Nonnull BigDecimal inviteeId) {
    this.inviteeId = inviteeId;
    return this;
  }

  /**
   * Get inviteeId
   * @return inviteeId
   */
  @javax.annotation.Nonnull
  public BigDecimal getInviteeId() {
    return inviteeId;
  }

  public void setInviteeId(@javax.annotation.Nonnull BigDecimal inviteeId) {
    this.inviteeId = inviteeId;
  }


  public InviteTeamMemberToSign inviteeName(@javax.annotation.Nonnull String inviteeName) {
    this.inviteeName = inviteeName;
    return this;
  }

  /**
   * Get inviteeName
   * @return inviteeName
   */
  @javax.annotation.Nonnull
  public String getInviteeName() {
    return inviteeName;
  }

  public void setInviteeName(@javax.annotation.Nonnull String inviteeName) {
    this.inviteeName = inviteeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteTeamMemberToSign inviteTeamMemberToSign = (InviteTeamMemberToSign) o;
    return Objects.equals(this.contractOid, inviteTeamMemberToSign.contractOid) &&
        Objects.equals(this.contractName, inviteTeamMemberToSign.contractName) &&
        Objects.equals(this.inviteeId, inviteTeamMemberToSign.inviteeId) &&
        Objects.equals(this.inviteeName, inviteTeamMemberToSign.inviteeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractOid, contractName, inviteeId, inviteeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteTeamMemberToSign {\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    inviteeId: ").append(toIndentedString(inviteeId)).append("\n");
    sb.append("    inviteeName: ").append(toIndentedString(inviteeName)).append("\n");
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
    openapiFields.add("invitee_id");
    openapiFields.add("invitee_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_oid");
    openapiRequiredFields.add("contract_name");
    openapiRequiredFields.add("invitee_id");
    openapiRequiredFields.add("invitee_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InviteTeamMemberToSign
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InviteTeamMemberToSign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InviteTeamMemberToSign is not found in the empty JSON string", InviteTeamMemberToSign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InviteTeamMemberToSign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InviteTeamMemberToSign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InviteTeamMemberToSign.openapiRequiredFields) {
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
      if (!jsonObj.get("invitee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitee_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InviteTeamMemberToSign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InviteTeamMemberToSign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InviteTeamMemberToSign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InviteTeamMemberToSign.class));

       return (TypeAdapter<T>) new TypeAdapter<InviteTeamMemberToSign>() {
           @Override
           public void write(JsonWriter out, InviteTeamMemberToSign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InviteTeamMemberToSign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InviteTeamMemberToSign given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InviteTeamMemberToSign
   * @throws IOException if the JSON string is invalid with respect to InviteTeamMemberToSign
   */
  public static InviteTeamMemberToSign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InviteTeamMemberToSign.class);
  }

  /**
   * Convert an instance of InviteTeamMemberToSign to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

