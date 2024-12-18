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
 * ExerciseEquityToUpdateContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class ExerciseEquityToUpdateContainer {
  public static final String SERIALIZED_NAME_EMPLOYER_APPROVAL = "employer_approval";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_APPROVAL)
  @javax.annotation.Nonnull
  private String employerApproval;

  public ExerciseEquityToUpdateContainer() {
  }

  public ExerciseEquityToUpdateContainer employerApproval(@javax.annotation.Nonnull String employerApproval) {
    this.employerApproval = employerApproval;
    return this;
  }

  /**
   * Get employerApproval
   * @return employerApproval
   */
  @javax.annotation.Nonnull
  public String getEmployerApproval() {
    return employerApproval;
  }

  public void setEmployerApproval(@javax.annotation.Nonnull String employerApproval) {
    this.employerApproval = employerApproval;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseEquityToUpdateContainer exerciseEquityToUpdateContainer = (ExerciseEquityToUpdateContainer) o;
    return Objects.equals(this.employerApproval, exerciseEquityToUpdateContainer.employerApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseEquityToUpdateContainer {\n");
    sb.append("    employerApproval: ").append(toIndentedString(employerApproval)).append("\n");
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
    openapiFields.add("employer_approval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employer_approval");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExerciseEquityToUpdateContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExerciseEquityToUpdateContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExerciseEquityToUpdateContainer is not found in the empty JSON string", ExerciseEquityToUpdateContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExerciseEquityToUpdateContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExerciseEquityToUpdateContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExerciseEquityToUpdateContainer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("employer_approval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_approval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_approval").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExerciseEquityToUpdateContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExerciseEquityToUpdateContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExerciseEquityToUpdateContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExerciseEquityToUpdateContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<ExerciseEquityToUpdateContainer>() {
           @Override
           public void write(JsonWriter out, ExerciseEquityToUpdateContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExerciseEquityToUpdateContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExerciseEquityToUpdateContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExerciseEquityToUpdateContainer
   * @throws IOException if the JSON string is invalid with respect to ExerciseEquityToUpdateContainer
   */
  public static ExerciseEquityToUpdateContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExerciseEquityToUpdateContainer.class);
  }

  /**
   * Convert an instance of ExerciseEquityToUpdateContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

