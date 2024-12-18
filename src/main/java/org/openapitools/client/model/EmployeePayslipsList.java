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
 * EmployeePayslipsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeePayslipsList {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  @javax.annotation.Nonnull
  private OffsetDateTime from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  @javax.annotation.Nonnull
  private OffsetDateTime to;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  @javax.annotation.Nonnull
  private String filename;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_REJECTED_AT = "rejected_at";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime rejectedAt;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  @javax.annotation.Nonnull
  private String rejectReason;

  public static final String SERIALIZED_NAME_UPLOADED_AT = "uploaded_at";
  @SerializedName(SERIALIZED_NAME_UPLOADED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime uploadedAt;

  public static final String SERIALIZED_NAME_PUBLISHED_AT = "published_at";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime publishedAt;

  public static final String SERIALIZED_NAME_SCHEDULE_PUBLISHING_DATE = "schedule_publishing_date";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_PUBLISHING_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime schedulePublishingDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public EmployeePayslipsList() {
  }

  public EmployeePayslipsList id(@javax.annotation.Nonnull String id) {
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


  public EmployeePayslipsList from(@javax.annotation.Nonnull OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(@javax.annotation.Nonnull OffsetDateTime from) {
    this.from = from;
  }


  public EmployeePayslipsList to(@javax.annotation.Nonnull OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(@javax.annotation.Nonnull OffsetDateTime to) {
    this.to = to;
  }


  public EmployeePayslipsList filename(@javax.annotation.Nonnull String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
   */
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }

  public void setFilename(@javax.annotation.Nonnull String filename) {
    this.filename = filename;
  }


  public EmployeePayslipsList status(@javax.annotation.Nonnull String status) {
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


  public EmployeePayslipsList rejectedAt(@javax.annotation.Nonnull OffsetDateTime rejectedAt) {
    this.rejectedAt = rejectedAt;
    return this;
  }

  /**
   * Get rejectedAt
   * @return rejectedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getRejectedAt() {
    return rejectedAt;
  }

  public void setRejectedAt(@javax.annotation.Nonnull OffsetDateTime rejectedAt) {
    this.rejectedAt = rejectedAt;
  }


  public EmployeePayslipsList rejectReason(@javax.annotation.Nonnull String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * Get rejectReason
   * @return rejectReason
   */
  @javax.annotation.Nonnull
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(@javax.annotation.Nonnull String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public EmployeePayslipsList uploadedAt(@javax.annotation.Nonnull OffsetDateTime uploadedAt) {
    this.uploadedAt = uploadedAt;
    return this;
  }

  /**
   * Get uploadedAt
   * @return uploadedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUploadedAt() {
    return uploadedAt;
  }

  public void setUploadedAt(@javax.annotation.Nonnull OffsetDateTime uploadedAt) {
    this.uploadedAt = uploadedAt;
  }


  public EmployeePayslipsList publishedAt(@javax.annotation.Nonnull OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Get publishedAt
   * @return publishedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(@javax.annotation.Nonnull OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }


  public EmployeePayslipsList schedulePublishingDate(@javax.annotation.Nonnull OffsetDateTime schedulePublishingDate) {
    this.schedulePublishingDate = schedulePublishingDate;
    return this;
  }

  /**
   * Get schedulePublishingDate
   * @return schedulePublishingDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getSchedulePublishingDate() {
    return schedulePublishingDate;
  }

  public void setSchedulePublishingDate(@javax.annotation.Nonnull OffsetDateTime schedulePublishingDate) {
    this.schedulePublishingDate = schedulePublishingDate;
  }


  public EmployeePayslipsList createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EmployeePayslipsList updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public EmployeePayslipsList url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePayslipsList employeePayslipsList = (EmployeePayslipsList) o;
    return Objects.equals(this.id, employeePayslipsList.id) &&
        Objects.equals(this.from, employeePayslipsList.from) &&
        Objects.equals(this.to, employeePayslipsList.to) &&
        Objects.equals(this.filename, employeePayslipsList.filename) &&
        Objects.equals(this.status, employeePayslipsList.status) &&
        Objects.equals(this.rejectedAt, employeePayslipsList.rejectedAt) &&
        Objects.equals(this.rejectReason, employeePayslipsList.rejectReason) &&
        Objects.equals(this.uploadedAt, employeePayslipsList.uploadedAt) &&
        Objects.equals(this.publishedAt, employeePayslipsList.publishedAt) &&
        Objects.equals(this.schedulePublishingDate, employeePayslipsList.schedulePublishingDate) &&
        Objects.equals(this.createdAt, employeePayslipsList.createdAt) &&
        Objects.equals(this.updatedAt, employeePayslipsList.updatedAt) &&
        Objects.equals(this.url, employeePayslipsList.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, filename, status, rejectedAt, rejectReason, uploadedAt, publishedAt, schedulePublishingDate, createdAt, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePayslipsList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rejectedAt: ").append(toIndentedString(rejectedAt)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    schedulePublishingDate: ").append(toIndentedString(schedulePublishingDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("filename");
    openapiFields.add("status");
    openapiFields.add("rejected_at");
    openapiFields.add("reject_reason");
    openapiFields.add("uploaded_at");
    openapiFields.add("published_at");
    openapiFields.add("schedule_publishing_date");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("rejected_at");
    openapiRequiredFields.add("reject_reason");
    openapiRequiredFields.add("uploaded_at");
    openapiRequiredFields.add("published_at");
    openapiRequiredFields.add("schedule_publishing_date");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeePayslipsList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeePayslipsList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeePayslipsList is not found in the empty JSON string", EmployeePayslipsList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeePayslipsList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeePayslipsList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeePayslipsList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeePayslipsList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeePayslipsList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeePayslipsList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeePayslipsList.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeePayslipsList>() {
           @Override
           public void write(JsonWriter out, EmployeePayslipsList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeePayslipsList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeePayslipsList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeePayslipsList
   * @throws IOException if the JSON string is invalid with respect to EmployeePayslipsList
   */
  public static EmployeePayslipsList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeePayslipsList.class);
  }

  /**
   * Convert an instance of EmployeePayslipsList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

