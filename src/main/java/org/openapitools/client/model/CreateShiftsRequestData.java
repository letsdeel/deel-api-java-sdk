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
import org.openapitools.client.model.CreateShiftsRequestDataShiftsInner;

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
 * CreateShiftsRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:15:13.914237102Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateShiftsRequestData {
  public static final String SERIALIZED_NAME_SHIFTS = "shifts";
  @SerializedName(SERIALIZED_NAME_SHIFTS)
  @javax.annotation.Nonnull
  private List<CreateShiftsRequestDataShiftsInner> shifts = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nonnull
  private String contractId;

  public CreateShiftsRequestData() {
  }

  public CreateShiftsRequestData shifts(@javax.annotation.Nonnull List<CreateShiftsRequestDataShiftsInner> shifts) {
    this.shifts = shifts;
    return this;
  }

  public CreateShiftsRequestData addShiftsItem(CreateShiftsRequestDataShiftsInner shiftsItem) {
    if (this.shifts == null) {
      this.shifts = new ArrayList<>();
    }
    this.shifts.add(shiftsItem);
    return this;
  }

  /**
   * Get shifts
   * @return shifts
   */
  @javax.annotation.Nonnull
  public List<CreateShiftsRequestDataShiftsInner> getShifts() {
    return shifts;
  }

  public void setShifts(@javax.annotation.Nonnull List<CreateShiftsRequestDataShiftsInner> shifts) {
    this.shifts = shifts;
  }


  public CreateShiftsRequestData contractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Contract ID associated with the shifts.
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nonnull String contractId) {
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
    CreateShiftsRequestData createShiftsRequestData = (CreateShiftsRequestData) o;
    return Objects.equals(this.shifts, createShiftsRequestData.shifts) &&
        Objects.equals(this.contractId, createShiftsRequestData.contractId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shifts, contractId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShiftsRequestData {\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
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
    openapiFields.add("shifts");
    openapiFields.add("contract_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shifts");
    openapiRequiredFields.add("contract_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateShiftsRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateShiftsRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShiftsRequestData is not found in the empty JSON string", CreateShiftsRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateShiftsRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShiftsRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateShiftsRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("shifts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shifts` to be an array in the JSON string but got `%s`", jsonObj.get("shifts").toString()));
      }

      JsonArray jsonArrayshifts = jsonObj.getAsJsonArray("shifts");
      // validate the required field `shifts` (array)
      for (int i = 0; i < jsonArrayshifts.size(); i++) {
        CreateShiftsRequestDataShiftsInner.validateJsonElement(jsonArrayshifts.get(i));
      };
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShiftsRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShiftsRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShiftsRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShiftsRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShiftsRequestData>() {
           @Override
           public void write(JsonWriter out, CreateShiftsRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShiftsRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateShiftsRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateShiftsRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateShiftsRequestData
   */
  public static CreateShiftsRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShiftsRequestData.class);
  }

  /**
   * Convert an instance of CreateShiftsRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

