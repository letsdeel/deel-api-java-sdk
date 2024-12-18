# LegalEntitiesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLegalEntity**](LegalEntitiesApi.md#createLegalEntity) | **POST** /legal-entities | Create a new legal entity |
| [**deleteLegalEntity**](LegalEntitiesApi.md#deleteLegalEntity) | **DELETE** /legal-entities/{id} | Delete a legal entity |
| [**editLegalEntity**](LegalEntitiesApi.md#editLegalEntity) | **PATCH** /legal-entities/{id} | Edit a legal entity |
| [**getLegalEntity**](LegalEntitiesApi.md#getLegalEntity) | **GET** /benefits/legal-entities/{id} | Get legal entity data from organization integrated with external benefits vendor |
| [**getLegalEntityPayrollSettings**](LegalEntitiesApi.md#getLegalEntityPayrollSettings) | **GET** /benefits/legal-entities/{id}/payroll-settings | Get legal entity payroll settings from organization integrated with external benefits vendor |


<a id="createLegalEntity"></a>
# **createLegalEntity**
> CreateLegalEntity200Response createLegalEntity().createLegalEntityRequest(createLegalEntityRequest).execute();

Create a new legal entity

Create a new legal entity under an organization.  **Token scopes**: &#x60;legal-entity:write&#x60;, &#x60;legal-entity:read&#x60;

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
    CreateLegalEntityRequest createLegalEntityRequest = new CreateLegalEntityRequest(); // CreateLegalEntityRequest | 
    try {
      CreateLegalEntity200Response result = apiInstance.createLegalEntity()
            .createLegalEntityRequest(createLegalEntityRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#createLegalEntity");
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
| **createLegalEntityRequest** | [**CreateLegalEntityRequest**](CreateLegalEntityRequest.md)|  | [optional] |

### Return type

[**CreateLegalEntity200Response**](CreateLegalEntity200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created legal entity. |  -  |
| **400** | Invalid request parameters. |  -  |
| **403** | Permission denied. User must have the &#x60;entities.manage&#x60; permission. |  -  |

<a id="deleteLegalEntity"></a>
# **deleteLegalEntity**
> DeleteLegalEntity200Response deleteLegalEntity(id).execute();

Delete a legal entity

Archive a legal entity. This marks the entity as inactive but does not permanently remove it.  **Token scopes**: &#x60;legal-entity:read&#x60;, &#x60;legal-entity:write&#x60;

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
    String id = "123e4567-e89b-12d3-a456-426614174000"; // String | The ID of the legal entity to archive.
    try {
      DeleteLegalEntity200Response result = apiInstance.deleteLegalEntity(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntity");
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
| **id** | **String**| The ID of the legal entity to archive. | |

### Return type

[**DeleteLegalEntity200Response**](DeleteLegalEntity200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully archived the legal entity. |  -  |
| **400** | Invalid request parameters. |  -  |
| **403** | Permission denied. |  -  |

<a id="editLegalEntity"></a>
# **editLegalEntity**
> EditLegalEntity200Response editLegalEntity(id, editLegalEntityRequest).execute();

Edit a legal entity

Update the details of an existing legal entity.  **Token scopes**: &#x60;legal-entity:read&#x60;, &#x60;legal-entity:write&#x60;

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
    String id = "123e4567-e89b-12d3-a456-426614174000"; // String | The ID of the legal entity to update.
    EditLegalEntityRequest editLegalEntityRequest = new EditLegalEntityRequest(); // EditLegalEntityRequest | 
    try {
      EditLegalEntity200Response result = apiInstance.editLegalEntity(id, editLegalEntityRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#editLegalEntity");
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
| **id** | **String**| The ID of the legal entity to update. | |
| **editLegalEntityRequest** | [**EditLegalEntityRequest**](EditLegalEntityRequest.md)|  | |

### Return type

[**EditLegalEntity200Response**](EditLegalEntity200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the legal entity. |  -  |
| **400** | Invalid request parameters. |  -  |
| **403** | Permission denied. |  -  |

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

