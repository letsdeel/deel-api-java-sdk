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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The background check information for a contract. Either &#x60;individual_check_ids&#x60; or &#x60;package_id&#x60; must be provided, but not both.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class CreateBackgroundCheckForContractsRequest {
  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private UUID packageId;

  public static final String SERIALIZED_NAME_CONTRACT_IDS = "contract_ids";
  @SerializedName(SERIALIZED_NAME_CONTRACT_IDS)
  private List<String> contractIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_INDIVIDUAL_CHECK_IDS = "individual_check_ids";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_CHECK_IDS)
  private List<UUID> individualCheckIds;

  public CreateBackgroundCheckForContractsRequest() {
  }

  public CreateBackgroundCheckForContractsRequest packageId(UUID packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * Unique identifier of the package used for the background check.
   * @return packageId
   */
  @javax.annotation.Nullable
  public UUID getPackageId() {
    return packageId;
  }

  public void setPackageId(UUID packageId) {
    this.packageId = packageId;
  }


  public CreateBackgroundCheckForContractsRequest contractIds(List<String> contractIds) {
    this.contractIds = contractIds;
    return this;
  }

  public CreateBackgroundCheckForContractsRequest addContractIdsItem(String contractIdsItem) {
    if (this.contractIds == null) {
      this.contractIds = new ArrayList<>();
    }
    this.contractIds.add(contractIdsItem);
    return this;
  }

  /**
   * List of contract ids.
   * @return contractIds
   */
  @javax.annotation.Nonnull
  public List<String> getContractIds() {
    return contractIds;
  }

  public void setContractIds(List<String> contractIds) {
    this.contractIds = contractIds;
  }


  public CreateBackgroundCheckForContractsRequest individualCheckIds(List<UUID> individualCheckIds) {
    this.individualCheckIds = individualCheckIds;
    return this;
  }

  public CreateBackgroundCheckForContractsRequest addIndividualCheckIdsItem(UUID individualCheckIdsItem) {
    if (this.individualCheckIds == null) {
      this.individualCheckIds = new ArrayList<>();
    }
    this.individualCheckIds.add(individualCheckIdsItem);
    return this;
  }

  /**
   * A list of individual check IDs.
   * @return individualCheckIds
   */
  @javax.annotation.Nullable
  public List<UUID> getIndividualCheckIds() {
    return individualCheckIds;
  }

  public void setIndividualCheckIds(List<UUID> individualCheckIds) {
    this.individualCheckIds = individualCheckIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBackgroundCheckForContractsRequest createBackgroundCheckForContractsRequest = (CreateBackgroundCheckForContractsRequest) o;
    return Objects.equals(this.packageId, createBackgroundCheckForContractsRequest.packageId) &&
        Objects.equals(this.contractIds, createBackgroundCheckForContractsRequest.contractIds) &&
        Objects.equals(this.individualCheckIds, createBackgroundCheckForContractsRequest.individualCheckIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageId, contractIds, individualCheckIds);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBackgroundCheckForContractsRequest {\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    contractIds: ").append(toIndentedString(contractIds)).append("\n");
    sb.append("    individualCheckIds: ").append(toIndentedString(individualCheckIds)).append("\n");
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
    openapiFields.add("package_id");
    openapiFields.add("contract_ids");
    openapiFields.add("individual_check_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_ids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateBackgroundCheckForContractsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBackgroundCheckForContractsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBackgroundCheckForContractsRequest is not found in the empty JSON string", CreateBackgroundCheckForContractsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBackgroundCheckForContractsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBackgroundCheckForContractsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBackgroundCheckForContractsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("package_id") != null && !jsonObj.get("package_id").isJsonNull()) && !jsonObj.get("package_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("contract_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("contract_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_ids` to be an array in the JSON string but got `%s`", jsonObj.get("contract_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("individual_check_ids") != null && !jsonObj.get("individual_check_ids").isJsonNull() && !jsonObj.get("individual_check_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `individual_check_ids` to be an array in the JSON string but got `%s`", jsonObj.get("individual_check_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBackgroundCheckForContractsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBackgroundCheckForContractsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBackgroundCheckForContractsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBackgroundCheckForContractsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBackgroundCheckForContractsRequest>() {
           @Override
           public void write(JsonWriter out, CreateBackgroundCheckForContractsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBackgroundCheckForContractsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateBackgroundCheckForContractsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateBackgroundCheckForContractsRequest
   * @throws IOException if the JSON string is invalid with respect to CreateBackgroundCheckForContractsRequest
   */
  public static CreateBackgroundCheckForContractsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBackgroundCheckForContractsRequest.class);
  }

  /**
   * Convert an instance of CreateBackgroundCheckForContractsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
