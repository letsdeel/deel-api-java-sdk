# Class401KPlansApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cleanUpPlan**](Class401KPlansApi.md#cleanUpPlan) | **POST** /benefits/legal-entities/{id}/401k/plans/clean-up | Clean up plan for a given legal entity |
| [**createBenefitProviderIntegrationClient**](Class401KPlansApi.md#createBenefitProviderIntegrationClient) | **POST** /benefits/legal-entities/{id}/benefits/401k/activate | Activate the 401k integration for the legal entity |
| [**delete401kPlanDefinition**](Class401KPlansApi.md#delete401kPlanDefinition) | **DELETE** /benefits/legal-entities/{id}/401k/plans/{plan_id} | Delete a 401k plan |
| [**get401kPlansDefinition**](Class401KPlansApi.md#get401kPlansDefinition) | **GET** /benefits/legal-entities/{id}/401k/plans | Get 401k plans for legal entity |
| [**post401kPlansDefinition**](Class401KPlansApi.md#post401kPlansDefinition) | **POST** /benefits/legal-entities/{id}/401k/plans | Create 401k plan for legal entity |
| [**put401kPlansDefinition**](Class401KPlansApi.md#put401kPlansDefinition) | **PUT** /benefits/legal-entities/{id}/401k/plans/{plan_id} | Update 401k plan |


<a id="cleanUpPlan"></a>
# **cleanUpPlan**
> cleanUpPlan(id).execute();

Clean up plan for a given legal entity

Clean up plan for a given legal entity  **Token scopes**: &#x60;benefits:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Class401KPlansApi;

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

    Class401KPlansApi apiInstance = new Class401KPlansApi(defaultClient);
    String id = "9585241d-2387-4d80-abea-cea4dde4807d"; // String | Id from the legal entity to clean up
    try {
      apiInstance.cleanUpPlan(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling Class401KPlansApi#cleanUpPlan");
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
| **id** | **String**| Id from the legal entity to clean up | |

### Return type

null (empty response body)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation, no content returned. |  -  |

<a id="createBenefitProviderIntegrationClient"></a>
# **createBenefitProviderIntegrationClient**
> CreateBenefitProviderIntegrationClient200Response createBenefitProviderIntegrationClient(id).execute();

Activate the 401k integration for the legal entity

Activate the 401k integration for the legal entity  **Token scopes**: &#x60;benefits:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Class401KPlansApi;

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

    Class401KPlansApi apiInstance = new Class401KPlansApi(defaultClient);
    String id = "9585241d-2387-4d80-abea-cea4dde4807d"; // String | Id from the legal entity to activate 401k integration
    try {
      CreateBenefitProviderIntegrationClient200Response result = apiInstance.createBenefitProviderIntegrationClient(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class401KPlansApi#createBenefitProviderIntegrationClient");
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
| **id** | **String**| Id from the legal entity to activate 401k integration | |

### Return type

[**CreateBenefitProviderIntegrationClient200Response**](CreateBenefitProviderIntegrationClient200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="delete401kPlanDefinition"></a>
# **delete401kPlanDefinition**
> Object delete401kPlanDefinition(id, planId).execute();

Delete a 401k plan

Delete a 401k plan  **Token scopes**: &#x60;benefits:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Class401KPlansApi;

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

    Class401KPlansApi apiInstance = new Class401KPlansApi(defaultClient);
    String id = "5f4e1d1b-4b7b-4b7b-8b7b-4b7b4b7b4b7b"; // String | Legal entity id which plans belongs
    String planId = "5f4e1d1b-4b7b-4b7b-8b7b-4b7b4b7b4b7b"; // String | Plan id
    try {
      Object result = apiInstance.delete401kPlanDefinition(id, planId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class401KPlansApi#delete401kPlanDefinition");
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
| **id** | **String**| Legal entity id which plans belongs | |
| **planId** | **String**| Plan id | |

### Return type

**Object**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation. |  -  |

<a id="get401kPlansDefinition"></a>
# **get401kPlansDefinition**
> List&lt;Get401kPlansDefinition200ResponseInner&gt; get401kPlansDefinition(id).execute();

Get 401k plans for legal entity

Get 401k plans legal entity  **Token scopes**: &#x60;benefits:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Class401KPlansApi;

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

    Class401KPlansApi apiInstance = new Class401KPlansApi(defaultClient);
    String id = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | Id from the legal entity to fetch 401k plans
    try {
      List<Get401kPlansDefinition200ResponseInner> result = apiInstance.get401kPlansDefinition(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class401KPlansApi#get401kPlansDefinition");
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
| **id** | **String**| Id from the legal entity to fetch 401k plans | |

### Return type

[**List&lt;Get401kPlansDefinition200ResponseInner&gt;**](Get401kPlansDefinition200ResponseInner.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="post401kPlansDefinition"></a>
# **post401kPlansDefinition**
> Post401kPlansDefinition200Response post401kPlansDefinition(id, post401kPlansDefinitionRequest).execute();

Create 401k plan for legal entity

Create a new 401k plan for existing provider to legal entity  **Token scopes**: &#x60;benefits:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Class401KPlansApi;

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

    Class401KPlansApi apiInstance = new Class401KPlansApi(defaultClient);
    String id = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | Id from the legal entity to receive a new 401k plan
    Post401kPlansDefinitionRequest post401kPlansDefinitionRequest = new Post401kPlansDefinitionRequest(); // Post401kPlansDefinitionRequest | 
    try {
      Post401kPlansDefinition200Response result = apiInstance.post401kPlansDefinition(id, post401kPlansDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class401KPlansApi#post401kPlansDefinition");
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
| **id** | **String**| Id from the legal entity to receive a new 401k plan | |
| **post401kPlansDefinitionRequest** | [**Post401kPlansDefinitionRequest**](Post401kPlansDefinitionRequest.md)|  | |

### Return type

[**Post401kPlansDefinition200Response**](Post401kPlansDefinition200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="put401kPlansDefinition"></a>
# **put401kPlansDefinition**
> Put401kPlansDefinition200Response put401kPlansDefinition(id, planId, put401kPlansDefinitionRequest).execute();

Update 401k plan

Update 401k plan  **Token scopes**: &#x60;benefits:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Class401KPlansApi;

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

    Class401KPlansApi apiInstance = new Class401KPlansApi(defaultClient);
    String id = "9585241d-2387-4d80-abea-cea4dde4807d"; // String | Id from the legal entity to update a 401k plan
    String planId = "9585241d-2387-4d80-abea-cea4dde4807d"; // String | 401K plan id
    Put401kPlansDefinitionRequest put401kPlansDefinitionRequest = new Put401kPlansDefinitionRequest(); // Put401kPlansDefinitionRequest | 
    try {
      Put401kPlansDefinition200Response result = apiInstance.put401kPlansDefinition(id, planId, put401kPlansDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class401KPlansApi#put401kPlansDefinition");
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
| **id** | **String**| Id from the legal entity to update a 401k plan | |
| **planId** | **String**| 401K plan id | |
| **put401kPlansDefinitionRequest** | [**Put401kPlansDefinitionRequest**](Put401kPlansDefinitionRequest.md)|  | |

### Return type

[**Put401kPlansDefinition200Response**](Put401kPlansDefinition200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

