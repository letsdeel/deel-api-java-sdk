

# GetCustomFieldFromContractsById200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Custom field id |  [optional] |
|**name** | **String** | Name of the custom field |  [optional] |
|**type** | [**GetCustomFieldFromPeopleById200ResponseDataType**](GetCustomFieldFromPeopleById200ResponseDataType.md) |  |  [optional] |
|**settings** | [**GetCustomFieldFromPeopleById200ResponseDataSettings**](GetCustomFieldFromPeopleById200ResponseDataSettings.md) |  |  [optional] |
|**placement** | [**PlacementEnum**](#PlacementEnum) | Valid placements for custom field |  [optional] |
|**createdAt** | **LocalDate** | Creation date of the custom field |  [optional] |
|**description** | **String** | Description of the custom field |  [optional] |



## Enum: PlacementEnum

| Name | Value |
|---- | -----|
| PROFILE | &quot;profile&quot; |
| CONTRACT | &quot;contract&quot; |



