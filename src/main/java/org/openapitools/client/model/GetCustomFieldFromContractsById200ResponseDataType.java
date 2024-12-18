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
import org.openapitools.client.model.GetCustomFieldFromContractsById200ResponseDataTypeOneOf;
import org.openapitools.client.model.GetCustomFieldsFromPeople200ResponseDataTypeOneOf;
import org.openapitools.client.model.GetCustomFieldsFromPeople200ResponseDataTypeOneOf1;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCustomFieldFromContractsById200ResponseDataType extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetCustomFieldFromContractsById200ResponseDataType.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetCustomFieldFromContractsById200ResponseDataType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetCustomFieldFromContractsById200ResponseDataType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf> adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldsFromPeople200ResponseDataTypeOneOf.class));
            final TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf1> adapterGetCustomFieldsFromPeople200ResponseDataTypeOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldsFromPeople200ResponseDataTypeOneOf1.class));
            final TypeAdapter<GetCustomFieldFromContractsById200ResponseDataTypeOneOf> adapterGetCustomFieldFromContractsById200ResponseDataTypeOneOf = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldFromContractsById200ResponseDataTypeOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<GetCustomFieldFromContractsById200ResponseDataType>() {
                @Override
                public void write(JsonWriter out, GetCustomFieldFromContractsById200ResponseDataType value) throws IOException {
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
                    // check if the actual instance is of the type `GetCustomFieldFromContractsById200ResponseDataTypeOneOf`
                    if (value.getActualInstance() instanceof GetCustomFieldFromContractsById200ResponseDataTypeOneOf) {
                        JsonElement element = adapterGetCustomFieldFromContractsById200ResponseDataTypeOneOf.toJsonTree((GetCustomFieldFromContractsById200ResponseDataTypeOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GetCustomFieldFromContractsById200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1");
                }

                @Override
                public GetCustomFieldFromContractsById200ResponseDataType read(JsonReader in) throws IOException {
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
                    // deserialize GetCustomFieldFromContractsById200ResponseDataTypeOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldFromContractsById200ResponseDataTypeOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldFromContractsById200ResponseDataTypeOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldFromContractsById200ResponseDataTypeOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldFromContractsById200ResponseDataTypeOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldFromContractsById200ResponseDataTypeOneOf'", e);
                    }

                    if (match == 1) {
                        GetCustomFieldFromContractsById200ResponseDataType ret = new GetCustomFieldFromContractsById200ResponseDataType();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetCustomFieldFromContractsById200ResponseDataType: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetCustomFieldFromContractsById200ResponseDataType() {
        super("oneOf", Boolean.FALSE);
    }

    public GetCustomFieldFromContractsById200ResponseDataType(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetCustomFieldsFromPeople200ResponseDataTypeOneOf", GetCustomFieldsFromPeople200ResponseDataTypeOneOf.class);
        schemas.put("GetCustomFieldsFromPeople200ResponseDataTypeOneOf1", GetCustomFieldsFromPeople200ResponseDataTypeOneOf1.class);
        schemas.put("GetCustomFieldFromContractsById200ResponseDataTypeOneOf", GetCustomFieldFromContractsById200ResponseDataTypeOneOf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetCustomFieldFromContractsById200ResponseDataType.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GetCustomFieldFromContractsById200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1
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

        if (instance instanceof GetCustomFieldFromContractsById200ResponseDataTypeOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetCustomFieldFromContractsById200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetCustomFieldFromContractsById200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1
     *
     * @return The actual instance (GetCustomFieldFromContractsById200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1)
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
     * Get the actual instance of `GetCustomFieldFromContractsById200ResponseDataTypeOneOf`. If the actual instance is not `GetCustomFieldFromContractsById200ResponseDataTypeOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldFromContractsById200ResponseDataTypeOneOf`
     * @throws ClassCastException if the instance is not `GetCustomFieldFromContractsById200ResponseDataTypeOneOf`
     */
    public GetCustomFieldFromContractsById200ResponseDataTypeOneOf getGetCustomFieldFromContractsById200ResponseDataTypeOneOf() throws ClassCastException {
        return (GetCustomFieldFromContractsById200ResponseDataTypeOneOf)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetCustomFieldFromContractsById200ResponseDataType
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
        // validate the json string with GetCustomFieldFromContractsById200ResponseDataTypeOneOf
        try {
            GetCustomFieldFromContractsById200ResponseDataTypeOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldFromContractsById200ResponseDataTypeOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for GetCustomFieldFromContractsById200ResponseDataType with oneOf schemas: GetCustomFieldFromContractsById200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf, GetCustomFieldsFromPeople200ResponseDataTypeOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of GetCustomFieldFromContractsById200ResponseDataType given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetCustomFieldFromContractsById200ResponseDataType
     * @throws IOException if the JSON string is invalid with respect to GetCustomFieldFromContractsById200ResponseDataType
     */
    public static GetCustomFieldFromContractsById200ResponseDataType fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetCustomFieldFromContractsById200ResponseDataType.class);
    }

    /**
     * Convert an instance of GetCustomFieldFromContractsById200ResponseDataType to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

