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
import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

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
 * RequestExerciseEquityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class RequestExerciseEquityRequest {
  public static final String SERIALIZED_NAME_FMV = "fmv";
  @SerializedName(SERIALIZED_NAME_FMV)
  @javax.annotation.Nonnull
  private String fmv;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  @javax.annotation.Nonnull
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  @javax.annotation.Nonnull
  private String issuerId;

  public static final String SERIALIZED_NAME_WORKER_ID = "worker_id";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  @javax.annotation.Nonnull
  private String workerId;

  public static final String SERIALIZED_NAME_ADDRESS_ZIP = "address_zip";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ZIP)
  @javax.annotation.Nonnull
  private String addressZip;

  public static final String SERIALIZED_NAME_EXERCISE_ID = "exercise_id";
  @SerializedName(SERIALIZED_NAME_EXERCISE_ID)
  @javax.annotation.Nonnull
  private UUID exerciseId;

  public static final String SERIALIZED_NAME_ADDRESS_CITY = "address_city";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CITY)
  @javax.annotation.Nonnull
  private String addressCity;

  public static final String SERIALIZED_NAME_ADDRESS_STATE = "address_state";
  @SerializedName(SERIALIZED_NAME_ADDRESS_STATE)
  @javax.annotation.Nonnull
  private String addressState;

  public static final String SERIALIZED_NAME_ADDRESS_STREET = "address_street";
  @SerializedName(SERIALIZED_NAME_ADDRESS_STREET)
  @javax.annotation.Nonnull
  private String addressStreet;

  public static final String SERIALIZED_NAME_STAKEHOLDER_ID = "stakeholder_id";
  @SerializedName(SERIALIZED_NAME_STAKEHOLDER_ID)
  @javax.annotation.Nonnull
  private String stakeholderId;

  public static final String SERIALIZED_NAME_ADDRESS_COUNTRY = "address_country";
  @SerializedName(SERIALIZED_NAME_ADDRESS_COUNTRY)
  @javax.annotation.Nonnull
  private String addressCountry;

  public static final String SERIALIZED_NAME_OPTION_GRANT_ID = "option_grant_id";
  @SerializedName(SERIALIZED_NAME_OPTION_GRANT_ID)
  @javax.annotation.Nonnull
  private String optionGrantId;

  public static final String SERIALIZED_NAME_FMV_CURRENCY_CODE = "fmv_currency_code";
  @SerializedName(SERIALIZED_NAME_FMV_CURRENCY_CODE)
  @javax.annotation.Nonnull
  private String fmvCurrencyCode;

  public static final String SERIALIZED_NAME_STAKEHOLDER_EMAIL = "stakeholder_email";
  @SerializedName(SERIALIZED_NAME_STAKEHOLDER_EMAIL)
  @javax.annotation.Nonnull
  private String stakeholderEmail;

  public static final String SERIALIZED_NAME_OPTION_GRANT_ISSUE = "option_grant_issue";
  @SerializedName(SERIALIZED_NAME_OPTION_GRANT_ISSUE)
  @javax.annotation.Nonnull
  private String optionGrantIssue;

  public static final String SERIALIZED_NAME_OPTION_GRANT_LABEL = "option_grant_label";
  @SerializedName(SERIALIZED_NAME_OPTION_GRANT_LABEL)
  @javax.annotation.Nonnull
  private String optionGrantLabel;

  public static final String SERIALIZED_NAME_OPTION_GRANT_CURRENCY = "option_grant_currency";
  @SerializedName(SERIALIZED_NAME_OPTION_GRANT_CURRENCY)
  @javax.annotation.Nonnull
  private String optionGrantCurrency;

  public static final String SERIALIZED_NAME_OPTION_GRANT_ISSUE_DATE = "option_grant_issue_date";
  @SerializedName(SERIALIZED_NAME_OPTION_GRANT_ISSUE_DATE)
  @javax.annotation.Nonnull
  private LocalDate optionGrantIssueDate;

  public static final String SERIALIZED_NAME_OPTION_GRANT_EXPIRY_DATE = "option_grant_expiry_date";
  @SerializedName(SERIALIZED_NAME_OPTION_GRANT_EXPIRY_DATE)
  @javax.annotation.Nonnull
  private LocalDate optionGrantExpiryDate;

  public static final String SERIALIZED_NAME_STAKEHOLDER_RELATIONSHIP = "stakeholder_relationship";
  @SerializedName(SERIALIZED_NAME_STAKEHOLDER_RELATIONSHIP)
  @javax.annotation.Nonnull
  private String stakeholderRelationship;

  public static final String SERIALIZED_NAME_OPTION_GRANT_STRIKE_PRICE = "option_grant_strike_price";
  @SerializedName(SERIALIZED_NAME_OPTION_GRANT_STRIKE_PRICE)
  @javax.annotation.Nonnull
  private String optionGrantStrikePrice;

  public RequestExerciseEquityRequest() {
  }

  public RequestExerciseEquityRequest fmv(@javax.annotation.Nonnull String fmv) {
    this.fmv = fmv;
    return this;
  }

  /**
   * The fair market value of the equity.
   * @return fmv
   */
  @javax.annotation.Nonnull
  public String getFmv() {
    return fmv;
  }

  public void setFmv(@javax.annotation.Nonnull String fmv) {
    this.fmv = fmv;
  }


  public RequestExerciseEquityRequest quantity(@javax.annotation.Nonnull BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of equity to exercise.
   * @return quantity
   */
  @javax.annotation.Nonnull
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(@javax.annotation.Nonnull BigDecimal quantity) {
    this.quantity = quantity;
  }


  public RequestExerciseEquityRequest issuerId(@javax.annotation.Nonnull String issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * The unique identifier of the issuer.
   * @return issuerId
   */
  @javax.annotation.Nonnull
  public String getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(@javax.annotation.Nonnull String issuerId) {
    this.issuerId = issuerId;
  }


  public RequestExerciseEquityRequest workerId(@javax.annotation.Nonnull String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * The unique identifier of the worker.
   * @return workerId
   */
  @javax.annotation.Nonnull
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(@javax.annotation.Nonnull String workerId) {
    this.workerId = workerId;
  }


  public RequestExerciseEquityRequest addressZip(@javax.annotation.Nonnull String addressZip) {
    this.addressZip = addressZip;
    return this;
  }

  /**
   * The zip code of the address.
   * @return addressZip
   */
  @javax.annotation.Nonnull
  public String getAddressZip() {
    return addressZip;
  }

  public void setAddressZip(@javax.annotation.Nonnull String addressZip) {
    this.addressZip = addressZip;
  }


  public RequestExerciseEquityRequest exerciseId(@javax.annotation.Nonnull UUID exerciseId) {
    this.exerciseId = exerciseId;
    return this;
  }

  /**
   * The unique identifier of the exercise.
   * @return exerciseId
   */
  @javax.annotation.Nonnull
  public UUID getExerciseId() {
    return exerciseId;
  }

  public void setExerciseId(@javax.annotation.Nonnull UUID exerciseId) {
    this.exerciseId = exerciseId;
  }


  public RequestExerciseEquityRequest addressCity(@javax.annotation.Nonnull String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

  /**
   * The city of the address.
   * @return addressCity
   */
  @javax.annotation.Nonnull
  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(@javax.annotation.Nonnull String addressCity) {
    this.addressCity = addressCity;
  }


  public RequestExerciseEquityRequest addressState(@javax.annotation.Nonnull String addressState) {
    this.addressState = addressState;
    return this;
  }

  /**
   * The state of the address.
   * @return addressState
   */
  @javax.annotation.Nonnull
  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(@javax.annotation.Nonnull String addressState) {
    this.addressState = addressState;
  }


  public RequestExerciseEquityRequest addressStreet(@javax.annotation.Nonnull String addressStreet) {
    this.addressStreet = addressStreet;
    return this;
  }

  /**
   * The street of the address.
   * @return addressStreet
   */
  @javax.annotation.Nonnull
  public String getAddressStreet() {
    return addressStreet;
  }

  public void setAddressStreet(@javax.annotation.Nonnull String addressStreet) {
    this.addressStreet = addressStreet;
  }


  public RequestExerciseEquityRequest stakeholderId(@javax.annotation.Nonnull String stakeholderId) {
    this.stakeholderId = stakeholderId;
    return this;
  }

  /**
   * The unique identifier of the stakeholder.
   * @return stakeholderId
   */
  @javax.annotation.Nonnull
  public String getStakeholderId() {
    return stakeholderId;
  }

  public void setStakeholderId(@javax.annotation.Nonnull String stakeholderId) {
    this.stakeholderId = stakeholderId;
  }


  public RequestExerciseEquityRequest addressCountry(@javax.annotation.Nonnull String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

  /**
   * The country of the address.
   * @return addressCountry
   */
  @javax.annotation.Nonnull
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(@javax.annotation.Nonnull String addressCountry) {
    this.addressCountry = addressCountry;
  }


  public RequestExerciseEquityRequest optionGrantId(@javax.annotation.Nonnull String optionGrantId) {
    this.optionGrantId = optionGrantId;
    return this;
  }

  /**
   * The unique identifier of the option grant.
   * @return optionGrantId
   */
  @javax.annotation.Nonnull
  public String getOptionGrantId() {
    return optionGrantId;
  }

  public void setOptionGrantId(@javax.annotation.Nonnull String optionGrantId) {
    this.optionGrantId = optionGrantId;
  }


  public RequestExerciseEquityRequest fmvCurrencyCode(@javax.annotation.Nonnull String fmvCurrencyCode) {
    this.fmvCurrencyCode = fmvCurrencyCode;
    return this;
  }

  /**
   * The currency code of the fair market value.
   * @return fmvCurrencyCode
   */
  @javax.annotation.Nonnull
  public String getFmvCurrencyCode() {
    return fmvCurrencyCode;
  }

  public void setFmvCurrencyCode(@javax.annotation.Nonnull String fmvCurrencyCode) {
    this.fmvCurrencyCode = fmvCurrencyCode;
  }


  public RequestExerciseEquityRequest stakeholderEmail(@javax.annotation.Nonnull String stakeholderEmail) {
    this.stakeholderEmail = stakeholderEmail;
    return this;
  }

  /**
   * The email of the stakeholder.
   * @return stakeholderEmail
   */
  @javax.annotation.Nonnull
  public String getStakeholderEmail() {
    return stakeholderEmail;
  }

  public void setStakeholderEmail(@javax.annotation.Nonnull String stakeholderEmail) {
    this.stakeholderEmail = stakeholderEmail;
  }


  public RequestExerciseEquityRequest optionGrantIssue(@javax.annotation.Nonnull String optionGrantIssue) {
    this.optionGrantIssue = optionGrantIssue;
    return this;
  }

  /**
   * The issue of the option grant.
   * @return optionGrantIssue
   */
  @javax.annotation.Nonnull
  public String getOptionGrantIssue() {
    return optionGrantIssue;
  }

  public void setOptionGrantIssue(@javax.annotation.Nonnull String optionGrantIssue) {
    this.optionGrantIssue = optionGrantIssue;
  }


  public RequestExerciseEquityRequest optionGrantLabel(@javax.annotation.Nonnull String optionGrantLabel) {
    this.optionGrantLabel = optionGrantLabel;
    return this;
  }

  /**
   * The label of the option grant.
   * @return optionGrantLabel
   */
  @javax.annotation.Nonnull
  public String getOptionGrantLabel() {
    return optionGrantLabel;
  }

  public void setOptionGrantLabel(@javax.annotation.Nonnull String optionGrantLabel) {
    this.optionGrantLabel = optionGrantLabel;
  }


  public RequestExerciseEquityRequest optionGrantCurrency(@javax.annotation.Nonnull String optionGrantCurrency) {
    this.optionGrantCurrency = optionGrantCurrency;
    return this;
  }

  /**
   * The currency of the option grant.
   * @return optionGrantCurrency
   */
  @javax.annotation.Nonnull
  public String getOptionGrantCurrency() {
    return optionGrantCurrency;
  }

  public void setOptionGrantCurrency(@javax.annotation.Nonnull String optionGrantCurrency) {
    this.optionGrantCurrency = optionGrantCurrency;
  }


  public RequestExerciseEquityRequest optionGrantIssueDate(@javax.annotation.Nonnull LocalDate optionGrantIssueDate) {
    this.optionGrantIssueDate = optionGrantIssueDate;
    return this;
  }

  /**
   * The issue date of the option grant.
   * @return optionGrantIssueDate
   */
  @javax.annotation.Nonnull
  public LocalDate getOptionGrantIssueDate() {
    return optionGrantIssueDate;
  }

  public void setOptionGrantIssueDate(@javax.annotation.Nonnull LocalDate optionGrantIssueDate) {
    this.optionGrantIssueDate = optionGrantIssueDate;
  }


  public RequestExerciseEquityRequest optionGrantExpiryDate(@javax.annotation.Nonnull LocalDate optionGrantExpiryDate) {
    this.optionGrantExpiryDate = optionGrantExpiryDate;
    return this;
  }

  /**
   * The expiry date of the option grant.
   * @return optionGrantExpiryDate
   */
  @javax.annotation.Nonnull
  public LocalDate getOptionGrantExpiryDate() {
    return optionGrantExpiryDate;
  }

  public void setOptionGrantExpiryDate(@javax.annotation.Nonnull LocalDate optionGrantExpiryDate) {
    this.optionGrantExpiryDate = optionGrantExpiryDate;
  }


  public RequestExerciseEquityRequest stakeholderRelationship(@javax.annotation.Nonnull String stakeholderRelationship) {
    this.stakeholderRelationship = stakeholderRelationship;
    return this;
  }

  /**
   * The relationship of the stakeholder.
   * @return stakeholderRelationship
   */
  @javax.annotation.Nonnull
  public String getStakeholderRelationship() {
    return stakeholderRelationship;
  }

  public void setStakeholderRelationship(@javax.annotation.Nonnull String stakeholderRelationship) {
    this.stakeholderRelationship = stakeholderRelationship;
  }


  public RequestExerciseEquityRequest optionGrantStrikePrice(@javax.annotation.Nonnull String optionGrantStrikePrice) {
    this.optionGrantStrikePrice = optionGrantStrikePrice;
    return this;
  }

  /**
   * The strike price of the option grant.
   * @return optionGrantStrikePrice
   */
  @javax.annotation.Nonnull
  public String getOptionGrantStrikePrice() {
    return optionGrantStrikePrice;
  }

  public void setOptionGrantStrikePrice(@javax.annotation.Nonnull String optionGrantStrikePrice) {
    this.optionGrantStrikePrice = optionGrantStrikePrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestExerciseEquityRequest requestExerciseEquityRequest = (RequestExerciseEquityRequest) o;
    return Objects.equals(this.fmv, requestExerciseEquityRequest.fmv) &&
        Objects.equals(this.quantity, requestExerciseEquityRequest.quantity) &&
        Objects.equals(this.issuerId, requestExerciseEquityRequest.issuerId) &&
        Objects.equals(this.workerId, requestExerciseEquityRequest.workerId) &&
        Objects.equals(this.addressZip, requestExerciseEquityRequest.addressZip) &&
        Objects.equals(this.exerciseId, requestExerciseEquityRequest.exerciseId) &&
        Objects.equals(this.addressCity, requestExerciseEquityRequest.addressCity) &&
        Objects.equals(this.addressState, requestExerciseEquityRequest.addressState) &&
        Objects.equals(this.addressStreet, requestExerciseEquityRequest.addressStreet) &&
        Objects.equals(this.stakeholderId, requestExerciseEquityRequest.stakeholderId) &&
        Objects.equals(this.addressCountry, requestExerciseEquityRequest.addressCountry) &&
        Objects.equals(this.optionGrantId, requestExerciseEquityRequest.optionGrantId) &&
        Objects.equals(this.fmvCurrencyCode, requestExerciseEquityRequest.fmvCurrencyCode) &&
        Objects.equals(this.stakeholderEmail, requestExerciseEquityRequest.stakeholderEmail) &&
        Objects.equals(this.optionGrantIssue, requestExerciseEquityRequest.optionGrantIssue) &&
        Objects.equals(this.optionGrantLabel, requestExerciseEquityRequest.optionGrantLabel) &&
        Objects.equals(this.optionGrantCurrency, requestExerciseEquityRequest.optionGrantCurrency) &&
        Objects.equals(this.optionGrantIssueDate, requestExerciseEquityRequest.optionGrantIssueDate) &&
        Objects.equals(this.optionGrantExpiryDate, requestExerciseEquityRequest.optionGrantExpiryDate) &&
        Objects.equals(this.stakeholderRelationship, requestExerciseEquityRequest.stakeholderRelationship) &&
        Objects.equals(this.optionGrantStrikePrice, requestExerciseEquityRequest.optionGrantStrikePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fmv, quantity, issuerId, workerId, addressZip, exerciseId, addressCity, addressState, addressStreet, stakeholderId, addressCountry, optionGrantId, fmvCurrencyCode, stakeholderEmail, optionGrantIssue, optionGrantLabel, optionGrantCurrency, optionGrantIssueDate, optionGrantExpiryDate, stakeholderRelationship, optionGrantStrikePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestExerciseEquityRequest {\n");
    sb.append("    fmv: ").append(toIndentedString(fmv)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    addressZip: ").append(toIndentedString(addressZip)).append("\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressStreet: ").append(toIndentedString(addressStreet)).append("\n");
    sb.append("    stakeholderId: ").append(toIndentedString(stakeholderId)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    optionGrantId: ").append(toIndentedString(optionGrantId)).append("\n");
    sb.append("    fmvCurrencyCode: ").append(toIndentedString(fmvCurrencyCode)).append("\n");
    sb.append("    stakeholderEmail: ").append(toIndentedString(stakeholderEmail)).append("\n");
    sb.append("    optionGrantIssue: ").append(toIndentedString(optionGrantIssue)).append("\n");
    sb.append("    optionGrantLabel: ").append(toIndentedString(optionGrantLabel)).append("\n");
    sb.append("    optionGrantCurrency: ").append(toIndentedString(optionGrantCurrency)).append("\n");
    sb.append("    optionGrantIssueDate: ").append(toIndentedString(optionGrantIssueDate)).append("\n");
    sb.append("    optionGrantExpiryDate: ").append(toIndentedString(optionGrantExpiryDate)).append("\n");
    sb.append("    stakeholderRelationship: ").append(toIndentedString(stakeholderRelationship)).append("\n");
    sb.append("    optionGrantStrikePrice: ").append(toIndentedString(optionGrantStrikePrice)).append("\n");
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
    openapiFields.add("fmv");
    openapiFields.add("quantity");
    openapiFields.add("issuer_id");
    openapiFields.add("worker_id");
    openapiFields.add("address_zip");
    openapiFields.add("exercise_id");
    openapiFields.add("address_city");
    openapiFields.add("address_state");
    openapiFields.add("address_street");
    openapiFields.add("stakeholder_id");
    openapiFields.add("address_country");
    openapiFields.add("option_grant_id");
    openapiFields.add("fmv_currency_code");
    openapiFields.add("stakeholder_email");
    openapiFields.add("option_grant_issue");
    openapiFields.add("option_grant_label");
    openapiFields.add("option_grant_currency");
    openapiFields.add("option_grant_issue_date");
    openapiFields.add("option_grant_expiry_date");
    openapiFields.add("stakeholder_relationship");
    openapiFields.add("option_grant_strike_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fmv");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("issuer_id");
    openapiRequiredFields.add("worker_id");
    openapiRequiredFields.add("address_zip");
    openapiRequiredFields.add("exercise_id");
    openapiRequiredFields.add("address_city");
    openapiRequiredFields.add("address_state");
    openapiRequiredFields.add("address_street");
    openapiRequiredFields.add("stakeholder_id");
    openapiRequiredFields.add("address_country");
    openapiRequiredFields.add("option_grant_id");
    openapiRequiredFields.add("fmv_currency_code");
    openapiRequiredFields.add("stakeholder_email");
    openapiRequiredFields.add("option_grant_issue");
    openapiRequiredFields.add("option_grant_label");
    openapiRequiredFields.add("option_grant_currency");
    openapiRequiredFields.add("option_grant_issue_date");
    openapiRequiredFields.add("option_grant_expiry_date");
    openapiRequiredFields.add("stakeholder_relationship");
    openapiRequiredFields.add("option_grant_strike_price");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequestExerciseEquityRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequestExerciseEquityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestExerciseEquityRequest is not found in the empty JSON string", RequestExerciseEquityRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequestExerciseEquityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestExerciseEquityRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RequestExerciseEquityRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fmv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fmv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fmv").toString()));
      }
      if (!jsonObj.get("issuer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer_id").toString()));
      }
      if (!jsonObj.get("worker_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_id").toString()));
      }
      if (!jsonObj.get("address_zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_zip").toString()));
      }
      if (!jsonObj.get("exercise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exercise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exercise_id").toString()));
      }
      if (!jsonObj.get("address_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_city").toString()));
      }
      if (!jsonObj.get("address_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_state").toString()));
      }
      if (!jsonObj.get("address_street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_street").toString()));
      }
      if (!jsonObj.get("stakeholder_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stakeholder_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stakeholder_id").toString()));
      }
      if (!jsonObj.get("address_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_country").toString()));
      }
      if (!jsonObj.get("option_grant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option_grant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option_grant_id").toString()));
      }
      if (!jsonObj.get("fmv_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fmv_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fmv_currency_code").toString()));
      }
      if (!jsonObj.get("stakeholder_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stakeholder_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stakeholder_email").toString()));
      }
      if (!jsonObj.get("option_grant_issue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option_grant_issue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option_grant_issue").toString()));
      }
      if (!jsonObj.get("option_grant_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option_grant_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option_grant_label").toString()));
      }
      if (!jsonObj.get("option_grant_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option_grant_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option_grant_currency").toString()));
      }
      if (!jsonObj.get("stakeholder_relationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stakeholder_relationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stakeholder_relationship").toString()));
      }
      if (!jsonObj.get("option_grant_strike_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option_grant_strike_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option_grant_strike_price").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestExerciseEquityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestExerciseEquityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestExerciseEquityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestExerciseEquityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestExerciseEquityRequest>() {
           @Override
           public void write(JsonWriter out, RequestExerciseEquityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestExerciseEquityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequestExerciseEquityRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequestExerciseEquityRequest
   * @throws IOException if the JSON string is invalid with respect to RequestExerciseEquityRequest
   */
  public static RequestExerciseEquityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestExerciseEquityRequest.class);
  }

  /**
   * Convert an instance of RequestExerciseEquityRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

