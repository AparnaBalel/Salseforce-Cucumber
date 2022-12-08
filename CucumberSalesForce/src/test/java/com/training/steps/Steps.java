package com.training.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Steps extends BaseTest{
	WebDriver driver;
	BasePage page;
	PageFactory pageFactory = new PageFactory();
	
	      @Before
	public void setup() throws IOException   {
		        launchApplication() ;  }

	      @Given("User is on {string}")                                   //Given User is on "pagename"
	public void user_is_on(String pageName) {
	            page = this.pageFactory.initialize(pageName);
	     }

	      @When("User enter into text box {string} {string}")              // text box//When User enter into text box
	public void user_enter_into_text_box(String logicalName, String value){
	           // page.waitForString(logicalName, 20);
	    	    page.enterintoTextBox(logicalName, value);      
	     }	
	      @Then("click on link {string}")                                  // Then click on link
	public void user_click_on_link(String logicalName) {
                page.clickOnLink(logicalName);
		}
	    
	      @Then("click on tab {string}")                                  // Then click on tab 
    public void click_on_tab(String logicalName)  {
	    	    page.clicksOnTab(logicalName);  
	     }
	      @Then("clicks on Button {string}")                             // Then clicks on Button
	public void clicks_on_button(String logicalName) {
	            page.clicksOnButton(logicalName);  
	     }
	     
	      @Then("clicks on newbutton {string}")                         // Then clicks on newbutton 
	public void clicks_on_newbutton(String logicalName) throws InterruptedException {
	            Thread.sleep(5000);
	    	    page.clicksOnNewButton(logicalName);
	     } 
	      @Then("select date {string}")
	public void select_date(String logicalName) {
	            page.SelectDate(logicalName);
	     }
	      @Then("click on Checkbox {string}")                   //Then click on Checkbox
    public void click_on_checkbox(String logicalName) {
	            page.clickonCheckBox(logicalName);
	     }
	      @Then("click on Radiobutton {string}")
	public void click_on_radiobutton(String logicalName) {
	            page.clickonRadioButton(logicalName);
	     }
	      @Then("close new window")                              //Then close new window
	public void close_window() throws InterruptedException  {
	            Thread.sleep(3000);
	            page.SwitchWindow();        
	     }
	      @Then("switch to popupwindow {string}")
	public void switch_to_popupwindow(String logicalName) throws InterruptedException {
	    	    Thread.sleep(5000);
	            page.SwitchToWindowPopUp(logicalName);
	    	    Thread.sleep(5000);
	     }
	      @Then("Switch to Frame {string}")                          // And Switch to Frame 
	public void switch_to_frame(String logicalName) throws InterruptedException {
		        Thread.sleep(5000);
            page.SwitchToFrame(logicalName);
	     }
	      @When("switch to window")                                // And switch to window
	public void switch_to_window() {
	    	    page.SwitchToDefaultWindow();	        
	     }
	      @Then("take Action {string}")
	public void take_action(String logicalName) throws InterruptedException {
	            page.Actions(logicalName);
	     }	
	      @Then("Robot Action {string}")
	public void robot_action(String logicalName) throws InterruptedException, AWTException {
	    	  page.Robot(logicalName);  	     	 
	      }
	      @Then("select by Text {string} {string}")                                  //Then select by Text
	public void select_by_text(String logicalName, String text) throws InterruptedException {
			    Thread.sleep(5000);
                page.Selectmethod(logicalName, text);  
	     }	    
	      @Then("select by index {string} {string}")
	      public void select_by_index(String logicalName, String Value) {
	         page.selectByIndex(logicalName, 1);
	      }
	      @Then("switch to alert")                  // And switch to alert
	public void switch_to_alert() {
	            page.SwitchToAlert();    
	     }

          @When("User verify the text {string} {string}")             // When User verify the text
	public void user_verify_the_text(String logicalName, String ExpectedValue) throws InterruptedException {
        	    page.verifyText(logicalName, ExpectedValue);         
         }
	      @When("User verify the resetpassword {string} {string}")
	public void user_verify_the_resetpassword(String logicalName, String ExpectedValue) throws InterruptedException {
	            ExpectedValue ="We’ve sent you an email with a link to finish resetting your password.\n"
		    	 		     + "Can’t find the email? Try checking your spam folder.\n"
		    	 		     + "If you still can’t log in, have us resend the email or contact your Salesforce administrator.\n"
		    	 		     + "Return to Login";
		    	page.verifyText(logicalName, ExpectedValue);    
	     } 
	      @When("User verify the usermenu {string} {string}")
	public void user_verify_the_usermenu(String logicalName, String ExpectedValue) throws InterruptedException {
	    	    ExpectedValue = "My Profile\n"
	                          + "My Settings\n"
	                          + "Developer Console\n"
	                          + "Switch to Lightning Experience\n"
	                          + "Logout";
	    	    page.verifyText(logicalName, ExpectedValue);
	     }
	       @When("User verify the OptyOptions {string} {string}")
	 public void user_verify_the_opty_options(String logicalName, String ExpectedValue) throws InterruptedException {
	    	     ExpectedValue = "All Opportunities\n"
	                           + "Closing Next Month\n"
	                           + "Closing This Month\n"
	                           + "My Opportunities\n"
	                           + "New Last Week\n"
	                           + "New This Week\n"
	                           + "Opportunity Pipeline\n"
	                           + "Private\n"
	                           + "Recently Viewed Opportunities\n"
	                           + "Won";
	    	     page.verifyText(logicalName, ExpectedValue);
	     }
	       @Then("verify Leads Dropdown {string} {string}")
	 public void verify_leads_dropdown(String logicalName, String ExpectedValue) throws InterruptedException {
	    	 ExpectedValue = "All Open Leads\n"
	                       + "My Unread Leads\n"
	                       + "Recently Viewed Leads\n"
	                       + "Today's Leads\n"
	                       + "View - Custom 1\n"
	                       + "View - Custom 2";
	    	 page.verifyText(logicalName, ExpectedValue);
	     }
	   

	
	@After
	public void teardown() {

			
	}
 }