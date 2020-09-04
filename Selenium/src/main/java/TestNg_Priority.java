import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Priority {

	
		public ChromeDriver driver;

		@BeforeMethod
		
		public void login() {
			
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");
	    driver = new ChromeDriver();

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
		driver.findElement(By.linkText("CRM/SFA")).click();
		

	}
		@Test(priority = 0)
        public void CreateLead() throws InterruptedException {
        
    	//create Lead
    	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
    	//enter Company Name
    	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
    	//enter First Name
    	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("G");
    	// Enter Last Name
    	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");

		Thread.sleep(2000);
		}
		 
		@Test(priority = 1)
	     
		public void EditLead() throws InterruptedException {
		   
			//Click Leads link
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			//Click find Leads
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			//Enter first name
			driver.findElement(By.id("ext-gen248")).sendKeys("Hema");
			//Click find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);	
}		
		
		@Test(priority = 2)
        
		public void DuplicateLead_TestCase() throws InterruptedException {

       
		//click leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//click finds lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		// Enter on Email Address
		driver.findElement(By.name("emailAddress")).sendKeys("ABC@gmail.com");
		//Click Find Leads button
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 	Thread.sleep(2000);

		}		
		 @AfterMethod 
		 public void closebrowser(){
			driver.close();
		}		
		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
