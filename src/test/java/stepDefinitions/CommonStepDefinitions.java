package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ButtonsPage;
import pageObjects.LoginPortal;


public class CommonStepDefinitions {

	WebDriver browser;
	
	 @Given("^I am at the Webdriver Univerity \\(Button Clicks\\) page$")
	    public void i_am_at_the_webdriver_univerity_button_clicks_page() {
	     
		 		browser = new ChromeDriver();
		 		browser.get("http://webdriveruniversity.com/Click-Buttons/index.html");
		 		
	    }

	    @When("^ I click on the WebElement click me button $")
	    public void i_click_on_the_webelement_click_me_button() {
	        
	    	ButtonsPage buttonsPage = new ButtonsPage(browser);
	  
	    	buttonsPage.clickOnButton();
	    	
	    }

	    @Then("^ A popup congratulations window appears $")
	    public void a_popup_congratulations_window_appears() {
	        
	    	ButtonsPage buttonsPage = new ButtonsPage(browser);
	    	
	    	buttonsPage.popupTrue();
	    	
	    	browser.close();
	    	
	    }
	    
	    @Given("^the user inputs valid \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void the_user_inputs_valid_username_and_password(String username, String password) {
	        
	    	System.out.println(username + " " + password);
	    	
	    }
	    

	    @When("^user clicks Login button $")
	    public void user_clicks_login_button() {
	        
	    	LoginPortal loginPortal = new LoginPortal(browser);
	    	
	    	loginPortal.clickOnButton();
	    	
	    }

	    @Then("^the user is presented with a popup window validation succeeded$")
	    public void the_user_is_presented_with_a_popup_window_validation_succeeded() {
	        
	    	LoginPortal loginPortal = new LoginPortal(browser);
	    	
	    	loginPortal.validationPassed();
	    	
	    }
	   

}
