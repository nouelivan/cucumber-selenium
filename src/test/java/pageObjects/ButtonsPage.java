package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
	
	WebDriver browser;
	
	public ButtonsPage(WebDriver browser) {
		
		this.browser = browser;
		
		PageFactory.initElements(browser, this);
		
	}
	
	
	@FindBy(how = How.ID, using = "button1")
		private WebElement buttonPopup;
	
	@FindBy(how = How.CLASS_NAME, using = "modal-title")
		private WebElement findPopup;
	
	
	
	
	public void clickOnButton() {
		 
		 buttonPopup.click();
		 
		 }
	
	public void popupTrue() {
		
		findPopup.isDisplayed();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
