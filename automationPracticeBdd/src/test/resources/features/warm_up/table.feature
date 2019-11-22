@table
Feature: Table

  #	automation practice login or whatever
  #Gherkin Syntax
  
@sampleTable
  Scenario: As a user I should be able to print all values from Sample Table
    Given User navigates to "https://www.toolsqa.com/automation-practice-table/"
    When User is able to view Sample table
    Then User should be able to print values to console
    
