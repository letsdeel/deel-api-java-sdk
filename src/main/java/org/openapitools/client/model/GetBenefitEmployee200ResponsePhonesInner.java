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
 * GetBenefitEmployee200ResponsePhonesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:05:54.444639311Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitEmployee200ResponsePhonesInner {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_DIAL_CODE = "dial_code";
  @SerializedName(SERIALIZED_NAME_DIAL_CODE)
  @javax.annotation.Nullable
  private String dialCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nullable
  private String phoneNumber;

  public GetBenefitEmployee200ResponsePhonesInner() {
  }

  public GetBenefitEmployee200ResponsePhonesInner type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of phone number, e.g., mobile, home.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GetBenefitEmployee200ResponsePhonesInner dialCode(@javax.annotation.Nullable String dialCode) {
    this.dialCode = dialCode;
    return this;
  }

  /**
   * The international dial code.
   * @return dialCode
   */
  @javax.annotation.Nullable
  public String getDialCode() {
    return dialCode;
  }

  public void setDialCode(@javax.annotation.Nullable String dialCode) {
    this.dialCode = dialCode;
  }


  public GetBenefitEmployee200ResponsePhonesInner phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBenefitEmployee200ResponsePhonesInner getBenefitEmployee200ResponsePhonesInner = (GetBenefitEmployee200ResponsePhonesInner) o;
    return Objects.equals(this.type, getBenefitEmployee200ResponsePhonesInner.type) &&
        Objects.equals(this.dialCode, getBenefitEmployee200ResponsePhonesInner.dialCode) &&
        Objects.equals(this.phoneNumber, getBenefitEmployee200ResponsePhonesInner.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dialCode, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBenefitEmployee200ResponsePhonesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dialCode: ").append(toIndentedString(dialCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    openapiFields.add("dial_code");
    openapiFields.add("phone_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitEmployee200ResponsePhonesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitEmployee200ResponsePhonesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitEmployee200ResponsePhonesInner is not found in the empty JSON string", GetBenefitEmployee200ResponsePhonesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitEmployee200ResponsePhonesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitEmployee200ResponsePhonesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("dial_code") != null && !jsonObj.get("dial_code").isJsonNull()) && !jsonObj.get("dial_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dial_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dial_code").toString()));
      }
      if ((jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBenefitEmployee200ResponsePhonesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitEmployee200ResponsePhonesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitEmployee200ResponsePhonesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitEmployee200ResponsePhonesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitEmployee200ResponsePhonesInner>() {
           @Override
           public void write(JsonWriter out, GetBenefitEmployee200ResponsePhonesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitEmployee200ResponsePhonesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitEmployee200ResponsePhonesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitEmployee200ResponsePhonesInner
   * @throws IOException if the JSON string is invalid with respect to GetBenefitEmployee200ResponsePhonesInner
   */
  public static GetBenefitEmployee200ResponsePhonesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitEmployee200ResponsePhonesInner.class);
  }

  /**
   * Convert an instance of GetBenefitEmployee200ResponsePhonesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

