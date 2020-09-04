import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeSnapShot {

	   @Test
       public void EditLead() throws InterruptedException, IOException {
	    System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
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
		try {
		driver.findElement(By.id("ext-gen248")).sendKeys("Hema");
		System.out.println("Enter first name sussesfully");
		}catch(Exception e) {
			System.err.println("FirstName not enter successfully");
		}finally {//Take Snapshot
			
		File screenSource = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap/image1.png");
		FileUtils.copyFile(screenSource, dest);}
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on first resulting lead
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

	}

}
