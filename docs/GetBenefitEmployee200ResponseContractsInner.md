

# GetBenefitEmployee200ResponseContractsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the contract. |  [optional] |
|**flsa** | **Boolean** | Indicates if the contract is compliant with the Fair Labor Standards Act. |  [optional] |
|**status** | **String** | The contract status. |  [optional] |
|**endDate** | **String** | The end date of the contract, if applicable. |  [optional] |
|**jobTitle** | **String** | Job title or name of the contract. |  [optional] |
|**startDate** | **String** | The start date of the contract. |  [optional] |
|**compensations** | [**List&lt;GetBenefitEmployee200ResponseContractsInnerCompensationsInner&gt;**](GetBenefitEmployee200ResponseContractsInnerCompensationsInner.md) | List of compensations associated with the contract. |  [optional] |
|**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) | The type of contract. |  [optional] |
|**employmentType** | [**EmploymentTypeEnum**](#EmploymentTypeEnum) | The employment type, e.g., full-time or part-time. |  [optional] |
|**estimatedWeekWorkingHours** | **BigDecimal** | Estimated number of working hours per week. |  [optional] |



## Enum: ContractTypeEnum

| Name | Value |
|---- | -----|
| DIRECT_EMPLOYEE | &quot;direct_employee&quot; |
| CONTRACTOR | &quot;contractor&quot; |



## Enum: EmploymentTypeEnum

| Name | Value |
|---- | -----|
| FULL_TIME | &quot;full_time&quot; |
| PART_TIME | &quot;part_time&quot; |



