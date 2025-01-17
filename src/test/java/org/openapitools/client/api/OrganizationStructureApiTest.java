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
import org.openapitools.client.model.CreateOrgStructure200Response;
import org.openapitools.client.model.CreateOrgStructureRequest;
import org.openapitools.client.model.GetAllOrgStructures200Response;
import org.openapitools.client.model.GetOrgStructure200Response;
import org.openapitools.client.model.GetOrgStructureByExternalId200Response;
import org.openapitools.client.model.UpdateOrgStructureByExternalIdRequest;
import org.openapitools.client.model.UpdateOrgStructureRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationStructureApi
 */
@Disabled
public class OrganizationStructureApiTest {

    private final OrganizationStructureApi api = new OrganizationStructureApi();

    /**
     * Create a new HRIS Organization Structure.
     *
     * Create a new HRIS Organization Structure.  **Token scopes**: &#x60;organizations:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrgStructureTest() throws ApiException {
        CreateOrgStructureRequest createOrgStructureRequest = null;
        CreateOrgStructure200Response response = api.createOrgStructure(createOrgStructureRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an Org Structure from the Organization
     *
     * Delete an Org Structure from the Organization  **Token scopes**: &#x60;organizations:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrgStructureTest() throws ApiException {
        String hrisOrgStrId = null;
        api.deleteOrgStructure(hrisOrgStrId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an Org Structure from the Organization by external ID
     *
     * undefined  **Token scopes**: &#x60;organizations:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrgStructureByExternalIdTest() throws ApiException {
        String externalId = null;
        api.deleteOrgStructureByExternalId(externalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch all Org Structures from the Organization.
     *
     * Fetch all Org Structures from the Organization.  **Token scopes**: &#x60;organizations:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllOrgStructuresTest() throws ApiException {
        GetAllOrgStructures200Response response = api.getAllOrgStructures()
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch an Org Structure from the Organization
     *
     * undefined  **Token scopes**: &#x60;organizations:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrgStructureTest() throws ApiException {
        String hrisOrgStrId = null;
        GetOrgStructure200Response response = api.getOrgStructure(hrisOrgStrId)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch an Org Structure from the Organization
     *
     * undefined  **Token scopes**: &#x60;organizations:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrgStructureByExternalIdTest() throws ApiException {
        String externalId = null;
        GetOrgStructureByExternalId200Response response = api.getOrgStructureByExternalId(externalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing HRIS Org Structure
     *
     * Update an existing HRIS Org Structure  **Token scopes**: &#x60;organizations:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrgStructureTest() throws ApiException {
        String hrisOrgStrId = null;
        UpdateOrgStructureRequest updateOrgStructureRequest = null;
        api.updateOrgStructure(hrisOrgStrId, updateOrgStructureRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing HRIS Org Structure by external ID
     *
     * undefined  **Token scopes**: &#x60;organizations:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrgStructureByExternalIdTest() throws ApiException {
        String externalId = null;
        UpdateOrgStructureByExternalIdRequest updateOrgStructureByExternalIdRequest = null;
        api.updateOrgStructureByExternalId(externalId, updateOrgStructureByExternalIdRequest)
                .execute();
        // TODO: test validations
    }

}
