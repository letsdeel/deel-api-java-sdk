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
import org.openapitools.client.model.CreateInvoiceAdjustmentRequest;
import org.openapitools.client.model.CreateInvoiceAdjustmentRequest1;
import org.openapitools.client.model.CreateTimesheet201Response;
import org.openapitools.client.model.GenericResultCreated;
import org.openapitools.client.model.GetInvoiceAdjustments200Response;
import org.openapitools.client.model.GetInvoiceAdjustmentsByContractId200Response;
import org.openapitools.client.model.GetInvoiceAdjustmentsByContractIdTypesParameter;
import org.openapitools.client.model.GetTimesheetsByContractContractTypesParameter;
import org.openapitools.client.model.GetTimesheetsStatusesParameter;
import org.openapitools.client.model.InvoiceAdjustmentReviewsToCreateContainer;
import java.time.LocalDate;
import java.util.UUID;
import org.openapitools.client.model.UpdateAdjustment200Response;
import org.openapitools.client.model.UpdateInvoiceAdjustment200Response;
import org.openapitools.client.model.UpdateInvoiceAdjustmentByIdRequest;
import org.openapitools.client.model.UpdateInvoiceAdjustmentRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
@Disabled
public class InvoicesApiTest {

    private final InvoicesApi api = new InvoicesApi();

    /**
     * Create an invoice adjustment
     *
     * Create an invoice adjustment using this endpoint. For example, you can add a bonus, commission, VAT %, deduction etc. to an invoice.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInvoiceAdjustmentTest() throws ApiException {
        CreateInvoiceAdjustmentRequest createInvoiceAdjustmentRequest = null;
        String recurring = null;
        CreateTimesheet201Response response = api.createInvoiceAdjustment(createInvoiceAdjustmentRequest)
                .recurring(recurring)
                .execute();
        // TODO: test validations
    }

    /**
     * Bulk review invoice adjustments
     *
     * Review multiple invoice adjustments to approve or decline a batch.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInvoiceAdjustmentReviewsTest() throws ApiException {
        InvoiceAdjustmentReviewsToCreateContainer invoiceAdjustmentReviewsToCreateContainer = null;
        GenericResultCreated response = api.createInvoiceAdjustmentReviews()
                .invoiceAdjustmentReviewsToCreateContainer(invoiceAdjustmentReviewsToCreateContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * List invoice adjustments
     *
     * Retrieve invoice adjustments. You can filter the list by providing additional parameters e.g. contract_id, contract_type etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoiceAdjustmentsTest() throws ApiException {
        String contractId = null;
        GetTimesheetsByContractContractTypesParameter contractTypes = null;
        GetInvoiceAdjustmentsByContractIdTypesParameter types = null;
        GetTimesheetsStatusesParameter statuses = null;
        String invoiceId = null;
        UUID reporterId = null;
        LocalDate dateFrom = null;
        LocalDate dateTo = null;
        String limit = null;
        String offset = null;
        GetInvoiceAdjustments200Response response = api.getInvoiceAdjustments()
                .contractId(contractId)
                .contractTypes(contractTypes)
                .types(types)
                .statuses(statuses)
                .invoiceId(invoiceId)
                .reporterId(reporterId)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Invoice line items by contract
     *
     * Retrieve invoice line items for a given contract id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoiceAdjustmentsByContractIdTest() throws ApiException {
        String contractId = null;
        GetTimesheetsByContractContractTypesParameter contractTypes = null;
        GetInvoiceAdjustmentsByContractIdTypesParameter types = null;
        GetTimesheetsStatusesParameter statuses = null;
        String invoiceId = null;
        UUID reporterId = null;
        LocalDate dateFrom = null;
        LocalDate dateTo = null;
        String limit = null;
        String offset = null;
        GetInvoiceAdjustmentsByContractId200Response response = api.getInvoiceAdjustmentsByContractId(contractId)
                .contractTypes(contractTypes)
                .types(types)
                .statuses(statuses)
                .invoiceId(invoiceId)
                .reporterId(reporterId)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an invoice adjustment
     *
     * Update an invoice adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInvoiceAdjustmentTest() throws ApiException {
        String id = null;
        UpdateInvoiceAdjustmentRequest updateInvoiceAdjustmentRequest = null;
        UpdateInvoiceAdjustment200Response response = api.updateInvoiceAdjustment(id, updateInvoiceAdjustmentRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an invoice adjustment
     *
     * Update an existing invoice adjustment. It is not possible to update VAT adjustments, we recommend you to delete the existing VAT adjust and create a new one.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInvoiceAdjustmentByIdTest() throws ApiException {
        String id = null;
        UpdateInvoiceAdjustmentByIdRequest updateInvoiceAdjustmentByIdRequest = null;
        UpdateAdjustment200Response response = api.updateInvoiceAdjustmentById(id, updateInvoiceAdjustmentByIdRequest)
                .execute();
        // TODO: test validations
    }

}