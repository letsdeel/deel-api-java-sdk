

# CreateContractRequestAnyOf1AllOfCompensationDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **BigDecimal** | Amount to be paid. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts. |  [optional] |
|**cycleEnd** | **BigDecimal** | Date invoice cycle ends. |  |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Scale of the invoice cycle. |  |
|**currencyCode** | **String** | Currency code. |  |
|**firstPayment** | **BigDecimal** | First payment amount. |  [optional] |
|**noticePeriod** | **BigDecimal** | Days before to notice the termination of contract for eather party. |  [optional] |
|**cycleEndType** | [**CycleEndTypeEnum**](#CycleEndTypeEnum) | Cycle end can be weekly 1-7 (Monday &#x3D; 1) or monthly 1-31. |  |
|**paymentDueDays** | **BigDecimal** | Number of days to pay the invoice. |  |
|**paymentDueType** | [**PaymentDueTypeEnum**](#PaymentDueTypeEnum) | Type of payment due. If the payment is due on the last day of month, enter &#39;WITHIN_MONTH&#39;. |  |
|**firstPaymentDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**payBeforeWeekends** | **Boolean** | If the payment due is on a weekend, pay on Friday. |  [optional] |



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



