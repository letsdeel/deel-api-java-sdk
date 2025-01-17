

# GetContractById200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the contract. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of a contract. |  |
|**quote** | [**GetContractById200ResponseDataQuote**](GetContractById200ResponseDataQuote.md) |  |  [optional] |
|**title** | **String** | Title of the contract. |  |
|**client** | [**GetContractById200ResponseDataClient**](GetContractById200ResponseDataClient.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of a contract in Deel workflow. |  |
|**worker** | [**GetContractById200ResponseDataWorker**](GetContractById200ResponseDataWorker.md) |  |  |
|**jobTitle** | **String** | Job title associated with the contract. |  [optional] |
|**seniority** | [**GetContractById200ResponseDataSeniority**](GetContractById200ResponseDataSeniority.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Date and time when the contract was created. |  |
|**signatures** | [**GetContractById200ResponseDataSignatures**](GetContractById200ResponseDataSignatures.md) |  |  |
|**startDate** | **OffsetDateTime** | Date and time when the contract starts. |  |
|**externalId** | **String** | External identifier of the contract. |  [optional] |
|**invitations** | [**GetContractById200ResponseDataInvitations**](GetContractById200ResponseDataInvitations.md) |  |  |
|**isArchived** | **Boolean** | Flag to indicate if the contract is archived. |  |
|**whoReports** | **String** | Who reports the hours. |  [optional] |
|**customFields** | [**List&lt;CreateContract201ResponseDataCustomFieldsInner&gt;**](CreateContract201ResponseDataCustomFieldsInner.md) |  |  [optional] |
|**noticePeriod** | **BigDecimal** | Notice period in days. |  [optional] |
|**scopeOfWork** | **String** | Scope of work of the contract. |  [optional] |
|**specialClause** | **String** | Special clause of the contract. |  |
|**terminationDate** | **String** | Date and time when the contract ends. |  |
|**contractTemplate** | [**GetContractById200ResponseDataContractTemplate**](GetContractById200ResponseDataContractTemplate.md) |  |  [optional] |
|**employmentDetails** | [**GetContractById200ResponseDataEmploymentDetails**](GetContractById200ResponseDataEmploymentDetails.md) |  |  |
|**compensationDetails** | [**GetContractById200ResponseDataCompensationDetails**](GetContractById200ResponseDataCompensationDetails.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ONGOING_TIME_BASED | &quot;ongoing_time_based&quot; |
| MILESTONES | &quot;milestones&quot; |
| TIME_BASED | &quot;time_based&quot; |
| PAY_AS_YOU_GO_TIME_BASED | &quot;pay_as_you_go_time_based&quot; |
| COMMISSION | &quot;commission&quot; |
| PAYG_MILESTONES | &quot;payg_milestones&quot; |
| PAYG_TASKS | &quot;payg_tasks&quot; |
| EOR | &quot;eor&quot; |
| UNKNOWN | &quot;unknown&quot; |
| EMPLOYEE | &quot;employee&quot; |
| GLOBAL_PAYROLL | &quot;global_payroll&quot; |
| SHIELD_MSA | &quot;shield_msa&quot; |
| HRIS_DIRECT_EMPLOYEE | &quot;hris_direct_employee&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;new&quot; |
| UNDER_REVIEW | &quot;under_review&quot; |
| WAITING_FOR_EMPLOYEE_CONTRACT | &quot;waiting_for_employee_contract&quot; |
| WAITING_FOR_CLIENT_SIGN | &quot;waiting_for_client_sign&quot; |
| PROCESSING_PAYMENT | &quot;processing_payment&quot; |
| WAITING_FOR_CONTRACTOR_SIGN | &quot;waiting_for_contractor_sign&quot; |
| WAITING_FOR_EOR_SIGN | &quot;waiting_for_eor_sign&quot; |
| WAITING_FOR_EMPLOYEE_SIGN | &quot;waiting_for_employee_sign&quot; |
| AWAITING_DEPOSIT_PAYMENT | &quot;awaiting_deposit_payment&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| CANCELLED | &quot;cancelled&quot; |
| USER_CANCELLED | &quot;user_cancelled&quot; |
| REJECTED | &quot;rejected&quot; |
| WAITING_FOR_CLIENT_PAYMENT | &quot;waiting_for_client_payment&quot; |



