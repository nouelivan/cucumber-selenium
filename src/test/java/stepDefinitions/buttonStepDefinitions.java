package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ButtonsPage;


public class buttonStepDefinitions {

		WebDriver browser;
		ButtonsPage buttonsPage;
	
	 @Given("^I am at the Webdriver Univerity \\(Button Clicks\\) page$")
	    public void i_am_at_the_webdriver_univerity_button_clicks_page() {
	     		System.setProperty("webdriver.chrome.browser", "/Users/anacarrasco/Drivers/chromedriver");
		 		browser = new ChromeDriver();
		 		buttonsPage = new ButtonsPage(browser);
		 		browser.get("http://webdriveruniversity.com/Click-Buttons/index.html");
		 		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 		browser.manage().window().maximize();
	    }

	 @When("^I click on the WebElement click me button$")
	    public void i_click_on_the_webelement_click_me_button() {
	 
	  
	    	buttonsPage.clickOnButton(); 
	    	
	    }

	 @Then("^A popup congratulations window appears$")
	    public void a_popup_congratulations_window_appears() throws Exception {
	        
	    	
	    	buttonsPage.popupTrue();
	    	
	    	buttonsPage.takeSnapShot(browser, "Macintosh/HD⁩/Users⁩/⁨anacarrasco⁩/⁨Downloads⁩/popupFound.png");
	    	
	    	browser.quit();
	    }
	   

}
