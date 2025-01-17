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
 * Milestone creator.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetMilestonesByContractAndId200ResponseDataReportedBy {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private CreateEorContractRequestClientTeamId id;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nonnull
  private String fullName;

  public GetMilestonesByContractAndId200ResponseDataReportedBy() {
  }

  public GetMilestonesByContractAndId200ResponseDataReportedBy id(@javax.annotation.Nonnull CreateEorContractRequestClientTeamId id) {
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


  public GetMilestonesByContractAndId200ResponseDataReportedBy fullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Reporter&#39;s full name.
   * @return fullName
   */
  @javax.annotation.Nonnull
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMilestonesByContractAndId200ResponseDataReportedBy getMilestonesByContractAndId200ResponseDataReportedBy = (GetMilestonesByContractAndId200ResponseDataReportedBy) o;
    return Objects.equals(this.id, getMilestonesByContractAndId200ResponseDataReportedBy.id) &&
        Objects.equals(this.fullName, getMilestonesByContractAndId200ResponseDataReportedBy.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMilestonesByContractAndId200ResponseDataReportedBy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
    openapiFields.add("full_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("full_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetMilestonesByContractAndId200ResponseDataReportedBy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMilestonesByContractAndId200ResponseDataReportedBy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMilestonesByContractAndId200ResponseDataReportedBy is not found in the empty JSON string", GetMilestonesByContractAndId200ResponseDataReportedBy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMilestonesByContractAndId200ResponseDataReportedBy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMilestonesByContractAndId200ResponseDataReportedBy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMilestonesByContractAndId200ResponseDataReportedBy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      CreateEorContractRequestClientTeamId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMilestonesByContractAndId200ResponseDataReportedBy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMilestonesByContractAndId200ResponseDataReportedBy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMilestonesByContractAndId200ResponseDataReportedBy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMilestonesByContractAndId200ResponseDataReportedBy.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMilestonesByContractAndId200ResponseDataReportedBy>() {
           @Override
           public void write(JsonWriter out, GetMilestonesByContractAndId200ResponseDataReportedBy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMilestonesByContractAndId200ResponseDataReportedBy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetMilestonesByContractAndId200ResponseDataReportedBy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetMilestonesByContractAndId200ResponseDataReportedBy
   * @throws IOException if the JSON string is invalid with respect to GetMilestonesByContractAndId200ResponseDataReportedBy
   */
  public static GetMilestonesByContractAndId200ResponseDataReportedBy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMilestonesByContractAndId200ResponseDataReportedBy.class);
  }

  /**
   * Convert an instance of GetMilestonesByContractAndId200ResponseDataReportedBy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

