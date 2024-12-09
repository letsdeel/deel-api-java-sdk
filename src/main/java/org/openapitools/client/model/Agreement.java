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
import org.openapitools.client.model.AgreementClientLegalEntity;
import org.openapitools.client.model.AgreementMsa;
import org.openapitools.client.model.AgreementProviderLegalEntity;

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
 * Agreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class Agreement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AGREEMENT_TITLE = "agreement_title";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_TITLE)
  private String agreementTitle;

  public static final String SERIALIZED_NAME_AGREEMENT_TYPE = "agreement_type";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_TYPE)
  private String agreementType;

  public static final String SERIALIZED_NAME_MSA = "msa";
  @SerializedName(SERIALIZED_NAME_MSA)
  private AgreementMsa msa;

  public static final String SERIALIZED_NAME_CLIENT_LEGAL_ENTITY = "client_legal_entity";
  @SerializedName(SERIALIZED_NAME_CLIENT_LEGAL_ENTITY)
  private AgreementClientLegalEntity clientLegalEntity;

  public static final String SERIALIZED_NAME_PROVIDER_LEGAL_ENTITY = "provider_legal_entity";
  @SerializedName(SERIALIZED_NAME_PROVIDER_LEGAL_ENTITY)
  private AgreementProviderLegalEntity providerLegalEntity;

  public Agreement() {
  }

  public Agreement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Agreement agreementTitle(String agreementTitle) {
    this.agreementTitle = agreementTitle;
    return this;
  }

  /**
   * Get agreementTitle
   * @return agreementTitle
   */
  @javax.annotation.Nonnull
  public String getAgreementTitle() {
    return agreementTitle;
  }

  public void setAgreementTitle(String agreementTitle) {
    this.agreementTitle = agreementTitle;
  }


  public Agreement agreementType(String agreementType) {
    this.agreementType = agreementType;
    return this;
  }

  /**
   * Get agreementType
   * @return agreementType
   */
  @javax.annotation.Nonnull
  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }


  public Agreement msa(AgreementMsa msa) {
    this.msa = msa;
    return this;
  }

  /**
   * Get msa
   * @return msa
   */
  @javax.annotation.Nonnull
  public AgreementMsa getMsa() {
    return msa;
  }

  public void setMsa(AgreementMsa msa) {
    this.msa = msa;
  }


  public Agreement clientLegalEntity(AgreementClientLegalEntity clientLegalEntity) {
    this.clientLegalEntity = clientLegalEntity;
    return this;
  }

  /**
   * Get clientLegalEntity
   * @return clientLegalEntity
   */
  @javax.annotation.Nonnull
  public AgreementClientLegalEntity getClientLegalEntity() {
    return clientLegalEntity;
  }

  public void setClientLegalEntity(AgreementClientLegalEntity clientLegalEntity) {
    this.clientLegalEntity = clientLegalEntity;
  }


  public Agreement providerLegalEntity(AgreementProviderLegalEntity providerLegalEntity) {
    this.providerLegalEntity = providerLegalEntity;
    return this;
  }

  /**
   * Get providerLegalEntity
   * @return providerLegalEntity
   */
  @javax.annotation.Nonnull
  public AgreementProviderLegalEntity getProviderLegalEntity() {
    return providerLegalEntity;
  }

  public void setProviderLegalEntity(AgreementProviderLegalEntity providerLegalEntity) {
    this.providerLegalEntity = providerLegalEntity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agreement agreement = (Agreement) o;
    return Objects.equals(this.id, agreement.id) &&
        Objects.equals(this.agreementTitle, agreement.agreementTitle) &&
        Objects.equals(this.agreementType, agreement.agreementType) &&
        Objects.equals(this.msa, agreement.msa) &&
        Objects.equals(this.clientLegalEntity, agreement.clientLegalEntity) &&
        Objects.equals(this.providerLegalEntity, agreement.providerLegalEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agreementTitle, agreementType, msa, clientLegalEntity, providerLegalEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agreement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agreementTitle: ").append(toIndentedString(agreementTitle)).append("\n");
    sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
    sb.append("    msa: ").append(toIndentedString(msa)).append("\n");
    sb.append("    clientLegalEntity: ").append(toIndentedString(clientLegalEntity)).append("\n");
    sb.append("    providerLegalEntity: ").append(toIndentedString(providerLegalEntity)).append("\n");
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
    openapiFields.add("agreement_title");
    openapiFields.add("agreement_type");
    openapiFields.add("msa");
    openapiFields.add("client_legal_entity");
    openapiFields.add("provider_legal_entity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("agreement_title");
    openapiRequiredFields.add("agreement_type");
    openapiRequiredFields.add("msa");
    openapiRequiredFields.add("client_legal_entity");
    openapiRequiredFields.add("provider_legal_entity");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Agreement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Agreement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Agreement is not found in the empty JSON string", Agreement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Agreement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Agreement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Agreement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("agreement_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_title").toString()));
      }
      if (!jsonObj.get("agreement_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_type").toString()));
      }
      // validate the required field `msa`
      AgreementMsa.validateJsonElement(jsonObj.get("msa"));
      // validate the required field `client_legal_entity`
      AgreementClientLegalEntity.validateJsonElement(jsonObj.get("client_legal_entity"));
      // validate the required field `provider_legal_entity`
      AgreementProviderLegalEntity.validateJsonElement(jsonObj.get("provider_legal_entity"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Agreement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Agreement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Agreement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Agreement.class));

       return (TypeAdapter<T>) new TypeAdapter<Agreement>() {
           @Override
           public void write(JsonWriter out, Agreement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Agreement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Agreement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Agreement
   * @throws IOException if the JSON string is invalid with respect to Agreement
   */
  public static Agreement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Agreement.class);
  }

  /**
   * Convert an instance of Agreement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
