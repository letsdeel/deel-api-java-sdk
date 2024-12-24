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
import org.openapitools.client.model.IdentifierValueForFilter;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:05:54.444639311Z[GMT]", comments = "Generator version: 7.10.0")
public class BgCheckForContractToCreate {
  public static final String SERIALIZED_NAME_CONTRACT_IDS = "contract_ids";
  @SerializedName(SERIALIZED_NAME_CONTRACT_IDS)
  @javax.annotation.Nonnull
  private List<String> contractIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_INDIVIDUAL_CHECK_IDS = "individual_check_ids";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_CHECK_IDS)
  @javax.annotation.Nullable
  private List<IdentifierValueForFilter> individualCheckIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  @javax.annotation.Nullable
  private IdentifierValueForFilter packageId;

  public BgCheckForContractToCreate() {
  }

  public BgCheckForContractToCreate contractIds(@javax.annotation.Nonnull List<String> contractIds) {
    this.contractIds = contractIds;
    return this;
  }

  public BgCheckForContractToCreate addContractIdsItem(String contractIdsItem) {
    if (this.contractIds == null) {
      this.contractIds = new ArrayList<>();
    }
    this.contractIds.add(contractIdsItem);
    return this;
  }

  /**
   * Please note that this field supports a single contract ID as of now. Support for multiple contract IDs will be added in near future. Please refer to changelog for updates.
   * @return contractIds
   */
  @javax.annotation.Nonnull
  public List<String> getContractIds() {
    return contractIds;
  }

  public void setContractIds(@javax.annotation.Nonnull List<String> contractIds) {
    this.contractIds = contractIds;
  }


  public BgCheckForContractToCreate individualCheckIds(@javax.annotation.Nullable List<IdentifierValueForFilter> individualCheckIds) {
    this.individualCheckIds = individualCheckIds;
    return this;
  }

  public BgCheckForContractToCreate addIndividualCheckIdsItem(IdentifierValueForFilter individualCheckIdsItem) {
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
  public List<IdentifierValueForFilter> getIndividualCheckIds() {
    return individualCheckIds;
  }

  public void setIndividualCheckIds(@javax.annotation.Nullable List<IdentifierValueForFilter> individualCheckIds) {
    this.individualCheckIds = individualCheckIds;
  }


  public BgCheckForContractToCreate packageId(@javax.annotation.Nullable IdentifierValueForFilter packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * Get packageId
   * @return packageId
   */
  @javax.annotation.Nullable
  public IdentifierValueForFilter getPackageId() {
    return packageId;
  }

  public void setPackageId(@javax.annotation.Nullable IdentifierValueForFilter packageId) {
    this.packageId = packageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgCheckForContractToCreate bgCheckForContractToCreate = (BgCheckForContractToCreate) o;
    return Objects.equals(this.contractIds, bgCheckForContractToCreate.contractIds) &&
        Objects.equals(this.individualCheckIds, bgCheckForContractToCreate.individualCheckIds) &&
        Objects.equals(this.packageId, bgCheckForContractToCreate.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractIds, individualCheckIds, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgCheckForContractToCreate {\n");
    sb.append("    contractIds: ").append(toIndentedString(contractIds)).append("\n");
    sb.append("    individualCheckIds: ").append(toIndentedString(individualCheckIds)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
    openapiFields.add("contract_ids");
    openapiFields.add("individual_check_ids");
    openapiFields.add("package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_ids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BgCheckForContractToCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BgCheckForContractToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgCheckForContractToCreate is not found in the empty JSON string", BgCheckForContractToCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BgCheckForContractToCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BgCheckForContractToCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BgCheckForContractToCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("contract_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("contract_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_ids` to be an array in the JSON string but got `%s`", jsonObj.get("contract_ids").toString()));
      }
      if (jsonObj.get("individual_check_ids") != null && !jsonObj.get("individual_check_ids").isJsonNull()) {
        JsonArray jsonArrayindividualCheckIds = jsonObj.getAsJsonArray("individual_check_ids");
        if (jsonArrayindividualCheckIds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("individual_check_ids").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `individual_check_ids` to be an array in the JSON string but got `%s`", jsonObj.get("individual_check_ids").toString()));
          }

          // validate the optional field `individual_check_ids` (array)
          for (int i = 0; i < jsonArrayindividualCheckIds.size(); i++) {
            IdentifierValueForFilter.validateJsonElement(jsonArrayindividualCheckIds.get(i));
          };
        }
      }
      // validate the optional field `package_id`
      if (jsonObj.get("package_id") != null && !jsonObj.get("package_id").isJsonNull()) {
        IdentifierValueForFilter.validateJsonElement(jsonObj.get("package_id"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgCheckForContractToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgCheckForContractToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgCheckForContractToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgCheckForContractToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<BgCheckForContractToCreate>() {
           @Override
           public void write(JsonWriter out, BgCheckForContractToCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BgCheckForContractToCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BgCheckForContractToCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BgCheckForContractToCreate
   * @throws IOException if the JSON string is invalid with respect to BgCheckForContractToCreate
   */
  public static BgCheckForContractToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgCheckForContractToCreate.class);
  }

  /**
   * Convert an instance of BgCheckForContractToCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

