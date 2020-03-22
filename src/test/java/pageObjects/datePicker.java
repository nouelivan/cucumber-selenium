package pageObjects;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class datePicker {
	
	WebDriver browser;
	
	public datePicker(WebDriver browser) {
		
		this.browser = browser;
		
		PageFactory.initElements(browser, this);
		
	}
	
	
	@FindBy(how = How.CLASS_NAME, using = "input-group-addon")
	private WebElement calendarButton;
	
	@FindBy(how = How.CLASS_NAME, using = "today day")
	private WebElement todaysDate;
	
	@FindBy(how = How.CSS, using = "input[class='form-control']") 
	private WebElement dateText;
	
	
	
	public void clickOnButton() {
		 
		 this.calendarButton.click();
		 
		 } 
	
	public void clickOnDate() {
		
		Actions action = new Actions(browser);
		 
		 action.doubleClick(calendarButton).perform();
		 
		 } 
	
	
	public void verifySelectedDate() {
		
		String textBoxDate = dateText.getAttribute("value");
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
	
		
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int year = cal.get(Calendar.YEAR);
		
		String monthAsString = String.format ("%02d", month);
		String dayAsString = String.valueOf(day);
		String yearAsString = String.valueOf(year);
		String fullDate = monthAsString + "-" + dayAsString + "-" + yearAsString;
		
		
		if (textBoxDate.equals(fullDate)) {
			
			System.out.println("PASS: The date's match.");
			
		} else {
			
			System.out.println("FAIL: The date's do not match.");
			
		}
		
	}
	
	
}
