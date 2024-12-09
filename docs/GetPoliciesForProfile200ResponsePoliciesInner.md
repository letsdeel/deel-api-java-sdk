

# GetPoliciesForProfile200ResponsePoliciesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Policy id. |  |
|**name** | **String** | Policy name. |  |
|**createdAt** | **OffsetDateTime** | Policy creation date. |  |
|**leaveType** | [**LeaveTypeEnum**](#LeaveTypeEnum) | Leave type. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Policy update date. |  |
|**description** | **String** | Policy description. |  [optional] |
|**policyType** | [**GetPoliciesForProfile200ResponsePoliciesInnerPolicyType**](GetPoliciesForProfile200ResponsePoliciesInnerPolicyType.md) |  |  [optional] |
|**trackingUnit** | [**TrackingUnitEnum**](#TrackingUnitEnum) | Tracking unit. |  [optional] |
|**policyTypeId** | **UUID** | Policy type id. |  [optional] |
|**timeOffTypes** | [**List&lt;GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner&gt;**](GetPoliciesForProfile200ResponsePoliciesInnerTimeOffTypesInner.md) |  |  [optional] |
|**trackingCadence** | [**TrackingCadenceEnum**](#TrackingCadenceEnum) | Tracking cadence. |  [optional] |
|**trackingStartDate** | **OffsetDateTime** | Tracking start date. |  [optional] |
|**trackingUnitAmount** | **Float** | Tracking unit amount. |  [optional] |



## Enum: LeaveTypeEnum

| Name | Value |
|---- | -----|
| SHORT_TERM_LEAVE | &quot;SHORT_TERM_LEAVE&quot; |
| LONG_TERM_LEAVE | &quot;LONG_TERM_LEAVE&quot; |



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


