package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
		WebElement index=driver.findElement(By.id("dropdown1"));
		Select index1=new Select(index);
		index1.selectByIndex(2);
		index1.selectByVisibleText("Selenium");
		index1.selectByValue("3");
		List<WebElement> options=index1.getOptions();
		int size1=options.size();
		System.out.println("size is"+size1);
		index.sendKeys("Loadrunner");
		WebElement multiselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multi=new Select(multiselect);
		multi.selectByIndex(0);
		multi.selectByIndex(1);

	}

}
