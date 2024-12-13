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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetBenefitEmployee200ResponseAddressesInner;
import org.openapitools.client.model.GetBenefitEmployee200ResponseContractsInner;
import org.openapitools.client.model.GetBenefitEmployee200ResponsePhonesInner;
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
 * GetBenefitEmployee200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitEmployee200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_PHONES = "phones";
  @SerializedName(SERIALIZED_NAME_PHONES)
  @javax.annotation.Nullable
  private List<GetBenefitEmployee200ResponsePhonesInner> phones = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  @javax.annotation.Nullable
  private List<GetBenefitEmployee200ResponseAddressesInner> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTRACTS = "contracts";
  @SerializedName(SERIALIZED_NAME_CONTRACTS)
  @javax.annotation.Nullable
  private List<GetBenefitEmployee200ResponseContractsInner> contracts = new ArrayList<>();

  public static final String SERIALIZED_NAME_HIRE_DATE = "hire_date";
  @SerializedName(SERIALIZED_NAME_HIRE_DATE)
  @javax.annotation.Nullable
  private String hireDate;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nullable
  private String workEmail;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private String dateOfBirth;

  /**
   * The marital status of the employee.
   */
  @JsonAdapter(MaritalStatusEnum.Adapter.class)
  public enum MaritalStatusEnum {
    COMMON_LAW("Common Law"),
    
    DIVORCED("Divorced"),
    
    MARRIED("Married"),
    
    REGISTERED_PARTNERSHIP("Registered Partnership"),
    
    SEPARATED("Separated"),
    
    SINGLE("Single"),
    
    WIDOWED("Widowed");

    private String value;

    MaritalStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MaritalStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaritalStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaritalStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MaritalStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MaritalStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  @javax.annotation.Nullable
  private MaritalStatusEnum maritalStatus;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  @javax.annotation.Nullable
  private String personalEmail;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "document_number";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  @javax.annotation.Nullable
  private String documentNumber;

  public static final String SERIALIZED_NAME_LEGAL_LAST_NAME = "legal_last_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_LAST_NAME)
  @javax.annotation.Nullable
  private String legalLastName;

  public static final String SERIALIZED_NAME_LEGAL_FIRST_NAME = "legal_first_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_FIRST_NAME)
  @javax.annotation.Nullable
  private String legalFirstName;

  public static final String SERIALIZED_NAME_LEGAL_MIDDLE_NAME = "legal_middle_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_MIDDLE_NAME)
  @javax.annotation.Nullable
  private String legalMiddleName;

  public static final String SERIALIZED_NAME_TAKES_OWNERS_DRAW = "takes_owners_draw";
  @SerializedName(SERIALIZED_NAME_TAKES_OWNERS_DRAW)
  @javax.annotation.Nullable
  private Boolean takesOwnersDraw;

  public static final String SERIALIZED_NAME_OWNERSHIP_PERCENTAGE = "ownership_percentage";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_PERCENTAGE)
  @javax.annotation.Nullable
  private BigDecimal ownershipPercentage;

  public GetBenefitEmployee200Response() {
  }

  public GetBenefitEmployee200Response id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the employee.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetBenefitEmployee200Response phones(@javax.annotation.Nullable List<GetBenefitEmployee200ResponsePhonesInner> phones) {
    this.phones = phones;
    return this;
  }

  public GetBenefitEmployee200Response addPhonesItem(GetBenefitEmployee200ResponsePhonesInner phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * List of phone numbers associated with the employee.
   * @return phones
   */
  @javax.annotation.Nullable
  public List<GetBenefitEmployee200ResponsePhonesInner> getPhones() {
    return phones;
  }

  public void setPhones(@javax.annotation.Nullable List<GetBenefitEmployee200ResponsePhonesInner> phones) {
    this.phones = phones;
  }


  public GetBenefitEmployee200Response status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * The employee status given his contracts.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public GetBenefitEmployee200Response addresses(@javax.annotation.Nullable List<GetBenefitEmployee200ResponseAddressesInner> addresses) {
    this.addresses = addresses;
    return this;
  }

  public GetBenefitEmployee200Response addAddressesItem(GetBenefitEmployee200ResponseAddressesInner addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * List of addresses associated with the employee.
   * @return addresses
   */
  @javax.annotation.Nullable
  public List<GetBenefitEmployee200ResponseAddressesInner> getAddresses() {
    return addresses;
  }

  public void setAddresses(@javax.annotation.Nullable List<GetBenefitEmployee200ResponseAddressesInner> addresses) {
    this.addresses = addresses;
  }


  public GetBenefitEmployee200Response contracts(@javax.annotation.Nullable List<GetBenefitEmployee200ResponseContractsInner> contracts) {
    this.contracts = contracts;
    return this;
  }

  public GetBenefitEmployee200Response addContractsItem(GetBenefitEmployee200ResponseContractsInner contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

  /**
   * List of contracts associated with the employee.
   * @return contracts
   */
  @javax.annotation.Nullable
  public List<GetBenefitEmployee200ResponseContractsInner> getContracts() {
    return contracts;
  }

  public void setContracts(@javax.annotation.Nullable List<GetBenefitEmployee200ResponseContractsInner> contracts) {
    this.contracts = contracts;
  }


  public GetBenefitEmployee200Response hireDate(@javax.annotation.Nullable String hireDate) {
    this.hireDate = hireDate;
    return this;
  }

  /**
   * Employee date of first contract.
   * @return hireDate
   */
  @javax.annotation.Nullable
  public String getHireDate() {
    return hireDate;
  }

  public void setHireDate(@javax.annotation.Nullable String hireDate) {
    this.hireDate = hireDate;
  }


  public GetBenefitEmployee200Response workEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * Employee work email address.
   * @return workEmail
   */
  @javax.annotation.Nullable
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
  }


  public GetBenefitEmployee200Response dateOfBirth(@javax.annotation.Nullable String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Employee date of birth.
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nullable String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public GetBenefitEmployee200Response maritalStatus(@javax.annotation.Nullable MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * The marital status of the employee.
   * @return maritalStatus
   */
  @javax.annotation.Nullable
  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(@javax.annotation.Nullable MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public GetBenefitEmployee200Response personalEmail(@javax.annotation.Nullable String personalEmail) {
    this.personalEmail = personalEmail;
    return this;
  }

  /**
   * Employee personal email address.
   * @return personalEmail
   */
  @javax.annotation.Nullable
  public String getPersonalEmail() {
    return personalEmail;
  }

  public void setPersonalEmail(@javax.annotation.Nullable String personalEmail) {
    this.personalEmail = personalEmail;
  }


  public GetBenefitEmployee200Response documentNumber(@javax.annotation.Nullable String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Document number of employee identification document.
   * @return documentNumber
   */
  @javax.annotation.Nullable
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(@javax.annotation.Nullable String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public GetBenefitEmployee200Response legalLastName(@javax.annotation.Nullable String legalLastName) {
    this.legalLastName = legalLastName;
    return this;
  }

  /**
   * Employee legal last name.
   * @return legalLastName
   */
  @javax.annotation.Nullable
  public String getLegalLastName() {
    return legalLastName;
  }

  public void setLegalLastName(@javax.annotation.Nullable String legalLastName) {
    this.legalLastName = legalLastName;
  }


  public GetBenefitEmployee200Response legalFirstName(@javax.annotation.Nullable String legalFirstName) {
    this.legalFirstName = legalFirstName;
    return this;
  }

  /**
   * Employee legal first name.
   * @return legalFirstName
   */
  @javax.annotation.Nullable
  public String getLegalFirstName() {
    return legalFirstName;
  }

  public void setLegalFirstName(@javax.annotation.Nullable String legalFirstName) {
    this.legalFirstName = legalFirstName;
  }


  public GetBenefitEmployee200Response legalMiddleName(@javax.annotation.Nullable String legalMiddleName) {
    this.legalMiddleName = legalMiddleName;
    return this;
  }

  /**
   * Employee legal middle name.
   * @return legalMiddleName
   */
  @javax.annotation.Nullable
  public String getLegalMiddleName() {
    return legalMiddleName;
  }

  public void setLegalMiddleName(@javax.annotation.Nullable String legalMiddleName) {
    this.legalMiddleName = legalMiddleName;
  }


  public GetBenefitEmployee200Response takesOwnersDraw(@javax.annotation.Nullable Boolean takesOwnersDraw) {
    this.takesOwnersDraw = takesOwnersDraw;
    return this;
  }

  /**
   * Indicates if the employee takes an owner draw.
   * @return takesOwnersDraw
   */
  @javax.annotation.Nullable
  public Boolean getTakesOwnersDraw() {
    return takesOwnersDraw;
  }

  public void setTakesOwnersDraw(@javax.annotation.Nullable Boolean takesOwnersDraw) {
    this.takesOwnersDraw = takesOwnersDraw;
  }


  public GetBenefitEmployee200Response ownershipPercentage(@javax.annotation.Nullable BigDecimal ownershipPercentage) {
    this.ownershipPercentage = ownershipPercentage;
    return this;
  }

  /**
   * The percentage of business ownership by the employee.
   * @return ownershipPercentage
   */
  @javax.annotation.Nullable
  public BigDecimal getOwnershipPercentage() {
    return ownershipPercentage;
  }

  public void setOwnershipPercentage(@javax.annotation.Nullable BigDecimal ownershipPercentage) {
    this.ownershipPercentage = ownershipPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBenefitEmployee200Response getBenefitEmployee200Response = (GetBenefitEmployee200Response) o;
    return Objects.equals(this.id, getBenefitEmployee200Response.id) &&
        Objects.equals(this.phones, getBenefitEmployee200Response.phones) &&
        Objects.equals(this.status, getBenefitEmployee200Response.status) &&
        Objects.equals(this.addresses, getBenefitEmployee200Response.addresses) &&
        Objects.equals(this.contracts, getBenefitEmployee200Response.contracts) &&
        Objects.equals(this.hireDate, getBenefitEmployee200Response.hireDate) &&
        Objects.equals(this.workEmail, getBenefitEmployee200Response.workEmail) &&
        Objects.equals(this.dateOfBirth, getBenefitEmployee200Response.dateOfBirth) &&
        Objects.equals(this.maritalStatus, getBenefitEmployee200Response.maritalStatus) &&
        Objects.equals(this.personalEmail, getBenefitEmployee200Response.personalEmail) &&
        Objects.equals(this.documentNumber, getBenefitEmployee200Response.documentNumber) &&
        Objects.equals(this.legalLastName, getBenefitEmployee200Response.legalLastName) &&
        Objects.equals(this.legalFirstName, getBenefitEmployee200Response.legalFirstName) &&
        Objects.equals(this.legalMiddleName, getBenefitEmployee200Response.legalMiddleName) &&
        Objects.equals(this.takesOwnersDraw, getBenefitEmployee200Response.takesOwnersDraw) &&
        Objects.equals(this.ownershipPercentage, getBenefitEmployee200Response.ownershipPercentage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, phones, status, addresses, contracts, hireDate, workEmail, dateOfBirth, maritalStatus, personalEmail, documentNumber, legalLastName, legalFirstName, legalMiddleName, takesOwnersDraw, ownershipPercentage);
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
    sb.append("class GetBenefitEmployee200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    legalMiddleName: ").append(toIndentedString(legalMiddleName)).append("\n");
    sb.append("    takesOwnersDraw: ").append(toIndentedString(takesOwnersDraw)).append("\n");
    sb.append("    ownershipPercentage: ").append(toIndentedString(ownershipPercentage)).append("\n");
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
    openapiFields.add("phones");
    openapiFields.add("status");
    openapiFields.add("addresses");
    openapiFields.add("contracts");
    openapiFields.add("hire_date");
    openapiFields.add("work_email");
    openapiFields.add("date_of_birth");
    openapiFields.add("marital_status");
    openapiFields.add("personal_email");
    openapiFields.add("document_number");
    openapiFields.add("legal_last_name");
    openapiFields.add("legal_first_name");
    openapiFields.add("legal_middle_name");
    openapiFields.add("takes_owners_draw");
    openapiFields.add("ownership_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitEmployee200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitEmployee200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitEmployee200Response is not found in the empty JSON string", GetBenefitEmployee200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitEmployee200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitEmployee200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("phones") != null && !jsonObj.get("phones").isJsonNull()) {
        JsonArray jsonArrayphones = jsonObj.getAsJsonArray("phones");
        if (jsonArrayphones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("phones").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `phones` to be an array in the JSON string but got `%s`", jsonObj.get("phones").toString()));
          }

          // validate the optional field `phones` (array)
          for (int i = 0; i < jsonArrayphones.size(); i++) {
            GetBenefitEmployee200ResponsePhonesInner.validateJsonElement(jsonArrayphones.get(i));
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            GetBenefitEmployee200ResponseAddressesInner.validateJsonElement(jsonArrayaddresses.get(i));
          };
        }
      }
      if (jsonObj.get("contracts") != null && !jsonObj.get("contracts").isJsonNull()) {
        JsonArray jsonArraycontracts = jsonObj.getAsJsonArray("contracts");
        if (jsonArraycontracts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contracts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contracts` to be an array in the JSON string but got `%s`", jsonObj.get("contracts").toString()));
          }

          // validate the optional field `contracts` (array)
          for (int i = 0; i < jsonArraycontracts.size(); i++) {
            GetBenefitEmployee200ResponseContractsInner.validateJsonElement(jsonArraycontracts.get(i));
          };
        }
      }
      if ((jsonObj.get("hire_date") != null && !jsonObj.get("hire_date").isJsonNull()) && !jsonObj.get("hire_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hire_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hire_date").toString()));
      }
      if ((jsonObj.get("work_email") != null && !jsonObj.get("work_email").isJsonNull()) && !jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
      if ((jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) && !jsonObj.get("date_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_birth").toString()));
      }
      if ((jsonObj.get("marital_status") != null && !jsonObj.get("marital_status").isJsonNull()) && !jsonObj.get("marital_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marital_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marital_status").toString()));
      }
      // validate the optional field `marital_status`
      if (jsonObj.get("marital_status") != null && !jsonObj.get("marital_status").isJsonNull()) {
        MaritalStatusEnum.validateJsonElement(jsonObj.get("marital_status"));
      }
      if ((jsonObj.get("personal_email") != null && !jsonObj.get("personal_email").isJsonNull()) && !jsonObj.get("personal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_email").toString()));
      }
      if ((jsonObj.get("document_number") != null && !jsonObj.get("document_number").isJsonNull()) && !jsonObj.get("document_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_number").toString()));
      }
      if ((jsonObj.get("legal_last_name") != null && !jsonObj.get("legal_last_name").isJsonNull()) && !jsonObj.get("legal_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_last_name").toString()));
      }
      if ((jsonObj.get("legal_first_name") != null && !jsonObj.get("legal_first_name").isJsonNull()) && !jsonObj.get("legal_first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_first_name").toString()));
      }
      if ((jsonObj.get("legal_middle_name") != null && !jsonObj.get("legal_middle_name").isJsonNull()) && !jsonObj.get("legal_middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_middle_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBenefitEmployee200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitEmployee200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitEmployee200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitEmployee200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitEmployee200Response>() {
           @Override
           public void write(JsonWriter out, GetBenefitEmployee200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitEmployee200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitEmployee200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitEmployee200Response
   * @throws IOException if the JSON string is invalid with respect to GetBenefitEmployee200Response
   */
  public static GetBenefitEmployee200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitEmployee200Response.class);
  }

  /**
   * Convert an instance of GetBenefitEmployee200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

