package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;

public class MySettingPage extends BasePage{

       static WebDriver driver;
		public  MySettingPage() {
			super(driver=BaseTest.getDriver());

		         addObject("Personal",By.id("PersonalInfo_font"));
		
		     addObject("Loginhistory",By.id("LoginHistory_font"));
		
		  addObject("Downloadhistory",By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		
		    addObject("Displaylayout",By.id("DisplayAndLayout_font"));
		
		     addObject("Customizetab",By.id("CustomizeTabs_font"));
       
		        addObject("Customapp",By.id("p4"));
       
		addObject("Salesforcechatter",By.xpath("//select//option[contains(text(),'Salesforce Chatter')]"));
        
		           addObject("Report",By.xpath("//option[@value='report']"));
        
		              addObject("Add",By.xpath("//img[@class='rightArrowIcon']"));
       
		             addObject("Save",By.name("save"));
       
		            addObject("Email",By.id("EmailSetup_font"));
       
		     addObject("Emailsetting",By.id("EmailSettings_font"));
       
		       addObject("Sendername",By.id("sender_name"));
       
		      addObject("senderemail",By.id("sender_email"));
       
		     addObject("Automaticbcc",By.id("auto_bcc1"));
        
		        addObject("Signature",By.id("signature"));
       
		 addObject("Calendarreminder",By.id("CalendarAndReminders_font"));
         
		 addObject("Activityreminder",By.id("Reminders_font"));
       
		     addObject("Testreminder",By.id("testbtn"));
       
		          addObject("Edittab",By.xpath("(//img[@title='Edit Profile'])[1]"));
        
		     addObject("Contact",By.id("//iframe[@id='contactInfoContentId']"));
       
		            addObject("About",By.id("aboutTab"));
       
		         addObject("Lastname",By.xpath("(//input[@id='lastName'])[1]"));
       
		          addObject("Saveall",By.xpath("//input[@value='Save All']"));
        
		             addObject("Post",By.xpath("(//span[normalize-space()='Post'])[1]"));
       
		       addObject("Postiframe",By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
        
		             addObject("Text",By.xpath("/html[1]/body[1]"));
        
		            addObject("Share",By.xpath("(//input[@id='publishersharebutton'])[1]"));
       
		             addObject("File",By.xpath("//span[normalize-space()='File']"));
        
		       addObject("Uploadfile",By.xpath("//a[@id='chatterUploadFileAction']"));
       
		       addObject("Choosefile",By.xpath("//input[@id='chatterFile']"));
       
		      addObject("Uploadphoto",By.xpath("(//span[@class='profileImage chatter-avatarFull chatter-avatar'])[1])"));
       
		         addObject("Addphoto",By.id("(//div[@class='photoUploadSection'])[1]"));
       
		             addObject("Home",By.id("home_Tab"));
		             
		             addObject("Home",By.id("home_Tab"));
		             
		             addObject("Home",By.id("home_Tab"));
		             
		             addObject("Home",By.id("home_Tab"));
       }

}
