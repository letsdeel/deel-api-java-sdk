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
import org.openapitools.client.model.RequestTerminationRequestDataSeveranceOneOf;
import org.openapitools.client.model.RequestTerminationRequestDataSeveranceOneOf1;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class RequestTerminationRequestDataSeverance extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RequestTerminationRequestDataSeverance.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RequestTerminationRequestDataSeverance.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RequestTerminationRequestDataSeverance' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RequestTerminationRequestDataSeveranceOneOf> adapterRequestTerminationRequestDataSeveranceOneOf = gson.getDelegateAdapter(this, TypeToken.get(RequestTerminationRequestDataSeveranceOneOf.class));
            final TypeAdapter<RequestTerminationRequestDataSeveranceOneOf1> adapterRequestTerminationRequestDataSeveranceOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(RequestTerminationRequestDataSeveranceOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<RequestTerminationRequestDataSeverance>() {
                @Override
                public void write(JsonWriter out, RequestTerminationRequestDataSeverance value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RequestTerminationRequestDataSeveranceOneOf`
                    if (value.getActualInstance() instanceof RequestTerminationRequestDataSeveranceOneOf) {
                        JsonElement element = adapterRequestTerminationRequestDataSeveranceOneOf.toJsonTree((RequestTerminationRequestDataSeveranceOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RequestTerminationRequestDataSeveranceOneOf1`
                    if (value.getActualInstance() instanceof RequestTerminationRequestDataSeveranceOneOf1) {
                        JsonElement element = adapterRequestTerminationRequestDataSeveranceOneOf1.toJsonTree((RequestTerminationRequestDataSeveranceOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RequestTerminationRequestDataSeveranceOneOf, RequestTerminationRequestDataSeveranceOneOf1");
                }

                @Override
                public RequestTerminationRequestDataSeverance read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RequestTerminationRequestDataSeveranceOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RequestTerminationRequestDataSeveranceOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterRequestTerminationRequestDataSeveranceOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RequestTerminationRequestDataSeveranceOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RequestTerminationRequestDataSeveranceOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RequestTerminationRequestDataSeveranceOneOf'", e);
                    }
                    // deserialize RequestTerminationRequestDataSeveranceOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RequestTerminationRequestDataSeveranceOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterRequestTerminationRequestDataSeveranceOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RequestTerminationRequestDataSeveranceOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RequestTerminationRequestDataSeveranceOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RequestTerminationRequestDataSeveranceOneOf1'", e);
                    }

                    if (match == 1) {
                        RequestTerminationRequestDataSeverance ret = new RequestTerminationRequestDataSeverance();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RequestTerminationRequestDataSeverance: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RequestTerminationRequestDataSeverance() {
        super("oneOf", Boolean.FALSE);
    }

    public RequestTerminationRequestDataSeverance(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RequestTerminationRequestDataSeveranceOneOf", RequestTerminationRequestDataSeveranceOneOf.class);
        schemas.put("RequestTerminationRequestDataSeveranceOneOf1", RequestTerminationRequestDataSeveranceOneOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RequestTerminationRequestDataSeverance.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RequestTerminationRequestDataSeveranceOneOf, RequestTerminationRequestDataSeveranceOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RequestTerminationRequestDataSeveranceOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RequestTerminationRequestDataSeveranceOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RequestTerminationRequestDataSeveranceOneOf, RequestTerminationRequestDataSeveranceOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * RequestTerminationRequestDataSeveranceOneOf, RequestTerminationRequestDataSeveranceOneOf1
     *
     * @return The actual instance (RequestTerminationRequestDataSeveranceOneOf, RequestTerminationRequestDataSeveranceOneOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RequestTerminationRequestDataSeveranceOneOf`. If the actual instance is not `RequestTerminationRequestDataSeveranceOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RequestTerminationRequestDataSeveranceOneOf`
     * @throws ClassCastException if the instance is not `RequestTerminationRequestDataSeveranceOneOf`
     */
    public RequestTerminationRequestDataSeveranceOneOf getRequestTerminationRequestDataSeveranceOneOf() throws ClassCastException {
        return (RequestTerminationRequestDataSeveranceOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RequestTerminationRequestDataSeveranceOneOf1`. If the actual instance is not `RequestTerminationRequestDataSeveranceOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RequestTerminationRequestDataSeveranceOneOf1`
     * @throws ClassCastException if the instance is not `RequestTerminationRequestDataSeveranceOneOf1`
     */
    public RequestTerminationRequestDataSeveranceOneOf1 getRequestTerminationRequestDataSeveranceOneOf1() throws ClassCastException {
        return (RequestTerminationRequestDataSeveranceOneOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RequestTerminationRequestDataSeverance
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with RequestTerminationRequestDataSeveranceOneOf
        try {
            RequestTerminationRequestDataSeveranceOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RequestTerminationRequestDataSeveranceOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RequestTerminationRequestDataSeveranceOneOf1
        try {
            RequestTerminationRequestDataSeveranceOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RequestTerminationRequestDataSeveranceOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for RequestTerminationRequestDataSeverance with oneOf schemas: RequestTerminationRequestDataSeveranceOneOf, RequestTerminationRequestDataSeveranceOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of RequestTerminationRequestDataSeverance given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RequestTerminationRequestDataSeverance
     * @throws IOException if the JSON string is invalid with respect to RequestTerminationRequestDataSeverance
     */
    public static RequestTerminationRequestDataSeverance fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RequestTerminationRequestDataSeverance.class);
    }

    /**
     * Convert an instance of RequestTerminationRequestDataSeverance to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

