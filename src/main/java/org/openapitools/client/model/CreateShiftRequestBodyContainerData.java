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
import org.openapitools.client.model.CreateShiftSchema;

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
 * Data for the shift
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateShiftRequestBodyContainerData {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nonnull
  private String contractId;

  public static final String SERIALIZED_NAME_SHIFTS = "shifts";
  @SerializedName(SERIALIZED_NAME_SHIFTS)
  @javax.annotation.Nonnull
  private List<CreateShiftSchema> shifts = new ArrayList<>();

  public CreateShiftRequestBodyContainerData() {
  }

  public CreateShiftRequestBodyContainerData contractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * ID of the contract
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
  }


  public CreateShiftRequestBodyContainerData shifts(@javax.annotation.Nonnull List<CreateShiftSchema> shifts) {
    this.shifts = shifts;
    return this;
  }

  public CreateShiftRequestBodyContainerData addShiftsItem(CreateShiftSchema shiftsItem) {
    if (this.shifts == null) {
      this.shifts = new ArrayList<>();
    }
    this.shifts.add(shiftsItem);
    return this;
  }

  /**
   * Array of shifts
   * @return shifts
   */
  @javax.annotation.Nonnull
  public List<CreateShiftSchema> getShifts() {
    return shifts;
  }

  public void setShifts(@javax.annotation.Nonnull List<CreateShiftSchema> shifts) {
    this.shifts = shifts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShiftRequestBodyContainerData createShiftRequestBodyContainerData = (CreateShiftRequestBodyContainerData) o;
    return Objects.equals(this.contractId, createShiftRequestBodyContainerData.contractId) &&
        Objects.equals(this.shifts, createShiftRequestBodyContainerData.shifts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, shifts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShiftRequestBodyContainerData {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
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
    openapiFields.add("contract_id");
    openapiFields.add("shifts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_id");
    openapiRequiredFields.add("shifts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateShiftRequestBodyContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateShiftRequestBodyContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShiftRequestBodyContainerData is not found in the empty JSON string", CreateShiftRequestBodyContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateShiftRequestBodyContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShiftRequestBodyContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateShiftRequestBodyContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("shifts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shifts` to be an array in the JSON string but got `%s`", jsonObj.get("shifts").toString()));
      }

      JsonArray jsonArrayshifts = jsonObj.getAsJsonArray("shifts");
      // validate the required field `shifts` (array)
      for (int i = 0; i < jsonArrayshifts.size(); i++) {
        CreateShiftSchema.validateJsonElement(jsonArrayshifts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShiftRequestBodyContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShiftRequestBodyContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShiftRequestBodyContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShiftRequestBodyContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShiftRequestBodyContainerData>() {
           @Override
           public void write(JsonWriter out, CreateShiftRequestBodyContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShiftRequestBodyContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateShiftRequestBodyContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateShiftRequestBodyContainerData
   * @throws IOException if the JSON string is invalid with respect to CreateShiftRequestBodyContainerData
   */
  public static CreateShiftRequestBodyContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShiftRequestBodyContainerData.class);
  }

  /**
   * Convert an instance of CreateShiftRequestBodyContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

