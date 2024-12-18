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
 * GetInvoiceList200ResponseDataRowsInnerContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class GetInvoiceList200ResponseDataRowsInnerContract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contract_type";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  @javax.annotation.Nullable
  private String contractType;

  public GetInvoiceList200ResponseDataRowsInnerContract() {
  }

  public GetInvoiceList200ResponseDataRowsInnerContract id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the contract.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetInvoiceList200ResponseDataRowsInnerContract name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name associated with the contract.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetInvoiceList200ResponseDataRowsInnerContract contractType(@javax.annotation.Nullable String contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Type of contract.
   * @return contractType
   */
  @javax.annotation.Nullable
  public String getContractType() {
    return contractType;
  }

  public void setContractType(@javax.annotation.Nullable String contractType) {
    this.contractType = contractType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvoiceList200ResponseDataRowsInnerContract getInvoiceList200ResponseDataRowsInnerContract = (GetInvoiceList200ResponseDataRowsInnerContract) o;
    return Objects.equals(this.id, getInvoiceList200ResponseDataRowsInnerContract.id) &&
        Objects.equals(this.name, getInvoiceList200ResponseDataRowsInnerContract.name) &&
        Objects.equals(this.contractType, getInvoiceList200ResponseDataRowsInnerContract.contractType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contractType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvoiceList200ResponseDataRowsInnerContract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
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
    openapiFields.add("contract_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetInvoiceList200ResponseDataRowsInnerContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetInvoiceList200ResponseDataRowsInnerContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInvoiceList200ResponseDataRowsInnerContract is not found in the empty JSON string", GetInvoiceList200ResponseDataRowsInnerContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetInvoiceList200ResponseDataRowsInnerContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInvoiceList200ResponseDataRowsInnerContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("contract_type") != null && !jsonObj.get("contract_type").isJsonNull()) && !jsonObj.get("contract_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInvoiceList200ResponseDataRowsInnerContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInvoiceList200ResponseDataRowsInnerContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInvoiceList200ResponseDataRowsInnerContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInvoiceList200ResponseDataRowsInnerContract.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInvoiceList200ResponseDataRowsInnerContract>() {
           @Override
           public void write(JsonWriter out, GetInvoiceList200ResponseDataRowsInnerContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInvoiceList200ResponseDataRowsInnerContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetInvoiceList200ResponseDataRowsInnerContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetInvoiceList200ResponseDataRowsInnerContract
   * @throws IOException if the JSON string is invalid with respect to GetInvoiceList200ResponseDataRowsInnerContract
   */
  public static GetInvoiceList200ResponseDataRowsInnerContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInvoiceList200ResponseDataRowsInnerContract.class);
  }

  /**
   * Convert an instance of GetInvoiceList200ResponseDataRowsInnerContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

