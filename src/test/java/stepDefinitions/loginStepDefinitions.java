package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPortal;

public class loginStepDefinitions {
	
	WebDriver browser;
	LoginPortal loginPortal;

	    @Given("^the user inputs valid \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void the_user_inputs_valid_something_and_something(String username, String password) {
	       
	    	System.out.println(username + " " + password);
	    	
	    }

	  
	    @Given("^the user inputs invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void the_user_inputs_invalid_something_and_something(String username, String password) {
	        
	    	System.out.println(username + " " + password);
	    	
	    }

	    @When("^user clicks Login button $")
	    public void user_clicks_login_button() {
	    	
	    	loginPortal = new LoginPortal(browser);
	    	
	    	loginPortal.clickOnButton();
	        
	    }

	    @Then("^the user is presented with a popup window validation succeeded$")
	    public void the_user_is_presented_with_a_popup_window_validation_succeeded() {
	        
	    		loginPortal.validationPassed();
	    	
	    }

	    @Then("^the user is presented with a popup window validation failed$")
	    public void the_user_is_presented_with_a_popup_window_validation_failed() {
	        
	    		loginPortal.validationFailed();
	    	
	    }

	}
	


