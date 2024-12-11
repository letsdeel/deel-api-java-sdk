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
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataOneOf;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataOneOf1;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataOneOf2;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataOneOf3;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequestDataOneOf4;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequestDataOneOf4;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:31:34.541358368Z[GMT]", comments = "Generator version: 7.10.0")
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
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataOneOf> adapterUpsertCustomFieldValueFromContractsRequestDataOneOf = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataOneOf.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataOneOf1> adapterUpsertCustomFieldValueFromContractsRequestDataOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataOneOf1.class));
            final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2> adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataOneOf2> adapterUpsertCustomFieldValueFromContractsRequestDataOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataOneOf2.class));
            final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf4> adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf4 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf4.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataOneOf3> adapterUpsertCustomFieldValueFromContractsRequestDataOneOf3 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataOneOf3.class));
            final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataOneOf4> adapterUpsertCustomFieldValueFromContractsRequestDataOneOf4 = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataOneOf4.class));

            return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromContractsRequestData>() {
                @Override
                public void write(JsonWriter out, UpsertCustomFieldValueFromContractsRequestData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataOneOf`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataOneOf1`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf1) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf1.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2`
                    if (value.getActualInstance() instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2) {
                        JsonElement element = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.toJsonTree((GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataOneOf2`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf2) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf2.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromWorkerRequestDataOneOf4`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf4) {
                        JsonElement element = adapterUpsertCustomFieldValueFromWorkerRequestDataOneOf4.toJsonTree((UpsertCustomFieldValueFromWorkerRequestDataOneOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataOneOf3`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf3) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf3.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataOneOf3)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpsertCustomFieldValueFromContractsRequestDataOneOf4`
                    if (value.getActualInstance() instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf4) {
                        JsonElement element = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf4.toJsonTree((UpsertCustomFieldValueFromContractsRequestDataOneOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf, UpsertCustomFieldValueFromContractsRequestDataOneOf1, UpsertCustomFieldValueFromContractsRequestDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf3, UpsertCustomFieldValueFromContractsRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf4");
                }

                @Override
                public UpsertCustomFieldValueFromContractsRequestData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpsertCustomFieldValueFromContractsRequestDataOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf1'", e);
                    }
                    // deserialize GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf2'", e);
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
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataOneOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataOneOf3.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf3;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf3'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf3 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf3'", e);
                    }
                    // deserialize UpsertCustomFieldValueFromContractsRequestDataOneOf4
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertCustomFieldValueFromContractsRequestDataOneOf4.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertCustomFieldValueFromContractsRequestDataOneOf4;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf4'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf4 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertCustomFieldValueFromContractsRequestDataOneOf4'", e);
                    }

                    if (match == 1) {
                        UpsertCustomFieldValueFromContractsRequestData ret = new UpsertCustomFieldValueFromContractsRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpsertCustomFieldValueFromContractsRequestData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpsertCustomFieldValueFromContractsRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpsertCustomFieldValueFromContractsRequestData(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataOneOf", UpsertCustomFieldValueFromContractsRequestDataOneOf.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataOneOf1", UpsertCustomFieldValueFromContractsRequestDataOneOf1.class);
        schemas.put("GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2", GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataOneOf2", UpsertCustomFieldValueFromContractsRequestDataOneOf2.class);
        schemas.put("UpsertCustomFieldValueFromWorkerRequestDataOneOf4", UpsertCustomFieldValueFromWorkerRequestDataOneOf4.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataOneOf3", UpsertCustomFieldValueFromContractsRequestDataOneOf3.class);
        schemas.put("UpsertCustomFieldValueFromContractsRequestDataOneOf4", UpsertCustomFieldValueFromContractsRequestDataOneOf4.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpsertCustomFieldValueFromContractsRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf, UpsertCustomFieldValueFromContractsRequestDataOneOf1, UpsertCustomFieldValueFromContractsRequestDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf3, UpsertCustomFieldValueFromContractsRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf4
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromWorkerRequestDataOneOf4) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf3) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpsertCustomFieldValueFromContractsRequestDataOneOf4) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf, UpsertCustomFieldValueFromContractsRequestDataOneOf1, UpsertCustomFieldValueFromContractsRequestDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf3, UpsertCustomFieldValueFromContractsRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf4");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf, UpsertCustomFieldValueFromContractsRequestDataOneOf1, UpsertCustomFieldValueFromContractsRequestDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf3, UpsertCustomFieldValueFromContractsRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf4
     *
     * @return The actual instance (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf, UpsertCustomFieldValueFromContractsRequestDataOneOf1, UpsertCustomFieldValueFromContractsRequestDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf3, UpsertCustomFieldValueFromContractsRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf4)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf`
     */
    public UpsertCustomFieldValueFromContractsRequestDataOneOf getUpsertCustomFieldValueFromContractsRequestDataOneOf() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf1`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf1`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf1`
     */
    public UpsertCustomFieldValueFromContractsRequestDataOneOf1 getUpsertCustomFieldValueFromContractsRequestDataOneOf1() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataOneOf1)super.getActualInstance();
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
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf2`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf2`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf2`
     */
    public UpsertCustomFieldValueFromContractsRequestDataOneOf2 getUpsertCustomFieldValueFromContractsRequestDataOneOf2() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataOneOf2)super.getActualInstance();
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
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf3`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf3`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf3`
     */
    public UpsertCustomFieldValueFromContractsRequestDataOneOf3 getUpsertCustomFieldValueFromContractsRequestDataOneOf3() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataOneOf3)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf4`. If the actual instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf4`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertCustomFieldValueFromContractsRequestDataOneOf4`
     * @throws ClassCastException if the instance is not `UpsertCustomFieldValueFromContractsRequestDataOneOf4`
     */
    public UpsertCustomFieldValueFromContractsRequestDataOneOf4 getUpsertCustomFieldValueFromContractsRequestDataOneOf4() throws ClassCastException {
        return (UpsertCustomFieldValueFromContractsRequestDataOneOf4)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromContractsRequestData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataOneOf
        try {
            UpsertCustomFieldValueFromContractsRequestDataOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataOneOf1
        try {
            UpsertCustomFieldValueFromContractsRequestDataOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2
        try {
            GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataOneOf2
        try {
            UpsertCustomFieldValueFromContractsRequestDataOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf2 failed with `%s`.", e.getMessage()));
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
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataOneOf3
        try {
            UpsertCustomFieldValueFromContractsRequestDataOneOf3.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf3 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpsertCustomFieldValueFromContractsRequestDataOneOf4
        try {
            UpsertCustomFieldValueFromContractsRequestDataOneOf4.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertCustomFieldValueFromContractsRequestDataOneOf4 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpsertCustomFieldValueFromContractsRequestData with oneOf schemas: GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf, UpsertCustomFieldValueFromContractsRequestDataOneOf1, UpsertCustomFieldValueFromContractsRequestDataOneOf2, UpsertCustomFieldValueFromContractsRequestDataOneOf3, UpsertCustomFieldValueFromContractsRequestDataOneOf4, UpsertCustomFieldValueFromWorkerRequestDataOneOf4. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
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

