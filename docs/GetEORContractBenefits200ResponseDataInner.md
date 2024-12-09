

# GetEORContractBenefits200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the benefit. |  [optional] |
|**name** | **String** | The name of the benefit. |  [optional] |
|**plan** | [**GetEORContractBenefits200ResponseDataInnerPlan**](GetEORContractBenefits200ResponseDataInnerPlan.md) |  |  [optional] |
|**provider** | [**GetEORContractBenefits200ResponseDataInnerProvider**](GetEORContractBenefits200ResponseDataInnerProvider.md) |  |  [optional] |
|**offerStatus** | [**OfferStatusEnum**](#OfferStatusEnum) | Indicates whether the benefit is offered. |  [optional] |
|**enrollmentDetails** | [**GetEORContractBenefits200ResponseDataInnerEnrollmentDetails**](GetEORContractBenefits200ResponseDataInnerEnrollmentDetails.md) |  |  [optional] |



## Enum: OfferStatusEnum

| Name | Value |
|---- | -----|
| OFFERED | &quot;Offered&quot; |
| NOT_OFFERED | &quot;Not offered&quot; |



