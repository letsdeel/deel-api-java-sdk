# PeopleApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDirectEmployee**](PeopleApi.md#createDirectEmployee) | **POST** /people | Create a direct employee |
| [**createDirectEmployeeOldTobeRemoved**](PeopleApi.md#createDirectEmployeeOldTobeRemoved) | **POST** /hris/direct-employees-old-to-beremoved | Create a new Hris direct employee |
| [**getPeople**](PeopleApi.md#getPeople) | **GET** /people/me | Get my current personal profile |
| [**getPeopleById**](PeopleApi.md#getPeopleById) | **GET** /people/{worker_id} | Retrieve a single person |
| [**getPeopleList**](PeopleApi.md#getPeopleList) | **GET** /people | List of people |
| [**getPeoplePersonalInformationByExternalId**](PeopleApi.md#getPeoplePersonalInformationByExternalId) | **GET** /people/external/{worker_id}/personal | Get personal information by external id |
| [**getPeoplePersonalInformationById**](PeopleApi.md#getPeoplePersonalInformationById) | **GET** /people/{worker_id}/personal | Get personal information by id |
| [**updatePeopleDepartment**](PeopleApi.md#updatePeopleDepartment) | **PUT** /people/{id}/department | Update department |
| [**updatePeoplePersonalInformationByExternalId**](PeopleApi.md#updatePeoplePersonalInformationByExternalId) | **PATCH** /people/external/{worker_id}/personal | Update personal information by external id |
| [**updatePeoplePersonalInformationById**](PeopleApi.md#updatePeoplePersonalInformationById) | **PATCH** /people/{worker_id}/personal | Update personal information |
| [**updatePeopleWorkingLocation**](PeopleApi.md#updatePeopleWorkingLocation) | **PUT** /people/{id}/working-location | Update working location |


<a id="createDirectEmployee"></a>
# **createDirectEmployee**
> CreateDirectEmployee201Response createDirectEmployee(createDirectEmployeeRequest).execute();

Create a direct employee

Create employee hired under your own entity to Deel HR. Manage your employee through Deel and export a payroll report to your own providers.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    CreateDirectEmployeeRequest createDirectEmployeeRequest = new CreateDirectEmployeeRequest(); // CreateDirectEmployeeRequest | 
    try {
      CreateDirectEmployee201Response result = apiInstance.createDirectEmployee(createDirectEmployeeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createDirectEmployee");
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
| **createDirectEmployeeRequest** | [**CreateDirectEmployeeRequest**](CreateDirectEmployeeRequest.md)|  | |

### Return type

[**CreateDirectEmployee201Response**](CreateDirectEmployee201Response.md)

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
| **409** | A matching profile already exists |  -  |
| **500** | Operation failed. |  -  |

<a id="createDirectEmployeeOldTobeRemoved"></a>
# **createDirectEmployeeOldTobeRemoved**
> HrisDirectEmployeeContainer createDirectEmployeeOldTobeRemoved(hrisDirectEmployee).execute();

Create a new Hris direct employee

Create a new Hris direct employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    HrisDirectEmployee hrisDirectEmployee = new HrisDirectEmployee(); // HrisDirectEmployee | Hris direct employee object that will be created
    try {
      HrisDirectEmployeeContainer result = apiInstance.createDirectEmployeeOldTobeRemoved(hrisDirectEmployee)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createDirectEmployeeOldTobeRemoved");
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
| **hrisDirectEmployee** | [**HrisDirectEmployee**](HrisDirectEmployee.md)| Hris direct employee object that will be created | |

### Return type

[**HrisDirectEmployeeContainer**](HrisDirectEmployeeContainer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Hris direct employee object that was created or edited |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **409** | A matching profile already exists |  -  |
| **500** | Operation failed. |  -  |

<a id="getPeople"></a>
# **getPeople**
> GetPeople200Response getPeople().execute();

Get my current personal profile

Retrieve the current user&#39;s profile.  **Token scopes**: &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    try {
      GetPeople200Response result = apiInstance.getPeople()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPeople");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPeople200Response**](GetPeople200Response.md)

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

<a id="getPeopleById"></a>
# **getPeopleById**
> PeopleByIdContainer getPeopleById(workerId).execute();

Retrieve a single person

Retrieve a single person in your organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for a worker.
    try {
      PeopleByIdContainer result = apiInstance.getPeopleById(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPeopleById");
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

[**PeopleByIdContainer**](PeopleByIdContainer.md)

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

<a id="getPeopleList"></a>
# **getPeopleList**
> GetPeopleList200Response getPeopleList().offset(offset).limit(limit).search(search).sortBy(sortBy).sortOrder(sortOrder).hiringStatuses(hiringStatuses).execute();

List of people

Retrieve a list of People in your organization.  **Token scopes**: &#x60;people:read&#x60;, &#x60;Users:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Return a page of results with given number of records.
    BigDecimal limit = new BigDecimal(78); // BigDecimal | Return a page of results with given number of records.
    String search = "search_example"; // String | Include a contract if by name or contractor name contains given search term.
    String sortBy = "id"; // String | Sort people by given field name.
    String sortOrder = "asc"; // String | Order direction of results; ascending or descending.
    List<String> hiringStatuses = Arrays.asList(); // List<String> | Employee's current hiring status.
    try {
      GetPeopleList200Response result = apiInstance.getPeopleList()
            .offset(offset)
            .limit(limit)
            .search(search)
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .hiringStatuses(hiringStatuses)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPeopleList");
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
| **offset** | **BigDecimal**| Return a page of results with given number of records. | [optional] [default to 0] |
| **limit** | **BigDecimal**| Return a page of results with given number of records. | [optional] |
| **search** | **String**| Include a contract if by name or contractor name contains given search term. | [optional] |
| **sortBy** | **String**| Sort people by given field name. | [optional] [enum: id, first_name, last_name, full_name, email, country, birth_date, hiring_type, start_date, team, job_title, hiring_status, completion_date, direct_manager, direct_reports_count] |
| **sortOrder** | **String**| Order direction of results; ascending or descending. | [optional] [enum: asc, desc] |
| **hiringStatuses** | [**List&lt;String&gt;**](String.md)| Employee&#39;s current hiring status. | [optional] [enum: active, inactive, onboarding, offboarding] |

### Return type

[**GetPeopleList200Response**](GetPeopleList200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getPeoplePersonalInformationByExternalId"></a>
# **getPeoplePersonalInformationByExternalId**
> GetPeoplePersonalInformationByExternalId200Response getPeoplePersonalInformationByExternalId(workerId).execute();

Get personal information by external id

Get worker&#39;s personal information by using an external identifier.  **Token scopes**: &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    String workerId = "123456"; // String | Unique identifier for a worker (External ID).
    try {
      GetPeoplePersonalInformationByExternalId200Response result = apiInstance.getPeoplePersonalInformationByExternalId(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPeoplePersonalInformationByExternalId");
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
| **workerId** | **String**| Unique identifier for a worker (External ID). | |

### Return type

[**GetPeoplePersonalInformationByExternalId200Response**](GetPeoplePersonalInformationByExternalId200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getPeoplePersonalInformationById"></a>
# **getPeoplePersonalInformationById**
> GetPeoplePersonalInformationById200Response getPeoplePersonalInformationById(workerId).execute();

Get personal information by id

Get worker&#39;s personal information by using identifier.  **Token scopes**: &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    String workerId = "123456"; // String | Unique identifier for a worker (External ID).
    try {
      GetPeoplePersonalInformationById200Response result = apiInstance.getPeoplePersonalInformationById(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPeoplePersonalInformationById");
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
| **workerId** | **String**| Unique identifier for a worker (External ID). | |

### Return type

[**GetPeoplePersonalInformationById200Response**](GetPeoplePersonalInformationById200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updatePeopleDepartment"></a>
# **updatePeopleDepartment**
> UpdatePeopleDepartment200Response updatePeopleDepartment(id, updatePeopleDepartmentRequest).execute();

Update department

undefined  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | Hris profile ID
    UpdatePeopleDepartmentRequest updatePeopleDepartmentRequest = new UpdatePeopleDepartmentRequest(); // UpdatePeopleDepartmentRequest | 
    try {
      UpdatePeopleDepartment200Response result = apiInstance.updatePeopleDepartment(id, updatePeopleDepartmentRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updatePeopleDepartment");
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
| **id** | **String**| Hris profile ID | |
| **updatePeopleDepartmentRequest** | [**UpdatePeopleDepartmentRequest**](UpdatePeopleDepartmentRequest.md)|  | |

### Return type

[**UpdatePeopleDepartment200Response**](UpdatePeopleDepartment200Response.md)

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
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updatePeoplePersonalInformationByExternalId"></a>
# **updatePeoplePersonalInformationByExternalId**
> updatePeoplePersonalInformationByExternalId(workerId).updatePeoplePersonalInformationByExternalIdRequest(updatePeoplePersonalInformationByExternalIdRequest).execute();

Update personal information by external id

Update worker&#39;s personal information by using an external identifier.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    String workerId = "96768afd-cdbd-4941-be60-dc70be36983d"; // String | Unique identifier for a worker (External ID).
    UpdatePeoplePersonalInformationByExternalIdRequest updatePeoplePersonalInformationByExternalIdRequest = new UpdatePeoplePersonalInformationByExternalIdRequest(); // UpdatePeoplePersonalInformationByExternalIdRequest | 
    try {
      apiInstance.updatePeoplePersonalInformationByExternalId(workerId)
            .updatePeoplePersonalInformationByExternalIdRequest(updatePeoplePersonalInformationByExternalIdRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updatePeoplePersonalInformationByExternalId");
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
| **workerId** | **String**| Unique identifier for a worker (External ID). | |
| **updatePeoplePersonalInformationByExternalIdRequest** | [**UpdatePeoplePersonalInformationByExternalIdRequest**](UpdatePeoplePersonalInformationByExternalIdRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updatePeoplePersonalInformationById"></a>
# **updatePeoplePersonalInformationById**
> updatePeoplePersonalInformationById(workerId).updatePeoplePersonalInformationByIdRequest(updatePeoplePersonalInformationByIdRequest).execute();

Update personal information

Update worker&#39;s personal information.  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    UUID workerId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Unique identifier for a worker.
    UpdatePeoplePersonalInformationByIdRequest updatePeoplePersonalInformationByIdRequest = new UpdatePeoplePersonalInformationByIdRequest(); // UpdatePeoplePersonalInformationByIdRequest | 
    try {
      apiInstance.updatePeoplePersonalInformationById(workerId)
            .updatePeoplePersonalInformationByIdRequest(updatePeoplePersonalInformationByIdRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updatePeoplePersonalInformationById");
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
| **workerId** | **UUID**| Unique identifier for a worker. | |
| **updatePeoplePersonalInformationByIdRequest** | [**UpdatePeoplePersonalInformationByIdRequest**](UpdatePeoplePersonalInformationByIdRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updatePeopleWorkingLocation"></a>
# **updatePeopleWorkingLocation**
> UpdatePeopleDepartment200Response updatePeopleWorkingLocation(id, updatePeopleWorkingLocationRequest).execute();

Update working location

undefined  **Token scopes**: &#x60;people:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

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

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    String id = "d290f1ee-6c54-4b01-90e6-d701748f0851"; // String | Hris profile ID
    UpdatePeopleWorkingLocationRequest updatePeopleWorkingLocationRequest = new UpdatePeopleWorkingLocationRequest(); // UpdatePeopleWorkingLocationRequest | 
    try {
      UpdatePeopleDepartment200Response result = apiInstance.updatePeopleWorkingLocation(id, updatePeopleWorkingLocationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updatePeopleWorkingLocation");
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
| **id** | **String**| Hris profile ID | |
| **updatePeopleWorkingLocationRequest** | [**UpdatePeopleWorkingLocationRequest**](UpdatePeopleWorkingLocationRequest.md)|  | |

### Return type

[**UpdatePeopleDepartment200Response**](UpdatePeopleDepartment200Response.md)

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
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

