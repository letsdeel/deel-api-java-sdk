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
import org.openapitools.client.model.CustomFieldsObjectTypeOneOf;
import org.openapitools.client.model.CustomFieldsObjectTypeOneOf1;
import org.openapitools.client.model.CustomFieldsObjectTypeOneOf2;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class CustomFieldsObjectType extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CustomFieldsObjectType.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CustomFieldsObjectType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CustomFieldsObjectType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CustomFieldsObjectTypeOneOf> adapterCustomFieldsObjectTypeOneOf = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsObjectTypeOneOf.class));
            final TypeAdapter<CustomFieldsObjectTypeOneOf1> adapterCustomFieldsObjectTypeOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsObjectTypeOneOf1.class));
            final TypeAdapter<CustomFieldsObjectTypeOneOf2> adapterCustomFieldsObjectTypeOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsObjectTypeOneOf2.class));

            return (TypeAdapter<T>) new TypeAdapter<CustomFieldsObjectType>() {
                @Override
                public void write(JsonWriter out, CustomFieldsObjectType value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CustomFieldsObjectTypeOneOf`
                    if (value.getActualInstance() instanceof CustomFieldsObjectTypeOneOf) {
                        JsonElement element = adapterCustomFieldsObjectTypeOneOf.toJsonTree((CustomFieldsObjectTypeOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CustomFieldsObjectTypeOneOf1`
                    if (value.getActualInstance() instanceof CustomFieldsObjectTypeOneOf1) {
                        JsonElement element = adapterCustomFieldsObjectTypeOneOf1.toJsonTree((CustomFieldsObjectTypeOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CustomFieldsObjectTypeOneOf2`
                    if (value.getActualInstance() instanceof CustomFieldsObjectTypeOneOf2) {
                        JsonElement element = adapterCustomFieldsObjectTypeOneOf2.toJsonTree((CustomFieldsObjectTypeOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CustomFieldsObjectTypeOneOf, CustomFieldsObjectTypeOneOf1, CustomFieldsObjectTypeOneOf2");
                }

                @Override
                public CustomFieldsObjectType read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CustomFieldsObjectTypeOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CustomFieldsObjectTypeOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterCustomFieldsObjectTypeOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CustomFieldsObjectTypeOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CustomFieldsObjectTypeOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CustomFieldsObjectTypeOneOf'", e);
                    }
                    // deserialize CustomFieldsObjectTypeOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CustomFieldsObjectTypeOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterCustomFieldsObjectTypeOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CustomFieldsObjectTypeOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CustomFieldsObjectTypeOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CustomFieldsObjectTypeOneOf1'", e);
                    }
                    // deserialize CustomFieldsObjectTypeOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CustomFieldsObjectTypeOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterCustomFieldsObjectTypeOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CustomFieldsObjectTypeOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CustomFieldsObjectTypeOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CustomFieldsObjectTypeOneOf2'", e);
                    }

                    if (match == 1) {
                        CustomFieldsObjectType ret = new CustomFieldsObjectType();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CustomFieldsObjectType: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CustomFieldsObjectType() {
        super("oneOf", Boolean.FALSE);
    }

    public CustomFieldsObjectType(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomFieldsObjectTypeOneOf", CustomFieldsObjectTypeOneOf.class);
        schemas.put("CustomFieldsObjectTypeOneOf1", CustomFieldsObjectTypeOneOf1.class);
        schemas.put("CustomFieldsObjectTypeOneOf2", CustomFieldsObjectTypeOneOf2.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CustomFieldsObjectType.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomFieldsObjectTypeOneOf, CustomFieldsObjectTypeOneOf1, CustomFieldsObjectTypeOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CustomFieldsObjectTypeOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CustomFieldsObjectTypeOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CustomFieldsObjectTypeOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CustomFieldsObjectTypeOneOf, CustomFieldsObjectTypeOneOf1, CustomFieldsObjectTypeOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomFieldsObjectTypeOneOf, CustomFieldsObjectTypeOneOf1, CustomFieldsObjectTypeOneOf2
     *
     * @return The actual instance (CustomFieldsObjectTypeOneOf, CustomFieldsObjectTypeOneOf1, CustomFieldsObjectTypeOneOf2)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFieldsObjectTypeOneOf`. If the actual instance is not `CustomFieldsObjectTypeOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFieldsObjectTypeOneOf`
     * @throws ClassCastException if the instance is not `CustomFieldsObjectTypeOneOf`
     */
    public CustomFieldsObjectTypeOneOf getCustomFieldsObjectTypeOneOf() throws ClassCastException {
        return (CustomFieldsObjectTypeOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFieldsObjectTypeOneOf1`. If the actual instance is not `CustomFieldsObjectTypeOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFieldsObjectTypeOneOf1`
     * @throws ClassCastException if the instance is not `CustomFieldsObjectTypeOneOf1`
     */
    public CustomFieldsObjectTypeOneOf1 getCustomFieldsObjectTypeOneOf1() throws ClassCastException {
        return (CustomFieldsObjectTypeOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFieldsObjectTypeOneOf2`. If the actual instance is not `CustomFieldsObjectTypeOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFieldsObjectTypeOneOf2`
     * @throws ClassCastException if the instance is not `CustomFieldsObjectTypeOneOf2`
     */
    public CustomFieldsObjectTypeOneOf2 getCustomFieldsObjectTypeOneOf2() throws ClassCastException {
        return (CustomFieldsObjectTypeOneOf2)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CustomFieldsObjectType
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CustomFieldsObjectTypeOneOf
        try {
            CustomFieldsObjectTypeOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CustomFieldsObjectTypeOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CustomFieldsObjectTypeOneOf1
        try {
            CustomFieldsObjectTypeOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CustomFieldsObjectTypeOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CustomFieldsObjectTypeOneOf2
        try {
            CustomFieldsObjectTypeOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CustomFieldsObjectTypeOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CustomFieldsObjectType with oneOf schemas: CustomFieldsObjectTypeOneOf, CustomFieldsObjectTypeOneOf1, CustomFieldsObjectTypeOneOf2. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CustomFieldsObjectType given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CustomFieldsObjectType
     * @throws IOException if the JSON string is invalid with respect to CustomFieldsObjectType
     */
    public static CustomFieldsObjectType fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CustomFieldsObjectType.class);
    }

    /**
     * Convert an instance of CustomFieldsObjectType to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

