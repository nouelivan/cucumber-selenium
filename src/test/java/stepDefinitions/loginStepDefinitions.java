package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPortal;

public class loginStepDefinitions {
	
	WebDriver browser;
	LoginPortal loginPortal;
	

	    @Given("^the user inputs valid \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void the_user_inputs_valid_something_and_something(String username, String password) {
	    	
	    	browser = new ChromeDriver();
	 		loginPortal = new LoginPortal(browser);
	 		browser.get("http://webdriveruniversity.com/Login-Portal/index.html");
	 		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		browser.manage().window().maximize();
	       
	    	System.out.println(username + " " + password);
	    	
	    }

	  
	    @Given("^the user inputs invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void the_user_inputs_invalid_something_and_something(String username, String password) {
	        
	    	browser = new ChromeDriver();
	 		loginPortal = new LoginPortal(browser);
	 		browser.get("http://webdriveruniversity.com/Login-Portal/index.html");
	 		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		browser.manage().window().maximize();
	    	
	    	System.out.println(username + " " + password);
	    	
	    }

	    @When("^user clicks Login button $")
	    public void user_clicks_login_button() {
	    	
	    	loginPortal = new LoginPortal(browser);
	    	
	    	loginPortal.clickOnButton();
	    	    	
	        
	    }

	    @Then("^the user is presented with a popup window validation succeeded$")
	    public void the_user_is_presented_with_a_popup_window_validation_succeeded() throws Exception {
	        
	    		loginPortal.validationPassed();
	    		
	    		loginPortal.takeSnapShot(browser, "Macintosh/HD⁩/Users⁩/⁨anacarrasco⁩/⁨Downloads⁩/validationPass.png");
	    	
	    }

	    @Then("^the user is presented with a popup window validation failed$")
	    public void the_user_is_presented_with_a_popup_window_validation_failed() throws Exception {
	        
	    		loginPortal.validationFailed();
	    		
	    		loginPortal.takeSnapShot(browser, "Macintosh/HD⁩/Users⁩/⁨anacarrasco⁩/⁨Downloads⁩/validationFail.png");
	    	
	    }
	    
	    @After
	    public void closeBrowser() {
	 
	    browser.quit();
	    
	    }

	}
	


