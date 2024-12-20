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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.CreateDirectEmployeeRequestDataEmploymentOneOf;
import org.openapitools.client.model.CreateDirectEmployeeRequestDataEmploymentOneOf1;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateDirectEmployeeRequestDataEmployment extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateDirectEmployeeRequestDataEmployment.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateDirectEmployeeRequestDataEmployment.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateDirectEmployeeRequestDataEmployment' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateDirectEmployeeRequestDataEmploymentOneOf> adapterCreateDirectEmployeeRequestDataEmploymentOneOf = gson.getDelegateAdapter(this, TypeToken.get(CreateDirectEmployeeRequestDataEmploymentOneOf.class));
            final TypeAdapter<CreateDirectEmployeeRequestDataEmploymentOneOf1> adapterCreateDirectEmployeeRequestDataEmploymentOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(CreateDirectEmployeeRequestDataEmploymentOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateDirectEmployeeRequestDataEmployment>() {
                @Override
                public void write(JsonWriter out, CreateDirectEmployeeRequestDataEmployment value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateDirectEmployeeRequestDataEmploymentOneOf`
                    if (value.getActualInstance() instanceof CreateDirectEmployeeRequestDataEmploymentOneOf) {
                        JsonElement element = adapterCreateDirectEmployeeRequestDataEmploymentOneOf.toJsonTree((CreateDirectEmployeeRequestDataEmploymentOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateDirectEmployeeRequestDataEmploymentOneOf1`
                    if (value.getActualInstance() instanceof CreateDirectEmployeeRequestDataEmploymentOneOf1) {
                        JsonElement element = adapterCreateDirectEmployeeRequestDataEmploymentOneOf1.toJsonTree((CreateDirectEmployeeRequestDataEmploymentOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateDirectEmployeeRequestDataEmploymentOneOf, CreateDirectEmployeeRequestDataEmploymentOneOf1");
                }

                @Override
                public CreateDirectEmployeeRequestDataEmployment read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateDirectEmployeeRequestDataEmploymentOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateDirectEmployeeRequestDataEmploymentOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateDirectEmployeeRequestDataEmploymentOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateDirectEmployeeRequestDataEmploymentOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateDirectEmployeeRequestDataEmploymentOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateDirectEmployeeRequestDataEmploymentOneOf'", e);
                    }
                    // deserialize CreateDirectEmployeeRequestDataEmploymentOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateDirectEmployeeRequestDataEmploymentOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateDirectEmployeeRequestDataEmploymentOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateDirectEmployeeRequestDataEmploymentOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateDirectEmployeeRequestDataEmploymentOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateDirectEmployeeRequestDataEmploymentOneOf1'", e);
                    }

                    if (match == 1) {
                        CreateDirectEmployeeRequestDataEmployment ret = new CreateDirectEmployeeRequestDataEmployment();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateDirectEmployeeRequestDataEmployment: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateDirectEmployeeRequestDataEmployment() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateDirectEmployeeRequestDataEmployment(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateDirectEmployeeRequestDataEmploymentOneOf", CreateDirectEmployeeRequestDataEmploymentOneOf.class);
        schemas.put("CreateDirectEmployeeRequestDataEmploymentOneOf1", CreateDirectEmployeeRequestDataEmploymentOneOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateDirectEmployeeRequestDataEmployment.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateDirectEmployeeRequestDataEmploymentOneOf, CreateDirectEmployeeRequestDataEmploymentOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateDirectEmployeeRequestDataEmploymentOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateDirectEmployeeRequestDataEmploymentOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateDirectEmployeeRequestDataEmploymentOneOf, CreateDirectEmployeeRequestDataEmploymentOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateDirectEmployeeRequestDataEmploymentOneOf, CreateDirectEmployeeRequestDataEmploymentOneOf1
     *
     * @return The actual instance (CreateDirectEmployeeRequestDataEmploymentOneOf, CreateDirectEmployeeRequestDataEmploymentOneOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateDirectEmployeeRequestDataEmploymentOneOf`. If the actual instance is not `CreateDirectEmployeeRequestDataEmploymentOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateDirectEmployeeRequestDataEmploymentOneOf`
     * @throws ClassCastException if the instance is not `CreateDirectEmployeeRequestDataEmploymentOneOf`
     */
    public CreateDirectEmployeeRequestDataEmploymentOneOf getCreateDirectEmployeeRequestDataEmploymentOneOf() throws ClassCastException {
        return (CreateDirectEmployeeRequestDataEmploymentOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateDirectEmployeeRequestDataEmploymentOneOf1`. If the actual instance is not `CreateDirectEmployeeRequestDataEmploymentOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateDirectEmployeeRequestDataEmploymentOneOf1`
     * @throws ClassCastException if the instance is not `CreateDirectEmployeeRequestDataEmploymentOneOf1`
     */
    public CreateDirectEmployeeRequestDataEmploymentOneOf1 getCreateDirectEmployeeRequestDataEmploymentOneOf1() throws ClassCastException {
        return (CreateDirectEmployeeRequestDataEmploymentOneOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateDirectEmployeeRequestDataEmployment
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CreateDirectEmployeeRequestDataEmploymentOneOf
        try {
            CreateDirectEmployeeRequestDataEmploymentOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateDirectEmployeeRequestDataEmploymentOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateDirectEmployeeRequestDataEmploymentOneOf1
        try {
            CreateDirectEmployeeRequestDataEmploymentOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateDirectEmployeeRequestDataEmploymentOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateDirectEmployeeRequestDataEmployment with oneOf schemas: CreateDirectEmployeeRequestDataEmploymentOneOf, CreateDirectEmployeeRequestDataEmploymentOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateDirectEmployeeRequestDataEmployment given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateDirectEmployeeRequestDataEmployment
     * @throws IOException if the JSON string is invalid with respect to CreateDirectEmployeeRequestDataEmployment
     */
    public static CreateDirectEmployeeRequestDataEmployment fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateDirectEmployeeRequestDataEmployment.class);
    }

    /**
     * Convert an instance of CreateDirectEmployeeRequestDataEmployment to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

