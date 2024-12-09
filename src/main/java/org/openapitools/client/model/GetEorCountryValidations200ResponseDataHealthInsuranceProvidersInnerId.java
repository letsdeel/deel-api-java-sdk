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
import java.util.UUID;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UUID> adapterUUID = gson.getDelegateAdapter(this, TypeToken.get(UUID.class));
            final TypeAdapter<Long> adapterLong = gson.getDelegateAdapter(this, TypeToken.get(Long.class));

            return (TypeAdapter<T>) new TypeAdapter<GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId>() {
                @Override
                public void write(JsonWriter out, GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UUID`
                    if (value.getActualInstance() instanceof UUID) {
                        JsonElement element = adapterUUID.toJsonTree((UUID)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Long`
                    if (value.getActualInstance() instanceof Long) {
                        JsonPrimitive primitive = adapterLong.toJsonTree((Long)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Long, UUID");
                }

                @Override
                public GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UUID
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UUID.validateJsonElement(jsonElement);
                        actualAdapter = adapterUUID;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UUID'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UUID failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UUID'", e);
                    }
                    // deserialize Long
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterLong;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Long'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Long failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Long'", e);
                    }

                    if (match == 1) {
                        GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId ret = new GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId() {
        super("oneOf", Boolean.FALSE);
    }

    public GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UUID", UUID.class);
        schemas.put("Long", Long.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Long, UUID
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UUID) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Long) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Long, UUID");
    }

    /**
     * Get the actual instance, which can be the following:
     * Long, UUID
     *
     * @return The actual instance (Long, UUID)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UUID`. If the actual instance is not `UUID`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UUID`
     * @throws ClassCastException if the instance is not `UUID`
     */
    public UUID getUUID() throws ClassCastException {
        return (UUID)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Long`. If the actual instance is not `Long`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Long`
     * @throws ClassCastException if the instance is not `Long`
     */
    public Long getLong() throws ClassCastException {
        return (Long)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UUID
        try {
            UUID.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UUID failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Long
        try {
            if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Long failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId with oneOf schemas: Long, UUID. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId
     * @throws IOException if the JSON string is invalid with respect to GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId
     */
    public static GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId.class);
    }

    /**
     * Convert an instance of GetEorCountryValidations200ResponseDataHealthInsuranceProvidersInnerId to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

