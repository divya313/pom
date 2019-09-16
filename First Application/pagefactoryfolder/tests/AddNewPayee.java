package tests;

import org.testng.annotations.Test;

import driver.BaseClass;
import pages.AccountSummaryPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PayBillsPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AddNewPayee {
	BaseClass baseclass;
	PayBillsPage paybillspage;
	  @BeforeTest
	  public void beforeTest() {
		  baseclass =new BaseClass();
		  
		  HomePage homepage=PageFactory.initElements(baseclass.driver, HomePage.class);
		  homepage.clickSignInButton();
		  
		  Assert.assertEquals(baseclass.driver.getTitle(), "Zero - Log in");
		  
		  LoginPage loginpage= PageFactory.initElements(baseclass.driver, LoginPage.class);
		  loginpage.enterUNameAndPWord("username", "password");
		  loginpage.clickSignInButton();
		  
		  AccountSummaryPage accountsummarypage=PageFactory.initElements(baseclass.driver, AccountSummaryPage.class);
		  accountsummarypage.clickPayBillsLink();
	  
	  }  
  
	  @BeforeMethod
	  public void bfmethod()
	  {
		  paybillspage=PageFactory.initElements(baseclass.driver, PayBillsPage.class);
		  paybillspage.clickAddNewPayeeLink();
		  //assert.assertEquals(actual, expected);
	  }
	  @Test
	  public void f() {
		  paybillspage.Detailslist("Prem Kumar","Electronic city","qwerty12345","from divya");
		  paybillspage.clickAddButton();
		  
		//Assert.assertEquals(PayBillsPage.class, "The new payee prem kumar was successfully created");
		  
	  }

  @AfterTest
  public void afterTest() {
  }

}
