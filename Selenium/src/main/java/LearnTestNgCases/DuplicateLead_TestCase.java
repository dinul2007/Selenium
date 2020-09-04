package LearnTestNgCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLead_TestCase { 
	
@Test
            public void DuplicateLead_TestCase() throws InterruptedException {
	
	        System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");
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
			driver.findElement(By.linkText("CRM/SFA")).click();
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
		    
		    Thread.sleep(3000);
		    // Capture Name  on First Resulting Lead
		    String firstname = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']")).getText();
		    System.out.println(firstname);
		   
		    //Click First Resulting Lead
		    
		    String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			// click Duplicate Lead
			driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
			//verify title
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Duplicate")) {
			System.out.println("title Matched");
			}else {
				System.out.println("title not Matched");
			}
			// Click Create Lead
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			// Confirm the duplicate lead name same as captured name
			String DuplicateLeadName = driver.findElement(By.xpath("//span[text()='fn']")).getText();
			System.out.println(DuplicateLeadName);
			if(DuplicateLeadName.contains("fn")) {
				System.out.println("Matched");
			}else {
				System.out.println("not Matched");
			}
			


}


}
