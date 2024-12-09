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
import org.openapitools.client.model.CreateTimesheet201Response;
import org.openapitools.client.model.CreateTimesheetRequest;
import org.openapitools.client.model.CreateTimesheetRequest1;
import org.openapitools.client.model.CreateTimesheetReviewRequest;
import org.openapitools.client.model.GenericResultCreated;
import org.openapitools.client.model.GenericResultUpdated;
import org.openapitools.client.model.GetTimesheetById200Response;
import org.openapitools.client.model.GetTimesheets200Response;
import org.openapitools.client.model.GetTimesheetsByContract200Response;
import org.openapitools.client.model.GetTimesheetsByContractContractTypesParameter;
import org.openapitools.client.model.GetTimesheetsByContractStatusesParameter;
import org.openapitools.client.model.GetTimesheetsStatusesParameter;
import java.time.LocalDate;
import org.openapitools.client.model.SignContract201Response;
import org.openapitools.client.model.TimesheetReviewsToCreateContainer;
import java.util.UUID;
import org.openapitools.client.model.UninviteToSignContract200Response;
import org.openapitools.client.model.UpdateAdjustment200Response;
import org.openapitools.client.model.UpdateTimesheetByIdRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimesheetsApi
 */
@Disabled
public class TimesheetsApiTest {

    private final TimesheetsApi api = new TimesheetsApi();

    /**
     * Create a timesheet entry
     *
     * Submit work for a contractor.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTimesheetTest() throws ApiException {
        CreateTimesheetRequest createTimesheetRequest = null;
        CreateTimesheet201Response response = api.createTimesheet(createTimesheetRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Review a single timesheet
     *
     * Review a timesheet to approve or decline submitted work.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTimesheetReviewTest() throws ApiException {
        String id = null;
        CreateTimesheetReviewRequest createTimesheetReviewRequest = null;
        SignContract201Response response = api.createTimesheetReview(id, createTimesheetReviewRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Review multiple timesheets
     *
     * Review a batch of timesheets to approve or reject submitted work.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTimesheetReviewsTest() throws ApiException {
        TimesheetReviewsToCreateContainer timesheetReviewsToCreateContainer = null;
        GenericResultCreated response = api.createTimesheetReviews()
                .timesheetReviewsToCreateContainer(timesheetReviewsToCreateContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a timesheet entry
     *
     * Delete a single timesheet entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTimesheetByIdTest() throws ApiException {
        String id = null;
        String reason = null;
        UninviteToSignContract200Response response = api.deleteTimesheetById(id)
                .reason(reason)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single timesheet entry
     *
     * Retrieve a single timesheet entry by Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimesheetByIdTest() throws ApiException {
        String id = null;
        GetTimesheetById200Response response = api.getTimesheetById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List of timesheets
     *
     * Retrieve a list of timesheets in your Deel account. You can filter the list by providing additional paramters e.g. contract_id, contract_type etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimesheetsTest() throws ApiException {
        String contractId = null;
        GetTimesheetsByContractContractTypesParameter contractTypes = null;
        GetTimesheetsStatusesParameter statuses = null;
        UUID reporterId = null;
        LocalDate dateFrom = null;
        LocalDate dateTo = null;
        String limit = null;
        String offset = null;
        GetTimesheets200Response response = api.getTimesheets()
                .contractId(contractId)
                .contractTypes(contractTypes)
                .statuses(statuses)
                .reporterId(reporterId)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * List of timesheets by contract
     *
     * Retrieve a list of timesheets found for a contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimesheetsByContractTest() throws ApiException {
        String contractId = null;
        GetTimesheetsByContractContractTypesParameter contractTypes = null;
        GetTimesheetsByContractStatusesParameter statuses = null;
        UUID reporterId = null;
        LocalDate dateFrom = null;
        LocalDate dateTo = null;
        String limit = null;
        String offset = null;
        GetTimesheetsByContract200Response response = api.getTimesheetsByContract(contractId)
                .contractTypes(contractTypes)
                .statuses(statuses)
                .reporterId(reporterId)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a timesheet entry
     *
     * Update a single timesheet entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTimesheetByIdTest() throws ApiException {
        String id = null;
        UpdateTimesheetByIdRequest updateTimesheetByIdRequest = null;
        GenericResultUpdated response = api.updateTimesheetById(id, updateTimesheetByIdRequest)
                .execute();
        // TODO: test validations
    }

}
