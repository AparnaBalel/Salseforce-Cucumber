package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuPage extends BasePage {
	 static WebDriver driver;
		public  UserMenuPage() {
			super(driver=BaseTest.getDriver());
			
			    addObject("UserMenu",By.id("userNav-menuItems"));
			
			   addObject("Myprofile",By.xpath("//a[contains(text(),'My Profile')]"));
			
			   addObject("Mysetting",By.xpath("//a[@title='My Settings']"));
			
		 addObject("Devloperconsole",By.xpath("//a[contains(text(),'Developer Console')]"));
			
			      addObject("Logout",By.xpath("//a[contains(text(),'Logout')]"));
			
			
		}
} 
