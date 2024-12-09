

# GetPayStub200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**SourceEnum**](#SourceEnum) | Source of the payroll data. |  [optional] |
|**employees** | [**List&lt;GetPayStub200ResponseDataInnerEmployeesInner&gt;**](GetPayStub200ResponseDataInnerEmployeesInner.md) | List of employees included in the payroll. |  [optional] |
|**payrollId** | **String** | Unique identifier for the payroll. |  [optional] |
|**paymentDate** | **String** | Date when the payment is made. |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Type of payroll payment. |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | Current status of the payroll payment. |  [optional] |
|**payrollEndDate** | **String** | End date of the payroll period. |  [optional] |
|**payrollSchedule** | [**PayrollScheduleEnum**](#PayrollScheduleEnum) | Frequency of the payroll schedule. |  [optional] |
|**payrollStartDate** | **String** | Start date of the payroll period. |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| HISTORICAL | &quot;HISTORICAL&quot; |
| NEW | &quot;NEW&quot; |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| RECONCILIATION | &quot;RECONCILIATION&quot; |
| PARALLEL | &quot;PARALLEL&quot; |
| HISTORICAL | &quot;HISTORICAL&quot; |
| OFFCYCLE | &quot;OFFCYCLE&quot; |
| REGULAR | &quot;REGULAR&quot; |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| LOCKED | &quot;LOCKED&quot; |
| CLOSED | &quot;CLOSED&quot; |



## Enum: PayrollScheduleEnum

| Name | Value |
|---- | -----|
| BIMONTHLY | &quot;BIMONTHLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| BIWEEKLY | &quot;BIWEEKLY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |



