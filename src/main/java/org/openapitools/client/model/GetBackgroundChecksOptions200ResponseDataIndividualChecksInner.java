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
 * GetBackgroundChecksOptions200ResponseDataIndividualChecksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBackgroundChecksOptions200ResponseDataIndividualChecksInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  @javax.annotation.Nullable
  private BigDecimal price;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_IS_AVAILABLE = "is_available";
  @SerializedName(SERIALIZED_NAME_IS_AVAILABLE)
  @javax.annotation.Nullable
  private Boolean isAvailable;

  public static final String SERIALIZED_NAME_THIRD_PARTY_NAME = "third_party_name";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_NAME)
  @javax.annotation.Nullable
  private String thirdPartyName;

  public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner() {
  }

  public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the individual check.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the individual check.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner price(@javax.annotation.Nullable BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the individual check.
   * @return price
   */
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(@javax.annotation.Nullable BigDecimal price) {
    this.price = price;
  }


  public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the individual check.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner isAvailable(@javax.annotation.Nullable Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Whether the individual check is available.
   * @return isAvailable
   */
  @javax.annotation.Nullable
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(@javax.annotation.Nullable Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }


  public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner thirdPartyName(@javax.annotation.Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

  /**
   * The third-party name of the individual check.
   * @return thirdPartyName
   */
  @javax.annotation.Nullable
  public String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(@javax.annotation.Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBackgroundChecksOptions200ResponseDataIndividualChecksInner getBackgroundChecksOptions200ResponseDataIndividualChecksInner = (GetBackgroundChecksOptions200ResponseDataIndividualChecksInner) o;
    return Objects.equals(this.id, getBackgroundChecksOptions200ResponseDataIndividualChecksInner.id) &&
        Objects.equals(this.name, getBackgroundChecksOptions200ResponseDataIndividualChecksInner.name) &&
        Objects.equals(this.price, getBackgroundChecksOptions200ResponseDataIndividualChecksInner.price) &&
        Objects.equals(this.currency, getBackgroundChecksOptions200ResponseDataIndividualChecksInner.currency) &&
        Objects.equals(this.isAvailable, getBackgroundChecksOptions200ResponseDataIndividualChecksInner.isAvailable) &&
        Objects.equals(this.thirdPartyName, getBackgroundChecksOptions200ResponseDataIndividualChecksInner.thirdPartyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, currency, isAvailable, thirdPartyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBackgroundChecksOptions200ResponseDataIndividualChecksInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    thirdPartyName: ").append(toIndentedString(thirdPartyName)).append("\n");
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
    openapiFields.add("price");
    openapiFields.add("currency");
    openapiFields.add("is_available");
    openapiFields.add("third_party_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBackgroundChecksOptions200ResponseDataIndividualChecksInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBackgroundChecksOptions200ResponseDataIndividualChecksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBackgroundChecksOptions200ResponseDataIndividualChecksInner is not found in the empty JSON string", GetBackgroundChecksOptions200ResponseDataIndividualChecksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBackgroundChecksOptions200ResponseDataIndividualChecksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBackgroundChecksOptions200ResponseDataIndividualChecksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("third_party_name") != null && !jsonObj.get("third_party_name").isJsonNull()) && !jsonObj.get("third_party_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBackgroundChecksOptions200ResponseDataIndividualChecksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBackgroundChecksOptions200ResponseDataIndividualChecksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBackgroundChecksOptions200ResponseDataIndividualChecksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBackgroundChecksOptions200ResponseDataIndividualChecksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBackgroundChecksOptions200ResponseDataIndividualChecksInner>() {
           @Override
           public void write(JsonWriter out, GetBackgroundChecksOptions200ResponseDataIndividualChecksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBackgroundChecksOptions200ResponseDataIndividualChecksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBackgroundChecksOptions200ResponseDataIndividualChecksInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBackgroundChecksOptions200ResponseDataIndividualChecksInner
   * @throws IOException if the JSON string is invalid with respect to GetBackgroundChecksOptions200ResponseDataIndividualChecksInner
   */
  public static GetBackgroundChecksOptions200ResponseDataIndividualChecksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBackgroundChecksOptions200ResponseDataIndividualChecksInner.class);
  }

  /**
   * Convert an instance of GetBackgroundChecksOptions200ResponseDataIndividualChecksInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

