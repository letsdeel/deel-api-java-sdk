# TimesheetsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTimesheet**](TimesheetsApi.md#createTimesheet) | **POST** /timesheets | Create a timesheet entry |
| [**createTimesheetReview**](TimesheetsApi.md#createTimesheetReview) | **POST** /timesheets/{id}/reviews | Review a single timesheet |
| [**createTimesheetReviews**](TimesheetsApi.md#createTimesheetReviews) | **POST** /timesheets/many/reviews | Review multiple timesheets |
| [**deleteTimesheetById**](TimesheetsApi.md#deleteTimesheetById) | **DELETE** /timesheets/{id} | Delete a timesheet entry |
| [**getTimesheetById**](TimesheetsApi.md#getTimesheetById) | **GET** /timesheets/{id} | Retrieve a single timesheet entry |
| [**getTimesheets**](TimesheetsApi.md#getTimesheets) | **GET** /timesheets | List of timesheets |
| [**getTimesheetsByContract**](TimesheetsApi.md#getTimesheetsByContract) | **GET** /contracts/{contract_id}/timesheets | List of timesheets by contract |
| [**updateTimesheetById**](TimesheetsApi.md#updateTimesheetById) | **PATCH** /timesheets/{id} | Update a timesheet entry |


<a id="createTimesheet"></a>
# **createTimesheet**
> CreateTimesheet201Response createTimesheet(createTimesheetRequest).execute();

Create a timesheet entry

Submit work for a contractor.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    CreateTimesheetRequest createTimesheetRequest = new CreateTimesheetRequest(); // CreateTimesheetRequest | Timesheet object that needs to be created
    try {
      CreateTimesheet201Response result = apiInstance.createTimesheet(createTimesheetRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#createTimesheet");
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
| **createTimesheetRequest** | [**CreateTimesheetRequest**](CreateTimesheetRequest.md)| Timesheet object that needs to be created | |

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

<a id="createTimesheetReview"></a>
# **createTimesheetReview**
> SignContract201Response createTimesheetReview(id, createTimesheetReviewRequest).execute();

Review a single timesheet

Review a timesheet to approve or decline submitted work.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    String id = "string"; // String | ID of an existing timesheet
    CreateTimesheetReviewRequest createTimesheetReviewRequest = new CreateTimesheetReviewRequest(); // CreateTimesheetReviewRequest | 
    try {
      SignContract201Response result = apiInstance.createTimesheetReview(id, createTimesheetReviewRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#createTimesheetReview");
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
| **id** | **String**| ID of an existing timesheet | |
| **createTimesheetReviewRequest** | [**CreateTimesheetReviewRequest**](CreateTimesheetReviewRequest.md)|  | |

### Return type

[**SignContract201Response**](SignContract201Response.md)

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

<a id="createTimesheetReviews"></a>
# **createTimesheetReviews**
> GenericResultCreated createTimesheetReviews().timesheetReviewsToCreateContainer(timesheetReviewsToCreateContainer).execute();

Review multiple timesheets

Review a batch of timesheets to approve or reject submitted work.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    TimesheetReviewsToCreateContainer timesheetReviewsToCreateContainer = new TimesheetReviewsToCreateContainer(); // TimesheetReviewsToCreateContainer | Timesheet review objects that need to be created
    try {
      GenericResultCreated result = apiInstance.createTimesheetReviews()
            .timesheetReviewsToCreateContainer(timesheetReviewsToCreateContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#createTimesheetReviews");
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
| **timesheetReviewsToCreateContainer** | [**TimesheetReviewsToCreateContainer**](TimesheetReviewsToCreateContainer.md)| Timesheet review objects that need to be created | [optional] |

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

<a id="deleteTimesheetById"></a>
# **deleteTimesheetById**
> UninviteToSignContract200Response deleteTimesheetById(id).reason(reason).execute();

Delete a timesheet entry

Delete a single timesheet entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    String id = "string"; // String | ID of an existing timesheet
    String reason = "string"; // String | Reason for deleting an existing task
    try {
      UninviteToSignContract200Response result = apiInstance.deleteTimesheetById(id)
            .reason(reason)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#deleteTimesheetById");
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
| **id** | **String**| ID of an existing timesheet | |
| **reason** | **String**| Reason for deleting an existing task | [optional] |

### Return type

[**UninviteToSignContract200Response**](UninviteToSignContract200Response.md)

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

<a id="getTimesheetById"></a>
# **getTimesheetById**
> GetTimesheetById200Response getTimesheetById(id).execute();

Retrieve a single timesheet entry

Retrieve a single timesheet entry by Id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    String id = "id_example"; // String | ID of an existing timesheet
    try {
      GetTimesheetById200Response result = apiInstance.getTimesheetById(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getTimesheetById");
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
| **id** | **String**| ID of an existing timesheet | |

### Return type

[**GetTimesheetById200Response**](GetTimesheetById200Response.md)

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

<a id="getTimesheets"></a>
# **getTimesheets**
> GetTimesheets200Response getTimesheets().contractId(contractId).contractTypes(contractTypes).statuses(statuses).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

List of timesheets

Retrieve a list of timesheets in your Deel account. You can filter the list by providing additional paramters e.g. contract_id, contract_type etc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    String contractId = "contractId_example"; // String | Id of an Deel contract.
    GetTimesheetsByContractContractTypesParameter contractTypes = new GetTimesheetsByContractContractTypesParameter(); // GetTimesheetsByContractContractTypesParameter | types of contracts to filter
    GetTimesheetsStatusesParameter statuses = new GetTimesheetsStatusesParameter(); // GetTimesheetsStatusesParameter | 
    UUID reporterId = UUID.randomUUID(); // UUID | 
    LocalDate dateFrom = LocalDate.now(); // LocalDate | 
    LocalDate dateTo = LocalDate.now(); // LocalDate | 
    String limit = "limit_example"; // String | 
    String offset = "offset_example"; // String | 
    try {
      GetTimesheets200Response result = apiInstance.getTimesheets()
            .contractId(contractId)
            .contractTypes(contractTypes)
            .statuses(statuses)
            .reporterId(reporterId)
            .dateFrom(dateFrom)
            .dateTo(dateTo)
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getTimesheets");
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
| **statuses** | [**GetTimesheetsStatusesParameter**](.md)|  | [optional] |
| **reporterId** | **UUID**|  | [optional] |
| **dateFrom** | **LocalDate**|  | [optional] |
| **dateTo** | **LocalDate**|  | [optional] |
| **limit** | **String**|  | [optional] |
| **offset** | **String**|  | [optional] |

### Return type

[**GetTimesheets200Response**](GetTimesheets200Response.md)

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

<a id="getTimesheetsByContract"></a>
# **getTimesheetsByContract**
> GetTimesheetsByContract200Response getTimesheetsByContract(contractId).contractTypes(contractTypes).statuses(statuses).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

List of timesheets by contract

Retrieve a list of timesheets found for a contract.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    String contractId = "c1e2e3l4"; // String | Deel contract id.
    GetTimesheetsByContractContractTypesParameter contractTypes = new GetTimesheetsByContractContractTypesParameter(); // GetTimesheetsByContractContractTypesParameter | Types of contracts to filter.
    GetTimesheetsByContractStatusesParameter statuses = new GetTimesheetsByContractStatusesParameter(); // GetTimesheetsByContractStatusesParameter | Statuses of timesheets to filter.
    UUID reporterId = UUID.fromString("e1x2a3m4p5l6e7"); // UUID | ID of an existing profile
    LocalDate dateFrom = LocalDate.parse("2022-12-31"); // LocalDate | Filtered results will include records created on or after the provided date. Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
    LocalDate dateTo = LocalDate.parse("2022-12-31"); // LocalDate | Filtered results will include records created before the provided date. Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
    String limit = "10"; // String | Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    String offset = "10"; // String | Return a page of results after given index of row
    try {
      GetTimesheetsByContract200Response result = apiInstance.getTimesheetsByContract(contractId)
            .contractTypes(contractTypes)
            .statuses(statuses)
            .reporterId(reporterId)
            .dateFrom(dateFrom)
            .dateTo(dateTo)
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getTimesheetsByContract");
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
| **contractTypes** | [**GetTimesheetsByContractContractTypesParameter**](.md)| Types of contracts to filter. | [optional] |
| **statuses** | [**GetTimesheetsByContractStatusesParameter**](.md)| Statuses of timesheets to filter. | [optional] |
| **reporterId** | **UUID**| ID of an existing profile | [optional] |
| **dateFrom** | **LocalDate**| Filtered results will include records created on or after the provided date. Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. | [optional] |
| **dateTo** | **LocalDate**| Filtered results will include records created before the provided date. Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. | [optional] |
| **limit** | **String**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **offset** | **String**| Return a page of results after given index of row | [optional] |

### Return type

[**GetTimesheetsByContract200Response**](GetTimesheetsByContract200Response.md)

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

<a id="updateTimesheetById"></a>
# **updateTimesheetById**
> GenericResultUpdated updateTimesheetById(id, updateTimesheetByIdRequest).execute();

Update a timesheet entry

Update a single timesheet entry.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimesheetsApi;

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

    TimesheetsApi apiInstance = new TimesheetsApi(defaultClient);
    String id = "id_example"; // String | ID of an existing timesheet.
    UpdateTimesheetByIdRequest updateTimesheetByIdRequest = new UpdateTimesheetByIdRequest(); // UpdateTimesheetByIdRequest | 
    try {
      GenericResultUpdated result = apiInstance.updateTimesheetById(id, updateTimesheetByIdRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#updateTimesheetById");
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
| **id** | **String**| ID of an existing timesheet. | |
| **updateTimesheetByIdRequest** | [**UpdateTimesheetByIdRequest**](UpdateTimesheetByIdRequest.md)|  | |

### Return type

[**GenericResultUpdated**](GenericResultUpdated.md)

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

