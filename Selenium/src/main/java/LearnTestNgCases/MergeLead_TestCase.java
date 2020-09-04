package LearnTestNgCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MergeLead_TestCase {


@Test
	            public void MergeLead_TestCase() throws InterruptedException {
		
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
				// click Leads link
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				// click Merge Lead
				driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
				// click on icon near from lead
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
				// get the first window reference
				String firstwindow = driver.getWindowHandle();
				// Move to New Window
				Set<String> allwin = driver.getWindowHandles();
				System.out.println(allwin);
				for(String eachwin : allwin) {
					driver.switchTo().window(eachwin);
					System.out.println(driver.getTitle());
				}
				
				// click Lead Id
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10080");
				// click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(3000);
				// click first resulting button
				
				driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
				
				// switch back to primary window
				driver.switchTo().window(firstwindow);
				
				// click merge button
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				//Alert
				String text = driver.switchTo().alert().getText();
				System.out.println(text);
				driver.switchTo().alert().accept();
			    Thread.sleep(2000);
				// click finds lead
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				//enter lead id
	
				driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys("10001");
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				// Verify error massage
				String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
				
				System.out.println(text2);
				if (text2.contains("no records to display")) {
					System.out.println("error msg is matched");
				}else {
					System.out.println("error is not matched");
				}
				
				
			
				
				

	
}

}
