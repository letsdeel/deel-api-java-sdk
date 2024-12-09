

# CreateTaskManyReviewRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;UUID&gt;** | An array of task IDs to review. A maximum of 1000 task IDs is allowed per request. |  |
|**reason** | **String** | Optional reason for declining the tasks. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The review status of the tasks. Possible values are &#39;approved&#39; or &#39;declined&#39;. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |



