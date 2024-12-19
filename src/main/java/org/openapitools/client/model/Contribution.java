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
import org.openapitools.client.model.BenefitContributionTypeEnum;

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
 * Pension contribution.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class Contribution {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private BenefitContributionTypeEnum type;

  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  @javax.annotation.Nullable
  private String minimum;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  @javax.annotation.Nullable
  private String maximum;

  public Contribution() {
  }

  public Contribution type(@javax.annotation.Nullable BenefitContributionTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public BenefitContributionTypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable BenefitContributionTypeEnum type) {
    this.type = type;
  }


  public Contribution minimum(@javax.annotation.Nullable String minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Minimum pension contribution.
   * @return minimum
   */
  @javax.annotation.Nullable
  public String getMinimum() {
    return minimum;
  }

  public void setMinimum(@javax.annotation.Nullable String minimum) {
    this.minimum = minimum;
  }


  public Contribution maximum(@javax.annotation.Nullable String maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Maximum pension contribution.
   * @return maximum
   */
  @javax.annotation.Nullable
  public String getMaximum() {
    return maximum;
  }

  public void setMaximum(@javax.annotation.Nullable String maximum) {
    this.maximum = maximum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contribution contribution = (Contribution) o;
    return Objects.equals(this.type, contribution.type) &&
        Objects.equals(this.minimum, contribution.minimum) &&
        Objects.equals(this.maximum, contribution.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contribution {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("minimum");
    openapiFields.add("maximum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Contribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Contribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contribution is not found in the empty JSON string", Contribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Contribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Contribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        BenefitContributionTypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("minimum") != null && !jsonObj.get("minimum").isJsonNull()) && !jsonObj.get("minimum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum").toString()));
      }
      if ((jsonObj.get("maximum") != null && !jsonObj.get("maximum").isJsonNull()) && !jsonObj.get("maximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maximum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maximum").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contribution.class));

       return (TypeAdapter<T>) new TypeAdapter<Contribution>() {
           @Override
           public void write(JsonWriter out, Contribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Contribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Contribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Contribution
   * @throws IOException if the JSON string is invalid with respect to Contribution
   */
  public static Contribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contribution.class);
  }

  /**
   * Convert an instance of Contribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

