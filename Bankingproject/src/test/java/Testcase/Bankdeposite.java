package Testcase;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Bankweb.ChooseBrowser;
import TestScenario.BankDepositeTestcase;

public class Bankdeposite extends ChooseBrowser {
	
	@Test
	public void BankDeposite() {
		PageFactory.initElements(driver, BankDepositeTestcase.class);

		BankDepositeTestcase.Deposit.click();
		BankDepositeTestcase.Amount.sendKeys(properties.getProperty("depositeamount"));
		BankDepositeTestcase.depositsummit.click();
	}
}
