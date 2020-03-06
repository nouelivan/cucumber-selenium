package pageObjects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPortal {
	
	WebDriver browser;
	TakesScreenshot screenShot;
	
	public LoginPortal(WebDriver browser) {
		
		this.browser = browser;
		
		PageFactory.initElements(browser, this);
		
	}
	
	@FindBy(how = How.ID, using = "text") 
		private WebElement username;
	
	@FindBy(how = How.ID, using = "password")
		private WebElement password;
	
	@FindBy(how = How.ID, using = "login-button")
		private WebElement loginButton;
	
	
	public void clickOnButton() {
		 
		 loginButton.click();
		 
		 }
	
	public void validationPassed() {
		
		Alert alert = browser.switchTo().alert();
		
		String success = "validation succeeded";
		
		@SuppressWarnings("unused")
		boolean passed;
		
		
		if (alert.getText().equals(success) ) {
			
			passed = true;
			
			System.out.println("Validation Succeeded");
			
		}
		
	}
	
		public void validationFailed() {
		
		Alert alert = browser.switchTo().alert();
		
		String failed = "validation failed";
		
		@SuppressWarnings("unused")
		boolean notPassed;
		
		
		if (alert.getText().equals(failed) ) {
			
			notPassed = true;
			
			System.out.println("Validation Failed");
			
		}
		
	}
		
		public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
			
			TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
		
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
			File DestFile = new File(fileWithPath);
		
			FileUtils.copyFile(SrcFile, DestFile);
			
		}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
