# GlobalPayrollApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGpBankAccount**](GlobalPayrollApi.md#addGpBankAccount) | **POST** /gp/workers/{worker_id}/banks | Add bank account |
| [**createGPContract**](GlobalPayrollApi.md#createGPContract) | **POST** /contracts/gp | Create a contract |
| [**downloadGrossToNetGPReport**](GlobalPayrollApi.md#downloadGrossToNetGPReport) | **GET** /gp/reports/{gp_report_id}/gross_to_net/csv | Download gross-to-net report |
| [**getDownloadUrlForGPPayslip**](GlobalPayrollApi.md#getDownloadUrlForGPPayslip) | **GET** /gp/workers/{id}/payslips/{payslipId}/download | Download payslip PDF |
| [**getGPLegalEntities**](GlobalPayrollApi.md#getGPLegalEntities) | **GET** /gp/legal-entities/{id}/reports | List payroll events by legal entity |
| [**getGpBankAccounts**](GlobalPayrollApi.md#getGpBankAccounts) | **GET** /gp/workers/{worker_id}/banks | Retrieve bank accounts |
| [**getGpBankGuide**](GlobalPayrollApi.md#getGpBankGuide) | **GET** /gp/workers/{worker_id}/banks/guide | Retrieve bank guide |
| [**getGrossToNetGPReports**](GlobalPayrollApi.md#getGrossToNetGPReports) | **GET** /gp/reports/{id}/gross_to_net | List gross-to-net report |
| [**getWorkerPayslips**](GlobalPayrollApi.md#getWorkerPayslips) | **GET** /gp/workers/{id}/payslips | Retrieve employee payslips |
| [**patchGpBankAccount**](GlobalPayrollApi.md#patchGpBankAccount) | **PATCH** /gp/workers/{worker_id}/banks/{bank_id} | Modify bank account |
| [**requestTermination**](GlobalPayrollApi.md#requestTermination) | **POST** /gp/workers/{worker_id}/terminations | Request termination |
| [**updateGPEmployeeAddress**](GlobalPayrollApi.md#updateGPEmployeeAddress) | **PATCH** /gp/workers/{worker_id}/address | Update address |
| [**updateGPEmployeeCompensation**](GlobalPayrollApi.md#updateGPEmployeeCompensation) | **PATCH** /gp/workers/{worker_id}/compensation | Update compensation |
| [**updateGPEmployeeInformation**](GlobalPayrollApi.md#updateGPEmployeeInformation) | **PATCH** /gp/workers/{worker_id}/employee-information | Update employee information |
| [**updateGPEmployeePto**](GlobalPayrollApi.md#updateGPEmployeePto) | **PATCH** /gp/workers/{worker_id}/pto-policy | Update PTO policy |


<a id="addGpBankAccount"></a>
# **addGpBankAccount**
> AddGpBankAccount201Response addGpBankAccount(workerId, updateGPEmployeeAddressRequest).execute();

Add bank account

Add a new bank account for an employee.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    UpdateGPEmployeeAddressRequest updateGPEmployeeAddressRequest = new UpdateGPEmployeeAddressRequest(); // UpdateGPEmployeeAddressRequest | Request body containing the details of the bank account to be added.
    try {
      AddGpBankAccount201Response result = apiInstance.addGpBankAccount(workerId, updateGPEmployeeAddressRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#addGpBankAccount");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |
| **updateGPEmployeeAddressRequest** | [**UpdateGPEmployeeAddressRequest**](UpdateGPEmployeeAddressRequest.md)| Request body containing the details of the bank account to be added. | |

### Return type

[**AddGpBankAccount201Response**](AddGpBankAccount201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createGPContract"></a>
# **createGPContract**
> CreateGPContract201Response createGPContract(createGPContractRequest).execute();

Create a contract

Create a Global Payroll contract.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    CreateGPContractRequest createGPContractRequest = new CreateGPContractRequest(); // CreateGPContractRequest | Global Payroll (GP) contract object that needs to be created
    try {
      CreateGPContract201Response result = apiInstance.createGPContract(createGPContractRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#createGPContract");
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
| **createGPContractRequest** | [**CreateGPContractRequest**](CreateGPContractRequest.md)| Global Payroll (GP) contract object that needs to be created | |

### Return type

[**CreateGPContract201Response**](CreateGPContract201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="downloadGrossToNetGPReport"></a>
# **downloadGrossToNetGPReport**
> String downloadGrossToNetGPReport(gpReportId).execute();

Download gross-to-net report

Download global payroll reports detailing gross-to-net calculations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID gpReportId = UUID.randomUUID(); // UUID | Id of gp report.
    try {
      String result = apiInstance.downloadGrossToNetGPReport(gpReportId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#downloadGrossToNetGPReport");
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
| **gpReportId** | **UUID**| Id of gp report. | |

### Return type

**String**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getDownloadUrlForGPPayslip"></a>
# **getDownloadUrlForGPPayslip**
> GetDownloadUrlForGPPayslip200Response getDownloadUrlForGPPayslip(id, payslipId).execute();

Download payslip PDF

Get a pre-signed download URL for a GP payslip PDF.  **Token scopes**: &#x60;payslips:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID id = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for the worker.
    UUID payslipId = UUID.fromString("9a55c23e-1234-5678-9101-abcdefabcdef"); // UUID | Unique identifier for the payslip.
    try {
      GetDownloadUrlForGPPayslip200Response result = apiInstance.getDownloadUrlForGPPayslip(id, payslipId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getDownloadUrlForGPPayslip");
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
| **id** | **UUID**| Unique identifier for the worker. | |
| **payslipId** | **UUID**| Unique identifier for the payslip. | |

### Return type

[**GetDownloadUrlForGPPayslip200Response**](GetDownloadUrlForGPPayslip200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getGPLegalEntities"></a>
# **getGPLegalEntities**
> GetGPLegalEntities200Response getGPLegalEntities(id).startDate(startDate).execute();

List payroll events by legal entity

Get a list of global payroll events by legal entities.  **Token scopes**: &#x60;global-payroll:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID id = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for the legal entity.
    LocalDate startDate = LocalDate.parse("2022-01-01"); // LocalDate | Filter payroll events starting from this date.
    try {
      GetGPLegalEntities200Response result = apiInstance.getGPLegalEntities(id)
            .startDate(startDate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getGPLegalEntities");
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
| **id** | **UUID**| Unique identifier for the legal entity. | |
| **startDate** | **LocalDate**| Filter payroll events starting from this date. | [optional] |

### Return type

[**GetGPLegalEntities200Response**](GetGPLegalEntities200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getGpBankAccounts"></a>
# **getGpBankAccounts**
> GetGpBankAccounts200Response getGpBankAccounts(workerId).execute();

Retrieve bank accounts

Retrieve all bank accounts for an employee.  **Token scopes**: &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    String workerId = "wkr01a8pdlqlg0v0pzx11yhdy"; // String | Unique identifier for a worker.
    try {
      GetGpBankAccounts200Response result = apiInstance.getGpBankAccounts(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getGpBankAccounts");
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
| **workerId** | **String**| Unique identifier for a worker. | |

### Return type

[**GetGpBankAccounts200Response**](GetGpBankAccounts200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getGpBankGuide"></a>
# **getGpBankGuide**
> GetGpBankGuide200Response getGpBankGuide(workerId).execute();

Retrieve bank guide

Retrieve the bank form guide for an employee.  **Token scopes**: &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    try {
      GetGpBankGuide200Response result = apiInstance.getGpBankGuide(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getGpBankGuide");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |

### Return type

[**GetGpBankGuide200Response**](GetGpBankGuide200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getGrossToNetGPReports"></a>
# **getGrossToNetGPReports**
> GetGrossToNetGPReports200Response getGrossToNetGPReports(id).execute();

List gross-to-net report

Get a list of global payroll reports detailing gross-to-net calculations.  **Token scopes**: &#x60;global-payroll:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID id = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for the payroll report in UUID format.
    try {
      GetGrossToNetGPReports200Response result = apiInstance.getGrossToNetGPReports(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getGrossToNetGPReports");
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
| **id** | **UUID**| Unique identifier for the payroll report in UUID format. | |

### Return type

[**GetGrossToNetGPReports200Response**](GetGrossToNetGPReports200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getWorkerPayslips"></a>
# **getWorkerPayslips**
> GetWorkerPayslips200Response getWorkerPayslips(id).execute();

Retrieve employee payslips

Get a list of payslips for an employee.  **Token scopes**: &#x60;payslips:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID id = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for the worker.
    try {
      GetWorkerPayslips200Response result = apiInstance.getWorkerPayslips(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getWorkerPayslips");
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
| **id** | **UUID**| Unique identifier for the worker. | |

### Return type

[**GetWorkerPayslips200Response**](GetWorkerPayslips200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="patchGpBankAccount"></a>
# **patchGpBankAccount**
> PatchGpBankAccount200Response patchGpBankAccount(workerId, bankId, updateGPEmployeeAddressRequestData).execute();

Modify bank account

Modify bank account for an employee.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    UUID bankId = UUID.fromString("a3b33c4d-8c02-4f7d-92b5-123abc456def"); // UUID | Unique identifier for the bank account in UUID format.
    UpdateGPEmployeeAddressRequestData updateGPEmployeeAddressRequestData = new UpdateGPEmployeeAddressRequestData(); // UpdateGPEmployeeAddressRequestData | Request body to modify an existing bank account for an employee.
    try {
      PatchGpBankAccount200Response result = apiInstance.patchGpBankAccount(workerId, bankId, updateGPEmployeeAddressRequestData)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#patchGpBankAccount");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |
| **bankId** | **UUID**| Unique identifier for the bank account in UUID format. | |
| **updateGPEmployeeAddressRequestData** | [**UpdateGPEmployeeAddressRequestData**](UpdateGPEmployeeAddressRequestData.md)| Request body to modify an existing bank account for an employee. | |

### Return type

[**PatchGpBankAccount200Response**](PatchGpBankAccount200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="requestTermination"></a>
# **requestTermination**
> RequestTermination201Response requestTermination(workerId, requestTerminationRequest).execute();

Request termination

Request a termination for a global payroll employee. A successful call starts the termination process and does not confirm termination.  **Token scopes**: &#x60;global-payroll:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    RequestTerminationRequest requestTerminationRequest = new RequestTerminationRequest(); // RequestTerminationRequest | Request body to request a termination for an employee.
    try {
      RequestTermination201Response result = apiInstance.requestTermination(workerId, requestTerminationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#requestTermination");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |
| **requestTerminationRequest** | [**RequestTerminationRequest**](RequestTerminationRequest.md)| Request body to request a termination for an employee. | |

### Return type

[**RequestTermination201Response**](RequestTermination201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateGPEmployeeAddress"></a>
# **updateGPEmployeeAddress**
> GPEmployeeAddressUpdatedContainer updateGPEmployeeAddress(workerId, updateGPEmployeeAddressRequest).execute();

Update address

Update the address of a Global Payroll employee.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    UpdateGPEmployeeAddressRequest updateGPEmployeeAddressRequest = new UpdateGPEmployeeAddressRequest(); // UpdateGPEmployeeAddressRequest | Request body containing the new address and related details.
    try {
      GPEmployeeAddressUpdatedContainer result = apiInstance.updateGPEmployeeAddress(workerId, updateGPEmployeeAddressRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateGPEmployeeAddress");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |
| **updateGPEmployeeAddressRequest** | [**UpdateGPEmployeeAddressRequest**](UpdateGPEmployeeAddressRequest.md)| Request body containing the new address and related details. | |

### Return type

[**GPEmployeeAddressUpdatedContainer**](GPEmployeeAddressUpdatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **201** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateGPEmployeeCompensation"></a>
# **updateGPEmployeeCompensation**
> UpdateGPEmployeeCompensation200Response updateGPEmployeeCompensation(workerId, updateGPEmployeeCompensationRequest).execute();

Update compensation

Update the compensation of a Global Payroll employee. Returns the full compensation history including the update.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    UpdateGPEmployeeCompensationRequest updateGPEmployeeCompensationRequest = new UpdateGPEmployeeCompensationRequest(); // UpdateGPEmployeeCompensationRequest | Request body containing the data to update the compensation of the employee.
    try {
      UpdateGPEmployeeCompensation200Response result = apiInstance.updateGPEmployeeCompensation(workerId, updateGPEmployeeCompensationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateGPEmployeeCompensation");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |
| **updateGPEmployeeCompensationRequest** | [**UpdateGPEmployeeCompensationRequest**](UpdateGPEmployeeCompensationRequest.md)| Request body containing the data to update the compensation of the employee. | |

### Return type

[**UpdateGPEmployeeCompensation200Response**](UpdateGPEmployeeCompensation200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateGPEmployeeInformation"></a>
# **updateGPEmployeeInformation**
> GPEmployeeInformationUpdatedContainer updateGPEmployeeInformation(workerId, updateGPEmployeeInformationRequest).execute();

Update employee information

Update Global Payroll employee information.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    UpdateGPEmployeeInformationRequest updateGPEmployeeInformationRequest = new UpdateGPEmployeeInformationRequest(); // UpdateGPEmployeeInformationRequest | 
    try {
      GPEmployeeInformationUpdatedContainer result = apiInstance.updateGPEmployeeInformation(workerId, updateGPEmployeeInformationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateGPEmployeeInformation");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |
| **updateGPEmployeeInformationRequest** | [**UpdateGPEmployeeInformationRequest**](UpdateGPEmployeeInformationRequest.md)|  | |

### Return type

[**GPEmployeeInformationUpdatedContainer**](GPEmployeeInformationUpdatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **201** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateGPEmployeePto"></a>
# **updateGPEmployeePto**
> UpdateGPEmployeePto200Response updateGPEmployeePto(workerId, updateGPEmployeePtoRequest).execute();

Update PTO policy

Update the PTO policy of a Global Payroll employee.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalPayrollApi;

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

    GlobalPayrollApi apiInstance = new GlobalPayrollApi(defaultClient);
    UUID workerId = UUID.fromString("6f50539e-9f62-45d0-a42e-62a62fbb984a"); // UUID | Unique identifier for a worker in UUID format.
    UpdateGPEmployeePtoRequest updateGPEmployeePtoRequest = new UpdateGPEmployeePtoRequest(); // UpdateGPEmployeePtoRequest | Contract object that needs to be amended.
    try {
      UpdateGPEmployeePto200Response result = apiInstance.updateGPEmployeePto(workerId, updateGPEmployeePtoRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateGPEmployeePto");
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
| **workerId** | **UUID**| Unique identifier for a worker in UUID format. | |
| **updateGPEmployeePtoRequest** | [**UpdateGPEmployeePtoRequest**](UpdateGPEmployeePtoRequest.md)| Contract object that needs to be amended. | |

### Return type

[**UpdateGPEmployeePto200Response**](UpdateGPEmployeePto200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

