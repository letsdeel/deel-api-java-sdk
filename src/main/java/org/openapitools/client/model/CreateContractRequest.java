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
import org.openapitools.client.model.CreateContractRequestAnyOf;
import org.openapitools.client.model.CreateContractRequestAnyOf1;
import org.openapitools.client.model.CreateContractRequestAnyOf2;
import org.openapitools.client.model.CreateContractRequestAnyOf3;
import org.openapitools.client.model.CreateContractRequestAnyOfAllOfClient;
import org.openapitools.client.model.CreateContractRequestAnyOfAllOfCompensationDetails;
import org.openapitools.client.model.CreateContractRequestAnyOfAllOfJobTitle;
import org.openapitools.client.model.CreateContractRequestAnyOfAllOfMeta;
import org.openapitools.client.model.CreateContractRequestAnyOfAllOfSeniority;
import org.openapitools.client.model.CreateContractRequestAnyOfAllOfWorker;
import org.openapitools.jackson.nullable.JsonNullable;



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
public class CreateContractRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateContractRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateContractRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateContractRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateContractRequestAnyOf> adapterCreateContractRequestAnyOf = gson.getDelegateAdapter(this, TypeToken.get(CreateContractRequestAnyOf.class));
            final TypeAdapter<CreateContractRequestAnyOf1> adapterCreateContractRequestAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(CreateContractRequestAnyOf1.class));
            final TypeAdapter<CreateContractRequestAnyOf2> adapterCreateContractRequestAnyOf2 = gson.getDelegateAdapter(this, TypeToken.get(CreateContractRequestAnyOf2.class));
            final TypeAdapter<CreateContractRequestAnyOf3> adapterCreateContractRequestAnyOf3 = gson.getDelegateAdapter(this, TypeToken.get(CreateContractRequestAnyOf3.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateContractRequest>() {
                @Override
                public void write(JsonWriter out, CreateContractRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateContractRequestAnyOf`
                    if (value.getActualInstance() instanceof CreateContractRequestAnyOf) {
                        JsonElement element = adapterCreateContractRequestAnyOf.toJsonTree((CreateContractRequestAnyOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateContractRequestAnyOf1`
                    if (value.getActualInstance() instanceof CreateContractRequestAnyOf1) {
                        JsonElement element = adapterCreateContractRequestAnyOf1.toJsonTree((CreateContractRequestAnyOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateContractRequestAnyOf2`
                    if (value.getActualInstance() instanceof CreateContractRequestAnyOf2) {
                        JsonElement element = adapterCreateContractRequestAnyOf2.toJsonTree((CreateContractRequestAnyOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateContractRequestAnyOf3`
                    if (value.getActualInstance() instanceof CreateContractRequestAnyOf3) {
                        JsonElement element = adapterCreateContractRequestAnyOf3.toJsonTree((CreateContractRequestAnyOf3)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: CreateContractRequestAnyOf, CreateContractRequestAnyOf1, CreateContractRequestAnyOf2, CreateContractRequestAnyOf3");
                }

                @Override
                public CreateContractRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateContractRequestAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateContractRequestAnyOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateContractRequestAnyOf;
                        CreateContractRequest ret = new CreateContractRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateContractRequestAnyOf'", e);
                    }
                    // deserialize CreateContractRequestAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateContractRequestAnyOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateContractRequestAnyOf1;
                        CreateContractRequest ret = new CreateContractRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateContractRequestAnyOf1'", e);
                    }
                    // deserialize CreateContractRequestAnyOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateContractRequestAnyOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateContractRequestAnyOf2;
                        CreateContractRequest ret = new CreateContractRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateContractRequestAnyOf2'", e);
                    }
                    // deserialize CreateContractRequestAnyOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateContractRequestAnyOf3.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateContractRequestAnyOf3;
                        CreateContractRequest ret = new CreateContractRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf3 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateContractRequestAnyOf3'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for CreateContractRequest: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateContractRequest() {
        super("anyOf", Boolean.FALSE);
    }

    public CreateContractRequest(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateContractRequestAnyOf", CreateContractRequestAnyOf.class);
        schemas.put("CreateContractRequestAnyOf1", CreateContractRequestAnyOf1.class);
        schemas.put("CreateContractRequestAnyOf2", CreateContractRequestAnyOf2.class);
        schemas.put("CreateContractRequestAnyOf3", CreateContractRequestAnyOf3.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateContractRequest.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * CreateContractRequestAnyOf, CreateContractRequestAnyOf1, CreateContractRequestAnyOf2, CreateContractRequestAnyOf3
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateContractRequestAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateContractRequestAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateContractRequestAnyOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateContractRequestAnyOf3) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateContractRequestAnyOf, CreateContractRequestAnyOf1, CreateContractRequestAnyOf2, CreateContractRequestAnyOf3");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateContractRequestAnyOf, CreateContractRequestAnyOf1, CreateContractRequestAnyOf2, CreateContractRequestAnyOf3
     *
     * @return The actual instance (CreateContractRequestAnyOf, CreateContractRequestAnyOf1, CreateContractRequestAnyOf2, CreateContractRequestAnyOf3)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateContractRequestAnyOf`. If the actual instance is not `CreateContractRequestAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateContractRequestAnyOf`
     * @throws ClassCastException if the instance is not `CreateContractRequestAnyOf`
     */
    public CreateContractRequestAnyOf getCreateContractRequestAnyOf() throws ClassCastException {
        return (CreateContractRequestAnyOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateContractRequestAnyOf1`. If the actual instance is not `CreateContractRequestAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateContractRequestAnyOf1`
     * @throws ClassCastException if the instance is not `CreateContractRequestAnyOf1`
     */
    public CreateContractRequestAnyOf1 getCreateContractRequestAnyOf1() throws ClassCastException {
        return (CreateContractRequestAnyOf1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateContractRequestAnyOf2`. If the actual instance is not `CreateContractRequestAnyOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateContractRequestAnyOf2`
     * @throws ClassCastException if the instance is not `CreateContractRequestAnyOf2`
     */
    public CreateContractRequestAnyOf2 getCreateContractRequestAnyOf2() throws ClassCastException {
        return (CreateContractRequestAnyOf2)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateContractRequestAnyOf3`. If the actual instance is not `CreateContractRequestAnyOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateContractRequestAnyOf3`
     * @throws ClassCastException if the instance is not `CreateContractRequestAnyOf3`
     */
    public CreateContractRequestAnyOf3 getCreateContractRequestAnyOf3() throws ClassCastException {
        return (CreateContractRequestAnyOf3)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateContractRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CreateContractRequestAnyOf
        try {
            CreateContractRequestAnyOf.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateContractRequestAnyOf1
        try {
            CreateContractRequestAnyOf1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateContractRequestAnyOf2
        try {
            CreateContractRequestAnyOf2.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateContractRequestAnyOf3
        try {
            CreateContractRequestAnyOf3.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateContractRequestAnyOf3 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for CreateContractRequest with anyOf schemas: CreateContractRequestAnyOf, CreateContractRequestAnyOf1, CreateContractRequestAnyOf2, CreateContractRequestAnyOf3. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of CreateContractRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateContractRequest
     * @throws IOException if the JSON string is invalid with respect to CreateContractRequest
     */
    public static CreateContractRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateContractRequest.class);
    }

    /**
     * Convert an instance of CreateContractRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

