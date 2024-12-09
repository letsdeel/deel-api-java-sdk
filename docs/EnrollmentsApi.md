# EnrollmentsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete401kEnrollmentsDefinition**](EnrollmentsApi.md#delete401kEnrollmentsDefinition) | **DELETE** /benefits/legal-entities/{id}/contracts/{contract_id}/plans/{plan_id} | Delete enrollment settings from an employee in a 401k plan |
| [**get401kEnrollmentsDefinition**](EnrollmentsApi.md#get401kEnrollmentsDefinition) | **GET** /benefits/legal-entities/{id}/contracts/{contract_id}/plans/{plan_id} | Get enrollment settings from an employee in a 401k plan |
| [**post401kEnrollmentsDefinition**](EnrollmentsApi.md#post401kEnrollmentsDefinition) | **POST** /benefits/legal-entities/{id}/contracts/{contract_id}/plans/{plan_id} | Enroll an employee in a 401k plan |
| [**put401kEnrollmentsDefinition**](EnrollmentsApi.md#put401kEnrollmentsDefinition) | **PUT** /benefits/legal-entities/{id}/contracts/{contract_id}/plans/{plan_id} | Change enrollment settings from an employee in a 401k plan |


<a id="delete401kEnrollmentsDefinition"></a>
# **delete401kEnrollmentsDefinition**
> Object delete401kEnrollmentsDefinition(id, contractId, planId, delete401kEnrollmentsDefinitionRequest).execute();

Delete enrollment settings from an employee in a 401k plan

Delete enrollment settings from an employee in a 401k plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

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

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    String id = "k3ffoew1"; // String | Legal entity id which employee/contract belongs
    String contractId = "3x4kkf4"; // String | Contract id from the employee
    String planId = "4imf42o"; // String | Plan id to enroll the employee into
    Delete401kEnrollmentsDefinitionRequest delete401kEnrollmentsDefinitionRequest = new Delete401kEnrollmentsDefinitionRequest(); // Delete401kEnrollmentsDefinitionRequest | 
    try {
      Object result = apiInstance.delete401kEnrollmentsDefinition(id, contractId, planId, delete401kEnrollmentsDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#delete401kEnrollmentsDefinition");
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
| **id** | **String**| Legal entity id which employee/contract belongs | |
| **contractId** | **String**| Contract id from the employee | |
| **planId** | **String**| Plan id to enroll the employee into | |
| **delete401kEnrollmentsDefinitionRequest** | [**Delete401kEnrollmentsDefinitionRequest**](Delete401kEnrollmentsDefinitionRequest.md)|  | |

### Return type

**Object**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation. |  -  |

<a id="get401kEnrollmentsDefinition"></a>
# **get401kEnrollmentsDefinition**
> List&lt;Get401kEnrollmentsDefinition200ResponseInner&gt; get401kEnrollmentsDefinition(id, contractId, planId).execute();

Get enrollment settings from an employee in a 401k plan

Get enrollment settings from an employee in a 401k plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

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

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    String id = "5f4e1d1b-4b7b-4b7b-8b7b-4b7b4b7b4b7b"; // String | Legal entity id which employee/contract belongs
    String contractId = "5f4e1d1b-4b7b-4b7b-8b7b-4b7b4b7b4b7b"; // String | Contract id from the employee
    String planId = "5f4e1d1b-4b7b-4b7b-8b7b-4b7b4b7b4b7b"; // String | Plan id to enroll the employee into
    try {
      List<Get401kEnrollmentsDefinition200ResponseInner> result = apiInstance.get401kEnrollmentsDefinition(id, contractId, planId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#get401kEnrollmentsDefinition");
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
| **id** | **String**| Legal entity id which employee/contract belongs | |
| **contractId** | **String**| Contract id from the employee | |
| **planId** | **String**| Plan id to enroll the employee into | |

### Return type

[**List&lt;Get401kEnrollmentsDefinition200ResponseInner&gt;**](Get401kEnrollmentsDefinition200ResponseInner.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="post401kEnrollmentsDefinition"></a>
# **post401kEnrollmentsDefinition**
> Post401kEnrollmentsDefinition200Response post401kEnrollmentsDefinition(id, contractId, planId, post401kEnrollmentsDefinitionRequest).execute();

Enroll an employee in a 401k plan

Enroll an employee in a 401k plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

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

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    String id = "fjej33"; // String | Legal entity id which employee/contract belongs
    String contractId = "3xkrzj"; // String | Contract id from the employee
    String planId = "o449sm"; // String | Plan id to enroll the employee into
    Post401kEnrollmentsDefinitionRequest post401kEnrollmentsDefinitionRequest = new Post401kEnrollmentsDefinitionRequest(); // Post401kEnrollmentsDefinitionRequest | 
    try {
      Post401kEnrollmentsDefinition200Response result = apiInstance.post401kEnrollmentsDefinition(id, contractId, planId, post401kEnrollmentsDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#post401kEnrollmentsDefinition");
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
| **id** | **String**| Legal entity id which employee/contract belongs | |
| **contractId** | **String**| Contract id from the employee | |
| **planId** | **String**| Plan id to enroll the employee into | |
| **post401kEnrollmentsDefinitionRequest** | [**Post401kEnrollmentsDefinitionRequest**](Post401kEnrollmentsDefinitionRequest.md)|  | |

### Return type

[**Post401kEnrollmentsDefinition200Response**](Post401kEnrollmentsDefinition200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="put401kEnrollmentsDefinition"></a>
# **put401kEnrollmentsDefinition**
> Put401kEnrollmentsDefinition200Response put401kEnrollmentsDefinition(id, contractId, planId, put401kEnrollmentsDefinitionRequest).execute();

Change enrollment settings from an employee in a 401k plan

Change enrollment settings from an employee in a 401k plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnrollmentsApi;

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

    EnrollmentsApi apiInstance = new EnrollmentsApi(defaultClient);
    String id = "123456"; // String | Legal entity id which employee/contract belongs
    String contractId = "123456"; // String | Contract id from the employee
    String planId = "123456"; // String | Plan id to enroll the employee into
    Put401kEnrollmentsDefinitionRequest put401kEnrollmentsDefinitionRequest = new Put401kEnrollmentsDefinitionRequest(); // Put401kEnrollmentsDefinitionRequest | 
    try {
      Put401kEnrollmentsDefinition200Response result = apiInstance.put401kEnrollmentsDefinition(id, contractId, planId, put401kEnrollmentsDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentsApi#put401kEnrollmentsDefinition");
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
| **id** | **String**| Legal entity id which employee/contract belongs | |
| **contractId** | **String**| Contract id from the employee | |
| **planId** | **String**| Plan id to enroll the employee into | |
| **put401kEnrollmentsDefinitionRequest** | [**Put401kEnrollmentsDefinitionRequest**](Put401kEnrollmentsDefinitionRequest.md)|  | |

### Return type

[**Put401kEnrollmentsDefinition200Response**](Put401kEnrollmentsDefinition200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

