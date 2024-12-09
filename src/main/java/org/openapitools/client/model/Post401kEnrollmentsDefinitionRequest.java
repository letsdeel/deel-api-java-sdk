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
 * Schema for the 401K Guideline Plan request body.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class Post401kEnrollmentsDefinitionRequest {
  /**
   * Type of the contribution for 401k.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ROTH("ROTH"),
    
    TRAD("TRAD"),
    
    LOAN("LOAN"),
    
    NEC("NEC");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
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
  private ContributionTypeEnum contributionType;

  public static final String SERIALIZED_NAME_CONTRIBUTION_LIMIT = "contribution_limit";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_LIMIT)
  private BigDecimal contributionLimit;

  public static final String SERIALIZED_NAME_CONTRIBUTION_VALUE = "contribution_value";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_VALUE)
  private BigDecimal contributionValue;

  public Post401kEnrollmentsDefinitionRequest() {
  }

  public Post401kEnrollmentsDefinitionRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the contribution for 401k.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Post401kEnrollmentsDefinitionRequest details(Get401kEnrollmentsDefinition200ResponseInnerDetails details) {
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

  public void setDetails(Get401kEnrollmentsDefinition200ResponseInnerDetails details) {
    this.details = details;
  }


  public Post401kEnrollmentsDefinitionRequest contributionType(ContributionTypeEnum contributionType) {
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

  public void setContributionType(ContributionTypeEnum contributionType) {
    this.contributionType = contributionType;
  }


  public Post401kEnrollmentsDefinitionRequest contributionLimit(BigDecimal contributionLimit) {
    this.contributionLimit = contributionLimit;
    return this;
  }

  /**
   * Maximum limit of contribution.
   * @return contributionLimit
   */
  @javax.annotation.Nonnull
  public BigDecimal getContributionLimit() {
    return contributionLimit;
  }

  public void setContributionLimit(BigDecimal contributionLimit) {
    this.contributionLimit = contributionLimit;
  }


  public Post401kEnrollmentsDefinitionRequest contributionValue(BigDecimal contributionValue) {
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

  public void setContributionValue(BigDecimal contributionValue) {
    this.contributionValue = contributionValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post401kEnrollmentsDefinitionRequest post401kEnrollmentsDefinitionRequest = (Post401kEnrollmentsDefinitionRequest) o;
    return Objects.equals(this.type, post401kEnrollmentsDefinitionRequest.type) &&
        Objects.equals(this.details, post401kEnrollmentsDefinitionRequest.details) &&
        Objects.equals(this.contributionType, post401kEnrollmentsDefinitionRequest.contributionType) &&
        Objects.equals(this.contributionLimit, post401kEnrollmentsDefinitionRequest.contributionLimit) &&
        Objects.equals(this.contributionValue, post401kEnrollmentsDefinitionRequest.contributionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, details, contributionType, contributionLimit, contributionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post401kEnrollmentsDefinitionRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    contributionLimit: ").append(toIndentedString(contributionLimit)).append("\n");
    sb.append("    contributionValue: ").append(toIndentedString(contributionValue)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("details");
    openapiFields.add("contribution_type");
    openapiFields.add("contribution_limit");
    openapiFields.add("contribution_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("contribution_limit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Post401kEnrollmentsDefinitionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Post401kEnrollmentsDefinitionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Post401kEnrollmentsDefinitionRequest is not found in the empty JSON string", Post401kEnrollmentsDefinitionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Post401kEnrollmentsDefinitionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Post401kEnrollmentsDefinitionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Post401kEnrollmentsDefinitionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Post401kEnrollmentsDefinitionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Post401kEnrollmentsDefinitionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Post401kEnrollmentsDefinitionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Post401kEnrollmentsDefinitionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Post401kEnrollmentsDefinitionRequest>() {
           @Override
           public void write(JsonWriter out, Post401kEnrollmentsDefinitionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Post401kEnrollmentsDefinitionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Post401kEnrollmentsDefinitionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Post401kEnrollmentsDefinitionRequest
   * @throws IOException if the JSON string is invalid with respect to Post401kEnrollmentsDefinitionRequest
   */
  public static Post401kEnrollmentsDefinitionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Post401kEnrollmentsDefinitionRequest.class);
  }

  /**
   * Convert an instance of Post401kEnrollmentsDefinitionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
