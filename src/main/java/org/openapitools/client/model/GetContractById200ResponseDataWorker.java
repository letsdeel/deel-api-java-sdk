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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RootSchema1;
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
 * GetContractById200ResponseDataWorker
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseDataWorker {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nullable
  private String fullName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  @javax.annotation.Nullable
  private String nationality;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_EXPECTED_EMAIL = "expected_email";
  @SerializedName(SERIALIZED_NAME_EXPECTED_EMAIL)
  @javax.annotation.Nullable
  private String expectedEmail;

  public static final String SERIALIZED_NAME_ALTERNATE_EMAIL = "alternate_email";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_EMAIL)
  @javax.annotation.Nullable
  private List<RootSchema1> alternateEmail;

  public GetContractById200ResponseDataWorker() {
  }

  public GetContractById200ResponseDataWorker id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetContractById200ResponseDataWorker email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * User&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public GetContractById200ResponseDataWorker country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of the worker.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetContractById200ResponseDataWorker fullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the client.
   * @return fullName
   */
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
  }


  public GetContractById200ResponseDataWorker lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the worker.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public GetContractById200ResponseDataWorker firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the worker.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public GetContractById200ResponseDataWorker nationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Nationality of the worker.
   * @return nationality
   */
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }

  public void setNationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
  }


  public GetContractById200ResponseDataWorker dateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Date of birth of the worker.
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public GetContractById200ResponseDataWorker expectedEmail(@javax.annotation.Nullable String expectedEmail) {
    this.expectedEmail = expectedEmail;
    return this;
  }

  /**
   * Get expectedEmail
   * @return expectedEmail
   */
  @javax.annotation.Nullable
  public String getExpectedEmail() {
    return expectedEmail;
  }

  public void setExpectedEmail(@javax.annotation.Nullable String expectedEmail) {
    this.expectedEmail = expectedEmail;
  }


  public GetContractById200ResponseDataWorker alternateEmail(@javax.annotation.Nullable List<RootSchema1> alternateEmail) {
    this.alternateEmail = alternateEmail;
    return this;
  }

  public GetContractById200ResponseDataWorker addAlternateEmailItem(RootSchema1 alternateEmailItem) {
    if (this.alternateEmail == null) {
      this.alternateEmail = new ArrayList<>();
    }
    this.alternateEmail.add(alternateEmailItem);
    return this;
  }

  /**
   * List of alternate email addresses.
   * @return alternateEmail
   */
  @javax.annotation.Nullable
  public List<RootSchema1> getAlternateEmail() {
    return alternateEmail;
  }

  public void setAlternateEmail(@javax.annotation.Nullable List<RootSchema1> alternateEmail) {
    this.alternateEmail = alternateEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractById200ResponseDataWorker getContractById200ResponseDataWorker = (GetContractById200ResponseDataWorker) o;
    return Objects.equals(this.id, getContractById200ResponseDataWorker.id) &&
        Objects.equals(this.email, getContractById200ResponseDataWorker.email) &&
        Objects.equals(this.country, getContractById200ResponseDataWorker.country) &&
        Objects.equals(this.fullName, getContractById200ResponseDataWorker.fullName) &&
        Objects.equals(this.lastName, getContractById200ResponseDataWorker.lastName) &&
        Objects.equals(this.firstName, getContractById200ResponseDataWorker.firstName) &&
        Objects.equals(this.nationality, getContractById200ResponseDataWorker.nationality) &&
        Objects.equals(this.dateOfBirth, getContractById200ResponseDataWorker.dateOfBirth) &&
        Objects.equals(this.expectedEmail, getContractById200ResponseDataWorker.expectedEmail) &&
        Objects.equals(this.alternateEmail, getContractById200ResponseDataWorker.alternateEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, country, fullName, lastName, firstName, nationality, dateOfBirth, expectedEmail, alternateEmail);
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
    sb.append("class GetContractById200ResponseDataWorker {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    expectedEmail: ").append(toIndentedString(expectedEmail)).append("\n");
    sb.append("    alternateEmail: ").append(toIndentedString(alternateEmail)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("country");
    openapiFields.add("full_name");
    openapiFields.add("last_name");
    openapiFields.add("first_name");
    openapiFields.add("nationality");
    openapiFields.add("date_of_birth");
    openapiFields.add("expected_email");
    openapiFields.add("alternate_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseDataWorker
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseDataWorker.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseDataWorker is not found in the empty JSON string", GetContractById200ResponseDataWorker.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseDataWorker.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseDataWorker` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("expected_email") != null && !jsonObj.get("expected_email").isJsonNull()) && !jsonObj.get("expected_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_email").toString()));
      }
      if (jsonObj.get("alternate_email") != null && !jsonObj.get("alternate_email").isJsonNull()) {
        JsonArray jsonArrayalternateEmail = jsonObj.getAsJsonArray("alternate_email");
        if (jsonArrayalternateEmail != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alternate_email").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alternate_email` to be an array in the JSON string but got `%s`", jsonObj.get("alternate_email").toString()));
          }

          // validate the optional field `alternate_email` (array)
          for (int i = 0; i < jsonArrayalternateEmail.size(); i++) {
            RootSchema1.validateJsonElement(jsonArrayalternateEmail.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseDataWorker.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseDataWorker' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseDataWorker> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseDataWorker.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseDataWorker>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseDataWorker value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseDataWorker read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseDataWorker given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseDataWorker
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseDataWorker
   */
  public static GetContractById200ResponseDataWorker fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseDataWorker.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseDataWorker to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

