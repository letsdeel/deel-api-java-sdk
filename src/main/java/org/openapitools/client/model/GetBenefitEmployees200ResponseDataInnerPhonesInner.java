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
 * GetBenefitEmployees200ResponseDataInnerPhonesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:15:13.914237102Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitEmployees200ResponseDataInnerPhonesInner {
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

  public GetBenefitEmployees200ResponseDataInnerPhonesInner() {
  }

  public GetBenefitEmployees200ResponseDataInnerPhonesInner type(@javax.annotation.Nullable String type) {
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


  public GetBenefitEmployees200ResponseDataInnerPhonesInner dialCode(@javax.annotation.Nullable String dialCode) {
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


  public GetBenefitEmployees200ResponseDataInnerPhonesInner phoneNumber(@javax.annotation.Nullable String phoneNumber) {
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
    GetBenefitEmployees200ResponseDataInnerPhonesInner getBenefitEmployees200ResponseDataInnerPhonesInner = (GetBenefitEmployees200ResponseDataInnerPhonesInner) o;
    return Objects.equals(this.type, getBenefitEmployees200ResponseDataInnerPhonesInner.type) &&
        Objects.equals(this.dialCode, getBenefitEmployees200ResponseDataInnerPhonesInner.dialCode) &&
        Objects.equals(this.phoneNumber, getBenefitEmployees200ResponseDataInnerPhonesInner.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dialCode, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBenefitEmployees200ResponseDataInnerPhonesInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitEmployees200ResponseDataInnerPhonesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitEmployees200ResponseDataInnerPhonesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitEmployees200ResponseDataInnerPhonesInner is not found in the empty JSON string", GetBenefitEmployees200ResponseDataInnerPhonesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitEmployees200ResponseDataInnerPhonesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitEmployees200ResponseDataInnerPhonesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetBenefitEmployees200ResponseDataInnerPhonesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitEmployees200ResponseDataInnerPhonesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitEmployees200ResponseDataInnerPhonesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitEmployees200ResponseDataInnerPhonesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitEmployees200ResponseDataInnerPhonesInner>() {
           @Override
           public void write(JsonWriter out, GetBenefitEmployees200ResponseDataInnerPhonesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitEmployees200ResponseDataInnerPhonesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitEmployees200ResponseDataInnerPhonesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitEmployees200ResponseDataInnerPhonesInner
   * @throws IOException if the JSON string is invalid with respect to GetBenefitEmployees200ResponseDataInnerPhonesInner
   */
  public static GetBenefitEmployees200ResponseDataInnerPhonesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitEmployees200ResponseDataInnerPhonesInner.class);
  }

  /**
   * Convert an instance of GetBenefitEmployees200ResponseDataInnerPhonesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

