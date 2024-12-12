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
import org.openapitools.client.model.PeoplePersonalContainerDataPhoneNumbersInner;
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
 * UserPersonalInformationToUpdateContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T13:30:33.173921421Z[GMT]", comments = "Generator version: 7.10.0")
public class UserPersonalInformationToUpdateContainerData {
  public static final String SERIALIZED_NAME_LEGAL_FIRST_NAME = "legal_first_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_FIRST_NAME)
  @javax.annotation.Nullable
  private String legalFirstName;

  public static final String SERIALIZED_NAME_LEGAL_LAST_NAME = "legal_last_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_LAST_NAME)
  @javax.annotation.Nullable
  private String legalLastName;

  public static final String SERIALIZED_NAME_PREFERRED_NAME = "preferred_name";
  @SerializedName(SERIALIZED_NAME_PREFERRED_NAME)
  @javax.annotation.Nullable
  private String preferredName;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  @javax.annotation.Nullable
  private String personalEmail;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nullable
  private String workEmail;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  @javax.annotation.Nullable
  private List<PeoplePersonalContainerDataPhoneNumbersInner> phoneNumbers = new ArrayList<>();

  public UserPersonalInformationToUpdateContainerData() {
  }

  public UserPersonalInformationToUpdateContainerData legalFirstName(@javax.annotation.Nullable String legalFirstName) {
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


  public UserPersonalInformationToUpdateContainerData legalLastName(@javax.annotation.Nullable String legalLastName) {
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


  public UserPersonalInformationToUpdateContainerData preferredName(@javax.annotation.Nullable String preferredName) {
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


  public UserPersonalInformationToUpdateContainerData personalEmail(@javax.annotation.Nullable String personalEmail) {
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


  public UserPersonalInformationToUpdateContainerData workEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * The work email of the worker.
   * @return workEmail
   */
  @javax.annotation.Nullable
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
  }


  public UserPersonalInformationToUpdateContainerData dateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
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


  public UserPersonalInformationToUpdateContainerData phoneNumbers(@javax.annotation.Nullable List<PeoplePersonalContainerDataPhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public UserPersonalInformationToUpdateContainerData addPhoneNumbersItem(PeoplePersonalContainerDataPhoneNumbersInner phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * Get phoneNumbers
   * @return phoneNumbers
   */
  @javax.annotation.Nullable
  public List<PeoplePersonalContainerDataPhoneNumbersInner> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(@javax.annotation.Nullable List<PeoplePersonalContainerDataPhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPersonalInformationToUpdateContainerData userPersonalInformationToUpdateContainerData = (UserPersonalInformationToUpdateContainerData) o;
    return Objects.equals(this.legalFirstName, userPersonalInformationToUpdateContainerData.legalFirstName) &&
        Objects.equals(this.legalLastName, userPersonalInformationToUpdateContainerData.legalLastName) &&
        Objects.equals(this.preferredName, userPersonalInformationToUpdateContainerData.preferredName) &&
        Objects.equals(this.personalEmail, userPersonalInformationToUpdateContainerData.personalEmail) &&
        Objects.equals(this.workEmail, userPersonalInformationToUpdateContainerData.workEmail) &&
        Objects.equals(this.dateOfBirth, userPersonalInformationToUpdateContainerData.dateOfBirth) &&
        Objects.equals(this.phoneNumbers, userPersonalInformationToUpdateContainerData.phoneNumbers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalFirstName, legalLastName, preferredName, personalEmail, workEmail, dateOfBirth, phoneNumbers);
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
    sb.append("class UserPersonalInformationToUpdateContainerData {\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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
    openapiFields.add("legal_first_name");
    openapiFields.add("legal_last_name");
    openapiFields.add("preferred_name");
    openapiFields.add("personal_email");
    openapiFields.add("work_email");
    openapiFields.add("date_of_birth");
    openapiFields.add("phone_numbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserPersonalInformationToUpdateContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserPersonalInformationToUpdateContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserPersonalInformationToUpdateContainerData is not found in the empty JSON string", UserPersonalInformationToUpdateContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserPersonalInformationToUpdateContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserPersonalInformationToUpdateContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("legal_first_name") != null && !jsonObj.get("legal_first_name").isJsonNull()) && !jsonObj.get("legal_first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_first_name").toString()));
      }
      if ((jsonObj.get("legal_last_name") != null && !jsonObj.get("legal_last_name").isJsonNull()) && !jsonObj.get("legal_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_last_name").toString()));
      }
      if ((jsonObj.get("preferred_name") != null && !jsonObj.get("preferred_name").isJsonNull()) && !jsonObj.get("preferred_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferred_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferred_name").toString()));
      }
      if ((jsonObj.get("personal_email") != null && !jsonObj.get("personal_email").isJsonNull()) && !jsonObj.get("personal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_email").toString()));
      }
      if ((jsonObj.get("work_email") != null && !jsonObj.get("work_email").isJsonNull()) && !jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
      if (jsonObj.get("phone_numbers") != null && !jsonObj.get("phone_numbers").isJsonNull()) {
        JsonArray jsonArrayphoneNumbers = jsonObj.getAsJsonArray("phone_numbers");
        if (jsonArrayphoneNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("phone_numbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `phone_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("phone_numbers").toString()));
          }

          // validate the optional field `phone_numbers` (array)
          for (int i = 0; i < jsonArrayphoneNumbers.size(); i++) {
            PeoplePersonalContainerDataPhoneNumbersInner.validateJsonElement(jsonArrayphoneNumbers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserPersonalInformationToUpdateContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserPersonalInformationToUpdateContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserPersonalInformationToUpdateContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserPersonalInformationToUpdateContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<UserPersonalInformationToUpdateContainerData>() {
           @Override
           public void write(JsonWriter out, UserPersonalInformationToUpdateContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserPersonalInformationToUpdateContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserPersonalInformationToUpdateContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserPersonalInformationToUpdateContainerData
   * @throws IOException if the JSON string is invalid with respect to UserPersonalInformationToUpdateContainerData
   */
  public static UserPersonalInformationToUpdateContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserPersonalInformationToUpdateContainerData.class);
  }

  /**
   * Convert an instance of UserPersonalInformationToUpdateContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

