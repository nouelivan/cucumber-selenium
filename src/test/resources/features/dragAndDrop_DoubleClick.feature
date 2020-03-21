@test
Feature: Testing drag and drop and double click functionality 


Scenario: Dragging small box to large box changes larger box color to red
	Given I am at the Webdriver Univerity Actions page
	When  I drag the small box into the large box 
	Then  The larger boxes text changes to dropped 


Scenario: Double clicking click me box changes the box color from yellow to green
	Given I am at the Webdriver Univerity Actions page
	When  I doubleclick the click me box
	Then  The box changes color to green