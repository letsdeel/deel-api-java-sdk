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
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.PremiumResultAddedMisclassificationGuarantee;
import org.openapitools.client.model.PremiumResultAddedPenalties;
import org.openapitools.client.model.PremiumResultAddedThirdPartyLiabilities;

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
 * PremiumResultAdded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class PremiumResultAdded {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_CALCULATED_PREMIUM = "calculated_premium";
  @SerializedName(SERIALIZED_NAME_CALCULATED_PREMIUM)
  @javax.annotation.Nonnull
  private BigDecimal calculatedPremium;

  public static final String SERIALIZED_NAME_MISCLASSIFICATION_GUARANTEE = "misclassification_guarantee";
  @SerializedName(SERIALIZED_NAME_MISCLASSIFICATION_GUARANTEE)
  @javax.annotation.Nonnull
  private PremiumResultAddedMisclassificationGuarantee misclassificationGuarantee;

  public static final String SERIALIZED_NAME_PENALTIES = "penalties";
  @SerializedName(SERIALIZED_NAME_PENALTIES)
  @javax.annotation.Nonnull
  private PremiumResultAddedPenalties penalties;

  public static final String SERIALIZED_NAME_THIRD_PARTY_LIABILITIES = "third_party_liabilities";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_LIABILITIES)
  @javax.annotation.Nonnull
  private PremiumResultAddedThirdPartyLiabilities thirdPartyLiabilities;

  public PremiumResultAdded() {
  }

  public PremiumResultAdded id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Deel Premium plan id.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public PremiumResultAdded calculatedPremium(@javax.annotation.Nonnull BigDecimal calculatedPremium) {
    this.calculatedPremium = calculatedPremium;
    return this;
  }

  /**
   * Cost for Deel Premium.
   * @return calculatedPremium
   */
  @javax.annotation.Nonnull
  public BigDecimal getCalculatedPremium() {
    return calculatedPremium;
  }

  public void setCalculatedPremium(@javax.annotation.Nonnull BigDecimal calculatedPremium) {
    this.calculatedPremium = calculatedPremium;
  }


  public PremiumResultAdded misclassificationGuarantee(@javax.annotation.Nonnull PremiumResultAddedMisclassificationGuarantee misclassificationGuarantee) {
    this.misclassificationGuarantee = misclassificationGuarantee;
    return this;
  }

  /**
   * Get misclassificationGuarantee
   * @return misclassificationGuarantee
   */
  @javax.annotation.Nonnull
  public PremiumResultAddedMisclassificationGuarantee getMisclassificationGuarantee() {
    return misclassificationGuarantee;
  }

  public void setMisclassificationGuarantee(@javax.annotation.Nonnull PremiumResultAddedMisclassificationGuarantee misclassificationGuarantee) {
    this.misclassificationGuarantee = misclassificationGuarantee;
  }


  public PremiumResultAdded penalties(@javax.annotation.Nonnull PremiumResultAddedPenalties penalties) {
    this.penalties = penalties;
    return this;
  }

  /**
   * Get penalties
   * @return penalties
   */
  @javax.annotation.Nonnull
  public PremiumResultAddedPenalties getPenalties() {
    return penalties;
  }

  public void setPenalties(@javax.annotation.Nonnull PremiumResultAddedPenalties penalties) {
    this.penalties = penalties;
  }


  public PremiumResultAdded thirdPartyLiabilities(@javax.annotation.Nonnull PremiumResultAddedThirdPartyLiabilities thirdPartyLiabilities) {
    this.thirdPartyLiabilities = thirdPartyLiabilities;
    return this;
  }

  /**
   * Get thirdPartyLiabilities
   * @return thirdPartyLiabilities
   */
  @javax.annotation.Nonnull
  public PremiumResultAddedThirdPartyLiabilities getThirdPartyLiabilities() {
    return thirdPartyLiabilities;
  }

  public void setThirdPartyLiabilities(@javax.annotation.Nonnull PremiumResultAddedThirdPartyLiabilities thirdPartyLiabilities) {
    this.thirdPartyLiabilities = thirdPartyLiabilities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumResultAdded premiumResultAdded = (PremiumResultAdded) o;
    return Objects.equals(this.id, premiumResultAdded.id) &&
        Objects.equals(this.calculatedPremium, premiumResultAdded.calculatedPremium) &&
        Objects.equals(this.misclassificationGuarantee, premiumResultAdded.misclassificationGuarantee) &&
        Objects.equals(this.penalties, premiumResultAdded.penalties) &&
        Objects.equals(this.thirdPartyLiabilities, premiumResultAdded.thirdPartyLiabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, calculatedPremium, misclassificationGuarantee, penalties, thirdPartyLiabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumResultAdded {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    calculatedPremium: ").append(toIndentedString(calculatedPremium)).append("\n");
    sb.append("    misclassificationGuarantee: ").append(toIndentedString(misclassificationGuarantee)).append("\n");
    sb.append("    penalties: ").append(toIndentedString(penalties)).append("\n");
    sb.append("    thirdPartyLiabilities: ").append(toIndentedString(thirdPartyLiabilities)).append("\n");
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
    openapiFields.add("calculated_premium");
    openapiFields.add("misclassification_guarantee");
    openapiFields.add("penalties");
    openapiFields.add("third_party_liabilities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("calculated_premium");
    openapiRequiredFields.add("misclassification_guarantee");
    openapiRequiredFields.add("penalties");
    openapiRequiredFields.add("third_party_liabilities");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PremiumResultAdded
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PremiumResultAdded.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PremiumResultAdded is not found in the empty JSON string", PremiumResultAdded.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PremiumResultAdded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PremiumResultAdded` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PremiumResultAdded.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `misclassification_guarantee`
      PremiumResultAddedMisclassificationGuarantee.validateJsonElement(jsonObj.get("misclassification_guarantee"));
      // validate the required field `penalties`
      PremiumResultAddedPenalties.validateJsonElement(jsonObj.get("penalties"));
      // validate the required field `third_party_liabilities`
      PremiumResultAddedThirdPartyLiabilities.validateJsonElement(jsonObj.get("third_party_liabilities"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PremiumResultAdded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PremiumResultAdded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PremiumResultAdded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PremiumResultAdded.class));

       return (TypeAdapter<T>) new TypeAdapter<PremiumResultAdded>() {
           @Override
           public void write(JsonWriter out, PremiumResultAdded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PremiumResultAdded read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PremiumResultAdded given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PremiumResultAdded
   * @throws IOException if the JSON string is invalid with respect to PremiumResultAdded
   */
  public static PremiumResultAdded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PremiumResultAdded.class);
  }

  /**
   * Convert an instance of PremiumResultAdded to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

