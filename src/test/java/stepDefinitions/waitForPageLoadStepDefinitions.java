package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.WaitForPageLoad;

public class waitForPageLoadStepDefinitions {
	
		WebDriver browser;
		WaitForPageLoad pageLoad;
	
	 	@Given("^I am at the Webdriver Univerity Ajax-Loader page$")
	    public void i_am_at_the_webdriver_univerity_ajaxloader_page() {
	       
	 		System.setProperty("webdriver.chrome.browser", "/Users/anacarrasco/Drivers/chromedriver");
	 		browser = new ChromeDriver();
	 		pageLoad = new WaitForPageLoad(browser);
	 		browser.get("http://webdriveruniversity.com/Ajax-Loader/index.html");
	 		browser.manage().window().maximize();
	 		
	    }

	    @When("^I wait for the page to load$")
	    public void i_wait_for_the_page_to_load() {
	        
	    	pageLoad.waitForButton();
	    	
	    }
	    
	    @And("^I click on the Click Me button$")
	    public void i_click_on_the_click_me_button() {
	    	
	    	pageLoad.clickOnButton();
	        
	    }

	    @Then("^A popup window appears$")
	    public void a_popup_window_appears() throws Exception {
	    	
	    	pageLoad.popupTrue();
	    	
	    	pageLoad.takeSnapShot(browser, "Macintosh/HD⁩/Users⁩/⁨anacarrasco⁩/⁨Downloads⁩/popupFound.png");
	    	
	    	browser.quit();
	        
	    }


}
