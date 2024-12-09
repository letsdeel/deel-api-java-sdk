

# GetLegalEntity200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the legal entity. |  [optional] |
|**name** | **String** | Name of the legal entity. |  [optional] |
|**phone** | **String** | Phone number of the legal entity. |  [optional] |
|**vatId** | **String** | VAT ID of the legal entity, known as EIN in the US. |  [optional] |
|**address** | [**GetLegalEntity200ResponseAddress**](GetLegalEntity200ResponseAddress.md) |  |  [optional] |
|**country** | **String** | Country of the legal entity. |  [optional] |
|**naicsCode** | **String** | NAICS code of the legal entity. |  [optional] |
|**entityType** | **String** | Type of the legal entity (e.g., LLC). |  [optional] |
|**employmentType** | [**EmploymentTypeEnum**](#EmploymentTypeEnum) | Employment type of the legal entity. |  [optional] |
|**registrationNumber** | **String** | Registration number of the legal entity. |  [optional] |
|**registrationAddress** | [**GetLegalEntity200ResponseRegistrationAddress**](GetLegalEntity200ResponseRegistrationAddress.md) |  |  [optional] |
|**unionOrLeasedEmployees** | **Boolean** | Indicates if the legal entity has union or leased employees. |  [optional] |



## Enum: EmploymentTypeEnum

| Name | Value |
|---- | -----|
| PEO | &quot;peo&quot; |
| USP | &quot;usp&quot; |
| GP | &quot;gp&quot; |
| u | &quot;...&quot; |



