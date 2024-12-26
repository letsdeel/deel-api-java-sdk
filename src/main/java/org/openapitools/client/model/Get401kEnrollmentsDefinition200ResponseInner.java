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
import java.util.Arrays;
import org.openapitools.client.model.Get401kEnrollmentsDefinition200ResponseInnerDetails;

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
 * Get401kEnrollmentsDefinition200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class Get401kEnrollmentsDefinition200ResponseInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  @javax.annotation.Nullable
  private Get401kEnrollmentsDefinition200ResponseInnerDetails details;

  /**
   * Type of contribution.
   */
  @JsonAdapter(ContributionTypeEnum.Adapter.class)
  public enum ContributionTypeEnum {
    PERCENTAGE("PERCENTAGE"),
    
    FIXED_AMOUNT("FIXED_AMOUNT");

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

  public static final String SERIALIZED_NAME_CONTRIBUTION_LIMIT = "contribution_limit";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_LIMIT)
  @javax.annotation.Nullable
  private BigDecimal contributionLimit;

  public static final String SERIALIZED_NAME_CONTRIBUTION_VALUE = "contribution_value";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_VALUE)
  @javax.annotation.Nullable
  private BigDecimal contributionValue;

  /**
   * Type of the contribution for 401k.
   */
  @JsonAdapter(Contribution401kTypeEnum.Adapter.class)
  public enum Contribution401kTypeEnum {
    ROTH("ROTH"),
    
    TRAD("TRAD"),
    
    LOAN("LOAN"),
    
    NEC("NEC");

    private String value;

    Contribution401kTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Contribution401kTypeEnum fromValue(String value) {
      for (Contribution401kTypeEnum b : Contribution401kTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<Contribution401kTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Contribution401kTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Contribution401kTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return Contribution401kTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      Contribution401kTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTRIBUTION401K_TYPE = "contribution_401k_type";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION401K_TYPE)
  @javax.annotation.Nullable
  private Contribution401kTypeEnum contribution401kType;

  public Get401kEnrollmentsDefinition200ResponseInner() {
  }

  public Get401kEnrollmentsDefinition200ResponseInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Enrollment id.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public Get401kEnrollmentsDefinition200ResponseInner details(@javax.annotation.Nullable Get401kEnrollmentsDefinition200ResponseInnerDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  public Get401kEnrollmentsDefinition200ResponseInnerDetails getDetails() {
    return details;
  }

  public void setDetails(@javax.annotation.Nullable Get401kEnrollmentsDefinition200ResponseInnerDetails details) {
    this.details = details;
  }


  public Get401kEnrollmentsDefinition200ResponseInner contributionType(@javax.annotation.Nullable ContributionTypeEnum contributionType) {
    this.contributionType = contributionType;
    return this;
  }

  /**
   * Type of contribution.
   * @return contributionType
   */
  @javax.annotation.Nullable
  public ContributionTypeEnum getContributionType() {
    return contributionType;
  }

  public void setContributionType(@javax.annotation.Nullable ContributionTypeEnum contributionType) {
    this.contributionType = contributionType;
  }


  public Get401kEnrollmentsDefinition200ResponseInner contributionLimit(@javax.annotation.Nullable BigDecimal contributionLimit) {
    this.contributionLimit = contributionLimit;
    return this;
  }

  /**
   * Maximum limit of contribution.
   * @return contributionLimit
   */
  @javax.annotation.Nullable
  public BigDecimal getContributionLimit() {
    return contributionLimit;
  }

  public void setContributionLimit(@javax.annotation.Nullable BigDecimal contributionLimit) {
    this.contributionLimit = contributionLimit;
  }


  public Get401kEnrollmentsDefinition200ResponseInner contributionValue(@javax.annotation.Nullable BigDecimal contributionValue) {
    this.contributionValue = contributionValue;
    return this;
  }

  /**
   * Value of the contribution.
   * @return contributionValue
   */
  @javax.annotation.Nullable
  public BigDecimal getContributionValue() {
    return contributionValue;
  }

  public void setContributionValue(@javax.annotation.Nullable BigDecimal contributionValue) {
    this.contributionValue = contributionValue;
  }


  public Get401kEnrollmentsDefinition200ResponseInner contribution401kType(@javax.annotation.Nullable Contribution401kTypeEnum contribution401kType) {
    this.contribution401kType = contribution401kType;
    return this;
  }

  /**
   * Type of the contribution for 401k.
   * @return contribution401kType
   */
  @javax.annotation.Nullable
  public Contribution401kTypeEnum getContribution401kType() {
    return contribution401kType;
  }

  public void setContribution401kType(@javax.annotation.Nullable Contribution401kTypeEnum contribution401kType) {
    this.contribution401kType = contribution401kType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Get401kEnrollmentsDefinition200ResponseInner get401kEnrollmentsDefinition200ResponseInner = (Get401kEnrollmentsDefinition200ResponseInner) o;
    return Objects.equals(this.id, get401kEnrollmentsDefinition200ResponseInner.id) &&
        Objects.equals(this.details, get401kEnrollmentsDefinition200ResponseInner.details) &&
        Objects.equals(this.contributionType, get401kEnrollmentsDefinition200ResponseInner.contributionType) &&
        Objects.equals(this.contributionLimit, get401kEnrollmentsDefinition200ResponseInner.contributionLimit) &&
        Objects.equals(this.contributionValue, get401kEnrollmentsDefinition200ResponseInner.contributionValue) &&
        Objects.equals(this.contribution401kType, get401kEnrollmentsDefinition200ResponseInner.contribution401kType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, details, contributionType, contributionLimit, contributionValue, contribution401kType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get401kEnrollmentsDefinition200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    contributionLimit: ").append(toIndentedString(contributionLimit)).append("\n");
    sb.append("    contributionValue: ").append(toIndentedString(contributionValue)).append("\n");
    sb.append("    contribution401kType: ").append(toIndentedString(contribution401kType)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("contribution_type");
    openapiFields.add("contribution_limit");
    openapiFields.add("contribution_value");
    openapiFields.add("contribution_401k_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Get401kEnrollmentsDefinition200ResponseInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Get401kEnrollmentsDefinition200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Get401kEnrollmentsDefinition200ResponseInner is not found in the empty JSON string", Get401kEnrollmentsDefinition200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Get401kEnrollmentsDefinition200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Get401kEnrollmentsDefinition200ResponseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Get401kEnrollmentsDefinition200ResponseInnerDetails.validateJsonElement(jsonObj.get("details"));
      }
      if ((jsonObj.get("contribution_type") != null && !jsonObj.get("contribution_type").isJsonNull()) && !jsonObj.get("contribution_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contribution_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contribution_type").toString()));
      }
      // validate the optional field `contribution_type`
      if (jsonObj.get("contribution_type") != null && !jsonObj.get("contribution_type").isJsonNull()) {
        ContributionTypeEnum.validateJsonElement(jsonObj.get("contribution_type"));
      }
      if ((jsonObj.get("contribution_401k_type") != null && !jsonObj.get("contribution_401k_type").isJsonNull()) && !jsonObj.get("contribution_401k_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contribution_401k_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contribution_401k_type").toString()));
      }
      // validate the optional field `contribution_401k_type`
      if (jsonObj.get("contribution_401k_type") != null && !jsonObj.get("contribution_401k_type").isJsonNull()) {
        Contribution401kTypeEnum.validateJsonElement(jsonObj.get("contribution_401k_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Get401kEnrollmentsDefinition200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get401kEnrollmentsDefinition200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get401kEnrollmentsDefinition200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get401kEnrollmentsDefinition200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<Get401kEnrollmentsDefinition200ResponseInner>() {
           @Override
           public void write(JsonWriter out, Get401kEnrollmentsDefinition200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Get401kEnrollmentsDefinition200ResponseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Get401kEnrollmentsDefinition200ResponseInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Get401kEnrollmentsDefinition200ResponseInner
   * @throws IOException if the JSON string is invalid with respect to Get401kEnrollmentsDefinition200ResponseInner
   */
  public static Get401kEnrollmentsDefinition200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get401kEnrollmentsDefinition200ResponseInner.class);
  }

  /**
   * Convert an instance of Get401kEnrollmentsDefinition200ResponseInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

