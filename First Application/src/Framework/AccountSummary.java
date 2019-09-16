package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class AccountSummary {


  static WebDriver driver;

	@BeforeTest
	public static void setUpBeforeClass() throws Exception {
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
	@Test(priority=2)
	public void CreditAccounts() {
		driver.findElement(By.xpath("//a[text()='Account Summary']")).click();
		driver.findElement(By.xpath("//a[text()='Checking']")).click();
		WebDriverWait Wait=new WebDriverWait(driver, 3);
		WebElement credits=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aa_accountId")));
		Select account=new Select(credits);
		  String selectedvalue=account.getFirstSelectedOption().getText();
		  Assert.assertEquals("Checking",selectedvalue);
		  List<WebElement> eles=account.getOptions();
		  List<String> option=new ArrayList();
		  for(WebElement ele : eles)
		  {
			  option.add(ele.getText());
		  }
		Assert.assertEquals(option.contains("Prem Kumar"), true);
	}
	@AfterMethod
	  public void afterMethod() {
		  //driver.navigate().back();
		//driver.findElement(By.xpath("//a[text()='Account Summary']"));
	  }
	

  @AfterTest
  public void afterTest() {
  }

}
