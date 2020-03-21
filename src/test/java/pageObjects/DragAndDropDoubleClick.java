package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropDoubleClick {
	
	WebDriver browser;
	
	public DragAndDropDoubleClick(WebDriver browser) {
		
		this.browser = browser;
		
		PageFactory.initElements(browser, this);
		
		
	}
	
	
	@FindBy(how = How.ID, using = "double-click")
	private WebElement button;

	@FindBy(how = How.ID, using = "draggable")
	private WebElement draggableBox;
	
	@FindBy(how = How.ID, using = "droppable")
	private WebElement droppableBox;
	
	@FindBy(how = How.CSS, using = "div[class='div-double-click double']") 
	private WebElement doubleClickPass;
	
	
	public void doubleClickButton() {
		
		Actions action = new Actions(browser);
		
		 action.doubleClick(button).perform();
		 
		 } 
	
	public void dragAndDrop() {
		
		Actions action = new Actions(browser);
		
		 Action dragAndDrop = action.clickAndHold(draggableBox)
			       .moveToElement(droppableBox)
			       .release(draggableBox)
			       .build();

			     dragAndDrop.perform();
		
		
	}
	
	public void validateBoxDrop() {
		
		String text = droppableBox.getText();
		
			
			if(text.equals("Dropped!")) {
			 
			 System.out.println("PASS: Box has been dropped.");
			 
			 } else {
				 
			 System.out.println("FAIL: Box was not dropped.");
			 
			 }
		
	}
	
	public void validateDoubleClick() {
		
		this.doubleClickPass.isDisplayed();
		
	}

}
