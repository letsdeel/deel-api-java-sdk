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
import org.openapitools.client.model.CandidateStatusEnum;

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
 * Details of candidate to update
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class CandidateToPatch {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private CandidateStatusEnum status;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nullable
  private String jobTitle;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  @javax.annotation.Nullable
  private String link;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  @javax.annotation.Nullable
  private String nationality;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public CandidateToPatch() {
  }

  public CandidateToPatch firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Candidate&#39;s first name.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public CandidateToPatch lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Candidate&#39;s last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public CandidateToPatch status(@javax.annotation.Nonnull CandidateStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public CandidateStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull CandidateStatusEnum status) {
    this.status = status;
  }


  public CandidateToPatch startDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return startDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
  }


  public CandidateToPatch jobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Job Title.
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public CandidateToPatch link(@javax.annotation.Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Link to candidate&#39;s profile in ATS.
   * @return link
   */
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = link;
  }


  public CandidateToPatch email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Worker&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public CandidateToPatch nationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }

  public void setNationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
  }


  public CandidateToPatch country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public CandidateToPatch state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Job location state.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateToPatch candidateToPatch = (CandidateToPatch) o;
    return Objects.equals(this.firstName, candidateToPatch.firstName) &&
        Objects.equals(this.lastName, candidateToPatch.lastName) &&
        Objects.equals(this.status, candidateToPatch.status) &&
        Objects.equals(this.startDate, candidateToPatch.startDate) &&
        Objects.equals(this.jobTitle, candidateToPatch.jobTitle) &&
        Objects.equals(this.link, candidateToPatch.link) &&
        Objects.equals(this.email, candidateToPatch.email) &&
        Objects.equals(this.nationality, candidateToPatch.nationality) &&
        Objects.equals(this.country, candidateToPatch.country) &&
        Objects.equals(this.state, candidateToPatch.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, status, startDate, jobTitle, link, email, nationality, country, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateToPatch {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("status");
    openapiFields.add("start_date");
    openapiFields.add("job_title");
    openapiFields.add("link");
    openapiFields.add("email");
    openapiFields.add("nationality");
    openapiFields.add("country");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CandidateToPatch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CandidateToPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CandidateToPatch is not found in the empty JSON string", CandidateToPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CandidateToPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CandidateToPatch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CandidateToPatch.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      // validate the required field `status`
      CandidateStatusEnum.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) && !jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CandidateToPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CandidateToPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CandidateToPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CandidateToPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<CandidateToPatch>() {
           @Override
           public void write(JsonWriter out, CandidateToPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CandidateToPatch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CandidateToPatch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CandidateToPatch
   * @throws IOException if the JSON string is invalid with respect to CandidateToPatch
   */
  public static CandidateToPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CandidateToPatch.class);
  }

  /**
   * Convert an instance of CandidateToPatch to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

