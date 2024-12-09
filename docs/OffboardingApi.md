# OffboardingApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**offboardingTrackerGet**](OffboardingApi.md#offboardingTrackerGet) | **GET** /offboarding/tracker | Retrieve offboarding list |
| [**offboardingTrackerHrisProfileOidGet**](OffboardingApi.md#offboardingTrackerHrisProfileOidGet) | **GET** /offboarding/tracker/hris_profile/{oid} | Retrieve termination details |
| [**offboardingTrackerIdGet**](OffboardingApi.md#offboardingTrackerIdGet) | **GET** /offboarding/tracker/{id} | Retrieve termination details |


<a id="offboardingTrackerGet"></a>
# **offboardingTrackerGet**
> OffboardingTrackerGet200Response offboardingTrackerGet().search(search).hiringTypes(hiringTypes).progressStatuses(progressStatuses).limit(limit).sortBy(sortBy).sortOrder(sortOrder).pagination(pagination).includeOverview(includeOverview).execute();

Retrieve offboarding list

Retrieve offboarding list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffboardingApi;

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

    OffboardingApi apiInstance = new OffboardingApi(defaultClient);
    String search = "John Doe"; // String | Search term to filter contracts by name or other attributes
    List<String> hiringTypes = Arrays.asList(); // List<String> | 
    List<String> progressStatuses = Arrays.asList(); // List<String> | 
    Integer limit = 20; // Integer | Number of results to return per page
    String sortBy = "progressStatusWeight"; // String | Field to sort by
    String sortOrder = "ASC"; // String | Sorting order
    OffboardingTrackerGetPaginationParameter pagination = new OffboardingTrackerGetPaginationParameter(); // OffboardingTrackerGetPaginationParameter | 
    Boolean includeOverview = false; // Boolean | Include an overview of the contract
    try {
      OffboardingTrackerGet200Response result = apiInstance.offboardingTrackerGet()
            .search(search)
            .hiringTypes(hiringTypes)
            .progressStatuses(progressStatuses)
            .limit(limit)
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .pagination(pagination)
            .includeOverview(includeOverview)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffboardingApi#offboardingTrackerGet");
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
| **search** | **String**| Search term to filter contracts by name or other attributes | [optional] |
| **hiringTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: contractor, employee] |
| **progressStatuses** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ACTIVE, INACTIVE, ONBOARDING] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 20] |
| **sortBy** | **String**| Field to sort by | [optional] [default to progressStatusWeight] [enum: progressStatusWeight] |
| **sortOrder** | **String**| Sorting order | [optional] [default to ASC] [enum: ASC, DESC] |
| **pagination** | [**OffboardingTrackerGetPaginationParameter**](.md)|  | [optional] |
| **includeOverview** | **Boolean**| Include an overview of the contract | [optional] [default to false] |

### Return type

[**OffboardingTrackerGet200Response**](OffboardingTrackerGet200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved list of offboarding |  -  |

<a id="offboardingTrackerHrisProfileOidGet"></a>
# **offboardingTrackerHrisProfileOidGet**
> OffboardingTrackerIdGet200Response offboardingTrackerHrisProfileOidGet(oid).execute();

Retrieve termination details

Retrieve termination details by hris profile oid

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffboardingApi;

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

    OffboardingApi apiInstance = new OffboardingApi(defaultClient);
    String oid = "150f635e-fae1-4b9d-9f86-768bbbac3698"; // String | Unique hris profile oid
    try {
      OffboardingTrackerIdGet200Response result = apiInstance.offboardingTrackerHrisProfileOidGet(oid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffboardingApi#offboardingTrackerHrisProfileOidGet");
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
| **oid** | **String**| Unique hris profile oid | |

### Return type

[**OffboardingTrackerIdGet200Response**](OffboardingTrackerIdGet200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved offboarding details |  -  |

<a id="offboardingTrackerIdGet"></a>
# **offboardingTrackerIdGet**
> OffboardingTrackerIdGet200Response offboardingTrackerIdGet(id).execute();

Retrieve termination details

Retrieve termination details by tracker id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffboardingApi;

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

    OffboardingApi apiInstance = new OffboardingApi(defaultClient);
    String id = "eyJjb250cmFjdE9pZCI6IlB6cFlhcmVuIiwiaGlyaW5nVHlwZSI6ImNvbnRyYWN0b3IiLCJwcm9maWxlSWQiOjE2NzgyMCwidXNlcklkIjoxNDM3ODl9"; // String | Unique onboarding tracker identifier
    try {
      OffboardingTrackerIdGet200Response result = apiInstance.offboardingTrackerIdGet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffboardingApi#offboardingTrackerIdGet");
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
| **id** | **String**| Unique onboarding tracker identifier | |

### Return type

[**OffboardingTrackerIdGet200Response**](OffboardingTrackerIdGet200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved offboarding details |  -  |

