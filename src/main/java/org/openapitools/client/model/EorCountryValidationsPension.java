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
import org.openapitools.client.model.PensionProvider;

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
 * If it is there, you must specify the pension benefit when creating an EOR contract.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class EorCountryValidationsPension {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private BenefitStatusEnum status;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  @javax.annotation.Nullable
  private List<PensionProvider> providers = new ArrayList<>();

  public EorCountryValidationsPension() {
  }

  public EorCountryValidationsPension status(@javax.annotation.Nullable BenefitStatusEnum status) {
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


  public EorCountryValidationsPension providers(@javax.annotation.Nullable List<PensionProvider> providers) {
    this.providers = providers;
    return this;
  }

  public EorCountryValidationsPension addProvidersItem(PensionProvider providersItem) {
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
  public List<PensionProvider> getProviders() {
    return providers;
  }

  public void setProviders(@javax.annotation.Nullable List<PensionProvider> providers) {
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
    EorCountryValidationsPension eorCountryValidationsPension = (EorCountryValidationsPension) o;
    return Objects.equals(this.status, eorCountryValidationsPension.status) &&
        Objects.equals(this.providers, eorCountryValidationsPension.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorCountryValidationsPension {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to EorCountryValidationsPension
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorCountryValidationsPension.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorCountryValidationsPension is not found in the empty JSON string", EorCountryValidationsPension.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorCountryValidationsPension.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorCountryValidationsPension` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            PensionProvider.validateJsonElement(jsonArrayproviders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorCountryValidationsPension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorCountryValidationsPension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorCountryValidationsPension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorCountryValidationsPension.class));

       return (TypeAdapter<T>) new TypeAdapter<EorCountryValidationsPension>() {
           @Override
           public void write(JsonWriter out, EorCountryValidationsPension value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorCountryValidationsPension read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorCountryValidationsPension given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorCountryValidationsPension
   * @throws IOException if the JSON string is invalid with respect to EorCountryValidationsPension
   */
  public static EorCountryValidationsPension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorCountryValidationsPension.class);
  }

  /**
   * Convert an instance of EorCountryValidationsPension to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

