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
import org.openapitools.client.model.CreateGPContract201ResponseDataClientLegalEntity;

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
 * CreateGPContract201ResponseDataClient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:31:34.541358368Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGPContract201ResponseDataClient {
  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legal_entity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  @javax.annotation.Nullable
  private CreateGPContract201ResponseDataClientLegalEntity legalEntity;

  public CreateGPContract201ResponseDataClient() {
  }

  public CreateGPContract201ResponseDataClient legalEntity(@javax.annotation.Nullable CreateGPContract201ResponseDataClientLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
   */
  @javax.annotation.Nullable
  public CreateGPContract201ResponseDataClientLegalEntity getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(@javax.annotation.Nullable CreateGPContract201ResponseDataClientLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGPContract201ResponseDataClient createGPContract201ResponseDataClient = (CreateGPContract201ResponseDataClient) o;
    return Objects.equals(this.legalEntity, createGPContract201ResponseDataClient.legalEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPContract201ResponseDataClient {\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
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
    openapiFields.add("legal_entity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGPContract201ResponseDataClient
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGPContract201ResponseDataClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGPContract201ResponseDataClient is not found in the empty JSON string", CreateGPContract201ResponseDataClient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGPContract201ResponseDataClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGPContract201ResponseDataClient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `legal_entity`
      if (jsonObj.get("legal_entity") != null && !jsonObj.get("legal_entity").isJsonNull()) {
        CreateGPContract201ResponseDataClientLegalEntity.validateJsonElement(jsonObj.get("legal_entity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGPContract201ResponseDataClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGPContract201ResponseDataClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGPContract201ResponseDataClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGPContract201ResponseDataClient.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGPContract201ResponseDataClient>() {
           @Override
           public void write(JsonWriter out, CreateGPContract201ResponseDataClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGPContract201ResponseDataClient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGPContract201ResponseDataClient given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGPContract201ResponseDataClient
   * @throws IOException if the JSON string is invalid with respect to CreateGPContract201ResponseDataClient
   */
  public static CreateGPContract201ResponseDataClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGPContract201ResponseDataClient.class);
  }

  /**
   * Convert an instance of CreateGPContract201ResponseDataClient to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

