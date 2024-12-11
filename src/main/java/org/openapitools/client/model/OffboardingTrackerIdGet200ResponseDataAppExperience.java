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
 * OffboardingTrackerIdGet200ResponseDataAppExperience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:06:48.603230199Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerIdGet200ResponseDataAppExperience {
  public static final String SERIALIZED_NAME_IS_MINIMAL_REQUIREMENTS = "is_minimal_requirements";
  @SerializedName(SERIALIZED_NAME_IS_MINIMAL_REQUIREMENTS)
  @javax.annotation.Nullable
  private Boolean isMinimalRequirements;

  public OffboardingTrackerIdGet200ResponseDataAppExperience() {
  }

  public OffboardingTrackerIdGet200ResponseDataAppExperience isMinimalRequirements(@javax.annotation.Nullable Boolean isMinimalRequirements) {
    this.isMinimalRequirements = isMinimalRequirements;
    return this;
  }

  /**
   * Indicates whether the individual meets the minimal experience requirements for the role.
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
    OffboardingTrackerIdGet200ResponseDataAppExperience offboardingTrackerIdGet200ResponseDataAppExperience = (OffboardingTrackerIdGet200ResponseDataAppExperience) o;
    return Objects.equals(this.isMinimalRequirements, offboardingTrackerIdGet200ResponseDataAppExperience.isMinimalRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMinimalRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffboardingTrackerIdGet200ResponseDataAppExperience {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerIdGet200ResponseDataAppExperience
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerIdGet200ResponseDataAppExperience.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerIdGet200ResponseDataAppExperience is not found in the empty JSON string", OffboardingTrackerIdGet200ResponseDataAppExperience.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerIdGet200ResponseDataAppExperience.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerIdGet200ResponseDataAppExperience` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerIdGet200ResponseDataAppExperience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerIdGet200ResponseDataAppExperience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerIdGet200ResponseDataAppExperience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerIdGet200ResponseDataAppExperience.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerIdGet200ResponseDataAppExperience>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerIdGet200ResponseDataAppExperience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerIdGet200ResponseDataAppExperience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerIdGet200ResponseDataAppExperience given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerIdGet200ResponseDataAppExperience
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerIdGet200ResponseDataAppExperience
   */
  public static OffboardingTrackerIdGet200ResponseDataAppExperience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerIdGet200ResponseDataAppExperience.class);
  }

  /**
   * Convert an instance of OffboardingTrackerIdGet200ResponseDataAppExperience to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

