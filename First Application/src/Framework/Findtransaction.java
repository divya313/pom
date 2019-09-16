package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Findtransaction {
  
	 static WebDriver driver;
	  @BeforeTest
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://zero.webappsecurity.com/");
			driver.findElement(By.id("signin_button")).click();

			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.name("submit")).click();
		}
  @Test
  public void f() {
	  driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
	  WebDriverWait Wait=new WebDriverWait(driver, 50);
	  WebElement trans=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//a[text()='Find Transactions']")));
	  trans.click();
  }

  @AfterTest
  public void afterTest() {
  }

}
