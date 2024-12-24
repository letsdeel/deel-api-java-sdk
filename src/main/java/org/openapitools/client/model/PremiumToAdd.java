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
 * PremiumToAdd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class PremiumToAdd {
  public static final String SERIALIZED_NAME_AGREEMENT_REFLECTS_RELATION = "agreement_reflects_relation";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_REFLECTS_RELATION)
  @javax.annotation.Nonnull
  private Boolean agreementReflectsRelation;

  public static final String SERIALIZED_NAME_CONTRACTOR_CHARACTERISTICS = "contractor_characteristics";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_CHARACTERISTICS)
  @javax.annotation.Nonnull
  private Boolean contractorCharacteristics;

  public PremiumToAdd() {
  }

  public PremiumToAdd agreementReflectsRelation(@javax.annotation.Nonnull Boolean agreementReflectsRelation) {
    this.agreementReflectsRelation = agreementReflectsRelation;
    return this;
  }

  /**
   * Is the Contractor Agreement selected on the Deel Platform perfectly reflecting your organizations relation and actual working practices with the contractor?
   * @return agreementReflectsRelation
   */
  @javax.annotation.Nonnull
  public Boolean getAgreementReflectsRelation() {
    return agreementReflectsRelation;
  }

  public void setAgreementReflectsRelation(@javax.annotation.Nonnull Boolean agreementReflectsRelation) {
    this.agreementReflectsRelation = agreementReflectsRelation;
  }


  public PremiumToAdd contractorCharacteristics(@javax.annotation.Nonnull Boolean contractorCharacteristics) {
    this.contractorCharacteristics = contractorCharacteristics;
    return this;
  }

  /**
   * Workers doing certain jobs may be considered to be employees by law, even if they would otherwise be considered independent contractors under common law. Is the work of this worker characterized as: Apprentice, Trainee, Labourer, Driver, Medical worker, Legal worker, Construction worker or someone working in the fields of Finance/Investment?
   * @return contractorCharacteristics
   */
  @javax.annotation.Nonnull
  public Boolean getContractorCharacteristics() {
    return contractorCharacteristics;
  }

  public void setContractorCharacteristics(@javax.annotation.Nonnull Boolean contractorCharacteristics) {
    this.contractorCharacteristics = contractorCharacteristics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumToAdd premiumToAdd = (PremiumToAdd) o;
    return Objects.equals(this.agreementReflectsRelation, premiumToAdd.agreementReflectsRelation) &&
        Objects.equals(this.contractorCharacteristics, premiumToAdd.contractorCharacteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementReflectsRelation, contractorCharacteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumToAdd {\n");
    sb.append("    agreementReflectsRelation: ").append(toIndentedString(agreementReflectsRelation)).append("\n");
    sb.append("    contractorCharacteristics: ").append(toIndentedString(contractorCharacteristics)).append("\n");
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
    openapiFields.add("agreement_reflects_relation");
    openapiFields.add("contractor_characteristics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agreement_reflects_relation");
    openapiRequiredFields.add("contractor_characteristics");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PremiumToAdd
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PremiumToAdd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PremiumToAdd is not found in the empty JSON string", PremiumToAdd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PremiumToAdd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PremiumToAdd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PremiumToAdd.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PremiumToAdd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PremiumToAdd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PremiumToAdd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PremiumToAdd.class));

       return (TypeAdapter<T>) new TypeAdapter<PremiumToAdd>() {
           @Override
           public void write(JsonWriter out, PremiumToAdd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PremiumToAdd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PremiumToAdd given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PremiumToAdd
   * @throws IOException if the JSON string is invalid with respect to PremiumToAdd
   */
  public static PremiumToAdd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PremiumToAdd.class);
  }

  /**
   * Convert an instance of PremiumToAdd to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

