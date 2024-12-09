

# UpdateGPEmployeeCompensation200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scale** | [**ScaleEnum**](#ScaleEnum) | The scale to which a given salary applies. |  [optional] |
|**salary** | **BigDecimal** | Compensation salary. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of a salary amendment. |  [optional] |
|**effectiveDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |



## Enum: ScaleEnum

| Name | Value |
|---- | -----|
| YEAR | &quot;YEAR&quot; |
| MONTH | &quot;MONTH&quot; |
| HOUR | &quot;HOUR&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| UPCOMING | &quot;UPCOMING&quot; |
| OUTDATED | &quot;OUTDATED&quot; |



