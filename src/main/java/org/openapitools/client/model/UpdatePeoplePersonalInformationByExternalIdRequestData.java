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
import java.time.LocalDate;
import java.util.Arrays;
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
 * UpdatePeoplePersonalInformationByExternalIdRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdatePeoplePersonalInformationByExternalIdRequestData {
  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  @javax.annotation.Nullable
  private String personalEmail;

  public static final String SERIALIZED_NAME_PREFERRED_NAME = "preferred_name";
  @SerializedName(SERIALIZED_NAME_PREFERRED_NAME)
  @javax.annotation.Nullable
  private String preferredName;

  public static final String SERIALIZED_NAME_LEGAL_LAST_NAME = "legal_last_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_LAST_NAME)
  @javax.annotation.Nullable
  private String legalLastName;

  public static final String SERIALIZED_NAME_LEGAL_FIRST_NAME = "legal_first_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_FIRST_NAME)
  @javax.annotation.Nullable
  private String legalFirstName;

  public UpdatePeoplePersonalInformationByExternalIdRequestData() {
  }

  public UpdatePeoplePersonalInformationByExternalIdRequestData dateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * The date of birth of the worker. Format: YYYY-MM-DD.
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public UpdatePeoplePersonalInformationByExternalIdRequestData personalEmail(@javax.annotation.Nullable String personalEmail) {
    this.personalEmail = personalEmail;
    return this;
  }

  /**
   * The personal email of the worker.
   * @return personalEmail
   */
  @javax.annotation.Nullable
  public String getPersonalEmail() {
    return personalEmail;
  }

  public void setPersonalEmail(@javax.annotation.Nullable String personalEmail) {
    this.personalEmail = personalEmail;
  }


  public UpdatePeoplePersonalInformationByExternalIdRequestData preferredName(@javax.annotation.Nullable String preferredName) {
    this.preferredName = preferredName;
    return this;
  }

  /**
   * The preferred name of the worker.
   * @return preferredName
   */
  @javax.annotation.Nullable
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(@javax.annotation.Nullable String preferredName) {
    this.preferredName = preferredName;
  }


  public UpdatePeoplePersonalInformationByExternalIdRequestData legalLastName(@javax.annotation.Nullable String legalLastName) {
    this.legalLastName = legalLastName;
    return this;
  }

  /**
   * The legal last name of the worker.
   * @return legalLastName
   */
  @javax.annotation.Nullable
  public String getLegalLastName() {
    return legalLastName;
  }

  public void setLegalLastName(@javax.annotation.Nullable String legalLastName) {
    this.legalLastName = legalLastName;
  }


  public UpdatePeoplePersonalInformationByExternalIdRequestData legalFirstName(@javax.annotation.Nullable String legalFirstName) {
    this.legalFirstName = legalFirstName;
    return this;
  }

  /**
   * The legal first name of the worker.
   * @return legalFirstName
   */
  @javax.annotation.Nullable
  public String getLegalFirstName() {
    return legalFirstName;
  }

  public void setLegalFirstName(@javax.annotation.Nullable String legalFirstName) {
    this.legalFirstName = legalFirstName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePeoplePersonalInformationByExternalIdRequestData updatePeoplePersonalInformationByExternalIdRequestData = (UpdatePeoplePersonalInformationByExternalIdRequestData) o;
    return Objects.equals(this.dateOfBirth, updatePeoplePersonalInformationByExternalIdRequestData.dateOfBirth) &&
        Objects.equals(this.personalEmail, updatePeoplePersonalInformationByExternalIdRequestData.personalEmail) &&
        Objects.equals(this.preferredName, updatePeoplePersonalInformationByExternalIdRequestData.preferredName) &&
        Objects.equals(this.legalLastName, updatePeoplePersonalInformationByExternalIdRequestData.legalLastName) &&
        Objects.equals(this.legalFirstName, updatePeoplePersonalInformationByExternalIdRequestData.legalFirstName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, personalEmail, preferredName, legalLastName, legalFirstName);
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
    sb.append("class UpdatePeoplePersonalInformationByExternalIdRequestData {\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
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
    openapiFields.add("date_of_birth");
    openapiFields.add("personal_email");
    openapiFields.add("preferred_name");
    openapiFields.add("legal_last_name");
    openapiFields.add("legal_first_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePeoplePersonalInformationByExternalIdRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePeoplePersonalInformationByExternalIdRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePeoplePersonalInformationByExternalIdRequestData is not found in the empty JSON string", UpdatePeoplePersonalInformationByExternalIdRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePeoplePersonalInformationByExternalIdRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePeoplePersonalInformationByExternalIdRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("personal_email") != null && !jsonObj.get("personal_email").isJsonNull()) && !jsonObj.get("personal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_email").toString()));
      }
      if ((jsonObj.get("preferred_name") != null && !jsonObj.get("preferred_name").isJsonNull()) && !jsonObj.get("preferred_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferred_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferred_name").toString()));
      }
      if ((jsonObj.get("legal_last_name") != null && !jsonObj.get("legal_last_name").isJsonNull()) && !jsonObj.get("legal_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_last_name").toString()));
      }
      if ((jsonObj.get("legal_first_name") != null && !jsonObj.get("legal_first_name").isJsonNull()) && !jsonObj.get("legal_first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_first_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePeoplePersonalInformationByExternalIdRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePeoplePersonalInformationByExternalIdRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePeoplePersonalInformationByExternalIdRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePeoplePersonalInformationByExternalIdRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePeoplePersonalInformationByExternalIdRequestData>() {
           @Override
           public void write(JsonWriter out, UpdatePeoplePersonalInformationByExternalIdRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePeoplePersonalInformationByExternalIdRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdatePeoplePersonalInformationByExternalIdRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePeoplePersonalInformationByExternalIdRequestData
   * @throws IOException if the JSON string is invalid with respect to UpdatePeoplePersonalInformationByExternalIdRequestData
   */
  public static UpdatePeoplePersonalInformationByExternalIdRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePeoplePersonalInformationByExternalIdRequestData.class);
  }

  /**
   * Convert an instance of UpdatePeoplePersonalInformationByExternalIdRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

