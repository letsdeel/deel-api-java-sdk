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
import org.openapitools.client.model.ContractToCreateOngoingTimeBased;

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
 * ContractToCreateContainerOngoingTimeBased
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T14:25:45.544976271Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractToCreateContainerOngoingTimeBased {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private ContractToCreateOngoingTimeBased data;

  public ContractToCreateContainerOngoingTimeBased() {
  }

  public ContractToCreateContainerOngoingTimeBased data(@javax.annotation.Nonnull ContractToCreateOngoingTimeBased data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public ContractToCreateOngoingTimeBased getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull ContractToCreateOngoingTimeBased data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractToCreateContainerOngoingTimeBased contractToCreateContainerOngoingTimeBased = (ContractToCreateContainerOngoingTimeBased) o;
    return Objects.equals(this.data, contractToCreateContainerOngoingTimeBased.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractToCreateContainerOngoingTimeBased {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractToCreateContainerOngoingTimeBased
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractToCreateContainerOngoingTimeBased.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractToCreateContainerOngoingTimeBased is not found in the empty JSON string", ContractToCreateContainerOngoingTimeBased.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractToCreateContainerOngoingTimeBased.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractToCreateContainerOngoingTimeBased` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractToCreateContainerOngoingTimeBased.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `data`
      ContractToCreateOngoingTimeBased.validateJsonElement(jsonObj.get("data"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractToCreateContainerOngoingTimeBased.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractToCreateContainerOngoingTimeBased' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractToCreateContainerOngoingTimeBased> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreateContainerOngoingTimeBased.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractToCreateContainerOngoingTimeBased>() {
           @Override
           public void write(JsonWriter out, ContractToCreateContainerOngoingTimeBased value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractToCreateContainerOngoingTimeBased read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractToCreateContainerOngoingTimeBased given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractToCreateContainerOngoingTimeBased
   * @throws IOException if the JSON string is invalid with respect to ContractToCreateContainerOngoingTimeBased
   */
  public static ContractToCreateContainerOngoingTimeBased fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractToCreateContainerOngoingTimeBased.class);
  }

  /**
   * Convert an instance of ContractToCreateContainerOngoingTimeBased to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

