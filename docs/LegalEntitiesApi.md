# LegalEntitiesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLegalEntity**](LegalEntitiesApi.md#getLegalEntity) | **GET** /benefits/legal-entities/{id} | Get legal entity data from organization integrated with external benefits vendor |
| [**getLegalEntityPayrollSettings**](LegalEntitiesApi.md#getLegalEntityPayrollSettings) | **GET** /benefits/legal-entities/{id}/payroll-settings | Get legal entity payroll settings from organization integrated with external benefits vendor |


<a id="getLegalEntity"></a>
# **getLegalEntity**
> GetLegalEntity200Response getLegalEntity(id).execute();

Get legal entity data from organization integrated with external benefits vendor

Get legal entity data from organization integrated with external benefits vendor  **Token scopes**: &#x60;organizations:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LegalEntitiesApi;

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

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String id = "123e4567-e89b-12d3-a456-426614174000"; // String | Id from the legal entity to fetch data
    try {
      GetLegalEntity200Response result = apiInstance.getLegalEntity(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getLegalEntity");
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

### Return type

[**GetLegalEntity200Response**](GetLegalEntity200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="getLegalEntityPayrollSettings"></a>
# **getLegalEntityPayrollSettings**
> List&lt;GetLegalEntityPayrollSettings200ResponseInner&gt; getLegalEntityPayrollSettings(id).execute();

Get legal entity payroll settings from organization integrated with external benefits vendor

Get legal entity payroll settings from organization integrated with external benefits vendor  **Token scopes**: &#x60;organizations:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LegalEntitiesApi;

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

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String id = "asfjkla"; // String | Id from the legal entity to fetch data
    try {
      List<GetLegalEntityPayrollSettings200ResponseInner> result = apiInstance.getLegalEntityPayrollSettings(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getLegalEntityPayrollSettings");
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

### Return type

[**List&lt;GetLegalEntityPayrollSettings200ResponseInner&gt;**](GetLegalEntityPayrollSettings200ResponseInner.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

