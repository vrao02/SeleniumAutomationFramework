package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	
	private static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		
		
		googleSearchTest();
		
	}
		
		public static void googleSearchTest() {
			
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webDriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    
		    
		    GoogleSearchPageObjects searchPageObj =  new GoogleSearchPageObjects(driver);
			
		    
		    driver.get("https://google.com");
		    searchPageObj.setTextInSearchBox("abcd");
		    searchPageObj.clickSearchButton();
		    
		    driver.quit();
		    System.out.println("test completed successfully");
			
			
		}
		
	}


