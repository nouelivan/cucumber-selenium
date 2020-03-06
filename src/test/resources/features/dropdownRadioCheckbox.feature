@test
Feature: Testing of dropdown, radio button, and checkbox functionality

Scenario: Clicking dropdown menu and selecting a dropdown option shows dropdown menu and selects new option
	Given I am at the Webdriver Univerity dropdown, checkbox, and radio buttons page
	When  I click on the dropdown menu and select an option
	Then  The selected dropdown option is selected
	
Scenario: Selecting radio button buttons marks radio buttons 
	Given I am at the Webdriver Univerity dropdown, checkbox, and radio buttons page
	When  I click on a radion button option
	Then  The clicked on radio button option is selected 
	
Scenario: Selecting checkbox checkboxes checks checkboxes 
	Given I am at the Webdriver Univerity dropdown, checkbox, and radio buttons page
	When  I click on a checkbox option
	Then  The clicked on checkbox option is selected