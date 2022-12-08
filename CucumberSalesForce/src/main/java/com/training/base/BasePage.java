package com.training.base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import junit.framework.Assert;

public class BasePage {
	static WebDriver driver;
	
	public HashMap<String, By>ObjRep = new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {  
		    BasePage.driver = driver;  }
	
    public void addObject(String logicalName, By by) { 
		         ObjRep.put(logicalName, by);  
		    }

    public void enterintoTextBox(String logicalName, String Value) {     // TextBox  //When User enter into text box      
    	        WebElement element = getElement(logicalName);
 		        waitForElement(element,200);
                element.clear();
		        waitForElement(element,50);
		        element.sendKeys(Value);      }
    
    public void clickOnLink(String logicalName){                         // Then click on link
    	        waitForString(logicalName,20);	
    	        WebElement element = getElement(logicalName);
		        waitForElement(element,50);
		        element.click();  } 
    
    public void clicksOnTab(String logicalName){                         //  Then click on tab 
		        WebElement element = getElement(logicalName);
		        waitForElement(element,10);
                element.click();    }
		  
	public void clicksOnButton(String logicalName){                     // Then clicks on Button
		        WebElement element = getElement(logicalName);
		        waitForElement(element,120);
                element.click();    }

	public void clicksOnNewButton(String logicalName) throws InterruptedException{ // Then clicks on newbutton 
                Thread.sleep(5000);		   
                WebElement element = getElement(logicalName);
                Thread.sleep(5000);		   
                element.click();    }
	
	public void clicksOnCheckBox (String logicalName) {
		        WebElement element = getElement(logicalName);
		        waitForElement(element,50);
		        element.click();    }
	
	public void clickonCheckBox(String logicalName) {
		        WebElement element = getElement(logicalName);
		        waitForElement(element,50);
		        element.click();     }
	
	public void clickonRadioButton(String logicalName) {
		        WebElement element = getElement(logicalName);
		        waitForElement(element,50);
		        element.click();      }
	

	public void SelectDate (String logicalName) {
		        WebElement element = getElement(logicalName);
		        waitForElement(element,50);
		        element.click();    }
	
    public void waitForElement(WebElement element, int time) {
		        WebDriverWait wait = new WebDriverWait(driver,time);
		        wait.until(ExpectedConditions.visibilityOf(element)); }
    
    public void waitForString(String logicalName, int time) {
    	       WebElement element = getElement(logicalName);
		        WebDriverWait wait = new WebDriverWait(driver,time);
		        wait.until(ExpectedConditions.visibilityOf(element)); }
 
    
    public void SwitchWindow() throws InterruptedException  {
    	        String parentwindow = driver.getWindowHandle();
    	        System.out.println(driver.getWindowHandles());
     for         (String handle:driver.getWindowHandles()) {
    	        Thread.sleep(3000);
    	        driver.switchTo().window(handle).close(); }}
    	      //  driver.switchTo().window(parentwindow);  }}
    	
        
    public  void SwitchToAlert() {
		         driver.switchTo().alert().accept();     }
	
    public  void SwitchToFrame(String logicalName) {
 	             WebElement element = getElement(logicalName);
                 waitForElement(element,200);
                 driver.switchTo().frame(element);    }
    
    public  void SwitchToDefaultWindow() {
		         driver.switchTo().defaultContent();    }

	         
    public  void SwitchToWindowPopUp(String logicalName) throws InterruptedException {
    	         Thread.sleep(5000);  
    	         WebElement element = getElement(logicalName);
    	         Set<String> handles = driver.getWindowHandles();
		if (handles.size() == 2) {
	             Iterator<String> itr = handles.iterator(); 

	             String parent_window = itr.next().toString();
	             String child_window = itr.next().toString();
	        
	             System.out.println(parent_window);
	             System.out.println(child_window);
	             driver.switchTo().window(child_window);
	             Thread.sleep(5000);
	             element.click();
	             driver.switchTo().window(parent_window);   }}
		
	
    
    public  void Actions(String logicalName) throws InterruptedException {
    	         Thread.sleep(5000);
 	             WebElement element = getElement(logicalName);
	             waitForElement(element,100);
                 Actions action = new Actions(driver);
	             action.moveToElement(element).build().perform();
	    	     Thread.sleep(5000);
	             element.click();}
    
    public void  Robot (String logicalname) throws InterruptedException, AWTException {
    	         Robot robot = new Robot();
   	    	     //robot.mouseMove(430, 220);
	  		     Thread.sleep(3000);

	  		     robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

	  		     robot.mouseMove(250, 240);
	  		     Thread.sleep(2000);
	  	         robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  		     Thread.sleep(2000);
    }
	    
    public void Selectmethod(String logicalName,String text) throws InterruptedException {
    	        Thread.sleep(5000);
    	        WebElement element = getElement(logicalName);
                Select select = new Select(element);
		        select.selectByVisibleText(text);       }
    
	
    public void selectByIndex(String logicalName, int index) {
    	        WebElement element = getElement(logicalName);
    	        Select select = new Select(element);
    	        select.selectByIndex(index);   }
	
    public void SelectTab(String logicalName, int index) {
 	            selectByIndex(logicalName,7);
    }
	
	public void verifyText (String logicalName, String ExpectedValue) throws InterruptedException{
		        Thread.sleep(5000);
	            WebElement element = getElement(logicalName);
	            waitForElement(element,5000);
	            String ActualValue = element.getText();
	            System.out.println("Length - "+ ActualValue.length());
	            System.out.println(ActualValue);
                System.out.println("Length - "+ ActualValue.length());
	            Assert.assertEquals(ExpectedValue, ActualValue);
	if     (ExpectedValue.equals(ActualValue))  {
		        System.out.println("Test is Pass");
	       }
	else  {
		        System.out.println("Test is Fail");   }}
   

	public WebElement getElement (String logicalName) {
		        WebElement element;
		        By by ;
		        by = ObjRep.get(logicalName);
		        driver.findElement(by);
                element =driver.findElement(by);
		        waitForElement(element,150);
         return element;
	      }
  public static void closepage() {
  }
}
