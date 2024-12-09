

# CreateGPContract201ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id of the contract created. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of a contract |  [optional] |
|**client** | [**CreateGPContract201ResponseDataClient**](CreateGPContract201ResponseDataClient.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of a contract in Deel workflow |  [optional] |
|**employee** | [**CreateGPContract201ResponseDataEmployee**](CreateGPContract201ResponseDataEmployee.md) |  |  [optional] |
|**jobTitle** | **String** | Employee&#39;s job title. |  [optional] |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**employment** | [**CreateGPContract201ResponseDataEmployment**](CreateGPContract201ResponseDataEmployment.md) |  |  [optional] |
|**compensationDetails** | [**CreateGPContract201ResponseDataCompensationDetails**](CreateGPContract201ResponseDataCompensationDetails.md) |  |  [optional] |



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
| PEO | &quot;peo&quot; |



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
| ONBOARDING | &quot;onboarding&quot; |


