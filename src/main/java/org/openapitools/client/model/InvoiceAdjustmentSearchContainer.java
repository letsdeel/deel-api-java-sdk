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
import java.util.Arrays;
import org.openapitools.client.model.InvoiceAdjustmentSearchContainerContractTypes;
import org.openapitools.client.model.InvoiceAdjustmentSearchContainerStatuses;
import org.openapitools.client.model.InvoiceAdjustmentSearchContainerTypes;
import org.openapitools.client.model.SortDirEnum;
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
 * This is a model to make it easier to understand and restrict search parameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class InvoiceAdjustmentSearchContainer {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nullable
  private String limit = "10";

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  @javax.annotation.Nullable
  private String offset = "10";

  public static final String SERIALIZED_NAME_ORDER_DIRECTION = "order_direction";
  @SerializedName(SERIALIZED_NAME_ORDER_DIRECTION)
  @javax.annotation.Nullable
  private SortDirEnum orderDirection;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoice_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  @javax.annotation.Nullable
  private String invoiceId;

  public static final String SERIALIZED_NAME_REPORTER_ID = "reporter_id";
  @SerializedName(SERIALIZED_NAME_REPORTER_ID)
  @javax.annotation.Nullable
  private String reporterId;

  public static final String SERIALIZED_NAME_CONTRACT_TYPES = "contract_types";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPES)
  @javax.annotation.Nullable
  private InvoiceAdjustmentSearchContainerContractTypes contractTypes;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  @javax.annotation.Nullable
  private InvoiceAdjustmentSearchContainerTypes types;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  @javax.annotation.Nullable
  private InvoiceAdjustmentSearchContainerStatuses statuses;

  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  @javax.annotation.Nullable
  private LocalDate dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  @javax.annotation.Nullable
  private LocalDate dateTo;

  public InvoiceAdjustmentSearchContainer() {
  }

  public InvoiceAdjustmentSearchContainer limit(@javax.annotation.Nullable String limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Return a page of results with given number of records.
   * @return limit
   */
  @javax.annotation.Nullable
  public String getLimit() {
    return limit;
  }

  public void setLimit(@javax.annotation.Nullable String limit) {
    this.limit = limit;
  }


  public InvoiceAdjustmentSearchContainer offset(@javax.annotation.Nullable String offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @javax.annotation.Nullable
  public String getOffset() {
    return offset;
  }

  public void setOffset(@javax.annotation.Nullable String offset) {
    this.offset = offset;
  }


  public InvoiceAdjustmentSearchContainer orderDirection(@javax.annotation.Nullable SortDirEnum orderDirection) {
    this.orderDirection = orderDirection;
    return this;
  }

  /**
   * Get orderDirection
   * @return orderDirection
   */
  @javax.annotation.Nullable
  public SortDirEnum getOrderDirection() {
    return orderDirection;
  }

  public void setOrderDirection(@javax.annotation.Nullable SortDirEnum orderDirection) {
    this.orderDirection = orderDirection;
  }


  public InvoiceAdjustmentSearchContainer contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public InvoiceAdjustmentSearchContainer invoiceId(@javax.annotation.Nullable String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Get invoiceId
   * @return invoiceId
   */
  @javax.annotation.Nullable
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(@javax.annotation.Nullable String invoiceId) {
    this.invoiceId = invoiceId;
  }


  public InvoiceAdjustmentSearchContainer reporterId(@javax.annotation.Nullable String reporterId) {
    this.reporterId = reporterId;
    return this;
  }

  /**
   * Get reporterId
   * @return reporterId
   */
  @javax.annotation.Nullable
  public String getReporterId() {
    return reporterId;
  }

  public void setReporterId(@javax.annotation.Nullable String reporterId) {
    this.reporterId = reporterId;
  }


  public InvoiceAdjustmentSearchContainer contractTypes(@javax.annotation.Nullable InvoiceAdjustmentSearchContainerContractTypes contractTypes) {
    this.contractTypes = contractTypes;
    return this;
  }

  /**
   * Get contractTypes
   * @return contractTypes
   */
  @javax.annotation.Nullable
  public InvoiceAdjustmentSearchContainerContractTypes getContractTypes() {
    return contractTypes;
  }

  public void setContractTypes(@javax.annotation.Nullable InvoiceAdjustmentSearchContainerContractTypes contractTypes) {
    this.contractTypes = contractTypes;
  }


  public InvoiceAdjustmentSearchContainer types(@javax.annotation.Nullable InvoiceAdjustmentSearchContainerTypes types) {
    this.types = types;
    return this;
  }

  /**
   * Get types
   * @return types
   */
  @javax.annotation.Nullable
  public InvoiceAdjustmentSearchContainerTypes getTypes() {
    return types;
  }

  public void setTypes(@javax.annotation.Nullable InvoiceAdjustmentSearchContainerTypes types) {
    this.types = types;
  }


  public InvoiceAdjustmentSearchContainer statuses(@javax.annotation.Nullable InvoiceAdjustmentSearchContainerStatuses statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Get statuses
   * @return statuses
   */
  @javax.annotation.Nullable
  public InvoiceAdjustmentSearchContainerStatuses getStatuses() {
    return statuses;
  }

  public void setStatuses(@javax.annotation.Nullable InvoiceAdjustmentSearchContainerStatuses statuses) {
    this.statuses = statuses;
  }


  public InvoiceAdjustmentSearchContainer dateFrom(@javax.annotation.Nullable LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return dateFrom
   */
  @javax.annotation.Nullable
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(@javax.annotation.Nullable LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }


  public InvoiceAdjustmentSearchContainer dateTo(@javax.annotation.Nullable LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return dateTo
   */
  @javax.annotation.Nullable
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(@javax.annotation.Nullable LocalDate dateTo) {
    this.dateTo = dateTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceAdjustmentSearchContainer invoiceAdjustmentSearchContainer = (InvoiceAdjustmentSearchContainer) o;
    return Objects.equals(this.limit, invoiceAdjustmentSearchContainer.limit) &&
        Objects.equals(this.offset, invoiceAdjustmentSearchContainer.offset) &&
        Objects.equals(this.orderDirection, invoiceAdjustmentSearchContainer.orderDirection) &&
        Objects.equals(this.contractId, invoiceAdjustmentSearchContainer.contractId) &&
        Objects.equals(this.invoiceId, invoiceAdjustmentSearchContainer.invoiceId) &&
        Objects.equals(this.reporterId, invoiceAdjustmentSearchContainer.reporterId) &&
        Objects.equals(this.contractTypes, invoiceAdjustmentSearchContainer.contractTypes) &&
        Objects.equals(this.types, invoiceAdjustmentSearchContainer.types) &&
        Objects.equals(this.statuses, invoiceAdjustmentSearchContainer.statuses) &&
        Objects.equals(this.dateFrom, invoiceAdjustmentSearchContainer.dateFrom) &&
        Objects.equals(this.dateTo, invoiceAdjustmentSearchContainer.dateTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, orderDirection, contractId, invoiceId, reporterId, contractTypes, types, statuses, dateFrom, dateTo);
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
    sb.append("class InvoiceAdjustmentSearchContainer {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderDirection: ").append(toIndentedString(orderDirection)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    reporterId: ").append(toIndentedString(reporterId)).append("\n");
    sb.append("    contractTypes: ").append(toIndentedString(contractTypes)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("order_direction");
    openapiFields.add("contract_id");
    openapiFields.add("invoice_id");
    openapiFields.add("reporter_id");
    openapiFields.add("contract_types");
    openapiFields.add("types");
    openapiFields.add("statuses");
    openapiFields.add("date_from");
    openapiFields.add("date_to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentSearchContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceAdjustmentSearchContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceAdjustmentSearchContainer is not found in the empty JSON string", InvoiceAdjustmentSearchContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceAdjustmentSearchContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceAdjustmentSearchContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) && !jsonObj.get("limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit").toString()));
      }
      if ((jsonObj.get("offset") != null && !jsonObj.get("offset").isJsonNull()) && !jsonObj.get("offset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offset").toString()));
      }
      // validate the optional field `order_direction`
      if (jsonObj.get("order_direction") != null && !jsonObj.get("order_direction").isJsonNull()) {
        SortDirEnum.validateJsonElement(jsonObj.get("order_direction"));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("invoice_id") != null && !jsonObj.get("invoice_id").isJsonNull()) && !jsonObj.get("invoice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_id").toString()));
      }
      if ((jsonObj.get("reporter_id") != null && !jsonObj.get("reporter_id").isJsonNull()) && !jsonObj.get("reporter_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reporter_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reporter_id").toString()));
      }
      // validate the optional field `contract_types`
      if (jsonObj.get("contract_types") != null && !jsonObj.get("contract_types").isJsonNull()) {
        InvoiceAdjustmentSearchContainerContractTypes.validateJsonElement(jsonObj.get("contract_types"));
      }
      // validate the optional field `types`
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonNull()) {
        InvoiceAdjustmentSearchContainerTypes.validateJsonElement(jsonObj.get("types"));
      }
      // validate the optional field `statuses`
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        InvoiceAdjustmentSearchContainerStatuses.validateJsonElement(jsonObj.get("statuses"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceAdjustmentSearchContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceAdjustmentSearchContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceAdjustmentSearchContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceAdjustmentSearchContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentSearchContainer>() {
           @Override
           public void write(JsonWriter out, InvoiceAdjustmentSearchContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceAdjustmentSearchContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceAdjustmentSearchContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceAdjustmentSearchContainer
   * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentSearchContainer
   */
  public static InvoiceAdjustmentSearchContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentSearchContainer.class);
  }

  /**
   * Convert an instance of InvoiceAdjustmentSearchContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

