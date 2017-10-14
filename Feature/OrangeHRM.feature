Feature: AddEmp functionality 

Scenario: As an admin I should be able to add employee
Given we login into the application
When we click on pim and add employee and add the info
|First name|middle name|last name|emp id|
|Sai      |Krishna     |G        |1122  |
|Anu      |radha       |P        |2233  |
|Ravi     |prasad      |R        |3344  |
And logout of the application


