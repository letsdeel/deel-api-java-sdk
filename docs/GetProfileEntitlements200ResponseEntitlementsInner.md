

# GetProfileEntitlements200ResponseEntitlementsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Entitlement ID |  [optional] |
|**used** | **String** | Used time off |  [optional] |
|**events** | [**List&lt;GetProfileEntitlements200ResponseEntitlementsInnerEventsInner&gt;**](GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.md) |  |  [optional] |
|**policy** | [**GetProfileEntitlements200ResponseEntitlementsInnerPolicy**](GetProfileEntitlements200ResponseEntitlementsInnerPolicy.md) |  |  [optional] |
|**accrued** | **String** | Accrued time off |  [optional] |
|**expired** | **String** | Expired time off |  [optional] |
|**approved** | **String** | Approved time off |  [optional] |
|**allowance** | **String** | Time off allowance |  [optional] |
|**available** | **String** | Available time off |  [optional] |
|**requested** | **String** | Requested time off |  [optional] |
|**rollovers** | [**List&lt;GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner&gt;**](GetProfileEntitlements200ResponseEntitlementsInnerRolloversInner.md) |  |  [optional] |
|**accrualUnit** | [**AccrualUnitEnum**](#AccrualUnitEnum) | Accrual unit |  [optional] |
|**futureEvents** | [**List&lt;GetProfileEntitlements200ResponseEntitlementsInnerEventsInner&gt;**](GetProfileEntitlements200ResponseEntitlementsInnerEventsInner.md) |  |  [optional] |
|**accrualAmount** | **String** | Accrual amount |  [optional] |
|**trackingPeriod** | **String** | Tracking period |  |
|**balanceAdjusted** | **String** | Balance adjusted |  [optional] |
|**timeOffEventId** | **String** | Time off event ID |  [optional] |
|**upcomingAccruals** | **String** | Upcoming accruals |  [optional] |
|**totalEntitlements** | **String** | Total entitlements |  |
|**pastTrackingPeriods** | **List&lt;String&gt;** |  |  [optional] |
|**trackingPeriodEndDate** | **String** | Tracking period end date |  |



## Enum: AccrualUnitEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| BUSINESS_DAY | &quot;BUSINESS_DAY&quot; |
| CALENDAR_DAY | &quot;CALENDAR_DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



