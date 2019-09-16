package Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		WebElement box=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		box.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WebElement confirmbox=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirmbox.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		WebElement textbox=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		textbox.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("divya");
		alert2.accept();
		
	}

}
