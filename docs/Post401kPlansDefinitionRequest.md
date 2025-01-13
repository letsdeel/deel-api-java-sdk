

# Post401kPlansDefinitionRequest

Schema for the 401K Guideline Plan request body.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the 401K plan. |  |
|**details** | [**Get401kPlansDefinition200ResponseInnerDetails**](Get401kPlansDefinition200ResponseInnerDetails.md) |  |  [optional] |
|**startDate** | **LocalDate** | Start date of the plan. |  |
|**contributionType** | [**ContributionTypeEnum**](#ContributionTypeEnum) | Type of contribution for the 401K plan. |  |
|**contributionValue** | **BigDecimal** | Value of the contribution if type is percent or amount. |  [optional] |
|**contributionValueForMatchRate** | [**List&lt;Post401kPlansDefinitionRequestContributionValueForMatchRateInner&gt;**](Post401kPlansDefinitionRequestContributionValueForMatchRateInner.md) | Array of objects containing limits and rates for match rate contribution type. |  [optional] |



## Enum: ContributionTypeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| NEC_PERCENTAGE | &quot;NEC_PERCENTAGE&quot; |
| NEC_FIXED_AMOUNT | &quot;NEC_FIXED_AMOUNT&quot; |
| FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot; |
| MATCH | &quot;MATCH&quot; |



