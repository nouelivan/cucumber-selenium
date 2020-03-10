package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropdownRadioCheckbox;

public class dropdownRadioCheckboxStepDefinitions {
	
	WebDriver browser;
	DropdownRadioCheckbox drc;
	
	@Given("^I am at the Webdriver Univerity dropdown, checkbox, and radio buttons page$")
    public void i_am_at_the_webdriver_univerity_dropdown_checkbox_and_radio_buttons_page() {
        
		System.setProperty("webdriver.chrome.browser", "/Users/anacarrasco/Drivers/chromedriver");
		browser = new ChromeDriver();
 		drc = new DropdownRadioCheckbox(browser);
 		browser.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
 		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		browser.manage().window().maximize();
		
    }

    @When("^I click on the dropdown menu and select an option$")
    public void i_click_on_the_dropdown_menu_and_select_an_option() {
       
    	Select dropdown1 = new Select(browser.findElement(By.id("dropdowm-menu-1")));
        
    	dropdown1.selectByVisibleText("Python");
    	
    }

    @When("^I click on a radion button option$")
    public void i_click_on_a_radion_button_option() {
    	
    	drc.blueRadioSelect();
        
    }

    @When("^I click on a checkbox option$")
    public void i_click_on_a_checkbox_option() {
    	
    	drc.option1Checked();
    	
        
    }

    @Then("^The selected dropdown option is selected$")
    public void the_selected_dropdown_option_is_selected() {
    	

    	Select dropdown1 = new Select(browser.findElement(By.id("dropdowm-menu-1")));
    	WebElement option = dropdown1.getFirstSelectedOption();
    	String selectedValueInDropDown = option.getText();
    	
    	if (selectedValueInDropDown.equals("Python")) {
    		
    		System.out.println("The correct dropdown option was selected.");
    		
    	} else {
    		
    		System.out.println("The incorrect dropdown option was selected.");
    		
    	}
    	
    	browser.quit();
    }

    @Then("^The clicked on radio button option is selected$")
    public void the_clicked_on_radio_button_option_is_selected() {
    	
    	drc.radioIsSelected();
    	
    	browser.quit();
        
    }

    @Then("^The clicked on checkbox option is selected$")
    public void the_clicked_on_checkbox_option_is_selected() {
    	
    	drc.checkboxIsSelected();
    	
    	browser.quit();
        
    }
 

}
