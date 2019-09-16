package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static public WebDriver driver;
	
	public static void main(String[] args) {
		// Launching browser
		//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//resize the browser
		Dimension d=new Dimension(200, 200);
		driver.manage().window().setSize(d);
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.navigate().to("http://zero.webappsecurity.com/");
		
		WebElement signin=driver.findElement(By.id("signin_button"));
		signin.click();
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.id("user_password")).sendKeys("pass");
		
		driver.findElement(By.name("submit")).click();
		//to print the title
		//String title=driver.getTitle();
		//System.out.println(title);
		
		if(driver.getTitle().equals("Zero - Log in"))
		{
			System.out.println("Pass: Title is correct");
		}
		else
		{
			System.err.println("Fail: Title is incorrect");
		}
		
		if(driver.findElement(By.xpath("//*[@id='login_form']/div[1]")).getText().equals("Login and/or password are wrong."))
		{
			System.out.println("Pass: Error message displayed");
		}
		else
		{
			System.err.println("Fail: Error message not displayed");
		}
		
			
		//driver.close();
	}
}
