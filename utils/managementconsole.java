package utils;
import org.testng.Reporter;
public class managementconsole extends custom_util {
	public static void testmanagementconsolesearchall() throws Exception
	{
		//verifying the search functionality when all (include active and inactive) radio button is selected
		utils.Login_util.login(superadminusername, superadminpassword );
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		Reporter.log("login and wait for element serach button", true);
		//enter property name
		sendKeys(locators.Management_console.PROPERTNAMEMGMTCONSOLE, propertyname);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(propertyname);
		Reporter.log("verify theat the entered propertyname is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter pmc name and search
		sendKeys(locators.Management_console.PMC, pmcname);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(pmcname);
		Reporter.log("verify theat the entered pmcname is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter phone number and search
		sendKeys(locators.Management_console.PHONENO, phonenumber);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(phonenumber);
		Reporter.log("verify theat the entered phonenumber is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter address and search 
		sendKeys(locators.Management_console.ADDRESS, address);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(address);
		Reporter.log("verify theat the entered address is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter account number and search
		sendKeys(locators.Management_console.ACCOUNT, accountnumber);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(accountnumber);
		Reporter.log("verify theat the entered accountnumber is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter user name and search
		sendKeys(locators.Management_console.USERNAMEMGMTCONSOLE, userid);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(userid);
		Reporter.log("verify theat the entered user name is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter vanity URL and search
		sendKeys(locators.Management_console.VANITYURL, vanityurl);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(vanityurl);
		Reporter.log("verify theat the entered vanityurl is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter zip and search
		sendKeys(locators.Management_console.ZIPCODEMGMTCONSOLE, zipcode);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(zipcode);
		Reporter.log("verify theat the entered zip code is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//entersiteid and search
		sendKeys(locators.Management_console.SITEIDMGMTCONSOLE, siteid);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(siteid);
		Reporter.log("verify theat the entered phonenumber is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
	}
		
		public static void testmanagementconsolesearchactive() throws Exception
		{
		//verifying the search functionality when active radio button is selected
		utils.Login_util.login(superadminusername, superadminpassword );
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		Reporter.log("login and wait for element serach button", true);
		//enter property name
		sendKeys(locators.Management_console.PROPERTNAMEMGMTCONSOLE, propertyname);
		Reporter.log("enter property name", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("select active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(propertyname);
		Reporter.log("verify theat the entered propertyname is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter pmc name and search
		sendKeys(locators.Management_console.PMC, pmcname);
		Reporter.log("enter pmc name", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(pmcname);
		Reporter.log("verify theat the entered pmcname is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter phone number and search
		sendKeys(locators.Management_console.PHONENO, phonenumber);
		Reporter.log("enter phonenumber name", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(phonenumber);
		Reporter.log("verify theat the entered phonenumber is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter address and search 
		sendKeys(locators.Management_console.ADDRESS, address);
		Reporter.log("enter adddress name", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(address);
		Reporter.log("verify theat the entered address is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter account number and search
		sendKeys(locators.Management_console.ACCOUNT, accountnumber);
		Reporter.log("enter account number", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(accountnumber);
		Reporter.log("verify theat the entered accountnumber is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter user name and search
		sendKeys(locators.Management_console.USERNAMEMGMTCONSOLE, userid);
		Reporter.log("enter username", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(userid);
		Reporter.log("verify theat the entered user name is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter vanity URL and search
		sendKeys(locators.Management_console.VANITYURL, vanityurl);
		Reporter.log("enter vanityurl", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(vanityurl);
		Reporter.log("verify theat the entered vanityurl is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter zip and search
		sendKeys(locators.Management_console.ZIPCODEMGMTCONSOLE, zipcode);
		Reporter.log("enter zip code", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(zipcode);
		Reporter.log("verify theat the entered zip code is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		//enter siteid and search
		sendKeys(locators.Management_console.SITEIDMGMTCONSOLE, siteid);
		Reporter.log("enter siteid", true);
		clickOn(locators.Management_console.ACTIVERBTN);
		Reporter.log("selevt active radio button", true);
		clickOn(locators.Management_console.SEARCHBTN);
		Reporter.log("click on search button", true);
		WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
		getWebDriver().getPageSource().contains(siteid);
		Reporter.log("verify theat the entered phonenumber is present on page", true);
		clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
		Reporter.log("click on return to preperty search", true);
		WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
		}
		////verifying the search functionality when inactive radio button is selected
		public static void testmanagementconsolesearchinactive() throws Exception
		{
			utils.Login_util.login(superadminusername, superadminpassword );
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			Reporter.log("login and wait for element serach button", true);
			//enter property name
			sendKeys(locators.Management_console.PROPERTNAMEMGMTCONSOLE, propertyname);
			Reporter.log("enter property name", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("select inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(propertyname);
			Reporter.log("verify theat the entered propertyname is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter pmc name and search
			sendKeys(locators.Management_console.PMC, pmcname);
			Reporter.log("enter pmc name", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(pmcname);
			Reporter.log("verify theat the entered pmcname is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter phone number and search
			sendKeys(locators.Management_console.PHONENO, phonenumber);
			Reporter.log("enter phonenumber name", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(phonenumber);
			Reporter.log("verify theat the entered phonenumber is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter address and search 
			sendKeys(locators.Management_console.ADDRESS, address);
			Reporter.log("enter adddress name", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(address);
			Reporter.log("verify theat the entered address is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter account number and search
			sendKeys(locators.Management_console.ACCOUNT, accountnumber);
			Reporter.log("enter account number", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(accountnumber);
			Reporter.log("verify theat the entered accountnumber is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter user name and search
			sendKeys(locators.Management_console.USERNAMEMGMTCONSOLE, userid);
			Reporter.log("enter username", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(userid);
			Reporter.log("verify theat the entered user name is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter vanity URL and search
			sendKeys(locators.Management_console.VANITYURL, vanityurl);
			Reporter.log("enter vanityurl", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(vanityurl);
			Reporter.log("verify theat the entered vanityurl is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter zip and search
			sendKeys(locators.Management_console.ZIPCODEMGMTCONSOLE, zipcode);
			Reporter.log("enter zip code", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(zipcode);
			Reporter.log("verify theat the entered zip code is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter siteid and search
			sendKeys(locators.Management_console.SITEIDMGMTCONSOLE, siteid);
			Reporter.log("enter siteid", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			getWebDriver().getPageSource().contains(siteid);
			Reporter.log("verify theat the entered phonenumber is present on page", true);
			clickOn(locators.Management_console.RETURNPROPERTYSEARCH);
			Reporter.log("click on return to preperty search", true);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);		
		}
		
		//This method is for account creation and to verify the entries on profile tab
		public static void testcreateaccount(String type) throws Exception
		{
			utils.Login_util.login(superadminusername, superadminpassword );
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			Reporter.log("Login into application", true);
			clickOn(locators.Management_console.CREATENEWPROPBTN);
			Reporter.log("Click on create new property button", true);
			WaitForElementPresent(locators.Management_console.H1, timeout);
			Reporter.log("wait for element present H1", true);
			switch(type)
			{
				case"Executive Plus":
				selectDropDown(locators.Management_console.PACKAGE, "Executive Plus");
				break;
				case"Executive":
				selectDropDown(locators.Management_console.PACKAGE, "Executive");
				break;
				case"Associate":
				selectDropDown(locators.Management_console.PACKAGE, "Associate");
				break;
				case"Silver/Private Party":
				selectDropDown(locators.Management_console.PACKAGE, "Silver/Private Party");
				break;
			}
			Reporter.log("selecting the packege level", true);
			//int rand = new Random().nextInt(5);
			//int Random = rand-1;
			//selectDropDown(locators.Management_console.PACKAGE, subject[Random]);
			String USERNAME = GetRandomValue();;
			String username = "username"+USERNAME;
			sendKeys(locators.Management_console.USERNAMEACCOUNTCREAT, username);
			Reporter.log("Enter username", true);
			sendKeys(locators.Management_console.PROPERTYNAME, Propertyname);
			Reporter.log("Enter propertyname", true);
			sendKeys(locators.Management_console.ADDLINE1, address1);
			Reporter.log("Enter Addressl1", true);
			sendKeys(locators.Management_console.ADDLINE2, address2);
			Reporter.log("Enter Addressl2", true);
			sendKeys(locators.Management_console.ZIPCREATEACCOUNT, Zipcode);
			Reporter.log("Enter Zip code", true);
			sendKeys(locators.Management_console.PHONENUMBER, Phonenumber);
			Reporter.log("Enter phone number", true);
			Thread.sleep(3000);
			clickOn(locators.Management_console.CREATEACCOUNTBTN);
			Reporter.log("Click on create account button", true);
			Thread.sleep(3000);
			getWebDriver().getPageSource().contains(propertyname);
			Reporter.log("Verify that property name is present on profile tab", true);
			getWebDriver().getPageSource().contains(address1);
			Reporter.log("Verify that address1 is present on profile tab", true);
			getWebDriver().getPageSource().contains(address2);
			Reporter.log("Verify that address2 is present on profile tab", true);
			getWebDriver().getPageSource().contains(zipcode);
			Reporter.log("Verify that zipcode is present on profile tab", true);
			getWebDriver().getPageSource().contains(phonenumber);
			Reporter.log("Verify that phonenumber is present on profile tab", true);
			WaitForElementPresent(locators.Management_console.PROPERTYNAMEAFTERACCCREATION, timeout);
			Reporter.log("verify the presence of property name as h1", true);
			clickOn(locators.Backend_loc.LOGOUTBTN);
			Reporter.log("click on logout", true);
			
			}
		public static void testscriptformgmtsrch() throws Exception
		{
		    utils.Login_util.login(superadminusername, superadminpassword );
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			Reporter.log("login and wait for element serach button", true);
			//enter property name
			sendKeys(locators.Management_console.PROPERTNAMEMGMTCONSOLE, propertyname);
			Reporter.log("enter property name", true);
			clickOn(locators.Management_console.ALLRBTN);
			Reporter.log("select inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(propertyname);
			Reporter.log("verify theat the entered propertyname is present on page", true);
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter pmc name and search
			/*sendKeys(locators.Management_console.PMC, pmcname);
			Reporter.log("enter pmc name", true);
			clickOn(locators.Management_console.ALLRBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(pmcname);
			Reporter.log("verify theat the entered pmcname is present on page", true);			
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);
			WaitForElementPresent(locators.Management_console.SEARCHBTN, timeout);
			//enter phone number and search
			sendKeys(locators.Management_console.PHONENO, phonenumber);
			Reporter.log("enter phonenumber name", true);
			clickOn(locators.Management_console.ALLRBTN);
			Reporter.log("select inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(phonenumber);
			Reporter.log("verify theat the entered phonenumber is present on page", true);			
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);
			//enter address and search 
			sendKeys(locators.Management_console.ADDRESS, address);
			Reporter.log("enter adddress name", true);
			clickOn(locators.Management_console.ALLRBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(address);
			Reporter.log("verify theat the entered phonenumber is present on page", true);
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);
			//enter account number and search
			sendKeys(locators.Management_console.ACCOUNT, accountnumber);
			Reporter.log("enter account number", true);
			clickOn(locators.Management_console.ALLRBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(accountnumber);
			Reporter.log("verify theat the entered phonenumber is present on page", true);
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);
			//enter user name and search
		    sendKeys(locators.Management_console.USERNAMEMGMTCONSOLE, userid);
			Reporter.log("enter username", true);
			clickOn(locators.Management_console.ALLRBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);			
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			clickOn(locators.Management_console.ACCDETAILBTN);
			WaitForElementPresent(locators.Management_console.ACCPAGEH1, timeout);
			getWebDriver().getPageSource().contains(userid);
			clickOn(locators.Management_console.EDITANTHRLISTNGACCPAGE);
			//enter vanity URL and search
		    sendKeys(locators.Management_console.VANITYURL, vanityurl);
			Reporter.log("enter vanityurl", true);
			clickOn(locators.Management_console.ALLRBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);			
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(vanityurl);
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);
			//enter zip and search
		    sendKeys(locators.Management_console.ZIPCODEMGMTCONSOLE, zipcode);
			Reporter.log("enter zip code", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(zipcode);
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);
			//enter siteid and search
			sendKeys(locators.Management_console.SITEIDMGMTCONSOLE, siteid);
			Reporter.log("enter siteid", true);
			clickOn(locators.Management_console.INACTIVERBTN);
			Reporter.log("selevt inactive radio button", true);
			clickOn(locators.Management_console.SEARCHBTN);
			Reporter.log("click on search button", true);
			WaitForElementPresent(locators.Management_console.RETURNPROPERTYSEARCH, timeout);
			clickOn(locators.Management_console.EDITBTN);
			WaitForElementPresent(locators.Management_console.PROPDETAILSH1, timeout);
			getWebDriver().getPageSource().contains(zipcode);
			clickOn(locators.Management_console.EDITANOTHRLISTINGBTN);*/
		}
		}
