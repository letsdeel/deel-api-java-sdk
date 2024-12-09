

# CreateAdjustment201ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the adjustment |  [optional] |
|**_file** | [**CreateAdjustment201ResponseDataFile**](CreateAdjustment201ResponseDataFile.md) |  |  [optional] |
|**title** | **String** | The title of the adjustment |  [optional] |
|**amount** | **String** | The amount of the adjustment |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Adjustment status |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the adjustment was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | The date and time when the adjustment was last updated |  [optional] |
|**contractId** | **String** | The identifier of the contract associated with the adjustment |  [optional] |
|**description** | **String** | The description of the adjustment |  [optional] |
|**cycleReference** | **String** | The reference to the cycle associated with the adjustment |  [optional] |
|**moveNextCycle** | **Boolean** | If an adjustments can belong to another payroll cycle |  [optional] |
|**dateOfAdjustment** | **LocalDate** | The date of the adjustment |  [optional] |
|**actualEndCycleDate** | **String** | The date of the actual end cycle date |  [optional] |
|**adjustmentCategoryId** | **String** | The identifier of the adjustment category associated with the adjustment |  [optional] |
|**actualStartCycleDate** | **String** | The date of the actual start cycle date |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| PENDING_APPROVAL | &quot;pending_approval&quot; |
| OVERWRITTEN | &quot;overwritten&quot; |
| FAILED | &quot;failed&quot; |
| SUCCESS | &quot;success&quot; |



