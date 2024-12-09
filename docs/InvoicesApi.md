# InvoicesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInvoiceAdjustment**](InvoicesApi.md#createInvoiceAdjustment) | **POST** /invoice-adjustments | Create an invoice adjustment |
| [**createInvoiceAdjustmentReviews**](InvoicesApi.md#createInvoiceAdjustmentReviews) | **POST** /invoice-adjustments/many/reviews | Bulk review invoice adjustments |
| [**getInvoiceAdjustments**](InvoicesApi.md#getInvoiceAdjustments) | **GET** /invoice-adjustments | List invoice adjustments |
| [**getInvoiceAdjustmentsByContractId**](InvoicesApi.md#getInvoiceAdjustmentsByContractId) | **GET** /contracts/{contract_id}/invoice-adjustments | Invoice line items by contract |
| [**updateInvoiceAdjustment**](InvoicesApi.md#updateInvoiceAdjustment) | **PATCH** /invoice-adjustments/{id} | Update an invoice adjustment |
| [**updateInvoiceAdjustmentById**](InvoicesApi.md#updateInvoiceAdjustmentById) | **POST** /invoice-adjustments/{id}/reviews | Update an invoice adjustment |


<a id="createInvoiceAdjustment"></a>
# **createInvoiceAdjustment**
> CreateTimesheet201Response createInvoiceAdjustment(createInvoiceAdjustmentRequest).recurring(recurring).execute();

Create an invoice adjustment

Create an invoice adjustment using this endpoint. For example, you can add a bonus, commission, VAT %, deduction etc. to an invoice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

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

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    CreateInvoiceAdjustmentRequest createInvoiceAdjustmentRequest = new CreateInvoiceAdjustmentRequest(); // CreateInvoiceAdjustmentRequest | InvoiceAdjustment object that needs to be created
    String recurring = "true"; // String | Add this invoice adjustment as recurring
    try {
      CreateTimesheet201Response result = apiInstance.createInvoiceAdjustment(createInvoiceAdjustmentRequest)
            .recurring(recurring)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoiceAdjustment");
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
| **createInvoiceAdjustmentRequest** | [**CreateInvoiceAdjustmentRequest**](CreateInvoiceAdjustmentRequest.md)| InvoiceAdjustment object that needs to be created | |
| **recurring** | **String**| Add this invoice adjustment as recurring | [optional] |

### Return type

[**CreateTimesheet201Response**](CreateTimesheet201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createInvoiceAdjustmentReviews"></a>
# **createInvoiceAdjustmentReviews**
> GenericResultCreated createInvoiceAdjustmentReviews().invoiceAdjustmentReviewsToCreateContainer(invoiceAdjustmentReviewsToCreateContainer).execute();

Bulk review invoice adjustments

Review multiple invoice adjustments to approve or decline a batch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

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

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    InvoiceAdjustmentReviewsToCreateContainer invoiceAdjustmentReviewsToCreateContainer = new InvoiceAdjustmentReviewsToCreateContainer(); // InvoiceAdjustmentReviewsToCreateContainer | InvoiceAdjustment review objects that need to be created
    try {
      GenericResultCreated result = apiInstance.createInvoiceAdjustmentReviews()
            .invoiceAdjustmentReviewsToCreateContainer(invoiceAdjustmentReviewsToCreateContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoiceAdjustmentReviews");
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
| **invoiceAdjustmentReviewsToCreateContainer** | [**InvoiceAdjustmentReviewsToCreateContainer**](InvoiceAdjustmentReviewsToCreateContainer.md)| InvoiceAdjustment review objects that need to be created | [optional] |

### Return type

[**GenericResultCreated**](GenericResultCreated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getInvoiceAdjustments"></a>
# **getInvoiceAdjustments**
> GetInvoiceAdjustments200Response getInvoiceAdjustments().contractId(contractId).contractTypes(contractTypes).types(types).statuses(statuses).invoiceId(invoiceId).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

List invoice adjustments

Retrieve invoice adjustments. You can filter the list by providing additional parameters e.g. contract_id, contract_type etc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

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

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String contractId = "string"; // String | Id of an Deel contract.
    GetTimesheetsByContractContractTypesParameter contractTypes = new GetTimesheetsByContractContractTypesParameter(); // GetTimesheetsByContractContractTypesParameter | types of contracts to filter
    GetInvoiceAdjustmentsByContractIdTypesParameter types = new GetInvoiceAdjustmentsByContractIdTypesParameter(); // GetInvoiceAdjustmentsByContractIdTypesParameter | types of invoice adjustments to filter
    GetTimesheetsStatusesParameter statuses = new GetTimesheetsStatusesParameter(); // GetTimesheetsStatusesParameter | statuses of invoice adjustment to filter
    String invoiceId = "string"; // String | ID of an existing invoice
    UUID reporterId = UUID.fromString("string"); // UUID | ID of an existing profile
    LocalDate dateFrom = LocalDate.parse("2022-12-31"); // LocalDate | To get invoice adjustments submitted on or after given start date (inclusive). Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
    LocalDate dateTo = LocalDate.parse("2022-12-31"); // LocalDate | To get invoice adjustments submitted before given end date (excludes records submitted on this date). Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
    String limit = "limit_example"; // String | Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    String offset = "1"; // String | Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings
    try {
      GetInvoiceAdjustments200Response result = apiInstance.getInvoiceAdjustments()
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
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceAdjustments");
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
| **contractId** | **String**| Id of an Deel contract. | [optional] |
| **contractTypes** | [**GetTimesheetsByContractContractTypesParameter**](.md)| types of contracts to filter | [optional] |
| **types** | [**GetInvoiceAdjustmentsByContractIdTypesParameter**](.md)| types of invoice adjustments to filter | [optional] |
| **statuses** | [**GetTimesheetsStatusesParameter**](.md)| statuses of invoice adjustment to filter | [optional] |
| **invoiceId** | **String**| ID of an existing invoice | [optional] |
| **reporterId** | **UUID**| ID of an existing profile | [optional] |
| **dateFrom** | **LocalDate**| To get invoice adjustments submitted on or after given start date (inclusive). Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. | [optional] |
| **dateTo** | **LocalDate**| To get invoice adjustments submitted before given end date (excludes records submitted on this date). Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. | [optional] |
| **limit** | **String**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **offset** | **String**| Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings | [optional] |

### Return type

[**GetInvoiceAdjustments200Response**](GetInvoiceAdjustments200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getInvoiceAdjustmentsByContractId"></a>
# **getInvoiceAdjustmentsByContractId**
> GetInvoiceAdjustmentsByContractId200Response getInvoiceAdjustmentsByContractId(contractId).contractTypes(contractTypes).types(types).statuses(statuses).invoiceId(invoiceId).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

Invoice line items by contract

Retrieve invoice line items for a given contract id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

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

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    GetTimesheetsByContractContractTypesParameter contractTypes = new GetTimesheetsByContractContractTypesParameter(); // GetTimesheetsByContractContractTypesParameter | types of contracts to filter
    GetInvoiceAdjustmentsByContractIdTypesParameter types = new GetInvoiceAdjustmentsByContractIdTypesParameter(); // GetInvoiceAdjustmentsByContractIdTypesParameter | types of invoice adjustments to filter
    GetTimesheetsStatusesParameter statuses = new GetTimesheetsStatusesParameter(); // GetTimesheetsStatusesParameter | statuses of invoice adjustment to filter
    String invoiceId = "string"; // String | ID of an existing invoice
    UUID reporterId = UUID.fromString("string"); // UUID | ID of an existing profile
    LocalDate dateFrom = LocalDate.parse("2022-12-31"); // LocalDate | To get invoice adjustments submitted on or after given start date (inclusive).    Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
    LocalDate dateTo = LocalDate.parse("2022-12-31"); // LocalDate | To get invoice adjustments submitted before given end date (excludes records submitted on this date).    Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
    String limit = "10"; // String | Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    String offset = "10"; // String | Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings
    try {
      GetInvoiceAdjustmentsByContractId200Response result = apiInstance.getInvoiceAdjustmentsByContractId(contractId)
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
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoiceAdjustmentsByContractId");
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
| **contractId** | **String**| Deel contract id. | |
| **contractTypes** | [**GetTimesheetsByContractContractTypesParameter**](.md)| types of contracts to filter | [optional] |
| **types** | [**GetInvoiceAdjustmentsByContractIdTypesParameter**](.md)| types of invoice adjustments to filter | [optional] |
| **statuses** | [**GetTimesheetsStatusesParameter**](.md)| statuses of invoice adjustment to filter | [optional] |
| **invoiceId** | **String**| ID of an existing invoice | [optional] |
| **reporterId** | **UUID**| ID of an existing profile | [optional] |
| **dateFrom** | **LocalDate**| To get invoice adjustments submitted on or after given start date (inclusive).    Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. | [optional] |
| **dateTo** | **LocalDate**| To get invoice adjustments submitted before given end date (excludes records submitted on this date).    Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. | [optional] |
| **limit** | **String**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **offset** | **String**| Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings | [optional] |

### Return type

[**GetInvoiceAdjustmentsByContractId200Response**](GetInvoiceAdjustmentsByContractId200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateInvoiceAdjustment"></a>
# **updateInvoiceAdjustment**
> UpdateInvoiceAdjustment200Response updateInvoiceAdjustment(id, updateInvoiceAdjustmentRequest).execute();

Update an invoice adjustment

Update an invoice adjustment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

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

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String id = "123e4567-e89b-12d3-a456-426614174000"; // String | Invoice adjustment id.
    UpdateInvoiceAdjustmentRequest updateInvoiceAdjustmentRequest = new UpdateInvoiceAdjustmentRequest(); // UpdateInvoiceAdjustmentRequest | 
    try {
      UpdateInvoiceAdjustment200Response result = apiInstance.updateInvoiceAdjustment(id, updateInvoiceAdjustmentRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoiceAdjustment");
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
| **id** | **String**| Invoice adjustment id. | |
| **updateInvoiceAdjustmentRequest** | [**UpdateInvoiceAdjustmentRequest**](UpdateInvoiceAdjustmentRequest.md)|  | |

### Return type

[**UpdateInvoiceAdjustment200Response**](UpdateInvoiceAdjustment200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="updateInvoiceAdjustmentById"></a>
# **updateInvoiceAdjustmentById**
> UpdateAdjustment200Response updateInvoiceAdjustmentById(id, updateInvoiceAdjustmentByIdRequest).execute();

Update an invoice adjustment

Update an existing invoice adjustment. It is not possible to update VAT adjustments, we recommend you to delete the existing VAT adjust and create a new one.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesApi;

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

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String id = "5f4e3f3b-4b8b-4b1b-8e0b-1b1b1b1b1b1b"; // String | ID of an existing invoice adjustment.
    UpdateInvoiceAdjustmentByIdRequest updateInvoiceAdjustmentByIdRequest = new UpdateInvoiceAdjustmentByIdRequest(); // UpdateInvoiceAdjustmentByIdRequest | 
    try {
      UpdateAdjustment200Response result = apiInstance.updateInvoiceAdjustmentById(id, updateInvoiceAdjustmentByIdRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoiceAdjustmentById");
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
| **id** | **String**| ID of an existing invoice adjustment. | |
| **updateInvoiceAdjustmentByIdRequest** | [**UpdateInvoiceAdjustmentByIdRequest**](UpdateInvoiceAdjustmentByIdRequest.md)|  | |

### Return type

[**UpdateAdjustment200Response**](UpdateAdjustment200Response.md)

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
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

