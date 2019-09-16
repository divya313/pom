package Framework;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	static public WebDriver driver;
	 public static final String USERNAME = "divyaltha1";
	  public static final String AUTOMATE_KEY = "yUEWJz7xsZRX4jFFJnsv";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Safari");
		    caps.setCapability("browser_version", "12.0");
		    caps.setCapability("os", "OS X");
		    caps.setCapability("os_version", "Mojave");
		    caps.setCapability("resolution", "1024x768");

		driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://zero.webappsecurity.com/");
		
		WebElement signin=driver.findElement(By.id("signin_button"));
		signin.click();
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.id("user_password")).sendKeys("pass");
		
		driver.findElement(By.name("submit")).click();

		driver.quit();
	}
}
