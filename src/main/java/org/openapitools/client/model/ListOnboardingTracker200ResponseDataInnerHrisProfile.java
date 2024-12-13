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
 * ListOnboardingTracker200ResponseDataInnerHrisProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class ListOnboardingTracker200ResponseDataInnerHrisProfile {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  @javax.annotation.Nullable
  private String oid;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nullable
  private String workEmail;

  public ListOnboardingTracker200ResponseDataInnerHrisProfile() {
  }

  public ListOnboardingTracker200ResponseDataInnerHrisProfile oid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
    return this;
  }

  /**
   * The unique identifier for the HRIS profile
   * @return oid
   */
  @javax.annotation.Nullable
  public String getOid() {
    return oid;
  }

  public void setOid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
  }


  public ListOnboardingTracker200ResponseDataInnerHrisProfile workEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * The work email of the employee
   * @return workEmail
   */
  @javax.annotation.Nullable
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOnboardingTracker200ResponseDataInnerHrisProfile listOnboardingTracker200ResponseDataInnerHrisProfile = (ListOnboardingTracker200ResponseDataInnerHrisProfile) o;
    return Objects.equals(this.oid, listOnboardingTracker200ResponseDataInnerHrisProfile.oid) &&
        Objects.equals(this.workEmail, listOnboardingTracker200ResponseDataInnerHrisProfile.workEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, workEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOnboardingTracker200ResponseDataInnerHrisProfile {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
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
    openapiFields.add("oid");
    openapiFields.add("work_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListOnboardingTracker200ResponseDataInnerHrisProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListOnboardingTracker200ResponseDataInnerHrisProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListOnboardingTracker200ResponseDataInnerHrisProfile is not found in the empty JSON string", ListOnboardingTracker200ResponseDataInnerHrisProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListOnboardingTracker200ResponseDataInnerHrisProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListOnboardingTracker200ResponseDataInnerHrisProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("oid") != null && !jsonObj.get("oid").isJsonNull()) && !jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
      if ((jsonObj.get("work_email") != null && !jsonObj.get("work_email").isJsonNull()) && !jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListOnboardingTracker200ResponseDataInnerHrisProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListOnboardingTracker200ResponseDataInnerHrisProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListOnboardingTracker200ResponseDataInnerHrisProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListOnboardingTracker200ResponseDataInnerHrisProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<ListOnboardingTracker200ResponseDataInnerHrisProfile>() {
           @Override
           public void write(JsonWriter out, ListOnboardingTracker200ResponseDataInnerHrisProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListOnboardingTracker200ResponseDataInnerHrisProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListOnboardingTracker200ResponseDataInnerHrisProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListOnboardingTracker200ResponseDataInnerHrisProfile
   * @throws IOException if the JSON string is invalid with respect to ListOnboardingTracker200ResponseDataInnerHrisProfile
   */
  public static ListOnboardingTracker200ResponseDataInnerHrisProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListOnboardingTracker200ResponseDataInnerHrisProfile.class);
  }

  /**
   * Convert an instance of ListOnboardingTracker200ResponseDataInnerHrisProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

