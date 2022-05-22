
Feature: check the registration page is validation of field as per requirment.

Background:
		Given Open the swiggy url in chrome.
		And select the Sign up button for registration
	@smoke
	Scenario: checking the phone number field with postiive data.
		When Find the phone number field and Enter the data "9897677676"
		And click on continue button
		Then check the phone number text box label is showing "Phone number"
		 @sanity
	Scenario: checking the phone number field with postiive data.
		When Find the phone number field and Enter the data "9897677676"
		And click on continue button
		Then check the phone number text box label is showing "Phone number"
		
#passing data via datatable
	Scenario: checking the phone number field with negative data.
		When Find the phone number field and Enter the data
		|978987987|
		|435673468|
		|879656465|
		And click on continue button
		#List of List datatable data format
		Then check the phone number text box label is showing
		|Phone number|Enter your phone number|
		
		# we do the declaration like this for converting the datatable as maps
		#first row of data will not be considered in list since that will be considered
		#as headers..
		Then check the phone number text box label is showing
		|invalid|valid|
		|Enter your phone number|Phone number|
	
		
