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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.InvoiceAdjustmentApprover;

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
 * InvoiceAdjustmentApproversContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T18:19:15.469015129Z[GMT]", comments = "Generator version: 7.10.0")
public class InvoiceAdjustmentApproversContainer {
  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  @javax.annotation.Nonnull
  private List<InvoiceAdjustmentApprover> approvers = new ArrayList<>();

  public InvoiceAdjustmentApproversContainer() {
  }

  public InvoiceAdjustmentApproversContainer approvers(@javax.annotation.Nonnull List<InvoiceAdjustmentApprover> approvers) {
    this.approvers = approvers;
    return this;
  }

  public InvoiceAdjustmentApproversContainer addApproversItem(InvoiceAdjustmentApprover approversItem) {
    if (this.approvers == null) {
      this.approvers = new ArrayList<>();
    }
    this.approvers.add(approversItem);
    return this;
  }

  /**
   * Get approvers
   * @return approvers
   */
  @javax.annotation.Nonnull
  public List<InvoiceAdjustmentApprover> getApprovers() {
    return approvers;
  }

  public void setApprovers(@javax.annotation.Nonnull List<InvoiceAdjustmentApprover> approvers) {
    this.approvers = approvers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceAdjustmentApproversContainer invoiceAdjustmentApproversContainer = (InvoiceAdjustmentApproversContainer) o;
    return Objects.equals(this.approvers, invoiceAdjustmentApproversContainer.approvers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceAdjustmentApproversContainer {\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
    openapiFields.add("approvers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("approvers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentApproversContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceAdjustmentApproversContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceAdjustmentApproversContainer is not found in the empty JSON string", InvoiceAdjustmentApproversContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceAdjustmentApproversContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceAdjustmentApproversContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceAdjustmentApproversContainer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("approvers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }

      JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
      // validate the required field `approvers` (array)
      for (int i = 0; i < jsonArrayapprovers.size(); i++) {
        InvoiceAdjustmentApprover.validateJsonElement(jsonArrayapprovers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceAdjustmentApproversContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceAdjustmentApproversContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceAdjustmentApproversContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceAdjustmentApproversContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentApproversContainer>() {
           @Override
           public void write(JsonWriter out, InvoiceAdjustmentApproversContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceAdjustmentApproversContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceAdjustmentApproversContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceAdjustmentApproversContainer
   * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentApproversContainer
   */
  public static InvoiceAdjustmentApproversContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentApproversContainer.class);
  }

  /**
   * Convert an instance of InvoiceAdjustmentApproversContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

