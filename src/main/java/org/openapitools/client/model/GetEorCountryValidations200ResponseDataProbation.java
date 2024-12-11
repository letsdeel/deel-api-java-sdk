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
import java.math.BigDecimal;
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
 * GetEorCountryValidations200ResponseDataProbation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:20:01.055724240Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEorCountryValidations200ResponseDataProbation {
  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  @javax.annotation.Nullable
  private BigDecimal max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  @javax.annotation.Nullable
  private String min;

  public GetEorCountryValidations200ResponseDataProbation() {
  }

  public GetEorCountryValidations200ResponseDataProbation max(@javax.annotation.Nullable BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum probation period.
   * @return max
   */
  @javax.annotation.Nullable
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(@javax.annotation.Nullable BigDecimal max) {
    this.max = max;
  }


  public GetEorCountryValidations200ResponseDataProbation min(@javax.annotation.Nullable String min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum probation period.
   * @return min
   */
  @javax.annotation.Nullable
  public String getMin() {
    return min;
  }

  public void setMin(@javax.annotation.Nullable String min) {
    this.min = min;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEorCountryValidations200ResponseDataProbation getEorCountryValidations200ResponseDataProbation = (GetEorCountryValidations200ResponseDataProbation) o;
    return Objects.equals(this.max, getEorCountryValidations200ResponseDataProbation.max) &&
        Objects.equals(this.min, getEorCountryValidations200ResponseDataProbation.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEorCountryValidations200ResponseDataProbation {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
    openapiFields.add("max");
    openapiFields.add("min");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetEorCountryValidations200ResponseDataProbation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEorCountryValidations200ResponseDataProbation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEorCountryValidations200ResponseDataProbation is not found in the empty JSON string", GetEorCountryValidations200ResponseDataProbation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEorCountryValidations200ResponseDataProbation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEorCountryValidations200ResponseDataProbation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("min") != null && !jsonObj.get("min").isJsonNull()) && !jsonObj.get("min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEorCountryValidations200ResponseDataProbation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEorCountryValidations200ResponseDataProbation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEorCountryValidations200ResponseDataProbation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEorCountryValidations200ResponseDataProbation.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEorCountryValidations200ResponseDataProbation>() {
           @Override
           public void write(JsonWriter out, GetEorCountryValidations200ResponseDataProbation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEorCountryValidations200ResponseDataProbation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEorCountryValidations200ResponseDataProbation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEorCountryValidations200ResponseDataProbation
   * @throws IOException if the JSON string is invalid with respect to GetEorCountryValidations200ResponseDataProbation
   */
  public static GetEorCountryValidations200ResponseDataProbation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEorCountryValidations200ResponseDataProbation.class);
  }

  /**
   * Convert an instance of GetEorCountryValidations200ResponseDataProbation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

