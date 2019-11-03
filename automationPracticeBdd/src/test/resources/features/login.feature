Feature: Login
#	automation practice login or whatever

#Gherkin Syntax

Scenario: User Login Validation
	Given User navigates to home page
	When User clicks on sigh in link
	And User input email address and password
	And User clicks on sign in button
	Then User is on account page
	And New feature validation

#Steps key words
#Given When And Then