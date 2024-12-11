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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Put401kPlansDefinitionRequestContributionValueForMatchRateInner;
import org.openapitools.client.model.Put401kPlansDefinitionRequestDetails;

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
 * Schema for the 401K Guideline Plan request body.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class Put401kPlansDefinitionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  @javax.annotation.Nullable
  private Put401kPlansDefinitionRequestDetails details;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private LocalDate startDate;

  /**
   * Type of contribution for the 401K plan.
   */
  @JsonAdapter(ContributionTypeEnum.Adapter.class)
  public enum ContributionTypeEnum {
    PERCENTAGE("PERCENTAGE"),
    
    FIXED_AMOUNT("FIXED_AMOUNT"),
    
    MATCH("MATCH");

    private String value;

    ContributionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContributionTypeEnum fromValue(String value) {
      for (ContributionTypeEnum b : ContributionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContributionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContributionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContributionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContributionTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ContributionTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTRIBUTION_TYPE = "contribution_type";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_TYPE)
  @javax.annotation.Nullable
  private ContributionTypeEnum contributionType;

  public static final String SERIALIZED_NAME_CONTRIBUTION_VALUE = "contribution_value";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_VALUE)
  @javax.annotation.Nullable
  private BigDecimal contributionValue;

  public static final String SERIALIZED_NAME_CONTRIBUTION_VALUE_FOR_MATCH_RATE = "contribution_value_for_match_rate";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_VALUE_FOR_MATCH_RATE)
  @javax.annotation.Nullable
  private List<Put401kPlansDefinitionRequestContributionValueForMatchRateInner> contributionValueForMatchRate = new ArrayList<>();

  public Put401kPlansDefinitionRequest() {
  }

  public Put401kPlansDefinitionRequest name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the 401K plan.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public Put401kPlansDefinitionRequest details(@javax.annotation.Nullable Put401kPlansDefinitionRequestDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  public Put401kPlansDefinitionRequestDetails getDetails() {
    return details;
  }

  public void setDetails(@javax.annotation.Nullable Put401kPlansDefinitionRequestDetails details) {
    this.details = details;
  }


  public Put401kPlansDefinitionRequest startDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the plan.
   * @return startDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
  }


  public Put401kPlansDefinitionRequest contributionType(@javax.annotation.Nullable ContributionTypeEnum contributionType) {
    this.contributionType = contributionType;
    return this;
  }

  /**
   * Type of contribution for the 401K plan.
   * @return contributionType
   */
  @javax.annotation.Nullable
  public ContributionTypeEnum getContributionType() {
    return contributionType;
  }

  public void setContributionType(@javax.annotation.Nullable ContributionTypeEnum contributionType) {
    this.contributionType = contributionType;
  }


  public Put401kPlansDefinitionRequest contributionValue(@javax.annotation.Nullable BigDecimal contributionValue) {
    this.contributionValue = contributionValue;
    return this;
  }

  /**
   * Value of the contribution if type is percent or amount.
   * @return contributionValue
   */
  @javax.annotation.Nullable
  public BigDecimal getContributionValue() {
    return contributionValue;
  }

  public void setContributionValue(@javax.annotation.Nullable BigDecimal contributionValue) {
    this.contributionValue = contributionValue;
  }


  public Put401kPlansDefinitionRequest contributionValueForMatchRate(@javax.annotation.Nullable List<Put401kPlansDefinitionRequestContributionValueForMatchRateInner> contributionValueForMatchRate) {
    this.contributionValueForMatchRate = contributionValueForMatchRate;
    return this;
  }

  public Put401kPlansDefinitionRequest addContributionValueForMatchRateItem(Put401kPlansDefinitionRequestContributionValueForMatchRateInner contributionValueForMatchRateItem) {
    if (this.contributionValueForMatchRate == null) {
      this.contributionValueForMatchRate = new ArrayList<>();
    }
    this.contributionValueForMatchRate.add(contributionValueForMatchRateItem);
    return this;
  }

  /**
   * Array of objects containing limits and rates for match rate contribution type.
   * @return contributionValueForMatchRate
   */
  @javax.annotation.Nullable
  public List<Put401kPlansDefinitionRequestContributionValueForMatchRateInner> getContributionValueForMatchRate() {
    return contributionValueForMatchRate;
  }

  public void setContributionValueForMatchRate(@javax.annotation.Nullable List<Put401kPlansDefinitionRequestContributionValueForMatchRateInner> contributionValueForMatchRate) {
    this.contributionValueForMatchRate = contributionValueForMatchRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Put401kPlansDefinitionRequest put401kPlansDefinitionRequest = (Put401kPlansDefinitionRequest) o;
    return Objects.equals(this.name, put401kPlansDefinitionRequest.name) &&
        Objects.equals(this.details, put401kPlansDefinitionRequest.details) &&
        Objects.equals(this.startDate, put401kPlansDefinitionRequest.startDate) &&
        Objects.equals(this.contributionType, put401kPlansDefinitionRequest.contributionType) &&
        Objects.equals(this.contributionValue, put401kPlansDefinitionRequest.contributionValue) &&
        Objects.equals(this.contributionValueForMatchRate, put401kPlansDefinitionRequest.contributionValueForMatchRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, details, startDate, contributionType, contributionValue, contributionValueForMatchRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Put401kPlansDefinitionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    contributionValue: ").append(toIndentedString(contributionValue)).append("\n");
    sb.append("    contributionValueForMatchRate: ").append(toIndentedString(contributionValueForMatchRate)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("details");
    openapiFields.add("start_date");
    openapiFields.add("contribution_type");
    openapiFields.add("contribution_value");
    openapiFields.add("contribution_value_for_match_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Put401kPlansDefinitionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Put401kPlansDefinitionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Put401kPlansDefinitionRequest is not found in the empty JSON string", Put401kPlansDefinitionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Put401kPlansDefinitionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Put401kPlansDefinitionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Put401kPlansDefinitionRequestDetails.validateJsonElement(jsonObj.get("details"));
      }
      if ((jsonObj.get("contribution_type") != null && !jsonObj.get("contribution_type").isJsonNull()) && !jsonObj.get("contribution_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contribution_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contribution_type").toString()));
      }
      // validate the optional field `contribution_type`
      if (jsonObj.get("contribution_type") != null && !jsonObj.get("contribution_type").isJsonNull()) {
        ContributionTypeEnum.validateJsonElement(jsonObj.get("contribution_type"));
      }
      if (jsonObj.get("contribution_value_for_match_rate") != null && !jsonObj.get("contribution_value_for_match_rate").isJsonNull()) {
        JsonArray jsonArraycontributionValueForMatchRate = jsonObj.getAsJsonArray("contribution_value_for_match_rate");
        if (jsonArraycontributionValueForMatchRate != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contribution_value_for_match_rate").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contribution_value_for_match_rate` to be an array in the JSON string but got `%s`", jsonObj.get("contribution_value_for_match_rate").toString()));
          }

          // validate the optional field `contribution_value_for_match_rate` (array)
          for (int i = 0; i < jsonArraycontributionValueForMatchRate.size(); i++) {
            Put401kPlansDefinitionRequestContributionValueForMatchRateInner.validateJsonElement(jsonArraycontributionValueForMatchRate.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Put401kPlansDefinitionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Put401kPlansDefinitionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Put401kPlansDefinitionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Put401kPlansDefinitionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Put401kPlansDefinitionRequest>() {
           @Override
           public void write(JsonWriter out, Put401kPlansDefinitionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Put401kPlansDefinitionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Put401kPlansDefinitionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Put401kPlansDefinitionRequest
   * @throws IOException if the JSON string is invalid with respect to Put401kPlansDefinitionRequest
   */
  public static Put401kPlansDefinitionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Put401kPlansDefinitionRequest.class);
  }

  /**
   * Convert an instance of Put401kPlansDefinitionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

