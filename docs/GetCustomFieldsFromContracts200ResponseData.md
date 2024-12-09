

# GetCustomFieldsFromContracts200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the custom field |  [optional] |
|**name** | **String** | Name of the custom field |  [optional] |
|**type** | [**GetCustomFieldsFromPeople200ResponseDataType**](GetCustomFieldsFromPeople200ResponseDataType.md) |  |  [optional] |
|**settings** | [**GetCustomFieldsFromContracts200ResponseDataSettings**](GetCustomFieldsFromContracts200ResponseDataSettings.md) |  |  [optional] |
|**placement** | [**PlacementEnum**](#PlacementEnum) | Valid placements for custom field |  [optional] |
|**createdAt** | **LocalDate** | Creation date of the custom field |  [optional] |
|**description** | **String** | Description of the custom field |  [optional] |



## Enum: PlacementEnum

| Name | Value |
|---- | -----|
| PROFILE | &quot;profile&quot; |
| CONTRACT | &quot;contract&quot; |



