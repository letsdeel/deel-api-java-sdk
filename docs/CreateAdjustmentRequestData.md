

# CreateAdjustmentRequestData

Details of adjustment to create

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_file** | **File** | File of adjustment. |  |
|**title** | **String** | Title of adjustment. |  |
|**amount** | [**CreateAdjustmentRequestDataAmount**](CreateAdjustmentRequestDataAmount.md) |  |  |
|**vendor** | **String** | Vendor of adjustment. |  |
|**country** | **String** | Country code. |  |
|**contractId** | **String** | The identifier of the contract associated with the adjustment |  |
|**description** | **String** | Description of adjustment. |  |
|**cycleReference** | **String** | Cycle reference of adjustment. |  [optional] |
|**moveNextCycle** | **Boolean** | If an adjustments can belong to another payroll cycle. |  [optional] |
|**dateOfAdjustment** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**adjustmentCategoryId** | **String** | Adjustment category id. |  |



