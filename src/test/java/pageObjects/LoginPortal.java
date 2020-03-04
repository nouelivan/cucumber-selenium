package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPortal {
	
	WebDriver browser;
	
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
			
		}
		
	}
	
		public void validationFailed() {
		
		Alert alert = browser.switchTo().alert();
		
		String failed = "validation failed";
		
		@SuppressWarnings("unused")
		boolean notPassed;
		
		
		if (alert.getText().equals(failed) ) {
			
			notPassed = true;
			
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
