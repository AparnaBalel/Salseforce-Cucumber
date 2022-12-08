package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;

public class OpportunitiesPage extends BasePage   {
	  static WebDriver driver;

	public OpportunitiesPage() {
		super(driver=BaseTest.getDriver());
	
	               addObject("view",By.id("fcf"));

	           addObject("Pipeline",By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));

	              addObject("Stuck",By.xpath("//a[contains(text(),'Stuck Opportunities')]"));

	           addObject("Interval",By.id("quarter_q"));
	
	              addObject("Nextq",By.xpath("//select//option[contains(text(),'Next FQ')]"));

	            addObject("Include",By.id("open"));

	               addObject("Open",By.xpath("//select//option[contains(text(),'Open Opportunities')]"));

	                 addObject("RunReport",By.name("go"));

	           addObject("Newclick",By.name("new"));

	            addObject("Oppname",By.id("opp3"));

	           addObject("Acctname",By.id("opp4"));

	          addObject("Closedate",By.id("opp9"));

	               addObject("Date",By.xpath("//td[normalize-space()='31']"));
	
	              addObject("Stage",By.id("opp11"));

	        addObject("Probability",By.id("opp12"));

	             addObject("Lead source",By.id("opp6"));

	           addObject("Campaign Source",By.id("opp17"));
	
	               addObject("Save",By.name("save"));

	}
	
}
