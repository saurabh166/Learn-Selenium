package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpage;
 
public class LoginPageTest extends Testbase{
	Loginpage loginPage;
	HomePage homePage;
	
	public LoginPageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void SetUp() throws IOException{
		initialization();
		loginPage = new Loginpage();
	}

	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud for sales and service");
		}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean  flag = loginPage.ValidateCrmImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}