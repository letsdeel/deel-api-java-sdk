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
import org.openapitools.client.model.EorTimeoffsItem;

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
 * EorClientTimeoffRequests
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class EorClientTimeoffRequests {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nullable
  private BigDecimal year;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  @javax.annotation.Nullable
  private BigDecimal daysRequested;

  public static final String SERIALIZED_NAME_CURRENT_APPROVED = "current_approved";
  @SerializedName(SERIALIZED_NAME_CURRENT_APPROVED)
  @javax.annotation.Nullable
  private BigDecimal currentApproved;

  public static final String SERIALIZED_NAME_YEARLY_LIMIT = "yearly_limit";
  @SerializedName(SERIALIZED_NAME_YEARLY_LIMIT)
  @javax.annotation.Nullable
  private BigDecimal yearlyLimit;

  public static final String SERIALIZED_NAME_OVER_ANNUAL_LIMIT = "over_annual_limit";
  @SerializedName(SERIALIZED_NAME_OVER_ANNUAL_LIMIT)
  @javax.annotation.Nullable
  private Boolean overAnnualLimit;

  public static final String SERIALIZED_NAME_YEARLY_REQUESTS = "yearly_requests";
  @SerializedName(SERIALIZED_NAME_YEARLY_REQUESTS)
  @javax.annotation.Nullable
  private BigDecimal yearlyRequests;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  @javax.annotation.Nonnull
  private List<EorTimeoffsItem> requests = new ArrayList<>();

  public EorClientTimeoffRequests() {
  }

  public EorClientTimeoffRequests year(@javax.annotation.Nullable BigDecimal year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  @javax.annotation.Nullable
  public BigDecimal getYear() {
    return year;
  }

  public void setYear(@javax.annotation.Nullable BigDecimal year) {
    this.year = year;
  }


  public EorClientTimeoffRequests daysRequested(@javax.annotation.Nullable BigDecimal daysRequested) {
    this.daysRequested = daysRequested;
    return this;
  }

  /**
   * Days off requested by employee.
   * @return daysRequested
   */
  @javax.annotation.Nullable
  public BigDecimal getDaysRequested() {
    return daysRequested;
  }

  public void setDaysRequested(@javax.annotation.Nullable BigDecimal daysRequested) {
    this.daysRequested = daysRequested;
  }


  public EorClientTimeoffRequests currentApproved(@javax.annotation.Nullable BigDecimal currentApproved) {
    this.currentApproved = currentApproved;
    return this;
  }

  /**
   * Days off approved.
   * @return currentApproved
   */
  @javax.annotation.Nullable
  public BigDecimal getCurrentApproved() {
    return currentApproved;
  }

  public void setCurrentApproved(@javax.annotation.Nullable BigDecimal currentApproved) {
    this.currentApproved = currentApproved;
  }


  public EorClientTimeoffRequests yearlyLimit(@javax.annotation.Nullable BigDecimal yearlyLimit) {
    this.yearlyLimit = yearlyLimit;
    return this;
  }

  /**
   * Total number of days off allowed per year.
   * @return yearlyLimit
   */
  @javax.annotation.Nullable
  public BigDecimal getYearlyLimit() {
    return yearlyLimit;
  }

  public void setYearlyLimit(@javax.annotation.Nullable BigDecimal yearlyLimit) {
    this.yearlyLimit = yearlyLimit;
  }


  public EorClientTimeoffRequests overAnnualLimit(@javax.annotation.Nullable Boolean overAnnualLimit) {
    this.overAnnualLimit = overAnnualLimit;
    return this;
  }

  /**
   * Too many days off requested by employee.
   * @return overAnnualLimit
   */
  @javax.annotation.Nullable
  public Boolean getOverAnnualLimit() {
    return overAnnualLimit;
  }

  public void setOverAnnualLimit(@javax.annotation.Nullable Boolean overAnnualLimit) {
    this.overAnnualLimit = overAnnualLimit;
  }


  public EorClientTimeoffRequests yearlyRequests(@javax.annotation.Nullable BigDecimal yearlyRequests) {
    this.yearlyRequests = yearlyRequests;
    return this;
  }

  /**
   * Total number of time off requests this year.
   * @return yearlyRequests
   */
  @javax.annotation.Nullable
  public BigDecimal getYearlyRequests() {
    return yearlyRequests;
  }

  public void setYearlyRequests(@javax.annotation.Nullable BigDecimal yearlyRequests) {
    this.yearlyRequests = yearlyRequests;
  }


  public EorClientTimeoffRequests requests(@javax.annotation.Nonnull List<EorTimeoffsItem> requests) {
    this.requests = requests;
    return this;
  }

  public EorClientTimeoffRequests addRequestsItem(EorTimeoffsItem requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * List of time offs.
   * @return requests
   */
  @javax.annotation.Nonnull
  public List<EorTimeoffsItem> getRequests() {
    return requests;
  }

  public void setRequests(@javax.annotation.Nonnull List<EorTimeoffsItem> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorClientTimeoffRequests eorClientTimeoffRequests = (EorClientTimeoffRequests) o;
    return Objects.equals(this.year, eorClientTimeoffRequests.year) &&
        Objects.equals(this.daysRequested, eorClientTimeoffRequests.daysRequested) &&
        Objects.equals(this.currentApproved, eorClientTimeoffRequests.currentApproved) &&
        Objects.equals(this.yearlyLimit, eorClientTimeoffRequests.yearlyLimit) &&
        Objects.equals(this.overAnnualLimit, eorClientTimeoffRequests.overAnnualLimit) &&
        Objects.equals(this.yearlyRequests, eorClientTimeoffRequests.yearlyRequests) &&
        Objects.equals(this.requests, eorClientTimeoffRequests.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, daysRequested, currentApproved, yearlyLimit, overAnnualLimit, yearlyRequests, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorClientTimeoffRequests {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    currentApproved: ").append(toIndentedString(currentApproved)).append("\n");
    sb.append("    yearlyLimit: ").append(toIndentedString(yearlyLimit)).append("\n");
    sb.append("    overAnnualLimit: ").append(toIndentedString(overAnnualLimit)).append("\n");
    sb.append("    yearlyRequests: ").append(toIndentedString(yearlyRequests)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("year");
    openapiFields.add("days_requested");
    openapiFields.add("current_approved");
    openapiFields.add("yearly_limit");
    openapiFields.add("over_annual_limit");
    openapiFields.add("yearly_requests");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requests");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorClientTimeoffRequests
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorClientTimeoffRequests.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorClientTimeoffRequests is not found in the empty JSON string", EorClientTimeoffRequests.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorClientTimeoffRequests.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorClientTimeoffRequests` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorClientTimeoffRequests.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
      }

      JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
      // validate the required field `requests` (array)
      for (int i = 0; i < jsonArrayrequests.size(); i++) {
        EorTimeoffsItem.validateJsonElement(jsonArrayrequests.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorClientTimeoffRequests.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorClientTimeoffRequests' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorClientTimeoffRequests> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorClientTimeoffRequests.class));

       return (TypeAdapter<T>) new TypeAdapter<EorClientTimeoffRequests>() {
           @Override
           public void write(JsonWriter out, EorClientTimeoffRequests value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorClientTimeoffRequests read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorClientTimeoffRequests given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorClientTimeoffRequests
   * @throws IOException if the JSON string is invalid with respect to EorClientTimeoffRequests
   */
  public static EorClientTimeoffRequests fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorClientTimeoffRequests.class);
  }

  /**
   * Convert an instance of EorClientTimeoffRequests to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

