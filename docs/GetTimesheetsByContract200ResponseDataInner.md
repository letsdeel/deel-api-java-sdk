

# GetTimesheetsByContract200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**CreateEorContractRequestClientTeamId**](CreateEorContractRequestClientTeamId.md) |  |  |
|**type** | **String** | Deprecated - it is always \&quot;work\&quot; |  |
|**scale** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of this entry. |  |
|**contract** | [**GetTimesheetsByContract200ResponseDataInnerContract**](GetTimesheetsByContract200ResponseDataInnerContract.md) |  |  |
|**quantity** | **BigDecimal** |  |  |
|**worksheet** | [**GetTimesheetsByContract200ResponseDataInnerWorksheet**](GetTimesheetsByContract200ResponseDataInnerWorksheet.md) |  |  |
|**attachment** | [**AddContractDocument201ResponseData**](AddContractDocument201ResponseData.md) |  |  |
|**createdAt** | **String** |  |  |
|**description** | **String** |  |  |
|**reportedBy** | [**GetTimesheetsByContract200ResponseDataInnerReportedBy**](GetTimesheetsByContract200ResponseDataInnerReportedBy.md) |  |  |
|**reviewedBy** | [**GetTimesheetsByContract200ResponseDataInnerReviewedBy**](GetTimesheetsByContract200ResponseDataInnerReviewedBy.md) |  |  |
|**customScale** | **String** |  |  [optional] |
|**totalAmount** | **String** | is equal to quantity times rate of active work statement + bonus in this record |  |
|**currencyCode** | **String** |  |  |
|**paymentCycle** | [**GetTimesheetsByContract200ResponseDataInnerPaymentCycle**](GetTimesheetsByContract200ResponseDataInnerPaymentCycle.md) |  |  [optional] |
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



