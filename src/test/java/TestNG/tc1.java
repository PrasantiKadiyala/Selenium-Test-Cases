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
	WebDriver driver;

	@BeforeMethod
	public void launch() {
		new DesiredCapabilities();
		URL serverurl = new URL("http://localhost:9515");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(serverurl, capabilities);
		driver.get("http://18.223.210.194:32771/addressbook/");

	}

	@Test
	public void verfiy() throws MalformedURLException{

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
		 driver.close();  
	
		
 }
}
