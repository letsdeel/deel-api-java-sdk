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
import org.openapitools.client.model.AlternateEmailItem;
import org.openapitools.client.model.WorkerLegalEntity;
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
 * WorkerOfContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class WorkerOfContract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nullable
  private String fullName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_ALTERNATE_EMAIL = "alternate_email";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_EMAIL)
  @javax.annotation.Nullable
  private List<AlternateEmailItem> alternateEmail = new ArrayList<>();

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  @javax.annotation.Nullable
  private String nationality;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @javax.annotation.Nullable
  private String image;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legal_entity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  @javax.annotation.Nullable
  private WorkerLegalEntity legalEntity;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private OffsetDateTime dateOfBirth;

  public static final String SERIALIZED_NAME_EXPECTED_EMAIL = "expected_email";
  @SerializedName(SERIALIZED_NAME_EXPECTED_EMAIL)
  @javax.annotation.Nullable
  private String expectedEmail;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public WorkerOfContract() {
  }

  public WorkerOfContract id(@javax.annotation.Nullable String id) {
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


  public WorkerOfContract fullName(@javax.annotation.Nullable String fullName) {
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


  public WorkerOfContract email(@javax.annotation.Nullable String email) {
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


  public WorkerOfContract alternateEmail(@javax.annotation.Nullable List<AlternateEmailItem> alternateEmail) {
    this.alternateEmail = alternateEmail;
    return this;
  }

  public WorkerOfContract addAlternateEmailItem(AlternateEmailItem alternateEmailItem) {
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
  public List<AlternateEmailItem> getAlternateEmail() {
    return alternateEmail;
  }

  public void setAlternateEmail(@javax.annotation.Nullable List<AlternateEmailItem> alternateEmail) {
    this.alternateEmail = alternateEmail;
  }


  public WorkerOfContract nationality(@javax.annotation.Nullable String nationality) {
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


  public WorkerOfContract image(@javax.annotation.Nullable String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }

  public void setImage(@javax.annotation.Nullable String image) {
    this.image = image;
  }


  public WorkerOfContract legalEntity(@javax.annotation.Nullable WorkerLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
   */
  @javax.annotation.Nullable
  public WorkerLegalEntity getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(@javax.annotation.Nullable WorkerLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
  }


  public WorkerOfContract dateOfBirth(@javax.annotation.Nullable OffsetDateTime dateOfBirth) {
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


  public WorkerOfContract expectedEmail(@javax.annotation.Nullable String expectedEmail) {
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


  public WorkerOfContract firstName(@javax.annotation.Nullable String firstName) {
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


  public WorkerOfContract lastName(@javax.annotation.Nullable String lastName) {
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


  public WorkerOfContract country(@javax.annotation.Nullable String country) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerOfContract workerOfContract = (WorkerOfContract) o;
    return Objects.equals(this.id, workerOfContract.id) &&
        Objects.equals(this.fullName, workerOfContract.fullName) &&
        Objects.equals(this.email, workerOfContract.email) &&
        Objects.equals(this.alternateEmail, workerOfContract.alternateEmail) &&
        Objects.equals(this.nationality, workerOfContract.nationality) &&
        Objects.equals(this.image, workerOfContract.image) &&
        Objects.equals(this.legalEntity, workerOfContract.legalEntity) &&
        Objects.equals(this.dateOfBirth, workerOfContract.dateOfBirth) &&
        Objects.equals(this.expectedEmail, workerOfContract.expectedEmail) &&
        Objects.equals(this.firstName, workerOfContract.firstName) &&
        Objects.equals(this.lastName, workerOfContract.lastName) &&
        Objects.equals(this.country, workerOfContract.country);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, email, alternateEmail, nationality, image, legalEntity, dateOfBirth, expectedEmail, firstName, lastName, country);
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
    sb.append("class WorkerOfContract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    alternateEmail: ").append(toIndentedString(alternateEmail)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    expectedEmail: ").append(toIndentedString(expectedEmail)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("full_name");
    openapiFields.add("email");
    openapiFields.add("alternate_email");
    openapiFields.add("nationality");
    openapiFields.add("image");
    openapiFields.add("legal_entity");
    openapiFields.add("date_of_birth");
    openapiFields.add("expected_email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkerOfContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkerOfContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerOfContract is not found in the empty JSON string", WorkerOfContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkerOfContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkerOfContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
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
            AlternateEmailItem.validateJsonElement(jsonArrayalternateEmail.get(i));
          };
        }
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      // validate the optional field `legal_entity`
      if (jsonObj.get("legal_entity") != null && !jsonObj.get("legal_entity").isJsonNull()) {
        WorkerLegalEntity.validateJsonElement(jsonObj.get("legal_entity"));
      }
      if ((jsonObj.get("expected_email") != null && !jsonObj.get("expected_email").isJsonNull()) && !jsonObj.get("expected_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_email").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerOfContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerOfContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerOfContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerOfContract.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerOfContract>() {
           @Override
           public void write(JsonWriter out, WorkerOfContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerOfContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkerOfContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkerOfContract
   * @throws IOException if the JSON string is invalid with respect to WorkerOfContract
   */
  public static WorkerOfContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerOfContract.class);
  }

  /**
   * Convert an instance of WorkerOfContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

