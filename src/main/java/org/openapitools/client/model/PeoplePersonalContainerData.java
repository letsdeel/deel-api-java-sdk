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
import org.openapitools.client.model.PeoplePersonalContainerDataAddressesInner;
import org.openapitools.client.model.PeoplePersonalContainerDataDemographics;
import org.openapitools.client.model.PeoplePersonalContainerDataEmergencyContactsInner;
import org.openapitools.client.model.PeoplePersonalContainerDataKyc;
import org.openapitools.client.model.PeoplePersonalContainerDataNationalitiesInner;
import org.openapitools.client.model.PeoplePersonalContainerDataOoo;
import org.openapitools.client.model.PeoplePersonalContainerDataPhoneNumbersInner;

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
 * PeoplePersonalContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class PeoplePersonalContainerData {
  public static final String SERIALIZED_NAME_LEGAL_FIRST_NAME = "legal_first_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_FIRST_NAME)
  @javax.annotation.Nonnull
  private String legalFirstName;

  public static final String SERIALIZED_NAME_LEGAL_LAST_NAME = "legal_last_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_LAST_NAME)
  @javax.annotation.Nonnull
  private String legalLastName;

  public static final String SERIALIZED_NAME_PREFERRED_NAME = "preferred_name";
  @SerializedName(SERIALIZED_NAME_PREFERRED_NAME)
  @javax.annotation.Nonnull
  private String preferredName;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  @javax.annotation.Nonnull
  private String personalEmail;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nonnull
  private String workEmail;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nonnull
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  @javax.annotation.Nonnull
  private List<PeoplePersonalContainerDataPhoneNumbersInner> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_NATIONALITIES = "nationalities";
  @SerializedName(SERIALIZED_NAME_NATIONALITIES)
  @javax.annotation.Nonnull
  private List<PeoplePersonalContainerDataNationalitiesInner> nationalities = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMERGENCY_CONTACTS = "emergency_contacts";
  @SerializedName(SERIALIZED_NAME_EMERGENCY_CONTACTS)
  @javax.annotation.Nonnull
  private List<PeoplePersonalContainerDataEmergencyContactsInner> emergencyContacts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  @javax.annotation.Nonnull
  private List<PeoplePersonalContainerDataAddressesInner> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEMOGRAPHICS = "demographics";
  @SerializedName(SERIALIZED_NAME_DEMOGRAPHICS)
  @javax.annotation.Nonnull
  private PeoplePersonalContainerDataDemographics demographics;

  public static final String SERIALIZED_NAME_KYC = "kyc";
  @SerializedName(SERIALIZED_NAME_KYC)
  @javax.annotation.Nullable
  private PeoplePersonalContainerDataKyc kyc;

  public static final String SERIALIZED_NAME_OOO = "ooo";
  @SerializedName(SERIALIZED_NAME_OOO)
  @javax.annotation.Nullable
  private PeoplePersonalContainerDataOoo ooo;

  public PeoplePersonalContainerData() {
  }

  public PeoplePersonalContainerData legalFirstName(@javax.annotation.Nonnull String legalFirstName) {
    this.legalFirstName = legalFirstName;
    return this;
  }

  /**
   * The legal first name of the worker.
   * @return legalFirstName
   */
  @javax.annotation.Nonnull
  public String getLegalFirstName() {
    return legalFirstName;
  }

  public void setLegalFirstName(@javax.annotation.Nonnull String legalFirstName) {
    this.legalFirstName = legalFirstName;
  }


  public PeoplePersonalContainerData legalLastName(@javax.annotation.Nonnull String legalLastName) {
    this.legalLastName = legalLastName;
    return this;
  }

  /**
   * The legal last name of the worker.
   * @return legalLastName
   */
  @javax.annotation.Nonnull
  public String getLegalLastName() {
    return legalLastName;
  }

  public void setLegalLastName(@javax.annotation.Nonnull String legalLastName) {
    this.legalLastName = legalLastName;
  }


  public PeoplePersonalContainerData preferredName(@javax.annotation.Nonnull String preferredName) {
    this.preferredName = preferredName;
    return this;
  }

  /**
   * The preferred name of the worker.
   * @return preferredName
   */
  @javax.annotation.Nonnull
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(@javax.annotation.Nonnull String preferredName) {
    this.preferredName = preferredName;
  }


  public PeoplePersonalContainerData personalEmail(@javax.annotation.Nonnull String personalEmail) {
    this.personalEmail = personalEmail;
    return this;
  }

  /**
   * The personal email of the worker.
   * @return personalEmail
   */
  @javax.annotation.Nonnull
  public String getPersonalEmail() {
    return personalEmail;
  }

  public void setPersonalEmail(@javax.annotation.Nonnull String personalEmail) {
    this.personalEmail = personalEmail;
  }


  public PeoplePersonalContainerData workEmail(@javax.annotation.Nonnull String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * The work email of the worker.
   * @return workEmail
   */
  @javax.annotation.Nonnull
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nonnull String workEmail) {
    this.workEmail = workEmail;
  }


  public PeoplePersonalContainerData dateOfBirth(@javax.annotation.Nonnull LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * The date of birth of the worker. Format: YYYY-MM-DD.
   * @return dateOfBirth
   */
  @javax.annotation.Nonnull
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nonnull LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PeoplePersonalContainerData phoneNumbers(@javax.annotation.Nonnull List<PeoplePersonalContainerDataPhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PeoplePersonalContainerData addPhoneNumbersItem(PeoplePersonalContainerDataPhoneNumbersInner phoneNumbersItem) {
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
  @javax.annotation.Nonnull
  public List<PeoplePersonalContainerDataPhoneNumbersInner> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(@javax.annotation.Nonnull List<PeoplePersonalContainerDataPhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public PeoplePersonalContainerData nationalities(@javax.annotation.Nonnull List<PeoplePersonalContainerDataNationalitiesInner> nationalities) {
    this.nationalities = nationalities;
    return this;
  }

  public PeoplePersonalContainerData addNationalitiesItem(PeoplePersonalContainerDataNationalitiesInner nationalitiesItem) {
    if (this.nationalities == null) {
      this.nationalities = new ArrayList<>();
    }
    this.nationalities.add(nationalitiesItem);
    return this;
  }

  /**
   * Get nationalities
   * @return nationalities
   */
  @javax.annotation.Nonnull
  public List<PeoplePersonalContainerDataNationalitiesInner> getNationalities() {
    return nationalities;
  }

  public void setNationalities(@javax.annotation.Nonnull List<PeoplePersonalContainerDataNationalitiesInner> nationalities) {
    this.nationalities = nationalities;
  }


  public PeoplePersonalContainerData emergencyContacts(@javax.annotation.Nonnull List<PeoplePersonalContainerDataEmergencyContactsInner> emergencyContacts) {
    this.emergencyContacts = emergencyContacts;
    return this;
  }

  public PeoplePersonalContainerData addEmergencyContactsItem(PeoplePersonalContainerDataEmergencyContactsInner emergencyContactsItem) {
    if (this.emergencyContacts == null) {
      this.emergencyContacts = new ArrayList<>();
    }
    this.emergencyContacts.add(emergencyContactsItem);
    return this;
  }

  /**
   * Get emergencyContacts
   * @return emergencyContacts
   */
  @javax.annotation.Nonnull
  public List<PeoplePersonalContainerDataEmergencyContactsInner> getEmergencyContacts() {
    return emergencyContacts;
  }

  public void setEmergencyContacts(@javax.annotation.Nonnull List<PeoplePersonalContainerDataEmergencyContactsInner> emergencyContacts) {
    this.emergencyContacts = emergencyContacts;
  }


  public PeoplePersonalContainerData addresses(@javax.annotation.Nonnull List<PeoplePersonalContainerDataAddressesInner> addresses) {
    this.addresses = addresses;
    return this;
  }

  public PeoplePersonalContainerData addAddressesItem(PeoplePersonalContainerDataAddressesInner addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
   */
  @javax.annotation.Nonnull
  public List<PeoplePersonalContainerDataAddressesInner> getAddresses() {
    return addresses;
  }

  public void setAddresses(@javax.annotation.Nonnull List<PeoplePersonalContainerDataAddressesInner> addresses) {
    this.addresses = addresses;
  }


  public PeoplePersonalContainerData demographics(@javax.annotation.Nonnull PeoplePersonalContainerDataDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
   */
  @javax.annotation.Nonnull
  public PeoplePersonalContainerDataDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(@javax.annotation.Nonnull PeoplePersonalContainerDataDemographics demographics) {
    this.demographics = demographics;
  }


  public PeoplePersonalContainerData kyc(@javax.annotation.Nullable PeoplePersonalContainerDataKyc kyc) {
    this.kyc = kyc;
    return this;
  }

  /**
   * Get kyc
   * @return kyc
   */
  @javax.annotation.Nullable
  public PeoplePersonalContainerDataKyc getKyc() {
    return kyc;
  }

  public void setKyc(@javax.annotation.Nullable PeoplePersonalContainerDataKyc kyc) {
    this.kyc = kyc;
  }


  public PeoplePersonalContainerData ooo(@javax.annotation.Nullable PeoplePersonalContainerDataOoo ooo) {
    this.ooo = ooo;
    return this;
  }

  /**
   * Get ooo
   * @return ooo
   */
  @javax.annotation.Nullable
  public PeoplePersonalContainerDataOoo getOoo() {
    return ooo;
  }

  public void setOoo(@javax.annotation.Nullable PeoplePersonalContainerDataOoo ooo) {
    this.ooo = ooo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeoplePersonalContainerData peoplePersonalContainerData = (PeoplePersonalContainerData) o;
    return Objects.equals(this.legalFirstName, peoplePersonalContainerData.legalFirstName) &&
        Objects.equals(this.legalLastName, peoplePersonalContainerData.legalLastName) &&
        Objects.equals(this.preferredName, peoplePersonalContainerData.preferredName) &&
        Objects.equals(this.personalEmail, peoplePersonalContainerData.personalEmail) &&
        Objects.equals(this.workEmail, peoplePersonalContainerData.workEmail) &&
        Objects.equals(this.dateOfBirth, peoplePersonalContainerData.dateOfBirth) &&
        Objects.equals(this.phoneNumbers, peoplePersonalContainerData.phoneNumbers) &&
        Objects.equals(this.nationalities, peoplePersonalContainerData.nationalities) &&
        Objects.equals(this.emergencyContacts, peoplePersonalContainerData.emergencyContacts) &&
        Objects.equals(this.addresses, peoplePersonalContainerData.addresses) &&
        Objects.equals(this.demographics, peoplePersonalContainerData.demographics) &&
        Objects.equals(this.kyc, peoplePersonalContainerData.kyc) &&
        Objects.equals(this.ooo, peoplePersonalContainerData.ooo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalFirstName, legalLastName, preferredName, personalEmail, workEmail, dateOfBirth, phoneNumbers, nationalities, emergencyContacts, addresses, demographics, kyc, ooo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeoplePersonalContainerData {\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    nationalities: ").append(toIndentedString(nationalities)).append("\n");
    sb.append("    emergencyContacts: ").append(toIndentedString(emergencyContacts)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    kyc: ").append(toIndentedString(kyc)).append("\n");
    sb.append("    ooo: ").append(toIndentedString(ooo)).append("\n");
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
    openapiFields.add("nationalities");
    openapiFields.add("emergency_contacts");
    openapiFields.add("addresses");
    openapiFields.add("demographics");
    openapiFields.add("kyc");
    openapiFields.add("ooo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("legal_first_name");
    openapiRequiredFields.add("legal_last_name");
    openapiRequiredFields.add("preferred_name");
    openapiRequiredFields.add("personal_email");
    openapiRequiredFields.add("work_email");
    openapiRequiredFields.add("date_of_birth");
    openapiRequiredFields.add("phone_numbers");
    openapiRequiredFields.add("nationalities");
    openapiRequiredFields.add("emergency_contacts");
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("demographics");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PeoplePersonalContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PeoplePersonalContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeoplePersonalContainerData is not found in the empty JSON string", PeoplePersonalContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PeoplePersonalContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeoplePersonalContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PeoplePersonalContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("legal_first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_first_name").toString()));
      }
      if (!jsonObj.get("legal_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_last_name").toString()));
      }
      if (!jsonObj.get("preferred_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferred_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferred_name").toString()));
      }
      if (!jsonObj.get("personal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_email").toString()));
      }
      if (!jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("phone_numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("phone_numbers").toString()));
      }

      JsonArray jsonArrayphoneNumbers = jsonObj.getAsJsonArray("phone_numbers");
      // validate the required field `phone_numbers` (array)
      for (int i = 0; i < jsonArrayphoneNumbers.size(); i++) {
        PeoplePersonalContainerDataPhoneNumbersInner.validateJsonElement(jsonArrayphoneNumbers.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("nationalities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationalities` to be an array in the JSON string but got `%s`", jsonObj.get("nationalities").toString()));
      }

      JsonArray jsonArraynationalities = jsonObj.getAsJsonArray("nationalities");
      // validate the required field `nationalities` (array)
      for (int i = 0; i < jsonArraynationalities.size(); i++) {
        PeoplePersonalContainerDataNationalitiesInner.validateJsonElement(jsonArraynationalities.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("emergency_contacts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emergency_contacts` to be an array in the JSON string but got `%s`", jsonObj.get("emergency_contacts").toString()));
      }

      JsonArray jsonArrayemergencyContacts = jsonObj.getAsJsonArray("emergency_contacts");
      // validate the required field `emergency_contacts` (array)
      for (int i = 0; i < jsonArrayemergencyContacts.size(); i++) {
        PeoplePersonalContainerDataEmergencyContactsInner.validateJsonElement(jsonArrayemergencyContacts.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        PeoplePersonalContainerDataAddressesInner.validateJsonElement(jsonArrayaddresses.get(i));
      };
      // validate the required field `demographics`
      PeoplePersonalContainerDataDemographics.validateJsonElement(jsonObj.get("demographics"));
      // validate the optional field `kyc`
      if (jsonObj.get("kyc") != null && !jsonObj.get("kyc").isJsonNull()) {
        PeoplePersonalContainerDataKyc.validateJsonElement(jsonObj.get("kyc"));
      }
      // validate the optional field `ooo`
      if (jsonObj.get("ooo") != null && !jsonObj.get("ooo").isJsonNull()) {
        PeoplePersonalContainerDataOoo.validateJsonElement(jsonObj.get("ooo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeoplePersonalContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeoplePersonalContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeoplePersonalContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeoplePersonalContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<PeoplePersonalContainerData>() {
           @Override
           public void write(JsonWriter out, PeoplePersonalContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeoplePersonalContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PeoplePersonalContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PeoplePersonalContainerData
   * @throws IOException if the JSON string is invalid with respect to PeoplePersonalContainerData
   */
  public static PeoplePersonalContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeoplePersonalContainerData.class);
  }

  /**
   * Convert an instance of PeoplePersonalContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

