package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.ID, using="user_login")
	WebElement loginTextField;
	
	@FindBy(how=How.ID, using="user_password")
	WebElement passwordPasswordField;
	
	@FindBy(how=How.NAME, using="submit")
	WebElement signInButton;
	
	
	public void enterUNameAndPWord(String uname,String pword)
	{
		loginTextField.sendKeys(uname);
		passwordPasswordField.sendKeys(pword);
	}
	
	public void clickSignInButton()
	{
		signInButton.click();
	}
}
