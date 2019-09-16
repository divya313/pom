package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PayBillsPage {

	WebDriver driver;
	
	public PayBillsPage(WebDriver driver)
	{
		this.driver=driver;
	}

	 @FindBy(how=How.XPATH, using="//a[text()='Add New Payee']")
	 WebElement addNewPayeeLink;
	 

	 @FindBy(how=How.ID, using="np_new_payee_name")
	 WebElement payeeNameTextField;
	 @FindBy(how=How.ID, using="np_new_payee_address")
	 WebElement payeeAddressTextField;
	 @FindBy(how=How.ID, using="np_new_payee_account")
	 WebElement payeeAccountTextField;
	 @FindBy(how=How.ID, using="np_new_payee_details")
	 WebElement payeeDetailsTextField;
	 @FindBy(how=How.ID, using="add_new_payee")
	 WebElement payeeAddbutton;
	 @FindBy(how=How.ID, using="sp_payee")
	 WebElement payeename;
	 

	 public void clickAddNewPayeeLink()
	 {
		 addNewPayeeLink.click();
	 }
	 public void Detailslist(String payeeName,String payeeAddress,String Account,String payeeDetails)
		{
		 payeeNameTextField.sendKeys(payeeName);
		 payeeAddressTextField.sendKeys(payeeAddress);
		 payeeAccountTextField.sendKeys(Account);
		 payeeDetailsTextField.sendKeys(payeeDetails);
		 Select select=new Select(payeename);
		 List<WebElement> eles=select.getOptions();
		  List<String> option=new ArrayList();
		  for(WebElement ele : eles)
		  {
			  option.add(ele.getText());
		  }
		Assert.assertEquals(option.contains("Prem Kumar"), true);
			 
			 
		 }
		 
		
	 
	 public void clickAddButton()
	 {
		 payeeAddbutton.click();
	 }

	 public String getConfirmationText()
	 {
		 return "The new payee prem kumar was successfully created";
	 }
	 
	/*public void FillDetails(String payeeName,String payeeAddress,String Account,String payeeDetails)
	 {
		WebElement payeeNameTextField=GetElementVisible("//input[@id='np_new_payee_name']");
		payeeNameTextField.sendKeys(payeeName);
		WebElement payeeAddressTextField=GetElementVisible("//input[@id=np_new_payee_address]");
		payeeNameTextField.sendKeys(payeeAddress);
		WebElement payeeAccountTextField=GetElementVisible("//input[@id=np_new_payee_account]");
		payeeNameTextField.sendKeys(Account);
		WebElement payeeDetailsTextField=GetElementVisible("//input[@id=np_new_payee_details]");
		payeeNameTextField.sendKeys(payeeDetails);
		
		
	 }*/
	
	 //private WebElement GetElementVisible(String locator) {
		// WebDriverWait wait;
	     //wait=new WebDriverWait(driver,10);
		 //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	//}
	 
}
