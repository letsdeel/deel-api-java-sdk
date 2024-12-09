# ManagersApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManager**](ManagersApi.md#createManager) | **POST** /managers | Create a Manager |
| [**getManagers**](ManagersApi.md#getManagers) | **GET** /managers | Retrieve List of Managers |


<a id="createManager"></a>
# **createManager**
> CreateManager201Response createManager(createManagerRequest).execute();

Create a Manager

Create a new manager for the organization by providing the required user details. This endpoint returns the newly created manager&#39;s information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagersApi;

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

    ManagersApi apiInstance = new ManagersApi(defaultClient);
    CreateManagerRequest createManagerRequest = new CreateManagerRequest(); // CreateManagerRequest | Details of the new manager to be created.
    try {
      CreateManager201Response result = apiInstance.createManager(createManagerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagersApi#createManager");
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
| **createManagerRequest** | [**CreateManagerRequest**](CreateManagerRequest.md)| Details of the new manager to be created. | |

### Return type

[**CreateManager201Response**](CreateManager201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Manager created successfully. |  -  |
| **400** | Invalid request. The input data did not meet the required validation rules. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **409** | Conflict. A manager with the provided email already exists. |  -  |
| **500** | Operation failed. |  -  |

<a id="getManagers"></a>
# **getManagers**
> GetManagers200Response getManagers().limit(limit).offset(offset).execute();

Retrieve List of Managers

Retrieve a list of all managers in the organization along with pagination details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagersApi;

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

    ManagersApi apiInstance = new ManagersApi(defaultClient);
    Integer limit = 10; // Integer | The number of records to return in the response.
    Integer offset = 0; // Integer | The offset or starting point for pagination.
    try {
      GetManagers200Response result = apiInstance.getManagers()
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagersApi#getManagers");
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
| **limit** | **Integer**| The number of records to return in the response. | [optional] |
| **offset** | **Integer**| The offset or starting point for pagination. | [optional] |

### Return type

[**GetManagers200Response**](GetManagers200Response.md)

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
| **409** | A matching profile already exists. |  -  |
| **500** | Operation failed. |  -  |

