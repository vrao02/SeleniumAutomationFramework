package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.GoogleSearchPage;

public class ExtentReportsBasicDemo {

		
		private static WebDriver driver = null;
		
		public static void main(String[] args) {
		
		
			ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");
		
		
		
		//Create extent report and attach reporters
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		//Creates a toggle for the given test. add all log events under it		
		ExtentTest test1= extent.createTest("Google search Test 1");
		
		

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    
	    test1.log(Status.INFO, "Starting Test Case");
	    driver.get("https://google.com");
	    test1.pass("Navigated to the google website");
	    
	    
	    
	    driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	    test1.pass("Entered text in searchbox");
	    
	    
	    GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
	    test1.pass("Hit enter key");
	    
	    driver.close();
	    driver.quit();
	    test1.pass("closed the browser");
	    
	    test1.info("Test Completed");
	    
	    
	    
	    
	    
	  //Creates a toggle for the given test. add all log events under it		
	  		ExtentTest test2= extent.createTest("Google Search test 2");
	  		
	  		

	  		
	  		System.setProperty("webDriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	  	    driver = new ChromeDriver();
	  	    
	  	    
	  	    test2.log(Status.INFO, "Starting Test Case");
	  	    driver.get("https://google.com");
	  	    test2.pass("Navigated to the google website");
	  	    
	  	    
	  	    
	  	    driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	  	    test2.pass("Entered text in searchbox");
	  	    
	  	    
	  	    GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
	  	    test2.fail("Hit enter key");
	  	    
	  	    driver.close();
	  	    driver.quit();
	  	    test2.pass("closed the browser");
	  	    
	  	    test2.info("Test Completed");
	    
	    
	    extent.flush();
	    
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
