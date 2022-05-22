@reg
Feature: to check the sign up page validation

@sanity
Scenario: sign up page with possitve data
		Given Open the swiggy url in chrome.
		And select the Sign up button for registration
		When Find the phone number field and Enter the data "9897677676"
		And click on continue button
		Then check the phone number text box label is showing "Phone number"



Scenario Outline: check the registration detail with possitve and nagative flow
		Given Open the swiggy url in chrome.
		And select the Sign up button for registration
		When Find the phone number field and Enter the data '<phonenumber>'
		And click on continue button
		Then check the phone number text box label is showing '<message>'
		
	Examples:
	|phonenumber|message|
	|9898898989|Phone number|
	|09090909|Enter your phone number|
	
