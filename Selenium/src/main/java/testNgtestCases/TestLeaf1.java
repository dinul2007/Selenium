package testNgtestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Wrapper.ProjectSpecificWrapper;


public class TestLeaf1 extends ProjectSpecificWrapper {
	@Test
	public void testLeaf1() {
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	//create Lead
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("RajKumar");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jay");
	driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("psyco");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2014948401");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@yahoo.com");
	
	}
}
