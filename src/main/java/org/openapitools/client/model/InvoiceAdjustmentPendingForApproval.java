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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.InvoiceAdjustmentPendingForApprovalApproversInner;

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
 * InvoiceAdjustmentPendingForApproval
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class InvoiceAdjustmentPendingForApproval {
  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  @javax.annotation.Nullable
  private String teamId;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contract_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  @javax.annotation.Nonnull
  private String contractName;

  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  @javax.annotation.Nonnull
  private String contractOid;

  public static final String SERIALIZED_NAME_ADJUSTMENT_ID = "adjustment_id";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_ID)
  @javax.annotation.Nonnull
  private String adjustmentId;

  public static final String SERIALIZED_NAME_ADJUSTMENT_TYPE = "adjustment_type";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_TYPE)
  @javax.annotation.Nonnull
  private String adjustmentType;

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  @javax.annotation.Nullable
  private List<InvoiceAdjustmentPendingForApprovalApproversInner> approvers = new ArrayList<>();

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  @javax.annotation.Nonnull
  private String eventType;

  public InvoiceAdjustmentPendingForApproval() {
  }

  public InvoiceAdjustmentPendingForApproval teamId(@javax.annotation.Nullable String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   */
  @javax.annotation.Nullable
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(@javax.annotation.Nullable String teamId) {
    this.teamId = teamId;
  }


  public InvoiceAdjustmentPendingForApproval contractName(@javax.annotation.Nonnull String contractName) {
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


  public InvoiceAdjustmentPendingForApproval contractOid(@javax.annotation.Nonnull String contractOid) {
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


  public InvoiceAdjustmentPendingForApproval adjustmentId(@javax.annotation.Nonnull String adjustmentId) {
    this.adjustmentId = adjustmentId;
    return this;
  }

  /**
   * Get adjustmentId
   * @return adjustmentId
   */
  @javax.annotation.Nonnull
  public String getAdjustmentId() {
    return adjustmentId;
  }

  public void setAdjustmentId(@javax.annotation.Nonnull String adjustmentId) {
    this.adjustmentId = adjustmentId;
  }


  public InvoiceAdjustmentPendingForApproval adjustmentType(@javax.annotation.Nonnull String adjustmentType) {
    this.adjustmentType = adjustmentType;
    return this;
  }

  /**
   * Get adjustmentType
   * @return adjustmentType
   */
  @javax.annotation.Nonnull
  public String getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(@javax.annotation.Nonnull String adjustmentType) {
    this.adjustmentType = adjustmentType;
  }


  public InvoiceAdjustmentPendingForApproval approvers(@javax.annotation.Nullable List<InvoiceAdjustmentPendingForApprovalApproversInner> approvers) {
    this.approvers = approvers;
    return this;
  }

  public InvoiceAdjustmentPendingForApproval addApproversItem(InvoiceAdjustmentPendingForApprovalApproversInner approversItem) {
    if (this.approvers == null) {
      this.approvers = new ArrayList<>();
    }
    this.approvers.add(approversItem);
    return this;
  }

  /**
   * Get approvers
   * @return approvers
   */
  @javax.annotation.Nullable
  public List<InvoiceAdjustmentPendingForApprovalApproversInner> getApprovers() {
    return approvers;
  }

  public void setApprovers(@javax.annotation.Nullable List<InvoiceAdjustmentPendingForApprovalApproversInner> approvers) {
    this.approvers = approvers;
  }


  public InvoiceAdjustmentPendingForApproval eventType(@javax.annotation.Nonnull String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   */
  @javax.annotation.Nonnull
  public String getEventType() {
    return eventType;
  }

  public void setEventType(@javax.annotation.Nonnull String eventType) {
    this.eventType = eventType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceAdjustmentPendingForApproval invoiceAdjustmentPendingForApproval = (InvoiceAdjustmentPendingForApproval) o;
    return Objects.equals(this.teamId, invoiceAdjustmentPendingForApproval.teamId) &&
        Objects.equals(this.contractName, invoiceAdjustmentPendingForApproval.contractName) &&
        Objects.equals(this.contractOid, invoiceAdjustmentPendingForApproval.contractOid) &&
        Objects.equals(this.adjustmentId, invoiceAdjustmentPendingForApproval.adjustmentId) &&
        Objects.equals(this.adjustmentType, invoiceAdjustmentPendingForApproval.adjustmentType) &&
        Objects.equals(this.approvers, invoiceAdjustmentPendingForApproval.approvers) &&
        Objects.equals(this.eventType, invoiceAdjustmentPendingForApproval.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, contractName, contractOid, adjustmentId, adjustmentType, approvers, eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceAdjustmentPendingForApproval {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    adjustmentId: ").append(toIndentedString(adjustmentId)).append("\n");
    sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
    openapiFields.add("team_id");
    openapiFields.add("contract_name");
    openapiFields.add("contract_oid");
    openapiFields.add("adjustment_id");
    openapiFields.add("adjustment_type");
    openapiFields.add("approvers");
    openapiFields.add("event_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_name");
    openapiRequiredFields.add("contract_oid");
    openapiRequiredFields.add("adjustment_id");
    openapiRequiredFields.add("adjustment_type");
    openapiRequiredFields.add("event_type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentPendingForApproval
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceAdjustmentPendingForApproval.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceAdjustmentPendingForApproval is not found in the empty JSON string", InvoiceAdjustmentPendingForApproval.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceAdjustmentPendingForApproval.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceAdjustmentPendingForApproval` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceAdjustmentPendingForApproval.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("team_id") != null && !jsonObj.get("team_id").isJsonNull()) && !jsonObj.get("team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_id").toString()));
      }
      if (!jsonObj.get("contract_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_name").toString()));
      }
      if (!jsonObj.get("contract_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_oid").toString()));
      }
      if (!jsonObj.get("adjustment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment_id").toString()));
      }
      if (!jsonObj.get("adjustment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment_type").toString()));
      }
      if (jsonObj.get("approvers") != null && !jsonObj.get("approvers").isJsonNull()) {
        JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
        if (jsonArrayapprovers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("approvers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
          }

          // validate the optional field `approvers` (array)
          for (int i = 0; i < jsonArrayapprovers.size(); i++) {
            InvoiceAdjustmentPendingForApprovalApproversInner.validateJsonElement(jsonArrayapprovers.get(i));
          };
        }
      }
      if (!jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceAdjustmentPendingForApproval.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceAdjustmentPendingForApproval' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceAdjustmentPendingForApproval> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceAdjustmentPendingForApproval.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentPendingForApproval>() {
           @Override
           public void write(JsonWriter out, InvoiceAdjustmentPendingForApproval value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceAdjustmentPendingForApproval read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceAdjustmentPendingForApproval given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceAdjustmentPendingForApproval
   * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentPendingForApproval
   */
  public static InvoiceAdjustmentPendingForApproval fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentPendingForApproval.class);
  }

  /**
   * Convert an instance of InvoiceAdjustmentPendingForApproval to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

