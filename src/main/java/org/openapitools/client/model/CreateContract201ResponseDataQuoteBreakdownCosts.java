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
import org.openapitools.client.model.CreateContract201ResponseDataQuoteBreakdownCostsMonthly;

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
 * CreateContract201ResponseDataQuoteBreakdownCosts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataQuoteBreakdownCosts {
  public static final String SERIALIZED_NAME_MONTHLY = "monthly";
  @SerializedName(SERIALIZED_NAME_MONTHLY)
  @javax.annotation.Nullable
  private CreateContract201ResponseDataQuoteBreakdownCostsMonthly monthly;

  public CreateContract201ResponseDataQuoteBreakdownCosts() {
  }

  public CreateContract201ResponseDataQuoteBreakdownCosts monthly(@javax.annotation.Nullable CreateContract201ResponseDataQuoteBreakdownCostsMonthly monthly) {
    this.monthly = monthly;
    return this;
  }

  /**
   * Get monthly
   * @return monthly
   */
  @javax.annotation.Nullable
  public CreateContract201ResponseDataQuoteBreakdownCostsMonthly getMonthly() {
    return monthly;
  }

  public void setMonthly(@javax.annotation.Nullable CreateContract201ResponseDataQuoteBreakdownCostsMonthly monthly) {
    this.monthly = monthly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract201ResponseDataQuoteBreakdownCosts createContract201ResponseDataQuoteBreakdownCosts = (CreateContract201ResponseDataQuoteBreakdownCosts) o;
    return Objects.equals(this.monthly, createContract201ResponseDataQuoteBreakdownCosts.monthly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContract201ResponseDataQuoteBreakdownCosts {\n");
    sb.append("    monthly: ").append(toIndentedString(monthly)).append("\n");
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
    openapiFields.add("monthly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataQuoteBreakdownCosts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataQuoteBreakdownCosts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataQuoteBreakdownCosts is not found in the empty JSON string", CreateContract201ResponseDataQuoteBreakdownCosts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataQuoteBreakdownCosts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataQuoteBreakdownCosts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `monthly`
      if (jsonObj.get("monthly") != null && !jsonObj.get("monthly").isJsonNull()) {
        CreateContract201ResponseDataQuoteBreakdownCostsMonthly.validateJsonElement(jsonObj.get("monthly"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataQuoteBreakdownCosts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataQuoteBreakdownCosts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataQuoteBreakdownCosts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataQuoteBreakdownCosts.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataQuoteBreakdownCosts>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataQuoteBreakdownCosts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataQuoteBreakdownCosts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataQuoteBreakdownCosts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataQuoteBreakdownCosts
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataQuoteBreakdownCosts
   */
  public static CreateContract201ResponseDataQuoteBreakdownCosts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataQuoteBreakdownCosts.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataQuoteBreakdownCosts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

