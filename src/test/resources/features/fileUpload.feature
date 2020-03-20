@test
Feature: Testing file upload functionality


Scenario: Choosing a file and pressing submit button is successful
	Given I am at the Webdriver Univerity File Upload page
	When  A file is uploaded 
	And   The submit button is clicked
	Then  A popup window appears confirming a successful upload  