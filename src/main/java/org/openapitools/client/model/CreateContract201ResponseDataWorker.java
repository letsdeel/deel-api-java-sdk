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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateContract201ResponseDataWorkerLegalEntity;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfClientTeamId;
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
 * CreateContract201ResponseDataWorker
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataWorker {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private PAYASYOUGOTIMEBASEDAllOfClientTeamId id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @javax.annotation.Nullable
  private String image;

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

  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legal_entity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  @javax.annotation.Nullable
  private CreateContract201ResponseDataWorkerLegalEntity legalEntity;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private OffsetDateTime dateOfBirth;

  public static final String SERIALIZED_NAME_EXPECTED_EMAIL = "expected_email";
  @SerializedName(SERIALIZED_NAME_EXPECTED_EMAIL)
  @javax.annotation.Nullable
  private String expectedEmail;

  public static final String SERIALIZED_NAME_ALTERNATE_EMAIL = "alternate_email";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_EMAIL)
  @javax.annotation.Nullable
  private List<RootSchema1> alternateEmail = new ArrayList<>();

  public CreateContract201ResponseDataWorker() {
  }

  public CreateContract201ResponseDataWorker id(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfClientTeamId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public PAYASYOUGOTIMEBASEDAllOfClientTeamId getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfClientTeamId id) {
    this.id = id;
  }


  public CreateContract201ResponseDataWorker email(@javax.annotation.Nullable String email) {
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


  public CreateContract201ResponseDataWorker image(@javax.annotation.Nullable String image) {
    this.image = image;
    return this;
  }

  /**
   * URL to worker&#39;s image
   * @return image
   */
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }

  public void setImage(@javax.annotation.Nullable String image) {
    this.image = image;
  }


  public CreateContract201ResponseDataWorker country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Worker&#39;s country (location not nationality)
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public CreateContract201ResponseDataWorker fullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Worker&#39;s full name.
   * @return fullName
   */
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
  }


  public CreateContract201ResponseDataWorker lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Worker&#39;s last name
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public CreateContract201ResponseDataWorker firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Worker&#39;s first name
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public CreateContract201ResponseDataWorker nationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Worker&#39;s nationality.
   * @return nationality
   */
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }

  public void setNationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
  }


  public CreateContract201ResponseDataWorker legalEntity(@javax.annotation.Nullable CreateContract201ResponseDataWorkerLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
   */
  @javax.annotation.Nullable
  public CreateContract201ResponseDataWorkerLegalEntity getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(@javax.annotation.Nullable CreateContract201ResponseDataWorkerLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
  }


  public CreateContract201ResponseDataWorker dateOfBirth(@javax.annotation.Nullable OffsetDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nullable OffsetDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public CreateContract201ResponseDataWorker expectedEmail(@javax.annotation.Nullable String expectedEmail) {
    this.expectedEmail = expectedEmail;
    return this;
  }

  /**
   * Worker&#39;s email address.
   * @return expectedEmail
   */
  @javax.annotation.Nullable
  public String getExpectedEmail() {
    return expectedEmail;
  }

  public void setExpectedEmail(@javax.annotation.Nullable String expectedEmail) {
    this.expectedEmail = expectedEmail;
  }


  public CreateContract201ResponseDataWorker alternateEmail(@javax.annotation.Nullable List<RootSchema1> alternateEmail) {
    this.alternateEmail = alternateEmail;
    return this;
  }

  public CreateContract201ResponseDataWorker addAlternateEmailItem(RootSchema1 alternateEmailItem) {
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
    CreateContract201ResponseDataWorker createContract201ResponseDataWorker = (CreateContract201ResponseDataWorker) o;
    return Objects.equals(this.id, createContract201ResponseDataWorker.id) &&
        Objects.equals(this.email, createContract201ResponseDataWorker.email) &&
        Objects.equals(this.image, createContract201ResponseDataWorker.image) &&
        Objects.equals(this.country, createContract201ResponseDataWorker.country) &&
        Objects.equals(this.fullName, createContract201ResponseDataWorker.fullName) &&
        Objects.equals(this.lastName, createContract201ResponseDataWorker.lastName) &&
        Objects.equals(this.firstName, createContract201ResponseDataWorker.firstName) &&
        Objects.equals(this.nationality, createContract201ResponseDataWorker.nationality) &&
        Objects.equals(this.legalEntity, createContract201ResponseDataWorker.legalEntity) &&
        Objects.equals(this.dateOfBirth, createContract201ResponseDataWorker.dateOfBirth) &&
        Objects.equals(this.expectedEmail, createContract201ResponseDataWorker.expectedEmail) &&
        Objects.equals(this.alternateEmail, createContract201ResponseDataWorker.alternateEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, image, country, fullName, lastName, firstName, nationality, legalEntity, dateOfBirth, expectedEmail, alternateEmail);
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
    sb.append("class CreateContract201ResponseDataWorker {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("country");
    openapiFields.add("full_name");
    openapiFields.add("last_name");
    openapiFields.add("first_name");
    openapiFields.add("nationality");
    openapiFields.add("legal_entity");
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
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataWorker
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataWorker.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataWorker is not found in the empty JSON string", CreateContract201ResponseDataWorker.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataWorker.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataWorker` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        PAYASYOUGOTIMEBASEDAllOfClientTeamId.validateJsonElement(jsonObj.get("id"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
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
      // validate the optional field `legal_entity`
      if (jsonObj.get("legal_entity") != null && !jsonObj.get("legal_entity").isJsonNull()) {
        CreateContract201ResponseDataWorkerLegalEntity.validateJsonElement(jsonObj.get("legal_entity"));
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
       if (!CreateContract201ResponseDataWorker.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataWorker' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataWorker> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataWorker.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataWorker>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataWorker value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataWorker read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataWorker given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataWorker
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataWorker
   */
  public static CreateContract201ResponseDataWorker fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataWorker.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataWorker to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

