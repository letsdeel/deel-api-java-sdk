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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf1;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf2;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf3;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf4;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf5;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf6;



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
public class UpsertCustomFieldValueFromWorkerRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpsertCustomFieldValueFromWorkerRequestData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpsertCustomFieldValueFromWorkerRequestData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpsertCustomFieldValueFromWorkerRequestData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf1> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf1.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf2> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf2.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf3> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf3 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf3.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf4> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf4 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf4.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf5> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf5 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf5.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf6> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf6 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf6.class));

            return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromWorkerRequestData>() {
                @Override
                public void write(JsonWriter out, UpsertCustomFieldValueFromWorkerRequestData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf1`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf1) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf1.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf2`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf2) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf2.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf3`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf3) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf3.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf3)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf4`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf4) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf4.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf5`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf5) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf5.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf5)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf6`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf6) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf6.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf6)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpsertCustomFieldValueFromWorkerRequestDataOneOf, UpsertCustomFieldValueFromWorkerRequestDataOneOf1, UpsertCustomFieldValueFromWorkerRequestDataOneOf2, UpsertCustomFieldValueFromWorkerRequestDataOneOf3, UpsertCustomFieldValueFromWorkerRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf5, UpsertCustomFieldValueFromWorkerRequestDataOneOf6");
                }

                @Override
                public UpsertCustomFieldValueFromWorkerRequestData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf1'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf2'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataOneOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataOneOf3.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf3;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf3'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf3 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf3'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataOneOf4
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataOneOf4.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf4;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf4'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf4 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf4'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataOneOf5
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataOneOf5.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf5;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf5'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf5 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf5'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataOneOf6
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataOneOf6.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf6;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf6'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf6 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataOneOf6'", e);
                    }

                    if (match == 1) {
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpsertCustomFieldValueFromWorkerRequestData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpsertCustomFieldValueFromWorkerRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpsertCustomFieldValueFromWorkerRequestData(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf", UpsertCustomFieldValueFromWorkerRequestDataOneOf.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf1", UpsertCustomFieldValueFromWorkerRequestDataOneOf1.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf2", UpsertCustomFieldValueFromWorkerRequestDataOneOf2.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf3", UpsertCustomFieldValueFromWorkerRequestDataOneOf3.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf4", UpsertCustomFieldValueFromWorkerRequestDataOneOf4.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf5", UpsertCustomFieldValueFromWorkerRequestDataOneOf5.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf6", UpsertCustomFieldValueFromWorkerRequestDataOneOf6.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpsertCustomFieldValueFromWorkerRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpsertCustomFieldValueFromWorkerRequestDataOneOf, UpsertCustomFieldValueFromWorkerRequestDataOneOf1, UpsertCustomFieldValueFromWorkerRequestDataOneOf2, UpsertCustomFieldValueFromWorkerRequestDataOneOf3, UpsertCustomFieldValueFromWorkerRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf5, UpsertCustomFieldValueFromWorkerRequestDataOneOf6
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf3) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf4) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf5) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf6) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpsertCustomFieldValueFromWorkerRequestDataOneOf, UpsertCustomFieldValueFromWorkerRequestDataOneOf1, UpsertCustomFieldValueFromWorkerRequestDataOneOf2, UpsertCustomFieldValueFromWorkerRequestDataOneOf3, UpsertCustomFieldValueFromWorkerRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf5, UpsertCustomFieldValueFromWorkerRequestDataOneOf6");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpsertCustomFieldValueFromWorkerRequestDataOneOf, UpsertCustomFieldValueFromWorkerRequestDataOneOf1, UpsertCustomFieldValueFromWorkerRequestDataOneOf2, UpsertCustomFieldValueFromWorkerRequestDataOneOf3, UpsertCustomFieldValueFromWorkerRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf5, UpsertCustomFieldValueFromWorkerRequestDataOneOf6
     *
     * @return The actual instance (UpsertCustomFieldValueFromWorkerRequestDataOneOf, UpsertCustomFieldValueFromWorkerRequestDataOneOf1, UpsertCustomFieldValueFromWorkerRequestDataOneOf2, UpsertCustomFieldValueFromWorkerRequestDataOneOf3, UpsertCustomFieldValueFromWorkerRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf5, UpsertCustomFieldValueFromWorkerRequestDataOneOf6)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataOneOf getUpsertCustomFieldValueFromWorkerRequestDataOneOf() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf1`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf1`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf1`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataOneOf1 getUpsertCustomFieldValueFromWorkerRequestDataOneOf1() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataOneOf1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf2`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf2`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf2`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataOneOf2 getUpsertCustomFieldValueFromWorkerRequestDataOneOf2() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataOneOf2)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf3`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf3`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf3`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataOneOf3 getUpsertCustomFieldValueFromWorkerRequestDataOneOf3() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataOneOf3)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf4`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf4`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf4`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf4`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataOneOf4 getUpsertCustomFieldValueFromWorkerRequestDataOneOf4() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataOneOf4)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf5`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf5`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf5`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf5`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataOneOf5 getUpsertCustomFieldValueFromWorkerRequestDataOneOf5() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataOneOf5)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf6`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf6`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataOneOf6`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataOneOf6`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataOneOf6 getUpsertCustomFieldValueFromWorkerRequestDataOneOf6() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataOneOf6)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromWorkerRequestData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataOneOf
        try {
            UpsertCustomFieldValueFromWorkerRequestDataOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataOneOf1
        try {
            UpsertCustomFieldValueFromWorkerRequestDataOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataOneOf2
        try {
            UpsertCustomFieldValueFromWorkerRequestDataOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataOneOf3
        try {
            UpsertCustomFieldValueFromWorkerRequestDataOneOf3.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf3 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataOneOf4
        try {
            UpsertCustomFieldValueFromWorkerRequestDataOneOf4.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf4 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataOneOf5
        try {
            UpsertCustomFieldValueFromWorkerRequestDataOneOf5.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf5 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataOneOf6
        try {
            UpsertCustomFieldValueFromWorkerRequestDataOneOf6.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataOneOf6 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpsertCustomFieldValueFromWorkerRequestData with oneOf schemas: UpsertCustomFieldValueFromWorkerRequestDataOneOf, UpsertCustomFieldValueFromWorkerRequestDataOneOf1, UpsertCustomFieldValueFromWorkerRequestDataOneOf2, UpsertCustomFieldValueFromWorkerRequestDataOneOf3, UpsertCustomFieldValueFromWorkerRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf5, UpsertCustomFieldValueFromWorkerRequestDataOneOf6. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of UpsertCustomFieldValueFromWorkerRequestData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpsertCustomFieldValueFromWorkerRequestData
     * @throws IOException if the JSON string is invalid with respect to UpsertCustomFieldValueFromWorkerRequestData
     */
    public static UpsertCustomFieldValueFromWorkerRequestData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpsertCustomFieldValueFromWorkerRequestData.class);
    }

    /**
     * Convert an instance of UpsertCustomFieldValueFromWorkerRequestData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
