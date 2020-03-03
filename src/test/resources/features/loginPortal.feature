@test
Feature: Testing functionality of login page

Scenario: Verification of the login to webdriveruniversity.com with valid credentials
	Given the user inputs valid username and password 
	When user clicks Login button 
	Then the user is presented with a popup window validation succeeded
	
	@test
Scenario Outline: Verification of login combinations for webdriveruniversity.com with valid credentials 
	Given the user inputs valid "<username>" and "<password>"
	When user clicks Login button 
	Then the user is presented with a popup window validation succeeded
	
	Examples: 
		|username|password|
		|user| 123|
		|webdriver| webdriver123|
		|mike| pass12|	

	