package LearnTestNgCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

            public class DeleteLead_TestCase {
	        @Test
	        public void DeleteLead_TestCase() {
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
	}

}
