package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountSummaryPage {

	WebDriver driver;
	public AccountSummaryPage(WebDriver driver)
	{
		this.driver=driver;
	}

	 @FindBy(how=How.XPATH, using="//a[text()='Pay Bills']")
	 WebElement payBillsLink;

	 public void clickPayBillsLink()
	 {
		 payBillsLink.click();
	 }
}
