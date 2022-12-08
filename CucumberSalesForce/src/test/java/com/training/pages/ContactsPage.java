package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;

public class ContactsPage extends BasePage{
	 static WebDriver driver;

	public ContactsPage() {
		super(driver=BaseTest.getDriver());
	
	       addObject("newbutton",By.name("new"));
            
	        addObject("lastname",By.id("name_lastcon2"));

	        addObject("acctname",By.id("con4"));

	         addObject("newsave",By.name("save_new"));

	            addObject("save",By.name("save"));

	          addObject("cancel",By.name("cancel"));

	         addObject("Createnewview",By.xpath("//a[contains(text(),'Create New View')]"));

	 	    addObject("viewname",By.id("fname"));

	      addObject("uniquename",By.id("devname"));
	      
	      addObject("Errormessage",By.xpath("(//div[@class='errorMsg'])[1]"));

	 addObject("recentlycreated",By.xpath("//select[@id='hotlist_mode']"));

	            addObject("view",By.id("fcf"));
	            
	            addObject("gobutton",By.name("go"));
	            
	            addObject("ShowItems",By.xpath("(//a[normalize-space()='Show 25 items'])[1]"));

	     addObject("Contactname",By.xpath("(//a[contains(text(),'Indian')])[1]"));
    
	
	} 

}
