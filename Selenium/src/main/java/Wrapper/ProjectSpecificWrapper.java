package Wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import cucumber.api.java.Before;

public class ProjectSpecificWrapper {
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

 @AfterMethod 
 public void closebrowser(){
	driver.close();
}
}