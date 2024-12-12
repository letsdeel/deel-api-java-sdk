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
import java.time.OffsetDateTime;
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
 * GPPayrollEventReportsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class GPPayrollEventReportsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_LOCK_DATE = "lock_date";
  @SerializedName(SERIALIZED_NAME_LOCK_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime lockDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime endDate;

  public GPPayrollEventReportsInner() {
  }

  public GPPayrollEventReportsInner id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public GPPayrollEventReportsInner status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  public GPPayrollEventReportsInner startDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return startDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public GPPayrollEventReportsInner lockDate(@javax.annotation.Nonnull OffsetDateTime lockDate) {
    this.lockDate = lockDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return lockDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getLockDate() {
    return lockDate;
  }

  public void setLockDate(@javax.annotation.Nonnull OffsetDateTime lockDate) {
    this.lockDate = lockDate;
  }


  public GPPayrollEventReportsInner endDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return endDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPPayrollEventReportsInner gpPayrollEventReportsInner = (GPPayrollEventReportsInner) o;
    return Objects.equals(this.id, gpPayrollEventReportsInner.id) &&
        Objects.equals(this.status, gpPayrollEventReportsInner.status) &&
        Objects.equals(this.startDate, gpPayrollEventReportsInner.startDate) &&
        Objects.equals(this.lockDate, gpPayrollEventReportsInner.lockDate) &&
        Objects.equals(this.endDate, gpPayrollEventReportsInner.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, startDate, lockDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPPayrollEventReportsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lockDate: ").append(toIndentedString(lockDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("start_date");
    openapiFields.add("lock_date");
    openapiFields.add("end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("lock_date");
    openapiRequiredFields.add("end_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPPayrollEventReportsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPPayrollEventReportsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPPayrollEventReportsInner is not found in the empty JSON string", GPPayrollEventReportsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPPayrollEventReportsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPPayrollEventReportsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPPayrollEventReportsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPPayrollEventReportsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPPayrollEventReportsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPPayrollEventReportsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPPayrollEventReportsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GPPayrollEventReportsInner>() {
           @Override
           public void write(JsonWriter out, GPPayrollEventReportsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPPayrollEventReportsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPPayrollEventReportsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPPayrollEventReportsInner
   * @throws IOException if the JSON string is invalid with respect to GPPayrollEventReportsInner
   */
  public static GPPayrollEventReportsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPPayrollEventReportsInner.class);
  }

  /**
   * Convert an instance of GPPayrollEventReportsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

