package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase{

	
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath ="//input[@type ='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath ="//button[@contains(text(),'signup']")
	WebElement signup;
	
	@FindBy(xpath ="//span[contains(@class, 'brand-slogan')]")
	WebElement CrmLogo;
	
	
	public Loginpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
		public String ValidateLoginPageTitle(){
			return driver.getTitle();
		}
		public boolean ValidateCrmImage(){
			return CrmLogo.isDisplayed();
		}
	
		public HomePage login(String un,String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			LoginBtn.click();
			return new HomePage();
			
		}

		
	}
	
	
	
	
	
	
	
	

   