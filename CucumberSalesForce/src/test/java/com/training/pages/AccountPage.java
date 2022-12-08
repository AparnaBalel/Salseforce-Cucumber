package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AccountPage extends BasePage{
	static WebDriver driver;
	public  AccountPage() {
		super(driver=BaseTest.getDriver());

	                    addObject("NewClick",By.xpath("//input[@title='New']"));
	
	               addObject("Acctname",By.id("acc2"));
	
	                   addObject("Type",By.xpath("//select[@id='acc6']"));
	
	               addObject("Priority",By.id("00N8Z0000070GuJ"));
	
	                   addObject("Save",By.name("save"));
   
	                addObject("Createnewview",By.xpath("//a[normalize-space()='Create New View']"));
    
	               addObject("Viewname",By.id("fname"));
     
	             addObject("Uniquename",By.id("devname"));
	             
	                   addObject("View",By.id("fcf"));
	             
                       addObject("Edit",By.xpath("//a[normalize-space()='Edit']"));
  
	                  addObject("Field",By.id("fcol1"));
   
	               addObject("Operator",By.id("fop1"));
   
	                  addObject("Value",By.id("fval1"));
    
	                  addObject("MergeAcct",By.xpath("//a[normalize-space()='Merge Accounts']"));
    
	                 addObject("Search",By.id("srch"));
   
	                   addObject("Find",By.name("srchbutton"));
   
	                    addObject("CheckBox1",By.id("cid0"));
   
	                    addObject("CheckBox2",By.id("cid1"));
    
	                   addObject("Next",By.xpath("(//input[@title='Next'])[2]"));
    
	                 addObject("Merge2",By.name("save"));
    
	           addObject("Lastactivity",By.xpath("(//a[normalize-space()='Accounts with last activity > 30 days'])[1]"));
   
	              addObject("Datefield",By.xpath("//input[@id='ext-gen20']"));
   
	            addObject("Createddate",By.xpath("//div[contains(text(),'Created Date')]"));
  
	               addObject("From-Date",By.id("ext-gen152"));
   
	             addObject("From-Todaysdate",By.id("ext-gen279"));
	             
	                 addObject("To-Date",By.id("ext-gen154"));
	                 
	                 addObject("to-Todaysdate",By.id("ext-gen302"));
	                 
	             addObject("Savereport",By.id("ext-gen49"));
   
	             addObject("Reportname",By.name("reportName"));
   
	             addObject("Nameunique",By.name("reportDevName"));
    
	                addObject("Saverun",By.id("ext-gen327"));
    
	                   //addObject("Home",By.id("home_Tab"));
    
	}

}
