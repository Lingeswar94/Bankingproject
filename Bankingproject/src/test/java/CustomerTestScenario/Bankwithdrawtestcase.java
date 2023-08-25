package CustomerTestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bankwithdrawtestcase {
	static WebDriver driver;

	public Bankwithdrawtestcase(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	@FindBy(xpath="//button[@ng-click='home()']")
	public static WebElement home;
	
	@FindBy(xpath = "//button[@ng-click='customer()']")
	public static WebElement Customerlogin;
	
	@FindBy(xpath = "//select[@id='userSelect']")
	public static WebElement customername;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement login;
	
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	public static WebElement withdraw;
	
	@FindBy(xpath="//input[@ng-model='amount']")
	public static WebElement amountwith;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement withdrawbtn;
	
	@FindBy(xpath="//span[@ng-show='message']")
	public static WebElement message;
	
}
