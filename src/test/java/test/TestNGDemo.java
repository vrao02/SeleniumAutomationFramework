package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	
	WebDriver driver = null;
	
	
	@BeforeTest
	public void setupTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	
	@Test
	
	public void googlesearch() {
		
		
		
		//goto google.com
		
		driver.get("https://google.com");
		
		//enter text is search textbox
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on search button
		
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
		
	}
		
		
		
	@AfterTest
	
	public void tearDownTest() { 
		
		//close browser
		
				driver.close();
				driver.quit();
				
				System.out.println("test completed successfully");
		
		
		
	}

}


