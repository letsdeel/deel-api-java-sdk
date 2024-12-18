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
 * OffboardingTrackerGet200ResponseDataInnerContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerGet200ResponseDataInnerContract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public OffboardingTrackerGet200ResponseDataInnerContract() {
  }

  public OffboardingTrackerGet200ResponseDataInnerContract id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The contract ID associated with the individual.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerGet200ResponseDataInnerContract offboardingTrackerGet200ResponseDataInnerContract = (OffboardingTrackerGet200ResponseDataInnerContract) o;
    return Objects.equals(this.id, offboardingTrackerGet200ResponseDataInnerContract.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffboardingTrackerGet200ResponseDataInnerContract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerGet200ResponseDataInnerContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerGet200ResponseDataInnerContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerGet200ResponseDataInnerContract is not found in the empty JSON string", OffboardingTrackerGet200ResponseDataInnerContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerGet200ResponseDataInnerContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerGet200ResponseDataInnerContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerGet200ResponseDataInnerContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerGet200ResponseDataInnerContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerGet200ResponseDataInnerContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerGet200ResponseDataInnerContract.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerGet200ResponseDataInnerContract>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerGet200ResponseDataInnerContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerGet200ResponseDataInnerContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerGet200ResponseDataInnerContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerGet200ResponseDataInnerContract
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerGet200ResponseDataInnerContract
   */
  public static OffboardingTrackerGet200ResponseDataInnerContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerGet200ResponseDataInnerContract.class);
  }

  /**
   * Convert an instance of OffboardingTrackerGet200ResponseDataInnerContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

