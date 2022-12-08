package com.training.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomeTabPage extends BasePage{
    static WebDriver driver;

	public HomeTabPage () {
		super(driver=BaseTest.getDriver());
	

	          addObject("Userprofile",By.xpath("//h1[@class='currentStatusUserName']"));

	          addObject("Editprofile",By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));

	              addObject("Contact",By.xpath("//iframe[@id='contactInfoContentId']"));

	                addObject("About",By.id("aboutTab"));

	             addObject("Lastname",By.xpath("(//input[@id='lastName'])[1]"));
	             
	             addObject("ProfileName",By.id("tailBreadcrumbNode"));

	              addObject("Saveall",By.xpath("//input[@value='Save All']"));

	         addObject("Customizetab",By.name("customize"));

	            addObject("Libraries",By.xpath("//select//option[contains(text(),'Libraries')]"));

	         addObject("Selectedtabs",By.xpath("//select[@id='duel_select_1']"));

	               addObject("Remove",By.xpath("//img[@title='Remove']"));

	                 addObject("Save",By.name("save"));

	             addObject("Datelink",By.cssSelector("#ptBody > div > div.content > span.pageDescription > a"));

	                 addObject("8PM",By.xpath("(//div[@id='p:f:j_id25:j_id61:28:j_id64'])[1]"));

	              addObject("Subject",By.xpath("(//img[@title='Subject Combo (New Window)'])[1]"));

	                addObject("Other",By.cssSelector("a[href='javascript:pickValue(4);']"));

	              addObject("Endtime",By.cssSelector("#EndDateTime_time"));

	               addObject("Ninepm",By.cssSelector("#timePickerItem_42"));
	
	               addObject("Fourpm",By.xpath("(//div[@id='p:f:j_id25:j_id61:20:j_id64'])[1]"));

	              addObject("Sevenpm",By.xpath("(//div[@id='timePickerItem_38'])[1]"));

	              addObject("savenew",By.xpath("(//input[@title='Save'])[2]"));

	           addObject("Recurrence",By.id("IsRecurrence"));
	
	               addObject("Weekly",By.id("rectypeftw"));

            addObject("Recurrenceend",By.id("RecurrenceEndDateOnly"));
            
            addObject("Recurrenceenddate",By.xpath("(//td[normalize-space()='31'])[1]"));

	                   // addObject("recurrencedate",By.cssSelector("tr[id='calRow6'] td[class='weekend']"));

            addObject("Post",By.xpath("(//span[normalize-space()='Post'])[1]"));
            
		       addObject("Postiframe",By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
     
		             addObject("Text",By.xpath("/html[1]/body[1]"));
     
		            addObject("Share",By.xpath("(//input[@id='publishersharebutton'])[1]"));
    
		             addObject("File",By.xpath("//span[normalize-space()='File']"));
     
		       addObject("Uploadfile",By.xpath("//a[@id='chatterUploadFileAction']"));
    
		       addObject("Choosefile",By.xpath("//input[@id='chatterFile']"));
    
		      addObject("Uploadphotoframe",By.xpath("//iframe[@id='uploadPhotoContentId']"));
    
		         addObject("Addprofilephoto",By.xpath("(//div[@class='photoUploadSection'])[1]"));
    
		             addObject("ChoosePhotoFile",By.xpath("(//input[@id='j_id0:uploadFileForm:uploadInputFile'])[1]"));
		             
		             addObject("Save",By.xpath("(//input[@class=\"btn saveButton\"])[1]"));
		             
		            addObject("Crop-img",By.xpath("//div[@class='imgCrop_selArea']//div[@class='imgCrop_clickArea']"));
		             
		             addObject("nextSave",By.xpath("(//input[@id='j_id0:j_id7:save'])[1]"));
    }

		
}
