

# CustomFieldsObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** | Name of the custom field |  [optional] |
|**type** | [**CustomFieldsObjectType**](CustomFieldsObjectType.md) |  |  [optional] |
|**settings** | [**CustomFieldsObjectSettings**](CustomFieldsObjectSettings.md) |  |  [optional] |
|**createdAt** | **LocalDate** | Creation date of the custom field |  [optional] |
|**placement** | [**PlacementEnum**](#PlacementEnum) | Valid placements for custom field |  [optional] |
|**description** | **String** | Description of the custom field |  [optional] |



## Enum: PlacementEnum

| Name | Value |
|---- | -----|
| PROFILE | &quot;profile&quot; |
| CONTRACT | &quot;contract&quot; |



