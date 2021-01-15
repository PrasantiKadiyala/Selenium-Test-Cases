package TestNG;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	
	  @Test		
	  public void verify() throws MalformedURLException{
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
