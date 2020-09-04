package LearnTestNgCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead_TestCase {
	
        @Test
        public void EditLead() throws InterruptedException {
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
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click find Leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter first name
		driver.findElement(By.id("ext-gen248")).sendKeys("Hema");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on first resulting lead
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("view")) {
			System.out.println("title matched");
		}else {
			System.out.println("title not match");
		}
		// Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// change company name
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
		//click update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		// confirm the change name appears
		String changename = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(changename);
		if(changename.contains("appeared")) {
			System.out.println("name is matshed");
		
		}else {
			System.out.println("not matched");
		}
		
        }		

}
