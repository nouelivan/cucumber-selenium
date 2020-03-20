@test
Feature: Testing an explicit wait before clicking button 


Scenario: Wait for page to load and then click on button 
	Given I am at the Webdriver Univerity Ajax-Loader page
	When  I wait for the page to load
	And   I click on the Click Me button 
	Then  A popup window appears 