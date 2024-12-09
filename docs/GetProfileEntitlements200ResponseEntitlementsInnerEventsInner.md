

# GetProfileEntitlements200ResponseEntitlementsInnerEventsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Event ID |  |
|**type** | [**TypeEnum**](#TypeEnum) | Event type |  |
|**amount** | **Float** | Event amount |  |
|**policyId** | **UUID** | Policy ID |  |
|**createdAt** | **OffsetDateTime** | Event creation date |  |
|**eventDate** | **OffsetDateTime** | Event date |  [optional] |
|**profileId** | **UUID** | Profile ID |  |
|**updatedAt** | **OffsetDateTime** | Event update date |  |
|**description** | **String** | Event description |  [optional] |
|**timeOffId** | **UUID** | Time off ID |  [optional] |
|**accrualDate** | **OffsetDateTime** | Accrual date |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration date |  [optional] |
|**trackingPeriod** | **OffsetDateTime** | Tracking period |  |
|**rolloverTrackingPeriod** | **OffsetDateTime** | Rollover tracking period |  [optional] |



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



