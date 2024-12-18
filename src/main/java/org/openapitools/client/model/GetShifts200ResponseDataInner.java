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
import org.openapitools.client.model.GetShifts200ResponseDataInnerMeta;
import org.openapitools.client.model.GetShifts200ResponseDataInnerSummary;

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
 * GetShifts200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class GetShifts200ResponseDataInner {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nullable
  private GetShifts200ResponseDataInnerMeta meta;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  @javax.annotation.Nonnull
  private GetShifts200ResponseDataInnerSummary summary;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private String updatedAt;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nonnull
  private String contractId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String externalId;

  public static final String SERIALIZED_NAME_DATE_OF_WORK = "date_of_work";
  @SerializedName(SERIALIZED_NAME_DATE_OF_WORK)
  @javax.annotation.Nonnull
  private String dateOfWork;

  public GetShifts200ResponseDataInner() {
  }

  public GetShifts200ResponseDataInner meta(@javax.annotation.Nullable GetShifts200ResponseDataInnerMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public GetShifts200ResponseDataInnerMeta getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nullable GetShifts200ResponseDataInnerMeta meta) {
    this.meta = meta;
  }


  public GetShifts200ResponseDataInner summary(@javax.annotation.Nonnull GetShifts200ResponseDataInnerSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nonnull
  public GetShifts200ResponseDataInnerSummary getSummary() {
    return summary;
  }

  public void setSummary(@javax.annotation.Nonnull GetShifts200ResponseDataInnerSummary summary) {
    this.summary = summary;
  }


  public GetShifts200ResponseDataInner createdAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the shift was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }


  public GetShifts200ResponseDataInner updatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the shift was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public GetShifts200ResponseDataInner contractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Contract ID associated with the shift.
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nonnull String contractId) {
    this.contractId = contractId;
  }


  public GetShifts200ResponseDataInner description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the shift.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public GetShifts200ResponseDataInner externalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Unique identifier of the shift.
   * @return externalId
   */
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
  }


  public GetShifts200ResponseDataInner dateOfWork(@javax.annotation.Nonnull String dateOfWork) {
    this.dateOfWork = dateOfWork;
    return this;
  }

  /**
   * The date of work for the shift.
   * @return dateOfWork
   */
  @javax.annotation.Nonnull
  public String getDateOfWork() {
    return dateOfWork;
  }

  public void setDateOfWork(@javax.annotation.Nonnull String dateOfWork) {
    this.dateOfWork = dateOfWork;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShifts200ResponseDataInner getShifts200ResponseDataInner = (GetShifts200ResponseDataInner) o;
    return Objects.equals(this.meta, getShifts200ResponseDataInner.meta) &&
        Objects.equals(this.summary, getShifts200ResponseDataInner.summary) &&
        Objects.equals(this.createdAt, getShifts200ResponseDataInner.createdAt) &&
        Objects.equals(this.updatedAt, getShifts200ResponseDataInner.updatedAt) &&
        Objects.equals(this.contractId, getShifts200ResponseDataInner.contractId) &&
        Objects.equals(this.description, getShifts200ResponseDataInner.description) &&
        Objects.equals(this.externalId, getShifts200ResponseDataInner.externalId) &&
        Objects.equals(this.dateOfWork, getShifts200ResponseDataInner.dateOfWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, summary, createdAt, updatedAt, contractId, description, externalId, dateOfWork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShifts200ResponseDataInner {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    dateOfWork: ").append(toIndentedString(dateOfWork)).append("\n");
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
    openapiFields.add("meta");
    openapiFields.add("summary");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("contract_id");
    openapiFields.add("description");
    openapiFields.add("external_id");
    openapiFields.add("date_of_work");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("contract_id");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("date_of_work");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetShifts200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetShifts200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetShifts200ResponseDataInner is not found in the empty JSON string", GetShifts200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetShifts200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetShifts200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetShifts200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        GetShifts200ResponseDataInnerMeta.validateJsonElement(jsonObj.get("meta"));
      }
      // validate the required field `summary`
      GetShifts200ResponseDataInnerSummary.validateJsonElement(jsonObj.get("summary"));
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("date_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_work").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetShifts200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetShifts200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetShifts200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetShifts200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetShifts200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetShifts200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetShifts200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetShifts200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetShifts200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetShifts200ResponseDataInner
   */
  public static GetShifts200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetShifts200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetShifts200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

