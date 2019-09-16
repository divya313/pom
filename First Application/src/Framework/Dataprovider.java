package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Dataprovider {
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
  
  @Test(priority=1)
	public void InvestmentAccounts() {
	  driver.findElement(By.xpath("//a[text()='Brokerage']")).click();
	  WebDriverWait wait=new WebDriverWait(driver, 3);
	  WebElement accounts=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aa_accountId")));
	  Select accountele=new Select(accounts);
	  String selectedvalue=accountele.getFirstSelectedOption().getText();
	  Assert.assertEquals("Brokerage",selectedvalue);
	}
  @Test(priority=2,dataProvider="Link")
	public void CreditAccounts(String Link) {
		driver.findElement(By.xpath("//a[text()='Account Summary']")).click();
		driver.findElement(By.xpath("//a[text()='"+Link+"']")).click();
		WebDriverWait Wait=new WebDriverWait(driver, 3);
		WebElement credits=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aa_accountId")));
		Select account=new Select(credits);
		  String selectedvalue=account.getFirstSelectedOption().getText();
		  Assert.assertEquals(Link,selectedvalue);
		
		
	}

  
  @DataProvider(name="Link")
  public Object[] getData(){
  return new Object[]
  	{
          "Checking",
          "Credit Card"
      };
}

}
