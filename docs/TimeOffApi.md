# TimeOffApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTimeOff**](TimeOffApi.md#createTimeOff) | **POST** /time_offs | Create time-off request |
| [**deleteTimeOff**](TimeOffApi.md#deleteTimeOff) | **DELETE** /time_offs/{time_off_id} | Delete time-off request |
| [**getPoliciesForProfile**](TimeOffApi.md#getPoliciesForProfile) | **GET** /time_offs/profile/{hris_profile_id}/policies | List policies |
| [**getProfileEntitlements**](TimeOffApi.md#getProfileEntitlements) | **GET** /time_offs/profile/{hris_profile_id}/entitlements | Get Profile Entitlements |
| [**getTimeOffsQuery**](TimeOffApi.md#getTimeOffsQuery) | **GET** /time_offs/profile/{hris_profile_id} | List time-off requests |
| [**updateTimeOff**](TimeOffApi.md#updateTimeOff) | **PATCH** /time_offs/{time_off_id} | Update time-off request |


<a id="createTimeOff"></a>
# **createTimeOff**
> CreateTimeOff201Response createTimeOff(createTimeOffRequest).execute();

Create time-off request

Create time-off request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeOffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeOffApi apiInstance = new TimeOffApi(defaultClient);
    CreateTimeOffRequest createTimeOffRequest = new CreateTimeOffRequest(); // CreateTimeOffRequest | The time off request data
    try {
      CreateTimeOff201Response result = apiInstance.createTimeOff(createTimeOffRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#createTimeOff");
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
| **createTimeOffRequest** | [**CreateTimeOffRequest**](CreateTimeOffRequest.md)| The time off request data | |

### Return type

[**CreateTimeOff201Response**](CreateTimeOff201Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Time off created |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteTimeOff"></a>
# **deleteTimeOff**
> Object deleteTimeOff(timeOffId).execute();

Delete time-off request

Delete time-off request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeOffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeOffApi apiInstance = new TimeOffApi(defaultClient);
    UUID timeOffId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | Time off request id
    try {
      Object result = apiInstance.deleteTimeOff(timeOffId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#deleteTimeOff");
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
| **timeOffId** | **UUID**| Time off request id | |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | time off deleted |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getPoliciesForProfile"></a>
# **getPoliciesForProfile**
> GetPoliciesForProfile200Response getPoliciesForProfile(hrisProfileId).policyTypeName(policyTypeName).policyTypeId(policyTypeId).execute();

List policies

List policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeOffApi;

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

    TimeOffApi apiInstance = new TimeOffApi(defaultClient);
    String hrisProfileId = "f7b3b3b3-3b3b-3b3b-3b3b-3b3b3b3b3b3b"; // String | hrisProfileId id.
    String policyTypeName = "Moving leave"; // String | Policy type name.
    String policyTypeId = "f7b3b3b3-3b3b-3b3b-3b3b-3b3b3b3b3b3b"; // String | policy type id
    try {
      GetPoliciesForProfile200Response result = apiInstance.getPoliciesForProfile(hrisProfileId)
            .policyTypeName(policyTypeName)
            .policyTypeId(policyTypeId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getPoliciesForProfile");
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
| **hrisProfileId** | **String**| hrisProfileId id. | |
| **policyTypeName** | **String**| Policy type name. | [optional] [enum: Moving leave, Adoption leave, Personal leave, Parental leave, Military leave, Childbirth leave, Study leave, Sick leave, Bereavement leave, Family & domestic violence leave, Marriage/wedding leave, Blood donation leave, Volunteer leave, Vacation, Doctor's appointment leave, Maternity leave, Hajj leave, Paternity leave, Civic/public duty leave, Childcare leave, Unpaid leave, Paid leave, Other leave, Disability leave, Pregnancy leave, RTT, Regional holiday, Breastfeeding leave, Advanced vacation] |
| **policyTypeId** | **String**| policy type id | [optional] |

### Return type

[**GetPoliciesForProfile200Response**](GetPoliciesForProfile200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getProfileEntitlements"></a>
# **getProfileEntitlements**
> GetProfileEntitlements200Response getProfileEntitlements(hrisProfileId).policyTypeName(policyTypeName).trackingPeriodDate(trackingPeriodDate).execute();

Get Profile Entitlements

List time-off entitlements.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeOffApi;

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

    TimeOffApi apiInstance = new TimeOffApi(defaultClient);
    UUID hrisProfileId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | HRIS profile ID
    String policyTypeName = "Moving leave"; // String | 
    LocalDate trackingPeriodDate = LocalDate.parse("2022-01-01"); // LocalDate | Tracking period date
    try {
      GetProfileEntitlements200Response result = apiInstance.getProfileEntitlements(hrisProfileId)
            .policyTypeName(policyTypeName)
            .trackingPeriodDate(trackingPeriodDate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getProfileEntitlements");
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
| **hrisProfileId** | **UUID**| HRIS profile ID | |
| **policyTypeName** | **String**|  | [optional] [enum: Moving leave, Adoption leave, Personal leave, Parental leave, Military leave, Childbirth leave, Study leave, Sick leave, Bereavement leave, Family & domestic violence leave, Marriage/wedding leave, Blood donation leave, Volunteer leave, Vacation, Doctor's appointment leave, Maternity leave, Hajj leave, Paternity leave, Civic/public duty leave, Childcare leave, Unpaid leave, Paid leave, Other leave, Disability leave, Pregnancy leave, RTT, Regional holiday, Breastfeeding leave, Advanced vacation] |
| **trackingPeriodDate** | **LocalDate**| Tracking period date | [optional] |

### Return type

[**GetProfileEntitlements200Response**](GetProfileEntitlements200Response.md)

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

<a id="getTimeOffsQuery"></a>
# **getTimeOffsQuery**
> GetTimeOffsQuery200Response getTimeOffsQuery(hrisProfileId).organizationId(organizationId).status(status).startDate(startDate).endDate(endDate).approvalStartDate(approvalStartDate).approvalEndDate(approvalEndDate).updatedStartDate(updatedStartDate).updatedEndDate(updatedEndDate).pageSize(pageSize).policyTypes(policyTypes).next(next).execute();

List time-off requests

List time-off requests

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeOffApi;

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

    TimeOffApi apiInstance = new TimeOffApi(defaultClient);
    UUID hrisProfileId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | HRIS profile id
    String organizationId = "d290f1ee-6c54-4b01-90e6-d701748f0851"; // String | Organization id
    List<String> status = Arrays.asList(); // List<String> | Time off status
    OffsetDateTime startDate = OffsetDateTime.parse("2022-01-01T00:00:00Z"); // OffsetDateTime | Start date of time off
    OffsetDateTime endDate = OffsetDateTime.parse("2022-01-01T00:00:00Z"); // OffsetDateTime | End date of time off
    OffsetDateTime approvalStartDate = OffsetDateTime.parse("2022-01-01T00:00:00Z"); // OffsetDateTime | Approval start date
    OffsetDateTime approvalEndDate = OffsetDateTime.parse("2022-01-01T00:00:00Z"); // OffsetDateTime | Approval end date
    OffsetDateTime updatedStartDate = OffsetDateTime.parse("2022-01-01T00:00:00Z"); // OffsetDateTime | Updated start date
    OffsetDateTime updatedEndDate = OffsetDateTime.parse("2022-01-01T00:00:00Z"); // OffsetDateTime | Updated end date
    Integer pageSize = 10; // Integer | Page size
    List<UUID> policyTypes = Arrays.asList(); // List<UUID> | Policy types
    String next = "d290f1ee-6c54-4b01-90e6-d701748f0851"; // String | Next page
    try {
      GetTimeOffsQuery200Response result = apiInstance.getTimeOffsQuery(hrisProfileId)
            .organizationId(organizationId)
            .status(status)
            .startDate(startDate)
            .endDate(endDate)
            .approvalStartDate(approvalStartDate)
            .approvalEndDate(approvalEndDate)
            .updatedStartDate(updatedStartDate)
            .updatedEndDate(updatedEndDate)
            .pageSize(pageSize)
            .policyTypes(policyTypes)
            .next(next)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTimeOffsQuery");
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
| **hrisProfileId** | **UUID**| HRIS profile id | |
| **organizationId** | **String**| Organization id | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| Time off status | [optional] [enum: REQUESTED, APPROVED, REJECTED, USED, CANCELED] |
| **startDate** | **OffsetDateTime**| Start date of time off | [optional] |
| **endDate** | **OffsetDateTime**| End date of time off | [optional] |
| **approvalStartDate** | **OffsetDateTime**| Approval start date | [optional] |
| **approvalEndDate** | **OffsetDateTime**| Approval end date | [optional] |
| **updatedStartDate** | **OffsetDateTime**| Updated start date | [optional] |
| **updatedEndDate** | **OffsetDateTime**| Updated end date | [optional] |
| **pageSize** | **Integer**| Page size | [optional] |
| **policyTypes** | [**List&lt;UUID&gt;**](UUID.md)| Policy types | [optional] |
| **next** | **String**| Next page | [optional] |

### Return type

[**GetTimeOffsQuery200Response**](GetTimeOffsQuery200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation time offs returned |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateTimeOff"></a>
# **updateTimeOff**
> UpdateTimeOff200Response updateTimeOff(timeOffId, updateTimeOffRequest).execute();

Update time-off request

Update time-off request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeOffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeOffApi apiInstance = new TimeOffApi(defaultClient);
    UUID timeOffId = UUID.fromString("d290f1ee-6c54-4b01-90e6-d701748f0851"); // UUID | Time off request id
    UpdateTimeOffRequest updateTimeOffRequest = new UpdateTimeOffRequest(); // UpdateTimeOffRequest | Time off request data
    try {
      UpdateTimeOff200Response result = apiInstance.updateTimeOff(timeOffId, updateTimeOffRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#updateTimeOff");
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
| **timeOffId** | **UUID**| Time off request id | |
| **updateTimeOffRequest** | [**UpdateTimeOffRequest**](UpdateTimeOffRequest.md)| Time off request data | |

### Return type

[**UpdateTimeOff200Response**](UpdateTimeOff200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Time off updated |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

