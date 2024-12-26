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
 * CreateBenefitProviderIntegrationClient200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateBenefitProviderIntegrationClient200Response {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  @javax.annotation.Nullable
  private Boolean isActive;

  public CreateBenefitProviderIntegrationClient200Response() {
  }

  public CreateBenefitProviderIntegrationClient200Response isActive(@javax.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether the 401k integration has been activated or not.
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(@javax.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBenefitProviderIntegrationClient200Response createBenefitProviderIntegrationClient200Response = (CreateBenefitProviderIntegrationClient200Response) o;
    return Objects.equals(this.isActive, createBenefitProviderIntegrationClient200Response.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBenefitProviderIntegrationClient200Response {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("isActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateBenefitProviderIntegrationClient200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBenefitProviderIntegrationClient200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBenefitProviderIntegrationClient200Response is not found in the empty JSON string", CreateBenefitProviderIntegrationClient200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBenefitProviderIntegrationClient200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBenefitProviderIntegrationClient200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBenefitProviderIntegrationClient200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBenefitProviderIntegrationClient200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBenefitProviderIntegrationClient200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBenefitProviderIntegrationClient200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBenefitProviderIntegrationClient200Response>() {
           @Override
           public void write(JsonWriter out, CreateBenefitProviderIntegrationClient200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBenefitProviderIntegrationClient200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateBenefitProviderIntegrationClient200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateBenefitProviderIntegrationClient200Response
   * @throws IOException if the JSON string is invalid with respect to CreateBenefitProviderIntegrationClient200Response
   */
  public static CreateBenefitProviderIntegrationClient200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBenefitProviderIntegrationClient200Response.class);
  }

  /**
   * Convert an instance of CreateBenefitProviderIntegrationClient200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

