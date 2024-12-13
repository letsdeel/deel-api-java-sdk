# OnboardingApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listOnboardingTracker**](OnboardingApi.md#listOnboardingTracker) | **GET** /onboarding/tracker | List onboarding employees |
| [**onboardingTrackerHrisProfileOidGet**](OnboardingApi.md#onboardingTrackerHrisProfileOidGet) | **GET** /onboarding/tracker/hris_profile/{oid} | Get onboarding details by onboarding hris profile oid |
| [**onboardingTrackerIdGet**](OnboardingApi.md#onboardingTrackerIdGet) | **GET** /onboarding/tracker/{id} | Get onboarding details by onboarding tracker ID |


<a id="listOnboardingTracker"></a>
# **listOnboardingTracker**
> ListOnboardingTracker200Response listOnboardingTracker().search(search).contractOid(contractOid).hiringTypes(hiringTypes).progressStatuses(progressStatuses).countries(countries).teams(teams).legalEntities(legalEntities).hrisDirectManagers(hrisDirectManagers).fromDate(fromDate).toDate(toDate).actions(actions).limit(limit).sortBy(sortBy).sortOrder(sortOrder).pagination(pagination).includeOverview(includeOverview).execute();

List onboarding employees

List all onboarding  **Token scopes**: &#x60;contracts:read&#x60;, &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OnboardingApi;

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

    OnboardingApi apiInstance = new OnboardingApi(defaultClient);
    String search = "John Doe"; // String | Search term to filter contracts by name or other attributes
    List<String> contractOid = Arrays.asList(); // List<String> | 
    List<String> hiringTypes = Arrays.asList(); // List<String> | 
    List<String> progressStatuses = Arrays.asList(); // List<String> | 
    List<String> countries = Arrays.asList(); // List<String> | 
    List<String> teams = Arrays.asList(); // List<String> | 
    List<String> legalEntities = Arrays.asList(); // List<String> | 
    List<String> hrisDirectManagers = Arrays.asList(); // List<String> | 
    OffsetDateTime fromDate = OffsetDateTime.parse("2024-01-01T00:00:00Z"); // OffsetDateTime | Start date for filtering contracts
    OffsetDateTime toDate = OffsetDateTime.parse("2024-12-31T23:59:59Z"); // OffsetDateTime | End date for filtering contracts
    List<String> actions = Arrays.asList(); // List<String> | Onboarding actions
    Integer limit = 20; // Integer | Number of results to return per page
    String sortBy = "progressStatusWeight"; // String | Field to sort by
    String sortOrder = "ASC"; // String | Sorting order
    ListOnboardingTrackerPaginationParameter pagination = new ListOnboardingTrackerPaginationParameter(); // ListOnboardingTrackerPaginationParameter | 
    Boolean includeOverview = false; // Boolean | Include an overview of the contract
    try {
      ListOnboardingTracker200Response result = apiInstance.listOnboardingTracker()
            .search(search)
            .contractOid(contractOid)
            .hiringTypes(hiringTypes)
            .progressStatuses(progressStatuses)
            .countries(countries)
            .teams(teams)
            .legalEntities(legalEntities)
            .hrisDirectManagers(hrisDirectManagers)
            .fromDate(fromDate)
            .toDate(toDate)
            .actions(actions)
            .limit(limit)
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .pagination(pagination)
            .includeOverview(includeOverview)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#listOnboardingTracker");
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
| **contractOid** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hiringTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: contractor, employee] |
| **progressStatuses** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ACTIVE, INACTIVE, ONBOARDING] |
| **countries** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **teams** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **legalEntities** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hrisDirectManagers** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **fromDate** | **OffsetDateTime**| Start date for filtering contracts | [optional] |
| **toDate** | **OffsetDateTime**| End date for filtering contracts | [optional] |
| **actions** | [**List&lt;String&gt;**](String.md)| Onboarding actions | [optional] [enum: ONBOARD, COMPLETE, PAUSE] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 20] |
| **sortBy** | **String**| Field to sort by | [optional] [default to progressStatusWeight] [enum: progressStatusWeight] |
| **sortOrder** | **String**| Sorting order | [optional] [default to ASC] [enum: ASC, DESC] |
| **pagination** | [**ListOnboardingTrackerPaginationParameter**](.md)|  | [optional] |
| **includeOverview** | **Boolean**| Include an overview of the contract | [optional] [default to false] |

### Return type

[**ListOnboardingTracker200Response**](ListOnboardingTracker200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of onboarding and their details |  -  |

<a id="onboardingTrackerHrisProfileOidGet"></a>
# **onboardingTrackerHrisProfileOidGet**
> OnboardingTrackerHrisProfileOidGet200Response onboardingTrackerHrisProfileOidGet(oid).execute();

Get onboarding details by onboarding hris profile oid

Get onboarding overview  **Token scopes**: &#x60;contracts:read&#x60;, &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OnboardingApi;

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

    OnboardingApi apiInstance = new OnboardingApi(defaultClient);
    String oid = "150f635e-fae1-4b9d-9f86-768bbbac3698"; // String | Unique hris profile oid
    try {
      OnboardingTrackerHrisProfileOidGet200Response result = apiInstance.onboardingTrackerHrisProfileOidGet(oid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#onboardingTrackerHrisProfileOidGet");
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

[**OnboardingTrackerHrisProfileOidGet200Response**](OnboardingTrackerHrisProfileOidGet200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Onboarding overview |  -  |

<a id="onboardingTrackerIdGet"></a>
# **onboardingTrackerIdGet**
> OnboardingTrackerHrisProfileOidGet200Response onboardingTrackerIdGet(id).execute();

Get onboarding details by onboarding tracker ID

Get onboarding overview  **Token scopes**: &#x60;contracts:read&#x60;, &#x60;people:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OnboardingApi;

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

    OnboardingApi apiInstance = new OnboardingApi(defaultClient);
    String id = "eyJjb250cmFjdE9pZCI6IlB6cFlhcmVuIiwiaGlyaW5nVHlwZSI6ImNvbnRyYWN0b3IiLCJwcm9maWxlSWQiOjE2NzgyMCwidXNlcklkIjoxNDM3ODl9"; // String | Unique onboarding tracker identifier
    try {
      OnboardingTrackerHrisProfileOidGet200Response result = apiInstance.onboardingTrackerIdGet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#onboardingTrackerIdGet");
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

[**OnboardingTrackerHrisProfileOidGet200Response**](OnboardingTrackerHrisProfileOidGet200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Onboarding overview |  -  |

