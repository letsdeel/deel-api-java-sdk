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
import java.util.List;
import org.openapitools.client.model.ContractTypeEnum;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class InvoiceAdjustmentSearchContainerContractTypes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(InvoiceAdjustmentSearchContainerContractTypes.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!InvoiceAdjustmentSearchContainerContractTypes.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'InvoiceAdjustmentSearchContainerContractTypes' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstanceListContractTypeEnum = new TypeToken<List<ContractTypeEnum>>(){}.getType();
            final TypeAdapter<List<ContractTypeEnum>> adapterListContractTypeEnum = (TypeAdapter<List<ContractTypeEnum>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListContractTypeEnum));
            final TypeAdapter<ContractTypeEnum> adapterContractTypeEnum = gson.getDelegateAdapter(this, TypeToken.get(ContractTypeEnum.class));

            return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentSearchContainerContractTypes>() {
                @Override
                public void write(JsonWriter out, InvoiceAdjustmentSearchContainerContractTypes value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<ContractTypeEnum>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof ContractTypeEnum) {
                            JsonArray array = adapterListContractTypeEnum.toJsonTree((List<ContractTypeEnum>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    // check if the actual instance is of the type `ContractTypeEnum`
                    if (value.getActualInstance() instanceof ContractTypeEnum) {
                        JsonElement element = adapterContractTypeEnum.toJsonTree((ContractTypeEnum)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContractTypeEnum, List<ContractTypeEnum>");
                }

                @Override
                public InvoiceAdjustmentSearchContainerContractTypes read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<ContractTypeEnum>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            ContractTypeEnum.validateJsonElement(element);
                        }
                        actualAdapter = adapterListContractTypeEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<ContractTypeEnum>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<ContractTypeEnum> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<ContractTypeEnum>'", e);
                    }
                    // deserialize ContractTypeEnum
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractTypeEnum.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractTypeEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractTypeEnum'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractTypeEnum failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractTypeEnum'", e);
                    }

                    if (match == 1) {
                        InvoiceAdjustmentSearchContainerContractTypes ret = new InvoiceAdjustmentSearchContainerContractTypes();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for InvoiceAdjustmentSearchContainerContractTypes: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public InvoiceAdjustmentSearchContainerContractTypes() {
        super("oneOf", Boolean.FALSE);
    }

    public InvoiceAdjustmentSearchContainerContractTypes(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<ContractTypeEnum>", List.class);
        schemas.put("ContractTypeEnum", ContractTypeEnum.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return InvoiceAdjustmentSearchContainerContractTypes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContractTypeEnum, List<ContractTypeEnum>
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof ContractTypeEnum) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof ContractTypeEnum) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ContractTypeEnum, List<ContractTypeEnum>");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContractTypeEnum, List<ContractTypeEnum>
     *
     * @return The actual instance (ContractTypeEnum, List<ContractTypeEnum>)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<ContractTypeEnum>`. If the actual instance is not `List<ContractTypeEnum>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<ContractTypeEnum>`
     * @throws ClassCastException if the instance is not `List<ContractTypeEnum>`
     */
    public List<ContractTypeEnum> getListContractTypeEnum() throws ClassCastException {
        return (List<ContractTypeEnum>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractTypeEnum`. If the actual instance is not `ContractTypeEnum`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractTypeEnum`
     * @throws ClassCastException if the instance is not `ContractTypeEnum`
     */
    public ContractTypeEnum getContractTypeEnum() throws ClassCastException {
        return (ContractTypeEnum)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentSearchContainerContractTypes
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with List<ContractTypeEnum>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                ContractTypeEnum.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<ContractTypeEnum> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContractTypeEnum
        try {
            ContractTypeEnum.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractTypeEnum failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for InvoiceAdjustmentSearchContainerContractTypes with oneOf schemas: ContractTypeEnum, List<ContractTypeEnum>. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of InvoiceAdjustmentSearchContainerContractTypes given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of InvoiceAdjustmentSearchContainerContractTypes
     * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentSearchContainerContractTypes
     */
    public static InvoiceAdjustmentSearchContainerContractTypes fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentSearchContainerContractTypes.class);
    }

    /**
     * Convert an instance of InvoiceAdjustmentSearchContainerContractTypes to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

