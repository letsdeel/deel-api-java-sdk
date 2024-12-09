

# InvoiceAdjustment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of this resource. |  |
|**type** | **InvoiceAdjustmentTypeEnum** |  |  |
|**status** | **InvoiceAdjustmentStatusEnum** |  |  |
|**description** | **String** |  |  |
|**dateSubmitted** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**currencyCode** | **String** |  |  |
|**invoiceId** | **BigDecimal** |  |  [optional] |
|**quantity** | **BigDecimal** |  |  |
|**totalAmount** | **String** |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**scale** | **String** |  |  [optional] |
|**customScale** | **String** |  |  [optional] |
|**attachment** | [**FileAttachmentInfo**](FileAttachmentInfo.md) |  |  |
|**worksheet** | [**BasicTimesheetWorksheet**](BasicTimesheetWorksheet.md) |  |  |
|**reviewedBy** | [**BasicTimesheetReviewedBy**](BasicTimesheetReviewedBy.md) |  |  |
|**contract** | [**BasicTimesheetContract**](BasicTimesheetContract.md) |  |  |
|**paymentCycle** | [**BasicInvoiceAdjustmentPaymentCycle**](BasicInvoiceAdjustmentPaymentCycle.md) |  |  |
|**reportedBy** | [**BasicTimesheetReportedBy**](BasicTimesheetReportedBy.md) |  |  |
|**approvers** | [**List&lt;InvoiceAdjustmentApprover&gt;**](InvoiceAdjustmentApprover.md) |  |  |



