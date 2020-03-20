package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FileUpload;

public class fileUploadStepDefinitions {

		WebDriver browser;
		FileUpload fileUpload;
	
	 @Given("^I am at the Webdriver Univerity File Upload page$")
	    public void i_am_at_the_webdriver_univerity_file_upload_page() {
	        
		 System.setProperty("webdriver.chrome.browser", "/Users/anacarrasco/Drivers/chromedriver");
	 		browser = new ChromeDriver();
	 		fileUpload = new FileUpload(browser);
	 		browser.get("http://webdriveruniversity.com/File-Upload/index.html");
	 		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		browser.manage().window().maximize();
		 
	    }

	    @When("^A file is uploaded$")
	    public void a_file_is_uploaded() {
	        
	    	fileUpload.uploadFile("/Users/anacarrasco/tesla.jpg");
	    	
	    }
	    
	    @And("^The submit button is clicked$")
	    public void the_submit_button_is_clicked() {
	        
	    	fileUpload.clickOnSubmitButton();
	    	
	    }

	    @Then("^A popup window appears confirming a successful upload$")
	    public void a_popup_window_appears_confirming_a_successful_upload() throws Exception {
	        
	    	fileUpload.fileUploadValidation();
	    	
	    	fileUpload.takeSnapShot(browser, "Macintosh HD⁩/Users⁩/⁨anacarrasco⁩/⁨Downloads⁩/fileValidation.jpeg");
	    	
	    	browser.quit();
	    	
	    }

	
}
