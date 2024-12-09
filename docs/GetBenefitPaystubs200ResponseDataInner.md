

# GetBenefitPaystubs200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employees** | [**List&lt;GetBenefitPaystubs200ResponseDataInnerEmployeesInner&gt;**](GetBenefitPaystubs200ResponseDataInnerEmployeesInner.md) | List of employees associated with the payroll. |  [optional] |
|**payrollId** | **String** | Unique identifier for the payroll. |  [optional] |
|**paymentDate** | **String** | Payment date. |  [optional] |
|**payrollType** | **String** | Payroll type. |  [optional] |
|**payrollState** | [**PayrollStateEnum**](#PayrollStateEnum) | Payroll state. |  [optional] |
|**payrollEndDate** | **String** | Payroll end date. |  [optional] |
|**payrollSchedule** | [**PayrollScheduleEnum**](#PayrollScheduleEnum) | Payroll cycle type. |  [optional] |
|**payrollStartDate** | **String** | Payroll start date. |  [optional] |



## Enum: PayrollStateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| LOCKED | &quot;LOCKED&quot; |
| CLOSED | &quot;CLOSED&quot; |



## Enum: PayrollScheduleEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| BIMONTHLY | &quot;BIMONTHLY&quot; |
| CUSTOM | &quot;CUSTOM&quot; |
| BIWEEKLY | &quot;BIWEEKLY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |



