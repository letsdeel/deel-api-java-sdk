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
 * Some countries required a pension benefit.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:20:01.055724240Z[GMT]", comments = "Generator version: 7.10.0")
public class PensionEORContractToCreate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_CONTRIBUTION = "contribution";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION)
  @javax.annotation.Nullable
  private String contribution;

  public PensionEORContractToCreate() {
  }

  public PensionEORContractToCreate id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Pension provider id. You can see available pension providers in the country guide endpoint.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public PensionEORContractToCreate contribution(@javax.annotation.Nullable String contribution) {
    this.contribution = contribution;
    return this;
  }

  /**
   * Enter the value of pension contribution. You should send this value only if the contribution object is available in the country guide endpoint and the value should be there between minimum and maximum values indicated.
   * @return contribution
   */
  @javax.annotation.Nullable
  public String getContribution() {
    return contribution;
  }

  public void setContribution(@javax.annotation.Nullable String contribution) {
    this.contribution = contribution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PensionEORContractToCreate pensionEORContractToCreate = (PensionEORContractToCreate) o;
    return Objects.equals(this.id, pensionEORContractToCreate.id) &&
        Objects.equals(this.contribution, pensionEORContractToCreate.contribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PensionEORContractToCreate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contribution: ").append(toIndentedString(contribution)).append("\n");
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
    openapiFields.add("contribution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PensionEORContractToCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PensionEORContractToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PensionEORContractToCreate is not found in the empty JSON string", PensionEORContractToCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PensionEORContractToCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PensionEORContractToCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("contribution") != null && !jsonObj.get("contribution").isJsonNull()) && !jsonObj.get("contribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contribution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PensionEORContractToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PensionEORContractToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PensionEORContractToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PensionEORContractToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<PensionEORContractToCreate>() {
           @Override
           public void write(JsonWriter out, PensionEORContractToCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PensionEORContractToCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PensionEORContractToCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PensionEORContractToCreate
   * @throws IOException if the JSON string is invalid with respect to PensionEORContractToCreate
   */
  public static PensionEORContractToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PensionEORContractToCreate.class);
  }

  /**
   * Convert an instance of PensionEORContractToCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

