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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:03:48.437639881Z[GMT]", comments = "Generator version: 7.10.0")
public class GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Float> adapterFloat = gson.getDelegateAdapter(this, TypeToken.get(Float.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            return (TypeAdapter<T>) new TypeAdapter<GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount>() {
                @Override
                public void write(JsonWriter out, GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Float`
                    if (value.getActualInstance() instanceof Float) {
                        JsonPrimitive primitive = adapterFloat.toJsonTree((Float)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: Float, String");
                }

                @Override
                public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Float
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterFloat;
                        GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount ret = new GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Float failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Float'", e);
                    }
                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isString()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterString;
                        GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount ret = new GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount() {
        super("anyOf", Boolean.FALSE);
    }

    public GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Float", Float.class);
        schemas.put("String", String.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Float, String
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Float) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Float, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * Float, String
     *
     * @return The actual instance (Float, String)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Float`. If the actual instance is not `Float`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Float`
     * @throws ClassCastException if the instance is not `Float`
     */
    public Float getFloat() throws ClassCastException {
        return (Float)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Float
        try {
            if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Float failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with String
        try {
            if (!jsonElement.getAsJsonPrimitive().isString()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount with anyOf schemas: Float, String. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount
     * @throws IOException if the JSON string is invalid with respect to GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount
     */
    public static GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount.class);
    }

    /**
     * Convert an instance of GetProfileEntitlements200ResponseEntitlementsInnerRolloversInnerAmount to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

