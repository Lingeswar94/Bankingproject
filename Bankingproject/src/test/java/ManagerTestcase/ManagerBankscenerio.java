package ManagerTestcase;

import java.security.spec.RSAPublicKeySpec;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerBankscenerio {

static	WebDriver driver;
static Properties properties;
public ManagerBankscenerio(WebDriver driver) {
	this.driver=driver;
}
	
	@FindBy(xpath = "//button[@ng-click='manager()']")
	public static WebElement BankManagerlogin;
	@FindBy(xpath="//button[@ng-click='addCust()']")
	public static WebElement AddCustomer;
	@FindBy(xpath="//input[@placeholder='First Name']")
	public static WebElement FirstName;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public static WebElement LastName;
	@FindBy(xpath="//input[@placeholder='Post Code']")
	public static WebElement PostCode;
	@FindBy(xpath="//button[@class='btn btn-default']")
	public static WebElement AddingCustomer;
	
}
