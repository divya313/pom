package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		//WebElement button=driver.findElement(By.id("home"));
		//button.click();
		WebElement position1=driver.findElement(By.id("position"));
		Point xy=position1.getLocation();
		int x=xy.getX();
		int y=xy.getY();
		System.out.println("xvalue is"+x+ "yvalue is"+y);
		WebElement colour=driver.findElement(By.id("color"));
		String color=colour.getCssValue("background-color");
		System.out.println("colour is"+color);
		WebElement location=driver.findElement(By.id("size"));
		int height=location.getSize().getHeight();
		int width=location.getSize().getWidth();
		System.out.println("height is"+height+ "width is"+width);
	}

}
