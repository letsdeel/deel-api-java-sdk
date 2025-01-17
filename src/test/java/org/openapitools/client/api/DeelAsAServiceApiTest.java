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
import org.openapitools.client.model.AddEORBankAccount201Response;
import org.openapitools.client.model.AddEORBankAccountRequest;
import org.openapitools.client.model.GetEORBankAccountGuide200Response;
import org.openapitools.client.model.PatchEORBankAccount201Response;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeelAsAServiceApi
 */
@Disabled
public class DeelAsAServiceApiTest {

    private final DeelAsAServiceApi api = new DeelAsAServiceApi();

    /**
     * Add bank account
     *
     * Add bank account for an EOR employee.  **Token scopes**: &#x60;worker:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEORBankAccountTest() throws ApiException {
        AddEORBankAccountRequest addEORBankAccountRequest = null;
        AddEORBankAccount201Response response = api.addEORBankAccount()
                .addEORBankAccountRequest(addEORBankAccountRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve bank account guide
     *
     * Retrieve bank account form guide for an EOR employee. This data can be used to add a new bank account for an employee.  **Token scopes**: &#x60;worker:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEORBankAccountGuideTest() throws ApiException {
        GetEORBankAccountGuide200Response response = api.getEORBankAccountGuide()
                .execute();
        // TODO: test validations
    }

    /**
     * Modify bank account for an EOR employee
     *
     * Modify bank account for an EOR employee.  **Token scopes**: &#x60;worker:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchEORBankAccountTest() throws ApiException {
        UUID bankId = null;
        AddEORBankAccountRequest addEORBankAccountRequest = null;
        PatchEORBankAccount201Response response = api.patchEORBankAccount(bankId)
                .addEORBankAccountRequest(addEORBankAccountRequest)
                .execute();
        // TODO: test validations
    }

}
