package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AllTabPage extends BasePage{
	static WebDriver driver;
	public  AllTabPage() {
		super(driver=BaseTest.getDriver());
	    addObject("CustomizeTab",By.xpath("//input[@title='Customize My Tabs']"));
	    
	    addObject("Selectedtabs",By.name("duel_select_1"));
	    
	       addObject("AddButton",By.xpath("//img[@title='Add']"));
	    
	    addObject("RemoveButton",By.xpath("//img[@title='Remove']"));
	   
	       addObject("CustomApp",By.name("p4"));
	       
	       addObject("SaveButton",By.name("save"));
	}
}
