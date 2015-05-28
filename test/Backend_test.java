package test;




import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.custom_util;
public class Backend_test extends custom_util{
	//Description: This script will verify the Count of the guest card lead after send a guest card from front end.
	@Test (groups={"regression"}, alwaysRun=true)
	public void testreport() throws Exception
	{
		try{
			//Login
			utils.Login_util.login(username5, password5);
			String Siteid = "8434" ;
			//Go to Guest card LEADS report
			getWebDriver().navigate().to(URL+"/admin/reports/index/id/"+Siteid);
			Reporter.log("Open the url:"+URL+"/admin/reports/index/id/"+Siteid, true);
			WaitForElementPresent(locators.Backend_loc.GUESTCARDCOUNT, timeout);
			//Getting Count of Guest Card
			String x = getText(locators.Backend_loc.GUESTCARDCOUNT);
			int leadsdashguestcardcount = Integer.parseInt(x);
			Reporter.log("Get the count of Guest Cards:"+leadsdashguestcardcount, true);
			//LogOut
			utils.Login_util.Logout();
			getWebDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			Reporter.log("Logout of the application", true);
			
			//Go to Profile page 
			getWebDriver().navigate().to(URL+"apartment-community-profile/"+Siteid);
			Reporter.log("Open the url:"+URL+"apartment-community-profile/"+Siteid, true);
			WaitForElementPresent(locators.Profilepage_loc.CHECKAVAILABILITY, timeout);
			//Click on 'Check Availability button from Profile Page
			clickOn(locators.Profilepage_loc.CHECKAVAILABILITY);
			Reporter.log("Click on Check Availability", true);
			utils.search_util.CheckAvailability();
			Reporter.log("Check Availability", true);
			WaitForElementPresent(locators.Searchresults_loc.THANKYOUMESSAGE, timeout);
			//Login
			utils.Login_util.login(username5, password5);
			Reporter.log("Login with credentials:"+username5+"/"+password5, true);
			//Go to Guest card LEADS report
			getWebDriver().navigate().to(URL+"admin/reports/index/id/"+Siteid);
			Reporter.log("Open the url:"+URL+"admin/reports/index/id/"+Siteid, true);
			WaitForElementPresent(locators.Backend_loc.GUESTCARDCOUNT, timeout);
			//getting Count of Guest Card
			String y = getText(locators.Backend_loc.GUESTCARDCOUNT);
			int backendguestcardcount = Integer.parseInt(y);
			Reporter.log("Get the count of Guest Cards at backend:"+backendguestcardcount, true);
			if(backendguestcardcount<leadsdashguestcardcount){	
			Assert.fail("Number of guest card should be correct");}			
		}
		catch (Error e) {					
			e.printStackTrace();	
			throw e;
		}
	}


//Description: This script will create a floor plan for different housing package level users.
	@Test(alwaysRun=true)
public void testcreatefloorplan() throws Exception
{
try{
//Login with Executive plus user
utils.Login_util.login(username5, password5);
Reporter.log("Login with User Exeplus", true);
String Siteid = "8434";
//Go to Floor Plans Page

getWebDriver().navigate().to(URL+"/admin/floorplan/index/id/"+Siteid);
Reporter.log("Go to Models tab for the property", true);
WaitForElementPresent(locators.Backend_loc.ADDFLOORPLANBTN, timeout);
Reporter.log("Verify that add floor plan URL is correct", true);
//Add Floor Plan
utils.Backend_util.Addfloorplan();
//Log Out from application
utils.Login_util.Logout();
Reporter.log("LogOut the Exeplus Level user", true);
Thread.sleep(1000);
//login with Executive level user
utils.Login_util.login(username6, password5);
Reporter.log("Login with User Exe", true);
String Siteid1 = "8435";
//Go to Floor Plans Page
getWebDriver().navigate().to(URL+"/admin/floorplan/index/id/"+Siteid1);
Reporter.log("Go to Models tab for the exe level user", true);
WaitForElementPresent(locators.Backend_loc.ADDFLOORPLANBTN, timeout);
Reporter.log("Verify that add floor plan URL is correct", true);
//Add floorplan
utils.Backend_util.Addfloorplan();
Reporter.log("Add floor plan", true);
utils.Login_util.Logout();
Thread.sleep(1000);
//Login with Associate Level user
utils.Login_util.login(username7, password5);
Reporter.log("Login with User Associate level", true);
String Siteid2="8436";
//Go to Floor Plans Page
getWebDriver().navigate().to(URL+"/admin/floorplan/index/id/"+Siteid2);
Reporter.log("Go to Models tab for associate level user", true);
WaitForElementPresent(locators.Backend_loc.ADDFLOORPLANBTN, timeout);
//Add floorplan
utils.Backend_util.Addfloorplan();
Reporter.log("Add floor plan", true);
utils.Login_util.Logout();
Thread.sleep(1000);
{
}
}
	catch (Error e) {					
		e.printStackTrace();	
		throw e;
	}
	}
	//Description: This script will verify the Profile tab integration with profile page on front end.
		@Test (groups={"regression"}, alwaysRun=true)
		public void testprofileintegration() throws Exception
		{
			try{
				utils.Backend_util.testprofileintegration();
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
}
		//Description: This script will create user admin level 10 and login with it.
				@Test (groups={"regression"}, alwaysRun=true)
public void testuseradminlevel10() throws Exception
{
try{
utils.Login_util.login(superadminusername, superadminpassword);
Reporter.log("Login with CS user/Superadmin", true);
utils.Backend_util.createuseradmin10();
}
catch (Error e) {					
e.printStackTrace();	
throw e;
}
}
				
//Description: This script will create user admin level 30 and login with it.
@Test (groups={"regression"}, alwaysRun=true)
public void testuseradminlevel30() throws Exception
{
try{
utils.Login_util.login(superadminusername, superadminpassword);
Reporter.log("Login with CS user/Superadmin", true);
utils.Backend_util.createuseradmin30();
}
catch (Error e) {					
e.printStackTrace();	
throw e;
}
}		

//Description: This script will create user admin level 80 and login with it.
@Test (groups={"regression"}, alwaysRun=true)
public void testuseradminlevel80() throws Exception
{
try{
utils.Login_util.login(superadminusername, superadminpassword);
Reporter.log("Login with CS user/Superadmin", true);
utils.Backend_util.createuseradmin80();
}
catch (Error e) {					
e.printStackTrace();	
throw e;
}
}
//Description: This script will create user admin level 120 and login with it.
@Test (groups={"regression"}, alwaysRun=true)
public void testuseradminlevel120() throws Exception
{
try{
utils.Login_util.login(superadminusername, superadminpassword);
Reporter.log("Login with CS user/Superadmin", true);
utils.Backend_util.createuseradmin120();
}
catch (Error e) {					
e.printStackTrace();	
throw e;
}
}
//Description: This script will create user admin level 150 and login with it.
@Test (groups={"regression"}, alwaysRun=true)
public void testuseradminlevel150() throws Exception
{
try{
utils.Login_util.login(superadminusername, superadminpassword);
Reporter.log("Login with CS user/Superadmin", true);
utils.Backend_util.createuseradmin150();
}
catch (Error e) {					
e.printStackTrace();	
throw e;
}
}

//Script to verify the property is either active or inactive
@Test (groups={"regression"}, alwaysRun=true)
public void testDisplayonwebsite() throws Exception
{
try{
utils.Backend_util.testDisplayonwebsite();
}
catch (Error e) {					
	e.printStackTrace();	
throw e;
	}
}
//Description: This script will verify the property preview page integration with profile page on front end.
		@Test (groups={"regression"}, alwaysRun=true)
		public void testpreviewpropertyintegration() throws Exception
		{
			try{
				utils.Backend_util.testpreviewpageintegration();
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
}
		//Description: This script will verify the property preview page integration with profile page on front end.
				@Test (groups={"regression"}, alwaysRun=true)
				public void testimageupload() throws Exception
				{
					try{
						utils.Backend_util.testimageupload();
					}
					catch (Error e) {					
						e.printStackTrace();	
						throw e;
					}
				}
      //Description: This script will verify the amenities tab integration with profile page on front end.
				@Test (groups={"regression"}, alwaysRun=true)
				public void testamenitiesintegration() throws Exception
				{
					try{
						utils.Backend_util.testamenitiestabintegration();
					}
					catch (Error e) {					
						e.printStackTrace();	
						throw e;
					}
				}
}