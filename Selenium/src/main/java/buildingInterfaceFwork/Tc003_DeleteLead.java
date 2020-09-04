package buildingInterfaceFwork;

import org.testng.annotations.Test;

public class Tc003_DeleteLead extends GenericWrapper {
	
@Test

public void login() throws InterruptedException {

launchBrowser("http://www.leaftaps.com/opentaps");

enteById("username","DemoSalesManager");
enteById("password","crmsfa");
clickByXpath("//input[@value='Login']");
clickByLinktext("CRM/SFA");
clickByLinktext("Leads");
clickByXpath("//a[text()='Find Leads']");

Thread.sleep(3000);

clickByXpath("//span[text()='Phone']");


}

}