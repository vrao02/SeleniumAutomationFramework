package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		
		
		googlesearch();
		
		
	}	
	
	public static void googlesearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//goto google.com
		
		driver.get("https://google.com");
		
		//enter text is search textbox
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on search button
		
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
		
		
		
		//close browser
		
		driver.close();
		
		System.out.println("test completed successfully");
		
		
	

}
}

