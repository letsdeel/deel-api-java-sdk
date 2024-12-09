

# ContractToCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractCustomFile** | **File** | Upload the file you want to attach to this entry. |  [optional] |
|**title** | **String** | The title of the contract. |  |
|**countryCode** | **String** | Country code. |  [optional] |
|**stateCode** | **String** | The state or province code. Use country lookup endpoint to retrieve state codes. |  [optional] |
|**scopeOfWork** | **String** | Describe the work to be performed. |  [optional] |
|**specialClause** | **String** | Enter any special clause you may have. |  [optional] |
|**terminationDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31. |  [optional] |
|**client** | [**ContractToCreateSharedClient**](ContractToCreateSharedClient.md) |  |  |
|**jobTitle** | [**ContractToCreateSharedJobTitle**](ContractToCreateSharedJobTitle.md) |  |  |
|**seniority** | [**ContractToCreateSharedSeniority**](ContractToCreateSharedSeniority.md) |  |  [optional] |
|**noticePeriod** | **BigDecimal** | Days before to notice the termination of contract for eather party. |  [optional] |
|**whoReports** | **ContractWhoReportsEnum** |  |  [optional] |
|**meta** | [**MetaDataOfContractToCreate**](MetaDataOfContractToCreate.md) |  |  |
|**externalId** | **String** | External Id. |  [optional] |
|**worker** | [**ContractToCreateSharedWorker**](ContractToCreateSharedWorker.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**startDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**compensationDetails** | [**ContractToCreateOngoingTimeBasedAllOfCompensationDetails**](ContractToCreateOngoingTimeBasedAllOfCompensationDetails.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAY_AS_YOU_GO_TIME_BASED | &quot;pay_as_you_go_time_based&quot; |
| PAYG_TASKS | &quot;payg_tasks&quot; |
| PAYG_MILESTONES | &quot;payg_milestones&quot; |
| ONGOING_TIME_BASED | &quot;ongoing_time_based&quot; |



