package Java;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseForeignCurrency {
	

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
			driver.findElement(By.xpath("//a[text()='Pay Bills']")).click();
			driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']")).click();
			
			//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			WebDriverWait wait=new WebDriverWait(driver,3);
			WebElement currency1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='pc_currency']")));
			//Thread.sleep(3000);
			//WebElement currency1=driver.findElement(By.xpath("//select[@id='pc_currency']"));
			Select currencyselect=new Select(currency1);
			currencyselect.selectByVisibleText("Denmark (krone)");
			
			WebElement sellrateele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sp_sell_rate")));
			String sellrate=sellrateele.getText();
			double sellratevalue=Double.parseDouble(sellrate.split(" ")[4]);
			
			double amount=99.56;
			
			driver.findElement(By.xpath("//input[@id='pc_amount']")).sendKeys(""+amount);
			WebElement selectedcur=driver.findElement(By.id("pc_inDollars_false"));
			if (selectedcur.isSelected()==false)
			{
				selectedcur.click();
			}
			driver.findElement(By.id("pc_calculate_costs")).click();
			
			double expectedamount=sellratevalue*amount;
			
			expectedamount= Math.round(expectedamount*100.0)/100.0;
			
			WebElement convamtele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pc_conversion_amount")));
			
			String convamt=convamtele.getText();
			double actualamount=Double.parseDouble(convamt.split(" ")[4]);
			System.out.print(expectedamount);
			verifyDouble(expectedamount,actualamount);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally
		{
			//driver.quit();
		}
	}

	private static void verifyDouble(double expected, double actual) {
		if(expected!=actual)
		{
			System.err.println("Values are not same\nExpected: "+expected+"\nActual: "+actual);
		}
		
	}
	

}
