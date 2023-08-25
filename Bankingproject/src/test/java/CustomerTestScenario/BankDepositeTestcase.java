package CustomerTestScenario;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankDepositeTestcase {
	static WebDriver driver;
	static	Properties properties;
	public BankDepositeTestcase(WebDriver driver) {
		this.driver = driver;
		
	}

	@FindBy(xpath = "//button[@ng-click='deposit()']")
	public static WebElement Deposit;
	
	@FindBy(xpath = "//input[@ng-model='amount']")
	public static WebElement Amount;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement depositsummit;

}
