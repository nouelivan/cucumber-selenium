package pageObjects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		private WebElement button;
	
	@FindBy(how = How.CLASS_NAME, using = "modal-title")
		private WebElement findPopup;
	
	
	
	
	public void clickOnButton() {
		 
		 this.button.click();
		 
		 }
	
	public void popupTrue() {
		
		this.findPopup.isDisplayed();
		
		
	}


	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {
		
		TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
	
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	
		File DestFile = new File(fileWithPath);
	
		FileUtils.copyFile(SrcFile, DestFile);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
