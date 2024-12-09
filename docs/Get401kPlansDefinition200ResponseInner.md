

# Get401kPlansDefinition200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the 401K plan. |  [optional] |
|**name** | **String** | Name of the 401K plan. |  [optional] |
|**details** | [**Get401kPlansDefinition200ResponseInnerDetails**](Get401kPlansDefinition200ResponseInnerDetails.md) |  |  [optional] |
|**startDate** | **LocalDate** | Start date of the plan. |  [optional] |
|**contributionType** | [**ContributionTypeEnum**](#ContributionTypeEnum) | Type of contribution for the 401K plan. |  [optional] |
|**contributionValue** | **BigDecimal** | Value of the contribution if type is percent or amount. |  [optional] |
|**contributionValueForMatchRate** | [**List&lt;Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner&gt;**](Get401kPlansDefinition200ResponseInnerContributionValueForMatchRateInner.md) | Array of objects containing limits and rates for match rate contribution type. |  [optional] |



## Enum: ContributionTypeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot; |
| MATCH | &quot;MATCH&quot; |



