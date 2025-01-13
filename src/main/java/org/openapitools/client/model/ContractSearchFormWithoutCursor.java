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
import org.openapitools.client.model.ContractSearchFormWithoutCursorCountries;
import org.openapitools.client.model.ContractSearchFormWithoutCursorCurrencies;
import org.openapitools.client.model.ContractSearchFormWithoutCursorStatuses;
import org.openapitools.client.model.ContractSearchFormWithoutCursorTypes;
import org.openapitools.client.model.ContractsSortByEnum;
import org.openapitools.client.model.IdentifierValueForFilter;
import org.openapitools.client.model.SortDirEnum;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractSearchFormWithoutCursor {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nullable
  private String limit = "10";

  public static final String SERIALIZED_NAME_ORDER_DIRECTION = "order_direction";
  @SerializedName(SERIALIZED_NAME_ORDER_DIRECTION)
  @javax.annotation.Nullable
  private SortDirEnum orderDirection;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  @javax.annotation.Nullable
  private ContractSearchFormWithoutCursorTypes types;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  @javax.annotation.Nullable
  private ContractSearchFormWithoutCursorStatuses statuses;

  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  @javax.annotation.Nullable
  private IdentifierValueForFilter teamId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  @javax.annotation.Nullable
  private ContractSearchFormWithoutCursorCountries countries;

  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  @javax.annotation.Nullable
  private ContractSearchFormWithoutCursorCurrencies currencies;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  @javax.annotation.Nullable
  private String search;

  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  @javax.annotation.Nullable
  private ContractsSortByEnum sortBy;

  public ContractSearchFormWithoutCursor() {
  }

  public ContractSearchFormWithoutCursor limit(@javax.annotation.Nullable String limit) {
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


  public ContractSearchFormWithoutCursor orderDirection(@javax.annotation.Nullable SortDirEnum orderDirection) {
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


  public ContractSearchFormWithoutCursor types(@javax.annotation.Nullable ContractSearchFormWithoutCursorTypes types) {
    this.types = types;
    return this;
  }

  /**
   * Get types
   * @return types
   */
  @javax.annotation.Nullable
  public ContractSearchFormWithoutCursorTypes getTypes() {
    return types;
  }

  public void setTypes(@javax.annotation.Nullable ContractSearchFormWithoutCursorTypes types) {
    this.types = types;
  }


  public ContractSearchFormWithoutCursor statuses(@javax.annotation.Nullable ContractSearchFormWithoutCursorStatuses statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Get statuses
   * @return statuses
   */
  @javax.annotation.Nullable
  public ContractSearchFormWithoutCursorStatuses getStatuses() {
    return statuses;
  }

  public void setStatuses(@javax.annotation.Nullable ContractSearchFormWithoutCursorStatuses statuses) {
    this.statuses = statuses;
  }


  public ContractSearchFormWithoutCursor teamId(@javax.annotation.Nullable IdentifierValueForFilter teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   */
  @javax.annotation.Nullable
  public IdentifierValueForFilter getTeamId() {
    return teamId;
  }

  public void setTeamId(@javax.annotation.Nullable IdentifierValueForFilter teamId) {
    this.teamId = teamId;
  }


  public ContractSearchFormWithoutCursor externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Filter contracts for given external ID
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public ContractSearchFormWithoutCursor countries(@javax.annotation.Nullable ContractSearchFormWithoutCursorCountries countries) {
    this.countries = countries;
    return this;
  }

  /**
   * Get countries
   * @return countries
   */
  @javax.annotation.Nullable
  public ContractSearchFormWithoutCursorCountries getCountries() {
    return countries;
  }

  public void setCountries(@javax.annotation.Nullable ContractSearchFormWithoutCursorCountries countries) {
    this.countries = countries;
  }


  public ContractSearchFormWithoutCursor currencies(@javax.annotation.Nullable ContractSearchFormWithoutCursorCurrencies currencies) {
    this.currencies = currencies;
    return this;
  }

  /**
   * Get currencies
   * @return currencies
   */
  @javax.annotation.Nullable
  public ContractSearchFormWithoutCursorCurrencies getCurrencies() {
    return currencies;
  }

  public void setCurrencies(@javax.annotation.Nullable ContractSearchFormWithoutCursorCurrencies currencies) {
    this.currencies = currencies;
  }


  public ContractSearchFormWithoutCursor search(@javax.annotation.Nullable String search) {
    this.search = search;
    return this;
  }

  /**
   * Include a contract if by name or contractor name contains given search term.
   * @return search
   */
  @javax.annotation.Nullable
  public String getSearch() {
    return search;
  }

  public void setSearch(@javax.annotation.Nullable String search) {
    this.search = search;
  }


  public ContractSearchFormWithoutCursor sortBy(@javax.annotation.Nullable ContractsSortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
   */
  @javax.annotation.Nullable
  public ContractsSortByEnum getSortBy() {
    return sortBy;
  }

  public void setSortBy(@javax.annotation.Nullable ContractsSortByEnum sortBy) {
    this.sortBy = sortBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractSearchFormWithoutCursor contractSearchFormWithoutCursor = (ContractSearchFormWithoutCursor) o;
    return Objects.equals(this.limit, contractSearchFormWithoutCursor.limit) &&
        Objects.equals(this.orderDirection, contractSearchFormWithoutCursor.orderDirection) &&
        Objects.equals(this.types, contractSearchFormWithoutCursor.types) &&
        Objects.equals(this.statuses, contractSearchFormWithoutCursor.statuses) &&
        Objects.equals(this.teamId, contractSearchFormWithoutCursor.teamId) &&
        Objects.equals(this.externalId, contractSearchFormWithoutCursor.externalId) &&
        Objects.equals(this.countries, contractSearchFormWithoutCursor.countries) &&
        Objects.equals(this.currencies, contractSearchFormWithoutCursor.currencies) &&
        Objects.equals(this.search, contractSearchFormWithoutCursor.search) &&
        Objects.equals(this.sortBy, contractSearchFormWithoutCursor.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, orderDirection, types, statuses, teamId, externalId, countries, currencies, search, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractSearchFormWithoutCursor {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    orderDirection: ").append(toIndentedString(orderDirection)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    openapiFields.add("order_direction");
    openapiFields.add("types");
    openapiFields.add("statuses");
    openapiFields.add("team_id");
    openapiFields.add("external_id");
    openapiFields.add("countries");
    openapiFields.add("currencies");
    openapiFields.add("search");
    openapiFields.add("sort_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractSearchFormWithoutCursor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractSearchFormWithoutCursor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractSearchFormWithoutCursor is not found in the empty JSON string", ContractSearchFormWithoutCursor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractSearchFormWithoutCursor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractSearchFormWithoutCursor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) && !jsonObj.get("limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit").toString()));
      }
      // validate the optional field `order_direction`
      if (jsonObj.get("order_direction") != null && !jsonObj.get("order_direction").isJsonNull()) {
        SortDirEnum.validateJsonElement(jsonObj.get("order_direction"));
      }
      // validate the optional field `types`
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonNull()) {
        ContractSearchFormWithoutCursorTypes.validateJsonElement(jsonObj.get("types"));
      }
      // validate the optional field `statuses`
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        ContractSearchFormWithoutCursorStatuses.validateJsonElement(jsonObj.get("statuses"));
      }
      // validate the optional field `team_id`
      if (jsonObj.get("team_id") != null && !jsonObj.get("team_id").isJsonNull()) {
        IdentifierValueForFilter.validateJsonElement(jsonObj.get("team_id"));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the optional field `countries`
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonNull()) {
        ContractSearchFormWithoutCursorCountries.validateJsonElement(jsonObj.get("countries"));
      }
      // validate the optional field `currencies`
      if (jsonObj.get("currencies") != null && !jsonObj.get("currencies").isJsonNull()) {
        ContractSearchFormWithoutCursorCurrencies.validateJsonElement(jsonObj.get("currencies"));
      }
      if ((jsonObj.get("search") != null && !jsonObj.get("search").isJsonNull()) && !jsonObj.get("search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search").toString()));
      }
      // validate the optional field `sort_by`
      if (jsonObj.get("sort_by") != null && !jsonObj.get("sort_by").isJsonNull()) {
        ContractsSortByEnum.validateJsonElement(jsonObj.get("sort_by"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractSearchFormWithoutCursor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractSearchFormWithoutCursor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractSearchFormWithoutCursor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractSearchFormWithoutCursor.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractSearchFormWithoutCursor>() {
           @Override
           public void write(JsonWriter out, ContractSearchFormWithoutCursor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractSearchFormWithoutCursor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractSearchFormWithoutCursor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractSearchFormWithoutCursor
   * @throws IOException if the JSON string is invalid with respect to ContractSearchFormWithoutCursor
   */
  public static ContractSearchFormWithoutCursor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractSearchFormWithoutCursor.class);
  }

  /**
   * Convert an instance of ContractSearchFormWithoutCursor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

