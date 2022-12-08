package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends BasePage{
	  static WebDriver driver;
		public  HomePage() {
			super(driver=BaseTest.getDriver());

		    addObject("UserMenu",By.id("userNav"));
		    
		        addObject("Home",By.id("home_Tab"));
		
	   addObject("Opportunities",By.id("Opportunity_Tab"));
		
		    addObject("Accounts",By.id("Account_Tab"));
		
		       addObject("Leads",By.id("Lead_Tab"));
		
            addObject("Contacts",By.id("Contact_Tab"));
        
              addObject("Alltab",By.id("AllTab_Tab"));
        
              addObject("TabBar",By.id("tabBar"));

                addObject("Home",By.id("home_Tab"));
        
 
		}

}
