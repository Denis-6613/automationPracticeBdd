@excel
Feature: Excel generator

@dummy  
Scenario: As User I should be able to generate excel file
  
Given User should be able to read excel file

@wip_excel    
Scenario: As User I should be able to generate excel file with test data
  
Given User navigates to "https://www.mockaroo.com/" website
#When add field
When User add field name and type
|field name	|type						|
|id					|Row Number			|
|first_name	|First Name			|
|last_name	|Last Name			|
|address		|Street Address	|
#|address 5		|Street Address	|
#|address 6		|Street Address	|
#|address 7		|Street Address	|
#|address 8		|Street Address	|
#|address 9		|Street Address	|
#|address 10		|Street address	|
#|address 11		|Street address	|
#|address 12		|Street address	|
#|address 13		|Street address	|
#|address 14		|Street address	|
#|address 15		|Street address	|

And User adds 100 rows with file format "Excel"
And User click download button
Then User validates the file is downloaded successfully
