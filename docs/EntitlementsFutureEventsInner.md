

# EntitlementsFutureEventsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**profileId** | **UUID** |  |  [optional] |
|**policyId** | **UUID** |  |  [optional] |
|**timeOffId** | **UUID** |  |  [optional] |
|**trackingPeriod** | **OffsetDateTime** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**amount** | **Float** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACCRUAL | &quot;ACCRUAL&quot; |
| ACCRUAL_DEDUCTION | &quot;ACCRUAL_DEDUCTION&quot; |
| ACCRUAL_PRORATE | &quot;ACCRUAL_PRORATE&quot; |
| ACCRUAL_TERMINATION | &quot;ACCRUAL_TERMINATION&quot; |
| MANUAL_ADJUSTMENT | &quot;MANUAL_ADJUSTMENT&quot; |
| NO_ROLLOVER | &quot;NO_ROLLOVER&quot; |
| ROLLOVER_ADJUSTMENT | &quot;ROLLOVER_ADJUSTMENT&quot; |
| ROLLOVER_CARRY_OVER | &quot;ROLLOVER_CARRY_OVER&quot; |
| ROLLOVER_EXPIRATION | &quot;ROLLOVER_EXPIRATION&quot; |
| ROLLOVER_PAYOUT | &quot;ROLLOVER_PAYOUT&quot; |
| ROLLOVER_PROJECTED | &quot;ROLLOVER_PROJECTED&quot; |
| TIME_OFF | &quot;TIME_OFF&quot; |



