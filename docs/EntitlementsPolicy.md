

# EntitlementsPolicy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**policyTypeId** | **UUID** |  |  [optional] |
|**trackingUnit** | [**TrackingUnitEnum**](#TrackingUnitEnum) |  |  [optional] |
|**trackingUnitAmount** | **Float** |  |  [optional] |
|**trackingCadence** | [**TrackingCadenceEnum**](#TrackingCadenceEnum) |  |  [optional] |
|**trackingStartDate** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**leaveType** | [**LeaveTypeEnum**](#LeaveTypeEnum) |  |  [optional] |
|**timeOffTypes** | [**List&lt;EntitlementsPolicyTimeOffTypesInner&gt;**](EntitlementsPolicyTimeOffTypesInner.md) |  |  [optional] |
|**policyType** | [**GetPoliciesForProfile200ResponsePoliciesInnerPolicyType**](GetPoliciesForProfile200ResponsePoliciesInnerPolicyType.md) |  |  [optional] |



## Enum: TrackingUnitEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| BUSINESS_DAY | &quot;BUSINESS_DAY&quot; |
| CALENDAR_DAY | &quot;CALENDAR_DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



## Enum: TrackingCadenceEnum

| Name | Value |
|---- | -----|
| FIXED_DAY | &quot;FIXED_DAY&quot; |
| ANNIVERSARY | &quot;ANNIVERSARY&quot; |



## Enum: LeaveTypeEnum

| Name | Value |
|---- | -----|
| SHORT_TERM_LEAVE | &quot;SHORT_TERM_LEAVE&quot; |
| LONG_TERM_LEAVE | &quot;LONG_TERM_LEAVE&quot; |



