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
import java.util.UUID;
import org.openapitools.client.model.GetPeoplePersonalInformationByExternalId200ResponseDataAddressesInner;
import org.openapitools.client.model.GetPeoplePersonalInformationByExternalId200ResponseDataDemographics;
import org.openapitools.client.model.GetPeoplePersonalInformationByExternalId200ResponseDataEmergencyContactsInner;
import org.openapitools.client.model.GetPeoplePersonalInformationById200ResponseDataKyc;
import org.openapitools.client.model.GetPeoplePersonalInformationById200ResponseDataNationalitiesInner;
import org.openapitools.client.model.GetPeoplePersonalInformationById200ResponseDataOoo;
import org.openapitools.client.model.GetPeoplePersonalInformationById200ResponseDataPhoneNumbersInner;

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
 * GetPeoplePersonalInformationByExternalId200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeoplePersonalInformationByExternalId200ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_KYC = "kyc";
  @SerializedName(SERIALIZED_NAME_KYC)
  @javax.annotation.Nullable
  private GetPeoplePersonalInformationById200ResponseDataKyc kyc;

  public static final String SERIALIZED_NAME_OOO = "ooo";
  @SerializedName(SERIALIZED_NAME_OOO)
  @javax.annotation.Nullable
  private GetPeoplePersonalInformationById200ResponseDataOoo ooo;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  @javax.annotation.Nonnull
  private List<GetPeoplePersonalInformationByExternalId200ResponseDataAddressesInner> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKER_ID = "worker_id";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  @javax.annotation.Nonnull
  private Integer workerId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_DEMOGRAPHICS = "demographics";
  @SerializedName(SERIALIZED_NAME_DEMOGRAPHICS)
  @javax.annotation.Nonnull
  private GetPeoplePersonalInformationByExternalId200ResponseDataDemographics demographics;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nonnull
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_NATIONALITIES = "nationalities";
  @SerializedName(SERIALIZED_NAME_NATIONALITIES)
  @javax.annotation.Nonnull
  private List<GetPeoplePersonalInformationById200ResponseDataNationalitiesInner> nationalities = new ArrayList<>();

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  @javax.annotation.Nonnull
  private List<GetPeoplePersonalInformationById200ResponseDataPhoneNumbersInner> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  @javax.annotation.Nonnull
  private String personalEmail;

  public static final String SERIALIZED_NAME_PREFERRED_NAME = "preferred_name";
  @SerializedName(SERIALIZED_NAME_PREFERRED_NAME)
  @javax.annotation.Nonnull
  private String preferredName;

  public static final String SERIALIZED_NAME_LEGAL_LAST_NAME = "legal_last_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_LAST_NAME)
  @javax.annotation.Nonnull
  private String legalLastName;

  public static final String SERIALIZED_NAME_LEGAL_FIRST_NAME = "legal_first_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_FIRST_NAME)
  @javax.annotation.Nonnull
  private String legalFirstName;

  public static final String SERIALIZED_NAME_EMERGENCY_CONTACTS = "emergency_contacts";
  @SerializedName(SERIALIZED_NAME_EMERGENCY_CONTACTS)
  @javax.annotation.Nonnull
  private List<GetPeoplePersonalInformationByExternalId200ResponseDataEmergencyContactsInner> emergencyContacts = new ArrayList<>();

  public GetPeoplePersonalInformationByExternalId200ResponseData() {
  }

  public GetPeoplePersonalInformationByExternalId200ResponseData id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the worker.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData kyc(@javax.annotation.Nullable GetPeoplePersonalInformationById200ResponseDataKyc kyc) {
    this.kyc = kyc;
    return this;
  }

  /**
   * Get kyc
   * @return kyc
   */
  @javax.annotation.Nullable
  public GetPeoplePersonalInformationById200ResponseDataKyc getKyc() {
    return kyc;
  }

  public void setKyc(@javax.annotation.Nullable GetPeoplePersonalInformationById200ResponseDataKyc kyc) {
    this.kyc = kyc;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData ooo(@javax.annotation.Nullable GetPeoplePersonalInformationById200ResponseDataOoo ooo) {
    this.ooo = ooo;
    return this;
  }

  /**
   * Get ooo
   * @return ooo
   */
  @javax.annotation.Nullable
  public GetPeoplePersonalInformationById200ResponseDataOoo getOoo() {
    return ooo;
  }

  public void setOoo(@javax.annotation.Nullable GetPeoplePersonalInformationById200ResponseDataOoo ooo) {
    this.ooo = ooo;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData addresses(@javax.annotation.Nonnull List<GetPeoplePersonalInformationByExternalId200ResponseDataAddressesInner> addresses) {
    this.addresses = addresses;
    return this;
  }

  public GetPeoplePersonalInformationByExternalId200ResponseData addAddressesItem(GetPeoplePersonalInformationByExternalId200ResponseDataAddressesInner addressesItem) {
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
  public List<GetPeoplePersonalInformationByExternalId200ResponseDataAddressesInner> getAddresses() {
    return addresses;
  }

  public void setAddresses(@javax.annotation.Nonnull List<GetPeoplePersonalInformationByExternalId200ResponseDataAddressesInner> addresses) {
    this.addresses = addresses;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData workerId(@javax.annotation.Nonnull Integer workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * The worker id.
   * @return workerId
   */
  @javax.annotation.Nonnull
  public Integer getWorkerId() {
    return workerId;
  }

  public void setWorkerId(@javax.annotation.Nonnull Integer workerId) {
    this.workerId = workerId;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The external id of the worker.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData demographics(@javax.annotation.Nonnull GetPeoplePersonalInformationByExternalId200ResponseDataDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
   */
  @javax.annotation.Nonnull
  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(@javax.annotation.Nonnull GetPeoplePersonalInformationByExternalId200ResponseDataDemographics demographics) {
    this.demographics = demographics;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData dateOfBirth(@javax.annotation.Nonnull LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * The date of birth of the worker.
   * @return dateOfBirth
   */
  @javax.annotation.Nonnull
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nonnull LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData nationalities(@javax.annotation.Nonnull List<GetPeoplePersonalInformationById200ResponseDataNationalitiesInner> nationalities) {
    this.nationalities = nationalities;
    return this;
  }

  public GetPeoplePersonalInformationByExternalId200ResponseData addNationalitiesItem(GetPeoplePersonalInformationById200ResponseDataNationalitiesInner nationalitiesItem) {
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
  public List<GetPeoplePersonalInformationById200ResponseDataNationalitiesInner> getNationalities() {
    return nationalities;
  }

  public void setNationalities(@javax.annotation.Nonnull List<GetPeoplePersonalInformationById200ResponseDataNationalitiesInner> nationalities) {
    this.nationalities = nationalities;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData phoneNumbers(@javax.annotation.Nonnull List<GetPeoplePersonalInformationById200ResponseDataPhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public GetPeoplePersonalInformationByExternalId200ResponseData addPhoneNumbersItem(GetPeoplePersonalInformationById200ResponseDataPhoneNumbersInner phoneNumbersItem) {
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
  public List<GetPeoplePersonalInformationById200ResponseDataPhoneNumbersInner> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(@javax.annotation.Nonnull List<GetPeoplePersonalInformationById200ResponseDataPhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseData personalEmail(@javax.annotation.Nonnull String personalEmail) {
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


  public GetPeoplePersonalInformationByExternalId200ResponseData preferredName(@javax.annotation.Nonnull String preferredName) {
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


  public GetPeoplePersonalInformationByExternalId200ResponseData legalLastName(@javax.annotation.Nonnull String legalLastName) {
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


  public GetPeoplePersonalInformationByExternalId200ResponseData legalFirstName(@javax.annotation.Nonnull String legalFirstName) {
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


  public GetPeoplePersonalInformationByExternalId200ResponseData emergencyContacts(@javax.annotation.Nonnull List<GetPeoplePersonalInformationByExternalId200ResponseDataEmergencyContactsInner> emergencyContacts) {
    this.emergencyContacts = emergencyContacts;
    return this;
  }

  public GetPeoplePersonalInformationByExternalId200ResponseData addEmergencyContactsItem(GetPeoplePersonalInformationByExternalId200ResponseDataEmergencyContactsInner emergencyContactsItem) {
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
  public List<GetPeoplePersonalInformationByExternalId200ResponseDataEmergencyContactsInner> getEmergencyContacts() {
    return emergencyContacts;
  }

  public void setEmergencyContacts(@javax.annotation.Nonnull List<GetPeoplePersonalInformationByExternalId200ResponseDataEmergencyContactsInner> emergencyContacts) {
    this.emergencyContacts = emergencyContacts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPeoplePersonalInformationByExternalId200ResponseData getPeoplePersonalInformationByExternalId200ResponseData = (GetPeoplePersonalInformationByExternalId200ResponseData) o;
    return Objects.equals(this.id, getPeoplePersonalInformationByExternalId200ResponseData.id) &&
        Objects.equals(this.kyc, getPeoplePersonalInformationByExternalId200ResponseData.kyc) &&
        Objects.equals(this.ooo, getPeoplePersonalInformationByExternalId200ResponseData.ooo) &&
        Objects.equals(this.addresses, getPeoplePersonalInformationByExternalId200ResponseData.addresses) &&
        Objects.equals(this.workerId, getPeoplePersonalInformationByExternalId200ResponseData.workerId) &&
        Objects.equals(this.externalId, getPeoplePersonalInformationByExternalId200ResponseData.externalId) &&
        Objects.equals(this.demographics, getPeoplePersonalInformationByExternalId200ResponseData.demographics) &&
        Objects.equals(this.dateOfBirth, getPeoplePersonalInformationByExternalId200ResponseData.dateOfBirth) &&
        Objects.equals(this.nationalities, getPeoplePersonalInformationByExternalId200ResponseData.nationalities) &&
        Objects.equals(this.phoneNumbers, getPeoplePersonalInformationByExternalId200ResponseData.phoneNumbers) &&
        Objects.equals(this.personalEmail, getPeoplePersonalInformationByExternalId200ResponseData.personalEmail) &&
        Objects.equals(this.preferredName, getPeoplePersonalInformationByExternalId200ResponseData.preferredName) &&
        Objects.equals(this.legalLastName, getPeoplePersonalInformationByExternalId200ResponseData.legalLastName) &&
        Objects.equals(this.legalFirstName, getPeoplePersonalInformationByExternalId200ResponseData.legalFirstName) &&
        Objects.equals(this.emergencyContacts, getPeoplePersonalInformationByExternalId200ResponseData.emergencyContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kyc, ooo, addresses, workerId, externalId, demographics, dateOfBirth, nationalities, phoneNumbers, personalEmail, preferredName, legalLastName, legalFirstName, emergencyContacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeoplePersonalInformationByExternalId200ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kyc: ").append(toIndentedString(kyc)).append("\n");
    sb.append("    ooo: ").append(toIndentedString(ooo)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    nationalities: ").append(toIndentedString(nationalities)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    emergencyContacts: ").append(toIndentedString(emergencyContacts)).append("\n");
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
    openapiFields.add("kyc");
    openapiFields.add("ooo");
    openapiFields.add("addresses");
    openapiFields.add("worker_id");
    openapiFields.add("external_id");
    openapiFields.add("demographics");
    openapiFields.add("date_of_birth");
    openapiFields.add("nationalities");
    openapiFields.add("phone_numbers");
    openapiFields.add("personal_email");
    openapiFields.add("preferred_name");
    openapiFields.add("legal_last_name");
    openapiFields.add("legal_first_name");
    openapiFields.add("emergency_contacts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("worker_id");
    openapiRequiredFields.add("demographics");
    openapiRequiredFields.add("date_of_birth");
    openapiRequiredFields.add("nationalities");
    openapiRequiredFields.add("phone_numbers");
    openapiRequiredFields.add("personal_email");
    openapiRequiredFields.add("preferred_name");
    openapiRequiredFields.add("legal_last_name");
    openapiRequiredFields.add("legal_first_name");
    openapiRequiredFields.add("emergency_contacts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPeoplePersonalInformationByExternalId200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeoplePersonalInformationByExternalId200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeoplePersonalInformationByExternalId200ResponseData is not found in the empty JSON string", GetPeoplePersonalInformationByExternalId200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeoplePersonalInformationByExternalId200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeoplePersonalInformationByExternalId200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPeoplePersonalInformationByExternalId200ResponseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `kyc`
      if (jsonObj.get("kyc") != null && !jsonObj.get("kyc").isJsonNull()) {
        GetPeoplePersonalInformationById200ResponseDataKyc.validateJsonElement(jsonObj.get("kyc"));
      }
      // validate the optional field `ooo`
      if (jsonObj.get("ooo") != null && !jsonObj.get("ooo").isJsonNull()) {
        GetPeoplePersonalInformationById200ResponseDataOoo.validateJsonElement(jsonObj.get("ooo"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        GetPeoplePersonalInformationByExternalId200ResponseDataAddressesInner.validateJsonElement(jsonArrayaddresses.get(i));
      };
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the required field `demographics`
      GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.validateJsonElement(jsonObj.get("demographics"));
      // ensure the json data is an array
      if (!jsonObj.get("nationalities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationalities` to be an array in the JSON string but got `%s`", jsonObj.get("nationalities").toString()));
      }

      JsonArray jsonArraynationalities = jsonObj.getAsJsonArray("nationalities");
      // validate the required field `nationalities` (array)
      for (int i = 0; i < jsonArraynationalities.size(); i++) {
        GetPeoplePersonalInformationById200ResponseDataNationalitiesInner.validateJsonElement(jsonArraynationalities.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("phone_numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("phone_numbers").toString()));
      }

      JsonArray jsonArrayphoneNumbers = jsonObj.getAsJsonArray("phone_numbers");
      // validate the required field `phone_numbers` (array)
      for (int i = 0; i < jsonArrayphoneNumbers.size(); i++) {
        GetPeoplePersonalInformationById200ResponseDataPhoneNumbersInner.validateJsonElement(jsonArrayphoneNumbers.get(i));
      };
      if (!jsonObj.get("personal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_email").toString()));
      }
      if (!jsonObj.get("preferred_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferred_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferred_name").toString()));
      }
      if (!jsonObj.get("legal_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_last_name").toString()));
      }
      if (!jsonObj.get("legal_first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_first_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("emergency_contacts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emergency_contacts` to be an array in the JSON string but got `%s`", jsonObj.get("emergency_contacts").toString()));
      }

      JsonArray jsonArrayemergencyContacts = jsonObj.getAsJsonArray("emergency_contacts");
      // validate the required field `emergency_contacts` (array)
      for (int i = 0; i < jsonArrayemergencyContacts.size(); i++) {
        GetPeoplePersonalInformationByExternalId200ResponseDataEmergencyContactsInner.validateJsonElement(jsonArrayemergencyContacts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPeoplePersonalInformationByExternalId200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeoplePersonalInformationByExternalId200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeoplePersonalInformationByExternalId200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeoplePersonalInformationByExternalId200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeoplePersonalInformationByExternalId200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetPeoplePersonalInformationByExternalId200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeoplePersonalInformationByExternalId200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeoplePersonalInformationByExternalId200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeoplePersonalInformationByExternalId200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetPeoplePersonalInformationByExternalId200ResponseData
   */
  public static GetPeoplePersonalInformationByExternalId200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeoplePersonalInformationByExternalId200ResponseData.class);
  }

  /**
   * Convert an instance of GetPeoplePersonalInformationByExternalId200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

