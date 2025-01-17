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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ApiErrorContainer;
import org.openapitools.client.model.GetCustomFieldFromContractsById200Response;
import org.openapitools.client.model.GetCustomFieldFromPeopleById200Response;
import org.openapitools.client.model.GetCustomFieldValuesFromWorker200Response;
import org.openapitools.client.model.GetCustomFieldsFromContracts200Response;
import org.openapitools.client.model.GetCustomFieldsFromPeople200Response;
import java.util.UUID;
import org.openapitools.client.model.UpsertCustomFieldValueFromContractsRequest;
import org.openapitools.client.model.UpsertCustomFieldValueFromWorkerRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFieldsApi
 */
@Disabled
public class CustomFieldsApiTest {

    private final CustomFieldsApi api = new CustomFieldsApi();

    /**
     * Delete Contract custom field by Id
     *
     * Removes the custom field value from the contract custom field.  **Token scopes**: &#x60;contracts:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteContractCustomFieldTest() throws ApiException {
        UUID id = null;
        UUID contractId = null;
        api.deleteContractCustomField(id, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete the custom field value from Worker by Id
     *
     * Delete the custom field value from Worker by Id.  **Token scopes**: &#x60;people:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomFieldValueFromWorkerTest() throws ApiException {
        UUID id = null;
        UUID workerId = null;
        api.deleteCustomFieldValueFromWorker(id, workerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get custom fields from contracts
     *
     * Get custom field from contract by id  **Token scopes**: &#x60;contracts:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldFromContractsByIdTest() throws ApiException {
        UUID id = null;
        GetCustomFieldFromContractsById200Response response = api.getCustomFieldFromContractsById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get custom field from people by id
     *
     * Get custom field from people by id.  **Token scopes**: &#x60;people:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldFromPeopleByIdTest() throws ApiException {
        UUID id = null;
        GetCustomFieldFromPeopleById200Response response = api.getCustomFieldFromPeopleById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve custom fields for a contract
     *
     * Retrieve custom fields for a contract.  **Token scopes**: &#x60;contracts:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldValuesFromContractTest() throws ApiException {
        String contractId = null;
        GetCustomFieldValuesFromWorker200Response response = api.getCustomFieldValuesFromContract(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve custom fields for a worker
     *
     * Retrieve custom fields for a worker  **Token scopes**: &#x60;people:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldValuesFromWorkerTest() throws ApiException {
        UUID workerId = null;
        GetCustomFieldValuesFromWorker200Response response = api.getCustomFieldValuesFromWorker(workerId)
                .execute();
        // TODO: test validations
    }

    /**
     * List all custom fields
     *
     * Fetch all custom fields associated with contracts, providing additional data necessary for contract management.  **Token scopes**: &#x60;contracts:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldsFromContractsTest() throws ApiException {
        GetCustomFieldsFromContracts200Response response = api.getCustomFieldsFromContracts()
                .execute();
        // TODO: test validations
    }

    /**
     * List all custom fields
     *
     * Fetch all custom fields associated with People records, offering additional personalized information.  **Token scopes**: &#x60;people:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldsFromPeopleTest() throws ApiException {
        GetCustomFieldsFromPeople200Response response = api.getCustomFieldsFromPeople()
                .execute();
        // TODO: test validations
    }

    /**
     * Update custom field value
     *
     * Update custom field value.  **Token scopes**: &#x60;contracts:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void upsertCustomFieldValueFromContractsTest() throws ApiException {
        UUID contractId = null;
        UpsertCustomFieldValueFromContractsRequest upsertCustomFieldValueFromContractsRequest = null;
        api.upsertCustomFieldValueFromContracts(contractId, upsertCustomFieldValueFromContractsRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Update custom field value
     *
     * Update custom field value.  **Token scopes**: &#x60;people:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void upsertCustomFieldValueFromWorkerTest() throws ApiException {
        UUID workerId = null;
        UpsertCustomFieldValueFromWorkerRequest upsertCustomFieldValueFromWorkerRequest = null;
        api.upsertCustomFieldValueFromWorker(workerId, upsertCustomFieldValueFromWorkerRequest)
                .execute();
        // TODO: test validations
    }

}
