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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.GetPayStub200Response;
import org.openapitools.client.model.GetYearToDatePay200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayrollApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PayrollApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PayrollApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getPayStubCall(String id, String payrollStartDate, String payrollEndDate, String status, Integer itemsPerPage, Integer offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/benefits/legal-entities/{id}/pay-stub"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (payrollStartDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("payroll_start_date", payrollStartDate));
        }

        if (payrollEndDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("payroll_end_date", payrollEndDate));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (itemsPerPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("items_per_page", itemsPerPage));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "deelToken", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPayStubValidateBeforeCall(String id, String payrollStartDate, String payrollEndDate, String status, Integer itemsPerPage, Integer offset, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPayStub(Async)");
        }

        return getPayStubCall(id, payrollStartDate, payrollEndDate, status, itemsPerPage, offset, _callback);

    }


    private ApiResponse<GetPayStub200Response> getPayStubWithHttpInfo(String id, String payrollStartDate, String payrollEndDate, String status, Integer itemsPerPage, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = getPayStubValidateBeforeCall(id, payrollStartDate, payrollEndDate, status, itemsPerPage, offset, null);
        Type localVarReturnType = new TypeToken<GetPayStub200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPayStubAsync(String id, String payrollStartDate, String payrollEndDate, String status, Integer itemsPerPage, Integer offset, final ApiCallback<GetPayStub200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPayStubValidateBeforeCall(id, payrollStartDate, payrollEndDate, status, itemsPerPage, offset, _callback);
        Type localVarReturnType = new TypeToken<GetPayStub200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetPayStubRequest {
        private final String id;
        private String payrollStartDate;
        private String payrollEndDate;
        private String status;
        private Integer itemsPerPage;
        private Integer offset;

        private APIgetPayStubRequest(String id) {
            this.id = id;
        }

        /**
         * Set payrollStartDate
         * @param payrollStartDate Payroll start date (optional)
         * @return APIgetPayStubRequest
         */
        public APIgetPayStubRequest payrollStartDate(String payrollStartDate) {
            this.payrollStartDate = payrollStartDate;
            return this;
        }

        /**
         * Set payrollEndDate
         * @param payrollEndDate Payroll end date (optional)
         * @return APIgetPayStubRequest
         */
        public APIgetPayStubRequest payrollEndDate(String payrollEndDate) {
            this.payrollEndDate = payrollEndDate;
            return this;
        }

        /**
         * Set status
         * @param status Payroll status (optional)
         * @return APIgetPayStubRequest
         */
        public APIgetPayStubRequest status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Set itemsPerPage
         * @param itemsPerPage Items per page (optional, default to 100)
         * @return APIgetPayStubRequest
         */
        public APIgetPayStubRequest itemsPerPage(Integer itemsPerPage) {
            this.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * Set offset
         * @param offset Items to be skipped when searching (optional, default to 0)
         * @return APIgetPayStubRequest
         */
        public APIgetPayStubRequest offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Build call for getPayStub
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getPayStubCall(id, payrollStartDate, payrollEndDate, status, itemsPerPage, offset, _callback);
        }

        /**
         * Execute getPayStub request
         * @return GetPayStub200Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public GetPayStub200Response execute() throws ApiException {
            ApiResponse<GetPayStub200Response> localVarResp = getPayStubWithHttpInfo(id, payrollStartDate, payrollEndDate, status, itemsPerPage, offset);
            return localVarResp.getData();
        }

        /**
         * Execute getPayStub request with HTTP info returned
         * @return ApiResponse&lt;GetPayStub200Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetPayStub200Response> executeWithHttpInfo() throws ApiException {
            return getPayStubWithHttpInfo(id, payrollStartDate, payrollEndDate, status, itemsPerPage, offset);
        }

        /**
         * Execute getPayStub request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetPayStub200Response> _callback) throws ApiException {
            return getPayStubAsync(id, payrollStartDate, payrollEndDate, status, itemsPerPage, offset, _callback);
        }
    }

    /**
     * Get pay stub from employees from organization integrated with external benefits vendor
     * Get pay stub from employees from organization integrated with external benefits vendor
     * @param id Id from the legal entity to fetch data (required)
     * @return APIgetPayStubRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetPayStubRequest getPayStub(String id) {
        return new APIgetPayStubRequest(id);
    }
    private okhttp3.Call getYearToDatePayCall(String id, String dateStart, String dateEnd, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/benefits/legal-entities/{id}/year-to-date-pay"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dateStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_start", dateStart));
        }

        if (dateEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_end", dateEnd));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "deelToken", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getYearToDatePayValidateBeforeCall(String id, String dateStart, String dateEnd, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getYearToDatePay(Async)");
        }

        // verify the required parameter 'dateStart' is set
        if (dateStart == null) {
            throw new ApiException("Missing the required parameter 'dateStart' when calling getYearToDatePay(Async)");
        }

        // verify the required parameter 'dateEnd' is set
        if (dateEnd == null) {
            throw new ApiException("Missing the required parameter 'dateEnd' when calling getYearToDatePay(Async)");
        }

        return getYearToDatePayCall(id, dateStart, dateEnd, _callback);

    }


    private ApiResponse<GetYearToDatePay200Response> getYearToDatePayWithHttpInfo(String id, String dateStart, String dateEnd) throws ApiException {
        okhttp3.Call localVarCall = getYearToDatePayValidateBeforeCall(id, dateStart, dateEnd, null);
        Type localVarReturnType = new TypeToken<GetYearToDatePay200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getYearToDatePayAsync(String id, String dateStart, String dateEnd, final ApiCallback<GetYearToDatePay200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getYearToDatePayValidateBeforeCall(id, dateStart, dateEnd, _callback);
        Type localVarReturnType = new TypeToken<GetYearToDatePay200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetYearToDatePayRequest {
        private final String id;
        private final String dateStart;
        private final String dateEnd;

        private APIgetYearToDatePayRequest(String id, String dateStart, String dateEnd) {
            this.id = id;
            this.dateStart = dateStart;
            this.dateEnd = dateEnd;
        }

        /**
         * Build call for getYearToDatePay
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getYearToDatePayCall(id, dateStart, dateEnd, _callback);
        }

        /**
         * Execute getYearToDatePay request
         * @return GetYearToDatePay200Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public GetYearToDatePay200Response execute() throws ApiException {
            ApiResponse<GetYearToDatePay200Response> localVarResp = getYearToDatePayWithHttpInfo(id, dateStart, dateEnd);
            return localVarResp.getData();
        }

        /**
         * Execute getYearToDatePay request with HTTP info returned
         * @return ApiResponse&lt;GetYearToDatePay200Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetYearToDatePay200Response> executeWithHttpInfo() throws ApiException {
            return getYearToDatePayWithHttpInfo(id, dateStart, dateEnd);
        }

        /**
         * Execute getYearToDatePay request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetYearToDatePay200Response> _callback) throws ApiException {
            return getYearToDatePayAsync(id, dateStart, dateEnd, _callback);
        }
    }

    /**
     * Get year to date payment for benefits 401k.
     * Get year to date from employees from organization integrated with external benefits vendor
     * @param id Id from the legal entity to fetch data (required)
     * @param dateStart Start date to fetch aggregated pay data (required)
     * @param dateEnd End date to fetch aggregated pay data (required)
     * @return APIgetYearToDatePayRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetYearToDatePayRequest getYearToDatePay(String id, String dateStart, String dateEnd) {
        return new APIgetYearToDatePayRequest(id, dateStart, dateEnd);
    }
}
