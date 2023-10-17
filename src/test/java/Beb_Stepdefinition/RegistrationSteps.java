package Beb_Stepdefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

import BaseLayer.Baseclass;
import DemoWebshopPage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegistrationSteps extends Baseclass {
    //private WebDriver driver;
    private HomePage h;
public static HomePage h1;
Faker g=new Faker();

@Given("User Navigate Demo Webshop homepage {string}")
public void user_navigate_demo_webshop_homepage(String string) {
	//driver = new ChromeDriver(); // Initialize your WebDriver as needed
    h=new HomePage(driver);
  browserLaunch();
  urlLaunch(string);
  maximise();
  impWait(10);
}

@When("User click on the Register button")
public void user_click_on_the_register_button() {
	h=new HomePage(driver); 
	h.getRegister().click();
	
	// click(h.getRegister());
}

@Then("Use enter the  details {string},{string},{string},{string},{string}")
public void use_enter_the_details(String FirstName, String LastName, String EmailId, String Password, String ConfirmPassword) {
	 click(h.getGender());
	  sendkeys(h.getFirstname(),g.name().firstName() );
	 sendkeys(h.getLastname(),g.name().lastName() );
	  sendkeys(h.getEmail(),g.internet().emailAddress());
	  sendkeys(h.getPassword(),Password );
	  sendkeys(h.getConfirmpassword(),ConfirmPassword );
}

@Then("Click on Register button and Continue")
public void click_on_register_button_and_continue() {
 click(h.getSave());

}
@Then("Verify Sucess message")
public void sucessmessage( ) {
    Assert.assertTrue(h.getRegisterSuccessMessage().isDisplayed());
    
}
//@When("User click on the Login button")
//public void user_click_on_the_login_button() {
//    click(h.getLogin());
//}
//
//@Then("Use enter the  details {string},{string}")
//public void use_enter_the_details(String string, String string2) {
//    se
//}
//
//@Then("Click on Login button")
//public void click_on_login_button() {
//    
//}
@Then("Click on Electronics")
public void click_on_electronics() {
    click(h.getElectronics());
}

@Then("User Clicks on CellPhones")
public void user_clicks_on_cell_phones() {
	//action.moveToElement(ele).perform();
	 click(h.getCellphone()); 
}

//@Then("User Clicks on Addtocart")
//public void user_clicks_on_addtocart() {
//	click(h.getAddtocart());
//}

@Then("User Clicks on Addtocart1")
public void user_clicks_on_addtocart1() {
	click(h.getAddtocart1());
	driver.quit();
}
}
