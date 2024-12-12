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
import org.openapitools.client.model.CreateEorContractRequestClientTeamId;

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
 * GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private CreateEorContractRequestClientTeamId id;

  public static final String SERIALIZED_NAME_REMARKS = "remarks";
  @SerializedName(SERIALIZED_NAME_REMARKS)
  @javax.annotation.Nonnull
  private String remarks;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nonnull
  private String fullName;

  public static final String SERIALIZED_NAME_REVIEWED_AT = "reviewed_at";
  @SerializedName(SERIALIZED_NAME_REVIEWED_AT)
  @javax.annotation.Nonnull
  private String reviewedAt;

  public GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy() {
  }

  public GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy id(@javax.annotation.Nonnull CreateEorContractRequestClientTeamId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestClientTeamId getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull CreateEorContractRequestClientTeamId id) {
    this.id = id;
  }


  public GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy remarks(@javax.annotation.Nonnull String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
   */
  @javax.annotation.Nonnull
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(@javax.annotation.Nonnull String remarks) {
    this.remarks = remarks;
  }


  public GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy fullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  @javax.annotation.Nonnull
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
  }


  public GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy reviewedAt(@javax.annotation.Nonnull String reviewedAt) {
    this.reviewedAt = reviewedAt;
    return this;
  }

  /**
   * Get reviewedAt
   * @return reviewedAt
   */
  @javax.annotation.Nonnull
  public String getReviewedAt() {
    return reviewedAt;
  }

  public void setReviewedAt(@javax.annotation.Nonnull String reviewedAt) {
    this.reviewedAt = reviewedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy getInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy = (GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy) o;
    return Objects.equals(this.id, getInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.id) &&
        Objects.equals(this.remarks, getInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.remarks) &&
        Objects.equals(this.fullName, getInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.fullName) &&
        Objects.equals(this.reviewedAt, getInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.reviewedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remarks, fullName, reviewedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
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
    openapiFields.add("remarks");
    openapiFields.add("full_name");
    openapiFields.add("reviewed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("remarks");
    openapiRequiredFields.add("full_name");
    openapiRequiredFields.add("reviewed_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy is not found in the empty JSON string", GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      CreateEorContractRequestClientTeamId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      if (!jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if (!jsonObj.get("reviewed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewed_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy>() {
           @Override
           public void write(JsonWriter out, GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy
   * @throws IOException if the JSON string is invalid with respect to GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy
   */
  public static GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.class);
  }

  /**
   * Convert an instance of GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

