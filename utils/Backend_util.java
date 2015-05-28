package utils;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.Reporter;

public class Backend_util extends custom_util{
	public static void Addfloorplan() throws Exception{
//Go to Create Floor Plan Page
		clickOn(locators.Backend_loc.ADDFLOORPLANBTN);
		WaitForElementPresent(locators.Backend_loc.SAVECHANGESBTN, timeout);
		Reporter.log("Go to Add a floor plan page", true);
		String FPNAME = GetRandomValue();;
		String FP = "FP"+FPNAME;
		Reporter.log("Enter a random name in floor plan", true);
		sendKeys(locators.Backend_loc.FLOORPLANNAME, FP);
		Reporter.log("Enter Floor Plan Name:", true);
		selectDropDown(locators.Backend_loc.BEDROOMS, "3");
		Reporter.log("Enter BEDROOMS", true);
		selectDropDown(locators.Backend_loc.BATHROOMS, "3");
		Reporter.log("Enter BATHROOMS", true);
		sendKeys(locators.Backend_loc.MINSQFT, "850");
		Reporter.log("Enter MINSQFT", true);
		sendKeys(locators.Backend_loc.MAXSQFT, "1700");
		Reporter.log("Enter MAXSQFT", true);
		selectDropDown(locators.Backend_loc.MINSTAY, "30 Days");
		Reporter.log("Enter MINSTAY", true);
		sendKeys(locators.Backend_loc.STARTRATE, "1500");
		Reporter.log("Enter STARTRATE", true);
		selectDropDown(locators.Backend_loc.STARTRATETYPE, "Monthly");
		Reporter.log("Enter STARTRATETYPE", true);
		sendKeys(locators.Backend_loc.DAILYPRICEMIN, "500");
		Reporter.log("Enter DAILYPRICEMIN", true);
		sendKeys(locators.Backend_loc.DAILYPRICEMAX, "1000");
		Reporter.log("Enter DAILYPRICEMAX", true);
		sendKeys(locators.Backend_loc.WEEKLYPRICEMIN, "1500");
		Reporter.log("Enter WEEKLYPRICEMIN", true);
		sendKeys(locators.Backend_loc.WEEKLYPRICEMAX, "2000");
		sendKeys(locators.Backend_loc.MONTHLYPRICEMIN, "2100");
		sendKeys(locators.Backend_loc.RENTALDEPOSIT, "500");
		sendKeys(locators.Backend_loc.APPFEE, "50");
		sendKeys(locators.Backend_loc.LEASETERMS, Leasetermdesc);
		sendKeys(locators.Backend_loc.DESCRIPTION, fpdesc);
		selectDropDown(locators.Backend_loc.DISPLAYONSITE, "Yes");
		//browsing the image
		Robot robot = new Robot();
		clickOn("floorplan_image");
		Thread.sleep(5000);
		String filepath = System.getProperty("user.dir")+"\\attachments\\Desert.jpg";
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection(filepath);
		clip.setContents(str, str);
		System.out.println(str);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		clickOn(locators.Backend_loc.SAVECHANGESBTN);
		//utils.Login_util.Logout();
		//Thread.sleep(1000);
		//clickOn(locators.Backend_loc.SAVECHANGESBTN);
		//Thread.sleep(2000);
		//WaitForElementPresent(locators.Backend_loc.SAVEMSG, timeout);
		}
	
	//This method will verify the contents at profile page with respect to the content entered at Profile tab 
	public static void testprofileintegration() throws Exception
	{
		utils.Login_util.login(username5, password5);
		clickOn(locators.Backend_loc.EDITBUTTON);
		WaitForElementPresent(locators.Backend_loc.TAGLINEFIELD, timeout);
		Reporter.log("Land up on profile tab ", true);
		sendKeys(locators.Backend_loc.TAGLINEFIELD, tagline);
		Reporter.log("Enter tagline description", true);
		sendKeys(locators.Backend_loc.SHORTDESCRIPTION, shortdesc);
		Reporter.log("Enter short description", true);
		sendKeys(locators.Backend_loc.LONGDESCRIPTION, longdesc);
		Reporter.log("Enter long description", true);
		sendKeys(locators.Backend_loc.BULLETPOINT1, bp1);
		Reporter.log("enter bp1", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK1)==false)
		{
		clickOn(locators.Backend_loc.PROFILEPAGECHECK1);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK1)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT2, bp2);
		Reporter.log("enter bp2", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK2)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK2);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK2)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT3, bp3);
		Reporter.log("enter bp3", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK3)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK3);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK3)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT4, bp4);
		Reporter.log("enter bp4", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK4)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK4);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK4)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT5, bp5);
		Reporter.log("enter bp5", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK5)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK5);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK5)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT6, bp6);
		Reporter.log("enter bp6", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK6)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK6);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK6)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT7, bp7);
		Reporter.log("enter bp7", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK7)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK7);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK7)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT8, bp8);
		Reporter.log("enter bp8", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK8)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK8);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK8)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT9, bp9);
		Reporter.log("enter bp9", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK9)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK9);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK9)==true);
		sendKeys(locators.Backend_loc.BULLETPOINT10, bp10);
		Reporter.log("enter bp10", true);
		if(isChecked(locators.Backend_loc.PROFILEPAGECHECK10)==false)
		{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK10);
		}
		else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK10)==true);
		//sendKeys(locators.Backend_loc.PMCNAMEFIELD, pmcname);
		//Thread.sleep(2000);
		//check on payment methods
		if(isChecked(locators.Backend_loc.PAYDINERCLUB)==false)
		{
			clickOn(locators.Backend_loc.PAYDINERCLUB);
		}
		else if(isChecked(locators.Backend_loc.PAYDINERCLUB)==true);
		clickOn(locators.Backend_loc.SAVECHANGESBUTTONATBOTTOM);
		WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
		utils.Login_util.Logout();
		getWebDriver().navigate().to("http://82.196.6.85:8080/solr/propertysearch/dataimport?command=full-import&clean=true&commit=true&optimize=true");
		getWebDriver().navigate().to("http://82.196.6.85:8080/solr/listingdetails/dataimport?command=full-import&clean=true&commit=true&optimize=true");
		Thread.sleep(2000);
		getWebDriver().navigate().to(URL+"apartment-community-profile/8434");
		WaitForElementPresent(locators.Profilepage_loc.CHECKAVAILABILITY, timeout);
		getWebDriver().getPageSource().contains(tagline);
		Reporter.log("verify the entered tagline at Profile page", true);
		getWebDriver().getPageSource().contains(shortdesc);
		Reporter.log("verify the entered short description at Profile page", true);
		getWebDriver().getPageSource().contains(longdesc);
		Reporter.log("verify the entered long description at Profile page", true);
		getWebDriver().getPageSource().contains(bp1);
		Reporter.log("verify the entered First Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp2);
		Reporter.log("verify the entered Second Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp3);
		Reporter.log("verify the entered Third Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp4);
		Reporter.log("verify the entered Fourth Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp5);
		Reporter.log("verify the entered Fifth Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp6);
		Reporter.log("verify the entered sixth Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp7);
		Reporter.log("verify the entered seventh Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp8);
		Reporter.log("verify the entered Eigth Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp9);
		Reporter.log("verify the entered Nineth Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(bp10);
		Reporter.log("verify the entered last Bullet point at Profile page", true);
		getWebDriver().getPageSource().contains(pmcname);
	    Reporter.log("Verify the PMC name", true);  
	}
	//This method will verify the contents at preview property page with respect to the content entered at Profile tab 
		public static void testpreviewpageintegration() throws Exception
		{
			utils.Login_util.login(username5, password5);
			clickOn(locators.Backend_loc.EDITBUTTON);
			WaitForElementPresent(locators.Backend_loc.TAGLINEFIELD, timeout);
			Reporter.log("Land up on profile tab ", true);
			sendKeys(locators.Backend_loc.TAGLINEFIELD, tagline);
			Reporter.log("Enter tagline description", true);
			sendKeys(locators.Backend_loc.SHORTDESCRIPTION, shortdesc);
			Reporter.log("Enter short description", true);
			sendKeys(locators.Backend_loc.LONGDESCRIPTION, longdesc);
			Reporter.log("Enter long description", true);
			sendKeys(locators.Backend_loc.BULLETPOINT1, bp1);
			Reporter.log("enter bp1", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK1)==false)
			{
			clickOn(locators.Backend_loc.PROFILEPAGECHECK1);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK1)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT2, bp2);
			Reporter.log("enter bp2", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK2)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK2);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK2)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT3, bp3);
			Reporter.log("enter bp3", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK3)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK3);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK3)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT4, bp4);
			Reporter.log("enter bp4", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK4)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK4);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK4)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT5, bp5);
			Reporter.log("enter bp5", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK5)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK5);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK5)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT6, bp6);
			Reporter.log("enter bp6", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK6)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK6);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK6)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT7, bp7);
			Reporter.log("enter bp7", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK7)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK7);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK7)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT8, bp8);
			Reporter.log("enter bp8", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK8)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK8);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK8)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT9, bp9);
			Reporter.log("enter bp9", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK9)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK9);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK9)==true);
			sendKeys(locators.Backend_loc.BULLETPOINT10, bp10);
			Reporter.log("enter bp10", true);
			if(isChecked(locators.Backend_loc.PROFILEPAGECHECK10)==false)
			{
				clickOn(locators.Backend_loc.PROFILEPAGECHECK10);
			}
			else if(isChecked(locators.Backend_loc.PROFILEPAGECHECK10)==true);
			//sendKeys(locators.Backend_loc.PMCNAMEFIELD, pmcname);
			//Thread.sleep(2000);
			//check on payment methods
			if(isChecked(locators.Backend_loc.PAYDINERCLUB)==false)
			{
				clickOn(locators.Backend_loc.PAYDINERCLUB);
			}
			else if(isChecked(locators.Backend_loc.PAYDINERCLUB)==true);
			clickOn(locators.Backend_loc.SAVECHANGESBUTTONATBOTTOM);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			clickOn(locators.Backend_loc.PREVIWPROPERTY);
		    Thread.sleep(1000);
			getWebDriver().navigate().to(URL+"/listingdetails/preview/id/"+siteid);
			getWebDriver().getPageSource().contains(tagline);
			Reporter.log("verify the entered tagline at Profile page", true);
			getWebDriver().getPageSource().contains(shortdesc);
			Reporter.log("verify the entered short description at Profile page", true);
			getWebDriver().getPageSource().contains(longdesc);
			Reporter.log("verify the entered long description at Profile page", true);
			getWebDriver().getPageSource().contains(bp1);
			Reporter.log("verify the entered First Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp2);
			Reporter.log("verify the entered Second Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp3);
			Reporter.log("verify the entered Third Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp4);
			Reporter.log("verify the entered Fourth Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp5);
			Reporter.log("verify the entered Fifth Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp6);
			Reporter.log("verify the entered sixth Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp7);
			Reporter.log("verify the entered seventh Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp8);
			Reporter.log("verify the entered Eigth Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp9);
			Reporter.log("verify the entered Nineth Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(bp10);
			Reporter.log("verify the entered last Bullet point at Profile page", true);
			getWebDriver().getPageSource().contains(pmcname);
		    Reporter.log("Verify the PMC name", true);  
		}
	//This method will verify the User active 'Yes' and 'No' functionality from Account Details page.
	public static void useractive() throws Exception
	{
		utils.Login_util.login(superadminusername, superadminpassword);
		//Go to property's account details page
		getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+ siteid);
		if(isChecked(locators.Backend_loc.USERACTIVE_NO)==false)
		{
		clickOn(locators.Backend_loc.USERACTIVE_NO);
		clickOn(locators.Backend_loc.ACCDETAIL_SAVECHANGEBTN);
		WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
		utils.Login_util.Logout();
		sendKeys(locators.Backend_loc.USERNAME, "ankitstandard");
		sendKeys(locators.Backend_loc.PASSWORD, "360logica");
		clickOn(locators.Backend_loc.LOGINBTN);
		WaitForElementPresent(locators.Backend_loc.LOGIN_ERROR, timeout);
		}
		else
		{
		clickOn(locators.Backend_loc.USERACTIVE_YES);
		clickOn(locators.Backend_loc.ACCDETAIL_SAVECHANGEBTN);
		WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
		utils.Login_util.Logout();
		utils.Login_util.login("ankitstandard", "360logica");
		WaitForElementPresent(locators.Backend_loc.LOGOUTBTN, timeout);	
		}
	}
	//This method will create users level 10 in user admin
	public static void createuseradmin10() throws Exception
	{
		clickOn(locators.Backend_loc.ADMIN_BTN);
		Reporter.log("Click on the admin button", true);
		WaitForElementPresent(locators.Backend_loc.CREATEUSERADMIN, timeout);
		clickOn(locators.Backend_loc.CREATEUSERADMIN);
		Reporter.log("Click on Create new User", true);
		Thread.sleep(1000);
		String USERADMIN = GetRandomValue();;
		String ANKITADMIN = "ANKITADMIN"+USERADMIN;
		sendKeys(locators.Backend_loc.CREATEADMIN_USERNAME, ANKITADMIN);
		Reporter.log("Enter the username", true);
		selectDropDown(locators.Backend_loc.CREATEADMIN_ACTIVEDROPDWN, "Yes");
		Reporter.log("select active to 'Yes' from drop down", true);
		sendKeys(locators.Backend_loc.CREATEADMIN_SITEID, "8327");
		Reporter.log("Enter Site Id", true);
		clickOn(locators.Backend_loc.SAVE_BTN);
		Reporter.log("Click on Save button", true);
		WaitForElementPresent(locators.Backend_loc.CREATEADMIN_SUCCESS, timeout);
		utils.Login_util.Logout();
		Reporter.log("Log out from application", true);
		utils.Login_util.login(ANKITADMIN, userpassword);
		Reporter.log("Login with the newly created user", true);
		WaitForElementPresent(locators.Backend_loc.UPDATEPASS, timeout);
		sendKeys(locators.Backend_loc.UPDATEPASSNEW, "360logica");
		Reporter.log("Enter new update password", true);
		sendKeys(locators.Backend_loc.UPDATEPASSNEWCONFIRM, "360logica");
		Reporter.log("Confirm new password", true);
		clickOn(locators.Backend_loc.UPDATEPASS_SAVEBTN);
		Reporter.log("Click on Update button", true);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(locators.Backend_loc.UPDATEPASS_MSG));
		Reporter.log("Check that password change message display", true);
			}
	
	//This method will create users level 30 in user admin
	public static void createuseradmin30() throws Exception
	{
		clickOn(locators.Backend_loc.ADMIN_BTN);
		Reporter.log("Click on the admin button", true);
		WaitForElementPresent(locators.Backend_loc.CREATEUSERADMIN, timeout);
		clickOn(locators.Backend_loc.CREATEUSERADMIN);
		Reporter.log("Click on Create new User", true);
		Thread.sleep(1000);
		String USERADMIN = GetRandomValue();;
		String ANKITADMIN = "ANKITADMIN"+USERADMIN;
		sendKeys(locators.Backend_loc.CREATEADMIN_USERNAME, ANKITADMIN);
		Reporter.log("Enter the username", true);
		selectDropDown(locators.Backend_loc.CREATEADMIN_ACTIVEDROPDWN, "Yes");
		Reporter.log("select active to 'Yes' from drop down", true);
		selectDropDown(locators.Backend_loc.CREATEADMIN_ACCESSLEVEL, "30-Group User");
		Thread.sleep(2000);
		sendKeys(locators.Backend_loc.CREATEADMIN_SITEID30, "8327");
		Reporter.log("Enter Site Id", true);
		clickOn(locators.Backend_loc.SAVE_BTN);
		Reporter.log("Click on Save button", true);
		WaitForElementPresent(locators.Backend_loc.CREATEADMIN_SUCCESS, timeout);
		utils.Login_util.Logout();
		Reporter.log("Log out from application", true);
		utils.Login_util.login(ANKITADMIN, userpassword);
		Reporter.log("Login with the newly created user", true);
		WaitForElementPresent(locators.Backend_loc.UPDATEPASS, timeout);
		sendKeys(locators.Backend_loc.UPDATEPASSNEW, "360logica");
		Reporter.log("Enter new update password", true);
		sendKeys(locators.Backend_loc.UPDATEPASSNEWCONFIRM, "360logica");
		Reporter.log("Confirm new password", true);
		clickOn(locators.Backend_loc.UPDATEPASS_SAVEBTN);
		Reporter.log("Click on Update button", true);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(locators.Backend_loc.UPDATEPASS_MSG));
		Reporter.log("Check that password change message display", true);
			}
	//This method will create users level 80 in user admin
		public static void createuseradmin80() throws Exception
		{
			clickOn(locators.Backend_loc.ADMIN_BTN);
			Reporter.log("Click on the admin button", true);
			WaitForElementPresent(locators.Backend_loc.CREATEUSERADMIN, timeout);
			clickOn(locators.Backend_loc.CREATEUSERADMIN);
			Reporter.log("Click on Create new User", true);
			Thread.sleep(1000);
			String USERADMIN = GetRandomValue();;
			String ANKITADMIN = "ANKITADMIN"+USERADMIN;
			sendKeys(locators.Backend_loc.CREATEADMIN_USERNAME, ANKITADMIN);
			Reporter.log("Enter the username", true);
			selectDropDown(locators.Backend_loc.CREATEADMIN_ACTIVEDROPDWN, "Yes");
			Reporter.log("select active to 'Yes' from drop down", true);
			selectDropDown(locators.Backend_loc.CREATEADMIN_ACCESSLEVEL, "80-City Office");
			Thread.sleep(2000);
			sendKeys(locators.Backend_loc.CREATEADMIN_SITEID30, "8327");
			Reporter.log("Enter Site Id", true);
			clickOn(locators.Backend_loc.SAVE_BTN);
			Reporter.log("Click on Save button", true);
			WaitForElementPresent(locators.Backend_loc.CREATEADMIN_SUCCESS, timeout);
			utils.Login_util.Logout();
			Reporter.log("Log out from application", true);
			utils.Login_util.login(ANKITADMIN, userpassword);
			Reporter.log("Login with the newly created user", true);
			WaitForElementPresent(locators.Backend_loc.UPDATEPASS, timeout);
			sendKeys(locators.Backend_loc.UPDATEPASSNEW, "360logica");
			Reporter.log("Enter new update password", true);
			sendKeys(locators.Backend_loc.UPDATEPASSNEWCONFIRM, "360logica");
			Reporter.log("Confirm new password", true);
			clickOn(locators.Backend_loc.UPDATEPASS_SAVEBTN);
			Reporter.log("Click on Update button", true);
			Thread.sleep(3000);
			Assert.assertTrue(isElementPresent(locators.Backend_loc.UPDATEPASS_MSG));
			Reporter.log("Check that password change message display", true);
				}
		//This method will create users level 120 in user admin
				public static void createuseradmin120() throws Exception
				{
					clickOn(locators.Backend_loc.ADMIN_BTN);
					Reporter.log("Click on the admin button", true);
					WaitForElementPresent(locators.Backend_loc.CREATEUSERADMIN, timeout);
					clickOn(locators.Backend_loc.CREATEUSERADMIN);
					Reporter.log("Click on Create new User", true);
					Thread.sleep(1000);
					String USERADMIN = GetRandomValue();;
					String ANKITADMIN = "ANKITADMIN"+USERADMIN;
					sendKeys(locators.Backend_loc.CREATEADMIN_USERNAME, ANKITADMIN);
					Reporter.log("Enter the username", true);
					selectDropDown(locators.Backend_loc.CREATEADMIN_ACTIVEDROPDWN, "Yes");
					Reporter.log("select active to 'Yes' from drop down", true);
					selectDropDown(locators.Backend_loc.CREATEADMIN_ACCESSLEVEL, "120-Customer Service");
					Thread.sleep(2000);
					//sendKeys(locators.Backend_loc.CREATEADMIN_SITEID30, "8327");
					//Reporter.log("Enter Site Id", true);
					clickOn(locators.Backend_loc.SAVE_BTN);
					Reporter.log("Click on Save button", true);
					WaitForElementPresent(locators.Backend_loc.CREATEADMIN_SUCCESS, timeout);
					utils.Login_util.Logout();
					Reporter.log("Log out from application", true);
					utils.Login_util.login(ANKITADMIN, userpassword);
					Reporter.log("Login with the newly created user", true);
					WaitForElementPresent(locators.Backend_loc.UPDATEPASS, timeout);
					sendKeys(locators.Backend_loc.UPDATEPASSNEW, "360logica");
					Reporter.log("Enter new update password", true);
					sendKeys(locators.Backend_loc.UPDATEPASSNEWCONFIRM, "360logica");
					Reporter.log("Confirm new password", true);
					clickOn(locators.Backend_loc.UPDATEPASS_SAVEBTN);
					Reporter.log("Click on Update button", true);
					Thread.sleep(3000);
					Assert.assertTrue(isElementPresent(locators.Backend_loc.UPDATEPASS_MSG));
					Reporter.log("Check that password change message display", true);
						}
				//This method will create users level 150 in user admin
				public static void createuseradmin150() throws Exception
				{
					clickOn(locators.Backend_loc.ADMIN_BTN);
					Reporter.log("Click on the admin button", true);
					WaitForElementPresent(locators.Backend_loc.CREATEUSERADMIN, timeout);
					clickOn(locators.Backend_loc.CREATEUSERADMIN);
					Reporter.log("Click on Create new User", true);
					Thread.sleep(1000);
					String USERADMIN = GetRandomValue();;
					String ANKITADMIN = "ANKITADMIN"+USERADMIN;
					sendKeys(locators.Backend_loc.CREATEADMIN_USERNAME, ANKITADMIN);
					Reporter.log("Enter the username", true);
					selectDropDown(locators.Backend_loc.CREATEADMIN_ACTIVEDROPDWN, "Yes");
					Reporter.log("select active to 'Yes' from drop down", true);
					selectDropDown(locators.Backend_loc.CREATEADMIN_ACCESSLEVEL, "150-Administrator");
					Thread.sleep(2000);					
					clickOn(locators.Backend_loc.SAVE_BTN);
					Reporter.log("Click on Save button", true);
					WaitForElementPresent(locators.Backend_loc.CREATEADMIN_SUCCESS, timeout);
					utils.Login_util.Logout();
					Reporter.log("Log out from application", true);
					utils.Login_util.login(ANKITADMIN, userpassword);
					Reporter.log("Login with the newly created user", true);
					WaitForElementPresent(locators.Backend_loc.UPDATEPASS, timeout);
					sendKeys(locators.Backend_loc.UPDATEPASSNEW, "360logica");
					Reporter.log("Enter new update password", true);
					sendKeys(locators.Backend_loc.UPDATEPASSNEWCONFIRM, "360logica");
					Reporter.log("Confirm new password", true);
					clickOn(locators.Backend_loc.UPDATEPASS_SAVEBTN);
					Reporter.log("Click on Update button", true);
					Thread.sleep(3000);
					Assert.assertTrue(isElementPresent(locators.Backend_loc.UPDATEPASS_MSG));
					Reporter.log("Check that password change message display", true);
						}
	
	//This is the method to verify that the property is active or not
		public static void testDisplayonwebsite() throws Exception
		{
			utils.Login_util.login(superadminusername, superadminpassword);
			sendKeys(locators.Backend_loc.SITEID, siteid);
			clickOn(locators.Backend_loc.SEARCHBUTTON);
			Reporter.log("Clicking on search button", true);
			clickOn(locators.Backend_loc.EDITBUTTON);
			Reporter.log("Clicking on edit button for property", true);
			WaitForElementPresent(locators.Backend_loc.PROPERTNAME, timeout);
			clickOn(locators.Backend_loc.ACCOUNTDETAILSTAB);
			Reporter.log("Clicking on account details tab", true);
			
				clickOn(locators.Backend_loc.DISPLAYONWEBSITEYES);
				Reporter.log("Clicking on display on website yes radiobutton", true);
				clickOn(locators.Backend_loc.SAVECHANGES);
				Reporter.log("Clicking on save changes button", true);
				WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
				clickOn(locators.Backend_loc.LOGOUTBTN);
				Reporter.log("Clicking on logout button", true);
				getWebDriver().navigate().to("http://82.196.6.85:8080/solr/propertysearch/dataimport?command=full-import&clean=true&commit=true&optimize=true");
				getWebDriver().navigate().to("http://82.196.6.85:8080/solr/listingdetails/dataimport?command=full-import&clean=true&commit=true&optimize=true");
				getWebDriver().navigate().to("http://82.196.6.85:8080/solr/propertysearch/dataimport?command=full-import&clean=true&commit=true&optimize=true");
				getWebDriver().navigate().to("http://82.196.6.85:8080/solr/listingdetails/dataimport?command=full-import&clean=true&commit=true&optimize=true");
				Thread.sleep(5000);
				Reporter.log("Running the solr", true);
			    getWebDriver().navigate().to(URL+"apartment-community-profile/"+siteid);
				Reporter.log("Opening profile page of the Property", true);
				WaitForElementPresent(locators.Backend_loc.SHAREH1, timeout);
				Reporter.log("verify the display of share heading", true);
				}
		
		//This method will verify the image upload functionality.
				public static void testimageupload() throws Exception
				{
					utils.Login_util.login(superadminusername, superadminpassword);
					Reporter.log("login int application", true);
					sendKeys(locators.Backend_loc.SITEID, siteid);
					Reporter.log("Entering site ID", true);
					clickOn(locators.Management_console.SEARCHBTN);
					Reporter.log("search for site id", true);
					WaitForElementPresent(locators.Backend_loc.PROPFOUNDH1, timeout);
					Reporter.log("verify that heading is present", true);
					clickOn(locators.Backend_loc.EDITBUTTONS);
					WaitForElementPresent(locators.Backend_loc.PMCNAME, timeout);
					clickOn(locators.Backend_loc.IMAGESTAB);
					Reporter.log("Go to images tab", true);
					WaitForElementPresent(locators.Backend_loc.ADSPOTLIGHTH1, timeout);
					//logo image upload
					Robot robot = new Robot();
					clickOn(locators.Backend_loc.BROWSELOGO);
					Thread.sleep(5000);
					String filepath = System.getProperty("user.dir")+"\\attachments\\Desert.jpg";
					Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
					StringSelection str = new StringSelection(filepath);
					clip.setContents(str, str);
					System.out.println(str);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_V);
					robot.delay(1000);
					robot.keyRelease(KeyEvent.VK_V);
					robot.delay(1000);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.delay(1000);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.delay(1000);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.delay(1000);
					robot.keyRelease(KeyEvent.VK_ENTER);
					clickOn(locators.Backend_loc.ADDPHOTOFRLOGO);
					WaitForElementPresent(locators.Backend_loc.ADSPOTLIGHTH1, timeout);
	//Featured property image upload
					Robot robot1 = new Robot();
					clickOn(locators.Backend_loc.BROWSEFEATURED);
					Thread.sleep(1000);
					String filepath1 = System.getProperty("user.dir")+"\\attachments\\Desert.jpg";
					Clipboard clip1 = Toolkit.getDefaultToolkit().getSystemClipboard();
					StringSelection str1 = new StringSelection(filepath1);
					clip1.setContents(str1, str1);
					System.out.println(str1);
					robot1.keyPress(KeyEvent.VK_CONTROL);
					robot1.delay(1000);
					robot1.keyPress(KeyEvent.VK_V);
					robot1.delay(1000);
					robot1.keyRelease(KeyEvent.VK_V);
					robot1.delay(1000);
					robot1.keyRelease(KeyEvent.VK_CONTROL);
					robot1.keyPress(KeyEvent.VK_TAB);
					robot1.delay(1000);
					robot1.keyRelease(KeyEvent.VK_TAB);
					robot1.delay(1000);
					robot1.keyPress(KeyEvent.VK_TAB);
					robot1.delay(1000);
					robot1.keyRelease(KeyEvent.VK_TAB);
					robot1.delay(1000);
					robot1.keyPress(KeyEvent.VK_ENTER);
					robot1.delay(1000);
					robot1.keyRelease(KeyEvent.VK_ENTER);
					clickOn(locators.Backend_loc.ADDPHOTOFORFEATUREDIMG);
					WaitForElementPresent(locators.Backend_loc.cropimagebtn, timeout);
					clickOn(locators.Backend_loc.cropimagebtn);
					WaitForElementPresent(locators.Backend_loc.ADSPOTLIGHTH1, timeout);
					// Upload photo gallery images
					Robot robot2 = new Robot();
					clickOn(locators.Backend_loc.ADDFILEBTN);
					Thread.sleep(5000);
					String filepath2 = System.getProperty("user.dir")+"\\attachments\\1.jpg";
					Clipboard clip2 = Toolkit.getDefaultToolkit().getSystemClipboard();
					StringSelection str2 = new StringSelection(filepath2);
					clip2.setContents(str2, str2);
					System.out.println(str2);
					robot2.keyPress(KeyEvent.VK_CONTROL);
					robot2.delay(1000);
					robot2.keyPress(KeyEvent.VK_V);
					robot2.delay(1000);
					robot2.keyRelease(KeyEvent.VK_V);
					robot2.delay(1000);
					robot2.keyRelease(KeyEvent.VK_CONTROL);
					robot2.keyPress(KeyEvent.VK_TAB);
					robot2.delay(1000);
					robot2.keyRelease(KeyEvent.VK_TAB);
					robot2.delay(1000);
					robot2.keyPress(KeyEvent.VK_TAB);
					robot2.delay(1000);
					robot2.keyRelease(KeyEvent.VK_TAB);
					robot2.delay(1000);
					robot2.keyPress(KeyEvent.VK_ENTER);
					robot2.delay(1000);
					robot2.keyRelease(KeyEvent.VK_ENTER);
					//clickOn(locators.Backend_loc.ADDFILEBTN);
					WaitForElementPresent(locators.Backend_loc.ADSPOTLIGHTH1, timeout);
				    clickOn(locators.Backend_loc.STARTUPLOAD);
				    WaitForElementPresent(locators.Backend_loc.SAVEUPLOAD, timeout);
				    clickOn(locators.Backend_loc.SAVEUPLOAD);
				}
//This method will verify the functionality of displaying the selected amenities on front end 
public static void testamenitiestabintegration() throws Exception
	{
	utils.Login_util.login(superadminusername, superadminpassword);
	Reporter.log("login int application", true);
	sendKeys(locators.Backend_loc.SITEID, siteid);
	Reporter.log("Entering site ID", true);
	clickOn(locators.Management_console.SEARCHBTN);
	Reporter.log("search for site id", true);
	WaitForElementPresent(locators.Backend_loc.PROPFOUNDH1, timeout);
	Reporter.log("verify that heading is present", true);
	clickOn(locators.Backend_loc.EDITBUTTONS);
	Reporter.log("click on edit button", true);
	WaitForElementPresent(locators.Backend_loc.PMCNAME, timeout);
	clickOn(locators.Backend_loc.amenitiestab);
	Reporter.log("click on amenitiestab", true);
	Thread.sleep(1000);
	//Amenities from community features
	if(isChecked(locators.Backend_loc.Bilingual)==false)
	{
	clickOn(locators.Backend_loc.Bilingual);
	selectDropDown(locators.Backend_loc.optional1, "Yes");
	clickOn("//*[@id='optt_amenities_1']/option[2]");
	}
	Reporter.log("click on amenity 1 checkbox", true);
	if(isChecked(locators.Backend_loc.Playground)==false)
	{
	clickOn(locators.Backend_loc.Playground);
	}
	else if(isChecked(locators.Backend_loc.Playground)==true);
	if(isChecked(locators.Backend_loc.Sauna)==false)
	{
	clickOn(locators.Backend_loc.Sauna);
	}
	else if(isChecked(locators.Backend_loc.Sauna)==true);			
	if(isChecked(locators.Backend_loc.VolleyballCourt)==false)
	{
	clickOn(locators.Backend_loc.VolleyballCourt);
	}
	else if(isChecked(locators.Backend_loc.VolleyballCourt)==true);	
//amenities from interior features
	if(isChecked(locators.Backend_loc.Coffiemaker)==false)
	{
	clickOn(locators.Backend_loc.Coffiemaker);
	}
	else if(isChecked(locators.Backend_loc.Coffiemaker)==true);
	
	if(isChecked(locators.Backend_loc.Fireplace)==false)
	{
	clickOn(locators.Backend_loc.Fireplace);
	}
	else if(isChecked(locators.Backend_loc.Fireplace)==true);
	if(isChecked(locators.Backend_loc.voicemail)==false)
	{
	clickOn(locators.Backend_loc.voicemail);
	}
	else if(isChecked(locators.Backend_loc.voicemail)==true);			
	if(isChecked(locators.Backend_loc.wifi)==false)
	{
	clickOn(locators.Backend_loc.wifi);
	}
	else if(isChecked(locators.Backend_loc.wifi)==true);
//furnishing amenities
	if(isChecked(locators.Backend_loc.alarmsystem)==false)
	{
	clickOn(locators.Backend_loc.alarmsystem);
	}
	else if(isChecked(locators.Backend_loc.alarmsystem)==true);
	if(isChecked(locators.Backend_loc.telivision)==false)
	{
	clickOn(locators.Backend_loc.telivision);
	}
	else if(isChecked(locators.Backend_loc.telivision)==true);			
	if(isChecked(locators.Backend_loc.faxmachine)==false)
	{
	clickOn(locators.Backend_loc.faxmachine);
	}
	else if(isChecked(locators.Backend_loc.faxmachine)==true);
//Pet policy amenities
	if(isChecked(locators.Backend_loc.catsallowed)==false)
	{
	clickOn(locators.Backend_loc.catsallowed);
	}
	else if(isChecked(locators.Backend_loc.catsallowed)==true);			
	if(isChecked(locators.Backend_loc.petsallowed)==false)
	{
	clickOn(locators.Backend_loc.petsallowed);
	}
	else if(isChecked(locators.Backend_loc.petsallowed)==true);
	
clickOn(locators.Backend_loc.amenitiessavebutton);
Reporter.log("click on save changes", true);
Thread.sleep(1000);
utils.Login_util.Logout();
getWebDriver().navigate().to("http://82.196.6.85:8080/solr/propertysearch/dataimport?command=full-import&clean=true&commit=true&optimize=true");
getWebDriver().navigate().to("http://82.196.6.85:8080/solr/listingdetails/dataimport?command=full-import&clean=true&commit=true&optimize=true");
Reporter.log("run profile page cron", true);
Thread.sleep(3000);
getWebDriver().navigate().to(URL+"apartment-community-profile/"+siteid);
Reporter.log("go to profile page of property", true);
getWebDriver().getPageSource().contains("Bilingual");
Reporter.log("verify that bilingual amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Playground");
Reporter.log("verify that playground amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Sauna");
Reporter.log("verify that sauna amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Volleyball Court");
Reporter.log("verify that volleyballcourt amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Coffee Maker");
Reporter.log("verify that coffie maker amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Fireplace");
Reporter.log("verify that fireplace amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Voicemail");
Reporter.log("verify that voicemail amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Wi-Fi");
Reporter.log("verify that wifi amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Alarm System");
Reporter.log("verify that alarm system amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Fax Machine");
Reporter.log("verify that fax machine amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Television");
Reporter.log("verify that television amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Cats Allowed");
Reporter.log("verify that cats allowed amenity present in on profile page", true);
getWebDriver().getPageSource().contains("Pets Allowed");
Reporter.log("verify that pets allowed amenity present in on profile page", true);

				}
				
}




