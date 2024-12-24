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
import org.openapitools.client.model.GetCustomFieldsFromPeople200ResponseDataTypeOneOf;
import org.openapitools.client.model.GetCustomFieldsFromPeople200ResponseDataTypeOneOf1;
import org.openapitools.client.model.GetCustomFieldsFromPeople200ResponseDataTypeOneOf2;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCustomFieldsFromPeople200ResponseDataType extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetCustomFieldsFromPeople200ResponseDataType.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetCustomFieldsFromPeople200ResponseDataType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetCustomFieldsFromPeople200ResponseDataType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf> adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldsFromPeople200ResponseDataTypeOneOf.class));
            final TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf1> adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldsFromPeople200ResponseDataTypeOneOf1.class));
            final TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf2> adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.class));

            return (TypeAdapter<T>) new TypeAdapter<GetCustomFieldsFromPeople200ResponseDataType>() {
                @Override
                public void write(JsonWriter out, GetCustomFieldsFromPeople200ResponseDataType value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetCustomFieldsFromPeople200ResponseDataTypeOneOf`
                    if (value.getActualInstance() instanceof GetCustomFieldsFromPeople200ResponseDataTypeOneOf) {
                        JsonElement element = adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf.toJsonTree((GetCustomFieldsFromPeople200ResponseDataTypeOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetCustomFieldsFromPeople200ResponseDataTypeOneOf1`
                    if (value.getActualInstance() instanceof GetCustomFieldsFromPeople200ResponseDataTypeOneOf1) {
                        JsonElement element = adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf1.toJsonTree((GetCustomFieldsFromPeople200ResponseDataTypeOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetCustomFieldsFromPeople200ResponseDataTypeOneOf2`
                    if (value.getActualInstance() instanceof GetCustomFieldsFromPeople200ResponseDataTypeOneOf2) {
                        JsonElement element = adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf2.toJsonTree((GetCustomFieldsFromPeople200ResponseDataTypeOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2");
                }

                @Override
                public GetCustomFieldsFromPeople200ResponseDataType read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GetCustomFieldsFromPeople200ResponseDataTypeOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldsFromPeople200ResponseDataTypeOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldsFromPeople200ResponseDataTypeOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf'", e);
                    }
                    // deserialize GetCustomFieldsFromPeople200ResponseDataTypeOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldsFromPeople200ResponseDataTypeOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldsFromPeople200ResponseDataTypeOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf1'", e);
                    }
                    // deserialize GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf2'", e);
                    }

                    if (match == 1) {
                        GetCustomFieldsFromPeople200ResponseDataType ret = new GetCustomFieldsFromPeople200ResponseDataType();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetCustomFieldsFromPeople200ResponseDataType: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetCustomFieldsFromPeople200ResponseDataType() {
        super("oneOf", Boolean.FALSE);
    }

    public GetCustomFieldsFromPeople200ResponseDataType(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetCustomFieldsFromPeople200ResponseDataTypeOneOf", GetCustomFieldsFromPeople200ResponseDataTypeOneOf.class);
        schemas.put("GetCustomFieldsFromPeople200ResponseDataTypeOneOf1", GetCustomFieldsFromPeople200ResponseDataTypeOneOf1.class);
        schemas.put("GetCustomFieldsFromPeople200ResponseDataTypeOneOf2", GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetCustomFieldsFromPeople200ResponseDataType.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetCustomFieldsFromPeople200ResponseDataTypeOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetCustomFieldsFromPeople200ResponseDataTypeOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetCustomFieldsFromPeople200ResponseDataTypeOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
     *
     * @return The actual instance (GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldsFromPeople200ResponseDataTypeOneOf`. If the actual instance is not `GetCustomFieldsFromPeople200ResponseDataTypeOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldsFromPeople200ResponseDataTypeOneOf`
     * @throws ClassCastException if the instance is not `GetCustomFieldsFromPeople200ResponseDataTypeOneOf`
     */
    public GetCustomFieldsFromPeople200ResponseDataTypeOneOf getGetCustomFieldsFromPeople200ResponseDataTypeOneOf() throws ClassCastException {
        return (GetCustomFieldsFromPeople200ResponseDataTypeOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldsFromPeople200ResponseDataTypeOneOf1`. If the actual instance is not `GetCustomFieldsFromPeople200ResponseDataTypeOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldsFromPeople200ResponseDataTypeOneOf1`
     * @throws ClassCastException if the instance is not `GetCustomFieldsFromPeople200ResponseDataTypeOneOf1`
     */
    public GetCustomFieldsFromPeople200ResponseDataTypeOneOf1 getGetCustomFieldsFromPeople200ResponseDataTypeOneOf1() throws ClassCastException {
        return (GetCustomFieldsFromPeople200ResponseDataTypeOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldsFromPeople200ResponseDataTypeOneOf2`. If the actual instance is not `GetCustomFieldsFromPeople200ResponseDataTypeOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldsFromPeople200ResponseDataTypeOneOf2`
     * @throws ClassCastException if the instance is not `GetCustomFieldsFromPeople200ResponseDataTypeOneOf2`
     */
    public GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 getGetCustomFieldsFromPeople200ResponseDataTypeOneOf2() throws ClassCastException {
        return (GetCustomFieldsFromPeople200ResponseDataTypeOneOf2)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetCustomFieldsFromPeople200ResponseDataType
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with GetCustomFieldsFromPeople200ResponseDataTypeOneOf
        try {
            GetCustomFieldsFromPeople200ResponseDataTypeOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldsFromPeople200ResponseDataTypeOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetCustomFieldsFromPeople200ResponseDataTypeOneOf1
        try {
            GetCustomFieldsFromPeople200ResponseDataTypeOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldsFromPeople200ResponseDataTypeOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
        try {
            GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for GetCustomFieldsFromPeople200ResponseDataType with oneOf schemas: GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of GetCustomFieldsFromPeople200ResponseDataType given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetCustomFieldsFromPeople200ResponseDataType
     * @throws IOException if the JSON string is invalid with respect to GetCustomFieldsFromPeople200ResponseDataType
     */
    public static GetCustomFieldsFromPeople200ResponseDataType fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetCustomFieldsFromPeople200ResponseDataType.class);
    }

    /**
     * Convert an instance of GetCustomFieldsFromPeople200ResponseDataType to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

