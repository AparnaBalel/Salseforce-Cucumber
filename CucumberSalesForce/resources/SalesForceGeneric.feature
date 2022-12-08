Feature: SaleforceTestCase Login Feature to be Tested

@TESTCASE_1 
Scenario: Verify Error Message1
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
Then clicks on Button "Login"
When User verify the text "Error" "Please enter your password."

@TESTCASE_2 
Scenario: Verify Login2
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"

@TESTCASE_4A 
Scenario: Verify Reset Password4A
Given User is on "LoginPage"
Then clicks on Button "ForgotPassword"
When User enter into text box "Username2" "aparna@b.com"
Then clicks on Button "Continue"
When User verify the resetpassword "Resetpassword" "Expected"
                                                    
@TESTCASE_4B 
Scenario: Verify Username Password4B
Given User is on "LoginPage"
When User enter into text box "Username" "123"
When User enter into text box "Password" "22131"
Then clicks on Button "Login"
When User verify the text "ErrorMessage" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

@TESTCASE_5  
Scenario: Verify Usermenu Options5
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then clicks on Button "UserMenu"	
Given User is on "UserMenuPage"
When User verify the usermenu "UserMenu" "Expected"

@TESTCASE_6   
Scenario: Select MyProfile6
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then clicks on Button "UserMenu"	
Given User is on "UserMenuPage" 
Then clicks on Button "Myprofile"
Given User is on "HomeTabPage"
Then clicks on newbutton "Editprofile"
And Switch to Frame "Contact"
Then click on tab "About"
When User enter into text box "Lastname" "Balel"
Then clicks on Button "Saveall"
Then clicks on newbutton "Post"
Then Switch to Frame "Postiframe"
When User enter into text box "Text" "Hello All"
And switch to window
Then clicks on newbutton "Share"
Then clicks on newbutton "File"
Then clicks on newbutton "Uploadfile"
When User enter into text box "Choosefile" "C:\\Users\\aparna\\SettingFile\\hawaii.jpg"
Then clicks on newbutton "Share"
Then take Action "Addprofilephoto"
Then Switch to Frame "Uploadphotoframe"
When User enter into text box "ChoosePhotoFile" "C:\\Users\\aparna\\SettingFile\\hawaii.jpg"
Then clicks on newbutton "Save"
And Robot Action "Crop-img"

@TESTCASE_7   
Scenario: Verify Settings7
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then clicks on Button "UserMenu"	
Given User is on "UserMenuPage" 
When User verify the usermenu "UserMenu" "Expected"
Then clicks on Button "Mysetting"
Given User is on "MySettingPage"
Then click on link "Personal"
Then click on link "Loginhistory"
Then click on link "Downloadhistory"
Then click on link "Displaylayout"
Then click on link "Customizetab"
Then select by Text "Customapp" "Salesforce Chatter"
Then click on link "Report"
Then clicks on Button "Add"
Then clicks on Button "Save"
Then click on link "Email"
Then click on link "Emailsetting"
When User enter into text box "Sendername" "Aparna Balel"
When User enter into text box "senderemail" "aparnabalel@gmail.com"
Then clicks on Button "Automaticbcc"
Then clicks on Button "Save"
And switch to alert
Then click on link "Calendarreminder"
Then click on link "Activityreminder"
Then click on link "Testreminder"

@TESTCASE_9 
Scenario: verify Logout9
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then clicks on Button "UserMenu"	
Given User is on "UserMenuPage"
When User verify the usermenu "UserMenu" "Expected"
Then clicks on Button "Logout"

@TESTCASE_10 
Scenario: New Account10
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Accounts"
Given User is on "AccountPage"
Then clicks on newbutton "NewClick"
When User enter into text box "Acctname" "PG & E"
Then select by Text "Type" "Technology Partner"
Then select by Text "Priority" "High"
Then clicks on Button "Save"

@TESTCASE_11
Scenario: Create New View11
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Accounts"
Given User is on "AccountPage"
Then clicks on newbutton "Createnewview"
When User enter into text box "Viewname" "Sea"
When User enter into text box "Uniquename" "World"
Then clicks on Button "Save"

@TESTCASE_12    
Scenario: Change View Name12
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Accounts"
Given User is on "AccountPage"
Then select by Text "View" "USA"
Then clicks on Button "Edit"
When User enter into text box "Viewname" "Disney"
When User enter into text box "Uniquename" "World"
Then select by Text "Field" "Account Name"
Then select by Text "Operator" "contains"
When User enter into text box "Value" "A"
Then clicks on Button "Save"

@TESTCASE_13 
Scenario: Merge Account13
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Accounts"
Given User is on "AccountPage"
Then clicks on newbutton "MergeAcct"
When User enter into text box "Search" "Un"
Then clicks on newbutton "Find"
Then click on Checkbox "CheckBox1"
Then click on Checkbox "CheckBox2"
Then clicks on newbutton "Next"
Then clicks on newbutton "Merge2"
And switch to alert

@TESTCASE_14  
Scenario: Creat Account Report14
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Accounts"
Given User is on "AccountPage"
Then clicks on newbutton "Lastactivity"
Then select by Text "Datefield" "Created Date"
Then click on link "From-Date"
Then select date "From-Todaysdate"
Then click on link "To-Date"
Then select date "to-Todaysdate"
Then clicks on Button "Savereport"
When User enter into text box "Reportname" "PG & E"
When User enter into text box "Nameunique" "Electric"

@TESTCASE_15 
Scenario: Verify Opty Options15
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Opportunities"
Given User is on "OpportunitiesPage"
When User verify the OptyOptions "view" "Expected"

@TESTCASE_16   
Scenario: Creat New Opty16 
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Opportunities"
Given User is on "OpportunitiesPage"
Then clicks on newbutton "Newclick"
When User enter into text box "Oppname" "Data Entry"
When User enter into text box "Acctname" "United Oil & Gas Corp"
Then clicks on Button "Closedate"
Then select date "Date"
Then select by Text "Stage" "Qualification"
When User enter into text box "Probability" "10"
Then select by Text "Lead source" "Web"
When User enter into text box "Campaign Source" "GC Product Webinar - Jan 7, 2002"
Then clicks on Button "Save"

@TESTCASE_17   
Scenario: Opty Pipeline Report17
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Opportunities"
Given User is on "OpportunitiesPage"
Then click on link "Pipeline"

@TESTCASE_18   
Scenario: Opty Stuck Pipeline Report18
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Opportunities"
Given User is on "OpportunitiesPage"
Then click on tab "Stuck"

@TESTCASE_19  
Scenario: Opty Quarterly Report19
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Opportunities"
Given User is on "OpportunitiesPage"
Then select by Text "Interval" "Next FQ"
Then select by Text "Include" "Open Opportunities"
Then clicks on Button "RunReport"

@TESTCASE_20    
Scenario: Leads Tab20
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Leads"

@TESTCASE_21  
Scenario: Validate View dropdown21
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Leads"
Given User is on "LeadsPage"
Then verify Leads Dropdown "View" "Expected"

@TESTCASE_22 @smoke
Scenario: Functionality of the Go22
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Leads"
Given User is on "LeadsPage"
Then select by Text "View" "My Unread Leads"
Given User is on "HomePage"
Then clicks on Button "UserMenu"
Given User is on "UserMenuPage"
Then clicks on Button "Logout"
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Leads"
Given User is on "LeadsPage"
Then clicks on Button "Go"

@TESTCASE_23   
Scenario: Todays Leads23
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Leads"
Given User is on "LeadsPage"
Then select by Text "View" "Today's Leads"
Then clicks on newbutton "Go"

@TESTCASE_24 
Scenario: Check NEW button24
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Leads"
Given User is on "LeadsPage"
Then clicks on newbutton "Newbutton"
When User enter into text box "Lastname" "ABCD"
When User enter into text box "Companyname" "ABCD"
Then clicks on Button "savebutton"

@TESTCASE_25    
Scenario: Create New Contact25
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Given User is on "ContactsPage"
Then clicks on newbutton "newbutton"
When User enter into text box "lastname" "Gopal"
When User enter into text box "acctname" "United Oil & Gas"
Then clicks on Button "save"

@TESTCASE_26   
Scenario: Create New View26
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Given User is on "ContactsPage"
Then clicks on newbutton "Createnewview"
When User enter into text box "viewname" "Sea"
When User enter into text box "uniquename" "World"
Then clicks on Button "save"

@TESTCASE_27 
Scenario: Recently Create Contact27
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Given User is on "ContactsPage"
Then select by Text "recentlycreated" "Recently Created"

@TESTCASE_28 
Scenario: My Contact28
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Given User is on "ContactsPage"
Then select by Text "view" "My Contacts"
Then clicks on newbutton "gobutton"

@TESTCASE_29  @smoke
Scenario: View Contact29 
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Then clicks on newbutton "ShowItems"
Then clicks on newbutton "Contactname"

@TESTCASE_30 
Scenario: Check Error Message30
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Given User is on "ContactsPage"
Then clicks on newbutton "Createnewview"
When User enter into text box "uniquename" "EFGH"
Then clicks on Button "save"
When User verify the text "Errormessage" "Error: You must enter a value"

@TESTCASE_31  
Scenario: Create New View Cancel31
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Given User is on "ContactsPage"
Then clicks on newbutton "Createnewview"
When User enter into text box "viewname" "ABCD"
When User enter into text box "uniquename" "EFGH"
Then clicks on Button "cancel"

@TESTCASE_32    
Scenario: Check save and NewButton32
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Contacts"
Given User is on "ContactsPage"
Then clicks on newbutton "newbutton"
When User enter into text box "lastname" "Indian"
When User enter into text box "acctname" "Global Media"
Then clicks on Button "newsave"

@TESTCASE_33  
Scenario:  Verify FirstName LastName33 
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Home"
Given User is on "HomeTabPage"
Then clicks on newbutton "Userprofile"

@TESTCASE_34   
Scenario: Verify Edited LastName34
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Home"
Given User is on "HomeTabPage"
Then clicks on newbutton "Userprofile"
Then clicks on newbutton "Editprofile"
And Switch to Frame "Contact"
Then click on tab "About"
When User enter into text box "Lastname" "Abcd"
Then clicks on Button "Saveall"
When User verify the text "ProfileName" "aparna Abcd "

@TESTCASE_35 
Scenario: Verify the tab customization35
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Alltab"
Given User is on "AllTabPage"
Then clicks on newbutton "CustomizeTab"
Then select by index "Selectedtabs" 
Then clicks on Button "SaveButton"
Given User is on "HomePage"
Then clicks on Button "UserMenu"
Given User is on "UserMenuPage"
Then clicks on Button "Logout"
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "TabBar"

@TESTCASE_36 
Scenario: Blocking Event in the Calender36
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Home"
Given User is on "HomeTabPage"
Then clicks on newbutton "Datelink"
Then clicks on newbutton "8PM"
Then click on link "Endtime"
Then click on link "Ninepm"
Then click on link "Subject"
And switch to popupwindow "Other"
Then clicks on Button "Save"

@TESTCASE_37  
Scenario: Blocking Event in the Calender Reccurrance37
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then click on tab "Home"
Given User is on "HomeTabPage"
Then clicks on newbutton "Datelink"
Then clicks on newbutton "Fourpm"
Then click on link "Endtime"
Then click on link "Sevenpm"
Then click on Checkbox "Recurrence"
And  click on Radiobutton "Weekly"
Then click on link "Recurrenceend"
Then click on link "Recurrenceenddate"
Then click on link "Subject"
And switch to popupwindow "Other"
Then clicks on Button "Save"

@TESTCASE_8 @smoke
Scenario: Close DevloperConsole8
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then clicks on Button "Login"
Given User is on "HomePage"
Then clicks on Button "UserMenu"	
Given User is on "UserMenuPage" 
When User verify the usermenu "UserMenu" "Expected"
Then clicks on Button "Devloperconsole"
Then close new window

@TESTCASE_3  @smoke 
Scenario: Verify Rememberme3
Given User is on "LoginPage"
When User enter into text box "Username" "aparna@b.com"
When User enter into text box "Password" "ICANDOIT2"
Then click on Checkbox "RememberMe"
Then clicks on Button "Login"
Given User is on "HomePage"
Then clicks on Button "UserMenu"	
Given User is on "UserMenuPage"	
Then clicks on Button "Logout"
When User verify the text "VerifyName" "aparna@b.com"
