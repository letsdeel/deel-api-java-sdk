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
import org.openapitools.client.model.GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataAnyOf;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataAnyOf1;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataAnyOf2;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataAnyOf3;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataAnyOf4;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataAnyOf4;



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
public class UpsertCustomFieldValueFromContractsRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpsertCustomFieldValueFromContractsRequestData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpsertCustomFieldValueFromContractsRequestData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpsertCustomFieldValueFromContractsRequestData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataAnyOf> adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataAnyOf.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataAnyOf1> adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataAnyOf1.class));
            final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2> adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataAnyOf2> adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf2 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataAnyOf2.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf4> adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf4 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf4.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataAnyOf3> adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf3 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataAnyOf3.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataAnyOf4> adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf4 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataAnyOf4.class));

            return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromContractsRequestData>() {
                @Override
                public void write(JsonWriter out, UpsertCustomFieldValueFromContractsRequestData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataAnyOf`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataAnyOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataAnyOf1`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf1) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf1.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataAnyOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2`
                    if (value.getActualInstance() instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2) {
                        JsonElement element = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.toJsonTree((GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataAnyOf2`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf2) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf2.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataAnyOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataAnyOf4`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf4) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf4.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataAnyOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataAnyOf3`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf3) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf3.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataAnyOf3)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataAnyOf4`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf4) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf4.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataAnyOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf, UpsertCustomFieldValueFromContractsRequestDataAnyOf1, UpsertCustomFieldValueFromContractsRequestDataAnyOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf3, UpsertCustomFieldValueFromContractsRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4");
                }

                @Override
                public UpsertCustomFieldValueFromContractsRequestData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpsertCustomFieldValueFromContractsRequestDataAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataAnyOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf;
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataAnyOf'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataAnyOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf1;
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataAnyOf1'", e);
                    }
                    // deserialize GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2;
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataAnyOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataAnyOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf2;
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataAnyOf2'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromWorkerRequestDataAnyOf4
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromWorkerRequestDataAnyOf4.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromWorkerRequestDataAnyOf4;
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromWorkerRequestDataAnyOf4 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf4'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataAnyOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataAnyOf3.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf3;
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf3 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataAnyOf3'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataAnyOf4
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataAnyOf4.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataAnyOf4;
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf4 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataAnyOf4'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for UpsertCustomFieldValueFromContractsRequestData: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpsertCustomFieldValueFromContractsRequestData() {
        super("anyOf", Boolean.FALSE);
    }

    public UpsertCustomFieldValueFromContractsRequestData(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataAnyOf", UpsertCustomFieldValueFromContractsRequestDataAnyOf.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataAnyOf1", UpsertCustomFieldValueFromContractsRequestDataAnyOf1.class);
        schemas.put("GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2", GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataAnyOf2", UpsertCustomFieldValueFromContractsRequestDataAnyOf2.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataAnyOf4", UpsertCustomFieldValueFromWorkerRequestDataAnyOf4.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataAnyOf3", UpsertCustomFieldValueFromContractsRequestDataAnyOf3.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataAnyOf4", UpsertCustomFieldValueFromContractsRequestDataAnyOf4.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpsertCustomFieldValueFromContractsRequestData.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf, UpsertCustomFieldValueFromContractsRequestDataAnyOf1, UpsertCustomFieldValueFromContractsRequestDataAnyOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf3, UpsertCustomFieldValueFromContractsRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataAnyOf4) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf3) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataAnyOf4) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf, UpsertCustomFieldValueFromContractsRequestDataAnyOf1, UpsertCustomFieldValueFromContractsRequestDataAnyOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf3, UpsertCustomFieldValueFromContractsRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf, UpsertCustomFieldValueFromContractsRequestDataAnyOf1, UpsertCustomFieldValueFromContractsRequestDataAnyOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf3, UpsertCustomFieldValueFromContractsRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4
     *
     * @return The actual instance (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf, UpsertCustomFieldValueFromContractsRequestDataAnyOf1, UpsertCustomFieldValueFromContractsRequestDataAnyOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf3, UpsertCustomFieldValueFromContractsRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf`
     */
    public UpsertCustomFieldValueFromContractsRequestDataAnyOf getUpsertCustomFieldValueFromContractsRequestDataAnyOf() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf1`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf1`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf1`
     */
    public UpsertCustomFieldValueFromContractsRequestDataAnyOf1 getUpsertCustomFieldValueFromContractsRequestDataAnyOf1() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataAnyOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2`. If the actual instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2`
     * @throws ClassCastException if the instance is not `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2`
     */
    public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2 getGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2() throws ClassCastException {
        return (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf2`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf2`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf2`
     */
    public UpsertCustomFieldValueFromContractsRequestDataAnyOf2 getUpsertCustomFieldValueFromContractsRequestDataAnyOf2() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataAnyOf2)super.getActualInstance();
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
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf3`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf3`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf3`
     */
    public UpsertCustomFieldValueFromContractsRequestDataAnyOf3 getUpsertCustomFieldValueFromContractsRequestDataAnyOf3() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataAnyOf3)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf4`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf4`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataAnyOf4`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataAnyOf4`
     */
    public UpsertCustomFieldValueFromContractsRequestDataAnyOf4 getUpsertCustomFieldValueFromContractsRequestDataAnyOf4() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataAnyOf4)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromContractsRequestData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataAnyOf
        try {
            UpsertCustomFieldValueFromContractsRequestDataAnyOf.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataAnyOf1
        try {
            UpsertCustomFieldValueFromContractsRequestDataAnyOf1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2
        try {
            GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataAnyOf2
        try {
            UpsertCustomFieldValueFromContractsRequestDataAnyOf2.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf2 failed with `%s`.", e.getMessage()));
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
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataAnyOf3
        try {
            UpsertCustomFieldValueFromContractsRequestDataAnyOf3.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf3 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataAnyOf4
        try {
            UpsertCustomFieldValueFromContractsRequestDataAnyOf4.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataAnyOf4 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for UpsertCustomFieldValueFromContractsRequestData with anyOf schemas: GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf, UpsertCustomFieldValueFromContractsRequestDataAnyOf1, UpsertCustomFieldValueFromContractsRequestDataAnyOf2, UpsertCustomFieldValueFromContractsRequestDataAnyOf3, UpsertCustomFieldValueFromContractsRequestDataAnyOf4, UpsertCustomFieldValueFromWorkerRequestDataAnyOf4. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of UpsertCustomFieldValueFromContractsRequestData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpsertCustomFieldValueFromContractsRequestData
     * @throws IOException if the JSON string is invalid with respect to UpsertCustomFieldValueFromContractsRequestData
     */
    public static UpsertCustomFieldValueFromContractsRequestData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpsertCustomFieldValueFromContractsRequestData.class);
    }

    /**
     * Convert an instance of UpsertCustomFieldValueFromContractsRequestData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

