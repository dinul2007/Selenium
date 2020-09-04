package buildingInterfaceFwork;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc001_Login extends GenericWrapper {
	
	@Test
	
	public void login() throws InterruptedException {
	
	launchBrowser("http://www.leaftaps.com/opentaps");
	
	
	enteById("username","DemoSalesManager");
	enteById("password","crmsfa");
	clickByXpath("//input[@value='Login']");
	clickByLinktext("CRM/SFA");
	clickByLinktext("Leads");
	clickByLinktext("Create Lead");
	Thread.sleep(2000);
	enteById("createLeadForm_companyName","TCS");
	enteById("createLeadForm_firstName","Hema");
	enteById("createLeadForm_lastName","Ma");
	selectVisibleTextById("createLeadForm_dataSourceId","Website");
	selectVisibleTextById("createLeadForm_industryEnumId","Computer Software");
	enteByXpath("//textarea[@name='description']","It's a Software Company");
    selectIndexByXpath("//select[@name='currencyUomId']", 159);
    clickByXpath("//input[@value='Create Lead']");
    
    
	
		
	}

}
