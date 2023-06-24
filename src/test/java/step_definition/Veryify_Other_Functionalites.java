package step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base_Class_1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Veryify_Other_Functionalites extends Base_Class_1 {

	
	
	
	@Given("I am in Landing Page")
	public void i_am_in_landing_page() {
		navigateURL("https://www.target.com");
	}

	@When("I type on Search bar")
	public void i_type_on_search_bar() {
	    sendkeys(By.id("search"), "eggs");
	}

	@When("I Click on search icon")
	public void i_click_on_search_icon() {
	    click(By.xpath("//button[@aria-label='go']"));
	    System.out.println("Click done");
	}


	@When("I Click on shipping")
	public void i_click_on_shipping() throws InterruptedException {
		Thread.sleep(10000);
	    click(By.xpath("//h2[text()='Shipping']"));
	}

	@Then("I Click on Edit Location")
	public void i_click_on_edit_location() throws InterruptedException {
		Thread.sleep(10000);	
	 click(By.xpath("//button[text()='Edit location']"));  
	}

	@Then("I enter zipcode")
	public void i_enter_zipcode() {
	sendkeys(By.id("enter-zip-or-city-state"), "78753");    
	}

	@Then("I Click on submit")
	public void i_click_on_submit() throws InterruptedException {
		Thread.sleep(10000);
	 click(By.xpath("//button[text()='Submit']")); 
	 Thread.sleep(10000);
	}

	@Then("I verify the location")
	public void i_verify_the_location() {
	String actualValue	= getElementText(By.xpath("//h2[text()='78753, TX']"));
	   
	assertEquals("78753, TX", actualValue);
	System.out.println(actualValue);
	}


}
