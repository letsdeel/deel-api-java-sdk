

# GetLegalEntityPayrollSettings200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the legal entity. |  [optional] |
|**cycleType** | [**CycleTypeEnum**](#CycleTypeEnum) | Defines the payroll cycle type. |  [optional] |
|**firstPayrollStartDate** | **LocalDate** | The start date of the first payroll. |  [optional] |
|**payrollProcessingLeadTimeDays** | **Integer** | The number of days required to process payroll. |  [optional] |



## Enum: CycleTypeEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;WEEKLY&quot; |
| BIWEEKLY | &quot;BIWEEKLY&quot; |
| BIMONTHLY | &quot;BIMONTHLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |



