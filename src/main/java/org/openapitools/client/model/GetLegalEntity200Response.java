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
import java.util.Arrays;
import org.openapitools.client.model.GetLegalEntity200ResponseAddress;
import org.openapitools.client.model.GetLegalEntity200ResponseRegistrationAddress;
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
 * GetLegalEntity200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class GetLegalEntity200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_VAT_ID = "vat_id";
  @SerializedName(SERIALIZED_NAME_VAT_ID)
  @javax.annotation.Nullable
  private String vatId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private GetLegalEntity200ResponseAddress address;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_NAICS_CODE = "naics_code";
  @SerializedName(SERIALIZED_NAME_NAICS_CODE)
  @javax.annotation.Nullable
  private String naicsCode;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  @javax.annotation.Nullable
  private String entityType;

  /**
   * Employment type of the legal entity.
   */
  @JsonAdapter(EmploymentTypeEnum.Adapter.class)
  public enum EmploymentTypeEnum {
    PEO("peo"),
    
    USP("usp"),
    
    GP("gp"),
    
    u("...");

    private String value;

    EmploymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmploymentTypeEnum fromValue(String value) {
      for (EmploymentTypeEnum b : EmploymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmploymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmploymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmploymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmploymentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EmploymentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EMPLOYMENT_TYPE = "employment_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_TYPE)
  @javax.annotation.Nullable
  private EmploymentTypeEnum employmentType;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  @javax.annotation.Nullable
  private String registrationNumber;

  public static final String SERIALIZED_NAME_REGISTRATION_ADDRESS = "registration_address";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_ADDRESS)
  @javax.annotation.Nullable
  private GetLegalEntity200ResponseRegistrationAddress registrationAddress;

  public static final String SERIALIZED_NAME_UNION_OR_LEASED_EMPLOYEES = "union_or_leased_employees";
  @SerializedName(SERIALIZED_NAME_UNION_OR_LEASED_EMPLOYEES)
  @javax.annotation.Nullable
  private Boolean unionOrLeasedEmployees;

  public GetLegalEntity200Response() {
  }

  public GetLegalEntity200Response id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the legal entity.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetLegalEntity200Response name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the legal entity.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetLegalEntity200Response phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the legal entity.
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public GetLegalEntity200Response vatId(@javax.annotation.Nullable String vatId) {
    this.vatId = vatId;
    return this;
  }

  /**
   * VAT ID of the legal entity, known as EIN in the US.
   * @return vatId
   */
  @javax.annotation.Nullable
  public String getVatId() {
    return vatId;
  }

  public void setVatId(@javax.annotation.Nullable String vatId) {
    this.vatId = vatId;
  }


  public GetLegalEntity200Response address(@javax.annotation.Nullable GetLegalEntity200ResponseAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public GetLegalEntity200ResponseAddress getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable GetLegalEntity200ResponseAddress address) {
    this.address = address;
  }


  public GetLegalEntity200Response country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of the legal entity.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetLegalEntity200Response naicsCode(@javax.annotation.Nullable String naicsCode) {
    this.naicsCode = naicsCode;
    return this;
  }

  /**
   * NAICS code of the legal entity.
   * @return naicsCode
   */
  @javax.annotation.Nullable
  public String getNaicsCode() {
    return naicsCode;
  }

  public void setNaicsCode(@javax.annotation.Nullable String naicsCode) {
    this.naicsCode = naicsCode;
  }


  public GetLegalEntity200Response entityType(@javax.annotation.Nullable String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Type of the legal entity (e.g., LLC).
   * @return entityType
   */
  @javax.annotation.Nullable
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(@javax.annotation.Nullable String entityType) {
    this.entityType = entityType;
  }


  public GetLegalEntity200Response employmentType(@javax.annotation.Nullable EmploymentTypeEnum employmentType) {
    this.employmentType = employmentType;
    return this;
  }

  /**
   * Employment type of the legal entity.
   * @return employmentType
   */
  @javax.annotation.Nullable
  public EmploymentTypeEnum getEmploymentType() {
    return employmentType;
  }

  public void setEmploymentType(@javax.annotation.Nullable EmploymentTypeEnum employmentType) {
    this.employmentType = employmentType;
  }


  public GetLegalEntity200Response registrationNumber(@javax.annotation.Nullable String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Registration number of the legal entity.
   * @return registrationNumber
   */
  @javax.annotation.Nullable
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(@javax.annotation.Nullable String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public GetLegalEntity200Response registrationAddress(@javax.annotation.Nullable GetLegalEntity200ResponseRegistrationAddress registrationAddress) {
    this.registrationAddress = registrationAddress;
    return this;
  }

  /**
   * Get registrationAddress
   * @return registrationAddress
   */
  @javax.annotation.Nullable
  public GetLegalEntity200ResponseRegistrationAddress getRegistrationAddress() {
    return registrationAddress;
  }

  public void setRegistrationAddress(@javax.annotation.Nullable GetLegalEntity200ResponseRegistrationAddress registrationAddress) {
    this.registrationAddress = registrationAddress;
  }


  public GetLegalEntity200Response unionOrLeasedEmployees(@javax.annotation.Nullable Boolean unionOrLeasedEmployees) {
    this.unionOrLeasedEmployees = unionOrLeasedEmployees;
    return this;
  }

  /**
   * Indicates if the legal entity has union or leased employees.
   * @return unionOrLeasedEmployees
   */
  @javax.annotation.Nullable
  public Boolean getUnionOrLeasedEmployees() {
    return unionOrLeasedEmployees;
  }

  public void setUnionOrLeasedEmployees(@javax.annotation.Nullable Boolean unionOrLeasedEmployees) {
    this.unionOrLeasedEmployees = unionOrLeasedEmployees;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLegalEntity200Response getLegalEntity200Response = (GetLegalEntity200Response) o;
    return Objects.equals(this.id, getLegalEntity200Response.id) &&
        Objects.equals(this.name, getLegalEntity200Response.name) &&
        Objects.equals(this.phone, getLegalEntity200Response.phone) &&
        Objects.equals(this.vatId, getLegalEntity200Response.vatId) &&
        Objects.equals(this.address, getLegalEntity200Response.address) &&
        Objects.equals(this.country, getLegalEntity200Response.country) &&
        Objects.equals(this.naicsCode, getLegalEntity200Response.naicsCode) &&
        Objects.equals(this.entityType, getLegalEntity200Response.entityType) &&
        Objects.equals(this.employmentType, getLegalEntity200Response.employmentType) &&
        Objects.equals(this.registrationNumber, getLegalEntity200Response.registrationNumber) &&
        Objects.equals(this.registrationAddress, getLegalEntity200Response.registrationAddress) &&
        Objects.equals(this.unionOrLeasedEmployees, getLegalEntity200Response.unionOrLeasedEmployees);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phone, vatId, address, country, naicsCode, entityType, employmentType, registrationNumber, registrationAddress, unionOrLeasedEmployees);
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
    sb.append("class GetLegalEntity200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    vatId: ").append(toIndentedString(vatId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    registrationAddress: ").append(toIndentedString(registrationAddress)).append("\n");
    sb.append("    unionOrLeasedEmployees: ").append(toIndentedString(unionOrLeasedEmployees)).append("\n");
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
    openapiFields.add("phone");
    openapiFields.add("vat_id");
    openapiFields.add("address");
    openapiFields.add("country");
    openapiFields.add("naics_code");
    openapiFields.add("entity_type");
    openapiFields.add("employment_type");
    openapiFields.add("registration_number");
    openapiFields.add("registration_address");
    openapiFields.add("union_or_leased_employees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetLegalEntity200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLegalEntity200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLegalEntity200Response is not found in the empty JSON string", GetLegalEntity200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLegalEntity200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLegalEntity200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("vat_id") != null && !jsonObj.get("vat_id").isJsonNull()) && !jsonObj.get("vat_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_id").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        GetLegalEntity200ResponseAddress.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("naics_code") != null && !jsonObj.get("naics_code").isJsonNull()) && !jsonObj.get("naics_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `naics_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("naics_code").toString()));
      }
      if ((jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()) && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if ((jsonObj.get("employment_type") != null && !jsonObj.get("employment_type").isJsonNull()) && !jsonObj.get("employment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_type").toString()));
      }
      // validate the optional field `employment_type`
      if (jsonObj.get("employment_type") != null && !jsonObj.get("employment_type").isJsonNull()) {
        EmploymentTypeEnum.validateJsonElement(jsonObj.get("employment_type"));
      }
      if ((jsonObj.get("registration_number") != null && !jsonObj.get("registration_number").isJsonNull()) && !jsonObj.get("registration_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_number").toString()));
      }
      // validate the optional field `registration_address`
      if (jsonObj.get("registration_address") != null && !jsonObj.get("registration_address").isJsonNull()) {
        GetLegalEntity200ResponseRegistrationAddress.validateJsonElement(jsonObj.get("registration_address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLegalEntity200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLegalEntity200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLegalEntity200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLegalEntity200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLegalEntity200Response>() {
           @Override
           public void write(JsonWriter out, GetLegalEntity200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLegalEntity200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLegalEntity200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLegalEntity200Response
   * @throws IOException if the JSON string is invalid with respect to GetLegalEntity200Response
   */
  public static GetLegalEntity200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLegalEntity200Response.class);
  }

  /**
   * Convert an instance of GetLegalEntity200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

