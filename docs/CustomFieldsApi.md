# CustomFieldsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteContractCustomField**](CustomFieldsApi.md#deleteContractCustomField) | **DELETE** /contracts/{contract_id}/custom_fields/{id} | Delete Contract custom field by Id |
| [**deleteCustomFieldValueFromWorker**](CustomFieldsApi.md#deleteCustomFieldValueFromWorker) | **DELETE** /people/{worker_id}/custom_fields/{id} | Delete the custom field value from Worker by Id |
| [**getCustomFieldFromContractsById**](CustomFieldsApi.md#getCustomFieldFromContractsById) | **GET** /contracts/custom_fields/{id} | Get custom fields from contracts |
| [**getCustomFieldFromPeopleById**](CustomFieldsApi.md#getCustomFieldFromPeopleById) | **GET** /people/custom_fields/{id} | Get custom field from people by id |
| [**getCustomFieldValuesFromContract**](CustomFieldsApi.md#getCustomFieldValuesFromContract) | **GET** /contracts/{contract_id}/custom_fields | Retrieve custom fields for a contract |
| [**getCustomFieldValuesFromWorker**](CustomFieldsApi.md#getCustomFieldValuesFromWorker) | **GET** /people/{worker_id}/custom_fields | Retrieve custom fields for a worker |
| [**getCustomFieldsFromContracts**](CustomFieldsApi.md#getCustomFieldsFromContracts) | **GET** /contracts/custom_fields | List all custom fields |
| [**getCustomFieldsFromPeople**](CustomFieldsApi.md#getCustomFieldsFromPeople) | **GET** /people/custom_fields | List all custom fields |
| [**upsertCustomFieldValueFromContracts**](CustomFieldsApi.md#upsertCustomFieldValueFromContracts) | **PUT** /contracts/{contract_id}/custom_fields | Update custom field value |
| [**upsertCustomFieldValueFromWorker**](CustomFieldsApi.md#upsertCustomFieldValueFromWorker) | **PUT** /people/{worker_id}/custom_fields | Update custom field value |


<a id="deleteContractCustomField"></a>
# **deleteContractCustomField**
> deleteContractCustomField(id, contractId).execute();

Delete Contract custom field by Id

Removes the custom field value from the contract custom field.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    UUID id = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Custom field id.
    UUID contractId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Contract id.
    try {
      apiInstance.deleteContractCustomField(id, contractId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#deleteContractCustomField");
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
| **id** | **UUID**| Custom field id. | |
| **contractId** | **UUID**| Contract id. | |

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
| **204** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteCustomFieldValueFromWorker"></a>
# **deleteCustomFieldValueFromWorker**
> deleteCustomFieldValueFromWorker(id, workerId).execute();

Delete the custom field value from Worker by Id

Delete the custom field value from Worker by Id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    UUID id = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Custom field id.
    UUID workerId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Worker id.
    try {
      apiInstance.deleteCustomFieldValueFromWorker(id, workerId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#deleteCustomFieldValueFromWorker");
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
| **id** | **UUID**| Custom field id. | |
| **workerId** | **UUID**| Worker id. | |

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
| **204** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Not found |  -  |
| **500** | Operation failed. |  -  |

<a id="getCustomFieldFromContractsById"></a>
# **getCustomFieldFromContractsById**
> GetCustomFieldFromContractsById200Response getCustomFieldFromContractsById(id).execute();

Get custom fields from contracts

Get custom field from contract by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    UUID id = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Custom field id.
    try {
      GetCustomFieldFromContractsById200Response result = apiInstance.getCustomFieldFromContractsById(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getCustomFieldFromContractsById");
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
| **id** | **UUID**| Custom field id. | |

### Return type

[**GetCustomFieldFromContractsById200Response**](GetCustomFieldFromContractsById200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getCustomFieldFromPeopleById"></a>
# **getCustomFieldFromPeopleById**
> GetCustomFieldFromPeopleById200Response getCustomFieldFromPeopleById(id).execute();

Get custom field from people by id

Get custom field from people by id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    UUID id = UUID.fromString("f7b3b3b3-4b3b-4b3b-4b3b-4b3b4b3b4b3b"); // UUID | Custom field id.
    try {
      GetCustomFieldFromPeopleById200Response result = apiInstance.getCustomFieldFromPeopleById(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getCustomFieldFromPeopleById");
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
| **id** | **UUID**| Custom field id. | |

### Return type

[**GetCustomFieldFromPeopleById200Response**](GetCustomFieldFromPeopleById200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getCustomFieldValuesFromContract"></a>
# **getCustomFieldValuesFromContract**
> GetCustomFieldValuesFromWorker200Response getCustomFieldValuesFromContract(contractId).execute();

Retrieve custom fields for a contract

Retrieve custom fields for a contract.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    String contractId = "d290f1ee-6c54-4b01-90e6-d701748f0851"; // String | Contract Id
    try {
      GetCustomFieldValuesFromWorker200Response result = apiInstance.getCustomFieldValuesFromContract(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getCustomFieldValuesFromContract");
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
| **contractId** | **String**| Contract Id | |

### Return type

[**GetCustomFieldValuesFromWorker200Response**](GetCustomFieldValuesFromWorker200Response.md)

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
| **404** | Custom fields Not found |  -  |
| **500** | Operation failed. |  -  |

<a id="getCustomFieldValuesFromWorker"></a>
# **getCustomFieldValuesFromWorker**
> GetCustomFieldValuesFromWorker200Response getCustomFieldValuesFromWorker(workerId).execute();

Retrieve custom fields for a worker

Retrieve custom fields for a worker

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    UUID workerId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Worker id.
    try {
      GetCustomFieldValuesFromWorker200Response result = apiInstance.getCustomFieldValuesFromWorker(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getCustomFieldValuesFromWorker");
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
| **workerId** | **UUID**| Worker id. | |

### Return type

[**GetCustomFieldValuesFromWorker200Response**](GetCustomFieldValuesFromWorker200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getCustomFieldsFromContracts"></a>
# **getCustomFieldsFromContracts**
> GetCustomFieldsFromContracts200Response getCustomFieldsFromContracts().execute();

List all custom fields

Fetch all custom fields associated with contracts, providing additional data necessary for contract management.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    try {
      GetCustomFieldsFromContracts200Response result = apiInstance.getCustomFieldsFromContracts()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getCustomFieldsFromContracts");
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

[**GetCustomFieldsFromContracts200Response**](GetCustomFieldsFromContracts200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getCustomFieldsFromPeople"></a>
# **getCustomFieldsFromPeople**
> GetCustomFieldsFromPeople200Response getCustomFieldsFromPeople().execute();

List all custom fields

Fetch all custom fields associated with People records, offering additional personalized information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    try {
      GetCustomFieldsFromPeople200Response result = apiInstance.getCustomFieldsFromPeople()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getCustomFieldsFromPeople");
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

[**GetCustomFieldsFromPeople200Response**](GetCustomFieldsFromPeople200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="upsertCustomFieldValueFromContracts"></a>
# **upsertCustomFieldValueFromContracts**
> upsertCustomFieldValueFromContracts(contractId, upsertCustomFieldValueFromContractsRequest).execute();

Update custom field value

Update custom field value.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    UUID contractId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Contract id.
    UpsertCustomFieldValueFromContractsRequest upsertCustomFieldValueFromContractsRequest = new UpsertCustomFieldValueFromContractsRequest(); // UpsertCustomFieldValueFromContractsRequest | 
    try {
      apiInstance.upsertCustomFieldValueFromContracts(contractId, upsertCustomFieldValueFromContractsRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#upsertCustomFieldValueFromContracts");
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
| **contractId** | **UUID**| Contract id. | |
| **upsertCustomFieldValueFromContractsRequest** | [**UpsertCustomFieldValueFromContractsRequest**](UpsertCustomFieldValueFromContractsRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Not found |  -  |
| **500** | Operation failed. |  -  |

<a id="upsertCustomFieldValueFromWorker"></a>
# **upsertCustomFieldValueFromWorker**
> upsertCustomFieldValueFromWorker(workerId, upsertCustomFieldValueFromWorkerRequest).execute();

Update custom field value

Update custom field value.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomFieldsApi;

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

    CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
    UUID workerId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Worker id.
    UpsertCustomFieldValueFromWorkerRequest upsertCustomFieldValueFromWorkerRequest = new UpsertCustomFieldValueFromWorkerRequest(); // UpsertCustomFieldValueFromWorkerRequest | 
    try {
      apiInstance.upsertCustomFieldValueFromWorker(workerId, upsertCustomFieldValueFromWorkerRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#upsertCustomFieldValueFromWorker");
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
| **workerId** | **UUID**| Worker id. | |
| **upsertCustomFieldValueFromWorkerRequest** | [**UpsertCustomFieldValueFromWorkerRequest**](UpsertCustomFieldValueFromWorkerRequest.md)|  | |

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
| **200** | Successful response |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Not found |  -  |
| **500** | Operation failed. |  -  |

