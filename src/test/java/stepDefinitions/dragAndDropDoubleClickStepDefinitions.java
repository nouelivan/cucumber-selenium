package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DragAndDropDoubleClick;

public class dragAndDropDoubleClickStepDefinitions {

	WebDriver browser;
	DragAndDropDoubleClick DADDC;
	
	 	@Given("^I am at the Webdriver Univerity Actions page$")
	    public void i_am_at_the_webdriver_univerity_actions_page() {
	        
	 		System.setProperty("webdriver.chrome.browser", "/Users/anacarrasco/Drivers/chromedriver");
	 		browser = new ChromeDriver();
	 		DADDC = new DragAndDropDoubleClick(browser);
	 		browser.get("http://webdriveruniversity.com/Actions/index.html");
	 		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		browser.manage().window().maximize();
	 		
	    }

	    @When("^I drag the small box into the large box$")
	    public void i_drag_the_small_box_into_the_large_box() {
	    	
	    	DADDC.dragAndDrop();
	        
	    }

	    @When("^I doubleclick the click me box$")
	    public void i_doubleclick_the_click_me_box() {
	    	
	    	DADDC.doubleClickButton();
	        
	    }

	    @Then("^The larger boxes text changes to dropped$")
	    public void the_larger_boxes_text_changes_to_dropped() {
	    	
	    	DADDC.validateBoxDrop();
	        
	    }

	    @Then("^The box changes color to green$")
	    public void the_box_changes_color_to_green() {
	    	
	    	DADDC.validateDoubleClick();
	        
	    }
	    
	    @After
	    public void closeBrowser() {
	    	
	    	browser.quit();
	    	
	    }
	
}
