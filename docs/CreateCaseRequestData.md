

# CreateCaseRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**teamId** | **UUID** | The team ID. Required for EOR visa applications. Identifies the team handling the case |  [optional] |
|**caseType** | [**CaseTypeEnum**](#CaseTypeEnum) | The type of immigration case to be created. Determines the workflow and requirements |  |
|**entityId** | **UUID** | The unique identifier of the entity sponsoring the visa. Required for sponsored visa applications |  [optional] |
|**contractId** | **String** | The contract object identifier. Required for document reviews and visa applications |  [optional] |
|**countryCode** | **String** | ISO 3166-1 alpha-2 country code where the immigration case needs to be processed |  |



## Enum: CaseTypeEnum

| Name | Value |
|---- | -----|
| RIGHT_TO_WORK | &quot;RIGHT_TO_WORK&quot; |
| EOR_VISA | &quot;EOR_VISA&quot; |
| SPONSORED_VISA | &quot;SPONSORED_VISA&quot; |
| PRE_HIRE_EOR_VISA | &quot;PRE_HIRE_EOR_VISA&quot; |
| PRE_HIRE_SPONSORSHIP_VISA | &quot;PRE_HIRE_SPONSORSHIP_VISA&quot; |



