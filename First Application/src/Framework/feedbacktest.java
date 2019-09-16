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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class feedbacktest {
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
	}

	

	@Test
	public void test() {
		driver.findElement(By.xpath("//strong[text()='Feedback']")).click();
		driver.findElement(By.xpath("//*[text()='Frequently Asked Questions']")).click();
		List<WebElement> elements=driver.findElements(By.xpath("//a[contains(text(),'How can I ')]"));
		Assert.assertEquals(2, elements.size());
		for(WebElement ele:elements)
		{
			highlight(driver,ele);
			Assert.assertTrue(ele.getText().contains("How can I"));
		}
	}

	private void highlight(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
	}

}
