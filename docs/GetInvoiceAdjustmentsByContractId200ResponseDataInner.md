

# GetInvoiceAdjustmentsByContractId200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of this resource. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of invoice adjustment. |  |
|**scale** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of invoice adjustment |  |
|**contract** | [**GetTimesheetsByContract200ResponseDataInnerContract**](GetTimesheetsByContract200ResponseDataInnerContract.md) |  |  |
|**quantity** | **BigDecimal** |  |  |
|**worksheet** | [**GetTimesheetsByContract200ResponseDataInnerWorksheet**](GetTimesheetsByContract200ResponseDataInnerWorksheet.md) |  |  |
|**attachment** | [**AddContractDocument201ResponseData**](AddContractDocument201ResponseData.md) |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**invoiceId** | **BigDecimal** |  |  [optional] |
|**description** | **String** |  |  |
|**reportedBy** | [**GetTimesheetsByContract200ResponseDataInnerReportedBy**](GetTimesheetsByContract200ResponseDataInnerReportedBy.md) |  |  |
|**reviewedBy** | [**GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy**](GetInvoiceAdjustmentsByContractId200ResponseDataInnerReviewedBy.md) |  |  |
|**customScale** | **String** |  |  [optional] |
|**totalAmount** | **String** |  |  |
|**currencyCode** | **String** |  |  |
|**paymentCycle** | [**GetInvoiceAdjustmentsByContractId200ResponseDataInnerPaymentCycle**](GetInvoiceAdjustmentsByContractId200ResponseDataInnerPaymentCycle.md) |  |  |
|**dateSubmitted** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACCRUED_HOLIDAY | &quot;accrued_holiday&quot; |
| ADDITIONAL_FEE | &quot;additional_fee&quot; |
| ALLOWANCE | &quot;allowance&quot; |
| BONUS | &quot;bonus&quot; |
| COMMISSION | &quot;commission&quot; |
| DEDUCTION | &quot;deduction&quot; |
| DEPOSIT | &quot;deposit&quot; |
| DEPOSIT_REFUND | &quot;deposit_refund&quot; |
| EMPLOYER_COST | &quot;employer_cost&quot; |
| EXPENSE | &quot;expense&quot; |
| HEALTH_ALLOWANCE | &quot;health_allowance&quot; |
| HEALTH_BENEFIT | &quot;health_benefit&quot; |
| HEALTH_INSURANCE_FEE | &quot;health_insurance_fee&quot; |
| LEGAL_FEE | &quot;legal_fee&quot; |
| MANAGEMENT_FEE | &quot;management_fee&quot; |
| MILESTONE | &quot;milestone&quot; |
| OFFCYCLE | &quot;offcycle&quot; |
| OTHER | &quot;other&quot; |
| OVERTIME | &quot;overtime&quot; |
| PENSION | &quot;pension&quot; |
| PRO_RATA | &quot;pro_rata&quot; |
| SETUP_FEE | &quot;setup_fee&quot; |
| SEVERANCE | &quot;severance&quot; |
| SHIELD_SERVICE | &quot;shield_service&quot; |
| SIGNING_BONUS | &quot;signing_bonus&quot; |
| SIGNING_BONUS_EMPLOYER_COST | &quot;signing_bonus_employer_cost&quot; |
| REFUND | &quot;refund&quot; |
| TASK | &quot;task&quot; |
| TIME_OFF | &quot;time_off&quot; |
| VAT | &quot;vat&quot; |
| WITHHOLDING_TAX | &quot;withholding_tax&quot; |
| WORK | &quot;work&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |
| NOT_PAYABLE | &quot;not_payable&quot; |
| PAID | &quot;paid&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |



