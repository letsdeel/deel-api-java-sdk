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
import java.net.URI;
import java.util.Arrays;
import org.openapitools.client.model.ProfileTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TimeoffsProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class TimeoffsProfile {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PIC_URL = "pic_url";
  @SerializedName(SERIALIZED_NAME_PIC_URL)
  @javax.annotation.Nullable
  private URI picUrl;

  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profile_type";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  @javax.annotation.Nonnull
  private ProfileTypeEnum profileType;

  public static final String SERIALIZED_NAME_IS_EMPLOYEE = "is_employee";
  @SerializedName(SERIALIZED_NAME_IS_EMPLOYEE)
  @javax.annotation.Nullable
  private Boolean isEmployee;

  public TimeoffsProfile() {
  }

  public TimeoffsProfile id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public TimeoffsProfile name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public TimeoffsProfile picUrl(@javax.annotation.Nullable URI picUrl) {
    this.picUrl = picUrl;
    return this;
  }

  /**
   * Get picUrl
   * @return picUrl
   */
  @javax.annotation.Nullable
  public URI getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(@javax.annotation.Nullable URI picUrl) {
    this.picUrl = picUrl;
  }


  public TimeoffsProfile profileType(@javax.annotation.Nonnull ProfileTypeEnum profileType) {
    this.profileType = profileType;
    return this;
  }

  /**
   * Get profileType
   * @return profileType
   */
  @javax.annotation.Nonnull
  public ProfileTypeEnum getProfileType() {
    return profileType;
  }

  public void setProfileType(@javax.annotation.Nonnull ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }


  public TimeoffsProfile isEmployee(@javax.annotation.Nullable Boolean isEmployee) {
    this.isEmployee = isEmployee;
    return this;
  }

  /**
   * Only valid for requester. True if requester is an employee.
   * @return isEmployee
   */
  @javax.annotation.Nullable
  public Boolean getIsEmployee() {
    return isEmployee;
  }

  public void setIsEmployee(@javax.annotation.Nullable Boolean isEmployee) {
    this.isEmployee = isEmployee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeoffsProfile timeoffsProfile = (TimeoffsProfile) o;
    return Objects.equals(this.id, timeoffsProfile.id) &&
        Objects.equals(this.name, timeoffsProfile.name) &&
        Objects.equals(this.picUrl, timeoffsProfile.picUrl) &&
        Objects.equals(this.profileType, timeoffsProfile.profileType) &&
        Objects.equals(this.isEmployee, timeoffsProfile.isEmployee);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, picUrl, profileType, isEmployee);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeoffsProfile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    isEmployee: ").append(toIndentedString(isEmployee)).append("\n");
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
    openapiFields.add("pic_url");
    openapiFields.add("profile_type");
    openapiFields.add("is_employee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("profile_type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeoffsProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeoffsProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeoffsProfile is not found in the empty JSON string", TimeoffsProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeoffsProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeoffsProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeoffsProfile.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("pic_url") != null && !jsonObj.get("pic_url").isJsonNull()) && !jsonObj.get("pic_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pic_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pic_url").toString()));
      }
      // validate the required field `profile_type`
      ProfileTypeEnum.validateJsonElement(jsonObj.get("profile_type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeoffsProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeoffsProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeoffsProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeoffsProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeoffsProfile>() {
           @Override
           public void write(JsonWriter out, TimeoffsProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeoffsProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeoffsProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeoffsProfile
   * @throws IOException if the JSON string is invalid with respect to TimeoffsProfile
   */
  public static TimeoffsProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeoffsProfile.class);
  }

  /**
   * Convert an instance of TimeoffsProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

