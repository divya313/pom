package Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyMoneyApp {

	private static WebElement element;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.navigate().to("http://zero.webappsecurity.com/");
			WebElement signin1=driver.findElement(By.id("signin_button"));
			signin1.click();
			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.name("submit")).click();
			driver.findElement(By.xpath("//a[text()='My Money Map']")).click();
			//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			WebDriverWait wait=new WebDriverWait(driver,8);
			WebElement transport=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=\"Transportation\"][2]")));
			transport.click();
			//WebElement transport1=driver.findElement(By.cssSelector("#ext-sprite-2317 > tspan"));
			//driver.findElement(By.id("ext-sprite-2568")).click();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		finally {
			//driver.quit();
		}
	}
	//private static void verifyDouble(boolean true, boolean false) {
	//if (element.isDisplayed()) {
		
		//}
	//}

}
