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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount;

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
 * GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount amount;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_ROLLOVER_TRACKING_PERIOD = "rollover_tracking_period";
  @SerializedName(SERIALIZED_NAME_ROLLOVER_TRACKING_PERIOD)
  @javax.annotation.Nonnull
  private OffsetDateTime rolloverTrackingPeriod;

  public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner() {
  }

  public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner amount(@javax.annotation.Nonnull GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount amount) {
    this.amount = amount;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner expirationDate(@javax.annotation.Nullable OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Rollover expiration date
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(@javax.annotation.Nullable OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner rolloverTrackingPeriod(@javax.annotation.Nonnull OffsetDateTime rolloverTrackingPeriod) {
    this.rolloverTrackingPeriod = rolloverTrackingPeriod;
    return this;
  }

  /**
   * Rollover tracking period
   * @return rolloverTrackingPeriod
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getRolloverTrackingPeriod() {
    return rolloverTrackingPeriod;
  }

  public void setRolloverTrackingPeriod(@javax.annotation.Nonnull OffsetDateTime rolloverTrackingPeriod) {
    this.rolloverTrackingPeriod = rolloverTrackingPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner getProfileEntitlements200ResponseEntitlementsInnerRolloversInner = (GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner) o;
    return Objects.equals(this.amount, getProfileEntitlements200ResponseEntitlementsInnerRolloversInner.amount) &&
        Objects.equals(this.expirationDate, getProfileEntitlements200ResponseEntitlementsInnerRolloversInner.expirationDate) &&
        Objects.equals(this.rolloverTrackingPeriod, getProfileEntitlements200ResponseEntitlementsInnerRolloversInner.rolloverTrackingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, expirationDate, rolloverTrackingPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    rolloverTrackingPeriod: ").append(toIndentedString(rolloverTrackingPeriod)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("expiration_date");
    openapiFields.add("rollover_tracking_period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("rollover_tracking_period");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner is not found in the empty JSON string", GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `amount`
      GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount.validateJsonElement(jsonObj.get("amount"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner>() {
           @Override
           public void write(JsonWriter out, GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner
   * @throws IOException if the JSON string is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner
   */
  public static GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.class);
  }

  /**
   * Convert an instance of GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

