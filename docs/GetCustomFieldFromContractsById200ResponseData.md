

# GetCustomFieldFromContractsById200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Custom field id |  [optional] |
|**name** | **String** | Name of the custom field |  [optional] |
|**type** | [**GetCustomFieldFromContractsById200ResponseDataType**](GetCustomFieldFromContractsById200ResponseDataType.md) |  |  [optional] |
|**settings** | [**GetCustomFieldFromContractsById200ResponseDataSettings**](GetCustomFieldFromContractsById200ResponseDataSettings.md) |  |  [optional] |
|**placement** | [**PlacementEnum**](#PlacementEnum) | Valid placements for custom field |  [optional] |
|**createdAt** | **LocalDate** | Creation date of the custom field |  [optional] |
|**description** | **String** | Description of the custom field |  [optional] |



## Enum: PlacementEnum

| Name | Value |
|---- | -----|
| PROFILE | &quot;profile&quot; |
| CONTRACT | &quot;contract&quot; |



