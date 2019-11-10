Feature: HTML form submission
User HTML form submission #notes about the feature
  I want to use this template for my feature file

  #@tag1
  Scenario: As user I should be able to submit HTML form
    Given User navigates to TOOLS QA home page
    When User clicks HTML form link
    And User enters "" first name
    And User enters "" last name
    And User enters "" country
    And User enters "" subject
    And User clicks submit button
    Then user should see successful page
    

