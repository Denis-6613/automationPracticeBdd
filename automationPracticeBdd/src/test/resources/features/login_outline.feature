@Login_outline
Feature: Login

  #	automation practice login or whatever
  #Gherkin Syntax
  
 Scenario: User Login Validation
    Given User navigates to home page
    When User clicks on sigh in link
    And User input email address and password
    And User clicks on sign in button
    Then User is on account page
    
 Scenario Outline: User Login Validation with invalid credentials
    Given User navigates to home page
    When User clicks on sigh in link
    And User input "<email>" email and "<password>" password
    And User clicks on sign in button
    Then User should see error message "<Error message>" 
    
    Examples: authentication
    |email								|password	|Error message				|
    |invalid							|abc1234	|Invalid email address|
    |abc213@mailinator.com|invalid	|Authentication failed|
    |abc213@mailinator.com|1234			|Invalid password.		|
    |invalid							|invalid	|Invalid email address|
    
    #Invalid password.
    
#Steps key words
#Given When And Then
@wip
 Scenario: 3 - User Login Validation with invalid credentials
    Given User navigates to home page
    When User clicks on sigh in link
    Then User input email, password and clicks on sign in button and validate error message 
    |email								|password	|Error message				|
    |invalid							|abc1234	|Invalid email address|
    |abc213@mailinator.com|invalid	|Authentication failed|
    |abc213@mailinator.com|1234			|Invalid password.		|
    |invalid							|invalid	|Invalid email address|
    

