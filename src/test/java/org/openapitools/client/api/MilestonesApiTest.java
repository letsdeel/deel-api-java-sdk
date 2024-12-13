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
import org.openapitools.client.model.CreateMilestone201Response;
import org.openapitools.client.model.CreateMilestone400Response;
import org.openapitools.client.model.CreateMilestone404Response;
import org.openapitools.client.model.CreateMilestoneRequest;
import org.openapitools.client.model.CreateMilestoneRequest1;
import org.openapitools.client.model.DeleteMilestoneById200Response;
import org.openapitools.client.model.DeleteMilestoneById400Response;
import org.openapitools.client.model.DeleteMilestoneById404Response;
import org.openapitools.client.model.DeleteMilestoneById500Response;
import org.openapitools.client.model.GenericResultCreated;
import org.openapitools.client.model.GetMilestonesByContract200Response;
import org.openapitools.client.model.GetMilestonesByContractAndId200Response;
import org.openapitools.client.model.MilestoneReviewToCreateContainer;
import org.openapitools.client.model.MilestoneReviewsToCreateContainer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MilestonesApi
 */
@Disabled
public class MilestonesApiTest {

    private final MilestonesApi api = new MilestonesApi();

    /**
     * Create a Milestone
     *
     * Add a new milestone to a specific contract. Milestones represent distinct deliverables or phases in the contract and can include additional details such as attachments.  **Token scopes**: &#x60;milestones:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMilestoneTest() throws ApiException {
        String contractId = null;
        CreateMilestoneRequest createMilestoneRequest = null;
        CreateMilestone201Response response = api.createMilestone(contractId, createMilestoneRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Review a single milestone
     *
     * Review a milestone to approve or decline submitted work.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMilestoneReviewTest() throws ApiException {
        String contractId = null;
        String milestoneId = null;
        MilestoneReviewToCreateContainer milestoneReviewToCreateContainer = null;
        GenericResultCreated response = api.createMilestoneReview(contractId, milestoneId)
                .milestoneReviewToCreateContainer(milestoneReviewToCreateContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Review multiple milestones
     *
     * Review a batch of milestones to approve or reject submitted work.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMilestoneReviewsTest() throws ApiException {
        String contractId = null;
        MilestoneReviewsToCreateContainer milestoneReviewsToCreateContainer = null;
        GenericResultCreated response = api.createMilestoneReviews(contractId)
                .milestoneReviewsToCreateContainer(milestoneReviewsToCreateContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Milestone
     *
     * Delete a specific milestone associated with a contract. This operation removes the milestone and its data permanently from the system.  **Token scopes**: &#x60;milestones:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMilestoneByIdTest() throws ApiException {
        String contractId = null;
        String milestoneId = null;
        DeleteMilestoneById200Response response = api.deleteMilestoneById(contractId, milestoneId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Milestones by Contract
     *
     * Retrieve a list of milestones associated with a specific contract. Each milestone includes details such as its title, amount, status, and relevant dates, along with information about the creator and reviewer.  **Token scopes**: &#x60;milestones:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMilestonesByContractTest() throws ApiException {
        String contractId = null;
        GetMilestonesByContract200Response response = api.getMilestonesByContract(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single milestone
     *
     * Retrieve a single milestone.  **Token scopes**: &#x60;milestones:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMilestonesByContractAndIdTest() throws ApiException {
        String contractId = null;
        String milestoneId = null;
        GetMilestonesByContractAndId200Response response = api.getMilestonesByContractAndId(contractId, milestoneId)
                .execute();
        // TODO: test validations
    }

}
