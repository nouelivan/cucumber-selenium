@test
Feature: Testing of button functionality

Scenario: Button click loads a popup window
	Given I am at the Webdriver Univerity (Button Clicks) page
	When  I click on the WebElement click me button 
	Then  A popup congratulations window appears 