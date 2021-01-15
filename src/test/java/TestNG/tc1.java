package TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	
		
	  @Test
		
	 public static void main(String []args) throws MalformedURLException{
	        new DesiredCapabilities();
	            URL serverurl = new URL("http://localhost:9515");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	            WebDriver driver = new RemoteWebDriver(serverurl,capabilities);
	        driver.get("http://www.google.com");
	        WebElement searchEdit = driver.findElement(By.name("q"));
	        searchEdit.sendKeys("Selenium Testing");
	        searchEdit.submit();

	    }
	  

  }
