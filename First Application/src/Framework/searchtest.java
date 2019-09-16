package Framework;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class searchtest {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://zero.webappsecurity.com/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	

	@Test
	public void test() {
		driver.findElement(By.id("searchTerm")).sendKeys("Account");
		driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
		List<WebElement> elements=driver.findElements(By.xpath("//a[contains(text(),'Account')]"));
		Assert.assertEquals(2, elements.size());
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
			Assert.assertTrue(ele.getText().contains("Account"));
		}
	}

}
