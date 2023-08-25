package CustomerTestcase;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Bankweb.ChooseBrowser;
import CustomerTestScenario.XYZBanktestcase;

public class XYZBank extends ChooseBrowser {

	
	public void nameselect() {
		Select select=new Select(XYZBanktestcase.name);
				select.selectByVisibleText("Harry Potter");
	}
	@Test
	public void CustomerLogin() throws IOException {

		PageFactory.initElements(driver, XYZBanktestcase.class);
		XYZBanktestcase.Customer.click();
		nameselect();
		XYZBanktestcase.loginbtn.click();

	}
}
