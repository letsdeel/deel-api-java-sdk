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
 * CreateCaseRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateCaseRequestData {
  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  @javax.annotation.Nullable
  private UUID teamId;

  /**
   * The type of immigration case to be created. Determines the workflow and requirements
   */
  @JsonAdapter(CaseTypeEnum.Adapter.class)
  public enum CaseTypeEnum {
    RIGHT_TO_WORK("RIGHT_TO_WORK"),
    
    EOR_VISA("EOR_VISA"),
    
    SPONSORED_VISA("SPONSORED_VISA"),
    
    PRE_HIRE_EOR_VISA("PRE_HIRE_EOR_VISA"),
    
    PRE_HIRE_SPONSORSHIP_VISA("PRE_HIRE_SPONSORSHIP_VISA");

    private String value;

    CaseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CaseTypeEnum fromValue(String value) {
      for (CaseTypeEnum b : CaseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CaseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CaseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CaseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CaseTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CaseTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CASE_TYPE = "case_type";
  @SerializedName(SERIALIZED_NAME_CASE_TYPE)
  @javax.annotation.Nonnull
  private CaseTypeEnum caseType;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  @javax.annotation.Nullable
  private UUID entityId;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nonnull
  private String countryCode;

  public CreateCaseRequestData() {
  }

  public CreateCaseRequestData teamId(@javax.annotation.Nullable UUID teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The team ID. Required for EOR visa applications. Identifies the team handling the case
   * @return teamId
   */
  @javax.annotation.Nullable
  public UUID getTeamId() {
    return teamId;
  }

  public void setTeamId(@javax.annotation.Nullable UUID teamId) {
    this.teamId = teamId;
  }


  public CreateCaseRequestData caseType(@javax.annotation.Nonnull CaseTypeEnum caseType) {
    this.caseType = caseType;
    return this;
  }

  /**
   * The type of immigration case to be created. Determines the workflow and requirements
   * @return caseType
   */
  @javax.annotation.Nonnull
  public CaseTypeEnum getCaseType() {
    return caseType;
  }

  public void setCaseType(@javax.annotation.Nonnull CaseTypeEnum caseType) {
    this.caseType = caseType;
  }


  public CreateCaseRequestData entityId(@javax.annotation.Nullable UUID entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The unique identifier of the entity sponsoring the visa. Required for sponsored visa applications
   * @return entityId
   */
  @javax.annotation.Nullable
  public UUID getEntityId() {
    return entityId;
  }

  public void setEntityId(@javax.annotation.Nullable UUID entityId) {
    this.entityId = entityId;
  }


  public CreateCaseRequestData contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * The contract object identifier. Required for document reviews and visa applications
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public CreateCaseRequestData countryCode(@javax.annotation.Nonnull String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 country code where the immigration case needs to be processed
   * @return countryCode
   */
  @javax.annotation.Nonnull
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nonnull String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCaseRequestData createCaseRequestData = (CreateCaseRequestData) o;
    return Objects.equals(this.teamId, createCaseRequestData.teamId) &&
        Objects.equals(this.caseType, createCaseRequestData.caseType) &&
        Objects.equals(this.entityId, createCaseRequestData.entityId) &&
        Objects.equals(this.contractId, createCaseRequestData.contractId) &&
        Objects.equals(this.countryCode, createCaseRequestData.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, caseType, entityId, contractId, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCaseRequestData {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("team_id");
    openapiFields.add("case_type");
    openapiFields.add("entity_id");
    openapiFields.add("contract_id");
    openapiFields.add("country_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("case_type");
    openapiRequiredFields.add("country_code");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCaseRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCaseRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCaseRequestData is not found in the empty JSON string", CreateCaseRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCaseRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCaseRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCaseRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("team_id") != null && !jsonObj.get("team_id").isJsonNull()) && !jsonObj.get("team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_id").toString()));
      }
      if (!jsonObj.get("case_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `case_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("case_type").toString()));
      }
      // validate the required field `case_type`
      CaseTypeEnum.validateJsonElement(jsonObj.get("case_type"));
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if (!jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCaseRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCaseRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCaseRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCaseRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCaseRequestData>() {
           @Override
           public void write(JsonWriter out, CreateCaseRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCaseRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCaseRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCaseRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateCaseRequestData
   */
  public static CreateCaseRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCaseRequestData.class);
  }

  /**
   * Convert an instance of CreateCaseRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

