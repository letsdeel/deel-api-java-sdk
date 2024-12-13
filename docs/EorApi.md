# EorApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateEorEmploymentCost**](EorApi.md#calculateEorEmploymentCost) | **POST** /eor/employment_cost | Calculate Employee Costs Globally |
| [**createEorContract**](EorApi.md#createEorContract) | **POST** /eor | Create an EOR contract |
| [**getEORContractBenefits**](EorApi.md#getEORContractBenefits) | **GET** /eor/{contract_id}/benefits | Retrieve Benefits for EOR Contract |
| [**getEORWorkerPayslipDownloadUrl**](EorApi.md#getEORWorkerPayslipDownloadUrl) | **GET** /eor/workers/{worker_id}/payslips/{payslip_id}/download | Retrieve payslip PDF download link |
| [**getEORWorkerPayslips**](EorApi.md#getEORWorkerPayslips) | **GET** /eor/workers/{worker_id}/payslips | Retrieve employee payslip records |
| [**getEorCountryValidations**](EorApi.md#getEorCountryValidations) | **GET** /eor/validations/{country_code} | Retrieve detailed hiring guide for a country |


<a id="calculateEorEmploymentCost"></a>
# **calculateEorEmploymentCost**
> CalculateEorEmploymentCost200Response calculateEorEmploymentCost(calculateEorEmploymentCostRequest).execute();

Calculate Employee Costs Globally

Determine the total employment costs for an Employee of Record (EOR) arrangement across different countries, including salary, employer costs, benefits, and additional fees.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: public
    OAuth public = (OAuth) defaultClient.getAuthentication("public");
    public.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EorApi apiInstance = new EorApi(defaultClient);
    CalculateEorEmploymentCostRequest calculateEorEmploymentCostRequest = new CalculateEorEmploymentCostRequest(); // CalculateEorEmploymentCostRequest | 
    try {
      CalculateEorEmploymentCost200Response result = apiInstance.calculateEorEmploymentCost(calculateEorEmploymentCostRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EorApi#calculateEorEmploymentCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculateEorEmploymentCostRequest** | [**CalculateEorEmploymentCostRequest**](CalculateEorEmploymentCostRequest.md)|  | |

### Return type

[**CalculateEorEmploymentCost200Response**](CalculateEorEmploymentCost200Response.md)

### Authorization

[public](../README.md#public), [deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully calculated employee costs. |  -  |
| **400** | Invalid request. Some required fields are missing or invalid. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Internal server error. Something went wrong while calculating costs. |  -  |

<a id="createEorContract"></a>
# **createEorContract**
> CreateEorContract200Response createEorContract(createEorContractRequest).execute();

Create an EOR contract

Creates an Employee of Record (EOR) contract quote. This endpoint allows to submit details for an EOR contract. Deel will process the information and return a quote for the requested contract.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EorApi apiInstance = new EorApi(defaultClient);
    CreateEorContractRequest createEorContractRequest = new CreateEorContractRequest(); // CreateEorContractRequest | The details of the Employee (EOR) contract to be created.
    try {
      CreateEorContract200Response result = apiInstance.createEorContract(createEorContractRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EorApi#createEorContract");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEorContractRequest** | [**CreateEorContractRequest**](CreateEorContractRequest.md)| The details of the Employee (EOR) contract to be created. | |

### Return type

[**CreateEorContract200Response**](CreateEorContract200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created the EOR contract quote. |  -  |
| **201** | Successful operation. |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Internal server error. |  -  |

<a id="getEORContractBenefits"></a>
# **getEORContractBenefits**
> GetEORContractBenefits200Response getEORContractBenefits(contractId).execute();

Retrieve Benefits for EOR Contract

Fetch detailed information about benefits associated with a specific Employee of Record (EOR) contract. The benefits include plan details, provider information, and enrollment statuses.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EorApi apiInstance = new EorApi(defaultClient);
    String contractId = "mryv8dx"; // String | Deel contract ID.
    try {
      GetEORContractBenefits200Response result = apiInstance.getEORContractBenefits(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EorApi#getEORContractBenefits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractId** | **String**| Deel contract ID. | |

### Return type

[**GetEORContractBenefits200Response**](GetEORContractBenefits200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of EOR contract benefits. |  -  |
| **400** | Invalid request. The &#x60;contract_id&#x60; parameter is missing or improperly formatted. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | The specified contract ID does not exist or has no associated benefits. |  -  |
| **500** | Operation failed. |  -  |

<a id="getEORWorkerPayslipDownloadUrl"></a>
# **getEORWorkerPayslipDownloadUrl**
> GetEORWorkerPayslipDownloadUrl200Response getEORWorkerPayslipDownloadUrl(workerId, payslipId).execute();

Retrieve payslip PDF download link

Retrieve a URL to download a specific payslip PDF for a EoR worker. This endpoint is useful for accessing detailed payment records in a portable document format.  **Token scopes**: &#x60;payslips:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EorApi apiInstance = new EorApi(defaultClient);
    String workerId = "123e4567-e89b-12d3-a456-426614174000"; // String | The ID of the worker whose payslip download link is being requested.
    String payslipId = "pay-001"; // String | The ID of the specific payslip to download.
    try {
      GetEORWorkerPayslipDownloadUrl200Response result = apiInstance.getEORWorkerPayslipDownloadUrl(workerId, payslipId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EorApi#getEORWorkerPayslipDownloadUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The ID of the worker whose payslip download link is being requested. | |
| **payslipId** | **String**| The ID of the specific payslip to download. | |

### Return type

[**GetEORWorkerPayslipDownloadUrl200Response**](GetEORWorkerPayslipDownloadUrl200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the payslip download link. |  -  |
| **400** | Invalid request. Either the worker ID or payslip ID is malformed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Payslip not found. The specified worker ID or payslip ID does not match any records. |  -  |
| **500** | Operation failed. |  -  |

<a id="getEORWorkerPayslips"></a>
# **getEORWorkerPayslips**
> GetEORWorkerPayslips200Response getEORWorkerPayslips(workerId).execute();

Retrieve employee payslip records

Retrieve a list of payslip records for a specific employee, detailing payment periods, status, and associated identifiers.  **Token scopes**: &#x60;payslips:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EorApi apiInstance = new EorApi(defaultClient);
    String workerId = "123e4567-e89b-12d3-a456-426614174000"; // String | The ID of the worker whose payslips are being retrieved.
    try {
      GetEORWorkerPayslips200Response result = apiInstance.getEORWorkerPayslips(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EorApi#getEORWorkerPayslips");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The ID of the worker whose payslips are being retrieved. | |

### Return type

[**GetEORWorkerPayslips200Response**](GetEORWorkerPayslips200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payslip records successfully retrieved. |  -  |
| **400** | Invalid request. The worker ID format is incorrect. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Worker not found or no payslips available. |  -  |
| **500** | Operation failed. |  -  |

<a id="getEorCountryValidations"></a>
# **getEorCountryValidations**
> GetEorCountryValidations200Response getEorCountryValidations(countryCode).execute();

Retrieve detailed hiring guide for a country

Retrieve comprehensive hiring guide data for a specific country. This data can be used in creation and validation of Employee of Record (EOR) contract quotes, providing details on salaries, holidays, insurance, and other employment specifics.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EorApi apiInstance = new EorApi(defaultClient);
    String countryCode = "US"; // String | The two-letter ISO code of the country for which to retrieve the hiring guide.
    try {
      GetEorCountryValidations200Response result = apiInstance.getEorCountryValidations(countryCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EorApi#getEorCountryValidations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**| The two-letter ISO code of the country for which to retrieve the hiring guide. | |

### Return type

[**GetEorCountryValidations200Response**](GetEorCountryValidations200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The hiring guide data was successfully retrieved. |  -  |
| **400** | Invalid request. The provided country code does not match the expected format. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Country data not found. |  -  |
| **500** | Operation failed. |  -  |

