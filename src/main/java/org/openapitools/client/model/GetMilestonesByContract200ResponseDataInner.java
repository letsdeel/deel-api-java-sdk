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
import org.openapitools.client.model.GetMilestonesByContract200ResponseDataInnerId;
import org.openapitools.client.model.GetMilestonesByContract200ResponseDataInnerReportedBy;
import org.openapitools.client.model.GetMilestonesByContract200ResponseDataInnerReviewedBy;

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
 * GetMilestonesByContract200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class GetMilestonesByContract200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private GetMilestonesByContract200ResponseDataInnerId id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private String amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_REPORTED_BY = "reported_by";
  @SerializedName(SERIALIZED_NAME_REPORTED_BY)
  @javax.annotation.Nonnull
  private GetMilestonesByContract200ResponseDataInnerReportedBy reportedBy;

  public static final String SERIALIZED_NAME_REVIEWED_BY = "reviewed_by";
  @SerializedName(SERIALIZED_NAME_REVIEWED_BY)
  @javax.annotation.Nullable
  private GetMilestonesByContract200ResponseDataInnerReviewedBy reviewedBy;

  public static final String SERIALIZED_NAME_APPROVAL_REQUESTED = "approval_requested";
  @SerializedName(SERIALIZED_NAME_APPROVAL_REQUESTED)
  @javax.annotation.Nonnull
  private Boolean approvalRequested;

  public GetMilestonesByContract200ResponseDataInner() {
  }

  public GetMilestonesByContract200ResponseDataInner id(@javax.annotation.Nonnull GetMilestonesByContract200ResponseDataInnerId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public GetMilestonesByContract200ResponseDataInnerId getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull GetMilestonesByContract200ResponseDataInnerId id) {
    this.id = id;
  }


  public GetMilestonesByContract200ResponseDataInner title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the milestone.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public GetMilestonesByContract200ResponseDataInner amount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount to be paid for completing this milestone.
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
  }


  public GetMilestonesByContract200ResponseDataInner status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the milestone, such as &#39;Pending Approval&#39;, &#39;Approved&#39;, or &#39;Completed&#39;.
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  public GetMilestonesByContract200ResponseDataInner createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation date of the milestone in ISO-8601 format.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetMilestonesByContract200ResponseDataInner description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * A detailed description of the milestone.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public GetMilestonesByContract200ResponseDataInner reportedBy(@javax.annotation.Nonnull GetMilestonesByContract200ResponseDataInnerReportedBy reportedBy) {
    this.reportedBy = reportedBy;
    return this;
  }

  /**
   * Get reportedBy
   * @return reportedBy
   */
  @javax.annotation.Nonnull
  public GetMilestonesByContract200ResponseDataInnerReportedBy getReportedBy() {
    return reportedBy;
  }

  public void setReportedBy(@javax.annotation.Nonnull GetMilestonesByContract200ResponseDataInnerReportedBy reportedBy) {
    this.reportedBy = reportedBy;
  }


  public GetMilestonesByContract200ResponseDataInner reviewedBy(@javax.annotation.Nullable GetMilestonesByContract200ResponseDataInnerReviewedBy reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }

  /**
   * Get reviewedBy
   * @return reviewedBy
   */
  @javax.annotation.Nullable
  public GetMilestonesByContract200ResponseDataInnerReviewedBy getReviewedBy() {
    return reviewedBy;
  }

  public void setReviewedBy(@javax.annotation.Nullable GetMilestonesByContract200ResponseDataInnerReviewedBy reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  public GetMilestonesByContract200ResponseDataInner approvalRequested(@javax.annotation.Nonnull Boolean approvalRequested) {
    this.approvalRequested = approvalRequested;
    return this;
  }

  /**
   * Indicates whether approval has been requested for the milestone.
   * @return approvalRequested
   */
  @javax.annotation.Nonnull
  public Boolean getApprovalRequested() {
    return approvalRequested;
  }

  public void setApprovalRequested(@javax.annotation.Nonnull Boolean approvalRequested) {
    this.approvalRequested = approvalRequested;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMilestonesByContract200ResponseDataInner getMilestonesByContract200ResponseDataInner = (GetMilestonesByContract200ResponseDataInner) o;
    return Objects.equals(this.id, getMilestonesByContract200ResponseDataInner.id) &&
        Objects.equals(this.title, getMilestonesByContract200ResponseDataInner.title) &&
        Objects.equals(this.amount, getMilestonesByContract200ResponseDataInner.amount) &&
        Objects.equals(this.status, getMilestonesByContract200ResponseDataInner.status) &&
        Objects.equals(this.createdAt, getMilestonesByContract200ResponseDataInner.createdAt) &&
        Objects.equals(this.description, getMilestonesByContract200ResponseDataInner.description) &&
        Objects.equals(this.reportedBy, getMilestonesByContract200ResponseDataInner.reportedBy) &&
        Objects.equals(this.reviewedBy, getMilestonesByContract200ResponseDataInner.reviewedBy) &&
        Objects.equals(this.approvalRequested, getMilestonesByContract200ResponseDataInner.approvalRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, amount, status, createdAt, description, reportedBy, reviewedBy, approvalRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMilestonesByContract200ResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportedBy: ").append(toIndentedString(reportedBy)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    approvalRequested: ").append(toIndentedString(approvalRequested)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("amount");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("reported_by");
    openapiFields.add("reviewed_by");
    openapiFields.add("approval_requested");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("reported_by");
    openapiRequiredFields.add("reviewed_by");
    openapiRequiredFields.add("approval_requested");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetMilestonesByContract200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMilestonesByContract200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMilestonesByContract200ResponseDataInner is not found in the empty JSON string", GetMilestonesByContract200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMilestonesByContract200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMilestonesByContract200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMilestonesByContract200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      GetMilestonesByContract200ResponseDataInnerId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `reported_by`
      GetMilestonesByContract200ResponseDataInnerReportedBy.validateJsonElement(jsonObj.get("reported_by"));
      // validate the required field `reviewed_by`
      GetMilestonesByContract200ResponseDataInnerReviewedBy.validateJsonElement(jsonObj.get("reviewed_by"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMilestonesByContract200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMilestonesByContract200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMilestonesByContract200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMilestonesByContract200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMilestonesByContract200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetMilestonesByContract200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMilestonesByContract200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetMilestonesByContract200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetMilestonesByContract200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetMilestonesByContract200ResponseDataInner
   */
  public static GetMilestonesByContract200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMilestonesByContract200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetMilestonesByContract200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

