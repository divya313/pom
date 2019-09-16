package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
/*	
	By signInButtonBy=(By.id("signin_button"));
	
	WebElement signInButton=driver.findElement(signInButtonBy);
	*/
	
	//WebElement signInButton=driver.findElement(By.id("signin_button"));
	

	 @FindBy(how=How.ID, using="signin_button") 
	 WebElement signInButton;
	 
	 @FindBy(how=How.XPATH, using="//strong[text()='Feedback']")
	 WebElement feebackLink;

	 public void clickSignInButton()
	 {
		 signInButton.click();
	 }
}
