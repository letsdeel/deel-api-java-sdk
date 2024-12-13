# EmployeesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBenefitEmployee**](EmployeesApi.md#getBenefitEmployee) | **GET** /benefits/legal-entities/{id}/employees/{employee_id} | Get employee from organization integrated with external benefits vendor |
| [**getBenefitEmployees**](EmployeesApi.md#getBenefitEmployees) | **GET** /benefits/legal-entities/{id}/employees | Get employees from organization integrated with external benefits vendor |


<a id="getBenefitEmployee"></a>
# **getBenefitEmployee**
> GetBenefitEmployee200Response getBenefitEmployee(id, employeeId).activeContracts(activeContracts).execute();

Get employee from organization integrated with external benefits vendor

Get employee from organization integrated with external benefits vendor  **Token scopes**: &#x60;Users:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

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

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String id = "123456"; // String | Id from the legal entity to fetch data
    String employeeId = "123456"; // String | Employee id from the legal entity to fetch data
    Boolean activeContracts = true; // Boolean | Fetch only active contracts for employees
    try {
      GetBenefitEmployee200Response result = apiInstance.getBenefitEmployee(id, employeeId)
            .activeContracts(activeContracts)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getBenefitEmployee");
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
| **id** | **String**| Id from the legal entity to fetch data | |
| **employeeId** | **String**| Employee id from the legal entity to fetch data | |
| **activeContracts** | **Boolean**| Fetch only active contracts for employees | [optional] [default to true] |

### Return type

[**GetBenefitEmployee200Response**](GetBenefitEmployee200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="getBenefitEmployees"></a>
# **getBenefitEmployees**
> GetBenefitEmployees200Response getBenefitEmployees(id).activeContracts(activeContracts).itemsPerPage(itemsPerPage).offset(offset).execute();

Get employees from organization integrated with external benefits vendor

Get employees from organization integrated with external benefits vendor  **Token scopes**: &#x60;Users:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeesApi;

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

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String id = "123456"; // String | Id from the legal entity to fetch data
    Boolean activeContracts = true; // Boolean | Fetch only active contracts for employees
    Integer itemsPerPage = 100; // Integer | Items per page
    Integer offset = 0; // Integer | Items to be skipped when searching
    try {
      GetBenefitEmployees200Response result = apiInstance.getBenefitEmployees(id)
            .activeContracts(activeContracts)
            .itemsPerPage(itemsPerPage)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getBenefitEmployees");
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
| **id** | **String**| Id from the legal entity to fetch data | |
| **activeContracts** | **Boolean**| Fetch only active contracts for employees | [optional] [default to true] |
| **itemsPerPage** | **Integer**| Items per page | [optional] [default to 100] |
| **offset** | **Integer**| Items to be skipped when searching | [optional] [default to 0] |

### Return type

[**GetBenefitEmployees200Response**](GetBenefitEmployees200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

