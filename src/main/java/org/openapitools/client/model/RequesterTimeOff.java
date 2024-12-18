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
 * RequesterTimeOff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class RequesterTimeOff {
  public static final String SERIALIZED_NAME_IS_PART_TIME = "is_part_time";
  @SerializedName(SERIALIZED_NAME_IS_PART_TIME)
  @javax.annotation.Nullable
  private Boolean isPartTime;

  public static final String SERIALIZED_NAME_HAS_REACHED_END_DATE = "has_reached_end_date";
  @SerializedName(SERIALIZED_NAME_HAS_REACHED_END_DATE)
  @javax.annotation.Nullable
  private Boolean hasReachedEndDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private String uuid;

  public static final String SERIALIZED_NAME_HRIS_PROFILE_ID = "hris_profile_id";
  @SerializedName(SERIALIZED_NAME_HRIS_PROFILE_ID)
  @javax.annotation.Nullable
  private String hrisProfileId;

  public static final String SERIALIZED_NAME_CLIENT_PROFILE_ID = "client_profile_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_PROFILE_ID)
  @javax.annotation.Nullable
  private String clientProfileId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @javax.annotation.Nullable
  private BigDecimal organizationId;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_WORKER_TYPE = "worker_type";
  @SerializedName(SERIALIZED_NAME_WORKER_TYPE)
  @javax.annotation.Nullable
  private String workerType;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private String endDate;

  public static final String SERIALIZED_NAME_PART_TIME_PERCENTAGE = "part_time_percentage";
  @SerializedName(SERIALIZED_NAME_PART_TIME_PERCENTAGE)
  @javax.annotation.Nullable
  private String partTimePercentage;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private String updatedAt;

  public RequesterTimeOff() {
  }

  public RequesterTimeOff isPartTime(@javax.annotation.Nullable Boolean isPartTime) {
    this.isPartTime = isPartTime;
    return this;
  }

  /**
   * Get isPartTime
   * @return isPartTime
   */
  @javax.annotation.Nullable
  public Boolean getIsPartTime() {
    return isPartTime;
  }

  public void setIsPartTime(@javax.annotation.Nullable Boolean isPartTime) {
    this.isPartTime = isPartTime;
  }


  public RequesterTimeOff hasReachedEndDate(@javax.annotation.Nullable Boolean hasReachedEndDate) {
    this.hasReachedEndDate = hasReachedEndDate;
    return this;
  }

  /**
   * Get hasReachedEndDate
   * @return hasReachedEndDate
   */
  @javax.annotation.Nullable
  public Boolean getHasReachedEndDate() {
    return hasReachedEndDate;
  }

  public void setHasReachedEndDate(@javax.annotation.Nullable Boolean hasReachedEndDate) {
    this.hasReachedEndDate = hasReachedEndDate;
  }


  public RequesterTimeOff id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public RequesterTimeOff uuid(@javax.annotation.Nullable String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   */
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable String uuid) {
    this.uuid = uuid;
  }


  public RequesterTimeOff hrisProfileId(@javax.annotation.Nullable String hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
    return this;
  }

  /**
   * Get hrisProfileId
   * @return hrisProfileId
   */
  @javax.annotation.Nullable
  public String getHrisProfileId() {
    return hrisProfileId;
  }

  public void setHrisProfileId(@javax.annotation.Nullable String hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
  }


  public RequesterTimeOff clientProfileId(@javax.annotation.Nullable String clientProfileId) {
    this.clientProfileId = clientProfileId;
    return this;
  }

  /**
   * Get clientProfileId
   * @return clientProfileId
   */
  @javax.annotation.Nullable
  public String getClientProfileId() {
    return clientProfileId;
  }

  public void setClientProfileId(@javax.annotation.Nullable String clientProfileId) {
    this.clientProfileId = clientProfileId;
  }


  public RequesterTimeOff organizationId(@javax.annotation.Nullable BigDecimal organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   * @return organizationId
   */
  @javax.annotation.Nullable
  public BigDecimal getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(@javax.annotation.Nullable BigDecimal organizationId) {
    this.organizationId = organizationId;
  }


  public RequesterTimeOff country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public RequesterTimeOff workerType(@javax.annotation.Nullable String workerType) {
    this.workerType = workerType;
    return this;
  }

  /**
   * Get workerType
   * @return workerType
   */
  @javax.annotation.Nullable
  public String getWorkerType() {
    return workerType;
  }

  public void setWorkerType(@javax.annotation.Nullable String workerType) {
    this.workerType = workerType;
  }


  public RequesterTimeOff endDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
  }


  public RequesterTimeOff partTimePercentage(@javax.annotation.Nullable String partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
    return this;
  }

  /**
   * Get partTimePercentage
   * @return partTimePercentage
   */
  @javax.annotation.Nullable
  public String getPartTimePercentage() {
    return partTimePercentage;
  }

  public void setPartTimePercentage(@javax.annotation.Nullable String partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
  }


  public RequesterTimeOff createdAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
  }


  public RequesterTimeOff updatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequesterTimeOff requesterTimeOff = (RequesterTimeOff) o;
    return Objects.equals(this.isPartTime, requesterTimeOff.isPartTime) &&
        Objects.equals(this.hasReachedEndDate, requesterTimeOff.hasReachedEndDate) &&
        Objects.equals(this.id, requesterTimeOff.id) &&
        Objects.equals(this.uuid, requesterTimeOff.uuid) &&
        Objects.equals(this.hrisProfileId, requesterTimeOff.hrisProfileId) &&
        Objects.equals(this.clientProfileId, requesterTimeOff.clientProfileId) &&
        Objects.equals(this.organizationId, requesterTimeOff.organizationId) &&
        Objects.equals(this.country, requesterTimeOff.country) &&
        Objects.equals(this.workerType, requesterTimeOff.workerType) &&
        Objects.equals(this.endDate, requesterTimeOff.endDate) &&
        Objects.equals(this.partTimePercentage, requesterTimeOff.partTimePercentage) &&
        Objects.equals(this.createdAt, requesterTimeOff.createdAt) &&
        Objects.equals(this.updatedAt, requesterTimeOff.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPartTime, hasReachedEndDate, id, uuid, hrisProfileId, clientProfileId, organizationId, country, workerType, endDate, partTimePercentage, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequesterTimeOff {\n");
    sb.append("    isPartTime: ").append(toIndentedString(isPartTime)).append("\n");
    sb.append("    hasReachedEndDate: ").append(toIndentedString(hasReachedEndDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    hrisProfileId: ").append(toIndentedString(hrisProfileId)).append("\n");
    sb.append("    clientProfileId: ").append(toIndentedString(clientProfileId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    workerType: ").append(toIndentedString(workerType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    partTimePercentage: ").append(toIndentedString(partTimePercentage)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("is_part_time");
    openapiFields.add("has_reached_end_date");
    openapiFields.add("id");
    openapiFields.add("uuid");
    openapiFields.add("hris_profile_id");
    openapiFields.add("client_profile_id");
    openapiFields.add("organization_id");
    openapiFields.add("country");
    openapiFields.add("worker_type");
    openapiFields.add("end_date");
    openapiFields.add("part_time_percentage");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequesterTimeOff
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequesterTimeOff.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequesterTimeOff is not found in the empty JSON string", RequesterTimeOff.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequesterTimeOff.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequesterTimeOff` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("hris_profile_id") != null && !jsonObj.get("hris_profile_id").isJsonNull()) && !jsonObj.get("hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_profile_id").toString()));
      }
      if ((jsonObj.get("client_profile_id") != null && !jsonObj.get("client_profile_id").isJsonNull()) && !jsonObj.get("client_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_profile_id").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("worker_type") != null && !jsonObj.get("worker_type").isJsonNull()) && !jsonObj.get("worker_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_type").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("part_time_percentage") != null && !jsonObj.get("part_time_percentage").isJsonNull()) && !jsonObj.get("part_time_percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part_time_percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part_time_percentage").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequesterTimeOff.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequesterTimeOff' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequesterTimeOff> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequesterTimeOff.class));

       return (TypeAdapter<T>) new TypeAdapter<RequesterTimeOff>() {
           @Override
           public void write(JsonWriter out, RequesterTimeOff value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequesterTimeOff read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequesterTimeOff given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequesterTimeOff
   * @throws IOException if the JSON string is invalid with respect to RequesterTimeOff
   */
  public static RequesterTimeOff fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequesterTimeOff.class);
  }

  /**
   * Convert an instance of RequesterTimeOff to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

