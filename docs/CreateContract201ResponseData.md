

# CreateContract201ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The public UUID of the object |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of a contract |  |
|**quote** | [**CreateContract201ResponseDataQuote**](CreateContract201ResponseDataQuote.md) |  |  [optional] |
|**title** | **String** | Title of a contract |  |
|**client** | [**CreateContract201ResponseDataClient**](CreateContract201ResponseDataClient.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of a contract in Deel workflow |  |
|**worker** | [**CreateContract201ResponseDataWorker**](CreateContract201ResponseDataWorker.md) |  |  |
|**jobTitle** | **String** |  |  |
|**seniority** | [**CreateContract201ResponseDataSeniority**](CreateContract201ResponseDataSeniority.md) |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**signatures** | [**CreateContract201ResponseDataSignatures**](CreateContract201ResponseDataSignatures.md) |  |  |
|**startDate** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**externalId** | **String** | A unique identifier for the object provided by an external system. |  [optional] |
|**invitations** | [**CreateContract201ResponseDataInvitations**](CreateContract201ResponseDataInvitations.md) |  |  |
|**isArchived** | **Boolean** | Flag to indicate if the contract is archived |  |
|**whoReports** | [**WhoReportsEnum**](#WhoReportsEnum) | Flag to indicate who is supposed to provide regular reports |  [optional] |
|**customFields** | [**List&lt;CreateContract201ResponseDataCustomFieldsInner&gt;**](CreateContract201ResponseDataCustomFieldsInner.md) |  |  [optional] |
|**noticePeriod** | **BigDecimal** | Days before to notice the termination of contract for eather party. |  [optional] |
|**scopeOfWork** | **String** | Scope of work for the contract |  [optional] |
|**specialClause** | **String** | Special clause for the contract |  |
|**terminationDate** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**employmentDetails** | [**CreateContract201ResponseDataEmploymentDetails**](CreateContract201ResponseDataEmploymentDetails.md) |  |  |
|**compensationDetails** | [**CreateContract201ResponseDataCompensationDetails**](CreateContract201ResponseDataCompensationDetails.md) |  |  |



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



## Enum: WhoReportsEnum

| Name | Value |
|---- | -----|
| BOTH | &quot;both&quot; |
| CLIENT | &quot;client&quot; |
| CONTRACTOR | &quot;contractor&quot; |



