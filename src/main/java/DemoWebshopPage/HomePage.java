
package DemoWebshopPage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.Baseclass;

public class HomePage extends Baseclass {
//public WebDriver driver;
	

public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
//@FindBy (xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
//private WebElement register;

@FindBy (xpath = "//a[@class='ico-register']")
private WebElement register;

@FindBy (id = "gender-male")
private WebElement Gender;

@FindBy (id = "FirstName")
private WebElement firstname;

@FindBy (id = "LastName")
private WebElement lastname;

@FindBy (id = "Email")
private WebElement email;

@FindBy (id = "Password")
private WebElement password;

@FindBy (id = "ConfirmPassword")
private WebElement confirmpassword;

@FindBy (id = "register-button")
private WebElement save;

@FindBy(xpath="//div[contains(text(),'Your registration completed')]")
private WebElement registerSuccessMessage;


public WebDriver getDriver() {
	return driver;
}

public WebElement getRegister() {
	return register;
}

public WebElement getGender() {
	return Gender;
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getConfirmpassword() {
	return confirmpassword;
}

public WebElement getSave() {
	return save;
}

public WebElement getRegisterSuccessMessage() {
	return registerSuccessMessage;
}


}