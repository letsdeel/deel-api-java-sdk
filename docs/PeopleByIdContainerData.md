

# PeopleByIdContainerData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the employee. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation timestamp of the employee record. |  [optional] |
|**firstName** | **String** | The first name of the employee. |  [optional] |
|**lastName** | **String** | The last name of the employee. |  [optional] |
|**fullName** | **String** | The full name of the employee. |  [optional] |
|**workerId** | **BigDecimal** | The worker ID of the employee. |  [optional] |
|**externalId** | **String** | The external ID of the employee. |  [optional] |
|**terminationLastDay** | **LocalDate** | The last day of work mentioned on the termination. |  [optional] |
|**preferredFirstName** | **String** | The preferred first name of the employee. |  [optional] |
|**preferredLastName** | **String** | The preferred last name of the employee. |  [optional] |
|**addresses** | [**List&lt;Address&gt;**](Address.md) |  |  [optional] |
|**emails** | [**List&lt;Email&gt;**](Email.md) | An array of the employee&#39;s email addresses. |  [optional] |
|**birthDate** | **String** | The birth date of the employee. |  [optional] |
|**startDate** | **LocalDate** | The date the employee started working. |  [optional] |
|**nationalities** | **List&lt;String&gt;** | The nationality of the employee. |  [optional] |
|**clientLegalEntity** | [**PeopleClientLegalEntity**](PeopleClientLegalEntity.md) |  |  [optional] |
|**state** | **String** | The state of the employee. |  [optional] |
|**seniority** | **String** | The seniority level of the employee. |  [optional] |
|**completionDate** | **String** | The completion date of the task or project. |  [optional] |
|**directManager** | [**EmployeeDirectManager**](EmployeeDirectManager.md) |  |  [optional] |
|**directReports** | [**List&lt;GetPeopleList200ResponseDataInnerDirectReportsInner&gt;**](GetPeopleList200ResponseDataInnerDirectReportsInner.md) | The direct reports to the employee. |  [optional] |
|**directReportsCount** | **Integer** | The count of direct reports to the employee. |  [optional] |
|**workerRelations** | [**List&lt;WorkerRelations&gt;**](WorkerRelations.md) | when parameter IncludeWorkerRelations &#x3D; true |  [optional] |
|**customFieldValues** | [**List&lt;CustomFieldValue&gt;**](CustomFieldValue.md) | when parameter include_custom_fields &#x3D; true |  [optional] |
|**employments** | [**List&lt;EmploymentDetail&gt;**](EmploymentDetail.md) |  |  [optional] |
|**hiringStatus** | **String** | The current hiring status of the employee. |  [optional] |
|**newHiringStatus** | **String** | The new hiring status of the employee. |  [optional] |
|**hiringType** | **String** | The type of hiring of the employee. |  [optional] |
|**jobTitle** | **String** | The job title of the employee. |  [optional] |
|**country** | **String** | The country of the employee. |  [optional] |
|**timezone** | **String** | The timezone of the employee. |  [optional] |
|**department** | [**EmployeeDepartment**](EmployeeDepartment.md) |  |  [optional] |
|**workLocation** | **String** | The work location of the employee. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**customFields** | [**List&lt;PeopleCustomField&gt;**](PeopleCustomField.md) |  |  [optional] |



