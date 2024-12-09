

# GetContractList200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | UUID of the contract. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of a contract. |  |
|**scale** | **String** | The payment scale (e.g., hourly, weekly, monthly, etc.). |  [optional] |
|**title** | **String** | Title of the contract. |  |
|**client** | [**GetContractList200ResponseDataInnerClient**](GetContractList200ResponseDataInnerClient.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of a contract in Deel workflow. |  |
|**worker** | [**GetContractList200ResponseDataInnerWorker**](GetContractList200ResponseDataInnerWorker.md) |  |  |
|**createdAt** | **OffsetDateTime** | Timestamp when the contract was created, in ISO-8601 format. |  |
|**signatures** | [**GetContractList200ResponseDataInnerSignatures**](GetContractList200ResponseDataInnerSignatures.md) |  |  |
|**externalId** | **String** | A unique identifier for the object provided by an external system. |  [optional] |
|**invitations** | [**GetContractList200ResponseDataInnerInvitations**](GetContractList200ResponseDataInnerInvitations.md) |  |  |
|**isArchived** | **Boolean** | Indicates whether the contract is archived. |  |
|**isShielded** | **Boolean** | Indicates whether the contract is shielded. |  |
|**whoReports** | [**WhoReportsEnum**](#WhoReportsEnum) | Indicates who is responsible for providing regular reports. |  [optional] |
|**noticePeriod** | **BigDecimal** | Number of days required to give notice before terminating the contract. |  [optional] |
|**terminationDate** | **OffsetDateTime** | Date when the contract is terminated, in ISO-8601 format. |  |



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



