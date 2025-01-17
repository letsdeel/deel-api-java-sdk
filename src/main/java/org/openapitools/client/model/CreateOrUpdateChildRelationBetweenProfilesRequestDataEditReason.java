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
import java.util.UUID;

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
 * CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason {
  public static final String SERIALIZED_NAME_REASON_OID = "reason_oid";
  @SerializedName(SERIALIZED_NAME_REASON_OID)
  @javax.annotation.Nonnull
  private UUID reasonOid;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  @javax.annotation.Nullable
  private String additionalInfo;

  public CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason() {
  }

  public CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason reasonOid(@javax.annotation.Nonnull UUID reasonOid) {
    this.reasonOid = reasonOid;
    return this;
  }

  /**
   * ID of the reason for the edit
   * @return reasonOid
   */
  @javax.annotation.Nonnull
  public UUID getReasonOid() {
    return reasonOid;
  }

  public void setReasonOid(@javax.annotation.Nonnull UUID reasonOid) {
    this.reasonOid = reasonOid;
  }


  public CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason additionalInfo(@javax.annotation.Nullable String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional information about the edit
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(@javax.annotation.Nullable String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason createOrUpdateChildRelationBetweenProfilesRequestDataEditReason = (CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason) o;
    return Objects.equals(this.reasonOid, createOrUpdateChildRelationBetweenProfilesRequestDataEditReason.reasonOid) &&
        Objects.equals(this.additionalInfo, createOrUpdateChildRelationBetweenProfilesRequestDataEditReason.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonOid, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason {\n");
    sb.append("    reasonOid: ").append(toIndentedString(reasonOid)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
    openapiFields.add("reason_oid");
    openapiFields.add("additional_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reason_oid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason is not found in the empty JSON string", CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("reason_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason_oid").toString()));
      }
      if ((jsonObj.get("additional_info") != null && !jsonObj.get("additional_info").isJsonNull()) && !jsonObj.get("additional_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_info").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason>() {
           @Override
           public void write(JsonWriter out, CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason
   * @throws IOException if the JSON string is invalid with respect to CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason
   */
  public static CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason.class);
  }

  /**
   * Convert an instance of CreateOrUpdateChildRelationBetweenProfilesRequestDataEditReason to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

