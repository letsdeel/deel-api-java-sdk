

# Put401kPlansDefinitionRequest

Schema for the 401K Guideline Plan request body.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the 401K plan. |  [optional] |
|**details** | [**Put401kPlansDefinitionRequestDetails**](Put401kPlansDefinitionRequestDetails.md) |  |  [optional] |
|**startDate** | **LocalDate** | Start date of the plan. |  [optional] |
|**contributionType** | [**ContributionTypeEnum**](#ContributionTypeEnum) | Type of contribution for the 401K plan. |  [optional] |
|**contributionValue** | **BigDecimal** | Value of the contribution if type is percent or amount. |  [optional] |
|**contributionValueForMatchRate** | [**List&lt;Put401kPlansDefinitionRequestContributionValueForMatchRateInner&gt;**](Put401kPlansDefinitionRequestContributionValueForMatchRateInner.md) | Array of objects containing limits and rates for match rate contribution type. |  [optional] |



## Enum: ContributionTypeEnum

| Name | Value |
|---- | -----|
| NEC_PERCENTAGE | &quot;NEC_PERCENTAGE&quot; |
| NEC_FIXED_AMOUNT | &quot;NEC_FIXED_AMOUNT&quot; |
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot; |
| MATCH | &quot;MATCH&quot; |



