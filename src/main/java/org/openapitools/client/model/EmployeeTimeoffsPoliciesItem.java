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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.EmployeeTimeoffsPoliciesItemEntitlement;

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
 * EmployeeTimeoffsPoliciesItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeeTimeoffsPoliciesItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_UNIT_AMOUNT = "unit_amount";
  @SerializedName(SERIALIZED_NAME_UNIT_AMOUNT)
  @javax.annotation.Nonnull
  private BigDecimal unitAmount;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  @javax.annotation.Nullable
  private BigDecimal used;

  public static final String SERIALIZED_NAME_TRACKING_START_DATE = "tracking_start_date";
  @SerializedName(SERIALIZED_NAME_TRACKING_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime trackingStartDate;

  public static final String SERIALIZED_NAME_TRACKING_END_DATE = "tracking_end_date";
  @SerializedName(SERIALIZED_NAME_TRACKING_END_DATE)
  @javax.annotation.Nullable
  private Object trackingEndDate = null;

  public static final String SERIALIZED_NAME_ENTITLEMENT = "entitlement";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENT)
  @javax.annotation.Nonnull
  private EmployeeTimeoffsPoliciesItemEntitlement entitlement;

  public EmployeeTimeoffsPoliciesItem() {
  }

  public EmployeeTimeoffsPoliciesItem id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the time off policy.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public EmployeeTimeoffsPoliciesItem type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of time off policy.
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public EmployeeTimeoffsPoliciesItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the time off policy.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public EmployeeTimeoffsPoliciesItem description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the time off policy.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public EmployeeTimeoffsPoliciesItem unitAmount(@javax.annotation.Nonnull BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
    return this;
  }

  /**
   * Unit amount of the time off policy.
   * @return unitAmount
   */
  @javax.annotation.Nonnull
  public BigDecimal getUnitAmount() {
    return unitAmount;
  }

  public void setUnitAmount(@javax.annotation.Nonnull BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }


  public EmployeeTimeoffsPoliciesItem used(@javax.annotation.Nullable BigDecimal used) {
    this.used = used;
    return this;
  }

  /**
   * Used time off policy.
   * @return used
   */
  @javax.annotation.Nullable
  public BigDecimal getUsed() {
    return used;
  }

  public void setUsed(@javax.annotation.Nullable BigDecimal used) {
    this.used = used;
  }


  public EmployeeTimeoffsPoliciesItem trackingStartDate(@javax.annotation.Nullable OffsetDateTime trackingStartDate) {
    this.trackingStartDate = trackingStartDate;
    return this;
  }

  /**
   * Start date of the time off policy.
   * @return trackingStartDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTrackingStartDate() {
    return trackingStartDate;
  }

  public void setTrackingStartDate(@javax.annotation.Nullable OffsetDateTime trackingStartDate) {
    this.trackingStartDate = trackingStartDate;
  }


  public EmployeeTimeoffsPoliciesItem trackingEndDate(@javax.annotation.Nullable Object trackingEndDate) {
    this.trackingEndDate = trackingEndDate;
    return this;
  }

  /**
   * End date of the time off policy.
   * @return trackingEndDate
   */
  @javax.annotation.Nullable
  public Object getTrackingEndDate() {
    return trackingEndDate;
  }

  public void setTrackingEndDate(@javax.annotation.Nullable Object trackingEndDate) {
    this.trackingEndDate = trackingEndDate;
  }


  public EmployeeTimeoffsPoliciesItem entitlement(@javax.annotation.Nonnull EmployeeTimeoffsPoliciesItemEntitlement entitlement) {
    this.entitlement = entitlement;
    return this;
  }

  /**
   * Get entitlement
   * @return entitlement
   */
  @javax.annotation.Nonnull
  public EmployeeTimeoffsPoliciesItemEntitlement getEntitlement() {
    return entitlement;
  }

  public void setEntitlement(@javax.annotation.Nonnull EmployeeTimeoffsPoliciesItemEntitlement entitlement) {
    this.entitlement = entitlement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTimeoffsPoliciesItem employeeTimeoffsPoliciesItem = (EmployeeTimeoffsPoliciesItem) o;
    return Objects.equals(this.id, employeeTimeoffsPoliciesItem.id) &&
        Objects.equals(this.type, employeeTimeoffsPoliciesItem.type) &&
        Objects.equals(this.name, employeeTimeoffsPoliciesItem.name) &&
        Objects.equals(this.description, employeeTimeoffsPoliciesItem.description) &&
        Objects.equals(this.unitAmount, employeeTimeoffsPoliciesItem.unitAmount) &&
        Objects.equals(this.used, employeeTimeoffsPoliciesItem.used) &&
        Objects.equals(this.trackingStartDate, employeeTimeoffsPoliciesItem.trackingStartDate) &&
        Objects.equals(this.trackingEndDate, employeeTimeoffsPoliciesItem.trackingEndDate) &&
        Objects.equals(this.entitlement, employeeTimeoffsPoliciesItem.entitlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, description, unitAmount, used, trackingStartDate, trackingEndDate, entitlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTimeoffsPoliciesItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    trackingStartDate: ").append(toIndentedString(trackingStartDate)).append("\n");
    sb.append("    trackingEndDate: ").append(toIndentedString(trackingEndDate)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("unit_amount");
    openapiFields.add("used");
    openapiFields.add("tracking_start_date");
    openapiFields.add("tracking_end_date");
    openapiFields.add("entitlement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("unit_amount");
    openapiRequiredFields.add("used");
    openapiRequiredFields.add("tracking_start_date");
    openapiRequiredFields.add("tracking_end_date");
    openapiRequiredFields.add("entitlement");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeeTimeoffsPoliciesItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeeTimeoffsPoliciesItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTimeoffsPoliciesItem is not found in the empty JSON string", EmployeeTimeoffsPoliciesItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeeTimeoffsPoliciesItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeTimeoffsPoliciesItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeeTimeoffsPoliciesItem.openapiRequiredFields) {
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
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `entitlement`
      EmployeeTimeoffsPoliciesItemEntitlement.validateJsonElement(jsonObj.get("entitlement"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeTimeoffsPoliciesItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTimeoffsPoliciesItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTimeoffsPoliciesItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTimeoffsPoliciesItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTimeoffsPoliciesItem>() {
           @Override
           public void write(JsonWriter out, EmployeeTimeoffsPoliciesItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeTimeoffsPoliciesItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeeTimeoffsPoliciesItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeeTimeoffsPoliciesItem
   * @throws IOException if the JSON string is invalid with respect to EmployeeTimeoffsPoliciesItem
   */
  public static EmployeeTimeoffsPoliciesItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTimeoffsPoliciesItem.class);
  }

  /**
   * Convert an instance of EmployeeTimeoffsPoliciesItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

