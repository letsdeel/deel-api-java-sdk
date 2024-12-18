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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EorClientTimeoffRequests;

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
 * EorTimeoffsEmployeeItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:50:05.582888578Z[GMT]", comments = "Generator version: 7.10.0")
public class EorTimeoffsEmployeeItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_EOR_CONTRACT_ID = "eor_contract_id";
  @SerializedName(SERIALIZED_NAME_EOR_CONTRACT_ID)
  @javax.annotation.Nonnull
  private BigDecimal eorContractId;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nonnull
  private String contractId;

  public static final String SERIALIZED_NAME_VACATIONS = "vacations";
  @SerializedName(SERIALIZED_NAME_VACATIONS)
  @javax.annotation.Nonnull
  private List<EorClientTimeoffRequests> vacations = new ArrayList<>();

  public static final String SERIALIZED_NAME_SICK_LEAVES = "sick_leaves";
  @SerializedName(SERIALIZED_NAME_SICK_LEAVES)
  @javax.annotation.Nonnull
  private List<EorClientTimeoffRequests> sickLeaves = new ArrayList<>();

  public static final String SERIALIZED_NAME_OTHERS = "others";
  @SerializedName(SERIALIZED_NAME_OTHERS)
  @javax.annotation.Nonnull
  private List<EorClientTimeoffRequests> others = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIME_ZONES = "time_zones";
  @SerializedName(SERIALIZED_NAME_TIME_ZONES)
  @javax.annotation.Nonnull
  private String timeZones;

  public EorTimeoffsEmployeeItem() {
  }

  public EorTimeoffsEmployeeItem id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public EorTimeoffsEmployeeItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public EorTimeoffsEmployeeItem eorContractId(@javax.annotation.Nonnull BigDecimal eorContractId) {
    this.eorContractId = eorContractId;
    return this;
  }

  /**
   * Get eorContractId
   * @return eorContractId
   */
  @javax.annotation.Nonnull
  public BigDecimal getEorContractId() {
    return eorContractId;
  }

  public void setEorContractId(@javax.annotation.Nonnull BigDecimal eorContractId) {
    this.eorContractId = eorContractId;
  }


  public EorTimeoffsEmployeeItem contractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
  }


  public EorTimeoffsEmployeeItem vacations(@javax.annotation.Nonnull List<EorClientTimeoffRequests> vacations) {
    this.vacations = vacations;
    return this;
  }

  public EorTimeoffsEmployeeItem addVacationsItem(EorClientTimeoffRequests vacationsItem) {
    if (this.vacations == null) {
      this.vacations = new ArrayList<>();
    }
    this.vacations.add(vacationsItem);
    return this;
  }

  /**
   * List of employee vacation time offs.
   * @return vacations
   */
  @javax.annotation.Nonnull
  public List<EorClientTimeoffRequests> getVacations() {
    return vacations;
  }

  public void setVacations(@javax.annotation.Nonnull List<EorClientTimeoffRequests> vacations) {
    this.vacations = vacations;
  }


  public EorTimeoffsEmployeeItem sickLeaves(@javax.annotation.Nonnull List<EorClientTimeoffRequests> sickLeaves) {
    this.sickLeaves = sickLeaves;
    return this;
  }

  public EorTimeoffsEmployeeItem addSickLeavesItem(EorClientTimeoffRequests sickLeavesItem) {
    if (this.sickLeaves == null) {
      this.sickLeaves = new ArrayList<>();
    }
    this.sickLeaves.add(sickLeavesItem);
    return this;
  }

  /**
   * List of employee sick leave time offs.
   * @return sickLeaves
   */
  @javax.annotation.Nonnull
  public List<EorClientTimeoffRequests> getSickLeaves() {
    return sickLeaves;
  }

  public void setSickLeaves(@javax.annotation.Nonnull List<EorClientTimeoffRequests> sickLeaves) {
    this.sickLeaves = sickLeaves;
  }


  public EorTimeoffsEmployeeItem others(@javax.annotation.Nonnull List<EorClientTimeoffRequests> others) {
    this.others = others;
    return this;
  }

  public EorTimeoffsEmployeeItem addOthersItem(EorClientTimeoffRequests othersItem) {
    if (this.others == null) {
      this.others = new ArrayList<>();
    }
    this.others.add(othersItem);
    return this;
  }

  /**
   * List of all other employee time offs.
   * @return others
   */
  @javax.annotation.Nonnull
  public List<EorClientTimeoffRequests> getOthers() {
    return others;
  }

  public void setOthers(@javax.annotation.Nonnull List<EorClientTimeoffRequests> others) {
    this.others = others;
  }


  public EorTimeoffsEmployeeItem timeZones(@javax.annotation.Nonnull String timeZones) {
    this.timeZones = timeZones;
    return this;
  }

  /**
   * Get timeZones
   * @return timeZones
   */
  @javax.annotation.Nonnull
  public String getTimeZones() {
    return timeZones;
  }

  public void setTimeZones(@javax.annotation.Nonnull String timeZones) {
    this.timeZones = timeZones;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorTimeoffsEmployeeItem eorTimeoffsEmployeeItem = (EorTimeoffsEmployeeItem) o;
    return Objects.equals(this.id, eorTimeoffsEmployeeItem.id) &&
        Objects.equals(this.name, eorTimeoffsEmployeeItem.name) &&
        Objects.equals(this.eorContractId, eorTimeoffsEmployeeItem.eorContractId) &&
        Objects.equals(this.contractId, eorTimeoffsEmployeeItem.contractId) &&
        Objects.equals(this.vacations, eorTimeoffsEmployeeItem.vacations) &&
        Objects.equals(this.sickLeaves, eorTimeoffsEmployeeItem.sickLeaves) &&
        Objects.equals(this.others, eorTimeoffsEmployeeItem.others) &&
        Objects.equals(this.timeZones, eorTimeoffsEmployeeItem.timeZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, eorContractId, contractId, vacations, sickLeaves, others, timeZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorTimeoffsEmployeeItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eorContractId: ").append(toIndentedString(eorContractId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    vacations: ").append(toIndentedString(vacations)).append("\n");
    sb.append("    sickLeaves: ").append(toIndentedString(sickLeaves)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    timeZones: ").append(toIndentedString(timeZones)).append("\n");
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
    openapiFields.add("eor_contract_id");
    openapiFields.add("contract_id");
    openapiFields.add("vacations");
    openapiFields.add("sick_leaves");
    openapiFields.add("others");
    openapiFields.add("time_zones");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("eor_contract_id");
    openapiRequiredFields.add("contract_id");
    openapiRequiredFields.add("vacations");
    openapiRequiredFields.add("sick_leaves");
    openapiRequiredFields.add("others");
    openapiRequiredFields.add("time_zones");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorTimeoffsEmployeeItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorTimeoffsEmployeeItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorTimeoffsEmployeeItem is not found in the empty JSON string", EorTimeoffsEmployeeItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorTimeoffsEmployeeItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorTimeoffsEmployeeItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorTimeoffsEmployeeItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("vacations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacations` to be an array in the JSON string but got `%s`", jsonObj.get("vacations").toString()));
      }

      JsonArray jsonArrayvacations = jsonObj.getAsJsonArray("vacations");
      // validate the required field `vacations` (array)
      for (int i = 0; i < jsonArrayvacations.size(); i++) {
        EorClientTimeoffRequests.validateJsonElement(jsonArrayvacations.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("sick_leaves").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sick_leaves` to be an array in the JSON string but got `%s`", jsonObj.get("sick_leaves").toString()));
      }

      JsonArray jsonArraysickLeaves = jsonObj.getAsJsonArray("sick_leaves");
      // validate the required field `sick_leaves` (array)
      for (int i = 0; i < jsonArraysickLeaves.size(); i++) {
        EorClientTimeoffRequests.validateJsonElement(jsonArraysickLeaves.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("others").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `others` to be an array in the JSON string but got `%s`", jsonObj.get("others").toString()));
      }

      JsonArray jsonArrayothers = jsonObj.getAsJsonArray("others");
      // validate the required field `others` (array)
      for (int i = 0; i < jsonArrayothers.size(); i++) {
        EorClientTimeoffRequests.validateJsonElement(jsonArrayothers.get(i));
      };
      if (!jsonObj.get("time_zones").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_zones` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_zones").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorTimeoffsEmployeeItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorTimeoffsEmployeeItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorTimeoffsEmployeeItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorTimeoffsEmployeeItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EorTimeoffsEmployeeItem>() {
           @Override
           public void write(JsonWriter out, EorTimeoffsEmployeeItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorTimeoffsEmployeeItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorTimeoffsEmployeeItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorTimeoffsEmployeeItem
   * @throws IOException if the JSON string is invalid with respect to EorTimeoffsEmployeeItem
   */
  public static EorTimeoffsEmployeeItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorTimeoffsEmployeeItem.class);
  }

  /**
   * Convert an instance of EorTimeoffsEmployeeItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

