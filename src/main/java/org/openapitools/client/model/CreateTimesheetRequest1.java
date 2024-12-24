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
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * CreateTimesheetRequest1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTimesheetRequest1 {
  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  @javax.annotation.Nonnull
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nonnull
  private String contractId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description = "";

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  @javax.annotation.Nonnull
  private LocalDate dateSubmitted;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nullable
  private File _file;

  public CreateTimesheetRequest1() {
  }

  public CreateTimesheetRequest1 quantity(@javax.annotation.Nonnull BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * This is based on the scale of work statement of the associated contract
   * minimum: 0.01
   * @return quantity
   */
  @javax.annotation.Nonnull
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(@javax.annotation.Nonnull BigDecimal quantity) {
    this.quantity = quantity;
  }


  public CreateTimesheetRequest1 contractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Id of a Deel contract.
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
  }


  public CreateTimesheetRequest1 description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public CreateTimesheetRequest1 dateSubmitted(@javax.annotation.Nonnull LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return dateSubmitted
   */
  @javax.annotation.Nonnull
  public LocalDate getDateSubmitted() {
    return dateSubmitted;
  }

  public void setDateSubmitted(@javax.annotation.Nonnull LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
  }


  public CreateTimesheetRequest1 _file(@javax.annotation.Nullable File _file) {
    this._file = _file;
    return this;
  }

  /**
   * Upload the file you want to attach to this entry.
   * @return _file
   */
  @javax.annotation.Nullable
  public File getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nullable File _file) {
    this._file = _file;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimesheetRequest1 createTimesheetRequest1 = (CreateTimesheetRequest1) o;
    return Objects.equals(this.quantity, createTimesheetRequest1.quantity) &&
        Objects.equals(this.contractId, createTimesheetRequest1.contractId) &&
        Objects.equals(this.description, createTimesheetRequest1.description) &&
        Objects.equals(this.dateSubmitted, createTimesheetRequest1.dateSubmitted) &&
        Objects.equals(this._file, createTimesheetRequest1._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, contractId, description, dateSubmitted, _file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimesheetRequest1 {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("quantity");
    openapiFields.add("contract_id");
    openapiFields.add("description");
    openapiFields.add("date_submitted");
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("contract_id");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("date_submitted");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTimesheetRequest1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimesheetRequest1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimesheetRequest1 is not found in the empty JSON string", CreateTimesheetRequest1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimesheetRequest1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimesheetRequest1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTimesheetRequest1.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimesheetRequest1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimesheetRequest1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimesheetRequest1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimesheetRequest1.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimesheetRequest1>() {
           @Override
           public void write(JsonWriter out, CreateTimesheetRequest1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimesheetRequest1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimesheetRequest1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimesheetRequest1
   * @throws IOException if the JSON string is invalid with respect to CreateTimesheetRequest1
   */
  public static CreateTimesheetRequest1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimesheetRequest1.class);
  }

  /**
   * Convert an instance of CreateTimesheetRequest1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

