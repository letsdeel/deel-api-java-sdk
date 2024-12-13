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
import org.openapitools.client.model.CalculateEorEmploymentCost200Response;
import org.openapitools.client.model.CalculateEorEmploymentCostRequest;
import org.openapitools.client.model.CreateEorContract200Response;
import org.openapitools.client.model.CreateEorContractRequest;
import org.openapitools.client.model.EorContractCreatedContainer;
import org.openapitools.client.model.GetEORContractBenefits200Response;
import org.openapitools.client.model.GetEORWorkerPayslipDownloadUrl200Response;
import org.openapitools.client.model.GetEORWorkerPayslips200Response;
import org.openapitools.client.model.GetEorCountryValidations200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EorApi
 */
@Disabled
public class EorApiTest {

    private final EorApi api = new EorApi();

    /**
     * Calculate Employee Costs Globally
     *
     * Determine the total employment costs for an Employee of Record (EOR) arrangement across different countries, including salary, employer costs, benefits, and additional fees.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calculateEorEmploymentCostTest() throws ApiException {
        CalculateEorEmploymentCostRequest calculateEorEmploymentCostRequest = null;
        CalculateEorEmploymentCost200Response response = api.calculateEorEmploymentCost(calculateEorEmploymentCostRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Create an EOR contract
     *
     * Creates an Employee of Record (EOR) contract quote. This endpoint allows to submit details for an EOR contract. Deel will process the information and return a quote for the requested contract.  **Token scopes**: &#x60;contracts:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEorContractTest() throws ApiException {
        CreateEorContractRequest createEorContractRequest = null;
        CreateEorContract200Response response = api.createEorContract(createEorContractRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Benefits for EOR Contract
     *
     * Fetch detailed information about benefits associated with a specific Employee of Record (EOR) contract. The benefits include plan details, provider information, and enrollment statuses.  **Token scopes**: &#x60;contracts:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEORContractBenefitsTest() throws ApiException {
        String contractId = null;
        GetEORContractBenefits200Response response = api.getEORContractBenefits(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve payslip PDF download link
     *
     * Retrieve a URL to download a specific payslip PDF for a EoR worker. This endpoint is useful for accessing detailed payment records in a portable document format.  **Token scopes**: &#x60;payslips:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEORWorkerPayslipDownloadUrlTest() throws ApiException {
        String workerId = null;
        String payslipId = null;
        GetEORWorkerPayslipDownloadUrl200Response response = api.getEORWorkerPayslipDownloadUrl(workerId, payslipId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve employee payslip records
     *
     * Retrieve a list of payslip records for a specific employee, detailing payment periods, status, and associated identifiers.  **Token scopes**: &#x60;payslips:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEORWorkerPayslipsTest() throws ApiException {
        String workerId = null;
        GetEORWorkerPayslips200Response response = api.getEORWorkerPayslips(workerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve detailed hiring guide for a country
     *
     * Retrieve comprehensive hiring guide data for a specific country. This data can be used in creation and validation of Employee of Record (EOR) contract quotes, providing details on salaries, holidays, insurance, and other employment specifics.  **Token scopes**: &#x60;contracts:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEorCountryValidationsTest() throws ApiException {
        String countryCode = null;
        GetEorCountryValidations200Response response = api.getEorCountryValidations(countryCode)
                .execute();
        // TODO: test validations
    }

}
