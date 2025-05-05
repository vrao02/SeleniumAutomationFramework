import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	//WebDriver driver =  new FirefoxDriver();
	
	
	WebDriver driver =  new ChromeDriver();
	
	//WebDriver driver =  new InternetExplorerDriver();
	
	//WebDriver driver =  new EdgeDriver();
	
	driver.get("https://google.com/");
	
	driver.findElement(By.className("gLFyf")).sendKeys("Hello");
	
	List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
	
	
	//WebElement textbox = driver.findElement(By.className("gLFyf"));
	//textbox.sendKeys("Automation step by step");
	
	
	Thread.sleep(3000);
	
	driver.close();
	
	
	
	
}

}
