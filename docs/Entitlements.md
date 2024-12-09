

# Entitlements


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**trackingPeriod** | **String** |  |  [optional] |
|**trackingPeriodEndDate** | **String** |  |  [optional] |
|**accrued** | **String** |  |  [optional] |
|**balanceAdjusted** | **String** |  |  [optional] |
|**allowance** | **String** |  |  [optional] |
|**available** | **String** |  |  [optional] |
|**approved** | **String** |  |  [optional] |
|**expired** | **String** |  |  [optional] |
|**requested** | **String** |  |  [optional] |
|**rollovers** | [**List&lt;EntitlementsRolloversInner&gt;**](EntitlementsRolloversInner.md) |  |  [optional] |
|**used** | **String** |  |  [optional] |
|**totalEntitlements** | **String** |  |  [optional] |
|**upcomingAccruals** | **String** |  |  [optional] |
|**accrualAmount** | **String** |  |  [optional] |
|**accrualUnit** | [**AccrualUnitEnum**](#AccrualUnitEnum) |  |  [optional] |
|**pastTrackingPeriods** | **List&lt;String&gt;** |  |  [optional] |
|**timeOffEventId** | **String** |  |  [optional] |
|**policy** | [**EntitlementsPolicy**](EntitlementsPolicy.md) |  |  [optional] |
|**futureEvents** | [**List&lt;EntitlementsFutureEventsInner&gt;**](EntitlementsFutureEventsInner.md) |  |  [optional] |



## Enum: AccrualUnitEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| BUSINESS_DAY | &quot;BUSINESS_DAY&quot; |
| CALENDAR_DAY | &quot;CALENDAR_DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



