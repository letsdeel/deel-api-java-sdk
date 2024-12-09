

# AmendContractDetailsRequest

You can specify any combination of data points that need changing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scale** | [**ScaleEnum**](#ScaleEnum) | Defines the scale at which the amount is paid. For example, enter &#39;hourly&#39; to define the amount per hour. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts. |  [optional] |
|**amount** | **BigDecimal** | Amount to be paid per scale. |  [optional] |
|**cycleEnd** | **BigDecimal** | Day of the month when the cycle ends. |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Scale of the invoice cycle. |  [optional] |
|**jobTitleId** | [**AmendContractDetailsRequestJobTitleId**](AmendContractDetailsRequestJobTitleId.md) |  |  [optional] |
|**seniorityId** | [**AmendContractDetailsRequestJobTitleId**](AmendContractDetailsRequestJobTitleId.md) |  |  [optional] |
|**currencyCode** | **String** | Currency code in ISO 4217 format. |  [optional] |
|**firstPayment** | **BigDecimal** | Amount to be paid as the first payment. |  [optional] |
|**scopeOfWork** | **String** | Text to describe the scope of work of the contract. |  [optional] |
|**cycleEndType** | [**CycleEndTypeEnum**](#CycleEndTypeEnum) | Cycle end can be weekly 1-7 (Monday &#x3D; 1) or monthly 1-31. |  [optional] |
|**effectiveDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**jobTitleName** | **String** | You can enter new job title. |  [optional] |
|**specialClause** | **String** | Text to describe any special clause in contract. |  [optional] |
|**paymentDueDays** | **BigDecimal** | Number of days after the invoice is sent that the payment is due. |  [optional] |
|**paymentDueType** | [**PaymentDueTypeEnum**](#PaymentDueTypeEnum) | Type of payment due. If the payment is due on the last day of month, enter &#39;WITHIN_MONTH&#39;. |  [optional] |
|**firstPaymentDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**payBeforeWeekends** | **Boolean** | If the payment due is on a weekend, pay on Friday. |  [optional] |



## Enum: ScaleEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;hourly&quot; |
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| BIWEEKLY | &quot;biweekly&quot; |
| SEMIMONTHLY | &quot;semimonthly&quot; |
| CUSTOM | &quot;custom&quot; |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| BIWEEKLY | &quot;biweekly&quot; |
| SEMIMONTHLY | &quot;semimonthly&quot; |
| CALENDAR_MONTH | &quot;calendar-month&quot; |



## Enum: CycleEndTypeEnum

| Name | Value |
|---- | -----|
| WEEK | &quot;DAY_OF_WEEK&quot; |
| LAST_WEEK | &quot;DAY_OF_LAST_WEEK&quot; |
| MONTH | &quot;DAY_OF_MONTH&quot; |



## Enum: PaymentDueTypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;REGULAR&quot; |
| WITHIN_MONTH | &quot;WITHIN_MONTH&quot; |



