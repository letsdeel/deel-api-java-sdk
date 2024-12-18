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
import org.openapitools.client.model.CreateDirectEmployeeRequestDataClientDepartment;
import org.openapitools.client.model.HrisPositionToChangeContainerDataAddInner;
import org.openapitools.client.model.HrisPositionToChangeContainerDataEditInner;

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
 * HrisPositionToChangeContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:50:05.582888578Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisPositionToChangeContainerData {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  @javax.annotation.Nullable
  private List<HrisPositionToChangeContainerDataAddInner> add = new ArrayList<>();

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  @javax.annotation.Nullable
  private List<HrisPositionToChangeContainerDataEditInner> edit = new ArrayList<>();

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  @javax.annotation.Nullable
  private List<CreateDirectEmployeeRequestDataClientDepartment> delete = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  @javax.annotation.Nonnull
  private UUID profileId;

  public HrisPositionToChangeContainerData() {
  }

  public HrisPositionToChangeContainerData add(@javax.annotation.Nullable List<HrisPositionToChangeContainerDataAddInner> add) {
    this.add = add;
    return this;
  }

  public HrisPositionToChangeContainerData addAddItem(HrisPositionToChangeContainerDataAddInner addItem) {
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
  public List<HrisPositionToChangeContainerDataAddInner> getAdd() {
    return add;
  }

  public void setAdd(@javax.annotation.Nullable List<HrisPositionToChangeContainerDataAddInner> add) {
    this.add = add;
  }


  public HrisPositionToChangeContainerData edit(@javax.annotation.Nullable List<HrisPositionToChangeContainerDataEditInner> edit) {
    this.edit = edit;
    return this;
  }

  public HrisPositionToChangeContainerData addEditItem(HrisPositionToChangeContainerDataEditInner editItem) {
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
  public List<HrisPositionToChangeContainerDataEditInner> getEdit() {
    return edit;
  }

  public void setEdit(@javax.annotation.Nullable List<HrisPositionToChangeContainerDataEditInner> edit) {
    this.edit = edit;
  }


  public HrisPositionToChangeContainerData delete(@javax.annotation.Nullable List<CreateDirectEmployeeRequestDataClientDepartment> delete) {
    this.delete = delete;
    return this;
  }

  public HrisPositionToChangeContainerData addDeleteItem(CreateDirectEmployeeRequestDataClientDepartment deleteItem) {
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
  public List<CreateDirectEmployeeRequestDataClientDepartment> getDelete() {
    return delete;
  }

  public void setDelete(@javax.annotation.Nullable List<CreateDirectEmployeeRequestDataClientDepartment> delete) {
    this.delete = delete;
  }


  public HrisPositionToChangeContainerData profileId(@javax.annotation.Nonnull UUID profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
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
    HrisPositionToChangeContainerData hrisPositionToChangeContainerData = (HrisPositionToChangeContainerData) o;
    return Objects.equals(this.add, hrisPositionToChangeContainerData.add) &&
        Objects.equals(this.edit, hrisPositionToChangeContainerData.edit) &&
        Objects.equals(this.delete, hrisPositionToChangeContainerData.delete) &&
        Objects.equals(this.profileId, hrisPositionToChangeContainerData.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, edit, delete, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrisPositionToChangeContainerData {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to HrisPositionToChangeContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisPositionToChangeContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisPositionToChangeContainerData is not found in the empty JSON string", HrisPositionToChangeContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisPositionToChangeContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisPositionToChangeContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisPositionToChangeContainerData.openapiRequiredFields) {
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
            HrisPositionToChangeContainerDataAddInner.validateJsonElement(jsonArrayadd.get(i));
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
            HrisPositionToChangeContainerDataEditInner.validateJsonElement(jsonArrayedit.get(i));
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
            CreateDirectEmployeeRequestDataClientDepartment.validateJsonElement(jsonArraydelete.get(i));
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
       if (!HrisPositionToChangeContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisPositionToChangeContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisPositionToChangeContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisPositionToChangeContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisPositionToChangeContainerData>() {
           @Override
           public void write(JsonWriter out, HrisPositionToChangeContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisPositionToChangeContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisPositionToChangeContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisPositionToChangeContainerData
   * @throws IOException if the JSON string is invalid with respect to HrisPositionToChangeContainerData
   */
  public static HrisPositionToChangeContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisPositionToChangeContainerData.class);
  }

  /**
   * Convert an instance of HrisPositionToChangeContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

