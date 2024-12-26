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
import org.openapitools.client.model.WorkStatementScaleEnum;

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
 * CompensationDetailsOfContractToCreatePayAsYouGoTimeBased
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class CompensationDetailsOfContractToCreatePayAsYouGoTimeBased {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nonnull
  private WorkStatementScaleEnum scale;

  public CompensationDetailsOfContractToCreatePayAsYouGoTimeBased() {
  }

  public CompensationDetailsOfContractToCreatePayAsYouGoTimeBased amount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
  }


  public CompensationDetailsOfContractToCreatePayAsYouGoTimeBased scale(@javax.annotation.Nonnull WorkStatementScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nonnull
  public WorkStatementScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nonnull WorkStatementScaleEnum scale) {
    this.scale = scale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompensationDetailsOfContractToCreatePayAsYouGoTimeBased compensationDetailsOfContractToCreatePayAsYouGoTimeBased = (CompensationDetailsOfContractToCreatePayAsYouGoTimeBased) o;
    return Objects.equals(this.amount, compensationDetailsOfContractToCreatePayAsYouGoTimeBased.amount) &&
        Objects.equals(this.scale, compensationDetailsOfContractToCreatePayAsYouGoTimeBased.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensationDetailsOfContractToCreatePayAsYouGoTimeBased {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("scale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("scale");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompensationDetailsOfContractToCreatePayAsYouGoTimeBased
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompensationDetailsOfContractToCreatePayAsYouGoTimeBased is not found in the empty JSON string", CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompensationDetailsOfContractToCreatePayAsYouGoTimeBased` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `scale`
      WorkStatementScaleEnum.validateJsonElement(jsonObj.get("scale"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompensationDetailsOfContractToCreatePayAsYouGoTimeBased' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompensationDetailsOfContractToCreatePayAsYouGoTimeBased> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.class));

       return (TypeAdapter<T>) new TypeAdapter<CompensationDetailsOfContractToCreatePayAsYouGoTimeBased>() {
           @Override
           public void write(JsonWriter out, CompensationDetailsOfContractToCreatePayAsYouGoTimeBased value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompensationDetailsOfContractToCreatePayAsYouGoTimeBased read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompensationDetailsOfContractToCreatePayAsYouGoTimeBased given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompensationDetailsOfContractToCreatePayAsYouGoTimeBased
   * @throws IOException if the JSON string is invalid with respect to CompensationDetailsOfContractToCreatePayAsYouGoTimeBased
   */
  public static CompensationDetailsOfContractToCreatePayAsYouGoTimeBased fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.class);
  }

  /**
   * Convert an instance of CompensationDetailsOfContractToCreatePayAsYouGoTimeBased to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

