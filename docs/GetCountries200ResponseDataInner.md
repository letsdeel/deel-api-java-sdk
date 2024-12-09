

# GetCountries200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The ISO 3166-1 alpha-2 country code. |  |
|**name** | **String** | The official name of the country. |  |
|**states** | [**List&lt;GetCountries200ResponseDataInnerStatesInner&gt;**](GetCountries200ResponseDataInnerStatesInner.md) | List of sub-territories within the country. These may be called states, provinces, prefectures, regions, or may not exist. |  |
|**stateType** | **String** | The designation for sub-territories within the country, such as &#39;state&#39;, &#39;province&#39;, &#39;prefecture&#39;, or &#39;region&#39;. If none, this field will be null. |  |
|**eorSupport** | **Boolean** | Indicates whether Deel provides Employer of Record (EoR) support in this country. |  |
|**visaSupport** | **Boolean** | Indicates whether Deel provides visa support for employees being hired in this country. |  |



