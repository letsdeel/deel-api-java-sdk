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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * BgCheckPackage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class BgCheckPackage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_CHECKS = "checks";
  @SerializedName(SERIALIZED_NAME_CHECKS)
  @javax.annotation.Nullable
  private List<String> checks = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_AVAILABLE = "is_available";
  @SerializedName(SERIALIZED_NAME_IS_AVAILABLE)
  @javax.annotation.Nullable
  private Boolean isAvailable;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  @javax.annotation.Nullable
  private BigDecimal price;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public BgCheckPackage() {
  }

  public BgCheckPackage id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the package.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public BgCheckPackage name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the package.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public BgCheckPackage checks(@javax.annotation.Nullable List<String> checks) {
    this.checks = checks;
    return this;
  }

  public BgCheckPackage addChecksItem(String checksItem) {
    if (this.checks == null) {
      this.checks = new ArrayList<>();
    }
    this.checks.add(checksItem);
    return this;
  }

  /**
   * A list of checks in the package.
   * @return checks
   */
  @javax.annotation.Nullable
  public List<String> getChecks() {
    return checks;
  }

  public void setChecks(@javax.annotation.Nullable List<String> checks) {
    this.checks = checks;
  }


  public BgCheckPackage isAvailable(@javax.annotation.Nullable Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Whether the package is available.
   * @return isAvailable
   */
  @javax.annotation.Nullable
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(@javax.annotation.Nullable Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }


  public BgCheckPackage price(@javax.annotation.Nullable BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the package.
   * @return price
   */
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(@javax.annotation.Nullable BigDecimal price) {
    this.price = price;
  }


  public BgCheckPackage currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the package.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgCheckPackage bgCheckPackage = (BgCheckPackage) o;
    return Objects.equals(this.id, bgCheckPackage.id) &&
        Objects.equals(this.name, bgCheckPackage.name) &&
        Objects.equals(this.checks, bgCheckPackage.checks) &&
        Objects.equals(this.isAvailable, bgCheckPackage.isAvailable) &&
        Objects.equals(this.price, bgCheckPackage.price) &&
        Objects.equals(this.currency, bgCheckPackage.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, checks, isAvailable, price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgCheckPackage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("checks");
    openapiFields.add("is_available");
    openapiFields.add("price");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BgCheckPackage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BgCheckPackage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgCheckPackage is not found in the empty JSON string", BgCheckPackage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BgCheckPackage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BgCheckPackage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("checks") != null && !jsonObj.get("checks").isJsonNull() && !jsonObj.get("checks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `checks` to be an array in the JSON string but got `%s`", jsonObj.get("checks").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgCheckPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgCheckPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgCheckPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgCheckPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<BgCheckPackage>() {
           @Override
           public void write(JsonWriter out, BgCheckPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BgCheckPackage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BgCheckPackage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BgCheckPackage
   * @throws IOException if the JSON string is invalid with respect to BgCheckPackage
   */
  public static BgCheckPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgCheckPackage.class);
  }

  /**
   * Convert an instance of BgCheckPackage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

