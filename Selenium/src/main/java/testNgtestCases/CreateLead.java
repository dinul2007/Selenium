package testNgtestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Wrapper.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper {
	
@Test
  public void createLead() {
	/*System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	//Enter URL
	driver.get("http://www.leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Enter UserName
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	//Enter Password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	//Click Login
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//ENTER CRMSFA
	driver.findElement(By.linkText("CRM/SFA")).click();*/
	//create Lead
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	//enter Company Name
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
	//enter First Name
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("G");
	// Enter Last Name
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");
	//Enter Source
	WebElement Source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));

	Select dd = new Select(Source);
	dd.selectByVisibleText("Employee");
	//Enter Title
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Mr");

	//Enter Industry
	WebElement Industry = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
	Select dd1  = new Select(Industry);

	dd1.selectByValue("IND_SOFTWARE");
	//Enter Ownership
	WebElement Ownership = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
	Select dd2 = new Select(Ownership);
	dd2.selectByIndex(3);

	//Enter Description
	driver.findElement(By.id("createLeadForm_description")).sendKeys("TCS");
	//Enter Country Code
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("1");
	//Enter Area Code
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("10452");
	//Enter Extension
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("402"); 
	//Enter Department
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("MKT");
	//Enter Currency 
	WebElement Currency = driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']"));
	Select dd3 = new Select(Currency);
	dd3.selectByIndex(1);
	//Enter Employee
	driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("100");
	//Enter Url
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("google.com");
	//Enter Address Line
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("maharastha");
	//Enter City
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Channai");
	//Enter state
	WebElement State = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
	Select dd4 = new Select(State);
	dd4.selectByIndex(4);
	//country
	WebElement Country = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
	Select dd5 = new Select(Country);
	dd5.selectByIndex(18);
	//Enter Postal Code
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("1234");
	//Enter Extension
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("10");
	//Enter Campaign
	WebElement Campaign = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
	Select dd6 = new Select(Campaign);
	dd6.selectByVisibleText("Car and Driver");
	//Enter phone
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("123456");
	//Enter Email
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ABC@Gmail.com");
	//Enter Create Lead
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();



}

}












