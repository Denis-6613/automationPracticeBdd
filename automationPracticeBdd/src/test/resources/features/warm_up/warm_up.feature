Feature: HTML form submission
User HTML form submission #notes about the feature
  I want to use this template for my feature file

  #@tag1
  Scenario: 1 - As user I should be able to submit HTML form
    Given User navigates to TOOLS QA home page
    When User clicks HTML form link
    And User enters "Denis" first name
    And User enters "Best" last name
    And User enters "Wonderland" country
    And User enters "Cucumber" subject
    And User clicks submit button
    Then user should see successful page
   
 #Scenario: 2 - As user I should be able to submit HTML form
    #Given User navigates to TOOLS QA home page
    #When User clicks HTML form link
    #And User enters "Masha" first name
    #And User enters "Second" last name
    #And User enters "USA" country
    #And User enters "Number Two" subject
    #And User clicks submit button
    #Then user should see successful page 
    
    Scenario Outline: 2 - As user I should be able to submit HTML form
    Given User navigates to TOOLS QA home page
    When User clicks HTML form link
    And User enters "<first name>" first name
    And User enters "<last name>" last name
    And User enters "<country>" country
    And User enters "<subject>" subject
    And User clicks submit button
    Then user should see successful page 
    
    Examples: users
    |first name |last name|country	|subject												|
    |Ali 				|Oz				|USA			|I am from USA									|
    |Mushfig		|Oz1			|USA			|I am from USA, I like cucumber	|
    |Jahid 			|Greece		|Virginia	|I am from VA										|

