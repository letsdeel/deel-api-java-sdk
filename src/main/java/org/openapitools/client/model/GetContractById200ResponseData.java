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
import org.openapitools.client.model.GetContractById200ResponseDataClient;
import org.openapitools.client.model.GetContractById200ResponseDataQuote;
import org.openapitools.client.model.GetContractById200ResponseDataSeniority;

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
 * GetContractById200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T13:47:44.629538829Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractById200ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  /**
   * Type of a contract.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONGOING_TIME_BASED("ongoing_time_based"),
    
    MILESTONES("milestones"),
    
    TIME_BASED("time_based"),
    
    PAY_AS_YOU_GO_TIME_BASED("pay_as_you_go_time_based"),
    
    COMMISSION("commission"),
    
    PAYG_MILESTONES("payg_milestones"),
    
    PAYG_TASKS("payg_tasks"),
    
    EOR("eor"),
    
    UNKNOWN("unknown"),
    
    EMPLOYEE("employee"),
    
    GLOBAL_PAYROLL("global_payroll"),
    
    SHIELD_MSA("shield_msa"),
    
    HRIS_DIRECT_EMPLOYEE("hris_direct_employee");

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
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  @javax.annotation.Nullable
  private GetContractById200ResponseDataQuote quote;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nullable
  private GetContractById200ResponseDataClient client;

  /**
   * Status of a contract in Deel workflow.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("new"),
    
    UNDER_REVIEW("under_review"),
    
    WAITING_FOR_EMPLOYEE_CONTRACT("waiting_for_employee_contract"),
    
    WAITING_FOR_CLIENT_SIGN("waiting_for_client_sign"),
    
    PROCESSING_PAYMENT("processing_payment"),
    
    WAITING_FOR_CONTRACTOR_SIGN("waiting_for_contractor_sign"),
    
    WAITING_FOR_EOR_SIGN("waiting_for_eor_sign"),
    
    WAITING_FOR_EMPLOYEE_SIGN("waiting_for_employee_sign"),
    
    AWAITING_DEPOSIT_PAYMENT("awaiting_deposit_payment"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    USER_CANCELLED("user_cancelled"),
    
    REJECTED("rejected"),
    
    WAITING_FOR_CLIENT_PAYMENT("waiting_for_client_payment");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private GetContractById200ResponseDataSeniority seniority;

  public GetContractById200ResponseData() {
  }

  public GetContractById200ResponseData id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the contract.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public GetContractById200ResponseData type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of a contract.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public GetContractById200ResponseData quote(@javax.annotation.Nullable GetContractById200ResponseDataQuote quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataQuote getQuote() {
    return quote;
  }

  public void setQuote(@javax.annotation.Nullable GetContractById200ResponseDataQuote quote) {
    this.quote = quote;
  }


  public GetContractById200ResponseData title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the contract.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public GetContractById200ResponseData client(@javax.annotation.Nullable GetContractById200ResponseDataClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nullable GetContractById200ResponseDataClient client) {
    this.client = client;
  }


  public GetContractById200ResponseData status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a contract in Deel workflow.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public GetContractById200ResponseData jobTitle(@javax.annotation.Nonnull String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Job title associated with the contract.
   * @return jobTitle
   */
  @javax.annotation.Nonnull
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nonnull String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public GetContractById200ResponseData seniority(@javax.annotation.Nullable GetContractById200ResponseDataSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable GetContractById200ResponseDataSeniority seniority) {
    this.seniority = seniority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractById200ResponseData getContractById200ResponseData = (GetContractById200ResponseData) o;
    return Objects.equals(this.id, getContractById200ResponseData.id) &&
        Objects.equals(this.type, getContractById200ResponseData.type) &&
        Objects.equals(this.quote, getContractById200ResponseData.quote) &&
        Objects.equals(this.title, getContractById200ResponseData.title) &&
        Objects.equals(this.client, getContractById200ResponseData.client) &&
        Objects.equals(this.status, getContractById200ResponseData.status) &&
        Objects.equals(this.jobTitle, getContractById200ResponseData.jobTitle) &&
        Objects.equals(this.seniority, getContractById200ResponseData.seniority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, quote, title, client, status, jobTitle, seniority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractById200ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("quote");
    openapiFields.add("title");
    openapiFields.add("client");
    openapiFields.add("status");
    openapiFields.add("job_title");
    openapiFields.add("seniority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("seniority");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseData is not found in the empty JSON string", GetContractById200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetContractById200ResponseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the optional field `quote`
      if (jsonObj.get("quote") != null && !jsonObj.get("quote").isJsonNull()) {
        GetContractById200ResponseDataQuote.validateJsonElement(jsonObj.get("quote"));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `client`
      GetContractById200ResponseDataClient.validateJsonElement(jsonObj.get("client"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the required field `seniority`
      GetContractById200ResponseDataSeniority.validateJsonElement(jsonObj.get("seniority"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseData
   */
  public static GetContractById200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseData.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

