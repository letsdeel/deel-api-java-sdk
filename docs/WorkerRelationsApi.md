# WorkerRelationsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrUpdateChildRelationBetweenProfiles**](WorkerRelationsApi.md#createOrUpdateChildRelationBetweenProfiles) | **PUT** /hris/worker_relations/profile/external/{hrisProfileExternalId}/child | Create child worker relation with external Id |
| [**createOrUpdateParentRelationBetweenProfiles**](WorkerRelationsApi.md#createOrUpdateParentRelationBetweenProfiles) | **PUT** /hris/worker_relations/profile/external/{hrisProfileExternalId}/parent | Create a parent worker relation with external id |
| [**createWorkerRelation**](WorkerRelationsApi.md#createWorkerRelation) | **POST** /hris/worker_relations/profile | Create a worker relation |
| [**createWorkerRelationExternalId**](WorkerRelationsApi.md#createWorkerRelationExternalId) | **POST** /hris/worker_relations/profile/external | Create worker relation with external Ids |
| [**createWorkerRelationType**](WorkerRelationsApi.md#createWorkerRelationType) | **POST** /hris/worker_relations/types | Create worker relation type |
| [**deleteWorkerRelation**](WorkerRelationsApi.md#deleteWorkerRelation) | **DELETE** /hris/worker_relations/profile/{hrisProfileOid} | Delete a worker relation |
| [**deleteWorkerRelationExternalId**](WorkerRelationsApi.md#deleteWorkerRelationExternalId) | **DELETE** /hris/worker_relations/profile/external/{profileId} | Delete a worker relation by external id |
| [**deleteWorkerRelationType**](WorkerRelationsApi.md#deleteWorkerRelationType) | **DELETE** /hris/worker_relations/types/{typeId} | Delete a worker relation type |
| [**deleteWorkerRelationTypeExternalId**](WorkerRelationsApi.md#deleteWorkerRelationTypeExternalId) | **DELETE** /hris/worker_relations/types/external/{externalId} | Delete a worker relation type by external id |
| [**getAllProfileWorkerRelations**](WorkerRelationsApi.md#getAllProfileWorkerRelations) | **GET** /hris/worker_relations/profile/{hrisProfileOid} | List of worker relations |
| [**getAllProfileWorkerRelationsExternalId**](WorkerRelationsApi.md#getAllProfileWorkerRelationsExternalId) | **GET** /hris/worker_relations/profile/external/{profileId} | Fetch Worker Relations of a given HrisProfile by external id |
| [**getAllWorkerRelationTypes**](WorkerRelationsApi.md#getAllWorkerRelationTypes) | **GET** /hris/worker_relations/types | Retrieve all worker relation types |
| [**updateWorkerRelationType**](WorkerRelationsApi.md#updateWorkerRelationType) | **PATCH** /hris/worker_relations/types/{typeId} | Update a worker relation type |
| [**updateWorkerRelationTypeExternalId**](WorkerRelationsApi.md#updateWorkerRelationTypeExternalId) | **PATCH** /hris/worker_relations/types/external/{externalId} | Update a worker relation type by external id |
| [**upsertChildWorkerRelations**](WorkerRelationsApi.md#upsertChildWorkerRelations) | **PUT** /hris/worker_relations/profile/{hrisProfileOid}/child | Create child worker relation |
| [**upsertChildWorkerRelationsExternalId**](WorkerRelationsApi.md#upsertChildWorkerRelationsExternalId) | **PUT** /hris/worker_relations/profile/external/{profileId}/child | Create child worker relation with external Id |
| [**upsertParentWorkerRelations**](WorkerRelationsApi.md#upsertParentWorkerRelations) | **PUT** /hris/worker_relations/profile/{hrisProfileOid}/parent | Create a parent worker relation |


<a id="createOrUpdateChildRelationBetweenProfiles"></a>
# **createOrUpdateChildRelationBetweenProfiles**
> createOrUpdateChildRelationBetweenProfiles(hrisProfileExternalId, createOrUpdateChildRelationBetweenProfilesRequest).execute();

Create child worker relation with external Id

Create child worker relation with external Id.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    String hrisProfileExternalId = "8a7fbb1c-0cdb-4edd-98f8-9fffcc4b78d8"; // String | External Profile id
    CreateOrUpdateChildRelationBetweenProfilesRequest createOrUpdateChildRelationBetweenProfilesRequest = new CreateOrUpdateChildRelationBetweenProfilesRequest(); // CreateOrUpdateChildRelationBetweenProfilesRequest | 
    try {
      apiInstance.createOrUpdateChildRelationBetweenProfiles(hrisProfileExternalId, createOrUpdateChildRelationBetweenProfilesRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#createOrUpdateChildRelationBetweenProfiles");
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
| **hrisProfileExternalId** | **String**| External Profile id | |
| **createOrUpdateChildRelationBetweenProfilesRequest** | [**CreateOrUpdateChildRelationBetweenProfilesRequest**](CreateOrUpdateChildRelationBetweenProfilesRequest.md)|  | |

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
| **204** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createOrUpdateParentRelationBetweenProfiles"></a>
# **createOrUpdateParentRelationBetweenProfiles**
> createOrUpdateParentRelationBetweenProfiles(hrisProfileExternalId, createOrUpdateParentRelationBetweenProfilesRequest).execute();

Create a parent worker relation with external id

Create a parent worker relation with external id.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    UUID hrisProfileExternalId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | HRISProfile public id
    CreateOrUpdateParentRelationBetweenProfilesRequest createOrUpdateParentRelationBetweenProfilesRequest = new CreateOrUpdateParentRelationBetweenProfilesRequest(); // CreateOrUpdateParentRelationBetweenProfilesRequest | 
    try {
      apiInstance.createOrUpdateParentRelationBetweenProfiles(hrisProfileExternalId, createOrUpdateParentRelationBetweenProfilesRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#createOrUpdateParentRelationBetweenProfiles");
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
| **hrisProfileExternalId** | **UUID**| HRISProfile public id | |
| **createOrUpdateParentRelationBetweenProfilesRequest** | [**CreateOrUpdateParentRelationBetweenProfilesRequest**](CreateOrUpdateParentRelationBetweenProfilesRequest.md)|  | |

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
| **204** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createWorkerRelation"></a>
# **createWorkerRelation**
> createWorkerRelation(createWorkerRelationRequest).execute();

Create a worker relation

Create a hierarchical relation between a worker and its subordinates.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    CreateWorkerRelationRequest createWorkerRelationRequest = new CreateWorkerRelationRequest(); // CreateWorkerRelationRequest | 
    try {
      apiInstance.createWorkerRelation(createWorkerRelationRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#createWorkerRelation");
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
| **createWorkerRelationRequest** | [**CreateWorkerRelationRequest**](CreateWorkerRelationRequest.md)|  | |

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
| **201** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createWorkerRelationExternalId"></a>
# **createWorkerRelationExternalId**
> createWorkerRelationExternalId(createWorkerRelationExternalIdRequest).execute();

Create worker relation with external Ids

Create a hierarchical relation between a worker and its subordinates using external IDs to identify them.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    CreateWorkerRelationExternalIdRequest createWorkerRelationExternalIdRequest = new CreateWorkerRelationExternalIdRequest(); // CreateWorkerRelationExternalIdRequest | 
    try {
      apiInstance.createWorkerRelationExternalId(createWorkerRelationExternalIdRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#createWorkerRelationExternalId");
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
| **createWorkerRelationExternalIdRequest** | [**CreateWorkerRelationExternalIdRequest**](CreateWorkerRelationExternalIdRequest.md)|  | |

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
| **201** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createWorkerRelationType"></a>
# **createWorkerRelationType**
> CreateWorkerRelationType201Response createWorkerRelationType(createWorkerRelationTypeRequest).execute();

Create worker relation type

Create worker relation type.  **Token scopes**: &#x60;organizations:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    CreateWorkerRelationTypeRequest createWorkerRelationTypeRequest = new CreateWorkerRelationTypeRequest(); // CreateWorkerRelationTypeRequest | 
    try {
      CreateWorkerRelationType201Response result = apiInstance.createWorkerRelationType(createWorkerRelationTypeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#createWorkerRelationType");
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
| **createWorkerRelationTypeRequest** | [**CreateWorkerRelationTypeRequest**](CreateWorkerRelationTypeRequest.md)|  | |

### Return type

[**CreateWorkerRelationType201Response**](CreateWorkerRelationType201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteWorkerRelation"></a>
# **deleteWorkerRelation**
> deleteWorkerRelation(hrisProfileOid).execute();

Delete a worker relation

Delete a worker relation.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    UUID hrisProfileOid = UUID.fromString("c5d1b0e1-1f2b-4f6d-9b5f-2b0d7b3dcb6d"); // UUID | Worker Relation ID
    try {
      apiInstance.deleteWorkerRelation(hrisProfileOid)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#deleteWorkerRelation");
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
| **hrisProfileOid** | **UUID**| Worker Relation ID | |

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
| **204** | Successfully deleted |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteWorkerRelationExternalId"></a>
# **deleteWorkerRelationExternalId**
> deleteWorkerRelationExternalId(profileId).execute();

Delete a worker relation by external id

Delete a worker relation by external id.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    String profileId = "d290f1ee-6c54-4b01-90e6-d701748f0851"; // String | Worker Relation external ID
    try {
      apiInstance.deleteWorkerRelationExternalId(profileId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#deleteWorkerRelationExternalId");
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
| **profileId** | **String**| Worker Relation external ID | |

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
| **204** | Successfully deleted |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteWorkerRelationType"></a>
# **deleteWorkerRelationType**
> deleteWorkerRelationType(typeId).execute();

Delete a worker relation type

Delete a worker relation type.  **Token scopes**: &#x60;organizations:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    UUID typeId = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Worker Relation Type ID
    try {
      apiInstance.deleteWorkerRelationType(typeId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#deleteWorkerRelationType");
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
| **typeId** | **UUID**| Worker Relation Type ID | |

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
| **204** | Successfully deleted |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteWorkerRelationTypeExternalId"></a>
# **deleteWorkerRelationTypeExternalId**
> deleteWorkerRelationTypeExternalId(externalId).execute();

Delete a worker relation type by external id

Delete a Worker Relation Type by the external ID.  **Token scopes**: &#x60;organizations:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    String externalId = "WRT-0001"; // String | Worker Relation Type external ID
    try {
      apiInstance.deleteWorkerRelationTypeExternalId(externalId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#deleteWorkerRelationTypeExternalId");
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
| **externalId** | **String**| Worker Relation Type external ID | |

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
| **204** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getAllProfileWorkerRelations"></a>
# **getAllProfileWorkerRelations**
> GetAllProfileWorkerRelations200Response getAllProfileWorkerRelations(hrisProfileOid).execute();

List of worker relations

List of worker relations.  **Token scopes**: &#x60;profile:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    UUID hrisProfileOid = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | HrisProfile ID
    try {
      GetAllProfileWorkerRelations200Response result = apiInstance.getAllProfileWorkerRelations(hrisProfileOid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#getAllProfileWorkerRelations");
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
| **hrisProfileOid** | **UUID**| HrisProfile ID | |

### Return type

[**GetAllProfileWorkerRelations200Response**](GetAllProfileWorkerRelations200Response.md)

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

<a id="getAllProfileWorkerRelationsExternalId"></a>
# **getAllProfileWorkerRelationsExternalId**
> GetAllProfileWorkerRelationsExternalId200Response getAllProfileWorkerRelationsExternalId(profileId).execute();

Fetch Worker Relations of a given HrisProfile by external id

Fetch Worker Relations of a given HrisProfile by external id.  **Token scopes**: &#x60;profile:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    String profileId = "f7b3b2b3-6b1b-4b3b-8b3b-3b3b3b3b3b3b"; // String | HrisProfile external ID
    try {
      GetAllProfileWorkerRelationsExternalId200Response result = apiInstance.getAllProfileWorkerRelationsExternalId(profileId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#getAllProfileWorkerRelationsExternalId");
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
| **profileId** | **String**| HrisProfile external ID | |

### Return type

[**GetAllProfileWorkerRelationsExternalId200Response**](GetAllProfileWorkerRelationsExternalId200Response.md)

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

<a id="getAllWorkerRelationTypes"></a>
# **getAllWorkerRelationTypes**
> GetAllWorkerRelationTypes200Response getAllWorkerRelationTypes().execute();

Retrieve all worker relation types

Retrieve all worker relation types.  **Token scopes**: &#x60;organizations:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    try {
      GetAllWorkerRelationTypes200Response result = apiInstance.getAllWorkerRelationTypes()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#getAllWorkerRelationTypes");
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

[**GetAllWorkerRelationTypes200Response**](GetAllWorkerRelationTypes200Response.md)

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

<a id="updateWorkerRelationType"></a>
# **updateWorkerRelationType**
> UpdateWorkerRelationType204Response updateWorkerRelationType(typeId, updateWorkerRelationTypeRequest).execute();

Update a worker relation type

Update a worker relation type.  **Token scopes**: &#x60;organizations:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    UUID typeId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | Worker Relation Type id
    UpdateWorkerRelationTypeRequest updateWorkerRelationTypeRequest = new UpdateWorkerRelationTypeRequest(); // UpdateWorkerRelationTypeRequest | 
    try {
      UpdateWorkerRelationType204Response result = apiInstance.updateWorkerRelationType(typeId, updateWorkerRelationTypeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#updateWorkerRelationType");
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
| **typeId** | **UUID**| Worker Relation Type id | |
| **updateWorkerRelationTypeRequest** | [**UpdateWorkerRelationTypeRequest**](UpdateWorkerRelationTypeRequest.md)|  | |

### Return type

[**UpdateWorkerRelationType204Response**](UpdateWorkerRelationType204Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateWorkerRelationTypeExternalId"></a>
# **updateWorkerRelationTypeExternalId**
> UpdateWorkerRelationTypeExternalId204Response updateWorkerRelationTypeExternalId(externalId, updateWorkerRelationTypeRequest).execute();

Update a worker relation type by external id

Update a worker relation type by external id.  **Token scopes**: &#x60;organizations:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    String externalId = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | Worker Relation Type external ID
    UpdateWorkerRelationTypeRequest updateWorkerRelationTypeRequest = new UpdateWorkerRelationTypeRequest(); // UpdateWorkerRelationTypeRequest | 
    try {
      UpdateWorkerRelationTypeExternalId204Response result = apiInstance.updateWorkerRelationTypeExternalId(externalId, updateWorkerRelationTypeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#updateWorkerRelationTypeExternalId");
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
| **externalId** | **String**| Worker Relation Type external ID | |
| **updateWorkerRelationTypeRequest** | [**UpdateWorkerRelationTypeRequest**](UpdateWorkerRelationTypeRequest.md)|  | |

### Return type

[**UpdateWorkerRelationTypeExternalId204Response**](UpdateWorkerRelationTypeExternalId204Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="upsertChildWorkerRelations"></a>
# **upsertChildWorkerRelations**
> upsertChildWorkerRelations(hrisProfileOid, upsertChildWorkerRelationsRequest).execute();

Create child worker relation

Create child worker relation.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    UUID hrisProfileOid = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | HrisProfile ID
    UpsertChildWorkerRelationsRequest upsertChildWorkerRelationsRequest = new UpsertChildWorkerRelationsRequest(); // UpsertChildWorkerRelationsRequest | 
    try {
      apiInstance.upsertChildWorkerRelations(hrisProfileOid, upsertChildWorkerRelationsRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#upsertChildWorkerRelations");
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
| **hrisProfileOid** | **UUID**| HrisProfile ID | |
| **upsertChildWorkerRelationsRequest** | [**UpsertChildWorkerRelationsRequest**](UpsertChildWorkerRelationsRequest.md)|  | |

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
| **204** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="upsertChildWorkerRelationsExternalId"></a>
# **upsertChildWorkerRelationsExternalId**
> upsertChildWorkerRelationsExternalId(profileId, upsertChildWorkerRelationsExternalIdRequest).execute();

Create child worker relation with external Id

Create child worker relation with external Id.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    String profileId = "profileId_example"; // String | HrisProfile external ID
    UpsertChildWorkerRelationsExternalIdRequest upsertChildWorkerRelationsExternalIdRequest = new UpsertChildWorkerRelationsExternalIdRequest(); // UpsertChildWorkerRelationsExternalIdRequest | 
    try {
      apiInstance.upsertChildWorkerRelationsExternalId(profileId, upsertChildWorkerRelationsExternalIdRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#upsertChildWorkerRelationsExternalId");
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
| **profileId** | **String**| HrisProfile external ID | |
| **upsertChildWorkerRelationsExternalIdRequest** | [**UpsertChildWorkerRelationsExternalIdRequest**](UpsertChildWorkerRelationsExternalIdRequest.md)|  | |

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
| **204** | Successful operation |  -  |

<a id="upsertParentWorkerRelations"></a>
# **upsertParentWorkerRelations**
> upsertParentWorkerRelations(hrisProfileOid, upsertParentWorkerRelationsRequest).execute();

Create a parent worker relation

Create a parent worker relation.  **Token scopes**: &#x60;profile:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerRelationsApi;

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

    WorkerRelationsApi apiInstance = new WorkerRelationsApi(defaultClient);
    UUID hrisProfileOid = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | HrisProfile ID
    UpsertParentWorkerRelationsRequest upsertParentWorkerRelationsRequest = new UpsertParentWorkerRelationsRequest(); // UpsertParentWorkerRelationsRequest | 
    try {
      apiInstance.upsertParentWorkerRelations(hrisProfileOid, upsertParentWorkerRelationsRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRelationsApi#upsertParentWorkerRelations");
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
| **hrisProfileOid** | **UUID**| HrisProfile ID | |
| **upsertParentWorkerRelationsRequest** | [**UpsertParentWorkerRelationsRequest**](UpsertParentWorkerRelationsRequest.md)|  | |

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
| **204** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

