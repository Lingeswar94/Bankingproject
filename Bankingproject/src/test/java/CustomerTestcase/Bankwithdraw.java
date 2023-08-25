package CustomerTestcase;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Bankweb.ChooseBrowser;
import CustomerTestScenario.Bankwithdrawtestcase;
import CustomerTestScenario.XYZBanktestcase;

public class Bankwithdraw extends ChooseBrowser {

	public void nameselect() {
		Select select = new Select(XYZBanktestcase.name);
		select.selectByVisibleText("Harry Potter");
	}

	public void meassgetext() {
		//(mess.contentEquals("Transaction successful"))
		String mess = Bankwithdrawtestcase.message.getText();
		if (mess.contentEquals(properties.getProperty("SuccessText"))) {
			System.out.println("Withdraw is Successfully");
		} else {
			System.out.println("Not");
		}
	}

	@Test
	public void Withdrawamount() {

		PageFactory.initElements(driver, Bankwithdrawtestcase.class);
		Bankwithdrawtestcase.home.click();
		Bankwithdrawtestcase.Customerlogin.click();
		nameselect();
		Bankwithdrawtestcase.login.click();
		Bankwithdrawtestcase.withdraw.click();
		Bankwithdrawtestcase.amountwith.sendKeys(properties.getProperty("withdrawamount"));
		Bankwithdrawtestcase.withdrawbtn.click();
		meassgetext();
	}
}
