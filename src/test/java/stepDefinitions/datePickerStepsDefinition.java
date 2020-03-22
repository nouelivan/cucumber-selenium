package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.datePicker;

public class datePickerStepsDefinition {

	WebDriver browser;
	datePicker date;
	
	   @Given("^I am at the Webdriver Univerity Datepicker page$")
	    public void i_am_at_the_webdriver_univerity_datepicker_page() {
	       
			System.setProperty("webdriver.chrome.browser", "/Users/anacarrasco/Drivers/chromedriver");
	 		browser = new ChromeDriver();
	 		date = new datePicker(browser);
	 		browser.get("http://webdriveruniversity.com/Datepicker/index.html");
	 		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		browser.manage().window().maximize();
		   
	    }

	    @When("^I click on the calendar button$")
	    public void i_click_on_the_calendar_button() {
	    	
	    	date.clickOnButton();
	        
	    }
	    
	    @And("^Select a date$")
	    public void select_a_date() {
	    	
	    	date.clickOnDate();
	        
	    }
	

	    @Then("^The date in the textbox changes to the selected date$")
	    public void the_date_in_the_textbox_changes_to_the_selected_date() {
	        
	    	date.verifySelectedDate();
	    	
	    	browser.quit();
	    	
	    }

	  
}
