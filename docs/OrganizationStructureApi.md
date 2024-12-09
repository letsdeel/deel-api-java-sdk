# OrganizationStructureApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrgStructure**](OrganizationStructureApi.md#createOrgStructure) | **POST** /hris/organization_structures | Create a new HRIS Organization Structure. |
| [**deleteOrgStructure**](OrganizationStructureApi.md#deleteOrgStructure) | **DELETE** /hris/organization_structures/{hrisOrgStr_id} | Delete an Org Structure from the Organization |
| [**deleteOrgStructureByExternalId**](OrganizationStructureApi.md#deleteOrgStructureByExternalId) | **DELETE** /hris/organization_structures/external/{external_id} | Delete an Org Structure from the Organization by external ID |
| [**getAllOrgStructures**](OrganizationStructureApi.md#getAllOrgStructures) | **GET** /hris/organization_structures | Fetch all Org Structures from the Organization. |
| [**getOrgStructure**](OrganizationStructureApi.md#getOrgStructure) | **GET** /hris/organization_structures/{hrisOrgStr_id} | Fetch an Org Structure from the Organization |
| [**getOrgStructureByExternalId**](OrganizationStructureApi.md#getOrgStructureByExternalId) | **GET** /hris/organization_structures/external/{external_id} | Fetch an Org Structure from the Organization |
| [**updateOrgStructure**](OrganizationStructureApi.md#updateOrgStructure) | **PATCH** /hris/organization_structures/{hrisOrgStr_id} | Update an existing HRIS Org Structure |
| [**updateOrgStructureByExternalId**](OrganizationStructureApi.md#updateOrgStructureByExternalId) | **PATCH** /hris/organization_structures/external/{external_id} | Update an existing HRIS Org Structure by external ID |


<a id="createOrgStructure"></a>
# **createOrgStructure**
> CreateOrgStructure200Response createOrgStructure(createOrgStructureRequest).execute();

Create a new HRIS Organization Structure.

Create a new HRIS Organization Structure.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    CreateOrgStructureRequest createOrgStructureRequest = new CreateOrgStructureRequest(); // CreateOrgStructureRequest | 
    try {
      CreateOrgStructure200Response result = apiInstance.createOrgStructure(createOrgStructureRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#createOrgStructure");
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
| **createOrgStructureRequest** | [**CreateOrgStructureRequest**](CreateOrgStructureRequest.md)|  | |

### Return type

[**CreateOrgStructure200Response**](CreateOrgStructure200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteOrgStructure"></a>
# **deleteOrgStructure**
> deleteOrgStructure(hrisOrgStrId).execute();

Delete an Org Structure from the Organization

Delete an Org Structure from the Organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    String hrisOrgStrId = "5f7b1b1b-1b1b-1b1b-1b1b-1b1b1b1b1b1b"; // String | Org Structure
    try {
      apiInstance.deleteOrgStructure(hrisOrgStrId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#deleteOrgStructure");
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
| **hrisOrgStrId** | **String**| Org Structure | |

### Return type

null (empty response body)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteOrgStructureByExternalId"></a>
# **deleteOrgStructureByExternalId**
> deleteOrgStructureByExternalId(externalId).execute();

Delete an Org Structure from the Organization by external ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    String externalId = "123456"; // String | External ID
    try {
      apiInstance.deleteOrgStructureByExternalId(externalId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#deleteOrgStructureByExternalId");
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
| **externalId** | **String**| External ID | |

### Return type

null (empty response body)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getAllOrgStructures"></a>
# **getAllOrgStructures**
> GetAllOrgStructures200Response getAllOrgStructures().execute();

Fetch all Org Structures from the Organization.

Fetch all Org Structures from the Organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    try {
      GetAllOrgStructures200Response result = apiInstance.getAllOrgStructures()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#getAllOrgStructures");
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

[**GetAllOrgStructures200Response**](GetAllOrgStructures200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getOrgStructure"></a>
# **getOrgStructure**
> GetOrgStructure200Response getOrgStructure(hrisOrgStrId).execute();

Fetch an Org Structure from the Organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    String hrisOrgStrId = "d290f1ee-6c54-4b01-90e6-d701748f0851"; // String | HRIS Organization Structure ID
    try {
      GetOrgStructure200Response result = apiInstance.getOrgStructure(hrisOrgStrId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#getOrgStructure");
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
| **hrisOrgStrId** | **String**| HRIS Organization Structure ID | |

### Return type

[**GetOrgStructure200Response**](GetOrgStructure200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getOrgStructureByExternalId"></a>
# **getOrgStructureByExternalId**
> GetOrgStructureByExternalId200Response getOrgStructureByExternalId(externalId).execute();

Fetch an Org Structure from the Organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    String externalId = "rkkej3"; // String | External ID
    try {
      GetOrgStructureByExternalId200Response result = apiInstance.getOrgStructureByExternalId(externalId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#getOrgStructureByExternalId");
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
| **externalId** | **String**| External ID | |

### Return type

[**GetOrgStructureByExternalId200Response**](GetOrgStructureByExternalId200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateOrgStructure"></a>
# **updateOrgStructure**
> updateOrgStructure(hrisOrgStrId, updateOrgStructureRequest).execute();

Update an existing HRIS Org Structure

Update an existing HRIS Org Structure

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    String hrisOrgStrId = "1131a5a9-1fbb-4b58-87f6-d8798e6f0b9e"; // String | Org Structure
    UpdateOrgStructureRequest updateOrgStructureRequest = new UpdateOrgStructureRequest(); // UpdateOrgStructureRequest | 
    try {
      apiInstance.updateOrgStructure(hrisOrgStrId, updateOrgStructureRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#updateOrgStructure");
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
| **hrisOrgStrId** | **String**| Org Structure | |
| **updateOrgStructureRequest** | [**UpdateOrgStructureRequest**](UpdateOrgStructureRequest.md)|  | |

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
| **200** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateOrgStructureByExternalId"></a>
# **updateOrgStructureByExternalId**
> updateOrgStructureByExternalId(externalId, updateOrgStructureByExternalIdRequest).execute();

Update an existing HRIS Org Structure by external ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationStructureApi;

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

    OrganizationStructureApi apiInstance = new OrganizationStructureApi(defaultClient);
    String externalId = "123456"; // String | External ID
    UpdateOrgStructureByExternalIdRequest updateOrgStructureByExternalIdRequest = new UpdateOrgStructureByExternalIdRequest(); // UpdateOrgStructureByExternalIdRequest | 
    try {
      apiInstance.updateOrgStructureByExternalId(externalId, updateOrgStructureByExternalIdRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationStructureApi#updateOrgStructureByExternalId");
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
| **externalId** | **String**| External ID | |
| **updateOrgStructureByExternalIdRequest** | [**UpdateOrgStructureByExternalIdRequest**](UpdateOrgStructureByExternalIdRequest.md)|  | |

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
| **200** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

