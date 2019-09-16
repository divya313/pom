package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
		WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		WebElement where=driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String link=where.getAttribute("href");
		System.out.println(link);
		WebElement error=driver.findElement(By.linkText("Verify am I broken?"));
		error.click();
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("link is broken");
		}
		driver.navigate().back();
		WebElement homepage1=driver.findElement(By.linkText("Go to Home Page"));
		homepage1.click();
		driver.navigate().back();
		List<WebElement> total=driver.findElements(By.tagName("a"));
		int to=total.size();
		System.out.println(to);
			
		

	}

}
