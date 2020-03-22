@test
Feature: Testing functionality of date picker 


Scenario: Selecting a date will show the selected date in the textbox
	Given I am at the Webdriver Univerity Datepicker page
	When  I click on the calendar button 
	And   Select a date 
	Then  The date in the textbox changes to the selected date 