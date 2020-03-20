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

public class FileUpload {

	WebDriver browser;

	public FileUpload(WebDriver browser) {

		this.browser = browser;

		PageFactory.initElements(browser, this);

	}
	
	

	@FindBy(how = How.ID, using = "myFile")
	private WebElement uploadElement;

	@FindBy(how = How.ID, using = "submit-button")
	private WebElement submitButton;
	
	
	

	public void uploadFile(String filePath) {

		this.uploadElement.sendKeys(filePath);

	}

	public void clickOnSubmitButton() {

		this.submitButton.click();

	}
	
	

	public void fileUploadValidation() {

		Alert confirmationAlert = browser.switchTo().alert();
		String alertText = confirmationAlert.getText();

		if (alertText.equals("Your file has now been uploaded!")) {

			System.out.print("File Uploaded");

			confirmationAlert.dismiss();

		} else if (alertText.equals("You need to select a file to upload!")) {

			System.out.print("File Upload Failed");

			confirmationAlert.dismiss();
			
		}

	}


	
	public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);

	}

}
