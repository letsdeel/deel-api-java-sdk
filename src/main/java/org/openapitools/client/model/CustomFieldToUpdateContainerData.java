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
import org.openapitools.client.model.CustomFieldToUpdateContainerDataOneOf;
import org.openapitools.client.model.CustomFieldToUpdateContainerDataOneOf1;
import org.openapitools.client.model.CustomFieldValuesContainerDataInnerDataOneOf;
import org.openapitools.client.model.GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf;
import org.openapitools.client.model.GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1;
import org.openapitools.client.model.GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5;
import org.openapitools.client.model.GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6;



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
public class CustomFieldToUpdateContainerData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CustomFieldToUpdateContainerData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CustomFieldToUpdateContainerData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CustomFieldToUpdateContainerData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf> adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.class));
            final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1> adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1.class));
            final TypeAdapter<CustomFieldValuesContainerDataInnerDataOneOf> adapterCustomFieldValuesContainerDataInnerDataOneOf = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldValuesContainerDataInnerDataOneOf.class));
            final TypeAdapter<CustomFieldToUpdateContainerDataOneOf> adapterCustomFieldToUpdateContainerDataOneOf = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldToUpdateContainerDataOneOf.class));
            final TypeAdapter<CustomFieldToUpdateContainerDataOneOf1> adapterCustomFieldToUpdateContainerDataOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldToUpdateContainerDataOneOf1.class));
            final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5> adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5.class));
            final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6> adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6.class));

            return (TypeAdapter<T>) new TypeAdapter<CustomFieldToUpdateContainerData>() {
                @Override
                public void write(JsonWriter out, CustomFieldToUpdateContainerData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf`
                    if (value.getActualInstance() instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf) {
                        JsonElement element = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.toJsonTree((GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1`
                    if (value.getActualInstance() instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1) {
                        JsonElement element = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1.toJsonTree((GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CustomFieldValuesContainerDataInnerDataOneOf`
                    if (value.getActualInstance() instanceof CustomFieldValuesContainerDataInnerDataOneOf) {
                        JsonElement element = adapterCustomFieldValuesContainerDataInnerDataOneOf.toJsonTree((CustomFieldValuesContainerDataInnerDataOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CustomFieldToUpdateContainerDataOneOf`
                    if (value.getActualInstance() instanceof CustomFieldToUpdateContainerDataOneOf) {
                        JsonElement element = adapterCustomFieldToUpdateContainerDataOneOf.toJsonTree((CustomFieldToUpdateContainerDataOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CustomFieldToUpdateContainerDataOneOf1`
                    if (value.getActualInstance() instanceof CustomFieldToUpdateContainerDataOneOf1) {
                        JsonElement element = adapterCustomFieldToUpdateContainerDataOneOf1.toJsonTree((CustomFieldToUpdateContainerDataOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5`
                    if (value.getActualInstance() instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5) {
                        JsonElement element = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5.toJsonTree((GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6`
                    if (value.getActualInstance() instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6) {
                        JsonElement element = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6.toJsonTree((GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CustomFieldToUpdateContainerDataOneOf, CustomFieldToUpdateContainerDataOneOf1, CustomFieldValuesContainerDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6");
                }

                @Override
                public CustomFieldToUpdateContainerData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf'", e);
                    }
                    // deserialize GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1'", e);
                    }
                    // deserialize CustomFieldValuesContainerDataInnerDataOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CustomFieldValuesContainerDataInnerDataOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterCustomFieldValuesContainerDataInnerDataOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CustomFieldValuesContainerDataInnerDataOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CustomFieldValuesContainerDataInnerDataOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CustomFieldValuesContainerDataInnerDataOneOf'", e);
                    }
                    // deserialize CustomFieldToUpdateContainerDataOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CustomFieldToUpdateContainerDataOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterCustomFieldToUpdateContainerDataOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CustomFieldToUpdateContainerDataOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CustomFieldToUpdateContainerDataOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CustomFieldToUpdateContainerDataOneOf'", e);
                    }
                    // deserialize CustomFieldToUpdateContainerDataOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CustomFieldToUpdateContainerDataOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterCustomFieldToUpdateContainerDataOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CustomFieldToUpdateContainerDataOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CustomFieldToUpdateContainerDataOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CustomFieldToUpdateContainerDataOneOf1'", e);
                    }
                    // deserialize GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5'", e);
                    }
                    // deserialize GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6'", e);
                    }

                    if (match == 1) {
                        CustomFieldToUpdateContainerData ret = new CustomFieldToUpdateContainerData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CustomFieldToUpdateContainerData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CustomFieldToUpdateContainerData() {
        super("oneOf", Boolean.FALSE);
    }

    public CustomFieldToUpdateContainerData(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf", GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.class);
        schemas.put("GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1", GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1.class);
        schemas.put("CustomFieldValuesContainerDataInnerDataOneOf", CustomFieldValuesContainerDataInnerDataOneOf.class);
        schemas.put("CustomFieldToUpdateContainerDataOneOf", CustomFieldToUpdateContainerDataOneOf.class);
        schemas.put("CustomFieldToUpdateContainerDataOneOf1", CustomFieldToUpdateContainerDataOneOf1.class);
        schemas.put("GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5", GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5.class);
        schemas.put("GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6", GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CustomFieldToUpdateContainerData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomFieldToUpdateContainerDataOneOf, CustomFieldToUpdateContainerDataOneOf1, CustomFieldValuesContainerDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CustomFieldValuesContainerDataInnerDataOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CustomFieldToUpdateContainerDataOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CustomFieldToUpdateContainerDataOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CustomFieldToUpdateContainerDataOneOf, CustomFieldToUpdateContainerDataOneOf1, CustomFieldValuesContainerDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomFieldToUpdateContainerDataOneOf, CustomFieldToUpdateContainerDataOneOf1, CustomFieldValuesContainerDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6
     *
     * @return The actual instance (CustomFieldToUpdateContainerDataOneOf, CustomFieldToUpdateContainerDataOneOf1, CustomFieldValuesContainerDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf`. If the actual instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf`
     * @throws ClassCastException if the instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf`
     */
    public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf getGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf() throws ClassCastException {
        return (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1`. If the actual instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1`
     * @throws ClassCastException if the instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1`
     */
    public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1 getGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1() throws ClassCastException {
        return (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFieldValuesContainerDataInnerDataOneOf`. If the actual instance is not `CustomFieldValuesContainerDataInnerDataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFieldValuesContainerDataInnerDataOneOf`
     * @throws ClassCastException if the instance is not `CustomFieldValuesContainerDataInnerDataOneOf`
     */
    public CustomFieldValuesContainerDataInnerDataOneOf getCustomFieldValuesContainerDataInnerDataOneOf() throws ClassCastException {
        return (CustomFieldValuesContainerDataInnerDataOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFieldToUpdateContainerDataOneOf`. If the actual instance is not `CustomFieldToUpdateContainerDataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFieldToUpdateContainerDataOneOf`
     * @throws ClassCastException if the instance is not `CustomFieldToUpdateContainerDataOneOf`
     */
    public CustomFieldToUpdateContainerDataOneOf getCustomFieldToUpdateContainerDataOneOf() throws ClassCastException {
        return (CustomFieldToUpdateContainerDataOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFieldToUpdateContainerDataOneOf1`. If the actual instance is not `CustomFieldToUpdateContainerDataOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFieldToUpdateContainerDataOneOf1`
     * @throws ClassCastException if the instance is not `CustomFieldToUpdateContainerDataOneOf1`
     */
    public CustomFieldToUpdateContainerDataOneOf1 getCustomFieldToUpdateContainerDataOneOf1() throws ClassCastException {
        return (CustomFieldToUpdateContainerDataOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5`. If the actual instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5`
     * @throws ClassCastException if the instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5`
     */
    public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5 getGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5() throws ClassCastException {
        return (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6`. If the actual instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6`
     * @throws ClassCastException if the instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6`
     */
    public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6 getGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6() throws ClassCastException {
        return (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CustomFieldToUpdateContainerData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf
        try {
            GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1
        try {
            GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CustomFieldValuesContainerDataInnerDataOneOf
        try {
            CustomFieldValuesContainerDataInnerDataOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CustomFieldValuesContainerDataInnerDataOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CustomFieldToUpdateContainerDataOneOf
        try {
            CustomFieldToUpdateContainerDataOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CustomFieldToUpdateContainerDataOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CustomFieldToUpdateContainerDataOneOf1
        try {
            CustomFieldToUpdateContainerDataOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CustomFieldToUpdateContainerDataOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5
        try {
            GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6
        try {
            GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CustomFieldToUpdateContainerData with oneOf schemas: CustomFieldToUpdateContainerDataOneOf, CustomFieldToUpdateContainerDataOneOf1, CustomFieldValuesContainerDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf1, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf5, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf6. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CustomFieldToUpdateContainerData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CustomFieldToUpdateContainerData
     * @throws IOException if the JSON string is invalid with respect to CustomFieldToUpdateContainerData
     */
    public static CustomFieldToUpdateContainerData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CustomFieldToUpdateContainerData.class);
    }

    /**
     * Convert an instance of CustomFieldToUpdateContainerData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

