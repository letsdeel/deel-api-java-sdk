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
import org.openapitools.client.model.GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInner;

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
 * GetEorCountryValidations200ResponseDataHealthInsurance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEorCountryValidations200ResponseDataHealthInsurance {
  /**
   * Health insurance status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    REQUIRED("REQUIRED"),
    
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  @javax.annotation.Nullable
  private List<GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInner> providers = new ArrayList<>();

  public GetEorCountryValidations200ResponseDataHealthInsurance() {
  }

  public GetEorCountryValidations200ResponseDataHealthInsurance status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Health insurance status.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public GetEorCountryValidations200ResponseDataHealthInsurance providers(@javax.annotation.Nullable List<GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInner> providers) {
    this.providers = providers;
    return this;
  }

  public GetEorCountryValidations200ResponseDataHealthInsurance addProvidersItem(GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInner providersItem) {
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
  public List<GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInner> getProviders() {
    return providers;
  }

  public void setProviders(@javax.annotation.Nullable List<GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInner> providers) {
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
    GetEorCountryValidations200ResponseDataHealthInsurance getEorCountryValidations200ResponseDataHealthInsurance = (GetEorCountryValidations200ResponseDataHealthInsurance) o;
    return Objects.equals(this.status, getEorCountryValidations200ResponseDataHealthInsurance.status) &&
        Objects.equals(this.providers, getEorCountryValidations200ResponseDataHealthInsurance.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEorCountryValidations200ResponseDataHealthInsurance {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetEorCountryValidations200ResponseDataHealthInsurance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEorCountryValidations200ResponseDataHealthInsurance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEorCountryValidations200ResponseDataHealthInsurance is not found in the empty JSON string", GetEorCountryValidations200ResponseDataHealthInsurance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEorCountryValidations200ResponseDataHealthInsurance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEorCountryValidations200ResponseDataHealthInsurance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
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
            GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInner.validateJsonElement(jsonArrayproviders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEorCountryValidations200ResponseDataHealthInsurance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEorCountryValidations200ResponseDataHealthInsurance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEorCountryValidations200ResponseDataHealthInsurance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEorCountryValidations200ResponseDataHealthInsurance.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEorCountryValidations200ResponseDataHealthInsurance>() {
           @Override
           public void write(JsonWriter out, GetEorCountryValidations200ResponseDataHealthInsurance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEorCountryValidations200ResponseDataHealthInsurance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEorCountryValidations200ResponseDataHealthInsurance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEorCountryValidations200ResponseDataHealthInsurance
   * @throws IOException if the JSON string is invalid with respect to GetEorCountryValidations200ResponseDataHealthInsurance
   */
  public static GetEorCountryValidations200ResponseDataHealthInsurance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEorCountryValidations200ResponseDataHealthInsurance.class);
  }

  /**
   * Convert an instance of GetEorCountryValidations200ResponseDataHealthInsurance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

