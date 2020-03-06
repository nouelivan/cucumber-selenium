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

public class DropdownRadioCheckbox {
	
	
	WebDriver browser;
	TakesScreenshot screenShot;
	
		public DropdownRadioCheckbox(WebDriver browser) {
		
		this.browser = browser;
		
		PageFactory.initElements(browser, this);
		
	}
		// Checkboxes
		
		@FindBy(how = How.CSS, using = "input[value='option-1']") 
		private WebElement option1;
		
		@FindBy(how = How.CSS, using = "input[value='option-2']") 
		private WebElement option2;
		
		@FindBy(how = How.CSS, using = "input[value='option-3']") 
		private WebElement option3;
		
		@FindBy(how = How.CSS, using = "input[value='option-4']") 
		private WebElement option4;
		
		// Radio Buttons 
		
		@FindBy(how = How.CSS, using = "input[value='green']") 
		private WebElement greenRadio;
		
		@FindBy(how = How.CSS, using = "input[value='blue']") 
		private WebElement blueRadio;
		
		@FindBy(how = How.CSS, using = "input[value='yellow']") 
		private WebElement yellowRadio;
		
		
		
		// Checkbox Click Methods
		
		public void option1Checked() {
			
			option1.click();
			
		}
		
		public void option2Checked() {
			
			option2.click();
			
		}
		
		public void option3Checked() {
			
			option3.click();
			
		}
		
		public void option4Checked() {
			
			option4.click();
			
		}
		
		
		// Test to see if checkbox option has been selected.
		
		public void checkboxIsSelected() {
			
			 if (option1.isSelected())  {
				
				 System.out.print("Checkbox option 1 is selected.");
				   
			  } else if (option1.isSelected()) {
				  
				  System.out.println("Checkbox option 2 is selected.");
				  
			  } else if (option1.isSelected()) {			
			
				  System.out.println("Checkbox option 3 is selected.");
				  
			  }  else if (option1.isSelected()) {
				  
				  System.out.println("Checkbox option 4 is selected.");
				  
			  }
				  
		}
		
		
		// Radio Button Click Methods 
		
		public void greenRadioSelect() {
			
			greenRadio.click();
			
		}
		
		public void blueRadioSelect() {
			
			blueRadio.click();
			
		}
		
		public void yellowRadioSelect() {
			
			yellowRadio.click();
			
		}
		
		
		// Check to see if radio button is selected
		
		public void radioIsSelected() {
			
			if (greenRadio.isSelected()) {
				
				System.out.println("Green radio button selected.");
				
			} else if (blueRadio.isSelected()) {
				
				System.out.println("Blue radio button selected.");
				
			} else if (yellowRadio.isSelected()) {
				
				System.out.println("Yellow radio button is selected.");
				
			}
			
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
