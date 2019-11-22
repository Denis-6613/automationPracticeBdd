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
|id					|Number					|
|first_name	|First Name			|
|last_name	|Last Name			|
|address		|Street address	|
|address 5		|Street address	|
|address 6		|Street address	|
|address 7		|Street address	|
|address 8		|Street address	|
