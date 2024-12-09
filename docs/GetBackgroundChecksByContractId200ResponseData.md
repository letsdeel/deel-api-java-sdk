

# GetBackgroundChecksByContractId200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Id of the background check. |  [optional] |
|**name** | **String** | Name of the background check. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the background check. |  [optional] |
|**_package** | [**GetBackgroundChecksByContractId200ResponseDataPackage**](GetBackgroundChecksByContractId200ResponseDataPackage.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**isComplete** | **Boolean** | Whether the background check is complete. |  [optional] |
|**completedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**thirdPartyName** | **String** | Third-party name of the background check. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING_CONTRACTOR_SIGNATURE | &quot;WAITING_CONTRACTOR_SIGNATURE&quot; |
| READY_TO_BE_REQUESTED | &quot;READY_TO_BE_REQUESTED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DRAFT | &quot;DRAFT&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| CANCELLED | &quot;CANCELLED&quot; |


