@login_background
Feature: Login

  #	automation practice login or whatever
  #Gherkin Syntax
  
  Background: User log in
  	Given User navigates to home page
    When User clicks on sigh in link
  
@smokeTest
  Scenario: User Login Validation
    
    And User input email address and password
    And User clicks on sign in button
    Then User is on account page
    
@negative
  Scenario: User Login Validation with invalid credentials
    
    And User input "invalid" email and "invalid" password
    And User clicks on sign in button
    Then User should see error message "Invalid email address"
#Steps key words
#Given When And Then
