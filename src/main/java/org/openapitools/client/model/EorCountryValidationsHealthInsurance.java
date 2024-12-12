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
import org.openapitools.client.model.BenefitStatusEnum;
import org.openapitools.client.model.HealthInsuranceProvider;

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
 * EorCountryValidationsHealthInsurance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class EorCountryValidationsHealthInsurance {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private BenefitStatusEnum status;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  @javax.annotation.Nullable
  private List<HealthInsuranceProvider> providers = new ArrayList<>();

  public EorCountryValidationsHealthInsurance() {
  }

  public EorCountryValidationsHealthInsurance status(@javax.annotation.Nullable BenefitStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public BenefitStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable BenefitStatusEnum status) {
    this.status = status;
  }


  public EorCountryValidationsHealthInsurance providers(@javax.annotation.Nullable List<HealthInsuranceProvider> providers) {
    this.providers = providers;
    return this;
  }

  public EorCountryValidationsHealthInsurance addProvidersItem(HealthInsuranceProvider providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * Get providers
   * @return providers
   */
  @javax.annotation.Nullable
  public List<HealthInsuranceProvider> getProviders() {
    return providers;
  }

  public void setProviders(@javax.annotation.Nullable List<HealthInsuranceProvider> providers) {
    this.providers = providers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorCountryValidationsHealthInsurance eorCountryValidationsHealthInsurance = (EorCountryValidationsHealthInsurance) o;
    return Objects.equals(this.status, eorCountryValidationsHealthInsurance.status) &&
        Objects.equals(this.providers, eorCountryValidationsHealthInsurance.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorCountryValidationsHealthInsurance {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("providers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorCountryValidationsHealthInsurance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorCountryValidationsHealthInsurance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorCountryValidationsHealthInsurance is not found in the empty JSON string", EorCountryValidationsHealthInsurance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorCountryValidationsHealthInsurance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorCountryValidationsHealthInsurance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        BenefitStatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("providers") != null && !jsonObj.get("providers").isJsonNull()) {
        JsonArray jsonArrayproviders = jsonObj.getAsJsonArray("providers");
        if (jsonArrayproviders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("providers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `providers` to be an array in the JSON string but got `%s`", jsonObj.get("providers").toString()));
          }

          // validate the optional field `providers` (array)
          for (int i = 0; i < jsonArrayproviders.size(); i++) {
            HealthInsuranceProvider.validateJsonElement(jsonArrayproviders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorCountryValidationsHealthInsurance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorCountryValidationsHealthInsurance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorCountryValidationsHealthInsurance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorCountryValidationsHealthInsurance.class));

       return (TypeAdapter<T>) new TypeAdapter<EorCountryValidationsHealthInsurance>() {
           @Override
           public void write(JsonWriter out, EorCountryValidationsHealthInsurance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorCountryValidationsHealthInsurance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorCountryValidationsHealthInsurance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorCountryValidationsHealthInsurance
   * @throws IOException if the JSON string is invalid with respect to EorCountryValidationsHealthInsurance
   */
  public static EorCountryValidationsHealthInsurance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorCountryValidationsHealthInsurance.class);
  }

  /**
   * Convert an instance of EorCountryValidationsHealthInsurance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

