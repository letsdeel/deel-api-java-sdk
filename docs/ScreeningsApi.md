# ScreeningsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVeriffSession**](ScreeningsApi.md#createVeriffSession) | **POST** /veriff/session | Create Veriff session |
| [**getVerificationMethod**](ScreeningsApi.md#getVerificationMethod) | **GET** /screenings/verification_method | Get verification method |


<a id="createVeriffSession"></a>
# **createVeriffSession**
> CreateVeriffSession201Response createVeriffSession(createVeriffSessionRequest).execute();

Create Veriff session

Create Veriff session  **Token scopes**: &#x60;screenings:write&#x60;, &#x60;worker:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScreeningsApi;

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

    ScreeningsApi apiInstance = new ScreeningsApi(defaultClient);
    CreateVeriffSessionRequest createVeriffSessionRequest = new CreateVeriffSessionRequest(); // CreateVeriffSessionRequest | 
    try {
      CreateVeriffSession201Response result = apiInstance.createVeriffSession(createVeriffSessionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningsApi#createVeriffSession");
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
| **createVeriffSessionRequest** | [**CreateVeriffSessionRequest**](CreateVeriffSessionRequest.md)|  | |

### Return type

[**CreateVeriffSession201Response**](CreateVeriffSession201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |

<a id="getVerificationMethod"></a>
# **getVerificationMethod**
> GetVerificationMethod200Response getVerificationMethod(country, documentType).execute();

Get verification method

Get verification method by provided country and document type  **Token scopes**: &#x60;screenings:read&#x60;, &#x60;worker:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScreeningsApi;

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

    ScreeningsApi apiInstance = new ScreeningsApi(defaultClient);
    String country = "CA"; // String | The document's issuing country code (ISO 3166-1 alpha-2)
    String documentType = "passport"; // String | The document to be provided during KYC
    try {
      GetVerificationMethod200Response result = apiInstance.getVerificationMethod(country, documentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningsApi#getVerificationMethod");
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
| **country** | **String**| The document&#39;s issuing country code (ISO 3166-1 alpha-2) | |
| **documentType** | **String**| The document to be provided during KYC | [enum: passport, government_id, driving_license, other] |

### Return type

[**GetVerificationMethod200Response**](GetVerificationMethod200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

