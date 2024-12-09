

# GetTimesheets200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of this resource. |  |
|**type** | **String** | Deprecated - it is always \&quot;work\&quot; |  |
|**scale** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of invoice adjustment |  |
|**contract** | [**GetTimesheets200ResponseDataInnerContract**](GetTimesheets200ResponseDataInnerContract.md) |  |  |
|**quantity** | **BigDecimal** |  |  |
|**worksheet** | [**GetTimesheets200ResponseDataInnerWorksheet**](GetTimesheets200ResponseDataInnerWorksheet.md) |  |  |
|**attachment** | [**GetTimesheets200ResponseDataInnerAttachment**](GetTimesheets200ResponseDataInnerAttachment.md) |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**description** | **String** |  |  |
|**reportedBy** | [**GetTimesheets200ResponseDataInnerReportedBy**](GetTimesheets200ResponseDataInnerReportedBy.md) |  |  |
|**reviewedBy** | [**GetTimesheets200ResponseDataInnerReviewedBy**](GetTimesheets200ResponseDataInnerReviewedBy.md) |  |  |
|**customScale** | **String** |  |  [optional] |
|**totalAmount** | **String** | is equal to quantity times rate of active work statement + bonus in this record |  |
|**currencyCode** | **String** |  |  |
|**paymentCycle** | [**GetTimesheets200ResponseDataInnerPaymentCycle**](GetTimesheets200ResponseDataInnerPaymentCycle.md) |  |  [optional] |
|**dateSubmitted** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |
| NOT_PAYABLE | &quot;not_payable&quot; |
| PAID | &quot;paid&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |



