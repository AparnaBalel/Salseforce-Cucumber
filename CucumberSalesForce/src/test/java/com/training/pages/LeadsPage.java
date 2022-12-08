package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LeadsPage extends BasePage{
          static WebDriver driver;

	  public LeadsPage() {
		super(driver=BaseTest.getDriver());
		
	
	         
	             addObject("View",By.id("fcf"));

	               addObject("Go",By.name("go"));

	        addObject("Newbutton",By.name("new"));

	         addObject("Lastname",By.id("name_lastlea2"));

	      addObject("Companyname",By.id("lea3"));

	       addObject("savebutton",By.name("save"));
	  }
}
	  
	  
	  
	 