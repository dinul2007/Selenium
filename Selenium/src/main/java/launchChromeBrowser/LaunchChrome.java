package launchChromeBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChrome {

	//public static void main(String[] args) {
		
	@Test
	
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		//Lunch the Url
		//driver.get("http://www.leaftaps.com/opentaps");
		//Maximize windows
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//page title
		//driver.getTitle();
		//enter name
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//enter password
		//driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login button
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		//close Browser
		//driver.close();
	
		driver.get("http://www.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.getTitle();
		
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.id("login-username")).sendKeys("dinul2007");
		
		//driver.findElement(By.id("//input[@value='Next']")).click();
	}
	
	}


