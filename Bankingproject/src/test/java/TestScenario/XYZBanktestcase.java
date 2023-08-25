package TestScenario;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XYZBanktestcase {
	static	Properties properties;
	static WebDriver driver;

	public XYZBanktestcase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@ng-click='customer()']")
	public static WebElement Customer;

	@FindBy(xpath = "//select[@id='userSelect']")
	public static WebElement name;

	@FindBy(xpath="//button[@type='submit']")
	public static WebElement loginbtn;
}
