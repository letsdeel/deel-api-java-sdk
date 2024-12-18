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
import org.openapitools.client.model.OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod;

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
 * Employer of Record (EOR) for the contract, if applicable.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerIdGet200ResponseDataContractEor {
  public static final String SERIALIZED_NAME_PROBATION_PERIOD = "probation_period";
  @SerializedName(SERIALIZED_NAME_PROBATION_PERIOD)
  @javax.annotation.Nullable
  private OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod probationPeriod;

  public OffboardingTrackerIdGet200ResponseDataContractEor() {
  }

  public OffboardingTrackerIdGet200ResponseDataContractEor probationPeriod(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod probationPeriod) {
    this.probationPeriod = probationPeriod;
    return this;
  }

  /**
   * Get probationPeriod
   * @return probationPeriod
   */
  @javax.annotation.Nullable
  public OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod getProbationPeriod() {
    return probationPeriod;
  }

  public void setProbationPeriod(@javax.annotation.Nullable OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod probationPeriod) {
    this.probationPeriod = probationPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerIdGet200ResponseDataContractEor offboardingTrackerIdGet200ResponseDataContractEor = (OffboardingTrackerIdGet200ResponseDataContractEor) o;
    return Objects.equals(this.probationPeriod, offboardingTrackerIdGet200ResponseDataContractEor.probationPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probationPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffboardingTrackerIdGet200ResponseDataContractEor {\n");
    sb.append("    probationPeriod: ").append(toIndentedString(probationPeriod)).append("\n");
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
    openapiFields.add("probation_period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerIdGet200ResponseDataContractEor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerIdGet200ResponseDataContractEor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerIdGet200ResponseDataContractEor is not found in the empty JSON string", OffboardingTrackerIdGet200ResponseDataContractEor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerIdGet200ResponseDataContractEor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerIdGet200ResponseDataContractEor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `probation_period`
      if (jsonObj.get("probation_period") != null && !jsonObj.get("probation_period").isJsonNull()) {
        OffboardingTrackerIdGet200ResponseDataContractEorProbationPeriod.validateJsonElement(jsonObj.get("probation_period"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerIdGet200ResponseDataContractEor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerIdGet200ResponseDataContractEor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerIdGet200ResponseDataContractEor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerIdGet200ResponseDataContractEor.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerIdGet200ResponseDataContractEor>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerIdGet200ResponseDataContractEor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerIdGet200ResponseDataContractEor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerIdGet200ResponseDataContractEor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerIdGet200ResponseDataContractEor
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerIdGet200ResponseDataContractEor
   */
  public static OffboardingTrackerIdGet200ResponseDataContractEor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerIdGet200ResponseDataContractEor.class);
  }

  /**
   * Convert an instance of OffboardingTrackerIdGet200ResponseDataContractEor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

