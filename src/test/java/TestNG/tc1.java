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
	/* WebDriver driver;

   		@BeforeMethod
		public void launch() {
   		  String chromeDriverPath = "/usr/bin/chromedriver";
  		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
  		  ChromeOptions options = new ChromeOptions();
  		  options.setBinary("/usr/bin/chromedriver");
  		  WebDriver driver = new ChromeDriver(options);
  		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://15.207.98.49:32768/addressbook/");
		
		}
		
	  @Test
	  public void verfiy() {
		 
		  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		  driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
		  driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
		  driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
		  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
		  driver.findElement(By.id("gwt-uid-13")).sendKeys("6/30/20,");
		  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
		  
	  }
	  
	  @AfterMethod
	  public void close() {
		 driver.close();  */
	
	 public static void main(String []args) throws MalformedURLException{
	        new DesiredCapabilities();
	            URL serverurl = new URL("http://localhost:9515");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	            WebDriver driver = new RemoteWebDriver(serverurl,capabilities);
	        driver.get("http://www.google.com");
	        WebElement searchEdit = driver.findElement(By.name("q"));
	        searchEdit.sendKeys("Selftechy on google");
	        searchEdit.submit();

	    }
 }
  
