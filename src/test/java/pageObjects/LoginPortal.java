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
		
		Alert confirmationAlert = browser.switchTo().alert();
		 String alertText = confirmationAlert.getText();
		 
		 if (alertText.equals("validation succeeded")) {
			 
			 System.out.print("Validation Passed");
			 
			 confirmationAlert.dismiss();
			 
		 } else {
			 
			 confirmationAlert.dismiss();
			 
		 }
			
		
		
	}
	
		public void validationFailed() {
		
			Alert confirmationAlert = browser.switchTo().alert();
			 String alertText = confirmationAlert.getText();
			 
			 if (alertText.equals("validation failed")) {
				 
				 System.out.print("Validation Failed");
				 
				 confirmationAlert.dismiss();
				 
			 } else {
				 
				 confirmationAlert.dismiss();
				 
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
