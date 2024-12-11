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
 * ListOnboardingTracker200ResponseDataInnerAppExperience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class ListOnboardingTracker200ResponseDataInnerAppExperience {
  public static final String SERIALIZED_NAME_IS_MINIMAL_REQUIREMENTS = "is_minimal_requirements";
  @SerializedName(SERIALIZED_NAME_IS_MINIMAL_REQUIREMENTS)
  @javax.annotation.Nullable
  private Boolean isMinimalRequirements;

  public ListOnboardingTracker200ResponseDataInnerAppExperience() {
  }

  public ListOnboardingTracker200ResponseDataInnerAppExperience isMinimalRequirements(@javax.annotation.Nullable Boolean isMinimalRequirements) {
    this.isMinimalRequirements = isMinimalRequirements;
    return this;
  }

  /**
   * Indicates if the employee meets minimal requirements
   * @return isMinimalRequirements
   */
  @javax.annotation.Nullable
  public Boolean getIsMinimalRequirements() {
    return isMinimalRequirements;
  }

  public void setIsMinimalRequirements(@javax.annotation.Nullable Boolean isMinimalRequirements) {
    this.isMinimalRequirements = isMinimalRequirements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOnboardingTracker200ResponseDataInnerAppExperience listOnboardingTracker200ResponseDataInnerAppExperience = (ListOnboardingTracker200ResponseDataInnerAppExperience) o;
    return Objects.equals(this.isMinimalRequirements, listOnboardingTracker200ResponseDataInnerAppExperience.isMinimalRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMinimalRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOnboardingTracker200ResponseDataInnerAppExperience {\n");
    sb.append("    isMinimalRequirements: ").append(toIndentedString(isMinimalRequirements)).append("\n");
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
    openapiFields.add("is_minimal_requirements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListOnboardingTracker200ResponseDataInnerAppExperience
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListOnboardingTracker200ResponseDataInnerAppExperience.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListOnboardingTracker200ResponseDataInnerAppExperience is not found in the empty JSON string", ListOnboardingTracker200ResponseDataInnerAppExperience.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListOnboardingTracker200ResponseDataInnerAppExperience.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListOnboardingTracker200ResponseDataInnerAppExperience` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListOnboardingTracker200ResponseDataInnerAppExperience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListOnboardingTracker200ResponseDataInnerAppExperience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListOnboardingTracker200ResponseDataInnerAppExperience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListOnboardingTracker200ResponseDataInnerAppExperience.class));

       return (TypeAdapter<T>) new TypeAdapter<ListOnboardingTracker200ResponseDataInnerAppExperience>() {
           @Override
           public void write(JsonWriter out, ListOnboardingTracker200ResponseDataInnerAppExperience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListOnboardingTracker200ResponseDataInnerAppExperience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListOnboardingTracker200ResponseDataInnerAppExperience given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListOnboardingTracker200ResponseDataInnerAppExperience
   * @throws IOException if the JSON string is invalid with respect to ListOnboardingTracker200ResponseDataInnerAppExperience
   */
  public static ListOnboardingTracker200ResponseDataInnerAppExperience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListOnboardingTracker200ResponseDataInnerAppExperience.class);
  }

  /**
   * Convert an instance of ListOnboardingTracker200ResponseDataInnerAppExperience to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

