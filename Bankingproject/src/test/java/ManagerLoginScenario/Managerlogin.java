package ManagerLoginScenario;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Bankweb.ChooseBrowser;
import ManagerTestcase.ManagerBankscenerio;

public class Managerlogin extends ChooseBrowser{

	@Test
	public void ManagerBanklogincase() {
		
		PageFactory.initElements(driver, ManagerBankscenerio.class);
		
		ManagerBankscenerio.BankManagerlogin.click();
		ManagerBankscenerio.AddCustomer.click();
		//String firstname=properties.getProperty("FirstName");
		ManagerBankscenerio.FirstName.sendKeys(properties.getProperty("FirstName"));
		ManagerBankscenerio.LastName.sendKeys(properties.getProperty("LastName"));
		ManagerBankscenerio.PostCode.sendKeys(properties.getProperty("Postcode"));
		ManagerBankscenerio.AddingCustomer.click();
	}
	
}
