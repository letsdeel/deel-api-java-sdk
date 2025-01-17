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
 * MilestoneProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class MilestoneProperties {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private String amount;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public MilestoneProperties() {
  }

  public MilestoneProperties amount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount to be paid for the milestone.
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
  }


  public MilestoneProperties title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of milestone.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public MilestoneProperties description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of milestone.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MilestoneProperties milestoneProperties = (MilestoneProperties) o;
    return Objects.equals(this.amount, milestoneProperties.amount) &&
        Objects.equals(this.title, milestoneProperties.title) &&
        Objects.equals(this.description, milestoneProperties.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilestoneProperties {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MilestoneProperties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MilestoneProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MilestoneProperties is not found in the empty JSON string", MilestoneProperties.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MilestoneProperties.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MilestoneProperties` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MilestoneProperties.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MilestoneProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MilestoneProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MilestoneProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MilestoneProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<MilestoneProperties>() {
           @Override
           public void write(JsonWriter out, MilestoneProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MilestoneProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MilestoneProperties given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MilestoneProperties
   * @throws IOException if the JSON string is invalid with respect to MilestoneProperties
   */
  public static MilestoneProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MilestoneProperties.class);
  }

  /**
   * Convert an instance of MilestoneProperties to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

