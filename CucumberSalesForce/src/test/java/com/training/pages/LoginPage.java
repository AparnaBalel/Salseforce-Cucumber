package com.training.pages;

import com.training.base.BasePage;
import com.training.base.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
     static WebDriver driver;
     
	public LoginPage() {  
	super(driver=BaseTest.getDriver());
	
	              addObject("Username",By.id("username"));
	
	              addObject("Password",By.id("password"));
	
	                 addObject("Login",By.id("Login"));
	      
	            addObject("RememberMe",By.id("rememberUn"));
	
	                 addObject("Error",By.id("error"));
	
	            addObject("VerifyName",By.id("idcard-identity"));
	
	        addObject("ForgotPassword",By.id("forgot_password_link"));
	
	             addObject("Username2",By.id("un"));
	
	              addObject("Continue",By.id("continue"));
	
	         addObject("Resetpassword",By.id("content"));
	
	          addObject("ErrorMessage",By.id("error"));
	}
}
