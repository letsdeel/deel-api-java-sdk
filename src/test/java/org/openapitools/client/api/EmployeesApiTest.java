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
import org.openapitools.client.model.GetBenefitEmployee200Response;
import org.openapitools.client.model.GetBenefitEmployees200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeesApi
 */
@Disabled
public class EmployeesApiTest {

    private final EmployeesApi api = new EmployeesApi();

    /**
     * Get employee from organization integrated with external benefits vendor
     *
     * Get employee from organization integrated with external benefits vendor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBenefitEmployeeTest() throws ApiException {
        String id = null;
        String employeeId = null;
        Boolean activeContracts = null;
        GetBenefitEmployee200Response response = api.getBenefitEmployee(id, employeeId)
                .activeContracts(activeContracts)
                .execute();
        // TODO: test validations
    }

    /**
     * Get employees from organization integrated with external benefits vendor
     *
     * Get employees from organization integrated with external benefits vendor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBenefitEmployeesTest() throws ApiException {
        String id = null;
        Boolean activeContracts = null;
        Integer itemsPerPage = null;
        Integer offset = null;
        GetBenefitEmployees200Response response = api.getBenefitEmployees(id)
                .activeContracts(activeContracts)
                .itemsPerPage(itemsPerPage)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

}
