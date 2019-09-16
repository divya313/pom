package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://zero.webappsecurity.com/");
		WebElement signin=driver.findElement(By.id("signin_button"));
		signin.click();
        driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//*[@id=\"transfer_funds_tab\"]/a")).click();
		WebElement fromaccount=driver.findElement(By.cssSelector("#tf_fromAccountId"));
		Select fromaccoutsele=new Select(fromaccount);
		//fromaccoutsele.selectByIndex(4);//
		//fromaccoutsele.selectByValue("3");//
		//get the no.of options
		List<WebElement> option=fromaccoutsele.getOptions();
		int s1=option.size();
		System.out.println("no.of elments=" +s1);
		//fromaccoutsele.selectByVisibleText("Loan(Avail. balance = $ 780)");
		WebElement toaccount=driver.findElement(By.cssSelector("#tf_toAccountId"));
		Select toaccoutsele=new Select(toaccount);
		toaccoutsele.selectByVisibleText("Credit Card(Avail. balance = $ -265)");
		driver.findElement(By.cssSelector("#tf_amount")).sendKeys("1000");
		driver.findElement(By.cssSelector("#tf_description")).sendKeys("by divya");
		driver.findElement(By.xpath("//*[@id=\"btn_submit\"]")).click();
	}
		void bool(boolean expected , boolean actual) {
			if(expected!=actual) {
				System.err.println("Value Mismatch error(Bool): expected-"+expected+"\tactual-"+actual);
			}
		}
		
		void text(String expected, String actual) {
			if(expected.equals(actual)==false) {
				System.err.println("Value Mismatch error(Text): expected-"+expected+"\tactual-"+actual);
			}
		}

		
	}


