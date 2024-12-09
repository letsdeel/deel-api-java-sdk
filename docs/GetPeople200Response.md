

# GetPeople200Response

People object representing a Deel

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **BigDecimal** | Unique identifier for the user profile  |  [optional] |
|**email** | **String** | Email address of the user |  [optional] |
|**userId** | **BigDecimal** | Unique identifier for the user |  [optional] |
|**username** | **String** | Username of the user |  [optional] |
|**fullName** | **String** | Full name of the user |  [optional] |
|**lastName** | **String** | Last name of the user |  [optional] |
|**avatarUrl** | **String** | URL of the user&#39;s avatar |  [optional] |
|**firstName** | **String** | First name of the user |  [optional] |
|**middleName** | **String** | Middle name of the user |  [optional] |
|**hrisEnabled** | **Boolean** | HRIS feature enabled. |  [optional] |
|**profileType** | [**ProfileTypeEnum**](#ProfileTypeEnum) | Type of profile |  [optional] |
|**slackTeamId** | **String** | User&#39;s team slack id |  [optional] |
|**slackUserId** | **String** | User&#39;s slack id |  [optional] |
|**clientCountry** | **String** | Country code. |  [optional] |
|**organizationId** | **BigDecimal** | Unique identifier for the organization |  [optional] |
|**organizationName** | **String** | Name of the organization |  [optional] |
|**contractorCountry** | **String** | Country code. |  [optional] |



## Enum: ProfileTypeEnum

| Name | Value |
|---- | -----|
| CLIENT | &quot;client&quot; |
| CONTRACTOR | &quot;contractor&quot; |
| ICP | &quot;icp&quot; |
| DIRECT_EMPLOYEE | &quot;direct_employee&quot; |
| HRIS_DIRECT_EMPLOYEE | &quot;hris_direct_employee&quot; |
| SERVICE_ACCOUNT | &quot;service_account&quot; |



