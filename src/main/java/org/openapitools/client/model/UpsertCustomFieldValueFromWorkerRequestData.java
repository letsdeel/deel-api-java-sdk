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
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf1;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf2;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf3;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf4;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf5;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf6;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
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
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf1> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf2> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf2 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf2.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf3> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf3 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf3.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf4> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf4 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf4.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf5> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf5 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf5.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf6> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf6 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.class));

            return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromWorkerRequestData>() {
                @Override
                public void write(JsonWriter out, UpsertCustomFieldValueFromWorkerRequestData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf1`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf1) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf1.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf2`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf2) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf2.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf3`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf3) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf3.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf3)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf4`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf4) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf4.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf5`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf5) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf5.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf5)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf6`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf6) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf6.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf6)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: UpsertCustomFieldValueFromWorkerRequestDataAnyOf, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1, UpsertCustomFieldValueFromWorkerRequestDataAnyOf2, UpsertCustomFieldValueFromWorkerRequestDataAnyOf3, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf5, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6");
                }

                @Override
                public UpsertCustomFieldValueFromWorkerRequestData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf;
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf1;
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf1'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf2;
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf2'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf3.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf3;
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf3 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf3'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf4
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf4.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf4;
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf4 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf4'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf5
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf5.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf5;
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf5 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf5'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf6
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf6;
                        UpsertCustomFieldValueFromWorkerRequestData ret = new UpsertCustomFieldValueFromWorkerRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf6'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for UpsertCustomFieldValueFromWorkerRequestData: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpsertCustomFieldValueFromWorkerRequestData() {
        super("anyOf", Boolean.FALSE);
    }

    public UpsertCustomFieldValueFromWorkerRequestData(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf", UpsertCustomFieldValueFromWorkerRequestDataAnyOf.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf1", UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf2", UpsertCustomFieldValueFromWorkerRequestDataAnyOf2.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf3", UpsertCustomFieldValueFromWorkerRequestDataAnyOf3.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf4", UpsertCustomFieldValueFromWorkerRequestDataAnyOf4.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf5", UpsertCustomFieldValueFromWorkerRequestDataAnyOf5.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf6", UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpsertCustomFieldValueFromWorkerRequestData.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * UpsertCustomFieldValueFromWorkerRequestDataAnyOf, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1, UpsertCustomFieldValueFromWorkerRequestDataAnyOf2, UpsertCustomFieldValueFromWorkerRequestDataAnyOf3, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf5, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf3) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf4) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf5) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf6) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpsertCustomFieldValueFromWorkerRequestDataAnyOf, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1, UpsertCustomFieldValueFromWorkerRequestDataAnyOf2, UpsertCustomFieldValueFromWorkerRequestDataAnyOf3, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf5, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpsertCustomFieldValueFromWorkerRequestDataAnyOf, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1, UpsertCustomFieldValueFromWorkerRequestDataAnyOf2, UpsertCustomFieldValueFromWorkerRequestDataAnyOf3, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf5, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6
     *
     * @return The actual instance (UpsertCustomFieldValueFromWorkerRequestDataAnyOf, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1, UpsertCustomFieldValueFromWorkerRequestDataAnyOf2, UpsertCustomFieldValueFromWorkerRequestDataAnyOf3, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf5, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataAnyOf getUpsertCustomFieldValueFromWorkerRequestDataAnyOf() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf1`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf1`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf1`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 getUpsertCustomFieldValueFromWorkerRequestDataAnyOf1() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataAnyOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf2`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf2`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf2`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataAnyOf2 getUpsertCustomFieldValueFromWorkerRequestDataAnyOf2() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataAnyOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf3`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf3`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf3`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataAnyOf3 getUpsertCustomFieldValueFromWorkerRequestDataAnyOf3() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataAnyOf3)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf4`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf4`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf4`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf4`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataAnyOf4 getUpsertCustomFieldValueFromWorkerRequestDataAnyOf4() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataAnyOf4)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf5`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf5`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf5`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf5`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataAnyOf5 getUpsertCustomFieldValueFromWorkerRequestDataAnyOf5() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataAnyOf5)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf6`. If the actual instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf6`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromWorkerRequestDataAnyOf6`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromWorkerRequestDataAnyOf6`
     */
    public UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 getUpsertCustomFieldValueFromWorkerRequestDataAnyOf6() throws ClassCastException {
        return (UpsertCustomFieldValueFromWorkerRequestDataAnyOf6)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromWorkerRequestData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataAnyOf
        try {
            UpsertCustomFieldValueFromWorkerRequestDataAnyOf.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataAnyOf1
        try {
            UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataAnyOf2
        try {
            UpsertCustomFieldValueFromWorkerRequestDataAnyOf2.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataAnyOf3
        try {
            UpsertCustomFieldValueFromWorkerRequestDataAnyOf3.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf3 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataAnyOf4
        try {
            UpsertCustomFieldValueFromWorkerRequestDataAnyOf4.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf4 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataAnyOf5
        try {
            UpsertCustomFieldValueFromWorkerRequestDataAnyOf5.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf5 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromWorkerRequestDataAnyOf6
        try {
            UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for UpsertCustomFieldValueFromWorkerRequestData with anyOf schemas: UpsertCustomFieldValueFromWorkerRequestDataAnyOf, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1, UpsertCustomFieldValueFromWorkerRequestDataAnyOf2, UpsertCustomFieldValueFromWorkerRequestDataAnyOf3, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf5, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
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

