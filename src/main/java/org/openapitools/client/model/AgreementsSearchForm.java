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
 * Convenient model to encapsulate query parameters to get a list of agreements.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class AgreementsSearchForm {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nullable
  private String limit = "50";

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  @javax.annotation.Nullable
  private String offset = "0";

  public AgreementsSearchForm() {
  }

  public AgreementsSearchForm contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public AgreementsSearchForm limit(@javax.annotation.Nullable String limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of records to return. This is supposed to be an integer but query parameters are string. Maximum is 50.
   * @return limit
   */
  @javax.annotation.Nullable
  public String getLimit() {
    return limit;
  }

  public void setLimit(@javax.annotation.Nullable String limit) {
    this.limit = limit;
  }


  public AgreementsSearchForm offset(@javax.annotation.Nullable String offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Offset/index of record for the next page of records to return. This is supposed to be an integer but query parameters are string.
   * @return offset
   */
  @javax.annotation.Nullable
  public String getOffset() {
    return offset;
  }

  public void setOffset(@javax.annotation.Nullable String offset) {
    this.offset = offset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementsSearchForm agreementsSearchForm = (AgreementsSearchForm) o;
    return Objects.equals(this.contractId, agreementsSearchForm.contractId) &&
        Objects.equals(this.limit, agreementsSearchForm.limit) &&
        Objects.equals(this.offset, agreementsSearchForm.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, limit, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementsSearchForm {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    openapiFields.add("contract_id");
    openapiFields.add("limit");
    openapiFields.add("offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AgreementsSearchForm
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgreementsSearchForm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgreementsSearchForm is not found in the empty JSON string", AgreementsSearchForm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgreementsSearchForm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgreementsSearchForm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) && !jsonObj.get("limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit").toString()));
      }
      if ((jsonObj.get("offset") != null && !jsonObj.get("offset").isJsonNull()) && !jsonObj.get("offset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgreementsSearchForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgreementsSearchForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgreementsSearchForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgreementsSearchForm.class));

       return (TypeAdapter<T>) new TypeAdapter<AgreementsSearchForm>() {
           @Override
           public void write(JsonWriter out, AgreementsSearchForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgreementsSearchForm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AgreementsSearchForm given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AgreementsSearchForm
   * @throws IOException if the JSON string is invalid with respect to AgreementsSearchForm
   */
  public static AgreementsSearchForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgreementsSearchForm.class);
  }

  /**
   * Convert an instance of AgreementsSearchForm to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

