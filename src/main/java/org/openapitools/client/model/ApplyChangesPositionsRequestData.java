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
import java.util.UUID;
import org.openapitools.client.model.ApplyChangesPositionsRequestDataAddInner;
import org.openapitools.client.model.ApplyChangesPositionsRequestDataDeleteInner;
import org.openapitools.client.model.ApplyChangesPositionsRequestDataEditInner;

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
 * ApplyChangesPositionsRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class ApplyChangesPositionsRequestData {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  @javax.annotation.Nullable
  private List<ApplyChangesPositionsRequestDataAddInner> add = new ArrayList<>();

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  @javax.annotation.Nullable
  private List<ApplyChangesPositionsRequestDataEditInner> edit = new ArrayList<>();

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  @javax.annotation.Nullable
  private List<ApplyChangesPositionsRequestDataDeleteInner> delete = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  @javax.annotation.Nonnull
  private UUID profileId;

  public ApplyChangesPositionsRequestData() {
  }

  public ApplyChangesPositionsRequestData add(@javax.annotation.Nullable List<ApplyChangesPositionsRequestDataAddInner> add) {
    this.add = add;
    return this;
  }

  public ApplyChangesPositionsRequestData addAddItem(ApplyChangesPositionsRequestDataAddInner addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

  /**
   * Get add
   * @return add
   */
  @javax.annotation.Nullable
  public List<ApplyChangesPositionsRequestDataAddInner> getAdd() {
    return add;
  }

  public void setAdd(@javax.annotation.Nullable List<ApplyChangesPositionsRequestDataAddInner> add) {
    this.add = add;
  }


  public ApplyChangesPositionsRequestData edit(@javax.annotation.Nullable List<ApplyChangesPositionsRequestDataEditInner> edit) {
    this.edit = edit;
    return this;
  }

  public ApplyChangesPositionsRequestData addEditItem(ApplyChangesPositionsRequestDataEditInner editItem) {
    if (this.edit == null) {
      this.edit = new ArrayList<>();
    }
    this.edit.add(editItem);
    return this;
  }

  /**
   * Get edit
   * @return edit
   */
  @javax.annotation.Nullable
  public List<ApplyChangesPositionsRequestDataEditInner> getEdit() {
    return edit;
  }

  public void setEdit(@javax.annotation.Nullable List<ApplyChangesPositionsRequestDataEditInner> edit) {
    this.edit = edit;
  }


  public ApplyChangesPositionsRequestData delete(@javax.annotation.Nullable List<ApplyChangesPositionsRequestDataDeleteInner> delete) {
    this.delete = delete;
    return this;
  }

  public ApplyChangesPositionsRequestData addDeleteItem(ApplyChangesPositionsRequestDataDeleteInner deleteItem) {
    if (this.delete == null) {
      this.delete = new ArrayList<>();
    }
    this.delete.add(deleteItem);
    return this;
  }

  /**
   * Get delete
   * @return delete
   */
  @javax.annotation.Nullable
  public List<ApplyChangesPositionsRequestDataDeleteInner> getDelete() {
    return delete;
  }

  public void setDelete(@javax.annotation.Nullable List<ApplyChangesPositionsRequestDataDeleteInner> delete) {
    this.delete = delete;
  }


  public ApplyChangesPositionsRequestData profileId(@javax.annotation.Nonnull UUID profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Id of the profile to which the positions belong.
   * @return profileId
   */
  @javax.annotation.Nonnull
  public UUID getProfileId() {
    return profileId;
  }

  public void setProfileId(@javax.annotation.Nonnull UUID profileId) {
    this.profileId = profileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyChangesPositionsRequestData applyChangesPositionsRequestData = (ApplyChangesPositionsRequestData) o;
    return Objects.equals(this.add, applyChangesPositionsRequestData.add) &&
        Objects.equals(this.edit, applyChangesPositionsRequestData.edit) &&
        Objects.equals(this.delete, applyChangesPositionsRequestData.delete) &&
        Objects.equals(this.profileId, applyChangesPositionsRequestData.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, edit, delete, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyChangesPositionsRequestData {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("edit");
    openapiFields.add("delete");
    openapiFields.add("profile_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("profile_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApplyChangesPositionsRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApplyChangesPositionsRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplyChangesPositionsRequestData is not found in the empty JSON string", ApplyChangesPositionsRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApplyChangesPositionsRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplyChangesPositionsRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplyChangesPositionsRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("add") != null && !jsonObj.get("add").isJsonNull()) {
        JsonArray jsonArrayadd = jsonObj.getAsJsonArray("add");
        if (jsonArrayadd != null) {
          // ensure the json data is an array
          if (!jsonObj.get("add").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `add` to be an array in the JSON string but got `%s`", jsonObj.get("add").toString()));
          }

          // validate the optional field `add` (array)
          for (int i = 0; i < jsonArrayadd.size(); i++) {
            ApplyChangesPositionsRequestDataAddInner.validateJsonElement(jsonArrayadd.get(i));
          };
        }
      }
      if (jsonObj.get("edit") != null && !jsonObj.get("edit").isJsonNull()) {
        JsonArray jsonArrayedit = jsonObj.getAsJsonArray("edit");
        if (jsonArrayedit != null) {
          // ensure the json data is an array
          if (!jsonObj.get("edit").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `edit` to be an array in the JSON string but got `%s`", jsonObj.get("edit").toString()));
          }

          // validate the optional field `edit` (array)
          for (int i = 0; i < jsonArrayedit.size(); i++) {
            ApplyChangesPositionsRequestDataEditInner.validateJsonElement(jsonArrayedit.get(i));
          };
        }
      }
      if (jsonObj.get("delete") != null && !jsonObj.get("delete").isJsonNull()) {
        JsonArray jsonArraydelete = jsonObj.getAsJsonArray("delete");
        if (jsonArraydelete != null) {
          // ensure the json data is an array
          if (!jsonObj.get("delete").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `delete` to be an array in the JSON string but got `%s`", jsonObj.get("delete").toString()));
          }

          // validate the optional field `delete` (array)
          for (int i = 0; i < jsonArraydelete.size(); i++) {
            ApplyChangesPositionsRequestDataDeleteInner.validateJsonElement(jsonArraydelete.get(i));
          };
        }
      }
      if (!jsonObj.get("profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplyChangesPositionsRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplyChangesPositionsRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplyChangesPositionsRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplyChangesPositionsRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplyChangesPositionsRequestData>() {
           @Override
           public void write(JsonWriter out, ApplyChangesPositionsRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplyChangesPositionsRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApplyChangesPositionsRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApplyChangesPositionsRequestData
   * @throws IOException if the JSON string is invalid with respect to ApplyChangesPositionsRequestData
   */
  public static ApplyChangesPositionsRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplyChangesPositionsRequestData.class);
  }

  /**
   * Convert an instance of ApplyChangesPositionsRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

