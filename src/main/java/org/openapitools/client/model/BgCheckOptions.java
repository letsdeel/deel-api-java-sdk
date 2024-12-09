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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BgCheckIndividualCheck;
import org.openapitools.client.model.BgCheckPackage;

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
 * BgCheckOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class BgCheckOptions {
  public static final String SERIALIZED_NAME_INDIVIDUAL_CHECKS = "individual_checks";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_CHECKS)
  private List<BgCheckIndividualCheck> individualChecks = new ArrayList<>();

  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<BgCheckPackage> packages = new ArrayList<>();

  public BgCheckOptions() {
  }

  public BgCheckOptions individualChecks(List<BgCheckIndividualCheck> individualChecks) {
    this.individualChecks = individualChecks;
    return this;
  }

  public BgCheckOptions addIndividualChecksItem(BgCheckIndividualCheck individualChecksItem) {
    if (this.individualChecks == null) {
      this.individualChecks = new ArrayList<>();
    }
    this.individualChecks.add(individualChecksItem);
    return this;
  }

  /**
   * A list of individual checks that can be performed.
   * @return individualChecks
   */
  @javax.annotation.Nullable
  public List<BgCheckIndividualCheck> getIndividualChecks() {
    return individualChecks;
  }

  public void setIndividualChecks(List<BgCheckIndividualCheck> individualChecks) {
    this.individualChecks = individualChecks;
  }


  public BgCheckOptions packages(List<BgCheckPackage> packages) {
    this.packages = packages;
    return this;
  }

  public BgCheckOptions addPackagesItem(BgCheckPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * A list of packages that can be performed.
   * @return packages
   */
  @javax.annotation.Nullable
  public List<BgCheckPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<BgCheckPackage> packages) {
    this.packages = packages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgCheckOptions bgCheckOptions = (BgCheckOptions) o;
    return Objects.equals(this.individualChecks, bgCheckOptions.individualChecks) &&
        Objects.equals(this.packages, bgCheckOptions.packages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individualChecks, packages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgCheckOptions {\n");
    sb.append("    individualChecks: ").append(toIndentedString(individualChecks)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
    openapiFields.add("individual_checks");
    openapiFields.add("packages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BgCheckOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BgCheckOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgCheckOptions is not found in the empty JSON string", BgCheckOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BgCheckOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BgCheckOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("individual_checks") != null && !jsonObj.get("individual_checks").isJsonNull()) {
        JsonArray jsonArrayindividualChecks = jsonObj.getAsJsonArray("individual_checks");
        if (jsonArrayindividualChecks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("individual_checks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `individual_checks` to be an array in the JSON string but got `%s`", jsonObj.get("individual_checks").toString()));
          }

          // validate the optional field `individual_checks` (array)
          for (int i = 0; i < jsonArrayindividualChecks.size(); i++) {
            BgCheckIndividualCheck.validateJsonElement(jsonArrayindividualChecks.get(i));
          };
        }
      }
      if (jsonObj.get("packages") != null && !jsonObj.get("packages").isJsonNull()) {
        JsonArray jsonArraypackages = jsonObj.getAsJsonArray("packages");
        if (jsonArraypackages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("packages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `packages` to be an array in the JSON string but got `%s`", jsonObj.get("packages").toString()));
          }

          // validate the optional field `packages` (array)
          for (int i = 0; i < jsonArraypackages.size(); i++) {
            BgCheckPackage.validateJsonElement(jsonArraypackages.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgCheckOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgCheckOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgCheckOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgCheckOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<BgCheckOptions>() {
           @Override
           public void write(JsonWriter out, BgCheckOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BgCheckOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BgCheckOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BgCheckOptions
   * @throws IOException if the JSON string is invalid with respect to BgCheckOptions
   */
  public static BgCheckOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgCheckOptions.class);
  }

  /**
   * Convert an instance of BgCheckOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
